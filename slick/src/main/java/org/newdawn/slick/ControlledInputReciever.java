package org.newdawn.slick;

/**
 * Description of any class capable of recieving and controlling it's own reception of input
 * <p>
 * You'll shouldn't really need to implement this one for your self, use one of the sub-interfaces:
 * <p>
 * {@link InputListener}
 * {@link MouseListener}
 * {@link KeyListener}
 * {@link ControllerListener}
 * <p>
 * @author kevin
 */
public interface ControlledInputReciever {

	/**
	 * Set the input that events are being sent from
	 * <p>
	 * @param input The input instance sending events
	 */
	public abstract void setInput(Input input);

	/**
	 * Check if this input listener is accepting input
	 * <p>
	 * @return True if the input listener should recieve events
	 */
	public abstract boolean isAcceptingInput();

	/**
	 * Notification that all input events have been sent for this frame
	 */
	public abstract void inputEnded();

	/**
	 * Notification that input is about to be processed
	 */
	public abstract void inputStarted();

}
