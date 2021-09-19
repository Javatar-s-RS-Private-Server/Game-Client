package com.javatar.jagex;/* Class38_Sub20_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub10 extends NodeSub {
	static RSString aClass19_2891;
	int anInt2892;
	RSString aClass19_2894;
	static RS2Buffer[] aClass38_Sub23Array2895 = new RS2Buffer[2048];
	int anInt2896;
	int anInt2897;
	int[] anIntArray2898;
	int anInt2900;
	RSString[] aClass19Array2901;
	static Class83 aClass83_2902;
	int[] anIntArray2903;
	static RSString aClass19_2904;
	static int[] anIntArray2905;
	static RSString aClass19_2907;
	static int anInt2908;
	static RSString aClass19_2909;
	static int anInt2910;
	static RSString aClass19_2911;
	static int[] anIntArray2912;

	static final void method976(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			if (i_1_ != -24253)
				Class38_Sub20_Sub10.anIntArray2912 = null;
			int i_6_ = -i_4_ + 2048 & 0x7ff;
			int i_7_ = i_2_;
			int i_8_ = -i + 2048 & 0x7ff;
			int i_9_ = 0;
			int i_10_ = 0;
			if (i_6_ != 0) {
				int i_11_ = Class38_Sub20_Sub9_Sub4.anIntArray3520[i_6_];
				int i_12_ = Class38_Sub20_Sub9_Sub4.anIntArray3528[i_6_];
				int i_13_ = i_12_ * i_9_ - i_7_ * i_11_ >> 501873168;
				i_7_ = i_11_ * i_9_ + i_7_ * i_12_ >> 275121392;
				i_9_ = i_13_;
			}
			if (i_8_ != 0) {
				int i_14_ = Class38_Sub20_Sub9_Sub4.anIntArray3520[i_8_];
				int i_15_ = Class38_Sub20_Sub9_Sub4.anIntArray3528[i_8_];
				int i_16_ = i_15_ * i_10_ + i_14_ * i_7_ >> -807062352;
				i_7_ = i_15_ * i_7_ - i_10_ * i_14_ >> -828206096;
				i_10_ = i_16_;
			}
			Class38_Sub18.anInt2209 = i_0_ - i_9_;
			Class11.anInt208 = i_3_ - i_10_;
			Class2.anInt30 = i_5_ - i_7_;
			Entity.anInt3464 = i;
			Class3.anInt44 = i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ud.G(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')');
		}
	}

	public static void method977(int i) {
		try {
			Class38_Sub20_Sub10.aClass19_2904 = null;
			Class38_Sub20_Sub10.aClass19_2891 = null;
			Class38_Sub20_Sub10.anIntArray2905 = null;
			Class38_Sub20_Sub10.aClass19_2907 = null;
			Class38_Sub20_Sub10.anIntArray2912 = null;
			Client.worldConnection = null;
			if (i == 22755) {
				Class38_Sub20_Sub10.aClass38_Sub23Array2895 = null;
				Class38_Sub20_Sub10.aClass83_2902 = null;
				Class38_Sub20_Sub10.aClass19_2909 = null;
				Class38_Sub20_Sub10.aClass19_2911 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ud.E(" + i + ')');
		}
	}

	static final int method978(int i, int i_17_, int i_18_, int i_19_, int i_20_, byte i_21_, int i_22_) {
		try {
			i_22_ &= 0x3;
			if ((i_18_ & 0x1) == 1) {
				int i_23_ = i_19_;
				i_19_ = i_17_;
				i_17_ = i_23_;
			}
			int i_24_ = 81 % ((-1 - i_21_) / 57);
			if (i_22_ == 0)
				return i_20_;
			if (i_22_ == 1)
				return i;
			if (i_22_ == 2)
				return -i_19_ + 1 + -i_20_ + 7;
			return -i_17_ + 1 - i + 7;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ud.F(" + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ')');
		}
	}

	public Class38_Sub20_Sub10() {
		/* empty */
	}

	static {
		Class38_Sub20_Sub10.aClass19_2891 = RSString.createRSString("Ung-Ultiges Anmelde)2Paket)3");
		Class38_Sub20_Sub10.aClass83_2902 = new Class83(50);
		Class38_Sub20_Sub10.aClass19_2904 = RSString.createRSString("Lade Texturen )2 ");
		Class38_Sub20_Sub10.aClass19_2907 = RSString.createRSString("scrollbar");
		Class38_Sub20_Sub10.anInt2908 = 7759444;
		Class38_Sub20_Sub10.aClass19_2909 = RSString.createRSString("::qa_op_test");
		Class38_Sub20_Sub10.anInt2910 = 0;
		Class38_Sub20_Sub10.aClass19_2911 = RSString.createRSString("<img=0>");
		Class38_Sub20_Sub10.anIntArray2912 = new int[] { 1, -1, -1, 1 };
	}
}
