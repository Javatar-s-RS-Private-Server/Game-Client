/* Class77_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class77_Sub2 extends Class77 {
	private static Interface1 anInterface1_2346;
	private int anInt2347;

	@Override
	final int method558() {
		return Class77_Sub2.anInterface1_2346.method1(-28168, anInt2347);
	}

	@Override
	final void method555() {
		Class77_Sub2.anInterface1_2346.method5(anInt2347, ((Class77) this).anIntArray1515);
	}

	public static void method724() {
		Class77_Sub2.anInterface1_2346 = null;
	}

	@Override
	final void method553(Component component) throws Exception {
		Class77_Sub2.anInterface1_2346.method3(Class38_Sub20_Sub7.anInt2852, component, 11872, Class37.aBool880);
	}

	@Override
	final void method561() {
		Class77_Sub2.anInterface1_2346.method4(-28095, anInt2347);
	}

	@Override
	final void method554(int i) throws Exception {
		if (i > 32768)
			throw new IllegalArgumentException();
		Class77_Sub2.anInterface1_2346.method2(anInt2347, i, 68);
	}

	@Override
	final void method560() {
		Class77_Sub2.anInterface1_2346.method6((byte) 103, anInt2347);
	}

	Class77_Sub2(Class56 class56, int i) {
		Class77_Sub2.anInterface1_2346 = class56.method432(-945);
		anInt2347 = i;
	}
}
