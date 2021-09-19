package com.javatar.jagex;/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62 {
	static int anInt1338;
	static Class38_Sub6[][] aClass38_Sub6ArrayArray1339;
	static Class17 aClass17_1342;
	static int anInt1344 = 0;
	static int[] anIntArray1345 = new int[2000];
	static RSString aClass19_1347;
	static RSString aClass19_1348 = RSString.createRSString("Titelbild geladen)3");

	static final void method461(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			int i_4_ = i;
			if (i_2_ == 5037)
				for (/**/; i_1_ + i >= i_4_; i_4_++)
					for (int i_5_ = i_0_; i_5_ <= i_3_ + i_0_; i_5_++)
						if (i_5_ >= 0 && i_5_ < 104 && i_4_ >= 0 && i_4_ < 104) {
							Class25.aByteArrayArrayArray583[0][i_5_][i_4_] = (byte) 127;
							if (i_0_ == i_5_ && i_5_ > 0)
								Player.anIntArrayArrayArray3566[0][i_5_][i_4_] = Player.anIntArrayArrayArray3566[0][i_5_ - 1][i_4_];
							if (i_5_ == i_0_ + i_3_ && i_5_ < 103)
								Player.anIntArrayArrayArray3566[0][i_5_][i_4_] = Player.anIntArrayArrayArray3566[0][i_5_ + 1][i_4_];
							if (i == i_4_ && i_4_ > 0)
								Player.anIntArrayArrayArray3566[0][i_5_][i_4_] = Player.anIntArrayArrayArray3566[0][i_5_][i_4_ - 1];
							if (i_4_ == i + i_1_ && i_4_ < 103)
								Player.anIntArrayArrayArray3566[0][i_5_][i_4_] = Player.anIntArrayArrayArray3566[0][i_5_][i_4_ + 1];
						}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lc.D(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')');
		}
	}

	static final boolean method462(int i, byte i_6_) {
		try {
			if (i_6_ <= 18)
				Class62.method465(34);
			if ((i < 97 || i > 122) && (i < 65 || i > 90))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lc.B(" + i + ',' + i_6_ + ')');
		}
	}

	static final void method463(byte i) {
		try {
			Class5.anIntArrayArrayArray116 = new int[4][105][105];
			PlayerAppearance.anIntArrayArray394 = new int[105][105];
			Class79.anIntArray1564 = new int[104];
			Class20.anIntArray503 = new int[104];
			Class25.aByteArrayArrayArray583 = new byte[4][105][105];
			Class38_Sub20_Sub3_Sub2.anIntArray3257 = new int[104];
			Class26.anInt618 = 99;
			Class38_Sub20_Sub10.anIntArray2905 = new int[104];
			Class74.aByteArrayArrayArray1470 = new byte[4][104][104];
			NPC.aByteArrayArrayArray3560 = new byte[4][104][104];
			Class38_Sub9.anIntArray2070 = new int[104];
			if (i > -50)
				Class62.anInt1338 = 4;
			Class48.aByteArrayArrayArray1078 = new byte[4][104][104];
			Class48.aByteArrayArrayArray1084 = new byte[4][104][104];
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lc.C(" + i + ')');
		}
	}

	static final void method464(byte i, RSString class19, int i_7_, RSString class19_8_) {
		try {
			if (i != 98)
				Class62.aClass17_1342 = null;
			Sequence.method914(class19_8_, true, i_7_, class19, null);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lc.E(" + i + ',' + (class19 != null ? "{...}" : "null") + ',' + i_7_ + ',' + (class19_8_ != null ? "{...}" : "null") + ')');
		}
	}

	public static void method465(int i) {
		try {
			Class62.aClass19_1347 = null;
			Class62.aClass19_1348 = null;
			Class62.aClass17_1342 = null;
			if (i != 1)
				Class62.aClass17_1342 = null;
			Class62.aClass38_Sub6ArrayArray1339 = null;
			Class62.anIntArray1345 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lc.A(" + i + ')');
		}
	}

	static {
		Class62.aClass19_1347 = RSString.createRSString("Fps:");
	}
}
