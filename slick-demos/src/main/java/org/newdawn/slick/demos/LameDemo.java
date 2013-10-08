package org.newdawn.slick.demos;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Polygon;

/**
 * Lame Demo
 * <p/>
 *
 * @author kevin
 */
public class LameDemo extends BasicGame {

    /**
     * The poly being drawn
     */
    private Polygon poly = new Polygon();

    /**
     * The image being textured
     */
    private Image image;

    /**
     * Create the Demo
     */
    public LameDemo() {
        super("Lame Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        poly.addPoint(100, 100);
        poly.addPoint(120, 100);
        poly.addPoint(120, 120);
        poly.addPoint(100, 120);

        image = new Image("org/newdawn/slick/testdata/rocks.png");
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
        g.setColor(Color.white);
        g.texture(poly, image);
    }

    /**
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments to pass into the Demo
     */
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new LameDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
