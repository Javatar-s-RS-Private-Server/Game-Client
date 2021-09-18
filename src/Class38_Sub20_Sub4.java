/* Class38_Sub20_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub4 extends NodeSub {
	static RSString aClass19_2561;
	static Class38_Sub20_Sub2 aClass38_Sub20_Sub2_2564;
	static RSString aClass19_2571;
	static byte aByte2575;
	static int anInt2586;
	private static RSString aClass19_2562 = RSString.createRSString("Your account is already logged in)3");

	static {
		Class38_Sub20_Sub4.aClass19_2561 = Class38_Sub20_Sub4.aClass19_2562;
		Class38_Sub20_Sub4.aClass19_2571 = RSString.createRSString("jlv");
		Class38_Sub20_Sub4.anInt2586 = 0;
	}

	int anInt2558 = -1;
	int[] anIntArray2560;
	boolean aBool2563;
	int[] anIntArray2568;
	int walkProperties = -1;
	int anInt2574 = -1;
	int anInt2576 = 5;
	int anInt2578;
	int anInt2581;
	int anInt2582;
	int[] anIntArray2585;
	int anInt2587;
	private int[] anIntArray2577;
	private int[] anIntArray2579;

	public Class38_Sub20_Sub4() {
		this.aBool2563 = false;
		this.anInt2578 = -1;
		this.anInt2582 = -1;
		this.anInt2581 = 99;
		this.anInt2587 = 2;
	}

	public static void method822(int i) {
		try {
			Class38_Sub20_Sub4.aClass19_2571 = null;
			Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564 = null;
			if (i != 0)
				Class38_Sub20_Sub4.aByte2575 = (byte) 0;
			Class38_Sub20_Sub4.aClass19_2562 = null;
			Class38_Sub20_Sub4.aClass19_2561 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vc.M(" + i + ')');
		}
	}

	static final void method824(int i, int i_2_, RSString class19) {
		do {
			try {
				RSString class19_3_ = class19.method147((byte) 120).method167((byte) 52);
				boolean bool = false;
				if (i_2_ == 81) {
					for (int i_4_ = 0; ItemDefinition.anInt2783 > i_4_; i_4_++) {
						Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[Class47.anIntArray1055[i_4_]];
						if (class38_sub20_sub3_sub7_sub2 != null && class38_sub20_sub3_sub7_sub2.name != null && class38_sub20_sub3_sub7_sub2.name.method174((byte) 118, class19_3_)) {
							client.calculatePath(false, 0, client.myPlayer.walkQueueY[0], 0, 1, class38_sub20_sub3_sub7_sub2.walkQueueX[0], client.myPlayer.walkQueueX[0], 0, class38_sub20_sub3_sub7_sub2.walkQueueY[0], 1, 2);
							bool = true;
							if (i == 1) {
								client.secureBuffer.putOpcode(35);
								client.secureBuffer.method767(i_2_ - 25761, Class47.anIntArray1055[i_4_]);
								Class77.anInt1518++;
							} else if (i != 4) {
								if (i != 6) {
									if (i == 7) {
										Class38_Sub2.anInt1764++;
										client.secureBuffer.putOpcode(138);
										client.secureBuffer.method769(Class47.anIntArray1055[i_4_], 109);
									}
								} else {
									Class83.anInt1678++;
									client.secureBuffer.putOpcode(193);
									client.secureBuffer.putShort(Class47.anIntArray1055[i_4_]);
								}
							} else {
								Class38_Sub22.anInt2323++;
								client.secureBuffer.putOpcode(81);
								client.secureBuffer.putLEShortA(Class47.anIntArray1055[i_4_]);
							}
							break;
						}
					}
					if (bool)
						break;
					Class62.method464((byte) 98, Class9.method43(new RSString[] { Sequence.aClass19_2739, class19_3_ }, (byte) -20), 0, Class38_Sub22.aClass19_2312);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "vc.I(" + i + ',' + i_2_ + ',' + (class19 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static final void method828(long l, int i) {
		try {
			if (i != -7645)
				Class38_Sub20_Sub4.method824(-120, -22, null);
			if (l != 0L) {
				client.secureBuffer.putOpcode(23);
				Class28.anInt689++;
				client.secureBuffer.writeLong(l);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vc.J(" + l + ',' + i + ')');
		}
	}

	final void method823(RS2Buffer class38_sub23, byte i) {
		try {
			int i_0_ = 52 % ((i - 4) / 41);
			for (;;) {
				int i_1_ = class38_sub23.getUByte();
				if (i_1_ == 0)
					break;
				method826(class38_sub23, i_1_, (byte) 93);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vc.G(" + (class38_sub23 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Class38_Sub20_Sub3_Sub1 method825(int i, int i_5_, Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1, byte i_6_) {
		try {
			i_5_ = this.anIntArray2585[i_5_];
			Class38_Sub20_Sub13 class38_sub20_sub13 = Class23.method202((byte) -122, i_5_ >> 16);
			i_5_ &= 0xffff;
			if (class38_sub20_sub13 == null)
				return class38_sub20_sub3_sub1.method1038(true);
			i &= 0x3;
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_7_ = class38_sub20_sub3_sub1.method1038(!class38_sub20_sub13.method994(i_5_, (byte) 124));
			if (i != 1) {
				if (i != 2) {
					if (i == 3)
						class38_sub20_sub3_sub1_7_.method1040();
				} else
					class38_sub20_sub3_sub1_7_.method1042();
			} else
				class38_sub20_sub3_sub1_7_.method1051();
			class38_sub20_sub3_sub1_7_.method1049(class38_sub20_sub13, i_5_);
			if (i_6_ >= -69)
				this.walkProperties = -70;
			if (i == 1)
				class38_sub20_sub3_sub1_7_.method1040();
			else if (i != 2) {
				if (i == 3)
					class38_sub20_sub3_sub1_7_.method1051();
			} else
				class38_sub20_sub3_sub1_7_.method1042();
			return class38_sub20_sub3_sub1_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vc.F(" + i + ',' + i_5_ + ',' + (class38_sub20_sub3_sub1 != null ? "{...}" : "null") + ',' + i_6_ + ')');
		}
	}

	private final void method826(RS2Buffer stream, int i, byte i_8_) {
		try {
			if (i_8_ <= 22)
				method831(93);
			if (i == 1) {
				int i_9_ = stream.readUnsignedShortLE();
				this.anIntArray2568 = new int[i_9_];
				for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
					this.anIntArray2568[i_10_] = stream.readUnsignedShortLE();
				this.anIntArray2585 = new int[i_9_];
				for (int i_11_ = 0; i_9_ > i_11_; i_11_++)
					this.anIntArray2585[i_11_] = stream.readUnsignedShortLE();
				for (int i_12_ = 0; i_12_ < i_9_; i_12_++)
					this.anIntArray2585[i_12_] = (stream.readUnsignedShortLE() << 16) + this.anIntArray2585[i_12_];
			} else if (i == 2)
				this.anInt2578 = stream.readUnsignedShortLE();
			else if (i == 3) {
				int i_13_ = stream.getUByte();
				anIntArray2577 = new int[i_13_ + 1];
				for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
					anIntArray2577[i_14_] = stream.getUByte();
				anIntArray2577[i_13_] = 9999999;
			} else if (i == 4)
				this.aBool2563 = true;
			else if (i == 5)
				this.anInt2576 = stream.getUByte();
			else if (i != 6) {
				if (i == 7)
					this.anInt2558 = stream.readUnsignedShortLE();
				else if (i == 8)
					this.anInt2581 = stream.getUByte();
				else if (i == 9)
					this.anInt2574 = stream.getUByte();
				else if (i != 10) {
					if (i != 11) {
						if (i == 12) {
							int i_15_ = stream.getUByte();
							anIntArray2579 = new int[i_15_];
							for (int i_16_ = 0; i_15_ > i_16_; i_16_++)
								anIntArray2579[i_16_] = stream.readUnsignedShortLE();
							for (int i_17_ = 0; i_15_ > i_17_; i_17_++)
								anIntArray2579[i_17_] = (stream.readUnsignedShortLE() << 16) + anIntArray2579[i_17_];
						} else if (i == 13) {
							int i_18_ = stream.getUByte();
							this.anIntArray2560 = new int[i_18_];
							for (int i_19_ = 0; i_18_ > i_19_; i_19_++)
								this.anIntArray2560[i_19_] = stream.method738((byte) 67);
						}
					} else
						this.anInt2587 = stream.getUByte();
				} else
					this.walkProperties = stream.getUByte();
			} else
				this.anInt2582 = stream.readUnsignedShortLE();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vc.O(" + (stream != null ? "{...}" : "null") + ',' + i + ',' + i_8_ + ')');
		}
	}

	final Class38_Sub20_Sub3_Sub1 method827(boolean bool, Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1, int i) {
		try {
			i = this.anIntArray2585[i];
			Class38_Sub20_Sub13 class38_sub20_sub13 = Class23.method202((byte) -122, i >> 16);
			i &= 0xffff;
			if (class38_sub20_sub13 == null)
				return class38_sub20_sub3_sub1.method1059(true);
			if (bool != true)
				method830(-2, null, null, -26, -109);
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_20_ = class38_sub20_sub3_sub1.method1059(!class38_sub20_sub13.method994(i, (byte) 125));
			class38_sub20_sub3_sub1_20_.method1049(class38_sub20_sub13, i);
			return class38_sub20_sub3_sub1_20_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vc.N(" + bool + ',' + (class38_sub20_sub3_sub1 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Class38_Sub20_Sub3_Sub1 method829(int i, int i_21_, Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1) {
		try {
			int i_22_ = this.anIntArray2585[i_21_];
			Class38_Sub20_Sub13 class38_sub20_sub13 = Class23.method202((byte) -122, i_22_ >> 16);
			i_22_ &= 0xffff;
			if (class38_sub20_sub13 == null)
				return class38_sub20_sub3_sub1.method1038(true);
			if (i != -964)
				Class38_Sub20_Sub4.method828(1L, -117);
			Class38_Sub20_Sub13 class38_sub20_sub13_23_ = null;
			int i_24_ = 0;
			if (anIntArray2579 != null && i_21_ < anIntArray2579.length) {
				i_24_ = anIntArray2579[i_21_];
				class38_sub20_sub13_23_ = Class23.method202((byte) -122, i_24_ >> 16);
				i_24_ &= 0xffff;
			}
			if (class38_sub20_sub13_23_ == null || i_24_ == 65535) {
				Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_25_ = class38_sub20_sub3_sub1.method1038(!class38_sub20_sub13.method994(i_22_, (byte) 125));
				class38_sub20_sub3_sub1_25_.method1049(class38_sub20_sub13, i_22_);
				return class38_sub20_sub3_sub1_25_;
			}
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_26_ = class38_sub20_sub3_sub1.method1038(!class38_sub20_sub13.method994(i_22_, (byte) 125) & !class38_sub20_sub13_23_.method994(i_24_, (byte) 124));
			class38_sub20_sub3_sub1_26_.method1049(class38_sub20_sub13, i_22_);
			class38_sub20_sub3_sub1_26_.method1049(class38_sub20_sub13_23_, i_24_);
			return class38_sub20_sub3_sub1_26_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vc.L(" + i + ',' + i_21_ + ',' + (class38_sub20_sub3_sub1 != null ? "{...}" : "null") + ')');
		}
	}

	final Class38_Sub20_Sub3_Sub1 method830(int i, Class38_Sub20_Sub4 class38_sub20_sub4_27_, Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1, int i_28_, int i_29_) {
		try {
			i_29_ = this.anIntArray2585[i_29_];
			Class38_Sub20_Sub13 class38_sub20_sub13 = Class23.method202((byte) -122, i_29_ >> 16);
			i_29_ &= 0xffff;
			if (class38_sub20_sub13 == null)
				return class38_sub20_sub4_27_.method832(class38_sub20_sub3_sub1, i, 0);
			i = class38_sub20_sub4_27_.anIntArray2585[i];
			if (i_28_ != 0)
				return null;
			Class38_Sub20_Sub13 class38_sub20_sub13_30_ = Class23.method202((byte) -122, i >> 16);
			i &= 0xffff;
			if (class38_sub20_sub13_30_ == null) {
				Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_31_ = class38_sub20_sub3_sub1.method1038(!class38_sub20_sub13.method994(i_29_, (byte) 127));
				class38_sub20_sub3_sub1_31_.method1049(class38_sub20_sub13, i_29_);
				return class38_sub20_sub3_sub1_31_;
			}
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_32_ = class38_sub20_sub3_sub1.method1038(!class38_sub20_sub13.method994(i_29_, (byte) 124) & !class38_sub20_sub13_30_.method994(i, (byte) 127));
			class38_sub20_sub3_sub1_32_.method1053(class38_sub20_sub13, i_29_, class38_sub20_sub13_30_, i, anIntArray2577);
			return class38_sub20_sub3_sub1_32_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vc.K(" + i + ',' + (class38_sub20_sub4_27_ != null ? "{...}" : "null") + ',' + (class38_sub20_sub3_sub1 != null ? "{...}" : "null") + ',' + i_28_ + ',' + i_29_ + ')');
		}
	}

	final void method831(int i) {
		do {
			try {
				if (this.anInt2574 == -1)
					if (anIntArray2577 != null)
						this.anInt2574 = 2;
					else
						this.anInt2574 = 0;
				if (i != (this.walkProperties ^ 0xffffffff))
					break;
				if (anIntArray2577 == null)
					this.walkProperties = 0;
				else
					this.walkProperties = 2;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "vc.H(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class38_Sub20_Sub3_Sub1 method832(Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1, int i, int i_33_) {
		try {
			i = this.anIntArray2585[i];
			Class38_Sub20_Sub13 class38_sub20_sub13 = Class23.method202((byte) -122, i >> 16);
			if (i_33_ != 0)
				anIntArray2579 = null;
			i &= 0xffff;
			if (class38_sub20_sub13 == null)
				return class38_sub20_sub3_sub1.method1038(true);
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_34_ = class38_sub20_sub3_sub1.method1038(!class38_sub20_sub13.method994(i, (byte) 125));
			class38_sub20_sub3_sub1_34_.method1049(class38_sub20_sub13, i);
			return class38_sub20_sub3_sub1_34_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vc.E(" + (class38_sub20_sub3_sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_33_ + ')');
		}
	}
}
