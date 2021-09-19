package com.javatar;/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class47 implements Runnable {
	static int[] anIntArray1041;
	static int[] anIntArray1044;
	static int anInt1046;
	static int anInt1048 = -1;
	static RSString aClass19_1050;
	static RSString aClass19_1052 = RSString.createRSString("mapback");
	static Class83 aClass83_1053;
	static Model[] aClass38_Sub20_Sub3_Sub3Array1054;
	static int[] anIntArray1055;
	static RSString aClass19_1056;
	static RSString aClass19_1058;
	static int anInt1059;
	static RSString aClass19_1060;
	static Class17 aClass17_1061;
	static int anInt1062;
	private static RSString aClass19_1045;

	static {
		Class47.anInt1046 = 0;
		Class47.anIntArray1041 = new int[25];
		Class47.aClass19_1050 = RSString.createRSString("<col=ffff00>");
		Class47.aClass38_Sub20_Sub3_Sub3Array1054 = new Model[4];
		Class47.aClass19_1045 = RSString.createRSString("glow2:");
		Class47.anIntArray1044 = new int[] { 1, 2, 4, 8 };
		Class47.aClass19_1056 = Class47.aClass19_1045;
		Class47.anIntArray1055 = new int[2048];
		Class47.anInt1059 = -1;
		Class47.aClass19_1060 = Class47.aClass19_1045;
		Class47.aClass19_1058 = RSString.createRSString("Lade Titelbild )2 ");
		Class47.aClass83_1053 = new Class83(30);
		Class47.anInt1062 = 0;
	}

	static final void method381() {
		do {
			try {
				if (!Client.heldKeys[98]) {
					if (Client.heldKeys[99])
						Class48.anInt1076 += (-12 - Class48.anInt1076) / 2;
					else
						Class48.anInt1076 /= 2;
				} else
					Class48.anInt1076 += (12 - Class48.anInt1076) / 2;
				Class38_Sub20_Sub11.anInt2958 += Class48.anInt1076 / 2;
				if (Class38_Sub20_Sub11.anInt2958 < 128)
					Class38_Sub20_Sub11.anInt2958 = 128;
				if (Class38_Sub20_Sub11.anInt2958 > 383)
					Class38_Sub20_Sub11.anInt2958 = 383;
				if (Client.heldKeys[96])
					Class38_Sub20_Sub2.anInt2532 += (-Class38_Sub20_Sub2.anInt2532 - 24) / 2;
				else if (!Client.heldKeys[97])
					Class38_Sub20_Sub2.anInt2532 /= 2;
				else
					Class38_Sub20_Sub2.anInt2532 += (-Class38_Sub20_Sub2.anInt2532 + 24) / 2;
				Class38_Sub20_Sub11.anInt2930 = Class38_Sub20_Sub11.anInt2930 + Class38_Sub20_Sub2.anInt2532 / 2 & 0x7ff;
				int i = Class38_Sub20_Sub11.anInt2943 + Client.myPlayer.anInt3493;
				int i_0_ = NodeSub.anInt2257 + Client.myPlayer.anInt3444;
				if (Class38_Sub20_Sub14.anInt3037 - i < -500 || -i + Class38_Sub20_Sub14.anInt3037 > 500 || Class38_Sub3.anInt1780 - i_0_ < -500 || Class38_Sub3.anInt1780 - i_0_ > 500) {
					Class38_Sub3.anInt1780 = i_0_;
					Class38_Sub20_Sub14.anInt3037 = i;
				}
				if (Class38_Sub20_Sub14.anInt3037 != i)
					Class38_Sub20_Sub14.anInt3037 += (i - Class38_Sub20_Sub14.anInt3037) / 16;
				if (i_0_ != Class38_Sub3.anInt1780)
					Class38_Sub3.anInt1780 += (-Class38_Sub3.anInt1780 + i_0_) / 16;
				int i_1_ = Class38_Sub20_Sub14.anInt3037 >> 7;
				int i_2_ = 0;
				int i_3_ = Class38_Sub3.anInt1780 >> 7;
				int i_4_ = Class35.method317(-5736, Client.height, Class38_Sub20_Sub14.anInt3037, Class38_Sub3.anInt1780);
				if (i_1_ > 3 && i_3_ > 3 && i_1_ < 100 && i_3_ < 100)
					for (int i_5_ = i_1_ - 4; i_5_ <= i_1_ + 4; i_5_++)
						for (int i_6_ = i_3_ - 4; i_6_ <= i_3_ + 4; i_6_++) {
							int i_7_ = Client.height;
							if (i_7_ < 3 && (Class82.aByteArrayArrayArray1648[1][i_5_][i_6_] & 0x2) == 2)
								i_7_++;
							int i_8_ = i_4_ - Player.anIntArrayArrayArray3566[i_7_][i_5_][i_6_];
							if (i_8_ > i_2_)
								i_2_ = i_8_;
						}
				int i_9_ = i_2_ * 192;
				if (i_9_ > 98048)
					i_9_ = 98048;
				if (i_9_ < 32768)
					i_9_ = 32768;
				if (i_9_ <= SceneModel.anInt2546) {
					if (SceneModel.anInt2546 > i_9_)
						SceneModel.anInt2546 += (i_9_ - SceneModel.anInt2546) / 80;
				} else
					SceneModel.anInt2546 += (-SceneModel.anInt2546 + i_9_) / 24;
				if (true)
					break;
				Class47.aClass17_1061 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "te.C(" + true + ')');
			}
			break;
		} while (false);
	}

	public static void method382(boolean bool) {
		try {
			Client.mouseRecorder = null;
			Class47.aClass19_1045 = null;
			Class47.anIntArray1055 = null;
			Class47.aClass19_1052 = null;
			if (!bool)
				Class47.method385(null, 73, null, -47);
			Class47.aClass19_1058 = null;
			Class47.aClass38_Sub20_Sub3_Sub3Array1054 = null;
			Class47.aClass83_1053 = null;
			Class47.aClass17_1061 = null;
			Class47.aClass19_1050 = null;
			Class47.aClass19_1060 = null;
			Class47.anIntArray1041 = null;
			Class47.aClass19_1056 = null;
			Class47.anIntArray1044 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "te.B(" + bool + ')');
		}
	}

	static final void method383(byte i) {
		try {
			if (i != 56)
				Class47.method383((byte) 77);
			for (Class38_Sub21 class38_sub21 = (Class38_Sub21) Class3.aClass13_71.method65(123); class38_sub21 != null; class38_sub21 = (Class38_Sub21) Class3.aClass13_71.method63(-3))
				if (class38_sub21.anInt2273 != -1)
					class38_sub21.method330(0);
				else {
					class38_sub21.anInt2274 = 0;
					Class80.method579(class38_sub21, (byte) -78);
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "te.E(" + i + ')');
		}
	}

	static final void method384(int i) {
		try {
			synchronized (Class38_Sub11.aClass10_2089) {
				Class23.anInt558 = Applet_Sub1.anInt3636;
				Class23.anInt543 = Class61.anInt1322;
				Class45.anInt1015 = Class17_Sub1.anInt1712;
				if (i != -18075)
					Class47.method384(121);
				Client.lastMouseAction = Class15.anInt277;
				Class73.anInt1429 = Class26.anInt613;
				RS2Buffer.anInt2416 = Class38_Sub10_Sub1.anInt2627;
				Client.lastClickTime = PlayerAppearance.aLong414;
				Class15.anInt277 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "te.D(" + i + ')');
		}
	}

	static final void method385(RSString class19, int i, Color color, int i_10_) {
		try {
			try {
				Graphics graphics = Class38_Sub3.aCanvas1783.getGraphics();
				if (RSString.aFont460 == null) {
					RSString.aFont460 = new Font("Helvetica", 1, 13);
					Class76.aFontMetrics1500 = Class38_Sub3.aCanvas1783.getFontMetrics(RSString.aFont460);
				}
				if (Class33.aBool781) {
					Class33.aBool781 = false;
					graphics.setColor(Color.black);
					graphics.fillRect(0, 0, Class38_Sub8.anInt2050, Class20.anInt501);
				}
				if (color == null)
					color = new Color(140, 17, 17);
				try {
					if (Class4.anImage85 == null)
						Class4.anImage85 = Class38_Sub3.aCanvas1783.createImage(304, 34);
					Graphics graphics_11_ = Class4.anImage85.getGraphics();
					graphics_11_.setColor(color);
					graphics_11_.drawRect(0, 0, 303, 33);
					graphics_11_.fillRect(2, 2, i_10_ * 3, 30);
					graphics_11_.setColor(Color.black);
					graphics_11_.drawRect(1, 1, 301, 31);
					graphics_11_.fillRect(i_10_ * 3 + 2, 2, -(i_10_ * 3) + i, 30);
					graphics_11_.setFont(RSString.aFont460);
					graphics_11_.setColor(Color.white);
					class19.method156((304 - class19.method155(0, Class76.aFontMetrics1500)) / 2, 22, i ^ 0x12c, graphics_11_);
					graphics.drawImage(Class4.anImage85, Class38_Sub8.anInt2050 / 2 - 152, Class20.anInt501 / 2 - 18, null);
				} catch (Exception exception) {
					int i_12_ = Class20.anInt501 / 2 - 18;
					int i_13_ = Class38_Sub8.anInt2050 / 2 - 152;
					graphics.setColor(color);
					graphics.drawRect(i_13_, i_12_, 303, 33);
					graphics.fillRect(i_13_ + 2, i_12_ + 2, i_10_ * 3, 30);
					graphics.setColor(Color.black);
					graphics.drawRect(i_13_ + 1, i_12_ + 1, 301, 31);
					graphics.fillRect(i_10_ * 3 + i_13_ + 2, i_12_ + 2, -(i_10_ * 3) + 300, 30);
					graphics.setFont(RSString.aFont460);
					graphics.setColor(Color.white);
					class19.method156(i_13_ + (304 - class19.method155(i - 300, Class76.aFontMetrics1500)) / 2, i_12_ + 22, i - 300, graphics);
				}
			} catch (Exception exception) {
				Class38_Sub3.aCanvas1783.repaint();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "te.A(" + (class19 != null ? "{...}" : "null") + ',' + i + ',' + (color != null ? "{...}" : "null") + ',' + i_10_ + ')');
		}
	}

	@Override
	public final void run() {
		try {
			try {
				for (;;) {
					Class38_Sub17 class38_sub17;
					synchronized (Class81.aClass13_1616) {
						class38_sub17 = (Class38_Sub17) Class81.aClass13_1616.method65(82);
					}
					if (class38_sub17 != null) {
						if (class38_sub17.anInt2185 != 0) {
							if (class38_sub17.anInt2185 == 1) {
								class38_sub17.aByteArray2191 = class38_sub17.aClass48_2187.method391((int) class38_sub17.aLong898);
								synchronized (Class81.aClass13_1616) {
									RuntimeException_Sub1.aClass13_3284.method68(class38_sub17, (byte) 104);
								}
							}
						} else {
							class38_sub17.aClass48_2187.method393((byte) -80, (int) class38_sub17.aLong898, class38_sub17.aByteArray2191.length, class38_sub17.aByteArray2191);
							synchronized (Class81.aClass13_1616) {
								class38_sub17.method330(0);
							}
						}
						synchronized (Class38_Sub14.anObject2126) {
							if (Node.anInt897 <= 1) {
								Node.anInt897 = 0;
								Class38_Sub14.anObject2126.notifyAll();
								break;
							}
							Node.anInt897 = 600;
						}
					} else {
						Canvas_Sub1.method809(100L, -27166);
						synchronized (Class38_Sub14.anObject2126) {
							if (Node.anInt897 <= 1) {
								Node.anInt897 = 0;
								Class38_Sub14.anObject2126.notifyAll();
								break;
							}
							Node.anInt897--;
						}
					}
				}
			} catch (Exception exception) {
				Class38_Sub20_Sub2.method813(exception, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "te.run(" + ')');
		}
	}
}
