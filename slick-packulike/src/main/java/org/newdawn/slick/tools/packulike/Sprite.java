package org.newdawn.slick.tools.packulike;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * A simple sprite holder that allows the tool to name images
 * <p>
 * @author kevin
 */
public class Sprite {

	/**
	 * The name of the sprite
	 */
	private String name;

	/**
	 * The x position of the sprite
	 */
	private int x;

	/**
	 * The y position of the sprite
	 */
	private int y;

	/**
	 * The width of the sprite
	 */
	private int width;

	/**
	 * The y position of the sprite
	 */
	private int height;

	/**
	 * The image for the sprite
	 */
	private BufferedImage image;

	/**
	 * Create a sprite based on a file
	 * <p>
	 * @param file The file containing the sprite image
	 * <p>
	 * @throws IOException Indicates a failure to load the image from the given file
	 */
	public Sprite(File file) throws IOException {
		this(file.getName(), ImageIO.read(file));
	}

	/**
	 * Create a new sprite
	 * <p>
	 * @param name The name of the sprite
	 * @param image The image stored
	 */
	public Sprite(String name, BufferedImage image) {
		this.name = name;
		this.image = image;
		this.width = image.getWidth();
		this.height = image.getHeight();
	}

	/**
	 * Set the position within the sheet of this sprite
	 * <p>
	 * @param x The x position of the sprite
	 * @param y The y position of the sprite
	 */
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Get the name of this sprite
	 * <p>
	 * @return The name of this sprite
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the x position of this sprite within the sheet
	 * <p>
	 * @return The x position of this sprite within the sheet
	 */
	public int getX() {
		return x;
	}

	/**
	 * Get the y position of this sprite within the sheet
	 * <p>
	 * @return The y position of this sprite within the sheet
	 */
	public int getY() {
		return y;
	}

	/**
	 * Get the width of this sprite within the sheet
	 * <p>
	 * @return The width of this sprite within the sheet
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Get the height of this sprite within the sheet
	 * <p>
	 * @return The height of this sprite within the sheet
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Get the image of this sprite
	 * <p>
	 * @return The image of this sprite
	 */
	public BufferedImage getImage() {
		return image;
	}

	/**
	 * Check if this sprite location contains the given x,y position
	 * <p>
	 * @param xp The x position of the sprite
	 * @param yp The y position of the sprite
	 * <p>
	 * @return True if the sprite contains the point
	 */
	public boolean contains(int xp, int yp) {
		if (xp < x) {
			return false;
		}
		if (yp < y) {
			return false;
		}
		if (xp >= x + width) {
			return false;
		}
		if (yp >= y + height) {
			return false;
		}

		return true;
	}

}
