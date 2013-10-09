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

/* $Id: Glyphs.java 426576 2006-07-28 15:44:37Z jeremias $ */
package org.newdawn.slick.tools.hiero.truetype;

/**
 * This class provides a number of constants for glyph management.
 */
public class Glyphs {

    /**
     * Glyph name for the "notdef" glyph
     */
    public static final String NOTDEF = ".notdef";

    /**
     * Glyph names for Mac encoding
     */
    public static final String MAC_GLYPH_NAMES[] = {
        /* 0x00 */
            NOTDEF, ".null", "CR", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand",
            "quotesingle", "parenleft", "parenright", "asterisk", "plus", "comma", /* 0x10 */
            "hyphen", "period", "slash", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "colon", "semicolon", "less", /* 0x20 */
            "equal", "greater", "question", "at", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", /* 0x30 */
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "bracketleft", "backslash", /* 0x40 */
            "bracketright", "asciicircum", "underscore", "grave", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l",
        /* 0x50 */
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "braceleft", "bar", /* 0x60 */
            "braceright", "asciitilde", "Adieresis", "Aring", "Ccedilla", "Eacute", "Ntilde", "Odieresis",
            "Udieresis", "aacute", "agrave", "acircumflex", "adieresis", "atilde", "aring", "ccedilla", /* 0x70 */
            "eacute", "egrave", "ecircumflex", "edieresis", "iacute", "igrave", "icircumflex", "idieresis", "ntilde",
            "oacute", "ograve", "ocircumflex", "odieresis", "otilde", "uacute", "ugrave",
        /* 0x80 */
            "ucircumflex", "udieresis", "dagger", "degree", "cent", "sterling", "section", "bullet", "paragraph",
            "germandbls", "registered", "copyright", "trademark", "acute", "dieresis", "notequal", /* 0x90 */
            "AE", "Oslash", "infinity", "plusminus", "lessequal", "greaterequal", "yen", "mu", "partialdiff",
            "Sigma", "Pi", "pi", "integral", "ordfeminine", "ordmasculine", "Omega", /* 0xa0 */
            "ae", "oslash", "questiondown", "exclamdown", "logicalnot", "radical", "florin", "approxequal", "Delta",
            "guillemotleft", "guillemotright", "ellipsis", "nbspace", "Agrave", "Atilde", "Otilde", /* 0xb0 */
            "OE", "oe", "endash", "emdash", "quotedblleft", "quotedblright", "quoteleft", "quoteright", "divide",
            "lozenge", "ydieresis", "Ydieresis", "fraction", "currency", "guilsinglleft", "guilsinglright", /* 0xc0 */
            "fi", "fl", "daggerdbl", "periodcentered", "quotesinglbase", "quotedblbase", "perthousand",
            "Acircumflex", "Ecircumflex", "Aacute", "Edieresis", "Egrave", "Iacute", "Icircumflex", "Idieresis",
            "Igrave", /* 0xd0 */
            "Oacute", "Ocircumflex", "applelogo", "Ograve", "Uacute", "Ucircumflex", "Ugrave", "dotlessi",
            "circumflex", "tilde", "macron", "breve", "dotaccent", "ring", "cedilla", "hungarumlaut", /* 0xe0 */
            "ogonek", "caron", "Lslash", "lslash", "Scaron", "scaron", "Zcaron", "zcaron", "brokenbar", "Eth", "eth",
            "Yacute", "yacute", "Thorn", "thorn", "minus", /* 0xf0 */
            "multiply", "onesuperior", "twosuperior", "threesuperior", "onehalf", "onequarter", "threequarters",
            "franc", "Gbreve", "gbreve", "Idot", "Scedilla", "scedilla", "Cacute", "cacute", "Ccaron", /* 0x100 */
            "ccaron", "dmacron"};

    /**
     * Glyph names for tex8r encoding
     */
    public static final String[] TEX8R_GLYPH_NAMES = {
            // 0x00
            NOTDEF, "dotaccent", "fi", "fl", "fraction", "hungarumlaut", "Lslash", "lslash", "ogonek", "ring",
            ".notdef", "breve", "minus", ".notdef", "Zcaron", "zcaron", // 0x10
            "caron", "dotlessi", "dotlessj", "ff", "ffi", "ffl", ".notdef", ".notdef", ".notdef", ".notdef",
            ".notdef", ".notdef", ".notdef", ".notdef", "grave", "quotesingle", // 0x20
            "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quoteright", "parenleft",
            "parenright", "asterisk", "plus", "comma", "hyphen", "period", "slash",
            // 0x30
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon",
            "less", "equal", "greater", "question", // 0x40
            "at", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", // 0x50
            "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "bracketleft", "backslash", "bracketright",
            "asciicircum", "underscore", // 0x60
            "quoteleft", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", // 0x70
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "braceleft", "bar", "braceright", "asciitilde",
            ".notdef", // 0x80
            "Euro", ".notdef", "quotesinglbase", "florin", "quotedblbase", "ellipsis", "dagger", "daggerdbl",
            "circumflex", "perthousand", "Scaron", "guilsinglleft", "OE", ".notdef", ".notdef", ".notdef", // 0x90
            ".notdef", ".notdef", ".notdef", "quotedblleft", "quotedblright", "bullet", "endash", "emdash", "tilde",
            "trademark", "scaron", "guilsinglright", "oe", ".notdef", ".notdef", "Ydieresis", // 0xA0
            ".notdef", "exclamdown", "cent", "sterling", "currency", "yen", "brokenbar", "section", "dieresis",
            "copyright", "ordfeminine", "guillemotleft", "logicalnot", "hyphen", "registered", "macron", // 0xB0
            "degree", "plusminus", "twosuperior", "threesuperior", "acute", "mu", "paragraph", "periodcentered",
            "cedilla", "onesuperior", "ordmasculine", "guillemotright", "onequarter", "onehalf", "threequarters",
            "questiondown", // 0xC0
            "Agrave", "Aacute", "Acircumflex", "Atilde", "Adieresis", "Aring", "AE", "Ccedilla", "Egrave", "Eacute",
            "Ecircumflex", "Edieresis", "Igrave", "Iacute", "Icircumflex", "Idieresis", // 0xD0
            "Eth", "Ntilde", "Ograve", "Oacute", "Ocircumflex", "Otilde", "Odieresis", "multiply", "Oslash",
            "Ugrave", "Uacute", "Ucircumflex", "Udieresis", "Yacute", "Thorn", "germandbls",
            // 0xE0
            "agrave", "aacute", "acircumflex", "atilde", "adieresis", "aring", "ae", "ccedilla", "egrave", "eacute",
            "ecircumflex", "edieresis", "igrave", "iacute", "icircumflex", "idieresis", // 0xF0
            "eth", "ntilde", "ograve", "oacute", "ocircumflex", "otilde", "odieresis", "divide", "oslash", "ugrave",
            "uacute", "ucircumflex", "udieresis", "yacute", "thorn", "ydieresis"};

