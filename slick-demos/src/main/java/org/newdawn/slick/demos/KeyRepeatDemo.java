package org.newdawn.slick.demos;

import org.newdawn.slick.*;

/**
 * A Demo for basic image rendering
 * <p/>
 *
 * @author kevin
 */
public class KeyRepeatDemo extends BasicGame {

    /**
     * The number of times the key pressed event has been fired
     */
    private int count;

    /**
     * The input sub system
     */
    private Input input;

    /**
     * Create a new image rendering Demo
     */
    public KeyRepeatDemo() {
        super("KeyRepeatDemo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        input = container.getInput();
        input.enableKeyRepeat(300, 100);
    }

    /**
     * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) {
        g.drawString("Key Press Count: " + count, 100, 100);
        g.drawString("Press Space to Toggle Key Repeat", 100, 150);
        g.drawString("Key Repeat Enabled: " + input.isKeyRepeatEnabled(), 100, 200);
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
            AppGameContainer container = new AppGameContainer(new KeyRepeatDemo());
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
        count++;
        if (key == Input.KEY_SPACE) {
            if (input.isKeyRepeatEnabled()) {
                input.disableKeyRepeat();
            } else {
                input.enableKeyRepeat(300, 100);
            }
        }
    }

}
