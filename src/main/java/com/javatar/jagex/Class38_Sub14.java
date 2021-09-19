package com.javatar.jagex;/* Class38_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub14 extends Node {
	int[][] anIntArrayArray2125;
	static Object anObject2126;
	static RSString aClass19_2127 = RSString.createRSString("<col=ffff00>*V");
	int[] anIntArray2129;
	static Class83 aClass83_2130;
	int anInt2131;
	static int anInt2133;
	private int anInt2134;
	private static RSString aClass19_2135;
	static RSString aClass19_2137;
	static RSString aClass19_2138;
	static int anInt2139;
	static RSString aClass19_2140;
	static byte aByte2141;
	static boolean[] aBoolArray2142;
	static int[] anIntArray2143;
	static int anInt2144;
	static Class65 aClass65_2145;
	private static RSString aClass19_2146;
	static Class17_Sub1 aClass17_Sub1_2147;
	static byte[][] aByteArrayArray2148;

	public static void method679(int i) {
		try {
			Class38_Sub14.aClass19_2137 = null;
			Class38_Sub14.aClass19_2135 = null;
			Class38_Sub14.aClass19_2140 = null;
			Class38_Sub14.aByteArrayArray2148 = null;
			Class38_Sub14.anObject2126 = null;
			if (i != -1)
				Class38_Sub14.aBoolArray2142 = null;
			Class38_Sub14.aClass19_2127 = null;
			Class38_Sub14.aClass19_2146 = null;
			Class38_Sub14.aBoolArray2142 = null;
			Class38_Sub14.aClass17_Sub1_2147 = null;
			Class38_Sub14.aClass19_2138 = null;
			Class38_Sub14.anIntArray2143 = null;
			Class38_Sub14.aClass65_2145 = null;
			Class38_Sub14.aClass83_2130 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nb.A(" + i + ')');
		}
	}

	Class38_Sub14(int i, byte[] is) {
		try {
			this.anInt2131 = i;
			RS2Buffer class38_sub23 = new RS2Buffer(is);
			anInt2134 = class38_sub23.getUByte();
			this.anIntArrayArray2125 = new int[anInt2134][];
			this.anIntArray2129 = new int[anInt2134];
			for (int i_0_ = 0; i_0_ < anInt2134; i_0_++)
				this.anIntArray2129[i_0_] = class38_sub23.getUByte();
			for (int i_1_ = 0; anInt2134 > i_1_; i_1_++)
				this.anIntArrayArray2125[i_1_] = new int[class38_sub23.getUByte()];
			for (int i_2_ = 0; anInt2134 > i_2_; i_2_++)
				for (int i_3_ = 0; i_3_ < this.anIntArrayArray2125[i_2_].length; i_3_++)
					this.anIntArrayArray2125[i_2_][i_3_] = class38_sub23.getUByte();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nb.<init>(" + i + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	static {
		Class38_Sub14.anObject2126 = new Object();
		Class38_Sub14.aClass83_2130 = new Class83(64);
		Client.holdingArrowKeys = false;
		Class38_Sub14.aClass19_2140 = RSString.createRSString("Einloggen");
		Class38_Sub14.aClass19_2135 = RSString.createRSString("Unexpected loginserver response)3");
		Class38_Sub14.aByte2141 = (byte) 0;
		Class38_Sub14.anIntArray2143 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		Class38_Sub14.anInt2139 = 0;
		Class38_Sub14.aClass19_2138 = Class38_Sub14.aClass19_2135;
		Class38_Sub14.anInt2144 = 50;
		Class38_Sub14.aClass19_2146 = RSString.createRSString("Cancel");
		Class38_Sub14.aClass19_2137 = Class38_Sub14.aClass19_2146;
		Class38_Sub14.aByteArrayArray2148 = new byte[250][];
	}
}
