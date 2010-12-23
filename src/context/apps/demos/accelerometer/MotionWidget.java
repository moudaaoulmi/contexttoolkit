package context.apps.demos.accelerometer;

import context.arch.storage.Attribute;
import context.arch.widget.Widget;

public class MotionWidget extends Widget {
	
	public static final String CLASSNAME = MotionWidget.class.getName();
	
	public static final String MOTION = "MOTION";

	public MotionWidget() {
		super(CLASSNAME + '_' + "userId", CLASSNAME);
	}

	@Override
	protected void init() {
		// non-constant attributes
		addAttribute(Attribute.instance(MOTION, String.class));

		// constant attributes
		// none
	}

}
