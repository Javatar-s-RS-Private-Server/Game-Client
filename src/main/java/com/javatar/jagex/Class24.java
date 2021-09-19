package com.javatar.jagex;/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class24 {
	static int anInt566;
	static RSString aClass19_567;
	static RSString aClass19_568;
	static short[] aShortArray575;

	public static void method205(byte i) {
		try {
			Class24.aShortArray575 = null;
			Class24.aClass19_567 = null;
			if (i > -35)
				Client.lastClickTime = 14L;
			Class24.aClass19_568 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ma.D(" + i + ')');
		}
	}

	static final RSString method206(RSString[] class19s, int i, int i_0_, byte i_1_) {
		try {
			int i_2_ = 0;
			for (int i_3_ = 0; i_3_ < i; i_3_++) {
				if (class19s[i_3_ + i_0_] == null)
					class19s[i_0_ + i_3_] = SceneModel.aClass19_2556;
				i_2_ += class19s[i_3_ + i_0_].anInt478;
			}
			byte[] is = new byte[i_2_];
			if (i_1_ > -123)
				Class24.method206(null, 30, -93, (byte) -103);
			int i_4_ = 0;
			for (int i_5_ = 0; i > i_5_; i_5_++) {
				RSString class19 = class19s[i_0_ + i_5_];
				Class71.method510(class19.buffer, 0, is, i_4_, class19.anInt478);
				i_4_ += class19.anInt478;
			}
			RSString class19 = new RSString();
			class19.anInt478 = i_2_;
			class19.buffer = is;
			return class19;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ma.B(" + (class19s != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ')');
		}
	}

	static final void method207(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		do {
			try {
				if (!Class22.loadWidget(i_8_)) {
					if (i_10_ != -1)
						Class32.aBoolArray768[i_10_] = true;
					else
						for (int i_14_ = 0; i_14_ < 100; i_14_++)
							Class32.aBoolArray768[i_14_] = true;
				} else {
					Class38_Sub1.aClass38_Sub6Array1731 = null;
					Class42.method356(1, i_11_, i_9_, Class62.widgets[i_8_], -1, i_7_, i_13_, i_10_, i, i_12_);
					if (Class38_Sub1.aClass38_Sub6Array1731 != null) {
						Class42.method356(1, i_11_, i_9_, Class38_Sub1.aClass38_Sub6Array1731, -1412584499, Class79.anInt1575, Class24.anInt566, i_10_, i, i_12_);
						Class38_Sub1.aClass38_Sub6Array1731 = null;
					}
					if (i_6_ == -101)
						break;
					Class24.method207(-82, 72, -44, 59, 115, 101, -120, -122, -123);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ma.A(" + i + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')');
			}
			break;
		} while (false);
	}

	static final boolean method208(WidgetComponent class38_sub6, int i) {
		try {
			if (class38_sub6.anIntArray1891 == null)
				return false;
			int i_15_ = 0;
			if (i <= 46)
				Class24.anInt566 = 22;
			for (/**/; i_15_ < class38_sub6.anIntArray1891.length; i_15_++) {
				int i_16_ = Class13.method72((byte) 23, class38_sub6, i_15_);
				int i_17_ = class38_sub6.anIntArray1898[i_15_];
				if (class38_sub6.anIntArray1891[i_15_] != 2) {
					if (class38_sub6.anIntArray1891[i_15_] == 3) {
						if (i_17_ >= i_16_)
							return false;
					} else if (class38_sub6.anIntArray1891[i_15_] != 4) {
						if (i_17_ != i_16_)
							return false;
					} else if (i_16_ == i_17_)
						return false;
				} else if (i_16_ >= i_17_)
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ma.C(" + (class38_sub6 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static {
		Class24.aClass19_567 = RSString.createRSString("::fpson");
		Class24.aShortArray575 = new short[] { -1, -1, -1, -1, -1 };
		Class24.aClass19_568 = RSString.createRSString("null");
	}
}
