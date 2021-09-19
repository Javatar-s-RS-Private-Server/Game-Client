package com.javatar.jagex;/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

final class Class81 {
	private Inflater anInflater1613;
	static Class13 aClass13_1616 = new Class13();
	static int anInt1618 = 0;
	static int anInt1619 = 0;
	static int anInt1621 = 0;
	static Class83 aClass83_1622 = new Class83(64);
	static int anInt1624 = 0;
	static int[] anIntArray1625;
	static RSString aClass19_1626 = RSString.createRSString("::gc");

	public Class81() {
		this(-1, 1000000, 1000000);
	}

	public static void method582(int i) {
		try {
			Class81.aClass13_1616 = null;
			Class81.aClass83_1622 = null;
			if (i != 0)
				Class81.method582(47);
			Class81.anIntArray1625 = null;
			Class81.aClass19_1626 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "aa.A(" + i + ')');
		}
	}

	final void method583(byte[] is, byte i, RS2Buffer class38_sub23) {
		try {
			if (class38_sub23.buffer[class38_sub23.pos] != 31 || class38_sub23.buffer[class38_sub23.pos + 1] != -117)
				throw new RuntimeException("Invalid GZIP header!");
			if (anInflater1613 == null)
				anInflater1613 = new Inflater(true);
			int i_0_ = -4 % ((51 - i) / 55);
			try {
				anInflater1613.setInput(class38_sub23.buffer, class38_sub23.pos + 10, class38_sub23.buffer.length - 8 + -class38_sub23.pos - 10);
				anInflater1613.inflate(is);
			} catch (Exception exception) {
				anInflater1613.reset();
				throw new RuntimeException("Invalid GZIP compressed data!");
			}
			anInflater1613.reset();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "aa.B(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (class38_sub23 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method584(byte i, int i_1_) {
		try {
			int[] is = Class38_Sub17.aClass38_Sub20_Sub9_Sub3_2194.anIntArray3300;
			int i_2_ = is.length;
			int i_3_ = 0;
			if (i < -118) {
				for (/**/; i_2_ > i_3_; i_3_++)
					is[i_3_] = 0;
				for (int i_4_ = 1; i_4_ < 103; i_4_++) {
					int i_5_ = (-(i_4_ * 512) + 52736) * 4 + 24628;
					for (int i_6_ = 1; i_6_ < 103; i_6_++) {
						if ((Class82.aByteArrayArrayArray1648[i_1_][i_6_][i_4_] & 0x18) == 0)
							RuntimeException_Sub1.aClass27_3292.method252(is, i_5_, 512, i_1_, i_6_, i_4_);
						if (i_1_ < 3 && (Class82.aByteArrayArrayArray1648[i_1_ + 1][i_6_][i_4_] & 0x8) != 0)
							RuntimeException_Sub1.aClass27_3292.method252(is, i_5_, 512, i_1_ + 1, i_6_, i_4_);
						i_5_ += 4;
					}
				}
				Class38_Sub17.aClass38_Sub20_Sub9_Sub3_2194.method1124();
				int i_7_ = 228 - (-(int) (Math.random() * 20.0) - ((int) (Math.random() * 20.0) + 228 << -1941399440)) + (238 + (int) (Math.random() * 20.0) - 10 << -1098900856);
				int i_8_ = 238 + (int) (Math.random() * 20.0) - 10 << 198621072;
				for (int i_9_ = 1; i_9_ < 103; i_9_++)
					for (int i_10_ = 1; i_10_ < 103; i_10_++) {
						if ((Class82.aByteArrayArrayArray1648[i_1_][i_10_][i_9_] & 0x18) == 0)
							Class17.method114(i_7_, i_1_, i_10_, 123, i_9_, i_8_);
						if (i_1_ < 3 && (Class82.aByteArrayArrayArray1648[i_1_ + 1][i_10_][i_9_] & 0x8) != 0)
							Class17.method114(i_7_, i_1_ + 1, i_10_, 52, i_9_, i_8_);
					}
				Applet_Sub1.anInt3627 = 0;
				for (int i_11_ = 0; i_11_ < 104; i_11_++)
					for (int i_12_ = 0; i_12_ < 104; i_12_++) {
						int i_13_ = RuntimeException_Sub1.aClass27_3292.method237(Client.height, i_11_, i_12_);
						if (i_13_ != 0) {
							i_13_ = i_13_ >> -1458690418 & 0x7fff;
							int i_14_ = Class80.method581(100, i_13_).anInt2456;
							if (i_14_ >= 0) {
								int i_15_ = i_11_;
								int i_16_ = i_12_;
								if (i_14_ != 22 && i_14_ != 29 && i_14_ != 34 && i_14_ != 36 && i_14_ != 46 && i_14_ != 47 && i_14_ != 48) {
									int[][] is_17_ = Client.clippingHeights[Client.height].clippingFlags;
									for (int i_18_ = 0; i_18_ < 10; i_18_++) {
										int i_19_ = (int) (Math.random() * 4.0);
										if (i_19_ == 0 && i_15_ > 0 && i_15_ > i_11_ - 3 && (is_17_[i_15_ - 1][i_16_] & 0x12c0108) == 0)
											i_15_--;
										if (i_19_ == 1 && i_15_ < 103 && i_11_ + 3 > i_15_ && (is_17_[i_15_ + 1][i_16_] & 0x12c0180) == 0)
											i_15_++;
										if (i_19_ == 2 && i_16_ > 0 && i_16_ > i_12_ - 3 && (is_17_[i_15_][i_16_ - 1] & 0x12c0102) == 0)
											i_16_--;
										if (i_19_ == 3 && i_16_ < 103 && i_12_ + 3 > i_16_ && (is_17_[i_15_][i_16_ + 1] & 0x12c0120) == 0)
											i_16_++;
									}
								}
								Class15.aClass38_Sub20_Sub9_Sub3Array288[Applet_Sub1.anInt3627] = NPC.aClass38_Sub20_Sub9_Sub3Array3549[i_14_];
								Class72.anIntArray1418[Applet_Sub1.anInt3627] = i_15_;
								Class35.anIntArray840[Applet_Sub1.anInt3627] = i_16_;
								Applet_Sub1.anInt3627++;
							}
						}
					}
				Class38_Sub2.aClass2_1768.method12((byte) 66);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "aa.C(" + i + ',' + i_1_ + ')');
		}
	}

	static final Class38_Sub20_Sub9_Sub3 method585(Class17 class17, RSString class19, RSString class19_20_, int i) {
		try {
			if (i != 32554)
				Class81.anInt1619 = 107;
			int i_21_ = class17.method104(3, class19_20_);
			int i_22_ = class17.method118(class19, i_21_, true);
			return WidgetComponent.method647(i_22_, class17, i_21_, -1);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "aa.D(" + (class17 != null ? "{...}" : "null") + ',' + (class19 != null ? "{...}" : "null") + ',' + (class19_20_ != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private Class81(int i, int i_23_, int i_24_) {
		/* empty */
	}
}
