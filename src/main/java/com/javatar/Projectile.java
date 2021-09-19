package com.javatar;/* Projectile - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Projectile extends SceneModel {
	static RSString aClass19_3397 = RSString.createRSString("(U");
	static RSString aClass19_3400;
	static RSString aClass19_3401;
	static RSString aClass19_3408;
	static RSString aClass19_3423;
	static int anInt3426;
	private static RSString aClass19_3411 = RSString.createRSString("yellow:");

	static {
		Projectile.aClass19_3408 = Projectile.aClass19_3411;
		Projectile.aClass19_3401 = RSString.createRSString("jolt");
		Projectile.aClass19_3400 = RSString.createRSString("");
		Projectile.aClass19_3423 = Projectile.aClass19_3411;
	}

	private final int anInt3392;
	private final int anInt3398;
	private final int anInt3406;
	private final int anInt3414;
	private final Class38_Sub20_Sub4 sequence;
	private final int anInt3427;
	private final int projectileHeight;
	int startTime;
	int graphicId;
	int anInt3409;
	double aDouble3410;
	double aDouble3412;
	double aDouble3413;
	int anInt3421;
	int anInt3424;
	int anInt3429;
	private double aDouble3394;
	private double aDouble3395;
	private int anInt3403;
	private boolean aBool3405 = false;
	private double aDouble3407;
	private int anInt3416;
	private double aDouble3417;
	private int anInt3418;
	private double aDouble3420;

	Projectile(int i, int graphicId, int projectileHeight, int x, int y,
			int startHeight, int i_34_, int speed, int i_36_, int i_37_,
			int startTime) {
		anInt3403 = 0;
		anInt3416 = 0;
		try {
			anInt3427 = i_36_;
			anInt3398 = x;
			this.graphicId = graphicId;
			anInt3392 = y;
			this.anInt3421 = i_37_;
			anInt3406 = speed;
			anInt3414 = i;
			this.anInt3424 = startHeight;
			this.anInt3409 = i_34_;
			aBool3405 = false;
			this.projectileHeight = projectileHeight;
			this.startTime = startTime;
			int animId = Class38_Sub11.method673(anInt3414, 126).anInt2972;
			if (animId != -1)
				sequence = Sequence.forID((byte) 97, animId);
			else
				sequence = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sc.<init>(" + i
					+ ',' + graphicId + ',' + projectileHeight + ',' + x + ','
					+ y + ',' + startHeight + ',' + i_34_ + ',' + speed + ','
					+ i_36_ + ',' + i_37_ + ',' + startTime + ')');
		}
	}

	static final void method1165(int i, Component component) {
		try {
			if (i == 0) {
				component.addMouseListener(Class38_Sub11.aClass10_2089);
				component.addMouseMotionListener(Class38_Sub11.aClass10_2089);
				component.addFocusListener(Class38_Sub11.aClass10_2089);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sc.K(" + i + ','
					+ (component != null ? "{...}" : "null") + ')');
		}
	}

	public static void method1166(byte i) {
		try {
			Projectile.aClass19_3423 = null;
			Projectile.aClass19_3408 = null;
			Projectile.aClass19_3411 = null;
			if (i != -11)
				Projectile.method1165(-54, null);
			Projectile.aClass19_3397 = null;
			Projectile.aClass19_3400 = null;
			Projectile.aClass19_3401 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sc.F(" + i + ')');
		}
	}

	static final Class38_Sub6 method1167(int i, int i_1_) {
		try {
			int i_2_ = -16 / ((i_1_ + 32) / 63);
			int i_3_ = i >> 16;
			int i_4_ = i & 0xffff;
			if (Class62.aClass38_Sub6ArrayArray1339[i_3_] == null
					|| Class62.aClass38_Sub6ArrayArray1339[i_3_][i_4_] == null) {
				boolean bool = Class22.method196(i_3_);
				if (!bool)
					return null;
			}
			return Class62.aClass38_Sub6ArrayArray1339[i_3_][i_4_];
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sc.G(" + i + ','
					+ i_1_ + ')');
		}
	}

	static final void method1168(int i, int i_5_, int i_6_, int i_7_, int i_8_,
								 int i_9_, int i_10_) {
		try {
			if (Class22.method196(i))
				Class25.method211(Class62.aClass38_Sub6ArrayArray1339[i],
						i_10_, i_5_, i_6_, i_9_, i_8_, i_7_, 0, -1);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sc.J(" + i + ','
					+ i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_
					+ ',' + i_10_ + ',' + 0 + ')');
		}
	}

	static final void initializePlayer(int i) {
		try {
			client.lastlastClickTime = 0L;
			client.awtFocused = true;
			Class38_Sub2.anInt1764 = 0;
			Class83.anInt1668 = 0;
			Class38_Sub20_Sub13.anInt3013 = 0;
			Class38_Sub2.anInt1761 = i;
			Class42.anInt950 = 0;
			Class38_Sub22.anInt2323 = 0;
			Class28.anInt689 = 0;
			Class77.anInt1518 = 0;
			Class38_Sub9.anInt2060 = 0;
			Class38_Sub11.anInt2084 = 0;
			Class78.anInt1545 = 0;
			Class83.anInt1678 = 0;
			Class59.anInt1296 = 0;
			client.coordCounter = 0;
			client.windowFocused = true;
			client.mouseRecorder.cacheIndex = 0;
			Class35.method314(i + 1007765799);
			Class15.anInt280 = -1;
			Class72.anInt1417 = 0;
			Class38_Sub20_Sub8.anInt2864 = -1;
			Class38_Sub20_Sub8.anInt2857 = 0;
			client.systemUpdateTime = 0;
			Class42.anInt962 = 0;
			client.secureBuffer.pos = 0;
			SceneModel.aBool2553 = false;
			client.logoutTimer = 0;
			Class15.inputStream.pos = 0;
			Class38_Sub19.anInt2233 = -1;
			Class23.packetId = -1;
			client.setMouseIdleTime(0);
			for (int i_12_ = 0; i_12_ < 100; i_12_++)
				Class38_Sub6.aClass19Array1945[i_12_] = null;
			NodeSub.anInt2257 = (int) (Math.random() * 110.0) - 55;
			Class4.anInt87 = 0;
			ItemDefinition.anInt2783 = 0;
			client.destX = 0;
			Class21.anInt517 = (int) (Math.random() * 120.0) - 60;
			Class55.anInt1212 = (int) (Math.random() * 80.0) - 40;
			Class38_Sub20_Sub11.anInt2943 = (int) (Math.random() * 100.0) - 50;
			Class80.anInt1595 = -1;
			Class38_Sub20_Sub10.anInt2910 = 0;
			Class42.anInt964 = 0;
			Class38_Sub20_Sub11.anInt2930 = (int) (Math.random() * 20.0) - 10 & 0x7ff;
			client.destY = 0;
			Class38_Sub20_Sub17.anInt3129 = 0;
			Class38_Sub7.anInt2027 = (int) (Math.random() * 30.0) - 20;
			Class26.aBool614 = false;
			Class38_Sub21.anInt2285 = 0;
			for (int i_13_ = 0; i_13_ < 2048; i_13_++) {
				Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_13_] = null;
				Class38_Sub20_Sub10.aClass38_Sub23Array2895[i_13_] = null;
			}
			for (int i_14_ = 0; i_14_ < 32768; i_14_++)
				Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_14_] = null;
			client.myPlayer = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[2047] = new Player();
			Class28.aClass13_686.method58();
			Class13.aClass13_235.method58();
			for (int i_15_ = 0; i_15_ < 4; i_15_++)
				for (int i_16_ = 0; i_16_ < 104; i_16_++)
					for (int i_17_ = 0; i_17_ < 104; i_17_++)
						Class38_Sub21.aClass13ArrayArrayArray2259[i_15_][i_16_][i_17_] = null;
			Class3.aClass13_71 = new Class13();
			Class81.anInt1618 = 0;
			Class38_Sub20_Sub15.anInt3068 = 0;
			for (int i_18_ = 0; i_18_ < Class38_Sub20_Sub15.anInt3073; i_18_++) {
				Class38_Sub20_Sub15 class38_sub20_sub15 = Class37.method326(
						i_18_);
				if (class38_sub20_sub15 != null
						&& class38_sub20_sub15.anInt3063 == 0) {
					Class53.anIntArray1172[i_18_] = 0;
					Class21.anIntArray528[i_18_] = 0;
				}
			}
			for (int i_19_ = 0; Class62.anIntArray1345.length > i_19_; i_19_++)
				Class62.anIntArray1345[i_19_] = -1;
			if (NodeSub.anInt2252 != -1)
				Class74.method533((byte) 117, NodeSub.anInt2252);
			for (Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190
					.method82((byte) 88); class38_sub8 != null; class38_sub8 = (Class38_Sub8) Class10.aClass14_190
					.method78(125))
				Class48.method388(true, (byte) -75, class38_sub8);
			NodeSub.anInt2252 = -1;
			Class10.aClass14_190 = new Class14(8);
			Class38_Sub2.aClass38_Sub6_1769 = null;
			Class72.anInt1417 = 0;
			SceneModel.aBool2553 = false;
			Class38_Sub20_Sub15.aClass18_3072.setAppearance(new int[5], -1,
					null, false, (byte) -103);
			for (int i_20_ = 0; i_20_ < 8; i_20_++) {
				Class38_Sub11.aClass19Array2094[i_20_] = null;
				Class17_Sub1.aBoolArray1717[i_20_] = false;
			}
			Class54.method423();
			Class28.aBool680 = true;
			for (int i_21_ = 0; i_21_ < 100; i_21_++)
				Class32.aBoolArray768[i_21_] = true;
			Class59.aClass19_1292 = null;
			Class15.anInt300 = 0;
			NPC.aClass38_Sub9Array3557 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sc.H(" + i + ')');
		}
	}

	final void update(int i) {
		do {
			try {
				this.aDouble3410 += aDouble3417 * i;
				if (-1 != -1)
					anInt3403 = -48;
				aBool3405 = true;
				this.aDouble3413 += aDouble3395 * 0.5 * i * i + aDouble3407 * i;
				aDouble3407 += i * aDouble3395;
				this.aDouble3412 += i * aDouble3394;
				this.anInt3429 = (int) (Math.atan2(aDouble3417, aDouble3394) * 325.949) + 1024 & 0x7ff;
				anInt3418 = (int) (Math.atan2(aDouble3407, aDouble3420) * 325.949) & 0x7ff;
				if (sequence == null)
					break;
				anInt3403 += i;
				while (anInt3403 > sequence.anIntArray2568[anInt3416]) {
					anInt3403 -= sequence.anIntArray2568[anInt3416];
					anInt3416++;
					if (anInt3416 >= sequence.anIntArray2585.length) {
						anInt3416 -= sequence.anInt2578;
						if (anInt3416 < 0
								|| sequence.anIntArray2585.length <= anInt3416)
							anInt3416 = 0;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "sc.I(" + i
						+ ',' + -1 + ')');
			}
			break;
		} while (false);
	}

	@Override
	final Class38_Sub20_Sub3_Sub1 method820() {
		try {
			if ((byte) 109 != 109)
				Projectile.initializePlayer(-56);
			Class38_Sub20_Sub11 class38_sub20_sub11 = Class38_Sub11.method673(
					anInt3414, -22);
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = class38_sub20_sub11
					.method984(121, anInt3416);
			if (class38_sub20_sub3_sub1 == null)
				return null;
			class38_sub20_sub3_sub1.method1041(anInt3418);
			return class38_sub20_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sc.E(" + (byte) 109 + ')');
		}
	}

	final void method1170(int i, int i_22_, byte i_23_, int i_24_, int i_25_) {
		try {
			if (!aBool3405) {
				double d = -projectileHeight + i_22_;
				double d_26_ = i - anInt3398;
				double d_27_ = Math.sqrt(d * d + d_26_ * d_26_);
				this.aDouble3410 = projectileHeight + d * anInt3427 / d_27_;
				this.aDouble3413 = anInt3392;
				this.aDouble3412 = anInt3398 + anInt3427 * d_26_ / d_27_;
			}
			double d = -i_24_ + this.anInt3409 + 1;
			aDouble3417 = (-this.aDouble3410 + i_22_) / d;
			aDouble3394 = (i - this.aDouble3412) / d;
			aDouble3420 = Math.sqrt(aDouble3417 * aDouble3417 + aDouble3394
					* aDouble3394);
			if (!aBool3405)
				aDouble3407 = -aDouble3420 * Math.tan(anInt3406 * 0.02454369);
			int i_28_ = -104 / ((i_23_ - 35) / 42);
			aDouble3395 = (-(d * aDouble3407) + (i_25_ - this.aDouble3413))
					* 2.0 / (d * d);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sc.L(" + i + ','
					+ i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')');
		}
	}
}
