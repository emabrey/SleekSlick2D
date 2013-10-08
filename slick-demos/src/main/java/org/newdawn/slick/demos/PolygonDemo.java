package org.newdawn.slick.demos;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Polygon;

/**
 * A Demo for polygon collision
 * <p/>
 *
 * @author kevin
 */
public class PolygonDemo extends BasicGame {

    /**
     * The polygon we're going to Demo against
     */
    private Polygon poly;

    /**
     * True if the mouse is in the polygon
     */
    private boolean in;

    /**
     * The y offset
     */
    private float y;

    /**
     * Create the Demo
     */
    public PolygonDemo() {
        super("Polygon Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        poly = new Polygon();
        poly.addPoint(300, 100);
        poly.addPoint(320, 200);
        poly.addPoint(350, 210);
        poly.addPoint(280, 250);
        poly.addPoint(300, 200);
        poly.addPoint(240, 150);

    }

    /**
     * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
     */
    public void update(GameContainer container, int delta) throws SlickException {
        in = poly.contains(container.getInput().getMouseX(), container.getInput().getMouseY());

        poly.setCenterY(0);
    }

    /**
     * @see org.newdawn.slick.Game#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) throws SlickException {
        if (in) {
            g.setColor(Color.red);
            g.fill(poly);
        }
        g.setColor(Color.yellow);
        g.fillOval(poly.getCenterX() - 3, poly.getCenterY() - 3, 6, 6);
        g.setColor(Color.white);
        g.draw(poly);
    }

    /**
     * Entry point into our Demo
     * <p/>
     *
     * @param argv The arguments passed on the command line
     */
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new PolygonDemo(), 640, 480, false);
            container.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
