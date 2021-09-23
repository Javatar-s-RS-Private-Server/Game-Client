package com.javatar.jagex;/* Class38_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub11 extends Node {
	int anInt2080;
	static RSString aClass19_2082;
	static RSString aClass19_2083;
	static int anInt2084;
	private static RSString aClass19_2085;
	static RSString aClass19_2086;
	private static RSString aClass19_2088 = RSString.createRSString("Members object");
	static Class10 aClass10_2089;
	static RSString aClass19_2090;
	static RSString aClass19_2092;
	static Class38_Sub20_Sub9_Sub1_Sub1 aClass38_Sub20_Sub9_Sub1_Sub1_2093;
	static RSString[] aClass19Array2094;
	static RSString aClass19_2095;
	static int[] intOperators;
	private static RSString aClass19_2097;
	static RSString aClass19_2098;
	static Class60 aClass60_2099;
	static RSString aClass19_2100;
	static int anInt2101;
	static RSString aClass19_2102;
	static Class17_Sub1 aClass17_Sub1_2103;
	static int anInt2104;
	static Class83 aClass83_2105;
	static RSString aClass19_2106;
	static RSString aClass19_2107;

	static final void method672(int i, int i_0_, int i_1_) {
		try {
			if (i > -46)
				Class38_Sub11.aClass19_2092 = null;
			if (Class15.anInt302 != 0 && i_0_ != -1) {
				Class38_Sub4.method628(Class38_Sub1.aClass17_Sub1_1746, -1, i_0_, Class15.anInt302, false, 0);
				Class76.aBool1490 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fb.A(" + i + ',' + i_0_ + ',' + i_1_ + ')');
		}
	}

	public Class38_Sub11() {
		/* empty */
	}

	static final Class38_Sub20_Sub11 method673(int i, int i_2_) {
		try {
			Class38_Sub20_Sub11 class38_sub20_sub11 = (Class38_Sub20_Sub11) Class44.aClass83_998.method591(-28825, i);
			if (class38_sub20_sub11 != null)
				return class38_sub20_sub11;
			int i_3_ = -22 % ((i_2_ - 63) / 63);
			byte[] is = Class38_Sub10_Sub3.aClass17_2841.getFileData(13, i, -83);
			class38_sub20_sub11 = new Class38_Sub20_Sub11();
			class38_sub20_sub11.anInt2946 = i;
			if (is != null)
				class38_sub20_sub11.method980(0, new RS2Buffer(is));
			Class44.aClass83_998.method590(i, (byte) -118, class38_sub20_sub11);
			return class38_sub20_sub11;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fb.B(" + i + ',' + i_2_ + ')');
		}
	}

	public static void method674(boolean bool) {
		try {
			Class38_Sub11.aClass60_2099 = null;
			Class38_Sub11.aClass83_2105 = null;
			Class38_Sub11.aClass19_2098 = null;
			Class38_Sub11.aClass19_2082 = null;
			Class38_Sub11.aClass19_2090 = null;
			Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093 = null;
			Class38_Sub11.aClass19_2088 = null;
			if (bool == true) {
				Class38_Sub11.aClass19_2085 = null;
				Class38_Sub11.aClass19_2097 = null;
				Class38_Sub11.aClass19_2106 = null;
				Class38_Sub11.aClass19_2102 = null;
				Class38_Sub11.aClass19_2095 = null;
				Class38_Sub11.aClass19Array2094 = null;
				Class38_Sub11.intOperators = null;
				Class38_Sub11.aClass19_2083 = null;
				Class38_Sub11.aClass17_Sub1_2103 = null;
				Class38_Sub11.aClass10_2089 = null;
				Class38_Sub11.aClass19_2086 = null;
				Class38_Sub11.aClass19_2092 = null;
				Class38_Sub11.aClass19_2107 = null;
				Class38_Sub11.aClass19_2100 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fb.C(" + bool + ')');
		}
	}

	Class38_Sub11(int i) {
		try {
			this.anInt2080 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fb.<init>(" + i + ')');
		}
	}

	static {
		Class38_Sub11.aClass19_2085 = RSString.createRSString("You need a members account to login to this world)3");
		Class38_Sub11.aClass19_2083 = Class38_Sub11.aClass19_2088;
		Class38_Sub11.intOperators = new int[1000];
		Class38_Sub11.aClass19Array2094 = new RSString[8];
		Class38_Sub11.aClass19_2095 = Class38_Sub11.aClass19_2085;
		Class38_Sub11.aClass19_2092 = RSString.createRSString("(U2");
		Class38_Sub11.aClass19_2082 = RSString.createRSString("<col=ff9040>");
		Class38_Sub11.aClass19_2097 = RSString.createRSString("green:");
		Class38_Sub11.aClass19_2090 = RSString.createRSString("W-=hlen Sie eine Welt");
		Class38_Sub11.aClass19_2098 = Class38_Sub11.aClass19_2097;
		Class38_Sub11.aClass19_2086 = Class38_Sub11.aClass19_2097;
		Class38_Sub11.aClass10_2089 = new Class10();
		Class38_Sub11.aClass60_2099 = new Class60();
		Class38_Sub11.aClass19_2100 = RSString.createRSString("(U4");
		Class38_Sub11.anInt2101 = 0;
		Class38_Sub11.anInt2104 = 0;
		Class38_Sub11.aClass19_2102 = RSString.createRSString("0(U");
		Class38_Sub11.aClass83_2105 = new Class83(260);
		Class38_Sub11.aClass19_2107 = RSString.createRSString(" <col=ffffff>");
		Class38_Sub11.aClass19_2106 = RSString.createRSString("au");
	}
}
