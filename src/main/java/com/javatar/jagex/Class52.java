package com.javatar.jagex;/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class52 {
	byte[] aByteArray1139;
	int anInt1140;
	int anInt1141;
	private static RSString aClass19_1142 = RSString.createRSString("Attack");
	static boolean aBool1143;
	static int anInt1145;
	private static RSString aClass19_1146;
	int anInt1147;
	int anInt1148;
	static RSString aClass19_1149 = RSString.createRSString("Bitte versuchen Sie es in ");
	static Class17_Sub1 aClass17_Sub1_1151;
	int anInt1152;
	byte[] aByteArray1153;
	static RSString aClass19_1154 = Class52.aClass19_1142;
	static RSString aClass19_1155;
	static int anInt1156;
	int anInt1157;
	static RSString aClass19_1158;
	int anInt1160;

	public static void method406(int i) {
		try {
			Class52.aClass19_1155 = null;
			Class52.aClass19_1149 = null;
			Class52.aClass19_1158 = null;
			Class52.aClass19_1154 = null;
			if (i == 2) {
				Class52.aClass17_Sub1_1151 = null;
				Class52.aClass19_1146 = null;
				Class52.aClass19_1142 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kc.A(" + i + ')');
		}
	}

	static final void method407(int i, boolean bool) {
		do {
			try {
				Class38_Sub20_Sub4.anInt2586 += i * 128;
				int i_0_ = 256;
				if (Class38_Sub20_Sub4.anInt2586 > Class80.anIntArray1602.length) {
					Class38_Sub20_Sub4.anInt2586 -= Class80.anIntArray1602.length;
					int i_1_ = (int) (Math.random() * 12.0);
					Class54.method418(-122, Class51.aClass38_Sub20_Sub9_Sub2Array1136[i_1_]);
				}
				int i_2_ = 0;
				int i_3_ = i * 128;
				int i_4_ = (i_0_ - i) * 128;
				for (int i_5_ = 0; i_4_ > i_5_; i_5_++) {
					int i_6_ = Class2_Sub1.anIntArray2004[i_2_ + i_3_] - Class80.anIntArray1602[Class80.anIntArray1602.length - 1 & i_2_ + Class38_Sub20_Sub4.anInt2586] * i / 6;
					if (i_6_ < 0)
						i_6_ = 0;
					Class2_Sub1.anIntArray2004[i_2_++] = i_6_;
				}
				for (int i_7_ = i_0_ - i; i_7_ < i_0_; i_7_++) {
					int i_8_ = i_7_ * 128;
					for (int i_9_ = 0; i_9_ < 128; i_9_++) {
						int i_10_ = (int) (Math.random() * 100.0);
						if (i_10_ < 50 && i_9_ > 10 && i_9_ < 118)
							Class2_Sub1.anIntArray2004[i_8_ + i_9_] = 255;
						else
							Class2_Sub1.anIntArray2004[i_8_ + i_9_] = 0;
					}
				}
				if (RS2Buffer.anInt2412 > 0)
					RS2Buffer.anInt2412 -= i * 4;
				if (Class25.anInt594 > 0)
					Class25.anInt594 -= i * 4;
				if (RS2Buffer.anInt2412 == 0 && Class25.anInt594 == 0) {
					int i_11_ = (int) (2000 / i * Math.random());
					if (i_11_ == 0)
						RS2Buffer.anInt2412 = 1024;
					if (i_11_ == 1)
						Class25.anInt594 = 1024;
				}
				for (int i_12_ = 0; i_0_ - i > i_12_; i_12_++)
					Class73_Sub2.anIntArray2299[i_12_] = Class73_Sub2.anIntArray2299[i + i_12_];
				if (bool != true)
					Class52.method407(-95, true);
				for (int i_13_ = -i + i_0_; i_13_ < i_0_; i_13_++) {
					Class73_Sub2.anIntArray2299[i_13_] = (int) (Math.sin(Class38_Sub20_Sub7.anInt2851 / 14.0) * 16.0 + Math.sin(Class38_Sub20_Sub7.anInt2851 / 15.0) * 14.0 + Math.sin(Class38_Sub20_Sub7.anInt2851 / 16.0) * 12.0);
					Class38_Sub20_Sub7.anInt2851++;
				}
				int i_14_ = (i + (Class45.anInt1016 & 0x1)) / 2;
				ObjectDefinition.anInt2467 += i;
				if (i_14_ <= 0)
					break;
				for (int i_15_ = 0; ObjectDefinition.anInt2467 * 100 > i_15_; i_15_++) {
					int i_16_ = (int) (Math.random() * 128.0) + 128;
					int i_17_ = (int) (Math.random() * 124.0) + 2;
					Class2_Sub1.anIntArray2004[(i_16_ << 1792144775) + i_17_] = 192;
				}
				ObjectDefinition.anInt2467 = 0;
				for (int i_18_ = 0; i_18_ < i_0_; i_18_++) {
					int i_19_ = 0;
					int i_20_ = i_18_ * 128;
					for (int i_21_ = -i_14_; i_21_ < 128; i_21_++) {
						if (i_21_ + i_14_ < 128)
							i_19_ += Class2_Sub1.anIntArray2004[i_14_ + i_20_ + i_21_];
						if (i_21_ - 1 - i_14_ >= 0)
							i_19_ -= Class2_Sub1.anIntArray2004[-i_14_ - 1 + i_20_ + i_21_];
						if (i_21_ >= 0)
							Class82.anIntArray1642[i_21_ + i_20_] = i_19_ / (i_14_ * 2 + 1);
					}
				}
				for (int i_22_ = 0; i_22_ < 128; i_22_++) {
					int i_23_ = 0;
					for (int i_24_ = -i_14_; i_0_ > i_24_; i_24_++) {
						int i_25_ = i_24_ * 128;
						if (i_0_ > i_24_ + i_14_)
							i_23_ += Class82.anIntArray1642[i_22_ + i_25_ + i_14_ * 128];
						if (i_24_ - 1 - i_14_ >= 0)
							i_23_ -= Class82.anIntArray1642[i_25_ + i_22_ - (i_14_ * 128 + 128)];
						if (i_24_ >= 0)
							Class2_Sub1.anIntArray2004[i_22_ + i_25_] = i_23_ / (i_14_ * 2 + 1);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "kc.B(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method408(Class17 class17, RSString class19, int i, boolean bool, int i_26_, RSString class19_27_, int i_28_) {
		do {
			try {
				int i_29_ = class17.method104(3, class19);
				int i_30_ = class17.method118(class19_27_, i_29_, true);
				Class23.method203(true, class17, i_26_, bool, i_30_, i_28_, i_29_);
				if (i >= 20)
					break;
				Class52.method407(-92, false);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "kc.C(" + (class17 != null ? "{...}" : "null") + ',' + (class19 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + i_26_ + ',' + (class19_27_ != null ? "{...}" : "null") + ',' + i_28_ + ')');
			}
			break;
		} while (false);
	}

	public Class52() {
		/* empty */
	}

	static {
		Class52.anInt1145 = 0;
		Class52.anInt1156 = 0;
		Class52.aBool1143 = false;
		Class52.aClass19_1146 = RSString.createRSString("Loading)3)3)3");
		Class52.aClass19_1155 = RSString.createRSString("sich mit einer anderen Welt zu verbinden)3");
		Class52.aClass19_1158 = Class52.aClass19_1146;
	}
}
