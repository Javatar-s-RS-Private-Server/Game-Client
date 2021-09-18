/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class28 {
	static int anInt677 = 0;
	static boolean aBool680 = true;
	static Class13 aClass13_686;
	static int anInt689;
	static RSString aClass19_691;
	static int anInt693;
	static Class17_Sub1[] aClass17_Sub1Array695;
	private static RSString aClass19_678;

	static {
		Class28.aClass19_678 = RSString.createRSString("Error loading your profile)3");
		Class28.aClass19_691 = Class28.aClass19_678;
		Class28.aClass13_686 = new Class13();
		Class28.aClass17_Sub1Array695 = new Class17_Sub1[256];
	}

	int anInt676;
	int anInt681;
	int anInt682;
	SceneModel aClass38_Sub20_Sub3_685;
	int anInt687;
	SceneModel aClass38_Sub20_Sub3_688;
	SceneModel aClass38_Sub20_Sub3_690;
	int anInt694;

	static final void method271(int i, int i_0_, Class17_Sub1 class17_sub1, Class48 class48) {
		try {
			byte[] is = null;
			synchronized (Class81.aClass13_1616) {
				for (Class38_Sub17 class38_sub17 = (Class38_Sub17) Class81.aClass13_1616.method65(109); class38_sub17 != null; class38_sub17 = (Class38_Sub17) Class81.aClass13_1616.method63(-3))
					if (i_0_ == class38_sub17.aLong898 && class48 == class38_sub17.aClass48_2187 && class38_sub17.anInt2185 == 0) {
						is = class38_sub17.aByteArray2191;
						break;
					}
			}
			if (is != null)
				class17_sub1.method602(false, true, is, i_0_, class48);
			else {
				if (i < 107)
					Class28.method273(53, -99, -98, 52);
				byte[] is_1_ = class48.method391(0, i_0_);
				class17_sub1.method602(false, true, is_1_, i_0_, class48);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "me.B(" + i + ',' + i_0_ + ',' + (class17_sub1 != null ? "{...}" : "null") + ',' + (class48 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method272(int i) {
		try {
			if (i != 1)
				Class28.aClass19_678 = null;
			Class28.aClass17_Sub1Array695 = null;
			Class28.aClass19_678 = null;
			Class28.aClass19_691 = null;
			Class28.aClass13_686 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "me.C(" + i + ')');
		}
	}

	static final void method273(int i, int i_2_, int i_3_, int i_4_) {
		try {
			Class42.method357(-7);
			Class38_Sub20_Sub9.method971(i_2_, i, Class64.aClass38_Sub20_Sub9_Sub2_1359.anInt3242 + i_2_, i + Class64.aClass38_Sub20_Sub9_Sub2_1359.anInt3246);
			if (Class38_Sub20_Sub17.anInt3129 == 2 || Class38_Sub20_Sub17.anInt3129 == 5)
				Class38_Sub20_Sub9.method974(i_2_ + 25, i + 5, 0, Class38_Sub1.anIntArray1751, Class81.anIntArray1625);
			else {
				int i_5_ = Class21.anInt517 + Class38_Sub20_Sub11.anInt2930 & 0x7ff;
				int i_6_ = client.myPlayer.anInt3493 / 32 + 48;
				int i_7_ = -(client.myPlayer.anInt3444 / 32) + 464;
				Class38_Sub17.aClass38_Sub20_Sub9_Sub3_2194.method1102(i_2_ + 25, i + 5, 146, 151, i_6_, i_7_, i_5_, 256 + Class38_Sub7.anInt2027, Class38_Sub1.anIntArray1751, Class81.anIntArray1625);
				for (int i_8_ = 0; i_8_ < Applet_Sub1.anInt3627; i_8_++) {
					int i_9_ = -(client.myPlayer.anInt3493 / 32) + Class72.anIntArray1418[i_8_] * 4 + 2;
					int i_10_ = -(client.myPlayer.anInt3444 / 32) + Class35.anIntArray840[i_8_] * 4 + 2;
					Class38_Sub20_Sub3_Sub5.method1159(-2011, i_2_, i, i_10_, Class15.aClass38_Sub20_Sub9_Sub3Array288[i_8_], i_9_);
				}
				for (int i_11_ = 0; i_11_ < 104; i_11_++)
					for (int i_12_ = 0; i_12_ < 104; i_12_++) {
						Class13 class13 = Class38_Sub21.aClass13ArrayArrayArray2259[client.height][i_11_][i_12_];
						if (class13 != null) {
							int i_13_ = i_12_ * 4 + 2 - client.myPlayer.anInt3444 / 32;
							int i_14_ = i_11_ * 4 + 2 - client.myPlayer.anInt3493 / 32;
							Class38_Sub20_Sub3_Sub5.method1159(-2011, i_2_, i, i_13_, Class22.aClass38_Sub20_Sub9_Sub3Array539[0], i_14_);
						}
					}
				for (int i_15_ = 0; i_15_ < Class4.anInt87; i_15_++) {
					NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[Class38_Sub10_Sub1.anIntArray2652[i_15_]];
					if (class38_sub20_sub3_sub7_sub1 != null && class38_sub20_sub3_sub7_sub1.isVisible()) {
						Sequence class38_sub20_sub5 = class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543;
						if (class38_sub20_sub5 != null && class38_sub20_sub5.anIntArray2715 != null)
							class38_sub20_sub5 = class38_sub20_sub5.method915(-52);
						if (class38_sub20_sub5 != null && class38_sub20_sub5.aBool2722 && class38_sub20_sub5.aBool2689) {
							int i_16_ = class38_sub20_sub3_sub7_sub1.anInt3444 / 32 - client.myPlayer.anInt3444 / 32;
							int i_17_ = -(client.myPlayer.anInt3493 / 32) + class38_sub20_sub3_sub7_sub1.anInt3493 / 32;
							Class38_Sub20_Sub3_Sub5.method1159(-2011, i_2_, i, i_16_, Class22.aClass38_Sub20_Sub9_Sub3Array539[1], i_17_);
						}
					}
				}
				for (int i_18_ = 0; ItemDefinition.anInt2783 > i_18_; i_18_++) {
					Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[Class47.anIntArray1055[i_18_]];
					if (class38_sub20_sub3_sub7_sub2 != null && class38_sub20_sub3_sub7_sub2.isVisible()) {
						int i_19_ = -(client.myPlayer.anInt3493 / 32) + class38_sub20_sub3_sub7_sub2.anInt3493 / 32;
						int i_20_ = class38_sub20_sub3_sub7_sub2.anInt3444 / 32 - client.myPlayer.anInt3444 / 32;
						long l = class38_sub20_sub3_sub7_sub2.name.method162(0);
						boolean bool = false;
						for (int i_21_ = 0; i_21_ < Class81.anInt1618; i_21_++)
							if (Class20.aLongArray499[i_21_] == l && Class41.anIntArray941[i_21_] != 0) {
								bool = true;
								break;
							}
						boolean bool_22_ = client.myPlayer.team != 0 && class38_sub20_sub3_sub7_sub2.team != 0 && class38_sub20_sub3_sub7_sub2.team == client.myPlayer.team;
						if (!bool) {
							if (!bool_22_)
								Class38_Sub20_Sub3_Sub5.method1159(-2011, i_2_, i, i_20_, Class22.aClass38_Sub20_Sub9_Sub3Array539[2], i_19_);
							else
								Class38_Sub20_Sub3_Sub5.method1159(-2011, i_2_, i, i_20_, Class22.aClass38_Sub20_Sub9_Sub3Array539[4], i_19_);
						} else
							Class38_Sub20_Sub3_Sub5.method1159(-2011, i_2_, i, i_20_, Class22.aClass38_Sub20_Sub9_Sub3Array539[3], i_19_);
					}
				}
				if (Class42.anInt962 != 0 && Class45.anInt1016 % 20 < 10) {
					if (Class42.anInt962 == 1 && Class60.anInt1320 >= 0 && Class60.anInt1320 < Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164.length) {
						NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[Class60.anInt1320];
						if (class38_sub20_sub3_sub7_sub1 != null) {
							int i_23_ = class38_sub20_sub3_sub7_sub1.anInt3493 / 32 - client.myPlayer.anInt3493 / 32;
							int i_24_ = class38_sub20_sub3_sub7_sub1.anInt3444 / 32 - client.myPlayer.anInt3444 / 32;
							Class59.method446(i_23_, i, i_2_, i_24_, Sequence.aClass38_Sub20_Sub9_Sub3Array2734[1], true);
						}
					}
					if (Class42.anInt962 == 2) {
						int i_25_ = -(client.myPlayer.anInt3493 / 32) + 2 + (Class32.anInt770 - client.currentBaseY) * 4;
						int i_26_ = (-client.currentBaseX + Class5.anInt93) * 4 + 2 - client.myPlayer.anInt3444 / 32;
						Class59.method446(i_25_, i, i_2_, i_26_, Sequence.aClass38_Sub20_Sub9_Sub3Array2734[1], true);
					}
					if (Class42.anInt962 == 10 && Class62.anInt1344 >= 0 && Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152.length > Class62.anInt1344) {
						Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[Class62.anInt1344];
						if (class38_sub20_sub3_sub7_sub2 != null) {
							int i_27_ = class38_sub20_sub3_sub7_sub2.anInt3493 / 32 - client.myPlayer.anInt3493 / 32;
							int i_28_ = -(client.myPlayer.anInt3444 / 32) + class38_sub20_sub3_sub7_sub2.anInt3444 / 32;
							Class59.method446(i_27_, i, i_2_, i_28_, Sequence.aClass38_Sub20_Sub9_Sub3Array2734[1], true);
						}
					}
				}
				if (client.destX != 0) {
					int i_29_ = client.destX * 4 - client.myPlayer.anInt3493 / 32 + 2;
					int i_30_ = client.destY * 4 + 2 - client.myPlayer.anInt3444 / 32;
					Class38_Sub20_Sub3_Sub5.method1159(-2011, i_2_, i, i_30_, Sequence.aClass38_Sub20_Sub9_Sub3Array2734[0], i_29_);
				}
				Class38_Sub20_Sub9.method958(i_2_ + 93 + 4, i + 82 - 4, 3, 3, 16777215);
			}
			if (Class38_Sub20_Sub17.anInt3129 < 3)
				Class82.aClass38_Sub20_Sub9_Sub3_1644.method1102(i_2_, i, 33, 33, 25, 25, Class38_Sub20_Sub11.anInt2930, 256, Class38_Sub6.anIntArray1967, Class40.anIntArray919);
			else
				Class38_Sub20_Sub9.method974(i_2_, i, 0, Class38_Sub6.anIntArray1967, Class40.anIntArray919);
			if (Class38_Sub20_Sub14.aBoolArray3036[i_3_])
				Class64.aClass38_Sub20_Sub9_Sub2_1359.method1089(i_2_, i);
			if (i_4_ > -62)
				Class28.method271(-128, 100, null, null);
			Class73_Sub2.aBoolArray2294[i_3_] = true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "me.A(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')');
		}
	}

	static final void method274(int i, byte i_31_, int i_32_) {
		try {
			int[] is = new int[4];
			int[] is_33_ = new int[4];
			is_33_[0] = i_32_;
			int i_34_ = 1;
			is[0] = i;
			int i_35_ = 0;
			if (i_31_ <= 10)
				Class28.method274(78, (byte) -81, -80);
			for (/**/; i_35_ < 4; i_35_++)
				if (Class38_Sub4.anIntArray1792[i_35_] != i_32_) {
					is_33_[i_34_] = Class38_Sub4.anIntArray1792[i_35_];
					is[i_34_] = Class38_Sub1.anIntArray1742[i_35_];
					i_34_++;
				}
			Class38_Sub4.anIntArray1792 = is_33_;
			Class38_Sub1.anIntArray1742 = is;
			Class38_Sub2.method614(0, Sequence.aClass4Array2736.length - 1, Class38_Sub1.anIntArray1742, 104, Class38_Sub4.anIntArray1792, Sequence.aClass4Array2736);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "me.D(" + i + ',' + i_31_ + ',' + i_32_ + ')');
		}
	}
}
