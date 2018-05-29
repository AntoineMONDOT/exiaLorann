package model.element.motionless;

import model.element.*;


abstract class MotionlessElement extends Element {
	
	MotionlessElement(final Sprite sprite, final Permeability permeability) {
		super(sprite, permeability);
	}
	
}