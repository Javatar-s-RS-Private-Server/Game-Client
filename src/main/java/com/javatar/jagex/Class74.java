package com.javatar.jagex;/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class74 {
	static int[] anIntArray1435;
	static RSString aClass19_1437;
	private int anInt1441;
	private static RSString aClass19_1443;
	private static RSString aClass19_1446 = RSString.createRSString("Loaded sprites");
	private int anInt1447;
	static boolean aBool1448;
	static int anInt1451;
	private int anInt1452;
	static RSString aClass19_1453;
	private int anInt1454;
	static RSString aClass19_1462;
	static WidgetComponent aClass38_Sub6_1463;
	static RSString aClass19_1464;
	static RSString aClass19_1465;
	private static RSString aClass19_1466;
	int[][] clippingFlags;
	static int anInt1468;
	static RSString aClass19_1469;
	static byte[][][] aByteArrayArrayArray1470;
	static RSString aClass19_1471;

	final void method521(int i, boolean bool, int i_0_, int i_1_, int i_2_, byte i_3_) {
		try {
			if (i_3_ != -73)
				Class74.method531(94, -12);
			i_1_ -= anInt1452;
			i_0_ -= anInt1447;
			int i_4_ = 256;
			if (bool)
				i_4_ += 131072;
			for (int i_5_ = i_0_; i_5_ < i_2_ + i_0_; i_5_++)
				if (i_5_ >= 0 && anInt1441 > i_5_)
					for (int i_6_ = i_1_; i_6_ < i_1_ + i; i_6_++)
						if (i_6_ >= 0 && anInt1454 > i_6_)
							method536(i_4_, i_6_, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.D(" + i + ',' + bool + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')');
		}
	}

	final boolean method522(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			if (i_10_ == i_7_ && i_12_ == i_11_)
				return true;
			i_11_ -= anInt1452;
			i_10_ -= anInt1447;
			i_12_ -= anInt1452;
			i_7_ -= anInt1447;
			if (i_8_ == 6 || i_8_ == 7) {
				if (i_8_ == 7)
					i_9_ = i_9_ + 2 & 0x3;
				if (i_9_ == 0) {
					if (i_7_ + 1 == i_10_ && i_11_ == i_12_ && (this.clippingFlags[i_10_][i_11_] & 0x80) == 0)
						return true;
					if (i_7_ == i_10_ && i_12_ - 1 == i_11_ && (this.clippingFlags[i_10_][i_11_] & 0x2) == 0)
						return true;
				} else if (i_9_ == 1) {
					if (i_7_ - 1 == i_10_ && i_12_ == i_11_ && (this.clippingFlags[i_10_][i_11_] & 0x8) == 0)
						return true;
					if (i_7_ == i_10_ && i_12_ - 1 == i_11_ && (this.clippingFlags[i_10_][i_11_] & 0x2) == 0)
						return true;
				} else if (i_9_ == 2) {
					if (i_7_ - 1 == i_10_ && i_11_ == i_12_ && (this.clippingFlags[i_10_][i_11_] & 0x8) == 0)
						return true;
					if (i_7_ == i_10_ && i_11_ == i_12_ + 1 && (this.clippingFlags[i_10_][i_11_] & 0x20) == 0)
						return true;
				} else if (i_9_ == 3) {
					if (i_10_ == i_7_ + 1 && i_11_ == i_12_ && (this.clippingFlags[i_10_][i_11_] & 0x80) == 0)
						return true;
					if (i_10_ == i_7_ && i_11_ == i_12_ + 1 && (this.clippingFlags[i_10_][i_11_] & 0x20) == 0)
						return true;
				}
			}
			int i_13_ = -91 / ((i - 79) / 38);
			if (i_8_ == 8) {
				if (i_7_ == i_10_ && i_12_ + 1 == i_11_ && (this.clippingFlags[i_10_][i_11_] & 0x20) == 0)
					return true;
				if (i_10_ == i_7_ && i_12_ - 1 == i_11_ && (this.clippingFlags[i_10_][i_11_] & 0x2) == 0)
					return true;
				if (i_10_ == i_7_ - 1 && i_12_ == i_11_ && (this.clippingFlags[i_10_][i_11_] & 0x8) == 0)
					return true;
				if (i_7_ + 1 == i_10_ && i_11_ == i_12_ && (this.clippingFlags[i_10_][i_11_] & 0x80) == 0)
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.M(" + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')');
		}
	}

	final void method523(int i, int i_14_, int i_15_) {
		do {
			try {
				i -= anInt1452;
				i_15_ -= anInt1447;
				this.clippingFlags[i_15_][i] = Class38_Sub10_Sub3.method941(this.clippingFlags[i_15_][i], -262145);
				if (i_14_ == -31858)
					break;
				Class74.anInt1451 = -62;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "qf.E(" + i + ',' + i_14_ + ',' + i_15_ + ')');
			}
			break;
		} while (false);
	}

	final void method524(int i, int i_16_, int i_17_) {
		try {
			i -= anInt1447;
			i_16_ -= anInt1452;
			if (i_17_ != 0)
				method523(-48, 113, 66);
			this.clippingFlags[i][i_16_] = Class38_Sub3.setClippingFlag(this.clippingFlags[i][i_16_], 2097152);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.N(" + i + ',' + i_16_ + ',' + i_17_ + ')');
		}
	}

	public static void method525(int i) {
		try {
			Class74.aByteArrayArrayArray1470 = null;
			Class74.aClass19_1466 = null;
			if (i == 0) {
				Class74.aClass19_1465 = null;
				Class74.aClass19_1453 = null;
				Class74.aClass19_1446 = null;
				Class74.anIntArray1435 = null;
				Class74.aClass19_1464 = null;
				Class74.aClass19_1437 = null;
				Class74.aClass19_1471 = null;
				Class74.aClass19_1469 = null;
				Class74.aClass19_1443 = null;
				Class74.aClass38_Sub6_1463 = null;
				Class74.aClass19_1462 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.A(" + i + ')');
		}
	}

	final boolean reachedFacingObject(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, byte i_24_) {
		try {
			if (i_24_ != 5)
				Class74.aClass19_1453 = null;
			int i_25_ = i_18_ + i_22_ - 1;
			int i_26_ = i_19_ + i_21_ - 1;
			if (i_20_ >= i_22_ && i_25_ >= i_20_ && i_21_ <= i && i <= i_26_)
				return true;
			if (i_22_ - 1 == i_20_ && i_21_ <= i && i_26_ >= i && (this.clippingFlags[-anInt1447 + i_20_][-anInt1452 + i] & 0x8) == 0 && (i_23_ & 0x8) == 0)
				return true;
			if (i_20_ == i_25_ + 1 && i >= i_21_ && i_26_ >= i && (this.clippingFlags[i_20_ - anInt1447][-anInt1452 + i] & 0x80) == 0 && (i_23_ & 0x2) == 0)
				return true;
			if (i == i_21_ - 1 && i_22_ <= i_20_ && i_20_ <= i_25_ && (this.clippingFlags[-anInt1447 + i_20_][-anInt1452 + i] & 0x2) == 0 && (i_23_ & 0x4) == 0)
				return true;
			if (i == i_26_ + 1 && i_22_ <= i_20_ && i_20_ <= i_25_ && (this.clippingFlags[i_20_ - anInt1447][-anInt1452 + i] & 0x20) == 0 && (i_23_ & 0x1) == 0)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.R(" + i + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ')');
		}
	}

	final void method527(boolean bool, int i, int x, boolean bool_28_, int y, int i_30_) {
		do {
			try {
				x -= anInt1447;
				y -= anInt1452;
				if (i == 0) {
					if (i_30_ == 0) {
						method536(128, y, x);
						method536(8, y, x - 1);
					}
					if (i_30_ == 1) {
						method536(2, y, x);
						method536(32, y + 1, x);
					}
					if (i_30_ == 2) {
						method536(8, y, x);
						method536(128, y, x + 1);
					}
					if (i_30_ == 3) {
						method536(32, y, x);
						method536(2, y - 1, x);
					}
				}
				if (i == 1 || i == 3) {
					if (i_30_ == 0) {
						method536(1, y, x);
						method536(16, y + 1, x - 1);
					}
					if (i_30_ == 1) {
						method536(4, y, x);
						method536(64, y + 1, x + 1);
					}
					if (i_30_ == 2) {
						method536(16, y, x);
						method536(1, y - 1, x + 1);
					}
					if (i_30_ == 3) {
						method536(64, y, x);
						method536(4, y - 1, x - 1);
					}
				}
				if (i == 2) {
					if (i_30_ == 0) {
						method536(130, y, x);
						method536(8, y, x - 1);
						method536(32, y + 1, x);
					}
					if (i_30_ == 1) {
						method536(10, y, x);
						method536(32, y + 1, x);
						method536(128, y, x + 1);
					}
					if (i_30_ == 2) {
						method536(40, y, x);
						method536(128, y, x + 1);
						method536(2, y - 1, x);
					}
					if (i_30_ == 3) {
						method536(160, y, x);
						method536(2, y - 1, x);
						method536(8, y, x - 1);
					}
				}
				if (!bool_28_)
					method527(true, -69, 110, false, 67, 125);
				if (bool) {
					if (i == 0) {
						if (i_30_ == 0) {
							method536(65536, y, x);
							method536(4096, y, x - 1);
						}
						if (i_30_ == 1) {
							method536(1024, y, x);
							method536(16384, y + 1, x);
						}
						if (i_30_ == 2) {
							method536(4096, y, x);
							method536(65536, y, x + 1);
						}
						if (i_30_ == 3) {
							method536(16384, y, x);
							method536(1024, y - 1, x);
						}
					}
					if (i == 1 || i == 3) {
						if (i_30_ == 0) {
							method536(512, y, x);
							method536(8192, y + 1, x - 1);
						}
						if (i_30_ == 1) {
							method536(2048, y, x);
							method536(32768, y + 1, x + 1);
						}
						if (i_30_ == 2) {
							method536(8192, y, x);
							method536(512, y - 1, x + 1);
						}
						if (i_30_ == 3) {
							method536(32768, y, x);
							method536(2048, y - 1, x - 1);
						}
					}
					if (i != 2)
						break;
					if (i_30_ == 0) {
						method536(66560, y, x);
						method536(4096, y, x - 1);
						method536(16384, y + 1, x);
					}
					if (i_30_ == 1) {
						method536(5120, y, x);
						method536(16384, y + 1, x);
						method536(65536, y, x + 1);
					}
					if (i_30_ == 2) {
						method536(20480, y, x);
						method536(65536, y, x + 1);
						method536(1024, y - 1, x);
					}
					if (i_30_ != 3)
						break;
					method536(81920, y, x);
					method536(1024, y - 1, x);
					method536(4096, y, x - 1);
				} else {
					break;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "qf.H(" + bool + ',' + i + ',' + x + ',' + bool_28_ + ',' + y + ',' + i_30_ + ')');
			}
			break;
		} while (false);
	}

	final void method528(int i, int i_31_, int i_32_, boolean bool, int i_33_, boolean bool_34_) {
		do {
			try {
				i -= anInt1447;
				i_33_ -= anInt1452;
				if (i_32_ == 0) {
					if (i_31_ == 0) {
						method535((byte) 99, i_33_, i, 128);
						method535((byte) 111, i_33_, i - 1, 8);
					}
					if (i_31_ == 1) {
						method535((byte) 100, i_33_, i, 2);
						method535((byte) 103, i_33_ + 1, i, 32);
					}
					if (i_31_ == 2) {
						method535((byte) 101, i_33_, i, 8);
						method535((byte) 124, i_33_, i + 1, 128);
					}
					if (i_31_ == 3) {
						method535((byte) 104, i_33_, i, 32);
						method535((byte) 102, i_33_ - 1, i, 2);
					}
				}
				if (bool)
					Class74.aBool1448 = true;
				if (i_32_ == 1 || i_32_ == 3) {
					if (i_31_ == 0) {
						method535((byte) 125, i_33_, i, 1);
						method535((byte) 115, i_33_ + 1, i - 1, 16);
					}
					if (i_31_ == 1) {
						method535((byte) 119, i_33_, i, 4);
						method535((byte) 102, i_33_ + 1, i + 1, 64);
					}
					if (i_31_ == 2) {
						method535((byte) 121, i_33_, i, 16);
						method535((byte) 100, i_33_ - 1, i + 1, 1);
					}
					if (i_31_ == 3) {
						method535((byte) 107, i_33_, i, 64);
						method535((byte) 106, i_33_ - 1, i - 1, 4);
					}
				}
				if (i_32_ == 2) {
					if (i_31_ == 0) {
						method535((byte) 114, i_33_, i, 130);
						method535((byte) 113, i_33_, i - 1, 8);
						method535((byte) 105, i_33_ + 1, i, 32);
					}
					if (i_31_ == 1) {
						method535((byte) 127, i_33_, i, 10);
						method535((byte) 109, i_33_ + 1, i, 32);
						method535((byte) 117, i_33_, i + 1, 128);
					}
					if (i_31_ == 2) {
						method535((byte) 122, i_33_, i, 40);
						method535((byte) 101, i_33_, i + 1, 128);
						method535((byte) 102, i_33_ - 1, i, 2);
					}
					if (i_31_ == 3) {
						method535((byte) 105, i_33_, i, 160);
						method535((byte) 117, i_33_ - 1, i, 2);
						method535((byte) 119, i_33_, i - 1, 8);
					}
				}
				if (!bool_34_)
					break;
				if (i_32_ == 0) {
					if (i_31_ == 0) {
						method535((byte) 107, i_33_, i, 65536);
						method535((byte) 112, i_33_, i - 1, 4096);
					}
					if (i_31_ == 1) {
						method535((byte) 98, i_33_, i, 1024);
						method535((byte) 112, i_33_ + 1, i, 16384);
					}
					if (i_31_ == 2) {
						method535((byte) 102, i_33_, i, 4096);
						method535((byte) 109, i_33_, i + 1, 65536);
					}
					if (i_31_ == 3) {
						method535((byte) 106, i_33_, i, 16384);
						method535((byte) 114, i_33_ - 1, i, 1024);
					}
				}
				if (i_32_ == 1 || i_32_ == 3) {
					if (i_31_ == 0) {
						method535((byte) 127, i_33_, i, 512);
						method535((byte) 118, i_33_ + 1, i - 1, 8192);
					}
					if (i_31_ == 1) {
						method535((byte) 124, i_33_, i, 2048);
						method535((byte) 103, i_33_ + 1, i + 1, 32768);
					}
					if (i_31_ == 2) {
						method535((byte) 114, i_33_, i, 8192);
						method535((byte) 101, i_33_ - 1, i + 1, 512);
					}
					if (i_31_ == 3) {
						method535((byte) 106, i_33_, i, 32768);
						method535((byte) 107, i_33_ - 1, i - 1, 2048);
					}
				}
				if (i_32_ != 2)
					break;
				if (i_31_ == 0) {
					method535((byte) 124, i_33_, i, 66560);
					method535((byte) 125, i_33_, i - 1, 4096);
					method535((byte) 123, i_33_ + 1, i, 16384);
				}
				if (i_31_ == 1) {
					method535((byte) 107, i_33_, i, 5120);
					method535((byte) 97, i_33_ + 1, i, 16384);
					method535((byte) 100, i_33_, i + 1, 65536);
				}
				if (i_31_ == 2) {
					method535((byte) 113, i_33_, i, 20480);
					method535((byte) 101, i_33_, i + 1, 65536);
					method535((byte) 106, i_33_ - 1, i, 1024);
				}
				if (i_31_ != 3)
					break;
				method535((byte) 100, i_33_, i, 81920);
				method535((byte) 108, i_33_ - 1, i, 1024);
				method535((byte) 107, i_33_, i - 1, 4096);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "qf.O(" + i + ',' + i_31_ + ',' + i_32_ + ',' + bool + ',' + i_33_ + ',' + bool_34_ + ')');
			}
			break;
		} while (false);
	}

	static final boolean method529(int i, RSString class19) {
		try {
			if (class19 == null)
				return false;
			for (int i_35_ = 0; Class81.anInt1618 > i_35_; i_35_++)
				if (class19.method174((byte) 125, Class53.aClass19Array1173[i_35_]))
					return true;
			int i_36_ = -43 % ((-28 - i) / 45);
			if (class19.method174((byte) 103, Client.myPlayer.name))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.B(" + i + ',' + (class19 != null ? "{...}" : "null") + ')');
		}
	}

	final void method530(int i) {
		try {
			for (int i_37_ = 0; i_37_ < anInt1441; i_37_++)
				for (int i_38_ = 0; anInt1454 > i_38_; i_38_++)
					if (i_37_ != 0 && i_38_ != 0 && anInt1441 - 5 > i_37_ && i_38_ < anInt1454 - 5)
						this.clippingFlags[i_37_][i_38_] = 16777216;
					else
						this.clippingFlags[i_37_][i_38_] = 16777215;
			if (i < 51)
				method523(61, -24, -32);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.K(" + i + ')');
		}
	}

	static final boolean method531(int i, int i_39_) {
		try {
			if (i != -4124)
				Class74.method534(false);
			if ((i_39_ & 0x124a06) >> -1169730956 == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.L(" + i + ',' + i_39_ + ')');
		}
	}

	final void method532(int i, int i_40_, int i_41_, int i_42_, boolean bool, int i_43_, int i_44_) {
		try {
			i_41_ -= anInt1452;
			int i_45_ = 256;
			if (bool)
				i_45_ += 131072;
			if (i_43_ == 1 || i_43_ == 3) {
				int i_46_ = i_40_;
				i_40_ = i_44_;
				i_44_ = i_46_;
			}
			i -= anInt1447;
			if (i_42_ != 19661088)
				method535((byte) -96, 118, -61, -40);
			for (int i_47_ = i; i_47_ < i + i_40_; i_47_++)
				if (i_47_ >= 0 && anInt1441 > i_47_)
					for (int i_48_ = i_41_; i_48_ < i_44_ + i_41_; i_48_++)
						if (i_48_ >= 0 && anInt1454 > i_48_)
							method535((byte) 110, i_48_, i_47_, i_45_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.G(" + i + ',' + i_40_ + ',' + i_41_ + ',' + i_42_ + ',' + bool + ',' + i_43_ + ',' + i_44_ + ')');
		}
	}

	static final void method533(byte i, int i_49_) {
		try {
			if (i_49_ != -1 && Class38_Sub14.isWidgetLoaded[i_49_]) {
				if (i <= 67)
					Class74.aClass19_1462 = null;
				Class25.aClass17_589.method124(i_49_, false);
				if (Class62.widgets[i_49_] != null) {
					boolean bool = true;
					for (int i_50_ = 0; Class62.widgets[i_49_].length > i_50_; i_50_++)
						if (Class62.widgets[i_49_][i_50_] != null)
							if (Class62.widgets[i_49_][i_50_].anInt1868 == 2)
								bool = false;
							else
								Class62.widgets[i_49_][i_50_] = null;
					if (bool)
						Class62.widgets[i_49_] = null;
					Class38_Sub14.isWidgetLoaded[i_49_] = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.I(" + i + ',' + i_49_ + ')');
		}
	}

	static final void method534(boolean bool) {
		try {
			Class48.aByteArrayArrayArray1084 = null;
			Class48.aByteArrayArrayArray1078 = null;
			Class25.aByteArrayArrayArray583 = null;
			Class79.anIntArray1564 = null;
			if (!bool) {
				Class38_Sub9.anIntArray2070 = null;
				NPC.aByteArrayArrayArray3560 = null;
				Class38_Sub20_Sub3_Sub2.anIntArray3257 = null;
				Class5.anIntArrayArrayArray116 = null;
				Class38_Sub20_Sub10.anIntArray2905 = null;
				Class74.aByteArrayArrayArray1470 = null;
				Class20.anIntArray503 = null;
				PlayerAppearance.anIntArrayArray394 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.P(" + bool + ')');
		}
	}

	private final void method535(byte i, int i_51_, int i_52_, int i_53_) {
		do {
			try {
				this.clippingFlags[i_52_][i_51_] = Class38_Sub10_Sub3.method941(this.clippingFlags[i_52_][i_51_], i_53_ ^ 0xffffffff);
				if (i >= 96)
					break;
				this.clippingFlags = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "qf.J(" + i + ',' + i_51_ + ',' + i_52_ + ',' + i_53_ + ')');
			}
			break;
		} while (false);
	}

	private final void method536(int mask, int y, int x) {
		do {
			try {
				this.clippingFlags[x][y] = Class38_Sub3.setClippingFlag(this.clippingFlags[x][y], mask);
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "qf.Q(" + mask + ',' + y + ',' + (byte) 43 + ',' + x + ')');
			}
			break;
		} while (false);
	}

	final boolean method537(int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_) {
		try {
			if (i_62_ == i_60_ && i_58_ == i_59_)
				return true;
			i_62_ -= anInt1447;
			i_59_ -= anInt1452;
			i_58_ -= anInt1452;
			i_60_ -= anInt1447;
			if (i_61_ == 0)
				if (i == 0) {
					if (i_60_ - 1 == i_62_ && i_58_ == i_59_)
						return true;
					if (i_60_ == i_62_ && i_58_ + 1 == i_59_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0120) == 0)
						return true;
					if (i_60_ == i_62_ && i_59_ == i_58_ - 1 && (this.clippingFlags[i_62_][i_59_] & 0x12c0102) == 0)
						return true;
				} else if (i == 1) {
					if (i_62_ == i_60_ && i_59_ == i_58_ + 1)
						return true;
					if (i_60_ - 1 == i_62_ && i_59_ == i_58_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0108) == 0)
						return true;
					if (i_62_ == i_60_ + 1 && i_59_ == i_58_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0180) == 0)
						return true;
				} else if (i == 2) {
					if (i_62_ == i_60_ + 1 && i_58_ == i_59_)
						return true;
					if (i_60_ == i_62_ && i_58_ + 1 == i_59_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0120) == 0)
						return true;
					if (i_60_ == i_62_ && i_59_ == i_58_ - 1 && (this.clippingFlags[i_62_][i_59_] & 0x12c0102) == 0)
						return true;
				} else if (i == 3) {
					if (i_62_ == i_60_ && i_58_ - 1 == i_59_)
						return true;
					if (i_60_ - 1 == i_62_ && i_58_ == i_59_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0108) == 0)
						return true;
					if (i_60_ + 1 == i_62_ && i_59_ == i_58_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0180) == 0)
						return true;
				}
			if (i_61_ == 2)
				if (i == 0) {
					if (i_60_ - 1 == i_62_ && i_59_ == i_58_)
						return true;
					if (i_60_ == i_62_ && i_59_ == i_58_ + 1)
						return true;
					if (i_60_ + 1 == i_62_ && i_59_ == i_58_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0180) == 0)
						return true;
					if (i_60_ == i_62_ && i_58_ - 1 == i_59_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0102) == 0)
						return true;
				} else if (i == 1) {
					if (i_62_ == i_60_ - 1 && i_59_ == i_58_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0108) == 0)
						return true;
					if (i_60_ == i_62_ && i_59_ == i_58_ + 1)
						return true;
					if (i_60_ + 1 == i_62_ && i_59_ == i_58_)
						return true;
					if (i_62_ == i_60_ && i_59_ == i_58_ - 1 && (this.clippingFlags[i_62_][i_59_] & 0x12c0102) == 0)
						return true;
				} else if (i != 2) {
					if (i == 3) {
						if (i_62_ == i_60_ - 1 && i_59_ == i_58_)
							return true;
						if (i_62_ == i_60_ && i_58_ + 1 == i_59_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0120) == 0)
							return true;
						if (i_62_ == i_60_ + 1 && i_59_ == i_58_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0180) == 0)
							return true;
						if (i_60_ == i_62_ && i_59_ == i_58_ - 1)
							return true;
					}
				} else {
					if (i_62_ == i_60_ - 1 && i_59_ == i_58_ && (this.clippingFlags[i_62_][i_59_] & 0x12c0108) == 0)
						return true;
					if (i_60_ == i_62_ && i_59_ == i_58_ + 1 && (this.clippingFlags[i_62_][i_59_] & 0x12c0120) == 0)
						return true;
					if (i_62_ == i_60_ + 1 && i_59_ == i_58_)
						return true;
					if (i_60_ == i_62_ && i_58_ - 1 == i_59_)
						return true;
				}
			if (i_57_ != -4573)
				Class74.aClass19_1453 = null;
			if (i_61_ == 9) {
				if (i_62_ == i_60_ && i_58_ + 1 == i_59_ && (this.clippingFlags[i_62_][i_59_] & 0x20) == 0)
					return true;
				if (i_62_ == i_60_ && i_59_ == i_58_ - 1 && (this.clippingFlags[i_62_][i_59_] & 0x2) == 0)
					return true;
				if (i_62_ == i_60_ - 1 && i_58_ == i_59_ && (this.clippingFlags[i_62_][i_59_] & 0x8) == 0)
					return true;
				if (i_62_ == i_60_ + 1 && i_58_ == i_59_ && (this.clippingFlags[i_62_][i_59_] & 0x80) == 0)
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.C(" + i + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ',' + i_60_ + ',' + i_61_ + ',' + i_62_ + ')');
		}
	}

	final void method538(int i, int i_63_, boolean bool) {
		try {
			i_63_ -= anInt1452;
			if (bool != true)
				Class74.method525(-71);
			i -= anInt1447;
			this.clippingFlags[i][i_63_] = Class38_Sub3.setClippingFlag(this.clippingFlags[i][i_63_], 262144);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.F(" + i + ',' + i_63_ + ',' + bool + ')');
		}
	}

	Class74(int i, int i_64_) {
		try {
			anInt1441 = i;
			anInt1454 = i_64_;
			anInt1452 = 0;
			anInt1447 = 0;
			this.clippingFlags = new int[anInt1441][anInt1454];
			method530(63);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qf.<init>(" + i + ',' + i_64_ + ')');
		}
	}

	static {
		Class74.anIntArray1435 = new int[32];
		Class74.aClass19_1437 = Class74.aClass19_1446;
		Class74.aClass19_1443 = RSString.createRSString(" more options");
		Class74.anInt1451 = 0;
		Class74.aClass19_1453 = Class74.aClass19_1443;
		Class74.aBool1448 = false;
		int i = 2;
		for (int i_65_ = 0; i_65_ < 32; i_65_++) {
			Class74.anIntArray1435[i_65_] = i - 1;
			i += i;
		}
		Class74.aClass19_1465 = RSString.createRSString("Lade Benutzeroberfl-=che )2 ");
		Class74.aClass38_Sub6_1463 = null;
		Class74.aClass19_1464 = RSString.createRSString("Clientscript error )2 check log for details");
		Class74.aClass19_1466 = RSString.createRSString("skill)2");
		Class74.aClass19_1462 = RSString.createRSString("Lade Wordpack )2 ");
		Class74.aClass19_1469 = Class74.aClass19_1466;
		Class74.aClass19_1471 = RSString.createRSString("sl_button");
	}
}
