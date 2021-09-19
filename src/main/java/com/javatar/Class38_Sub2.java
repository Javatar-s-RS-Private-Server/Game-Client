package com.javatar;/* Class38_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class38_Sub2 extends Node {
	static Class83 aClass83_1757;
	static RSString aClass19_1759 = null;
	static int anInt1761;
	static RSString aClass19_1763;
	static int anInt1764;
	static RSString aClass19_1766;
	static Class2 aClass2_1768;
	static Class38_Sub6 aClass38_Sub6_1769;
	static int[] anIntArray1770 = new int[25];
	static int anInt1771;
	static RSString aClass19_1773;
	static Class38_Sub6 aClass38_Sub6_1774;

	static {
		Class38_Sub2.aClass19_1763 = RSString.createRSString("<img=0>");
		Class38_Sub2.aClass38_Sub6_1769 = null;
		Class38_Sub2.aClass19_1766 = RSString.createRSString("p11_full");
		Class38_Sub2.anInt1771 = 0;
		Class38_Sub2.aClass83_1757 = new Class83(128);
		Class38_Sub2.aClass19_1773 = RSString.createRSString("mapmarker");
	}

	byte[] aByteArray1756;

	Class38_Sub2(byte[] is) {
		try {
			this.aByteArray1756 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ha.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	public static void method611(byte i) {
		try {
			Class38_Sub2.aClass19_1759 = null;
			Class38_Sub2.aClass38_Sub6_1774 = null;
			Class38_Sub2.aClass83_1757 = null;
			Class38_Sub2.aClass38_Sub6_1769 = null;
			Class38_Sub2.aClass19_1763 = null;
			if (i >= 102) {
				Class38_Sub2.aClass2_1768 = null;
				Class38_Sub2.aClass19_1766 = null;
				Class38_Sub2.aClass19_1773 = null;
				Class38_Sub2.anIntArray1770 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ha.B(" + i + ')');
		}
	}

	static final int method612(int i) {
		try {
			if (i != -21211)
				Class38_Sub2.method612(91);
			int i_0_ = Class35.method317(-5736, client.height, Class11.anInt208, Class2.anInt30);
			if (-Class38_Sub18.anInt2209 + i_0_ < 800 && (Class82.aByteArrayArrayArray1648[client.height][Class11.anInt208 >> 7][Class2.anInt30 >> 7] & 0x4) != 0)
				return client.height;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ha.E(" + i + ')');
		}
	}

	static final void method613(Class38_Sub20_Sub9_Sub1_Sub1 class38_sub20_sub9_sub1_sub1, Class38_Sub20_Sub9_Sub1_Sub1 class38_sub20_sub9_sub1_sub1_1_) {
		try {
			Class38_Sub2.anInt1761++;
			if (Player.aClass38_Sub20_Sub9_Sub3Array3587 == null)
				Player.aClass38_Sub20_Sub9_Sub3Array3587 = ItemDefinition.method929(Class54.aClass19_1209, Class17.indexSprites, Class51.aClass19_1132);
			if (Canvas_Sub1.aClass38_Sub20_Sub9_Sub2Array2511 == null)
				Canvas_Sub1.aClass38_Sub20_Sub9_Sub2Array2511 = Class37.method329(Class51.aClass19_1132, Class38_Sub20_Sub16.aClass19_3092, -11, Class17.indexSprites);
			if (Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829 == null)
				Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829 = Class37.method329(Class51.aClass19_1132, Class83.aClass19_1665, -11, Class17.indexSprites);
			if (Class14.aClass38_Sub20_Sub9_Sub2Array250 == null)
				Class14.aClass38_Sub20_Sub9_Sub2Array250 = Class37.method329(Class51.aClass19_1132, NPC.aClass19_3555, -11, Class17.indexSprites);
			Class38_Sub20_Sub9.method958(0, 23, 765, 480, 0);
			Class38_Sub20_Sub9.method964(0, 0, 125, 23, 12425273, 9135624);
			Class38_Sub20_Sub9.method964(125, 0, 640, 23, 5197647, 2697513);
			class38_sub20_sub9_sub1_sub1.method1086(Class38_Sub20_Sub17.aClass19_3122, 62, 15, 0, -1);
			if (Class14.aClass38_Sub20_Sub9_Sub2Array250 != null) {
				Class14.aClass38_Sub20_Sub9_Sub2Array250[1].method1089(140, 1);
				class38_sub20_sub9_sub1_sub1_1_.method1084(Class11.aClass19_198, 152, 10, 16777215, -1);
				Class14.aClass38_Sub20_Sub9_Sub2Array250[0].method1089(140, 12);
				class38_sub20_sub9_sub1_sub1_1_.method1084(RSString.aClass19_432, 152, 21, 16777215, -1);
			}
			if (Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829 != null) {
				int i = 280;
				if (Class38_Sub4.anIntArray1792[0] == 0 && Class38_Sub1.anIntArray1742[0] == 0)
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[2].method1089(i, 4);
				else
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[0].method1089(i, 4);
				if (Class38_Sub4.anIntArray1792[0] != 0 || Class38_Sub1.anIntArray1742[0] != 1)
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[1].method1089(i + 15, 4);
				else
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[3].method1089(i + 15, 4);
				class38_sub20_sub9_sub1_sub1.method1084(Class38_Sub10_Sub1.aClass19_2631, i + 32, 17, 16777215, -1);
				int i_2_ = 390;
				if (Class38_Sub4.anIntArray1792[0] == 1 && Class38_Sub1.anIntArray1742[0] == 0)
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[2].method1089(i_2_, 4);
				else
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[0].method1089(i_2_, 4);
				int i_3_ = 500;
				int i_4_ = 610;
				if (Class38_Sub4.anIntArray1792[0] == 1 && Class38_Sub1.anIntArray1742[0] == 1)
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[3].method1089(i_2_ + 15, 4);
				else
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[1].method1089(i_2_ + 15, 4);
				class38_sub20_sub9_sub1_sub1.method1084(Class41.aClass19_939, i_2_ + 32, 17, 16777215, -1);
				if (Class38_Sub4.anIntArray1792[0] != 2 || Class38_Sub1.anIntArray1742[0] != 0)
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[0].method1089(i_3_, 4);
				else
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[2].method1089(i_3_, 4);
				if (Class38_Sub4.anIntArray1792[0] != 2 || Class38_Sub1.anIntArray1742[0] != 1)
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[1].method1089(i_3_ + 15, 4);
				else
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[3].method1089(i_3_ + 15, 4);
				class38_sub20_sub9_sub1_sub1.method1084(Class38_Sub20_Sub8.aClass19_2875, i_3_ + 32, 17, 16777215, -1);
				if (Class38_Sub4.anIntArray1792[0] == 3 && Class38_Sub1.anIntArray1742[0] == 0)
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[2].method1089(i_4_, 4);
				else
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[0].method1089(i_4_, 4);
				if (Class38_Sub4.anIntArray1792[0] == 3 && Class38_Sub1.anIntArray1742[0] == 1)
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[3].method1089(i_4_ + 15, 4);
				else
					Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829[1].method1089(i_4_ + 15, 4);
				class38_sub20_sub9_sub1_sub1.method1084(Class76.aClass19_1489, i_4_ + 32, 17, 16777215, -1);
			}
			Class38_Sub20_Sub9.method958(708, 4, 50, 16, 0);
			class38_sub20_sub9_sub1_sub1_1_.method1086(Class38_Sub14.aClass19_2137, 733, 16, 16777215, -1);
			Class47.anInt1059 = -1;
			if (Player.aClass38_Sub20_Sub9_Sub3Array3587 != null) {
				int i = 88;
				int i_5_ = 19;
				int i_6_ = 765 / (i + 1);
				int i_7_ = 480 / (i_5_ + 1);
				int i_8_;
				int i_9_;
				do {
					i_8_ = i_7_;
					i_9_ = i_6_;
					if (i_7_ * (i_6_ - 1) >= Class49.anInt1089)
						i_6_--;
					if (Class49.anInt1089 <= (i_7_ - 1) * i_6_)
						i_7_--;
					if (Class49.anInt1089 <= (i_7_ - 1) * i_6_)
						i_7_--;
				} while (i_7_ != i_8_ || i_6_ != i_9_);
				i_9_ = (-(i_5_ * i_7_) + 480) / (i_7_ + 1);
				if (i_9_ > 5)
					i_9_ = 5;
				i_8_ = (-(i * i_6_) + 765) / (i_6_ + 1);
				if (i_8_ > 5)
					i_8_ = 5;
				int i_10_ = (-(i * i_6_) + -(i_8_ * (i_6_ - 1)) + 765) / 2;
				int i_11_ = (-(i_9_ * (i_7_ - 1)) + -(i_5_ * i_7_) + 480) / 2;
				int i_12_ = i_11_ + 23;
				int i_13_ = i_10_;
				int i_14_ = 0;
				for (int i_15_ = 0; Class49.anInt1089 > i_15_; i_15_++) {
					Class4 class4 = Sequence.aClass4Array2736[i_15_];
					boolean bool_16_ = true;
					RSString class19 = RuntimeException_Sub1.method1098(class4.anInt80, 0);
					if (class4.anInt80 != -1) {
						if (class4.anInt80 > 1980) {
							class19 = Class67.aClass19_1384;
							bool_16_ = false;
						}
					} else {
						class19 = Class38_Sub20_Sub8.aClass19_2869;
						bool_16_ = false;
					}
					if (i_13_ <= Class23.anInt543 && Class45.anInt1015 >= i_12_ && i + i_13_ > Class23.anInt543 && Class45.anInt1015 < i_5_ + i_12_ && bool_16_) {
						Class47.anInt1059 = i_15_;
						Player.aClass38_Sub20_Sub9_Sub3Array3587[!class4.aBool83 ? 0 : 1].method1122(i_13_, i_12_);
					} else
						Player.aClass38_Sub20_Sub9_Sub3Array3587[class4.aBool83 ? 1 : 0].method1123(i_13_, i_12_);
					if (Canvas_Sub1.aClass38_Sub20_Sub9_Sub2Array2511 != null)
						Canvas_Sub1.aClass38_Sub20_Sub9_Sub2Array2511[(class4.aBool83 ? 8 : 0) + class4.anInt77].method1089(i_13_ + 29, i_12_);
					class38_sub20_sub9_sub1_sub1.method1086(RuntimeException_Sub1.method1098(class4.anInt86, 0), i_13_ + 15, i_5_ / 2 + i_12_ + 5, 0, -1);
					class38_sub20_sub9_sub1_sub1_1_.method1086(class19, i_13_ + 60, i_12_ + i_5_ / 2 + 5, 268435455, -1);
					i_12_ += i_9_ + i_5_;
					if (i_7_ <= ++i_14_) {
						i_12_ = 23 + i_11_;
						i_14_ = 0;
						i_13_ += i_8_ + i;
					}
				}
			}
			do {
				try {
					Graphics graphics = Class38_Sub3.aCanvas1783.getGraphics();
					Class38_Sub2.aClass2_1768.method13(graphics);
					if (!false)
						break;
					Class38_Sub2.method611((byte) 97);
				} catch (Exception exception) {
					Class38_Sub3.aCanvas1783.repaint();
					break;
				}
				break;
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ha.D(" + (class38_sub20_sub9_sub1_sub1 != null ? "{...}" : "null") + ',' + false + ',' + (class38_sub20_sub9_sub1_sub1_1_ != null ? "{...}" : "null") + ')');
		}
	}

	static final void method614(int i, int i_17_, int[] is, int i_18_, int[] is_19_, Class4[] class4s) {
		do {
			try {
				if (i < i_17_) {
					int i_20_ = i_17_ + 1;
					int i_21_ = (i + i_17_) / 2;
					Class4 class4 = class4s[i_21_];
					class4s[i_21_] = class4s[i];
					int i_22_ = i - 1;
					class4s[i] = class4;
					while (i_22_ < i_20_) {
						boolean bool = true;
						do {
							i_20_--;
							for (int i_23_ = 0; i_23_ < 4; i_23_++) {
								int i_24_;
								int i_25_;
								if (is_19_[i_23_] != 2) {
									if (is_19_[i_23_] == 1) {
										i_25_ = class4s[i_20_].anInt80;
										i_24_ = class4.anInt80;
										if (i_25_ == -1 && is[i_23_] == 1)
											i_25_ = 2001;
										if (i_24_ == -1 && is[i_23_] == 1)
											i_24_ = 2001;
									} else if (is_19_[i_23_] == 3) {
										i_25_ = class4s[i_20_].aBool83 ? 1 : 0;
										i_24_ = !class4.aBool83 ? 0 : 1;
									} else {
										i_24_ = class4.anInt86;
										i_25_ = class4s[i_20_].anInt86;
									}
								} else {
									i_24_ = class4.anInt88;
									i_25_ = class4s[i_20_].anInt88;
								}
								if (i_25_ == i_24_) {
									if (i_23_ == 3)
										bool = false;
								} else {
									if ((is[i_23_] != 1 || i_25_ <= i_24_) && (is[i_23_] != 0 || i_24_ <= i_25_))
										bool = false;
									break;
								}
							}
						} while (bool);
						bool = true;
						do {
							i_22_++;
							for (int i_26_ = 0; i_26_ < 4; i_26_++) {
								int i_27_;
								int i_28_;
								if (is_19_[i_26_] != 2) {
									if (is_19_[i_26_] == 1) {
										i_27_ = class4.anInt80;
										if (i_27_ == -1 && is[i_26_] == 1)
											i_27_ = 2001;
										i_28_ = class4s[i_22_].anInt80;
										if (i_28_ == -1 && is[i_26_] == 1)
											i_28_ = 2001;
									} else if (is_19_[i_26_] == 3) {
										i_28_ = class4s[i_22_].aBool83 ? 1 : 0;
										i_27_ = !class4.aBool83 ? 0 : 1;
									} else {
										i_27_ = class4.anInt86;
										i_28_ = class4s[i_22_].anInt86;
									}
								} else {
									i_27_ = class4.anInt88;
									i_28_ = class4s[i_22_].anInt88;
								}
								if (i_27_ == i_28_) {
									if (i_26_ == 3)
										bool = false;
								} else {
									if ((is[i_26_] != 1 || i_27_ <= i_28_) && (is[i_26_] != 0 || i_27_ >= i_28_))
										bool = false;
									break;
								}
							}
						} while (bool);
						if (i_22_ < i_20_) {
							Class4 class4_29_ = class4s[i_22_];
							class4s[i_22_] = class4s[i_20_];
							class4s[i_20_] = class4_29_;
						}
					}
					Class38_Sub2.method614(i, i_20_, is, 79, is_19_, class4s);
					Class38_Sub2.method614(i_20_ + 1, i_17_, is, 56, is_19_, class4s);
				}
				if (i_18_ > 36)
					break;
				Class38_Sub2.aClass19_1763 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ha.C(" + i + ',' + i_17_ + ',' + (is != null ? "{...}" : "null") + ',' + i_18_ + ',' + (is_19_ != null ? "{...}" : "null") + ',' + (class4s != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static final int method615(int i, int i_30_) {
		try {
			if (i_30_ < 58)
				Class38_Sub2.method613(null, null);
			return (i & 0xee910) >> 17;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ha.F(" + i + ',' + i_30_ + ')');
		}
	}

	static final Class38_Sub20_Sub14 method616(int i_31_) {
		try {
			Class38_Sub20_Sub14 class38_sub20_sub14 = (Class38_Sub20_Sub14) Class80.aClass83_1608.method591(4 - 28829, i_31_);
			if (class38_sub20_sub14 != null)
				return class38_sub20_sub14;
			byte[] is = Class38_Sub20_Sub17.aClass17_3113.method109(4, i_31_, 4 ^ ~0x4e);
			class38_sub20_sub14 = new Class38_Sub20_Sub14();
			if (is != null)
				class38_sub20_sub14.method1000(-28563, new RS2Buffer(is), i_31_);
			class38_sub20_sub14.method999();
			Class80.aClass83_1608.method590(i_31_, (byte) -122, class38_sub20_sub14);
			return class38_sub20_sub14;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ha.G(" + 4 + ',' + i_31_ + ')');
		}
	}

	static final void method617() {
		do {
			try {
				for (int i_32_ = -1; ItemDefinition.anInt2783 > i_32_; i_32_++) {
					int i_33_;
					if (i_32_ != -1)
						i_33_ = Class47.anIntArray1055[i_32_];
					else
						i_33_ = 2047;
					Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_33_];
					if (class38_sub20_sub3_sub7_sub2 != null && class38_sub20_sub3_sub7_sub2.anInt3452 > 0) {
						class38_sub20_sub3_sub7_sub2.anInt3452--;
						if (class38_sub20_sub3_sub7_sub2.anInt3452 == 0)
							class38_sub20_sub3_sub7_sub2.aClass19_3467 = null;
					}
				}
				for (int i_34_ = 0; i_34_ < Class4.anInt87; i_34_++) {
					int i_35_ = Class38_Sub10_Sub1.anIntArray2652[i_34_];
					NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_35_];
					if (class38_sub20_sub3_sub7_sub1 != null && class38_sub20_sub3_sub7_sub1.anInt3452 > 0) {
						class38_sub20_sub3_sub7_sub1.anInt3452--;
						if (class38_sub20_sub3_sub7_sub1.anInt3452 == 0)
							class38_sub20_sub3_sub7_sub1.aClass19_3467 = null;
					}
				}
				if (-17471 == -17471)
					break;
				Class38_Sub2.method612(65);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ha.A(" + -17471 + ')');
			}
			break;
		} while (false);
	}
}
