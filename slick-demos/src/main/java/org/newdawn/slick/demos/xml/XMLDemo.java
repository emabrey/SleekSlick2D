package org.newdawn.slick.demos.xml;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.util.xml.XMLElement;
import org.newdawn.slick.util.xml.XMLParser;

/**
 * Silly Demo to check XML parsing functionality, note the JUnit like methods, want to move it to JUnit soon but not
 * quite there yet.
 * <p/>
 *
 * @author kevin
 */
public class XMLDemo {

    /**
     * Fail the Demo
     * <p/>
     *
     * @param message The message to describe the failure
     */
    private static void fail(String message) {
        throw new RuntimeException(message);
    }

    /**
     * Ensure that the given object is not null, if it is fail the Demo
     * <p/>
     *
     * @param object1 The object to Demo
     */
    private static void assertNotNull(Object object1) {
        if (object1 == null) {
            throw new RuntimeException("Demo FAILS: " + object1 + " must not be null");
        }
    }

    /**
     * Ensure that the two values given are equal, if not fail the Demo
     * <p/>
     *
     * @param a1 The first value to compare
     * @param a2 The second value to compare
     */
    private static void assertEquals(float a1, float a2) {
        if (a1 != a2) {
            throw new RuntimeException("Demo FAILS: " + a1 + " should be " + a2);
        }
    }

    /**
     * Ensure that the two values given are equal, if not fail the Demo
     * <p/>
     *
     * @param a1 The first value to compare
     * @param a2 The second value to compare
     */
    private static void assertEquals(int a1, int a2) {
        if (a1 != a2) {
            throw new RuntimeException("Demo FAILS: " + a1 + " should be " + a2);
        }
    }

    /**
     * Ensure that the two values given are equal, if not fail the Demo
     * <p/>
     *
     * @param a1 The first value to compare
     * @param a2 The second value to compare
     */
    private static void assertEquals(Object a1, Object a2) {
        if (!a1.equals(a2)) {
            throw new RuntimeException("Demo FAILS: " + a1 + " should be " + a2);
        }
    }

    /**
     * Simple Demo for the XML parsing API
     * <p/>
     *
     * @param argv The arguments given to the Demo
     *             <p/>
     *
     * @throws SlickException Indicates a failure
     */
    public static void main(String[] argv) throws SlickException {
        XMLParser parser = new XMLParser();

        XMLElement root = parser.parse("org/newdawn/slick/testdata/Demo.xml");

        assertEquals(root.getName(), "testRoot");
        System.out.println(root);
        assertNotNull(root.getChildrenByName("simple").get(0).getContent());
        System.out.println(root.getChildrenByName("simple").get(0).getContent());

        XMLElement parent = root.getChildrenByName("parent").get(0);
        assertEquals(parent.getChildrenByName("grandchild").size(), 0);
        assertEquals(parent.getChildrenByName("child").size(), 2);

        assertEquals(parent.getChildrenByName("child").get(0).getChildren().size(), 2);
        XMLElement child = parent.getChildrenByName("child").get(0).getChildren().get(0);

        String name = child.getAttribute("name");
        String Demo = child.getAttribute("nothere", "defaultValue");
        int age = child.getIntAttribute("age");

        assertEquals(name, "bob");
        assertEquals(Demo, "defaultValue");
        assertEquals(age, 1);

        XMLElement other = root.getChildrenByName("other").get(0);
        float x = (float) other.getDoubleAttribute("x");
        float y = (float) other.getDoubleAttribute("y", 1.0f);
        float z = (float) other.getDoubleAttribute("z", 83.0f);

        assertEquals(x, 5.3f);
        assertEquals(y, 5.4f);
        assertEquals(z, 83.0f);

        try {
            z = (float) other.getDoubleAttribute("z");
            fail("Attribute z as a double should fail");
        } catch (SlickException e) {
            // expect exception
        }
    }

}
