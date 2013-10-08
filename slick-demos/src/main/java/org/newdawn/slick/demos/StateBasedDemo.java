package org.newdawn.slick.demos;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * A Demo for the multi-state based functionality
 * <p/>
 *
 * @author kevin
 */
public class StateBasedDemo extends StateBasedGame {

    /**
     * Create a new Demo
     */
    public StateBasedDemo() {
        super("State Based Demo");
    }

    /**
     * @see org.newdawn.slick.state.StateBasedGame#initStatesList(org.newdawn.slick.GameContainer)
     */
    public void initStatesList(GameContainer container) {
        addState(new org.newdawn.slick.demos.states.DemoState1());
        addState(new org.newdawn.slick.demos.states.DemoState2());
        addState(new org.newdawn.slick.demos.states.DemoState3());
    }

    /**
     * Entry point to our Demo
     * <p/>
     *
     * @param argv The arguments to pass into the Demo
     */
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new StateBasedDemo());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
