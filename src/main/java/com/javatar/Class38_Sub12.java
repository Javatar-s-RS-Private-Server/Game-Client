package com.javatar;/* Class38_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub12 extends Node {
	static RSString[] aClass19Array2108;
	static RSString aClass19_2110 = RSString.createRSString("Keine Antwort vom Server)3");
	static RSString aClass19_2111;
	static int[] anIntArray2115;
	static int anInt2116 = 0;
	static RSString aClass19_2117 = RSString.createRSString("mod_icons");
	static int anInt2118 = 0;
	static int currentPort;
	static RSString aClass19_2122;
	private static RSString aClass19_2123 = RSString.createRSString("flash2:");

	static {
		Class38_Sub12.aClass19_2122 = Class38_Sub12.aClass19_2123;
		Class38_Sub12.aClass19_2111 = Class38_Sub12.aClass19_2123;
	}

	RSString aClass19_2109;

	public Class38_Sub12() {
		/* empty */
	}

	static final int method675(int i, int i_0_, int i_1_, int i_2_) {
		try {
			i &= 0x3;
			if (i_1_ != -12551)
				Class38_Sub12.method675(-114, 27, -65, -4);
			if (i == 0)
				return i_0_;
			if (i == 1)
				return i_2_;
			if (i == 2)
				return 7 - i_0_;
			return 7 - i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fc.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')');
		}
	}

	public static void method676(int i) {
		try {
			Class38_Sub12.anIntArray2115 = null;
			Class38_Sub12.aClass19_2123 = null;
			Class38_Sub12.aClass19_2122 = null;
			Class38_Sub12.aClass19_2117 = null;
			Class38_Sub12.aClass19_2111 = null;
			Class38_Sub12.aClass19_2110 = null;
			if (i != 2)
				Class38_Sub12.anIntArray2115 = null;
			Class38_Sub12.aClass19Array2108 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fc.B(" + i + ')');
		}
	}
}
