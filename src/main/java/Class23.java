/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class23 {
	private static RSString aClass19_542 = RSString.createRSString("Continue");
	static int anInt543;
	static RSString aClass19_544;
	static RSString aClass19_545;
	static int anInt546 = 0;
	static RSString aClass19_549;
	static RSString aClass19_550;
	static RSString aClass19_551;
	static Class56 aClass56_552;
	static int anInt553;
	private static RSString aClass19_554;
	static RSString aClass19_555;
	static int anInt556;
	static RSString aClass19_557;
	static int anInt558;
	private static RSString aClass19_560;
	static RSString aClass19_562;
	static int anInt563;
	private static RSString aClass19_564;

	static final void method199(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			if (Class42.anInt964 == 0 && !Class26.aBool614)
				Class37.method328(0, PacketBuffer.aClass19_2435, 3231, i_3_ - i_1_, 3, Class38_Sub22.aClass19_2312, i - i_2_);
			int i_4_ = i_0_;
			int i_5_ = 0;
			for (/**/; i_5_ < Class38_Sub20_Sub3_Sub1.anInt3201; i_5_++) {
				int i_6_ = Class38_Sub20_Sub3_Sub1.anIntArray3186[i_5_];
				int i_7_ = (i_6_ & 0x613cc336) >> 690618365;
				int i_8_ = i_6_ & 0x7f;
				int i_9_ = (i_6_ & 0x1fffd07b) >> 440408974;
				int i_10_ = (i_6_ & 0x3fdf) >> -358270073;
				if (i_6_ != i_4_) {
					i_4_ = i_6_;
					if (i_7_ == 2 && RuntimeException_Sub1.aClass27_3292.method224(Client.height, i_8_, i_10_, i_6_) >= 0) {
						ObjectDefinition class38_sub20_sub1 = Class80.method581(7, i_9_);
						if (class38_sub20_sub1.anIntArray2498 != null)
							class38_sub20_sub1 = class38_sub20_sub1.method805((byte) -17);
						if (class38_sub20_sub1 == null)
							continue;
						if (Class42.anInt964 == 1)
							Class37.method328(i_6_, Class38_Sub10_Sub3.aClass19_2836, 3231, i_10_, 49, Class9.method43(new RSString[] { Class38_Sub2.aClass19_1759, Class41.aClass19_934, class38_sub20_sub1.aClass19_2460 }, (byte) -20), i_8_);
						else if (Class26.aBool614) {
							if ((Class28.anInt693 & 0x4) == 4)
								Class37.method328(i_6_, Class30.aClass19_736, 3231, i_10_, 2, Class9.method43(new RSString[] { Class53.aClass19_1168, Class41.aClass19_934, class38_sub20_sub1.aClass19_2460 }, (byte) -20), i_8_);
						} else {
							RSString[] class19s = class38_sub20_sub1.actions;
							if (Class44.aBool992)
								class19s = Class42.method361(class19s, i_0_ ^ ~0x3);
							if (class19s != null)
								for (int i_11_ = 4; i_11_ >= 0; i_11_--)
									if (class19s[i_11_] != null) {
										int i_12_ = 0;
										if (i_11_ == 0)
											i_12_ = 37;
										if (i_11_ == 1)
											i_12_ = 11;
										if (i_11_ == 2)
											i_12_ = 32;
										if (i_11_ == 3)
											i_12_ = 1;
										if (i_11_ == 4)
											i_12_ = 1003;
										Class37.method328(i_6_, class19s[i_11_], 3231, i_10_, i_12_, Class9.method43(new RSString[] { Class38_Sub20_Sub11.aClass19_2928, class38_sub20_sub1.aClass19_2460 }, (byte) -20), i_8_);
									}
							Class37.method328(class38_sub20_sub1.anInt2468 << 1838973038, Class50.aClass19_1112, 3231, i_10_, 1002, Class9.method43(new RSString[] { Class38_Sub20_Sub11.aClass19_2928, class38_sub20_sub1.aClass19_2460 }, (byte) -20), i_8_);
						}
					}
					if (i_7_ == 1) {
						NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_9_];
						if (class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2697 == 1 && (((Entity) class38_sub20_sub3_sub7_sub1).anInt3493 & 0x7f) == 64 && (((Entity) class38_sub20_sub3_sub7_sub1).anInt3444 & 0x7f) == 64) {
							for (int i_13_ = 0; i_13_ < Class4.anInt87; i_13_++) {
								NPC class38_sub20_sub3_sub7_sub1_14_ = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[Class38_Sub10_Sub1.anIntArray2652[i_13_]];
								if (class38_sub20_sub3_sub7_sub1_14_ != null && class38_sub20_sub3_sub7_sub1_14_ != class38_sub20_sub3_sub7_sub1 && class38_sub20_sub3_sub7_sub1_14_.aClass38_Sub20_Sub5_3543.anInt2697 == 1 && ((Entity) class38_sub20_sub3_sub7_sub1).anInt3493 == ((Entity) class38_sub20_sub3_sub7_sub1_14_).anInt3493 && ((Entity) class38_sub20_sub3_sub7_sub1).anInt3444 == ((Entity) class38_sub20_sub3_sub7_sub1_14_).anInt3444)
									RSString.method154(i_8_, class38_sub20_sub3_sub7_sub1_14_.aClass38_Sub20_Sub5_3543, i_0_ ^ ~0x321, Class38_Sub10_Sub1.anIntArray2652[i_13_], i_10_);
							}
							for (int i_15_ = 0; ItemDefinition.anInt2783 > i_15_; i_15_++) {
								Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[Class47.anIntArray1055[i_15_]];
								if (class38_sub20_sub3_sub7_sub2 != null && ((Entity) class38_sub20_sub3_sub7_sub1).anInt3493 == ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493 && ((Entity) class38_sub20_sub3_sub7_sub1).anInt3444 == ((Entity) class38_sub20_sub3_sub7_sub2).anInt3444)
									Class38_Sub20_Sub15.method1011(Class47.anIntArray1055[i_15_], i_10_, class38_sub20_sub3_sub7_sub2, (byte) 52, i_8_);
							}
						}
						RSString.method154(i_8_, class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543, 801, i_9_, i_10_);
					}
					if (i_7_ == 0) {
						Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_9_];
						if ((((Entity) class38_sub20_sub3_sub7_sub2).anInt3493 & 0x7f) == 64 && (((Entity) class38_sub20_sub3_sub7_sub2).anInt3444 & 0x7f) == 64) {
							for (int i_16_ = 0; i_16_ < Class4.anInt87; i_16_++) {
								NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[Class38_Sub10_Sub1.anIntArray2652[i_16_]];
								if (class38_sub20_sub3_sub7_sub1 != null && class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2697 == 1 && ((Entity) class38_sub20_sub3_sub7_sub1).anInt3493 == ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493 && ((Entity) class38_sub20_sub3_sub7_sub2).anInt3444 == ((Entity) class38_sub20_sub3_sub7_sub1).anInt3444)
									RSString.method154(i_8_, class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543, 801, Class38_Sub10_Sub1.anIntArray2652[i_16_], i_10_);
							}
							for (int i_17_ = 0; i_17_ < ItemDefinition.anInt2783; i_17_++) {
								Player class38_sub20_sub3_sub7_sub2_18_ = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[Class47.anIntArray1055[i_17_]];
								if (class38_sub20_sub3_sub7_sub2_18_ != null && class38_sub20_sub3_sub7_sub2 != class38_sub20_sub3_sub7_sub2_18_ && ((Entity) class38_sub20_sub3_sub7_sub2_18_).anInt3493 == ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493 && ((Entity) class38_sub20_sub3_sub7_sub2).anInt3444 == ((Entity) class38_sub20_sub3_sub7_sub2_18_).anInt3444)
									Class38_Sub20_Sub15.method1011(Class47.anIntArray1055[i_17_], i_10_, class38_sub20_sub3_sub7_sub2_18_, (byte) -102, i_8_);
							}
						}
						Class38_Sub20_Sub15.method1011(i_9_, i_10_, class38_sub20_sub3_sub7_sub2, (byte) -123, i_8_);
					}
					if (i_7_ == 3) {
						Class13 class13 = Class38_Sub21.aClass13ArrayArrayArray2259[Client.height][i_8_][i_10_];
						if (class13 != null)
							for (Class38_Sub20_Sub3_Sub4 class38_sub20_sub3_sub4 = (Class38_Sub20_Sub3_Sub4) class13.method74(i_0_ - 48); class38_sub20_sub3_sub4 != null; class38_sub20_sub3_sub4 = (Class38_Sub20_Sub3_Sub4) class13.method62(-1)) {
								ItemDefinition class38_sub20_sub6 = Node.forId(class38_sub20_sub3_sub4.anInt3348, i_0_ + 50);
								if (Class42.anInt964 != 1) {
									if (!Class26.aBool614) {
										RSString[] class19s = class38_sub20_sub6.aClass19Array2789;
										if (Class44.aBool992)
											class19s = Class42.method361(class19s, 3);
										for (int i_19_ = 4; i_19_ >= 0; i_19_--)
											if (class19s == null || class19s[i_19_] == null) {
												if (i_19_ == 2)
													Class37.method328(class38_sub20_sub3_sub4.anInt3348, Class22.aClass19_531, 3231, i_10_, 31, Class9.method43(new RSString[] { Class38_Sub11.aClass19_2082, class38_sub20_sub6.aClass19_2808 }, (byte) -20), i_8_);
											} else {
												int i_20_ = 0;
												if (i_19_ == 0)
													i_20_ = 57;
												if (i_19_ == 1)
													i_20_ = 47;
												if (i_19_ == 2)
													i_20_ = 31;
												if (i_19_ == 3)
													i_20_ = 13;
												if (i_19_ == 4)
													i_20_ = 36;
												Class37.method328(class38_sub20_sub3_sub4.anInt3348, class19s[i_19_], i_0_ ^ ~0xc9f, i_10_, i_20_, Class9.method43(new RSString[] { Class38_Sub11.aClass19_2082, class38_sub20_sub6.aClass19_2808 }, (byte) -20), i_8_);
											}
										Class37.method328(class38_sub20_sub3_sub4.anInt3348, Class50.aClass19_1112, 3231, i_10_, 1001, Class9.method43(new RSString[] { Class38_Sub11.aClass19_2082, class38_sub20_sub6.aClass19_2808 }, (byte) -20), i_8_);
									} else if ((Class28.anInt693 & 0x1) == 1)
										Class37.method328(class38_sub20_sub3_sub4.anInt3348, Class30.aClass19_736, 3231, i_10_, 33, Class9.method43(new RSString[] { Class53.aClass19_1168, Class2.aClass19_36, class38_sub20_sub6.aClass19_2808 }, (byte) -20), i_8_);
								} else
									Class37.method328(class38_sub20_sub3_sub4.anInt3348, Class38_Sub10_Sub3.aClass19_2836, 3231, i_10_, 20, Class9.method43(new RSString[] { Class38_Sub2.aClass19_1759, Class2.aClass19_36, class38_sub20_sub6.aClass19_2808 }, (byte) -20), i_8_);
							}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mc.F(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')');
		}
	}

	static final void method200(int i, Class38_Sub6 class38_sub6, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		do {
			try {
				if (i_23_ > 105) {
					if (Class38_Sub21.aBool2278)
						Class52.anInt1156 = 32;
					else
						Class52.anInt1156 = 0;
					Class38_Sub21.aBool2278 = false;
					if (Class23.anInt558 != 0)
						if (i_25_ < i_22_ || i_22_ + 16 <= i_25_ || i_21_ < i || i + 16 <= i_21_) {
							if (i_22_ <= i_25_ && i_25_ < i_22_ + 16 && i_21_ >= i - (-i_24_ + 16) && i + i_24_ > i_21_) {
								class38_sub6.anInt1985 += 4;
								Class40.method340(class38_sub6, (byte) -110);
							} else if (i_25_ >= -Class52.anInt1156 + i_22_ && i_25_ < Class52.anInt1156 + i_22_ + 16 && i + 16 <= i_21_ && i_21_ < i + i_24_ - 16) {
								int i_27_ = (i_24_ - 32) * i_24_ / i_26_;
								if (i_27_ < 8)
									i_27_ = 8;
								int i_28_ = i_21_ - i - i_27_ / 2 - 16;
								int i_29_ = -i_27_ + i_24_ - 32;
								class38_sub6.anInt1985 = (i_26_ - i_24_) * i_28_ / i_29_;
								Class40.method340(class38_sub6, (byte) -119);
								Class38_Sub21.aBool2278 = true;
							}
						} else {
							class38_sub6.anInt1985 -= 4;
							Class40.method340(class38_sub6, (byte) -128);
						}
					if (Class52.anInt1145 == 0)
						break;
					int i_30_ = class38_sub6.anInt1923;
					if (i_25_ < -i_30_ + i_22_ || i > i_21_ || i_22_ + 16 <= i_25_ || i + i_24_ < i_21_)
						break;
					class38_sub6.anInt1985 += Class52.anInt1145 * 45;
					Class40.method340(class38_sub6, (byte) -105);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "mc.A(" + i + ',' + (class38_sub6 != null ? "{...}" : "null") + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')');
			}
			break;
		} while (false);
	}

	public static void method201(int i) {
		try {
			Class23.aClass19_557 = null;
			Class23.aClass56_552 = null;
			Class23.aClass19_554 = null;
			if (i != 16351)
				Class23.method201(90);
			Class23.aClass19_542 = null;
			Class23.aClass19_551 = null;
			Class23.aClass19_544 = null;
			Class23.aClass19_550 = null;
			Class23.aClass19_562 = null;
			Class23.aClass19_564 = null;
			Class23.aClass19_549 = null;
			Class23.aClass19_560 = null;
			Class23.aClass19_555 = null;
			Class23.aClass19_545 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mc.C(" + i + ')');
		}
	}

	static final Class38_Sub20_Sub13 method202(byte i, int i_31_) {
		try {
			Class38_Sub20_Sub13 class38_sub20_sub13 = (Class38_Sub20_Sub13) Class78.aClass83_1547.method591(-28825, i_31_);
			if (class38_sub20_sub13 != null)
				return class38_sub20_sub13;
			class38_sub20_sub13 = Class20.method190((byte) 79, Class47.aClass17_1061, Class82.aClass17_1643, false, i_31_);
			if (class38_sub20_sub13 != null)
				Class78.aClass83_1547.method590(i_31_, (byte) -122, class38_sub20_sub13);
			if (i != -122)
				Class23.aClass19_554 = null;
			return class38_sub20_sub13;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mc.E(" + i + ',' + i_31_ + ')');
		}
	}

	static final void method203(boolean bool, Class17 class17, int i, boolean bool_32_, int i_33_, int i_34_, int i_35_) {
		try {
			Class38_Sub18.anInt2214 = i_34_;
			Class38_Sub20_Sub8.aClass17_2872 = class17;
			Class13.anInt247 = i_35_;
			Class38_Sub20_Sub13.aBool3017 = bool_32_;
			Class38_Sub20_Sub14.anInt3039 = i;
			Class38_Sub1.anInt1741 = 1;
			if (bool != true)
				Class23.anInt553 = -71;
			Class61.anInt1335 = i_33_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mc.D(" + bool + ',' + (class17 != null ? "{...}" : "null") + ',' + i + ',' + bool_32_ + ',' + i_33_ + ',' + i_34_ + ',' + i_35_ + ')');
		}
	}

	static final byte[] method204(int i, byte[] is) {
		try {
			int i_36_ = is.length;
			byte[] is_37_ = new byte[i_36_];
			if (i != 49)
				return null;
			Class71.method510(is, 0, is_37_, 0, i_36_);
			return is_37_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mc.B(" + i + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	static {
		Class23.anInt543 = 0;
		Class23.aClass19_555 = RSString.createRSString("::clientdrop");
		Class23.aClass19_554 = RSString.createRSString("Create a free account");
		Class23.aClass19_551 = RSString.createRSString("Abbrechen");
		Class23.aClass19_550 = RSString.createRSString("sch-Utteln:");
		Class23.aClass19_545 = RSString.createRSString("Welt");
		Class23.anInt558 = 0;
		Class23.aClass19_560 = RSString.createRSString("Please wait )2 attempting to reestablish");
		Class23.anInt556 = 1;
		Class23.aClass19_562 = Class23.aClass19_554;
		Class23.aClass19_564 = RSString.createRSString("Service unavailable)3");
		Class23.aClass19_544 = Class23.aClass19_542;
		Class23.aClass19_557 = Class23.aClass19_564;
		Class23.aClass19_549 = Class23.aClass19_560;
		Class23.anInt553 = 0;
	}
}
