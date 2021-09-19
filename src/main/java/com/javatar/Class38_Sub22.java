package com.javatar;/* Class38_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.event.KeyEvent;

final class Class38_Sub22 extends Node {
	static RSString aClass19_2310;
	static RSString aClass19_2312 = RSString.createRSString("");
	static RSString aClass19_2313;
	static boolean aBool2315 = false;
	static int anInt2323;
	static RSString aClass19_2327;
	static int[] anIntArray2333;
	static RSString aClass19_2335;
	private static RSString aClass19_2316;
	private static RSString aClass19_2339;

	static {
		Class38_Sub22.aClass19_2310 = Class38_Sub22.aClass19_2312;
		Class38_Sub22.aClass19_2316 = RSString
				.createRSString("Enter your username (V password)3");
		Class38_Sub22.aClass19_2313 = Class38_Sub22.aClass19_2316;
		Client.windowFocused = true;
		Class38_Sub22.aClass19_2339 = RSString
				.createRSString("The server is being updated)3");
		Class38_Sub22.anIntArray2333 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8,
				9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
				25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
				41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56,
				57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85,
				86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113,
				114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133,
				134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155,
				157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180,
				181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192,
				193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204,
				205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216,
				217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228,
				229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240,
				241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69,
				70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99,
				100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167,
				126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142,
				147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253,
				254, 170, 171, 172, 173, 178, 255, 179 };
		Class38_Sub22.aClass19_2335 = Class38_Sub22.aClass19_2339;
		Class38_Sub22.aClass19_2327 = RSString.createRSString(" ");
	}

	int anInt2311;
	Class38_Sub10_Sub2 aClass38_Sub10_Sub2_2314;
	int anInt2317;
	int anInt2318;
	int anInt2319;
	int anInt2320;
	int anInt2321;
	Class52 aClass52_2322;
	int anInt2325;
	int anInt2326;
	int anInt2328;
	int anInt2329;
	Class38_Sub18 aClass38_Sub18_2330;
	int anInt2331;
	int anInt2336;
	Class38_Sub16_Sub1 aClass38_Sub16_Sub1_2337;
	int anInt2340;
	int anInt2342;
	int anInt2343;
	int anInt2344;
	int anInt2345;

	public static void method719(boolean bool) {
		try {
			Class38_Sub22.aClass19_2327 = null;
			if (bool)
				Class38_Sub22.method722(null, null, (byte) -108, null);
			Class38_Sub22.aClass19_2313 = null;
			Class38_Sub22.aClass19_2335 = null;
			Class38_Sub22.anIntArray2333 = null;
			Class38_Sub22.aClass19_2310 = null;
			Class38_Sub22.aClass19_2312 = null;
			Class38_Sub22.aClass19_2316 = null;
			Class38_Sub22.aClass19_2339 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1
					.method607(runtimeexception, "la.C(" + bool + ')');
		}
	}

	static final void method721(int i, int i_1_, RSString class19, int i_2_,
			int i_3_) {
		do {
			try {
				Class38_Sub6 class38_sub6 = Class38_Sub20_Sub12.method987(i_3_,
						i_1_);
				if (class38_sub6 != null) {
					if (class38_sub6.anObjectArray1907 != null) {
						Class38_Sub19 class38_sub19 = new Class38_Sub19();
						class38_sub19.aClass38_Sub6_2241 = class38_sub6;
						class38_sub19.aClass19_2235 = class19;
						class38_sub19.anInt2237 = i;
						class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1907;
						Class15.method84(class38_sub19, (byte) -67);
					}
					boolean bool = true;
					if (class38_sub6.anInt1958 > 0)
						bool = Client.method1229(i_2_ - 337, class38_sub6);
					if (bool
							&& NodeSub.method708(i_2_ ^ i_2_,
									Class30.method283(-125, class38_sub6),
									i - 1)) {
						if (i == 1) {
							Client.secureBuffer.putOpcode(221); // ok here's the
							// packet id
							Client.secureBuffer.putInt(i_1_); // int = 4 bytes
							Client.secureBuffer.putShort(i_3_); // short = 2
							// bytes
							// byte = 1
							// short = 2
							// int = 4
							// long = 8
							// tri-byte = 3
							// 4 + 2 = 6, so the packet's size is 6, now go to
							// server
						}
						if (i == 2) {
							Client.secureBuffer.putOpcode(108);
							Client.secureBuffer.putInt(i_1_);
							Client.secureBuffer.putShort(i_3_);
						}
						if (i == 3) {
							Client.secureBuffer.putOpcode(181);
							Client.secureBuffer.putInt(i_1_);
							Client.secureBuffer.putShort(i_3_);
						}
						if (i == 4) {
							Client.secureBuffer.putOpcode(143);
							Client.secureBuffer.putInt(i_1_);
							Client.secureBuffer.putShort(i_3_);
						}
						if (i == 5) {
							Client.secureBuffer.putOpcode(167);
							Client.secureBuffer.putInt(i_1_);
							Client.secureBuffer.putShort(i_3_);
						}
						if (i == 6) {
							Client.secureBuffer.putOpcode(175);
							Client.secureBuffer.putInt(i_1_);
							Client.secureBuffer.putShort(i_3_);
						}
						if (i == 7) {
							Client.secureBuffer.putOpcode(162);
							Client.secureBuffer.putInt(i_1_);
							Client.secureBuffer.putShort(i_3_);
						}
						if (i == 8) {
							Client.secureBuffer.putOpcode(98);
							Client.secureBuffer.putInt(i_1_);
							Client.secureBuffer.putShort(i_3_);
						}
						if (i == 9) {
							Client.secureBuffer.putOpcode(103);
							Client.secureBuffer.putInt(i_1_);
							Client.secureBuffer.putShort(i_3_);
						}
						if (i != 10)
							break;
						Client.secureBuffer.putOpcode(150);
						Client.secureBuffer.putInt(i_1_);
						Client.secureBuffer.putShort(i_3_);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "la.A(" + i
						+ ',' + i_1_ + ','
						+ (class19 != null ? "{...}" : "null") + ',' + i_2_
						+ ',' + i_3_ + ')');
			}
			break;
		} while (false);
	}

	static final void method722(Class17 class17, Class17 class17_4_, byte i,
			Class17 class17_5_) {
		do {
			try {
				Class62.aClass17_1342 = class17_4_;
				Class82.aClass17_1643 = class17_5_;
				Class47.aClass17_1061 = class17;
				if (i == -85)
					break;
				Class38_Sub22.aClass19_2310 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "la.B("
						+ (class17 != null ? "{...}" : "null") + ','
						+ (class17_4_ != null ? "{...}" : "null") + ',' + i
						+ ',' + (class17_5_ != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static final int method723(KeyEvent keyevent) {
		try {
			if ((byte) -57 != -57)
				Class38_Sub22.method721(-52, -114, null, 0, -27);
			int i_6_ = keyevent.getKeyChar();
			if (i_6_ == 8364)
				return 128;
			if (i_6_ <= 0 || i_6_ >= 256)
				i_6_ = -1;
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "la.D(" + (byte) -57 + ','
					+ (keyevent != null ? "{...}" : "null") + ')');
		}
	}

	final void method720(int i) {
		try {
			this.aClass38_Sub18_2330 = null;
			this.aClass38_Sub10_Sub2_2314 = null;
			this.aClass52_2322 = null;
			this.aClass38_Sub16_Sub1_2337 = null;
			int i_0_ = -58 % ((i + 56) / 52);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "la.E(" + i + ')');
		}
	}
}
