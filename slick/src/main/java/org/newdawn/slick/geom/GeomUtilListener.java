package org.newdawn.slick.geom;

/**
 * Debug listener for notifications assocaited with geometry utilities
 * <p>
 * @author kevin
 */
public interface GeomUtilListener {

	/**
	 * Notification that a point was excluded from geometry
	 * <p>
	 * @param x The x coordinate of the point
	 * @param y The y coordinate of the point
	 */
	public void pointExcluded(float x, float y);

	/**
	 * Notification that a point was intersected between two geometries
	 * <p>
	 * @param x The x coordinate of the point
	 * @param y The y coordinate of the point
	 */
	public void pointIntersected(float x, float y);

	/**
	 * Notification that a point was used to build a new geometry
	 * <p>
	 * @param x The x coordinate of the point
	 * @param y The y coordinate of the point
	 */
	public void pointUsed(float x, float y);

}
