package org.newdawn.slick.demos;

import org.newdawn.slick.*;

import java.util.ArrayList;

/**
 * A Demo of the font rendering capabilities
 * <p/>
 *
 * @author kevin
 */
public class FontPerformanceDemo extends BasicGame {

    /**
     * The font we're going to use to render
     */
    private AngelCodeFont font;

    /**
     * The Demo text
     */
    private String text = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin bibendum. Aliquam ac " +
            "sapien a elit congue iaculis. Quisque et justo quis mi mattis euismod. Donec elementum, " +
            "mi quis aliquet varius, nisi leo volutpat magna, quis ultricies eros augue at risus. Integer non magna " +
            "at lorem sodales molestie. Integer diam nulla, ornare sit amet, mattis quis, euismod et, " +
            "mauris. Proin eget tellus non nisl mattis laoreet. Nunc at nunc id elit pretium tempor. Duis vulputate, " +
            "nibh eget rhoncus eleifend, tellus lectus sollicitudin mi, rhoncus tincidunt nisi massa vitae ipsum. " +
            "Praesent tellus diam, luctus ut, eleifend nec, auctor et, orci. Praesent eu elit. Pellentesque ante " +
            "orci, volutpat placerat, ornare eget, cursus sit amet, eros. Duis pede sapien, euismod a, " +
            "volutpat pellentesque, convallis eu, mauris. Nunc eros. Ut eu risus et felis laoreet viverra. Curabitur " +
            "a metus.";

    /**
     * The text broken into lines
     */
    private ArrayList lines = new ArrayList();

    /**
     * True if the text is visible
     */
    private boolean visible = true;

    /**
     * Create a new Demo for font rendering
     */
    public FontPerformanceDemo() {
        super("Font Performance Demo");
    }

    /**
     * @see org.newdawn.slick.Game#init(org.newdawn.slick.GameContainer)
     */
    public void init(GameContainer container) throws SlickException {
        font = new AngelCodeFont("org/newdawn/slick/testdata/perffont.fnt", "org/newdawn/slick/testdata/perffont.png");

        for (int j = 0; j < 2; j++) {
            int lineLen = 90;
            for (int i = 0; i < text.length(); i += lineLen) {
                if (i + lineLen > text.length()) {
                    lineLen = text.length() - i;
                }

                lines.add(text.substring(i, i + lineLen));
            }
            lines.add("");
        }
    }

    /**
     * @see org.newdawn.slick.BasicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
     */
    public void render(GameContainer container, Graphics g) {
        g.setFont(font);

        if (visible) {
            for (int i = 0; i < lines.size(); i++) {
                font.drawString(10, 50 + (i * 20), (String) lines.get(i), i > 10 ? Color.red : Color.green);
            }
        }
    }

    /**
     * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
     */
    public void update(GameContainer container, int delta) throws SlickException {
    }

    /**
     * @see org.newdawn.slick.BasicGame#keyPressed(int, char)
     */
    public void keyPressed(int key, char c) {
        if (key == Input.KEY_ESCAPE) {
            System.exit(0);
        }
        if (key == Input.KEY_SPACE) {
            visible = !visible;
        }
    }

    /**
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments passed in the Demo
     */
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new FontPerformanceDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
