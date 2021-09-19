package com.javatar.jagex;/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.FontMetrics;

final class Class76 {
	static int anInt1484 = 2301979;
	static Class14 aClass14_1485;
	static RSString aClass19_1486 = RSString.createRSString("(Udns");
	static RSString aClass19_1489;
	static boolean aBool1490 = false;
	static boolean aBool1491;
	private static RSString aClass19_1494 = RSString.createRSString("Type");
	static int[] anIntArray1495;
	static Class13 aClass13_1496;
	static RSString aClass19_1497;
	static RSString aClass19_1498;
	static int anInt1499;
	static FontMetrics aFontMetrics1500;
	static RSString aClass19_1501;
	static RSString aClass19_1502;

	static final Class38_Sub20_Sub9_Sub1_Sub1 method542(byte i, Class17 class17, Class17 class17_0_, RSString class19, RSString class19_1_) {
		try {
			int i_2_ = class17.method104(3, class19_1_);
			if (i > -7)
				Class76.method543(true);
			int i_3_ = class17.method118(class19, i_2_, true);
			return Class58.method445(i_2_, class17_0_, (byte) -116, class17, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qa.D(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + (class17_0_ != null ? "{...}" : "null") + ',' + (class19 != null ? "{...}" : "null") + ',' + (class19_1_ != null ? "{...}" : "null") + ')');
		}
	}

	public static void method543(boolean bool) {
		try {
			Class76.aClass19_1486 = null;
			Class76.aClass19_1489 = null;
			Class76.anIntArray1495 = null;
			Class76.aClass19_1497 = null;
			if (bool != true)
				Class76.aClass19_1498 = null;
			Class76.aClass19_1498 = null;
			Class76.aFontMetrics1500 = null;
			Class76.aClass19_1501 = null;
			Class76.aClass19_1502 = null;
			Class76.aClass13_1496 = null;
			Class76.aClass19_1494 = null;
			Class76.aClass14_1485 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qa.C(" + bool + ')');
		}
	}

	static final void method544(Class17 class17, byte i, Class17 class17_4_, Component component) {
		try {
			if (!Class38_Sub20_Sub3_Sub5.aBool3389) {
				Class38_Sub20_Sub9.method959();
				byte[] is = class17.method122(Applet_Sub1.aClass19_3625, 2560, Class51.aClass19_1132);
				Class6.aClass38_Sub20_Sub9_Sub3_129 = new Class38_Sub20_Sub9_Sub3(is, component);
				Class3.aClass38_Sub20_Sub9_Sub3_47 = Class6.aClass38_Sub20_Sub9_Sub3_129.method1121();
				Class38_Sub1.aClass38_Sub20_Sub9_Sub2_1740 = Class38_Sub20_Sub3_Sub5.method1160(Class51.aClass19_1132, class17_4_, false, RSString.aClass19_436);
				Class38_Sub20_Sub17.aClass38_Sub20_Sub9_Sub2_3128 = Class38_Sub20_Sub3_Sub5.method1160(Class51.aClass19_1132, class17_4_, false, Class79.str_titleBox);
				Class60.aClass38_Sub20_Sub9_Sub2_1317 = Class38_Sub20_Sub3_Sub5.method1160(Class51.aClass19_1132, class17_4_, false, Entity.aClass19_3506);
				Class51.aClass38_Sub20_Sub9_Sub2Array1136 = Class37.method329(Class51.aClass19_1132, Class54.aClass19_1194, -11, class17_4_);
				if (i != -106)
					Class76.aBool1491 = false;
				Class53.aClass38_Sub20_Sub9_Sub2Array1171 = Class37.method329(Class51.aClass19_1132, Class11.aClass19_214, -11, class17_4_);
				Class44.anIntArray997 = new int[256];
				for (int i_5_ = 0; i_5_ < 64; i_5_++)
					Class44.anIntArray997[i_5_] = i_5_ * 262144;
				for (int i_6_ = 0; i_6_ < 64; i_6_++)
					Class44.anIntArray997[i_6_ + 64] = i_6_ * 1024 + 16711680;
				for (int i_7_ = 0; i_7_ < 64; i_7_++)
					Class44.anIntArray997[i_7_ + 128] = i_7_ * 4 + 16776960;
				for (int i_8_ = 0; i_8_ < 64; i_8_++)
					Class44.anIntArray997[i_8_ + 192] = 16777215;
				Class38_Sub20_Sub11.anIntArray2962 = new int[256];
				for (int i_9_ = 0; i_9_ < 64; i_9_++)
					Class38_Sub20_Sub11.anIntArray2962[i_9_] = i_9_ * 1024;
				for (int i_10_ = 0; i_10_ < 64; i_10_++)
					Class38_Sub20_Sub11.anIntArray2962[i_10_ + 64] = i_10_ * 4 + 65280;
				for (int i_11_ = 0; i_11_ < 64; i_11_++)
					Class38_Sub20_Sub11.anIntArray2962[i_11_ + 128] = i_11_ * 262144 + 65535;
				for (int i_12_ = 0; i_12_ < 64; i_12_++)
					Class38_Sub20_Sub11.anIntArray2962[i_12_ + 192] = 16777215;
				Class67.anIntArray1385 = new int[256];
				for (int i_13_ = 0; i_13_ < 64; i_13_++)
					Class67.anIntArray1385[i_13_] = i_13_ * 4;
				for (int i_14_ = 0; i_14_ < 64; i_14_++)
					Class67.anIntArray1385[i_14_ + 64] = i_14_ * 262144 + 255;
				for (int i_15_ = 0; i_15_ < 64; i_15_++)
					Class67.anIntArray1385[i_15_ + 128] = 16711935 + i_15_ * 1024;
				for (int i_16_ = 0; i_16_ < 64; i_16_++)
					Class67.anIntArray1385[i_16_ + 192] = 16777215;
				Class80.anIntArray1602 = new int[32768];
				Class73.anIntArray1423 = new int[32768];
				Class83.anIntArray1652 = new int[256];
				Class54.method418(-82, null);
				Class51.aClass19_1135 = Class51.aClass19_1132;
				if (Class15.anInt302 == 0)
					Class17.aBool355 = true;
				else
					Class17.aBool355 = false;
				Class55.anInt1228 = 0;
				Class74.aBool1448 = false;
				Class2_Sub1.anIntArray2004 = new int[32768];
				Class51.aClass19_1122 = Class51.aClass19_1132;
				Class82.anIntArray1642 = new int[32768];
				if (Class17.aBool355)
					Class16.method89(2, (byte) 55);
				else
					Class52.method408(Class67.aClass17_Sub1_1382, Class38_Sub18.aClass19_2202, 55, false, 255, Class51.aClass19_1132, 2);
				Class44.method367(i + 106, false);
				Class38_Sub20_Sub3_Sub5.aBool3389 = true;
				Class6.aClass38_Sub20_Sub9_Sub3_129.method1123(0, 0);
				Class3.aClass38_Sub20_Sub9_Sub3_47.method1123(382, 0);
				Class38_Sub1.aClass38_Sub20_Sub9_Sub2_1740.method1089(-(Class38_Sub1.aClass38_Sub20_Sub9_Sub2_1740.anInt3242 / 2) + 382, 18);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qa.E(" + (class17 != null ? "{...}" : "null") + ',' + i + ',' + (class17_4_ != null ? "{...}" : "null") + ',' + (component != null ? "{...}" : "null") + ')');
		}
	}

	static final void method545(int i, int i_17_) {
		do {
			try {
				Applet_Sub1.method1218((byte) -93);
				Class42.method358(true);
				if (i_17_ == -2) {
					int i_18_ = Class37.method326(16, i).anInt3063;
					if (i_18_ != 0) {
						int i_19_ = Class21.anIntArray528[i];
						if (i_18_ == 1) {
							if (i_19_ == 1) {
								Class38_Sub20_Sub9_Sub4.method1184(0.9);
								((Class45) Class38_Sub20_Sub9_Sub4.anInterface3_3533).method376(-110, 0.9);
							}
							if (i_19_ == 2) {
								Class38_Sub20_Sub9_Sub4.method1184(0.8);
								((Class45) Class38_Sub20_Sub9_Sub4.anInterface3_3533).method376(i_17_ ^ 0x77, 0.8);
							}
							if (i_19_ == 3) {
								Class38_Sub20_Sub9_Sub4.method1184(0.7);
								((Class45) Class38_Sub20_Sub9_Sub4.anInterface3_3533).method376(-116, 0.7);
							}
							if (i_19_ == 4) {
								Class38_Sub20_Sub9_Sub4.method1184(0.6);
								((Class45) Class38_Sub20_Sub9_Sub4.anInterface3_3533).method376(-113, 0.6);
							}
							Class11.method56((byte) -26);
						}
						if (i_18_ == 3) {
							int i_20_ = 0;
							if (i_19_ == 0)
								i_20_ = 255;
							if (i_19_ == 1)
								i_20_ = 192;
							if (i_19_ == 2)
								i_20_ = 128;
							if (i_19_ == 3)
								i_20_ = 64;
							if (i_19_ == 4)
								i_20_ = 0;
							if (Class15.anInt302 != i_20_) {
								if (Class15.anInt302 == 0 && Class38_Sub19.anInt2238 != -1) {
									Class38_Sub4.method628(Class67.aClass17_Sub1_1382, -1, Class38_Sub19.anInt2238, i_20_, false, 0);
									Class76.aBool1490 = false;
								} else if (i_20_ != 0)
									Class79.method574(i_20_, false);
								else {
									Class79.method571(true);
									Class76.aBool1490 = false;
								}
								Class15.anInt302 = i_20_;
							}
						}
						if (i_18_ == 10) {
							if (i_19_ == 0)
								Class77.anInt1505 = 127;
							if (i_19_ == 1)
								Class77.anInt1505 = 96;
							if (i_19_ == 2)
								Class77.anInt1505 = 64;
							if (i_19_ == 3)
								Class77.anInt1505 = 32;
							if (i_19_ == 4)
								Class77.anInt1505 = 0;
						}
						if (i_18_ == 6)
							Class17_Sub1.anInt1710 = i_19_;
						if (i_18_ == 4) {
							if (i_19_ == 0)
								Player.anInt3565 = 127;
							if (i_19_ == 1)
								Player.anInt3565 = 96;
							if (i_19_ == 2)
								Player.anInt3565 = 64;
							if (i_19_ == 3)
								Player.anInt3565 = 32;
							if (i_19_ == 4)
								Player.anInt3565 = 0;
						}
						if (i_18_ == 5)
							Class42.anInt949 = i_19_;
						if (i_18_ != 9)
							break;
						Class67.anInt1380 = i_19_;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "qa.A(" + i + ',' + i_17_ + ')');
			}
			break;
		} while (false);
	}

	static final int method546(int i) {
		try {
			if (i >= -2)
				Class76.aClass19_1494 = null;
			return 6;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qa.B(" + i + ')');
		}
	}

	static final synchronized byte[] method547(boolean bool, int i) {
		try {
			if (i == 100 && Class38_Sub2.anInt1771 > 0) {
				byte[] is = Class38_Sub20_Sub14.aByteArrayArray3032[--Class38_Sub2.anInt1771];
				Class38_Sub20_Sub14.aByteArrayArray3032[Class38_Sub2.anInt1771] = null;
				return is;
			}
			if (i == 5000 && Class75.anInt1478 > 0) {
				byte[] is = Class38_Sub14.aByteArrayArray2148[--Class75.anInt1478];
				Class38_Sub14.aByteArrayArray2148[Class75.anInt1478] = null;
				return is;
			}
			if (bool != true)
				Class76.aBool1490 = false;
			if (i == 30000 && Class25.anInt577 > 0) {
				byte[] is = Class14.aByteArrayArray269[--Class25.anInt577];
				Class14.aByteArrayArray269[Class25.anInt577] = null;
				return is;
			}
			return new byte[i];
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qa.F(" + bool + ',' + i + ')');
		}
	}

	static {
		Class76.aClass19_1489 = Class76.aClass19_1494;
		Class76.aBool1491 = false;
		Class76.aClass14_1485 = new Class14(32);
		Class76.anIntArray1495 = new int[50];
		Class76.aClass13_1496 = new Class13();
		Class76.anInt1499 = 0;
		Class76.aClass19_1497 = RSString.createRSString("k");
		Class76.aClass19_1498 = RSString.createRSString("Anmelde)2Limit -Uberschritten)3");
		Class76.aClass19_1502 = RSString.createRSString("scrollen:");
		Class76.aClass19_1501 = RSString.createRSString("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");
	}
}
