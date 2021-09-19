package com.javatar.jagex;/* Class17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class17_Sub1 extends Class17 {
	static Class83 aClass83_1689 = new Class83(64);
	private volatile boolean aBool1692 = false;
	private int anInt1693;
	private int anInt1694;
	private int anInt1696;
	private int anInt1698;
	private Class48 aClass48_1699;
	private boolean aBool1702 = false;
	private Class48 aClass48_1703;
	static long[] aLongArray1704;
	static Class17 aClass17_1706;
	static Class16 aClass16_1707;
	static RSString aClass19_1708;
	static int[] anIntArray1709;
	static int anInt1710;
	private static RSString aClass19_1711 = RSString.createRSString("M");
	static volatile int anInt1712 = -1;
	static int anInt1713;
	private volatile boolean[] aBoolArray1715;
	static RSString aClass19_1716 = Class17_Sub1.aClass19_1711;
	static boolean[] aBoolArray1717;
	static RSString aClass19_1719;
	static RSString aClass19_1720;

	final void method597(boolean bool, int i, boolean bool_0_, boolean bool_1_, byte[] is) {
		do {
			try {
				if (bool_0_) {
					if (aBool1692)
						throw new RuntimeException();
					if (aClass48_1703 != null)
						Class21.method194(aClass48_1703, anInt1693, is, -31194);
					method112(is, -14702);
					method603(-93);
				} else {
					is[is.length - 2] = (byte) (((Class17) this).anIntArray349[i] >> 897989704);
					is[is.length - 1] = (byte) ((Class17) this).anIntArray349[i];
					if (aClass48_1699 != null) {
						Class21.method194(aClass48_1699, i, is, -31194);
						aBoolArray1715[i] = true;
					}
					if (bool)
						((Class17) this).anObjectArray346[i] = Class38_Sub18.method697(-127, is, false);
				}
				if (!bool_1_)
					break;
				aClass48_1703 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ga.G(" + bool + ',' + i + ',' + bool_0_ + ',' + bool_1_ + ',' + (is != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method108(byte i, int i_2_) {
		do {
			try {
				PlayerAppearance.method129(68, anInt1693, i_2_);
				if (i == -99)
					break;
				Class17_Sub1.method604(-12, -99);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ga.C(" + i + ',' + i_2_ + ')');
			}
			break;
		} while (false);
	}

	final void method598(int i, int i_3_, int i_4_) {
		try {
			anInt1696 = i;
			anInt1698 = i_3_;
			if (i_4_ != 16782)
				method598(30, 27, -77);
			if (aClass48_1703 == null)
				Class61.method458(true, (byte) -106, (byte) 0, anInt1693, 255, this, anInt1698);
			else
				Class28.method271(i_4_ - 16667, anInt1693, this, aClass48_1703);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ga.D(" + i + ',' + i_3_ + ',' + i_4_ + ')');
		}
	}

	Class17_Sub1(Class48 class48, Class48 class48_5_, int i, boolean bool, boolean bool_6_, boolean bool_7_) {
		super(bool, bool_6_);
		anInt1694 = -1;
		try {
			aClass48_1703 = class48_5_;
			aClass48_1699 = class48;
			aBool1702 = bool_7_;
			anInt1693 = i;
			Class9.method46(anInt1693, this, 20538);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ga.<init>(" + (class48 != null ? "{...}" : "null") + ',' + (class48_5_ != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + bool_6_ + ',' + bool_7_ + ')');
		}
	}

	public static void method599(byte i) {
		try {
			Class17_Sub1.aBoolArray1717 = null;
			Class17_Sub1.aClass19_1720 = null;
			Client.outputBuffer = null;
			Class17_Sub1.aClass16_1707 = null;
			Class17_Sub1.aClass83_1689 = null;
			Class17_Sub1.anIntArray1709 = null;
			Class17_Sub1.aClass19_1711 = null;
			Class17_Sub1.aClass17_1706 = null;
			Class17_Sub1.aClass19_1708 = null;
			Class17_Sub1.aClass19_1716 = null;
			if (i < -68) {
				Class17_Sub1.aClass19_1719 = null;
				Class17_Sub1.aLongArray1704 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ga.H(" + i + ')');
		}
	}

	final int method600(int i) {
		try {
			if (aBool1692)
				return 100;
			if (((Class17) this).anObjectArray346 != null)
				return 99;
			if (i != 20181)
				Class17_Sub1.method604(-89, -15);
			int i_8_ = ItemDefinition.method933(anInt1693, 255, (byte) 75);
			if (i_8_ >= 100)
				i_8_ = 99;
			return i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ga.B(" + i + ')');
		}
	}

	private final int method601(byte i, int i_9_) {
		try {
			if (((Class17) this).anObjectArray346[i_9_] != null)
				return 100;
			int i_10_ = 71 / ((i + 49) / 33);
			if (aBoolArray1715[i_9_])
				return 100;
			return ItemDefinition.method933(i_9_, anInt1693, (byte) 75);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ga.K(" + i + ',' + i_9_ + ')');
		}
	}

	final void method602(boolean bool, boolean bool_11_, byte[] is, int i, Class48 class48) {
		try {
			if (bool)
				method603(55);
			if (aClass48_1703 != class48) {
				if (!bool_11_ && i == anInt1694)
					aBool1692 = true;
				if (is == null || is.length <= 2) {
					aBoolArray1715[i] = false;
					if (aBool1702 || bool_11_)
						Class61.method458(bool_11_, (byte) -128, (byte) 2, i, anInt1693, this, ((Class17) this).anIntArray368[i]);
				} else {
					Class48.aCRC32_1075.reset();
					Class48.aCRC32_1075.update(is, 0, is.length - 2);
					int i_12_ = (int) Class48.aCRC32_1075.getValue();
					int i_13_ = (is[is.length - 1] & 0xff) + (is[is.length - 2] << -859535768 & 0xff00);
					if (((Class17) this).anIntArray368[i] != i_12_ || ((Class17) this).anIntArray349[i] != i_13_) {
						aBoolArray1715[i] = false;
						if (aBool1702 || bool_11_)
							Class61.method458(bool_11_, (byte) -126, (byte) 2, i, anInt1693, this, ((Class17) this).anIntArray368[i]);
					} else {
						aBoolArray1715[i] = true;
						if (bool_11_)
							((Class17) this).anObjectArray346[i] = Class38_Sub18.method697(67, is, false);
					}
				}
			} else {
				if (aBool1692)
					throw new RuntimeException();
				if (is == null)
					Class61.method458(true, (byte) -126, (byte) 0, anInt1693, 255, this, anInt1698);
				else {
					Class48.aCRC32_1075.reset();
					Class48.aCRC32_1075.update(is, 0, is.length);
					int i_14_ = (int) Class48.aCRC32_1075.getValue();
					RS2Buffer class38_sub23 = new RS2Buffer(Sequence.method912(31535, is));
					int i_15_ = class38_sub23.readUnsignedByte();
					if (i_15_ != 5 && i_15_ != 6)
						throw new RuntimeException("Incorrect JS5 protocol number: " + i_15_);
					int i_16_ = 0;
					if (i_15_ >= 6)
						i_16_ = class38_sub23.readInt(true);
					if (anInt1698 != i_14_ || i_16_ != anInt1696)
						Class61.method458(true, (byte) -117, (byte) 0, anInt1693, 255, this, anInt1698);
					else {
						method112(is, -14702);
						method603(-114);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ga.A(" + bool + ',' + bool_11_ + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + (class48 != null ? "{...}" : "null") + ')');
		}
	}

	private final void method603(int i) {
		do {
			try {
				aBoolArray1715 = new boolean[((Class17) this).anObjectArray346.length];
				for (int i_17_ = 0; aBoolArray1715.length > i_17_; i_17_++)
					aBoolArray1715[i_17_] = false;
				if (aClass48_1699 == null)
					aBool1692 = true;
				else {
					anInt1694 = -1;
					for (int i_18_ = 0; i_18_ < aBoolArray1715.length; i_18_++)
						if (((Class17) this).anIntArray352[i_18_] > 0) {
							Class38_Sub20_Sub12.method989(i_18_, false, aClass48_1699, this);
							anInt1694 = i_18_;
						}
					if (i >= -75)
						Class17_Sub1.aClass19_1719 = null;
					if (anInt1694 != -1)
						break;
					aBool1692 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ga.I(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method604(int i, int i_19_) {
		try {
			i--;
			if (i_19_ != -30310)
				Class17_Sub1.aClass19_1711 = null;
			i |= i >>> 237640193;
			i |= i >>> 1648254914;
			i |= i >>> -1534252700;
			i |= i >>> -1022364376;
			i |= i >>> 499535440;
			return i + 1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ga.E(" + i + ',' + i_19_ + ')');
		}
	}

	@Override
	final void method102(int i, int i_20_) {
		do {
			try {
				if (aClass48_1699 != null && aBoolArray1715 != null && aBoolArray1715[i])
					Class28.method271(i_20_ ^ 0x6b, i, this, aClass48_1699);
				else
					Class61.method458(true, (byte) -107, (byte) 2, i, anInt1693, this, ((Class17) this).anIntArray368[i]);
				if (i_20_ == 5)
					break;
				method605(89);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ga.J(" + i + ',' + i_20_ + ')');
			}
			break;
		} while (false);
	}

	final int method605(int i) {
		try {
			int i_21_ = 0;
			int i_22_ = i;
			for (int i_23_ = 0; i_23_ < ((Class17) this).anObjectArray346.length; i_23_++)
				if (((Class17) this).anIntArray352[i_23_] > 0) {
					i_21_ += method601((byte) -110, i_23_);
					i_22_ += 100;
				}
			if (i_22_ == 0)
				return 100;
			int i_24_ = i_21_ * 100 / i_22_;
			return i_24_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ga.F(" + i + ')');
		}
	}

	static {
		Class17_Sub1.anInt1710 = 0;
		Class17_Sub1.aClass19_1708 = RSString.createRSString("Sprites geladen)3");
		Class17_Sub1.aBoolArray1717 = new boolean[8];
		Class17_Sub1.anIntArray1709 = new int[500];
		Class17_Sub1.aLongArray1704 = new long[32];
		Class17_Sub1.aClass19_1720 = RSString.createRSString("http:)4)4www)3runescape)3com");
		Class17_Sub1.aClass19_1719 = Class17_Sub1.aClass19_1711;
	}
}
