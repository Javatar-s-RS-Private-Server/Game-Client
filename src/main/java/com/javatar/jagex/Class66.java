package com.javatar.jagex;/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class66 {
	private static RSString aClass19_1371;
	static RSString aClass19_1372;
	static RSString aClass19_1374 = RSString.createRSString("_");
	static RSString aClass19_1375 = RSString.createRSString("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");
	static Class17 aClass17_1376;

	public static void method475(int i) {
		try {
			Class66.aClass19_1375 = null;
			if (i >= 100) {
				Class66.aClass17_1376 = null;
				Class66.aClass19_1371 = null;
				Class66.aClass19_1374 = null;
				Class66.aClass19_1372 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "cd.A(" + i + ')');
		}
	}

	static final void method476(Class17 class17, Class17 class17_0_, boolean bool, Class38_Sub20_Sub9_Sub1_Sub1 class38_sub20_sub9_sub1_sub1, byte i) {
		try {
			Class38_Sub10_Sub3.aClass17_2833 = class17_0_;
			Class20.itemModelFetcher = class17;
			if (i < 57)
				Class66.method475(-21);
			Class55.aBool1232 = bool;
			Class38_Sub10_Sub3.aClass17_2833.method103((byte) 53, 10);
			Canvas_Sub1.aClass38_Sub20_Sub9_Sub1_Sub1_2525 = class38_sub20_sub9_sub1_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "cd.B(" + (class17 != null ? "{...}" : "null") + ',' + (class17_0_ != null ? "{...}" : "null") + ',' + bool + ',' + (class38_sub20_sub9_sub1_sub1 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static {
		Class66.aClass19_1371 = RSString.createRSString("Please check your message)2centre for details)3");
		Class66.aClass19_1372 = Class66.aClass19_1371;
	}
}
