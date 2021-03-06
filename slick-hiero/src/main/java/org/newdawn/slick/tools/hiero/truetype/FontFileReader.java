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

/* $Id: FontFileReader.java 489450 2006-12-21 19:54:40Z spepping $ */
package org.newdawn.slick.tools.hiero.truetype;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Reads a TrueType font file into a byte array and provides file like functions for array access.
 */
public class FontFileReader {

    /**
     * The size of the file
     */
    private int fsize;      // file size

    /**
     * The current position in the file
     */
    private int current;    // current position in file

    /**
     * The file contents
     */
    private byte[] file;

    /**
     * Initializes class and reads stream. Init does not close stream.
     * <p/>
     *
     * @param in InputStream to read from new array with size + inc
     *           <p/>
     *
     * @throws IOException In case of an I/O problem
     */
    private void init(InputStream in) throws java.io.IOException {
        if (in.available() > 2000000) {
            throw new IOException("Font too big");
        }
        this.file = IOUtils.toByteArray(in);
        this.fsize = this.file.length;
        if (fsize > 2000000) {
            throw new IOException("Font too big");
        }
        this.current = 0;
    }

    /**
     * Constructor
     * <p/>
     *
     * @param fileName filename to read
     *                 <p/>
     *
     * @throws IOException In case of an I/O problem
     */
    public FontFileReader(String fileName) throws IOException {
        final File f = new File(fileName);
        if (f.length() > 2000000) {
            throw new IOException("Font too big");
        }

        InputStream in = new java.io.FileInputStream(f);
        try {
            init(in);
        } finally {
            in.close();
        }
    }

    /**
     * Generate a font file reader based on the contents of a byte array rather than an actual file
     * <p/>
     *
     * @param data The data to use as the font file
     *             <p/>
     *
     * @throws IOException Indicates a failure to process the array
     */
    public FontFileReader(byte[] data) throws IOException {
        file = data;
        this.fsize = this.file.length;
        if (fsize > 2000000) {
            throw new IOException("Font too big");
        }
        this.current = 0;
    }

    /**
     * Constructor
     * <p/>
     *
     * @param in InputStream to read from
     *           <p/>
     *
     * @throws IOException In case of an I/O problem
     */
    public FontFileReader(InputStream in) throws IOException {
        init(in);
    }

    /**
     * Set current file position to offset
     * <p/>
     *
     * @param offset The new offset to set
     *               <p/>
     *
     * @throws IOException In case of an I/O problem
     */
    public void seekSet(long offset) throws IOException {
        if (offset >= fsize || offset < 0) {
            throw new java.io.EOFException("Reached EOF, file size=" + fsize + " offset=" + offset);
        }
        current = (int) offset;
    }

    /**
     * Set current file position to offset
     * <p/>
     *
     * @param add The number of bytes to advance
     *            <p/>
     *
     * @throws IOException In case of an I/O problem
     */
    public void seekAdd(long add) throws IOException {
        seekSet(current + add);
    }

    /**
     * Skip a given number of bytes.
     * <p/>
     *
     * @param add The number of bytes to advance
     *            <p/>
     *
     * @throws IOException In case of an I/O problem
     */
    public void skip(long add) throws IOException {
        seekAdd(add);
    }

    /**
     * Returns current file position.
     * <p/>
     *
     * @return int The current position.
     */
    public int getCurrentPos() {
        return current;
    }

    /**
     * Returns the size of the file.
     * <p/>
     *
     * @return int The filesize
     */
    public int getFileSize() {
        return fsize;
    }

    /**
     * Read 1 byte.
     * <p/>
     *
     * @return One byte
     *         <p/>
     *
     * @throws IOException If EOF is reached
     */
    public byte read() throws IOException {
        if (current >= fsize) {
            throw new java.io.EOFException("Reached EOF, file size=" + fsize);
        }

        final byte ret = file[current++];
        return ret;
    }

    /**
     * Read 1 signed byte.
     * <p/>
     *
     * @return One byte
     *         <p/>
     *
     * @throws IOException If EOF is reached
     */
    public final byte readTTFByte() throws IOException {
        return read();
    }

    /**
     * Read 1 unsigned byte.
     * <p/>
     *
     * @return One unsigned byte
     *         <p/>
     *
     * @throws IOException If EOF is reached
     */
    public final int readTTFUByte() throws IOException {
        final byte buf = read();

        if (buf < 0) {
            return (256 + buf);
        } else {
            return buf;
        }
    }

    /**
     * Read 2 bytes signed.
     * <p/>
     *
     * @return One signed short
     *         <p/>
     *
     * @throws IOException If EOF is reached
     */
    public final short readTTFShort() throws IOException {
        final int ret = (readTTFUByte() << 8) + readTTFUByte();
        final short sret = (short) ret;
        return sret;
    }

