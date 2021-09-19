package com.javatar;/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43 {
	static RSString aClass19_968;
	static int[] anIntArray971 = new int[32];
	static RSString aClass19_974;
	static RSString aClass19_980 = RSString.createRSString("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");
	static Class16[] aClass16Array982;
	static RSString aClass19_983 = RSString.createRSString("Nehmen");
	private static RSString aClass19_985 = RSString.createRSString("glow3:");

	static {
		Class43.aClass19_974 = Class43.aClass19_985;
		Class43.aClass19_968 = Class43.aClass19_985;
		Class43.aClass16Array982 = new Class16[16];
	}

	SceneModel aClass38_Sub20_Sub3_967;
	int anInt970 = 0;
	int anInt972;
	int anInt973;
	int anInt975 = 0;
	int anInt976;
	int anInt978;
	int anInt979;
	SceneModel aClass38_Sub20_Sub3_981;
	int anInt984;
	int anInt987;

	public Class43() {
		/* empty */
	}

	static final boolean method362(Class38_Sub6 class38_sub6) {
		try {
			if (!true)
				return true;
			if (Node.aBool892) {
				if (Class30.method283(-120, class38_sub6) != 0)
					return false;
				if (class38_sub6.anInt1868 == 0)
					return false;
			}
			return class38_sub6.aBool1853;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "r.A(" + true + ',' + (class38_sub6 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method363(byte i) {
		try {
			boolean bool = true;
			Class43.method365(false, (byte) 127);
			Class38_Sub9.anInt2055 = 0;
			for (int i_0_ = 0; i_0_ < Class38_Sub17.aByteArrayArray2198.length; i_0_++) {
				if (Class72.anIntArray1409[i_0_] != -1 && Class38_Sub17.aByteArrayArray2198[i_0_] == null) {
					Class38_Sub17.aByteArrayArray2198[i_0_] = Class48.indexMaps.method109(Class72.anIntArray1409[i_0_], 0, -110);
					if (Class38_Sub17.aByteArrayArray2198[i_0_] == null) {
						Class38_Sub9.anInt2055++;
						bool = false;
					}
				}
				if (Class51.anIntArray1131[i_0_] != -1 && Class21.aByteArrayArray507[i_0_] == null) {
					Class21.aByteArrayArray507[i_0_] = Class48.indexMaps.method123(-118, Class51.anIntArray1131[i_0_], Class83.anIntArrayArray1664[i_0_], 0);
					if (Class21.aByteArrayArray507[i_0_] == null) {
						bool = false;
						Class38_Sub9.anInt2055++;
					}
				}
			}
			if (!bool)
				Class72.anInt1407 = 1;
			else {
				Class16.anInt320 = 0;
				bool = true;
				for (int i_1_ = 0; i_1_ < Class38_Sub17.aByteArrayArray2198.length; i_1_++) {
					byte[] is = Class21.aByteArrayArray507[i_1_];
					if (is != null) {
						int i_2_ = (Class38_Sub12.anIntArray2115[i_1_] >> 8) * 64 - client.currentBaseY;
						int i_3_ = (Class38_Sub12.anIntArray2115[i_1_] & 0xff) * 64 - client.currentBaseX;
						if (Class37.secondMapRegion) {
							i_2_ = 10;
							i_3_ = 10;
						}
						bool &= Class53.method413(i_2_, is, i_3_);
					}
				}
				if (!bool)
					Class72.anInt1407 = 2;
				else {
					if (Class72.anInt1407 != 0)
						Class53.method409(Class9.method43(new RSString[] { Class2.aClass19_39, Class38_Sub20_Sub2.aClass19_2541 }, (byte) -20), 16777215, true);
					Class42.method357(-7);
					Class4.method25(-98);
					Class42.method357(-7);
					RuntimeException_Sub1.aClass27_3292.method242();
					Class42.method357(-7);
					System.gc();
					for (int i_4_ = 0; i_4_ < 4; i_4_++)
						client.clippingHeights[i_4_].method530(109);
					for (int i_5_ = 0; i_5_ < 4; i_5_++)
						for (int i_6_ = 0; i_6_ < 104; i_6_++)
							for (int i_7_ = 0; i_7_ < 104; i_7_++)
								Class82.aByteArrayArrayArray1648[i_5_][i_6_][i_7_] = (byte) 0;
					Class42.method357(-7);
					Class62.method463();
					int i_8_ = Class38_Sub17.aByteArrayArray2198.length;
					Class20.method187();
					Class43.method365(true, (byte) 124);
					if (!Class37.secondMapRegion) {
						for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
							int i_10_ = -client.currentBaseX + (Class38_Sub12.anIntArray2115[i_9_] & 0xff) * 64;
							byte[] is = Class38_Sub17.aByteArrayArray2198[i_9_];
							int i_11_ = (Class38_Sub12.anIntArray2115[i_9_] >> 8) * 64 - client.currentBaseY;
							if (is != null) {
								Class42.method357(-7);
								Class38_Sub3.method621(is, (Class38_Sub17.anInt2193 - 6) * 8, i_10_, 12809, ItemDefinition.anInt2801 * 8 - 48, client.clippingHeights, i_11_);
							}
						}
						for (int i_12_ = 0; i_8_ > i_12_; i_12_++) {
							int i_13_ = (Class38_Sub12.anIntArray2115[i_12_] >> 8) * 64 - client.currentBaseY;
							int i_14_ = (Class38_Sub12.anIntArray2115[i_12_] & 0xff) * 64 - client.currentBaseX;
							byte[] is = Class38_Sub17.aByteArrayArray2198[i_12_];
							if (is == null && Class38_Sub17.anInt2193 < 800) {
								Class42.method357(-7);
								Class62.method461(i_14_, i_13_, 64, 64);
							}
						}
						Class43.method365(true, (byte) 105);
						for (int i_15_ = 0; i_15_ < i_8_; i_15_++) {
							byte[] is = Class21.aByteArrayArray507[i_15_];
							if (is != null) {
								int i_16_ = -client.currentBaseY + (Class38_Sub12.anIntArray2115[i_15_] >> 8) * 64;
								int i_17_ = (Class38_Sub12.anIntArray2115[i_15_] & 0xff) * 64 - client.currentBaseX;
								Class42.method357(-7);
								Class60.method455(i_16_, RuntimeException_Sub1.aClass27_3292, is, client.clippingHeights, i_17_);
							}
						}
					}
					if (Class37.secondMapRegion) {
						for (int i_18_ = 0; i_18_ < 4; i_18_++) {
							Class42.method357(-7);
							for (int i_19_ = 0; i_19_ < 13; i_19_++)
								for (int i_20_ = 0; i_20_ < 13; i_20_++) {
									boolean bool_21_ = false;
									int i_22_ = RSString.anIntArrayArrayArray445[i_18_][i_19_][i_20_];
									if (i_22_ != -1) {
										int i_23_ = (i_22_ & 0x3c9e2dc) >> 24;
										int i_24_ = (i_22_ & 0x6) >> 1;
										int i_25_ = i_22_ >> 14 & 0x3ff;
										int i_26_ = i_22_ >> 3 & 0x7ff;
										int i_27_ = i_26_ / 8 + (i_25_ / 8 << 8);
										for (int i_28_ = 0; Class38_Sub12.anIntArray2115.length > i_28_; i_28_++)
											if (Class38_Sub12.anIntArray2115[i_28_] == i_27_ && Class38_Sub17.aByteArrayArray2198[i_28_] != null) {
												bool_21_ = true;
												PacketBuffer.method793((i_25_ & 0x7) * 8, i_20_ * 8, i_19_ * 8, (i_26_ & 0x7) * 8, i_23_, client.clippingHeights, Class38_Sub17.aByteArrayArray2198[i_28_], i_24_, i_18_);
												break;
											}
									}
									if (!bool_21_)
										Class38_Sub20_Sub14.method1004(i_19_ * 8, i_20_ * 8, i_18_);
								}
						}
						for (int i_29_ = 0; i_29_ < 13; i_29_++)
							for (int i_30_ = 0; i_30_ < 13; i_30_++) {
								int i_31_ = RSString.anIntArrayArrayArray445[0][i_29_][i_30_];
								if (i_31_ == -1)
									Class62.method461(i_30_ * 8, i_29_ * 8, 8, 8);
							}
						Class43.method365(true, (byte) 114);
						for (int i_32_ = 0; i_32_ < 4; i_32_++) {
							Class42.method357(-7);
							for (int i_33_ = 0; i_33_ < 13; i_33_++)
								for (int i_34_ = 0; i_34_ < 13; i_34_++) {
									int i_35_ = RSString.anIntArrayArrayArray445[i_32_][i_33_][i_34_];
									if (i_35_ != -1) {
										int i_36_ = i_35_ >> 24 & 0x3;
										int i_37_ = i_35_ >> 1 & 0x3;
										int i_38_ = i_35_ >> 14 & 0x3ff;
										int i_39_ = (i_35_ & 0x3ff9) >> 3;
										int i_40_ = i_39_ / 8 + (i_38_ / 8 << 8);
										for (int i_41_ = 0; i_41_ < Class38_Sub12.anIntArray2115.length; i_41_++)
											if (Class38_Sub12.anIntArray2115[i_41_] == i_40_ && Class21.aByteArrayArray507[i_41_] != null) {
												Class15.method86(i_32_, Class21.aByteArrayArray507[i_41_], i_36_, (i_39_ & 0x7) * 8, i_34_ * 8, i_33_ * 8, RuntimeException_Sub1.aClass27_3292, i_37_, client.clippingHeights, (i_38_ & 0x7) * 8);
												break;
											}
									}
								}
						}
					}
					Class43.method365(true, (byte) 107);
					Class4.method25(-90);
					Class42.method357(-7);
					Class38_Sub20_Sub16.method1025(client.clippingHeights, RuntimeException_Sub1.aClass27_3292);
					Class43.method365(true, (byte) 113);
					if (i > -14)
						Class43.aClass19_968 = null;
					int i_42_ = Class26.anInt618;
					if (client.height < i_42_)
						i_42_ = client.height;
					if (i_42_ < client.height - 1)
						i_42_ = client.height - 1;
					if (!Class38_Sub4.aBool1811)
						RuntimeException_Sub1.aClass27_3292.method245(0);
					else
						RuntimeException_Sub1.aClass27_3292.method245(Class26.anInt618);
					for (int i_43_ = 0; i_43_ < 104; i_43_++)
						for (int i_44_ = 0; i_44_ < 104; i_44_++)
							Class13.method59(-1, i_44_, i_43_);
					Class42.method357(-7);
					Class47.method383((byte) 56);
					Entity.aClass83_3466.method596(118);
					if (client.clientFrame != null) {
						client.secureBuffer.putOpcode(153);
						client.secureBuffer.putInt(1057001181);
					}
					if (!Class37.secondMapRegion) {
						int i_45_ = (ItemDefinition.anInt2801 + 6) / 8;
						int i_46_ = (Class38_Sub17.anInt2193 + 6) / 8;
						int i_47_ = (ItemDefinition.anInt2801 - 6) / 8;
						int i_48_ = (Class38_Sub17.anInt2193 - 6) / 8;
						for (int i_49_ = i_47_ - 1; i_45_ + 1 >= i_49_; i_49_++)
							for (int i_50_ = i_48_ - 1; i_46_ + 1 >= i_50_; i_50_++)
								if (i_49_ < i_47_ || i_49_ > i_45_ || i_50_ < i_48_ || i_46_ < i_50_) {
									Class48.indexMaps.method115((byte) 95, Class9.method43(new RSString[] { Class38_Sub6.aClass19_1880, RuntimeException_Sub1.method1098(i_49_, 0), Class66.aClass19_1374, RuntimeException_Sub1.method1098(i_50_, 0) }, (byte) -20));
									Class48.indexMaps.method115((byte) 95, Class9.method43(new RSString[] { Class77.aClass19_1528, RuntimeException_Sub1.method1098(i_49_, 0), Class66.aClass19_1374, RuntimeException_Sub1.method1098(i_50_, 0) }, (byte) -20));
								}
					}
					Canvas_Sub1.method808(0, 30);
					Class42.method357(-7);
					Class74.method534();
					client.secureBuffer.putOpcode(39);
					Class75.method540();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "r.B(" + i + ')');
		}
	}

	public static void method364(byte i) {
		try {
			Class43.aClass19_980 = null;
			Class43.aClass19_968 = null;
			Class43.aClass19_974 = null;
			if (i < -78) {
				Class43.aClass16Array982 = null;
				Class43.aClass19_983 = null;
				Class43.anIntArray971 = null;
				Class43.aClass19_985 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "r.D(" + i + ')');
		}
	}

	private static void method365(boolean bool, byte i) {
		do {
			try {
				Class42.method357(-7);
				if (i < 100)
					Class43.method363((byte) -101);
				client.pingTimer++;
				if (client.pingTimer >= 50 || bool) {
					client.pingTimer = 0;
					if (client.errorPinging || client.worldConnection == null)
						break;
					client.secureBuffer.putOpcode(232);
					try {
						client.worldConnection.write(client.secureBuffer.buffer, client.secureBuffer.pos, (byte) 123);
						client.secureBuffer.pos = 0;
					} catch (java.io.IOException ioexception) {
						client.errorPinging = true;
					}
					Class78.anInt1545++;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "r.C(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}
}
