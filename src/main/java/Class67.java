/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class67 {
	private static RSString aClass19_1377;
	static int[] anIntArray1378;
	static RSString aClass19_1379;
	static int anInt1380 = 0;
	static Class38_Sub6 aClass38_Sub6_1381;
	static Class17_Sub1 aClass17_Sub1_1382;
	static RSString aClass19_1384;
	static int[] anIntArray1385;
	static RSString aClass19_1386;
	static int[] anIntArray1387;
	private static RSString aClass19_1389;
	static RSString aClass19_1391;
	static RSString aClass19_1392;

	static final int method477(byte i, int i_0_, byte[] is) {
		try {
			if (i < 109)
				Class67.anIntArray1378 = null;
			return Class38_Sub8.method657(i_0_, 0, 25274, is);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "rf.B(" + i + ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	static final void method478(int i, int i_1_, int i_2_) {
		try {
			if (Class72.anInt1417 >= 2 || Class42.anInt964 != 0 || Class26.aBool614) {
				RSString class19;
				if (i_2_ == (Class42.anInt964 ^ 0xffffffff) && Class72.anInt1417 < 2)
					class19 = Class9.method43(new RSString[] { Class38_Sub10_Sub3.aClass19_2836, Class77.aClass19_1510, Class38_Sub2.aClass19_1759, Class37.aClass19_870 }, (byte) -20);
				else if (!Class26.aBool614 || Class72.anInt1417 >= 2)
					class19 = NPC.method1204(true, Class72.anInt1417 - 1);
				else
					class19 = Class9.method43(new RSString[] { Class30.aClass19_736, Class77.aClass19_1510, Class53.aClass19_1168, Class37.aClass19_870 }, (byte) -20);
				if (Class72.anInt1417 > 2)
					class19 = Class9.method43(new RSString[] { class19, Class38_Sub20_Sub8.aClass19_2865, RuntimeException_Sub1.method1098(Class72.anInt1417 - 2, i_2_ + 2), Class74.aClass19_1453 }, (byte) -20);
				Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1071(class19, i_1_ + 4, i + 15, 16777215, 0, Class45.anInt1016 / 1000);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "rf.C(" + i + ',' + i_1_ + ',' + i_2_ + ')');
		}
	}

	static final RSString method479(int i, int i_3_, int i_4_, boolean bool) {
		try {
			if (i < 1 || i > 36)
				i = 10;
			int i_5_ = 1;
			int i_6_ = i_4_ / i;
			while (i_6_ != 0) {
				i_6_ /= i;
				i_5_++;
			}
			int i_7_ = i_5_;
			if (i_4_ < 0 || bool)
				i_7_++;
			byte[] is = new byte[i_7_];
			if (i_4_ >= 0) {
				if (bool)
					is[0] = (byte) 43;
			} else
				is[0] = (byte) 45;
			for (int i_8_ = i_3_; i_8_ < i_5_; i_8_++) {
				int i_9_ = i_4_ % i;
				i_4_ /= i;
				if (i_9_ < 0)
					i_9_ = -i_9_;
				if (i_9_ > 9)
					i_9_ += 39;
				is[i_7_ - i_8_ - 1] = (byte) (i_9_ + 48);
			}
			RSString class19 = new RSString();
			class19.anInt478 = i_7_;
			class19.buffer = is;
			return class19;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "rf.D(" + i + ',' + i_3_ + ',' + i_4_ + ',' + bool + ')');
		}
	}

	public static void method480(byte i) {
		try {
			Class67.aClass19_1389 = null;
			Class67.aClass19_1384 = null;
			Class67.aClass19_1386 = null;
			Class67.aClass19_1377 = null;
			Class67.anIntArray1378 = null;
			Class67.aClass38_Sub6_1381 = null;
			Class67.aClass19_1379 = null;
			if (i != 54)
				Class67.method478(-79, -109, 126);
			Class67.anIntArray1387 = null;
			Class67.aClass17_Sub1_1382 = null;
			Class67.aClass19_1391 = null;
			Class67.anIntArray1385 = null;
			Class67.aClass19_1392 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "rf.A(" + i + ')');
		}
	}

	static {
		Class67.aClass19_1377 = RSString.createRSString("FULL");
		Class67.aClass38_Sub6_1381 = null;
		Class67.anIntArray1378 = new int[5];
		Class67.aClass19_1389 = RSString.createRSString("scroll:");
		Class67.anIntArray1387 = new int[100];
		Class67.aClass19_1379 = Class67.aClass19_1389;
		Class67.aClass19_1386 = Class67.aClass19_1389;
		Class67.aClass19_1384 = Class67.aClass19_1377;
		Class67.aClass19_1392 = RSString.createRSString("Angreifen");
		Class67.aClass19_1391 = RSString.createRSString("M");
	}
}
