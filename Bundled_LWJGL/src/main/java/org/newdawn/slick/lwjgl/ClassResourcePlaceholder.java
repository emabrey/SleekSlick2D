package org.newdawn.slick.lwjgl;

/**
 * Interface indicating that a class is simply a placeholder for easier ClassLoader resource access.
 */
public interface ClassResourcePlaceholder {

    /**
     * Since passing around abstract resource placeholders prevents us from accessing Object.class (interfaces do not
     * expose a class), this method is a pass through that allows us to refer to resource placeholder's generically, but
     * also access class information.
     */
    public Class getPlaceholderClass();
}
