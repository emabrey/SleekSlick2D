package org.newdawn.slick.demos;

import org.newdawn.slick.*;

/**
 * Demo to view the effects of antialiasing on cirles
 * <p/>
 *
 * @author kevin
 */
public class AntiAliasDemo extends BasicGame {

    /**
     * Create the Demo
     */
    public AntiAliasDemo() {
        super("AntiAlias Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        container.getGraphics().setBackground(Color.green);
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
        g.setAntiAlias(true);
        g.setColor(Color.red);
        g.drawOval(100, 100, 100, 100);
        g.fillOval(300, 100, 100, 100);
        g.setAntiAlias(false);
        g.setColor(Color.red);
        g.drawOval(100, 300, 100, 100);
        g.fillOval(300, 300, 100, 100);
    }

    /**
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments passed to the Demo
     */
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new AntiAliasDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
