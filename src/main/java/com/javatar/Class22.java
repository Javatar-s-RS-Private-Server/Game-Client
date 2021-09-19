package com.javatar;/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class22 {
	static RSString aClass19_531;
	static int[] anIntArray536 = new int[100];
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array539;
	static RSString aClass19_540;
	private static RSString aClass19_529 = RSString.createRSString("Please wait 1 minute and try again)3");
	static RSString aClass19_532 = Class22.aClass19_529;
	static RSString aClass19_533 = Class22.aClass19_529;
	private static RSString aClass19_537;

	static {
		client.lastCoordY = 0;
		Class22.aClass19_537 = RSString.createRSString("Take");
		Class22.aClass19_540 = RSString.createRSString("leuchten3:");
		Class22.aClass19_531 = Class22.aClass19_537;
	}

	static final RSString method195(int i, int i_0_) {
		try {
			if (i > -98)
				Class22.aClass19_537 = null;
			return Class9.method43(new RSString[] { RuntimeException_Sub1.method1098(i_0_ >> 24 & 0xff, 0), Class78.aClass19_1544, RuntimeException_Sub1.method1098((i_0_ & 0xff3827) >> 16, 0), Class78.aClass19_1544, RuntimeException_Sub1.method1098(i_0_ >> 8 & 0xff, 0), Class78.aClass19_1544, RuntimeException_Sub1.method1098(i_0_ & 0xff, 0) }, (byte) -20);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "df.A(" + i + ',' + i_0_ + ')');
		}
	}

	static final boolean method196(int i) {
		try {
			if (Class38_Sub14.aBoolArray2142[i])
				return true;
			if (-18020 != -18020)
				Class22.method195(-22, -52);
			if (!Class25.aClass17_589.method106(i, 24624))
				return false;
			int i_2_ = Class25.aClass17_589.method103(i);
			if (i_2_ == 0) {
				Class38_Sub14.aBoolArray2142[i] = true;
				return true;
			}
			if (Class62.aClass38_Sub6ArrayArray1339[i] == null)
				Class62.aClass38_Sub6ArrayArray1339[i] = new Class38_Sub6[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				if (Class62.aClass38_Sub6ArrayArray1339[i][i_3_] == null) {
					byte[] is = Class25.aClass17_589.method109(i, i_3_, -121);
					if (is != null) {
						Class62.aClass38_Sub6ArrayArray1339[i][i_3_] = new Class38_Sub6();
						Class62.aClass38_Sub6ArrayArray1339[i][i_3_].anInt1856 = (i << 16) + i_3_;
						if (is[0] != -1)
							Class62.aClass38_Sub6ArrayArray1339[i][i_3_].method643(new RS2Buffer(is));
						else
							Class62.aClass38_Sub6ArrayArray1339[i][i_3_].method646(new RS2Buffer(is));
					}
				}
			Class38_Sub14.aBoolArray2142[i] = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "df.B(" + i + ',' + -18020 + ')');
		}
	}

	static final boolean method197(int i, Class17 class17, int i_4_, int i_5_) {
		try {
			if (i_4_ != -308039560)
				return false;
			byte[] is = class17.method109(i, i_5_, i_4_ + 308039462);
			if (is == null)
				return false;
			Canvas_Sub1.method810(is);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "df.C(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ + ')');
		}
	}

	public static void method198(int i) {
		try {
			if (i == -7798) {
				Class22.aClass19_533 = null;
				Class22.aClass19_532 = null;
				Class22.aClass38_Sub20_Sub9_Sub3Array539 = null;
				Class22.anIntArray536 = null;
				Class22.aClass19_529 = null;
				Class22.aClass19_540 = null;
				Class22.aClass19_531 = null;
				Class22.aClass19_537 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "df.D(" + i + ')');
		}
	}
}
