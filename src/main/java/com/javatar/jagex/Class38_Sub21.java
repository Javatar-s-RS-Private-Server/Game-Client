package com.javatar.jagex;/* Class38_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

final class Class38_Sub21 extends Node {
	static Class13[][][] aClass13ArrayArrayArray2259 = new Class13[4][104][104];
	int anInt2260;
	int anInt2263;
	static RSString aClass19_2264 = RSString.createRSString("<col=ffb000>");
	static RSString aClass19_2265 = RSString.createRSString("(Y");
	int anInt2266;
	int anInt2267;
	int anInt2268;
	int anInt2270;
	int anInt2272;
	int anInt2273;
	int anInt2274 = 0;
	int anInt2275;
	int anInt2276;
	static CRC32 aCRC32_2277 = new CRC32();
	static boolean aBool2278;
	static RSString aClass19_2279;
	static boolean aBool2280;
	int anInt2282;
	static RSString aClass19_2283;
	static RSString aClass19_2284 = RSString.createRSString("mapscene");
	static int anInt2285 = 0;
	private static RSString aClass19_2286;

	public static void method711(int i) {
		try {
			Class38_Sub21.aCRC32_2277 = null;
			Class38_Sub21.aClass19_2279 = null;
			Class38_Sub21.aClass19_2286 = null;
			Class38_Sub21.aClass13ArrayArrayArray2259 = null;
			Class38_Sub21.aClass19_2283 = null;
			Class38_Sub21.aClass19_2284 = null;
			Class38_Sub21.aClass19_2265 = null;
			int i_0_ = 37 / ((-59 - i) / 48);
			Class38_Sub21.aClass19_2264 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "da.B(" + i + ')');
		}
	}

	static final void method712(int i, long l) {
		try {
			if (l != 0L)
				if (Class38_Sub20_Sub3_Sub2.anInt3250 >= 100)
					Class62.method464((byte) 98, Class38_Sub3.aClass19_1789, 0, Class38_Sub22.aClass19_2312);
				else {
					RSString class19 = Class73.method520(l, 1).method167((byte) 52);
					for (int i_1_ = 0; i_1_ < Class38_Sub20_Sub3_Sub2.anInt3250; i_1_++)
						if (Class5.aLongArray97[i_1_] == l) {
							Class62.method464((byte) 98, Class9.method43(new RSString[] { class19, Class38_Sub20_Sub17.aClass19_3116 }, (byte) -20), 0, Class38_Sub22.aClass19_2312);
							return;
						}
					for (int i_2_ = 0; Class81.anInt1618 > i_2_; i_2_++)
						if (Class20.aLongArray499[i_2_] == l) {
							Class62.method464((byte) 98, Class9.method43(new RSString[] { Class80.aClass19_1598, class19, Class44.aClass19_1006 }, (byte) -20), 0, Class38_Sub22.aClass19_2312);
							return;
						}
					if (class19.method175(true, Client.myPlayer.name))
						Class62.method464((byte) 98, Class2_Sub1.aClass19_2015, 0, Class38_Sub22.aClass19_2312);
					else {
						Class5.aLongArray97[Class38_Sub20_Sub3_Sub2.anInt3250] = l;
						Class54.aClass19Array1206[Class38_Sub20_Sub3_Sub2.anInt3250++] = Class73.method520(l, 1);
						Class81.anInt1624 = Entity.anInt3513;
						if (i < 16)
							Class38_Sub21.method714((byte) -120, -78);
						Client.outputBuffer.putOpcode(38);
						Client.outputBuffer.method762(l, (byte) 56);
					}
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "da.F(" + i + ',' + l + ')');
		}
	}

	static final void method713(byte i, Applet_Sub1 applet_sub1) {
		try {
			if (Class74.aBool1448)
				Class72.method512((byte) 33, applet_sub1);
			else {
				if (Client.lastMouseAction == 1 && Class73.anInt1429 >= 715 && RS2Buffer.anInt2416 >= 453) {
					Class17.aBool355 = !Class17.aBool355;
					if (!Class17.aBool355)
						Class4.method24(Class51.aClass19_1132, Class67.aClass17_Sub1_1382, false, 255, Class38_Sub18.aClass19_2202, (byte) -122);
					else
						Class79.method571(true);
				}
				if (Class48.anInt1069 != 5) {
					RS2Buffer.anInt2397++;
					if (Class48.anInt1069 == 10) {
						if (Class38_Sub3.anInt1776 != 2 && Class64.anInt1361 == 0) {
							if (Client.lastMouseAction == 1) {
								int i_3_ = 5;
								int i_4_ = 35;
								int i_5_ = 463;
								int i_6_ = 100;
								if (i_3_ <= Class73.anInt1429 && Class73.anInt1429 <= i_3_ + i_6_ && i_5_ <= RS2Buffer.anInt2416 && RS2Buffer.anInt2416 <= i_5_ + i_4_) {
									Class35.method316(7032);
									return;
								}
							}
							if (Class73_Sub2.aClass55_2303 != null)
								Class35.method316(7032);
						}
						int i_7_ = Client.lastMouseAction;
						if (i == 93) {
							int i_8_ = RS2Buffer.anInt2416;
							int i_9_ = Class73.anInt1429;
							if (Class55.anInt1228 == 0) {
								int i_10_ = 291;
								int i_11_ = 302;
								if (i_7_ == 1 && i_11_ - 75 <= i_9_ && i_9_ <= i_11_ + 75 && i_8_ >= i_10_ - 20 && i_8_ <= i_10_ + 20) {
									Class50.anInt1106 = 0;
									Class55.anInt1228 = 3;
								}
								i_11_ = 462;
								if (i_7_ == 1 && i_9_ >= i_11_ - 75 && i_11_ + 75 >= i_9_ && i_8_ >= i_10_ - 20 && i_8_ <= i_10_ + 20) {
									Class51.aClass19_1138 = Class38_Sub20_Sub11.aClass19_2966;
									Class51.aClass19_1124 = Class38_Sub20_Sub11.aClass19_2941;
									Class50.anInt1106 = 0;
									Class51.aClass19_1126 = Class38_Sub22.aClass19_2313;
									Class55.anInt1228 = 2;
								}
							} else if (Class55.anInt1228 != 2) {
								if (Class55.anInt1228 == 3) {
									int i_12_ = 382;
									int i_13_ = 321;
									if (i_7_ == 1 && i_12_ - 75 <= i_9_ && i_9_ <= i_12_ + 75 && i_8_ >= i_13_ - 20 && i_8_ <= i_13_ + 20)
										Class55.anInt1228 = 0;
								}
							} else {
								int i_14_ = 302;
								int i_15_ = 231;
								i_15_ += 30;
								if (i_7_ == 1 && i_8_ >= i_15_ - 15 && i_8_ < i_15_)
									Class50.anInt1106 = 0;
								i_15_ += 15;
								int i_16_ = 321;
								if (i_7_ == 1 && i_15_ - 15 <= i_8_ && i_15_ > i_8_)
									Class50.anInt1106 = 1;
								i_15_ += 15;
								if (i_7_ == 1 && i_14_ - 75 <= i_9_ && i_14_ + 75 >= i_9_ && i_16_ - 20 <= i_8_ && i_8_ <= i_16_ + 20) {
									Class51.aClass19_1135 = Class51.aClass19_1135.method147((byte) 117).method167((byte) 52);
									if (Class51.aClass19_1135.method143((byte) 15) == 0)
										Class77.method551(false, Class38_Sub20_Sub11.aClass19_2970, Class38_Sub20_Sub11.aClass19_2913, Class38_Sub9.aClass19_2068);
									else if (Class51.aClass19_1122.method143((byte) 107) == 0)
										Class77.method551(false, Class38_Sub20_Sub11.aClass19_2959, Class38_Sub20_Sub11.aClass19_2971, Class38_Sub20_Sub3_Sub5.aClass19_3387);
									else {
										Class77.method551(false, Class38_Sub20_Sub11.aClass19_2927, Class38_Sub20_Sub11.aClass19_2953, Class11.aClass19_201);
										Canvas_Sub1.method808(0, 20);
									}
								} else {
									i_14_ = 462;
									if (i_7_ == 1 && i_14_ - 75 <= i_9_ && i_14_ + 75 >= i_9_ && i_16_ - 20 <= i_8_ && i_16_ + 20 >= i_8_) {
										Class51.aClass19_1122 = Class51.aClass19_1132;
										Class55.anInt1228 = 0;
										Class51.aClass19_1135 = Class51.aClass19_1132;
									}
									while (Class32.method300((byte) 65)) {
										boolean bool = false;
										for (int i_17_ = 0; Class41.aClass19_930.method143((byte) 64) > i_17_; i_17_++)
											if (Class10.anInt181 == Class41.aClass19_930.method163(124, i_17_)) {
												bool = true;
												break;
											}
										if (Class50.anInt1106 == 0) {
											if (NodeSub.anInt2256 == 85 && Class51.aClass19_1135.method143((byte) 99) > 0)
												Class51.aClass19_1135 = Class51.aClass19_1135.method144((byte) 32, 0, Class51.aClass19_1135.method143((byte) 104) - 1);
											if (NodeSub.anInt2256 == 84 || NodeSub.anInt2256 == 80)
												Class50.anInt1106 = 1;
											if (bool && Class51.aClass19_1135.method143((byte) 50) < 12)
												Class51.aClass19_1135 = Class51.aClass19_1135.method180(255, Class10.anInt181);
										} else if (Class50.anInt1106 == 1) {
											if (NodeSub.anInt2256 == 85 && Class51.aClass19_1122.method143((byte) 85) > 0)
												Class51.aClass19_1122 = Class51.aClass19_1122.method144((byte) 4, 0, Class51.aClass19_1122.method143((byte) 52) - 1);
											if (NodeSub.anInt2256 == 84 || NodeSub.anInt2256 == 80)
												Class50.anInt1106 = 0;
											if (Player.anInt3582 == 2 && NodeSub.anInt2256 == 84) {
												Class51.aClass19_1135 = Class51.aClass19_1135.method147((byte) 121).method167((byte) 52);
												if (Class51.aClass19_1135.method143((byte) 115) == 0)
													Class77.method551(false, Class38_Sub20_Sub11.aClass19_2970, Class38_Sub20_Sub11.aClass19_2913, Class38_Sub9.aClass19_2068);
												else {
													if (Class51.aClass19_1122.method143((byte) 82) == 0)
														Class77.method551(false, Class38_Sub20_Sub11.aClass19_2959, Class38_Sub20_Sub11.aClass19_2971, Class38_Sub20_Sub3_Sub5.aClass19_3387);
													else {
														Class77.method551(false, Class38_Sub20_Sub11.aClass19_2927, Class38_Sub20_Sub11.aClass19_2953, Class11.aClass19_201);
														Canvas_Sub1.method808(0, 20);
														break;
													}
													break;
												}
												break;
											}
											if (bool && Class51.aClass19_1122.method143((byte) 84) < 20)
												Class51.aClass19_1122 = Class51.aClass19_1122.method180(255, Class10.anInt181);
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "da.E(" + i + ',' + (applet_sub1 != null ? "{...}" : "null") + ')');
		}
	}

	static final boolean method714(byte i, int i_18_) {
		try {
			if (i < 82)
				return true;
			if (i_18_ < 32)
				return false;
			if (i_18_ == 127)
				return false;
			if (i_18_ >= 129 && i_18_ <= 159)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "da.A(" + i + ',' + i_18_ + ')');
		}
	}

	static final void method715(byte i) {
		try {
			if (Class38_Sub20_Sub3_Sub5.aBool3389) {
				Class2_Sub1.anIntArray2004 = null;
				Class14.aClass38_Sub20_Sub9_Sub2Array250 = null;
				Class51.aClass38_Sub20_Sub9_Sub2Array1136 = null;
				Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829 = null;
				if (i <= -95) {
					Class14.aClass38_Sub20_Sub9_Sub2_259 = null;
					Class3.aClass38_Sub20_Sub9_Sub3_47 = null;
					Class60.aClass38_Sub20_Sub9_Sub2_1317 = null;
					Player.aClass38_Sub20_Sub9_Sub3Array3587 = null;
					Class82.anIntArray1642 = null;
					Class6.aClass38_Sub20_Sub9_Sub3_129 = null;
					Class38_Sub1.aClass38_Sub20_Sub9_Sub2_1740 = null;
					Class38_Sub20_Sub17.aClass38_Sub20_Sub9_Sub2_3128 = null;
					Class67.anIntArray1385 = null;
					Class38_Sub20_Sub11.anIntArray2962 = null;
					Class44.anIntArray997 = null;
					Class80.anIntArray1602 = null;
					Class53.aClass38_Sub20_Sub9_Sub2Array1171 = null;
					Class83.anIntArray1652 = null;
					Class73.anIntArray1423 = null;
					Canvas_Sub1.aClass38_Sub20_Sub9_Sub2Array2511 = null;
					Class16.method89(2, (byte) 55);
					Class44.method367(0, true);
					Class38_Sub20_Sub3_Sub5.aBool3389 = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "da.C(" + i + ')');
		}
	}

	static final int method716(int i, int i_19_, int i_20_) {
		try {
			int i_21_ = -35 / ((i - 51) / 39);
			int i_22_ = 0;
			for (/**/; i_20_ > 0; i_20_--) {
				i_22_ = i_19_ & 0x1 | i_22_ << -858187999;
				i_19_ >>>= 1;
			}
			return i_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "da.D(" + i + ',' + i_19_ + ',' + i_20_ + ')');
		}
	}

	Class38_Sub21() {
		this.anInt2273 = -1;
	}

	static {
		Class38_Sub21.aClass19_2279 = RSString.createRSString("Hier wechseln");
		Class38_Sub21.aBool2280 = false;
		Class38_Sub21.aBool2278 = false;
		Class38_Sub21.aClass19_2286 = RSString.createRSString("To create a new account you need to");
		Class38_Sub21.aClass19_2283 = Class38_Sub21.aClass19_2286;
	}
}
