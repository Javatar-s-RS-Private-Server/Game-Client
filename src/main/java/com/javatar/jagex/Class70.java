package com.javatar.jagex;/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class70 {
	private static byte[] aByteArray1397 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	private RS2Buffer aClass38_Sub23_1398;
	private long aLong1399;
	private int[] anIntArray1400;
	private int anInt1401;
	private int[] anIntArray1402;
	private int[] anIntArray1403;
	int anInt1404;
	int[] anIntArray1405;

	private final int method494(int i) {
		int i_0_ = aClass38_Sub23_1398.buffer[aClass38_Sub23_1398.pos];
		if (i_0_ < 0) {
			i_0_ &= 0xff;
			anIntArray1400[i] = i_0_;
			aClass38_Sub23_1398.pos++;
		} else
			i_0_ = anIntArray1400[i];
		if (i_0_ == 240 || i_0_ == 247) {
			int i_1_ = aClass38_Sub23_1398.method731(-1592222329);
			if (i_0_ == 247 && i_1_ > 0) {
				int i_2_ = aClass38_Sub23_1398.buffer[aClass38_Sub23_1398.pos] & 0xff;
				if (i_2_ >= 241 && i_2_ <= 243 || i_2_ == 246 || i_2_ == 248 || i_2_ >= 250 && i_2_ <= 252 || i_2_ == 254) {
					aClass38_Sub23_1398.pos++;
					anIntArray1400[i] = i_2_;
					return method496(i, i_2_);
				}
			}
			aClass38_Sub23_1398.pos += i_1_;
			return 0;
		}
		return method496(i, i_0_);
	}

	final void method495(int i) {
		anIntArray1402[i] = aClass38_Sub23_1398.pos;
	}

	private final int method496(int i, int i_3_) {
		if (i_3_ == 255) {
			int i_4_ = aClass38_Sub23_1398.readUnsignedByte();
			int i_5_ = aClass38_Sub23_1398.method731(-1592222329);
			if (i_4_ == 47) {
				aClass38_Sub23_1398.pos += i_5_;
				return 1;
			}
			if (i_4_ == 81) {
				int i_6_ = aClass38_Sub23_1398.method738((byte) 125);
				i_5_ -= 3;
				int i_7_ = this.anIntArray1405[i];
				aLong1399 += (long) i_7_ * (long) (anInt1401 - i_6_);
				anInt1401 = i_6_;
				aClass38_Sub23_1398.pos += i_5_;
				return 2;
			}
			aClass38_Sub23_1398.pos += i_5_;
			return 3;
		}
		byte i_8_ = Class70.aByteArray1397[i_3_ - 128];
		int i_9_ = i_3_;
		if (i_8_ >= 1)
			i_9_ |= aClass38_Sub23_1398.readUnsignedByte() << 8;
		if (i_8_ >= 2)
			i_9_ |= aClass38_Sub23_1398.readUnsignedByte() << 16;
		return i_9_;
	}

	final boolean method497() {
		if (aClass38_Sub23_1398.buffer == null)
			return false;
		return true;
	}

	public static void method498() {
		Class70.aByteArray1397 = null;
	}

	final void method499() {
		aClass38_Sub23_1398.buffer = null;
		anIntArray1403 = null;
		anIntArray1402 = null;
		this.anIntArray1405 = null;
		anIntArray1400 = null;
	}

	final boolean method500() {
		int i = anIntArray1402.length;
		for (int i_10_ = 0; i_10_ < i; i_10_++)
			if (anIntArray1402[i_10_] >= 0)
				return false;
		return true;
	}

	final int method501() {
		return anIntArray1402.length;
	}

	final long method502(int i) {
		return aLong1399 + (long) i * (long) anInt1401;
	}

	final void method503() {
		aClass38_Sub23_1398.pos = -1;
	}

	final int method504() {
		int i = anIntArray1402.length;
		int i_11_ = -1;
		int i_12_ = 2147483647;
		for (int i_13_ = 0; i_13_ < i; i_13_++)
			if (anIntArray1402[i_13_] >= 0 && this.anIntArray1405[i_13_] < i_12_) {
				i_11_ = i_13_;
				i_12_ = this.anIntArray1405[i_13_];
			}
		return i_11_;
	}

	final void method505(long l) {
		aLong1399 = l;
		int i = anIntArray1402.length;
		for (int i_14_ = 0; i_14_ < i; i_14_++) {
			this.anIntArray1405[i_14_] = 0;
			anIntArray1400[i_14_] = 0;
			aClass38_Sub23_1398.pos = anIntArray1403[i_14_];
			method506(i_14_);
			anIntArray1402[i_14_] = aClass38_Sub23_1398.pos;
		}
	}

	final void method506(int i) {
		int i_15_ = aClass38_Sub23_1398.method731(-1592222329);
		this.anIntArray1405[i] += i_15_;
	}

	final void method507(byte[] is) {
		aClass38_Sub23_1398.buffer = is;
		aClass38_Sub23_1398.pos = 10;
		int i = aClass38_Sub23_1398.readUnsignedShort();
		this.anInt1404 = aClass38_Sub23_1398.readUnsignedShort();
		anInt1401 = 500000;
		anIntArray1403 = new int[i];
		int i_16_ = 0;
		while (i_16_ < i) {
			int i_17_ = aClass38_Sub23_1398.readInt(true);
			int i_18_ = aClass38_Sub23_1398.readInt(true);
			if (i_17_ == 1297379947) {
				anIntArray1403[i_16_] = aClass38_Sub23_1398.pos;
				i_16_++;
			}
			aClass38_Sub23_1398.pos += i_18_;
		}
		aLong1399 = 0L;
		anIntArray1402 = new int[i];
		for (int i_19_ = 0; i_19_ < i; i_19_++)
			anIntArray1402[i_19_] = anIntArray1403[i_19_];
		this.anIntArray1405 = new int[i];
		anIntArray1400 = new int[i];
	}

	final void method508(int i) {
		aClass38_Sub23_1398.pos = anIntArray1402[i];
	}

	final int method509(int i) {
		int i_20_ = method494(i);
		return i_20_;
	}

	public Class70() {
		aClass38_Sub23_1398 = new RS2Buffer(null);
	}

	Class70(byte[] is) {
		aClass38_Sub23_1398 = new RS2Buffer(null);
		method507(is);
	}
}
