package com.javatar.jagex;/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class Class16 {
	private long aLong308 = -1L;
	private byte[] aByteArray310;
	private static RSString aClass19_311 = RSString.createRSString(" from your ignore list first");
	private int anInt313;
	static RSString aClass19_314 = RSString.createRSString("Verbindung abgebrochen)3");
	private long aLong315;
	private long aLong316 = -1L;
	private long aLong317;
	static RSString aClass19_319 = Class16.aClass19_311;
	static int anInt320 = 0;
	private byte[] aByteArray321;
	static short[][] aShortArrayArray322;
	private long aLong329;
	private int anInt331 = 0;
	static RSString aClass19_332 = RSString.createRSString("Cabbage");
	static Class16 aClass16_333;
	private long aLong334;
	private Class63 aClass63_335;
	static int anInt339;
	static RSString aClass19_341;

	final long method87(int i) {
		try {
			if (i != 31274)
				Class16.method90(57, -31);
			return aLong329;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.E(" + i + ')');
		}
	}

	final void method88(byte[] is, byte i, int i_0_, int i_1_) throws IOException {
		try {
			try {
				if (i_0_ + aLong315 > aLong329)
					aLong329 = aLong315 - -(long) i_0_;
				if (i != 90)
					aByteArray310 = null;
				if (aLong316 != -1L && (aLong316 > aLong315 || aLong315 > anInt331 + aLong316))
					method94(123);
				if (aLong316 != -1L && i_0_ + aLong315 > aByteArray310.length + aLong316) {
					int i_2_ = (int) (aByteArray310.length - -aLong316 - aLong315);
					i_0_ -= i_2_;
					Class71.method510(is, i_1_, aByteArray310, (int) (aLong315 + -aLong316), i_2_);
					aLong315 += i_2_;
					i_1_ += i_2_;
					anInt331 = aByteArray310.length;
					method94(i + 24);
				}
				if (i_0_ > aByteArray310.length) {
					if (aLong317 != aLong315) {
						aClass63_335.method467((byte) 127, aLong315);
						aLong317 = aLong315;
					}
					aClass63_335.method470(is, i - 206, i_1_, i_0_);
					long l = -1L;
					aLong317 += i_0_;
					long l_3_ = -1L;
					if (aLong315 >= aLong308 && anInt313 + aLong308 > aLong315)
						l = aLong315;
					else if (aLong308 >= aLong315 && i_0_ + aLong315 > aLong308)
						l = aLong308;
					if (aLong308 < aLong315 - -(long) i_0_ && aLong308 + anInt313 >= aLong315 + i_0_)
						l_3_ = i_0_ + aLong315;
					else if (anInt313 + aLong308 > aLong315 && anInt313 + aLong308 <= i_0_ + aLong315)
						l_3_ = anInt313 + aLong308;
					if (aLong334 < aLong317)
						aLong334 = aLong317;
					if (l > -1L && l < l_3_) {
						int i_4_ = (int) (l_3_ - l);
						Class71.method510(is, (int) (l + i_1_ - aLong315), aByteArray321, (int) (l + -aLong308), i_4_);
					}
					aLong315 += i_0_;
				} else if (i_0_ > 0) {
					if (aLong316 == -1L)
						aLong316 = aLong315;
					Class71.method510(is, i_1_, aByteArray310, (int) (aLong315 + -aLong316), i_0_);
					aLong315 += i_0_;
					if (-aLong316 + aLong315 > anInt331)
						anInt331 = (int) (-aLong316 + aLong315);
				}
			} catch (IOException ioexception) {
				aLong317 = -1L;
				throw ioexception;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.F(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ')');
		}
	}

	static final void method89(int i, byte i_5_) {
		try {
			Class38_Sub18.anInt2214 = i;
			if (i_5_ != 55)
				Class16.aClass19_341 = null;
			Class13.anInt247 = -1;
			Class38_Sub1.anInt1741 = 1;
			Class38_Sub20_Sub8.aClass17_2872 = null;
			Class38_Sub20_Sub14.anInt3039 = 0;
			Class38_Sub20_Sub13.aBool3017 = false;
			Class61.anInt1335 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.D(" + i + ',' + i_5_ + ')');
		}
	}

	static final Class38_Sub20_Sub8 method90(int i, int i_6_) {
		try {
			Class38_Sub20_Sub8 class38_sub20_sub8 = (Class38_Sub20_Sub8) Class81.aClass83_1622.method591(-28825, i_6_);
			if (class38_sub20_sub8 != null)
				return class38_sub20_sub8;
			if (i != -1)
				Class16.method98(-42);
			byte[] is = Class41.aClass17_933.getFileData(1, i_6_, -128);
			class38_sub20_sub8 = new Class38_Sub20_Sub8();
			if (is != null)
				class38_sub20_sub8.method953(false, i_6_, new RS2Buffer(is));
			class38_sub20_sub8.method954((byte) 116);
			Class81.aClass83_1622.method590(i_6_, (byte) -122, class38_sub20_sub8);
			return class38_sub20_sub8;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.B(" + i + ',' + i_6_ + ')');
		}
	}

	private final File method91(int i) {
		try {
			if (i != 0)
				return null;
			return aClass63_335.method466(-92);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.J(" + i + ')');
		}
	}

	final void method92(int i) throws IOException {
		do {
			try {
				method94(i ^ ~0x3fdd);
				aClass63_335.method471(0);
				if (i == -16279)
					break;
				Class16.method89(-81, (byte) 26);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "vf.I(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method93(int i, int i_7_, byte[] is, int i_8_) throws IOException {
		try {
			try {
				if (i + i_8_ > is.length)
					throw new ArrayIndexOutOfBoundsException(i + i_8_ - is.length);
				if (aLong316 != -1L && aLong315 >= aLong316 && aLong316 + anInt331 >= i + aLong315) {
					Class71.method510(aByteArray310, (int) (aLong315 - aLong316), is, i_8_, i);
					aLong315 += i;
					return;
				}
				if (i_7_ != 7975)
					return;
				long l = aLong315;
				int i_9_ = i_8_;
				int i_10_ = i;
				if (aLong315 >= aLong308 && anInt313 + aLong308 > aLong315) {
					int i_11_ = (int) (aLong308 + -aLong315 + anInt313);
					if (i_11_ > i)
						i_11_ = i;
					i -= i_11_;
					Class71.method510(aByteArray321, (int) (-aLong308 + aLong315), is, i_8_, i_11_);
					i_8_ += i_11_;
					aLong315 += i_11_;
				}
				if (i <= aByteArray321.length) {
					if (i > 0) {
						method96((byte) 79);
						int i_12_ = i;
						if (i_12_ > anInt313)
							i_12_ = anInt313;
						Class71.method510(aByteArray321, 0, is, i_8_, i_12_);
						i -= i_12_;
						aLong315 += i_12_;
						i_8_ += i_12_;
					}
				} else {
					aClass63_335.method467((byte) 127, aLong315);
					aLong317 = aLong315;
					while (i > 0) {
						int i_13_ = aClass63_335.method468(i_8_, is, -19789, i);
						if (i_13_ == -1)
							break;
						i_8_ += i_13_;
						i -= i_13_;
						aLong317 += i_13_;
						aLong315 += i_13_;
					}
				}
				if (aLong316 != -1L) {
					if (aLong315 < aLong316 && i > 0) {
						int i_14_ = (int) (-aLong315 + aLong316) + i_8_;
						if (i_14_ > i + i_8_)
							i_14_ = i_8_ + i;
						while (i_8_ < i_14_) {
							i--;
							is[i_8_++] = (byte) 0;
							aLong315++;
						}
					}
					long l_15_ = -1L;
					if (l >= anInt331 + aLong316 || anInt331 + aLong316 > i_10_ + l) {
						if (aLong316 < l + i_10_ && l + i_10_ <= aLong316 + anInt331)
							l_15_ = i_10_ + l;
					} else
						l_15_ = anInt331 + aLong316;
					long l_16_ = -1L;
					if (aLong316 < l || i_10_ + l <= aLong316) {
						if (aLong316 <= l && aLong316 - -(long) anInt331 > l)
							l_16_ = l;
					} else
						l_16_ = aLong316;
					if (l_16_ > -1L && l_16_ < l_15_) {
						int i_17_ = (int) (-l_16_ + l_15_);
						Class71.method510(aByteArray310, (int) (-aLong316 + l_16_), is, i_9_ + (int) (l_16_ - l), i_17_);
						if (aLong315 < l_15_) {
							i -= l_15_ - aLong315;
							aLong315 = l_15_;
						}
					}
				}
			} catch (IOException ioexception) {
				aLong317 = -1L;
				throw ioexception;
			}
			if (i > 0)
				throw new EOFException();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.H(" + i + ',' + i_7_ + ',' + (is != null ? "{...}" : "null") + ',' + i_8_ + ')');
		}
	}

	private final void method94(int i) throws IOException {
		do {
			try {
				if (aLong316 != -1L) {
					long l = -1L;
					if (aLong317 != aLong316) {
						aClass63_335.method467((byte) 123, aLong316);
						aLong317 = aLong316;
					}
					aClass63_335.method470(aByteArray310, 122, 0, anInt331);
					if (aLong308 <= aLong316 && aLong316 < anInt313 + aLong308)
						l = aLong316;
					else if (aLong308 >= aLong316 && aLong308 < aLong316 - -(long) anInt331)
						l = aLong308;
					aLong317 += anInt331;
					if (aLong334 < aLong317)
						aLong334 = aLong317;
					long l_18_ = -1L;
					if (anInt331 + aLong316 <= aLong308 || aLong308 + anInt313 < aLong316 + anInt331) {
						if (aLong316 < aLong308 - -(long) anInt313 && anInt313 + aLong308 <= aLong316 - -(long) anInt331)
							l_18_ = anInt313 + aLong308;
					} else
						l_18_ = anInt331 + aLong316;
					if (l > -1L && l_18_ > l) {
						int i_19_ = (int) (-l + l_18_);
						Class71.method510(aByteArray310, (int) (l - aLong316), aByteArray321, (int) (-aLong308 + l), i_19_);
					}
					aLong316 = -1L;
					anInt331 = 0;
				}
				if (i >= 21)
					break;
				Class16.method90(-30, 94);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "vf.M(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method95(byte[] is, int i) throws IOException {
		try {
			method93(is.length, 7975, is, i);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.A(" + (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method96(byte i) throws IOException {
		try {
			anInt313 = 0;
			int i_20_ = -29 % ((-75 - i) / 45);
			if (aLong317 != aLong315) {
				aClass63_335.method467((byte) 126, aLong315);
				aLong317 = aLong315;
			}
			aLong308 = aLong315;
			while (anInt313 < aByteArray321.length) {
				int i_21_ = aClass63_335.method468(anInt313, aByteArray321, -19789, -anInt313 + aByteArray321.length);
				if (i_21_ == -1)
					break;
				anInt313 += i_21_;
				aLong317 += i_21_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.L(" + i + ')');
		}
	}

	final void method97(byte i, long l) throws IOException {
		try {
			if (l < 0L)
				throw new IOException("Invalid seek to " + l + " in file " + method91(0));
			int i_22_ = -18 % ((i - 25) / 60);
			aLong315 = l;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.K(" + i + ',' + l + ')');
		}
	}

	public static void method98(int i) {
		try {
			Class16.aClass16_333 = null;
			Class16.aClass19_314 = null;
			Class16.aClass19_332 = null;
			Class16.aShortArrayArray322 = null;
			Class16.aClass19_319 = null;
			if (i > 36) {
				Class16.aClass19_341 = null;
				Class16.aClass19_311 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.N(" + i + ')');
		}
	}

	static final void method99(RSString class19, int i) {
		try {
			if (Class32.anInt772 >= 2) {
				if (class19.method174((byte) 105, Class81.aClass19_1626))
					System.gc();
				if (class19.method174((byte) 126, Class23.aClass19_555))
					Client.dropClient();
				if (class19.method174((byte) 117, Class24.aClass19_567))
					Class13.aBool246 = true;
				if (class19.method174((byte) 112, Class79.aClass19_1565))
					Class13.aBool246 = false;
				if (class19.method174((byte) 126, Class64.aClass19_1362))
					for (int i_23_ = 0; i_23_ < 4; i_23_++)
						for (int i_24_ = 1; i_24_ < 103; i_24_++)
							for (int i_25_ = 1; i_25_ < 103; i_25_++)
								Client.clippingHeights[i_23_].clippingFlags[i_24_][i_25_] = 0;
				if (class19.method174((byte) 119, Class2_Sub1.aClass19_2006) && Player.anInt3582 == 2)
					throw new RuntimeException();
				if (class19.method165(Class45.aClass19_1022, true)) {
					Class38_Sub14.anInt2139 = class19.method171((byte) -15, 12).method178(-91).method164(48);
					Class62.method464((byte) 98, Class9.method43(new RSString[] { Class83.aClass19_1651, RuntimeException_Sub1.method1098(Class38_Sub14.anInt2139, 0) }, (byte) -20), 0, null);
				}
				if (class19.method174((byte) 102, Class38_Sub20_Sub10.aClass19_2909))
					Node.aBool892 = true;
			}
			Client.outputBuffer.putOpcode(89);
			if (i < -16) {
				Client.outputBuffer.putByte(class19.method143((byte) 24) - 1);
				Client.outputBuffer.method742(class19.method171((byte) -58, 2), (byte) 115);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.C(" + (class19 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method100(int i) {
		try {
			if (i != 7965)
				Class16.method90(-70, 120);
			boolean bool = false;
			while (!bool) {
				bool = true;
				for (int i_26_ = 0; i_26_ < Class72.anInt1417 - 1; i_26_++)
					if (Class17_Sub1.anIntArray1709[i_26_] < 1000 && Class17_Sub1.anIntArray1709[i_26_ + 1] > 1000) {
						RSString class19 = Class37.aClass19Array865[i_26_];
						bool = false;
						Class37.aClass19Array865[i_26_] = Class37.aClass19Array865[i_26_ + 1];
						Class37.aClass19Array865[i_26_ + 1] = class19;
						RSString class19_27_ = Class10.aClass19Array194[i_26_];
						Class10.aClass19Array194[i_26_] = Class10.aClass19Array194[i_26_ + 1];
						Class10.aClass19Array194[i_26_ + 1] = class19_27_;
						int i_28_ = Class17_Sub1.anIntArray1709[i_26_];
						Class17_Sub1.anIntArray1709[i_26_] = Class17_Sub1.anIntArray1709[i_26_ + 1];
						Class17_Sub1.anIntArray1709[i_26_ + 1] = i_28_;
						i_28_ = Class38_Sub20_Sub13.anIntArray3015[i_26_];
						Class38_Sub20_Sub13.anIntArray3015[i_26_] = Class38_Sub20_Sub13.anIntArray3015[i_26_ + 1];
						Class38_Sub20_Sub13.anIntArray3015[i_26_ + 1] = i_28_;
						i_28_ = Class15.anIntArray284[i_26_];
						Class15.anIntArray284[i_26_] = Class15.anIntArray284[i_26_ + 1];
						Class15.anIntArray284[i_26_ + 1] = i_28_;
						i_28_ = Class50.anIntArray1107[i_26_];
						Class50.anIntArray1107[i_26_] = Class50.anIntArray1107[i_26_ + 1];
						Class50.anIntArray1107[i_26_ + 1] = i_28_;
					}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.G(" + i + ')');
		}
	}

	Class16(Class63 class63, int i, int i_29_) throws IOException {
		try {
			aClass63_335 = class63;
			aLong329 = aLong334 = class63.method469(82);
			aLong315 = 0L;
			aByteArray310 = new byte[i_29_];
			aByteArray321 = new byte[i];
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "vf.<init>(" + (class63 != null ? "{...}" : "null") + ',' + i + ',' + i_29_ + ')');
		}
	}

	static {
		Client.coordCounter = 0;
		Class16.aShortArrayArray322 = new short[][] { new short[0], { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 }, new short[0], new short[0], new short[0] };
		Class16.aClass19_341 = RSString.createRSString(":");
	}
}
