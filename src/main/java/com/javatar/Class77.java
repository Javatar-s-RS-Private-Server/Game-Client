package com.javatar;/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

class Class77 {
	static int anInt1505;
	static RSString aClass19_1508 = RSString.createRSString(":tradereq:");
	static RSString aClass19_1510;
	static int[] anIntArray1512;
	static RSString aClass19_1514;
	static int anInt1518;
	static int anInt1519;
	static RSString aClass19_1520 = RSString.createRSString("Zu viele Verbindungen von Ihrer Adresse)3");
	static RSString aClass19_1528;
	static int[] anIntArray1531;
	private static RSString aClass19_1511;

	static {
		Class77.anInt1505 = 127;
		Class77.aClass19_1528 = RSString.createRSString("l");
		Class77.aClass19_1514 = RSString.createRSString("gleiten:");
		Class77.anIntArray1531 = new int[50];
		Class77.anInt1519 = 0;
		Class77.anIntArray1512 = new int[5];
		Class77.aClass19_1511 = RSString.createRSString(" ");
		Class77.aClass19_1510 = Class77.aClass19_1511;
	}

	private final int anInt1525 = 32;
	private final Class38_Sub10[] aClass38_Sub10Array1535;
	private final Class38_Sub10[] aClass38_Sub10Array1541;
	int[] anIntArray1515;
	int anInt1538;
	int anInt1539;
	private Class38_Sub10 aClass38_Sub10_1524;
	private long aLong1527 = Class9.method48((byte) -105);
	private boolean aBool1532;
	private long aLong1533 = 0L;
	private int anInt1534;
	private int anInt1536;
	private long aLong1537;
	private int anInt1540;
	private int anInt1542;
	private int anInt1543;

	public Class77() {
		aBool1532 = true;
		aClass38_Sub10Array1535 = new Class38_Sub10[8];
		anInt1534 = 0;
		anInt1540 = 0;
		aLong1537 = 0L;
		anInt1543 = 0;
		anInt1542 = 0;
		aClass38_Sub10Array1541 = new Class38_Sub10[8];
	}

