/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Method;

final class Class9 {
	static RSString aClass19_150;
	private static RSString aClass19_151;
	static Player[] aClass38_Sub20_Sub3_Sub7_Sub2Array152 = new Player[2048];
	static RSString aClass19_153;
	static int anInt154 = 0;
	static RSString aClass19_155;
	static RSString aClass19_156;
	private static RSString aClass19_158;
	static RSString aClass19_159;

	static final RSString method43(RSString[] class19s, byte i) {
		try {
			if (i != -20)
				Class9.anInt154 = -63;
			if (class19s.length < 2)
				throw new IllegalArgumentException();
			return Class24.method206(class19s, class19s.length, 0, (byte) -126);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hc.A(" + (class19s != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method44(Component component, int i) {
		try {
			if (i == -24436) {
				Method method = Class56.aMethod1236;
				if (method != null)
					try {
						method.invoke(component, new Object[] { Boolean.FALSE });
					} catch (Throwable throwable) {
						/* empty */
					}
				component.addKeyListener(Class38_Sub11.aClass60_2099);
				component.addFocusListener(Class38_Sub11.aClass60_2099);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hc.E(" + (component != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method45(byte i) {
		try {
			Class9.aClass19_153 = null;
			Class9.aClass19_156 = null;
			Class9.aClass19_150 = null;
			Class9.aClass19_158 = null;
			Class9.aClass19_155 = null;
			int i_0_ = 123 % ((i + 14) / 63);
			Class9.aClass19_151 = null;
			Class9.aClass19_159 = null;
			Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hc.H(" + i + ')');
		}
	}

	static final void method46(int i, Class17_Sub1 class17_sub1, int i_1_) {
		try {
			if (i_1_ != 20538)
				Class9.method46(-104, null, -69);
			if (Class72.aClass38_Sub23_1414 != null) {
				Class72.aClass38_Sub23_1414.pos = i * 8 + 5;
				int i_2_ = Class72.aClass38_Sub23_1414.method759(true);
				int i_3_ = Class72.aClass38_Sub23_1414.method759(true);
				class17_sub1.method598(i_3_, i_2_, i_1_ - 3756);
			} else {
				Class61.method458(true, (byte) -109, (byte) 0, 255, 255, null, 0);
				Class28.aClass17_Sub1Array695[i] = class17_sub1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hc.D(" + i + ',' + (class17_sub1 != null ? "{...}" : "null") + ',' + i_1_ + ')');
		}
	}

	static final int method47(int i, int i_4_, int i_5_) {
		try {
			Class38_Sub3 class38_sub3 = (Class38_Sub3) Class38_Sub20_Sub8.aClass14_2863.method75(i_4_, (byte) -106);
			if (class38_sub3 == null)
				return 0;
			if (i_5_ < 0 || class38_sub3.anIntArray1779.length <= i_5_)
				return 0;
			if (i >= -1)
				Class9.method48((byte) -83);
			return class38_sub3.anIntArray1779[i_5_];
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hc.I(" + i + ',' + i_4_ + ',' + i_5_ + ')');
		}
	}

	static final synchronized long method48(byte i) {
		try {
			long l = System.currentTimeMillis();
			if (l < Class51.aLong1128)
				Class38_Sub1.aLong1745 += Class51.aLong1128 - l;
			Class51.aLong1128 = l;
			if (i >= -29)
				Class9.method43(null, (byte) 70);
			return Class38_Sub1.aLong1745 + l;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hc.F(" + i + ')');
		}
	}

	static final Class38_Sub20_Sub9_Sub2 method49(int i, Class17 class17, int i_6_) {
		try {
			if (!PacketBuffer.method791(class17, i_6_, (byte) 61))
				return null;
			if (i != -7450)
				Class9.aClass19_159 = null;
			return Class44.method368(0);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hc.G(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + i_6_ + ')');
		}
	}

	static final void method50(byte i, Class17 class17) {
		try {
			int i_7_ = -84 % ((-54 - i) / 60);
			Class41.aClass17_933 = class17;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hc.C(" + i + ',' + (class17 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method51(int i) {
		try {
			if (i == 0)
				Class82.aClass83_1641.method596(i + 33);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hc.B(" + i + ')');
		}
	}

	static {
		Class9.aClass19_151 = RSString.createRSString("Login server offline)3");
		Class9.aClass19_156 = RSString.createRSString("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");
		Class9.aClass19_155 = RSString.createRSString("cross");
		Class9.aClass19_153 = Class9.aClass19_151;
		Class9.aClass19_158 = RSString.createRSString("Loaded title screen");
		Class9.aClass19_159 = Class9.aClass19_158;
		Class9.aClass19_150 = RSString.createRSString("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");
	}
}
