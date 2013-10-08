package org.newdawn.slick.demos;

import org.newdawn.slick.*;
import org.newdawn.slick.particles.ConfigurableEmitter;
import org.newdawn.slick.particles.ParticleIO;
import org.newdawn.slick.particles.ParticleSystem;

import java.io.IOException;

/**
 * A Demo for loading editing particle systems
 * <p/>
 *
 * @author kevin
 */
public class PedigreeDemo extends BasicGame {

    /**
     * The image we're currently displaying
     */
    private Image image;

    /**
     * The game container
     */
    private GameContainer container;

    /**
     * The smoke trail particle system
     */
    private ParticleSystem trail;

    /**
     * The fire particle system
     */
    private ParticleSystem fire;

    /**
     * The rocket x position
     */
    private float rx;

    /**
     * The rocket y position
     */
    private float ry = 900;

    /**
     * Create a new image rendering Demo
     */
    public PedigreeDemo() {
        super("Pedigree Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        this.container = container;

        try {
            fire = ParticleIO.loadConfiguredSystem("org/newdawn/slick/testdata/system.xml");
            trail = ParticleIO.loadConfiguredSystem("org/newdawn/slick/testdata/smoketrail.xml");

        } catch (IOException e) {
            throw new SlickException("Failed to load particle systems", e);
        }
        image = new Image("org/newdawn/slick/testdata/rocket.png");

        spawnRocket();
    }

    /**
     * Spawn a Demo rocket
     */
    private void spawnRocket() {
        ry = 700;
        rx = (float) ((Math.random() * 600) + 100);
    }

    /**
     * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) {
        ((ConfigurableEmitter) trail.getEmitter(0)).setPosition(rx + 14, ry + 35);
        trail.render();
        image.draw((int) rx, (int) ry);

        g.translate(400, 300);
        fire.render();
    }

    /**
     * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
     */
    public void update(GameContainer container, int delta) {
        fire.update(delta);
        trail.update(delta);

        ry -= delta * 0.25f;
        if (ry < -100) {
            spawnRocket();
        }
    }

    public void mousePressed(int button, int x, int y) {
        super.mousePressed(button, x, y);

        for (int i = 0; i < fire.getEmitterCount(); i++) {
            ((ConfigurableEmitter) fire.getEmitter(i)).setPosition(x - 400, y - 300, true);
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
            AppGameContainer container = new AppGameContainer(new PedigreeDemo());
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
        if (key == Input.KEY_ESCAPE) {
            container.exit();
        }
    }

}