    /**
     * The characters in WinAnsiEncoding
     */
    public static final char[] WINANSI_ENCODING = {
            // not used until char 32
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, // 0x20
            ' ', '\u0021', '\"', '\u0023', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '\u002d', '\u002e', '/',
            // 0x30
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', // 0x40
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', // 0x50
            'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '\u005b', '\\', '\u005d', '^', '_', // 0x60
            '\u2018', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', // 0x70
            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '\u007b', '\u007c', '\u007d', '\u007e', '\u2022',
            // 0x80
            '\u20ac', '\u2022', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030',
            '\u0160', '\u2039', '\u0152', '\u2022', '\u017d', '\u2022', // 0x90
            '\u2022', '\u2018', // quoteleft
            '\u2019', // quoteright
            '\u201c', // quotedblleft
            '\u201d', // quotedblright
            '\u2022', // bullet
            '\u2013', // endash
            '\u2014', // emdash
            '~', '\u2122', // trademark
            '\u0161', '\u203a', '\u0153', '\u2022', '\u017e', '\u0178', // 0xA0
            ' ', '\u00a1', '\u00a2', '\u00a3', '\u00a4', '\u00a5', '\u00a6', '\u00a7', '\u00a8', '\u00a9', '\u00aa',
            '\u00ab', '\u00ac', '\u00ad', '\u00ae', '\u00af', // 0xb0
            '\u00b0', '\u00b1', '\u00b2', '\u00b3', '\u00b4', '\u00b5', // This is hand-coded, the rest is assumption
            '\u00b6', // and *might* not be correct...
            '\u00b7', '\u00b8', '\u00b9', '\u00ba', '\u00bb', '\u00bc', '\u00bd', '\u00be', '\u00bf', // 0xc0
            '\u00c0', '\u00c1', '\u00c2', '\u00c3', '\u00c4', '\u00c5', // Aring
            '\u00c6', // AE
            '\u00c7', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00cc', '\u00cd', '\u00ce', '\u00cf', // 0xd0
            '\u00d0', '\u00d1', '\u00d2', '\u00d3', '\u00d4', '\u00d5', '\u00d6', '\u00d7', '\u00d8', // Oslash
            '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00dd', '\u00de', '\u00df', // 0xe0
            '\u00e0', '\u00e1', '\u00e2', '\u00e3', '\u00e4', '\u00e5', // aring
            '\u00e6', // ae
            '\u00e7', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00ec', '\u00ed', '\u00ee', '\u00ef', // 0xf0
            '\u00f0', '\u00f1', '\u00f2', '\u00f3', '\u00f4', '\u00f5', '\u00f6', '\u00f7', '\u00f8', '\u00f9',
            '\u00fa', '\u00fb', '\u00fc', '\u00fd', '\u00fe', '\u00ff'};

