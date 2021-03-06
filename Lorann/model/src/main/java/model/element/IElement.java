package model.element;

import showboard.ISquare;

public interface IElement extends ISquare {
	
	Sprite getSprite();
	
	Permeability getPermeability();
}