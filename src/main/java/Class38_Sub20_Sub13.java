/* Class38_Sub20_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub13 extends NodeSub {
	static RSString aClass19_3010 = RSString.createRSString("Versteckt");
	static int anInt3011;
	static int anInt3013;
	static int[] anIntArray3015 = new int[500];
	static boolean aBool3017;
	Animation[] aClass7Array3018;
	static RSString aClass19_3021 = RSString.createRSString("rot:");
	static Class38_Sub20_Sub9_Sub1_Sub1 aClass38_Sub20_Sub9_Sub1_Sub1_3023;
	static int[] anIntArray3024 = { 16, 32, 64, 128 };

	static final void updateRegion(int height, int regionX, int regionY, int localX, int localY, byte i_3_) {
		try {
			if (regionY != ItemDefinition.anInt2801 || regionX != Class38_Sub17.anInt2193 || Entity.anInt3489 != height && Class38_Sub4.aBool1811) {
				Entity.anInt3489 = height;
				if (!Class38_Sub4.aBool1811)
					Entity.anInt3489 = 0;
				ItemDefinition.anInt2801 = regionY;
				Class38_Sub17.anInt2193 = regionX;
				Canvas_Sub1.method808(0, 25);
				Class53.method409(Class2.aClass19_39, 16777215, true);
				int baseY = Client.currentBaseY;
				Client.currentBaseY = regionY * 8 - 48;
				int i_6_ = Client.currentBaseX;
				Client.currentBaseX = (regionX - 6) * 8;
				int i_7_ = -baseY + Client.currentBaseY;
				baseY = Client.currentBaseY;
				int i_8_ = -i_6_ + Client.currentBaseX;
				i_6_ = Client.currentBaseX;
				for (int i_9_ = 0; i_9_ < 32768; i_9_++) {
					NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_9_];
					if (class38_sub20_sub3_sub7_sub1 != null) {
						for (int i_10_ = 0; i_10_ < 10; i_10_++) {
							((Entity) class38_sub20_sub3_sub7_sub1).walkQueueX[i_10_] -= i_7_;
							((Entity) class38_sub20_sub3_sub7_sub1).walkQueueY[i_10_] -= i_8_;
						}
						((Entity) class38_sub20_sub3_sub7_sub1).anInt3493 -= i_7_ * 128;
						((Entity) class38_sub20_sub3_sub7_sub1).anInt3444 -= i_8_ * 128;
					}
				}
				for (int i_11_ = 0; i_11_ < 2048; i_11_++) {
					Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_11_];
					if (class38_sub20_sub3_sub7_sub2 != null) {
						for (int i_12_ = 0; i_12_ < 10; i_12_++) {
							((Entity) class38_sub20_sub3_sub7_sub2).walkQueueX[i_12_] -= i_7_;
							((Entity) class38_sub20_sub3_sub7_sub2).walkQueueY[i_12_] -= i_8_;
						}
						((Entity) class38_sub20_sub3_sub7_sub2).anInt3493 -= i_7_ * 128;
						((Entity) class38_sub20_sub3_sub7_sub2).anInt3444 -= i_8_ * 128;
					}
				}
				Client.height = height;
				Client.myPlayer.updatePosition(localX, localY, false);
				int i_13_ = 0;
				int i_14_ = 104;
				int i_15_ = 1;
				int i_16_ = 0;
				if (i_7_ < 0) {
					i_13_ = 103;
					i_15_ = -1;
					i_14_ = -1;
				}
				int i_17_ = 1;
				int i_18_ = 104;
				if (i_8_ < 0) {
					i_16_ = 103;
					i_18_ = -1;
					i_17_ = -1;
				}
				if (i_3_ >= -127)
					Class38_Sub20_Sub13.method995(66, 51);
				for (int i_19_ = i_13_; i_19_ != i_14_; i_19_ += i_15_)
					for (int i_20_ = i_16_; i_18_ != i_20_; i_20_ += i_17_) {
						int i_21_ = i_8_ + i_20_;
						int i_22_ = i_7_ + i_19_;
						for (int i_23_ = 0; i_23_ < 4; i_23_++)
							if (i_22_ >= 0 && i_21_ >= 0 && i_22_ < 104 && i_21_ < 104)
								Class38_Sub21.aClass13ArrayArrayArray2259[i_23_][i_19_][i_20_] = Class38_Sub21.aClass13ArrayArrayArray2259[i_23_][i_22_][i_21_];
							else
								Class38_Sub21.aClass13ArrayArrayArray2259[i_23_][i_19_][i_20_] = null;
					}
				for (Class38_Sub21 class38_sub21 = (Class38_Sub21) Class3.aClass13_71.method65(114); class38_sub21 != null; class38_sub21 = (Class38_Sub21) Class3.aClass13_71.method63(-3)) {
					class38_sub21.anInt2267 -= i_7_;
					class38_sub21.anInt2282 -= i_8_;
					if (class38_sub21.anInt2267 < 0 || class38_sub21.anInt2282 < 0 || class38_sub21.anInt2267 >= 104 || class38_sub21.anInt2282 >= 104)
						class38_sub21.method330(0);
				}
				if (Client.destX != 0) {
					Client.destX -= i_7_;
					Client.destY -= i_8_;
				}
				Class38_Sub21.aBool2280 = false;
				Class38_Sub20_Sub10.anInt2910 = 0;
				Class80.anInt1595 = -1;
				Class13.aClass13_235.method58((byte) -19);
				Class28.aClass13_686.method58((byte) -19);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "rc.H(" + height + ',' + localY + ',' + regionX + ',' + regionY + ',' + i_3_ + ',' + localX + ')');
		}
	}

	static final void method992(int i) {
		try {
			synchronized (Class38_Sub11.aClass60_2099) {
				Class33.anInt786 = Class38_Sub12.anInt2116;
				if (i != 103)
					Class38_Sub20_Sub13.method993(-64);
				if (Class53.anInt1165 < 0) {
					for (int i_24_ = 0; i_24_ < 112; i_24_++)
						Client.heldKeys[i_24_] = false;
					Class53.anInt1165 = Class77.anInt1519;
				} else
					while (Class77.anInt1519 != Class53.anInt1165) {
						int i_25_ = Class38_Sub20_Sub17.anIntArray3112[Class77.anInt1519];
						Class77.anInt1519 = Class77.anInt1519 + 1 & 0x7f;
						if (i_25_ >= 0)
							Client.heldKeys[i_25_] = true;
						else
							Client.heldKeys[i_25_ ^ 0xffffffff] = false;
					}
				Class38_Sub12.anInt2116 = ItemDefinition.anInt2775;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "rc.G(" + i + ')');
		}
	}

	public static void method993(int i) {
		try {
			Class38_Sub20_Sub13.anIntArray3015 = null;
			Class38_Sub20_Sub13.aClass19_3021 = null;
			Class38_Sub20_Sub13.anIntArray3024 = null;
			Class38_Sub20_Sub13.aClass19_3010 = null;
			Class38_Sub20_Sub13.aClass38_Sub20_Sub9_Sub1_Sub1_3023 = null;
			int i_26_ = -91 % ((i + 13) / 51);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "rc.F(" + i + ')');
		}
	}

	final boolean method994(int i, byte i_27_) {
		try {
			if (i_27_ < 123)
				Class38_Sub20_Sub13.updateRegion(57, -120, 116, -78, -46, (byte) 70);
			return this.aClass7Array3018[i].aBool135;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "rc.I(" + i + ',' + i_27_ + ')');
		}
	}

	static final int method995(int i, int i_28_) {
		try {
			i_28_ = (i_28_ & 0x55555555) + (i_28_ >>> 1596668577 & 0x55555555);
			i_28_ = ((i_28_ & ~0x33333332) >>> 896116130) + (i_28_ & 0x33333333);
			i_28_ = i_28_ + (i_28_ >>> -1970337916) & 0xf0f0f0f;
			if (i > -49)
				Class38_Sub20_Sub13.method993(-72);
			i_28_ += i_28_ >>> 1640558248;
			i_28_ += i_28_ >>> -895555728;
			return i_28_ & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "rc.E(" + i + ',' + i_28_ + ')');
		}
	}

	Class38_Sub20_Sub13(Class17 class17, Class17 class17_29_, int i, boolean bool) {
		try {
			Class13 class13 = new Class13();
			int i_30_ = class17.method103((byte) 53, i);
			this.aClass7Array3018 = new Animation[i_30_];
			int[] is = class17.method110(i, 20);
			for (int i_31_ = 0; i_31_ < is.length; i_31_++) {
				Class38_Sub14 class38_sub14 = null;
				byte[] is_32_ = class17.method109(i, is[i_31_], -104);
				int i_33_ = (is_32_[0] & 0xff) << -1913906968 | is_32_[1] & 0xff;
				for (Class38_Sub14 class38_sub14_34_ = (Class38_Sub14) class13.method65(105); class38_sub14_34_ != null; class38_sub14_34_ = (Class38_Sub14) class13.method63(-3))
					if (i_33_ == class38_sub14_34_.anInt2131) {
						class38_sub14 = class38_sub14_34_;
						break;
					}
				if (class38_sub14 == null) {
					byte[] is_35_;
					if (!bool)
						is_35_ = class17_29_.method120(0, 110, i_33_);
					else
						is_35_ = class17_29_.method120(i_33_, -73, 0);
					class38_sub14 = new Class38_Sub14(i_33_, is_35_);
					class13.method68(class38_sub14, (byte) 59);
				}
				this.aClass7Array3018[is[i_31_]] = new Animation(is_32_, class38_sub14);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "rc.<init>(" + (class17 != null ? "{...}" : "null") + ',' + (class17_29_ != null ? "{...}" : "null") + ',' + i + ',' + bool + ')');
		}
	}
}
