package org.newdawn.slick.util;

import java.io.InputStream;
import java.net.URL;

/**
 * A location from which resources can be loaded
 * <p/>
 *
 * @author kevin
 */
public interface ResourceLocation {

    /**
     * Get a resource as an input stream
     * <p/>
     *
     * @param ref The reference to the resource to retrieve
     *            <p/>
     *
     * @return A stream from which the resource can be read or null if the resource can't be found in this location
     */
    public InputStream getResourceAsStream(String ref);

    /**
     * Get a resource as a URL
     * <p/>
     *
     * @param ref The reference to the resource to retrieve
     *            <p/>
     *
     * @return A URL from which the resource can be read
     */
    public URL getResource(String ref);

}
