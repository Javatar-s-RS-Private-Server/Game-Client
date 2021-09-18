/* Class32_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class Class32_Sub1 extends Class32 implements MouseWheelListener {
	private int anInt2348 = 0;

	@Override
	final void method295(Component component, boolean bool) {
		if (bool)
			method297((byte) 14);
		component.removeMouseWheelListener(this);
	}

	@Override
	public final synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		anInt2348 += mousewheelevent.getWheelRotation();
	}

	@Override
	final void method299(int i, Component component) {
		component.addMouseWheelListener(this);
		if (i <= 95)
			method295(null, false);
	}

	@Override
	final synchronized int method297(byte i) {
		int i_0_ = anInt2348;
		anInt2348 = 0;
		if (i != 12)
			method299(-117, null);
		return i_0_;
	}
}
