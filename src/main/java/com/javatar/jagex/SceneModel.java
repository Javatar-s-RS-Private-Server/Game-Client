package com.javatar.jagex;/* SceneModel - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class SceneModel extends NodeSub {
	static int anInt2546 = 0;
	int height = 1000;
	static RSString aClass19_2549 = RSString.createRSString("da dieser Computer gegen unsere ");
	static int worldPort;
	static RSString aClass19_2552;
	static boolean aBool2553 = false;
	static RSString aClass19_2556;

	public static void method817(byte i) {
		try {
			SceneModel.aClass19_2556 = null;
			SceneModel.aClass19_2549 = null;
			if (i < -98)
				SceneModel.aClass19_2552 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "dd.OB(" + i + ')');
		}
	}

	void method818(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		do {
			try {
				Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = method820((byte) 109);
				if (class38_sub20_sub3_sub1 == null)
					break;
				this.height = ((SceneModel) class38_sub20_sub3_sub1).height;
				class38_sub20_sub3_sub1.method818(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "dd.PA(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')');
			}
			break;
		} while (false);
	}

	public SceneModel() {
		/* empty */
	}

	static final void method819(Class17 class17, int i) {
		try {
			if (i != 0)
				SceneModel.aClass19_2552 = null;
			Class38_Sub18.aClass17_2205 = class17;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "dd.NB(" + (class17 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Class38_Sub20_Sub3_Sub1 method820(byte i) {
		try {
			if (i != 109)
				SceneModel.aBool2553 = false;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "dd.E(" + i + ')');
		}
	}

	static final RSString method821(byte[] is, byte i, int i_8_, int i_9_) {
		try {
			if (i > -20)
				SceneModel.method817((byte) -123);
			RSString class19 = new RSString();
			class19.length = 0;
			class19.buffer = new byte[i_9_];
			for (int i_10_ = i_8_; i_10_ < i_8_ + i_9_; i_10_++)
				if (is[i_10_] != 0)
					class19.buffer[class19.length++] = is[i_10_];
			return class19;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "dd.HB(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_8_ + ',' + i_9_ + ')');
		}
	}

	static {
		SceneModel.aClass19_2552 = RSString.createRSString("m-Ochte sich mit Ihnen duellieren)3");
		SceneModel.aClass19_2556 = RSString.createRSString("null");
	}
}
