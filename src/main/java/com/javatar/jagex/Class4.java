package com.javatar.jagex;/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

final class Class4 {
	RSString aClass19_73;
	int anInt77;
	static byte aByte79;
	int anInt80;
	static int anInt81;
	boolean aBool83;
	static RSString aClass19_84;
	static Image anImage85;
	int anInt86;
	static int anInt87 = 0;
	int anInt88;
	static int[] anIntArray90;
	static Class32 aClass32_91;

	private static final void method22(int i) {
		do {
			try {
				Class44.aClass83_998.method596(68);
				PacketBuffer.aClass83_2434.method596(i - 122);
				if (i == 11)
					break;
				Class4.method27((byte) 69);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "oe.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method23(int i, int i_0_) {
		try {
			Class38_Sub3 class38_sub3 = (Class38_Sub3) Class38_Sub20_Sub8.aClass14_2863.method75(i);
			if (class38_sub3 != null) {
				for (int i_1_ = 0; class38_sub3.anIntArray1781.length > i_1_; i_1_++) {
					class38_sub3.anIntArray1781[i_1_] = -1;
					class38_sub3.anIntArray1779[i_1_] = 0;
				}
				int i_2_ = 80 / ((i_0_ - 14) / 60);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "oe.A(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method24(RSString class19, Class17 class17, boolean bool, int i, RSString class19_3_, byte i_4_) {
		try {
			int i_5_ = class17.method104(3, class19_3_);
			int i_6_ = class17.method118(class19, i_5_, true);
			if (i_4_ != -122)
				Class4.aByte79 = (byte) 106;
			Class38_Sub4.method628(class17, -1, i_5_, i, bool, i_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "oe.F(" + (class19 != null ? "{...}" : "null") + ',' + (class17 != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + (class19_3_ != null ? "{...}" : "null") + ',' + i_4_ + ')');
		}
	}

	static final void method25(int i) {
		try {
			Class38_Sub20_Sub15.method1012((byte) -68);
			Class13.method73(99);
			Class2.method16(false);
			PacketBuffer.method790(98);
			Class60.method451(-1);
			Class83.method593((byte) -68);
			Entity.method1172(-1708);
			Class4.method22(11);
			Class38_Sub20_Sub3_Sub4.method1154(122);
			Class9.method51(0);
			Entity.method1177(0);
			Class31.method288((byte) -68);
			((Class45) Class38_Sub20_Sub9_Sub4.anInterface3_3533).method378(0);
			Class38_Sub2.aClass83_1757.method596(-121);
			Class38_Sub14.aClass17_Sub1_2147.method117(-4134);
			Class38_Sub11.aClass17_Sub1_2103.method117(-4134);
			RS2Buffer.aClass17_Sub1_2359.method117(-4134);
			Class33.aClass17_Sub1_784.method117(-4134);
			Class48.aClass17_Sub1_1070.method117(-4134);
			Class67.aClass17_Sub1_1382.method117(-4134);
			Class30.aClass17_Sub1_729.method117(-4134);
			Class17.aClass17_Sub1_376.method117(-4134);
			Applet_Sub1.aClass17_Sub1_3639.method117(-4134);
			Class52.aClass17_Sub1_1151.method117(-4134);
			Class38_Sub1.aClass17_Sub1_1746.method117(-4134);
			Class38_Sub1.aClass17_Sub1_1724.method117(-4134);
			int i_7_ = 27 / ((i + 44) / 40);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "oe.G(" + i + ')');
		}
	}

	static final void method26(int i, int i_8_) {
		do {
			try {
				if (i == -1 && !Class76.aBool1490)
					Class79.method571(true);
				else if (i != -1 && Class38_Sub19.anInt2238 != i && Class15.anInt302 != 0 && !Class76.aBool1490)
					Class23.method203(true, Class67.aClass17_Sub1_1382, Class15.anInt302, false, 0, 2, i);
				Class38_Sub19.anInt2238 = i;
				if (i_8_ == -10897)
					break;
				Class4.aClass19_84 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "oe.E(" + i + ',' + i_8_ + ')');
			}
			break;
		} while (false);
	}

	public Class4() {
		/* empty */
	}

	public static void method27(byte i) {
		try {
			Class4.aClass19_84 = null;
			if (i >= 53) {
				Class4.anIntArray90 = null;
				Class4.anImage85 = null;
				Class4.aClass32_91 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "oe.C(" + i + ')');
		}
	}

	static final void method28(int i) {
		try {
			if (i == 0)
				for (Class38_Sub20_Sub3_Sub5 class38_sub20_sub3_sub5 = (Class38_Sub20_Sub3_Sub5) Class13.aClass13_235.method65(96); class38_sub20_sub3_sub5 != null; class38_sub20_sub3_sub5 = (Class38_Sub20_Sub3_Sub5) Class13.aClass13_235.method63(-3))
					if (class38_sub20_sub3_sub5.anInt3368 == Client.height && !class38_sub20_sub3_sub5.aBool3377) {
						if (class38_sub20_sub3_sub5.anInt3370 <= Class45.anInt1016) {
							class38_sub20_sub3_sub5.method1162((byte) -115, Canvas_Sub1.anInt2529);
							if (!class38_sub20_sub3_sub5.aBool3377)
								RuntimeException_Sub1.aClass27_3292.method249(class38_sub20_sub3_sub5.anInt3368, class38_sub20_sub3_sub5.anInt3383, class38_sub20_sub3_sub5.anInt3390, class38_sub20_sub3_sub5.anInt3386, 60, class38_sub20_sub3_sub5, 0, -1, false);
							else
								class38_sub20_sub3_sub5.method330(0);
						}
					} else
						class38_sub20_sub3_sub5.method330(0);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "oe.D(" + i + ')');
		}
	}

	static {
		Class4.aClass19_84 = RSString.createRSString("<col=00ff80>");
		Class4.anInt81 = 0;
		Class4.anIntArray90 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	}
}
