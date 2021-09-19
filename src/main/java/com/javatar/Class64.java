package com.javatar;/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64 {
	static RSString aClass19_1354;
	static RSString aClass19_1355;
	static int[] anIntArray1356 = new int[100];
	static int anInt1358;
	static Class38_Sub20_Sub9_Sub2 aClass38_Sub20_Sub9_Sub2_1359;
	static int anInt1361;
	static RSString aClass19_1362;

	static {
		Class64.aClass19_1355 = RSString.createRSString(" steht bereits auf Ihrer Freunde)2Liste(Q");
		Class64.anInt1361 = 0;
		Class64.aClass19_1354 = RSString.createRSString("Musik)2Engine vorbereitet)3");
		Class64.aClass19_1362 = RSString.createRSString("::noclip");
	}

	public static void method472(int i) {
		try {
			Class64.aClass19_1355 = null;
			Class64.aClass19_1354 = null;
			Class64.aClass38_Sub20_Sub9_Sub2_1359 = null;
			Class64.anIntArray1356 = null;
			int i_0_ = -44 / ((61 - i) / 34);
			client.myPlayer = null;
			Class64.aClass19_1362 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ce.A(" + i + ')');
		}
	}

	static final int method473(int i, RSString class19) {
		try {
			if (Class64.anInt1361 == 1)
				return 7;
			if (class19.method165(Class59.aClass19_1294))
				return 1;
			if (class19.method165(Projectile.aClass19_3401))
				return 1;
			if (class19.method165(Class72.aClass19_1411))
				return 2;
			if (class19.method165(Class38_Sub20_Sub4.aClass19_2571))
				return 2;
			if (class19.method165(Class38_Sub11.aClass19_2106))
				return 3;
			if (class19.method165(Canvas_Sub1.aClass19_2518))
				return 4;
			if (class19.method165(Class82.aClass19_1646))
				return 4;
			if (i > -125)
				return -69;
			if (class19.method165(Class50.aClass19_1108))
				return 5;
			if (class19.method165(Class13.aClass19_233))
				return 6;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ce.C(" + i + ',' + (class19 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method474() {
		do {
			try {
				if (false)
					Class64.method473(40, null);
				for (int i = 0; Class38_Sub20_Sub10.anInt2910 > i; i++) {
					Class76.anIntArray1495[i]--;
					if (Class76.anIntArray1495[i] < -10) {
						Class38_Sub20_Sub10.anInt2910--;
						for (int i_1_ = i; i_1_ < Class38_Sub20_Sub10.anInt2910; i_1_++) {
							ObjectDefinition.anIntArray2442[i_1_] = ObjectDefinition.anIntArray2442[i_1_ + 1];
							Class38_Sub20_Sub16.aClass68Array3096[i_1_] = Class38_Sub20_Sub16.aClass68Array3096[i_1_ + 1];
							Class61.anIntArray1330[i_1_] = Class61.anIntArray1330[i_1_ + 1];
							Class76.anIntArray1495[i_1_] = Class76.anIntArray1495[i_1_ + 1];
							Class77.anIntArray1531[i_1_] = Class77.anIntArray1531[i_1_ + 1];
						}
						i--;
					} else {
						Class68 class68 = Class38_Sub20_Sub16.aClass68Array3096[i];
						if (class68 == null) {
							class68 = Class68.method484(Class33.soundEffects, ObjectDefinition.anIntArray2442[i], 0);
							if (class68 == null)
								continue;
							Class76.anIntArray1495[i] += class68.method481();
							Class38_Sub20_Sub16.aClass68Array3096[i] = class68;
						}
						if (Class76.anIntArray1495[i] < 0) {
							int i_2_;
							if (Class77.anIntArray1531[i] == 0)
								i_2_ = Player.anInt3565;
							else {
								int i_3_ = (Class77.anIntArray1531[i] & 0xff) * 128;
								int i_4_ = (Class77.anIntArray1531[i] & 0xffc8e2) >> 16;
								int i_5_ = i_4_ * 128 + 64 - client.myPlayer.anInt3493;
								if (i_5_ < 0)
									i_5_ = -i_5_;
								int i_6_ = Class77.anIntArray1531[i] >> 8 & 0xff;
								int i_7_ = -client.myPlayer.anInt3444 + i_6_ * 128 + 64;
								if (i_7_ < 0)
									i_7_ = -i_7_;
								int i_8_ = i_7_ + i_5_ - 128;
								if (i_3_ < i_8_) {
									Class76.anIntArray1495[i] = -100;
									continue;
								}
								if (i_8_ < 0)
									i_8_ = 0;
								i_2_ = Class77.anInt1505 * (-i_8_ + i_3_) / i_3_;
							}
							if (i_2_ > 0) {
								Class38_Sub16_Sub1 class38_sub16_sub1 = class68.method483().method996(Class38_Sub20_Sub12.aClass20_3008);
								Class38_Sub10_Sub2 class38_sub10_sub2 = Class38_Sub10_Sub2.method878(class38_sub16_sub1, i_2_);
								class38_sub10_sub2.method876(Class61.anIntArray1330[i] - 1);
								Class38_Sub9.aClass38_Sub10_Sub4_2057.method1019(class38_sub10_sub2);
							}
							Class76.anIntArray1495[i] = -100;
						}
					}
				}
				if (!Class76.aBool1490 || Class38_Sub7.method656(2330))
					break;
				if (Class15.anInt302 != 0 && Class38_Sub19.anInt2238 != -1)
					Class38_Sub4.method628(Class67.indexTrack1, -1, Class38_Sub19.anInt2238, Class15.anInt302, false, 0);
				Class76.aBool1490 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ce.B(" + false + ')');
			}
			break;
		} while (false);
	}
}
