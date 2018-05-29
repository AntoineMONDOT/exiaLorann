package model.element;

import java.awt.Image;

public class Sprite {
	
	private Image image;
	
	private String imageName;
	
	private char consoleImage;
	
	private boolean ImageLoaded;
	
	public Sprite(final char character, final String imagename) {
		this.setConsoleImage(character);
		this.setImageName(imageName);
	}
	
	public Sprite(final char character) {
		this(character, "noimage.jpg");
	}

	public Image getImage() {
		return image;
	}

	public final String getImageName() {
		return this.imageName;
	}
	
	private void setImageName(final String imageName) {
		this.imageName = imageName;
	}
	
	public final char getConsoleImage() {
		return this.consoleImage;
	}

	private void setConsoleImage(char consoleImage) {
		this.consoleImage = consoleImage;
	}

	public final boolean isImageLoaded() {
		return this.ImageLoaded;
	}

	public final void setImageLoaded(final boolean imageLoaded) {
		this.ImageLoaded = imageLoaded;
	}
}