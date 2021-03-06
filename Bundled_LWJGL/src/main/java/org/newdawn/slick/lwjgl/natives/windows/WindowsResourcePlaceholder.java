package org.newdawn.slick.lwjgl.natives.windows;

import org.newdawn.slick.lwjgl.ClassResourcePlaceholder;

/**
 * Simple class stub that allows for easy access to the ClassLoader located Windows native libraries.
 */
public final class WindowsResourcePlaceholder implements ClassResourcePlaceholder {

    /**
     * Since passing around abstract resource placeholders prevents us from accessing Object.class (interfaces do not
     * expose a class), this method is a pass through that allows us to refer to resource placeholder's generically, but
     * also access class information.
     */
    @Override
    public Class getPlaceholderClass() {
        return WindowsResourcePlaceholder.class;
    }
}
