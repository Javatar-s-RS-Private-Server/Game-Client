package com.javatar.jagex;/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class25 {
	private static RSString aClass19_576;
	static int anInt577 = 0;
	private static RSString aClass19_578;
	static Class73 aClass73_579;
	static RSString aClass19_582 = RSString.createRSString(")2");
	static byte[][][] aByteArrayArrayArray583;
	static RSString aClass19_584;
	static Class83 aClass83_585;
	static RSString aClass19_586;
	static RSString aClass19_587;
	static Class17 aClass17_589;
	static int anInt591;
	private static RSString aClass19_592;
	static RSString aClass19_593;
	static int anInt594;
	static RSString aClass19_596;
	private static RSString aClass19_597;

	static final int method209(int i, int i_0_, byte i_1_, int i_2_) {
		try {
			if (i_1_ != 35)
				Class25.method210(null, false, null, null, null);
			int i_3_ = -i_0_ + 256;
			return ((i & 0xff00ff) * i_0_ + (i_2_ & 0xff00ff) * i_3_ & ~0xff00ff) + (i_0_ * (i & 0xff00) + i_3_ * (i_2_ & 0xff00) & 0xff0000) >> -1101586264;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mb.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')');
		}
	}

	static final void method210(Class17 class17, boolean bool, Class17 class17_4_, Class17 class17_5_, Class17 class17_6_) {
		try {
			Class38_Sub20_Sub17.aClass17_3114 = class17_5_;
			Class25.aClass17_589 = class17_6_;
			Class15.aClass17_299 = class17_4_;
			if (bool != true)
				Class25.aClass19_584 = null;
			Class38_Sub19.aClass17_2230 = class17;
			Class62.aClass38_Sub6ArrayArray1339 = new Class38_Sub6[Class25.aClass17_589.method107(-51)][];
			Class38_Sub14.aBoolArray2142 = new boolean[Class25.aClass17_589.method107(-84)];
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mb.E(" + (class17 != null ? "{...}" : "null") + ',' + bool + ',' + (class17_4_ != null ? "{...}" : "null") + ',' + (class17_5_ != null ? "{...}" : "null") + ',' + (class17_6_ != null ? "{...}" : "null") + ')');
		}
	}

	static final void method211(Class38_Sub6[] class38_sub6s, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		try {
			int i_14_ = i_12_;
			for (/**/; i_14_ < class38_sub6s.length; i_14_++) {
				Class38_Sub6 class38_sub6 = class38_sub6s[i_14_];
				if (class38_sub6 != null && (!class38_sub6.aBool1961 || class38_sub6.anInt1868 == 0 || class38_sub6.aBool1960 || Class30.method283(-119, class38_sub6) != 0 || class38_sub6 == Class74.aClass38_Sub6_1463) && class38_sub6.anInt1977 == i_13_ && (!class38_sub6.aBool1961 || !Class43.method362(true, class38_sub6))) {
					int i_15_ = i + class38_sub6.anInt1942;
					int i_16_ = class38_sub6.anInt1968 + i_10_;
					if (class38_sub6 == Class15.aClass38_Sub6_293) {
						Class76.aBool1491 = true;
						Class61.anInt1337 = i_15_;
						Class83.anInt1675 = i_16_;
					}
					int i_17_;
					int i_18_;
					int i_19_;
					int i_20_;
					if (class38_sub6.anInt1868 == 2) {
						i_17_ = i_7_;
						i_18_ = i_9_;
						i_19_ = i_11_;
						i_20_ = i_8_;
					} else if (class38_sub6.anInt1868 == 9) {
						int i_21_ = class38_sub6.anInt1923 + i_15_;
						int i_22_ = i_15_;
						if (i_21_ < i_22_) {
							int i_23_ = i_22_;
							i_22_ = i_21_;
							i_21_ = i_23_;
						}
						i_17_ = i_7_ >= i_22_ ? i_7_ : i_22_;
						int i_24_ = class38_sub6.anInt1886 + i_16_;
						int i_25_ = i_16_;
						i_21_++;
						i_18_ = i_9_ > i_21_ ? i_21_ : i_9_;
						if (i_25_ > i_24_) {
							int i_26_ = i_25_;
							i_25_ = i_24_;
							i_24_ = i_26_;
						}
						i_19_ = ++i_24_ >= i_11_ ? i_11_ : i_24_;
						i_20_ = i_8_ >= i_25_ ? i_8_ : i_25_;
					} else {
						i_20_ = i_8_ >= i_16_ ? i_8_ : i_16_;
						i_17_ = i_7_ < i_15_ ? i_15_ : i_7_;
						int i_27_ = class38_sub6.anInt1923 + i_15_;
						i_18_ = i_27_ >= i_9_ ? i_9_ : i_27_;
						int i_28_ = class38_sub6.anInt1886 + i_16_;
						i_19_ = i_28_ >= i_11_ ? i_11_ : i_28_;
					}
					if (!class38_sub6.aBool1961 || i_18_ > i_17_ && i_19_ > i_20_)
						if (class38_sub6.anInt1958 == 1337)
							Class40.method340(class38_sub6, (byte) -102);
						else if (class38_sub6.anInt1958 == 1338)
							Class33.method303(i_15_, i_16_, -1);
						else {
							if (class38_sub6.anInt1868 == 0) {
								if (!class38_sub6.aBool1961 && Class43.method362(true, class38_sub6) && Class38_Sub2.aClass38_Sub6_1774 != class38_sub6)
									continue;
								Class25.method211(class38_sub6s, i_15_ - class38_sub6.anInt1956, i_17_, i_20_, i_18_, i_16_ - class38_sub6.anInt1985, i_19_, i_12_, class38_sub6.anInt1856);
								if (class38_sub6.aClass38_Sub6Array1867 != null)
									Class25.method211(class38_sub6.aClass38_Sub6Array1867, i_15_ - class38_sub6.anInt1956, i_17_, i_20_, i_18_, i_16_ - class38_sub6.anInt1985, i_19_, 0, class38_sub6.anInt1856);
								Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method75(class38_sub6.anInt1856, (byte) -106);
								if (class38_sub8 != null)
									Projectile.method1168(class38_sub8.anInt2038, i_17_, i_20_, i_19_, i_16_, i_18_, i_15_, 0);
							}
							if (class38_sub6.aBool1961) {
								boolean bool = false;
								boolean bool_29_;
								if (i_17_ <= Class23.anInt543 && i_20_ <= Class45.anInt1015 && Class23.anInt543 < i_18_ && Class45.anInt1015 < i_19_)
									bool_29_ = true;
								else
									bool_29_ = false;
								if (Class23.anInt558 == 1 && bool_29_)
									bool = true;
								boolean bool_30_ = false;
								if (Client.lastMouseAction == 1 && i_17_ <= Class73.anInt1429 && i_20_ <= RS2Buffer.anInt2416 && Class73.anInt1429 < i_18_ && RS2Buffer.anInt2416 < i_19_)
									bool_30_ = true;
								if (bool_30_)
									Class38_Sub20_Sub3_Sub4.method1153((byte) -80, class38_sub6, -i_16_ + RS2Buffer.anInt2416, Class73.anInt1429 - i_15_);
								if (Class15.aClass38_Sub6_293 != null && Class15.aClass38_Sub6_293 != class38_sub6 && bool_29_ && Class74.method531(-4124, Class30.method283(-108, class38_sub6)))
									Class67.aClass38_Sub6_1381 = class38_sub6;
								if (class38_sub6 == Class74.aClass38_Sub6_1463) {
									NPC.anInt3554 = i_15_;
									Class21.aBool524 = true;
									Class47.anInt1048 = i_16_;
								}
								if (class38_sub6.aBool1960) {
									if (bool_29_ && Class52.anInt1145 != 0 && class38_sub6.anObjectArray1979 != null) {
										Class38_Sub19 class38_sub19 = new Class38_Sub19();
										class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1979;
										class38_sub19.anInt2242 = Class52.anInt1145;
										class38_sub19.aClass38_Sub6_2241 = class38_sub6;
										Class55.aClass13_1215.method68(class38_sub19, (byte) 111);
									}
									if (Class15.aClass38_Sub6_293 != null || Class38_Sub20_Sub8.aClass38_Sub6_2877 != null || SceneModel.aBool2553) {
										bool_29_ = false;
										bool_30_ = false;
										bool = false;
									}
									if (!class38_sub6.aBool1919 && bool_30_) {
										class38_sub6.aBool1919 = true;
										if (class38_sub6.anObjectArray1978 != null) {
											Class38_Sub19 class38_sub19 = new Class38_Sub19();
											class38_sub19.anInt2236 = -i_15_ + Class73.anInt1429;
											class38_sub19.aClass38_Sub6_2241 = class38_sub6;
											class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1978;
											class38_sub19.anInt2242 = -i_16_ + RS2Buffer.anInt2416;
											Class55.aClass13_1215.method68(class38_sub19, (byte) 88);
										}
									}
									if (class38_sub6.aBool1919 && bool && class38_sub6.anObjectArray1959 != null) {
										Class38_Sub19 class38_sub19 = new Class38_Sub19();
										class38_sub19.aClass38_Sub6_2241 = class38_sub6;
										class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1959;
										class38_sub19.anInt2242 = -i_16_ + Class45.anInt1015;
										class38_sub19.anInt2236 = -i_15_ + Class23.anInt543;
										Class55.aClass13_1215.method68(class38_sub19, (byte) 100);
									}
									if (class38_sub6.aBool1919 && !bool) {
										class38_sub6.aBool1919 = false;
										if (class38_sub6.anObjectArray1948 != null) {
											Class38_Sub19 class38_sub19 = new Class38_Sub19();
											class38_sub19.anInt2236 = Class23.anInt543 - i_15_;
											class38_sub19.anInt2242 = Class45.anInt1015 - i_16_;
											class38_sub19.aClass38_Sub6_2241 = class38_sub6;
											class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1948;
											Class60.aClass13_1304.method68(class38_sub19, (byte) 90);
										}
									}
									if (bool && class38_sub6.anObjectArray1892 != null) {
										Class38_Sub19 class38_sub19 = new Class38_Sub19();
										class38_sub19.anInt2236 = -i_15_ + Class23.anInt543;
										class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1892;
										class38_sub19.aClass38_Sub6_2241 = class38_sub6;
										class38_sub19.anInt2242 = -i_16_ + Class45.anInt1015;
										Class55.aClass13_1215.method68(class38_sub19, (byte) 73);
									}
									if (!class38_sub6.aBool1944 && bool_29_) {
										class38_sub6.aBool1944 = true;
										if (class38_sub6.anObjectArray1963 != null) {
											Class38_Sub19 class38_sub19 = new Class38_Sub19();
											class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1963;
											class38_sub19.aClass38_Sub6_2241 = class38_sub6;
											class38_sub19.anInt2236 = -i_15_ + Class23.anInt543;
											class38_sub19.anInt2242 = Class45.anInt1015 - i_16_;
											Class55.aClass13_1215.method68(class38_sub19, (byte) 46);
										}
									}
									if (class38_sub6.aBool1944 && bool_29_ && class38_sub6.anObjectArray1949 != null) {
										Class38_Sub19 class38_sub19 = new Class38_Sub19();
										class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1949;
										class38_sub19.anInt2242 = -i_16_ + Class45.anInt1015;
										class38_sub19.anInt2236 = -i_15_ + Class23.anInt543;
										class38_sub19.aClass38_Sub6_2241 = class38_sub6;
										Class55.aClass13_1215.method68(class38_sub19, (byte) 78);
									}
									if (class38_sub6.aBool1944 && !bool_29_) {
										class38_sub6.aBool1944 = false;
										if (class38_sub6.anObjectArray1888 != null) {
											Class38_Sub19 class38_sub19 = new Class38_Sub19();
											class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1888;
											class38_sub19.aClass38_Sub6_2241 = class38_sub6;
											class38_sub19.anInt2236 = Class23.anInt543 - i_15_;
											class38_sub19.anInt2242 = -i_16_ + Class45.anInt1015;
											Class60.aClass13_1304.method68(class38_sub19, (byte) 67);
										}
									}
									if (class38_sub6.anObjectArray1879 != null) {
										Class38_Sub19 class38_sub19 = new Class38_Sub19();
										class38_sub19.aClass38_Sub6_2241 = class38_sub6;
										class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1879;
										NPC.aClass13_3546.method68(class38_sub19, (byte) 69);
									}
									if (class38_sub6.anObjectArray1913 != null && Class25.anInt591 > class38_sub6.anInt1905) {
										if (class38_sub6.anIntArray1934 == null || -class38_sub6.anInt1905 + Class25.anInt591 > 32) {
											Class38_Sub19 class38_sub19 = new Class38_Sub19();
											class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1913;
											class38_sub19.aClass38_Sub6_2241 = class38_sub6;
											Class55.aClass13_1215.method68(class38_sub19, (byte) 48);
										} else
											while_0_: for (int i_31_ = class38_sub6.anInt1905; i_31_ < Class25.anInt591; i_31_++) {
												int i_32_ = Class43.anIntArray971[i_31_ & 0x1f];
												for (int i_33_ = 0; class38_sub6.anIntArray1934.length > i_33_; i_33_++)
													if (i_32_ == class38_sub6.anIntArray1934[i_33_]) {
														Class38_Sub19 class38_sub19 = new Class38_Sub19();
														class38_sub19.aClass38_Sub6_2241 = class38_sub6;
														class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1913;
														Class55.aClass13_1215.method68(class38_sub19, (byte) 120);
														break while_0_;
													}
											}
										class38_sub6.anInt1905 = Class25.anInt591;
									}
									if (class38_sub6.anObjectArray1864 != null && class38_sub6.anInt1850 < Class38_Sub18.anInt2208) {
										if (class38_sub6.anIntArray1860 != null && Class38_Sub18.anInt2208 - class38_sub6.anInt1850 <= 32)
											while_1_: for (int i_34_ = class38_sub6.anInt1850; i_34_ < Class38_Sub18.anInt2208; i_34_++) {
												int i_35_ = Class55.anIntArray1230[i_34_ & 0x1f];
												for (int i_36_ = 0; class38_sub6.anIntArray1860.length > i_36_; i_36_++)
													if (class38_sub6.anIntArray1860[i_36_] == i_35_) {
														Class38_Sub19 class38_sub19 = new Class38_Sub19();
														class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1864;
														class38_sub19.aClass38_Sub6_2241 = class38_sub6;
														Class55.aClass13_1215.method68(class38_sub19, (byte) 86);
														break while_1_;
													}
											}
										else {
											Class38_Sub19 class38_sub19 = new Class38_Sub19();
											class38_sub19.aClass38_Sub6_2241 = class38_sub6;
											class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1864;
											Class55.aClass13_1215.method68(class38_sub19, (byte) 39);
										}
										class38_sub6.anInt1850 = Class38_Sub18.anInt2208;
									}
									if (class38_sub6.anObjectArray1884 != null && Class23.anInt553 > class38_sub6.anInt1928) {
										if (class38_sub6.anIntArray1988 == null || Class23.anInt553 - class38_sub6.anInt1928 > 32) {
											Class38_Sub19 class38_sub19 = new Class38_Sub19();
											class38_sub19.aClass38_Sub6_2241 = class38_sub6;
											class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1884;
											Class55.aClass13_1215.method68(class38_sub19, (byte) 76);
										} else
											while_2_: for (int i_37_ = class38_sub6.anInt1928; Class23.anInt553 > i_37_; i_37_++) {
												int i_38_ = Class51.anIntArray1125[i_37_ & 0x1f];
												for (int i_39_ = 0; i_39_ < class38_sub6.anIntArray1988.length; i_39_++)
													if (i_38_ == class38_sub6.anIntArray1988[i_39_]) {
														Class38_Sub19 class38_sub19 = new Class38_Sub19();
														class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1884;
														class38_sub19.aClass38_Sub6_2241 = class38_sub6;
														Class55.aClass13_1215.method68(class38_sub19, (byte) 85);
														break while_2_;
													}
											}
										class38_sub6.anInt1928 = Class23.anInt553;
									}
									if (Class38_Sub10_Sub1.anInt2658 > class38_sub6.anInt1986 && class38_sub6.anObjectArray1895 != null) {
										Class38_Sub19 class38_sub19 = new Class38_Sub19();
										class38_sub19.aClass38_Sub6_2241 = class38_sub6;
										class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1895;
										Class55.aClass13_1215.method68(class38_sub19, (byte) 46);
									}
									if (class38_sub6.anInt1986 < Class81.anInt1624 && class38_sub6.anObjectArray1893 != null) {
										Class38_Sub19 class38_sub19 = new Class38_Sub19();
										class38_sub19.aClass38_Sub6_2241 = class38_sub6;
										class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1893;
										Class55.aClass13_1215.method68(class38_sub19, (byte) 40);
									}
									if (Class33.anInt789 > class38_sub6.anInt1986 && class38_sub6.anObjectArray1906 != null) {
										Class38_Sub19 class38_sub19 = new Class38_Sub19();
										class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1906;
										class38_sub19.aClass38_Sub6_2241 = class38_sub6;
										Class55.aClass13_1215.method68(class38_sub19, (byte) 69);
									}
									if (class38_sub6.anInt1986 < Class38_Sub20_Sub3_Sub2.anInt3260 && class38_sub6.anObjectArray1935 != null) {
										Class38_Sub19 class38_sub19 = new Class38_Sub19();
										class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1935;
										class38_sub19.aClass38_Sub6_2241 = class38_sub6;
										Class55.aClass13_1215.method68(class38_sub19, (byte) 82);
									}
									class38_sub6.anInt1986 = Entity.anInt3513;
									if (class38_sub6.anObjectArray1854 != null)
										for (int i_40_ = 0; i_40_ < ObjectDefinition.anInt2496; i_40_++) {
											Class38_Sub19 class38_sub19 = new Class38_Sub19();
											class38_sub19.aClass38_Sub6_2241 = class38_sub6;
											class38_sub19.anInt2231 = Class38_Sub18.anIntArray2223[i_40_];
											class38_sub19.anInt2239 = Class55.anIntArray1227[i_40_];
											class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1854;
											Class55.aClass13_1215.method68(class38_sub19, (byte) 68);
										}
								}
							}
							if (!class38_sub6.aBool1961) {
								if (Class15.aClass38_Sub6_293 != null || Class38_Sub20_Sub8.aClass38_Sub6_2877 != null || SceneModel.aBool2553)
									break;
								if ((class38_sub6.anInt1865 >= 0 || class38_sub6.anInt1943 != 0) && Class23.anInt543 >= i_17_ && i_20_ <= Class45.anInt1015 && i_18_ > Class23.anInt543 && Class45.anInt1015 < i_19_)
									if (class38_sub6.anInt1865 < 0)
										Class38_Sub2.aClass38_Sub6_1774 = class38_sub6;
									else
										Class38_Sub2.aClass38_Sub6_1774 = class38_sub6s[class38_sub6.anInt1865];
								if (class38_sub6.anInt1868 == 8 && Class23.anInt543 >= i_17_ && i_20_ <= Class45.anInt1015 && Class23.anInt543 < i_18_ && i_19_ > Class45.anInt1015)
									Class54.aClass38_Sub6_1186 = class38_sub6;
								if (class38_sub6.anInt1933 > class38_sub6.anInt1886)
									Class23.method200(i_16_, class38_sub6, Class45.anInt1015, class38_sub6.anInt1923 + i_15_, 114, class38_sub6.anInt1886, Class23.anInt543, class38_sub6.anInt1933);
							}
						}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mb.A(" + (class38_sub6s != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')');
		}
	}

	public static void method213(int i) {
		try {
			Class25.aClass83_585 = null;
			Class25.aClass17_589 = null;
			if (i != 20629)
				Class25.method210(null, false, null, null, null);
			Class25.aClass19_578 = null;
			Class25.aClass19_582 = null;
			Class25.aClass73_579 = null;
			Class25.aClass19_593 = null;
			Class25.aClass19_596 = null;
			Class25.aByteArrayArrayArray583 = null;
			Class25.aClass19_592 = null;
			Class25.aClass19_576 = null;
			Class25.aClass19_584 = null;
			Class25.aClass19_597 = null;
			Class25.aClass19_587 = null;
			Class25.aClass19_586 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mb.D(" + i + ')');
		}
	}

	static {
		Class25.aClass19_578 = RSString.createRSString("Loaded interfaces");
		Class25.aClass19_576 = RSString.createRSString("Loaded wordpack");
		Class25.aClass19_586 = Class25.aClass19_576;
		Class25.anInt591 = 0;
		Class25.aClass19_587 = Class25.aClass19_578;
		Class25.aClass19_593 = RSString.createRSString("blaugr-Un:");
		Class25.aClass19_592 = RSString.createRSString("Loading title screen )2 ");
		Class25.aClass19_584 = Class25.aClass19_592;
		Class25.anInt594 = 0;
		Class25.aClass83_585 = new Class83(200);
		Class25.aClass19_597 = RSString.createRSString("Account locked as we suspect it has been stolen)3");
		Class25.aClass19_596 = Class25.aClass19_597;
	}
}
