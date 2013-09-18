/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id: TTFDirTabEntry.java 426576 2006-07-28 15:44:37Z jeremias $ */
package org.newdawn.slick.tools.hiero.truetype;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * This class represents an entry to a TrueType font's Dir Tab.
 */
class TTFDirTabEntry {

	/**
	 * The tag for the entry
	 */
	private byte[] tag = new byte[4];

	/**
	 * The checksum for the table
	 */
	private int checksum;

	/**
	 * The offset into the directry
	 */
	private long offset;

	/**
	 * The length fo the entry
	 */
	private long length;

	/**
	 * Read Dir Tab, return tag name
	 *
	 * @param in The stream to read from
	 * @return The string read
	 * @throws IOException Indicates a failure to read from the stream
	 */
	public String read(FontFileReader in) throws IOException {
		tag[0] = in.readTTFByte();
		tag[1] = in.readTTFByte();
		tag[2] = in.readTTFByte();
		tag[3] = in.readTTFByte();

		in.skip(4);    // Skip checksum

		offset = in.readTTFULong();
		length = in.readTTFULong();
		String tagStr = new String(tag, "ISO-8859-1");

		return tagStr;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Read dir tab ["
				+ tag[0] + " " + tag[1] + " " + tag[2] + " " + tag[3] + "]"
				+ " offset: " + offset
				+ " length: " + length
				+ " name: " + tag;
	}

	/**
	 * Returns the checksum.
	 *
	 * @return The checksum
	 */
	public int getChecksum() {
		return checksum;
	}

	/**
	 * Returns the length.
	 *
	 * @return The length
	 */
	public long getLength() {
		return length;
	}

	/**
	 * Returns the offset.
	 *
	 * @return The offset
	 */
	public long getOffset() {
		return offset;
	}

	/**
	 * Returns the tag bytes.
	 *
	 * @return The tag
	 */
	public byte[] getTag() {
		return tag;
	}

	/**
	 * Returns the tag bytes.
	 *
	 * @return The tag as a string
	 */
	public String getTagString() {
		try {
			return new String(tag, "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			return this.toString(); // Should never happen.
		}
	}

}
