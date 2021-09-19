package com.javatar;/* Class38_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub8 extends Node {
	static RSString aClass19_2041 = RSString.createRSString("mapdots");
	static int[] anIntArray2043 = new int[128];
	static int[] anIntArray2045 = new int[100];
	static int anInt2050;
	static RSString aClass19_2051 = RSString.createRSString("und loggen sich dann erneut ein)3");
	int anInt2038;
	boolean aBool2042 = false;
	int anInt2049;

	public Class38_Sub8() {
		/* empty */
	}

	static final int method657(int i, int i_0_, int i_1_, byte[] is) {
		try {
			int i_2_ = -1;
			for (int i_3_ = i_0_; i > i_3_; i_3_++)
				i_2_ = i_2_ >>> 8 ^ PlayerAppearance.anIntArray415[(i_2_ ^ is[i_3_]) & 0xff];
			if (i_1_ != 25274)
				Class38_Sub8.method662(125);
			i_2_ ^= 0xffffffff;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ue.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	static final void method658(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			Class38_Sub21 class38_sub21 = null;
			for (Class38_Sub21 class38_sub21_13_ = (Class38_Sub21) Class3.aClass13_71.method65(81); class38_sub21_13_ != null; class38_sub21_13_ = (Class38_Sub21) Class3.aClass13_71.method63(-3))
				if (class38_sub21_13_.anInt2263 == i_9_ && i_5_ == class38_sub21_13_.anInt2267 && i == class38_sub21_13_.anInt2282 && class38_sub21_13_.anInt2260 == i_7_) {
					class38_sub21 = class38_sub21_13_;
					break;
				}
			if (class38_sub21 == null) {
				class38_sub21 = new Class38_Sub21();
				class38_sub21.anInt2282 = i;
				class38_sub21.anInt2260 = i_7_;
				class38_sub21.anInt2263 = i_9_;
				class38_sub21.anInt2267 = i_5_;
				Class80.method579(class38_sub21, (byte) -62);
				Class3.aClass13_71.method68(class38_sub21, (byte) 97);
			}
			class38_sub21.anInt2275 = i_8_;
			class38_sub21.anInt2276 = i_12_;
			class38_sub21.anInt2273 = i_10_;
			if (i_6_ > -54)
				Class38_Sub8.method662(-128);
			class38_sub21.anInt2274 = i_4_;
			class38_sub21.anInt2266 = i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ue.F(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')');
		}
	}

	static final void method659(Entity class38_sub20_sub3_sub7) {
		do {
			try {
				if ((byte) 120 < 107)
					Class38_Sub8.aClass19_2041 = null;
				class38_sub20_sub3_sub7.aBool3481 = false;
				if (class38_sub20_sub3_sub7.anInt3454 != -1) {
					Class38_Sub20_Sub4 class38_sub20_sub4 = Sequence.forID((byte) 94, class38_sub20_sub3_sub7.anInt3454);
					if (class38_sub20_sub4 == null || class38_sub20_sub4.anIntArray2585 == null)
						class38_sub20_sub3_sub7.anInt3454 = -1;
					else {
						class38_sub20_sub3_sub7.anInt3503++;
						if (class38_sub20_sub4.anIntArray2585.length > class38_sub20_sub3_sub7.anInt3474 && class38_sub20_sub3_sub7.anInt3503 > class38_sub20_sub4.anIntArray2568[class38_sub20_sub3_sub7.anInt3474]) {
							class38_sub20_sub3_sub7.anInt3474++;
							class38_sub20_sub3_sub7.anInt3503 = 1;
							Class54.method422(-44, class38_sub20_sub3_sub7.anInt3444, class38_sub20_sub3_sub7.anInt3493, class38_sub20_sub3_sub7.anInt3474, class38_sub20_sub4);
						}
						if (class38_sub20_sub4.anIntArray2585.length <= class38_sub20_sub3_sub7.anInt3474) {
							class38_sub20_sub3_sub7.anInt3503 = 0;
							class38_sub20_sub3_sub7.anInt3474 = 0;
							Class54.method422(-127, class38_sub20_sub3_sub7.anInt3444, class38_sub20_sub3_sub7.anInt3493, class38_sub20_sub3_sub7.anInt3474, class38_sub20_sub4);
						}
					}
				}
				if (class38_sub20_sub3_sub7.anInt3477 != -1 && Class45.anInt1016 >= class38_sub20_sub3_sub7.anInt3450) {
					if (class38_sub20_sub3_sub7.anInt3500 < 0)
						class38_sub20_sub3_sub7.anInt3500 = 0;
					int i_14_ = Class38_Sub11.method673(class38_sub20_sub3_sub7.anInt3477, -107).anInt2972;
					if (i_14_ == -1)
						class38_sub20_sub3_sub7.anInt3477 = -1;
					else {
						Class38_Sub20_Sub4 class38_sub20_sub4 = Sequence.forID((byte) 104, i_14_);
						if (class38_sub20_sub4 == null || class38_sub20_sub4.anIntArray2585 == null)
							class38_sub20_sub3_sub7.anInt3477 = -1;
						else {
							class38_sub20_sub3_sub7.anInt3447++;
							if (class38_sub20_sub4.anIntArray2585.length > class38_sub20_sub3_sub7.anInt3500 && class38_sub20_sub3_sub7.anInt3447 > class38_sub20_sub4.anIntArray2568[class38_sub20_sub3_sub7.anInt3500]) {
								class38_sub20_sub3_sub7.anInt3500++;
								class38_sub20_sub3_sub7.anInt3447 = 1;
								Class54.method422(87, class38_sub20_sub3_sub7.anInt3444, class38_sub20_sub3_sub7.anInt3493, class38_sub20_sub3_sub7.anInt3500, class38_sub20_sub4);
							}
							if (class38_sub20_sub3_sub7.anInt3500 >= class38_sub20_sub4.anIntArray2585.length && (class38_sub20_sub3_sub7.anInt3500 < 0 || class38_sub20_sub4.anIntArray2585.length <= class38_sub20_sub3_sub7.anInt3500))
								class38_sub20_sub3_sub7.anInt3477 = -1;
						}
					}
				}
				if (class38_sub20_sub3_sub7.currentAnimationId != -1 && class38_sub20_sub3_sub7.anInt3461 <= 1) {
					Class38_Sub20_Sub4 class38_sub20_sub4 = Sequence.forID((byte) 125, class38_sub20_sub3_sub7.currentAnimationId);
					if (class38_sub20_sub4.anInt2574 == 1 && class38_sub20_sub3_sub7.anInt3494 > 0 && Class45.anInt1016 >= class38_sub20_sub3_sub7.anInt3476 && Class45.anInt1016 > class38_sub20_sub3_sub7.anInt3470) {
						class38_sub20_sub3_sub7.anInt3461 = 1;
						break;
					}
				}
				if (class38_sub20_sub3_sub7.currentAnimationId != -1 && class38_sub20_sub3_sub7.anInt3461 == 0) {
					Class38_Sub20_Sub4 class38_sub20_sub4 = Sequence.forID((byte) 109, class38_sub20_sub3_sub7.currentAnimationId);
					if (class38_sub20_sub4 != null && class38_sub20_sub4.anIntArray2585 != null) {
						class38_sub20_sub3_sub7.anInt3483++;
						if (class38_sub20_sub4.anIntArray2585.length > class38_sub20_sub3_sub7.anInt3471 && class38_sub20_sub4.anIntArray2568[class38_sub20_sub3_sub7.anInt3471] < class38_sub20_sub3_sub7.anInt3483) {
							class38_sub20_sub3_sub7.anInt3471++;
							class38_sub20_sub3_sub7.anInt3483 = 1;
							Class54.method422(-30, class38_sub20_sub3_sub7.anInt3444, class38_sub20_sub3_sub7.anInt3493, class38_sub20_sub3_sub7.anInt3471, class38_sub20_sub4);
						}
						if (class38_sub20_sub3_sub7.anInt3471 >= class38_sub20_sub4.anIntArray2585.length) {
							class38_sub20_sub3_sub7.anInt3460++;
							class38_sub20_sub3_sub7.anInt3471 -= class38_sub20_sub4.anInt2578;
							if (class38_sub20_sub4.anInt2581 > class38_sub20_sub3_sub7.anInt3460) {
								if (class38_sub20_sub3_sub7.anInt3471 >= 0 && class38_sub20_sub4.anIntArray2585.length > class38_sub20_sub3_sub7.anInt3471)
									Class54.method422(-74, class38_sub20_sub3_sub7.anInt3444, class38_sub20_sub3_sub7.anInt3493, class38_sub20_sub3_sub7.anInt3471, class38_sub20_sub4);
								else
									class38_sub20_sub3_sub7.currentAnimationId = -1;
							} else
								class38_sub20_sub3_sub7.currentAnimationId = -1;
						}
						class38_sub20_sub3_sub7.aBool3481 = class38_sub20_sub4.aBool2563;
					} else
						class38_sub20_sub3_sub7.currentAnimationId = -1;
				}
				if (class38_sub20_sub3_sub7.anInt3461 <= 0)
					break;
				class38_sub20_sub3_sub7.anInt3461--;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ue.D(" + (byte) 120 + ',' + (class38_sub20_sub3_sub7 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static final void method660(int i) {
		try {
			SceneGraph.aBool651 = true;
			Class38_Sub4.aBool1811 = true;
			int i_15_ = 56 % ((12 - i) / 52);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ue.A(" + i + ')');
		}
	}

	static final Class38_Sub20_Sub9_Sub2[] method661() {
		try {
			Class38_Sub20_Sub9_Sub2[] class38_sub20_sub9_sub2s = new Class38_Sub20_Sub9_Sub2[Class38_Sub14.anInt2133];
			for (int i_16_ = 0; i_16_ < Class38_Sub14.anInt2133; i_16_++) {
				Class38_Sub20_Sub9_Sub2 class38_sub20_sub9_sub2 = class38_sub20_sub9_sub2s[i_16_] = new Class38_Sub20_Sub9_Sub2();
				class38_sub20_sub9_sub2.anInt3244 = Class16.anInt339;
				class38_sub20_sub9_sub2.anInt3243 = Projectile.anInt3426;
				class38_sub20_sub9_sub2.anInt3245 = Player.anIntArray3574[i_16_];
				class38_sub20_sub9_sub2.anInt3240 = Class51.anIntArray1130[i_16_];
				class38_sub20_sub9_sub2.anInt3242 = Class61.anIntArray1332[i_16_];
				class38_sub20_sub9_sub2.anInt3246 = Class38_Sub20_Sub8.anIntArray2873[i_16_];
				class38_sub20_sub9_sub2.anIntArray3241 = PlayerAppearance.anIntArray420;
				class38_sub20_sub9_sub2.aByteArray3239 = Class30.aByteArrayArray727[i_16_];
			}
			Player.method1207();
			return class38_sub20_sub9_sub2s;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ue.E(" + 0 + ')');
		}
	}

	public static void method662(int i) {
		try {
			Class38_Sub8.anIntArray2045 = null;
			Class38_Sub8.anIntArray2043 = null;
			Class38_Sub8.aClass19_2041 = null;
			if (i != 30079)
				Class38_Sub8.method660(-22);
			Class38_Sub8.aClass19_2051 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ue.C(" + i + ')');
		}
	}
}
