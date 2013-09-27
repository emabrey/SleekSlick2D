package org.newdawn.slick.geom;

/**
 * A class capable of generating texture coordiantes based on rendering positions of verticies. This allows custom
 * texturing of geometric shapes
 * <p/>
 *
 * @author kevin
 */
public interface TexCoordGenerator {

    /**
     * Get the texture coordinate for a given render position
     * <p/>
     *
     * @param x The x coordinate of the vertex being rendered
     * @param y The y coordinate of the vertex being rendered
     *          <p/>
     *
     * @return The texture coordinate to apply
     */
    public Vector2f getCoordFor(float x, float y);

}
