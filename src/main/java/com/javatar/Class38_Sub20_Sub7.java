package com.javatar;/* Class38_Sub20_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub7 extends NodeSub {
	static PacketBuffer aClass38_Sub23_Sub1_2843 = new PacketBuffer();
	static int anInt2851 = 0;
	static int anInt2852;
	static RSString aClass19_2853;

	static {
		client.mouseIdleTime = 0;
		Class38_Sub20_Sub7.aClass19_2853 = RSString.createRSString("<col=ffffff>");
	}

	int anInt2848 = 0;

	public Class38_Sub20_Sub7() {
		/* empty */
	}

	static final void method945(Class17 class17, Class17 class17_2_) {
		try {
			NodeSub.aClass17_2258 = class17_2_;
			Class38_Sub10_Sub1.aClass17_2646 = class17;
			if ((byte) 5 != 5)
				Class38_Sub20_Sub7.aClass19_2853 = null;
			Class41.anInt928 = NodeSub.aClass17_2258.method103(3);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "u.G(" + (class17 != null ? "{...}" : "null") + ',' + (byte) 5 + ',' + (class17_2_ != null ? "{...}" : "null") + ')');
		}
	}

	static final void method946(Class17 class17, int i) {
		try {
			Class17_Sub1.aClass17_1706 = class17;
			Class38_Sub20_Sub15.anInt3073 = Class17_Sub1.aClass17_1706.method103(i);
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

	final void method944(RS2Buffer class38_sub23) {
		try {
			int i_0_ = -107 / ((-61 - 110) / 34);
			for (; ; ) {
				int i_1_ = class38_sub23.getUByte();
				if (i_1_ == 0)
					break;
				method948(class38_sub23, i_1_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "u.I(" + (class38_sub23 != null ? "{...}" : "null") + ',' + 110 + ')');
		}
	}

	private void method948(RS2Buffer class38_sub23, int i_3_) {
		do {
			try {
				if (0 == 0) {
					if (i_3_ != 2)
						break;
					this.anInt2848 = class38_sub23.readUnsignedShortLE();
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "u.E(" + (class38_sub23 != null ? "{...}" : "null") + ',' + 0 + ',' + i_3_ + ')');
			}
			break;
		} while (false);
	}
}
