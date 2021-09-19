package com.javatar.jagex;/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class57 {
	private Class36 aClass36_1253;
	private int[] anIntArray1254 = new int[5];
	private int[] anIntArray1255 = new int[5];
	private Class8 aClass8_1256;
	private Class36 aClass36_1257;
	private Class36 aClass36_1258;
	private static int[] anIntArray1259;
	private static int[] anIntArray1260;
	private Class36 aClass36_1261;
	int anInt1262 = 0;
	private Class36 aClass36_1263;
	private Class36 aClass36_1264;
	private Class36 aClass36_1265;
	private Class36 aClass36_1266;
	private int[] anIntArray1267;
	private int anInt1268 = 100;
	private static int[] anIntArray1269 = new int[32768];
	private Class36 aClass36_1270;
	private static int[] anIntArray1271;
	private int anInt1272;
	private static int[] anIntArray1273;
	private static int[] anIntArray1274;
	int anInt1275;
	private static int[] anIntArray1276;
	private static int[] anIntArray1277;

	final void method438(RS2Buffer class38_sub23) {
		aClass36_1253 = new Class36();
		aClass36_1253.method319(class38_sub23);
		aClass36_1263 = new Class36();
		aClass36_1263.method319(class38_sub23);
		int i = class38_sub23.getUByte();
		if (i != 0) {
			class38_sub23.pos--;
			aClass36_1258 = new Class36();
			aClass36_1258.method319(class38_sub23);
			aClass36_1261 = new Class36();
			aClass36_1261.method319(class38_sub23);
		}
		i = class38_sub23.getUByte();
		if (i != 0) {
			class38_sub23.pos--;
			aClass36_1257 = new Class36();
			aClass36_1257.method319(class38_sub23);
			aClass36_1270 = new Class36();
			aClass36_1270.method319(class38_sub23);
		}
		i = class38_sub23.getUByte();
		if (i != 0) {
			class38_sub23.pos--;
			aClass36_1266 = new Class36();
			aClass36_1266.method319(class38_sub23);
			aClass36_1265 = new Class36();
			aClass36_1265.method319(class38_sub23);
		}
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			int i_1_ = class38_sub23.method726(true);
			if (i_1_ == 0)
				break;
			anIntArray1254[i_0_] = i_1_;
			anIntArray1267[i_0_] = class38_sub23.method737(-49152);
			anIntArray1255[i_0_] = class38_sub23.method726(true);
		}
		anInt1272 = class38_sub23.method726(true);
		anInt1268 = class38_sub23.method726(true);
		this.anInt1275 = class38_sub23.getUShort();
		this.anInt1262 = class38_sub23.getUShort();
		aClass8_1256 = new Class8();
		aClass36_1264 = new Class36();
		aClass8_1256.method37(class38_sub23, aClass36_1264);
	}

	final int[] method439(int i, int i_2_) {
		Class71.method511(Class57.anIntArray1260, 0, i);
		if (i_2_ < 10)
			return Class57.anIntArray1260;
		double d = i / (i_2_ + 0.0);
		aClass36_1253.method320();
		aClass36_1263.method320();
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = 0;
		if (aClass36_1258 != null) {
			aClass36_1258.method320();
			aClass36_1261.method320();
			i_3_ = (int) ((aClass36_1258.anInt851 - aClass36_1258.anInt853) * 32.768 / d);
			i_4_ = (int) (aClass36_1258.anInt853 * 32.768 / d);
		}
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		if (aClass36_1257 != null) {
			aClass36_1257.method320();
			aClass36_1270.method320();
			i_6_ = (int) ((aClass36_1257.anInt851 - aClass36_1257.anInt853) * 32.768 / d);
			i_7_ = (int) (aClass36_1257.anInt853 * 32.768 / d);
		}
		for (int i_9_ = 0; i_9_ < 5; i_9_++)
			if (anIntArray1254[i_9_] != 0) {
				Class57.anIntArray1274[i_9_] = 0;
				Class57.anIntArray1273[i_9_] = (int) (anIntArray1255[i_9_] * d);
				Class57.anIntArray1271[i_9_] = (anIntArray1254[i_9_] << 14) / 100;
				Class57.anIntArray1277[i_9_] = (int) ((aClass36_1253.anInt851 - aClass36_1253.anInt853) * 32.768 * Math.pow(1.0057929410678534, anIntArray1267[i_9_]) / d);
				Class57.anIntArray1276[i_9_] = (int) (aClass36_1253.anInt853 * 32.768 / d);
			}
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			int i_11_ = aClass36_1253.method318(i);
			int i_12_ = aClass36_1263.method318(i);
			if (aClass36_1258 != null) {
				int i_13_ = aClass36_1258.method318(i);
				int i_14_ = aClass36_1261.method318(i);
				i_11_ += method441(i_5_, i_14_, aClass36_1258.anInt856) >> 1;
				i_5_ += (i_13_ * i_3_ >> 16) + i_4_;
			}
			if (aClass36_1257 != null) {
				int i_15_ = aClass36_1257.method318(i);
				int i_16_ = aClass36_1270.method318(i);
				i_12_ = i_12_ * ((method441(i_8_, i_16_, aClass36_1257.anInt856) >> 1) + 32768) >> 15;
				i_8_ += (i_15_ * i_6_ >> 16) + i_7_;
			}
			for (int i_17_ = 0; i_17_ < 5; i_17_++)
				if (anIntArray1254[i_17_] != 0) {
					int i_18_ = i_10_ + Class57.anIntArray1273[i_17_];
					if (i_18_ < i) {
						Class57.anIntArray1260[i_18_] += method441(Class57.anIntArray1274[i_17_], i_12_ * Class57.anIntArray1271[i_17_] >> 15, aClass36_1253.anInt856);
						Class57.anIntArray1274[i_17_] += (i_11_ * Class57.anIntArray1277[i_17_] >> 16) + Class57.anIntArray1276[i_17_];
					}
				}
		}
		if (aClass36_1266 != null) {
			aClass36_1266.method320();
			aClass36_1265.method320();
			int i_19_ = 0;
			boolean bool = false;
			boolean bool_20_ = true;
			for (int i_21_ = 0; i_21_ < i; i_21_++) {
				int i_22_ = aClass36_1266.method318(i);
				int i_23_ = aClass36_1265.method318(i);
				int i_24_;
				if (bool_20_)
					i_24_ = aClass36_1266.anInt853 + ((aClass36_1266.anInt851 - aClass36_1266.anInt853) * i_22_ >> 8);
				else
					i_24_ = aClass36_1266.anInt853 + ((aClass36_1266.anInt851 - aClass36_1266.anInt853) * i_23_ >> 8);
				i_19_ += 256;
				if (i_19_ >= i_24_) {
					i_19_ = 0;
					bool_20_ = !bool_20_;
				}
				if (bool_20_)
					Class57.anIntArray1260[i_21_] = 0;
			}
		}
		if (anInt1272 > 0 && anInt1268 > 0) {
			int i_25_ = (int) (anInt1272 * d);
			for (int i_26_ = i_25_; i_26_ < i; i_26_++)
				Class57.anIntArray1260[i_26_] += Class57.anIntArray1260[i_26_ - i_25_] * anInt1268 / 100;
		}
		if (aClass8_1256.anIntArray142[0] > 0 || aClass8_1256.anIntArray142[1] > 0) {
			aClass36_1264.method320();
			int i_27_ = aClass36_1264.method318(i + 1);
			int i_28_ = aClass8_1256.method39(0, i_27_ / 65536.0F);
			int i_29_ = aClass8_1256.method39(1, i_27_ / 65536.0F);
			if (i >= i_28_ + i_29_) {
				int i_30_ = 0;
				int i_31_ = i_29_;
				if (i_31_ > i - i_28_)
					i_31_ = i - i_28_;
				for (/**/; i_30_ < i_31_; i_30_++) {
					int i_32_ = (int) ((long) Class57.anIntArray1260[i_30_ + i_28_] * (long) Class8.anInt145 >> 16);
					for (int i_33_ = 0; i_33_ < i_28_; i_33_++)
						i_32_ += (int) ((long) Class57.anIntArray1260[i_30_ + i_28_ - 1 - i_33_] * (long) Class8.anIntArrayArray141[0][i_33_] >> 16);
					for (int i_34_ = 0; i_34_ < i_30_; i_34_++)
						i_32_ -= (int) ((long) Class57.anIntArray1260[i_30_ - 1 - i_34_] * (long) Class8.anIntArrayArray141[1][i_34_] >> 16);
					Class57.anIntArray1260[i_30_] = i_32_;
					i_27_ = aClass36_1264.method318(i + 1);
				}
				i_31_ = 128;
				for (;;) {
					if (i_31_ > i - i_28_)
						i_31_ = i - i_28_;
					for (/**/; i_30_ < i_31_; i_30_++) {
						int i_35_ = (int) ((long) Class57.anIntArray1260[i_30_ + i_28_] * (long) Class8.anInt145 >> 16);
						for (int i_36_ = 0; i_36_ < i_28_; i_36_++)
							i_35_ += (int) ((long) Class57.anIntArray1260[i_30_ + i_28_ - 1 - i_36_] * (long) Class8.anIntArrayArray141[0][i_36_] >> 16);
						for (int i_37_ = 0; i_37_ < i_29_; i_37_++)
							i_35_ -= (int) ((long) Class57.anIntArray1260[i_30_ - 1 - i_37_] * (long) Class8.anIntArrayArray141[1][i_37_] >> 16);
						Class57.anIntArray1260[i_30_] = i_35_;
						i_27_ = aClass36_1264.method318(i + 1);
					}
					if (i_30_ >= i - i_28_)
						break;
					i_28_ = aClass8_1256.method39(0, i_27_ / 65536.0F);
					i_29_ = aClass8_1256.method39(1, i_27_ / 65536.0F);
					i_31_ += 128;
				}
				for (/**/; i_30_ < i; i_30_++) {
					int i_38_ = 0;
					for (int i_39_ = i_30_ + i_28_ - i; i_39_ < i_28_; i_39_++)
						i_38_ += (int) ((long) Class57.anIntArray1260[i_30_ + i_28_ - 1 - i_39_] * (long) Class8.anIntArrayArray141[0][i_39_] >> 16);
					for (int i_40_ = 0; i_40_ < i_29_; i_40_++)
						i_38_ -= (int) ((long) Class57.anIntArray1260[i_30_ - 1 - i_40_] * (long) Class8.anIntArrayArray141[1][i_40_] >> 16);
					Class57.anIntArray1260[i_30_] = i_38_;
					i_27_ = aClass36_1264.method318(i + 1);
				}
			}
		}
		for (int i_41_ = 0; i_41_ < i; i_41_++) {
			if (Class57.anIntArray1260[i_41_] < -32768)
				Class57.anIntArray1260[i_41_] = -32768;
			if (Class57.anIntArray1260[i_41_] > 32767)
				Class57.anIntArray1260[i_41_] = 32767;
		}
		return Class57.anIntArray1260;
	}

	public static void method440() {
		Class57.anIntArray1260 = null;
		Class57.anIntArray1269 = null;
		Class57.anIntArray1259 = null;
		Class57.anIntArray1274 = null;
		Class57.anIntArray1273 = null;
		Class57.anIntArray1271 = null;
		Class57.anIntArray1277 = null;
		Class57.anIntArray1276 = null;
	}

	private final int method441(int i, int i_42_, int i_43_) {
		if (i_43_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_42_;
			return -i_42_;
		}
		if (i_43_ == 2)
			return Class57.anIntArray1259[i & 0x7fff] * i_42_ >> 14;
		if (i_43_ == 3)
			return ((i & 0x7fff) * i_42_ >> 14) - i_42_;
		if (i_43_ == 4)
			return Class57.anIntArray1269[i / 2607 & 0x7fff] * i_42_;
		return 0;
	}

	public Class57() {
		anIntArray1267 = new int[5];
		anInt1272 = 0;
		this.anInt1275 = 500;
	}

	static {
		Random random = new Random(0L);
		for (int i = 0; i < 32768; i++)
			Class57.anIntArray1269[i] = (random.nextInt() & 0x2) - 1;
		Class57.anIntArray1259 = new int[32768];
		for (int i = 0; i < 32768; i++)
			Class57.anIntArray1259[i] = (int) (Math.sin(i / 5215.1903) * 16384.0);
		Class57.anIntArray1260 = new int[220500];
		Class57.anIntArray1271 = new int[5];
		Class57.anIntArray1273 = new int[5];
		Class57.anIntArray1274 = new int[5];
		Class57.anIntArray1276 = new int[5];
		Class57.anIntArray1277 = new int[5];
	}
}
