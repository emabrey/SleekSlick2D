package org.newdawn.slick.demos;

import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.util.Log;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Quick Demo to confirm canvas size is reported correctly
 * <p/>
 *
 * @author kevin
 */
public class CanvasSizeDemo extends BasicGame {

    /**
     * Create Demo
     */
    public CanvasSizeDemo() {
        super("Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        System.out.println(container.getWidth() + ", " + container.getHeight());
    }

    /**
     * @see org.newdawn.slick.Game#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) throws SlickException {
    }

    /**
     * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
     */
    public void update(GameContainer container, int delta) throws SlickException {
    }

    /**
     * Entry point to the Demo
     * <p/>
     *
     * @param args The command line arguments passed in (none honoured)
     */
    public static void main(String[] args) {
        try {
            CanvasGameContainer container = new CanvasGameContainer(new CanvasSizeDemo());
            container.setSize(640, 480);
            Frame frame = new Frame("Demo");
            frame.setLayout(new GridLayout(1, 2));
            frame.add(container);
            frame.pack();
            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }

            });
            frame.setVisible(true);

            container.start();
        } catch (Exception e) {
            Log.error(e);
        }
    }

}
