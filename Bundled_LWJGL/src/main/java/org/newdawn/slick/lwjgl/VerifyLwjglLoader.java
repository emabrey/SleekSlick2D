package org.newdawn.slick.lwjgl;

/**
 * Stub that calls the {@link org.newdawn.slick.lwjgl.LwjglLoader} class to allow easy verification of the validity of
 * the built artifact
 */
public class VerifyLwjglLoader {

    public static void main(String[] args) {
        System.out.println("Testing Load 1");
        LwjglLoader.loadOSSpecificFiles();

        System.out.println("Testing Load 2");
        LwjglLoader.loadOSSpecificFiles();
    }
}
