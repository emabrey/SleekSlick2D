package org.newdawn.slick.demos;

import org.newdawn.slick.*;
import org.newdawn.slick.loading.DeferredResource;
import org.newdawn.slick.loading.LoadingList;

import java.io.IOException;

/**
 * A Demo for deferred loading. Each of the resources is requested then the loading list is cycled to actual perform the
 * resource allowing the rendering to be performed in between
 * <p/>
 *
 * @author kevin
 */
public class DeferredLoadingDemo extends BasicGame {

    /**
     * The music that will be played on load completion
     */
    private Music music;

    /**
     * The sound that will be played on load completion
     */
    private Sound sound;

    /**
     * The image that will be shown on load completion
     */
    private Image image;

    /**
     * The font that will be rendered on load completion
     */
    private Font font;

    /**
     * The next resource to load
     */
    private DeferredResource nextResource;

    /**
     * True if we've loaded all the resources and started rendereing
     */
    private boolean started;

    /**
     * Create a new image rendering Demo
     */
    public DeferredLoadingDemo() {
        super("Deferred Loading Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        LoadingList.setDeferredLoading(true);

        new Sound("org/newdawn/slick/testdata/cbrown01.wav");
        new Sound("org/newdawn/slick/testdata/engine.wav");
        sound = new Sound("org/newdawn/slick/testdata/restart.ogg");
        new Music("org/newdawn/slick/testdata/testloop.ogg");
        music = new Music("org/newdawn/slick/testdata/SMB-X.XM");

        new Image("org/newdawn/slick/testdata/cursor.png");
        new Image("org/newdawn/slick/testdata/cursor.tga");
        new Image("org/newdawn/slick/testdata/cursor.png");
        new Image("org/newdawn/slick/testdata/cursor.png");
        new Image("org/newdawn/slick/testdata/dungeontiles.gif");
        new Image("org/newdawn/slick/testdata/logo.gif");
        image = new Image("org/newdawn/slick/testdata/logo.tga");
        new Image("org/newdawn/slick/testdata/logo.png");
        new Image("org/newdawn/slick/testdata/rocket.png");
        new Image("org/newdawn/slick/testdata/testpack.png");

        font = new AngelCodeFont("org/newdawn/slick/testdata/demo.fnt", "org/newdawn/slick/testdata/demo_00.tga");
    }

    /**
     * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) {
        if (nextResource != null) {
            g.drawString("Loading: " + nextResource.getDescription(), 100, 100);
        }

        int total = LoadingList.get().getTotalResources();
        int loaded = LoadingList.get().getTotalResources() - LoadingList.get().getRemainingResources();

        float bar = loaded / (float) total;
        g.fillRect(100, 150, loaded * 40, 20);
        g.drawRect(100, 150, total * 40, 20);

        if (started) {
            image.draw(100, 200);
            font.drawString(100, 500, "LOADING COMPLETE");
        }
    }

    /**
     * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
     */
    public void update(GameContainer container, int delta) throws SlickException {
        if (nextResource != null) {
            try {
                nextResource.load();
                // slow down loading for example purposes
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            } catch (IOException e) {
                throw new SlickException("Failed to load: " + nextResource.getDescription(), e);
            }

            nextResource = null;
        }

        if (LoadingList.get().getRemainingResources() > 0) {
            nextResource = LoadingList.get().getNext();
        } else {
            if (!started) {
                started = true;
                music.loop();
                sound.play();
            }
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
            AppGameContainer container = new AppGameContainer(new DeferredLoadingDemo());
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
    }

}
