package com.javatar;/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class6 {
	static RSString str_headicons_pk = RSString.createRSString("headicons_pk");
	static RSString aClass19_127 = RSString.createRSString("Mitglieder)2Welt");
	static Class38_Sub20_Sub9_Sub3 aClass38_Sub20_Sub9_Sub3_129;

	static {
		Client.wayPoints = new int[104][104];
	}

	public Class6() {
		/* empty */
	}

	static final int method33(int i, int i_0_, int i_1_, int i_2_) {
		try {
			if (i_1_ > 179)
				i_2_ /= 2;
			if (i_1_ > 192)
				i_2_ /= 2;
			if (i_1_ > 217)
				i_2_ /= 2;
			if (i_1_ > 243)
				i_2_ /= 2;
			return i_1_ / i + (i_2_ / 32 << 7) + (i_0_ / 4 << 10);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "oc.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')');
		}
	}

	public static void method34(int i) {
		do {
			try {
				Class6.str_headicons_pk = null;
				Class6.aClass38_Sub20_Sub9_Sub3_129 = null;
				Class6.aClass19_127 = null;
				Client.wayPoints = null;
				if (i == -193)
					break;
				Class6.str_headicons_pk = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "oc.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method35(Class38_Sub10 class38_sub10) {
		do {
			try {
				class38_sub10.aBool2077 = false;
				if (class38_sub10.aClass38_Sub16_2076 != null)
					class38_sub10.aClass38_Sub16_2076.anInt2183 = 0;
				for (Class38_Sub10 class38_sub10_4_ = class38_sub10.method670(); class38_sub10_4_ != null; class38_sub10_4_ = class38_sub10.method668())
					Class6.method35(class38_sub10_4_);
				if ((byte) -15 == -15)
					break;
				Class6.method34(-59);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "oc.A(" + (byte) -15 + ',' + (class38_sub10 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}
}
