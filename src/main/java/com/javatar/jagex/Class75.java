package com.javatar.jagex;/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class75 {
	static Class83 aClass83_1472 = new Class83(64);
	static RSString aClass19_1473 = RSString.createRSString("gelb:");
	static RSString aClass19_1474;
	static int anInt1475 = 0;
	static int anInt1476;
	static int anInt1478;
	static RSString aClass19_1479;
	static RSString aClass19_1481;

	static final void method540(int i) {
		try {
			Class25.aClass73_579.method518(125);
			for (int i_1_ = 0; i_1_ < 32; i_1_++)
				Class17_Sub1.aLongArray1704[i_1_] = 0L;
			for (int i_2_ = 0; i_2_ < 32; i_2_++)
				Class42.aLongArray954[i_2_] = 0L;
			Class11.anInt202 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qb.B(" + i + ')');
		}
	}

	public static void method541(int i) {
		try {
			Class75.aClass83_1472 = null;
			Class75.aClass19_1481 = null;
			Class75.aClass19_1474 = null;
			Class75.aClass19_1473 = null;
			if (i > 49)
				Class75.aClass19_1479 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qb.A(" + i + ')');
		}
	}

	static {
		Class75.aClass19_1474 = RSString.createRSString("Verbinde mit Server)3)3)3");
		Class75.anInt1476 = 500;
		Class75.aClass19_1479 = RSString.createRSString("Spieler");
		Class75.anInt1478 = 0;
		Class75.aClass19_1481 = RSString.createRSString("T");
	}
}
