package org.newdawn.slick.demos;

import org.newdawn.slick.*;

/**
 * A Demo for transparent colour specification
 * <p/>
 *
 * @author kevin
 */
public class TransparentColorDemo extends BasicGame {

    /**
     * The image we're currently displaying
     */
    private Image image;

    /**
     * The image we're currently displaying
     */
    private Image timage;

    /**
     * Create a new image rendering Demo
     */
    public TransparentColorDemo() {
        super("Transparent Color Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        image = new Image("org/newdawn/slick/testdata/transtest.png");
        timage = new Image("org/newdawn/slick/testdata/transtest.png", new Color(94, 66, 41, 255));
    }

    /**
     * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) {
        g.setBackground(Color.red);
        image.draw(10, 10);
        timage.draw(10, 310);
    }

    /**
     * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
     */
    public void update(GameContainer container, int delta) {
    }

    /**
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments to pass into the Demo
     */
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new TransparentColorDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    /**
     * @see org.newdawn.slick.BasicGame#keyPressed(int, char)
     */
    public void keyPressed(int key, char c) {
    }

}
