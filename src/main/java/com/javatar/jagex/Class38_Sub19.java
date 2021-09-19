package com.javatar.jagex;/* Class38_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub19 extends Node {
	static Class17 aClass17_2230;
	int anInt2231;
	static int anInt2233;
	WidgetComponent aClass38_Sub6_2234;
	RSString aClass19_2235;
	int anInt2236;
	int anInt2237;
	static int anInt2238 = -1;
	int anInt2239;
	Object[] anObjectArray2240;
	WidgetComponent aClass38_Sub6_2241;
	int anInt2242;

	static final void method704(int i) {
		do {
			try {
				for (int i_0_ = 0; Class4.anInt87 > i_0_; i_0_++) {
					int i_1_ = Class38_Sub10_Sub1.anIntArray2652[i_0_];
					NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_1_];
					if (class38_sub20_sub3_sub7_sub1 != null)
						PlayerAppearance.method130((byte) -105, class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2697, class38_sub20_sub3_sub7_sub1);
				}
				if (i < -84)
					break;
				Class38_Sub19.anInt2233 = 68;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "bd.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method705(byte i) {
		do {
			try {
				if (Class56.aString1248.toLowerCase().indexOf("microsoft") != -1) {
					Class38_Sub14.anIntArray2143[191] = 73;
					Class38_Sub14.anIntArray2143[220] = 74;
					Class38_Sub14.anIntArray2143[190] = 72;
					Class38_Sub14.anIntArray2143[222] = 59;
					Class38_Sub14.anIntArray2143[221] = 43;
					Class38_Sub14.anIntArray2143[219] = 42;
					Class38_Sub14.anIntArray2143[223] = 28;
					Class38_Sub14.anIntArray2143[187] = 27;
					Class38_Sub14.anIntArray2143[189] = 26;
					Class38_Sub14.anIntArray2143[192] = 58;
					Class38_Sub14.anIntArray2143[188] = 71;
					Class38_Sub14.anIntArray2143[186] = 57;
				} else {
					Class38_Sub14.anIntArray2143[92] = 74;
					Class38_Sub14.anIntArray2143[61] = 27;
					Class38_Sub14.anIntArray2143[46] = 72;
					if (Class56.aMethod1236 == null) {
						Class38_Sub14.anIntArray2143[192] = 58;
						Class38_Sub14.anIntArray2143[222] = 59;
					} else {
						Class38_Sub14.anIntArray2143[222] = 58;
						Class38_Sub14.anIntArray2143[520] = 59;
						Class38_Sub14.anIntArray2143[192] = 28;
					}
					Class38_Sub14.anIntArray2143[44] = 71;
					Class38_Sub14.anIntArray2143[93] = 43;
					Class38_Sub14.anIntArray2143[47] = 73;
					Class38_Sub14.anIntArray2143[59] = 57;
					Class38_Sub14.anIntArray2143[45] = 26;
					Class38_Sub14.anIntArray2143[91] = 42;
				}
				if (i == -75)
					break;
				Class38_Sub19.method704(113);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "bd.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method706(boolean bool) {
		do {
			try {
				Class38_Sub19.aClass17_2230 = null;
				if (bool == true)
					break;
				Class38_Sub19.anInt2238 = -11;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "bd.B(" + bool + ')');
			}
			break;
		} while (false);
	}

	public Class38_Sub19() {
		/* empty */
	}

	static {
		Class38_Sub19.anInt2233 = 0;
	}
}
