package com.javatar.jagex;/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class Class10 implements MouseListener, MouseMotionListener, FocusListener {
	static RSString aClass19_175;
	private static RSString aClass19_180 = RSString.createRSString("Loaded input handler");
	static int anInt181;
	static RSString aClass19_182;
	private static RSString aClass19_183 = RSString.createRSString("Connection timed out)3");
	private static RSString aClass19_184;
	static int anInt185 = 3353893;
	static RSString aClass19_186;
	static RSString aClass19_187;
	static int anInt188 = 0;
	static RSString aClass19_189;
	static Class14 aClass14_190;
	static RSString aClass19_192;
	static RSString aClass19_193;
	static RSString[] aClass19Array194;

	@Override
	public final synchronized void mouseEntered(MouseEvent mouseevent) {
		try {
			if (Class38_Sub11.aClass10_2089 != null) {
				Client.mouseIdleTime = 0;
				Class61.anInt1322 = mouseevent.getX();
				Class17_Sub1.anInt1712 = mouseevent.getY();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pe.mouseEntered(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public final synchronized void mousePressed(MouseEvent mouseevent) {
		try {
			if (Class38_Sub11.aClass10_2089 != null) {
				Client.mouseIdleTime = 0;
				Class26.anInt613 = mouseevent.getX();
				Class38_Sub10_Sub1.anInt2627 = mouseevent.getY();
				PlayerAppearance.aLong414 = Class9.method48((byte) -45);
				if (mouseevent.isMetaDown()) {
					Class15.anInt277 = 2;
					Applet_Sub1.anInt3636 = 2;
				} else {
					Class15.anInt277 = 1;
					Applet_Sub1.anInt3636 = 1;
				}
			}
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pe.mousePressed(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public final synchronized void focusLost(FocusEvent focusevent) {
		do {
			try {
				if (Class38_Sub11.aClass10_2089 == null)
					break;
				Applet_Sub1.anInt3636 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "pe.focusLost(" + (focusevent != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	public static void method52(int i) {
		try {
			Class10.aClass19_186 = null;
			Class10.aClass19_182 = null;
			Class10.aClass19_189 = null;
			Class10.aClass14_190 = null;
			Class10.aClass19_192 = null;
			Class10.aClass19_183 = null;
			Class10.aClass19_193 = null;
			Class10.aClass19_180 = null;
			Class10.aClass19Array194 = null;
			Class10.aClass19_175 = null;
			if (i != 4)
				Class10.aClass19_193 = null;
			Class10.aClass19_187 = null;
			Class10.aClass19_184 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pe.B(" + i + ')');
		}
	}

	@Override
	public final void focusGained(FocusEvent focusevent) {
		/* empty */
	}

	@Override
	public final synchronized void mouseReleased(MouseEvent mouseevent) {
		try {
			if (Class38_Sub11.aClass10_2089 != null) {
				Client.mouseIdleTime = 0;
				Applet_Sub1.anInt3636 = 0;
			}
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pe.mouseReleased(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public final void mouseClicked(MouseEvent mouseevent) {
		try {
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pe.mouseClicked(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	static final void method53(SceneGraph class27, int i, int i_0_, int i_1_, int i_2_, Class74 class74, int i_3_, int i_4_, byte i_5_) {
		try {
			if (!Class38_Sub4.aBool1811 || (Class82.aByteArrayArrayArray1648[0][i_4_][i] & 0x2) != 0 || (Class82.aByteArrayArrayArray1648[i_3_][i_4_][i] & 0x10) == 0 && Class38_Sub20_Sub8.method949(i_3_, 115, i, i_4_) == Entity.anInt3489) {
				if (Class26.anInt618 > i_3_)
					Class26.anInt618 = i_3_;
				ObjectDefinition class38_sub20_sub1 = Class80.method581(i_5_ ^ 0x34, i_1_);
				if (i_5_ != -76)
					Class10.method53(null, -127, 79, -120, 18, null, 15, -120, (byte) 1);
				int i_6_;
				int i_7_;
				if (i_2_ == 1 || i_2_ == 3) {
					i_6_ = class38_sub20_sub1.anInt2480;
					i_7_ = class38_sub20_sub1.anInt2469;
				} else {
					i_6_ = class38_sub20_sub1.anInt2469;
					i_7_ = class38_sub20_sub1.anInt2480;
				}
				int i_8_;
				int i_9_;
				if (i_4_ + i_6_ > 104) {
					i_9_ = i_4_;
					i_8_ = i_4_ + 1;
				} else {
					i_8_ = (i_6_ + 1 >> -984274495) + i_4_;
					i_9_ = i_4_ + (i_6_ >> 122884193);
				}
				int i_10_;
				int i_11_;
				if (i_7_ + i <= 104) {
					i_10_ = (i_7_ + 1 >> 1196017761) + i;
					i_11_ = i + (i_7_ >> 950349441);
				} else {
					i_10_ = i + 1;
					i_11_ = i;
				}
				int[][] is = Player.anIntArrayArrayArray3566[i_3_];
				int i_12_ = (i_6_ << -1018336410) + (i_4_ << 129684935);
				int i_13_ = (i_7_ << -81726330) + (i << -1139798105);
				int i_14_ = (i_1_ << -1311253778) + (i << 868233799) + i_4_ + 1073741824;
				if (class38_sub20_sub1.anInt2440 == 0)
					i_14_ -= -2147483648;
				int i_15_ = is[i_8_][i_10_] + is[i_9_][i_10_] + is[i_9_][i_11_] + is[i_8_][i_11_] >> 1462985634;
				int i_16_ = i_0_ + (i_2_ << -375468378);
				if (class38_sub20_sub1.anInt2499 == 1)
					i_16_ += 256;
				if (class38_sub20_sub1.method794((byte) 126))
					Class49.method395(i_5_ ^ 0x48, i_2_, class38_sub20_sub1, i_3_, i_4_, i);
				if (i_0_ == 22) {
					if (!Class38_Sub4.aBool1811 || class38_sub20_sub1.anInt2440 != 0 || class38_sub20_sub1.anInt2482 == 1 || class38_sub20_sub1.aBool2451) {
						SceneModel class38_sub20_sub3;
						if (class38_sub20_sub1.anInt2472 != -1 || class38_sub20_sub1.anIntArray2498 != null)
							class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, 22, i_2_, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
						else
							class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_, is, i_12_, 22);
						class27.method241(i_3_, i_4_, i, i_15_, class38_sub20_sub3, i_14_, i_16_);
						if (class38_sub20_sub1.anInt2482 == 1 && class74 != null)
							class74.method538(i_4_, i, true);
					}
				} else if (i_0_ == 10 || i_0_ == 11) {
					SceneModel class38_sub20_sub3;
					if (class38_sub20_sub1.anInt2472 == -1 && class38_sub20_sub1.anIntArray2498 == null)
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_, is, i_12_, 10);
					else
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, 10, i_2_, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					if (class38_sub20_sub3 != null && class27.method254(i_3_, i_4_, i, i_15_, i_6_, i_7_, class38_sub20_sub3, i_0_ == 11 ? 256 : 0, i_14_, i_16_) && class38_sub20_sub1.aBool2500) {
						int i_17_ = 15;
						if (class38_sub20_sub3 instanceof Class38_Sub20_Sub3_Sub1) {
							i_17_ = ((Class38_Sub20_Sub3_Sub1) class38_sub20_sub3).method1055() / 4;
							if (i_17_ > 30)
								i_17_ = 30;
						}
						for (int i_18_ = 0; i_18_ <= i_6_; i_18_++)
							for (int i_19_ = 0; i_7_ >= i_19_; i_19_++)
								if (Class25.aByteArrayArrayArray583[i_3_][i_4_ + i_18_][i_19_ + i] < i_17_)
									Class25.aByteArrayArrayArray583[i_3_][i_18_ + i_4_][i + i_19_] = (byte) i_17_;
					}
					if (class38_sub20_sub1.anInt2482 != 0 && class74 != null)
						class74.method521(i_7_, class38_sub20_sub1.aBool2466, i_4_, i, i_6_, (byte) -73);
				} else if (i_0_ >= 12) {
					SceneModel class38_sub20_sub3;
					if (class38_sub20_sub1.anInt2472 == -1 && class38_sub20_sub1.anIntArray2498 == null)
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_, is, i_12_, i_0_);
					else
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, i_0_, i_2_, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					class27.method254(i_3_, i_4_, i, i_15_, 1, 1, class38_sub20_sub3, 0, i_14_, i_16_);
					if (i_0_ >= 12 && i_0_ <= 17 && i_0_ != 13 && i_3_ > 0)
						Class5.anIntArrayArrayArray116[i_3_][i_4_][i] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_][i], 2340);
					if (class38_sub20_sub1.anInt2482 != 0 && class74 != null)
						class74.method521(i_7_, class38_sub20_sub1.aBool2466, i_4_, i, i_6_, (byte) -73);
				} else if (i_0_ == 0) {
					SceneModel class38_sub20_sub3;
					if (class38_sub20_sub1.anInt2472 == -1 && class38_sub20_sub1.anIntArray2498 == null)
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_, is, i_12_, 0);
					else
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, 0, i_2_, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					class27.method220(i_3_, i_4_, i, i_15_, class38_sub20_sub3, null, Class47.anIntArray1044[i_2_], 0, i_14_, i_16_);
					if (i_2_ != 0) {
						if (i_2_ == 1) {
							if (class38_sub20_sub1.aBool2500) {
								Class25.aByteArrayArrayArray583[i_3_][i_4_][i + 1] = (byte) 50;
								Class25.aByteArrayArrayArray583[i_3_][i_4_ + 1][i + 1] = (byte) 50;
							}
							if (class38_sub20_sub1.aBool2457)
								Class5.anIntArrayArrayArray116[i_3_][i_4_][i + 1] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_][i + 1], 1170);
						} else if (i_2_ == 2) {
							if (class38_sub20_sub1.aBool2500) {
								Class25.aByteArrayArrayArray583[i_3_][i_4_ + 1][i] = (byte) 50;
								Class25.aByteArrayArrayArray583[i_3_][i_4_ + 1][i + 1] = (byte) 50;
							}
							if (class38_sub20_sub1.aBool2457)
								Class5.anIntArrayArrayArray116[i_3_][i_4_ + 1][i] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_ + 1][i], 585);
						} else if (i_2_ == 3) {
							if (class38_sub20_sub1.aBool2500) {
								Class25.aByteArrayArrayArray583[i_3_][i_4_][i] = (byte) 50;
								Class25.aByteArrayArrayArray583[i_3_][i_4_ + 1][i] = (byte) 50;
							}
							if (class38_sub20_sub1.aBool2457)
								Class5.anIntArrayArrayArray116[i_3_][i_4_][i] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_][i], 1170);
						}
					} else {
						if (class38_sub20_sub1.aBool2500) {
							Class25.aByteArrayArrayArray583[i_3_][i_4_][i] = (byte) 50;
							Class25.aByteArrayArrayArray583[i_3_][i_4_][i + 1] = (byte) 50;
						}
						if (class38_sub20_sub1.aBool2457)
							Class5.anIntArrayArrayArray116[i_3_][i_4_][i] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_][i], 585);
					}
					if (class38_sub20_sub1.anInt2482 != 0 && class74 != null)
						class74.method527(class38_sub20_sub1.aBool2466, i_0_, i_4_, true, i, i_2_);
					if (class38_sub20_sub1.anInt2492 != 16)
						class27.method255(i_3_, i_4_, i, class38_sub20_sub1.anInt2492);
				} else if (i_0_ == 1) {
					SceneModel class38_sub20_sub3;
					if (class38_sub20_sub1.anInt2472 == -1 && class38_sub20_sub1.anIntArray2498 == null)
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_, is, i_12_, 1);
					else
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, 1, i_2_, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					class27.method220(i_3_, i_4_, i, i_15_, class38_sub20_sub3, null, Class38_Sub20_Sub13.anIntArray3024[i_2_], 0, i_14_, i_16_);
					if (class38_sub20_sub1.aBool2500)
						if (i_2_ == 0)
							Class25.aByteArrayArrayArray583[i_3_][i_4_][i + 1] = (byte) 50;
						else if (i_2_ != 1) {
							if (i_2_ == 2)
								Class25.aByteArrayArrayArray583[i_3_][i_4_ + 1][i] = (byte) 50;
							else if (i_2_ == 3)
								Class25.aByteArrayArrayArray583[i_3_][i_4_][i] = (byte) 50;
						} else
							Class25.aByteArrayArrayArray583[i_3_][i_4_ + 1][i + 1] = (byte) 50;
					if (class38_sub20_sub1.anInt2482 != 0 && class74 != null)
						class74.method527(class38_sub20_sub1.aBool2466, i_0_, i_4_, true, i, i_2_);
				} else if (i_0_ == 2) {
					int i_20_ = i_2_ + 1 & 0x3;
					SceneModel class38_sub20_sub3;
					SceneModel class38_sub20_sub3_21_;
					if (class38_sub20_sub1.anInt2472 != -1 || class38_sub20_sub1.anIntArray2498 != null) {
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, 2, 4 + i_2_, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
						class38_sub20_sub3_21_ = new Class38_Sub20_Sub3_Sub2(i_1_, 2, i_20_, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					} else {
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_ + 4, is, i_12_, 2);
						class38_sub20_sub3_21_ = class38_sub20_sub1.method804(true, i_13_, i_15_, i_20_, is, i_12_, 2);
					}
					class27.method220(i_3_, i_4_, i, i_15_, class38_sub20_sub3, class38_sub20_sub3_21_, Class47.anIntArray1044[i_2_], Class47.anIntArray1044[i_20_], i_14_, i_16_);
					if (class38_sub20_sub1.aBool2457)
						if (i_2_ != 0) {
							if (i_2_ == 1) {
								Class5.anIntArrayArrayArray116[i_3_][i_4_][i + 1] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_][i + 1], 1170);
								Class5.anIntArrayArrayArray116[i_3_][i_4_ + 1][i] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_ + 1][i], 585);
							} else if (i_2_ != 2) {
								if (i_2_ == 3) {
									Class5.anIntArrayArrayArray116[i_3_][i_4_][i] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_][i], 1170);
									Class5.anIntArrayArrayArray116[i_3_][i_4_][i] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_][i], 585);
								}
							} else {
								Class5.anIntArrayArrayArray116[i_3_][i_4_ + 1][i] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_ + 1][i], 585);
								Class5.anIntArrayArrayArray116[i_3_][i_4_][i] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_][i], 1170);
							}
						} else {
							Class5.anIntArrayArrayArray116[i_3_][i_4_][i] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_][i], 585);
							Class5.anIntArrayArrayArray116[i_3_][i_4_][i + 1] = Class38_Sub3.method618(Class5.anIntArrayArrayArray116[i_3_][i_4_][i + 1], 1170);
						}
					if (class38_sub20_sub1.anInt2482 != 0 && class74 != null)
						class74.method527(class38_sub20_sub1.aBool2466, i_0_, i_4_, true, i, i_2_);
					if (class38_sub20_sub1.anInt2492 != 16)
						class27.method255(i_3_, i_4_, i, class38_sub20_sub1.anInt2492);
				} else if (i_0_ == 3) {
					SceneModel class38_sub20_sub3;
					if (class38_sub20_sub1.anInt2472 != -1 || class38_sub20_sub1.anIntArray2498 != null)
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, 3, i_2_, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					else
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_, is, i_12_, 3);
					class27.method220(i_3_, i_4_, i, i_15_, class38_sub20_sub3, null, Class38_Sub20_Sub13.anIntArray3024[i_2_], 0, i_14_, i_16_);
					if (class38_sub20_sub1.aBool2500)
						if (i_2_ == 0)
							Class25.aByteArrayArrayArray583[i_3_][i_4_][i + 1] = (byte) 50;
						else if (i_2_ == 1)
							Class25.aByteArrayArrayArray583[i_3_][i_4_ + 1][i + 1] = (byte) 50;
						else if (i_2_ != 2) {
							if (i_2_ == 3)
								Class25.aByteArrayArrayArray583[i_3_][i_4_][i] = (byte) 50;
						} else
							Class25.aByteArrayArrayArray583[i_3_][i_4_ + 1][i] = (byte) 50;
					if (class38_sub20_sub1.anInt2482 != 0 && class74 != null)
						class74.method527(class38_sub20_sub1.aBool2466, i_0_, i_4_, true, i, i_2_);
				} else if (i_0_ == 9) {
					SceneModel class38_sub20_sub3;
					if (class38_sub20_sub1.anInt2472 == -1 && class38_sub20_sub1.anIntArray2498 == null)
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_, is, i_12_, i_0_);
					else
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, i_0_, i_2_, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					class27.method254(i_3_, i_4_, i, i_15_, 1, 1, class38_sub20_sub3, 0, i_14_, i_16_);
					if (class38_sub20_sub1.anInt2482 != 0 && class74 != null)
						class74.method521(i_7_, class38_sub20_sub1.aBool2466, i_4_, i, i_6_, (byte) -73);
					if (class38_sub20_sub1.anInt2492 != 16)
						class27.method255(i_3_, i_4_, i, class38_sub20_sub1.anInt2492);
				} else if (i_0_ == 4) {
					SceneModel class38_sub20_sub3;
					if (class38_sub20_sub1.anInt2472 == -1 && class38_sub20_sub1.anIntArray2498 == null)
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_, is, i_12_, 4);
					else
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, 4, i_2_, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					class27.method261(i_3_, i_4_, i, i_15_, class38_sub20_sub3, null, Class47.anIntArray1044[i_2_], 0, 0, 0, i_14_, i_16_);
				} else if (i_0_ == 5) {
					int i_22_ = 16;
					int i_23_ = class27.method256(i_3_, i_4_, i);
					if (i_23_ != 0)
						i_22_ = Class80.method581(123, i_23_ >> 1822990926 & 0x7fff).anInt2492;
					SceneModel class38_sub20_sub3;
					if (class38_sub20_sub1.anInt2472 != -1 || class38_sub20_sub1.anIntArray2498 != null)
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, 4, i_2_, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					else
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_, is, i_12_, 4);
					class27.method261(i_3_, i_4_, i, i_15_, class38_sub20_sub3, null, Class47.anIntArray1044[i_2_], 0, i_22_ * Class58.anIntArray1282[i_2_], i_22_ * Class35.anIntArray810[i_2_], i_14_, i_16_);
				} else if (i_0_ == 6) {
					int i_24_ = 8;
					int i_25_ = class27.method256(i_3_, i_4_, i);
					if (i_25_ != 0)
						i_24_ = Class80.method581(i_5_ - 51, (i_25_ & 0x1fffc442) >> -1626163602).anInt2492 / 2;
					SceneModel class38_sub20_sub3;
					if (class38_sub20_sub1.anInt2472 == -1 && class38_sub20_sub1.anIntArray2498 == null)
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_ + 4, is, i_12_, 4);
					else
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, 4, i_2_ + 4, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					class27.method261(i_3_, i_4_, i, i_15_, class38_sub20_sub3, null, 256, i_2_, Class38_Sub20_Sub10.anIntArray2912[i_2_] * i_24_, i_24_ * Class38_Sub10_Sub3.anIntArray2826[i_2_], i_14_, i_16_);
				} else if (i_0_ == 7) {
					int i_26_ = i_2_ + 2 & 0x3;
					SceneModel class38_sub20_sub3;
					if (class38_sub20_sub1.anInt2472 != -1 || class38_sub20_sub1.anIntArray2498 != null)
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, 4, i_26_ + 4, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					else
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_26_ + 4, is, i_12_, 4);
					class27.method261(i_3_, i_4_, i, i_15_, class38_sub20_sub3, null, 256, i_26_, 0, 0, i_14_, i_16_);
				} else if (i_0_ == 8) {
					int i_27_ = 8;
					int i_28_ = class27.method256(i_3_, i_4_, i);
					if (i_28_ != 0)
						i_27_ = Class80.method581(118, i_28_ >> -1351731634 & 0x7fff).anInt2492 / 2;
					int i_29_ = i_2_ + 2 & 0x3;
					SceneModel class38_sub20_sub3;
					SceneModel class38_sub20_sub3_30_;
					if (class38_sub20_sub1.anInt2472 == -1 && class38_sub20_sub1.anIntArray2498 == null) {
						class38_sub20_sub3 = class38_sub20_sub1.method804(true, i_13_, i_15_, i_2_ + 4, is, i_12_, 4);
						class38_sub20_sub3_30_ = class38_sub20_sub1.method804(true, i_13_, i_15_, i_29_ + 4, is, i_12_, 4);
					} else {
						class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i_1_, 4, i_2_ + 4, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
						class38_sub20_sub3_30_ = new Class38_Sub20_Sub3_Sub2(i_1_, 4, i_29_ + 4, i_3_, i_4_, i, class38_sub20_sub1.anInt2472, true, null);
					}
					class27.method261(i_3_, i_4_, i, i_15_, class38_sub20_sub3, class38_sub20_sub3_30_, 256, i_2_, Class38_Sub20_Sub10.anIntArray2912[i_2_] * i_27_, i_27_ * Class38_Sub10_Sub3.anIntArray2826[i_2_], i_14_, i_16_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pe.C(" + (class27 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + (class74 != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')');
		}
	}

	public Class10() {
		/* empty */
	}

	@Override
	public final synchronized void mouseMoved(MouseEvent mouseevent) {
		try {
			if (Class38_Sub11.aClass10_2089 != null) {
				Client.mouseIdleTime = 0;
				Class61.anInt1322 = mouseevent.getX();
				Class17_Sub1.anInt1712 = mouseevent.getY();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pe.mouseMoved(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	static final void method54(int i, int i_31_) {
		try {
			if (Class22.loadWidget(i_31_)) {
				if (i > -120)
					Class10.method52(70);
				Class38_Sub20_Sub3_Sub2.method1092(-1, Class62.widgets[i_31_], 2047);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pe.A(" + i + ',' + i_31_ + ')');
		}
	}

	@Override
	public final synchronized void mouseDragged(MouseEvent mouseevent) {
		try {
			if (Class38_Sub11.aClass10_2089 != null) {
				Client.mouseIdleTime = 0;
				Class61.anInt1322 = mouseevent.getX();
				Class17_Sub1.anInt1712 = mouseevent.getY();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pe.mouseDragged(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public final synchronized void mouseExited(MouseEvent mouseevent) {
		try {
			if (Class38_Sub11.aClass10_2089 != null) {
				Client.mouseIdleTime = 0;
				Class61.anInt1322 = -1;
				Class17_Sub1.anInt1712 = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pe.mouseExited(" + (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	static {
		Class10.aClass19_184 = RSString.createRSString("Unexpected server response");
		Class10.aClass19_189 = Class10.aClass19_184;
		Class10.aClass19_186 = RSString.createRSString("welle:");
		Class10.aClass19_175 = Class10.aClass19_183;
		Class10.aClass19_187 = Class10.aClass19_180;
		Class10.aClass19_182 = RSString.createRSString(": ");
		Class10.aClass19_192 = RSString.createRSString("W-=hlen Sie eine Option");
		Class10.aClass14_190 = new Class14(8);
		Class10.aClass19Array194 = new RSString[500];
		Class10.aClass19_193 = RSString.createRSString("Unerwartete Antwort vom Anmelde)2Server");
	}
}
