package org.newdawn.slick.util.xml;

import org.newdawn.slick.SlickException;

/**
 * An exception to describe failures in XML. Made a special case because with XML to object parsing you might want to
 * handle it differently
 * <p>
 * @author kevin
 */
public class SlickXMLException extends SlickException {

	/**
	 * Create a new exception
	 * <p>
	 * @param message The message describing the failure
	 */
	public SlickXMLException(String message) {
		super(message);
	}

	/**
	 * Create a new exception
	 * <p>
	 * @param message The message describing the failure
	 * @param e The exception causing this failure
	 */
	public SlickXMLException(String message, Throwable e) {
		super(message, e);
	}

}
