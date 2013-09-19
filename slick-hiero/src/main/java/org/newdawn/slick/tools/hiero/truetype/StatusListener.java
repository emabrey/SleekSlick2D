package org.newdawn.slick.tools.hiero.truetype;

/**
 * A listener to be notified of font loading status
 * <p>
 * @author kevin
 */
public interface StatusListener {

	/**
	 * Update the status message
	 * <p>
	 * @param msg The message to be displayed
	 */
	public void updateStatus(String msg);

}
