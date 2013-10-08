package org.newdawn.slick.demos;

import org.newdawn.slick.*;
import org.newdawn.slick.util.Log;

/**
 * A Demo of the font rendering capabilities
 * <p/>
 *
 * @author kevin
 */
public class FontDemo extends BasicGame {

    /**
     * The font we're going to use to render
     */
    private AngelCodeFont font;

    /**
     * The font we're going to use to render
     */
    private AngelCodeFont font2;

    /**
     * The image of the font to compare against
     */
    private Image image;

    /**
     * Create a new Demo for font rendering
     */
    public FontDemo() {
        super("Font Demo");
    }

    /**
     * @see org.newdawn.slick.Game#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        font = new AngelCodeFont("org/newdawn/slick/testdata/Demo2.fnt", "org/newdawn/slick/testdata/Demo2_00.tga");
        font2 = new AngelCodeFont("org/newdawn/slick/testdata/hiero.fnt", "org/newdawn/slick/testdata/hiero.png");
        image = new Image("org/newdawn/slick/testdata/Demo2_00.tga", false);
    }

    /**
     * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) {
        font.drawString(80, 5, "A Font Example", Color.red);
        font.drawString(100, 32, "We - AV - Here is a more complete line that hopefully");
        font.drawString(100, 36 + font.getHeight("We Here is a more complete line that hopefully"),
                "will show some kerning.");

        font2.drawString(80, 85, "A Font Example", Color.red);
        font2.drawString(100, 132, "We - AV - Here is a more complete line that hopefully");
        font2.drawString(100, 136 + font2.getHeight("We - Here is a more complete line that hopefully"),
                "will show some kerning.");
        image.draw(100, 400);

        String testStr = "Demoing Font";
        font2.drawString(100, 300, testStr);
        g.setColor(Color.white);
        g.drawRect(100, 300 + font2.getYOffset(testStr), font2.getWidth(testStr),
                font2.getHeight(testStr) - font2.getYOffset(testStr));
        font.drawString(500, 300, testStr);
        g.setColor(Color.white);
        g.drawRect(500, 300 + font.getYOffset(testStr), font.getWidth(testStr),
                font.getHeight(testStr) - font.getYOffset(testStr));
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
        if (key == Input.KEY_SPACE) {
            try {
                container.setDisplayMode(640, 480, false);
            } catch (SlickException e) {
                Log.error(e);
            }
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
            container = new AppGameContainer(new FontDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