    /**
     * List of unicode glyphs
     */
    public static final String[] UNICODE_GLYPHS = {"\u0041", "A", "\u00C6", "AE", "\u01FC", "AEacute", "\uF7E6",
            "AEsmall", "\u00C1", "Aacute", "\uF7E1", "Aacutesmall", "\u0102", "Abreve", "\u00C2", "Acircumflex",
            "\uF7E2", "Acircumflexsmall", "\uF6C9", "Acute", "\uF7B4", "Acutesmall", "\u00C4", "Adieresis", "\uF7E4",
            "Adieresissmall", "\u00C0", "Agrave", "\uF7E0", "Agravesmall", "\u0391", "Alpha", "\u0386", "Alphatonos",
            "\u0100", "Amacron", "\u0104", "Aogonek", "\u00C5", "Aring", "\u01FA", "Aringacute", "\uF7E5",
            "Aringsmall", "\uF761", "Asmall", "\u00C3", "Atilde", "\uF7E3", "Atildesmall", "\u0042", "B", "\u0392",
            "Beta", "\uF6F4", "Brevesmall", "\uF762", "Bsmall", "\u0043", "C", "\u0106", "Cacute", "\uF6CA", "Caron",
            "\uF6F5", "Caronsmall", "\u010C", "Ccaron", "\u00C7", "Ccedilla", "\uF7E7", "Ccedillasmall", "\u0108",
            "Ccircumflex", "\u010A", "Cdotaccent", "\uF7B8", "Cedillasmall", "\u03A7", "Chi", "\uF6F6",
            "Circumflexsmall", "\uF763", "Csmall", "\u0044", "D", "\u010E", "Dcaron", "\u0110", "Dcroat", "\u2206",
            "Delta", "\u0394", "Delta", "\uF6CB", "Dieresis", "\uF6CC", "DieresisAcute", "\uF6CD", "DieresisGrave",
            "\uF7A8", "Dieresissmall", "\uF6F7", "Dotaccentsmall", "\uF764", "Dsmall", "\u0045", "E", "\u00C9",
            "Eacute", "\uF7E9", "Eacutesmall", "\u0114", "Ebreve", "\u011A", "Ecaron", "\u00CA", "Ecircumflex",
            "\uF7EA", "Ecircumflexsmall", "\u00CB", "Edieresis", "\uF7EB", "Edieresissmall", "\u0116", "Edotaccent",
            "\u00C8", "Egrave", "\uF7E8", "Egravesmall", "\u0112", "Emacron", "\u014A", "Eng", "\u0118", "Eogonek",
            "\u0395", "Epsilon", "\u0388", "Epsilontonos", "\uF765", "Esmall", "\u0397", "Eta", "\u0389", "Etatonos",
            "\u00D0", "Eth", "\uF7F0", "Ethsmall", "\u20AC", "Euro", "\u0046", "F", "\uF766", "Fsmall", "\u0047",
            "G", "\u0393", "Gamma", "\u011E", "Gbreve", "\u01E6", "Gcaron", "\u011C", "Gcircumflex", "\u0122",
            "Gcommaaccent", "\u0120", "Gdotaccent", "\uF6CE", "Grave", "\uF760", "Gravesmall", "\uF767", "Gsmall",
            "\u0048", "H", "\u25CF", "H18533", "\u25AA", "H18543", "\u25AB", "H18551", "\u25A1", "H22073", "\u0126",
            "Hbar", "\u0124", "Hcircumflex", "\uF768", "Hsmall", "\uF6CF", "Hungarumlaut", "\uF6F8",
            "Hungarumlautsmall", "\u0049", "I", "\u0132", "IJ", "\u00CD", "Iacute", "\uF7ED", "Iacutesmall",
            "\u012C", "Ibreve", "\u00CE", "Icircumflex", "\uF7EE", "Icircumflexsmall", "\u00CF", "Idieresis",
            "\uF7EF", "Idieresissmall", "\u0130", "Idotaccent", "\u2111", "Ifraktur", "\u00CC", "Igrave", "\uF7EC",
            "Igravesmall", "\u012A", "Imacron", "\u012E", "Iogonek", "\u0399", "Iota", "\u03AA", "Iotadieresis",
            "\u038A", "Iotatonos", "\uF769", "Ismall", "\u0128", "Itilde", "\u004A", "J", "\u0134", "Jcircumflex",
            "\uF76A", "Jsmall", "\u004B", "K", "\u039A", "Kappa", "\u0136", "Kcommaaccent", "\uF76B", "Ksmall",
            "\u004C", "L", "\uF6BF", "LL", "\u0139", "Lacute", "\u039B", "Lambda", "\u013D", "Lcaron", "\u013B",
            "Lcommaaccent", "\u013F", "Ldot", "\u0141", "Lslash", "\uF6F9", "Lslashsmall", "\uF76C", "Lsmall",
            "\u004D", "M", "\uF6D0", "Macron", "\uF7AF", "Macronsmall", "\uF76D", "Msmall", "\u039C", "Mu", "\u004E",
            "N", "\u0143", "Nacute", "\u0147", "Ncaron", "\u0145", "Ncommaaccent", "\uF76E", "Nsmall", "\u00D1",
            "Ntilde", "\uF7F1", "Ntildesmall", "\u039D", "Nu", "\u004F", "O", "\u0152", "OE", "\uF6FA", "OEsmall",
            "\u00D3", "Oacute", "\uF7F3", "Oacutesmall", "\u014E", "Obreve", "\u00D4", "Ocircumflex", "\uF7F4",
            "Ocircumflexsmall", "\u00D6", "Odieresis", "\uF7F6", "Odieresissmall", "\uF6FB", "Ogoneksmall", "\u00D2",
            "Ograve", "\uF7F2", "Ogravesmall", "\u01A0", "Ohorn", "\u0150", "Ohungarumlaut", "\u014C", "Omacron",
            "\u2126", "Omega", "\u03A9", "Omega", "\u038F", "Omegatonos", "\u039F", "Omicron", "\u038C",
            "Omicrontonos", "\u00D8", "Oslash", "\u01FE", "Oslashacute", "\uF7F8", "Oslashsmall", "\uF76F", "Osmall",
            "\u00D5", "Otilde", "\uF7F5", "Otildesmall", "\u0050", "P", "\u03A6", "Phi", "\u03A0", "Pi", "\u03A8",
            "Psi", "\uF770", "Psmall", "\u0051", "Q", "\uF771", "Qsmall", "\u0052", "R", "\u0154", "Racute",
            "\u0158", "Rcaron", "\u0156", "Rcommaaccent", "\u211C", "Rfraktur", "\u03A1", "Rho", "\uF6FC",
            "Ringsmall", "\uF772", "Rsmall", "\u0053", "S", "\u250C", "SF010000", "\u2514", "SF020000", "\u2510",
            "SF030000", "\u2518", "SF040000", "\u253C", "SF050000", "\u252C", "SF060000", "\u2534", "SF070000",
            "\u251C", "SF080000", "\u2524", "SF090000", "\u2500", "SF100000", "\u2502", "SF110000", "\u2561",
            "SF190000", "\u2562", "SF200000", "\u2556", "SF210000", "\u2555", "SF220000", "\u2563", "SF230000",
            "\u2551", "SF240000", "\u2557", "SF250000", "\u255D", "SF260000", "\u255C", "SF270000", "\u255B",
            "SF280000", "\u255E", "SF360000", "\u255F", "SF370000", "\u255A", "SF380000", "\u2554", "SF390000",
            "\u2569", "SF400000", "\u2566", "SF410000", "\u2560", "SF420000", "\u2550", "SF430000", "\u256C",
            "SF440000", "\u2567", "SF450000", "\u2568", "SF460000", "\u2564", "SF470000", "\u2565", "SF480000",
            "\u2559", "SF490000", "\u2558", "SF500000", "\u2552", "SF510000", "\u2553", "SF520000", "\u256B",
            "SF530000", "\u256A", "SF540000", "\u015A", "Sacute", "\u0160", "Scaron", "\uF6FD", "Scaronsmall",
            "\u015E", "Scedilla", "\uF6C1", "Scedilla", "\u015C", "Scircumflex", "\u0218", "Scommaaccent", "\u03A3",
            "Sigma", "\uF773", "Ssmall", "\u0054", "T", "\u03A4", "Tau", "\u0166", "Tbar", "\u0164", "Tcaron",
            "\u0162", "Tcommaaccent", "\u021A", "Tcommaaccent", "\u0398", "Theta", "\u00DE", "Thorn", "\uF7FE",
            "Thornsmall", "\uF6FE", "Tildesmall", "\uF774", "Tsmall", "\u0055", "U", "\u00DA", "Uacute", "\uF7FA",
            "Uacutesmall", "\u016C", "Ubreve", "\u00DB", "Ucircumflex", "\uF7FB", "Ucircumflexsmall", "\u00DC",
            "Udieresis", "\uF7FC", "Udieresissmall", "\u00D9", "Ugrave", "\uF7F9", "Ugravesmall", "\u01AF", "Uhorn",
            "\u0170", "Uhungarumlaut", "\u016A", "Umacron", "\u0172", "Uogonek", "\u03A5", "Upsilon", "\u03D2",
            "Upsilon1", "\u03AB", "Upsilondieresis", "\u038E", "Upsilontonos", "\u016E", "Uring", "\uF775", "Usmall",
            "\u0168", "Utilde", "\u0056", "V", "\uF776", "Vsmall", "\u0057", "W", "\u1E82", "Wacute", "\u0174",
            "Wcircumflex", "\u1E84", "Wdieresis", "\u1E80", "Wgrave", "\uF777", "Wsmall", "\u0058", "X", "\u039E",
            "Xi", "\uF778", "Xsmall", "\u0059", "Y", "\u00DD", "Yacute", "\uF7FD", "Yacutesmall", "\u0176",
            "Ycircumflex", "\u0178", "Ydieresis", "\uF7FF", "Ydieresissmall", "\u1EF2", "Ygrave", "\uF779", "Ysmall",
            "\u005A", "Z", "\u0179", "Zacute", "\u017D", "Zcaron", "\uF6FF", "Zcaronsmall", "\u017B", "Zdotaccent",
            "\u0396", "Zeta", "\uF77A", "Zsmall", "\u0061", "a", "\u00E1", "aacute", "\u0103", "abreve", "\u00E2",
            "acircumflex", "\u00B4", "acute", "\u0301", "acutecomb", "\u00E4", "adieresis", "\u00E6", "ae", "\u01FD",
            "aeacute", "\u2015", "afii00208", "\u0410", "afii10017", "\u0411", "afii10018", "\u0412", "afii10019",
            "\u0413", "afii10020", "\u0414", "afii10021", "\u0415", "afii10022", "\u0401", "afii10023", "\u0416",
            "afii10024", "\u0417", "afii10025", "\u0418", "afii10026", "\u0419", "afii10027", "\u041A", "afii10028",
            "\u041B", "afii10029", "\u041C", "afii10030", "\u041D", "afii10031", "\u041E", "afii10032", "\u041F",
            "afii10033", "\u0420", "afii10034", "\u0421", "afii10035", "\u0422", "afii10036", "\u0423", "afii10037",
            "\u0424", "afii10038", "\u0425", "afii10039", "\u0426", "afii10040", "\u0427", "afii10041", "\u0428",
            "afii10042", "\u0429", "afii10043", "\u042A", "afii10044", "\u042B", "afii10045", "\u042C", "afii10046",
            "\u042D", "afii10047", "\u042E", "afii10048", "\u042F", "afii10049", "\u0490", "afii10050", "\u0402",
            "afii10051", "\u0403", "afii10052", "\u0404", "afii10053", "\u0405", "afii10054", "\u0406", "afii10055",
            "\u0407", "afii10056", "\u0408", "afii10057", "\u0409", "afii10058", "\u040A", "afii10059", "\u040B",
            "afii10060", "\u040C", "afii10061", "\u040E", "afii10062", "\uF6C4", "afii10063", "\uF6C5", "afii10064",
            "\u0430", "afii10065", "\u0431", "afii10066", "\u0432", "afii10067", "\u0433", "afii10068", "\u0434",
            "afii10069", "\u0435", "afii10070", "\u0451", "afii10071", "\u0436", "afii10072", "\u0437", "afii10073",
            "\u0438", "afii10074", "\u0439", "afii10075", "\u043A", "afii10076", "\u043B", "afii10077", "\u043C",
            "afii10078", "\u043D", "afii10079", "\u043E", "afii10080", "\u043F", "afii10081", "\u0440", "afii10082",
            "\u0441", "afii10083", "\u0442", "afii10084", "\u0443", "afii10085", "\u0444", "afii10086", "\u0445",
            "afii10087", "\u0446", "afii10088", "\u0447", "afii10089", "\u0448", "afii10090", "\u0449", "afii10091",
            "\u044A", "afii10092", "\u044B", "afii10093", "\u044C", "afii10094", "\u044D", "afii10095", "\u044E",
            "afii10096", "\u044F", "afii10097", "\u0491", "afii10098", "\u0452", "afii10099", "\u0453", "afii10100",
            "\u0454", "afii10101", "\u0455", "afii10102", "\u0456", "afii10103", "\u0457", "afii10104", "\u0458",
            "afii10105", "\u0459", "afii10106", "\u045A", "afii10107", "\u045B", "afii10108", "\u045C", "afii10109",
            "\u045E", "afii10110", "\u040F", "afii10145", "\u0462", "afii10146", "\u0472", "afii10147", "\u0474",
            "afii10148", "\uF6C6", "afii10192", "\u045F", "afii10193", "\u0463", "afii10194", "\u0473", "afii10195",
            "\u0475", "afii10196", "\uF6C7", "afii10831", "\uF6C8", "afii10832", "\u04D9", "afii10846", "\u200E",
            "afii299", "\u200F", "afii300", "\u200D", "afii301", "\u066A", "afii57381", "\u060C", "afii57388",
            "\u0660", "afii57392", "\u0661", "afii57393", "\u0662", "afii57394", "\u0663", "afii57395", "\u0664",
            "afii57396", "\u0665", "afii57397", "\u0666", "afii57398", "\u0667", "afii57399", "\u0668", "afii57400",
            "\u0669", "afii57401", "\u061B", "afii57403", "\u061F", "afii57407", "\u0621", "afii57409", "\u0622",
            "afii57410", "\u0623", "afii57411", "\u0624", "afii57412", "\u0625", "afii57413", "\u0626", "afii57414",
            "\u0627", "afii57415", "\u0628", "afii57416", "\u0629", "afii57417", "\u062A", "afii57418", "\u062B",
            "afii57419", "\u062C", "afii57420", "\u062D", "afii57421", "\u062E", "afii57422", "\u062F", "afii57423",
            "\u0630", "afii57424", "\u0631", "afii57425", "\u0632", "afii57426", "\u0633", "afii57427", "\u0634",
            "afii57428", "\u0635", "afii57429", "\u0636", "afii57430", "\u0637", "afii57431", "\u0638", "afii57432",
            "\u0639", "afii57433", "\u063A", "afii57434", "\u0640", "afii57440", "\u0641", "afii57441", "\u0642",
            "afii57442", "\u0643", "afii57443", "\u0644", "afii57444", "\u0645", "afii57445", "\u0646", "afii57446",
            "\u0648", "afii57448", "\u0649", "afii57449", "\u064A", "afii57450", "\u064B", "afii57451", "\u064C",
            "afii57452", "\u064D", "afii57453", "\u064E", "afii57454", "\u064F", "afii57455", "\u0650", "afii57456",
            "\u0651", "afii57457", "\u0652", "afii57458", "\u0647", "afii57470", "\u06A4", "afii57505", "\u067E",
            "afii57506", "\u0686", "afii57507", "\u0698", "afii57508", "\u06AF", "afii57509", "\u0679", "afii57511",
            "\u0688", "afii57512", "\u0691", "afii57513", "\u06BA", "afii57514", "\u06D2", "afii57519", "\u06D5",
            "afii57534", "\u20AA", "afii57636", "\u05BE", "afii57645", "\u05C3", "afii57658", "\u05D0", "afii57664",
            "\u05D1", "afii57665", "\u05D2", "afii57666", "\u05D3", "afii57667", "\u05D4", "afii57668", "\u05D5",
            "afii57669", "\u05D6", "afii57670", "\u05D7", "afii57671", "\u05D8", "afii57672", "\u05D9", "afii57673",
            "\u05DA", "afii57674", "\u05DB", "afii57675", "\u05DC", "afii57676", "\u05DD", "afii57677", "\u05DE",
            "afii57678", "\u05DF", "afii57679", "\u05E0", "afii57680", "\u05E1", "afii57681", "\u05E2", "afii57682",
            "\u05E3", "afii57683", "\u05E4", "afii57684", "\u05E5", "afii57685", "\u05E6", "afii57686", "\u05E7",
            "afii57687", "\u05E8", "afii57688", "\u05E9", "afii57689", "\u05EA", "afii57690", "\uFB2A", "afii57694",
            "\uFB2B", "afii57695", "\uFB4B", "afii57700", "\uFB1F", "afii57705", "\u05F0", "afii57716", "\u05F1",
            "afii57717", "\u05F2", "afii57718", "\uFB35", "afii57723", "\u05B4", "afii57793", "\u05B5", "afii57794",
            "\u05B6", "afii57795", "\u05BB", "afii57796", "\u05B8", "afii57797", "\u05B7", "afii57798", "\u05B0",
            "afii57799", "\u05B2", "afii57800", "\u05B1", "afii57801", "\u05B3", "afii57802", "\u05C2", "afii57803",
            "\u05C1", "afii57804", "\u05B9", "afii57806", "\u05BC", "afii57807", "\u05BD", "afii57839", "\u05BF",
            "afii57841", "\u05C0", "afii57842", "\u02BC", "afii57929", "\u2105", "afii61248", "\u2113", "afii61289",
            "\u2116", "afii61352", "\u202C", "afii61573", "\u202D", "afii61574", "\u202E", "afii61575", "\u200C",
            "afii61664", "\u066D", "afii63167", "\u02BD", "afii64937", "\u00E0", "agrave", "\u2135", "aleph",
            "\u03B1", "alpha", "\u03AC", "alphatonos", "\u0101", "amacron", "\u0026", "ampersand", "\uF726",
            "ampersandsmall", "\u2220", "angle", "\u2329", "angleleft", "\u232A", "angleright", "\u0387",
            "anoteleia", "\u0105", "aogonek", "\u2248", "approxequal", "\u00E5", "aring", "\u01FB", "aringacute",
            "\u2194", "arrowboth", "\u21D4", "arrowdblboth", "\u21D3", "arrowdbldown", "\u21D0", "arrowdblleft",
            "\u21D2", "arrowdblright", "\u21D1", "arrowdblup", "\u2193", "arrowdown", "\uF8E7", "arrowhorizex",
            "\u2190", "arrowleft", "\u2192", "arrowright", "\u2191", "arrowup", "\u2195", "arrowupdn", "\u21A8",
            "arrowupdnbse", "\uF8E6", "arrowvertex", "\u005E", "asciicircum", "\u007E", "asciitilde", "\u002A",
            "asterisk", "\u2217", "asteriskmath", "\uF6E9", "asuperior", "\u0040", "at", "\u00E3", "atilde",
            "\u0062", "b",
            //"\u005C", "backslash",
            "\\", "backslash", "\u007C", "bar", "\u03B2", "beta", "\u2588", "block", "\uF8F4", "braceex", "\u007B",
            "braceleft", "\uF8F3", "braceleftbt", "\uF8F2", "braceleftmid", "\uF8F1", "bracelefttp", "\u007D",
            "braceright", "\uF8FE", "bracerightbt", "\uF8FD", "bracerightmid", "\uF8FC", "bracerighttp", "\u005B",
            "bracketleft", "\uF8F0", "bracketleftbt", "\uF8EF", "bracketleftex", "\uF8EE", "bracketlefttp", "\u005D",
            "bracketright", "\uF8FB", "bracketrightbt", "\uF8FA", "bracketrightex", "\uF8F9", "bracketrighttp",
            "\u02D8", "breve", "\u00A6", "brokenbar", "\uF6EA", "bsuperior", "\u2022", "bullet", "\u0063", "c",
            "\u0107", "cacute", "\u02C7", "caron", "\u21B5", "carriagereturn", "\u010D", "ccaron", "\u00E7",
            "ccedilla", "\u0109", "ccircumflex", "\u010B", "cdotaccent", "\u00B8", "cedilla", "\u00A2", "cent",
            "\uF6DF", "centinferior", "\uF7A2", "centoldstyle", "\uF6E0", "centsuperior", "\u03C7", "chi", "\u25CB",
            "circle", "\u2297", "circlemultiply", "\u2295", "circleplus", "\u02C6", "circumflex", "\u2663", "club",
            "\u003A", "colon", "\u20A1", "colonmonetary", "\u002C", "comma", "\uF6C3", "commaaccent", "\uF6E1",
            "commainferior", "\uF6E2", "commasuperior", "\u2245", "congruent", "\u00A9", "copyright", "\uF8E9",
            "copyrightsans", "\uF6D9", "copyrightserif", "\u00A4", "currency", "\uF6D1", "cyrBreve", "\uF6D2",
            "cyrFlex", "\uF6D4", "cyrbreve", "\uF6D5", "cyrflex", "\u0064", "d", "\u2020", "dagger", "\u2021",
            "daggerdbl", "\uF6D3", "dblGrave", "\uF6D6", "dblgrave", "\u010F", "dcaron", "\u0111", "dcroat",
            "\u00B0", "degree", "\u03B4", "delta", "\u2666", "diamond", "\u00A8", "dieresis", "\uF6D7",
            "dieresisacute", "\uF6D8", "dieresisgrave", "\u0385", "dieresistonos", "\u00F7", "divide", "\u2593",
            "dkshade", "\u2584", "dnblock", "\u0024", "dollar", "\uF6E3", "dollarinferior", "\uF724",
            "dollaroldstyle", "\uF6E4", "dollarsuperior", "\u20AB", "dong", "\u02D9", "dotaccent", "\u0323",
            "dotbelowcomb", "\u0131", "dotlessi", "\uF6BE", "dotlessj", "\u22C5", "dotmath", "\uF6EB", "dsuperior",
            "\u0065", "e", "\u00E9", "eacute", "\u0115", "ebreve", "\u011B", "ecaron", "\u00EA", "ecircumflex",
            "\u00EB", "edieresis", "\u0117", "edotaccent", "\u00E8", "egrave", "\u0038", "eight", "\u2088",
            "eightinferior", "\uF738", "eightoldstyle", "\u2078", "eightsuperior", "\u2208", "element", "\u2026",
            "ellipsis", "\u0113", "emacron", "\u2014", "emdash", "\u2205", "emptyset", "\u2013", "endash", "\u014B",
            "eng", "\u0119", "eogonek", "\u03B5", "epsilon", "\u03AD", "epsilontonos", "\u003D", "equal", "\u2261",
            "equivalence", "\u212E", "estimated", "\uF6EC", "esuperior", "\u03B7", "eta", "\u03AE", "etatonos",
            "\u00F0", "eth", "\u0021", "exclam", "\u203C", "exclamdbl", "\u00A1", "exclamdown", "\uF7A1",
            "exclamdownsmall", "\uF721", "exclamsmall", "\u2203", "existential", "\u0066", "f", "\u2640", "female",
            "\uFB00", "ff", "\uFB03", "ffi", "\uFB04", "ffl", "\uFB01", "fi", "\u2012", "figuredash", "\u25A0",
            "filledbox", "\u25AC", "filledrect", "\u0035", "five", "\u215D", "fiveeighths", "\u2085", "fiveinferior",
            "\uF735", "fiveoldstyle", "\u2075", "fivesuperior", "\uFB02", "fl", "\u0192", "florin", "\u0034", "four",
            "\u2084", "fourinferior", "\uF734", "fouroldstyle", "\u2074", "foursuperior", "\u2044", "fraction",
            "\u2215", "fraction", "\u20A3", "franc", "\u0067", "g", "\u03B3", "gamma", "\u011F", "gbreve", "\u01E7",
            "gcaron", "\u011D", "gcircumflex", "\u0123", "gcommaaccent", "\u0121", "gdotaccent", "\u00DF",
            "germandbls", "\u2207", "gradient", "\u0060", "grave", "\u0300", "gravecomb", "\u003E", "greater",
            "\u2265", "greaterequal", "\u00AB", "guillemotleft", "\u00BB", "guillemotright", "\u2039",
            "guilsinglleft", "\u203A", "guilsinglright", "\u0068", "h", "\u0127", "hbar", "\u0125", "hcircumflex",
            "\u2665", "heart", "\u0309", "hookabovecomb", "\u2302", "house", "\u02DD", "hungarumlaut", "\u002D",
            "hyphen", "\u00AD", "hyphen", "\uF6E5", "hypheninferior", "\uF6E6", "hyphensuperior", "\u0069", "i",
            "\u00ED", "iacute", "\u012D", "ibreve", "\u00EE", "icircumflex", "\u00EF", "idieresis", "\u00EC",
            "igrave", "\u0133", "ij", "\u012B", "imacron", "\u221E", "infinity", "\u222B", "integral", "\u2321",
            "integralbt", "\uF8F5", "integralex", "\u2320", "integraltp", "\u2229", "intersection", "\u25D8",
            "invbullet", "\u25D9", "invcircle", "\u263B", "invsmileface", "\u012F", "iogonek", "\u03B9", "iota",
            "\u03CA", "iotadieresis", "\u0390", "iotadieresistonos", "\u03AF", "iotatonos", "\uF6ED", "isuperior",
            "\u0129", "itilde", "\u006A", "j", "\u0135", "jcircumflex", "\u006B", "k", "\u03BA", "kappa", "\u0137",
            "kcommaaccent", "\u0138", "kgreenlandic", "\u006C", "l", "\u013A", "lacute", "\u03BB", "lambda",
            "\u013E", "lcaron", "\u013C", "lcommaaccent", "\u0140", "ldot", "\u003C", "less", "\u2264", "lessequal",
            "\u258C", "lfblock", "\u20A4", "lira", "\uF6C0", "ll", "\u2227", "logicaland", "\u00AC", "logicalnot",
            "\u2228", "logicalor", "\u017F", "longs", "\u25CA", "lozenge", "\u0142", "lslash", "\uF6EE", "lsuperior",
            "\u2591", "ltshade", "\u006D", "m", "\u00AF", "macron", "\u02C9", "macron", "\u2642", "male", "\u2212",
            "minus", "\u2032", "minute", "\uF6EF", "msuperior", "\u00B5", "mu", "\u03BC", "mu", "\u00D7", "multiply",
            "\u266A", "musicalnote", "\u266B", "musicalnotedbl", "\u006E", "n", "\u0144", "nacute", "\u0149",
            "napostrophe", "\u0148", "ncaron", "\u0146", "ncommaaccent", "\u0039", "nine", "\u2089", "nineinferior",
            "\uF739", "nineoldstyle", "\u2079", "ninesuperior", "\u2209", "notelement", "\u2260", "notequal",
            "\u2284", "notsubset", "\u207F", "nsuperior", "\u00F1", "ntilde", "\u03BD", "nu", "\u0023", "numbersign",
            "\u006F", "o", "\u00F3", "oacute", "\u014F", "obreve", "\u00F4", "ocircumflex", "\u00F6", "odieresis",
            "\u0153", "oe", "\u02DB", "ogonek", "\u00F2", "ograve", "\u01A1", "ohorn", "\u0151", "ohungarumlaut",
            "\u014D", "omacron", "\u03C9", "omega", "\u03D6", "omega1", "\u03CE", "omegatonos", "\u03BF", "omicron",
            "\u03CC", "omicrontonos", "\u0031", "one", "\u2024", "onedotenleader", "\u215B", "oneeighth", "\uF6DC",
            "onefitted", "\u00BD", "onehalf", "\u2081", "oneinferior", "\uF731", "oneoldstyle", "\u00BC",
            "onequarter", "\u00B9", "onesuperior", "\u2153", "onethird", "\u25E6", "openbullet", "\u00AA",
            "ordfeminine", "\u00BA", "ordmasculine", "\u221F", "orthogonal", "\u00F8", "oslash", "\u01FF",
            "oslashacute", "\uF6F0", "osuperior", "\u00F5", "otilde", "\u0070", "p", "\u00B6", "paragraph", "\u0028",
            "parenleft", "\uF8ED", "parenleftbt", "\uF8EC", "parenleftex", "\u208D", "parenleftinferior", "\u207D",
            "parenleftsuperior", "\uF8EB", "parenlefttp", "\u0029", "parenright", "\uF8F8", "parenrightbt", "\uF8F7",
            "parenrightex", "\u208E", "parenrightinferior", "\u207E", "parenrightsuperior", "\uF8F6", "parenrighttp",
            "\u2202", "partialdiff", "\u0025", "percent", "\u002E", "period", "\u00B7", "periodcentered", "\u2219",
            "periodcentered", "\uF6E7", "periodinferior", "\uF6E8", "periodsuperior", "\u22A5", "perpendicular",
            "\u2030", "perthousand", "\u20A7", "peseta", "\u03C6", "phi", "\u03D5", "phi1", "\u03C0", "pi", "\u002B",
            "plus", "\u00B1", "plusminus", "\u211E", "prescription", "\u220F", "product", "\u2282", "propersubset",
            "\u2283", "propersuperset", "\u221D", "proportional", "\u03C8", "psi", "\u0071", "q", "\u003F",
            "question", "\u00BF", "questiondown", "\uF7BF", "questiondownsmall", "\uF73F", "questionsmall", "\"",
            "quotedbl",
            //        "\u0022", "quotedbl",
            "\u201E", "quotedblbase", "\u201C", "quotedblleft", "\u201D", "quotedblright", "\u2018", "quoteleft",
            "\u201B", "quotereversed", "\u2019", "quoteright", "\u201A", "quotesinglbase", "\u0027", "quotesingle",
            "\u0072", "r", "\u0155", "racute", "\u221A", "radical", "\uF8E5", "radicalex", "\u0159", "rcaron",
            "\u0157", "rcommaaccent", "\u2286", "reflexsubset", "\u2287", "reflexsuperset", "\u00AE", "registered",
            "\uF8E8", "registersans", "\uF6DA", "registerserif", "\u2310", "revlogicalnot", "\u03C1", "rho",
            "\u02DA", "ring", "\uF6F1", "rsuperior", "\u2590", "rtblock", "\uF6DD", "rupiah", "\u0073", "s",
            "\u015B", "sacute", "\u0161", "scaron", "\u015F", "scedilla", "\uF6C2", "scedilla", "\u015D",
            "scircumflex", "\u0219", "scommaaccent", "\u2033", "second", "\u00A7", "section", "\u003B", "semicolon",
            "\u0037", "seven", "\u215E", "seveneighths", "\u2087", "seveninferior", "\uF737", "sevenoldstyle",
            "\u2077", "sevensuperior", "\u2592", "shade", "\u03C3", "sigma", "\u03C2", "sigma1", "\u223C", "similar",
            "\u0036", "six", "\u2086", "sixinferior", "\uF736", "sixoldstyle", "\u2076", "sixsuperior", "\u002F",
            "slash", "\u263A", "smileface", "\u0020", "space", "\u00A0", "space", "\u2660", "spade", "\uF6F2",
            "ssuperior", "\u00A3", "sterling", "\u220B", "suchthat", "\u2211", "summation", "\u263C", "sun",
            "\u0074", "t", "\u03C4", "tau", "\u0167", "tbar", "\u0165", "tcaron", "\u0163", "tcommaaccent", "\u021B",
            "tcommaaccent", "\u2234", "therefore", "\u03B8", "theta", "\u03D1", "theta1", "\u00FE", "thorn",
            "\u0033", "three", "\u215C", "threeeighths", "\u2083", "threeinferior", "\uF733", "threeoldstyle",
            "\u00BE", "threequarters", "\uF6DE", "threequartersemdash", "\u00B3", "threesuperior", "\u02DC", "tilde",
            "\u0303", "tildecomb", "\u0384", "tonos", "\u2122", "trademark", "\uF8EA", "trademarksans", "\uF6DB",
            "trademarkserif", "\u25BC", "triagdn", "\u25C4", "triaglf", "\u25BA", "triagrt", "\u25B2", "triagup",
            "\uF6F3", "tsuperior", "\u0032", "two", "\u2025", "twodotenleader", "\u2082", "twoinferior", "\uF732",
            "twooldstyle", "\u00B2", "twosuperior", "\u2154", "twothirds", "\u0075", "u", "\u00FA", "uacute",
            "\u016D", "ubreve", "\u00FB", "ucircumflex", "\u00FC", "udieresis", "\u00F9", "ugrave", "\u01B0",
            "uhorn", "\u0171", "uhungarumlaut", "\u016B", "umacron", "\u005F", "underscore", "\u2017",
            "underscoredbl", "\u222A", "union", "\u2200", "universal", "\u0173", "uogonek", "\u2580", "upblock",
            "\u03C5", "upsilon", "\u03CB", "upsilondieresis", "\u03B0", "upsilondieresistonos", "\u03CD",
            "upsilontonos", "\u016F", "uring", "\u0169", "utilde", "\u0076", "v", "\u0077", "w", "\u1E83", "wacute",
            "\u0175", "wcircumflex", "\u1E85", "wdieresis", "\u2118", "weierstrass", "\u1E81", "wgrave", "\u0078",
            "x", "\u03BE", "xi", "\u0079", "y", "\u00FD", "yacute", "\u0177", "ycircumflex", "\u00FF", "ydieresis",
            "\u00A5", "yen", "\u1EF3", "ygrave", "\u007A", "z", "\u017A", "zacute", "\u017E", "zcaron", "\u017C",
            "zdotaccent", "\u0030", "zero", "\u2080", "zeroinferior", "\uF730", "zerooldstyle", "\u2070",
            "zerosuperior", "\u03B6", "zeta"};

