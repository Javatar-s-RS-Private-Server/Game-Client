package com.javatar;/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class45 implements Interface3 {
	static RSString aClass19_1014;
	static int anInt1015;
	static int anInt1016 = 0;
	static short[][] characterColors;
	static RSString aClass19_1022;
	static RSString aClass19_1023;
	static int anInt1032;
	private static RSString aClass19_1021;

	static {
		Class45.anInt1015 = 0;
		Class45.aClass19_1023 = RSString.createRSString("Texturen geladen)3");
		Class45.aClass19_1022 = RSString.createRSString("::rect_debug");
		Class45.aClass19_1021 = RSString.createRSString("Sorry invited players only)3");
		Class45.anInt1032 = 0;
		Class45.aClass19_1014 = Class45.aClass19_1021;
	}

	private final Class38_Sub5[] aClass38_Sub5Array1025;
	private final int anInt1029;
	private final Class17 aClass17_1033;
	private Class13 aClass13_1026 = new Class13();
	private double aDouble1028 = 1.0;
	private int anInt1030;
	private int anInt1031 = 128;

	Class45(Class17 class17, Class17 class17_6_, int i_7_) {
		anInt1030 = 0;
		try {
			anInt1031 = i_7_;
			aDouble1028 = 0.8;
			aClass17_1033 = class17_6_;
			anInt1029 = 20;
			anInt1030 = anInt1029;
			int[] is = class17.method110(0, 62);
			int i_8_ = is.length;
			aClass38_Sub5Array1025 = new Class38_Sub5[class17.method103(0)];
			for (int i : is) {
				RS2Buffer class38_sub23 = new RS2Buffer(class17.method109(0, i, -70));
				aClass38_Sub5Array1025[i] = new Class38_Sub5(class38_sub23);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ua.<init>(" + (class17 != null ? "{...}" : "null") + ',' + (class17_6_ != null ? "{...}" : "null") + ',' + 20 + ',' + 0.8 + ',' + i_7_ + ')');
		}
	}

	public static void method379(byte i) {
		try {
			Class45.aClass19_1014 = null;
			Class45.aClass19_1023 = null;
			Class45.characterColors = null;
			if (i != 11)
				Class45.method379((byte) 23);
			Class45.aClass19_1021 = null;
			Class45.aClass19_1022 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ua.F(" + i + ')');
		}
	}

	final void method376(int i, double d) {
		try {
			aDouble1028 = d;
			if (i > -109)
				anInt1031 = -68;
			method378();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ua.G(" + i + ',' + d + ')');
		}
	}

	final void method377(int i_0_) {
		do {
			try {
				for (Class38_Sub5 class38_sub5 : aClass38_Sub5Array1025) {
					if (class38_sub5 != null && class38_sub5.anInt1839 != 0 && class38_sub5.aBool1848) {
						class38_sub5.method630(i_0_);
						class38_sub5.aBool1848 = false;
					}
				}
				if ((byte) 107 >= 50)
					break;
				method376(80, -1.988483212553894);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ua.H(" + (byte) 107 + ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}

	@Override
	public final boolean method8(boolean bool, int i) {
		try {
			if (!bool)
				method376(84, 1.3356680705686792);
			return anInt1031 == 64;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ua.A(" + bool + ',' + i + ')');
		}
	}

	final void method378() {
		do {
			try {
				for (Class38_Sub5 class38_sub5 : aClass38_Sub5Array1025)
					if (class38_sub5 != null)
						class38_sub5.method631();
				aClass13_1026 = new Class13();
				anInt1030 = anInt1029;
				if (0 == 0)
					break;
				method7(36, false);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ua.D(" + 0 + ')');
			}
			break;
		} while (false);
	}

	@Override
	public final boolean method10(int i, int i_3_) {
		try {
			if (i != 17912)
				return false;
			return aClass38_Sub5Array1025[i_3_].aBool1842;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ua.E(" + i + ',' + i_3_ + ')');
		}
	}

	@Override
	public final int method7(int i, boolean bool) {
		try {
			if (bool)
				Class45.aClass19_1023 = null;
			if (aClass38_Sub5Array1025[i] != null)
				return aClass38_Sub5Array1025[i].anInt1843;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ua.C(" + i + ',' + bool + ')');
		}
	}

	@Override
	public final int[] method9(int i, int i_4_) {
		try {
			if (i < 108)
				Class45.anInt1016 = 127;
			Class38_Sub5 class38_sub5 = aClass38_Sub5Array1025[i_4_];
			if (class38_sub5 != null) {
				if (class38_sub5.anIntArray1844 != null) {
					aClass13_1026.method61(-94, class38_sub5);
					class38_sub5.aBool1848 = true;
					return class38_sub5.anIntArray1844;
				}
				boolean bool = class38_sub5.method633(aDouble1028, anInt1031, aClass17_1033);
				if (bool) {
					if (anInt1030 == 0) {
						Class38_Sub5 class38_sub5_5_ = (Class38_Sub5) aClass13_1026.method60();
						class38_sub5_5_.method631();
					} else
						anInt1030--;
					aClass13_1026.method61(-19, class38_sub5);
					class38_sub5.aBool1848 = true;
					return class38_sub5.anIntArray1844;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ua.B(" + i + ',' + i_4_ + ')');
		}
	}
}
