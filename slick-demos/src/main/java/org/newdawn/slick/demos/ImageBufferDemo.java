package org.newdawn.slick.demos;

import org.newdawn.slick.*;

/**
 * A Demo for image buffer maniupulation rendering
 * <p/>
 *
 * @author kevin
 */
public class ImageBufferDemo extends BasicGame {

    /**
     * The image we're currently displaying
     */
    private Image image;

    /**
     * Create a new image buffer rendering Demo
     */
    public ImageBufferDemo() {
        super("Image Buffer Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        ImageBuffer buffer = new ImageBuffer(320, 200);
        for (int x = 0; x < 320; x++) {
            for (int y = 0; y < 200; y++) {
                if (y == 20) {
                    buffer.setRGBA(x, y, 255, 255, 255, 255);
                } else {
                    buffer.setRGBA(x, y, x, y, 0, 255);
                }
            }
        }
        image = buffer.getImage();
    }

    /**
     * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) {
        image.draw(50, 50);
    }

    /**
     * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
     */
    public void update(GameContainer container, int delta) {
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
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments to pass into the Demo
     */
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ImageBufferDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
