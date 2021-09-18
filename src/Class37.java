/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

final class Class37 {
	static RSString[] aClass19Array865;
	static boolean secondMapRegion = false;
	static RSString aClass19_870 = RSString.createRSString(" )2>");
	static Class61[] aClass61Array872;
	static RSString aClass19_874;
	static RSString[] aClass19Array875 = new RSString[1000];
	static RSString aClass19_876;
	static RSString aClass19_878 = RSString.createRSString("(U1");
	static int[] anIntArray879;
	static boolean aBool880;

	static {
		client.systemUpdateTime = 0;
		Class37.aClass19_876 = RSString.createRSString("<col=40ff00>");
		Class37.aClass61Array872 = new Class61[50];
		Class37.aClass19Array865 = new RSString[500];
		Class37.aClass19_874 = RSString.createRSString("oder benutzen Sie eine andere Welt)3");
	}

	static final boolean method322(int i, int i_0_) {
		try {
			if (i != 16777215)
				Class37.secondMapRegion = true;
			return (i_0_ >> 29 & 0x1) != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "i.F(" + i + ',' + i_0_ + ')');
		}
	}

	public static void method323(byte i) {
		try {
			Class37.anIntArray879 = null;
			Class37.aClass19_870 = null;
			Class37.aClass19_874 = null;
			Class37.aClass19Array875 = null;
			Class37.aClass19_878 = null;
			Class37.aClass19_876 = null;
			if (i < -1) {
				Class37.aClass61Array872 = null;
				Class37.aClass19Array865 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "i.C(" + i + ')');
		}
	}

	static final int method324(int i, int i_1_, int i_2_) {
		try {
			if (i == -2)
				return 12345678;
			if (i == -1) {
				if (i_1_ < 2)
					i_1_ = 2;
				else if (i_1_ > 126)
					i_1_ = 126;
				return i_1_;
			}
			if (i_2_ <= 11)
				Class37.method329(null, null, 107, null);
			i_1_ = (i & 0x7f) * i_1_ / 128;
			if (i_1_ >= 2) {
				if (i_1_ > 126)
					i_1_ = 126;
			} else
				i_1_ = 2;
			return i_1_ + (i & 0xff80);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "i.D(" + i + ',' + i_1_ + ',' + i_2_ + ')');
		}
	}

	static final void method325(byte i, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			if (i != -87)
				Class37.secondMapRegion = false;
			Class72.anInt1416 = 0;
			for (int i_7_ = -1; i_7_ < ItemDefinition.anInt2783 + Class4.anInt87; i_7_++) {
				Entity class38_sub20_sub3_sub7;
				if (i_7_ == -1)
					class38_sub20_sub3_sub7 = client.myPlayer;
				else if (i_7_ < ItemDefinition.anInt2783)
					class38_sub20_sub3_sub7 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[Class47.anIntArray1055[i_7_]];
				else
					class38_sub20_sub3_sub7 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[Class38_Sub10_Sub1.anIntArray2652[i_7_ - ItemDefinition.anInt2783]];
				if (class38_sub20_sub3_sub7 != null && class38_sub20_sub3_sub7.isVisible()) {
					if (class38_sub20_sub3_sub7 instanceof NPC) {
						Sequence class38_sub20_sub5 = ((NPC) class38_sub20_sub3_sub7).aClass38_Sub20_Sub5_3543;
						if (class38_sub20_sub5.anIntArray2715 != null)
							class38_sub20_sub5 = class38_sub20_sub5.method915(127);
						if (class38_sub20_sub5 == null)
							continue;
					}
					if (ItemDefinition.anInt2783 <= i_7_) {
						Sequence class38_sub20_sub5 = ((NPC) class38_sub20_sub3_sub7).aClass38_Sub20_Sub5_3543;
						if (class38_sub20_sub5.anIntArray2715 != null)
							class38_sub20_sub5 = class38_sub20_sub5.method915(117);
						if (class38_sub20_sub5.anInt2718 >= 0 && class38_sub20_sub5.anInt2718 < Class73.aClass38_Sub20_Sub9_Sub3Array1431.length) {
							Class41.method347(class38_sub20_sub3_sub7, class38_sub20_sub3_sub7.anInt3434 + 15, (byte) 48);
							if (Class29.anInt703 > -1)
								Class73.aClass38_Sub20_Sub9_Sub3Array1431[class38_sub20_sub5.anInt2718].method1105(i_5_ + Class29.anInt703 - 12, Class38_Sub20_Sub12.anInt3002 + i_4_ - 30);
						}
						if (Class42.anInt962 == 1 && Class60.anInt1320 == Class38_Sub10_Sub1.anIntArray2652[-ItemDefinition.anInt2783 + i_7_] && Class45.anInt1016 % 20 < 10) {
							Class41.method347(class38_sub20_sub3_sub7, class38_sub20_sub3_sub7.anInt3434 + 15, (byte) 32);
							if (Class29.anInt703 > -1)
								Class59.aClass38_Sub20_Sub9_Sub3Array1301[0].method1105(i_5_ + Class29.anInt703 - 12, i_4_ + Class38_Sub20_Sub12.anInt3002 - 28);
						}
					} else {
						int i_8_ = 30;
						Player class38_sub20_sub3_sub7_sub2 = (Player) class38_sub20_sub3_sub7;
						if (class38_sub20_sub3_sub7_sub2.anInt3585 != -1 || class38_sub20_sub3_sub7_sub2.anInt3596 != -1) {
							Class41.method347(class38_sub20_sub3_sub7, class38_sub20_sub3_sub7.anInt3434 + 15, (byte) -75);
							if (Class29.anInt703 > -1) {
								if (class38_sub20_sub3_sub7_sub2.anInt3585 != -1) {
									Class17.aClass38_Sub20_Sub9_Sub3Array382[class38_sub20_sub3_sub7_sub2.anInt3585].method1105(i_5_ + Class29.anInt703 - 12, -i_8_ + Class38_Sub20_Sub12.anInt3002 + i_4_);
									i_8_ += 25;
								}
								if (class38_sub20_sub3_sub7_sub2.anInt3596 != -1) {
									Class73.aClass38_Sub20_Sub9_Sub3Array1431[class38_sub20_sub3_sub7_sub2.anInt3596].method1105(i_5_ + Class29.anInt703 - 12, -i_8_ + Class38_Sub20_Sub12.anInt3002 + i_4_);
									i_8_ += 25;
								}
							}
						}
						if (i_7_ >= 0 && Class42.anInt962 == 10 && Class47.anIntArray1055[i_7_] == Class62.anInt1344) {
							Class41.method347(class38_sub20_sub3_sub7, class38_sub20_sub3_sub7.anInt3434 + 15, (byte) 36);
							if (Class29.anInt703 > -1)
								Class59.aClass38_Sub20_Sub9_Sub3Array1301[1].method1105(i_5_ - 12 + Class29.anInt703, -i_8_ + i_4_ + Class38_Sub20_Sub12.anInt3002);
						}
					}
					if (class38_sub20_sub3_sub7.aClass19_3467 != null && (i_7_ >= ItemDefinition.anInt2783 || Class81.anInt1619 == 0 || Class81.anInt1619 == 3 || Class81.anInt1619 == 1 && Class74.method529(-125, ((Player) class38_sub20_sub3_sub7).name))) {
						Class41.method347(class38_sub20_sub3_sub7, class38_sub20_sub3_sub7.anInt3434, (byte) -73);
						if (Class29.anInt703 > -1 && Class83.anInt1670 > Class72.anInt1416) {
							Class83.anIntArray1680[Class72.anInt1416] = Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1061(class38_sub20_sub3_sub7.aClass19_3467) / 2;
							Class83.anIntArray1656[Class72.anInt1416] = Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.anInt3216;
							Class83.anIntArray1677[Class72.anInt1416] = Class29.anInt703;
							Class83.anIntArray1682[Class72.anInt1416] = Class38_Sub20_Sub12.anInt3002;
							Class83.anIntArray1674[Class72.anInt1416] = class38_sub20_sub3_sub7.anInt3499;
							Class83.anIntArray1667[Class72.anInt1416] = class38_sub20_sub3_sub7.anInt3495;
							Class83.anIntArray1650[Class72.anInt1416] = class38_sub20_sub3_sub7.anInt3452;
							Class83.aClass19Array1662[Class72.anInt1416] = class38_sub20_sub3_sub7.aClass19_3467;
							Class72.anInt1416++;
						}
					}
					if (Class45.anInt1016 < class38_sub20_sub3_sub7.hitCycle) {
						Class41.method347(class38_sub20_sub3_sub7, class38_sub20_sub3_sub7.anInt3434 + 15, (byte) 117);
						if (Class29.anInt703 > -1) {
							int i_9_ = class38_sub20_sub3_sub7.anInt3501 * 30 / class38_sub20_sub3_sub7.anInt3484;
							if (i_9_ > 30)
								i_9_ = 30;
							Class38_Sub20_Sub9.method958(i_5_ + Class29.anInt703 - 15, i_4_ + Class38_Sub20_Sub12.anInt3002 - 3, i_9_, 5, 65280);
							Class38_Sub20_Sub9.method958(i_9_ + Class29.anInt703 - 15 + i_5_, i_4_ + Class38_Sub20_Sub12.anInt3002 - 3, -i_9_ + 30, 5, 16711680);
						}
					}
					for (int i_10_ = 0; i_10_ < 4; i_10_++)
						if (Class45.anInt1016 < class38_sub20_sub3_sub7.hitCycles[i_10_]) {
							Class41.method347(class38_sub20_sub3_sub7, class38_sub20_sub3_sub7.anInt3434 / 2, (byte) 31);
							if (Class29.anInt703 > -1) {
								if (i_10_ == 1)
									Class38_Sub20_Sub12.anInt3002 -= 20;
								if (i_10_ == 2) {
									Class29.anInt703 -= 15;
									Class38_Sub20_Sub12.anInt3002 -= 10;
								}
								if (i_10_ == 3) {
									Class29.anInt703 += 15;
									Class38_Sub20_Sub12.anInt3002 -= 10;
								}
								Class17.aClass38_Sub20_Sub9_Sub3Array391[class38_sub20_sub3_sub7.hitMarkTypes[i_10_]].method1105(Class29.anInt703 + i_5_ - 12, Class38_Sub20_Sub12.anInt3002 + i_4_ - 12);
								client.aClass38_Sub20_Sub9_Sub1_Sub1_3656.method1086(RuntimeException_Sub1.method1098(class38_sub20_sub3_sub7.hitValues[i_10_], i ^ ~0x56), i_5_ + Class29.anInt703 - 1, i_4_ + Class38_Sub20_Sub12.anInt3002 + 3, 16777215, 0);
							}
						}
				}
			}
			for (int i_11_ = 0; i_11_ < Class72.anInt1416; i_11_++) {
				int i_12_ = Class83.anIntArray1677[i_11_];
				int i_13_ = Class83.anIntArray1682[i_11_];
				int i_14_ = Class83.anIntArray1680[i_11_];
				int i_15_ = Class83.anIntArray1656[i_11_];
				boolean bool = true;
				while (bool) {
					bool = false;
					for (int i_16_ = 0; i_11_ > i_16_; i_16_++)
						if (-Class83.anIntArray1656[i_16_] + Class83.anIntArray1682[i_16_] < i_13_ + 2 && Class83.anIntArray1682[i_16_] + 2 > i_13_ - i_15_ && i_12_ - i_14_ < Class83.anIntArray1680[i_16_] + Class83.anIntArray1677[i_16_] && i_12_ + i_14_ > -Class83.anIntArray1680[i_16_] + Class83.anIntArray1677[i_16_] && -Class83.anIntArray1656[i_16_] + Class83.anIntArray1682[i_16_] < i_13_) {
							i_13_ = -Class83.anIntArray1656[i_16_] + Class83.anIntArray1682[i_16_];
							bool = true;
						}
				}
				Class29.anInt703 = Class83.anIntArray1677[i_11_];
				Class38_Sub20_Sub12.anInt3002 = Class83.anIntArray1682[i_11_] = i_13_;
				RSString class19 = Class83.aClass19Array1662[i_11_];
				if (Class17_Sub1.anInt1710 != 0)
					Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1086(class19, Class29.anInt703 + i_5_, Class38_Sub20_Sub12.anInt3002 + i_4_, 16776960, 0);
				else {
					int i_17_ = 16776960;
					if (Class83.anIntArray1674[i_11_] < 6)
						i_17_ = ItemDefinition.anIntArray2769[Class83.anIntArray1674[i_11_]];
					if (Class83.anIntArray1674[i_11_] == 6)
						i_17_ = RuntimeException_Sub1.anInt3293 % 20 < 10 ? 16711680 : 16776960;
					if (Class83.anIntArray1674[i_11_] == 7)
						i_17_ = RuntimeException_Sub1.anInt3293 % 20 >= 10 ? 65535 : 255;
					if (Class83.anIntArray1674[i_11_] == 8)
						i_17_ = RuntimeException_Sub1.anInt3293 % 20 < 10 ? 45056 : 8454016;
					if (Class83.anIntArray1674[i_11_] == 9) {
						int i_18_ = -Class83.anIntArray1650[i_11_] + 150;
						if (i_18_ >= 50) {
							if (i_18_ < 100)
								i_17_ = -(i_18_ * 327680) + 16776960 + 16384000;
							else if (i_18_ < 150)
								i_17_ = (i_18_ - 100) * 5 + 65280;
						} else
							i_17_ = i_18_ * 1280 + 16711680;
					}
					if (Class83.anIntArray1674[i_11_] == 10) {
						int i_19_ = -Class83.anIntArray1650[i_11_] + 150;
						if (i_19_ < 50)
							i_17_ = i_19_ * 5 + 16711680;
						else if (i_19_ >= 100) {
							if (i_19_ < 150)
								i_17_ = i_19_ * 327680 - 32768000 + -(i_19_ * 5) + 500 + 255;
						} else
							i_17_ = -((i_19_ - 50) * 327680) + 16711935;
					}
					if (Class83.anIntArray1674[i_11_] == 11) {
						int i_20_ = -Class83.anIntArray1650[i_11_] + 150;
						if (i_20_ >= 50) {
							if (i_20_ < 100)
								i_17_ = 65280 + (i_20_ - 50) * 327685;
							else if (i_20_ < 150)
								i_17_ = -((i_20_ - 100) * 327680) + 16777215;
						} else
							i_17_ = -(i_20_ * 327685) + 16777215;
					}
					if (Class83.anIntArray1667[i_11_] == 0)
						Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1086(class19, Class29.anInt703 + i_5_, Class38_Sub20_Sub12.anInt3002 + i_4_, i_17_, 0);
					if (Class83.anIntArray1667[i_11_] == 1)
						Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1075(class19, i_5_ + Class29.anInt703, Class38_Sub20_Sub12.anInt3002 + i_4_, i_17_, 0, RuntimeException_Sub1.anInt3293);
					if (Class83.anIntArray1667[i_11_] == 2)
						Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1080(class19, Class29.anInt703 + i_5_, Class38_Sub20_Sub12.anInt3002 + i_4_, i_17_, 0, RuntimeException_Sub1.anInt3293);
					if (Class83.anIntArray1667[i_11_] == 3)
						Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1083(class19, i_5_ + Class29.anInt703, i_4_ + Class38_Sub20_Sub12.anInt3002, i_17_, 0, RuntimeException_Sub1.anInt3293, -Class83.anIntArray1650[i_11_] + 150);
					if (Class83.anIntArray1667[i_11_] == 4) {
						int i_21_ = (-Class83.anIntArray1650[i_11_] + 150) * (Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1061(class19) + 100) / 150;
						Class38_Sub20_Sub9.method970(Class29.anInt703 - 50 + i_5_, i_4_, Class29.anInt703 + 50 + i_5_, i_4_ + i_3_);
						Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1084(class19, -i_21_ + i_5_ + 50 + Class29.anInt703, i_4_ + Class38_Sub20_Sub12.anInt3002, i_17_, 0);
						Class38_Sub20_Sub9.method971(i_5_, i_4_, i_5_ + i_6_, i_3_ + i_4_);
					}
					if (Class83.anIntArray1667[i_11_] == 5) {
						int i_22_ = -Class83.anIntArray1650[i_11_] + 150;
						Class38_Sub20_Sub9.method970(i_5_, -Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.anInt3216 - 1 + i_4_ + Class38_Sub20_Sub12.anInt3002, i_5_ + i_6_, Class38_Sub20_Sub12.anInt3002 + 5 + i_4_);
						int i_23_ = 0;
						if (i_22_ >= 25) {
							if (i_22_ > 125)
								i_23_ = i_22_ - 125;
						} else
							i_23_ = i_22_ - 25;
						Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1086(class19, i_5_ + Class29.anInt703, i_4_ + Class38_Sub20_Sub12.anInt3002 + i_23_, i_17_, 0);
						Class38_Sub20_Sub9.method971(i_5_, i_4_, i_5_ + i_6_, i_3_ + i_4_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "i.B(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')');
		}
	}

	static final Class38_Sub20_Sub15 method326(int i, int i_24_) {
		try {
			Class38_Sub20_Sub15 class38_sub20_sub15 = (Class38_Sub20_Sub15) Class82.aClass83_1641.method591(i ^ ~0x7088, i_24_);
			if (class38_sub20_sub15 != null)
				return class38_sub20_sub15;
			byte[] is = Class17_Sub1.aClass17_1706.method109(i, i_24_, -85);
			class38_sub20_sub15 = new Class38_Sub20_Sub15();
			if (is != null)
				class38_sub20_sub15.method1007(new RS2Buffer(is), (byte) -16);
			Class82.aClass83_1641.method590(i_24_, (byte) -125, class38_sub20_sub15);
			return class38_sub20_sub15;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "i.A(" + i + ',' + i_24_ + ')');
		}
	}

	static final void method327(Object object, Class56 class56, int i) {
		do {
			try {
				if (class56.anEventQueue1243 != null && i == 1) {
					for (int i_25_ = 0; i_25_ < 50 && class56.anEventQueue1243.peekEvent() != null; i_25_++)
						Canvas_Sub1.method809(1L, -27166);
					if (object == null)
						break;
					class56.anEventQueue1243.postEvent(new ActionEvent(object, 1001, "dummy"));
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "i.E(" + (object != null ? "{...}" : "null") + ',' + (class56 != null ? "{...}" : "null") + ',' + i + ')');
			}
			break;
		} while (false);
	}

	static final void method328(int i, RSString class19, int i_26_, int i_27_, int i_28_, RSString class19_29_, int i_30_) {
		do {
			try {
				if (i_26_ == 3231 && !SceneModel.aBool2553) {
					if (Class72.anInt1417 >= 500)
						break;
					Class10.aClass19Array194[Class72.anInt1417] = class19;
					Class37.aClass19Array865[Class72.anInt1417] = class19_29_;
					Class17_Sub1.anIntArray1709[Class72.anInt1417] = i_28_;
					Class50.anIntArray1107[Class72.anInt1417] = i;
					Class38_Sub20_Sub13.anIntArray3015[Class72.anInt1417] = i_30_;
					Class15.anIntArray284[Class72.anInt1417] = i_27_;
					Class72.anInt1417++;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "i.G(" + i + ',' + (class19 != null ? "{...}" : "null") + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + (class19_29_ != null ? "{...}" : "null") + ',' + i_30_ + ')');
			}
			break;
		} while (false);
	}

	static final Class38_Sub20_Sub9_Sub2[] method329(RSString class19, RSString class19_31_, int i, Class17 class17) {
		try {
			int i_32_ = class17.method104(3, class19_31_);
			int i_33_ = class17.method118(class19, i_32_, true);
			if (i != -11)
				Class37.method322(-119, 30);
			return Class38_Sub20_Sub17.method1030(i_32_, i_33_, -1, class17);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "i.H(" + (class19 != null ? "{...}" : "null") + ',' + (class19_31_ != null ? "{...}" : "null") + ',' + i + ',' + (class17 != null ? "{...}" : "null") + ')');
		}
	}
}
