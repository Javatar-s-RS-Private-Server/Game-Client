package com.javatar;/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class44 {
	static int anInt988 = 0;
	static RSString aClass19_989 = RSString.createRSString("Art");
	static RSString aClass19_991;
	static boolean aBool992 = false;
	static int[] anIntArray997;
	static Class83 aClass83_998;
	static RSString aClass19_1000;
	static int anInt1002;
	static RSString aClass19_1005;
	static RSString aClass19_1010;
	static RSString aClass19_1011;
	private static RSString aClass19_990 = RSString
			.createRSString(" from your friend list first");
	static RSString aClass19_1006 = Class44.aClass19_990;
	private static RSString aClass19_1008 = RSString.createRSString("red:");

	static {
		Class44.aClass19_991 = Class44.aClass19_1008;
		Class44.aClass19_1005 = Class44.aClass19_1008;
		Class44.aClass19_1000 = RSString
				.createRSString("Bitte warten Sie)3)3)3");
		Class44.aClass83_998 = new Class83(64);
		Class44.aClass19_1010 = RSString.createRSString("<col=ffff00>");
		Class44.aClass19_1011 = RSString.createRSString(":assistreq:");
	}

	private final int[] anIntArray999;

	Class44(int[] is) {
		try {
			int i;
			for (i = 1; is.length + (is.length >> 1) >= i; i <<= 1) {
				/* empty */
			}
			anIntArray999 = new int[i + i];
			for (int i_8_ = 0; i_8_ < i + i; i_8_++)
				anIntArray999[i_8_] = -1;
			for (int i_9_ = 0; i_9_ < is.length; i_9_++) {
				int i_10_;
				for (i_10_ = is[i_9_] & i - 1; anIntArray999[i_10_ + i_10_ + 1] != -1; i_10_ = i_10_
						+ 1 & i - 1) {
					/* empty */
				}
				anIntArray999[i_10_ + i_10_] = is[i_9_];
				anIntArray999[i_10_ + i_10_ + 1] = i_9_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nd.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	static final Class38_Sub20_Sub9_Sub3[] method366(int i_0_,
													 Class17 class17, int i_1_) {
		try {
			if (!Class22.method197(i_1_, class17, -308039560, i_0_))
				return null;
			if ((byte) 123 <= 30)
				Class44.method372((byte) 3);
			return Class33.method302();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nd.F(" + (byte) 123 + ','
					+ i_0_ + ',' + (class17 != null ? "{...}" : "null") + ','
					+ i_1_ + ')');
		}
	}

	static final void method367(int i, boolean bool) {
		try {
			if (Class38_Sub20_Sub17.aClass31_3138 != null)
				try {
					RS2Buffer class38_sub23 = new RS2Buffer(4);
					class38_sub23.putByte(!bool ? 3 : 2);
					class38_sub23.method771(i);
					Class38_Sub20_Sub17.aClass31_3138.write(
							class38_sub23.buffer, 4, (byte) 127);
				} catch (java.io.IOException ioexception) {
					try {
						Class38_Sub20_Sub17.aClass31_3138.method292(-79);
					} catch (Exception exception) {
						/* empty */
					}
					Class38_Sub20_Sub17.aClass31_3138 = null;
					Class38_Sub20_Sub15.anInt3067++;
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nd.C(" + i + ','
					+ bool + ')');
		}
	}

	static final Class38_Sub20_Sub9_Sub2 method368() {
		try {
			Class38_Sub20_Sub9_Sub2 class38_sub20_sub9_sub2 = new Class38_Sub20_Sub9_Sub2();
			class38_sub20_sub9_sub2.anIntArray3241 = PlayerAppearance.anIntArray420;
			class38_sub20_sub9_sub2.anInt3245 = Player.anIntArray3574[0];
			class38_sub20_sub9_sub2.aByteArray3239 = Class30.aByteArrayArray727[0];
			class38_sub20_sub9_sub2.anInt3243 = Projectile.anInt3426;
			class38_sub20_sub9_sub2.anInt3244 = Class16.anInt339;
			class38_sub20_sub9_sub2.anInt3246 = Class38_Sub20_Sub8.anIntArray2873[0];
			class38_sub20_sub9_sub2.anInt3240 = Class51.anIntArray1130[0];
			class38_sub20_sub9_sub2.anInt3242 = Class61.anIntArray1332[0];
			Player.method1207();
			return class38_sub20_sub9_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nd.J(" + 0 + ')');
		}
	}

	static final boolean method369(int i) {
		try {
			if ((byte) -96 >= -90)
				Class44.method372((byte) 96);
			return (i & 0x316933) >> 21 != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nd.A(" + i + ','
					+ (byte) -96 + ')');
		}
	}

	static final void method371(int i, RSString class19, byte i_7_) {
		try {
			client.secureBuffer.putOpcode(205);
			if (i_7_ >= 62) {
				client.secureBuffer.method768(i);
				client.secureBuffer.method733(class19.method162(0));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nd.D(" + i + ','
					+ (class19 != null ? "{...}" : "null") + ',' + i_7_ + ')');
		}
	}

	static final void method372(byte i) {
		try {
			if (i == -96) {
				RSString.aFont460 = null;
				Class76.aFontMetrics1500 = null;
				Class4.anImage85 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nd.G(" + i + ')');
		}
	}

	static final void method373() {
		try {
			Class15.inputStream.method784(3 ^ 0xb);
			int i_11_ = Class15.inputStream.method785(8);
			if (i_11_ < Class4.anInt87)
				for (int i_12_ = i_11_; i_12_ < Class4.anInt87; i_12_++)
					Class21.anIntArray519[Class4.anInt81++] = Class38_Sub10_Sub1.anIntArray2652[i_12_];
			if (Class4.anInt87 < i_11_)
				throw new RuntimeException("gnpov1");
			Class4.anInt87 = 0;
			if (3 != 3)
				Class44.anInt1002 = -113;
			for (int i_13_ = 0; i_11_ > i_13_; i_13_++) {
				int i_14_ = Class38_Sub10_Sub1.anIntArray2652[i_13_];
				NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_14_];
				int i_15_ = Class15.inputStream.method785(1);
				if (i_15_ == 0) {
					Class38_Sub10_Sub1.anIntArray2652[Class4.anInt87++] = i_14_;
					class38_sub20_sub3_sub7_sub1.anInt3459 = Class45.anInt1016;
				} else {
					int i_16_ = Class15.inputStream.method785(2);
					if (i_16_ == 0) {
						Class38_Sub10_Sub1.anIntArray2652[Class4.anInt87++] = i_14_;
						class38_sub20_sub3_sub7_sub1.anInt3459 = Class45.anInt1016;
						ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = i_14_;
					} else if (i_16_ == 1) {
						Class38_Sub10_Sub1.anIntArray2652[Class4.anInt87++] = i_14_;
						class38_sub20_sub3_sub7_sub1.anInt3459 = Class45.anInt1016;
						int i_17_ = Class15.inputStream.method785(3);
						class38_sub20_sub3_sub7_sub1.move(i_17_, false);
						int i_18_ = Class15.inputStream.method785(1);
						if (i_18_ == 1)
							ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = i_14_;
					} else if (i_16_ == 2) {
						Class38_Sub10_Sub1.anIntArray2652[Class4.anInt87++] = i_14_;
						class38_sub20_sub3_sub7_sub1.anInt3459 = Class45.anInt1016;
						int i_19_ = Class15.inputStream.method785(3);
						class38_sub20_sub3_sub7_sub1.move(i_19_, true);
						int i_20_ = Class15.inputStream.method785(3);
						class38_sub20_sub3_sub7_sub1.move(i_20_, true);
						int i_21_ = Class15.inputStream.method785(1);
						if (i_21_ == 1)
							ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = i_14_;
					} else if (i_16_ == 3)
						Class21.anIntArray519[Class4.anInt81++] = i_14_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nd.I(" + 3 + ')');
		}
	}

	public static void method375(byte i) {
		try {
			Class44.anIntArray997 = null;
			Class44.aClass19_1011 = null;
			Class44.aClass83_998 = null;
			Class44.aClass19_990 = null;
			if (i != 0)
				Class44.method371(8, null, (byte) -110);
			Class44.aClass19_1010 = null;
			Class44.aClass19_989 = null;
			Class44.aClass19_991 = null;
			Class44.aClass19_1006 = null;
			Class44.aClass19_1008 = null;
			Class44.aClass19_1000 = null;
			Class44.aClass19_1005 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nd.B(" + i + ')');
		}
	}

	final int method370(int i_3_) {
		try {
			if ((byte) 46 != 46)
				return 117;
			int i_4_ = anIntArray999.length - 2;
			int i_5_ = i_3_ << 1 & i_4_;
			for (; ; ) {
				int i_6_ = anIntArray999[i_5_];
				if (i_6_ == i_3_)
					return anIntArray999[i_5_ + 1];
				if (i_6_ == -1)
					return -1;
				i_5_ = i_5_ + 2 & i_4_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "nd.E(" + (byte) 46 + ','
					+ i_3_ + ')');
		}
	}
}
