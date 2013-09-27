package org.newdawn.slick.gui;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.util.InputAdapter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * The utility class to handle all the input related gubbins for basic GUI components
 * <p/>
 *
 * @author kevin
 */
public abstract class AbstractComponent extends InputAdapter {

    /**
     * The component that currently has focus
     */
    private static AbstractComponent currentFocus = null;

    /**
     * The game container
     */
    protected GUIContext container;

    /**
     * Listeners for the component to notify
     */
    protected Set listeners;

    /**
     * True if this component currently has focus
     */
    private boolean focus = false;

    /**
     * The input we're responding to
     */
    protected Input input;

    /**
     * Create a new component
     * <p/>
     *
     * @param container The container displaying this component
     */
    public AbstractComponent(GUIContext container) {
        this.container = container;

        listeners = new HashSet();

        input = container.getInput();
        input.addPrimaryListener(this);

        setLocation(0, 0);
    }

    /**
     * Add a component listener to be informed when the component sees fit.
     * <p/>
     * It will ignore listeners already added.
     * <p/>
     *
     * @param listener listener
     */
    public void addListener(ComponentListener listener) {
        listeners.add(listener);
    }

    /**
     * Remove a component listener.
     * <p/>
     * It will ignore if the listener wasn't added.
     * <p/>
     *
     * @param listener listener
     */
    public void removeListener(ComponentListener listener) {
        listeners.remove(listener);
    }

    /**
     * Notify all the listeners.
     */
    protected void notifyListeners() {
        Iterator it = listeners.iterator();
        while (it.hasNext()) {
            ((ComponentListener) it.next()).componentActivated(this);
        }
    }

    /**
     * Render this component to the screen
     * <p/>
     *
     * @param container The container displaying this component
     * @param g         The graphics context used to render to the display
     *                  <p/>
     *
     * @throws SlickException If there has been an error rendering the component
     */
    public abstract void render(GUIContext container, Graphics g) throws SlickException;

    /**
     * Moves the component.
     * <p/>
     *
     * @param x X coordinate
     * @param y Y coordinate
     */
    public abstract void setLocation(int x, int y);

    /**
     * Returns the position in the X coordinate
     * <p/>
     *
     * @return x
     */
    public abstract int getX();

    /**
     * Returns the position in the Y coordinate
     * <p/>
     *
     * @return y
     */
    public abstract int getY();

    /**
     * Get the width of the component
     * <p/>
     *
     * @return The width of the component
     */
    public abstract int getWidth();

    /**
     * Get the height of the component
     * <p/>
     *
     * @return The height of the component
     */
    public abstract int getHeight();

    /**
     * Indicate whether this component should be focused or not
     * <p/>
     *
     * @param focus if the component should be focused
     */
    public void setFocus(boolean focus) {
        if (focus) {
            if (currentFocus != null) {
                currentFocus.setFocus(false);
            }
            currentFocus = this;
        } else {
            if (currentFocus == this) {
                currentFocus = null;
            }
        }
        this.focus = focus;
    }

    /**
     * Check if this component currently has focus
     * <p/>
     *
     * @return if this field currently has focus
     */
    public boolean hasFocus() {
        return focus;
    }

    /**
     * Consume the event currently being processed
     */
    protected void consumeEvent() {
        input.consumeEvent();
    }

    /**
     * Gives the focus to this component with a click of the mouse.
     * <p/>
     *
     * @see org.newdawn.slick.gui.AbstractComponent#mouseReleased(int, int, int)
     */
    public void mouseReleased(int button, int x, int y) {
        setFocus(Rectangle.contains(x, y, getX(), getY(), getWidth(), getHeight()));
    }

}
