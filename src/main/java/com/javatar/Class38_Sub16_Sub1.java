package com.javatar;/* Class38_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub16_Sub1 extends Class38_Sub16 {
	boolean aBool3025;
	int anInt3026;
	int anInt3027;
	int anInt3028;
	byte[] aByteArray3029;

	Class38_Sub16_Sub1(byte[] is, int i_0_, int i_1_) {
		this.anInt3028 = 22050;
		this.aByteArray3029 = is;
		this.anInt3026 = i_0_;
		this.anInt3027 = i_1_;
	}

	Class38_Sub16_Sub1(int i, byte[] is, int i_2_, int i_3_, boolean bool) {
		this.anInt3028 = i;
		this.aByteArray3029 = is;
		this.anInt3026 = i_2_;
		this.anInt3027 = i_3_;
		this.aBool3025 = bool;
	}

	final Class38_Sub16_Sub1 method996(Class20 class20) {
		this.aByteArray3029 = class20.method184(this.aByteArray3029);
		this.anInt3028 = class20.method186(this.anInt3028);
		if (this.anInt3026 == this.anInt3027)
			this.anInt3026 = this.anInt3027 = class20.method188((byte) -71, this.anInt3026);
		else {
			this.anInt3026 = class20.method188((byte) 90, this.anInt3026);
			this.anInt3027 = class20.method188((byte) -121, this.anInt3027);
			if (this.anInt3026 == this.anInt3027)
				this.anInt3026--;
		}
		return this;
	}
}
