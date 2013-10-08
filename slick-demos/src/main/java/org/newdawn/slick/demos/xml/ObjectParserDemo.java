package org.newdawn.slick.demos.xml;

import org.newdawn.slick.util.xml.ObjectTreeParser;
import org.newdawn.slick.util.xml.SlickXMLException;

/**
 * A simple Demo to check that the object parser from XML works. Read the Javadoc of ObjectParser to work out whats
 * going on here
 * <p/>
 *
 * @author kevin
 */
public class ObjectParserDemo {

    /**
     * Entity point to our Demo. Simple read some XML which should generate an object tree.
     * <p/>
     *
     * @param argv The arguments passed into the Demo
     *             <p/>
     *
     * @throws SlickXMLException Indicates a failure to parse XML or generate objects
     */
    public static void main(String[] argv) throws SlickXMLException {
        ObjectTreeParser parser = new ObjectTreeParser("org.newdawn.slick.tests.xml");
        parser.addElementMapping("Bag", ItemContainer.class);

        GameData parsedData = (GameData) parser.parse("org/newdawn/slick/testdata/objxmltest.xml");
        parsedData.dump("");
    }

}
