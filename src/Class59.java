/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class59 {
	static RSString aClass19_1292 = null;
	static RSString aClass19_1293 = RSString.createRSString("Hidden)2use");
	static RSString aClass19_1294 = RSString.createRSString("mn");
	static int anInt1296;
	static RSString aClass19_1297;
	static RSString aClass19_1298 = RSString.createRSString("Bitte benutzen Sie eine andere Welt)3");
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array1301;
	private static RSString aClass19_1300 = RSString.createRSString("Please wait)3)3)3");

	static {
		Class59.aClass19_1297 = Class59.aClass19_1300;
	}

	static final void method446(int i, int i_0_, int i_1_, int i_2_, Class38_Sub20_Sub9_Sub3 class38_sub20_sub9_sub3, boolean bool) {
		try {
			if (bool != true)
				Class59.method450(false);
			int i_3_ = i * i + i_2_ * i_2_;
			if (i_3_ <= 4225 || i_3_ >= 90000)
				Class38_Sub20_Sub3_Sub5.method1159(-2011, i_1_, i_0_, i_2_, class38_sub20_sub9_sub3, i);
			else {
				int i_4_ = Class38_Sub20_Sub11.anInt2930 + Class21.anInt517 & 0x7ff;
				int i_5_ = Class38_Sub20_Sub9_Sub4.anIntArray3528[i_4_];
				i_5_ = i_5_ * 256 / (Class38_Sub7.anInt2027 + 256);
				int i_6_ = Class38_Sub20_Sub9_Sub4.anIntArray3520[i_4_];
				i_6_ = i_6_ * 256 / (Class38_Sub7.anInt2027 + 256);
				int i_7_ = i * i_5_ + i_2_ * i_6_ >> 16;
				int i_8_ = -(i * i_6_) + i_2_ * i_5_ >> 16;
				double d = Math.atan2(i_7_, i_8_);
				int i_9_ = (int) (Math.sin(d) * 63.0);
				int i_10_ = (int) (Math.cos(d) * 57.0);
				Class2.aClass38_Sub20_Sub9_Sub3_41.method1126(i_1_ + 94 - 6 + i_9_, i_0_ + 83 - i_10_ - 20, 20, 20, 15, 15, d, 256);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sf.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + (class38_sub20_sub9_sub3 != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	static final int method448(int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		try {
			int i_15_ = 65536 - Class38_Sub20_Sub9_Sub4.anIntArray3528[i_11_ * 1024 / i] >> 1;
			if (i_13_ <= 39)
				Class59.method446(-47, 14, -85, -90, null, false);
			return (i_15_ * i_12_ >> 16) + (i_14_ * (-i_15_ + 65536) >> 16);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sf.B(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')');
		}
	}

	public static void method450(boolean bool) {
		try {
			Class59.aClass38_Sub20_Sub9_Sub3Array1301 = null;
			Class59.aClass19_1297 = null;
			Class59.aClass19_1300 = null;
			if (bool != true)
				Class59.method446(-21, -59, -1, 107, null, true);
			Class59.aClass19_1298 = null;
			Class59.aClass19_1292 = null;
			Class59.aClass19_1293 = null;
			Class59.aClass19_1294 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sf.E(" + bool + ')');
		}
	}

	abstract void method447(byte[] is, byte i);

	abstract byte[] method449(byte i);
}
