package com.javatar;/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class21 implements Runnable {
	static RSString aClass19_505;
	static byte[][] aByteArrayArray507;
	static volatile boolean aBool508 = true;
	static RSString aClass19_512;
	static RSString aClass19_513;
	static RSString aClass19_514;
	static int anInt517;
	static int[] anIntArray519 = new int[1000];
	static int anInt523;
	static boolean aBool524;
	static RSString aClass19_526;
	static int[] anIntArray528;
	private static RSString aClass19_515;
	private static RSString aClass19_520;

	static {
		Class21.aClass19_514 = RSString.createRSString(")4lang)4de");
		Class21.aClass19_520 = RSString.createRSString("flash1:");
		Class21.anInt523 = 0;
		Class21.aBool524 = false;
		Class21.anInt517 = 0;
		Class21.aClass19_512 = Class21.aClass19_520;
		Class21.aClass19_515 = RSString.createRSString(" seconds)3");
		Class21.aClass19_513 = Class21.aClass19_520;
		Class21.aClass19_505 = Class21.aClass19_515;
		Class21.aClass19_526 = RSString.createRSString(":clan:");
		Class21.anIntArray528 = new int[2000];
	}

	Class56 aClass56_509;
	volatile Class77[] aClass77Array511 = new Class77[2];
	volatile boolean aBool521;
	volatile boolean aBool525 = false;

	Class21() {
		this.aBool521 = false;
	}

	static final RSString method191(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = -i + i_1_;
			if (i_0_ != -3156)
				return null;
			if (i_2_ < -9)
				return Class5.aClass19_108;
			if (i_2_ < -6)
				return Class50.aClass19_1116;
			if (i_2_ < -3)
				return Class3.aClass19_65;
			if (i_2_ < 0)
				return Class38_Sub21.aClass19_2264;
			if (i_2_ > 9)
				return Class48.aClass19_1083;
			if (i_2_ > 6)
				return Class37.aClass19_876;
			if (i_2_ > 3)
				return Class80.aClass19_1590;
			if (i_2_ > 0)
				return Class78.aClass19_1560;
			return Class47.aClass19_1050;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "de.A(" + i + ',' + i_0_ + ',' + i_1_ + ')');
		}
	}

	public static void method192(byte i) {
		do {
			try {
				Class21.aClass19_513 = null;
				Class21.aClass19_520 = null;
				Class21.aClass19_514 = null;
				Class21.anIntArray519 = null;
				Class21.aByteArrayArray507 = null;
				Class21.aClass19_505 = null;
				Class21.aClass19_526 = null;
				Class21.aClass19_515 = null;
				Class21.anIntArray528 = null;
				Class21.aClass19_512 = null;
				if (i == -33)
					break;
				Class21.method193(-93, -51L);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "de.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method193(int i, long l) {
		try {
			if (l != 0L) {
				for (int i_3_ = 0; Class38_Sub20_Sub3_Sub2.anInt3250 > i_3_; i_3_++)
					if (l == Class5.aLongArray97[i_3_]) {
						Class38_Sub20_Sub3_Sub2.anInt3250--;
						for (int i_4_ = i_3_; i_4_ < Class38_Sub20_Sub3_Sub2.anInt3250; i_4_++) {
							Class5.aLongArray97[i_4_] = Class5.aLongArray97[i_4_ + 1];
							Class54.aClass19Array1206[i_4_] = Class54.aClass19Array1206[i_4_ + 1];
						}
						Class81.anInt1624 = Entity.anInt3513;
						client.secureBuffer.putOpcode(239);
						client.secureBuffer.writeLong(l);
						break;
					}
				int i_5_ = -88 % ((64 - i) / 52);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "de.D(" + i + ',' + l + ')');
		}
	}

	static final void method194(Class48 class48, int i, byte[] is) {
		try {
			if (-31194 != -31194)
				Class21.aByteArrayArray507 = null;
			Class38_Sub17 class38_sub17 = new Class38_Sub17();
			class38_sub17.aByteArray2191 = is;
			class38_sub17.aLong898 = i;
			class38_sub17.aClass48_2187 = class48;
			class38_sub17.anInt2185 = 0;
			synchronized (Class81.aClass13_1616) {
				Class81.aClass13_1616.method68(class38_sub17, (byte) 120);
			}
			NPC.method1201();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "de.B(" + (class48 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + -31194 + ')');
		}
	}

	@Override
	public final void run() {
		try {
			this.aBool521 = true;
			try {
				while (!this.aBool525) {
					for (int i = 0; i < 2; i++) {
						Class77 class77 = this.aClass77Array511[i];
						if (class77 != null)
							class77.method556();
					}
					Canvas_Sub1.method809(10L, -27166);
					Class37.method327(null, this.aClass56_509);
				}
			} catch (Exception exception) {
				Class38_Sub20_Sub2.method813(exception, null);
			} finally {
				this.aBool521 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "de.run(" + ')');
		}
	}
}
