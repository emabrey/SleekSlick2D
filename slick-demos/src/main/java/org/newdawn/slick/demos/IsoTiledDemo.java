package org.newdawn.slick.demos;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;
import org.newdawn.slick.util.Bootstrap;

/**
 * Simple Demo for isometric map rendering
 * <p/>
 *
 * @author kevin
 */
public class IsoTiledDemo extends BasicGame {

    /**
     * The tilemap we're going to render
     */
    private TiledMap tilemap;

    /**
     * Create a new Demo
     */
    public IsoTiledDemo() {
        super("Isometric Tiled Map Demo");
    }

    /*
     * (non-Javadoc)
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        tilemap = new TiledMap("org/newdawn/slick/testdata/isoexample.tmx", "org/newdawn/slick/testdata/");
    }

    /*
     * (non-Javadoc)
     * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
     */
    public void update(GameContainer container, int delta) throws SlickException {
    }

    /*
     * (non-Javadoc)
     * @see org.newdawn.slick.Game#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) throws SlickException {
        tilemap.render(350, 150);
    }

    /**
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments passed in from the command line
     */
    public static void main(String[] argv) {
        Bootstrap.runAsApplication(new IsoTiledDemo(), 800, 600, false);
    }

}
