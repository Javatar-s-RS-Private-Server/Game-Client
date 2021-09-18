/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class30 {
	static RSString[] aClass19Array716;
	static short[] aShortArray724;
	static byte[][] aByteArrayArray727;
	static Class17_Sub1 indexModels;
	static RSString aClass19_731;
	static RSString aClass19_736;
	private static RSString aClass19_709;
	private static RSString aClass19_710;
	private static RSString aClass19_711;
	private static RSString aClass19_713;
	private static RSString aClass19_715 = RSString.createRSString("Sep");
	private static RSString aClass19_717;
	private static RSString aClass19_720;
	private static RSString aClass19_721;
	private static RSString aClass19_722;
	private static RSString aClass19_723;
	private static RSString aClass19_733;
	private static RSString aClass19_734;
	private static RSString aClass19_735;

	static {
		Class30.aClass19_710 = RSString.createRSString("Oct");
		Class30.aClass19_713 = RSString.createRSString("May");
		Class30.aClass19_717 = RSString.createRSString("Aug");
		Class30.aClass19_722 = RSString.createRSString("Invalid loginserver requested)3");
		Class30.aShortArray724 = new short[] { 6798, 8741, 25238, 4626, 4550 };
		Class30.aClass19_709 = RSString.createRSString("Jun");
		Class30.aClass19_723 = RSString.createRSString("Apr");
		Class30.aClass19_711 = RSString.createRSString("Nov");
		Class30.aClass19_721 = RSString.createRSString("Feb");
		Class30.aClass19_720 = RSString.createRSString("Jul");
		Class30.aClass19_731 = Class30.aClass19_722;
		Class30.aClass19_734 = RSString.createRSString("Jan");
		Class30.aClass19_736 = null;
		Class30.aClass19_733 = RSString.createRSString("Mar");
		Class30.aClass19_735 = RSString.createRSString("Dec");
		Class30.aClass19Array716 = new RSString[] { Class30.aClass19_734, Class30.aClass19_721, Class30.aClass19_733, Class30.aClass19_723, Class30.aClass19_713, Class30.aClass19_709, Class30.aClass19_720, Class30.aClass19_717, Class30.aClass19_715, Class30.aClass19_710, Class30.aClass19_711, Class30.aClass19_735 };
	}

	private final int[] anIntArray708;
	private final int[] anIntArray725;
	private int anInt712;
	private int anInt726;
	private int anInt728;
	private int anInt730;

	Class30(int[] is) {
		try {
			anIntArray725 = new int[256];
			anIntArray708 = new int[256];
			for (int i = 0; i < is.length; i++)
				anIntArray725[i] = is[i];
			method280(false);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "va.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	public static void method281(int i) {
		try {
			Class30.aClass19_721 = null;
			Class30.aClass19_736 = null;
			Class30.aClass19_717 = null;
			Class30.aClass19Array716 = null;
			Class30.aShortArray724 = null;
			Class30.aClass19_723 = null;
			Class30.aByteArrayArray727 = null;
			Class30.aClass19_711 = null;
			Class30.aClass19_731 = null;
			Class30.aClass19_710 = null;
			if (i != -6)
				Class30.aShortArray724 = null;
			Class30.aClass19_709 = null;
			Class30.aClass19_715 = null;
			Class30.aClass19_720 = null;
			Class30.aClass19_713 = null;
			Class30.aClass19_734 = null;
			Class30.aClass19_722 = null;
			Class30.aClass19_733 = null;
			Class30.indexModels = null;
			Class30.aClass19_735 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "va.F(" + i + ')');
		}
	}

	static final int method282(byte i, int i_14_) {
		try {
			int i_15_ = 0;
			int i_16_ = 123 % ((i - 21) / 57);
			if (i_14_ < 0 || i_14_ >= 65536) {
				i_14_ >>>= 16;
				i_15_ += 16;
			}
			if (i_14_ >= 256) {
				i_15_ += 8;
				i_14_ >>>= 8;
			}
			if (i_14_ >= 16) {
				i_14_ >>>= 4;
				i_15_ += 4;
			}
			if (i_14_ >= 4) {
				i_14_ >>>= 2;
				i_15_ += 2;
			}
			if (i_14_ >= 1) {
				i_15_++;
				i_14_ >>>= 1;
			}
			return i_15_ + i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "va.B(" + i + ',' + i_14_ + ')');
		}
	}

	static final int method283(int i, Class38_Sub6 class38_sub6) {
		try {
			if (i > -93)
				return 7;
			Class38_Sub11 class38_sub11 = (Class38_Sub11) Entity.aClass14_3514.method75(((long) class38_sub6.anInt1856 << 32) - -(long) class38_sub6.anInt1941, (byte) -106);
			if (class38_sub11 != null)
				return class38_sub11.anInt2080;
			return class38_sub6.anInt1881;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "va.A(" + i + ',' + (class38_sub6 != null ? "{...}" : "null") + ')');
		}
	}

	private final void method279(int i) {
		try {
			int i_0_ = -56 / ((i + 21) / 37);
			anInt728 += ++anInt726;
			for (int i_1_ = 0; i_1_ < 256; i_1_++) {
				int i_2_ = anIntArray708[i_1_];
				if ((i_1_ & 0x2) == 0) {
					if ((i_1_ & 0x1) != 0)
						anInt712 ^= anInt712 >>> 6;
					else
						anInt712 ^= anInt712 << 13;
				} else if ((i_1_ & 0x1) != 0)
					anInt712 ^= anInt712 >>> 16;
				else
					anInt712 ^= anInt712 << 2;
				anInt712 += anIntArray708[i_1_ + 128 & 0xff];
				int i_3_;
				anIntArray708[i_1_] = i_3_ = anInt728 + anInt712 + anIntArray708[Class38_Sub10_Sub3.method941(1020, i_2_) >> 2];
				anIntArray725[i_1_] = anInt728 = anIntArray708[Class38_Sub10_Sub3.method941(261219, i_3_) >> 1691242760 >> 977170498] + i_2_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "va.E(" + i + ')');
		}
	}

	private final void method280(boolean bool) {
		try {
			int i_4_;
			int i_5_;
			int i_6_;
			int i_7_;
			int i_8_;
			int i_9_;
			int i_10_;
			int i = i_4_ = i_5_ = i_6_ = i_7_ = i_8_ = i_9_ = i_10_ = -1640531527;
			for (int i_11_ = 0; i_11_ < 4; i_11_++) {
				i ^= i_4_ << 11;
				i_4_ += i_5_;
				i_6_ += i;
				i_4_ ^= i_5_ >>> 2;
				i_5_ += i_6_;
				i_5_ ^= i_6_ << 8;
				i_7_ += i_4_;
				i_8_ += i_5_;
				i_6_ += i_7_;
				i_6_ ^= i_7_ >>> 16;
				i_7_ += i_8_;
				i_7_ ^= i_8_ << 10;
				i_10_ += i_7_;
				i_9_ += i_6_;
				i_8_ += i_9_;
				i_8_ ^= i_9_ >>> 4;
				i += i_8_;
				i_9_ += i_10_;
				i_9_ ^= i_10_ << 8;
				i_4_ += i_9_;
				i_10_ += i;
				i_10_ ^= i >>> 9;
				i += i_4_;
				i_5_ += i_10_;
			}
			for (int i_12_ = 0; i_12_ < 256; i_12_ += 8) {
				i_4_ += anIntArray725[i_12_ + 1];
				i_9_ += anIntArray725[i_12_ + 6];
				i_8_ += anIntArray725[i_12_ + 5];
				i_6_ += anIntArray725[i_12_ + 3];
				i_7_ += anIntArray725[i_12_ + 4];
				i += anIntArray725[i_12_];
				i_10_ += anIntArray725[i_12_ + 7];
				i_5_ += anIntArray725[i_12_ + 2];
				i ^= i_4_ << 11;
				i_6_ += i;
				i_4_ += i_5_;
				i_4_ ^= i_5_ >>> 2;
				i_7_ += i_4_;
				i_5_ += i_6_;
				i_5_ ^= i_6_ << 8;
				i_6_ += i_7_;
				i_6_ ^= i_7_ >>> 16;
				i_8_ += i_5_;
				i_7_ += i_8_;
				i_9_ += i_6_;
				i_7_ ^= i_8_ << 10;
				i_8_ += i_9_;
				i_10_ += i_7_;
				i_8_ ^= i_9_ >>> 4;
				i_9_ += i_10_;
				i_9_ ^= i_10_ << 8;
				i += i_8_;
				i_10_ += i;
				i_10_ ^= i >>> 9;
				i_4_ += i_9_;
				i_5_ += i_10_;
				i += i_4_;
				anIntArray708[i_12_] = i;
				anIntArray708[i_12_ + 1] = i_4_;
				anIntArray708[i_12_ + 2] = i_5_;
				anIntArray708[i_12_ + 3] = i_6_;
				anIntArray708[i_12_ + 4] = i_7_;
				anIntArray708[i_12_ + 5] = i_8_;
				anIntArray708[i_12_ + 6] = i_9_;
				anIntArray708[i_12_ + 7] = i_10_;
			}
			if (!bool) {
				for (int i_13_ = 0; i_13_ < 256; i_13_ += 8) {
					i += anIntArray708[i_13_];
					i_8_ += anIntArray708[i_13_ + 5];
					i_7_ += anIntArray708[i_13_ + 4];
					i_4_ += anIntArray708[i_13_ + 1];
					i_10_ += anIntArray708[i_13_ + 7];
					i_5_ += anIntArray708[i_13_ + 2];
					i_6_ += anIntArray708[i_13_ + 3];
					i_9_ += anIntArray708[i_13_ + 6];
					i ^= i_4_ << 11;
					i_6_ += i;
					i_4_ += i_5_;
					i_4_ ^= i_5_ >>> 2;
					i_5_ += i_6_;
					i_5_ ^= i_6_ << 8;
					i_7_ += i_4_;
					i_6_ += i_7_;
					i_6_ ^= i_7_ >>> 16;
					i_8_ += i_5_;
					i_9_ += i_6_;
					i_7_ += i_8_;
					i_7_ ^= i_8_ << 10;
					i_10_ += i_7_;
					i_8_ += i_9_;
					i_8_ ^= i_9_ >>> 4;
					i += i_8_;
					i_9_ += i_10_;
					i_9_ ^= i_10_ << 8;
					i_4_ += i_9_;
					i_10_ += i;
					i_10_ ^= i >>> 9;
					i += i_4_;
					anIntArray708[i_13_] = i;
					i_5_ += i_10_;
					anIntArray708[i_13_ + 1] = i_4_;
					anIntArray708[i_13_ + 2] = i_5_;
					anIntArray708[i_13_ + 3] = i_6_;
					anIntArray708[i_13_ + 4] = i_7_;
					anIntArray708[i_13_ + 5] = i_8_;
					anIntArray708[i_13_ + 6] = i_9_;
					anIntArray708[i_13_ + 7] = i_10_;
				}
				method279(-117);
				anInt730 = 256;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "va.C(" + bool + ')');
		}
	}

	final int nextVal() {
		if (anInt730-- == 0) {
			method279(102);
			anInt730 = 255;
		}
		return 0;// anIntArray725[anInt730];
	}
}
