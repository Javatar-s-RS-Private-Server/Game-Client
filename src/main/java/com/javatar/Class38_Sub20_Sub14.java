package com.javatar;/* Class38_Sub20_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub14 extends NodeSub {
	static byte[][] aByteArrayArray3032 = new byte[1000][];
	static RSString aClass19_3035;
	static boolean[] aBoolArray3036;
	static int anInt3037;
	static int anInt3039;
	static RSString aClass19_3044;
	private static RSString aClass19_3043;

	static {
		Class38_Sub20_Sub14.aClass19_3043 = RSString.createRSString("Prepared sound engine");
		Class38_Sub20_Sub14.aClass19_3044 = Class38_Sub20_Sub14.aClass19_3043;
		Class38_Sub20_Sub14.aBoolArray3036 = new boolean[100];
		Class38_Sub20_Sub14.aClass19_3035 = RSString.createRSString("gr-Un:");
	}

	int anInt3030;
	int anInt3033;
	int anInt3034 = 0;
	int anInt3040;
	int anInt3048;
	int anInt3050;
	int anInt3051;
	int anInt3053;
	int anInt3054;
	boolean aBool3056;

	public Class38_Sub20_Sub14() {
		this.anInt3030 = -1;
		this.anInt3054 = -1;
		this.aBool3056 = true;
	}

	static final void method997(Entity class38_sub20_sub3_sub7) {
		try {
			if (!false && class38_sub20_sub3_sub7.anInt3439 != 0) {
				if (class38_sub20_sub3_sub7.anInt3502 != -1 && class38_sub20_sub3_sub7.anInt3502 < 32768) {
					NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[class38_sub20_sub3_sub7.anInt3502];
					if (class38_sub20_sub3_sub7_sub1 != null) {
						int i = class38_sub20_sub3_sub7.anInt3493 - class38_sub20_sub3_sub7_sub1.anInt3493;
						int i_0_ = -class38_sub20_sub3_sub7_sub1.anInt3444 + class38_sub20_sub3_sub7.anInt3444;
						if (i != 0 || i_0_ != 0)
							class38_sub20_sub3_sub7.anInt3488 = (int) (Math.atan2(i, i_0_) * 325.949) & 0x7ff;
					}
				}
				if (class38_sub20_sub3_sub7.anInt3502 >= 32768) {
					int i = class38_sub20_sub3_sub7.anInt3502 - 32768;
					if (i == Class38_Sub9.anInt2067)
						i = 2047;
					Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i];
					if (class38_sub20_sub3_sub7_sub2 != null) {
						int i_1_ = -class38_sub20_sub3_sub7_sub2.anInt3444 + class38_sub20_sub3_sub7.anInt3444;
						int i_2_ = -class38_sub20_sub3_sub7_sub2.anInt3493 + class38_sub20_sub3_sub7.anInt3493;
						if (i_2_ != 0 || i_1_ != 0)
							class38_sub20_sub3_sub7.anInt3488 = (int) (Math.atan2(i_2_, i_1_) * 325.949) & 0x7ff;
					}
				}
				if ((class38_sub20_sub3_sub7.anInt3487 != 0 || class38_sub20_sub3_sub7.anInt3443 != 0) && (class38_sub20_sub3_sub7.walkQueueLocationIndex == 0 || class38_sub20_sub3_sub7.anInt3440 > 0)) {
					int i = class38_sub20_sub3_sub7.anInt3493 - (class38_sub20_sub3_sub7.anInt3487 - (client.currentBaseY + client.currentBaseY)) * 64;
					int i_3_ = -((-client.currentBaseX + class38_sub20_sub3_sub7.anInt3443 - client.currentBaseX) * 64) + class38_sub20_sub3_sub7.anInt3444;
					if (i != 0 || i_3_ != 0)
						class38_sub20_sub3_sub7.anInt3488 = (int) (Math.atan2(i, i_3_) * 325.949) & 0x7ff;
					class38_sub20_sub3_sub7.anInt3487 = 0;
					class38_sub20_sub3_sub7.anInt3443 = 0;
				}
				int i = class38_sub20_sub3_sub7.anInt3488 - class38_sub20_sub3_sub7.anInt3491 & 0x7ff;
				if (i != 0) {
					class38_sub20_sub3_sub7.anInt3498++;
					if (i <= 1024) {
						class38_sub20_sub3_sub7.anInt3491 += class38_sub20_sub3_sub7.anInt3439;
						boolean bool_4_ = true;
						if (class38_sub20_sub3_sub7.anInt3439 > i || -class38_sub20_sub3_sub7.anInt3439 + 2048 < i) {
							bool_4_ = false;
							class38_sub20_sub3_sub7.anInt3491 = class38_sub20_sub3_sub7.anInt3488;
						}
						if (class38_sub20_sub3_sub7.idleAnimation == class38_sub20_sub3_sub7.anInt3454 && (class38_sub20_sub3_sub7.anInt3498 > 25 || bool_4_))
							if (class38_sub20_sub3_sub7.anInt3462 != -1)
								class38_sub20_sub3_sub7.anInt3454 = class38_sub20_sub3_sub7.anInt3462;
							else
								class38_sub20_sub3_sub7.anInt3454 = class38_sub20_sub3_sub7.walkAnimation;
					} else {
						class38_sub20_sub3_sub7.anInt3491 -= class38_sub20_sub3_sub7.anInt3439;
						boolean bool_5_ = true;
						if (class38_sub20_sub3_sub7.anInt3439 > i || i > -class38_sub20_sub3_sub7.anInt3439 + 2048) {
							class38_sub20_sub3_sub7.anInt3491 = class38_sub20_sub3_sub7.anInt3488;
							bool_5_ = false;
						}
						if (class38_sub20_sub3_sub7.anInt3454 == class38_sub20_sub3_sub7.idleAnimation && (class38_sub20_sub3_sub7.anInt3498 > 25 || bool_5_))
							if (class38_sub20_sub3_sub7.turnAnimation == -1)
								class38_sub20_sub3_sub7.anInt3454 = class38_sub20_sub3_sub7.walkAnimation;
							else
								class38_sub20_sub3_sub7.anInt3454 = class38_sub20_sub3_sub7.turnAnimation;
					}
					class38_sub20_sub3_sub7.anInt3491 &= 0x7ff;
				} else
					class38_sub20_sub3_sub7.anInt3498 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ia.G(" + false + ',' + (class38_sub20_sub3_sub7 != null ? "{...}" : "null") + ')');
		}
	}

	static final Class38_Sub18 method1001(int i, Class17 class17) {
		try {
			if (0 != 0)
				return null;
			byte[] is = class17.method121(-120, i);
			if (is == null)
				return null;
			return new Class38_Sub18(is);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ia.J(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + 0 + ')');
		}
	}

	static final void method1002() {
		do {
			try {
				if (Class38_Sub4.aBool1811 && Entity.anInt3489 != client.height)
					Class38_Sub20_Sub13.updateRegion(client.height, Class38_Sub17.anInt2193, ItemDefinition.anInt2801, client.myPlayer.walkQueueX[0], client.myPlayer.walkQueueY[0], (byte) -128);
				else {
					if (client.height != Class80.anInt1595) {
						Class80.anInt1595 = client.height;
						Class81.method584(client.height);
					}
					if ((byte) -66 == -66)
						break;
					Class38_Sub20_Sub14.method1005(-95);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ia.E(" + (byte) -66 + ')');
			}
			break;
		} while (false);
	}

	static final void method1004(int i, int i_19_, int i_20_) {
		do {
			try {
				for (int i_22_ = 0; i_22_ < 8; i_22_++)
					for (int i_23_ = 0; i_23_ < 8; i_23_++)
						Player.anIntArrayArrayArray3566[i_20_][i + i_22_][i_23_ + i_19_] = 0;
				if ((byte) 77 <= 34)
					Class38_Sub20_Sub14.anInt3037 = 29;
				if (i > 0)
					for (int i_24_ = 1; i_24_ < 8; i_24_++)
						Player.anIntArrayArrayArray3566[i_20_][i][i_24_ + i_19_] = Player.anIntArrayArrayArray3566[i_20_][i - 1][i_19_ + i_24_];
				if (i_19_ > 0)
					for (int i_25_ = 1; i_25_ < 8; i_25_++)
						Player.anIntArrayArrayArray3566[i_20_][i_25_ + i][i_19_] = Player.anIntArrayArrayArray3566[i_20_][i_25_ + i][i_19_ - 1];
				if (i <= 0 || Player.anIntArrayArrayArray3566[i_20_][i - 1][i_19_] == 0) {
					if (i_19_ <= 0 || Player.anIntArrayArrayArray3566[i_20_][i][i_19_ - 1] == 0) {
						if (i > 0 && i_19_ > 0 && Player.anIntArrayArrayArray3566[i_20_][i - 1][i_19_ - 1] != 0)
							Player.anIntArrayArrayArray3566[i_20_][i][i_19_] = Player.anIntArrayArrayArray3566[i_20_][i - 1][i_19_ - 1];
					} else
						Player.anIntArrayArrayArray3566[i_20_][i][i_19_] = Player.anIntArrayArrayArray3566[i_20_][i][i_19_ - 1];
					break;
				}
				Player.anIntArrayArrayArray3566[i_20_][i][i_19_] = Player.anIntArrayArrayArray3566[i_20_][i - 1][i_19_];
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ia.K(" + i + ',' + i_19_ + ',' + i_20_ + ',' + (byte) 77 + ')');
			}
			break;
		} while (false);
	}

	public static void method1005(int i) {
		try {
			if (i <= -92) {
				Class38_Sub20_Sub14.aClass19_3044 = null;
				Class38_Sub20_Sub14.aClass19_3043 = null;
				Class38_Sub20_Sub14.aClass19_3035 = null;
				Class38_Sub20_Sub14.aBoolArray3036 = null;
				Class38_Sub20_Sub14.aByteArrayArray3032 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ia.F(" + i + ')');
		}
	}

	private void method998(RS2Buffer class38_sub23, int i, int i_7_) {
		try {
			if (i == 1)
				this.anInt3034 = class38_sub23.method738((byte) 95);
			else if (i != 2) {
				if (i != 5) {
					if (i == 7)
						this.anInt3030 = class38_sub23.method738((byte) 126);
				} else
					this.aBool3056 = false;
			} else
				this.anInt3054 = class38_sub23.getUByte();
			if (-1 != -1)
				method1000(-80, null, -37);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ia.H(" + (class38_sub23 != null ? "{...}" : "null") + ',' + i + ',' + -1 + ',' + i_7_ + ')');
		}
	}

	final void method999() {
		try {
			if (124 < 106)
				Class38_Sub20_Sub14.anInt3039 = -9;
			if (this.anInt3030 != -1) {
				method1003(this.anInt3030);
				this.anInt3040 = this.anInt3048;
				this.anInt3053 = this.anInt3050;
				this.anInt3033 = this.anInt3051;
			}
			method1003(this.anInt3034);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ia.I(" + 124 + ')');
		}
	}

	final void method1000(int i, RS2Buffer class38_sub23, int i_8_) {
		try {
			for (;;) {
				int i_9_ = class38_sub23.getUByte();
				if (i_9_ == 0)
					break;
				method998(class38_sub23, i_9_, i_8_);
			}
			if (i != -28563)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ia.L(" + i + ',' + (class38_sub23 != null ? "{...}" : "null") + ',' + i_8_ + ')');
		}
	}

	private void method1003(int i) {
		do {
			try {
				double d = ((i & 0xffd3) >> 8) / 256.0;
				double d_12_ = (i & 0xff) / 256.0;
				double d_13_ = 0.0;
				double d_14_ = ((i & 0xff6541) >> 16) / 256.0;
				double d_15_ = d_14_;
				double d_16_ = d_14_;
				if (d > d_16_)
					d_16_ = d;
				if (d_16_ < d_12_)
					d_16_ = d_12_;
				double d_17_ = 0.0;
				if (d < d_15_)
					d_15_ = d;
				if (d_15_ > d_12_)
					d_15_ = d_12_;
				double d_18_ = (d_15_ + d_16_) / 2.0;
				if (d_16_ != d_15_) {
					if (d_18_ < 0.5)
						d_17_ = (d_16_ - d_15_) / (d_16_ + d_15_);
					if (d_18_ >= 0.5)
						d_17_ = (-d_15_ + d_16_) / (2.0 - d_16_ - d_15_);
					if (d_14_ != d_16_) {
						if (d_16_ == d)
							d_13_ = (d_12_ - d_14_) / (d_16_ - d_15_) + 2.0;
						else if (d_16_ == d_12_)
							d_13_ = (d_14_ - d) / (-d_15_ + d_16_) + 4.0;
					} else
						d_13_ = (-d_12_ + d) / (d_16_ - d_15_);
				}
				d_13_ /= 6.0;
				this.anInt3050 = (int) (d_13_ * 256.0);
				this.anInt3051 = (int) (d_17_ * 256.0);
				this.anInt3048 = (int) (d_18_ * 256.0);
				if (this.anInt3051 >= 0) {
					if (this.anInt3051 > 255)
						this.anInt3051 = 255;
				} else
					this.anInt3051 = 0;
				if (3998 != 3998)
					this.anInt3054 = -104;
				if (this.anInt3048 < 0)
					this.anInt3048 = 0;
				else {
					if (this.anInt3048 <= 255)
						break;
					this.anInt3048 = 255;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ia.M(" + i + ',' + 3998 + ')');
			}
			break;
		} while (false);
	}
}
