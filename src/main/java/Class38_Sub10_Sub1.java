/* Class38_Sub10_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub10_Sub1 extends Class38_Sub10 {
	static RSString aClass19_2589;
	static RSString aClass19_2590;
	static RSString aClass19_2592;
	private int[] anIntArray2595;
	private static RSString aClass19_2598 = RSString.createRSString("Your profile will be transferred in:");
	static RSString aClass19_2599;
	private static RSString aClass19_2600;
	private int[] anIntArray2603 = new int[16];
	private int[] anIntArray2605;
	private Class38_Sub22[][] aClass38_Sub22ArrayArray2608;
	private int[] anIntArray2609;
	private static RSString aClass19_2618;
	private Class70 aClass70_2624;
	int[] anIntArray2626;
	static volatile int anInt2627;
	static RSString aClass19_2631;
	private int[] anIntArray2632;
	private int[] anIntArray2634;
	private int anInt2635;
	int[] anIntArray2636;
	private int[] anIntArray2638;
	private int[] anIntArray2639;
	private int[] anIntArray2640;
	static Class17 aClass17_2646;
	static RSString aClass19_2648;
	int[] anIntArray2649;
	private int anInt2650;
	private Class14 aClass14_2651;
	static int[] anIntArray2652;
	private int[] anIntArray2653;
	private int[] anIntArray2654;
	private Class38_Sub22[][] aClass38_Sub22ArrayArray2657;
	static int anInt2658;
	private int[] anIntArray2661;
	private boolean aBool2665;
	private int anInt2666;
	private int anInt2667;
	private Class38_Sub10_Sub3 aClass38_Sub10_Sub3_2668;
	private long aLong2669;
	private long aLong2670;

	private final void method833(int i, int i_0_, byte i_1_) {
		do {
			try {
				if (i_1_ == 102)
					break;
				method863(-45);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "c.O(" + i + ',' + i_0_ + ',' + i_1_ + ')');
			}
			break;
		} while (false);
	}

	private final void method834(int i, int i_2_, int i_3_) {
		try {
			anIntArray2632[i_3_] = i;
			int i_4_ = -29 / ((-60 - i_2_) / 35);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.NA(" + i + ',' + i_2_ + ',' + i_3_ + ')');
		}
	}

	private final int method835(int i, Class38_Sub22 class38_sub22) {
		try {
			int i_5_ = anIntArray2654[class38_sub22.anInt2344] * anIntArray2639[class38_sub22.anInt2344] + 4096 >> 1442844045;
			Class52 class52 = class38_sub22.aClass52_2322;
			i_5_ = i_5_ * i_5_ + 16384 >> 2136853935;
			i_5_ = i_5_ * class38_sub22.anInt2311 + 16384 >> -582880241;
			i_5_ = anInt2635 * i_5_ + 128 >> 1782992680;
			if (class52.anInt1152 > 0)
				i_5_ = (int) (Math.pow(0.5, class52.anInt1152 * (class38_sub22.anInt2321 * 1.953125E-5)) * i_5_ + 0.5);
			if (class52.aByteArray1139 != null) {
				int i_6_ = class38_sub22.anInt2320;
				int i_7_ = class52.aByteArray1139[class38_sub22.anInt2340 + 1];
				if (class52.aByteArray1139.length - 2 > class38_sub22.anInt2340) {
					int i_8_ = (class52.aByteArray1139[class38_sub22.anInt2340] & 0xff) << 1781433672;
					int i_9_ = class52.aByteArray1139[class38_sub22.anInt2340 + 2] << 1785573864 & 0xff00;
					i_7_ += (-i_8_ + i_6_) * (class52.aByteArray1139[class38_sub22.anInt2340 + 3] - i_7_) / (i_9_ - i_8_);
				}
				i_5_ = i_7_ * i_5_ + 32 >> 1513322022;
			}
			if (i > (class38_sub22.anInt2345 ^ 0xffffffff) && class52.aByteArray1153 != null) {
				int i_10_ = class38_sub22.anInt2345;
				int i_11_ = class52.aByteArray1153[class38_sub22.anInt2318 + 1];
				if (class38_sub22.anInt2318 < class52.aByteArray1153.length - 2) {
					int i_12_ = class52.aByteArray1153[class38_sub22.anInt2318] << 1461263240 & 0xff00;
					int i_13_ = class52.aByteArray1153[class38_sub22.anInt2318 + 2] << -363968760 & 0xff00;
					i_11_ += (-i_12_ + i_10_) * (-i_11_ + class52.aByteArray1153[class38_sub22.anInt2318 + 3]) / (i_13_ - i_12_);
				}
				i_5_ = i_5_ * i_11_ + 32 >> -224840314;
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.DA(" + i + ',' + (class38_sub22 != null ? "{...}" : "null") + ')');
		}
	}

	final synchronized void method836(int i, boolean bool, Class38_Sub24 class38_sub24) {
		try {
			if (i == 21186) {
				method863(21828);
				aClass70_2624.method507(class38_sub24.aByteArray2418);
				aLong2670 = 0L;
				aBool2665 = bool;
				int i_14_ = aClass70_2624.method501();
				for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
					aClass70_2624.method508(i_15_);
					aClass70_2624.method506(i_15_);
					aClass70_2624.method495(i_15_);
				}
				anInt2666 = aClass70_2624.method504();
				anInt2667 = aClass70_2624.anIntArray1405[anInt2666];
				aLong2669 = aClass70_2624.method502(anInt2667);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.T(" + i + ',' + bool + ',' + (class38_sub24 != null ? "{...}" : "null") + ')');
		}
	}

	private final void method837(byte i, int i_16_) {
		try {
			int i_17_ = i_16_ & 0xf0;
			if (i_17_ == 128) {
				int i_18_ = i_16_ & 0xf;
				int i_19_ = i_16_ >> -1939575992 & 0x7f;
				int i_20_ = (i_16_ & 0x7f06bb) >> -1234248048;
				method850(i_19_, i_20_, (byte) 72, i_18_);
			} else {
				if (i != 13)
					Class38_Sub10_Sub1.method856(57);
				if (i_17_ == 144) {
					int i_21_ = i_16_ & 0xf;
					int i_22_ = i_16_ >> 913640776 & 0x7f;
					int i_23_ = i_16_ >> 1780936784 & 0x7f;
					if (i_23_ <= 0)
						method850(i_22_, 64, (byte) 94, i_21_);
					else
						method845(i_23_, i_21_, true, i_22_);
				} else if (i_17_ == 160) {
					int i_24_ = i_16_ & 0xf;
					int i_25_ = (i_16_ & 0x7f0797) >> 683983408;
					int i_26_ = i_16_ >> -439498232 & 0x7f;
					method846(i_26_, i_24_, i + 101, i_25_);
				} else if (i_17_ == 176) {
					int i_27_ = (i_16_ & 0x7f4afb) >> 828068560;
					int i_28_ = i_16_ >> -622527640 & 0x7f;
					int i_29_ = i_16_ & 0xf;
					if (i_28_ == 0)
						anIntArray2603[i_29_] = (i_27_ << -578086066) + Class38_Sub10_Sub3.method941(anIntArray2603[i_29_], -2080769);
					if (i_28_ == 32)
						anIntArray2603[i_29_] = (i_27_ << -812379961) + Class38_Sub10_Sub3.method941(anIntArray2603[i_29_], -16257);
					if (i_28_ == 1)
						anIntArray2653[i_29_] = (i_27_ << -1388763449) + Class38_Sub10_Sub3.method941(-16257, anIntArray2653[i_29_]);
					if (i_28_ == 33)
						anIntArray2653[i_29_] = i_27_ + Class38_Sub10_Sub3.method941(anIntArray2653[i_29_], -128);
					if (i_28_ == 5)
						anIntArray2634[i_29_] = Class38_Sub10_Sub3.method941(-16257, anIntArray2634[i_29_]) + (i_27_ << -688888313);
					if (i_28_ == 37)
						anIntArray2634[i_29_] = i_27_ + Class38_Sub10_Sub3.method941(anIntArray2634[i_29_], -128);
					if (i_28_ == 7)
						anIntArray2654[i_29_] = Class38_Sub10_Sub3.method941(-16257, anIntArray2654[i_29_]) + (i_27_ << 1367804711);
					if (i_28_ == 39)
						anIntArray2654[i_29_] = i_27_ + Class38_Sub10_Sub3.method941(-128, anIntArray2654[i_29_]);
					if (i_28_ == 10)
						anIntArray2640[i_29_] = Class38_Sub10_Sub3.method941(-16257, anIntArray2640[i_29_]) + (i_27_ << -850214393);
					if (i_28_ == 42)
						anIntArray2640[i_29_] = i_27_ + Class38_Sub10_Sub3.method941(-128, anIntArray2640[i_29_]);
					if (i_28_ == 11)
						anIntArray2639[i_29_] = (i_27_ << -350412249) + Class38_Sub10_Sub3.method941(anIntArray2639[i_29_], -16257);
					if (i_28_ == 43)
						anIntArray2639[i_29_] = i_27_ + Class38_Sub10_Sub3.method941(anIntArray2639[i_29_], -128);
					if (i_28_ == 64)
						if (i_27_ >= 64)
							this.anIntArray2636[i_29_] = Class38_Sub3.method618(this.anIntArray2636[i_29_], 1);
						else
							this.anIntArray2636[i_29_] = Class38_Sub10_Sub3.method941(this.anIntArray2636[i_29_], -2);
					if (i_28_ == 65)
						if (i_27_ < 64) {
							method844(i_29_, i ^ 0x50);
							this.anIntArray2636[i_29_] = Class38_Sub10_Sub3.method941(this.anIntArray2636[i_29_], -3);
						} else
							this.anIntArray2636[i_29_] = Class38_Sub3.method618(this.anIntArray2636[i_29_], 2);
					if (i_28_ == 99)
						anIntArray2605[i_29_] = Class38_Sub10_Sub3.method941(127, anIntArray2605[i_29_]) + (i_27_ << 831003783);
					if (i_28_ == 98)
						anIntArray2605[i_29_] = i_27_ + Class38_Sub10_Sub3.method941(16256, anIntArray2605[i_29_]);
					if (i_28_ == 101)
						anIntArray2605[i_29_] = (i_27_ << 884245383) + 16384 + Class38_Sub10_Sub3.method941(127, anIntArray2605[i_29_]);
					if (i_28_ == 100)
						anIntArray2605[i_29_] = Class38_Sub10_Sub3.method941(anIntArray2605[i_29_], 16256) + i_27_ + 16384;
					if (i_28_ == 120)
						method859(i ^ 0xd, i_29_);
					if (i_28_ == 121)
						method858(-119, i_29_);
					if (i_28_ == 123)
						method851(i ^ ~0x1d, i_29_);
					if (i_28_ == 6) {
						int i_30_ = anIntArray2605[i_29_];
						if (i_30_ == 16384)
							anIntArray2661[i_29_] = (i_27_ << 914454663) + Class38_Sub10_Sub3.method941(anIntArray2661[i_29_], -16257);
					}
					if (i_28_ == 38) {
						int i_31_ = anIntArray2605[i_29_];
						if (i_31_ == 16384)
							anIntArray2661[i_29_] = Class38_Sub10_Sub3.method941(-128, anIntArray2661[i_29_]) + i_27_;
					}
					if (i_28_ == 16)
						this.anIntArray2626[i_29_] = (i_27_ << -222408537) + Class38_Sub10_Sub3.method941(-16257, this.anIntArray2626[i_29_]);
					if (i_28_ == 48)
						this.anIntArray2626[i_29_] = Class38_Sub10_Sub3.method941(this.anIntArray2626[i_29_], -128) + i_27_;
					if (i_28_ == 81)
						if (i_27_ < 64) {
							method849(i_29_, (byte) -114);
							this.anIntArray2636[i_29_] = Class38_Sub10_Sub3.method941(this.anIntArray2636[i_29_], -5);
						} else
							this.anIntArray2636[i_29_] = Class38_Sub3.method618(this.anIntArray2636[i_29_], 4);
					if (i_28_ == 17)
						method864((byte) 52, (anIntArray2638[i_29_] & ~0x3f80) + (i_27_ << 355887591), i_29_);
					if (i_28_ == 49)
						method864((byte) 52, i_27_ + (anIntArray2638[i_29_] & ~0x7f), i_29_);
				} else if (i_17_ == 192) {
					int i_32_ = i_16_ & 0xf;
					int i_33_ = (i_16_ & 0x7f0f) >> 1638555784;
					method848(i_32_, i_33_ + anIntArray2603[i_32_], 119);
				} else if (i_17_ == 208) {
					int i_34_ = i_16_ & 0xf;
					int i_35_ = i_16_ >> 2065745224 & 0x7f;
					method833(i_34_, i_35_, (byte) 102);
				} else if (i_17_ == 224) {
					int i_36_ = i_16_ & 0xf;
					int i_37_ = (i_16_ >> 1585643752 & 0x7f) + ((i_16_ & 0x7f0072) >> 774592457);
					method834(i_37_, i ^ ~0x77, i_36_);
				} else {
					i_17_ = i_16_ & 0xff;
					if (i_17_ == 255)
						method865((byte) 47);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.D(" + i + ',' + i_16_ + ')');
		}
	}

	final synchronized void method838(byte i, int i_38_, int i_39_) {
		do {
			try {
				method866(-128, i_38_, i_39_);
				if (i < -50)
					break;
				aClass38_Sub10_Sub3_2668 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "c.AA(" + i + ',' + i_38_ + ',' + i_39_ + ')');
			}
			break;
		} while (false);
	}

	@Override
	final synchronized int method665() {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.GA(" + ')');
		}
	}

	private final void method839(int i) {
		try {
			int i_40_ = anInt2666;
			int i_41_ = anInt2667;
			long l = aLong2669;
			while (anInt2667 == i_41_) {
				while (i_41_ == aClass70_2624.anIntArray1405[i_40_]) {
					aClass70_2624.method508(i_40_);
					int i_42_ = aClass70_2624.method509(i_40_);
					if (i_42_ == 1) {
						aClass70_2624.method503();
						aClass70_2624.method495(i_40_);
						if (aClass70_2624.method500())
							if (aBool2665 && i_41_ != 0)
								aClass70_2624.method505(l);
							else {
								method865((byte) 47);
								aClass70_2624.method499();
								return;
							}
						break;
					}
					if ((i_42_ & 0x80) != 0)
						method837((byte) 13, i_42_);
					aClass70_2624.method506(i_40_);
					aClass70_2624.method495(i_40_);
				}
				i_40_ = aClass70_2624.method504();
				i_41_ = aClass70_2624.anIntArray1405[i_40_];
				l = aClass70_2624.method502(i_41_);
			}
			if (i <= 35)
				Class38_Sub10_Sub1.aClass17_2646 = null;
			aLong2669 = l;
			anInt2667 = i_41_;
			anInt2666 = i_40_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.S(" + i + ')');
		}
	}

	final synchronized void method840(int i, int i_43_) {
		try {
			anInt2635 = i_43_;
			if (i != -19402)
				aClass38_Sub10_Sub3_2668 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.W(" + i + ',' + i_43_ + ')');
		}
	}

	final synchronized boolean method841(int i) {
		try {
			int i_44_ = 64 / ((i - 41) / 46);
			return aClass70_2624.method497();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.U(" + i + ')');
		}
	}

	final synchronized void method842(byte i) {
		do {
			try {
				for (Class38_Sub18 class38_sub18 = (Class38_Sub18) aClass14_2651.method82((byte) 95); class38_sub18 != null; class38_sub18 = (Class38_Sub18) aClass14_2651.method78(-118))
					class38_sub18.method330(0);
				if (i > 9)
					break;
				method845(-75, -48, false, 69);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "c.IA(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method843(int i, boolean bool, Class38_Sub22 class38_sub22) {
		try {
			if (i == 1) {
				int i_45_ = class38_sub22.aClass38_Sub16_Sub1_2337.aByteArray3029.length;
				int i_46_;
				if (bool && class38_sub22.aClass38_Sub16_Sub1_2337.aBool3025) {
					int i_47_ = i_45_ + i_45_ - class38_sub22.aClass38_Sub16_Sub1_2337.anInt3026;
					i_45_ <<= 8;
					i_46_ = (int) ((long) i_47_ * (long) this.anIntArray2626[class38_sub22.anInt2344] >> 753776582);
					if (i_46_ >= i_45_) {
						class38_sub22.aClass38_Sub10_Sub2_2314.method904(true);
						i_46_ = i_45_ + i_45_ - (1 + i_46_);
					}
				} else
					i_46_ = (int) ((long) i_45_ * (long) this.anIntArray2626[class38_sub22.anInt2344] >> -1385341626);
				class38_sub22.aClass38_Sub10_Sub2_2314.method894(i_46_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.J(" + i + ',' + bool + ',' + (class38_sub22 != null ? "{...}" : "null") + ')');
		}
	}

	private final void method844(int i, int i_48_) {
		try {
			if ((this.anIntArray2636[i] & 0x2) != 0)
				for (Class38_Sub22 class38_sub22 = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method65(102); class38_sub22 != null; class38_sub22 = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method63(-3))
					if (class38_sub22.anInt2344 == i && aClass38_Sub22ArrayArray2657[i][class38_sub22.anInt2329] == null && class38_sub22.anInt2345 < 0)
						class38_sub22.anInt2345 = 0;
			if (i_48_ < 49)
				method844(65, -88);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.Q(" + i + ',' + i_48_ + ')');
		}
	}

	private final void method845(int i, int i_49_, boolean bool, int i_50_) {
		try {
			method850(i_50_, 64, (byte) 114, i_49_);
			if ((this.anIntArray2636[i_49_] & 0x2) != 0)
				for (Class38_Sub22 class38_sub22 = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method74(-49); class38_sub22 != null; class38_sub22 = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method62(-1))
					if (i_49_ == class38_sub22.anInt2344 && class38_sub22.anInt2345 < 0) {
						aClass38_Sub22ArrayArray2657[i_49_][class38_sub22.anInt2329] = null;
						aClass38_Sub22ArrayArray2657[i_49_][i_50_] = class38_sub22;
						int i_51_ = (class38_sub22.anInt2331 * class38_sub22.anInt2342 >> -264213556) + class38_sub22.anInt2328;
						class38_sub22.anInt2328 += -class38_sub22.anInt2329 + i_50_ << 2085519496;
						class38_sub22.anInt2329 = i_50_;
						class38_sub22.anInt2342 = 4096;
						class38_sub22.anInt2331 = i_51_ - class38_sub22.anInt2328;
						return;
					}
			if (bool != true)
				method857(null, true, -97, null, -122);
			Class38_Sub18 class38_sub18 = (Class38_Sub18) aClass14_2651.method75(anIntArray2609[i_49_], (byte) -106);
			if (class38_sub18 != null) {
				Class38_Sub16_Sub1 class38_sub16_sub1 = class38_sub18.aClass38_Sub16_Sub1Array2201[i_50_];
				if (class38_sub16_sub1 != null) {
					Class38_Sub22 class38_sub22 = new Class38_Sub22();
					class38_sub22.aClass38_Sub18_2330 = class38_sub18;
					class38_sub22.aClass38_Sub16_Sub1_2337 = class38_sub16_sub1;
					class38_sub22.anInt2344 = i_49_;
					class38_sub22.aClass52_2322 = class38_sub18.aClass52Array2224[i_50_];
					class38_sub22.anInt2319 = class38_sub18.aByteArray2220[i_50_];
					class38_sub22.anInt2329 = i_50_;
					class38_sub22.anInt2311 = i * i * class38_sub18.anInt2204 * class38_sub18.aByteArray2211[i_50_] + 1024 >> 1933604715;
					class38_sub22.anInt2343 = class38_sub18.aByteArray2210[i_50_] & 0xff;
					class38_sub22.anInt2328 = -(class38_sub18.aShortArray2212[i_50_] & 0x7fff) + (i_50_ << -1603185592);
					class38_sub22.anInt2321 = 0;
					class38_sub22.anInt2318 = 0;
					class38_sub22.anInt2320 = 0;
					class38_sub22.anInt2345 = -1;
					class38_sub22.anInt2340 = 0;
					if (this.anIntArray2626[i_49_] != 0) {
						class38_sub22.aClass38_Sub10_Sub2_2314 = Class38_Sub10_Sub2.method873(class38_sub16_sub1, method867(class38_sub22, (byte) 32), 0, method855(class38_sub22, 118));
						method843(1, class38_sub18.aShortArray2212[i_50_] < 0, class38_sub22);
					} else
						class38_sub22.aClass38_Sub10_Sub2_2314 = Class38_Sub10_Sub2.method873(class38_sub16_sub1, method867(class38_sub22, (byte) 32), method835(-1, class38_sub22), method855(class38_sub22, 50));
					if (class38_sub18.aShortArray2212[i_50_] < 0)
						class38_sub22.aClass38_Sub10_Sub2_2314.method876(-1);
					if (class38_sub22.anInt2319 >= 0) {
						Class38_Sub22 class38_sub22_52_ = aClass38_Sub22ArrayArray2608[i_49_][class38_sub22.anInt2319];
						if (class38_sub22_52_ != null && class38_sub22_52_.anInt2345 < 0) {
							aClass38_Sub22ArrayArray2657[i_49_][class38_sub22_52_.anInt2329] = null;
							class38_sub22_52_.anInt2345 = 0;
						}
						aClass38_Sub22ArrayArray2608[i_49_][class38_sub22.anInt2319] = class38_sub22;
					}
					aClass38_Sub10_Sub3_2668.aClass13_2828.method68(class38_sub22, (byte) 66);
					aClass38_Sub22ArrayArray2657[i_49_][i_50_] = class38_sub22;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.JA(" + i + ',' + i_49_ + ',' + bool + ',' + i_50_ + ')');
		}
	}

	private final void method846(int i, int i_53_, int i_54_, int i_55_) {
		try {
			int i_56_ = 41 % ((60 - i_54_) / 33);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.BA(" + i + ',' + i_53_ + ',' + i_54_ + ',' + i_55_ + ')');
		}
	}

	final synchronized boolean method847(int i, Class17 class17, Class79 class79, Class38_Sub24 class38_sub24, int i_57_) {
		try {
			class38_sub24.method779();
			boolean bool = true;
			int[] is = null;
			if (i > 0)
				is = new int[] { i };
			for (Class38_Sub2 class38_sub2 = (Class38_Sub2) class38_sub24.aClass14_2417.method82((byte) 122); class38_sub2 != null; class38_sub2 = (Class38_Sub2) class38_sub24.aClass14_2417.method78(116)) {
				int i_58_ = (int) ((Node) class38_sub2).aLong898;
				Class38_Sub18 class38_sub18 = (Class38_Sub18) aClass14_2651.method75(i_58_, (byte) -106);
				if (class38_sub18 == null) {
					class38_sub18 = Class38_Sub20_Sub14.method1001(i_58_, class17, 0);
					if (class38_sub18 == null) {
						bool = false;
						continue;
					}
					aClass14_2651.method80(true, i_58_, class38_sub18);
				}
				if (!class38_sub18.method701(1, class79, class38_sub2.aByteArray1756, is))
					bool = false;
			}
			if (i_57_ != 10599)
				Class38_Sub10_Sub1.aClass19_2589 = null;
			if (bool)
				class38_sub24.method780();
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.L(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + (class79 != null ? "{...}" : "null") + ',' + (class38_sub24 != null ? "{...}" : "null") + ',' + i_57_ + ')');
		}
	}

	private final void method848(int i, int i_59_, int i_60_) {
		try {
			if (i_59_ != anIntArray2609[i]) {
				anIntArray2609[i] = i_59_;
				for (int i_61_ = 0; i_61_ < 128; i_61_++)
					aClass38_Sub22ArrayArray2608[i][i_61_] = null;
			}
			if (i_60_ < 95)
				method842((byte) 12);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.EA(" + i + ',' + i_59_ + ',' + i_60_ + ')');
		}
	}

	private final void method849(int i, byte i_62_) {
		do {
			try {
				if ((this.anIntArray2636[i] & 0x4) != 0)
					for (Class38_Sub22 class38_sub22 = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method65(119); class38_sub22 != null; class38_sub22 = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method63(-3))
						if (i == class38_sub22.anInt2344)
							class38_sub22.anInt2326 = 0;
				if (i_62_ <= -106)
					break;
				method836(-102, true, null);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "c.P(" + i + ',' + i_62_ + ')');
			}
			break;
		} while (false);
	}

	private final void method850(int i, int i_63_, byte i_64_, int i_65_) {
		try {
			Class38_Sub22 class38_sub22 = aClass38_Sub22ArrayArray2657[i_65_][i];
			if (class38_sub22 != null && i_64_ > 44) {
				aClass38_Sub22ArrayArray2657[i_65_][i] = null;
				if ((this.anIntArray2636[i_65_] & 0x2) != 0) {
					for (Class38_Sub22 class38_sub22_66_ = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method65(106); class38_sub22_66_ != null; class38_sub22_66_ = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method63(-3))
						if (class38_sub22.anInt2344 == class38_sub22_66_.anInt2344 && class38_sub22_66_.anInt2345 < 0 && class38_sub22_66_ != class38_sub22) {
							class38_sub22.anInt2345 = 0;
							break;
						}
				} else
					class38_sub22.anInt2345 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.LA(" + i + ',' + i_63_ + ',' + i_64_ + ',' + i_65_ + ')');
		}
	}

	private final void method851(int i, int i_67_) {
		try {
			Class38_Sub22 class38_sub22 = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method65(i + 144);
			if (i != -17)
				method835(32, null);
			for (/**/; class38_sub22 != null; class38_sub22 = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method63(-3))
				if ((i_67_ < 0 || i_67_ == class38_sub22.anInt2344) && class38_sub22.anInt2345 < 0) {
					aClass38_Sub22ArrayArray2657[class38_sub22.anInt2344][class38_sub22.anInt2329] = null;
					class38_sub22.anInt2345 = 0;
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.V(" + i + ',' + i_67_ + ')');
		}
	}

	static final void method852(Entity class38_sub20_sub3_sub7, byte i) {
		try {
			if (class38_sub20_sub3_sub7.anInt3470 == Class45.anInt1016 || class38_sub20_sub3_sub7.currentAnimationId == -1 || class38_sub20_sub3_sub7.anInt3461 != 0 || class38_sub20_sub3_sub7.anInt3483 + 1 > Sequence.forID((byte) 106, class38_sub20_sub3_sub7.currentAnimationId).anIntArray2568[class38_sub20_sub3_sub7.anInt3471]) {
				int i_68_ = -class38_sub20_sub3_sub7.anInt3476 + class38_sub20_sub3_sub7.anInt3470;
				int i_69_ = -class38_sub20_sub3_sub7.anInt3476 + Class45.anInt1016;
				int i_70_ = class38_sub20_sub3_sub7.anInt3457 * 64 + class38_sub20_sub3_sub7.anInt3463 * 128;
				int i_71_ = class38_sub20_sub3_sub7.anInt3457 * 64 + class38_sub20_sub3_sub7.anInt3456 * 128;
				int i_72_ = class38_sub20_sub3_sub7.anInt3457 * 64 + class38_sub20_sub3_sub7.anInt3436 * 128;
				class38_sub20_sub3_sub7.anInt3493 = ((-i_69_ + i_68_) * i_71_ + i_72_ * i_69_) / i_68_;
				int i_73_ = class38_sub20_sub3_sub7.anInt3486 * 128 + class38_sub20_sub3_sub7.anInt3457 * 64;
				class38_sub20_sub3_sub7.anInt3444 = (i_73_ * i_69_ + i_70_ * (-i_69_ + i_68_)) / i_68_;
			}
			if (i == 49) {
				if (class38_sub20_sub3_sub7.anInt3497 == 0)
					class38_sub20_sub3_sub7.anInt3488 = 1024;
				class38_sub20_sub3_sub7.anInt3440 = 0;
				if (class38_sub20_sub3_sub7.anInt3497 == 1)
					class38_sub20_sub3_sub7.anInt3488 = 1536;
				if (class38_sub20_sub3_sub7.anInt3497 == 2)
					class38_sub20_sub3_sub7.anInt3488 = 0;
				if (class38_sub20_sub3_sub7.anInt3497 == 3)
					class38_sub20_sub3_sub7.anInt3488 = 512;
				class38_sub20_sub3_sub7.anInt3491 = class38_sub20_sub3_sub7.anInt3488;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.PA(" + (class38_sub20_sub3_sub7 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final Class38_Sub20_Sub9_Sub1_Sub1 method853(byte[] is, boolean bool) {
		try {
			if (bool != true)
				Class38_Sub10_Sub1.method852(null, (byte) 127);
			if (is == null)
				return null;
			Class38_Sub20_Sub9_Sub1_Sub1 class38_sub20_sub9_sub1_sub1 = new Class38_Sub20_Sub9_Sub1_Sub1(is, Player.anIntArray3574, Class51.anIntArray1130, Class61.anIntArray1332, Class38_Sub20_Sub8.anIntArray2873, PlayerAppearance.anIntArray420, Class30.aByteArrayArray727);
			Player.method1207((byte) 29);
			return class38_sub20_sub9_sub1_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.K(" + (is != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	static final void method854(boolean bool, byte i) {
		try {
			if (((Entity) Client.myPlayer).anInt3493 >> -2020394297 == Client.destX && ((Entity) Client.myPlayer).anInt3444 >> -1295190329 == Client.destY)
				Client.destX = 0;
			int i_74_ = ItemDefinition.anInt2783;
			if (bool)
				i_74_ = 1;
			int i_75_ = 0;
			if (i != -35)
				Class38_Sub10_Sub1.method856(7);
			for (/**/; i_75_ < i_74_; i_75_++) {
				int i_76_;
				Player class38_sub20_sub3_sub7_sub2;
				if (bool) {
					i_76_ = 33538048;
					class38_sub20_sub3_sub7_sub2 = Client.myPlayer;
				} else {
					i_76_ = Class47.anIntArray1055[i_75_] << 1632013934;
					class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[Class47.anIntArray1055[i_75_]];
				}
				if (class38_sub20_sub3_sub7_sub2 != null && class38_sub20_sub3_sub7_sub2.isVisible()) {
					class38_sub20_sub3_sub7_sub2.isIdle = false;
					if ((Class38_Sub4.aBool1811 && ItemDefinition.anInt2783 > 50 || ItemDefinition.anInt2783 > 200) && !bool && ((Entity) class38_sub20_sub3_sub7_sub2).anInt3454 == ((Entity) class38_sub20_sub3_sub7_sub2).idleAnimation)
						class38_sub20_sub3_sub7_sub2.isIdle = true;
					int i_77_ = ((Entity) class38_sub20_sub3_sub7_sub2).anInt3444 >> 308378919;
					int i_78_ = ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493 >> 1134013319;
					if (i_78_ >= 0 && i_78_ < 104 && i_77_ >= 0 && i_77_ < 104)
						if (class38_sub20_sub3_sub7_sub2.aClass38_Sub20_Sub3_Sub1_3590 != null && class38_sub20_sub3_sub7_sub2.anInt3575 <= Class45.anInt1016 && Class45.anInt1016 < class38_sub20_sub3_sub7_sub2.anInt3589) {
							class38_sub20_sub3_sub7_sub2.isIdle = false;
							class38_sub20_sub3_sub7_sub2.anInt3579 = Class35.method317(-5736, Client.height, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3444);
							RuntimeException_Sub1.aClass27_3292.method246(Client.height, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3444, class38_sub20_sub3_sub7_sub2.anInt3579, 60, class38_sub20_sub3_sub7_sub2, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3491, i_76_, class38_sub20_sub3_sub7_sub2.anInt3568, class38_sub20_sub3_sub7_sub2.anInt3581, class38_sub20_sub3_sub7_sub2.anInt3578, class38_sub20_sub3_sub7_sub2.anInt3572);
						} else {
							if ((((Entity) class38_sub20_sub3_sub7_sub2).anInt3493 & 0x7f) == 64 && (((Entity) class38_sub20_sub3_sub7_sub2).anInt3444 & 0x7f) == 64) {
								if (RuntimeException_Sub1.anInt3293 == Class38_Sub6.anIntArrayArray1902[i_78_][i_77_])
									continue;
								Class38_Sub6.anIntArrayArray1902[i_78_][i_77_] = RuntimeException_Sub1.anInt3293;
							}
							class38_sub20_sub3_sub7_sub2.anInt3579 = Class35.method317(-5736, Client.height, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3444);
							RuntimeException_Sub1.aClass27_3292.method249(Client.height, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3444, class38_sub20_sub3_sub7_sub2.anInt3579, 60, class38_sub20_sub3_sub7_sub2, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3491, i_76_, ((Entity) class38_sub20_sub3_sub7_sub2).aBool3481);
						}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.FA(" + bool + ',' + i + ')');
		}
	}

	@Override
	final synchronized void method669(int i) {
		try {
			if (aClass70_2624.method497()) {
				int i_79_ = anInt2650 * aClass70_2624.anInt1404 / Class38_Sub20_Sub7.anInt2852;
				do {
					long l = aLong2670 - -((long) i_79_ * (long) i);
					if (-l + aLong2669 >= 0L) {
						aLong2670 = l;
						break;
					}
					int i_80_ = (int) ((-aLong2670 + aLong2669 - (-(long) i_79_ - -1L)) / i_79_);
					i -= i_80_;
					aLong2670 += (long) i_79_ * (long) i_80_;
					aClass38_Sub10_Sub3_2668.method669(i_80_);
					method839(66);
				} while (aClass70_2624.method497());
			}
			aClass38_Sub10_Sub3_2668.method669(i);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.R(" + i + ')');
		}
	}

	private final int method855(Class38_Sub22 class38_sub22, int i) {
		try {
			if (i <= 23)
				return 4;
			int i_81_ = anIntArray2640[class38_sub22.anInt2344];
			if (i_81_ >= 8192)
				return 16384 - ((-i_81_ + 16384) * (-class38_sub22.anInt2343 + 128) + 32 >> -1382823578);
			return i_81_ * class38_sub22.anInt2343 + 32 >> -1766115386;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.H(" + (class38_sub22 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	@Override
	final synchronized Class38_Sub10 method670() {
		try {
			return aClass38_Sub10_Sub3_2668;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.G(" + ')');
		}
	}

	public static void method856(int i) {
		try {
			Class38_Sub10_Sub1.aClass19_2618 = null;
			Class38_Sub10_Sub1.aClass19_2599 = null;
			Class38_Sub10_Sub1.aClass19_2631 = null;
			Class38_Sub10_Sub1.anIntArray2652 = null;
			Class38_Sub10_Sub1.aClass19_2648 = null;
			Class38_Sub10_Sub1.aClass19_2589 = null;
			Class38_Sub10_Sub1.aClass19_2590 = null;
			Class38_Sub10_Sub1.aClass19_2600 = null;
			Class38_Sub10_Sub1.aClass19_2598 = null;
			Class38_Sub10_Sub1.aClass17_2646 = null;
			if (i == -15614)
				Class38_Sub10_Sub1.aClass19_2592 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.HA(" + i + ')');
		}
	}

	final boolean method857(Class38_Sub22 class38_sub22, boolean bool, int i, int[] is, int i_82_) {
		try {
			class38_sub22.anInt2317 = Class38_Sub20_Sub7.anInt2852 / 100;
			if (class38_sub22.anInt2345 >= 0 && (class38_sub22.aClass38_Sub10_Sub2_2314 == null || class38_sub22.aClass38_Sub10_Sub2_2314.method891())) {
				class38_sub22.method720(-115);
				class38_sub22.method330(0);
				if (class38_sub22.anInt2319 > 0 && aClass38_Sub22ArrayArray2608[class38_sub22.anInt2344][class38_sub22.anInt2319] == class38_sub22)
					aClass38_Sub22ArrayArray2608[class38_sub22.anInt2344][class38_sub22.anInt2319] = null;
				return true;
			}
			int i_83_ = class38_sub22.anInt2342;
			if (i_83_ > 0) {
				i_83_ -= (int) (Math.pow(2.0, anIntArray2634[class38_sub22.anInt2344] * 4.921259842519685E-4) * 16.0 + 0.5);
				if (i_83_ < 0)
					i_83_ = 0;
				class38_sub22.anInt2342 = i_83_;
			}
			class38_sub22.aClass38_Sub10_Sub2_2314.method871(method867(class38_sub22, (byte) 32));
			class38_sub22.anInt2325++;
			double d = ((class38_sub22.anInt2331 * class38_sub22.anInt2342 >> 1985274828) + (class38_sub22.anInt2329 - 60 << -1191470008)) * 5.086263020833333E-6;
			Class52 class52 = class38_sub22.aClass52_2322;
			class38_sub22.anInt2336 += class52.anInt1147;
			if (class52.anInt1152 > 0)
				if (class52.anInt1148 > 0)
					class38_sub22.anInt2321 += (int) (Math.pow(2.0, class52.anInt1148 * d) * 128.0 + 0.5);
				else
					class38_sub22.anInt2321 += 128;
			boolean bool_84_ = bool;
			if (class52.aByteArray1139 != null) {
				if (class52.anInt1141 > 0)
					class38_sub22.anInt2320 += (int) (Math.pow(2.0, d * class52.anInt1141) * 128.0 + 0.5);
				else
					class38_sub22.anInt2320 += 128;
				for (/**/; class38_sub22.anInt2340 < class52.aByteArray1139.length - 2 && (class52.aByteArray1139[class38_sub22.anInt2340 + 2] & 0xff) << -87022552 < class38_sub22.anInt2320; class38_sub22.anInt2340 += 2) {
					/* empty */
				}
				if (class52.aByteArray1139.length - 2 == class38_sub22.anInt2340 && class52.aByteArray1139[class38_sub22.anInt2340 + 1] == 0)
					bool_84_ = true;
			}
			if (class38_sub22.anInt2345 >= 0 && class52.aByteArray1153 != null && (this.anIntArray2636[class38_sub22.anInt2344] & 0x1) == 0 && (class38_sub22.anInt2319 < 0 || class38_sub22 != aClass38_Sub22ArrayArray2608[class38_sub22.anInt2344][class38_sub22.anInt2319])) {
				if (class52.anInt1157 <= 0)
					class38_sub22.anInt2345 += 128;
				else
					class38_sub22.anInt2345 += (int) (Math.pow(2.0, class52.anInt1157 * d) * 128.0 + 0.5);
				for (/**/; class38_sub22.anInt2318 < class52.aByteArray1153.length - 2 && class38_sub22.anInt2345 > (class52.aByteArray1153[class38_sub22.anInt2318 + 2] << -1768135480 & 0xff00); class38_sub22.anInt2318 += 2) {
					/* empty */
				}
				if (class52.aByteArray1153.length - 2 == class38_sub22.anInt2318)
					bool_84_ = true;
			}
			if (bool_84_) {
				class38_sub22.aClass38_Sub10_Sub2_2314.method874(class38_sub22.anInt2317);
				if (is != null)
					class38_sub22.aClass38_Sub10_Sub2_2314.method667(is, i, i_82_);
				else
					class38_sub22.aClass38_Sub10_Sub2_2314.method669(i_82_);
				if (class38_sub22.aClass38_Sub10_Sub2_2314.method908())
					aClass38_Sub10_Sub3_2668.aClass38_Sub10_Sub4_2840.method1019(class38_sub22.aClass38_Sub10_Sub2_2314);
				class38_sub22.method720(127);
				if (class38_sub22.anInt2345 >= 0) {
					class38_sub22.method330(0);
					if (class38_sub22.anInt2319 > 0 && aClass38_Sub22ArrayArray2608[class38_sub22.anInt2344][class38_sub22.anInt2319] == class38_sub22)
						aClass38_Sub22ArrayArray2608[class38_sub22.anInt2344][class38_sub22.anInt2319] = null;
				}
				return true;
			}
			class38_sub22.aClass38_Sub10_Sub2_2314.method901(class38_sub22.anInt2317, method835(-1, class38_sub22), method855(class38_sub22, 64));
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.MA(" + (class38_sub22 != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_82_ + ')');
		}
	}

	private final void method858(int i, int i_85_) {
		try {
			if (i_85_ < 0)
				for (i_85_ = 0; i_85_ < 16; i_85_++)
					method858(-84, i_85_);
			else {
				anIntArray2654[i_85_] = 12800;
				anIntArray2640[i_85_] = 8192;
				if (i > -81)
					aLong2669 = 14L;
				anIntArray2639[i_85_] = 16383;
				anIntArray2632[i_85_] = 8192;
				anIntArray2653[i_85_] = 0;
				anIntArray2634[i_85_] = 8192;
				method844(i_85_, 73);
				method849(i_85_, (byte) -112);
				this.anIntArray2636[i_85_] = 0;
				anIntArray2605[i_85_] = 32767;
				anIntArray2661[i_85_] = 256;
				this.anIntArray2626[i_85_] = 0;
				method864((byte) 52, 8192, i_85_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.F(" + i + ',' + i_85_ + ')');
		}
	}

	private final void method859(int i, int i_86_) {
		try {
			if (i == 0)
				for (Class38_Sub22 class38_sub22 = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method65(98); class38_sub22 != null; class38_sub22 = (Class38_Sub22) aClass38_Sub10_Sub3_2668.aClass13_2828.method63(-3))
					if (i_86_ < 0 || i_86_ == class38_sub22.anInt2344) {
						if (class38_sub22.aClass38_Sub10_Sub2_2314 != null) {
							class38_sub22.aClass38_Sub10_Sub2_2314.method874(Class38_Sub20_Sub7.anInt2852 / 100);
							if (class38_sub22.aClass38_Sub10_Sub2_2314.method908())
								aClass38_Sub10_Sub3_2668.aClass38_Sub10_Sub4_2840.method1019(class38_sub22.aClass38_Sub10_Sub2_2314);
							class38_sub22.method720(-108);
						}
						if (class38_sub22.anInt2345 < 0)
							aClass38_Sub22ArrayArray2657[class38_sub22.anInt2344][class38_sub22.anInt2329] = null;
						class38_sub22.method330(0);
					}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.A(" + i + ',' + i_86_ + ')');
		}
	}

	static final Class38_Sub6 method860(int i, Class38_Sub6 class38_sub6) {
		try {
			int i_87_ = Class38_Sub2.method615(Class30.method283(-101, class38_sub6), i ^ 0x56000db0);
			if (i_87_ == 0)
				return null;
			if (i != 1442844045)
				Class38_Sub10_Sub1.method860(71, null);
			for (int i_88_ = 0; i_88_ < i_87_; i_88_++) {
				class38_sub6 = Projectile.method1167(class38_sub6.anInt1977, i ^ 0x56000db9);
				if (class38_sub6 == null)
					return null;
			}
			return class38_sub6;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.C(" + i + ',' + (class38_sub6 != null ? "{...}" : "null") + ')');
		}
	}

	final int method861(int i) {
		try {
			if (i != 15)
				return -14;
			return anInt2635;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.I(" + i + ')');
		}
	}

	@Override
	final synchronized Class38_Sub10 method668() {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.B(" + ')');
		}
	}

	final boolean method862(int i, Class38_Sub22 class38_sub22) {
		try {
			if (class38_sub22.aClass38_Sub10_Sub2_2314 == null) {
				if (class38_sub22.anInt2345 >= 0) {
					class38_sub22.method330(0);
					if (class38_sub22.anInt2319 > 0 && aClass38_Sub22ArrayArray2608[class38_sub22.anInt2344][class38_sub22.anInt2319] == class38_sub22)
						aClass38_Sub22ArrayArray2608[class38_sub22.anInt2344][class38_sub22.anInt2319] = null;
				}
				return true;
			}
			if (i != -31299)
				method843(-58, false, null);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.M(" + i + ',' + (class38_sub22 != null ? "{...}" : "null") + ')');
		}
	}

	final synchronized void method863(int i) {
		try {
			if (i == 21828) {
				aClass70_2624.method499();
				method865((byte) 47);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.KA(" + i + ')');
		}
	}

	@Override
	final synchronized void method667(int[] is, int i, int i_89_) {
		try {
			if (aClass70_2624.method497()) {
				int i_90_ = anInt2650 * aClass70_2624.anInt1404 / Class38_Sub20_Sub7.anInt2852;
				do {
					long l = aLong2670 - -((long) i_89_ * (long) i_90_);
					if (-l + aLong2669 >= 0L) {
						aLong2670 = l;
						break;
					}
					int i_91_ = (int) ((aLong2669 + -1L + -aLong2670 + i_90_) / i_90_);
					i_89_ -= i_91_;
					aLong2670 += (long) i_90_ * (long) i_91_;
					aClass38_Sub10_Sub3_2668.method667(is, i, i_91_);
					i += i_91_;
					method839(121);
				} while (aClass70_2624.method497());
			}
			aClass38_Sub10_Sub3_2668.method667(is, i, i_89_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.SA(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_89_ + ')');
		}
	}

	private final void method864(byte i, int i_92_, int i_93_) {
		do {
			try {
				anIntArray2638[i_93_] = i_92_;
				this.anIntArray2649[i_93_] = (int) (Math.pow(2.0, i_92_ * 5.4931640625E-4) * 2097152.0 + 0.5);
				if (i == 52)
					break;
				method868(89);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "c.E(" + i + ',' + i_92_ + ',' + i_93_ + ')');
			}
			break;
		} while (false);
	}

	private final void method865(byte i) {
		try {
			method859(0, -1);
			method858(i - 158, -1);
			for (int i_94_ = 0; i_94_ < 16; i_94_++)
				anIntArray2609[i_94_] = anIntArray2595[i_94_];
			if (i != 47)
				method835(-35, null);
			for (int i_95_ = 0; i_95_ < 16; i_95_++)
				anIntArray2603[i_95_] = Class38_Sub10_Sub3.method941(anIntArray2595[i_95_], -128);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.CA(" + i + ')');
		}
	}

	private final void method866(int i, int i_96_, int i_97_) {
		try {
			anIntArray2595[i_96_] = i_97_;
			anIntArray2603[i_96_] = Class38_Sub10_Sub3.method941(i_97_, i);
			method848(i_96_, i_97_, 111);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.QA(" + i + ',' + i_96_ + ',' + i_97_ + ')');
		}
	}

	private final int method867(Class38_Sub22 class38_sub22, byte i) {
		try {
			if (i != 32)
				method866(38, 7, 17);
			int i_98_ = class38_sub22.anInt2328 + (class38_sub22.anInt2331 * class38_sub22.anInt2342 >> -864767188);
			Class52 class52 = class38_sub22.aClass52_2322;
			i_98_ += (anIntArray2632[class38_sub22.anInt2344] - 8192) * anIntArray2661[class38_sub22.anInt2344] >> -1641679188;
			if (class52.anInt1147 > 0 && (class52.anInt1160 > 0 || anIntArray2653[class38_sub22.anInt2344] > 0)) {
				int i_99_ = class52.anInt1160 << -1745974302;
				int i_100_ = class52.anInt1140 << 1617541185;
				if (class38_sub22.anInt2325 < i_100_)
					i_99_ = class38_sub22.anInt2325 * i_99_ / i_100_;
				i_99_ += anIntArray2653[class38_sub22.anInt2344] >> 47818151;
				double d = Math.sin((class38_sub22.anInt2336 & 0x1ff) * 0.01227184630308513);
				i_98_ += (int) (d * i_99_);
			}
			int i_101_ = (int) (class38_sub22.aClass38_Sub16_Sub1_2337.anInt3028 * 256 * Math.pow(2.0, i_98_ * 3.255208333333333E-4) / Class38_Sub20_Sub7.anInt2852 + 0.5);
			if (i_101_ < 1)
				return 1;
			return i_101_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.RA(" + (class38_sub22 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final synchronized void method868(int i) {
		try {
			if (i == -24016)
				for (Class38_Sub18 class38_sub18 = (Class38_Sub18) aClass14_2651.method82((byte) 69); class38_sub18 != null; class38_sub18 = (Class38_Sub18) aClass14_2651.method78(i ^ 0x5dbf))
					class38_sub18.method698(false);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.OA(" + i + ')');
		}
	}

	public Class38_Sub10_Sub1() {
		anIntArray2595 = new int[16];
		anIntArray2634 = new int[16];
		anIntArray2632 = new int[16];
		anIntArray2609 = new int[16];
		aClass38_Sub22ArrayArray2608 = new Class38_Sub22[16][128];
		anIntArray2638 = new int[16];
		anIntArray2640 = new int[16];
		this.anIntArray2636 = new int[16];
		anIntArray2605 = new int[16];
		anInt2635 = 256;
		this.anIntArray2649 = new int[16];
		aClass38_Sub22ArrayArray2657 = new Class38_Sub22[16][128];
		anIntArray2661 = new int[16];
		anInt2650 = 1000000;
		anIntArray2653 = new int[16];
		anIntArray2639 = new int[16];
		this.anIntArray2626 = new int[16];
		anIntArray2654 = new int[16];
		aClass70_2624 = new Class70();
		aClass38_Sub10_Sub3_2668 = new Class38_Sub10_Sub3(this);
		try {
			aClass14_2651 = new Class14(128);
			method865((byte) 47);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "c.<init>(" + ')');
		}
	}

	static {
		Class38_Sub10_Sub1.aClass19_2590 = RSString.createRSString(")1j");
		Class38_Sub10_Sub1.aClass19_2592 = RSString.createRSString("");
		Class38_Sub10_Sub1.anInt2627 = 0;
		Class38_Sub10_Sub1.aClass19_2618 = RSString.createRSString("World");
		Class38_Sub10_Sub1.aClass19_2648 = Class38_Sub10_Sub1.aClass19_2598;
		Class38_Sub10_Sub1.aClass19_2600 = RSString.createRSString("Connection lost");
		Class38_Sub10_Sub1.anIntArray2652 = new int[32768];
		Class38_Sub10_Sub1.anInt2658 = 0;
		Class38_Sub10_Sub1.aClass19_2589 = Class38_Sub10_Sub1.aClass19_2600;
		Class38_Sub10_Sub1.aClass19_2631 = Class38_Sub10_Sub1.aClass19_2618;
		Class38_Sub10_Sub1.aClass19_2599 = Class38_Sub10_Sub1.aClass19_2618;
	}
}
