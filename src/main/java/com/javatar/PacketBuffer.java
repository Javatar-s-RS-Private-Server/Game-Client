package com.javatar;/* Class38_Sub23_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PacketBuffer extends RS2Buffer {
	static Class83 aClass83_2433 = new Class83(100);
	static Class83 aClass83_2434 = new Class83(30);
	static RSString aClass19_2435;
	static int anInt2437;
	private static RSString aClass19_2436 = RSString.createRSString("Walk here");

	static {
		PacketBuffer.aClass19_2435 = PacketBuffer.aClass19_2436;
		PacketBuffer.anInt2437 = 0;
	}

	private int anInt2419;
	private Class30 isaac;

	PacketBuffer() {
		super(5000);
	}

	static final boolean method782(Class17 class17, Class17 class17_0_, Class38_Sub10_Sub1 class38_sub10_sub1, Class17 class17_1_) {
		try {
			Class35.aClass38_Sub10_Sub1_849 = class38_sub10_sub1;
			Class11.aClass17_213 = class17;
			if ((byte) 19 != 19)
				return false;
			Sequence.aClass17_2738 = class17_1_;
			Class38_Sub1.aClass17_1735 = class17_0_;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ge.RB(" + (class17 != null ? "{...}" : "null") + ',' + (class17_0_ != null ? "{...}" : "null") + ',' + (class38_sub10_sub1 != null ? "{...}" : "null") + ',' + (byte) 19 + ',' + (class17_1_ != null ? "{...}" : "null") + ')');
		}
	}

	public static void method786(byte i) {
		try {
			PacketBuffer.aClass19_2435 = null;
			PacketBuffer.aClass83_2433 = null;
			PacketBuffer.aClass83_2434 = null;
			if (i != -93)
				PacketBuffer.method791(null, -27, (byte) -9);
			PacketBuffer.aClass19_2436 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ge.AC(" + i + ')');
		}
	}

	static final void method790() {
		try {
			if (98 < 68)
				PacketBuffer.method786((byte) 113);
			Class17_Sub1.aClass83_1689.method596(-123);
			Entity.aClass83_3466.method596(-82);
			Class20.aClass83_494.method596(-123);
			Class47.aClass83_1053.method596(68);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ge.VB(" + 98 + ')');
		}
	}

	static final boolean method791(Class17 class17, int i, byte i_8_) {
		try {
			byte[] is = class17.method121(-28, i);
			if (is == null)
				return false;
			if (i_8_ < 51)
				return true;
			Canvas_Sub1.method810(is);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ge.PB(" + (class17 != null ? "{...}" : "null") + ',' + i + ',' + i_8_ + ')');
		}
	}

	static final void method793(int i, int i_9_, int i_10_, int i_11_, int i_12_, Class74[] class74s, byte[] is, int i_14_, int i_15_) {
		try {
			if ((byte) 106 != 106)
				PacketBuffer.aClass83_2434 = null;
			for (int i_16_ = 0; i_16_ < 8; i_16_++)
				for (int i_17_ = 0; i_17_ < 8; i_17_++)
					if (i_16_ + i_10_ > 0 && i_10_ + i_16_ < 103 && i_9_ + i_17_ > 0 && i_17_ + i_9_ < 103)
						class74s[i_15_].clippingFlags[i_10_ + i_16_][i_17_ + i_9_] = Class38_Sub10_Sub3.method941(class74s[i_15_].clippingFlags[i_10_ + i_16_][i_17_ + i_9_], -16777217);
			RS2Buffer class38_sub23 = new RS2Buffer(is);
			for (int i_18_ = 0; i_18_ < 4; i_18_++)
				for (int i_19_ = 0; i_19_ < 64; i_19_++)
					for (int i_20_ = 0; i_20_ < 64; i_20_++)
						if (i_18_ != i_12_ || i > i_19_ || i_19_ >= i + 8 || i_11_ > i_20_ || i_11_ + 8 <= i_20_)
							Class48.method392(class38_sub23, 0, 0, (byte) 106 ^ ~0x7f5e, 0, -1, -1, 0);
						else
							Class48.method392(class38_sub23, i_15_, 0, -32565, i_14_, Class20.method185((byte) 106 - 106, i_14_, i_20_ & 0x7, i_19_ & 0x7) + i_9_, Class38_Sub12.method675(i_14_, i_19_ & 0x7, (byte) 106 - 12657, i_20_ & 0x7) + i_10_, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ge.SB(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + (class74s != null ? "{...}" : "null") + ',' + (byte) 106 + ',' + (is != null ? "{...}" : "null") + ',' + i_14_ + ',' + i_15_ + ')');
		}
	}

	final int getOpcode() {
		return this.buffer[this.pos++] - isaac.nextVal() & 0xff;
	}

	final void method784(int i) {
		try {
			anInt2419 = i * this.pos;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ge.OB(" + i + ')');
		}
	}

	final int method785(int i) {
		try {
			if ((byte) 69 != 69)
				PacketBuffer.aClass19_2436 = null;
			int i_3_ = anInt2419 >> 3;
			int i_4_ = -(anInt2419 & 0x7) + 8;
			int i_5_ = 0;
			anInt2419 += i;
			for (/**/; i > i_4_; i_4_ = 8) {
				i_5_ += (Class13.anIntArray248[i_4_] & this.buffer[i_3_++]) << i - i_4_;
				i -= i_4_;
			}
			if (i_4_ != i)
				i_5_ += this.buffer[i_3_] >> -i + i_4_ & Class13.anIntArray248[i];
			else
				i_5_ += Class13.anIntArray248[i_4_] & this.buffer[i_3_];
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ge.NB(" + i + ',' + (byte) 69 + ')');
		}
	}

	final int method787(byte i, int i_6_) {
		try {
			if (i >= -65)
				PacketBuffer.aClass19_2436 = null;
			return -anInt2419 + i_6_ * 8;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ge.TB(" + i + ',' + i_6_ + ')');
		}
	}

	final void method788() {
		try {
			this.pos = (7 + anInt2419) / 8;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ge.BC(" + 7 + ')');
		}
	}

	final void putOpcode(int opcode) {
		this.buffer[this.pos++] = (byte) (opcode + isaac.nextVal());
	}

	final void method792(int[] is) {
		try {
			if ((byte) -46 != -46)
				PacketBuffer.method791(null, 102, (byte) 86);
			isaac = new Class30(is);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ge.WB(" + (is != null ? "{...}" : "null") + ',' + (byte) -46 + ')');
		}
	}
}
