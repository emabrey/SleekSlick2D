package org.newdawn.slick.opengl.renderer;

/**
 * The description of a class able to render line strips through OpenGL
 * <p/>
 *
 * @author kevin
 */
public interface LineStripRenderer {

    /**
     * Check if we should apply default line fixes
     * <p/>
     *
     * @return True if we should apply GL fixes
     */
    public abstract boolean applyGLLineFixes();

    /**
     * Start the line strips
     */
    public abstract void start();

    /**
     * End the line strips
     */
    public abstract void end();

    /**
     * Add a vertex
     * <p/>
     *
     * @param x The x coordinate of the vertex
     * @param y The y coordinate of the vertex
     */
    public abstract void vertex(float x, float y);

    /**
     * Apply a colour to the next vertex
     * <p/>
     *
     * @param r The red component of the colour
     * @param g The green component of the colour
     * @param b The blue component of the colour
     * @param a The alpha component of the colour
     */
    public abstract void color(float r, float g, float b, float a);

    /**
     * Set the width of the lines to be drawn
     * <p/>
     *
     * @param width The width of the lines to be drawn
     */
    public abstract void setWidth(float width);

    /**
     * Indicate whether antialiasing should be applied
     * <p/>
     *
     * @param antialias True if antialiasing should be applied
     */
    public abstract void setAntiAlias(boolean antialias);

    /**
     * Indicate if we should render end caps
     * <p/>
     *
     * @param caps True if we should render end caps
     */
    public void setLineCaps(boolean caps);

}
