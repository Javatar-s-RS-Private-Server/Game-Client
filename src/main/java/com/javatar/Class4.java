package com.javatar;/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class4 {
	static byte aByte79;
	static int anInt81;
	static RSString aClass19_84;
	static Image anImage85;
	static int anInt87 = 0;
	static int[] anIntArray90;
	static Class32 aClass32_91;

	static {
		Class4.aClass19_84 = RSString.createRSString("<col=00ff80>");
		Class4.anInt81 = 0;
		Class4.anIntArray90 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	}

	RSString aClass19_73;
	int anInt77;
	int anInt80;
	boolean aBool83;
	int anInt86;
	int anInt88;

	public Class4() {
		/* empty */
	}

	private static void method22() {
		do {
			try {
				Class44.aClass83_998.method596(68);
				PacketBuffer.aClass83_2434.method596(11 - 122);
				if (11 == 11)
					break;
				Class4.method27((byte) 69);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "oe.B(" + 11 + ')');
			}
			break;
		} while (false);
	}

	static final void method23(int i) {
		try {
			Class38_Sub3 class38_sub3 = (Class38_Sub3) Class38_Sub20_Sub8.aClass14_2863.method75(i);
			if (class38_sub3 != null) {
				for (int i_1_ = 0; class38_sub3.anIntArray1781.length > i_1_; i_1_++) {
					class38_sub3.anIntArray1781[i_1_] = -1;
					class38_sub3.anIntArray1779[i_1_] = 0;
				}
				int i_2_ = 80 / ((88 - 14) / 60);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "oe.A(" + i + ',' + 88 + ')');
		}
	}

	static final void method24(RSString class19, Class17 class17, RSString class19_3_) {
		try {
			int i_5_ = class17.method104(class19_3_);
			int i_6_ = class17.method118(class19, i_5_, true);
			if ((byte) -122 != -122)
				Class4.aByte79 = (byte) 106;
			Class38_Sub4.method628(class17, -1, i_5_, 255, false, i_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "oe.F(" + (class19 != null ? "{...}" : "null") + ',' + (class17 != null ? "{...}" : "null") + ',' + false + ',' + 255 + ',' + (class19_3_ != null ? "{...}" : "null") + ',' + (byte) -122 + ')');
		}
	}

	static final void method25(int i) {
		try {
			Class38_Sub20_Sub15.method1012();
			Class13.method73(99);
			Class2.method16();
			PacketBuffer.method790();
			Class60.method451();
			Class83.method593();
			Entity.method1172();
			Class4.method22();
			Class38_Sub20_Sub3_Sub4.method1154();
			Class9.method51();
			Entity.method1177();
			Class31.method288();
			((Class45) Class38_Sub20_Sub9_Sub4.anInterface3_3533).method378();
			Class38_Sub2.aClass83_1757.method596(-121);
			Class38_Sub14.indexFrames.method117();
			Class38_Sub11.indexFramemaps.method117();
			RS2Buffer.indexWidgets.method117();
			Class33.soundEffects.method117();
			Class48.indexMaps.method117();
			Class67.indexTrack1.method117();
			Class30.indexModels.method117();
			Class17.indexSprites.method117();
			Applet_Sub1.indexTextures.method117();
			Class52.indexBinary.method117();
			Class38_Sub1.indexTrack2.method117();
			Class38_Sub1.indexScripts.method117();
			int i_7_ = 27 / ((i + 44) / 40);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "oe.G(" + i + ')');
		}
	}

	static final void method26(int i, int i_8_) {
		do {
			try {
				if (i == -1 && !Class76.aBool1490)
					Class79.method571();
				else if (i != -1 && Class38_Sub19.anInt2238 != i && Class15.anInt302 != 0 && !Class76.aBool1490)
					Class23.method203(Class67.indexTrack1, Class15.anInt302, false, 0, 2, i);
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

	static final void method28() {
		try {
			if (0 == 0)
				for (Class38_Sub20_Sub3_Sub5 class38_sub20_sub3_sub5 = (Class38_Sub20_Sub3_Sub5) Class13.aClass13_235.method65(96); class38_sub20_sub3_sub5 != null; class38_sub20_sub3_sub5 = (Class38_Sub20_Sub3_Sub5) Class13.aClass13_235.method63(-3))
					if (class38_sub20_sub3_sub5.anInt3368 == Client.height && !class38_sub20_sub3_sub5.aBool3377) {
						if (class38_sub20_sub3_sub5.anInt3370 <= Class45.anInt1016) {
							class38_sub20_sub3_sub5.method1162(Canvas_Sub1.anInt2529);
							if (!class38_sub20_sub3_sub5.aBool3377)
								RuntimeException_Sub1.aClass27_3292.method249(class38_sub20_sub3_sub5.anInt3368, class38_sub20_sub3_sub5.anInt3383, class38_sub20_sub3_sub5.anInt3390, class38_sub20_sub3_sub5.anInt3386, 60, class38_sub20_sub3_sub5, 0, -1, false);
							else
								class38_sub20_sub3_sub5.method330(0);
						}
					} else
						class38_sub20_sub3_sub5.method330(0);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "oe.D(" + 0 + ')');
		}
	}
}
