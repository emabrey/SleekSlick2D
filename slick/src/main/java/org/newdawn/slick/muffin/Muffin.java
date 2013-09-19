package org.newdawn.slick.muffin;

import java.io.IOException;
import java.util.HashMap;

/**
 * A description of any class with the ability to store state locally
 * <p>
 * @author kappaOne
 */
public interface Muffin {

	/**
	 * Save a file of data
	 * <p>
	 * @param data The data to store
	 * @param fileName The name of the file to store it against
	 * <p>
	 * @throws IOException Indicates a failure to save the state
	 */
	public abstract void saveFile(HashMap data, String fileName) throws IOException;

	/**
	 * Load a file of data from the store
	 * <p>
	 * @param fileName The name of the file to retrieve
	 * <p>
	 * @return The data retrieved
	 * <p>
	 * @throws IOException Indicates a failure to load the state
	 */
	public abstract HashMap loadFile(String fileName) throws IOException;

}
