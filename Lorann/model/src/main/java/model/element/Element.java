package model.element;

import java.awt.Image;

public abstract class Element implements IElement {
	
	private Sprite sprite;
	
	private Permeability permeability;
	
	public Element(final Sprite sprite, final Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	public Permeability getPermeability() {
		return permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	public Sprite getSprite() {
		return sprite;
	}

	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public final Image getImage() {
		return this.getSprite().getImage();
	}
}