/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class61 {
	static volatile int anInt1322 = -1;
	RSString[] aClass19Array1323;
	int[] anIntArray1324;
	static Class26 aClass26_1325 = new Class26();
	int anInt1327 = -1;
	Class38_Sub20_Sub10 aClass38_Sub20_Sub10_1328;
	static Class83 aClass83_1329 = new Class83(50);
	static int[] anIntArray1330 = new int[50];
	static RSString aClass19_1331 = null;
	static int[] anIntArray1332;
	static int anInt1335;
	static int anInt1337 = -1;

	static final void method458(boolean bool, byte i, byte i_0_, int i_1_, int i_2_, Class17_Sub1 class17_sub1, int i_3_) {
		try {
			long l = i_1_ + (i_2_ << -1034773296);
			Class38_Sub20_Sub2 class38_sub20_sub2 = (Class38_Sub20_Sub2) Sequence.aClass14_2713.method75(l, (byte) -106);
			if (class38_sub20_sub2 == null) {
				class38_sub20_sub2 = (Class38_Sub20_Sub2) Class76.aClass14_1485.method75(l, (byte) -106);
				if (class38_sub20_sub2 == null) {
					class38_sub20_sub2 = (Class38_Sub20_Sub2) Class40.aClass14_914.method75(l, (byte) -106);
					if (i >= -105)
						Class61.anIntArray1330 = null;
					if (class38_sub20_sub2 != null) {
						if (bool) {
							class38_sub20_sub2.method707(false);
							Sequence.aClass14_2713.method80(true, l, class38_sub20_sub2);
							Class15.anInt291++;
							Class20.anInt502--;
						}
					} else {
						if (!bool) {
							class38_sub20_sub2 = (Class38_Sub20_Sub2) PlayerAppearance.aClass14_397.method75(l, (byte) -106);
							if (class38_sub20_sub2 != null)
								return;
						}
						class38_sub20_sub2 = new Class38_Sub20_Sub2();
						class38_sub20_sub2.aByte2542 = i_0_;
						class38_sub20_sub2.aClass17_Sub1_2544 = class17_sub1;
						class38_sub20_sub2.anInt2533 = i_3_;
						if (!bool) {
							Class61.aClass26_1325.method217(class38_sub20_sub2, 2048);
							Class40.aClass14_914.method80(true, l, class38_sub20_sub2);
							Class20.anInt502++;
						} else {
							Sequence.aClass14_2713.method80(true, l, class38_sub20_sub2);
							Class15.anInt291++;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sa.C(" + bool + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + (class17_sub1 != null ? "{...}" : "null") + ',' + i_3_ + ')');
		}
	}

	public static void method459(int i) {
		try {
			if (i != 0)
				Class61.method460(null, -65);
			Class61.anIntArray1332 = null;
			Client.str_huffman = null;
			Class61.aClass19_1331 = null;
			Class61.anIntArray1330 = null;
			Class61.aClass26_1325 = null;
			Class61.aClass83_1329 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sa.B(" + i + ')');
		}
	}

	static final void method460(Component component, int i) {
		do {
			try {
				component.removeMouseListener(Class38_Sub11.aClass10_2089);
				component.removeMouseMotionListener(Class38_Sub11.aClass10_2089);
				component.removeFocusListener(Class38_Sub11.aClass10_2089);
				Applet_Sub1.anInt3636 = 0;
				if (i == -1)
					break;
				Class61.anInt1337 = 29;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "sa.A(" + (component != null ? "{...}" : "null") + ',' + i + ')');
			}
			break;
		} while (false);
	}

	public Class61() {
		/* empty */
	}
}
