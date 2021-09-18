/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class42 {
	static int anInt949;
	static int anInt950;
	static RSString aClass19_952;
	static RSString aClass19_953;
	static long[] aLongArray954 = new long[32];
	static RSString aClass19_957;
	static int anInt962;
	static int anInt964;
	static boolean aBool965;
	private static RSString aClass19_951;

	static {
		Class42.aClass19_952 = RSString.createRSString("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");
		Class42.aClass19_953 = RSString.createRSString("Diese Welt ist voll)3");
		Class42.anInt962 = 0;
		Class42.anInt949 = 0;
		Class42.anInt964 = 0;
		Class42.aClass19_951 = RSString.createRSString("Too many connections from your address)3");
		Class42.aBool965 = false;
		Class42.aClass19_957 = Class42.aClass19_951;
	}

	static final void method354(boolean bool) {
		try {
			if (RS2Buffer.anInt2412 > 0) {
				for (int i = 0; i < 256; i++)
					if (RS2Buffer.anInt2412 <= 768) {
						if (RS2Buffer.anInt2412 > 256)
							Class83.anIntArray1652[i] = Class38_Sub20_Sub11.anIntArray2962[i];
						else
							Class83.anIntArray1652[i] = Class25.method209(Class44.anIntArray997[i], -RS2Buffer.anInt2412 + 256, (byte) 35, Class38_Sub20_Sub11.anIntArray2962[i]);
					} else
						Class83.anIntArray1652[i] = Class25.method209(Class38_Sub20_Sub11.anIntArray2962[i], -RS2Buffer.anInt2412 + 1024, (byte) 35, Class44.anIntArray997[i]);
			} else if (Class25.anInt594 > 0) {
				for (int i = 0; i < 256; i++)
					if (Class25.anInt594 > 768)
						Class83.anIntArray1652[i] = Class25.method209(Class67.anIntArray1385[i], -Class25.anInt594 + 1024, (byte) 35, Class44.anIntArray997[i]);
					else if (Class25.anInt594 <= 256)
						Class83.anIntArray1652[i] = Class25.method209(Class44.anIntArray997[i], 256 - Class25.anInt594, (byte) 35, Class67.anIntArray1385[i]);
					else
						Class83.anIntArray1652[i] = Class67.anIntArray1385[i];
			} else
				for (int i = 0; i < 256; i++)
					Class83.anIntArray1652[i] = Class44.anIntArray997[i];
			int i = 0;
			int i_0_ = 6885;
			int i_1_ = 256;
			Class38_Sub20_Sub9.method971(0, 9, 128, i_1_ + 7);
			Class6.aClass38_Sub20_Sub9_Sub3_129.method1123(0, 0);
			Class38_Sub20_Sub9.method961();
			for (int i_2_ = 1; i_1_ - 1 > i_2_; i_2_++) {
				int i_3_ = (-i_2_ + i_1_) * Class73_Sub2.anIntArray2299[i_2_] / i_1_;
				int i_4_ = i_3_ + 22;
				if (i_4_ < 0)
					i_4_ = 0;
				i += i_4_;
				for (int i_5_ = i_4_; i_5_ < 128; i_5_++) {
					int i_6_ = Class2_Sub1.anIntArray2004[i++];
					if (i_6_ == 0)
						i_0_++;
					else {
						int i_7_ = i_6_;
						int i_8_ = Class38_Sub2.aClass2_1768.anIntArray28[i_0_];
						int i_9_ = -i_6_ + 256;
						i_6_ = Class83.anIntArray1652[i_6_];
						Class38_Sub2.aClass2_1768.anIntArray28[i_0_++] = Class38_Sub10_Sub3.method941(16711680, Class38_Sub10_Sub3.method941(i_6_, 65280) * i_7_ + i_9_ * Class38_Sub10_Sub3.method941(i_8_, 65280)) + Class38_Sub10_Sub3.method941(i_9_ * Class38_Sub10_Sub3.method941(i_8_, 16711935) + Class38_Sub10_Sub3.method941(16711935, i_6_) * i_7_, -16711936) >> 8;
					}
				}
				i_0_ += 765 - (-i_4_ + 128);
			}
			i_0_ = 7546;
			i = 0;
			Class38_Sub20_Sub9.method971(637, 9, 765, i_1_ + 7);
			Class3.aClass38_Sub20_Sub9_Sub3_47.method1123(382, 0);
			if (bool != true)
				Class42.method357(54);
			Class38_Sub20_Sub9.method961();
			for (int i_10_ = 1; i_10_ < i_1_ - 1; i_10_++) {
				int i_11_ = Class73_Sub2.anIntArray2299[i_10_] * (-i_10_ + i_1_) / i_1_;
				i_0_ += i_11_;
				int i_12_ = -i_11_ + 103;
				for (int i_13_ = 0; i_12_ > i_13_; i_13_++) {
					int i_14_ = Class2_Sub1.anIntArray2004[i++];
					if (i_14_ == 0)
						i_0_++;
					else {
						int i_15_ = i_14_;
						int i_16_ = -i_14_ + 256;
						int i_17_ = Class38_Sub2.aClass2_1768.anIntArray28[i_0_];
						i_14_ = Class83.anIntArray1652[i_14_];
						Class38_Sub2.aClass2_1768.anIntArray28[i_0_++] = Class38_Sub10_Sub3.method941(Class38_Sub10_Sub3.method941(i_14_, 16711935) * i_15_ + i_16_ * Class38_Sub10_Sub3.method941(16711935, i_17_), -16711936) + Class38_Sub10_Sub3.method941(Class38_Sub10_Sub3.method941(i_14_, 65280) * i_15_ + i_16_ * Class38_Sub10_Sub3.method941(i_17_, 65280), 16711680) >> 8;
					}
				}
				i += -i_12_ + 128;
				i_0_ += -i_11_ - i_12_ + 765;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "s.H(" + bool + ')');
		}
	}

	private static final RSString method355(int i, int i_18_) {
		try {
			RSString class19 = RuntimeException_Sub1.method1098(i, i_18_ ^ i_18_);
			for (int i_19_ = class19.method143((byte) 32) - 3; i_19_ > 0; i_19_ -= 3)
				class19 = Class9.method43(new RSString[] { class19.method144((byte) -120, 0, i_19_), Class49.aClass19_1100, class19.method171((byte) -64, i_19_) }, (byte) -20);
			if (class19.method143((byte) 36) > 9)
				return Class9.method43(new RSString[] { Class50.aClass19_1110, class19.method144((byte) 57, 0, class19.method143((byte) 88) - 8), Class17_Sub1.aClass19_1719, Class38_Sub10_Sub3.aClass19_2825, class19, Class38_Sub20_Sub3_Sub2.aClass19_3247 }, (byte) -20);
			if (class19.method143((byte) 95) > 6)
				return Class9.method43(new RSString[] { Class38_Sub11.aClass19_2107, class19.method144((byte) -128, 0, class19.method143((byte) 60) - 4), Class29.aClass19_698, Class38_Sub10_Sub3.aClass19_2825, class19, Class38_Sub20_Sub3_Sub2.aClass19_3247 }, (byte) -20);
			return Class9.method43(new RSString[] { Class26.aClass19_612, class19, Class38_Sub20_Sub16.aClass19_3095 }, (byte) -20);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "s.D(" + i + ',' + i_18_ + ')');
		}
	}

	static final void method356(int i, int i_20_, int i_21_, Class38_Sub6[] class38_sub6s, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		try {
			Class38_Sub20_Sub9.method971(i_21_, i_26_, i_20_, i_27_);
			Class38_Sub20_Sub9_Sub4.method1191();
			int i_28_ = 0;
			if (i != 1)
				Class42.method356(91, -79, -124, null, -18, 20, 127, 30, 76, 125);
			for (/**/; class38_sub6s.length > i_28_; i_28_++) {
				Class38_Sub6 class38_sub6 = class38_sub6s[i_28_];
				if (class38_sub6 != null && (i_22_ == class38_sub6.anInt1977 || i_22_ == -1412584499 && Class15.aClass38_Sub6_293 == class38_sub6)) {
					int i_29_;
					if (i_25_ != -1)
						i_29_ = i_25_;
					else {
						Class38_Sub8.anIntArray2045[Class38_Sub20_Sub11.anInt2957] = i_23_ + class38_sub6.anInt1942;
						Class67.anIntArray1387[Class38_Sub20_Sub11.anInt2957] = i_24_ + class38_sub6.anInt1968;
						Class22.anIntArray536[Class38_Sub20_Sub11.anInt2957] = class38_sub6.anInt1923;
						Class64.anIntArray1356[Class38_Sub20_Sub11.anInt2957] = class38_sub6.anInt1886;
						i_29_ = Class38_Sub20_Sub11.anInt2957++;
					}
					class38_sub6.anInt1936 = i_29_;
					class38_sub6.anInt1953 = Class45.anInt1016;
					if (!class38_sub6.aBool1961 || !Class43.method362(true, class38_sub6)) {
						if (class38_sub6.anInt1958 > 0)
							Class38_Sub20_Sub8.method951(1, class38_sub6);
						int i_30_ = i_23_ + class38_sub6.anInt1942;
						int i_31_ = class38_sub6.anInt1974;
						int i_32_ = class38_sub6.anInt1968 + i_24_;
						if (Class15.aClass38_Sub6_293 == class38_sub6) {
							if (i_22_ != -1412584499 && !class38_sub6.aBool1975) {
								Class24.anInt566 = i_24_;
								Class79.anInt1575 = i_23_;
								Class38_Sub1.aClass38_Sub6Array1731 = class38_sub6s;
								continue;
							}
							if (!class38_sub6.aBool1975)
								i_31_ = 128;
							if (Class38_Sub22.aBool2315 && Class21.aBool524) {
								int i_33_ = Class45.anInt1015;
								i_33_ -= Class28.anInt677;
								if (Class47.anInt1048 > i_33_)
									i_33_ = Class47.anInt1048;
								if (Class74.aClass38_Sub6_1463.anInt1886 + Class47.anInt1048 < i_33_ + class38_sub6.anInt1886)
									i_33_ = -class38_sub6.anInt1886 + Class74.aClass38_Sub6_1463.anInt1886 + Class47.anInt1048;
								int i_34_ = Class23.anInt543;
								i_34_ -= Class3.anInt63;
								i_32_ = i_33_;
								if (NPC.anInt3554 > i_34_)
									i_34_ = NPC.anInt3554;
								if (Class74.aClass38_Sub6_1463.anInt1923 + NPC.anInt3554 < i_34_ + class38_sub6.anInt1923)
									i_34_ = NPC.anInt3554 - (-Class74.aClass38_Sub6_1463.anInt1923 + class38_sub6.anInt1923);
								i_30_ = i_34_;
							}
						}
						int i_35_;
						int i_36_;
						int i_37_;
						int i_38_;
						if (class38_sub6.anInt1868 == 2) {
							i_38_ = i_27_;
							i_36_ = i_21_;
							i_35_ = i_26_;
							i_37_ = i_20_;
						} else if (class38_sub6.anInt1868 != 9) {
							i_35_ = i_26_ < i_32_ ? i_32_ : i_26_;
							i_36_ = i_30_ > i_21_ ? i_30_ : i_21_;
							int i_39_ = i_30_ + class38_sub6.anInt1923;
							int i_40_ = i_32_ + class38_sub6.anInt1886;
							i_37_ = i_39_ < i_20_ ? i_39_ : i_20_;
							i_38_ = i_40_ >= i_27_ ? i_27_ : i_40_;
						} else {
							int i_41_ = i_32_;
							int i_42_ = i_30_;
							int i_43_ = class38_sub6.anInt1886 + i_32_;
							int i_44_ = class38_sub6.anInt1923 + i_30_;
							if (i_42_ > i_44_) {
								int i_45_ = i_42_;
								i_42_ = i_44_;
								i_44_ = i_45_;
							}
							i_36_ = i_21_ >= i_42_ ? i_21_ : i_42_;
							if (i_41_ > i_43_) {
								int i_46_ = i_41_;
								i_41_ = i_43_;
								i_43_ = i_46_;
							}
							i_35_ = i_41_ <= i_26_ ? i_26_ : i_41_;
							i_38_ = ++i_43_ < i_27_ ? i_43_ : i_27_;
							i_44_++;
							i_37_ = i_20_ <= i_44_ ? i_20_ : i_44_;
						}
						if (!class38_sub6.aBool1961 || i_37_ > i_36_ && i_35_ < i_38_) {
							if (class38_sub6.anInt1958 != 0) {
								if (class38_sub6.anInt1958 == 1337) {
									Class38_Sub4.anInt1795 = i_32_;
									RSString.anInt481 = i_30_;
									Class49.method394(class38_sub6.anInt1923, i_30_, class38_sub6.anInt1886, (byte) 117, i_32_);
									Class38_Sub20_Sub9.method971(i_21_, i_26_, i_20_, i_27_);
									continue;
								}
								if (class38_sub6.anInt1958 == 1338) {
									Class28.method273(i_32_, i_30_, i_29_, i ^ ~0x7d);
									Class38_Sub20_Sub9.method971(i_21_, i_26_, i_20_, i_27_);
									continue;
								}
							}
							int i_47_ = Class23.anInt543;
							int i_48_ = Class45.anInt1015;
							if (!SceneModel.aBool2553 && i_36_ <= i_47_ && i_35_ <= i_48_ && i_37_ > i_47_ && i_38_ > i_48_)
								RuntimeException_Sub1.method1099(true, -i_32_ + i_48_, class38_sub6, i_47_ - i_30_);
							if (class38_sub6.anInt1868 == 0) {
								if (!class38_sub6.aBool1961 && Class43.method362(true, class38_sub6) && class38_sub6 != Class38_Sub2.aClass38_Sub6_1774)
									continue;
								if (!class38_sub6.aBool1961) {
									if (class38_sub6.anInt1933 - class38_sub6.anInt1886 < class38_sub6.anInt1985)
										class38_sub6.anInt1985 = -class38_sub6.anInt1886 + class38_sub6.anInt1933;
									if (class38_sub6.anInt1985 < 0)
										class38_sub6.anInt1985 = 0;
								}
								Class42.method356(1, i_37_, i_36_, class38_sub6s, class38_sub6.anInt1856, i_30_ - class38_sub6.anInt1956, -class38_sub6.anInt1985 + i_32_, i_29_, i_35_, i_38_);
								if (class38_sub6.aClass38_Sub6Array1867 != null)
									Class42.method356(1, i_37_, i_36_, class38_sub6.aClass38_Sub6Array1867, class38_sub6.anInt1856, -class38_sub6.anInt1956 + i_30_, -class38_sub6.anInt1985 + i_32_, i_29_, i_35_, i_38_);
								Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method75(class38_sub6.anInt1856, (byte) -106);
								if (class38_sub8 != null) {
									if (class38_sub8.anInt2049 == 0 && Class23.anInt543 >= i_36_ && Class45.anInt1015 >= i_35_ && Class23.anInt543 < i_37_ && i_38_ > Class45.anInt1015 && !SceneModel.aBool2553 && !Node.aBool892) {
										Class72.anInt1417 = 1;
										Class17_Sub1.anIntArray1709[0] = 1007;
										Class10.aClass19Array194[0] = Class38_Sub14.aClass19_2137;
										Class37.aClass19Array865[0] = Class38_Sub22.aClass19_2312;
									}
									Class24.method207(i_35_, -101, i_30_, class38_sub8.anInt2038, i_36_, i_29_, i_37_, i_38_, i_32_);
								}
								Class38_Sub20_Sub9.method971(i_21_, i_26_, i_20_, i_27_);
								Class38_Sub20_Sub9_Sub4.method1191();
							}
							if (Class38_Sub20_Sub14.aBoolArray3036[i_29_] || Class38_Sub14.anInt2139 > 1) {
								if (class38_sub6.anInt1868 == 0 && !class38_sub6.aBool1961 && class38_sub6.anInt1886 < class38_sub6.anInt1933)
									RSString.method160((byte) 53, class38_sub6.anInt1985, i_32_, class38_sub6.anInt1923 + i_30_, class38_sub6.anInt1933, class38_sub6.anInt1886);
								if (class38_sub6.anInt1868 != 1)
									if (class38_sub6.anInt1868 == 2) {
										int i_49_ = 0;
										for (int i_50_ = 0; class38_sub6.anInt1886 > i_50_; i_50_++)
											for (int i_51_ = 0; i_51_ < class38_sub6.anInt1923; i_51_++) {
												int i_52_ = i_30_ + (32 + class38_sub6.anInt1931) * i_51_;
												int i_53_ = i_32_ + i_50_ * (class38_sub6.anInt1897 + 32);
												if (i_49_ < 20) {
													i_53_ += class38_sub6.anIntArray1858[i_49_];
													i_52_ += class38_sub6.anIntArray1922[i_49_];
												}
												if (class38_sub6.anIntArray1947[i_49_] > 0) {
													boolean bool = false;
													boolean bool_54_ = false;
													int i_55_ = class38_sub6.anIntArray1947[i_49_] - 1;
													if (i_21_ < i_52_ + 32 && i_52_ < i_20_ && i_26_ < i_53_ + 32 && i_53_ < i_27_ || Class38_Sub20_Sub8.aClass38_Sub6_2877 == class38_sub6 && i_49_ == Class38_Sub3.anInt1786) {
														Class38_Sub20_Sub9_Sub3 class38_sub20_sub9_sub3;
														if (Class42.anInt964 != 1 || i_49_ != Class38_Sub10_Sub3.anInt2837 || Class17_Sub1.anInt1713 != class38_sub6.anInt1856)
															class38_sub20_sub9_sub3 = Class38_Sub20_Sub11.method983(1, i_55_, -123, false, 3153952, class38_sub6.anIntArray1866[i_49_]);
														else
															class38_sub20_sub9_sub3 = Class38_Sub20_Sub11.method983(2, i_55_, 54, false, 0, class38_sub6.anIntArray1866[i_49_]);
														if (class38_sub20_sub9_sub3 != null) {
															if (class38_sub6 != Class38_Sub20_Sub8.aClass38_Sub6_2877 || Class38_Sub3.anInt1786 != i_49_) {
																if (class38_sub6 != client.atInventoryInterfaceType || Class38_Sub20_Sub8.anInt2883 != i_49_)
																	class38_sub20_sub9_sub3.method1105(i_52_, i_53_);
																else
																	class38_sub20_sub9_sub3.method1120(i_52_, i_53_, 128);
															} else {
																int i_56_ = Class23.anInt543 - Class75.anInt1475;
																int i_57_ = Class45.anInt1015 - Class44.anInt988;
																if (i_56_ < 5 && i_56_ > -5)
																	i_56_ = 0;
																if (i_57_ < 5 && i_57_ > -5)
																	i_57_ = 0;
																if (Class10.anInt188 < 5) {
																	i_57_ = 0;
																	i_56_ = 0;
																}
																class38_sub20_sub9_sub3.method1120(i_52_ + i_56_, i_53_ + i_57_, 128);
																if (i_22_ != -1) {
																	Class38_Sub6 class38_sub6_58_ = class38_sub6s[i_22_ & 0xffff];
																	if (Class38_Sub20_Sub9.anInt2885 > i_57_ + i_53_ && class38_sub6_58_.anInt1985 > 0) {
																		int i_59_ = (Class38_Sub20_Sub9.anInt2885 + -i_53_ - i_57_) * Canvas_Sub1.anInt2529 / 3;
																		if (i_59_ > Canvas_Sub1.anInt2529 * 10)
																			i_59_ = Canvas_Sub1.anInt2529 * 10;
																		if (i_59_ > class38_sub6_58_.anInt1985)
																			i_59_ = class38_sub6_58_.anInt1985;
																		class38_sub6_58_.anInt1985 -= i_59_;
																		Class44.anInt988 += i_59_;
																		Class40.method340(class38_sub6_58_, (byte) -124);
																	}
																	if (i_57_ + i_53_ + 32 > Class38_Sub20_Sub9.anInt2888 && -class38_sub6_58_.anInt1886 + class38_sub6_58_.anInt1933 > class38_sub6_58_.anInt1985) {
																		int i_60_ = Canvas_Sub1.anInt2529 * (i_53_ + i_57_ + 32 - Class38_Sub20_Sub9.anInt2888) / 3;
																		if (Canvas_Sub1.anInt2529 * 10 < i_60_)
																			i_60_ = Canvas_Sub1.anInt2529 * 10;
																		if (i_60_ > -class38_sub6_58_.anInt1985 - class38_sub6_58_.anInt1886 + class38_sub6_58_.anInt1933)
																			i_60_ = class38_sub6_58_.anInt1933 - (class38_sub6_58_.anInt1886 + class38_sub6_58_.anInt1985);
																		class38_sub6_58_.anInt1985 += i_60_;
																		Class44.anInt988 -= i_60_;
																		Class40.method340(class38_sub6_58_, (byte) -101);
																	}
																}
															}
														} else
															Class40.method340(class38_sub6, (byte) -115);
													}
												} else if (class38_sub6.anIntArray1874 != null && i_49_ < 20) {
													Class38_Sub20_Sub9_Sub3 class38_sub20_sub9_sub3 = class38_sub6.method642(0, i_49_);
													if (class38_sub20_sub9_sub3 == null) {
														if (Class42.aBool965)
															Class40.method340(class38_sub6, (byte) -104);
													} else
														class38_sub20_sub9_sub3.method1105(i_52_, i_53_);
												}
												i_49_++;
											}
									} else if (class38_sub6.anInt1868 == 3) {
										int i_61_;
										if (Class24.method208(class38_sub6, 76)) {
											i_61_ = class38_sub6.anInt1982;
											if (class38_sub6 == Class38_Sub2.aClass38_Sub6_1774 && class38_sub6.anInt1896 != 0)
												i_61_ = class38_sub6.anInt1896;
										} else {
											i_61_ = class38_sub6.anInt1889;
											if (class38_sub6 == Class38_Sub2.aClass38_Sub6_1774 && class38_sub6.anInt1943 != 0)
												i_61_ = class38_sub6.anInt1943;
										}
										if (i_31_ != 0) {
											if (class38_sub6.aBool1916)
												Class38_Sub20_Sub9.method962(i_30_, i_32_, class38_sub6.anInt1923, class38_sub6.anInt1886, i_61_, -(i_31_ & 0xff) + 256);
											else
												Class38_Sub20_Sub9.method973(i_30_, i_32_, class38_sub6.anInt1923, class38_sub6.anInt1886, i_61_, -(i_31_ & 0xff) + 256);
										} else if (!class38_sub6.aBool1916)
											Class38_Sub20_Sub9.method963(i_30_, i_32_, class38_sub6.anInt1923, class38_sub6.anInt1886, i_61_);
										else
											Class38_Sub20_Sub9.method958(i_30_, i_32_, class38_sub6.anInt1923, class38_sub6.anInt1886, i_61_);
									} else if (class38_sub6.anInt1868 == 4) {
										Class38_Sub20_Sub9_Sub1_Sub1 class38_sub20_sub9_sub1_sub1 = class38_sub6.method637(false);
										if (class38_sub20_sub9_sub1_sub1 == null) {
											if (Class42.aBool965)
												Class40.method340(class38_sub6, (byte) -111);
										} else {
											RSString class19 = class38_sub6.aClass19_1876;
											int i_62_;
											if (!Class24.method208(class38_sub6, i ^ 0x7c)) {
												i_62_ = class38_sub6.anInt1889;
												if (class38_sub6 == Class38_Sub2.aClass38_Sub6_1774 && class38_sub6.anInt1943 != 0)
													i_62_ = class38_sub6.anInt1943;
											} else {
												i_62_ = class38_sub6.anInt1982;
												if (Class38_Sub2.aClass38_Sub6_1774 == class38_sub6 && class38_sub6.anInt1896 != 0)
													i_62_ = class38_sub6.anInt1896;
												if (class38_sub6.aClass19_1887.method143((byte) 83) > 0)
													class19 = class38_sub6.aClass19_1887;
											}
											if (class38_sub6.aBool1961 && class38_sub6.anInt1917 != -1) {
												ItemDefinition class38_sub20_sub6 = Node.forId(class38_sub6.anInt1917, 80);
												class19 = class38_sub20_sub6.aClass19_2808;
												if (class19 == null)
													class19 = Class41.aClass19_948;
												if ((class38_sub20_sub6.anInt2788 == 1 || class38_sub6.anInt1899 != 1) && class38_sub6.anInt1899 != -1)
													class19 = Class9.method43(new RSString[] { Class38_Sub11.aClass19_2082, class19, Entity.aClass19_3465, Class42.method355(class38_sub6.anInt1899, i) }, (byte) -20);
											}
											if (Class38_Sub2.aClass38_Sub6_1769 == class38_sub6) {
												class19 = Class59.aClass19_1297;
												i_62_ = class38_sub6.anInt1889;
											}
											if (!class38_sub6.aBool1961)
												class19 = Class29.method276(class38_sub6, class19, false);
											class38_sub20_sub9_sub1_sub1.method1060(class19, i_30_, i_32_, class38_sub6.anInt1923, class38_sub6.anInt1886, i_62_, class38_sub6.aBool1969 ? 0 : -1, class38_sub6.anInt1954, class38_sub6.anInt1912, class38_sub6.anInt1951);
										}
									} else if (class38_sub6.anInt1868 == 5) {
										if (!class38_sub6.aBool1961) {
											Class38_Sub20_Sub9_Sub3 class38_sub20_sub9_sub3 = class38_sub6.method634(-105, Class24.method208(class38_sub6, i ^ 0x2e));
											if (class38_sub20_sub9_sub3 == null) {
												if (Class42.aBool965)
													Class40.method340(class38_sub6, (byte) -107);
											} else
												class38_sub20_sub9_sub3.method1105(i_30_, i_32_);
										} else {
											Class38_Sub20_Sub9_Sub3 class38_sub20_sub9_sub3;
											if (class38_sub6.anInt1917 == -1)
												class38_sub20_sub9_sub3 = class38_sub6.method634(-81, false);
											else
												class38_sub20_sub9_sub3 = Class38_Sub20_Sub11.method983(class38_sub6.anInt1909, class38_sub6.anInt1917, 92, false, class38_sub6.anInt1930, class38_sub6.anInt1899);
											if (class38_sub20_sub9_sub3 == null) {
												if (Class42.aBool965)
													Class40.method340(class38_sub6, (byte) -100);
											} else {
												int i_63_ = class38_sub20_sub9_sub3.anInt3294;
												int i_64_ = class38_sub20_sub9_sub3.anInt3296;
												if (!class38_sub6.aBool1861) {
													int i_65_ = class38_sub6.anInt1923 * 4096 / i_63_;
													if (class38_sub6.anInt1890 != 0)
														class38_sub20_sub9_sub3.method1118(class38_sub6.anInt1923 / 2 + i_30_, i_32_ + class38_sub6.anInt1886 / 2, class38_sub6.anInt1890, i_65_);
													else if (i_31_ == 0) {
														if (class38_sub6.anInt1923 != i_63_ || class38_sub6.anInt1886 != i_64_)
															class38_sub20_sub9_sub3.method1106(i_30_, i_32_, class38_sub6.anInt1923, class38_sub6.anInt1886);
														else
															class38_sub20_sub9_sub3.method1105(i_30_, i_32_);
													} else
														class38_sub20_sub9_sub3.method1108(i_30_, i_32_, class38_sub6.anInt1923, class38_sub6.anInt1886, -(i_31_ & 0xff) + 256);
												} else {
													Class38_Sub20_Sub9.method970(i_30_, i_32_, i_30_ + class38_sub6.anInt1923, class38_sub6.anInt1886 + i_32_);
													int i_66_ = (i_63_ + class38_sub6.anInt1923 - 1) / i_63_;
													int i_67_ = (-1 - (-i_64_ - class38_sub6.anInt1886)) / i_64_;
													for (int i_68_ = 0; i_66_ > i_68_; i_68_++)
														for (int i_69_ = 0; i_67_ > i_69_; i_69_++)
															if (class38_sub6.anInt1890 == 0) {
																if (i_31_ != 0)
																	class38_sub20_sub9_sub3.method1120(i_68_ * i_63_ + i_30_, i_69_ * i_64_ + i_32_, -(i_31_ & 0xff) + 256);
																else
																	class38_sub20_sub9_sub3.method1105(i_30_ + i_63_ * i_68_, i_32_ + i_69_ * i_64_);
															} else
																class38_sub20_sub9_sub3.method1118(i_30_ - (-(i_63_ * i_68_) - i_63_ / 2), i_64_ * i_69_ + i_32_ + i_64_ / 2, class38_sub6.anInt1890, 4096);
													Class38_Sub20_Sub9.method971(i_21_, i_26_, i_20_, i_27_);
												}
											}
										}
									} else if (class38_sub6.anInt1868 == 6) {
										boolean bool = Class24.method208(class38_sub6, 54);
										int i_70_;
										if (bool)
											i_70_ = class38_sub6.anInt1900;
										else
											i_70_ = class38_sub6.anInt1878;
										Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = null;
										int i_71_ = 0;
										if (class38_sub6.anInt1917 == -1) {
											if (class38_sub6.anInt1883 != 5) {
												if (i_70_ != -1) {
													Class38_Sub20_Sub4 class38_sub20_sub4 = Sequence.forID((byte) 105, i_70_);
													class38_sub20_sub3_sub1 = class38_sub6.method641(class38_sub20_sub4, -50, client.myPlayer.appearance, class38_sub6.anInt1875, bool);
													if (class38_sub20_sub3_sub1 == null && Class42.aBool965)
														Class40.method340(class38_sub6, (byte) -124);
												} else {
													class38_sub20_sub3_sub1 = class38_sub6.method641(null, i - 51, client.myPlayer.appearance, -1, bool);
													if (class38_sub20_sub3_sub1 == null && Class42.aBool965)
														Class40.method340(class38_sub6, (byte) -106);
												}
											} else if (class38_sub6.anInt1962 == 0)
												class38_sub20_sub3_sub1 = Class38_Sub20_Sub15.aClass18_3072.method136(null, -1, null, -5774, -1);
											else
												class38_sub20_sub3_sub1 = client.myPlayer.method820((byte) 109);
										} else {
											ItemDefinition class38_sub20_sub6 = Node.forId(class38_sub6.anInt1917, 27);
											if (class38_sub20_sub6 != null) {
												class38_sub20_sub6 = class38_sub20_sub6.method926(class38_sub6.anInt1899);
												class38_sub20_sub3_sub1 = class38_sub20_sub6.method925(1, i ^ 0x1);
												if (class38_sub20_sub3_sub1 != null) {
													class38_sub20_sub3_sub1.method1043();
													i_71_ = class38_sub20_sub3_sub1.height / 2;
												} else
													Class40.method340(class38_sub6, (byte) -121);
											}
										}
										Class38_Sub20_Sub9_Sub4.method1198(class38_sub6.anInt1923 / 2 + i_30_, class38_sub6.anInt1886 / 2 + i_32_);
										int i_72_ = Class38_Sub20_Sub9_Sub4.anIntArray3520[class38_sub6.anInt1925] * class38_sub6.anInt1921 >> 16;
										int i_73_ = class38_sub6.anInt1921 * Class38_Sub20_Sub9_Sub4.anIntArray3528[class38_sub6.anInt1925] >> 16;
										if (class38_sub20_sub3_sub1 != null)
											if (!class38_sub6.aBool1961)
												class38_sub20_sub3_sub1.method1052(0, class38_sub6.anInt1987, 0, class38_sub6.anInt1925, 0, i_72_, i_73_);
											else {
												class38_sub20_sub3_sub1.method1043();
												if (class38_sub6.aBool1966)
													class38_sub20_sub3_sub1.method1048(0, class38_sub6.anInt1987, class38_sub6.anInt1863, class38_sub6.anInt1925, class38_sub6.anInt1929, i_71_ + i_72_ + class38_sub6.anInt1964, class38_sub6.anInt1964 + i_73_, class38_sub6.anInt1921);
												else
													class38_sub20_sub3_sub1.method1052(0, class38_sub6.anInt1987, class38_sub6.anInt1863, class38_sub6.anInt1925, class38_sub6.anInt1929, class38_sub6.anInt1964 + i_71_ + i_72_, i_73_ + class38_sub6.anInt1964);
											}
										Class38_Sub20_Sub9_Sub4.method1187();
									} else {
										if (class38_sub6.anInt1868 == 7) {
											Class38_Sub20_Sub9_Sub1_Sub1 class38_sub20_sub9_sub1_sub1 = class38_sub6.method637(false);
											if (class38_sub20_sub9_sub1_sub1 == null) {
												if (Class42.aBool965)
													Class40.method340(class38_sub6, (byte) -128);
												continue;
											}
											int i_74_ = 0;
											for (int i_75_ = 0; i_75_ < class38_sub6.anInt1886; i_75_++)
												for (int i_76_ = 0; class38_sub6.anInt1923 > i_76_; i_76_++) {
													if (class38_sub6.anIntArray1947[i_74_] > 0) {
														ItemDefinition class38_sub20_sub6 = Node.forId(class38_sub6.anIntArray1947[i_74_] - 1, 102);
														RSString class19;
														if (class38_sub20_sub6.anInt2788 != 1 && class38_sub6.anIntArray1866[i_74_] == 1)
															class19 = Class9.method43(new RSString[] { Class38_Sub11.aClass19_2082, class38_sub20_sub6.aClass19_2808, Class38_Sub20_Sub16.aClass19_3095 }, (byte) -20);
														else
															class19 = Class9.method43(new RSString[] { Class38_Sub11.aClass19_2082, class38_sub20_sub6.aClass19_2808, Entity.aClass19_3465, Class42.method355(class38_sub6.anIntArray1866[i_74_], 1) }, (byte) -20);
														int i_77_ = i_30_ + i_76_ * (class38_sub6.anInt1931 + 115);
														int i_78_ = i_75_ * (class38_sub6.anInt1897 + 12) + i_32_;
														if (class38_sub6.anInt1954 != 0) {
															if (class38_sub6.anInt1954 == 1)
																class38_sub20_sub9_sub1_sub1.method1086(class19, i_77_ + class38_sub6.anInt1923 / 2, i_78_, class38_sub6.anInt1889, !class38_sub6.aBool1969 ? -1 : 0);
															else
																class38_sub20_sub9_sub1_sub1.method1069(class19, class38_sub6.anInt1923 + i_77_ - 1, i_78_, class38_sub6.anInt1889, !class38_sub6.aBool1969 ? -1 : 0);
														} else
															class38_sub20_sub9_sub1_sub1.method1084(class19, i_77_, i_78_, class38_sub6.anInt1889, !class38_sub6.aBool1969 ? -1 : 0);
													}
													i_74_++;
												}
										}
										if (class38_sub6.anInt1868 == 8 && Class54.aClass38_Sub6_1186 == class38_sub6 && Class38_Sub11.anInt2104 == Class38_Sub14.anInt2144) {
											int i_79_ = 0;
											Class38_Sub20_Sub9_Sub1_Sub1 class38_sub20_sub9_sub1_sub1 = Class38_Sub20_Sub13.aClass38_Sub20_Sub9_Sub1_Sub1_3023;
											RSString class19 = class38_sub6.aClass19_1876;
											class19 = Class29.method276(class38_sub6, class19, false);
											int i_80_ = 0;
											while (class19.method143((byte) 74) > 0) {
												int i_81_ = class19.method170(1, Class38_Sub4.aClass19_1820);
												RSString class19_82_;
												if (i_81_ != -1) {
													class19_82_ = class19.method144((byte) -127, 0, i_81_);
													class19 = class19.method171((byte) -36, i_81_ + 4);
												} else {
													class19_82_ = class19;
													class19 = Class38_Sub22.aClass19_2312;
												}
												int i_83_ = class38_sub20_sub9_sub1_sub1.method1061(class19_82_);
												i_80_ += class38_sub20_sub9_sub1_sub1.anInt3216 + 1;
												if (i_83_ > i_79_)
													i_79_ = i_83_;
											}
											i_79_ += 6;
											i_80_ += 7;
											int i_84_ = class38_sub6.anInt1923 + i_30_ + -i_79_ - 5;
											if (i_30_ + 5 > i_84_)
												i_84_ = i_30_ + 5;
											if (i_20_ < i_84_ + i_79_)
												i_84_ = -i_79_ + i_20_;
											int i_85_ = i_32_ + class38_sub6.anInt1886 + 5;
											if (i_27_ < i_80_ + i_85_)
												i_85_ = i_27_ - i_80_;
											Class38_Sub20_Sub9.method958(i_84_, i_85_, i_79_, i_80_, 16777120);
											Class38_Sub20_Sub9.method963(i_84_, i_85_, i_79_, i_80_, 0);
											int i_86_ = i_85_ - (-class38_sub20_sub9_sub1_sub1.anInt3216 - 2);
											class19 = class38_sub6.aClass19_1876;
											class19 = Class29.method276(class38_sub6, class19, false);
											while (class19.method143((byte) 125) > 0) {
												int i_87_ = class19.method170(i, Class38_Sub4.aClass19_1820);
												RSString class19_88_;
												if (i_87_ != -1) {
													class19_88_ = class19.method144((byte) -119, 0, i_87_);
													class19 = class19.method171((byte) -2, i_87_ + 4);
												} else {
													class19_88_ = class19;
													class19 = Class38_Sub22.aClass19_2312;
												}
												class38_sub20_sub9_sub1_sub1.method1084(class19_88_, i_84_ + 3, i_86_, 0, -1);
												i_86_ += class38_sub20_sub9_sub1_sub1.anInt3216 + 1;
											}
										}
										if (class38_sub6.anInt1868 == 9)
											if (class38_sub6.anInt1901 == 1)
												Class38_Sub20_Sub9.method960(i_30_, i_32_, i_30_ + class38_sub6.anInt1923, i_32_ + class38_sub6.anInt1886, class38_sub6.anInt1889);
											else {
												int i_89_ = class38_sub6.anInt1886 >= 0 ? class38_sub6.anInt1886 : -class38_sub6.anInt1886;
												int i_90_ = class38_sub6.anInt1923 >= 0 ? class38_sub6.anInt1923 : -class38_sub6.anInt1923;
												int i_91_ = i_90_;
												if (i_89_ > i_91_)
													i_91_ = i_89_;
												if (i_91_ != 0) {
													int i_92_ = (class38_sub6.anInt1923 << 16) / i_91_;
													int i_93_ = (class38_sub6.anInt1886 << 16) / i_91_;
													if (i_93_ > i_92_)
														i_93_ = -i_93_;
													else
														i_92_ = -i_92_;
													int i_94_ = class38_sub6.anInt1901 * i_93_ >> 17;
													int i_95_ = class38_sub6.anInt1901 * i_93_ + 1 >> 17;
													int i_96_ = class38_sub6.anInt1901 * i_92_ + 1 >> 17;
													int i_97_ = i_92_ * class38_sub6.anInt1901 >> 17;
													int i_98_ = -i_95_ + i_30_;
													int i_99_ = i_30_ + i_94_;
													int i_100_ = i_30_ - (-class38_sub6.anInt1923 + i_95_);
													int i_101_ = i_94_ + i_30_ + class38_sub6.anInt1923;
													int i_102_ = i_97_ + i_32_;
													int i_103_ = -i_96_ + i_32_;
													int i_104_ = -i_96_ + class38_sub6.anInt1886 + i_32_;
													int i_105_ = class38_sub6.anInt1886 + i_32_ + i_97_;
													Class38_Sub20_Sub9_Sub4.method1181(i_99_, i_98_, i_100_);
													Class38_Sub20_Sub9_Sub4.method1193(i_102_, i_103_, i_104_, i_99_, i_98_, i_100_, class38_sub6.anInt1889);
													Class38_Sub20_Sub9_Sub4.method1181(i_99_, i_100_, i_101_);
													Class38_Sub20_Sub9_Sub4.method1193(i_102_, i_104_, i_105_, i_99_, i_100_, i_101_, class38_sub6.anInt1889);
												}
											}
									}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "s.A(" + i + ',' + i_20_ + ',' + i_21_ + ',' + (class38_sub6s != null ? "{...}" : "null") + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ')');
		}
	}

	static final void method357(int i) {
		do {
			try {
				if (i == -7) {
					if (Class38_Sub7.aClass77_2025 != null)
						Class38_Sub7.aClass77_2025.method556(0);
					if (Class38_Sub6.aClass77_1857 == null)
						break;
					Class38_Sub6.aClass77_1857.method556(0);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "s.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method358(boolean bool) {
		do {
			try {
				for (Class38_Sub1 class38_sub1 = (Class38_Sub1) Class83.aClass13_1676.method65(91); class38_sub1 != null; class38_sub1 = (Class38_Sub1) Class83.aClass13_1676.method63(-3))
					if (class38_sub1.aClass38_Sub20_Sub1_1728 != null)
						class38_sub1.method609(13492);
				if (bool == true)
					break;
				Class42.method356(30, -81, 70, null, -128, 99, 108, -36, 22, 26);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "s.G(" + bool + ')');
			}
			break;
		} while (false);
	}

	public static void method359(boolean bool) {
		try {
			Class42.aLongArray954 = null;
			Class42.aClass19_951 = null;
			Class42.aClass19_952 = null;
			if (!bool) {
				Class42.aClass19_957 = null;
				Class42.aClass19_953 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "s.B(" + bool + ')');
		}
	}

	static final int method360(int i, int i_106_, byte i_107_) {
		try {
			if (i_107_ <= 94)
				return 70;
			if (i_106_ == -1)
				return 12345678;
			i = (i_106_ & 0x7f) * i / 128;
			if (i < 2)
				i = 2;
			else if (i > 126)
				i = 126;
			return i + (i_106_ & 0xff80);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "s.F(" + i + ',' + i_106_ + ',' + i_107_ + ')');
		}
	}

	static final RSString[] method361(RSString[] class19s, int i) {
		try {
			RSString[] class19s_108_ = new RSString[5];
			for (int i_109_ = 0; i_109_ < 5; i_109_++) {
				class19s_108_[i_109_] = Class9.method43(new RSString[] { RuntimeException_Sub1.method1098(i_109_, 0), Class38_Sub20_Sub8.aClass19_2871 }, (byte) -20);
				if (class19s != null && class19s[i_109_] != null)
					class19s_108_[i_109_] = Class9.method43(new RSString[] { class19s_108_[i_109_], class19s[i_109_] }, (byte) -20);
			}
			if (i != 3)
				Class42.method356(92, -109, -19, null, -95, -16, -118, 32, -105, -55);
			return class19s_108_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "s.E(" + (class19s != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
}
