package org.newdawn.slick.demos;

import org.newdawn.slick.*;

/**
 * A Demo to Demonstrate world clipping as opposed to screen clipping
 * <p/>
 *
 * @author kevin
 */
public class AlphaMapDemo extends BasicGame {

    /**
     * The alpha map being applied
     */
    private Image alphaMap;

    /**
     * The texture to apply over the top
     */
    private Image textureMap;

    /**
     * Create a new tester for the clip plane based clipping
     */
    public AlphaMapDemo() {
        super("AlphaMap Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        alphaMap = new Image("org/newdawn/slick/testdata/alphamap.png");
        textureMap = new Image("org/newdawn/slick/testdata/grass.png");
        container.getGraphics().setBackground(Color.black);
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
        g.clearAlphaMap();
        g.setDrawMode(Graphics.MODE_NORMAL);
        textureMap.draw(10, 50);
        g.setColor(Color.red);
        g.fillRect(290, 40, 200, 200);
        g.setColor(Color.white);
        // write only alpha
        g.setDrawMode(Graphics.MODE_ALPHA_MAP);
        alphaMap.draw(300, 50);
        g.setDrawMode(Graphics.MODE_ALPHA_BLEND);
        textureMap.draw(300, 50);
        g.setDrawMode(Graphics.MODE_NORMAL);
    }

    /**
     * @see org.newdawn.slick.BasicGame#keyPressed(int, char)
     */
    public void keyPressed(int key, char c) {
    }

    /**
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments to pass into the Demo
     */
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new AlphaMapDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
