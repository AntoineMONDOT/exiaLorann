package model.element.motionless;

public abstract class MotionlessElementFactory {
	
	private static final Bone Bone = new Bone();
	
	private static MotionlessElement[] motionlessElements = {
			Bone, };
	
	public static MotionlessElement createRock() {
		return Bone;
	}

	public static MotionlessElement[] getMotionlessElements() {
		return motionlessElements;
	}

	public static void setMotionlessElements(MotionlessElement[] motionlessElements) {
		MotionlessElementFactory.motionlessElements = motionlessElements;
	}
}