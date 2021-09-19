package com.javatar.jagex;/* Class38_Sub20_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub17 extends NodeSub {
	private static RSString aClass19_3109 = RSString.createRSString(" is already on your ignore list");
	private static RSString aClass19_3111;
	static int[] anIntArray3112 = new int[128];
	static Class17 aClass17_3113;
	static Class17 aClass17_3114;
	static RSString aClass19_3115;
	static RSString aClass19_3116;
	static RSString aClass19_3119;
	static RSString aClass19_3120;
	static RSString aClass19_3121;
	static RSString aClass19_3122;
	int anInt3123;
	private static RSString aClass19_3124;
	static RSString aClass19_3126;
	static RSString aClass19_3127;
	static Class38_Sub20_Sub9_Sub2 aClass38_Sub20_Sub9_Sub2_3128;
	static int anInt3129 = 0;
	static RSString aClass19_3130;
	private static RSString aClass19_3131;
	int anInt3132;
	private static RSString aClass19_3134;
	int anInt3135;
	static RSString aClass19_3136;
	static Class31 aClass31_3138;

	static final Class38_Sub20_Sub9_Sub2[] method1030(int i, int i_0_, int i_1_, Class17 class17) {
		try {
			if (!Class22.method197(i, class17, -308039560, i_0_))
				return null;
			if (i_1_ != -1)
				Class38_Sub20_Sub17.aClass19_3121 = null;
			return Class38_Sub8.method661(0);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ac.E(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (class17 != null ? "{...}" : "null") + ')');
		}
	}

	final void method1031(RS2Buffer class38_sub23, int i) {
		try {
			for (;;) {
				int i_2_ = class38_sub23.readUnsignedByte();
				if (i_2_ == 0)
					break;
				method1032((byte) -114, i_2_, class38_sub23);
			}
			if (i < 97)
				Class38_Sub20_Sub17.method1036(4);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ac.G(" + (class38_sub23 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method1032(byte i, int i_3_, RS2Buffer class38_sub23) {
		try {
			if (i_3_ == 1) {
				this.anInt3132 = class38_sub23.readUnsignedShort();
				this.anInt3123 = class38_sub23.readUnsignedByte();
				this.anInt3135 = class38_sub23.readUnsignedByte();
			}
			if (i > -54)
				Class38_Sub20_Sub17.aClass38_Sub20_Sub9_Sub2_3128 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ac.F(" + i + ',' + i_3_ + ',' + (class38_sub23 != null ? "{...}" : "null") + ')');
		}
	}

	static final int method1033(int i, boolean bool, int i_4_) {
		try {
			if (bool)
				Class38_Sub20_Sub17.method1030(-90, 82, 25, null);
			if (i_4_ >= 2) {
				int i_5_ = Class38_Sub20_Sub17.method1033(i * i, false, i_4_ >> -203683135);
				if ((i_4_ & 0x1) != 0)
					i_5_ *= i;
				return i_5_;
			}
			if (i_4_ == 1)
				return i;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ac.I(" + i + ',' + bool + ',' + i_4_ + ')');
		}
	}

	static final void sendMapRegion(boolean second, byte i) {
		do {
			try {
				Class37.secondMapRegion = second;
				if (!Class37.secondMapRegion) {
					int height = Class15.inputStream.getUByteC();
					int regionX = Class15.inputStream.readUnsignedShortAdd();
					int regionY = Class15.inputStream.readUnsignedShort();
					int i_9_ = (-((RS2Buffer) Class15.inputStream).pos + Entity.anInt3446) / 16;
					Class83.anIntArrayArray1664 = new int[i_9_][4];
					for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
						for (int i_11_ = 0; i_11_ < 4; i_11_++)
							Class83.anIntArrayArray1664[i_10_][i_11_] = Class15.inputStream.readMEInt();
					int localX = Class15.inputStream.getULEShort();
					boolean bool_13_ = false;
					if ((regionY / 8 == 48 || regionY / 8 == 49) && regionX / 8 == 48)
						bool_13_ = true;
					int localY = Class15.inputStream.readUnsignedShort();
					Class51.anIntArray1131 = new int[i_9_];
					Class38_Sub17.aByteArrayArray2198 = new byte[i_9_][];
					Class21.aByteArrayArray507 = new byte[i_9_][];
					Class38_Sub12.anIntArray2115 = new int[i_9_];
					if (regionY / 8 == 48 && regionX / 8 == 148)
						bool_13_ = true;
					Class72.anIntArray1409 = new int[i_9_];
					i_9_ = 0;
					for (int i_15_ = (regionY - 6) / 8; (regionY + 6) / 8 >= i_15_; i_15_++)
						for (int i_16_ = (regionX - 6) / 8; (regionX + 6) / 8 >= i_16_; i_16_++) {
							int i_17_ = i_16_ + (i_15_ << -552129016);
							if (!bool_13_ || i_16_ != 49 && i_16_ != 149 && i_16_ != 147 && i_15_ != 50 && (i_15_ != 49 || i_16_ != 47)) {
								Class38_Sub12.anIntArray2115[i_9_] = i_17_;
								Class72.anIntArray1409[i_9_] = Class48.aClass17_Sub1_1070.method104(3, Class9.method43(new RSString[] { WidgetComponent.aClass19_1880, RuntimeException_Sub1.method1098(i_15_, 0), Class66.aClass19_1374, RuntimeException_Sub1.method1098(i_16_, 0) }, (byte) -20));
								Class51.anIntArray1131[i_9_] = Class48.aClass17_Sub1_1070.method104(3, Class9.method43(new RSString[] { Class77.aClass19_1528, RuntimeException_Sub1.method1098(i_15_, 0), Class66.aClass19_1374, RuntimeException_Sub1.method1098(i_16_, 0) }, (byte) -20));
								i_9_++;
							}
						}
					Class38_Sub20_Sub13.updateRegion(height, regionX, regionY, localX, localY, (byte) -128);
				} else {
					int i_18_ = Class15.inputStream.readUnsignedShort();
					int i_19_ = Class15.inputStream.method741(55);
					int i_20_ = Class15.inputStream.readUnsignedShort();
					int i_21_ = Class15.inputStream.readUnsignedShortAdd();
					Class15.inputStream.setBitAccess(8);
					for (int i_22_ = 0; i_22_ < 4; i_22_++)
						for (int i_23_ = 0; i_23_ < 13; i_23_++)
							for (int i_24_ = 0; i_24_ < 13; i_24_++) {
								int i_25_ = Class15.inputStream.readBits(1, (byte) 69);
								if (i_25_ != 1)
									RSString.anIntArrayArrayArray445[i_22_][i_23_][i_24_] = -1;
								else
									RSString.anIntArrayArrayArray445[i_22_][i_23_][i_24_] = Class15.inputStream.readBits(26, (byte) 69);
							}
					Class15.inputStream.method788(7);
					int i_26_ = (Entity.anInt3446 - ((RS2Buffer) Class15.inputStream).pos) / 16;
					Class83.anIntArrayArray1664 = new int[i_26_][4];
					for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
						for (int i_28_ = 0; i_28_ < 4; i_28_++)
							Class83.anIntArrayArray1664[i_27_][i_28_] = Class15.inputStream.method730(38);
					int i_29_ = Class15.inputStream.getULEShort();
					Class51.anIntArray1131 = new int[i_26_];
					Class21.aByteArrayArray507 = new byte[i_26_][];
					Class38_Sub12.anIntArray2115 = new int[i_26_];
					Class72.anIntArray1409 = new int[i_26_];
					Class38_Sub17.aByteArrayArray2198 = new byte[i_26_][];
					i_26_ = 0;
					for (int i_30_ = 0; i_30_ < 4; i_30_++)
						for (int i_31_ = 0; i_31_ < 13; i_31_++)
							for (int i_32_ = 0; i_32_ < 13; i_32_++) {
								int i_33_ = RSString.anIntArrayArrayArray445[i_30_][i_31_][i_32_];
								if (i_33_ != -1) {
									int i_34_ = (i_33_ & 0xffdae4) >> 2047216334;
									int i_35_ = (i_33_ & 0x3fff) >> 189025667;
									int i_36_ = i_35_ / 8 + (i_34_ / 8 << 1807995944);
									for (int i_37_ = 0; i_37_ < i_26_; i_37_++)
										if (i_36_ == Class38_Sub12.anIntArray2115[i_37_]) {
											i_36_ = -1;
											break;
										}
									if (i_36_ != -1) {
										Class38_Sub12.anIntArray2115[i_26_] = i_36_;
										int i_38_ = i_36_ & 0xff;
										int i_39_ = i_36_ >> 2075088328 & 0xff;
										Class72.anIntArray1409[i_26_] = Class48.aClass17_Sub1_1070.method104(3, Class9.method43(new RSString[] { WidgetComponent.aClass19_1880, RuntimeException_Sub1.method1098(i_39_, 0), Class66.aClass19_1374, RuntimeException_Sub1.method1098(i_38_, 0) }, (byte) -20));
										Class51.anIntArray1131[i_26_] = Class48.aClass17_Sub1_1070.method104(3, Class9.method43(new RSString[] { Class77.aClass19_1528, RuntimeException_Sub1.method1098(i_39_, 0), Class66.aClass19_1374, RuntimeException_Sub1.method1098(i_38_, 0) }, (byte) -20));
										i_26_++;
									}
								}
							}
					Class38_Sub20_Sub13.updateRegion(i_19_, i_29_, i_20_, i_21_, i_18_, (byte) -128);
				}
				if (i >= 85)
					break;
				Class38_Sub20_Sub17.sendMapRegion(true, (byte) -101);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ac.K(" + second + ',' + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1035(int i, byte i_40_, int i_41_, int i_42_) {
		try {
			int i_43_ = -82 / ((-7 - i_40_) / 40);
			if (Player.anInt3565 != 0 && i_42_ != 0 && Class38_Sub20_Sub10.anInt2910 < 50) {
				ObjectDefinition.anIntArray2442[Class38_Sub20_Sub10.anInt2910] = i;
				Class61.anIntArray1330[Class38_Sub20_Sub10.anInt2910] = i_42_;
				Class76.anIntArray1495[Class38_Sub20_Sub10.anInt2910] = i_41_;
				Class38_Sub20_Sub16.aClass68Array3096[Class38_Sub20_Sub10.anInt2910] = null;
				Class77.anIntArray1531[Class38_Sub20_Sub10.anInt2910] = 0;
				Class38_Sub20_Sub10.anInt2910++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ac.J(" + i + ',' + i_40_ + ',' + i_41_ + ',' + i_42_ + ')');
		}
	}

	public Class38_Sub20_Sub17() {
		/* empty */
	}

	public static void method1036(int i) {
		do {
			try {
				Class38_Sub20_Sub17.aClass19_3130 = null;
				Class38_Sub20_Sub17.aClass19_3136 = null;
				Class38_Sub20_Sub17.aClass19_3120 = null;
				Class38_Sub20_Sub17.aClass19_3119 = null;
				Class38_Sub20_Sub17.aClass19_3115 = null;
				Class38_Sub20_Sub17.aClass19_3124 = null;
				Class38_Sub20_Sub17.aClass38_Sub20_Sub9_Sub2_3128 = null;
				Class38_Sub20_Sub17.aClass19_3127 = null;
				Class38_Sub20_Sub17.aClass19_3116 = null;
				Class38_Sub20_Sub17.aClass19_3122 = null;
				Class38_Sub20_Sub17.aClass19_3121 = null;
				Class38_Sub20_Sub17.aClass19_3126 = null;
				Class38_Sub20_Sub17.aClass19_3111 = null;
				Class38_Sub20_Sub17.aClass31_3138 = null;
				Class38_Sub20_Sub17.anIntArray3112 = null;
				Class38_Sub20_Sub17.aClass19_3109 = null;
				Class38_Sub20_Sub17.aClass19_3131 = null;
				Class38_Sub20_Sub17.aClass17_3114 = null;
				Class38_Sub20_Sub17.aClass17_3113 = null;
				Class38_Sub20_Sub17.aClass19_3134 = null;
				if (i == 0)
					break;
				Class38_Sub20_Sub17.method1035(58, (byte) -101, 123, -102);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ac.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		Class38_Sub20_Sub17.aClass19_3111 = RSString.createRSString("Please use a different world)3");
		Class38_Sub20_Sub17.aClass19_3120 = Class38_Sub20_Sub17.aClass19_3111;
		Class38_Sub20_Sub17.aClass19_3124 = RSString.createRSString("Select a world");
		Class38_Sub20_Sub17.aClass19_3122 = Class38_Sub20_Sub17.aClass19_3124;
		Class38_Sub20_Sub17.aClass19_3119 = Class38_Sub20_Sub17.aClass19_3111;
		Class38_Sub20_Sub17.aClass19_3121 = RSString.createRSString("headicons_prayer");
		Class38_Sub20_Sub17.aClass19_3131 = RSString.createRSString("New User");
		Class38_Sub20_Sub17.aClass19_3134 = RSString.createRSString("Your account has been disabled)3");
		Class38_Sub20_Sub17.aClass19_3130 = Class38_Sub20_Sub17.aClass19_3131;
		Class38_Sub20_Sub17.aClass19_3127 = RSString.createRSString("Lade Eingabe)2Steuerungsprogramm)3)3)3");
		Class38_Sub20_Sub17.aClass19_3116 = Class38_Sub20_Sub17.aClass19_3109;
		Class38_Sub20_Sub17.aClass19_3115 = Class38_Sub20_Sub17.aClass19_3134;
		Class38_Sub20_Sub17.aClass19_3136 = RSString.createRSString("Lade Sprites )2 ");
		Class38_Sub20_Sub17.aClass19_3126 = RSString.createRSString("headicons_hint");
	}
}
