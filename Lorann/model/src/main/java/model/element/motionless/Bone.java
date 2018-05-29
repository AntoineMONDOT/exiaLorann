package model.element.motionless;

import model.element.*;


class Bone extends MotionlessElement {
	
	private static final Sprite SPRITE = new Sprite ('O', "bone.png");
	
	Bone() {
		super(SPRITE, Permeability.BLOCKING);
	}
}