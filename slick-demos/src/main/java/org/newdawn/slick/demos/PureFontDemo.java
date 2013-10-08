package org.newdawn.slick.demos;

import org.newdawn.slick.*;

/**
 * A Demo of the font rendering capabilities
 * <p/>
 *
 * @author kevin
 */
public class PureFontDemo extends BasicGame {

    /**
     * The font we're going to use to render
     */
    private Font font;

    /**
     * The image
     */
    private Image image;

    /**
     * Create a new Demo for font rendering
     */
    public PureFontDemo() {
        super("Hiero Font Demo");
    }

    /**
     * @see org.newdawn.slick.Game#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        image = new Image("org/newdawn/slick/testdata/sky.jpg");
        font = new AngelCodeFont("org/newdawn/slick/testdata/hiero.fnt", "org/newdawn/slick/testdata/hiero.png");
    }

    /**
     * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) {
        image.draw(0, 0, 800, 600);
        font.drawString(100, 32, "On top of old smokey, all");
        font.drawString(100, 80, "covered with sand..");
    }

    /**
     * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
     */
    public void update(GameContainer container, int delta) throws SlickException {
    }

    /**
     * @see org.newdawn.slick.BasicGame#keyPressed(int, char)
     */
    public void keyPressed(int key, char c) {
        if (key == Input.KEY_ESCAPE) {
            System.exit(0);
        }
    }

    /**
     * The container we're using
     */
    private static AppGameContainer container;

    /**
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments passed in the Demo
     */
    public static void main(String[] argv) {
        try {
            container = new AppGameContainer(new PureFontDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
