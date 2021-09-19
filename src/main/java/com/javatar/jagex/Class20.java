package com.javatar.jagex;/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class20 {
	private int anInt487;
	private int[][] anIntArrayArray493;
	static Class83 aClass83_494;
	static Class17 itemModelFetcher;
	private int anInt498;
	static long[] aLongArray499 = new long[200];
	static RSString aClass19_500;
	static int anInt501;
	static int anInt502;
	static int[] anIntArray503;
	static boolean[] aBoolArray504;

	public static void method183(int i) {
		try {
			Class20.aBoolArray504 = null;
			Class20.anIntArray503 = null;
			if (i != -10470)
				Class20.anIntArray503 = null;
			Class20.aLongArray499 = null;
			Class20.aClass19_500 = null;
			Class20.itemModelFetcher = null;
			Class20.aClass83_494 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ed.F(" + i + ')');
		}
	}

	final byte[] method184(byte[] is, byte i) {
		try {
			if (anIntArrayArray493 != null) {
				int i_0_ = (int) ((long) is.length * (long) anInt487 / anInt498) + 14;
				int[] is_1_ = new int[i_0_];
				int i_2_ = 0;
				int i_3_ = 0;
				for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
					int i_5_ = is[i_4_];
					int[] is_6_ = anIntArrayArray493[i_3_];
					for (int i_7_ = 0; i_7_ < 14; i_7_++)
						is_1_[i_2_ + i_7_] += i_5_ * is_6_[i_7_];
					i_3_ += anInt487;
					int i_8_ = i_3_ / anInt498;
					i_2_ += i_8_;
					i_3_ -= i_8_ * anInt498;
				}
				is = new byte[i_0_];
				for (int i_9_ = 0; i_0_ > i_9_; i_9_++) {
					int i_10_ = is_1_[i_9_] + 32768 >> 573464592;
					if (i_10_ >= -128) {
						if (i_10_ > 127)
							is[i_9_] = (byte) 127;
						else
							is[i_9_] = (byte) i_10_;
					} else
						is[i_9_] = (byte) -128;
				}
			}
			if (i > -103)
				Class20.anInt501 = 69;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ed.C(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final int method185(int i, int i_11_, int i_12_, int i_13_) {
		try {
			i_11_ &= 0x3;
			if (i_11_ == i)
				return i_12_;
			if (i_11_ == 1)
				return 7 - i_13_;
			if (i_11_ == 2)
				return -i_12_ + 7;
			return i_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ed.A(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')');
		}
	}

	final int method186(int i, int i_14_) {
		try {
			if (i_14_ >= 0)
				return 0;
			if (anIntArrayArray493 != null)
				i = (int) ((long) anInt487 * (long) i / anInt498);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ed.H(" + i + ',' + i_14_ + ')');
		}
	}

	static final void method187(boolean bool) {
		try {
			for (Class38_Sub1 class38_sub1 = (Class38_Sub1) Class83.aClass13_1676.method65(102); class38_sub1 != null; class38_sub1 = (Class38_Sub1) Class83.aClass13_1676.method63(-3)) {
				if (class38_sub1.aClass38_Sub10_Sub2_1725 != null) {
					Class38_Sub9.aClass38_Sub10_Sub4_2057.method1014(class38_sub1.aClass38_Sub10_Sub2_1725);
					class38_sub1.aClass38_Sub10_Sub2_1725 = null;
				}
				if (class38_sub1.aClass38_Sub10_Sub2_1749 != null) {
					Class38_Sub9.aClass38_Sub10_Sub4_2057.method1014(class38_sub1.aClass38_Sub10_Sub2_1749);
					class38_sub1.aClass38_Sub10_Sub2_1749 = null;
				}
			}
			if (bool)
				Class20.method189((byte) 16, 54, 127);
			Class83.aClass13_1676.method58((byte) -19);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ed.G(" + bool + ')');
		}
	}

	final int method188(byte i, int i_15_) {
		try {
			if (anIntArrayArray493 != null)
				i_15_ = (int) ((long) i_15_ * (long) anInt487 / anInt498) + 6;
			int i_16_ = -122 / ((i - 16) / 49);
			return i_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ed.B(" + i + ',' + i_15_ + ')');
		}
	}

	static final boolean method189(byte i, int i_17_, int i_18_) {
		try {
			if (i < 13)
				Class20.method185(-90, -59, -47, -83);
			ObjectDefinition class38_sub20_sub1 = Class80.method581(-128, i_17_);
			if (i_18_ == 11)
				i_18_ = 10;
			if (i_18_ >= 5 && i_18_ <= 8)
				i_18_ = 4;
			return class38_sub20_sub1.method806(-114, i_18_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ed.E(" + i + ',' + i_17_ + ',' + i_18_ + ')');
		}
	}

	static final Class38_Sub20_Sub13 method190(byte i, Class17 class17, Class17 class17_19_, boolean bool, int i_20_) {
		try {
			if (i < 77)
				return null;
			int[] is = class17_19_.method110(i_20_, -94);
			boolean bool_21_ = true;
			for (int i_22_ = 0; is.length > i_22_; i_22_++) {
				byte[] is_23_ = class17_19_.method120(is[i_22_], -50, i_20_);
				if (is_23_ == null)
					bool_21_ = false;
				else {
					int i_24_ = is_23_[1] & 0xff | is_23_[0] << 1146155304 & 0xff00;
					byte[] is_25_;
					if (!bool)
						is_25_ = class17.method120(0, 117, i_24_);
					else
						is_25_ = class17.method120(i_24_, 113, 0);
					if (is_25_ == null)
						bool_21_ = false;
				}
			}
			if (!bool_21_)
				return null;
			try {
				return new Class38_Sub20_Sub13(class17_19_, class17, i_20_, bool);
			} catch (Exception exception) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ed.D(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + (class17_19_ != null ? "{...}" : "null") + ',' + bool + ',' + i_20_ + ')');
		}
	}

	Class20(int i, int i_26_) {
		try {
			if (i_26_ != i) {
				int i_27_ = Class38_Sub20_Sub3_Sub4.method1151(i, i_26_, -103);
				i /= i_27_;
				anIntArrayArray493 = new int[i][14];
				anInt498 = i;
				i_26_ /= i_27_;
				anInt487 = i_26_;
				for (int i_28_ = 0; i_28_ < i; i_28_++) {
					int[] is = anIntArrayArray493[i_28_];
					double d = (double) i_28_ / (double) i + 6.0;
					int i_29_ = (int) Math.floor(d + -7.0 + 1.0);
					int i_30_ = (int) Math.ceil(d + 7.0);
					if (i_29_ < 0)
						i_29_ = 0;
					double d_31_ = (double) i_26_ / (double) i;
					if (i_30_ > 14)
						i_30_ = 14;
					for (/**/; i_30_ > i_29_; i_29_++) {
						double d_32_ = (-d + i_29_) * 3.141592653589793;
						double d_33_ = d_31_;
						if (d_32_ < -1.0E-4 || d_32_ > 1.0E-4)
							d_33_ *= Math.sin(d_32_) / d_32_;
						d_33_ *= Math.cos((i_29_ - d) * 0.2243994752564138) * 0.46 + 0.54;
						is[i_29_] = (int) Math.floor(d_33_ * 65536.0 + 0.5);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ed.<init>(" + i + ',' + i_26_ + ')');
		}
	}

	static {
		Class20.aClass83_494 = new Class83(30);
		Class20.anInt502 = 0;
		Class20.aClass19_500 = RSString.createRSString("(U0a )2 non)2existant gosub script)2num: ");
		Class20.aBoolArray504 = new boolean[5];
	}
}
