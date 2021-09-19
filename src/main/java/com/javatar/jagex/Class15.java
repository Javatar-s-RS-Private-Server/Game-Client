package com.javatar.jagex;/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

final class Class15 {
	static int anInt272;
	int anInt273;
	static PacketBuffer inputStream;
	static volatile int anInt277;
	boolean aBool278 = true;
	int anInt279;
	static int anInt280 = 0;
	private static RSString aClass19_282;
	static volatile boolean aBool283;
	static int[] anIntArray284;
	int anInt285;
	private static RSString aClass19_286;
	static RSString aClass19_287;
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array288;
	static RSString aClass19_289;
	private static RSString[] aClass19Array290;
	static int anInt291;
	static RSString aClass19_292;
	static Class38_Sub6 aClass38_Sub6_293;
	int anInt294;
	int anInt295;
	int anInt297;
	static Class17 aClass17_298;
	static Class17 aClass17_299;
	static int anInt300;
	static int anInt301;
	static int anInt302;
	private static RSString aClass19_303;
	static RSString aClass19_304;
	static RSString aClass19_305;
	static RSString aClass19_306;

	static final void method83(boolean bool) {
		do
			try {
				if (bool != true)
					Class15.anInt277 = -51;
				try {
					if (Class38_Sub1.anInt1741 != 1)
						break;
					int i = Class35.aClass38_Sub10_Sub1_849.method861(15);
					if (i > 0 && Class35.aClass38_Sub10_Sub1_849.method841(-12)) {
						i -= Class38_Sub18.anInt2214;
						if (i < 0)
							i = 0;
						Class35.aClass38_Sub10_Sub1_849.method840(-19402, i);
					} else {
						Class35.aClass38_Sub10_Sub1_849.method863(21828);
						Class35.aClass38_Sub10_Sub1_849.method842((byte) 115);
						RuntimeException_Sub1.aClass79_3279 = null;
						if (Class38_Sub20_Sub8.aClass17_2872 == null)
							Class38_Sub1.anInt1741 = 0;
						else
							Class38_Sub1.anInt1741 = 2;
						Class58.aClass38_Sub24_1285 = null;
					}
				} catch (Exception exception) {
					exception.printStackTrace();
					Class35.aClass38_Sub10_Sub1_849.method863(21828);
					RuntimeException_Sub1.aClass79_3279 = null;
					Class38_Sub1.anInt1741 = 0;
					Class58.aClass38_Sub24_1285 = null;
					Class38_Sub20_Sub8.aClass17_2872 = null;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "we.A(" + bool + ')');
			}
		while (false);
	}

