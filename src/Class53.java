/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class53 {
	static NPC[] aClass38_Sub20_Sub3_Sub7_Sub1Array1164;
	static int anInt1165;
	static RSString aClass19_1168;
	static RSString aClass19_1169;
	static Class38_Sub20_Sub9_Sub2[] aClass38_Sub20_Sub9_Sub2Array1171;
	static int[] anIntArray1172 = new int[2000];
	static RSString[] aClass19Array1173;
	static RSString[] aClass19Array1179;

	static {
		Class53.anInt1165 = 0;
		Class53.aClass19_1169 = RSString.createRSString("Bitte versuchen Sie)1");
		Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164 = new NPC[32768];
		Class53.aClass19Array1179 = new RSString[100];
		Class53.aClass19_1168 = null;
		Class53.aClass19Array1173 = new RSString[200];
	}

	private final int[] anIntArray1167;
	private final byte[] aByteArray1175;
	private int[] anIntArray1178;

	Class53(byte[] is) {
		try {
			int i = is.length;
			anIntArray1167 = new int[i];
			anIntArray1178 = new int[8];
			aByteArray1175 = is;
			int[] is_47_ = new int[33];
			int i_48_ = 0;
			for (int i_49_ = 0; i > i_49_; i_49_++) {
				int i_50_ = is[i_49_];
				if (i_50_ != 0) {
					int i_51_ = 1 << -i_50_ + 32;
					int i_52_ = is_47_[i_50_];
					anIntArray1167[i_49_] = i_52_;
					int i_53_;
					if ((i_52_ & i_51_) != 0)
						i_53_ = is_47_[i_50_ - 1];
					else {
						for (int i_54_ = i_50_ - 1; i_54_ >= 1; i_54_--) {
							int i_55_ = is_47_[i_54_];
							if (i_52_ != i_55_)
								break;
							int i_56_ = 1 << -i_54_ + 32;
							if ((i_56_ & i_55_) != 0) {
								is_47_[i_54_] = is_47_[i_54_ - 1];
								break;
							}
							is_47_[i_54_] = Class38_Sub3.method618(i_56_, i_55_);
						}
						i_53_ = i_52_ | i_51_;
					}
					is_47_[i_50_] = i_53_;
					for (int i_57_ = i_50_ + 1; i_57_ <= 32; i_57_++)
						if (i_52_ == is_47_[i_57_])
							is_47_[i_57_] = i_53_;
					int i_58_ = 0;
					for (int i_59_ = 0; i_59_ < i_50_; i_59_++) {
						int i_60_ = -2147483648 >>> i_59_;
						if ((i_52_ & i_60_) == 0)
							i_58_++;
						else {
							if (anIntArray1178[i_58_] == 0)
								anIntArray1178[i_58_] = i_48_;
							i_58_ = anIntArray1178[i_58_];
						}
						i_60_ >>>= 1;
						if (i_58_ >= anIntArray1178.length) {
							int[] is_61_ = new int[anIntArray1178.length * 2];
							for (int i_62_ = 0; anIntArray1178.length > i_62_; i_62_++)
								is_61_[i_62_] = anIntArray1178[i_62_];
							anIntArray1178 = is_61_;
						}
					}
					anIntArray1178[i_58_] = i_49_ ^ 0xffffffff;
					if (i_58_ >= i_48_)
						i_48_ = i_58_ + 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bf.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	static final void method409(RSString class19, int i, boolean bool) {
		try {
			int i_0_ = 4;
			int i_1_ = i_0_ + 6;
			int i_2_ = Class38_Sub20_Sub13.aClass38_Sub20_Sub9_Sub1_Sub1_3023.method1082(class19, 250);
			int i_3_ = Class38_Sub20_Sub13.aClass38_Sub20_Sub9_Sub1_Sub1_3023.method1067(class19, 250) * 13;
			int i_4_ = 6 + i_0_;
			Class38_Sub20_Sub9.method958(i_4_ - i_0_, i_1_ - i_0_, i_0_ + i_2_ + i_0_, i_0_ + i_3_ + i_0_, 0);
			Class38_Sub20_Sub9.method963(i_4_ - i_0_, -i_0_ + i_1_, i_0_ + i_0_ + i_2_, i_0_ + i_3_ + i_0_, i);
			Class38_Sub20_Sub13.aClass38_Sub20_Sub9_Sub1_Sub1_3023.method1060(class19, i_4_, i_1_, i_2_, i_3_, 16777215, -1, 1, 1, 0);
			ItemDefinition.method931(114, i_4_ - i_0_, -i_0_ + i_1_, i_0_ + i_2_ + i_0_, i_0_ + i_0_ + i_3_);
			if (!bool)
				RSString.method168(i_2_, i_1_, i_4_, i_3_, (byte) -121);
			else
				try {
					Graphics graphics = Class38_Sub3.aCanvas1783.getGraphics();
					Class38_Sub2.aClass2_1768.method13(graphics, 29504, 0, 0);
				} catch (Exception exception) {
					Class38_Sub3.aCanvas1783.repaint();
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bf.C(" + (class19 != null ? "{...}" : "null") + ',' + i + ',' + bool + ')');
		}
	}

	static final void method411(int i, RS2Buffer class38_sub23) {
		try {
			if (Class38_Sub20_Sub11.aClass16_2923 != null)
				try {
					Class38_Sub20_Sub11.aClass16_2923.method97((byte) -88, 0L);
					Class38_Sub20_Sub11.aClass16_2923.method88(class38_sub23.buffer, (byte) 90, 24, class38_sub23.pos);
				} catch (Exception exception) {
					/* empty */
				}
			int i_12_ = -65 / ((-53 - i) / 51);
			class38_sub23.pos += 24;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bf.A(" + i + ',' + (class38_sub23 != null ? "{...}" : "null") + ')');
		}
	}

	static final boolean method413(int i, boolean bool, byte[] is, int i_25_) {
		try {
			RS2Buffer class38_sub23 = new RS2Buffer(is);
			int i_26_ = -1;
			boolean bool_27_ = bool;
			for (;;) {
				int i_28_ = class38_sub23.method726(true);
				if (i_28_ == 0)
					break;
				i_26_ += i_28_;
				boolean bool_29_ = false;
				int i_30_ = 0;
				for (;;)
					if (bool_29_) {
						int i_31_ = class38_sub23.method726(true);
						if (i_31_ == 0)
							break;
						class38_sub23.getUByte();
					} else {
						int i_32_ = class38_sub23.method726(true);
						if (i_32_ == 0)
							break;
						i_30_ += i_32_ - 1;
						int i_33_ = i_30_ >> 6 & 0x3f;
						int i_34_ = i_33_ + i;
						int i_35_ = class38_sub23.getUByte() >> 2;
						int i_36_ = i_30_ & 0x3f;
						int i_37_ = i_36_ + i_25_;
						if (i_34_ > 0 && i_37_ > 0 && i_34_ < 103 && i_37_ < 103) {
							ObjectDefinition class38_sub20_sub1 = Class80.method581(-127, i_26_);
							if (i_35_ != 22 || !Class38_Sub4.aBool1811 || class38_sub20_sub1.anInt2440 != 0 || class38_sub20_sub1.anInt2482 == 1 || class38_sub20_sub1.aBool2451) {
								bool_29_ = true;
								if (!class38_sub20_sub1.method797(65535)) {
									Class16.anInt320++;
									bool_27_ = false;
								}
							}
						}
					}
			}
			return bool_27_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bf.G(" + i + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_25_ + ')');
		}
	}

	public static void method414(byte i) {
		try {
			Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164 = null;
			if (i > 52) {
				Class53.aClass19_1169 = null;
				Class53.aClass19_1168 = null;
				Class53.aClass19Array1179 = null;
				Class53.anIntArray1172 = null;
				Class53.aClass19Array1173 = null;
				Class53.aClass38_Sub20_Sub9_Sub2Array1171 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bf.I(" + i + ')');
		}
	}

	static final boolean method415(byte i, int i_38_) {
		try {
			int i_39_ = 40 / ((-38 - i) / 37);
			return (i_38_ >> 28 & 0x1) != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bf.E(" + i + ',' + i_38_ + ')');
		}
	}

	static final void method416(int i, int i_40_) {
		do {
			try {
				if (i_40_ >= 0) {
					int i_41_ = Class38_Sub20_Sub13.anIntArray3015[i_40_];
					int i_42_ = Class15.anIntArray284[i_40_];
					int i_43_ = Class17_Sub1.anIntArray1709[i_40_];
					if (i_43_ >= 2000)
						i_43_ -= 2000;
					int i_44_ = Class50.anIntArray1107[i_40_];
					if (i_43_ == 7) {
						client.secureBuffer.putOpcode(252);
						client.secureBuffer.method777(i_42_, (byte) 29);
						client.secureBuffer.putShort(i_41_);
						client.secureBuffer.method767(-25680, i_44_);
						client.redrawTimer = 0;
						client.atInventoryInterfaceType = Projectile.method1167(i_42_, -122);
						Class38_Sub20_Sub8.anInt2883 = i_41_;
					}
					if (i_43_ == 50) {
						Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_44_];
						if (class38_sub20_sub3_sub7_sub2 != null) {
							client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub2.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub2.walkQueueY[0], 1, 2);
							Class21.anInt523 = Class73.anInt1429;
							client.crossState = 2;
							Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
							client.crossIndex = 0;
							client.secureBuffer.putOpcode(31);
							client.secureBuffer.method769(i_44_, 70);
						}
					}
					if (i_43_ == 10) {
						NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_44_];
						if (class38_sub20_sub3_sub7_sub1 != null) {
							client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub1.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub1.walkQueueY[0], 1, 2);
							Class21.anInt523 = Class73.anInt1429;
							client.crossIndex = 0;
							client.crossState = 2;
							Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
							client.secureBuffer.putOpcode(185);
							client.secureBuffer.putShort(i_44_);
						}
					}
					if (i_43_ == 22) {
						Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_44_];
						if (class38_sub20_sub3_sub7_sub2 != null) {
							client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub2.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub2.walkQueueY[0], 1, 2);
							Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
							client.crossState = 2;
							client.crossIndex = 0;
							Class21.anInt523 = Class73.anInt1429;
							client.secureBuffer.putOpcode(29);
							client.secureBuffer.method777(Class2_Sub1.anInt2008, (byte) 29);
							client.secureBuffer.putLEShortA(Node.anInt893);
							client.secureBuffer.method769(i_44_, 84);
						}
					}
					if (i_43_ == 8) {
						Class38_Sub6 class38_sub6 = Class38_Sub20_Sub12.method987(i_41_, i_42_, (byte) -29);
						if (class38_sub6 != null) {
							Class11.method55(-8602);
							Class60.method453((byte) -28, i_41_, i_42_, Class38_Sub1.method610(true, Class30.method283(-100, class38_sub6)));
							Class42.anInt964 = 0;
							Class30.aClass19_736 = Class38_Sub20_Sub15.method1006((byte) -7, class38_sub6);
							if (Class30.aClass19_736 == null)
								Class30.aClass19_736 = Class41.aClass19_937;
							if (!class38_sub6.aBool1961)
								Class53.aClass19_1168 = Class9.method43(new RSString[] { Class48.aClass19_1083, class38_sub6.aClass19_1946, Class38_Sub20_Sub12.aClass19_2998 }, (byte) -20);
							else
								Class53.aClass19_1168 = Class9.method43(new RSString[] { class38_sub6.aClass19_1926, Class38_Sub20_Sub12.aClass19_2998 }, (byte) -20);
						}
					} else {
						if (i_43_ == 15) {
							client.secureBuffer.putOpcode(44);
							client.secureBuffer.method767(-25680, i_41_);
							client.secureBuffer.method777(i_42_, (byte) 29);
							client.secureBuffer.putShort(i_44_);
							client.redrawTimer = 0;
							client.atInventoryInterfaceType = Projectile.method1167(i_42_, -107);
							Class38_Sub20_Sub8.anInt2883 = i_41_;
						}
						if (i_43_ == 36) {
							boolean bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 0, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 0, 2);
							if (!bool)
								bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 1, 2);
							client.crossState = 2;
							Class21.anInt523 = Class73.anInt1429;
							client.crossIndex = 0;
							Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
							client.secureBuffer.putOpcode(80);
							client.secureBuffer.method769(client.currentBaseY + i_41_, 66);
							client.secureBuffer.method769(client.currentBaseX + i_42_, 69);
							client.secureBuffer.method767(-25680, i_44_);
						}
						if (i_43_ == 43) {
							client.secureBuffer.putOpcode(204);
							client.secureBuffer.putInt(Class2_Sub1.anInt2008);
							client.secureBuffer.method747(i_42_, -2687);
							client.secureBuffer.method769(i_44_, 109);
							client.secureBuffer.putLEShortA(Node.anInt893);
							client.secureBuffer.putLEShortA(i_41_);
							client.redrawTimer = 0;
							client.atInventoryInterfaceType = Projectile.method1167(i_42_, -109);
							Class38_Sub20_Sub8.anInt2883 = i_41_;
						}
						if (i_43_ == 16) {
							Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_44_];
							if (class38_sub20_sub3_sub7_sub2 != null) {
								client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub2.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub2.walkQueueY[0], 1, 2);
								client.crossIndex = 0;
								Class21.anInt523 = Class73.anInt1429;
								Class38_Sub2.anInt1764++;
								client.crossState = 2;
								Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
								client.secureBuffer.putOpcode(138);
								client.secureBuffer.method769(i_44_, 124);
							}
						}
						if (i_43_ == 45) {
							Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_44_];
							if (class38_sub20_sub3_sub7_sub2 != null) {
								Class77.anInt1518++;
								client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub2.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub2.walkQueueY[0], 1, 2);
								client.crossState = 2;
								Class21.anInt523 = Class73.anInt1429;
								client.crossIndex = 0;
								Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
								client.secureBuffer.putOpcode(35);
								client.secureBuffer.method767(-25680, i_44_);
							}
						}
						if (i_43_ == 1002) {
							Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
							client.crossState = 2;
							Class21.anInt523 = Class73.anInt1429;
							client.crossIndex = 0;
							client.secureBuffer.putOpcode(32);
							client.secureBuffer.method769((i_44_ & 0x1fffc611) >> 14, 75);
						}
						if (i_43_ == 24) {
							NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_44_];
							if (class38_sub20_sub3_sub7_sub1 != null) {
								client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub1.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub1.walkQueueY[0], 1, 2);
								client.crossIndex = 0;
								client.crossState = 2;
								Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
								Class21.anInt523 = Class73.anInt1429;
								client.secureBuffer.putOpcode(37);
								client.secureBuffer.putLEShortA(i_44_);
							}
						}
						if (i_43_ == 58) {
							NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_44_];
							if (class38_sub20_sub3_sub7_sub1 != null) {
								client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub1.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub1.walkQueueY[0], 1, 2);
								Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
								Class21.anInt523 = Class73.anInt1429;
								client.crossIndex = 0;
								client.crossState = 2;
								client.secureBuffer.putOpcode(238);
								client.secureBuffer.method774(8, Class17_Sub1.anInt1713);
								client.secureBuffer.putLEShortA(Class38_Sub10_Sub3.anInt2837);
								client.secureBuffer.putLEShortA(i_44_);
								client.secureBuffer.putLEShortA(Class58.anInt1286);
							}
						}
						if (i_43_ == 3)
							RuntimeException_Sub1.aClass27_3292.method233(client.height, i_41_, i_42_);
						if (i_43_ == 40) {
							Class38_Sub20_Sub13.anInt3013++;
							client.secureBuffer.putOpcode(218);
							client.secureBuffer.putInt(i_42_);
							Class38_Sub6 class38_sub6 = Projectile.method1167(i_42_, -101);
							if (class38_sub6.anIntArrayArray1955 != null && class38_sub6.anIntArrayArray1955[0][0] == 5) {
								int i_45_ = class38_sub6.anIntArrayArray1955[0][1];
								Class21.anIntArray528[i_45_] = -Class21.anIntArray528[i_45_] + 1;
								Class76.method545(i_45_, -2);
							}
						}
						if (i_43_ == 25) {
							client.secureBuffer.putOpcode(231);
							client.secureBuffer.putLEShortA(Class58.anInt1286);
							client.secureBuffer.method774(8, Class17_Sub1.anInt1713);
							client.secureBuffer.method767(-25680, i_44_);
							client.secureBuffer.method767(-25680, i_41_);
							client.secureBuffer.putShort(Class38_Sub10_Sub3.anInt2837);
							client.secureBuffer.method747(i_42_, -2687);
							client.redrawTimer = 0;
							client.atInventoryInterfaceType = Projectile.method1167(i_42_, -109);
							Class38_Sub20_Sub8.anInt2883 = i_41_;
						}
						if (i_43_ == 1001) {
							client.crossIndex = 0;
							Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
							client.crossState = 2;
							Class21.anInt523 = Class73.anInt1429;
							Class42.anInt950++;
							client.secureBuffer.putOpcode(43);
							client.secureBuffer.putLEShortA(i_44_);
						}
						if (i_43_ == 41) {
							client.secureBuffer.putOpcode(9);
							client.secureBuffer.method769(i_44_, 102);
							client.secureBuffer.method777(i_42_, (byte) 29);
							client.secureBuffer.putLEShortA(i_41_);
							client.redrawTimer = 0;
							client.atInventoryInterfaceType = Projectile.method1167(i_42_, 100);
							Class38_Sub20_Sub8.anInt2883 = i_41_;
						}
						if (i_43_ == 44) {
							Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_44_];
							if (class38_sub20_sub3_sub7_sub2 != null) {
								client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub2.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub2.walkQueueY[0], 1, 2);
								client.crossState = 2;
								Class21.anInt523 = Class73.anInt1429;
								client.crossIndex = 0;
								Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
								client.secureBuffer.putOpcode(10);
								client.secureBuffer.method769(i_44_, 100);
							}
						}
						if (i_43_ == 21) {
							Class11.method55(-8602);
							Class38_Sub6 class38_sub6 = Projectile.method1167(i_42_, 77);
							Class58.anInt1286 = i_44_;
							Class38_Sub10_Sub3.anInt2837 = i_41_;
							Class17_Sub1.anInt1713 = i_42_;
							Class42.anInt964 = 1;
							Class40.method340(class38_sub6, (byte) -101);
							Class38_Sub2.aClass19_1759 = Class9.method43(new RSString[] { Class38_Sub11.aClass19_2082, Node.forId(i_44_, 70).aClass19_2808, Class38_Sub20_Sub12.aClass19_2998 }, (byte) -20);
							if (Class38_Sub2.aClass19_1759 == null)
								Class38_Sub2.aClass19_1759 = Class41.aClass19_948;
						} else {
							if (i_43_ == 4)
								Class38_Sub20_Sub2.method814(-4);
							if (i >= 65) {
								if (i_43_ == 38) {
									client.secureBuffer.putOpcode(215);
									client.secureBuffer.method767(-25680, i_41_);
									client.secureBuffer.putInt(i_42_);
									client.secureBuffer.putLEShortA(i_44_);
									client.redrawTimer = 0;
									client.atInventoryInterfaceType = Projectile.method1167(i_42_, -101);
									Class38_Sub20_Sub8.anInt2883 = i_41_;
								}
								if (i_43_ == 13) {
									boolean bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 0, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 0, 2);
									if (!bool)
										bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 1, 2);
									client.crossState = 2;
									client.crossIndex = 0;
									Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
									Class21.anInt523 = Class73.anInt1429;
									client.secureBuffer.putOpcode(120);
									client.secureBuffer.method769(i_44_, 110);
									client.secureBuffer.method769(client.currentBaseY + i_41_, 95);
									client.secureBuffer.method769(i_42_ + client.currentBaseX, 74);
								}
								if (i_43_ == 18) {
									client.secureBuffer.putOpcode(241);
									client.secureBuffer.putShort(i_44_);
									client.secureBuffer.putLEShortA(i_41_);
									client.secureBuffer.method747(i_42_, -2687);
									client.redrawTimer = 0;
									client.atInventoryInterfaceType = Projectile.method1167(i_42_, -106);
									Class38_Sub20_Sub8.anInt2883 = i_41_;
								}
								if (i_43_ == 6) {
									Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_44_];
									if (class38_sub20_sub3_sub7_sub2 != null) {
										client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub2.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub2.walkQueueY[0], 1, 2);
										Class21.anInt523 = Class73.anInt1429;
										client.crossState = 2;
										Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
										client.crossIndex = 0;
										client.secureBuffer.putOpcode(73);
										client.secureBuffer.method767(-25680, i_44_);
									}
								}
								if (i_43_ == 39 && Class38_Sub2.aClass38_Sub6_1769 == null) {
									Class38_Sub17.method691(i_41_, true, i_42_);
									Class38_Sub2.aClass38_Sub6_1769 = Class38_Sub20_Sub12.method987(i_41_, i_42_, (byte) -29);
									Class40.method340(Class38_Sub2.aClass38_Sub6_1769, (byte) -107);
								}
								if (i_43_ == 1) {
									Class14.method79(i_42_, (byte) 90, i_41_, i_44_);
									client.secureBuffer.putOpcode(174);
									client.secureBuffer.method767(-25680, (i_44_ & 0x1fffd825) >> 14);
									client.secureBuffer.putLEShortA(i_41_ + client.currentBaseY);
									client.secureBuffer.method769(client.currentBaseX + i_42_, 97);
								}
								if (i_43_ == 1006) {
									Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
									Class21.anInt523 = Class73.anInt1429;
									client.crossState = 2;
									client.crossIndex = 0;
									NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_44_];
									if (class38_sub20_sub3_sub7_sub1 != null) {
										Sequence class38_sub20_sub5 = class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543;
										if (class38_sub20_sub5.anIntArray2715 != null)
											class38_sub20_sub5 = class38_sub20_sub5.method915(-118);
										if (class38_sub20_sub5 != null) {
											client.secureBuffer.putOpcode(50);
											client.secureBuffer.putLEShortA(class38_sub20_sub5.anInt2725);
										}
									}
								}
								if (i_43_ == 42) {
									client.secureBuffer.putOpcode(96);
									client.secureBuffer.putInt(i_42_);
									client.secureBuffer.method767(-25680, i_41_);
									client.secureBuffer.method747(Class2_Sub1.anInt2008, -2687);
									client.secureBuffer.method769(Node.anInt893, 127);
								}
								if (i_43_ == 19) {
									client.secureBuffer.putOpcode(117);
									client.secureBuffer.putShort(i_44_);
									client.secureBuffer.putShort(i_41_);
									client.secureBuffer.putInt(i_42_);
									client.redrawTimer = 0;
									client.atInventoryInterfaceType = Projectile.method1167(i_42_, -101);
									Class38_Sub20_Sub8.anInt2883 = i_41_;
								}
								if (i_43_ == 49 && Class14.method79(i_42_, (byte) 90, i_41_, i_44_)) {
									client.secureBuffer.putOpcode(75);
									client.secureBuffer.putLEShortA(Class58.anInt1286);
									client.secureBuffer.putShort(i_44_ >> 14 & 0x7fff);
									client.secureBuffer.putLEShortA(Class38_Sub10_Sub3.anInt2837);
									client.secureBuffer.method769(client.currentBaseY + i_41_, 74);
									client.secureBuffer.method767(-25680, client.currentBaseX + i_42_);
									client.secureBuffer.putInt(Class17_Sub1.anInt1713);
								}
								if (i_43_ == 2 && Class14.method79(i_42_, (byte) 90, i_41_, i_44_)) {
									client.secureBuffer.putOpcode(208);
									client.secureBuffer.method769((i_44_ & 0x1fffd5ce) >> 14, 67);
									client.secureBuffer.method767(-25680, client.currentBaseX + i_42_);
									client.secureBuffer.method774(8, Class2_Sub1.anInt2008);
									client.secureBuffer.putLEShortA(client.currentBaseY + i_41_);
									client.secureBuffer.putLEShortA(Node.anInt893);
								}
								if (i_43_ == 1003) {
									Class14.method79(i_42_, (byte) 90, i_41_, i_44_);
									client.secureBuffer.putOpcode(182);
									client.secureBuffer.putShort(client.currentBaseY + i_41_);
									client.secureBuffer.putShort(client.currentBaseX + i_42_);
									client.secureBuffer.method769(i_44_ >> 14 & 0x7fff, 92);
								}
								if (i_43_ == 34) {
									Class38_Sub20_Sub13.anInt3013++;
									client.secureBuffer.putOpcode(218);
									client.secureBuffer.putInt(i_42_);
									Class38_Sub6 class38_sub6 = Projectile.method1167(i_42_, -113);
									if (class38_sub6.anIntArrayArray1955 != null && class38_sub6.anIntArrayArray1955[0][0] == 5) {
										int i_46_ = class38_sub6.anIntArrayArray1955[0][1];
										if (class38_sub6.anIntArray1898[0] != Class21.anIntArray528[i_46_]) {
											Class21.anIntArray528[i_46_] = class38_sub6.anIntArray1898[0];
											Class76.method545(i_46_, -2);
										}
									}
								}
								if (i_43_ == 29) {
									Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_44_];
									if (class38_sub20_sub3_sub7_sub2 != null) {
										client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub2.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub2.walkQueueY[0], 1, 2);
										Class38_Sub22.anInt2323++;
										client.crossState = 2;
										client.crossIndex = 0;
										Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
										Class21.anInt523 = Class73.anInt1429;
										client.secureBuffer.putOpcode(81);
										client.secureBuffer.putLEShortA(i_44_);
									}
								}
								if (i_43_ == 20) {
									boolean bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 0, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 0, 2);
									if (!bool)
										bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 1, 2);
									Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
									Class21.anInt523 = Class73.anInt1429;
									client.crossState = 2;
									client.crossIndex = 0;
									client.secureBuffer.putOpcode(97);
									client.secureBuffer.putLEShortA(Class38_Sub10_Sub3.anInt2837);
									client.secureBuffer.method769(client.currentBaseX + i_42_, 66);
									client.secureBuffer.method777(Class17_Sub1.anInt1713, (byte) 29);
									client.secureBuffer.putLEShortA(Class58.anInt1286);
									client.secureBuffer.putShort(i_44_);
									client.secureBuffer.method769(client.currentBaseY + i_41_, 74);
								}
								if (i_43_ == 26) {
									Class38_Sub6 class38_sub6 = Projectile.method1167(i_42_, -123);
									boolean bool = true;
									if (class38_sub6.anInt1958 > 0)
										bool = client.method1229(-126, class38_sub6);
									if (bool) {
										client.secureBuffer.putOpcode(218);
										client.secureBuffer.putInt(i_42_);
										Class38_Sub20_Sub13.anInt3013++;
									}
								}
								if (i_43_ == 46 || i_43_ == 1005)
									Class38_Sub22.method721(i_44_, i_42_, Class37.aClass19Array865[i_40_], 211, i_41_);
								if (i_43_ == 48) {
									Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_44_];
									if (class38_sub20_sub3_sub7_sub2 != null) {
										client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub2.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub2.walkQueueY[0], 1, 2);
										client.crossState = 2;
										Class83.anInt1678++;
										Class21.anInt523 = Class73.anInt1429;
										Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
										client.crossIndex = 0;
										client.secureBuffer.putOpcode(193);
										client.secureBuffer.putShort(i_44_);
									}
								}
								if (i_43_ == 51) {
									client.secureBuffer.putOpcode(195);
									client.secureBuffer.method769(i_44_, 106);
									client.secureBuffer.method777(i_42_, (byte) 29);
									client.secureBuffer.putLEShortA(i_41_);
									client.redrawTimer = 0;
									client.atInventoryInterfaceType = Projectile.method1167(i_42_, -120);
									Class38_Sub20_Sub8.anInt2883 = i_41_;
								}
								if (i_43_ == 28) {
									NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_44_];
									if (class38_sub20_sub3_sub7_sub1 != null) {
										client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub1.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub1.walkQueueY[0], 1, 2);
										client.crossState = 2;
										Class21.anInt523 = Class73.anInt1429;
										Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
										client.crossIndex = 0;
										client.secureBuffer.putOpcode(45);
										client.secureBuffer.method767(-25680, i_44_);
									}
								}
								if (i_43_ == 30) {
									client.secureBuffer.putOpcode(130);
									client.secureBuffer.putShort(i_41_);
									client.secureBuffer.method747(i_42_, -2687);
									client.secureBuffer.method769(i_44_, 94);
									client.redrawTimer = 0;
									client.atInventoryInterfaceType = Projectile.method1167(i_42_, -126);
									Class38_Sub20_Sub8.anInt2883 = i_41_;
								}
								if (i_43_ == 57) {
									boolean bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 0, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 0, 2);
									if (!bool)
										bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 1, 2);
									Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
									client.crossState = 2;
									Class21.anInt523 = Class73.anInt1429;
									client.crossIndex = 0;
									client.secureBuffer.putOpcode(250);
									client.secureBuffer.method769(client.currentBaseY + i_41_, 63);
									client.secureBuffer.method769(i_44_, 95);
									client.secureBuffer.method769(client.currentBaseX + i_42_, 120);
								}
								if (i_43_ == 11) {
									Class14.method79(i_42_, (byte) 90, i_41_, i_44_);
									client.secureBuffer.putOpcode(144);
									client.secureBuffer.putLEShortA(client.currentBaseY + i_41_);
									client.secureBuffer.method767(-25680, client.currentBaseX + i_42_);
									client.secureBuffer.putShort(i_44_ >> 14 & 0x7fff);
								}
								if (i_43_ == 14) {
									NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_44_];
									if (class38_sub20_sub3_sub7_sub1 != null) {
										client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub1.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub1.walkQueueY[0], 1, 2);
										client.crossIndex = 0;
										Class21.anInt523 = Class73.anInt1429;
										Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
										client.crossState = 2;
										client.secureBuffer.putOpcode(6);
										client.secureBuffer.method769(i_44_, 85);
									}
								}
								if (i_43_ == 23) {
									Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_44_];
									if (class38_sub20_sub3_sub7_sub2 != null) {
										client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub2.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub2.walkQueueY[0], 1, 2);
										Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
										Class21.anInt523 = Class73.anInt1429;
										client.crossState = 2;
										client.crossIndex = 0;
										client.secureBuffer.putOpcode(158);
										client.secureBuffer.method769(i_44_, 93);
									}
								}
								if (i_43_ == 1004) {
									Class38_Sub6 class38_sub6 = Projectile.method1167(i_42_, 50);
									if (class38_sub6 != null && class38_sub6.anIntArray1866[i_41_] >= 100000)
										Class62.method464((byte) 98, Class9.method43(new RSString[] { RuntimeException_Sub1.method1098(class38_sub6.anIntArray1866[i_41_], 0), Class54.aClass19_1188, Node.forId(i_44_, 81).aClass19_2808 }, (byte) -20), 0, Class38_Sub22.aClass19_2312);
									else {
										Class42.anInt950++;
										client.secureBuffer.putOpcode(43);
										client.secureBuffer.putLEShortA(i_44_);
									}
									client.redrawTimer = 0;
									client.atInventoryInterfaceType = Projectile.method1167(i_42_, 120);
									Class38_Sub20_Sub8.anInt2883 = i_41_;
								}
								if (i_43_ == 5) {
									Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_44_];
									if (class38_sub20_sub3_sub7_sub2 != null) {
										client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub2.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub2.walkQueueY[0], 1, 2);
										client.crossState = 2;
										Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
										Class21.anInt523 = Class73.anInt1429;
										client.crossIndex = 0;
										client.secureBuffer.putOpcode(67);
										client.secureBuffer.method774(8, Class17_Sub1.anInt1713);
										client.secureBuffer.putLEShortA(Class38_Sub10_Sub3.anInt2837);
										client.secureBuffer.method767(-25680, i_44_);
										client.secureBuffer.putShort(Class58.anInt1286);
									}
								}
								if (i_43_ == 31) {
									boolean bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 0, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 0, 2);
									if (!bool)
										bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 1, 2);
									client.crossIndex = 0;
									client.crossState = 2;
									Class21.anInt523 = Class73.anInt1429;
									Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
									client.secureBuffer.putOpcode(137);
									client.secureBuffer.putShort(client.currentBaseY + i_41_);
									client.secureBuffer.method767(-25680, i_44_);
									client.secureBuffer.putShort(client.currentBaseX + i_42_);
								}
								if (i_43_ == 35) {
									client.secureBuffer.putOpcode(115);
									client.secureBuffer.putInt(i_42_);
									client.secureBuffer.method767(-25680, i_41_);
									client.secureBuffer.method769(i_44_, 69);
									client.redrawTimer = 0;
									client.atInventoryInterfaceType = Projectile.method1167(i_42_, 35);
									Class38_Sub20_Sub8.anInt2883 = i_41_;
								}
								if (i_43_ == 33) {
									boolean bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 0, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 0, 2);
									if (!bool)
										bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 1, 2);
									Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
									client.crossIndex = 0;
									Class21.anInt523 = Class73.anInt1429;
									client.crossState = 2;
									client.secureBuffer.putOpcode(122);
									client.secureBuffer.putShort(i_42_ + client.currentBaseX);
									client.secureBuffer.putLEShortA(i_41_ + client.currentBaseY);
									client.secureBuffer.method774(8, Class2_Sub1.anInt2008);
									client.secureBuffer.putShort(Node.anInt893);
									client.secureBuffer.method767(-25680, i_44_);
								}
								if (i_43_ == 47) {
									boolean bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 0, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 0, 2);
									if (!bool)
										bool = client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, i_41_, client.myPlayer.walkQueueX[0], 0, i_42_, 1, 2);
									client.crossIndex = 0;
									Class21.anInt523 = Class73.anInt1429;
									client.crossState = 2;
									Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
									client.secureBuffer.putOpcode(112);
									client.secureBuffer.putShort(i_42_ + client.currentBaseX);
									client.secureBuffer.putShort(i_44_);
									client.secureBuffer.putShort(i_41_ + client.currentBaseY);
								}
								if (i_43_ == 32) {
									Class14.method79(i_42_, (byte) 90, i_41_, i_44_);
									client.secureBuffer.putOpcode(170);
									client.secureBuffer.method767(-25680, i_42_ + client.currentBaseX);
									client.secureBuffer.putLEShortA((i_44_ & 0x1fffc39d) >> 14);
									client.secureBuffer.putLEShortA(i_41_ + client.currentBaseY);
								}
								if (i_43_ == 12) {
									NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_44_];
									if (class38_sub20_sub3_sub7_sub1 != null) {
										client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub1.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub1.walkQueueY[0], 1, 2);
										client.crossIndex = 0;
										Class21.anInt523 = Class73.anInt1429;
										client.crossState = 2;
										Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
										client.secureBuffer.putOpcode(253);
										client.secureBuffer.putShort(Node.anInt893);
										client.secureBuffer.method774(8, Class2_Sub1.anInt2008);
										client.secureBuffer.method769(i_44_, 76);
									}
								}
								if (i_43_ == 17) {
									client.secureBuffer.putOpcode(214);
									client.secureBuffer.method767(-25680, i_41_);
									client.secureBuffer.putInt(i_42_);
									client.secureBuffer.putShort(i_44_);
									client.redrawTimer = 0;
									client.atInventoryInterfaceType = Projectile.method1167(i_42_, 123);
									Class38_Sub20_Sub8.anInt2883 = i_41_;
								}
								if (i_43_ == 9) {
									NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_44_];
									if (class38_sub20_sub3_sub7_sub1 != null) {
										client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub1.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub1.walkQueueY[0], 1, 2);
										client.crossIndex = 0;
										Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
										Class21.anInt523 = Class73.anInt1429;
										client.crossState = 2;
										client.secureBuffer.putOpcode(149);
										client.secureBuffer.putShort(i_44_);
									}
								}
								if (i_43_ == 37) {
									Class14.method79(i_42_, (byte) 90, i_41_, i_44_);
									client.secureBuffer.putOpcode(229);
									client.secureBuffer.putShort(i_42_ + client.currentBaseX);
									client.secureBuffer.putShort(client.currentBaseY + i_41_);
									client.secureBuffer.putShort((i_44_ & 0x1ffff34a) >> 14);
								}
								if (Class42.anInt964 != 0) {
									Class42.anInt964 = 0;
									Class40.method340(Projectile.method1167(Class17_Sub1.anInt1713, -128), (byte) -103);
								}
								if (Class26.aBool614)
									Class11.method55(-8602);
								if (client.atInventoryInterfaceType == null || client.redrawTimer != 0)
									break;
								Class40.method340(client.atInventoryInterfaceType, (byte) -112);
							}
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "bf.F(" + i + ',' + i_40_ + ')');
			}
			break;
		} while (false);
	}

	static final int method417(boolean bool, int i, int i_63_) {
		try {
			if (bool)
				return -109;
			int i_64_ = Class82.method586(i + 91923, 4, i_63_ + 45365, 79) - 128 + (Class82.method586(i + 37821, 2, i_63_ + 10294, 80) - 128 >> 1) + (Class82.method586(i, 1, i_63_, 86) - 128 >> 2);
			i_64_ = (int) (i_64_ * 0.3) + 35;
			if (i_64_ >= 10) {
				if (i_64_ > 60)
					i_64_ = 60;
			} else
				i_64_ = 10;
			return i_64_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bf.D(" + bool + ',' + i + ',' + i_63_ + ')');
		}
	}

	final int method410(int i, int i_5_, byte[] is, int i_6_, boolean bool, byte[] is_7_) {
		try {
			if (i_6_ == 0)
				return 0;
			int i_8_ = 0;
			i_6_ += i;
			if (bool != true)
				Class53.anIntArray1172 = null;
			int i_9_ = i_5_;
			for (;;) {
				byte i_10_ = is_7_[i_9_];
				if (i_10_ < 0)
					i_8_ = anIntArray1178[i_8_];
				else
					i_8_++;
				int i_11_;
				if ((i_11_ = anIntArray1178[i_8_]) < 0) {
					is[i++] = (byte) (i_11_ ^ 0xffffffff);
					if (i_6_ <= i)
						break;
					i_8_ = 0;
				}
				if ((i_10_ & 0x40) == 0)
					i_8_++;
				else
					i_8_ = anIntArray1178[i_8_];
				if ((i_11_ = anIntArray1178[i_8_]) < 0) {
					is[i++] = (byte) (i_11_ ^ 0xffffffff);
					if (i_6_ <= i)
						break;
					i_8_ = 0;
				}
				if ((i_10_ & 0x20) == 0)
					i_8_++;
				else
					i_8_ = anIntArray1178[i_8_];
				if ((i_11_ = anIntArray1178[i_8_]) < 0) {
					is[i++] = (byte) (i_11_ ^ 0xffffffff);
					if (i_6_ <= i)
						break;
					i_8_ = 0;
				}
				if ((i_10_ & 0x10) == 0)
					i_8_++;
				else
					i_8_ = anIntArray1178[i_8_];
				if ((i_11_ = anIntArray1178[i_8_]) < 0) {
					is[i++] = (byte) (i_11_ ^ 0xffffffff);
					if (i >= i_6_)
						break;
					i_8_ = 0;
				}
				if ((i_10_ & 0x8) == 0)
					i_8_++;
				else
					i_8_ = anIntArray1178[i_8_];
				if ((i_11_ = anIntArray1178[i_8_]) < 0) {
					is[i++] = (byte) (i_11_ ^ 0xffffffff);
					if (i >= i_6_)
						break;
					i_8_ = 0;
				}
				if ((i_10_ & 0x4) == 0)
					i_8_++;
				else
					i_8_ = anIntArray1178[i_8_];
				if ((i_11_ = anIntArray1178[i_8_]) < 0) {
					is[i++] = (byte) (i_11_ ^ 0xffffffff);
					if (i_6_ <= i)
						break;
					i_8_ = 0;
				}
				if ((i_10_ & 0x2) != 0)
					i_8_ = anIntArray1178[i_8_];
				else
					i_8_++;
				if ((i_11_ = anIntArray1178[i_8_]) < 0) {
					is[i++] = (byte) (i_11_ ^ 0xffffffff);
					if (i_6_ <= i)
						break;
					i_8_ = 0;
				}
				if ((i_10_ & 0x1) != 0)
					i_8_ = anIntArray1178[i_8_];
				else
					i_8_++;
				if ((i_11_ = anIntArray1178[i_8_]) < 0) {
					is[i++] = (byte) (i_11_ ^ 0xffffffff);
					if (i >= i_6_)
						break;
					i_8_ = 0;
				}
				i_9_++;
			}
			return i_9_ + 1 - i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bf.B(" + i + ',' + i_5_ + ',' + (is != null ? "{...}" : "null") + ',' + i_6_ + ',' + bool + ',' + (is_7_ != null ? "{...}" : "null") + ')');
		}
	}

	final int method412(int i, int i_13_, int i_14_, byte[] is, byte[] is_15_, int i_16_) {
		try {
			if (i_16_ <= 77)
				anIntArray1178 = null;
			i_13_ += i;
			int i_17_ = 0;
			int i_18_ = i_14_ << 3;
			for (/**/; i_13_ > i; i++) {
				int i_19_ = is[i] & 0xff;
				int i_20_ = anIntArray1167[i_19_];
				int i_21_ = aByteArray1175[i_19_];
				if (i_21_ == 0)
					throw new RuntimeException("No codeword for data value " + i_19_);
				int i_22_ = i_18_ & 0x7;
				i_17_ &= -i_22_ >> 31;
				int i_23_ = i_18_ >> 3;
				i_18_ += i_21_;
				int i_24_ = i_23_ + (i_22_ + i_21_ - 1 >> 3);
				i_22_ += 24;
				is_15_[i_23_] = (byte) (i_17_ = Class38_Sub3.method618(i_17_, i_20_ >>> i_22_));
				if (i_24_ > i_23_) {
					i_23_++;
					i_22_ -= 8;
					is_15_[i_23_] = (byte) (i_17_ = i_20_ >>> i_22_);
					if (i_23_ < i_24_) {
						i_23_++;
						i_22_ -= 8;
						is_15_[i_23_] = (byte) (i_17_ = i_20_ >>> i_22_);
						if (i_23_ < i_24_) {
							i_23_++;
							i_22_ -= 8;
							is_15_[i_23_] = (byte) (i_17_ = i_20_ >>> i_22_);
							if (i_23_ < i_24_) {
								i_22_ -= 8;
								i_23_++;
								is_15_[i_23_] = (byte) (i_17_ = i_20_ << -i_22_);
							}
						}
					}
				}
			}
			return (i_18_ + 7 >> 3) - i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bf.H(" + i + ',' + i_13_ + ',' + i_14_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_15_ != null ? "{...}" : "null") + ',' + i_16_ + ')');
		}
	}
}
