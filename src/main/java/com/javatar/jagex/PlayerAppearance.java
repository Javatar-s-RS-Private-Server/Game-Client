package com.javatar.jagex;/* PlayerAppearance - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PlayerAppearance {
	private long equipmentHash;
	static int[][] anIntArrayArray394;
	static Class14 aClass14_397;
	private int[] equipmentIds;
	static RSString aClass19_399 = RSString.createRSString("hitmarks");
	private int[] colors;
	private int npcId;
	private long aLong405;
	boolean isFemale;
	static volatile long aLong414 = 0L;
	static int[] anIntArray415;
	static RSString aClass19_416;
	static int[] anIntArray418;
	static int[] anIntArray420;
	static RSString aClass19_421;

	final void method125(RS2Buffer stream, int i) {
		try {
			stream.writeByte(this.isFemale ? 1 : 0);
			int i_0_ = 0;
			if (i >= -83)
				colors = null;
			for (/**/; i_0_ < 7; i_0_++) {
				int i_1_ = equipmentIds[Class4.anIntArray90[i_0_]];
				if (i_1_ == 0)
					stream.writeByte(-1);
				else
					stream.writeByte(i_1_ - 256);
			}
			for (int i_2_ = 0; i_2_ < 5; i_2_++)
				stream.writeByte(colors[i_2_]);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "eb.C(" + (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method127(int i, boolean bool) {
		do {
			try {
				if (!this.isFemale == bool) {
					setAppearance(colors, -1, null, bool);
					if (i < -104)
						break;
					colors = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "eb.B(" + i + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	public static void method128(int i) {
		try {
			PlayerAppearance.anIntArray420 = null;
			PlayerAppearance.anIntArray418 = null;
			PlayerAppearance.aClass19_399 = null;
			PlayerAppearance.anIntArray415 = null;
			if (i == 0) {
				PlayerAppearance.aClass19_421 = null;
				PlayerAppearance.aClass14_397 = null;
				PlayerAppearance.anIntArrayArray394 = null;
				PlayerAppearance.aClass19_416 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "eb.H(" + i + ')');
		}
	}

	static final void method129(int i, int i_3_, int i_4_) {
		try {
			long l = (i_3_ << 16) + i_4_;
			int i_5_ = 36 / ((i + 3) / 35);
			Class38_Sub20_Sub2 class38_sub20_sub2 = (Class38_Sub20_Sub2) Class40.aClass14_914.method75(l);
			if (class38_sub20_sub2 != null)
				Class61.aClass26_1325.method214((byte) 83, class38_sub20_sub2);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "eb.E(" + i + ',' + i_3_ + ',' + i_4_ + ')');
		}
	}

	static final void method130(byte i, int i_6_, Entity class38_sub20_sub3_sub7) {
		try {
			int i_7_ = 116 % ((12 - i) / 49);
			if (class38_sub20_sub3_sub7.anInt3476 <= Class45.anInt1016) {
				if (class38_sub20_sub3_sub7.anInt3470 >= Class45.anInt1016)
					Class38_Sub10_Sub1.method852(class38_sub20_sub3_sub7, (byte) 49);
				else
					Class32.method296(class38_sub20_sub3_sub7, 0);
			} else
				Class29.method278(1, class38_sub20_sub3_sub7);
			if (class38_sub20_sub3_sub7.anInt3493 < 128 || class38_sub20_sub3_sub7.anInt3444 < 128 || class38_sub20_sub3_sub7.anInt3493 >= 13184 || class38_sub20_sub3_sub7.anInt3444 >= 13184) {
				class38_sub20_sub3_sub7.anInt3493 = class38_sub20_sub3_sub7.walkQueueX[0] * 128 + class38_sub20_sub3_sub7.anInt3457 * 64;
				class38_sub20_sub3_sub7.anInt3444 = class38_sub20_sub3_sub7.anInt3457 * 64 + class38_sub20_sub3_sub7.walkQueueY[0] * 128;
				class38_sub20_sub3_sub7.animationId = -1;
				class38_sub20_sub3_sub7.anInt3470 = 0;
				class38_sub20_sub3_sub7.anInt3477 = -1;
				class38_sub20_sub3_sub7.anInt3476 = 0;
				class38_sub20_sub3_sub7.resetWalkingQueue();
			}
			if (class38_sub20_sub3_sub7 == Client.myPlayer && (class38_sub20_sub3_sub7.anInt3493 < 1536 || class38_sub20_sub3_sub7.anInt3444 < 1536 || class38_sub20_sub3_sub7.anInt3493 >= 11776 || class38_sub20_sub3_sub7.anInt3444 >= 11776)) {
				class38_sub20_sub3_sub7.anInt3470 = 0;
				class38_sub20_sub3_sub7.anInt3493 = class38_sub20_sub3_sub7.walkQueueX[0] * 128 + class38_sub20_sub3_sub7.anInt3457 * 64;
				class38_sub20_sub3_sub7.anInt3477 = -1;
				class38_sub20_sub3_sub7.anInt3476 = 0;
				class38_sub20_sub3_sub7.anInt3444 = class38_sub20_sub3_sub7.anInt3457 * 64 + class38_sub20_sub3_sub7.walkQueueY[0] * 128;
				class38_sub20_sub3_sub7.animationId = -1;
				class38_sub20_sub3_sub7.resetWalkingQueue();
			}
			Class38_Sub20_Sub14.method997(false, class38_sub20_sub3_sub7);
			Class38_Sub8.method659((byte) 120, class38_sub20_sub3_sub7);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "eb.F(" + i + ',' + i_6_ + ',' + (class38_sub20_sub3_sub7 != null ? "{...}" : "null") + ')');
		}
	}

	private final void method131(int i) {
		do {
			try {
				if (i > -96)
					PlayerAppearance.aClass19_399 = null;
				long l = equipmentHash;
				equipmentHash = 0L;
				int i_8_ = equipmentIds[5];
				int i_9_ = equipmentIds[9];
				equipmentIds[9] = i_8_;
				equipmentIds[5] = i_9_;
				for (int i_10_ = 0; i_10_ < 12; i_10_++) {
					equipmentHash <<= 4;
					if (equipmentIds[i_10_] >= 256)
						equipmentHash += equipmentIds[i_10_] - 256;
				}
				if (equipmentIds[0] >= 256)
					equipmentHash += equipmentIds[0] - 256 >> 4;
				if (equipmentIds[1] >= 256)
					equipmentHash += equipmentIds[1] - 256 >> 8;
				for (int i_11_ = 0; i_11_ < 5; i_11_++) {
					equipmentHash <<= 3;
					equipmentHash += colors[i_11_];
				}
				equipmentHash <<= 1;
				PlayerAppearance playerAppearance = this;
				playerAppearance.equipmentHash = playerAppearance.equipmentHash + (!this.isFemale ? 0 : 1);
				equipmentIds[9] = i_9_;
				equipmentIds[5] = i_8_;
				if (l == 0L || equipmentHash == l)
					break;
				Class38_Sub11.aClass83_2105.method592(l);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "eb.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method132(int i_13_, boolean bool) {
		try {
			if (i_13_ != 1 || !this.isFemale) {
				int i_14_ = equipmentIds[Class4.anIntArray90[i_13_]];
				if (i_14_ != 0) {
					i_14_ -= 256;
					Class38_Sub20_Sub16 class38_sub20_sub16;
					do {
						if (!bool) {
							if (--i_14_ < 0)
								i_14_ = Class41.anInt928 - 1;
						} else {
							i_14_++;
							if (Class41.anInt928 <= i_14_)
								i_14_ = 0;
						}
						class38_sub20_sub16 = Class48.method387((byte) 98, i_14_);
					} while (class38_sub20_sub16 == null || class38_sub20_sub16.aBool3091 || (this.isFemale ? 7 : 0) + i_13_ != class38_sub20_sub16.anInt3102);
					equipmentIds[Class4.anIntArray90[i_13_]] = i_14_ + 256;
					method131(-97);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "eb.I(" + (byte) -59 + ',' + i_13_ + ',' + bool + ')');
		}
	}

	final Model method133(int i) {
		try {
			if (npcId != -1)
				return Class38_Sub20_Sub3_Sub4.method1156(-101, npcId).method910(-80);
			if (i != 23341)
				setAppearance(null, 78, null, true);
			boolean bool = false;
			for (int i_15_ = 0; i_15_ < 12; i_15_++) {
				int i_16_ = equipmentIds[i_15_];
				if (i_16_ >= 256 && i_16_ < 512 && !Class48.method387((byte) 98, i_16_ - 256).method1024((byte) 107))
					bool = true;
				if (i_16_ >= 512 && !Node.forId(i_16_ - 512, 108).dialogueModelsCached((byte) -114, this.isFemale))
					bool = true;
			}
			if (bool)
				return null;
			Model[] models = new Model[12];
			int i_17_ = 0;
			for (int i_18_ = 0; i_18_ < 12; i_18_++) {
				int i_19_ = equipmentIds[i_18_];
				if (i_19_ >= 256 && i_19_ < 512) {
					Model class38_sub20_sub3_sub3 = Class48.method387((byte) 98, i_19_ - 256).method1028(i ^ 0x5b2d);
					if (class38_sub20_sub3_sub3 != null)
						models[i_17_++] = class38_sub20_sub3_sub3;
				}
				if (i_19_ >= 512) {
					Model class38_sub20_sub3_sub3 = Node.forId(i_19_ - 512, 45).method928(this.isFemale);
					if (class38_sub20_sub3_sub3 != null)
						models[i_17_++] = class38_sub20_sub3_sub3;
				}
			}
			Model class38_sub20_sub3_sub3 = new Model(models, i_17_);
			for (int i_20_ = 0; i_20_ < 5; i_20_++) {
				if (Class45.characterColors[i_20_].length > colors[i_20_])
					class38_sub20_sub3_sub3.method1128(Class31.aShortArray747[i_20_], Class45.characterColors[i_20_][colors[i_20_]]);
				if (Class38_Sub20_Sub3_Sub2.aShortArrayArray3251[i_20_].length > colors[i_20_])
					class38_sub20_sub3_sub3.method1128(Class38_Sub10_Sub3.aShortArray2821[i_20_], Class38_Sub20_Sub3_Sub2.aShortArrayArray3251[i_20_][colors[i_20_]]);
			}
			return class38_sub20_sub3_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "eb.L(" + i + ')');
		}
	}

	final void method134(int i, boolean bool, int i_21_) {
		try {
			if (i != -1)
				equipmentIds = null;
			int i_22_ = colors[i_21_];
			if (bool) {
				if (++i_22_ >= Class45.characterColors[i_21_].length)
					i_22_ = 0;
			} else if (--i_22_ < 0)
				i_22_ = Class45.characterColors[i_21_].length - 1;
			colors[i_21_] = i_22_;
			method131(-120);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "eb.K(" + i + ',' + bool + ',' + i_21_ + ')');
		}
	}

	void setAppearance(int[] colors, int npcId, int[] equipmentIds, boolean isFemale) {
		try {
			if (equipmentIds == null) {
				equipmentIds = new int[12];
				for (int i_25_ = 0; i_25_ < 7; i_25_++)
					for (int i_26_ = 0; Class41.anInt928 > i_26_; i_26_++) {
						Class38_Sub20_Sub16 class38_sub20_sub16 = Class48.method387((byte) 98, i_26_);
						if (class38_sub20_sub16 != null && !class38_sub20_sub16.aBool3091 && i_25_ + (isFemale ? 7 : 0) == class38_sub20_sub16.anInt3102) {
							equipmentIds[Class4.anIntArray90[i_25_]] = i_26_ + 256;
							break;
						}
					}
			}
			this.npcId = npcId;
			this.equipmentIds = equipmentIds;
			this.colors = colors;
			this.isFemale = isFemale;
			method131(-116);
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class38_Sub1.method607(runtimeexception, "eb.M(" + (colors != null ? "{...}" : "null") + ',' + npcId + ',' + "{...}" + ',' + isFemale + ',' + ')');
		}
	}

	Class38_Sub20_Sub3_Sub1 method136(Class38_Sub20_Sub4 class38_sub20_sub4, int i, Class38_Sub20_Sub4 class38_sub20_sub4_28_, int i_29_, int i_30_) {
		try {
			if (npcId != -1)
				return Class38_Sub20_Sub3_Sub4.method1156(-90, npcId).method919(class38_sub20_sub4_28_, i_30_, class38_sub20_sub4, (byte) -38, i);
			if (i_29_ != -5774)
				method134(20, false, -19);
			long l = equipmentHash;
			int[] is = equipmentIds;
			if (class38_sub20_sub4 != null && (class38_sub20_sub4.anInt2582 >= 0 || class38_sub20_sub4.anInt2558 >= 0)) {
				is = new int[12];
				for (int i_31_ = 0; i_31_ < 12; i_31_++)
					is[i_31_] = equipmentIds[i_31_];
				if (class38_sub20_sub4.anInt2582 >= 0) {
					l += class38_sub20_sub4.anInt2582 - equipmentIds[5] << 8;
					is[5] = class38_sub20_sub4.anInt2582;
				}
				if (class38_sub20_sub4.anInt2558 >= 0) {
					l += -equipmentIds[3] + class38_sub20_sub4.anInt2558 << 16;
					is[3] = class38_sub20_sub4.anInt2558;
				}
			}
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = (Class38_Sub20_Sub3_Sub1) Class38_Sub11.aClass83_2105.method591(i_29_ - 23051, l);
			if (class38_sub20_sub3_sub1 == null) {
				boolean bool = false;
				for (int i_32_ = 0; i_32_ < 12; i_32_++) {
					int i_33_ = is[i_32_];
					if (i_33_ >= 256 && i_33_ < 512 && !Class48.method387((byte) 98, i_33_ - 256).method1021(125))
						bool = true;
					if (i_33_ >= 512 && !Node.forId(i_33_ - 512, 87).method934(this.isFemale, i_29_ ^ 0x7b08))
						bool = true;
				}
				if (bool) {
					if (aLong405 != -1L)
						class38_sub20_sub3_sub1 = (Class38_Sub20_Sub3_Sub1) Class38_Sub11.aClass83_2105.method591(-28825, aLong405);
					if (class38_sub20_sub3_sub1 == null)
						return null;
				}
				if (class38_sub20_sub3_sub1 == null) {
					Model[] class38_sub20_sub3_sub3s = new Model[12];
					int i_34_ = 0;
					for (int i_35_ = 0; i_35_ < 12; i_35_++) {
						int i_36_ = is[i_35_];
						if (i_36_ >= 256 && i_36_ < 512) {
							Model class38_sub20_sub3_sub3 = Class48.method387((byte) 98, i_36_ - 256).method1026((byte) -87);
							if (class38_sub20_sub3_sub3 != null)
								class38_sub20_sub3_sub3s[i_34_++] = class38_sub20_sub3_sub3;
						}
						if (i_36_ >= 512) {
							Model class38_sub20_sub3_sub3 = Node.forId(i_36_ - 512, i_29_ + 5836).method924(-19319, this.isFemale);
							if (class38_sub20_sub3_sub3 != null)
								class38_sub20_sub3_sub3s[i_34_++] = class38_sub20_sub3_sub3;
						}
					}
					Model class38_sub20_sub3_sub3 = new Model(class38_sub20_sub3_sub3s, i_34_);
					for (int i_37_ = 0; i_37_ < 5; i_37_++) {
						if (colors[i_37_] < Class45.characterColors[i_37_].length)
							class38_sub20_sub3_sub3.method1128(Class31.aShortArray747[i_37_], Class45.characterColors[i_37_][colors[i_37_]]);
						if (colors[i_37_] < Class38_Sub20_Sub3_Sub2.aShortArrayArray3251[i_37_].length)
							class38_sub20_sub3_sub3.method1128(Class38_Sub10_Sub3.aShortArray2821[i_37_], Class38_Sub20_Sub3_Sub2.aShortArrayArray3251[i_37_][colors[i_37_]]);
					}
					class38_sub20_sub3_sub1 = class38_sub20_sub3_sub3.method1142(64, 850, -30, -50, -30);
					Class38_Sub11.aClass83_2105.method590(l, (byte) -122, class38_sub20_sub3_sub1);
					aLong405 = l;
				}
			}
			if (class38_sub20_sub4 == null && class38_sub20_sub4_28_ == null)
				return class38_sub20_sub3_sub1;
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_38_;
			if (class38_sub20_sub4 != null && class38_sub20_sub4_28_ != null)
				class38_sub20_sub3_sub1_38_ = class38_sub20_sub4.method830(i, class38_sub20_sub4_28_, class38_sub20_sub3_sub1, i_29_ ^ ~0x168d, i_30_);
			else if (class38_sub20_sub4 == null)
				class38_sub20_sub3_sub1_38_ = class38_sub20_sub4_28_.method832(class38_sub20_sub3_sub1, i, 0);
			else
				class38_sub20_sub3_sub1_38_ = class38_sub20_sub4.method832(class38_sub20_sub3_sub1, i_30_, 0);
			return class38_sub20_sub3_sub1_38_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "eb.A(" + (class38_sub20_sub4 != null ? "{...}" : "null") + ',' + i + ',' + (class38_sub20_sub4_28_ != null ? "{...}" : "null") + ',' + i_29_ + ',' + i_30_ + ')');
		}
	}

	public PlayerAppearance() {
		/* empty */
	}

	final int method137(int i) {
		try {
			int i_39_ = 31 / ((i + 38) / 33);
			if (npcId == -1)
				return (equipmentIds[0] << 15) + (colors[0] << 25) + (colors[4] << 20) + (equipmentIds[8] << 10) - (-(equipmentIds[11] << 5) - equipmentIds[1]);
			return Class38_Sub20_Sub3_Sub4.method1156(-106, npcId).anInt2725 + 305419896;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "eb.J(" + i + ')');
		}
	}

	static {
		PlayerAppearance.aClass14_397 = new Class14(4096);
		PlayerAppearance.anIntArray415 = new int[256];
		PlayerAppearance.aClass19_416 = RSString.createRSString("RuneScape wird geladen )2 bitte warten)3)3)3");
		for (int i = 0; i < 256; i++) {
			int i_40_ = i;
			for (int i_41_ = 0; i_41_ < 8; i_41_++)
				if ((i_40_ & 0x1) == 1)
					i_40_ = ~0x12477cdf ^ i_40_ >>> 1;
				else
					i_40_ >>>= 1;
			PlayerAppearance.anIntArray415[i] = i_40_;
		}
		Client.destY = 0;
		PlayerAppearance.aClass19_421 = RSString.createRSString("Ladevorgang )2 bitte warten Sie)3");
		PlayerAppearance.anIntArray418 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	}
}
