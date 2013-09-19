package org.newdawn.slick.util.xml;

import java.util.ArrayList;
import java.util.Collection;

/**
 * A simple typed list.
 * <p>
 * @author kevin
 */
public class XMLElementList {

	/**
	 * The list of elements
	 */
	private ArrayList list = new ArrayList();

	/**
	 * Create a new list
	 */
	public XMLElementList() {

	}

	/**
	 * Add an element to the list
	 * <p>
	 * @param element The element to be added
	 */
	public void add(XMLElement element) {
		list.add(element);
	}

	/**
	 * Get the number of elements in the list
	 * <p>
	 * @return The number of elements in the list
	 */
	public int size() {
		return list.size();
	}

	/**
	 * Get the element at a specified index
	 * <p>
	 * @param i The index of the element
	 * <p>
	 * @return The element at the specified index
	 */
	public XMLElement get(int i) {
		return (XMLElement) list.get(i);
	}

	/**
	 * Check if this list contains the given element
	 * <p>
	 * @param element The element to check for
	 * <p>
	 * @return True if the element is in the list
	 */
	public boolean contains(XMLElement element) {
		return list.contains(element);
	}

	/**
	 * Add all the elements in this list to another collection
	 * <p>
	 * @param collection The collection the elements should be added to
	 */
	public void addAllTo(Collection collection) {
		collection.addAll(list);
	}

}
