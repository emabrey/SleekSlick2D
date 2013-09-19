package org.newdawn.slick.tools.hiero;

/**
 * A listener to be notified of progress of an operation
 * <p>
 * @author kevin
 */
public interface ProgressListener {

	/**
	 * Report the progress
	 * <p>
	 * @param type The type of the progress
	 * @param current The current progress
	 * @param total The total goal
	 */
	public void reportProgress(String type, int current, int total);

}
