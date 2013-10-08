package org.newdawn.slick.demos;

import org.newdawn.slick.*;

/**
 * A Demo for image flashes
 * <p/>
 *
 * @author kevin
 */
public class FlashDemo extends BasicGame {

    /**
     * The TGA image loaded
     */
    private Image image;

    /**
     * True if the image is rendered flashed
     */
    private boolean flash;

    /**
     * The container for the Demo
     */
    private GameContainer container;

    /**
     * Create a new image rendering Demo
     */
    public FlashDemo() {
        super("Flash Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        this.container = container;

        image = new Image("org/newdawn/slick/testdata/logo.tga");
    }

    /**
     * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) {
        g.drawString("Press space to toggle", 10, 50);
        if (flash) {
            image.draw(100, 100);
        } else {
            image.drawFlash(100, 100, image.getWidth(), image.getHeight(), new Color(1, 0, 1f, 1f));
        }
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
            AppGameContainer container = new AppGameContainer(new FlashDemo());
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
        if (key == Input.KEY_SPACE) {
            flash = !flash;
        }
        if (key == Input.KEY_ESCAPE) {
            container.exit();
        }
    }

}
