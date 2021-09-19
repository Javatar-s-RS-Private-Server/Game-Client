package com.javatar.jagex;/* Class38_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub7 extends Node {
	int anInt2018;
	static byte[] aByteArray2019 = { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
	static RSString aClass19_2021;
	private static RSString aClass19_2022 = RSString.createRSString("We suspect someone knows your password)3");
	int[] anIntArray2024;
	static Class77 aClass77_2025;
	int[] anIntArray2026;
	static int anInt2027 = 0;
	static RSString aClass19_2028;
	Class65[] aClass65Array2029;
	static RSString aClass19_2030;
	static RSString aClass19_2031;
	int[] anIntArray2032;
	byte[][][] aByteArrayArrayArray2033;
	Class65[] aClass65Array2034;
	int anInt2035;
	static RSString aClass19_2036;
	private static RSString aClass19_2037;

	public static void method654(int i) {
		try {
			Class38_Sub7.aClass19_2028 = null;
			Class38_Sub7.aClass19_2021 = null;
			Class38_Sub7.aClass19_2036 = null;
			Class38_Sub7.aClass19_2022 = null;
			Class38_Sub7.aClass19_2030 = null;
			Class38_Sub7.aClass19_2037 = null;
			Class38_Sub7.aByteArray2019 = null;
			Class38_Sub7.aClass77_2025 = null;
			if (i <= -5)
				Class38_Sub7.aClass19_2031 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "e.C(" + i + ')');
		}
	}

	static final int method655(int i, int i_0_, boolean bool) {
		try {
			Class38_Sub3 class38_sub3 = (Class38_Sub3) Class38_Sub20_Sub8.aClass14_2863.method75(i);
			if (class38_sub3 == null)
				return 0;
			if (i_0_ == -1)
				return 0;
			int i_1_ = 0;
			if (bool != true)
				Class38_Sub7.method654(98);
			for (int i_2_ = 0; i_2_ < class38_sub3.anIntArray1779.length; i_2_++)
				if (class38_sub3.anIntArray1781[i_2_] == i_0_)
					i_1_ += class38_sub3.anIntArray1779[i_2_];
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "e.A(" + i + ',' + i_0_ + ',' + bool + ')');
		}
	}

	public Class38_Sub7() {
		/* empty */
	}

	static final boolean method656(int i) {
		try {
			if (Class38_Sub1.anInt1741 != 0)
				return true;
			if (i != 2330)
				Class38_Sub7.method656(-86);
			return Class35.aClass38_Sub10_Sub1_849.method841(-102);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "e.B(" + i + ')');
		}
	}

	static {
		Class38_Sub7.aClass19_2021 = RSString.createRSString("leuchten1:");
		Class38_Sub7.aClass19_2030 = RSString.createRSString("Fehler beim Laden Ihres Spielcharakters)3");
		Class38_Sub7.aClass19_2031 = Class38_Sub7.aClass19_2022;
		Class38_Sub7.aClass19_2036 = RSString.createRSString("compass");
		Class38_Sub7.aClass19_2037 = RSString.createRSString("Loaded fonts");
		Class38_Sub7.aClass19_2028 = Class38_Sub7.aClass19_2037;
	}
}
