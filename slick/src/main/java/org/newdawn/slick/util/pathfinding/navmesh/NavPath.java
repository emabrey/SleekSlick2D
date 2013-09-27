package org.newdawn.slick.util.pathfinding.navmesh;

import java.util.ArrayList;

/**
 * A path across a navigation mesh
 * <p/>
 *
 * @author kevin
 */
public class NavPath {

    /**
     * The list of links that form this path
     */
    private ArrayList links = new ArrayList();

    /**
     * Create a new path
     */
    public NavPath() {
    }

    /**
     * Push a link to the end of the path
     * <p/>
     *
     * @param link The link to the end of the path
     */
    public void push(Link link) {
        links.add(link);
    }

    /**
     * Get the length of the path
     * <p/>
     *
     * @return The number of steps in the path
     */
    public int length() {
        return links.size();
    }

    /**
     * Get the x coordinate of the given step
     * <p/>
     *
     * @param step The index of the step to retrieve
     *             <p/>
     *
     * @return The x coordinate at the given step index
     */
    public float getX(int step) {
        return ((Link) links.get(step)).getX();
    }

    /**
     * Get the y coordinate of the given step
     * <p/>
     *
     * @param step The index of the step to retrieve
     *             <p/>
     *
     * @return The y coordinate at the given step index
     */
    public float getY(int step) {
        return ((Link) links.get(step)).getY();
    }

    /**
     * Get a string representation of this instance
     * <p/>
     *
     * @return The string representation of this instance
     */
    public String toString() {
        return "[Path length=" + length() + "]";
    }

    /**
     * Remove a step in the path
     * <p/>
     *
     * @param i
     */
    public void remove(int i) {
        links.remove(i);
    }

}
