package org.newdawn.slick.demos;

import org.newdawn.slick.*;

/**
 * A Demo for big images used as sprites sheets
 * <p/>
 *
 * @author kevin
 */
public class BigSpriteSheetDemo extends BasicGame {

    /**
     * The original 1024x768 image loaded
     */
    private Image original;

    /**
     * A sprite sheet made from the big image
     */
    private SpriteSheet bigSheet;

    /**
     * True if we should use the old method
     */
    private boolean oldMethod = true;

    /**
     * Create a new image rendering Demo
     */
    public BigSpriteSheetDemo() {
        super("Big SpriteSheet Demo");
    }

    /**
     * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        original = new BigImage("org/newdawn/slick/testdata/bigimage.tga", Image.FILTER_NEAREST, 256);
        bigSheet = new SpriteSheet(original, 16, 16);
    }

    /**
     * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) {
        if (oldMethod) {
            for (int x = 0; x < 43; x++) {
                for (int y = 0; y < 27; y++) {
                    bigSheet.getSprite(x, y).draw(10 + (x * 18), 50 + (y * 18));
                }
            }
        } else {
            bigSheet.startUse();
            for (int x = 0; x < 43; x++) {
                for (int y = 0; y < 27; y++) {
                    bigSheet.renderInUse(10 + (x * 18), 50 + (y * 18), x, y);
                }
            }
            bigSheet.endUse();
        }

        g.drawString("Press space to toggle rendering method", 10, 30);

        container.getDefaultFont().drawString(10, 100, "Demo");
    }

    /**
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments to pass into the Demo
     */
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new BigSpriteSheetDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    /**
     * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
     */
    public void update(GameContainer container, int delta) throws SlickException {
        if (container.getInput().isKeyPressed(Input.KEY_SPACE)) {
            oldMethod = !oldMethod;
        }
    }

}
