package org.newdawn.slick.tools.hiero;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * The list of characters to be rendered to a sheet
 * <p>
 * @author kevin
 */
public class CharSet {

	/**
	 * The sybolic name of this set
	 */
	private String name;

	/**
	 * True if the set is mutable
	 */
	private boolean mutable = false;

	/**
	 * The source file this set was read from
	 */
	private File source;

	/**
	 * The list of characters includes
	 */
	private boolean[] chars = new boolean[256];

	/**
	 * Internal default construction only
	 */
	private CharSet() {
	}

	/**
	 * Create a new character set
	 * <p>
	 * @param start The first character
	 * @param end The last character
	 * @param name The symbolic name of this set
	 */
	public CharSet(int start, int end, String name) {
		this.name = name;
		for (int i = start; i <= end; i++) {
			set(i, true);
		}
	}

	/**
	 * Indicate if a given character should be included
	 * <p>
	 * @param c The character to change
	 * @param included True if the character should be included
	 */
	public void set(int c, boolean included) {
		chars[c] = included;
	}

	/**
	 * Copy this character set
	 * <p>
	 * @return A copy of this character set
	 */
	public CharSet copy() {
		CharSet copy = new CharSet();
		copy.name = name;
		copy.source = source;
		copy.mutable = true;
		copy.chars = new boolean[256];

		System.arraycopy(chars, 0, copy.chars, 0, chars.length);

		return copy;
	}

	/**
	 * Create a new character set based on the contents of a file
	 * <p>
	 * @param source The source of the character set
	 * <p>
	 * @throws IOException Indicates a failure to read from the source
	 */
	public CharSet(File source) throws IOException {
		this.source = source;
		mutable = true;
		DataInputStream din = new DataInputStream(new FileInputStream(source));
		name = din.readUTF();
		for (int i = 0; i < 256; i++) {
			chars[i] = din.readBoolean();
		}
		din.close();
	}

	/**
	 * Set the name of the set
	 * <p>
	 * @param name The name of the set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Save the set to a file
	 * <p>
	 * @param file The file to save to
	 * <p>
	 * @throws IOException Indicates a failure to write to disk
	 */
	public void save(File file) throws IOException {
		DataOutputStream dout = new DataOutputStream(new FileOutputStream(file));
		dout.writeUTF(name);
		for (int i = 0; i < 256; i++) {
			dout.writeBoolean(chars[i]);
		}
		dout.close();
	}

	/**
	 * Get the source of the character set
	 * <p>
	 * @return The source of the character set
	 */
	public File getSource() {
		return source;
	}

	/**
	 * Check if this character set is mutable
	 * <p>
	 * @return True if this character set is mutable
	 */
	public boolean isMutable() {
		return mutable;
	}

	/**
	 * Check if the set includes a given character
	 * <p>
	 * @param c The character to check for
	 * <p>
	 * @return True if the character is included
	 */
	public boolean includes(char c) {
		return chars[c];
	}

	/**
	 * Get the name of the set
	 * <p>
	 * @return The name of the set
	 */
	public String getName() {
		return name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return name;
	}

}
