package org.newdawn.slick.demos.xml;

import java.util.ArrayList;

/**
 * The top level node of our Demo structure for XML -> object parsing
 * <p/>
 *
 * @author kevin
 */
public class GameData {

    /**
     * The list of entities added
     */
    private ArrayList entities = new ArrayList();

    /**
     * Called by XML parser to add a configured entity to the GameData
     * <p/>
     *
     * @param entity The entity to be added
     */
    private void add(Entity entity) {
        entities.add(entity);
    }

    /**
     * Dump this object to sysout
     * <p/>
     *
     * @param prefix The prefix to apply to all lines
     */
    public void dump(String prefix) {
        System.out.println(prefix + "GameData");
        for (int i = 0; i < entities.size(); i++) {
            ((Entity) entities.get(i)).dump(prefix + "\t");
        }
    }

}
