package com.javatar.jagex;/* Class38_Sub20_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub7 extends NodeSub {
	static PacketBuffer aClass38_Sub23_Sub1_2843 = new PacketBuffer(5000);
	int anInt2848 = 0;
	static int anInt2851 = 0;
	static int anInt2852;
	static RSString aClass19_2853;

	final void method944(RS2Buffer class38_sub23, int i) {
		try {
			int i_0_ = -107 / ((-61 - i) / 34);
			for (;;) {
				int i_1_ = class38_sub23.readUnsignedByte();
				if (i_1_ == 0)
					break;
				method948(class38_sub23, 0, i_1_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "u.I(" + (class38_sub23 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method945(Class17 class17, byte i, Class17 class17_2_) {
		try {
			NodeSub.aClass17_2258 = class17_2_;
			Class38_Sub10_Sub1.aClass17_2646 = class17;
			if (i != 5)
				Class38_Sub20_Sub7.aClass19_2853 = null;
			Class41.anInt928 = NodeSub.aClass17_2258.getFileCount((byte) 53, 3);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "u.G(" + (class17 != null ? "{...}" : "null") + ',' + i + ',' + (class17_2_ != null ? "{...}" : "null") + ')');
		}
	}

	static final void method946(Class17 class17, int i) {
		try {
			Class17_Sub1.aClass17_1706 = class17;
			Class38_Sub20_Sub15.anInt3073 = Class17_Sub1.aClass17_1706.getFileCount((byte) 53, i);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "u.H(" + (class17 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method947(boolean bool) {
		do {
			try {
				Class38_Sub20_Sub7.aClass19_2853 = null;
				Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843 = null;
				if (!bool)
					break;
				Class38_Sub20_Sub7.aClass19_2853 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "u.F(" + bool + ')');
			}
			break;
		} while (false);
	}

	private final void method948(RS2Buffer class38_sub23, int i, int i_3_) {
		do {
			try {
				if (i == 0) {
					if (i_3_ != 2)
						break;
					this.anInt2848 = class38_sub23.readUnsignedShort();
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "u.E(" + (class38_sub23 != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ')');
			}
			break;
		} while (false);
	}

	public Class38_Sub20_Sub7() {
		/* empty */
	}

	static {
		Client.mouseIdleTime = 0;
		Class38_Sub20_Sub7.aClass19_2853 = RSString.createRSString("<col=ffffff>");
	}
}
