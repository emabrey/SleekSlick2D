package org.newdawn.slick.lwjgl;

import org.lwjgl.LWJGLUtil;
import org.newdawn.slick.lwjgl.natives.linux.LinuxResourcePlaceholder;
import org.newdawn.slick.lwjgl.natives.osx.OSXResourcePlaceholder;
import org.newdawn.slick.lwjgl.natives.windows.WindowsResourcePlaceholder;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Unpacks the native libraries needed by the LWJGL to the filesystem in a temporary file, and then informs the JVM
 * where to find the native libraries.
 */
public class LwjglLoader {

    /**
     * The system property to set for the library path. This tells the JVM where to look for native libraries.
     */
    private static final String LIBRARY_SYSTEM_PROPERTY = "java.library.path";
    /**
     * The system property to set for the LWJGL library path. This tells LWJGL where to look for only it's native
     * libraries.
     */
    private static final String LWJGL_LIBRARY_PROPERTY = "org.lwjgl.librarypath";
    /**
     * The system property to set for the LWJGL library path. This tells JINPUT where to look for only it's native
     * libraries.
     */
    private static final String JINPUT_LIBRARY_PROPERTY = "net.java.games.input.librarypath";
    /**
     * The names of the native libraries needed on 32-bit Windows Platforms
     */
    private static final String[] WINDOWS_32_LIBS = {"jinput-dx8.dll", "jinput-raw.dll", "lwjgl.dll", "OpenAL32.dll",};
    /**
     * The names of the native libraries needed on 64-bit Windows Platforms
     */
    private static final String[] WINDOWS_64_LIBS = {"jinput-dx8_64.dll", "jinput-raw_64.dll", "lwjgl64.dll",
            "OpenAL64.dll"};
    /**
     * The names of the native libraries needed on OSX Platforms
     */
    private static final String[] OSX_LIBS = {"libjinput-osx.jnilib", "liblwjgl.jnilib", "libopenal.dylib"};
    /**
     * The names of the native libraries needed on 32-bit Linux Platforms
     */
    private static final String[] LINUX_32_LIBS = {"libjinput-linux.so", "liblwjgl.so", "libopenal.so"};
    /**
     * The names of the native libraries needed on 64-bit Linux Platforms
     */
    private static final String[] LINUX_64_LIBS = {"libjinput-linux64.so", "liblwjgl64.so", "libopenal64.so"};

    private static final AtomicBoolean hasAlreadyRun = new AtomicBoolean();

    /**
     * Determines the current OS and architecture, and then loads the OS specific native libraries. If the libraries
     * have already been loaded the loading terminates early and silently.
     */
    public static void loadOSSpecificFiles() {

        if (hasAlreadyRun.getAndSet(true)) {
            return;
        }

        final int platformID = LWJGLUtil.getPlatform();
        final String osArch = System.getProperty("os.arch");

        switch (platformID) {
            case LWJGLUtil.PLATFORM_LINUX:
                if (osArch.contains("64")) {
                    loadLibrariesWithLogging(LINUX_64_LIBS, new LinuxResourcePlaceholder());
                } else {
                    loadLibrariesWithLogging(LINUX_32_LIBS, new LinuxResourcePlaceholder());
                }
                break;
            case LWJGLUtil.PLATFORM_MACOSX:
                loadLibrariesWithLogging(OSX_LIBS, new OSXResourcePlaceholder());
                break;
            case LWJGLUtil.PLATFORM_WINDOWS:
                if (osArch.contains("64")) {
                    loadLibrariesWithLogging(WINDOWS_64_LIBS, new WindowsResourcePlaceholder());
                } else {
                    loadLibrariesWithLogging(WINDOWS_32_LIBS, new WindowsResourcePlaceholder());
                }
                break;
            default:
                throw new IllegalStateException("This operating system is not supported by LWJGL");
        }
    }

    /**
     * Wraps the call to {@link #loadLibraries(String[], ClassResourcePlaceholder)} in a try-catch and attempts to
     * indicate a failure with some text output to System.err
     *
     * @param libraries           The names of the libraries to load.
     * @param resourcePlaceholder The class marking the package where the native libraries are located.
     */
    private static void loadLibrariesWithLogging(final String[] libraries, final ClassResourcePlaceholder
            resourcePlaceholder) {
        try {
            loadLibraries(libraries, resourcePlaceholder);
            System.out.println("Loaded LWJGL native libraries successfully: " + Arrays.toString(libraries));
        } catch (IOException e) {
            System.err.println("Unable to load LWJGL native libraries: " + Arrays.toString(libraries));
            e.printStackTrace(System.err);
        }
    }

    /**
     * Unpacks the native libraries to a temporary directory and makes a call to {@link #updateSystemProperties(String)}
     * to inform the JVM of the location of the unpacked native libraries.
     *
     * @param libraries           The names of the libraries to load.
     * @param resourcePlaceholder The class marking the package where the native libraries are located.
     *
     * @throws IOException If any of the file operations fail
     */
    private static void loadLibraries(final String[] libraries, final ClassResourcePlaceholder resourcePlaceholder)
            throws IOException {
        final Path temporaryPathForUnpackingNatives = Files.createTempDirectory("lwjgl-natives");
        final FileSystem currentFileSystem = FileSystems.getDefault();

        for (final String library : libraries) {

            final Path libraryOut = currentFileSystem.getPath(temporaryPathForUnpackingNatives.toString(), library);

            try (final InputStream libraryIn = resourcePlaceholder.getPlaceholderClass().getResourceAsStream(library)) {
                Files.copy(libraryIn, libraryOut);
            }
        }

        updateSystemProperties(temporaryPathForUnpackingNatives.toAbsolutePath().toString());
    }

    /**
     * Updates several system properties to inform the JVM and both the LWJGL and JInput libraries where to find the
     * unpacked native libraries.
     *
     * @param absoluteLocationOfNatives Absolute path locating the unpacked native libraries' directory
     */
    private static void updateSystemProperties(final String absoluteLocationOfNatives) {
        //Additive to not overwrite other library paths
        final String currentSystemProperty = System.getProperty(LIBRARY_SYSTEM_PROPERTY);
        System.setProperty(LIBRARY_SYSTEM_PROPERTY, absoluteLocationOfNatives + File.pathSeparator +
                currentSystemProperty);

        //Non-additive because we should not have to compete with manual settings
        System.setProperty(LWJGL_LIBRARY_PROPERTY, absoluteLocationOfNatives);
        System.setProperty(JINPUT_LIBRARY_PROPERTY, absoluteLocationOfNatives);
    }
}