	static final void method551(RSString class19, RSString class19_16_, RSString class19_17_) {
		try {
			Class51.aClass19_1126 = class19_17_;
			Class51.aClass19_1138 = class19;
			if (false)
				Class77.aClass19_1520 = null;
			Class51.aClass19_1124 = class19_16_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qc.F(" + false + ',' + (class19 != null ? "{...}" : "null") + ',' + (class19_16_ != null ? "{...}" : "null") + ',' + (class19_17_ != null ? "{...}" : "null") + ')');
		}
	}

	public static void method559(boolean bool) {
		try {
			Class77.aClass19_1514 = null;
			Class77.aClass19_1510 = null;
			Class77.anIntArray1512 = null;
			if (bool) {
				Class77.aClass19_1511 = null;
				Class77.anIntArray1531 = null;
				Class77.aClass19_1520 = null;
				Class77.aClass19_1528 = null;
				Class77.aClass19_1508 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qc.N(" + bool + ')');
		}
	}

	final synchronized void method548(byte i) {
		try {
			int i_0_ = -110 / ((i + 18) / 35);
			if (Class40.aClass21_916 != null) {
				boolean bool = true;
				for (int i_1_ = 0; i_1_ < 2; i_1_++) {
					if (this == Class40.aClass21_916.aClass77Array511[i_1_])
						Class40.aClass21_916.aClass77Array511[i_1_] = null;
					if (Class40.aClass21_916.aClass77Array511[i_1_] != null)
						bool = false;
				}
				if (bool) {
					Class40.aClass21_916.aBool525 = true;
					while (Class40.aClass21_916.aBool521)
						Canvas_Sub1.method809(50L, -27166);
					Class40.aClass21_916 = null;
				}
			}
			method560();
			this.anIntArray1515 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qc.D(" + i + ')');
		}
	}

	private void method549(int[] is) {
		int i_2_ = 256;
		if (Class37.aBool880)
			i_2_ <<= 1;
		Class71.method511(is, 0, i_2_);
		anInt1542 -= 256;
		if (aClass38_Sub10_1524 != null && anInt1542 <= 0) {
			anInt1542 += Class38_Sub20_Sub7.anInt2852 >> 4;
			Class6.method35(aClass38_Sub10_1524);
			method563(aClass38_Sub10_1524, aClass38_Sub10_1524.method671());
			int i_3_ = 0;
			int i_4_ = 255;
			int i_5_ = 7;
			while_12_:
			while (i_4_ != 0) {
				int i_6_;
				int i_7_;
				if (i_5_ < 0) {
					i_6_ = i_5_ & 0x3;
					i_7_ = -(i_5_ >> 2);
				} else {
					i_6_ = i_5_;
					i_7_ = 0;
				}
				for (int i_8_ = i_4_ >>> i_6_ & 0x11111111; i_8_ != 0; i_8_ >>>= 4) {
					if ((i_8_ & 0x1) != 0) {
						i_4_ &= 1 << i_6_ ^ 0xffffffff;
						Class38_Sub10 class38_sub10 = null;
						Class38_Sub10 class38_sub10_9_ = aClass38_Sub10Array1535[i_6_];
						while (class38_sub10_9_ != null) {
							Class38_Sub16 class38_sub16 = class38_sub10_9_.aClass38_Sub16_2076;
							if (class38_sub16 != null && class38_sub16.anInt2183 > i_7_) {
								i_4_ |= 1 << i_6_;
								class38_sub10 = class38_sub10_9_;
								class38_sub10_9_ = class38_sub10_9_.aClass38_Sub10_2074;
							} else {
								class38_sub10_9_.aBool2077 = true;
								int i_10_ = class38_sub10_9_.method665();
								i_3_ += i_10_;
								if (class38_sub16 != null)
									class38_sub16.anInt2183 += i_10_;
								if (i_3_ >= anInt1525)
									break while_12_;
								Class38_Sub10 class38_sub10_11_ = class38_sub10_9_.method670();
								if (class38_sub10_11_ != null) {
									int i_12_ = class38_sub10_9_.anInt2075;
									for (/**/; class38_sub10_11_ != null; class38_sub10_11_ = class38_sub10_9_.method668())
										method563(class38_sub10_11_, i_12_ * class38_sub10_11_.method671() >> 8);
								}
								Class38_Sub10 class38_sub10_13_ = class38_sub10_9_.aClass38_Sub10_2074;
								class38_sub10_9_.aClass38_Sub10_2074 = null;
								if (class38_sub10 == null)
									aClass38_Sub10Array1535[i_6_] = class38_sub10_13_;
								else
									class38_sub10.aClass38_Sub10_2074 = class38_sub10_13_;
								if (class38_sub10_13_ == null)
									aClass38_Sub10Array1541[i_6_] = class38_sub10;
								class38_sub10_9_ = class38_sub10_13_;
							}
						}
					}
					i_6_ += 4;
					i_7_++;
				}
				i_5_--;
			}
			for (int i_14_ = 0; i_14_ < 8; i_14_++) {
				Class38_Sub10 class38_sub10 = aClass38_Sub10Array1535[i_14_];
				aClass38_Sub10Array1535[i_14_] = aClass38_Sub10Array1541[i_14_] = null;
				Class38_Sub10 class38_sub10_15_;
				for (/**/; class38_sub10 != null; class38_sub10 = class38_sub10_15_) {
					class38_sub10_15_ = class38_sub10.aClass38_Sub10_2074;
					class38_sub10.aClass38_Sub10_2074 = null;
				}
			}
		}
		if (anInt1542 < 0)
			anInt1542 = 0;
		if (aClass38_Sub10_1524 != null)
			aClass38_Sub10_1524.method667(is, 0, 256);
		aLong1527 = Class9.method48((byte) -34);
	}

	final synchronized void method550(Class38_Sub10 class38_sub10) {
		try {
			aClass38_Sub10_1524 = class38_sub10;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qc.J(" + (class38_sub10 != null ? "{...}" : "null") + ',' + 256000 + ')');
		}
	}

	final void method552() {
		try {
			aBool1532 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qc.G(" + true + ')');
		}
	}

	void method553(Component component) throws Exception {
		/* empty */
	}

	void method554(int i) throws Exception {
		/* empty */
	}

	void method555() throws Exception {
		/* empty */
	}

	final synchronized void method556() {
		try {
			if (0 != 0)
				Class77.aClass19_1510 = null;
			if (this.anIntArray1515 != null) {
				long l = Class9.method48((byte) -51);
				try {
					if (aLong1537 != 0L) {
						if (l < aLong1537)
							return;
						method554(this.anInt1539);
						aBool1532 = true;
						aLong1537 = 0L;
					}
					int i_18_ = method558();
					if (anInt1540 - i_18_ > anInt1543)
						anInt1543 = -i_18_ + anInt1540;
					int i_19_ = this.anInt1538 + anInt1536;
					if (i_19_ + 256 > 16384)
						i_19_ = 16128;
					if (this.anInt1539 < i_19_ + 256) {
						this.anInt1539 += 1024;
						if (this.anInt1539 > 16384)
							this.anInt1539 = 16384;
						i_18_ = 0;
						method560();
						method554(this.anInt1539);
						if (i_19_ + 256 > this.anInt1539) {
							i_19_ = this.anInt1539 - 256;
							anInt1536 = i_19_ - this.anInt1538;
						}
						aBool1532 = true;
					}
					while (i_19_ > i_18_) {
						i_18_ += 256;
						method549(this.anIntArray1515);
						method555();
					}
					if (l > aLong1533) {
						if (aBool1532)
							aBool1532 = false;
						else {
							if (anInt1543 == 0 && anInt1534 == 0) {
								method560();
								aLong1537 = l + 2000L;
								return;
							}
							anInt1536 = Math.min(anInt1534, anInt1543);
							anInt1534 = anInt1543;
						}
						aLong1533 = l + 2000L;
						anInt1543 = 0;
					}
					anInt1540 = i_18_;
				} catch (Exception exception) {
					method560();
					aLong1537 = l + 2000L;
				}
				try {
					if (aLong1527 - -500000L < l)
						l = aLong1527;
					for (/**/; aLong1527 + 5000L < l; aLong1527 += 256000 / Class38_Sub20_Sub7.anInt2852)
						method562();
				} catch (Exception exception) {
					aLong1527 = l;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qc.I(" + 0 + ')');
		}
	}

	final synchronized void method557() {
		try {
			aBool1532 = true;
			try {
				method561();
			} catch (Exception exception) {
				method560();
				aLong1537 = Class9.method48((byte) -85) - -2000L;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qc.O(" + true + ')');
		}
	}

	int method558() throws Exception {
		try {
			return this.anInt1539;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qc.C(" + ')');
		}
	}

	void method560() {
		/* empty */
	}

	void method561() throws Exception {
		/* empty */
	}

	private void method562() {
		do {
			try {
				if (13094 != 13094)
					anInt1534 = -15;
				anInt1542 -= 256;
				if (anInt1542 < 0)
					anInt1542 = 0;
				if (aClass38_Sub10_1524 == null)
					break;
				aClass38_Sub10_1524.method669(256);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "qc.K(" + 13094 + ',' + 256 + ')');
			}
			break;
		} while (false);
	}

	private void method563(Class38_Sub10 class38_sub10, int i_21_) {
		try {
			if (0 != 0)
				anInt1542 = 112;
			int i_22_ = i_21_ >> 5;
			Class38_Sub10 class38_sub10_23_ = aClass38_Sub10Array1541[i_22_];
			if (class38_sub10_23_ == null)
				aClass38_Sub10Array1535[i_22_] = class38_sub10;
			else
				class38_sub10_23_.aClass38_Sub10_2074 = class38_sub10;
			aClass38_Sub10Array1541[i_22_] = class38_sub10;
			class38_sub10.anInt2075 = i_21_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qc.A(" + 0 + ',' + (class38_sub10 != null ? "{...}" : "null") + ',' + i_21_ + ')');
		}
	}
}
