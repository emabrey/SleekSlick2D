package org.newdawn.slick.demos;

import org.newdawn.slick.*;

/**
 * The double click testing
 * <p/>
 *
 * @author kevin
 */
public class DoubleClickDemo extends BasicGame {

    /**
     * Create the Demo game
     */
    public DoubleClickDemo() {
        super("Double Click Demo");
    }

    /**
     * The Demo message to display
     */
    private String message = "Click or Double Click";

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
    }

    /**
     * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
     */
    public void update(GameContainer container, int delta) throws SlickException {
    }

    /**
     * @see org.newdawn.slick.Game#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) throws SlickException {
        g.drawString(message, 100, 100);
    }

    /**
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments to pass into the Demo, not used here
     */
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new DoubleClickDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    /**
     * @see org.newdawn.slick.BasicGame#mouseClicked(int, int, int, int)
     */
    public void mouseClicked(int button, int x, int y, int clickCount) {
        if (clickCount == 1) {
            message = "Single Click: " + button + " " + x + "," + y;
        }
        if (clickCount == 2) {
            message = "Double Click: " + button + " " + x + "," + y;
        }
    }

}
