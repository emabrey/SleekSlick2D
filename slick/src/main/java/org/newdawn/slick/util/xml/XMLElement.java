package org.newdawn.slick.util.xml;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 * A utility wrapper round the standard DOM XML element. This provides a more simple API for accessing attributes,
 * children and providing defaults when schemas arn't used - which is generally a little simpler for most of us.
 * <p>
 * @author kevin
 */
public class XMLElement {

	/**
	 * The Java DOM implementation XML element
	 */
	private Element dom;

	/**
	 * The list of children initialised on first access
	 */
	private XMLElementList children;

	/**
	 * The name of the element
	 */
	private String name;

	/**
	 * Create a new element wrapped round a DOM element
	 * <p>
	 * @param xmlElement The DOM element to present
	 */
	XMLElement(Element xmlElement) {
		dom = xmlElement;
		name = dom.getTagName();
	}

	/**
	 * Get the names of the attributes specified on this element
	 * <p>
	 * @return The names of the elements specified
	 */
	public String[] getAttributeNames() {
		NamedNodeMap map = dom.getAttributes();
		String[] names = new String[map.getLength()];

		for (int i = 0; i < names.length; i++) {
			names[i] = map.item(i).getNodeName();
		}

		return names;
	}

	/**
	 * Get the name of this element
	 * <p>
	 * @return The name of this element
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the value specified for a given attribute on this element
	 * <p>
	 * @param name The name of the attribute whose value should be retrieved
	 * <p>
	 * @return The value given for the attribute
	 */
	public String getAttribute(String name) {
		return dom.getAttribute(name);
	}

	/**
	 * Get the value specified for a given attribute on this element
	 * <p>
	 * @param name The name of the attribute whose value should be retrieved
	 * @param def The default value to return if the attribute is specified
	 * <p>
	 * @return The value given for the attribute
	 */
	public String getAttribute(String name, String def) {
		String value = dom.getAttribute(name);
		if ((value == null) || (value.length() == 0)) {
			return def;
		}

		return value;
	}

	/**
	 * Get the value specified for a given attribute on this element as an integer.
	 * <p>
	 * @param name The name of the attribute whose value should be retrieved
	 * <p>
	 * @return The value given for the attribute
	 * <p>
	 * @throws SlickXMLException Indicates a failure to convert the value into an integer
	 */
	public int getIntAttribute(String name) throws SlickXMLException {
		try {
			return Integer.parseInt(getAttribute(name));
		}
		catch (NumberFormatException e) {
			throw new SlickXMLException("Value read: '" + getAttribute(name) + "' is not an integer", e);
		}
	}

	/**
	 * Get the value specified for a given attribute on this element as an integer.
	 * <p>
	 * @param name The name of the attribute whose value should be retrieved
	 * @param def The default value to return if the attribute is specified
	 * <p>
	 * @return The value given for the attribute
	 * <p>
	 * @throws SlickXMLException Indicates a failure to convert the value into an integer
	 */
	public int getIntAttribute(String name, int def) throws SlickXMLException {
		try {
			return Integer.parseInt(getAttribute(name, "" + def));
		}
		catch (NumberFormatException e) {
			throw new SlickXMLException("Value read: '" + getAttribute(name, "" + def) + "' is not an integer", e);
		}
	}

	/**
	 * Get the value specified for a given attribute on this element as an double.
	 * <p>
	 * @param name The name of the attribute whose value should be retrieved
	 * <p>
	 * @return The value given for the attribute
	 * <p>
	 * @throws SlickXMLException Indicates a failure to convert the value into an double
	 */
	public double getDoubleAttribute(String name) throws SlickXMLException {
		try {
			return Double.parseDouble(getAttribute(name));
		}
		catch (NumberFormatException e) {
			throw new SlickXMLException("Value read: '" + getAttribute(name) + "' is not a double", e);
		}
	}

	/**
	 * Get the value specified for a given attribute on this element as an double.
	 * <p>
	 * @param name The name of the attribute whose value should be retrieved
	 * @param def The default value to return if the attribute is specified
	 * <p>
	 * @return The value given for the attribute
	 * <p>
	 * @throws SlickXMLException Indicates a failure to convert the value into an double
	 */
	public double getDoubleAttribute(String name, double def) throws SlickXMLException {
		try {
			return Double.parseDouble(getAttribute(name, "" + def));
		}
		catch (NumberFormatException e) {
			throw new SlickXMLException("Value read: '" + getAttribute(name, "" + def) + "' is not a double", e);
		}
	}

	/**
	 * Get the value specified for a given attribute on this element as a boolean.
	 * <p>
	 * @param name The name of the attribute whose value should be retrieved
	 * <p>
	 * @return The value given for the attribute
	 * <p>
	 * @throws SlickXMLException Indicates a failure to convert the value into an boolean
	 */
	public boolean getBooleanAttribute(String name) throws SlickXMLException {
		String value = getAttribute(name);
		if (value.equalsIgnoreCase("true")) {
			return true;
		}
		if (value.equalsIgnoreCase("false")) {
			return false;
		}

		throw new SlickXMLException("Value read: '" + getAttribute(name) + "' is not a boolean");
	}

	/**
	 * Get the value specified for a given attribute on this element as a boolean.
	 * <p>
	 * @param name The name of the attribute whose value should be retrieved
	 * @param def The default value to return if the attribute is specified
	 * <p>
	 * @return The value given for the attribute
	 * <p>
	 * @throws SlickXMLException Indicates a failure to convert the value into an boolean
	 */
	public boolean getBooleanAttribute(String name, boolean def) throws SlickXMLException {
		String value = getAttribute(name, "" + def);
		if (value.equalsIgnoreCase("true")) {
			return true;
		}
		if (value.equalsIgnoreCase("false")) {
			return false;
		}

		throw new SlickXMLException("Value read: '" + getAttribute(name, "" + def) + "' is not a boolean");
	}

	/**
	 * Get the text content of the element, i.e. the bit between the tags
	 * <p>
	 * @return The text content of the node
	 */
	public String getContent() {
		String content = "";

		NodeList list = dom.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i) instanceof Text) {
				content += (list.item(i).getNodeValue());
			}
		}

		return content;
	}

	/**
	 * Get the complete list of children for this node
	 * <p>
	 * @return The list of children for this node
	 */
	public XMLElementList getChildren() {
		if (children != null) {
			return children;
		}

		NodeList list = dom.getChildNodes();
		children = new XMLElementList();

		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i) instanceof Element) {
				children.add(new XMLElement((Element) list.item(i)));
			}
		}

		return children;
	}

	/**
	 * Get a list of children with a given element name
	 * <p>
	 * @param name The name of the element type that should be retrieved
	 * <p>
	 * @return A list of elements
	 */
	public XMLElementList getChildrenByName(String name) {
		XMLElementList selected = new XMLElementList();
		XMLElementList children = getChildren();

		for (int i = 0; i < children.size(); i++) {
			if (children.get(i).getName().equals(name)) {
				selected.add(children.get(i));
			}
		}

		return selected;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String value = "[XML " + getName();
		String[] attrs = getAttributeNames();

		for (int i = 0; i < attrs.length; i++) {
			value += " " + attrs[i] + "=" + getAttribute(attrs[i]);
		}

		value += "]";

		return value;
	}

}
