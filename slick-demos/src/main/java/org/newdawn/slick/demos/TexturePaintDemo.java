package org.newdawn.slick.demos;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.*;

/**
 * Demo to emulate texture paint
 * <p/>
 *
 * @author kevin
 */
public class TexturePaintDemo extends BasicGame {

    /**
     * The poly being drawn
     */
    private Polygon poly = new Polygon();

    /**
     * The image being textured
     */
    private Image image;

    /**
     * The texture paint rectangle
     */
    private Rectangle texRect = new Rectangle(50, 50, 100, 100);

    /**
     * The texture paint
     */
    private TexCoordGenerator texPaint;

    /**
     * Create the Demo
     */
    public TexturePaintDemo() {
        super("Texture Paint Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        poly.addPoint(120, 120);
        poly.addPoint(420, 100);
        poly.addPoint(620, 420);
        poly.addPoint(300, 320);

        image = new Image("org/newdawn/slick/testdata/rocks.png");

        texPaint = new TexCoordGenerator() {
            public Vector2f getCoordFor(float x, float y) {
                float tx = (texRect.getX() - x) / texRect.getWidth();
                float ty = (texRect.getY() - y) / texRect.getHeight();

                return new Vector2f(tx, ty);
            }

        };
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

        ShapeRenderer.texture(poly, image, texPaint);
    }

    /**
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments to pass into the Demo
     */
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new TexturePaintDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