    /**
     * Return the glyphname from a character, eg, charToGlyphName('\\') returns "backslash"
     * <p/>
     *
     * @param ch glyph to evaluate
     *           <p/>
     *
     * @return the name of the glyph
     */
    public static final String charToGlyphName(char ch) {
        return stringToGlyph(Character.valueOf(ch).toString());
    }

    /**
     * Return the glyphname from a string, eg, glyphToString("\\") returns "backslash"
     * <p/>
     *
     * @param name glyph to evaluate
     *             <p/>
     *
     * @return the name of the glyph TODO: javadocs for glyphToString and stringToGlyph are confused TODO: Improve
     *         method names
     */
    public static final String glyphToString(String name) {
        for (int i = 0; i < UNICODE_GLYPHS.length; i += 2) {
            if (UNICODE_GLYPHS[i + 1].equals(name)) {
                return UNICODE_GLYPHS[i];
            }
        }
        return "";
    }

    /**
     * Return the string representation of a glyphname, eg stringToGlyph("backslash") returns "\\"
     * <p/>
     *
     * @param name name of the glyph
     *             <p/>
     *
     * @return the string representation
     */
    public static String stringToGlyph(String name) {
        for (int i = 0; i < UNICODE_GLYPHS.length; i += 2) {
            if (UNICODE_GLYPHS[i].equals(name)) {
                return UNICODE_GLYPHS[i + 1];
            }
        }
        return "";
    }

}