	static final void method84(Class38_Sub19 class38_sub19, byte i) {
		try {
			Object[] objects = class38_sub19.anObjectArray2240;
			int i_0_ = ((Integer) objects[0]).intValue();
			Class38_Sub20_Sub10 class38_sub20_sub10 = RSString.method179(true, i_0_);
			if (class38_sub20_sub10 != null) {
				Class45.anInt1032 = 0;
				int i_1_ = 0;
				int i_2_ = 0;
				int[] is = class38_sub20_sub10.anIntArray2898;
				int[] is_3_ = class38_sub20_sub10.anIntArray2903;
				if (i <= -65) {
					int i_4_ = -1;
					int i_5_ = -1;
					try {
						Class38_Sub12.aClass19Array2108 = new RSString[class38_sub20_sub10.anInt2897];
						int i_6_ = 0;
						Class82.anIntArray1645 = new int[class38_sub20_sub10.anInt2892];
						int i_7_ = 0;
						for (int i_8_ = 1; i_8_ < objects.length; i_8_++)
							if (!(objects[i_8_] instanceof Integer)) {
								if (objects[i_8_] instanceof RSString) {
									RSString class19 = (RSString) objects[i_8_];
									if (class19.method175(true, Class5.aClass19_96))
										class19 = class38_sub19.aClass19_2235;
									Class38_Sub12.aClass19Array2108[i_7_++] = class19;
								}
							} else {
								int i_9_ = ((Integer) objects[i_8_]).intValue();
								if (i_9_ == -2147483647)
									i_9_ = class38_sub19.anInt2236;
								if (i_9_ == -2147483646)
									i_9_ = class38_sub19.anInt2242;
								if (i_9_ == -2147483645)
									i_9_ = class38_sub19.aClass38_Sub6_2241 == null ? -1 : class38_sub19.aClass38_Sub6_2241.anInt1856;
								if (i_9_ == -2147483644)
									i_9_ = class38_sub19.anInt2237;
								if (i_9_ == -2147483643)
									i_9_ = class38_sub19.aClass38_Sub6_2241 == null ? -1 : class38_sub19.aClass38_Sub6_2241.anInt1941;
								if (i_9_ == -2147483642)
									i_9_ = class38_sub19.aClass38_Sub6_2234 != null ? class38_sub19.aClass38_Sub6_2234.anInt1856 : -1;
								if (i_9_ == -2147483641)
									i_9_ = class38_sub19.aClass38_Sub6_2234 == null ? -1 : class38_sub19.aClass38_Sub6_2234.anInt1941;
								if (i_9_ == -2147483640)
									i_9_ = class38_sub19.anInt2231;
								if (i_9_ == -2147483639)
									i_9_ = class38_sub19.anInt2239;
								Class82.anIntArray1645[i_6_++] = i_9_;
							}
						int i_10_ = 0;
						for (;;) {
							if (++i_10_ > 200000)
								throw new RuntimeException("slow");
							i_4_ = is[++i_5_];
							if (i_4_ < 100) {
								if (i_4_ == 0) {
									Class38_Sub11.anIntArray2096[i_2_++] = is_3_[i_5_];
									continue;
								}
								if (i_4_ == 1) {
									int i_11_ = is_3_[i_5_];
									Class38_Sub11.anIntArray2096[i_2_++] = Class21.anIntArray528[i_11_];
									continue;
								}
								if (i_4_ == 2) {
									int i_12_ = is_3_[i_5_];
									Class21.anIntArray528[i_12_] = Class38_Sub11.anIntArray2096[--i_2_];
									continue;
								}
								if (i_4_ == 3) {
									Class37.aClass19Array875[i_1_++] = class38_sub20_sub10.aClass19Array2901[i_5_];
									continue;
								}
								if (i_4_ == 6) {
									i_5_ += is_3_[i_5_];
									continue;
								}
								if (i_4_ == 7) {
									i_2_ -= 2;
									if (Class38_Sub11.anIntArray2096[i_2_] != Class38_Sub11.anIntArray2096[i_2_ + 1])
										i_5_ += is_3_[i_5_];
									continue;
								}
								if (i_4_ == 8) {
									i_2_ -= 2;
									if (Class38_Sub11.anIntArray2096[i_2_] == Class38_Sub11.anIntArray2096[i_2_ + 1])
										i_5_ += is_3_[i_5_];
									continue;
								}
								if (i_4_ == 9) {
									i_2_ -= 2;
									if (Class38_Sub11.anIntArray2096[i_2_ + 1] > Class38_Sub11.anIntArray2096[i_2_])
										i_5_ += is_3_[i_5_];
									continue;
								}
								if (i_4_ == 10) {
									i_2_ -= 2;
									if (Class38_Sub11.anIntArray2096[i_2_] > Class38_Sub11.anIntArray2096[i_2_ + 1])
										i_5_ += is_3_[i_5_];
									continue;
								}
								if (i_4_ == 21) {
									if (Class45.anInt1032 != 0) {
										Class61 class61 = Class37.aClass61Array872[--Class45.anInt1032];
										Class38_Sub12.aClass19Array2108 = class61.aClass19Array1323;
										i_5_ = class61.anInt1327;
										class38_sub20_sub10 = class61.aClass38_Sub20_Sub10_1328;
										is = class38_sub20_sub10.anIntArray2898;
										Class82.anIntArray1645 = class61.anIntArray1324;
										is_3_ = class38_sub20_sub10.anIntArray2903;
										continue;
									}
									return;
								}
								if (i_4_ == 25) {
									int i_13_ = is_3_[i_5_];
									Class38_Sub11.anIntArray2096[i_2_++] = Player.method1206((byte) -98, i_13_);
									continue;
								}
								if (i_4_ == 27) {
									int i_14_ = is_3_[i_5_];
									RuntimeException_Sub1.method1097(Class38_Sub11.anIntArray2096[--i_2_], (byte) -75, i_14_);
									continue;
								}
								if (i_4_ == 31) {
									i_2_ -= 2;
									if (Class38_Sub11.anIntArray2096[i_2_] <= Class38_Sub11.anIntArray2096[i_2_ + 1])
										i_5_ += is_3_[i_5_];
									continue;
								}
								if (i_4_ == 32) {
									i_2_ -= 2;
									if (Class38_Sub11.anIntArray2096[i_2_ + 1] <= Class38_Sub11.anIntArray2096[i_2_])
										i_5_ += is_3_[i_5_];
									continue;
								}
								if (i_4_ == 33) {
									Class38_Sub11.anIntArray2096[i_2_++] = Class82.anIntArray1645[is_3_[i_5_]];
									continue;
								}
								if (i_4_ == 34) {
									Class82.anIntArray1645[is_3_[i_5_]] = Class38_Sub11.anIntArray2096[--i_2_];
									continue;
								}
								if (i_4_ == 35) {
									Class37.aClass19Array875[i_1_++] = Class38_Sub12.aClass19Array2108[is_3_[i_5_]];
									continue;
								}
								if (i_4_ == 36) {
									Class38_Sub12.aClass19Array2108[is_3_[i_5_]] = Class37.aClass19Array875[--i_1_];
									continue;
								}
								if (i_4_ == 37) {
									int i_15_ = is_3_[i_5_];
									i_1_ -= i_15_;
									RSString class19 = Class24.method206(Class37.aClass19Array875, i_15_, i_1_, (byte) -128);
									Class37.aClass19Array875[i_1_++] = class19;
									continue;
								}
								if (i_4_ == 38) {
									i_2_--;
									continue;
								}
								if (i_4_ == 39) {
									i_1_--;
									continue;
								}
								if (i_4_ == 40) {
									int i_16_ = is_3_[i_5_];
									Class38_Sub20_Sub10 class38_sub20_sub10_17_ = RSString.method179(true, i_16_);
									int[] is_18_ = new int[class38_sub20_sub10_17_.anInt2892];
									RSString[] class19s = new RSString[class38_sub20_sub10_17_.anInt2897];
									for (int i_19_ = 0; i_19_ < class38_sub20_sub10_17_.anInt2900; i_19_++)
										is_18_[i_19_] = Class38_Sub11.anIntArray2096[-class38_sub20_sub10_17_.anInt2900 + i_2_ + i_19_];
									for (int i_20_ = 0; i_20_ < class38_sub20_sub10_17_.anInt2896; i_20_++)
										class19s[i_20_] = Class37.aClass19Array875[-class38_sub20_sub10_17_.anInt2896 + i_1_ + i_20_];
									i_1_ -= class38_sub20_sub10_17_.anInt2896;
									i_2_ -= class38_sub20_sub10_17_.anInt2900;
									Class61 class61 = new Class61();
									class61.anInt1327 = i_5_;
									class61.aClass38_Sub20_Sub10_1328 = class38_sub20_sub10;
									i_5_ = -1;
									class61.aClass19Array1323 = Class38_Sub12.aClass19Array2108;
									class38_sub20_sub10 = class38_sub20_sub10_17_;
									class61.anIntArray1324 = Class82.anIntArray1645;
									Class37.aClass61Array872[Class45.anInt1032++] = class61;
									Class82.anIntArray1645 = is_18_;
									is = class38_sub20_sub10.anIntArray2898;
									Class38_Sub12.aClass19Array2108 = class19s;
									is_3_ = class38_sub20_sub10.anIntArray2903;
									continue;
								}
								if (i_4_ == 42) {
									Class38_Sub11.anIntArray2096[i_2_++] = Class62.anIntArray1345[is_3_[i_5_]];
									continue;
								}
								if (i_4_ == 43) {
									Class62.anIntArray1345[is_3_[i_5_]] = Class38_Sub11.anIntArray2096[--i_2_];
									continue;
								}
								if (i_4_ == 44) {
									int i_21_ = is_3_[i_5_] >> 1673997104;
									int i_22_ = is_3_[i_5_] & 0xffff;
									int i_23_ = Class38_Sub11.anIntArray2096[--i_2_];
									if (i_23_ < 0 || i_23_ > 5000)
										throw new RuntimeException();
									Class38_Sub20_Sub2.anIntArray2536[i_21_] = i_23_;
									int i_24_ = -1;
									if (i_22_ == 105)
										i_24_ = 0;
									for (int i_25_ = 0; i_25_ < i_23_; i_25_++)
										Class41.anIntArrayArray926[i_21_][i_25_] = i_24_;
									continue;
								}
								if (i_4_ == 45) {
									int i_26_ = is_3_[i_5_];
									int i_27_ = Class38_Sub11.anIntArray2096[--i_2_];
									if (i_27_ < 0 || i_27_ >= Class38_Sub20_Sub2.anIntArray2536[i_26_])
										throw new RuntimeException();
									Class38_Sub11.anIntArray2096[i_2_++] = Class41.anIntArrayArray926[i_26_][i_27_];
									continue;
								}
								if (i_4_ == 46) {
									int i_28_ = is_3_[i_5_];
									i_2_ -= 2;
									int i_29_ = Class38_Sub11.anIntArray2096[i_2_];
									if (i_29_ < 0 || Class38_Sub20_Sub2.anIntArray2536[i_28_] <= i_29_)
										throw new RuntimeException();
									Class41.anIntArrayArray926[i_28_][i_29_] = Class38_Sub11.anIntArray2096[i_2_ + 1];
									continue;
								}
								if (i_4_ == 47) {
									RSString class19 = Class15.aClass19Array290[is_3_[i_5_]];
									if (class19 == null)
										class19 = Class24.aClass19_568;
									Class37.aClass19Array875[i_1_++] = class19;
									continue;
								}
								if (i_4_ == 48) {
									Class15.aClass19Array290[is_3_[i_5_]] = Class37.aClass19Array875[--i_1_];
									continue;
								}
							}
							boolean bool;
							if (is_3_[i_5_] == 1)
								bool = true;
							else
								bool = false;
							if (i_4_ < 1000) {
								if (i_4_ == 100) {
									i_2_ -= 3;
									int i_30_ = Class38_Sub11.anIntArray2096[i_2_];
									int i_31_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
									int i_32_ = Class38_Sub11.anIntArray2096[i_2_ + 2];
									if (i_31_ == 0)
										throw new RuntimeException();
									Class38_Sub6 class38_sub6 = Projectile.method1167(i_30_, -104);
									if (class38_sub6.aClass38_Sub6Array1867 == null)
										class38_sub6.aClass38_Sub6Array1867 = new Class38_Sub6[i_32_ + 1];
									if (i_32_ >= class38_sub6.aClass38_Sub6Array1867.length) {
										Class38_Sub6[] class38_sub6s = new Class38_Sub6[i_32_ + 1];
										for (int i_33_ = 0; i_33_ < class38_sub6.aClass38_Sub6Array1867.length; i_33_++)
											class38_sub6s[i_33_] = class38_sub6.aClass38_Sub6Array1867[i_33_];
										class38_sub6.aClass38_Sub6Array1867 = class38_sub6s;
									}
									if (i_32_ > 0 && class38_sub6.aClass38_Sub6Array1867[i_32_ - 1] == null)
										throw new RuntimeException("Gap at:" + (i_32_ - 1));
									Class38_Sub6 class38_sub6_34_ = new Class38_Sub6();
									class38_sub6_34_.anInt1868 = i_31_;
									class38_sub6_34_.aBool1961 = true;
									class38_sub6_34_.anInt1941 = i_32_;
									class38_sub6_34_.anInt1977 = class38_sub6_34_.anInt1856 = class38_sub6.anInt1856;
									class38_sub6.aClass38_Sub6Array1867[i_32_] = class38_sub6_34_;
									if (bool)
										Class83.aClass38_Sub6_1657 = class38_sub6_34_;
									else
										Class13.aClass38_Sub6_245 = class38_sub6_34_;
									Class40.method340(class38_sub6, (byte) -127);
								} else if (i_4_ == 101) {
									Class38_Sub6 class38_sub6 = !bool ? Class13.aClass38_Sub6_245 : Class83.aClass38_Sub6_1657;
									Class38_Sub6 class38_sub6_35_ = Projectile.method1167(class38_sub6.anInt1856, 67);
									class38_sub6_35_.aClass38_Sub6Array1867[class38_sub6.anInt1941] = null;
									Class40.method340(class38_sub6_35_, (byte) -121);
								} else if (i_4_ == 102) {
									Class38_Sub6 class38_sub6 = Projectile.method1167(Class38_Sub11.anIntArray2096[--i_2_], -111);
									class38_sub6.aClass38_Sub6Array1867 = null;
									Class40.method340(class38_sub6, (byte) -109);
								} else {
									if (i_4_ != 200)
										break;
									i_2_ -= 2;
									int i_36_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
									int i_37_ = Class38_Sub11.anIntArray2096[i_2_];
									Class38_Sub6 class38_sub6 = Class38_Sub20_Sub12.method987(i_36_, i_37_, (byte) -29);
									if (class38_sub6 != null && i_36_ != -1) {
										Class38_Sub11.anIntArray2096[i_2_++] = 1;
										if (bool)
											Class83.aClass38_Sub6_1657 = class38_sub6;
										else
											Class13.aClass38_Sub6_245 = class38_sub6;
									} else
										Class38_Sub11.anIntArray2096[i_2_++] = 0;
								}
							} else if ((i_4_ < 1000 || i_4_ >= 1100) && (i_4_ < 2000 || i_4_ >= 2100)) {
								if (i_4_ >= 1100 && i_4_ < 1200 || i_4_ >= 2100 && i_4_ < 2200) {
									Class38_Sub6 class38_sub6;
									if (i_4_ >= 2000) {
										i_4_ -= 1000;
										class38_sub6 = Projectile.method1167(Class38_Sub11.anIntArray2096[--i_2_], -126);
									} else
										class38_sub6 = bool ? Class83.aClass38_Sub6_1657 : Class13.aClass38_Sub6_245;
									if (i_4_ == 1100) {
										i_2_ -= 2;
										class38_sub6.anInt1956 = Class38_Sub11.anIntArray2096[i_2_];
										if (class38_sub6.anInt1973 - class38_sub6.anInt1923 < class38_sub6.anInt1956)
											class38_sub6.anInt1956 = -class38_sub6.anInt1923 + class38_sub6.anInt1973;
										if (class38_sub6.anInt1956 < 0)
											class38_sub6.anInt1956 = 0;
										class38_sub6.anInt1985 = Class38_Sub11.anIntArray2096[i_2_ + 1];
										if (class38_sub6.anInt1985 > class38_sub6.anInt1933 - class38_sub6.anInt1886)
											class38_sub6.anInt1985 = -class38_sub6.anInt1886 + class38_sub6.anInt1933;
										if (class38_sub6.anInt1985 < 0)
											class38_sub6.anInt1985 = 0;
										Class40.method340(class38_sub6, (byte) -111);
									} else if (i_4_ == 1101) {
										class38_sub6.anInt1889 = Class38_Sub11.anIntArray2096[--i_2_];
										Class40.method340(class38_sub6, (byte) -123);
									} else if (i_4_ == 1102) {
										class38_sub6.aBool1916 = Class38_Sub11.anIntArray2096[--i_2_] == 1;
										Class40.method340(class38_sub6, (byte) -125);
									} else if (i_4_ == 1103) {
										class38_sub6.anInt1974 = Class38_Sub11.anIntArray2096[--i_2_];
										Class40.method340(class38_sub6, (byte) -107);
									} else if (i_4_ == 1104) {
										class38_sub6.anInt1901 = Class38_Sub11.anIntArray2096[--i_2_];
										Class40.method340(class38_sub6, (byte) -116);
									} else if (i_4_ == 1105) {
										class38_sub6.anInt1932 = Class38_Sub11.anIntArray2096[--i_2_];
										Class40.method340(class38_sub6, (byte) -120);
									} else if (i_4_ == 1106) {
										class38_sub6.anInt1890 = Class38_Sub11.anIntArray2096[--i_2_];
										Class40.method340(class38_sub6, (byte) -107);
									} else if (i_4_ == 1107) {
										class38_sub6.aBool1861 = Class38_Sub11.anIntArray2096[--i_2_] == 1;
										Class40.method340(class38_sub6, (byte) -127);
									} else if (i_4_ == 1108) {
										class38_sub6.anInt1883 = 1;
										class38_sub6.anInt1962 = Class38_Sub11.anIntArray2096[--i_2_];
										Class40.method340(class38_sub6, (byte) -100);
									} else if (i_4_ == 1109) {
										i_2_ -= 6;
										class38_sub6.anInt1929 = Class38_Sub11.anIntArray2096[i_2_];
										class38_sub6.anInt1964 = Class38_Sub11.anIntArray2096[i_2_ + 1];
										class38_sub6.anInt1925 = Class38_Sub11.anIntArray2096[i_2_ + 2];
										class38_sub6.anInt1987 = Class38_Sub11.anIntArray2096[i_2_ + 3];
										class38_sub6.anInt1863 = Class38_Sub11.anIntArray2096[i_2_ + 4];
										class38_sub6.anInt1921 = Class38_Sub11.anIntArray2096[i_2_ + 5];
										Class40.method340(class38_sub6, (byte) -126);
									} else if (i_4_ == 1110) {
										int i_38_ = Class38_Sub11.anIntArray2096[--i_2_];
										if (i_38_ != class38_sub6.anInt1878) {
											class38_sub6.anInt1952 = 0;
											class38_sub6.anInt1875 = 0;
											class38_sub6.anInt1878 = i_38_;
											Class40.method340(class38_sub6, (byte) -120);
										}
									} else if (i_4_ == 1111) {
										class38_sub6.aBool1966 = Class38_Sub11.anIntArray2096[--i_2_] == 1;
										Class40.method340(class38_sub6, (byte) -101);
									} else if (i_4_ == 1112) {
										RSString class19 = Class37.aClass19Array875[--i_1_];
										if (!class19.method175(true, class38_sub6.aClass19_1876)) {
											class38_sub6.aClass19_1876 = class19;
											Class40.method340(class38_sub6, (byte) -128);
										}
									} else if (i_4_ == 1113) {
										class38_sub6.anInt1920 = Class38_Sub11.anIntArray2096[--i_2_];
										Class40.method340(class38_sub6, (byte) -109);
									} else if (i_4_ == 1114) {
										i_2_ -= 3;
										class38_sub6.anInt1954 = Class38_Sub11.anIntArray2096[i_2_];
										class38_sub6.anInt1912 = Class38_Sub11.anIntArray2096[i_2_ + 1];
										class38_sub6.anInt1951 = Class38_Sub11.anIntArray2096[i_2_ + 2];
										Class40.method340(class38_sub6, (byte) -104);
									} else if (i_4_ == 1115) {
										class38_sub6.aBool1969 = Class38_Sub11.anIntArray2096[--i_2_] == 1;
										Class40.method340(class38_sub6, (byte) -107);
									} else if (i_4_ == 1116) {
										class38_sub6.anInt1909 = Class38_Sub11.anIntArray2096[--i_2_];
										Class40.method340(class38_sub6, (byte) -111);
									} else if (i_4_ == 1117) {
										class38_sub6.anInt1930 = Class38_Sub11.anIntArray2096[--i_2_];
										Class40.method340(class38_sub6, (byte) -123);
									} else if (i_4_ == 1118) {
										class38_sub6.aBool1927 = Class38_Sub11.anIntArray2096[--i_2_] == 1;
										Class40.method340(class38_sub6, (byte) -127);
									} else if (i_4_ == 1119) {
										class38_sub6.aBool1885 = Class38_Sub11.anIntArray2096[--i_2_] == 1;
										Class40.method340(class38_sub6, (byte) -118);
									} else {
										if (i_4_ != 1120)
											break;
										i_2_ -= 2;
										class38_sub6.anInt1973 = Class38_Sub11.anIntArray2096[i_2_];
										class38_sub6.anInt1933 = Class38_Sub11.anIntArray2096[i_2_ + 1];
										Class40.method340(class38_sub6, (byte) -119);
									}
								} else if (i_4_ >= 1200 && i_4_ < 1300 || i_4_ >= 2200 && i_4_ < 2300) {
									Class38_Sub6 class38_sub6;
									if (i_4_ < 2000)
										class38_sub6 = bool ? Class83.aClass38_Sub6_1657 : Class13.aClass38_Sub6_245;
									else {
										i_4_ -= 1000;
										class38_sub6 = Projectile.method1167(Class38_Sub11.anIntArray2096[--i_2_], -127);
									}
									Class40.method340(class38_sub6, (byte) -109);
									if (i_4_ == 1200) {
										i_2_ -= 2;
										int i_39_ = Class38_Sub11.anIntArray2096[i_2_];
										int i_40_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
										class38_sub6.anInt1899 = i_40_;
										class38_sub6.anInt1917 = i_39_;
										ItemDefinition class38_sub20_sub6 = Node.forId(i_39_, 28);
										class38_sub6.anInt1987 = class38_sub20_sub6.anInt2795;
										class38_sub6.anInt1925 = class38_sub20_sub6.anInt2805;
										class38_sub6.anInt1921 = class38_sub20_sub6.anInt2770;
										class38_sub6.anInt1964 = class38_sub20_sub6.modelOffsetY;
										class38_sub6.anInt1863 = class38_sub20_sub6.anInt2753;
										if (class38_sub6.anInt1923 > 0)
											class38_sub6.anInt1921 = class38_sub6.anInt1921 * 32 / class38_sub6.anInt1923;
										class38_sub6.anInt1929 = class38_sub20_sub6.modelOffsetX;
									} else if (i_4_ == 1201) {
										class38_sub6.anInt1883 = 2;
										class38_sub6.anInt1962 = Class38_Sub11.anIntArray2096[--i_2_];
									} else {
										if (i_4_ != 1202)
											break;
										class38_sub6.anInt1883 = 3;
										class38_sub6.anInt1962 = Client.myPlayer.appearance.method137(-127);
									}
								} else if ((i_4_ < 1300 || i_4_ >= 1400) && (i_4_ < 2300 || i_4_ >= 2400)) {
									if (i_4_ >= 1400 && i_4_ < 1500 || i_4_ >= 2400 && i_4_ < 2500) {
										Class38_Sub6 class38_sub6;
										if (i_4_ < 2000)
											class38_sub6 = !bool ? Class13.aClass38_Sub6_245 : Class83.aClass38_Sub6_1657;
										else {
											class38_sub6 = Projectile.method1167(Class38_Sub11.anIntArray2096[--i_2_], -112);
											i_4_ -= 1000;
										}
										RSString class19 = Class37.aClass19Array875[--i_1_];
										int[] is_41_ = null;
										if (class19.method143((byte) 83) > 0 && class19.method163(-127, class19.method143((byte) 67) - 1) == 89) {
											int i_42_ = Class38_Sub11.anIntArray2096[--i_2_];
											if (i_42_ > 0) {
												is_41_ = new int[i_42_];
												while (i_42_-- > 0)
													is_41_[i_42_] = Class38_Sub11.anIntArray2096[--i_2_];
											}
											class19 = class19.method144((byte) 16, 0, class19.method143((byte) 79) - 1);
										}
										Object[] objects_43_ = new Object[class19.method143((byte) 71) + 1];
										for (int i_44_ = objects_43_.length - 1; i_44_ >= 1; i_44_--)
											if (class19.method163(8, i_44_ - 1) == 115)
												objects_43_[i_44_] = Class37.aClass19Array875[--i_1_];
											else
												objects_43_[i_44_] = new Integer(Class38_Sub11.anIntArray2096[--i_2_]);
										int i_45_ = Class38_Sub11.anIntArray2096[--i_2_];
										if (i_45_ != -1)
											objects_43_[0] = new Integer(i_45_);
										else
											objects_43_ = null;
										if (i_4_ == 1405)
											class38_sub6.anObjectArray1965 = objects_43_;
										if (i_4_ == 1412)
											class38_sub6.anObjectArray1949 = objects_43_;
										if (i_4_ == 1400)
											class38_sub6.anObjectArray1978 = objects_43_;
										if (i_4_ == 1406)
											class38_sub6.anObjectArray1915 = objects_43_;
										if (i_4_ == 1404)
											class38_sub6.anObjectArray1888 = objects_43_;
										if (i_4_ == 1415) {
											class38_sub6.anObjectArray1884 = objects_43_;
											class38_sub6.anIntArray1988 = is_41_;
										}
										if (i_4_ == 1421)
											class38_sub6.anObjectArray1906 = objects_43_;
										if (i_4_ == 1418)
											class38_sub6.anObjectArray1895 = objects_43_;
										if (i_4_ == 1402)
											class38_sub6.anObjectArray1948 = objects_43_;
										if (i_4_ == 1401)
											class38_sub6.anObjectArray1892 = objects_43_;
										if (i_4_ == 1424)
											class38_sub6.anObjectArray1908 = objects_43_;
										if (i_4_ == 1414) {
											class38_sub6.anIntArray1860 = is_41_;
											class38_sub6.anObjectArray1864 = objects_43_;
										}
										class38_sub6.aBool1960 = true;
										if (i_4_ == 1409)
											class38_sub6.anObjectArray1907 = objects_43_;
										if (i_4_ == 1420)
											class38_sub6.anObjectArray1893 = objects_43_;
										if (i_4_ == 1407) {
											class38_sub6.anIntArray1934 = is_41_;
											class38_sub6.anObjectArray1913 = objects_43_;
										}
										if (i_4_ == 1422)
											class38_sub6.anObjectArray1935 = objects_43_;
										if (i_4_ == 1419)
											class38_sub6.anObjectArray1854 = objects_43_;
										if (i_4_ == 1416)
											class38_sub6.anObjectArray1950 = objects_43_;
										if (i_4_ == 1423)
											class38_sub6.anObjectArray1871 = objects_43_;
										if (i_4_ == 1417)
											class38_sub6.anObjectArray1979 = objects_43_;
										if (i_4_ == 1403)
											class38_sub6.anObjectArray1963 = objects_43_;
										if (i_4_ == 1411)
											class38_sub6.anObjectArray1959 = objects_43_;
										if (i_4_ == 1410)
											class38_sub6.anObjectArray1984 = objects_43_;
										if (i_4_ == 1408)
											class38_sub6.anObjectArray1879 = objects_43_;
									} else if (i_4_ >= 1600) {
										if (i_4_ < 1700) {
											Class38_Sub6 class38_sub6 = !bool ? Class13.aClass38_Sub6_245 : Class83.aClass38_Sub6_1657;
											if (i_4_ == 1600)
												Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1956;
											else if (i_4_ == 1601)
												Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1985;
											else if (i_4_ == 1602)
												Class37.aClass19Array875[i_1_++] = class38_sub6.aClass19_1876;
											else if (i_4_ == 1603)
												Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1973;
											else if (i_4_ == 1604)
												Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1933;
											else if (i_4_ == 1605)
												Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1921;
											else if (i_4_ == 1606)
												Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1925;
											else if (i_4_ == 1607)
												Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1863;
											else {
												if (i_4_ != 1608)
													break;
												Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1987;
											}
										} else if (i_4_ < 1800) {
											Class38_Sub6 class38_sub6 = !bool ? Class13.aClass38_Sub6_245 : Class83.aClass38_Sub6_1657;
											if (i_4_ == 1700)
												Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1917;
											else if (i_4_ == 1701) {
												if (class38_sub6.anInt1917 == -1)
													Class38_Sub11.anIntArray2096[i_2_++] = 0;
												else
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1899;
											} else {
												if (i_4_ != 1702)
													break;
												Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1941;
											}
										} else if (i_4_ >= 1900) {
											if (i_4_ < 2600) {
												Class38_Sub6 class38_sub6 = Projectile.method1167(Class38_Sub11.anIntArray2096[--i_2_], 31);
												if (i_4_ == 2500)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1942;
												else if (i_4_ == 2501)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1968;
												else if (i_4_ == 2502)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1923;
												else if (i_4_ == 2503)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1886;
												else if (i_4_ == 2504)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.aBool1853 ? 1 : 0;
												else {
													if (i_4_ != 2505)
														break;
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1977;
												}
											} else if (i_4_ >= 2700) {
												if (i_4_ < 2800) {
													if (i_4_ == 2700) {
														Class38_Sub6 class38_sub6 = Projectile.method1167(Class38_Sub11.anIntArray2096[--i_2_], 33);
														Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1917;
													} else if (i_4_ == 2701) {
														Class38_Sub6 class38_sub6 = Projectile.method1167(Class38_Sub11.anIntArray2096[--i_2_], 103);
														if (class38_sub6.anInt1917 != -1)
															Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1899;
														else
															Class38_Sub11.anIntArray2096[i_2_++] = 0;
													} else {
														if (i_4_ != 2702)
															break;
														int i_46_ = Class38_Sub11.anIntArray2096[--i_2_];
														Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method75(i_46_, (byte) -106);
														if (class38_sub8 != null)
															Class38_Sub11.anIntArray2096[i_2_++] = 1;
														else
															Class38_Sub11.anIntArray2096[i_2_++] = 0;
													}
												} else if (i_4_ < 2900) {
													Class38_Sub6 class38_sub6 = Projectile.method1167(Class38_Sub11.anIntArray2096[--i_2_], 47);
													if (i_4_ == 2800)
														Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub1.method610(true, Class30.method283(-113, class38_sub6));
													else if (i_4_ == 2801) {
														int i_47_ = Class38_Sub11.anIntArray2096[--i_2_];
														i_47_--;
														if (class38_sub6.aClass19Array1851 != null && class38_sub6.aClass19Array1851.length > i_47_ && class38_sub6.aClass19Array1851[i_47_] != null)
															Class37.aClass19Array875[i_1_++] = class38_sub6.aClass19Array1851[i_47_];
														else
															Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.aClass19_3287;
													} else {
														if (i_4_ != 2802)
															break;
														if (class38_sub6.aClass19_1926 != null)
															Class37.aClass19Array875[i_1_++] = class38_sub6.aClass19_1926;
														else
															Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.aClass19_3287;
													}
												} else if (i_4_ >= 3200) {
													if (i_4_ >= 3300) {
														if (i_4_ < 3400) {
															if (i_4_ == 3300)
																Class38_Sub11.anIntArray2096[i_2_++] = Class45.anInt1016;
															else if (i_4_ == 3301) {
																i_2_ -= 2;
																int i_48_ = Class38_Sub11.anIntArray2096[i_2_];
																int i_49_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub18.method703(0, i_49_, i_48_);
															} else if (i_4_ == 3302) {
																i_2_ -= 2;
																int i_50_ = Class38_Sub11.anIntArray2096[i_2_];
																int i_51_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																Class38_Sub11.anIntArray2096[i_2_++] = Class9.method47(-52, i_50_, i_51_);
															} else if (i_4_ == 3303) {
																i_2_ -= 2;
																int i_52_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																int i_53_ = Class38_Sub11.anIntArray2096[i_2_];
																Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub7.method655(i_53_, i_52_, true);
															} else if (i_4_ == 3304) {
																int i_54_ = Class38_Sub11.anIntArray2096[--i_2_];
																Class38_Sub11.anIntArray2096[i_2_++] = Class41.method351(i_54_, 17093).anInt2848;
															} else if (i_4_ == 3305) {
																int i_55_ = Class38_Sub11.anIntArray2096[--i_2_];
																Class38_Sub11.anIntArray2096[i_2_++] = Class47.anIntArray1041[i_55_];
															} else if (i_4_ == 3306) {
																int i_56_ = Class38_Sub11.anIntArray2096[--i_2_];
																Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub2.anIntArray1770[i_56_];
															} else if (i_4_ == 3307) {
																int i_57_ = Class38_Sub11.anIntArray2096[--i_2_];
																Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub20_Sub3_Sub4.anIntArray3358[i_57_];
															} else if (i_4_ == 3308) {
																int i_58_ = Client.height;
																int i_59_ = (((Entity) Client.myPlayer).anInt3493 >> -710191705) + Client.currentBaseY;
																int i_60_ = Client.currentBaseX + (((Entity) Client.myPlayer).anInt3444 >> 359212551);
																Class38_Sub11.anIntArray2096[i_2_++] = i_60_ + (i_58_ << 716142428) + (i_59_ << -183626034);
															} else if (i_4_ == 3309) {
																int i_61_ = Class38_Sub11.anIntArray2096[--i_2_];
																Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub10_Sub3.method941(16383, i_61_ >> -740324082);
															} else if (i_4_ == 3310) {
																int i_62_ = Class38_Sub11.anIntArray2096[--i_2_];
																Class38_Sub11.anIntArray2096[i_2_++] = i_62_ >> 1559273660;
															} else if (i_4_ == 3311) {
																int i_63_ = Class38_Sub11.anIntArray2096[--i_2_];
																Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub10_Sub3.method941(16383, i_63_);
															} else if (i_4_ == 3312)
																Class38_Sub11.anIntArray2096[i_2_++] = !Node.aBool889 ? 0 : 1;
															else if (i_4_ == 3313) {
																i_2_ -= 2;
																int i_64_ = Class38_Sub11.anIntArray2096[i_2_] + 32768;
																int i_65_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub18.method703(0, i_65_, i_64_);
															} else if (i_4_ == 3314) {
																i_2_ -= 2;
																int i_66_ = Class38_Sub11.anIntArray2096[i_2_] + 32768;
																int i_67_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																Class38_Sub11.anIntArray2096[i_2_++] = Class9.method47(-23, i_66_, i_67_);
															} else if (i_4_ == 3315) {
																i_2_ -= 2;
																int i_68_ = Class38_Sub11.anIntArray2096[i_2_] + 32768;
																int i_69_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub7.method655(i_68_, i_69_, true);
															} else if (i_4_ == 3316) {
																if (Class32.anInt772 >= 2)
																	Class38_Sub11.anIntArray2096[i_2_++] = Class32.anInt772;
																else
																	Class38_Sub11.anIntArray2096[i_2_++] = 0;
															} else if (i_4_ == 3317)
																Class38_Sub11.anIntArray2096[i_2_++] = Client.systemUpdateTime;
															else if (i_4_ == 3318)
																Class38_Sub11.anIntArray2096[i_2_++] = Class23.anInt556;
															else if (i_4_ == 3321)
																Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub20_Sub3_Sub5.anInt3372;
															else if (i_4_ == 3322)
																Class38_Sub11.anIntArray2096[i_2_++] = Class82.anInt1647;
															else {
																if (i_4_ != 3323)
																	break;
																if (Class32.anInt772 != 1)
																	Class38_Sub11.anIntArray2096[i_2_++] = 0;
																else
																	Class38_Sub11.anIntArray2096[i_2_++] = 1;
															}
														} else if (i_4_ < 3500) {
															if (i_4_ == 3400) {
																i_2_ -= 2;
																int i_70_ = Class38_Sub11.anIntArray2096[i_2_];
																int i_71_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																Class38_Sub20_Sub12 class38_sub20_sub12 = Class72.method514(i_70_, (byte) -90);
																for (int i_72_ = 0; i_72_ < class38_sub20_sub12.anInt2992; i_72_++)
																	if (i_71_ == class38_sub20_sub12.anIntArray2986[i_72_]) {
																		Class37.aClass19Array875[i_1_++] = class38_sub20_sub12.aClass19Array2990[i_72_];
																		class38_sub20_sub12 = null;
																		break;
																	}
																if (class38_sub20_sub12 != null)
																	Class37.aClass19Array875[i_1_++] = class38_sub20_sub12.aClass19_2985;
															} else {
																if (i_4_ != 3408)
																	break;
																i_2_ -= 4;
																int i_73_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																int i_74_ = Class38_Sub11.anIntArray2096[i_2_];
																int i_75_ = Class38_Sub11.anIntArray2096[i_2_ + 2];
																int i_76_ = Class38_Sub11.anIntArray2096[i_2_ + 3];
																Class38_Sub20_Sub12 class38_sub20_sub12 = Class72.method514(i_75_, (byte) -108);
																if (class38_sub20_sub12.anInt3006 != i_74_ || i_73_ != class38_sub20_sub12.anInt3003) {
																	if (i_73_ != 115)
																		Class38_Sub11.anIntArray2096[i_2_++] = 0;
																	else
																		Class37.aClass19Array875[i_1_++] = Class24.aClass19_568;
																} else {
																	for (int i_77_ = 0; i_77_ < class38_sub20_sub12.anInt2992; i_77_++)
																		if (i_76_ == class38_sub20_sub12.anIntArray2986[i_77_]) {
																			if (i_73_ != 115)
																				Class38_Sub11.anIntArray2096[i_2_++] = class38_sub20_sub12.anIntArray2989[i_77_];
																			else
																				Class37.aClass19Array875[i_1_++] = class38_sub20_sub12.aClass19Array2990[i_77_];
																			class38_sub20_sub12 = null;
																			break;
																		}
																	if (class38_sub20_sub12 != null)
																		if (i_73_ == 115)
																			Class37.aClass19Array875[i_1_++] = class38_sub20_sub12.aClass19_2985;
																		else
																			Class38_Sub11.anIntArray2096[i_2_++] = class38_sub20_sub12.anInt2997;
																}
															}
														} else if (i_4_ >= 3700) {
															if (i_4_ < 4100) {
																if (i_4_ == 4000) {
																	i_2_ -= 2;
																	int i_78_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	int i_79_ = Class38_Sub11.anIntArray2096[i_2_];
																	Class38_Sub11.anIntArray2096[i_2_++] = i_79_ + i_78_;
																} else if (i_4_ == 4001) {
																	i_2_ -= 2;
																	int i_80_ = Class38_Sub11.anIntArray2096[i_2_];
																	int i_81_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	Class38_Sub11.anIntArray2096[i_2_++] = -i_81_ + i_80_;
																} else if (i_4_ == 4002) {
																	i_2_ -= 2;
																	int i_82_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	int i_83_ = Class38_Sub11.anIntArray2096[i_2_];
																	Class38_Sub11.anIntArray2096[i_2_++] = i_83_ * i_82_;
																} else if (i_4_ == 4003) {
																	i_2_ -= 2;
																	int i_84_ = Class38_Sub11.anIntArray2096[i_2_];
																	int i_85_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	Class38_Sub11.anIntArray2096[i_2_++] = i_84_ / i_85_;
																} else if (i_4_ == 4004) {
																	int i_86_ = Class38_Sub11.anIntArray2096[--i_2_];
																	Class38_Sub11.anIntArray2096[i_2_++] = (int) (Math.random() * i_86_);
																} else if (i_4_ == 4005) {
																	int i_87_ = Class38_Sub11.anIntArray2096[--i_2_];
																	Class38_Sub11.anIntArray2096[i_2_++] = (int) ((i_87_ + 1) * Math.random());
																} else if (i_4_ == 4006) {
																	i_2_ -= 5;
																	int i_88_ = Class38_Sub11.anIntArray2096[i_2_];
																	int i_89_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	int i_90_ = Class38_Sub11.anIntArray2096[i_2_ + 2];
																	int i_91_ = Class38_Sub11.anIntArray2096[i_2_ + 4];
																	int i_92_ = Class38_Sub11.anIntArray2096[i_2_ + 3];
																	Class38_Sub11.anIntArray2096[i_2_++] = (-i_88_ + i_89_) * (i_91_ - i_90_) / (-i_90_ + i_92_) + i_88_;
																} else if (i_4_ == 4007) {
																	i_2_ -= 2;
																	int i_93_ = Class38_Sub11.anIntArray2096[i_2_];
																	int i_94_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	Class38_Sub11.anIntArray2096[i_2_++] = i_94_ * i_93_ / 100 + i_93_;
																} else if (i_4_ == 4008) {
																	i_2_ -= 2;
																	int i_95_ = Class38_Sub11.anIntArray2096[i_2_];
																	int i_96_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub3.method618(1 << i_96_, i_95_);
																} else if (i_4_ == 4009) {
																	i_2_ -= 2;
																	int i_97_ = Class38_Sub11.anIntArray2096[i_2_];
																	int i_98_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub10_Sub3.method941(i_97_, -(1 << i_98_) - 1);
																} else if (i_4_ == 4010) {
																	i_2_ -= 2;
																	int i_99_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	int i_100_ = Class38_Sub11.anIntArray2096[i_2_];
																	Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub10_Sub3.method941(1 << i_99_, i_100_) != 0 ? 1 : 0;
																} else if (i_4_ == 4011) {
																	i_2_ -= 2;
																	int i_101_ = Class38_Sub11.anIntArray2096[i_2_];
																	int i_102_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	Class38_Sub11.anIntArray2096[i_2_++] = i_101_ % i_102_;
																} else if (i_4_ == 4012) {
																	i_2_ -= 2;
																	int i_103_ = Class38_Sub11.anIntArray2096[i_2_];
																	int i_104_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	if (i_103_ == 0)
																		Class38_Sub11.anIntArray2096[i_2_++] = 0;
																	else
																		Class38_Sub11.anIntArray2096[i_2_++] = (int) Math.pow(i_103_, i_104_);
																} else if (i_4_ == 4013) {
																	i_2_ -= 2;
																	int i_105_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	int i_106_ = Class38_Sub11.anIntArray2096[i_2_];
																	if (i_106_ != 0) {
																		if (i_105_ == 0)
																			Class38_Sub11.anIntArray2096[i_2_++] = 2147483647;
																		else
																			Class38_Sub11.anIntArray2096[i_2_++] = (int) Math.pow(i_106_, 1.0 / i_105_);
																	} else
																		Class38_Sub11.anIntArray2096[i_2_++] = 0;
																} else if (i_4_ == 4014) {
																	i_2_ -= 2;
																	int i_107_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	int i_108_ = Class38_Sub11.anIntArray2096[i_2_];
																	Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub10_Sub3.method941(i_107_, i_108_);
																} else {
																	if (i_4_ != 4015)
																		break;
																	i_2_ -= 2;
																	int i_109_ = Class38_Sub11.anIntArray2096[i_2_];
																	int i_110_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub3.method618(i_110_, i_109_);
																}
															} else if (i_4_ < 4200) {
																if (i_4_ == 4100) {
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	int i_111_ = Class38_Sub11.anIntArray2096[--i_2_];
																	Class37.aClass19Array875[i_1_++] = Class9.method43(new RSString[] { class19, RuntimeException_Sub1.method1098(i_111_, 0) }, (byte) -20);
																} else if (i_4_ == 4101) {
																	i_1_ -= 2;
																	RSString class19 = Class37.aClass19Array875[i_1_];
																	RSString class19_112_ = Class37.aClass19Array875[i_1_ + 1];
																	Class37.aClass19Array875[i_1_++] = Class9.method43(new RSString[] { class19, class19_112_ }, (byte) -20);
																} else if (i_4_ == 4102) {
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	int i_113_ = Class38_Sub11.anIntArray2096[--i_2_];
																	Class37.aClass19Array875[i_1_++] = Class9.method43(new RSString[] { class19, Class32.method301(i_113_, true, (byte) -90) }, (byte) -20);
																} else if (i_4_ == 4103) {
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	Class37.aClass19Array875[i_1_++] = class19.method173(false);
																} else if (i_4_ == 4104) {
																	int i_114_ = Class38_Sub11.anIntArray2096[--i_2_];
																	long l = i_114_ * 86400000L - -1014768000000L;
																	Node.aCalendar885.setTime(new Date(l));
																	int i_115_ = Node.aCalendar885.get(5);
																	int i_116_ = Node.aCalendar885.get(2);
																	int i_117_ = Node.aCalendar885.get(1);
																	Class37.aClass19Array875[i_1_++] = Class9.method43(new RSString[] { RuntimeException_Sub1.method1098(i_115_, 0), Class25.aClass19_582, Class30.aClass19Array716[i_116_], Class25.aClass19_582, RuntimeException_Sub1.method1098(i_117_, 0) }, (byte) -20);
																} else if (i_4_ == 4105) {
																	i_1_ -= 2;
																	RSString class19 = Class37.aClass19Array875[i_1_ + 1];
																	RSString class19_118_ = Class37.aClass19Array875[i_1_];
																	if (Client.myPlayer.appearance == null || !Client.myPlayer.appearance.aBool410)
																		Class37.aClass19Array875[i_1_++] = class19_118_;
																	else
																		Class37.aClass19Array875[i_1_++] = class19;
																} else if (i_4_ == 4106) {
																	int i_119_ = Class38_Sub11.anIntArray2096[--i_2_];
																	Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.method1098(i_119_, 0);
																} else if (i_4_ == 4107) {
																	i_1_ -= 2;
																	Class38_Sub11.anIntArray2096[i_2_++] = Class37.aClass19Array875[i_1_].method148(1, Class37.aClass19Array875[i_1_ + 1]);
																} else if (i_4_ == 4108) {
																	i_2_ -= 2;
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	int i_120_ = Class38_Sub11.anIntArray2096[i_2_];
																	int i_121_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	byte[] is_122_ = Class13.aClass17_Sub1_237.method109(i_121_, 0, -117);
																	Class38_Sub20_Sub9_Sub1_Sub1 class38_sub20_sub9_sub1_sub1 = new Class38_Sub20_Sub9_Sub1_Sub1(is_122_);
																	Class38_Sub11.anIntArray2096[i_2_++] = class38_sub20_sub9_sub1_sub1.method1067(class19, i_120_);
																} else if (i_4_ == 4109) {
																	i_2_ -= 2;
																	int i_123_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	int i_124_ = Class38_Sub11.anIntArray2096[i_2_];
																	byte[] is_125_ = Class13.aClass17_Sub1_237.method109(i_123_, 0, -73);
																	Class38_Sub20_Sub9_Sub1_Sub1 class38_sub20_sub9_sub1_sub1 = new Class38_Sub20_Sub9_Sub1_Sub1(is_125_);
																	Class38_Sub11.anIntArray2096[i_2_++] = class38_sub20_sub9_sub1_sub1.method1082(class19, i_124_);
																} else if (i_4_ == 4110) {
																	i_1_ -= 2;
																	RSString class19 = Class37.aClass19Array875[i_1_];
																	RSString class19_126_ = Class37.aClass19Array875[i_1_ + 1];
																	if (Class38_Sub11.anIntArray2096[--i_2_] != 1)
																		Class37.aClass19Array875[i_1_++] = class19_126_;
																	else
																		Class37.aClass19Array875[i_1_++] = class19;
																} else if (i_4_ == 4111) {
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	Class37.aClass19Array875[i_1_++] = Class38_Sub20_Sub9_Sub1.method1062(class19);
																} else if (i_4_ == 4112) {
																	int i_127_ = Class38_Sub11.anIntArray2096[--i_2_];
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	Class37.aClass19Array875[i_1_++] = class19.method180(255, i_127_);
																} else if (i_4_ == 4113) {
																	int i_128_ = Class38_Sub11.anIntArray2096[--i_2_];
																	Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub21.method714((byte) 107, i_128_) ? 1 : 0;
																} else if (i_4_ == 4114) {
																	int i_129_ = Class38_Sub11.anIntArray2096[--i_2_];
																	Class38_Sub11.anIntArray2096[i_2_++] = !Class13.method66(i_129_, -1) ? 0 : 1;
																} else if (i_4_ == 4115) {
																	int i_130_ = Class38_Sub11.anIntArray2096[--i_2_];
																	Class38_Sub11.anIntArray2096[i_2_++] = !Class62.method462(i_130_, (byte) 19) ? 0 : 1;
																} else if (i_4_ == 4116) {
																	int i_131_ = Class38_Sub11.anIntArray2096[--i_2_];
																	Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub4.method626(119, i_131_) ? 1 : 0;
																} else if (i_4_ == 4117) {
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	if (class19 == null)
																		Class38_Sub11.anIntArray2096[i_2_++] = 0;
																	else
																		Class38_Sub11.anIntArray2096[i_2_++] = class19.method143((byte) 83);
																} else if (i_4_ == 4118) {
																	i_2_ -= 2;
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	int i_132_ = Class38_Sub11.anIntArray2096[i_2_];
																	int i_133_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	Class37.aClass19Array875[i_1_++] = class19.method144((byte) -112, i_132_, i_133_);
																} else if (i_4_ == 4119) {
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	RSString class19_134_ = Class78.method564(true, class19.method143((byte) 111));
																	boolean bool_135_ = false;
																	for (int i_136_ = 0; i_136_ < class19.method143((byte) 47); i_136_++) {
																		int i_137_ = class19.method163(74, i_136_);
																		if (i_137_ != 60) {
																			if (i_137_ != 62) {
																				if (!bool_135_)
																					class19_134_.method176(i_137_, -5);
																			} else
																				bool_135_ = false;
																		} else
																			bool_135_ = true;
																	}
																	class19_134_.method172(-8087);
																	Class37.aClass19Array875[i_1_++] = class19_134_;
																} else {
																	if (i_4_ != 4120)
																		break;
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	int i_138_ = Class38_Sub11.anIntArray2096[--i_2_];
																	Class38_Sub11.anIntArray2096[i_2_++] = class19.method166(i_138_, (byte) -91);
																}
															} else if (i_4_ >= 4300) {
																if (i_4_ >= 5100)
																	break;
																if (i_4_ == 5000)
																	Class38_Sub11.anIntArray2096[i_2_++] = Class81.anInt1619;
																else if (i_4_ == 5001) {
																	i_2_ -= 3;
																	Class81.anInt1619 = Class38_Sub11.anIntArray2096[i_2_];
																	Class81.anInt1621 = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	Class2_Sub1.anInt1996 = Class38_Sub11.anIntArray2096[i_2_ + 2];
																	Client.outputBuffer.putOpcode(69);
																	Client.outputBuffer.putByte(Class81.anInt1619);
																	Client.outputBuffer.putByte(Class81.anInt1621);
																	Client.outputBuffer.putByte(Class2_Sub1.anInt1996);
																} else if (i_4_ == 5002) {
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	i_2_ -= 2;
																	int i_139_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																	int i_140_ = Class38_Sub11.anIntArray2096[i_2_];
																	Client.outputBuffer.putOpcode(192);
																	Client.outputBuffer.method762(class19.method162(0), (byte) 56);
																	Client.outputBuffer.putByte(i_140_ - 1);
																	Client.outputBuffer.putByte(i_139_);
																} else if (i_4_ == 5003) {
																	int i_141_ = Class38_Sub11.anIntArray2096[--i_2_];
																	RSString class19 = null;
																	if (i_141_ < 100)
																		class19 = Class38_Sub6.aClass19Array1945[i_141_];
																	if (class19 == null)
																		class19 = RuntimeException_Sub1.aClass19_3287;
																	Class37.aClass19Array875[i_1_++] = class19;
																} else if (i_4_ == 5004) {
																	int i_142_ = Class38_Sub11.anIntArray2096[--i_2_];
																	int i_143_ = -1;
																	if (i_142_ < 100 && Class38_Sub6.aClass19Array1945[i_142_] != null)
																		i_143_ = Class38_Sub20_Sub3_Sub4.anIntArray3362[i_142_];
																	Class38_Sub11.anIntArray2096[i_2_++] = i_143_;
																} else if (i_4_ == 5005)
																	Class38_Sub11.anIntArray2096[i_2_++] = Class81.anInt1621;
																else if (i_4_ == 5008) {
																	RSString class19 = Class37.aClass19Array875[--i_1_];
																	if (class19.method165(Class48.aClass19_1065, true))
																		Class16.method99(class19, -103);
																	else {
																		RSString class19_144_ = class19.method173(false);
																		int i_145_ = 0;
																		int i_146_ = 0;
																		if (class19_144_.method165(Projectile.aClass19_3408, true)) {
																			i_146_ = 0;
																			class19 = class19.method171((byte) -118, Projectile.aClass19_3408.method143((byte) 75));
																		} else if (!class19_144_.method165(Class44.aClass19_1005, true)) {
																			if (class19_144_.method165(Class38_Sub11.aClass19_2086, true)) {
																				class19 = class19.method171((byte) -80, Class38_Sub11.aClass19_2086.method143((byte) 121));
																				i_146_ = 2;
																			} else if (class19_144_.method165(Class26.aClass19_609, true)) {
																				i_146_ = 3;
																				class19 = class19.method171((byte) -107, Class26.aClass19_609.method143((byte) 23));
																			} else if (!class19_144_.method165(Class38_Sub20_Sub12.aClass19_3001, true)) {
																				if (!class19_144_.method165(Class80.aClass19_1610, true)) {
																					if (class19_144_.method165(Class21.aClass19_512, true)) {
																						i_146_ = 6;
																						class19 = class19.method171((byte) -48, Class21.aClass19_512.method143((byte) 109));
																					} else if (class19_144_.method165(Class38_Sub12.aClass19_2111, true)) {
																						i_146_ = 7;
																						class19 = class19.method171((byte) -35, Class38_Sub12.aClass19_2111.method143((byte) 107));
																					} else if (!class19_144_.method165(Class80.aClass19_1587, true)) {
																						if (class19_144_.method165(Class3.aClass19_68, true)) {
																							i_146_ = 9;
																							class19 = class19.method171((byte) -78, Class3.aClass19_68.method143((byte) 120));
																						} else if (!class19_144_.method165(Class47.aClass19_1056, true)) {
																							if (!class19_144_.method165(Class43.aClass19_974, true)) {
																								if (Class64.anInt1361 != 0)
																									if (class19_144_.method165(Projectile.aClass19_3423, true)) {
																										i_146_ = 0;
																										class19 = class19.method171((byte) -29, Projectile.aClass19_3423.method143((byte) 12));
																									} else if (!class19_144_.method165(Class44.aClass19_991, true)) {
																										if (class19_144_.method165(Class38_Sub11.aClass19_2098, true)) {
																											i_146_ = 2;
																											class19 = class19.method171((byte) -85, Class38_Sub11.aClass19_2098.method143((byte) 122));
																										} else if (!class19_144_.method165(Class26.aClass19_616, true)) {
																											if (class19_144_.method165(Class38_Sub20_Sub12.aClass19_2995, true)) {
																												i_146_ = 4;
																												class19 = class19.method171((byte) -49, Class38_Sub20_Sub12.aClass19_2995.method143((byte) 25));
																											} else if (class19_144_.method165(Class80.aClass19_1612, true)) {
																												i_146_ = 5;
																												class19 = class19.method171((byte) -116, Class80.aClass19_1612.method143((byte) 12));
																											} else if (class19_144_.method165(Class21.aClass19_513, true)) {
																												class19 = class19.method171((byte) -8, Class21.aClass19_513.method143((byte) 56));
																												i_146_ = 6;
																											} else if (class19_144_.method165(Class38_Sub12.aClass19_2122, true)) {
																												class19 = class19.method171((byte) -65, Class38_Sub12.aClass19_2122.method143((byte) 32));
																												i_146_ = 7;
																											} else if (!class19_144_.method165(Class80.aClass19_1586, true)) {
																												if (!class19_144_.method165(Class3.aClass19_69, true)) {
																													if (class19_144_.method165(Class47.aClass19_1060, true)) {
																														class19 = class19.method171((byte) -63, Class47.aClass19_1060.method143((byte) 80));
																														i_146_ = 10;
																													} else if (class19_144_.method165(Class43.aClass19_968, true)) {
																														i_146_ = 11;
																														class19 = class19.method171((byte) -117, Class43.aClass19_968.method143((byte) 83));
																													}
																												} else {
																													i_146_ = 9;
																													class19 = class19.method171((byte) -90, Class3.aClass19_69.method143((byte) 48));
																												}
																											} else {
																												class19 = class19.method171((byte) -23, Class80.aClass19_1586.method143((byte) 51));
																												i_146_ = 8;
																											}
																										} else {
																											i_146_ = 3;
																											class19 = class19.method171((byte) -117, Class26.aClass19_616.method143((byte) 102));
																										}
																									} else {
																										class19 = class19.method171((byte) -123, Class44.aClass19_991.method143((byte) 91));
																										i_146_ = 1;
																									}
																							} else {
																								i_146_ = 11;
																								class19 = class19.method171((byte) -56, Class43.aClass19_974.method143((byte) 35));
																							}
																						} else {
																							i_146_ = 10;
																							class19 = class19.method171((byte) -103, Class47.aClass19_1056.method143((byte) 97));
																						}
																					} else {
																						class19 = class19.method171((byte) -120, Class80.aClass19_1587.method143((byte) 58));
																						i_146_ = 8;
																					}
																				} else {
																					class19 = class19.method171((byte) -29, Class80.aClass19_1610.method143((byte) 119));
																					i_146_ = 5;
																				}
																			} else {
																				i_146_ = 4;
																				class19 = class19.method171((byte) -72, Class38_Sub20_Sub12.aClass19_3001.method143((byte) 26));
																			}
																		} else {
																			i_146_ = 1;
																			class19 = class19.method171((byte) -42, Class44.aClass19_1005.method143((byte) 91));
																		}
																		class19_144_ = class19.method173(false);
																		if (class19_144_.method165(ItemDefinition.aClass19_2818, true)) {
																			class19 = class19.method171((byte) -40, ItemDefinition.aClass19_2818.method143((byte) 49));
																			i_145_ = 1;
																		} else if (class19_144_.method165(Class15.aClass19_282, true)) {
																			i_145_ = 2;
																			class19 = class19.method171((byte) -14, Class15.aClass19_282.method143((byte) 40));
																		} else if (!class19_144_.method165(Class38_Sub20_Sub3_Sub2.aClass19_3270, true)) {
																			if (class19_144_.method165(Class67.aClass19_1379, true)) {
																				i_145_ = 4;
																				class19 = class19.method171((byte) -66, Class67.aClass19_1379.method143((byte) 97));
																			} else if (!class19_144_.method165(Class38_Sub20_Sub3_Sub2.aClass19_3269, true)) {
																				if (Class64.anInt1361 != 0)
																					if (class19_144_.method165(ItemDefinition.aClass19_2812, true)) {
																						i_145_ = 1;
																						class19 = class19.method171((byte) -119, ItemDefinition.aClass19_2812.method143((byte) 115));
																					} else if (class19_144_.method165(Class15.aClass19_292, true)) {
																						i_145_ = 2;
																						class19 = class19.method171((byte) -6, Class15.aClass19_292.method143((byte) 63));
																					} else if (class19_144_.method165(Class38_Sub20_Sub3_Sub2.aClass19_3277, true)) {
																						class19 = class19.method171((byte) -17, Class38_Sub20_Sub3_Sub2.aClass19_3277.method143((byte) 36));
																						i_145_ = 3;
																					} else if (!class19_144_.method165(Class67.aClass19_1386, true)) {
																						if (class19_144_.method165(Class38_Sub20_Sub3_Sub2.aClass19_3273, true)) {
																							class19 = class19.method171((byte) -113, Class38_Sub20_Sub3_Sub2.aClass19_3273.method143((byte) 50));
																							i_145_ = 5;
																						}
																					} else {
																						i_145_ = 4;
																						class19 = class19.method171((byte) -40, Class67.aClass19_1386.method143((byte) 36));
																					}
																			} else {
																				class19 = class19.method171((byte) -113, Class38_Sub20_Sub3_Sub2.aClass19_3269.method143((byte) 80));
																				i_145_ = 5;
																			}
																		} else {
																			class19 = class19.method171((byte) -38, Class38_Sub20_Sub3_Sub2.aClass19_3270.method143((byte) 72));
																			i_145_ = 3;
																		}
																		Client.outputBuffer.putOpcode(27);
																		Client.outputBuffer.putByte(0);
																		int i_147_ = ((RS2Buffer) Client.outputBuffer).pos;
																		Client.outputBuffer.putByte(i_146_);
																		Client.outputBuffer.putByte(i_145_);
																		Class38_Sub4.method627(class19, (byte) -48, Client.outputBuffer);
																		Client.outputBuffer.putSizedByte(((RS2Buffer) Client.outputBuffer).pos - i_147_);
																	}
																} else if (i_4_ == 5009) {
																	i_1_ -= 2;
																	RSString class19 = Class37.aClass19Array875[i_1_];
																	RSString class19_148_ = Class37.aClass19Array875[i_1_ + 1];
																	Client.outputBuffer.putOpcode(164);
																	Client.outputBuffer.putByte(0);
																	int i_149_ = ((RS2Buffer) Client.outputBuffer).pos;
																	Client.outputBuffer.method762(class19.method162(0), (byte) 56);
																	Class38_Sub4.method627(class19_148_, (byte) -48, Client.outputBuffer);
																	Client.outputBuffer.putSizedByte(((RS2Buffer) Client.outputBuffer).pos - i_149_);
																} else if (i_4_ == 5010) {
																	int i_150_ = Class38_Sub11.anIntArray2096[--i_2_];
																	RSString class19 = null;
																	if (i_150_ < 100)
																		class19 = Class53.aClass19Array1179[i_150_];
																	if (class19 == null)
																		class19 = RuntimeException_Sub1.aClass19_3287;
																	Class37.aClass19Array875[i_1_++] = class19;
																} else if (i_4_ == 5011) {
																	int i_151_ = Class38_Sub11.anIntArray2096[--i_2_];
																	RSString class19 = null;
																	if (i_151_ < 100)
																		class19 = NPC.aClass19Array3558[i_151_];
																	if (class19 == null)
																		class19 = RuntimeException_Sub1.aClass19_3287;
																	Class37.aClass19Array875[i_1_++] = class19;
																} else if (i_4_ == 5015) {
																	RSString class19;
																	if (Client.myPlayer != null && Client.myPlayer.name != null)
																		class19 = Client.myPlayer.name;
																	else
																		class19 = Class51.aClass19_1135;
																	Class37.aClass19Array875[i_1_++] = class19;
																} else if (i_4_ == 5016)
																	Class38_Sub11.anIntArray2096[i_2_++] = Class2_Sub1.anInt1996;
																else {
																	if (i_4_ != 5017)
																		break;
																	Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub21.anInt2285;
																}
															} else if (i_4_ == 4200) {
																int i_152_ = Class38_Sub11.anIntArray2096[--i_2_];
																Class37.aClass19Array875[i_1_++] = Node.forId(i_152_, 23).aClass19_2808;
															} else if (i_4_ == 4201) {
																i_2_ -= 2;
																int i_153_ = Class38_Sub11.anIntArray2096[i_2_];
																int i_154_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																ItemDefinition class38_sub20_sub6 = Node.forId(i_153_, 26);
																if (i_154_ < 1 || i_154_ > 5 || class38_sub20_sub6.aClass19Array2789[i_154_ - 1] == null)
																	Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.aClass19_3287;
																else
																	Class37.aClass19Array875[i_1_++] = class38_sub20_sub6.aClass19Array2789[i_154_ - 1];
															} else if (i_4_ == 4202) {
																i_2_ -= 2;
																int i_155_ = Class38_Sub11.anIntArray2096[i_2_];
																int i_156_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
																ItemDefinition class38_sub20_sub6 = Node.forId(i_155_, 31);
																if (i_156_ >= 1 && i_156_ <= 5 && class38_sub20_sub6.aClass19Array2807[i_156_ - 1] != null)
																	Class37.aClass19Array875[i_1_++] = class38_sub20_sub6.aClass19Array2807[i_156_ - 1];
																else
																	Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.aClass19_3287;
															} else if (i_4_ == 4203) {
																int i_157_ = Class38_Sub11.anIntArray2096[--i_2_];
																Class38_Sub11.anIntArray2096[i_2_++] = Node.forId(i_157_, 106).anInt2754;
															} else if (i_4_ == 4204) {
																int i_158_ = Class38_Sub11.anIntArray2096[--i_2_];
																Class38_Sub11.anIntArray2096[i_2_++] = Node.forId(i_158_, 69).anInt2788 != 1 ? 0 : 1;
															} else if (i_4_ == 4205) {
																int i_159_ = Class38_Sub11.anIntArray2096[--i_2_];
																ItemDefinition class38_sub20_sub6 = Node.forId(i_159_, 56);
																if (class38_sub20_sub6.anInt2767 != -1 || class38_sub20_sub6.anInt2790 < 0)
																	Class38_Sub11.anIntArray2096[i_2_++] = i_159_;
																else
																	Class38_Sub11.anIntArray2096[i_2_++] = class38_sub20_sub6.anInt2790;
															} else if (i_4_ == 4206) {
																int i_160_ = Class38_Sub11.anIntArray2096[--i_2_];
																ItemDefinition class38_sub20_sub6 = Node.forId(i_160_, 70);
																if (class38_sub20_sub6.anInt2767 < 0 || class38_sub20_sub6.anInt2790 < 0)
																	Class38_Sub11.anIntArray2096[i_2_++] = i_160_;
																else
																	Class38_Sub11.anIntArray2096[i_2_++] = class38_sub20_sub6.anInt2790;
															} else {
																if (i_4_ != 4207)
																	break;
																int i_161_ = Class38_Sub11.anIntArray2096[--i_2_];
																Class38_Sub11.anIntArray2096[i_2_++] = !Node.forId(i_161_, 53).aBool2771 ? 0 : 1;
															}
														} else if (i_4_ == 3600) {
															if (Class38_Sub20_Sub15.anInt3068 == 0)
																Class38_Sub11.anIntArray2096[i_2_++] = -2;
															else if (Class38_Sub20_Sub15.anInt3068 != 1)
																Class38_Sub11.anIntArray2096[i_2_++] = Class81.anInt1618;
															else
																Class38_Sub11.anIntArray2096[i_2_++] = -1;
														} else if (i_4_ == 3601) {
															int i_162_ = Class38_Sub11.anIntArray2096[--i_2_];
															if (Class38_Sub20_Sub15.anInt3068 == 2 && Class81.anInt1618 > i_162_)
																Class37.aClass19Array875[i_1_++] = Class53.aClass19Array1173[i_162_];
															else
																Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.aClass19_3287;
														} else if (i_4_ == 3602) {
															int i_163_ = Class38_Sub11.anIntArray2096[--i_2_];
															if (Class38_Sub20_Sub15.anInt3068 == 2 && Class81.anInt1618 > i_163_)
																Class38_Sub11.anIntArray2096[i_2_++] = Class41.anIntArray941[i_163_];
															else
																Class38_Sub11.anIntArray2096[i_2_++] = 0;
														} else if (i_4_ == 3603) {
															int i_164_ = Class38_Sub11.anIntArray2096[--i_2_];
															if (Class38_Sub20_Sub15.anInt3068 != 2 || Class81.anInt1618 <= i_164_)
																Class38_Sub11.anIntArray2096[i_2_++] = 0;
															else
																Class38_Sub11.anIntArray2096[i_2_++] = Class80.anIntArray1606[i_164_];
														} else if (i_4_ == 3604) {
															RSString class19 = Class37.aClass19Array875[--i_1_];
															int i_165_ = Class38_Sub11.anIntArray2096[--i_2_];
															Class44.method371(i_165_, class19, (byte) 87);
														} else if (i_4_ == 3605) {
															RSString class19 = Class37.aClass19Array875[--i_1_];
															Class41.method346(119, class19.method162(0));
														} else if (i_4_ == 3606) {
															RSString class19 = Class37.aClass19Array875[--i_1_];
															Class38_Sub6.method640(class19.method162(0), 1);
														} else if (i_4_ == 3607) {
															RSString class19 = Class37.aClass19Array875[--i_1_];
															Class38_Sub21.method712(31, class19.method162(0));
														} else if (i_4_ == 3608) {
															RSString class19 = Class37.aClass19Array875[--i_1_];
															Class21.method193(121, class19.method162(0));
														} else if (i_4_ == 3609) {
															RSString class19 = Class37.aClass19Array875[--i_1_];
															if (class19.method165(Class38_Sub2.aClass19_1763, true) || class19.method165(Class49.aClass19_1099, true))
																class19 = class19.method171((byte) -50, 7);
															Class38_Sub11.anIntArray2096[i_2_++] = Class74.method529(-116, class19) ? 1 : 0;
														} else if (i_4_ == 3611) {
															if (Class59.aClass19_1292 == null)
																Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.aClass19_3287;
															else
																Class37.aClass19Array875[i_1_++] = Class59.aClass19_1292.method167((byte) 52);
														} else if (i_4_ == 3612) {
															if (Class59.aClass19_1292 != null)
																Class38_Sub11.anIntArray2096[i_2_++] = Class15.anInt300;
															else
																Class38_Sub11.anIntArray2096[i_2_++] = 0;
														} else if (i_4_ == 3613) {
															int i_166_ = Class38_Sub11.anIntArray2096[--i_2_];
															if (Class59.aClass19_1292 == null || i_166_ >= Class15.anInt300)
																Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.aClass19_3287;
															else
																Class37.aClass19Array875[i_1_++] = NPC.aClass38_Sub9Array3557[i_166_].aClass19_2061.method167((byte) 52);
														} else if (i_4_ == 3614) {
															int i_167_ = Class38_Sub11.anIntArray2096[--i_2_];
															if (Class59.aClass19_1292 == null || i_167_ >= Class15.anInt300)
																Class38_Sub11.anIntArray2096[i_2_++] = 0;
															else
																Class38_Sub11.anIntArray2096[i_2_++] = NPC.aClass38_Sub9Array3557[i_167_].anInt2063;
														} else if (i_4_ == 3615) {
															int i_168_ = Class38_Sub11.anIntArray2096[--i_2_];
															if (Class59.aClass19_1292 == null || i_168_ >= Class15.anInt300)
																Class38_Sub11.anIntArray2096[i_2_++] = 0;
															else
																Class38_Sub11.anIntArray2096[i_2_++] = NPC.aClass38_Sub9Array3557[i_168_].aByte2056;
														} else if (i_4_ == 3616)
															Class38_Sub11.anIntArray2096[i_2_++] = Class4.aByte79;
														else if (i_4_ == 3617) {
															RSString class19 = Class37.aClass19Array875[--i_1_];
															Class41.method352(class19, (byte) -123);
														} else if (i_4_ == 3618)
															Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub20_Sub4.aByte2575;
														else if (i_4_ == 3619) {
															RSString class19 = Class37.aClass19Array875[--i_1_];
															Class38_Sub20_Sub4.method828(class19.method162(0), -7645);
														} else if (i_4_ == 3620)
															Entity.method1176(0);
														else if (i_4_ == 3621) {
															if (Class38_Sub20_Sub15.anInt3068 != 0)
																Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub20_Sub3_Sub2.anInt3250;
															else
																Class38_Sub11.anIntArray2096[i_2_++] = -1;
														} else if (i_4_ == 3622) {
															int i_169_ = Class38_Sub11.anIntArray2096[--i_2_];
															if (Class38_Sub20_Sub15.anInt3068 != 0 && i_169_ < Class38_Sub20_Sub3_Sub2.anInt3250)
																Class37.aClass19Array875[i_1_++] = Class73.method520(Class5.aLongArray97[i_169_], 1).method167((byte) 52);
															else
																Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.aClass19_3287;
														} else if (i_4_ == 3623) {
															RSString class19 = Class37.aClass19Array875[--i_1_];
															if (class19.method165(Class38_Sub2.aClass19_1763, true) || class19.method165(Class49.aClass19_1099, true))
																class19 = class19.method171((byte) -111, 7);
															Class38_Sub11.anIntArray2096[i_2_++] = NPC.method1202((byte) -108, class19) ? 1 : 0;
														} else if (i_4_ == 3624) {
															int i_170_ = Class38_Sub11.anIntArray2096[--i_2_];
															if (NPC.aClass38_Sub9Array3557 == null || Class15.anInt300 <= i_170_ || !NPC.aClass38_Sub9Array3557[i_170_].aClass19_2061.method174((byte) 102, Client.myPlayer.name))
																Class38_Sub11.anIntArray2096[i_2_++] = 0;
															else
																Class38_Sub11.anIntArray2096[i_2_++] = 1;
														} else {
															if (i_4_ != 3625)
																break;
															if (Class61.aClass19_1331 != null)
																Class37.aClass19Array875[i_1_++] = Class61.aClass19_1331.method167((byte) 52);
															else
																Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.aClass19_3287;
														}
													} else if (i_4_ == 3200) {
														i_2_ -= 3;
														Class38_Sub20_Sub17.method1035(Class38_Sub11.anIntArray2096[i_2_], (byte) -112, Class38_Sub11.anIntArray2096[i_2_ + 2], Class38_Sub11.anIntArray2096[i_2_ + 1]);
													} else if (i_4_ == 3201)
														Class4.method26(Class38_Sub11.anIntArray2096[--i_2_], -10897);
													else {
														if (i_4_ != 3202)
															break;
														i_2_ -= 2;
														Class38_Sub11.method672(-127, Class38_Sub11.anIntArray2096[i_2_], Class38_Sub11.anIntArray2096[i_2_ + 1]);
													}
												} else if (i_4_ == 3100) {
													RSString class19 = Class37.aClass19Array875[--i_1_];
													Class62.method464((byte) 98, class19, 0, RuntimeException_Sub1.aClass19_3287);
												} else if (i_4_ == 3101) {
													i_2_ -= 2;
													Class48.method390((byte) 124, Class38_Sub11.anIntArray2096[i_2_ + 1], Client.myPlayer, Class38_Sub11.anIntArray2096[i_2_]);
												} else if (i_4_ == 3103)
													Class38_Sub20_Sub2.method814(-4);
												else if (i_4_ == 3104) {
													RSString class19 = Class37.aClass19Array875[--i_1_];
													int i_171_ = 0;
													if (class19.method177((byte) -36))
														i_171_ = class19.method164(19);
													Client.outputBuffer.putOpcode(216);
													Client.outputBuffer.putInt(i_171_);
												} else if (i_4_ == 3105) {
													RSString class19 = Class37.aClass19Array875[--i_1_];
													Client.outputBuffer.putOpcode(36);
													Client.outputBuffer.method762(class19.method162(0), (byte) 56);
												} else if (i_4_ == 3106) {
													RSString class19 = Class37.aClass19Array875[--i_1_];
													Client.outputBuffer.putOpcode(86);
													Client.outputBuffer.putByte(class19.method143((byte) 16) + 1);
													Client.outputBuffer.method742(class19, (byte) 124);
												} else if (i_4_ == 3107) {
													int i_172_ = Class38_Sub11.anIntArray2096[--i_2_];
													RSString class19 = Class37.aClass19Array875[--i_1_];
													Class38_Sub20_Sub4.method824(i_172_, 81, class19);
												} else if (i_4_ == 3108) {
													i_2_ -= 3;
													int i_173_ = Class38_Sub11.anIntArray2096[i_2_];
													int i_174_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
													int i_175_ = Class38_Sub11.anIntArray2096[i_2_ + 2];
													Class38_Sub6 class38_sub6 = Projectile.method1167(i_175_, -104);
													Class38_Sub20_Sub3_Sub4.method1153((byte) 37, class38_sub6, i_174_, i_173_);
												} else {
													if (i_4_ != 3109)
														break;
													i_2_ -= 2;
													int i_176_ = Class38_Sub11.anIntArray2096[i_2_];
													int i_177_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
													Class38_Sub6 class38_sub6 = !bool ? Class13.aClass38_Sub6_245 : Class83.aClass38_Sub6_1657;
													Class38_Sub20_Sub3_Sub4.method1153((byte) 118, class38_sub6, i_177_, i_176_);
												}
											} else {
												Class38_Sub6 class38_sub6 = Projectile.method1167(Class38_Sub11.anIntArray2096[--i_2_], 40);
												if (i_4_ == 2600)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1956;
												else if (i_4_ == 2601)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1985;
												else if (i_4_ == 2602)
													Class37.aClass19Array875[i_1_++] = class38_sub6.aClass19_1876;
												else if (i_4_ == 2603)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1973;
												else if (i_4_ == 2604)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1933;
												else if (i_4_ == 2605)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1921;
												else if (i_4_ == 2606)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1925;
												else if (i_4_ == 2607)
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1863;
												else {
													if (i_4_ != 2608)
														break;
													Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1987;
												}
											}
										} else {
											Class38_Sub6 class38_sub6 = bool ? Class83.aClass38_Sub6_1657 : Class13.aClass38_Sub6_245;
											if (i_4_ == 1800)
												Class38_Sub11.anIntArray2096[i_2_++] = Class38_Sub1.method610(true, Class30.method283(-108, class38_sub6));
											else if (i_4_ == 1801) {
												int i_178_ = Class38_Sub11.anIntArray2096[--i_2_];
												i_178_--;
												if (class38_sub6.aClass19Array1851 != null && class38_sub6.aClass19Array1851.length > i_178_ && class38_sub6.aClass19Array1851[i_178_] != null)
													Class37.aClass19Array875[i_1_++] = class38_sub6.aClass19Array1851[i_178_];
												else
													Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.aClass19_3287;
											} else {
												if (i_4_ != 1802)
													break;
												if (class38_sub6.aClass19_1926 == null)
													Class37.aClass19Array875[i_1_++] = RuntimeException_Sub1.aClass19_3287;
												else
													Class37.aClass19Array875[i_1_++] = class38_sub6.aClass19_1926;
											}
										}
									} else {
										Class38_Sub6 class38_sub6 = bool ? Class83.aClass38_Sub6_1657 : Class13.aClass38_Sub6_245;
										if (i_4_ == 1500)
											Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1942;
										else if (i_4_ == 1501)
											Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1968;
										else if (i_4_ == 1502)
											Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1923;
										else if (i_4_ == 1503)
											Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1886;
										else if (i_4_ == 1504)
											Class38_Sub11.anIntArray2096[i_2_++] = !class38_sub6.aBool1853 ? 0 : 1;
										else {
											if (i_4_ != 1505)
												break;
											Class38_Sub11.anIntArray2096[i_2_++] = class38_sub6.anInt1977;
										}
									}
								} else {
									Class38_Sub6 class38_sub6;
									if (i_4_ >= 2000) {
										class38_sub6 = Projectile.method1167(Class38_Sub11.anIntArray2096[--i_2_], 87);
										i_4_ -= 1000;
									} else
										class38_sub6 = bool ? Class83.aClass38_Sub6_1657 : Class13.aClass38_Sub6_245;
									if (i_4_ == 1300) {
										int i_179_ = Class38_Sub11.anIntArray2096[--i_2_] - 1;
										if (i_179_ < 0 || i_179_ > 9)
											i_1_--;
										else
											class38_sub6.method636(Class37.aClass19Array875[--i_1_], true, i_179_);
									} else if (i_4_ == 1301) {
										i_2_ -= 2;
										int i_180_ = Class38_Sub11.anIntArray2096[i_2_ + 1];
										int i_181_ = Class38_Sub11.anIntArray2096[i_2_];
										class38_sub6.aClass38_Sub6_1937 = Class38_Sub20_Sub12.method987(i_180_, i_181_, (byte) -29);
									} else if (i_4_ == 1302)
										class38_sub6.aBool1975 = Class38_Sub11.anIntArray2096[--i_2_] == 1;
									else if (i_4_ == 1303)
										class38_sub6.anInt1873 = Class38_Sub11.anIntArray2096[--i_2_];
									else if (i_4_ == 1304)
										class38_sub6.anInt1859 = Class38_Sub11.anIntArray2096[--i_2_];
									else if (i_4_ == 1305)
										class38_sub6.aClass19_1926 = Class37.aClass19Array875[--i_1_];
									else if (i_4_ == 1306)
										class38_sub6.aClass19_1938 = Class37.aClass19Array875[--i_1_];
									else {
										if (i_4_ != 1307)
											break;
										class38_sub6.aClass19Array1851 = null;
									}
								}
							} else {
								Class38_Sub6 class38_sub6;
								if (i_4_ < 2000)
									class38_sub6 = bool ? Class83.aClass38_Sub6_1657 : Class13.aClass38_Sub6_245;
								else {
									i_4_ -= 1000;
									class38_sub6 = Projectile.method1167(Class38_Sub11.anIntArray2096[--i_2_], -102);
								}
								if (i_4_ == 1000) {
									i_2_ -= 2;
									class38_sub6.anInt1942 = Class38_Sub11.anIntArray2096[i_2_];
									class38_sub6.anInt1968 = Class38_Sub11.anIntArray2096[i_2_ + 1];
									Class40.method340(class38_sub6, (byte) -121);
								} else if (i_4_ == 1001) {
									i_2_ -= 2;
									class38_sub6.anInt1923 = Class38_Sub11.anIntArray2096[i_2_];
									class38_sub6.anInt1886 = Class38_Sub11.anIntArray2096[i_2_ + 1];
									Class40.method340(class38_sub6, (byte) -103);
								} else {
									if (i_4_ != 1003)
										break;
									boolean bool_182_ = Class38_Sub11.anIntArray2096[--i_2_] == 1;
									if (class38_sub6.aBool1853 == !bool_182_) {
										class38_sub6.aBool1853 = bool_182_;
										Class40.method340(class38_sub6, (byte) -112);
									}
								}
							}
						}
						throw new IllegalStateException();
					} catch (Exception exception) {
						if (class38_sub20_sub10.aClass19_2894 != null) {
							RSString class19 = Class78.method564(true, 30);
							class19.method146(Class38_Sub20_Sub8.aClass19_2868, (byte) 6).method146(class38_sub20_sub10.aClass19_2894, (byte) -53);
							for (int i_183_ = Class45.anInt1032 - 1; i_183_ >= 0; i_183_--)
								class19.method146(Class35.aClass19_807, (byte) 104).method146(Class37.aClass61Array872[i_183_].aClass38_Sub20_Sub10_1328.aClass19_2894, (byte) -83);
							if (i_4_ == 40) {
								int i_184_ = is_3_[i_5_];
								class19.method146(Class20.aClass19_500, (byte) -126).method146(RuntimeException_Sub1.method1098(i_184_, 0), (byte) -91);
							}
							if (Player.anInt3582 != 0)
								Class62.method464((byte) 98, Class9.method43(new RSString[] { Class54.aClass19_1196, class38_sub20_sub10.aClass19_2894 }, (byte) -20), 0, RuntimeException_Sub1.aClass19_3287);
							Class38_Sub20_Sub2.method813(exception, "CS2 - scr:" + ((Node) class38_sub20_sub10).aLong898 + " op:" + i_4_ + new String(class19.method158(122)), 95);
						} else {
							if (Player.anInt3582 != 0)
								Class62.method464((byte) 98, Class74.aClass19_1464, 0, RuntimeException_Sub1.aClass19_3287);
							Class38_Sub20_Sub2.method813(exception, "CS2 - scr:" + ((Node) class38_sub20_sub10).aLong898 + " op:" + i_4_, 95);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "we.C(" + (class38_sub19 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method85(int i) {
		try {
			Class15.aClass19_305 = null;
			Class15.aClass19_289 = null;
			Class15.aClass19_286 = null;
			Class15.aClass19_306 = null;
			Class15.aClass38_Sub20_Sub9_Sub3Array288 = null;
			Class15.aClass17_299 = null;
			Class15.anIntArray284 = null;
			Class15.aClass17_298 = null;
			Class15.aClass19_292 = null;
			Class15.aClass19_282 = null;
			Class15.inputStream = null;
			if (i != 0)
				Class15.method85(-67);
			Class15.aClass19_287 = null;
			Class15.aClass19_303 = null;
			Class15.aClass19_304 = null;
			Class15.aClass19Array290 = null;
			Class15.aClass38_Sub6_293 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "we.B(" + i + ')');
		}
	}

	static final void method86(int i, int i_185_, byte[] is, int i_186_, int i_187_, int i_188_, int i_189_, SceneGraph class27, int i_190_, Class74[] class74s, int i_191_) {
		try {
			if (i != 1)
				Class15.method84(null, (byte) -122);
			RS2Buffer class38_sub23 = new RS2Buffer(is);
			int i_192_ = -1;
			for (;;) {
				int i_193_ = class38_sub23.method726(true);
				if (i_193_ == 0)
					break;
				i_192_ += i_193_;
				int i_194_ = 0;
				for (;;) {
					int i_195_ = class38_sub23.method726(true);
					if (i_195_ == 0)
						break;
					int i_196_ = class38_sub23.getUByte();
					i_194_ += i_195_ - 1;
					int i_197_ = (i_194_ & 0xff2) >> -888106714;
					int i_198_ = i_194_ & 0x3f;
					int i_199_ = i_196_ & 0x3;
					int i_200_ = i_194_ >> -1333613396;
					int i_201_ = i_196_ >> -1348798366;
					if (i_186_ == i_200_ && i_191_ <= i_197_ && i_197_ < i_191_ + 8 && i_187_ <= i_198_ && i_198_ < i_187_ + 8) {
						ObjectDefinition class38_sub20_sub1 = Class80.method581(i + 99, i_192_);
						int i_202_ = i_189_ + Class38_Sub20_Sub10.method978(i_198_ & 0x7, class38_sub20_sub1.anInt2480, i_199_, class38_sub20_sub1.anInt2469, i_197_ & 0x7, (byte) -62, i_190_);
						int i_203_ = Class54.method419(i_199_, i_198_ & 0x7, i_190_, 0, class38_sub20_sub1.anInt2480, class38_sub20_sub1.anInt2469, i_197_ & 0x7) + i_188_;
						if (i_202_ > 0 && i_203_ > 0 && i_202_ < 103 && i_203_ < 103) {
							int i_204_ = i_185_;
							if ((Class82.aByteArrayArrayArray1648[1][i_202_][i_203_] & 0x2) == 2)
								i_204_--;
							Class74 class74 = null;
							if (i_204_ >= 0)
								class74 = class74s[i_204_];
							Class10.method53(class27, i_203_, i_201_, i_192_, i_190_ + i_199_ & 0x3, class74, i_185_, i_202_, (byte) -76);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "we.D(" + i + ',' + i_185_ + ',' + (is != null ? "{...}" : "null") + ',' + i_186_ + ',' + i_187_ + ',' + i_188_ + ',' + i_189_ + ',' + (class27 != null ? "{...}" : "null") + ',' + i_190_ + ',' + (class74s != null ? "{...}" : "null") + ',' + i_191_ + ')');
		}
	}

	Class15(int i, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_, boolean bool) {
		try {
			this.anInt297 = i_209_;
			this.anInt294 = i;
			this.anInt295 = i_208_;
			this.anInt273 = i_205_;
			this.anInt285 = i_206_;
			this.anInt279 = i_207_;
			this.aBool278 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "we.<init>(" + i + ',' + i_205_ + ',' + i_206_ + ',' + i_207_ + ',' + i_208_ + ',' + i_209_ + ',' + bool + ')');
		}
	}

	static {
		Class15.anInt272 = 0;
		Class15.aClass19_287 = RSString.createRSString("Unerwartete Antwort vom Anmelde)2Server)3");
		Class15.aClass38_Sub20_Sub9_Sub3Array288 = new Class38_Sub20_Sub9_Sub3[1000];
		Class15.aClass19_289 = RSString.createRSString("blinken2:");
		Class15.aClass19Array290 = new RSString[1000];
		Class15.aClass38_Sub6_293 = null;
		Class15.anInt277 = 0;
		Class15.anInt291 = 0;
		Class15.aBool283 = false;
		Class15.anIntArray284 = new int[500];
		Class15.aClass19_286 = RSString.createRSString("wave2:");
		Class15.aClass19_292 = Class15.aClass19_286;
		Class15.aClass19_282 = Class15.aClass19_286;
		Class15.inputStream = new PacketBuffer(5000);
		Class15.anInt301 = 0;
		Class15.aClass19_305 = RSString.createRSString("weiss:");
		Class15.aClass19_303 = RSString.createRSString("RuneScape is loading )2 please wait)3)3)3");
		Class15.aClass19_306 = Class15.aClass19_303;
		Class15.aClass19_304 = RSString.createRSString("(Z");
		Class15.anInt302 = 255;
	}
}
