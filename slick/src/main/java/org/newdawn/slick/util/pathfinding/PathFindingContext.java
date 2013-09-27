package org.newdawn.slick.util.pathfinding;

/**
 * The context describing the current path finding state
 * <p/>
 *
 * @author kevin
 */
public interface PathFindingContext {

    /**
     * Get the object being moved along the path if any
     * <p/>
     *
     * @return The object being moved along the path
     */
    public Mover getMover();

    /**
     * Get the x coordinate of the source location
     * <p/>
     *
     * @return The x coordinate of the source location
     */
    public int getSourceX();

    /**
     * Get the y coordinate of the source location
     * <p/>
     *
     * @return The y coordinate of the source location
     */
    public int getSourceY();

    /**
     * Get the distance that has been searched to reach this point
     * <p/>
     *
     * @return The distance that has been search to reach this point
     */
    public int getSearchDistance();

}
