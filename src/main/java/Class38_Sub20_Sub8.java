/* Class38_Sub20_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub8 extends NodeSub {
	static int anInt2855 = 2;
	static int anInt2857 = 0;
	int anInt2858;
	private int anInt2859 = 0;
	int anInt2860;
	static RSString aClass19_2862;
	static Class14 aClass14_2863;
	static int anInt2864 = 0;
	static RSString aClass19_2865;
	static RSString aClass19_2868;
	static RSString aClass19_2869;
	static RSString aClass19_2871 = RSString.createRSString(": ");
	static Class17 aClass17_2872;
	static int[] anIntArray2873;
	static RSString aClass19_2875;
	int anInt2876;
	static Class38_Sub6 aClass38_Sub6_2877;
	int anInt2878;
	private static RSString aClass19_2881;
	private static RSString aClass19_2882;
	static int anInt2883;

	static final int method949(int i, int i_0_, int i_1_, int i_2_) {
		try {
			if ((Class82.aByteArrayArrayArray1648[i][i_2_][i_1_] & 0x8) != 0)
				return 0;
			if (i > 0 && (Class82.aByteArrayArrayArray1648[1][i_2_][i_1_] & 0x2) != 0)
				return i - 1;
			if (i_0_ < 107)
				return 96;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ee.E(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')');
		}
	}

	private final void method950(int i, boolean bool) {
		try {
			double d = ((i & 0xff3da0) >> -760862320) / 256.0;
			double d_3_ = ((i & 0xff58) >> 1788380968) / 256.0;
			double d_4_ = d;
			if (d_3_ < d_4_)
				d_4_ = d_3_;
			double d_5_ = (i & 0xff) / 256.0;
			double d_6_ = 0.0;
			double d_7_ = d;
			double d_8_ = 0.0;
			if (d_3_ > d_7_)
				d_7_ = d_3_;
			if (d_5_ > d_7_)
				d_7_ = d_5_;
			if (d_5_ < d_4_)
				d_4_ = d_5_;
			double d_9_ = (d_7_ + d_4_) / 2.0;
			this.anInt2858 = (int) (d_9_ * 256.0);
			if (this.anInt2858 >= 0) {
				if (this.anInt2858 > 255)
					this.anInt2858 = 255;
			} else
				this.anInt2858 = 0;
			if (d_4_ != d_7_) {
				if (d_9_ < 0.5)
					d_6_ = (-d_4_ + d_7_) / (d_4_ + d_7_);
				if (d_7_ != d) {
					if (d_7_ != d_3_) {
						if (d_5_ == d_7_)
							d_8_ = (d - d_3_) / (-d_4_ + d_7_) + 4.0;
					} else
						d_8_ = (d_5_ - d) / (-d_4_ + d_7_) + 2.0;
				} else
					d_8_ = (-d_5_ + d_3_) / (-d_4_ + d_7_);
				if (d_9_ >= 0.5)
					d_6_ = (d_7_ - d_4_) / (2.0 - d_7_ - d_4_);
			}
			if (d_9_ > 0.5)
				this.anInt2878 = (int) ((-d_9_ + 1.0) * d_6_ * 512.0);
			else
				this.anInt2878 = (int) (d_9_ * d_6_ * 512.0);
			this.anInt2860 = (int) (d_6_ * 256.0);
			if (this.anInt2860 >= 0) {
				if (this.anInt2860 > 255)
					this.anInt2860 = 255;
			} else
				this.anInt2860 = 0;
			if (bool != true)
				this.anInt2860 = 36;
			d_8_ /= 6.0;
			if (this.anInt2878 < 1)
				this.anInt2878 = 1;
			this.anInt2876 = (int) (d_8_ * this.anInt2878);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ee.J(" + i + ',' + bool + ')');
		}
	}

	static final void method951(int i, Class38_Sub6 class38_sub6) {
		try {
			if (i != 1)
				Class38_Sub20_Sub8.aClass19_2862 = null;
			int i_10_ = class38_sub6.anInt1958;
			if (i_10_ == 324) {
				if (Player.anInt3569 == -1) {
					Class38_Sub20_Sub15.anInt3070 = class38_sub6.anInt1957;
					Player.anInt3569 = class38_sub6.anInt1932;
				}
				if (Class38_Sub20_Sub15.aClass18_3072.aBool410)
					class38_sub6.anInt1932 = Player.anInt3569;
				else
					class38_sub6.anInt1932 = Class38_Sub20_Sub15.anInt3070;
			} else if (i_10_ == 325) {
				if (Player.anInt3569 == -1) {
					Player.anInt3569 = class38_sub6.anInt1932;
					Class38_Sub20_Sub15.anInt3070 = class38_sub6.anInt1957;
				}
				if (!Class38_Sub20_Sub15.aClass18_3072.aBool410)
					class38_sub6.anInt1932 = Player.anInt3569;
				else
					class38_sub6.anInt1932 = Class38_Sub20_Sub15.anInt3070;
			} else if (i_10_ == 327) {
				class38_sub6.anInt1925 = 150;
				class38_sub6.anInt1987 = (int) (Math.sin(Class45.anInt1016 / 40.0) * 256.0) & 0x7ff;
				class38_sub6.anInt1883 = 5;
				class38_sub6.anInt1962 = 0;
			} else if (i_10_ == 328) {
				class38_sub6.anInt1925 = 150;
				class38_sub6.anInt1987 = (int) (Math.sin(Class45.anInt1016 / 40.0) * 256.0) & 0x7ff;
				class38_sub6.anInt1883 = 5;
				class38_sub6.anInt1962 = 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ee.I(" + i + ',' + (class38_sub6 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method952(boolean bool) {
		try {
			Class38_Sub20_Sub8.aClass19_2865 = null;
			Class38_Sub20_Sub8.aClass17_2872 = null;
			Class38_Sub20_Sub8.aClass19_2875 = null;
			Class38_Sub20_Sub8.anIntArray2873 = null;
			Class38_Sub20_Sub8.aClass19_2882 = null;
			if (bool == true) {
				Class38_Sub20_Sub8.aClass19_2862 = null;
				Class38_Sub20_Sub8.aClass19_2871 = null;
				Class38_Sub20_Sub8.aClass19_2881 = null;
				Class38_Sub20_Sub8.aClass19_2869 = null;
				Class38_Sub20_Sub8.aClass38_Sub6_2877 = null;
				Class38_Sub20_Sub8.aClass14_2863 = null;
				Class38_Sub20_Sub8.aClass19_2868 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ee.F(" + bool + ')');
		}
	}

	final void method953(boolean bool, int i, RS2Buffer class38_sub23) {
		try {
			if (bool)
				Class38_Sub20_Sub8.anInt2857 = 81;
			for (;;) {
				int i_11_ = class38_sub23.getUByte();
				if (i_11_ == 0)
					break;
				method956(i, 114, class38_sub23, i_11_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ee.L(" + bool + ',' + i + ',' + (class38_sub23 != null ? "{...}" : "null") + ')');
		}
	}

	final void method954(byte i) {
		try {
			if (i < 115)
				Class38_Sub20_Sub8.aClass19_2869 = null;
			method950(anInt2859, true);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ee.G(" + i + ')');
		}
	}

	static final int method955(boolean bool, boolean bool_12_, int i) {
		try {
			if (i != -20683)
				Class38_Sub20_Sub8.anInt2864 = 7;
			int i_13_ = 0;
			if (bool)
				i_13_ += Class15.anInt291 + Class78.anInt1561;
			if (bool_12_)
				i_13_ += Class20.anInt502 + RS2Buffer.anInt2406;
			return i_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ee.H(" + bool + ',' + bool_12_ + ',' + i + ')');
		}
	}

	private final void method956(int i, int i_14_, RS2Buffer class38_sub23, int i_15_) {
		do {
			try {
				int i_16_ = -67 % ((i_14_ - 25) / 35);
				if (i_15_ != 1)
					break;
				anInt2859 = class38_sub23.method738((byte) 85);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ee.K(" + i + ',' + i_14_ + ',' + (class38_sub23 != null ? "{...}" : "null") + ',' + i_15_ + ')');
			}
			break;
		} while (false);
	}

	public Class38_Sub20_Sub8() {
		/* empty */
	}

	static {
		Class38_Sub20_Sub8.aClass19_2865 = RSString.createRSString("<col=ffffff> )4 ");
		Class38_Sub20_Sub8.aClass19_2862 = RSString.createRSString("Konfig geladen)3");
		Class38_Sub20_Sub8.aClass19_2868 = RSString.createRSString("(U0a )2 in: ");
		Class38_Sub20_Sub8.aClass19_2881 = RSString.createRSString("Location");
		Class38_Sub20_Sub8.anInt2883 = 0;
		Class38_Sub20_Sub8.aClass19_2882 = RSString.createRSString("OFF");
		Class38_Sub20_Sub8.aClass19_2869 = Class38_Sub20_Sub8.aClass19_2882;
		Class38_Sub20_Sub8.aClass19_2875 = Class38_Sub20_Sub8.aClass19_2881;
		Class38_Sub20_Sub8.aClass14_2863 = new Class14(32);
	}
}
