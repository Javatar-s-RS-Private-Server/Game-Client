package com.javatar;/* Class38_Sub20_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub15 extends NodeSub {
	static RSString aClass19_3060 = RSString.createRSString("Passwort: ");
	static int anInt3064;
	static RS2Buffer aClass38_Sub23_3066;
	static int anInt3067;
	static int anInt3068 = 0;
	static int anInt3070;
	static int anInt3071;
	static PlayerAppearance aClass18_3072;
	static int anInt3073;
	static RSString aClass19_3076;
	static RSString aClass19_3077;
	private static RSString aClass19_3074;
	private static RSString aClass19_3075;

	static {
		Class38_Sub20_Sub15.anInt3064 = 0;
		Class38_Sub20_Sub15.anInt3067 = 0;
		Class38_Sub20_Sub15.anInt3070 = -1;
		Class38_Sub20_Sub15.aClass38_Sub23_3066 = new RS2Buffer(8);
		Class38_Sub20_Sub15.aClass18_3072 = new PlayerAppearance();
		Class38_Sub20_Sub15.aClass19_3074 = RSString.createRSString("Select");
		Class38_Sub20_Sub15.aClass19_3075 = RSString.createRSString("RuneScape has been updated(Q");
		Class38_Sub20_Sub15.aClass19_3076 = Class38_Sub20_Sub15.aClass19_3075;
		Class38_Sub20_Sub15.aClass19_3077 = Class38_Sub20_Sub15.aClass19_3074;
	}

	int anInt3063 = 0;

	public Class38_Sub20_Sub15() {
		/* empty */
	}

	static final RSString method1006(byte i, Class38_Sub6 class38_sub6) {
		try {
			int i_0_ = 45 / ((55 - i) / 47);
			if (Class38_Sub1.method610(Class30.method283(-94, class38_sub6)) == 0)
				return null;
			if (class38_sub6.aClass19_1938 == null || class38_sub6.aClass19_1938.method178(-91).method143((byte) 76) == 0) {
				if (Node.aBool892)
					return Class59.aClass19_1293;
				return null;
			}
			return class38_sub6.aClass19_1938;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ie.K(" + i + ',' + (class38_sub6 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method1008(int i) {
		try {
			Class38_Sub20_Sub15.aClass19_3060 = null;
			Class38_Sub20_Sub15.aClass19_3074 = null;
			Class38_Sub20_Sub15.aClass19_3075 = null;
			Class38_Sub20_Sub15.aClass19_3076 = null;
			Class38_Sub20_Sub15.aClass38_Sub23_3066 = null;
			Class38_Sub20_Sub15.aClass19_3077 = null;
			if (i == 128)
				Class38_Sub20_Sub15.aClass18_3072 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ie.L(" + i + ')');
		}
	}

	static final void method1009() {
		try {
			if (!SceneModel.aBool2553) {
				Class10.aClass19Array194[0] = Class38_Sub14.aClass19_2137;
				Class37.aClass19Array865[0] = Class38_Sub22.aClass19_2312;
				Class72.anInt1417 = 1;
				Class17_Sub1.anIntArray1709[0] = 1007;
			}
			if (NodeSub.anInt2252 != -1)
				Class10.method54((byte) 108 - 230, NodeSub.anInt2252);
			for (int i_2_ = 0; i_2_ < Class38_Sub20_Sub11.anInt2957; i_2_++) {
				if (Class32.aBoolArray768[i_2_])
					Class73_Sub2.aBoolArray2294[i_2_] = true;
				Class38_Sub20_Sub14.aBoolArray3036[i_2_] = Class32.aBoolArray768[i_2_];
				Class32.aBoolArray768[i_2_] = false;
			}
			if ((byte) 108 != 108)
				Class38_Sub20_Sub15.anInt3073 = 50;
			Class2.aClass38_Sub6_27 = null;
			Class38_Sub4.anInt1795 = -1;
			Class17.anInt367 = Class45.anInt1016;
			RSString.anInt481 = -1;
			if (NodeSub.anInt2252 != -1) {
				Class38_Sub20_Sub11.anInt2957 = 0;
				Class24.method207(0, -101, 0, NodeSub.anInt2252, 0, -1, 765, 503, 0);
			}
			Class38_Sub20_Sub9.method961();
			Class16.method100();
			if (!SceneModel.aBool2553) {
				if (RSString.anInt481 != -1)
					Class67.method478(Class38_Sub4.anInt1795, RSString.anInt481, -2);
			} else
				Class38_Sub17.method692((byte) 108 ^ 0x75);
			if (Class38_Sub14.anInt2139 == 3)
				for (int i_3_ = 0; i_3_ < Class38_Sub20_Sub11.anInt2957; i_3_++)
					if (!Class38_Sub20_Sub14.aBoolArray3036[i_3_]) {
						if (Class73_Sub2.aBoolArray2294[i_3_])
							Class38_Sub20_Sub9.method962(Class38_Sub8.anIntArray2045[i_3_], Class67.anIntArray1387[i_3_], Class22.anIntArray536[i_3_], Class64.anIntArray1356[i_3_], 16711680, 128);
					} else
						Class38_Sub20_Sub9.method962(Class38_Sub8.anIntArray2045[i_3_], Class67.anIntArray1387[i_3_], Class22.anIntArray536[i_3_], Class64.anIntArray1356[i_3_], 16711935, 128);
			Class3.method19(client.myPlayer.anInt3444, client.myPlayer.anInt3493, Canvas_Sub1.anInt2529, client.height);
			Canvas_Sub1.anInt2529 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ie.E(" + (byte) 108 + ')');
		}
	}

	static final void method1011(int i, int i_5_, Player class38_sub20_sub3_sub7_sub2, byte i_6_, int i_7_) {
		try {
			if (client.myPlayer != class38_sub20_sub3_sub7_sub2 && Class72.anInt1417 < 400) {
				int i_8_ = 59 % ((-11 - i_6_) / 45);
				RSString class19;
				if (class38_sub20_sub3_sub7_sub2.skillLevel == 0)
					class19 = Class9.method43(new RSString[] { class38_sub20_sub3_sub7_sub2.name, Class21.method191(class38_sub20_sub3_sub7_sub2.combatLevel, -3156, client.myPlayer.combatLevel), Class38_Sub10_Sub3.aClass19_2825, ItemDefinition.aClass19_2816, RuntimeException_Sub1.method1098(class38_sub20_sub3_sub7_sub2.combatLevel, 0), Class38_Sub21.aClass19_2265 }, (byte) -20);
				else
					class19 = Class9.method43(new RSString[] { class38_sub20_sub3_sub7_sub2.name, Class38_Sub10_Sub3.aClass19_2825, Class74.aClass19_1469, RuntimeException_Sub1.method1098(class38_sub20_sub3_sub7_sub2.skillLevel, 0), Class38_Sub21.aClass19_2265 }, (byte) -20);
				if (Class42.anInt964 != 1) {
					if (!Class26.aBool614) {
						for (int i_9_ = 7; i_9_ >= 0; i_9_--)
							if (Class38_Sub11.aClass19Array2094[i_9_] != null) {
								int i_10_ = 0;
								if (!Class38_Sub11.aClass19Array2094[i_9_].method174((byte) 124, Class52.aClass19_1154)) {
									if (Class17_Sub1.aBoolArray1717[i_9_])
										i_10_ = 2000;
								} else {
									if (client.myPlayer.combatLevel < class38_sub20_sub3_sub7_sub2.combatLevel)
										i_10_ = 2000;
									if (client.myPlayer.team != 0 && class38_sub20_sub3_sub7_sub2.team != 0)
										if (class38_sub20_sub3_sub7_sub2.team == client.myPlayer.team)
											i_10_ = 2000;
										else
											i_10_ = 0;
								}
								boolean bool = false;
								int i_11_ = Class38_Sub1.anIntArray1744[i_9_] + i_10_;
								Class37.method328(i, Class38_Sub11.aClass19Array2094[i_9_], 3231, i_5_, i_11_, Class9.method43(new RSString[] { Class38_Sub20_Sub12.aClass19_2998, class19 }, (byte) -20), i_7_);
							}
					} else if ((Class28.anInt693 & 0x8) == 8)
						Class37.method328(i, Class30.aClass19_736, 3231, i_5_, 22, Class9.method43(new RSString[] { Class53.aClass19_1168, Class48.aClass19_1082, class19 }, (byte) -20), i_7_);
				} else
					Class37.method328(i, Class38_Sub10_Sub3.aClass19_2836, 3231, i_5_, 5, Class9.method43(new RSString[] { Class38_Sub2.aClass19_1759, Class48.aClass19_1082, class19 }, (byte) -20), i_7_);
				for (int i_12_ = 0; i_12_ < Class72.anInt1417; i_12_++)
					if (Class17_Sub1.anIntArray1709[i_12_] == 3) {
						Class37.aClass19Array865[i_12_] = Class9.method43(new RSString[] { Class38_Sub20_Sub12.aClass19_2998, class19 }, (byte) -20);
						break;
					}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ie.H(" + i + ',' + i_5_ + ',' + (class38_sub20_sub3_sub7_sub2 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ')');
		}
	}

	static final void method1012() {
		try {
			if ((byte) -68 != -68)
				Class38_Sub20_Sub15.method1013(39);
			Class80.aClass83_1608.method596(-106);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ie.J(" + (byte) -68 + ')');
		}
	}

	static final void method1013(int i) {
		try {
			if (i == -1)
				for (;;) {
					Class38_Sub17 class38_sub17;
					synchronized (Class81.aClass13_1616) {
						class38_sub17 = (Class38_Sub17) RuntimeException_Sub1.aClass13_3284.method69((byte) 121);
					}
					if (class38_sub17 == null)
						break;
					class38_sub17.aClass17_Sub1_2196.method602(false, class38_sub17.aByteArray2191, (int) class38_sub17.aLong898, class38_sub17.aClass48_2187);
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ie.I(" + i + ')');
		}
	}

	final void method1007(RS2Buffer class38_sub23) {
		do {
			try {
				for (; ; ) {
					int i_1_ = class38_sub23.getUByte();
					if (i_1_ == 0)
						break;
					method1010(class38_sub23, i_1_);
				}
				if ((byte) -16 == -16)
					break;
				Class38_Sub20_Sub15.anInt3071 = -53;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ie.G(" + (class38_sub23 != null ? "{...}" : "null") + ',' + (byte) -16 + ')');
			}
			break;
		} while (false);
	}

	private void method1010(RS2Buffer class38_sub23, int i_4_) {
		try {
			if (-6 == (i_4_ ^ 0xffffffff))
				this.anInt3063 = class38_sub23.readUnsignedShortLE();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ie.F(" + (class38_sub23 != null ? "{...}" : "null") + ',' + -6 + ',' + i_4_ + ')');
		}
	}
}
