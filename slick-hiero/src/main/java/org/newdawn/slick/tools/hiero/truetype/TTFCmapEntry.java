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

/* $Id: TTFCmapEntry.java 426576 2006-07-28 15:44:37Z jeremias $ */
package org.newdawn.slick.tools.hiero.truetype;

/**
 * The CMap entry contains information of a Unicode range and the the glyph indexes related to the range
 */
public class TTFCmapEntry {

	/**
	 * The first character available
	 */
	private int unicodeStart;

	/**
	 * The last character available
	 */
	private int unicodeEnd;

	/**
	 * The first glyph represented
	 */
	private int glyphStartIndex;

	/**
	 * Create a new entry
	 */
	TTFCmapEntry() {
		unicodeStart = 0;
		unicodeEnd = 0;
		glyphStartIndex = 0;
	}

	/**
	 * Create a new entry
	 * <p>
	 * @param unicodeStart The first character available
	 * @param unicodeEnd The last character avaialble
	 * @param glyphStartIndex The first glyph represented
	 */
	TTFCmapEntry(int unicodeStart, int unicodeEnd, int glyphStartIndex) {
		this.unicodeStart = unicodeStart;
		this.unicodeEnd = unicodeEnd;
		this.glyphStartIndex = glyphStartIndex;
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object o) {
		if (o instanceof TTFCmapEntry) {
			TTFCmapEntry ce = (TTFCmapEntry) o;
			if (ce.unicodeStart == this.unicodeStart
					&& ce.unicodeEnd == this.unicodeEnd
					&& ce.glyphStartIndex == this.glyphStartIndex) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns the glyphStartIndex.
	 * <p>
	 * @return int
	 */
	public int getGlyphStartIndex() {
		return glyphStartIndex;
	}

	/**
	 * Returns the unicodeEnd.
	 * <p>
	 * @return int
	 */
	public int getUnicodeEnd() {
		return unicodeEnd;
	}

	/**
	 * Returns the unicodeStart.
	 * <p>
	 * @return int
	 */
	public int getUnicodeStart() {
		return unicodeStart;
	}

	/**
	 * Sets the glyphStartIndex.
	 * <p>
	 * @param glyphStartIndex The glyphStartIndex to set
	 */
	public void setGlyphStartIndex(int glyphStartIndex) {
		this.glyphStartIndex = glyphStartIndex;
	}

	/**
	 * Sets the unicodeEnd.
	 * <p>
	 * @param unicodeEnd The unicodeEnd to set
	 */
	public void setUnicodeEnd(int unicodeEnd) {
		this.unicodeEnd = unicodeEnd;
	}

	/**
	 * Sets the unicodeStart.
	 * <p>
	 * @param unicodeStart The unicodeStart to set
	 */
	public void setUnicodeStart(int unicodeStart) {
		this.unicodeStart = unicodeStart;
	}

}