    /**
     * Read 2 bytes unsigned.
     * <p/>
     *
     * @return One unsigned short
     *         <p/>
     *
     * @throws IOException If EOF is reached
     */
    public final int readTTFUShort() throws IOException {
        final int ret = (readTTFUByte() << 8) + readTTFUByte();
        return ret;
    }

    /**
     * Write a USHort at a given position.
     * <p/>
     *
     * @param pos The absolute position to write to
     * @param val The value to write
     *            <p/>
     *
     * @throws IOException If EOF is reached
     */
    public final void writeTTFUShort(int pos, int val) throws IOException {
        if ((pos + 2) > fsize) {
            throw new java.io.EOFException("Reached EOF");
        }
        final byte b1 = (byte) ((val >> 8) & 0xff);
        final byte b2 = (byte) (val & 0xff);
        file[pos] = b1;
        file[pos + 1] = b2;
    }

    /**
     * Read 2 bytes signed at position pos without changing current position.
     * <p/>
     *
     * @param pos The absolute position to read from
     *            <p/>
     *
     * @return One signed short
     *         <p/>
     *
     * @throws IOException If EOF is reached
     */
    public final short readTTFShort(long pos) throws IOException {
        final long cp = getCurrentPos();
        seekSet(pos);
        final short ret = readTTFShort();
        seekSet(cp);
        return ret;
    }

    /**
     * Read 2 bytes unsigned at position pos without changing current position.
     * <p/>
     *
     * @param pos The absolute position to read from
     *            <p/>
     *
     * @return One unsigned short
     *         <p/>
     *
     * @throws IOException If EOF is reached
     */
    public final int readTTFUShort(long pos) throws IOException {
        long cp = getCurrentPos();
        seekSet(pos);
        int ret = readTTFUShort();
        seekSet(cp);
        return ret;
    }

    /**
     * Read 4 bytes.
     * <p/>
     *
     * @return One signed integer
     *         <p/>
     *
     * @throws IOException If EOF is reached
     */
    public final int readTTFLong() throws IOException {
        long ret = readTTFUByte();    // << 8;
        ret = (ret << 8) + readTTFUByte();
        ret = (ret << 8) + readTTFUByte();
        ret = (ret << 8) + readTTFUByte();

        return (int) ret;
    }

    /**
     * Read 4 bytes.
     * <p/>
     *
     * @return One unsigned integer
     *         <p/>
     *
     * @throws IOException If EOF is reached
     */
    public final long readTTFULong() throws IOException {
        long ret = readTTFUByte();
        ret = (ret << 8) + readTTFUByte();
        ret = (ret << 8) + readTTFUByte();
        ret = (ret << 8) + readTTFUByte();

        return ret;
    }

    /**
     * Read a NUL terminated ISO-8859-1 string.
     * <p/>
     *
     * @return A String
     *         <p/>
     *
     * @throws IOException If EOF is reached
     */
    public final String readTTFString() throws IOException {
        int i = current;
        while (file[i++] != 0) {
            if (i > fsize) {
                throw new java.io.EOFException("Reached EOF, file size=" + fsize);
            }
        }

        byte[] tmp = new byte[i - current];
        System.arraycopy(file, current, tmp, 0, i - current);
        return new String(tmp, "ISO-8859-1");
    }

    /**
     * Read an ISO-8859-1 string of len bytes.
     * <p/>
     *
     * @param len The length of the string to read
     *            <p/>
     *
     * @return A String
     *         <p/>
     *
     * @throws IOException If EOF is reached
     */
    public final String readTTFString(int len) throws IOException {
        if ((len + current) > fsize) {
            throw new java.io.EOFException("Reached EOF, file size=" + fsize);
        }

        byte[] tmp = new byte[len];
        System.arraycopy(file, current, tmp, 0, len);
        current += len;
        final String encoding;
        if ((tmp.length > 0) && (tmp[0] == 0)) {
            encoding = "UTF-16BE";
        } else {
            encoding = "ISO-8859-1";
        }
        return new String(tmp, encoding);
    }

    /**
     * Return a copy of the internal array
     * <p/>
     *
     * @param offset The absolute offset to start reading from
     * @param length The number of bytes to read
     *               <p/>
     *
     * @return An array of bytes
     *         <p/>
     *
     * @throws IOException if out of bounds
     */
    public byte[] getBytes(int offset, int length) throws IOException {
        if ((offset + length) > fsize) {
            throw new java.io.IOException("Reached EOF");
        }

        byte[] ret = new byte[length];
        System.arraycopy(file, offset, ret, 0, length);
        return ret;
    }

}
