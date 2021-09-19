package com.javatar.jagex;/* Class38_Sub20_Sub9_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub9_Sub4 extends Class38_Sub20_Sub9 {
	static int anInt3519;
	static int[] anIntArray3520;
	static int anInt3521;
	static int anInt3522;
	private static int[] anIntArray3523;
	static boolean aBool3524;
	static boolean aBool3525;
	private static int[] anIntArray3526;
	private static boolean aBool3527;
	static int[] anIntArray3528;
	private static boolean aBool3529 = false;
	static int[] anIntArray3530;
	static int anInt3531;
	static int anInt3532;
	static Interface3 anInterface3_3533;
	static int[] anIntArray3534;
	static int anInt3535;
	static int anInt3536;
	static int anInt3537;
	private static int anInt3538;

	static final void method1181(int i, int i_0_, int i_1_) {
		Class38_Sub20_Sub9_Sub4.aBool3524 = i < 0 || i > Class38_Sub20_Sub9_Sub4.anInt3537 || i_0_ < 0 || i_0_ > Class38_Sub20_Sub9_Sub4.anInt3537 || i_1_ < 0 || i_1_ > Class38_Sub20_Sub9_Sub4.anInt3537;
	}

	private static final void method1182(int[] is, int[] is_2_, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		if (Class38_Sub20_Sub9_Sub4.aBool3524) {
			if (i_6_ > Class38_Sub20_Sub9_Sub4.anInt3537)
				i_6_ = Class38_Sub20_Sub9_Sub4.anInt3537;
			if (i_5_ < 0)
				i_5_ = 0;
		}
		if (i_5_ < i_6_) {
			i_4_ += i_5_;
			i_7_ += i_8_ * i_5_;
			int i_15_ = i_6_ - i_5_;
			do {
				if (Class38_Sub20_Sub9_Sub4.aBool3529) {
					int i_16_ = i_5_ - Class38_Sub20_Sub9_Sub4.anInt3521;
					i_9_ += (i_12_ >> 3) * i_16_;
					i_10_ += (i_13_ >> 3) * i_16_;
					i_11_ += (i_14_ >> 3) * i_16_;
					int i_17_ = i_11_ >> 12;
					int i_18_;
					int i_19_;
					if (i_17_ != 0) {
						i_18_ = i_9_ / i_17_;
						i_19_ = i_10_ / i_17_;
						if (i_18_ < 0)
							i_18_ = 0;
						else if (i_18_ > 4032)
							i_18_ = 4032;
					} else {
						i_18_ = 0;
						i_19_ = 0;
					}
					i_9_ += i_12_;
					i_10_ += i_13_;
					i_11_ += i_14_;
					i_17_ = i_11_ >> 12;
					int i_20_;
					int i_21_;
					if (i_17_ != 0) {
						i_20_ = i_9_ / i_17_;
						i_21_ = i_10_ / i_17_;
						if (i_20_ < 0)
							i_20_ = 0;
						else if (i_20_ > 4032)
							i_20_ = 4032;
					} else {
						i_20_ = 0;
						i_21_ = 0;
					}
					i = (i_18_ << 20) + i_19_;
					int i_22_ = (i_20_ - i_18_ >> 3 << 20) + (i_21_ - i_19_ >> 3);
					i_15_ >>= 3;
					i_8_ <<= 3;
					int i_23_ = i_7_ >> 8;
					if (Class38_Sub20_Sub9_Sub4.aBool3527) {
						if (i_15_ > 0)
							do {
								i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)];
								is[i_4_++] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i += i_22_;
								i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)];
								is[i_4_++] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i += i_22_;
								i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)];
								is[i_4_++] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i += i_22_;
								i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)];
								is[i_4_++] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i += i_22_;
								i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)];
								is[i_4_++] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i += i_22_;
								i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)];
								is[i_4_++] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i += i_22_;
								i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)];
								is[i_4_++] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i += i_22_;
								i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)];
								is[i_4_++] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i += i_22_;
								i_18_ = i_20_;
								i_19_ = i_21_;
								i_9_ += i_12_;
								i_10_ += i_13_;
								i_11_ += i_14_;
								i_17_ = i_11_ >> 12;
								if (i_17_ != 0) {
									i_20_ = i_9_ / i_17_;
									i_21_ = i_10_ / i_17_;
									if (i_20_ < 0)
										i_20_ = 0;
									else if (i_20_ > 4032)
										i_20_ = 4032;
								} else {
									i_20_ = 0;
									i_21_ = 0;
								}
								i = (i_18_ << 20) + i_19_;
								i_22_ = (i_20_ - i_18_ >> 3 << 20) + (i_21_ - i_19_ >> 3);
								i_7_ += i_8_;
								i_23_ = i_7_ >> 8;
							} while (--i_15_ > 0);
						i_15_ = i_6_ - i_5_ & 0x7;
						if (i_15_ > 0)
							do {
								i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)];
								is[i_4_++] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i += i_22_;
							} while (--i_15_ > 0);
					} else {
						if (i_15_ > 0)
							do {
								if ((i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_4_] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i_4_++;
								i += i_22_;
								if ((i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_4_] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i_4_++;
								i += i_22_;
								if ((i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_4_] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i_4_++;
								i += i_22_;
								if ((i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_4_] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i_4_++;
								i += i_22_;
								if ((i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_4_] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i_4_++;
								i += i_22_;
								if ((i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_4_] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i_4_++;
								i += i_22_;
								if ((i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_4_] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i_4_++;
								i += i_22_;
								if ((i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_4_] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
								i_4_++;
								i += i_22_;
								i_18_ = i_20_;
								i_19_ = i_21_;
								i_9_ += i_12_;
								i_10_ += i_13_;
								i_11_ += i_14_;
								i_17_ = i_11_ >> 12;
								if (i_17_ != 0) {
									i_20_ = i_9_ / i_17_;
									i_21_ = i_10_ / i_17_;
									if (i_20_ < 0)
										i_20_ = 0;
									else if (i_20_ > 4032)
										i_20_ = 4032;
								} else {
									i_20_ = 0;
									i_21_ = 0;
								}
								i = (i_18_ << 20) + i_19_;
								i_22_ = (i_20_ - i_18_ >> 3 << 20) + (i_21_ - i_19_ >> 3);
								i_7_ += i_8_;
								i_23_ = i_7_ >> 8;
							} while (--i_15_ > 0);
						i_15_ = i_6_ - i_5_ & 0x7;
						if (i_15_ <= 0)
							break;
						do {
							if ((i_3_ = is_2_[(i & 0xfc0) + (i >>> 26)]) != 0)
								is[i_4_] = ((i_3_ & 0xff00ff) * i_23_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_23_ & 0xff0000) >> 8;
							i_4_++;
							i += i_22_;
						} while (--i_15_ > 0);
					}
					break;
				}
				int i_24_ = i_5_ - Class38_Sub20_Sub9_Sub4.anInt3521;
				i_9_ += (i_12_ >> 3) * i_24_;
				i_10_ += (i_13_ >> 3) * i_24_;
				i_11_ += (i_14_ >> 3) * i_24_;
				int i_25_ = i_11_ >> 14;
				int i_26_;
				int i_27_;
				if (i_25_ != 0) {
					i_26_ = i_9_ / i_25_;
					i_27_ = i_10_ / i_25_;
					if (i_26_ < 0)
						i_26_ = 0;
					else if (i_26_ > 16256)
						i_26_ = 16256;
				} else {
					i_26_ = 0;
					i_27_ = 0;
				}
				i_9_ += i_12_;
				i_10_ += i_13_;
				i_11_ += i_14_;
				i_25_ = i_11_ >> 14;
				int i_28_;
				int i_29_;
				if (i_25_ != 0) {
					i_28_ = i_9_ / i_25_;
					i_29_ = i_10_ / i_25_;
					if (i_28_ < 0)
						i_28_ = 0;
					else if (i_28_ > 16256)
						i_28_ = 16256;
				} else {
					i_28_ = 0;
					i_29_ = 0;
				}
				i = (i_26_ << 18) + i_27_;
				int i_30_ = (i_28_ - i_26_ >> 3 << 18) + (i_29_ - i_27_ >> 3);
				i_15_ >>= 3;
				i_8_ <<= 3;
				int i_31_ = i_7_ >> 8;
				if (Class38_Sub20_Sub9_Sub4.aBool3527) {
					if (i_15_ > 0)
						do {
							i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)];
							is[i_4_++] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)];
							is[i_4_++] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)];
							is[i_4_++] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)];
							is[i_4_++] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)];
							is[i_4_++] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)];
							is[i_4_++] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)];
							is[i_4_++] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)];
							is[i_4_++] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
							i_26_ = i_28_;
							i_27_ = i_29_;
							i_9_ += i_12_;
							i_10_ += i_13_;
							i_11_ += i_14_;
							i_25_ = i_11_ >> 14;
							if (i_25_ != 0) {
								i_28_ = i_9_ / i_25_;
								i_29_ = i_10_ / i_25_;
								if (i_28_ < 0)
									i_28_ = 0;
								else if (i_28_ > 16256)
									i_28_ = 16256;
							} else {
								i_28_ = 0;
								i_29_ = 0;
							}
							i = (i_26_ << 18) + i_27_;
							i_30_ = (i_28_ - i_26_ >> 3 << 18) + (i_29_ - i_27_ >> 3);
							i_7_ += i_8_;
							i_31_ = i_7_ >> 8;
						} while (--i_15_ > 0);
					i_15_ = i_6_ - i_5_ & 0x7;
					if (i_15_ > 0) {
						do {
							i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)];
							is[i_4_++] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i += i_30_;
						} while (--i_15_ > 0);
						break;
					}
				} else {
					if (i_15_ > 0)
						do {
							if ((i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_4_] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i_4_++;
							i += i_30_;
							if ((i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_4_] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i_4_++;
							i += i_30_;
							if ((i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_4_] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i_4_++;
							i += i_30_;
							if ((i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_4_] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i_4_++;
							i += i_30_;
							if ((i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_4_] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i_4_++;
							i += i_30_;
							if ((i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_4_] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i_4_++;
							i += i_30_;
							if ((i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_4_] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i_4_++;
							i += i_30_;
							if ((i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_4_] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i_4_++;
							i += i_30_;
							i_26_ = i_28_;
							i_27_ = i_29_;
							i_9_ += i_12_;
							i_10_ += i_13_;
							i_11_ += i_14_;
							i_25_ = i_11_ >> 14;
							if (i_25_ != 0) {
								i_28_ = i_9_ / i_25_;
								i_29_ = i_10_ / i_25_;
								if (i_28_ < 0)
									i_28_ = 0;
								else if (i_28_ > 16256)
									i_28_ = 16256;
							} else {
								i_28_ = 0;
								i_29_ = 0;
							}
							i = (i_26_ << 18) + i_27_;
							i_30_ = (i_28_ - i_26_ >> 3 << 18) + (i_29_ - i_27_ >> 3);
							i_7_ += i_8_;
							i_31_ = i_7_ >> 8;
						} while (--i_15_ > 0);
					i_15_ = i_6_ - i_5_ & 0x7;
					if (i_15_ > 0)
						do {
							if ((i_3_ = is_2_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_4_] = ((i_3_ & 0xff00ff) * i_31_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_31_ & 0xff0000) >> 8;
							i_4_++;
							i += i_30_;
						} while (--i_15_ > 0);
				}
			} while (false);
		}
	}

	private static final void method1183(int[] is, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		if (Class38_Sub20_Sub9_Sub4.aBool3524) {
			if (i_35_ > Class38_Sub20_Sub9_Sub4.anInt3537)
				i_35_ = Class38_Sub20_Sub9_Sub4.anInt3537;
			if (i_34_ < 0)
				i_34_ = 0;
		}
		if (i_34_ < i_35_) {
			i += i_34_;
			i_36_ += i_37_ * i_34_;
			if (Class38_Sub20_Sub9_Sub4.aBool3525) {
				i_33_ = i_35_ - i_34_ >> 2;
				i_37_ <<= 2;
				if (Class38_Sub20_Sub9_Sub4.anInt3535 == 0) {
					if (i_33_ > 0)
						do {
							i_32_ = Class38_Sub20_Sub9_Sub4.anIntArray3530[i_36_ >> 8];
							i_36_ += i_37_;
							is[i++] = i_32_;
							is[i++] = i_32_;
							is[i++] = i_32_;
							is[i++] = i_32_;
						} while (--i_33_ > 0);
					i_33_ = i_35_ - i_34_ & 0x3;
					if (i_33_ > 0) {
						i_32_ = Class38_Sub20_Sub9_Sub4.anIntArray3530[i_36_ >> 8];
						do
							is[i++] = i_32_;
						while (--i_33_ > 0);
					}
				} else {
					int i_38_ = Class38_Sub20_Sub9_Sub4.anInt3535;
					int i_39_ = 256 - Class38_Sub20_Sub9_Sub4.anInt3535;
					if (i_33_ > 0)
						do {
							i_32_ = Class38_Sub20_Sub9_Sub4.anIntArray3530[i_36_ >> 8];
							i_36_ += i_37_;
							i_32_ = ((i_32_ & 0xff00ff) * i_39_ >> 8 & 0xff00ff) + ((i_32_ & 0xff00) * i_39_ >> 8 & 0xff00);
							int i_40_ = is[i];
							is[i++] = i_32_ + ((i_40_ & 0xff00ff) * i_38_ >> 8 & 0xff00ff) + ((i_40_ & 0xff00) * i_38_ >> 8 & 0xff00);
							i_40_ = is[i];
							is[i++] = i_32_ + ((i_40_ & 0xff00ff) * i_38_ >> 8 & 0xff00ff) + ((i_40_ & 0xff00) * i_38_ >> 8 & 0xff00);
							i_40_ = is[i];
							is[i++] = i_32_ + ((i_40_ & 0xff00ff) * i_38_ >> 8 & 0xff00ff) + ((i_40_ & 0xff00) * i_38_ >> 8 & 0xff00);
							i_40_ = is[i];
							is[i++] = i_32_ + ((i_40_ & 0xff00ff) * i_38_ >> 8 & 0xff00ff) + ((i_40_ & 0xff00) * i_38_ >> 8 & 0xff00);
						} while (--i_33_ > 0);
					i_33_ = i_35_ - i_34_ & 0x3;
					if (i_33_ > 0) {
						i_32_ = Class38_Sub20_Sub9_Sub4.anIntArray3530[i_36_ >> 8];
						i_32_ = ((i_32_ & 0xff00ff) * i_39_ >> 8 & 0xff00ff) + ((i_32_ & 0xff00) * i_39_ >> 8 & 0xff00);
						do {
							int i_41_ = is[i];
							is[i++] = i_32_ + ((i_41_ & 0xff00ff) * i_38_ >> 8 & 0xff00ff) + ((i_41_ & 0xff00) * i_38_ >> 8 & 0xff00);
						} while (--i_33_ > 0);
					}
				}
			} else {
				i_33_ = i_35_ - i_34_;
				if (Class38_Sub20_Sub9_Sub4.anInt3535 == 0)
					do {
						is[i++] = Class38_Sub20_Sub9_Sub4.anIntArray3530[i_36_ >> 8];
						i_36_ += i_37_;
					} while (--i_33_ > 0);
				else {
					int i_42_ = Class38_Sub20_Sub9_Sub4.anInt3535;
					int i_43_ = 256 - Class38_Sub20_Sub9_Sub4.anInt3535;
					do {
						i_32_ = Class38_Sub20_Sub9_Sub4.anIntArray3530[i_36_ >> 8];
						i_36_ += i_37_;
						i_32_ = ((i_32_ & 0xff00ff) * i_43_ >> 8 & 0xff00ff) + ((i_32_ & 0xff00) * i_43_ >> 8 & 0xff00);
						int i_44_ = is[i];
						is[i++] = i_32_ + ((i_44_ & 0xff00ff) * i_42_ >> 8 & 0xff00ff) + ((i_44_ & 0xff00) * i_42_ >> 8 & 0xff00);
					} while (--i_33_ > 0);
				}
			}
		}
	}

	static final void method1184(double d) {
		Class38_Sub20_Sub9_Sub4.method1197(d, 0, 512);
	}

	public static void method1185() {
		Class38_Sub20_Sub9_Sub4.anIntArray3523 = null;
		Class38_Sub20_Sub9_Sub4.anIntArray3530 = null;
		Class38_Sub20_Sub9_Sub4.anInterface3_3533 = null;
		Class38_Sub20_Sub9_Sub4.anIntArray3526 = null;
		Class38_Sub20_Sub9_Sub4.anIntArray3534 = null;
		Class38_Sub20_Sub9_Sub4.anIntArray3520 = null;
		Class38_Sub20_Sub9_Sub4.anIntArray3528 = null;
	}

	static final void method1186(int i, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_) {
		int[] is = Class38_Sub20_Sub9_Sub4.anInterface3_3533.method9(121, i_62_);
		if (is == null) {
			int i_63_ = Class38_Sub20_Sub9_Sub4.anInterface3_3533.method7(i_62_, false);
			Class38_Sub20_Sub9_Sub4.method1188(i, i_45_, i_46_, i_47_, i_48_, i_49_, Class38_Sub20_Sub9_Sub4.method1199(i_63_, i_50_), Class38_Sub20_Sub9_Sub4.method1199(i_63_, i_51_), Class38_Sub20_Sub9_Sub4.method1199(i_63_, i_52_));
		} else {
			Class38_Sub20_Sub9_Sub4.aBool3529 = Class38_Sub20_Sub9_Sub4.anInterface3_3533.method8(true, i_62_);
			Class38_Sub20_Sub9_Sub4.aBool3527 = Class38_Sub20_Sub9_Sub4.anInterface3_3533.method10(17912, i_62_);
			int i_64_ = i_48_ - i_47_;
			int i_65_ = i_45_ - i;
			int i_66_ = i_49_ - i_47_;
			int i_67_ = i_46_ - i;
			int i_68_ = i_51_ - i_50_;
			int i_69_ = i_52_ - i_50_;
			int i_70_ = 0;
			if (i_45_ != i)
				i_70_ = (i_48_ - i_47_ << 16) / (i_45_ - i);
			int i_71_ = 0;
			if (i_46_ != i_45_)
				i_71_ = (i_49_ - i_48_ << 16) / (i_46_ - i_45_);
			int i_72_ = 0;
			if (i_46_ != i)
				i_72_ = (i_47_ - i_49_ << 16) / (i - i_46_);
			int i_73_ = i_64_ * i_67_ - i_66_ * i_65_;
			if (i_73_ != 0) {
				int i_74_ = (i_68_ * i_67_ - i_69_ * i_65_ << 9) / i_73_;
				int i_75_ = (i_69_ * i_64_ - i_68_ * i_66_ << 9) / i_73_;
				i_54_ = i_53_ - i_54_;
				i_57_ = i_56_ - i_57_;
				i_60_ = i_59_ - i_60_;
				i_55_ -= i_53_;
				i_58_ -= i_56_;
				i_61_ -= i_59_;
				int i_76_ = i_55_ * i_56_ - i_58_ * i_53_ << 14;
				int i_77_ = i_58_ * i_59_ - i_61_ * i_56_ << 5;
				int i_78_ = i_61_ * i_53_ - i_55_ * i_59_ << 5;
				int i_79_ = i_54_ * i_56_ - i_57_ * i_53_ << 14;
				int i_80_ = i_57_ * i_59_ - i_60_ * i_56_ << 5;
				int i_81_ = i_60_ * i_53_ - i_54_ * i_59_ << 5;
				int i_82_ = i_57_ * i_55_ - i_54_ * i_58_ << 14;
				int i_83_ = i_60_ * i_58_ - i_57_ * i_61_ << 5;
				int i_84_ = i_54_ * i_61_ - i_60_ * i_55_ << 5;
				if (i <= i_45_ && i <= i_46_) {
					if (i < Class38_Sub20_Sub9_Sub4.anInt3538) {
						if (i_45_ > Class38_Sub20_Sub9_Sub4.anInt3538)
							i_45_ = Class38_Sub20_Sub9_Sub4.anInt3538;
						if (i_46_ > Class38_Sub20_Sub9_Sub4.anInt3538)
							i_46_ = Class38_Sub20_Sub9_Sub4.anInt3538;
						i_50_ = (i_50_ << 9) - i_74_ * i_47_ + i_74_;
						if (i_45_ < i_46_) {
							i_49_ = i_47_ <<= 16;
							if (i < 0) {
								i_49_ -= i_72_ * i;
								i_47_ -= i_70_ * i;
								i_50_ -= i_75_ * i;
								i = 0;
							}
							i_48_ <<= 16;
							if (i_45_ < 0) {
								i_48_ -= i_71_ * i_45_;
								i_45_ = 0;
							}
							int i_85_ = i - Class38_Sub20_Sub9_Sub4.anInt3536;
							i_76_ += i_78_ * i_85_;
							i_79_ += i_81_ * i_85_;
							i_82_ += i_84_ * i_85_;
							if (i != i_45_ && i_72_ < i_70_ || i == i_45_ && i_72_ > i_71_) {
								i_46_ -= i_45_;
								i_45_ -= i;
								i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
								while (--i_45_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_49_ >> 16, i_47_ >> 16, i_50_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_49_ += i_72_;
									i_47_ += i_70_;
									i_50_ += i_75_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
								while (--i_46_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_49_ >> 16, i_48_ >> 16, i_50_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_49_ += i_72_;
									i_48_ += i_71_;
									i_50_ += i_75_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
							} else {
								i_46_ -= i_45_;
								i_45_ -= i;
								i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
								while (--i_45_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_47_ >> 16, i_49_ >> 16, i_50_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_49_ += i_72_;
									i_47_ += i_70_;
									i_50_ += i_75_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
								while (--i_46_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_48_ >> 16, i_49_ >> 16, i_50_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_49_ += i_72_;
									i_48_ += i_71_;
									i_50_ += i_75_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
							}
						} else {
							i_48_ = i_47_ <<= 16;
							if (i < 0) {
								i_48_ -= i_72_ * i;
								i_47_ -= i_70_ * i;
								i_50_ -= i_75_ * i;
								i = 0;
							}
							i_49_ <<= 16;
							if (i_46_ < 0) {
								i_49_ -= i_71_ * i_46_;
								i_46_ = 0;
							}
							int i_86_ = i - Class38_Sub20_Sub9_Sub4.anInt3536;
							i_76_ += i_78_ * i_86_;
							i_79_ += i_81_ * i_86_;
							i_82_ += i_84_ * i_86_;
							if (i != i_46_ && i_72_ < i_70_ || i == i_46_ && i_71_ > i_70_) {
								i_45_ -= i_46_;
								i_46_ -= i;
								i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
								while (--i_46_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_48_ >> 16, i_47_ >> 16, i_50_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_48_ += i_72_;
									i_47_ += i_70_;
									i_50_ += i_75_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
								while (--i_45_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_49_ >> 16, i_47_ >> 16, i_50_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_49_ += i_71_;
									i_47_ += i_70_;
									i_50_ += i_75_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
							} else {
								i_45_ -= i_46_;
								i_46_ -= i;
								i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
								while (--i_46_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_47_ >> 16, i_48_ >> 16, i_50_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_48_ += i_72_;
									i_47_ += i_70_;
									i_50_ += i_75_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
								while (--i_45_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_47_ >> 16, i_49_ >> 16, i_50_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_49_ += i_71_;
									i_47_ += i_70_;
									i_50_ += i_75_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
							}
						}
					}
				} else if (i_45_ <= i_46_) {
					if (i_45_ < Class38_Sub20_Sub9_Sub4.anInt3538) {
						if (i_46_ > Class38_Sub20_Sub9_Sub4.anInt3538)
							i_46_ = Class38_Sub20_Sub9_Sub4.anInt3538;
						if (i > Class38_Sub20_Sub9_Sub4.anInt3538)
							i = Class38_Sub20_Sub9_Sub4.anInt3538;
						i_51_ = (i_51_ << 9) - i_74_ * i_48_ + i_74_;
						if (i_46_ < i) {
							i_47_ = i_48_ <<= 16;
							if (i_45_ < 0) {
								i_47_ -= i_70_ * i_45_;
								i_48_ -= i_71_ * i_45_;
								i_51_ -= i_75_ * i_45_;
								i_45_ = 0;
							}
							i_49_ <<= 16;
							if (i_46_ < 0) {
								i_49_ -= i_72_ * i_46_;
								i_46_ = 0;
							}
							int i_87_ = i_45_ - Class38_Sub20_Sub9_Sub4.anInt3536;
							i_76_ += i_78_ * i_87_;
							i_79_ += i_81_ * i_87_;
							i_82_ += i_84_ * i_87_;
							if (i_45_ != i_46_ && i_70_ < i_71_ || i_45_ == i_46_ && i_70_ > i_72_) {
								i -= i_46_;
								i_46_ -= i_45_;
								i_45_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_45_];
								while (--i_46_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_45_, i_47_ >> 16, i_48_ >> 16, i_51_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_47_ += i_70_;
									i_48_ += i_71_;
									i_51_ += i_75_;
									i_45_ += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
								while (--i >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_45_, i_47_ >> 16, i_49_ >> 16, i_51_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_47_ += i_70_;
									i_49_ += i_72_;
									i_51_ += i_75_;
									i_45_ += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
							} else {
								i -= i_46_;
								i_46_ -= i_45_;
								i_45_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_45_];
								while (--i_46_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_45_, i_48_ >> 16, i_47_ >> 16, i_51_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_47_ += i_70_;
									i_48_ += i_71_;
									i_51_ += i_75_;
									i_45_ += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
								while (--i >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_45_, i_49_ >> 16, i_47_ >> 16, i_51_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_47_ += i_70_;
									i_49_ += i_72_;
									i_51_ += i_75_;
									i_45_ += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
							}
						} else {
							i_49_ = i_48_ <<= 16;
							if (i_45_ < 0) {
								i_49_ -= i_70_ * i_45_;
								i_48_ -= i_71_ * i_45_;
								i_51_ -= i_75_ * i_45_;
								i_45_ = 0;
							}
							i_47_ <<= 16;
							if (i < 0) {
								i_47_ -= i_72_ * i;
								i = 0;
							}
							int i_88_ = i_45_ - Class38_Sub20_Sub9_Sub4.anInt3536;
							i_76_ += i_78_ * i_88_;
							i_79_ += i_81_ * i_88_;
							i_82_ += i_84_ * i_88_;
							if (i_70_ < i_71_) {
								i_46_ -= i;
								i -= i_45_;
								i_45_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_45_];
								while (--i >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_45_, i_49_ >> 16, i_48_ >> 16, i_51_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_49_ += i_70_;
									i_48_ += i_71_;
									i_51_ += i_75_;
									i_45_ += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
								while (--i_46_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_45_, i_47_ >> 16, i_48_ >> 16, i_51_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_47_ += i_72_;
									i_48_ += i_71_;
									i_51_ += i_75_;
									i_45_ += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
							} else {
								i_46_ -= i;
								i -= i_45_;
								i_45_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_45_];
								while (--i >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_45_, i_48_ >> 16, i_49_ >> 16, i_51_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_49_ += i_70_;
									i_48_ += i_71_;
									i_51_ += i_75_;
									i_45_ += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
								while (--i_46_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_45_, i_48_ >> 16, i_47_ >> 16, i_51_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
									i_47_ += i_72_;
									i_48_ += i_71_;
									i_51_ += i_75_;
									i_45_ += Class38_Sub20_Sub9.anInt2889;
									i_76_ += i_78_;
									i_79_ += i_81_;
									i_82_ += i_84_;
								}
							}
						}
					}
				} else if (i_46_ < Class38_Sub20_Sub9_Sub4.anInt3538) {
					if (i > Class38_Sub20_Sub9_Sub4.anInt3538)
						i = Class38_Sub20_Sub9_Sub4.anInt3538;
					if (i_45_ > Class38_Sub20_Sub9_Sub4.anInt3538)
						i_45_ = Class38_Sub20_Sub9_Sub4.anInt3538;
					i_52_ = (i_52_ << 9) - i_74_ * i_49_ + i_74_;
					if (i < i_45_) {
						i_48_ = i_49_ <<= 16;
						if (i_46_ < 0) {
							i_48_ -= i_71_ * i_46_;
							i_49_ -= i_72_ * i_46_;
							i_52_ -= i_75_ * i_46_;
							i_46_ = 0;
						}
						i_47_ <<= 16;
						if (i < 0) {
							i_47_ -= i_70_ * i;
							i = 0;
						}
						int i_89_ = i_46_ - Class38_Sub20_Sub9_Sub4.anInt3536;
						i_76_ += i_78_ * i_89_;
						i_79_ += i_81_ * i_89_;
						i_82_ += i_84_ * i_89_;
						if (i_71_ < i_72_) {
							i_45_ -= i;
							i -= i_46_;
							i_46_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_46_];
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_46_, i_48_ >> 16, i_49_ >> 16, i_52_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
								i_48_ += i_71_;
								i_49_ += i_72_;
								i_52_ += i_75_;
								i_46_ += Class38_Sub20_Sub9.anInt2889;
								i_76_ += i_78_;
								i_79_ += i_81_;
								i_82_ += i_84_;
							}
							while (--i_45_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_46_, i_48_ >> 16, i_47_ >> 16, i_52_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
								i_48_ += i_71_;
								i_47_ += i_70_;
								i_52_ += i_75_;
								i_46_ += Class38_Sub20_Sub9.anInt2889;
								i_76_ += i_78_;
								i_79_ += i_81_;
								i_82_ += i_84_;
							}
						} else {
							i_45_ -= i;
							i -= i_46_;
							i_46_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_46_];
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_46_, i_49_ >> 16, i_48_ >> 16, i_52_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
								i_48_ += i_71_;
								i_49_ += i_72_;
								i_52_ += i_75_;
								i_46_ += Class38_Sub20_Sub9.anInt2889;
								i_76_ += i_78_;
								i_79_ += i_81_;
								i_82_ += i_84_;
							}
							while (--i_45_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_46_, i_47_ >> 16, i_48_ >> 16, i_52_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
								i_48_ += i_71_;
								i_47_ += i_70_;
								i_52_ += i_75_;
								i_46_ += Class38_Sub20_Sub9.anInt2889;
								i_76_ += i_78_;
								i_79_ += i_81_;
								i_82_ += i_84_;
							}
						}
					} else {
						i_47_ = i_49_ <<= 16;
						if (i_46_ < 0) {
							i_47_ -= i_71_ * i_46_;
							i_49_ -= i_72_ * i_46_;
							i_52_ -= i_75_ * i_46_;
							i_46_ = 0;
						}
						i_48_ <<= 16;
						if (i_45_ < 0) {
							i_48_ -= i_70_ * i_45_;
							i_45_ = 0;
						}
						int i_90_ = i_46_ - Class38_Sub20_Sub9_Sub4.anInt3536;
						i_76_ += i_78_ * i_90_;
						i_79_ += i_81_ * i_90_;
						i_82_ += i_84_ * i_90_;
						if (i_71_ < i_72_) {
							i -= i_45_;
							i_45_ -= i_46_;
							i_46_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_46_];
							while (--i_45_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_46_, i_47_ >> 16, i_49_ >> 16, i_52_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
								i_47_ += i_71_;
								i_49_ += i_72_;
								i_52_ += i_75_;
								i_46_ += Class38_Sub20_Sub9.anInt2889;
								i_76_ += i_78_;
								i_79_ += i_81_;
								i_82_ += i_84_;
							}
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_46_, i_48_ >> 16, i_49_ >> 16, i_52_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
								i_48_ += i_70_;
								i_49_ += i_72_;
								i_52_ += i_75_;
								i_46_ += Class38_Sub20_Sub9.anInt2889;
								i_76_ += i_78_;
								i_79_ += i_81_;
								i_82_ += i_84_;
							}
						} else {
							i -= i_45_;
							i_45_ -= i_46_;
							i_46_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_46_];
							while (--i_45_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_46_, i_49_ >> 16, i_47_ >> 16, i_52_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
								i_47_ += i_71_;
								i_49_ += i_72_;
								i_52_ += i_75_;
								i_46_ += Class38_Sub20_Sub9.anInt2889;
								i_76_ += i_78_;
								i_79_ += i_81_;
								i_82_ += i_84_;
							}
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1195(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_46_, i_49_ >> 16, i_48_ >> 16, i_52_, i_74_, i_76_, i_79_, i_82_, i_77_, i_80_, i_83_);
								i_48_ += i_70_;
								i_49_ += i_72_;
								i_52_ += i_75_;
								i_46_ += Class38_Sub20_Sub9.anInt2889;
								i_76_ += i_78_;
								i_79_ += i_81_;
								i_82_ += i_84_;
							}
						}
					}
				}
			}
		}
	}

	static final void method1187() {
		Class38_Sub20_Sub9_Sub4.anInt3521 = Class38_Sub20_Sub9_Sub4.anInt3537 / 2;
		Class38_Sub20_Sub9_Sub4.anInt3536 = Class38_Sub20_Sub9_Sub4.anInt3538 / 2;
		Class38_Sub20_Sub9_Sub4.anInt3531 = -Class38_Sub20_Sub9_Sub4.anInt3521;
		Class38_Sub20_Sub9_Sub4.anInt3522 = Class38_Sub20_Sub9_Sub4.anInt3537 - Class38_Sub20_Sub9_Sub4.anInt3521;
		Class38_Sub20_Sub9_Sub4.anInt3532 = -Class38_Sub20_Sub9_Sub4.anInt3536;
		Class38_Sub20_Sub9_Sub4.anInt3519 = Class38_Sub20_Sub9_Sub4.anInt3538 - Class38_Sub20_Sub9_Sub4.anInt3536;
	}

	static final void method1188(int i, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_) {
		int i_99_ = i_94_ - i_93_;
		int i_100_ = i_91_ - i;
		int i_101_ = i_95_ - i_93_;
		int i_102_ = i_92_ - i;
		int i_103_ = i_97_ - i_96_;
		int i_104_ = i_98_ - i_96_;
		int i_105_;
		if (i_92_ != i_91_)
			i_105_ = (i_95_ - i_94_ << 16) / (i_92_ - i_91_);
		else
			i_105_ = 0;
		int i_106_;
		if (i_91_ != i)
			i_106_ = (i_99_ << 16) / i_100_;
		else
			i_106_ = 0;
		int i_107_;
		if (i_92_ != i)
			i_107_ = (i_101_ << 16) / i_102_;
		else
			i_107_ = 0;
		int i_108_ = i_99_ * i_102_ - i_101_ * i_100_;
		if (i_108_ != 0) {
			int i_109_ = (i_103_ * i_102_ - i_104_ * i_100_ << 8) / i_108_;
			int i_110_ = (i_104_ * i_99_ - i_103_ * i_101_ << 8) / i_108_;
			if (i <= i_91_ && i <= i_92_) {
				if (i < Class38_Sub20_Sub9_Sub4.anInt3538) {
					if (i_91_ > Class38_Sub20_Sub9_Sub4.anInt3538)
						i_91_ = Class38_Sub20_Sub9_Sub4.anInt3538;
					if (i_92_ > Class38_Sub20_Sub9_Sub4.anInt3538)
						i_92_ = Class38_Sub20_Sub9_Sub4.anInt3538;
					i_96_ = (i_96_ << 8) - i_109_ * i_93_ + i_109_;
					if (i_91_ < i_92_) {
						i_95_ = i_93_ <<= 16;
						if (i < 0) {
							i_95_ -= i_107_ * i;
							i_93_ -= i_106_ * i;
							i_96_ -= i_110_ * i;
							i = 0;
						}
						i_94_ <<= 16;
						if (i_91_ < 0) {
							i_94_ -= i_105_ * i_91_;
							i_91_ = 0;
						}
						if (i != i_91_ && i_107_ < i_106_ || i == i_91_ && i_107_ > i_105_) {
							i_92_ -= i_91_;
							i_91_ -= i;
							i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
							while (--i_91_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i, 0, 0, i_95_ >> 16, i_93_ >> 16, i_96_, i_109_);
								i_95_ += i_107_;
								i_93_ += i_106_;
								i_96_ += i_110_;
								i += Class38_Sub20_Sub9.anInt2889;
							}
							while (--i_92_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i, 0, 0, i_95_ >> 16, i_94_ >> 16, i_96_, i_109_);
								i_95_ += i_107_;
								i_94_ += i_105_;
								i_96_ += i_110_;
								i += Class38_Sub20_Sub9.anInt2889;
							}
						} else {
							i_92_ -= i_91_;
							i_91_ -= i;
							i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
							while (--i_91_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i, 0, 0, i_93_ >> 16, i_95_ >> 16, i_96_, i_109_);
								i_95_ += i_107_;
								i_93_ += i_106_;
								i_96_ += i_110_;
								i += Class38_Sub20_Sub9.anInt2889;
							}
							while (--i_92_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i, 0, 0, i_94_ >> 16, i_95_ >> 16, i_96_, i_109_);
								i_95_ += i_107_;
								i_94_ += i_105_;
								i_96_ += i_110_;
								i += Class38_Sub20_Sub9.anInt2889;
							}
						}
					} else {
						i_94_ = i_93_ <<= 16;
						if (i < 0) {
							i_94_ -= i_107_ * i;
							i_93_ -= i_106_ * i;
							i_96_ -= i_110_ * i;
							i = 0;
						}
						i_95_ <<= 16;
						if (i_92_ < 0) {
							i_95_ -= i_105_ * i_92_;
							i_92_ = 0;
						}
						if (i != i_92_ && i_107_ < i_106_ || i == i_92_ && i_105_ > i_106_) {
							i_91_ -= i_92_;
							i_92_ -= i;
							i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
							while (--i_92_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i, 0, 0, i_94_ >> 16, i_93_ >> 16, i_96_, i_109_);
								i_94_ += i_107_;
								i_93_ += i_106_;
								i_96_ += i_110_;
								i += Class38_Sub20_Sub9.anInt2889;
							}
							while (--i_91_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i, 0, 0, i_95_ >> 16, i_93_ >> 16, i_96_, i_109_);
								i_95_ += i_105_;
								i_93_ += i_106_;
								i_96_ += i_110_;
								i += Class38_Sub20_Sub9.anInt2889;
							}
						} else {
							i_91_ -= i_92_;
							i_92_ -= i;
							i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
							while (--i_92_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i, 0, 0, i_93_ >> 16, i_94_ >> 16, i_96_, i_109_);
								i_94_ += i_107_;
								i_93_ += i_106_;
								i_96_ += i_110_;
								i += Class38_Sub20_Sub9.anInt2889;
							}
							while (--i_91_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i, 0, 0, i_93_ >> 16, i_95_ >> 16, i_96_, i_109_);
								i_95_ += i_105_;
								i_93_ += i_106_;
								i_96_ += i_110_;
								i += Class38_Sub20_Sub9.anInt2889;
							}
						}
					}
				}
			} else if (i_91_ <= i_92_) {
				if (i_91_ < Class38_Sub20_Sub9_Sub4.anInt3538) {
					if (i_92_ > Class38_Sub20_Sub9_Sub4.anInt3538)
						i_92_ = Class38_Sub20_Sub9_Sub4.anInt3538;
					if (i > Class38_Sub20_Sub9_Sub4.anInt3538)
						i = Class38_Sub20_Sub9_Sub4.anInt3538;
					i_97_ = (i_97_ << 8) - i_109_ * i_94_ + i_109_;
					if (i_92_ < i) {
						i_93_ = i_94_ <<= 16;
						if (i_91_ < 0) {
							i_93_ -= i_106_ * i_91_;
							i_94_ -= i_105_ * i_91_;
							i_97_ -= i_110_ * i_91_;
							i_91_ = 0;
						}
						i_95_ <<= 16;
						if (i_92_ < 0) {
							i_95_ -= i_107_ * i_92_;
							i_92_ = 0;
						}
						if (i_91_ != i_92_ && i_106_ < i_105_ || i_91_ == i_92_ && i_106_ > i_107_) {
							i -= i_92_;
							i_92_ -= i_91_;
							i_91_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_91_];
							while (--i_92_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_91_, 0, 0, i_93_ >> 16, i_94_ >> 16, i_97_, i_109_);
								i_93_ += i_106_;
								i_94_ += i_105_;
								i_97_ += i_110_;
								i_91_ += Class38_Sub20_Sub9.anInt2889;
							}
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_91_, 0, 0, i_93_ >> 16, i_95_ >> 16, i_97_, i_109_);
								i_93_ += i_106_;
								i_95_ += i_107_;
								i_97_ += i_110_;
								i_91_ += Class38_Sub20_Sub9.anInt2889;
							}
						} else {
							i -= i_92_;
							i_92_ -= i_91_;
							i_91_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_91_];
							while (--i_92_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_91_, 0, 0, i_94_ >> 16, i_93_ >> 16, i_97_, i_109_);
								i_93_ += i_106_;
								i_94_ += i_105_;
								i_97_ += i_110_;
								i_91_ += Class38_Sub20_Sub9.anInt2889;
							}
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_91_, 0, 0, i_95_ >> 16, i_93_ >> 16, i_97_, i_109_);
								i_93_ += i_106_;
								i_95_ += i_107_;
								i_97_ += i_110_;
								i_91_ += Class38_Sub20_Sub9.anInt2889;
							}
						}
					} else {
						i_95_ = i_94_ <<= 16;
						if (i_91_ < 0) {
							i_95_ -= i_106_ * i_91_;
							i_94_ -= i_105_ * i_91_;
							i_97_ -= i_110_ * i_91_;
							i_91_ = 0;
						}
						i_93_ <<= 16;
						if (i < 0) {
							i_93_ -= i_107_ * i;
							i = 0;
						}
						if (i_106_ < i_105_) {
							i_92_ -= i;
							i -= i_91_;
							i_91_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_91_];
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_91_, 0, 0, i_95_ >> 16, i_94_ >> 16, i_97_, i_109_);
								i_95_ += i_106_;
								i_94_ += i_105_;
								i_97_ += i_110_;
								i_91_ += Class38_Sub20_Sub9.anInt2889;
							}
							while (--i_92_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_91_, 0, 0, i_93_ >> 16, i_94_ >> 16, i_97_, i_109_);
								i_93_ += i_107_;
								i_94_ += i_105_;
								i_97_ += i_110_;
								i_91_ += Class38_Sub20_Sub9.anInt2889;
							}
						} else {
							i_92_ -= i;
							i -= i_91_;
							i_91_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_91_];
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_91_, 0, 0, i_94_ >> 16, i_95_ >> 16, i_97_, i_109_);
								i_95_ += i_106_;
								i_94_ += i_105_;
								i_97_ += i_110_;
								i_91_ += Class38_Sub20_Sub9.anInt2889;
							}
							while (--i_92_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_91_, 0, 0, i_94_ >> 16, i_93_ >> 16, i_97_, i_109_);
								i_93_ += i_107_;
								i_94_ += i_105_;
								i_97_ += i_110_;
								i_91_ += Class38_Sub20_Sub9.anInt2889;
							}
						}
					}
				}
			} else if (i_92_ < Class38_Sub20_Sub9_Sub4.anInt3538) {
				if (i > Class38_Sub20_Sub9_Sub4.anInt3538)
					i = Class38_Sub20_Sub9_Sub4.anInt3538;
				if (i_91_ > Class38_Sub20_Sub9_Sub4.anInt3538)
					i_91_ = Class38_Sub20_Sub9_Sub4.anInt3538;
				i_98_ = (i_98_ << 8) - i_109_ * i_95_ + i_109_;
				if (i < i_91_) {
					i_94_ = i_95_ <<= 16;
					if (i_92_ < 0) {
						i_94_ -= i_105_ * i_92_;
						i_95_ -= i_107_ * i_92_;
						i_98_ -= i_110_ * i_92_;
						i_92_ = 0;
					}
					i_93_ <<= 16;
					if (i < 0) {
						i_93_ -= i_106_ * i;
						i = 0;
					}
					if (i_105_ < i_107_) {
						i_91_ -= i;
						i -= i_92_;
						i_92_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_92_];
						while (--i >= 0) {
							Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_92_, 0, 0, i_94_ >> 16, i_95_ >> 16, i_98_, i_109_);
							i_94_ += i_105_;
							i_95_ += i_107_;
							i_98_ += i_110_;
							i_92_ += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i_91_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_92_, 0, 0, i_94_ >> 16, i_93_ >> 16, i_98_, i_109_);
							i_94_ += i_105_;
							i_93_ += i_106_;
							i_98_ += i_110_;
							i_92_ += Class38_Sub20_Sub9.anInt2889;
						}
					} else {
						i_91_ -= i;
						i -= i_92_;
						i_92_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_92_];
						while (--i >= 0) {
							Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_92_, 0, 0, i_95_ >> 16, i_94_ >> 16, i_98_, i_109_);
							i_94_ += i_105_;
							i_95_ += i_107_;
							i_98_ += i_110_;
							i_92_ += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i_91_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_92_, 0, 0, i_93_ >> 16, i_94_ >> 16, i_98_, i_109_);
							i_94_ += i_105_;
							i_93_ += i_106_;
							i_98_ += i_110_;
							i_92_ += Class38_Sub20_Sub9.anInt2889;
						}
					}
				} else {
					i_93_ = i_95_ <<= 16;
					if (i_92_ < 0) {
						i_93_ -= i_105_ * i_92_;
						i_95_ -= i_107_ * i_92_;
						i_98_ -= i_110_ * i_92_;
						i_92_ = 0;
					}
					i_94_ <<= 16;
					if (i_91_ < 0) {
						i_94_ -= i_106_ * i_91_;
						i_91_ = 0;
					}
					if (i_105_ < i_107_) {
						i -= i_91_;
						i_91_ -= i_92_;
						i_92_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_92_];
						while (--i_91_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_92_, 0, 0, i_93_ >> 16, i_95_ >> 16, i_98_, i_109_);
							i_93_ += i_105_;
							i_95_ += i_107_;
							i_98_ += i_110_;
							i_92_ += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i >= 0) {
							Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_92_, 0, 0, i_94_ >> 16, i_95_ >> 16, i_98_, i_109_);
							i_94_ += i_106_;
							i_95_ += i_107_;
							i_98_ += i_110_;
							i_92_ += Class38_Sub20_Sub9.anInt2889;
						}
					} else {
						i -= i_91_;
						i_91_ -= i_92_;
						i_92_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_92_];
						while (--i_91_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_92_, 0, 0, i_95_ >> 16, i_93_ >> 16, i_98_, i_109_);
							i_93_ += i_105_;
							i_95_ += i_107_;
							i_98_ += i_110_;
							i_92_ += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i >= 0) {
							Class38_Sub20_Sub9_Sub4.method1183(Class38_Sub20_Sub9.anIntArray2886, i_92_, 0, 0, i_95_ >> 16, i_94_ >> 16, i_98_, i_109_);
							i_94_ += i_106_;
							i_95_ += i_107_;
							i_98_ += i_110_;
							i_92_ += Class38_Sub20_Sub9.anInt2889;
						}
					}
				}
			}
		}
	}

	private static final void method1189(int i, int i_111_, int i_112_, int i_113_) {
		Class38_Sub20_Sub9_Sub4.anInt3537 = i_112_ - i;
		Class38_Sub20_Sub9_Sub4.anInt3538 = i_113_ - i_111_;
		Class38_Sub20_Sub9_Sub4.method1187();
		if (Class38_Sub20_Sub9_Sub4.anIntArray3523.length < Class38_Sub20_Sub9_Sub4.anInt3538)
			Class38_Sub20_Sub9_Sub4.anIntArray3523 = new int[Class17_Sub1.method604(Class38_Sub20_Sub9_Sub4.anInt3538, -30310)];
		int i_114_ = i_111_ * Class38_Sub20_Sub9.anInt2889 + i;
		for (int i_115_ = 0; i_115_ < Class38_Sub20_Sub9_Sub4.anInt3538; i_115_++) {
			Class38_Sub20_Sub9_Sub4.anIntArray3523[i_115_] = i_114_;
			i_114_ += Class38_Sub20_Sub9.anInt2889;
		}
	}

	private static final void method1190(int[] is, int i, int i_116_, int i_117_, int i_118_, int i_119_) {
		if (Class38_Sub20_Sub9_Sub4.aBool3524) {
			if (i_119_ > Class38_Sub20_Sub9_Sub4.anInt3537)
				i_119_ = Class38_Sub20_Sub9_Sub4.anInt3537;
			if (i_118_ < 0)
				i_118_ = 0;
		}
		if (i_118_ < i_119_) {
			i += i_118_;
			i_117_ = i_119_ - i_118_ >> 2;
			if (Class38_Sub20_Sub9_Sub4.anInt3535 == 0) {
				while (--i_117_ >= 0) {
					is[i++] = i_116_;
					is[i++] = i_116_;
					is[i++] = i_116_;
					is[i++] = i_116_;
				}
				i_117_ = i_119_ - i_118_ & 0x3;
				while (--i_117_ >= 0)
					is[i++] = i_116_;
			} else if (Class38_Sub20_Sub9_Sub4.anInt3535 == 254) {
				while (--i_117_ >= 0) {
					is[i++] = is[i];
					is[i++] = is[i];
					is[i++] = is[i];
					is[i++] = is[i];
				}
				i_117_ = i_119_ - i_118_ & 0x3;
				while (--i_117_ >= 0)
					is[i++] = is[i];
			} else {
				int i_120_ = Class38_Sub20_Sub9_Sub4.anInt3535;
				int i_121_ = 256 - Class38_Sub20_Sub9_Sub4.anInt3535;
				i_116_ = ((i_116_ & 0xff00ff) * i_121_ >> 8 & 0xff00ff) + ((i_116_ & 0xff00) * i_121_ >> 8 & 0xff00);
				while (--i_117_ >= 0) {
					int i_122_ = is[i];
					is[i++] = i_116_ + ((i_122_ & 0xff00ff) * i_120_ >> 8 & 0xff00ff) + ((i_122_ & 0xff00) * i_120_ >> 8 & 0xff00);
					i_122_ = is[i];
					is[i++] = i_116_ + ((i_122_ & 0xff00ff) * i_120_ >> 8 & 0xff00ff) + ((i_122_ & 0xff00) * i_120_ >> 8 & 0xff00);
					i_122_ = is[i];
					is[i++] = i_116_ + ((i_122_ & 0xff00ff) * i_120_ >> 8 & 0xff00ff) + ((i_122_ & 0xff00) * i_120_ >> 8 & 0xff00);
					i_122_ = is[i];
					is[i++] = i_116_ + ((i_122_ & 0xff00ff) * i_120_ >> 8 & 0xff00ff) + ((i_122_ & 0xff00) * i_120_ >> 8 & 0xff00);
				}
				i_117_ = i_119_ - i_118_ & 0x3;
				while (--i_117_ >= 0) {
					int i_123_ = is[i];
					is[i++] = i_116_ + ((i_123_ & 0xff00ff) * i_120_ >> 8 & 0xff00ff) + ((i_123_ & 0xff00) * i_120_ >> 8 & 0xff00);
				}
			}
		}
	}

	static final void method1191() {
		Class38_Sub20_Sub9_Sub4.method1189(Class38_Sub20_Sub9.anInt2887, Class38_Sub20_Sub9.anInt2885, Class38_Sub20_Sub9.anInt2890, Class38_Sub20_Sub9.anInt2888);
	}

	static final int method1192(int i, double d) {
		double d_124_ = (i >> 16) / 256.0;
		double d_125_ = (i >> 8 & 0xff) / 256.0;
		double d_126_ = (i & 0xff) / 256.0;
		d_124_ = Math.pow(d_124_, d);
		d_125_ = Math.pow(d_125_, d);
		d_126_ = Math.pow(d_126_, d);
		int i_127_ = (int) (d_124_ * 256.0);
		int i_128_ = (int) (d_125_ * 256.0);
		int i_129_ = (int) (d_126_ * 256.0);
		return (i_127_ << 16) + (i_128_ << 8) + i_129_;
	}

	static final void method1193(int i, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_) {
		int i_136_ = 0;
		if (i_130_ != i)
			i_136_ = (i_133_ - i_132_ << 16) / (i_130_ - i);
		int i_137_ = 0;
		if (i_131_ != i_130_)
			i_137_ = (i_134_ - i_133_ << 16) / (i_131_ - i_130_);
		int i_138_ = 0;
		if (i_131_ != i)
			i_138_ = (i_132_ - i_134_ << 16) / (i - i_131_);
		if (i <= i_130_ && i <= i_131_) {
			if (i < Class38_Sub20_Sub9_Sub4.anInt3538) {
				if (i_130_ > Class38_Sub20_Sub9_Sub4.anInt3538)
					i_130_ = Class38_Sub20_Sub9_Sub4.anInt3538;
				if (i_131_ > Class38_Sub20_Sub9_Sub4.anInt3538)
					i_131_ = Class38_Sub20_Sub9_Sub4.anInt3538;
				if (i_130_ < i_131_) {
					i_134_ = i_132_ <<= 16;
					if (i < 0) {
						i_134_ -= i_138_ * i;
						i_132_ -= i_136_ * i;
						i = 0;
					}
					i_133_ <<= 16;
					if (i_130_ < 0) {
						i_133_ -= i_137_ * i_130_;
						i_130_ = 0;
					}
					if (i != i_130_ && i_138_ < i_136_ || i == i_130_ && i_138_ > i_137_) {
						i_131_ -= i_130_;
						i_130_ -= i;
						i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
						while (--i_130_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i, i_135_, 0, i_134_ >> 16, i_132_ >> 16);
							i_134_ += i_138_;
							i_132_ += i_136_;
							i += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i_131_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i, i_135_, 0, i_134_ >> 16, i_133_ >> 16);
							i_134_ += i_138_;
							i_133_ += i_137_;
							i += Class38_Sub20_Sub9.anInt2889;
						}
					} else {
						i_131_ -= i_130_;
						i_130_ -= i;
						i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
						while (--i_130_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i, i_135_, 0, i_132_ >> 16, i_134_ >> 16);
							i_134_ += i_138_;
							i_132_ += i_136_;
							i += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i_131_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i, i_135_, 0, i_133_ >> 16, i_134_ >> 16);
							i_134_ += i_138_;
							i_133_ += i_137_;
							i += Class38_Sub20_Sub9.anInt2889;
						}
					}
				} else {
					i_133_ = i_132_ <<= 16;
					if (i < 0) {
						i_133_ -= i_138_ * i;
						i_132_ -= i_136_ * i;
						i = 0;
					}
					i_134_ <<= 16;
					if (i_131_ < 0) {
						i_134_ -= i_137_ * i_131_;
						i_131_ = 0;
					}
					if (i != i_131_ && i_138_ < i_136_ || i == i_131_ && i_137_ > i_136_) {
						i_130_ -= i_131_;
						i_131_ -= i;
						i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
						while (--i_131_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i, i_135_, 0, i_133_ >> 16, i_132_ >> 16);
							i_133_ += i_138_;
							i_132_ += i_136_;
							i += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i_130_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i, i_135_, 0, i_134_ >> 16, i_132_ >> 16);
							i_134_ += i_137_;
							i_132_ += i_136_;
							i += Class38_Sub20_Sub9.anInt2889;
						}
					} else {
						i_130_ -= i_131_;
						i_131_ -= i;
						i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
						while (--i_131_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i, i_135_, 0, i_132_ >> 16, i_133_ >> 16);
							i_133_ += i_138_;
							i_132_ += i_136_;
							i += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i_130_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i, i_135_, 0, i_132_ >> 16, i_134_ >> 16);
							i_134_ += i_137_;
							i_132_ += i_136_;
							i += Class38_Sub20_Sub9.anInt2889;
						}
					}
				}
			}
		} else if (i_130_ <= i_131_) {
			if (i_130_ < Class38_Sub20_Sub9_Sub4.anInt3538) {
				if (i_131_ > Class38_Sub20_Sub9_Sub4.anInt3538)
					i_131_ = Class38_Sub20_Sub9_Sub4.anInt3538;
				if (i > Class38_Sub20_Sub9_Sub4.anInt3538)
					i = Class38_Sub20_Sub9_Sub4.anInt3538;
				if (i_131_ < i) {
					i_132_ = i_133_ <<= 16;
					if (i_130_ < 0) {
						i_132_ -= i_136_ * i_130_;
						i_133_ -= i_137_ * i_130_;
						i_130_ = 0;
					}
					i_134_ <<= 16;
					if (i_131_ < 0) {
						i_134_ -= i_138_ * i_131_;
						i_131_ = 0;
					}
					if (i_130_ != i_131_ && i_136_ < i_137_ || i_130_ == i_131_ && i_136_ > i_138_) {
						i -= i_131_;
						i_131_ -= i_130_;
						i_130_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_130_];
						while (--i_131_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_130_, i_135_, 0, i_132_ >> 16, i_133_ >> 16);
							i_132_ += i_136_;
							i_133_ += i_137_;
							i_130_ += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_130_, i_135_, 0, i_132_ >> 16, i_134_ >> 16);
							i_132_ += i_136_;
							i_134_ += i_138_;
							i_130_ += Class38_Sub20_Sub9.anInt2889;
						}
					} else {
						i -= i_131_;
						i_131_ -= i_130_;
						i_130_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_130_];
						while (--i_131_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_130_, i_135_, 0, i_133_ >> 16, i_132_ >> 16);
							i_132_ += i_136_;
							i_133_ += i_137_;
							i_130_ += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_130_, i_135_, 0, i_134_ >> 16, i_132_ >> 16);
							i_132_ += i_136_;
							i_134_ += i_138_;
							i_130_ += Class38_Sub20_Sub9.anInt2889;
						}
					}
				} else {
					i_134_ = i_133_ <<= 16;
					if (i_130_ < 0) {
						i_134_ -= i_136_ * i_130_;
						i_133_ -= i_137_ * i_130_;
						i_130_ = 0;
					}
					i_132_ <<= 16;
					if (i < 0) {
						i_132_ -= i_138_ * i;
						i = 0;
					}
					if (i_136_ < i_137_) {
						i_131_ -= i;
						i -= i_130_;
						i_130_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_130_];
						while (--i >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_130_, i_135_, 0, i_134_ >> 16, i_133_ >> 16);
							i_134_ += i_136_;
							i_133_ += i_137_;
							i_130_ += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i_131_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_130_, i_135_, 0, i_132_ >> 16, i_133_ >> 16);
							i_132_ += i_138_;
							i_133_ += i_137_;
							i_130_ += Class38_Sub20_Sub9.anInt2889;
						}
					} else {
						i_131_ -= i;
						i -= i_130_;
						i_130_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_130_];
						while (--i >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_130_, i_135_, 0, i_133_ >> 16, i_134_ >> 16);
							i_134_ += i_136_;
							i_133_ += i_137_;
							i_130_ += Class38_Sub20_Sub9.anInt2889;
						}
						while (--i_131_ >= 0) {
							Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_130_, i_135_, 0, i_133_ >> 16, i_132_ >> 16);
							i_132_ += i_138_;
							i_133_ += i_137_;
							i_130_ += Class38_Sub20_Sub9.anInt2889;
						}
					}
				}
			}
		} else if (i_131_ < Class38_Sub20_Sub9_Sub4.anInt3538) {
			if (i > Class38_Sub20_Sub9_Sub4.anInt3538)
				i = Class38_Sub20_Sub9_Sub4.anInt3538;
			if (i_130_ > Class38_Sub20_Sub9_Sub4.anInt3538)
				i_130_ = Class38_Sub20_Sub9_Sub4.anInt3538;
			if (i < i_130_) {
				i_133_ = i_134_ <<= 16;
				if (i_131_ < 0) {
					i_133_ -= i_137_ * i_131_;
					i_134_ -= i_138_ * i_131_;
					i_131_ = 0;
				}
				i_132_ <<= 16;
				if (i < 0) {
					i_132_ -= i_136_ * i;
					i = 0;
				}
				if (i_137_ < i_138_) {
					i_130_ -= i;
					i -= i_131_;
					i_131_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_131_];
					while (--i >= 0) {
						Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_131_, i_135_, 0, i_133_ >> 16, i_134_ >> 16);
						i_133_ += i_137_;
						i_134_ += i_138_;
						i_131_ += Class38_Sub20_Sub9.anInt2889;
					}
					while (--i_130_ >= 0) {
						Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_131_, i_135_, 0, i_133_ >> 16, i_132_ >> 16);
						i_133_ += i_137_;
						i_132_ += i_136_;
						i_131_ += Class38_Sub20_Sub9.anInt2889;
					}
				} else {
					i_130_ -= i;
					i -= i_131_;
					i_131_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_131_];
					while (--i >= 0) {
						Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_131_, i_135_, 0, i_134_ >> 16, i_133_ >> 16);
						i_133_ += i_137_;
						i_134_ += i_138_;
						i_131_ += Class38_Sub20_Sub9.anInt2889;
					}
					while (--i_130_ >= 0) {
						Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_131_, i_135_, 0, i_132_ >> 16, i_133_ >> 16);
						i_133_ += i_137_;
						i_132_ += i_136_;
						i_131_ += Class38_Sub20_Sub9.anInt2889;
					}
				}
			} else {
				i_132_ = i_134_ <<= 16;
				if (i_131_ < 0) {
					i_132_ -= i_137_ * i_131_;
					i_134_ -= i_138_ * i_131_;
					i_131_ = 0;
				}
				i_133_ <<= 16;
				if (i_130_ < 0) {
					i_133_ -= i_136_ * i_130_;
					i_130_ = 0;
				}
				if (i_137_ < i_138_) {
					i -= i_130_;
					i_130_ -= i_131_;
					i_131_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_131_];
					while (--i_130_ >= 0) {
						Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_131_, i_135_, 0, i_132_ >> 16, i_134_ >> 16);
						i_132_ += i_137_;
						i_134_ += i_138_;
						i_131_ += Class38_Sub20_Sub9.anInt2889;
					}
					while (--i >= 0) {
						Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_131_, i_135_, 0, i_133_ >> 16, i_134_ >> 16);
						i_133_ += i_136_;
						i_134_ += i_138_;
						i_131_ += Class38_Sub20_Sub9.anInt2889;
					}
				} else {
					i -= i_130_;
					i_130_ -= i_131_;
					i_131_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_131_];
					while (--i_130_ >= 0) {
						Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_131_, i_135_, 0, i_134_ >> 16, i_132_ >> 16);
						i_132_ += i_137_;
						i_134_ += i_138_;
						i_131_ += Class38_Sub20_Sub9.anInt2889;
					}
					while (--i >= 0) {
						Class38_Sub20_Sub9_Sub4.method1190(Class38_Sub20_Sub9.anIntArray2886, i_131_, i_135_, 0, i_134_ >> 16, i_133_ >> 16);
						i_133_ += i_136_;
						i_134_ += i_138_;
						i_131_ += Class38_Sub20_Sub9.anInt2889;
					}
				}
			}
		}
	}

	static final void method1194(int i, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_) {
		int[] is = Class38_Sub20_Sub9_Sub4.anInterface3_3533.method9(114, i_156_);
		if (is == null) {
			int i_157_ = Class38_Sub20_Sub9_Sub4.anInterface3_3533.method7(i_156_, false);
			Class38_Sub20_Sub9_Sub4.method1188(i, i_139_, i_140_, i_141_, i_142_, i_143_, Class38_Sub20_Sub9_Sub4.method1199(i_157_, i_144_), Class38_Sub20_Sub9_Sub4.method1199(i_157_, i_145_), Class38_Sub20_Sub9_Sub4.method1199(i_157_, i_146_));
		} else {
			Class38_Sub20_Sub9_Sub4.aBool3529 = Class38_Sub20_Sub9_Sub4.anInterface3_3533.method8(true, i_156_);
			Class38_Sub20_Sub9_Sub4.aBool3527 = Class38_Sub20_Sub9_Sub4.anInterface3_3533.method10(17912, i_156_);
			int i_158_ = i_142_ - i_141_;
			int i_159_ = i_139_ - i;
			int i_160_ = i_143_ - i_141_;
			int i_161_ = i_140_ - i;
			int i_162_ = i_145_ - i_144_;
			int i_163_ = i_146_ - i_144_;
			int i_164_ = 0;
			if (i_139_ != i)
				i_164_ = (i_142_ - i_141_ << 16) / (i_139_ - i);
			int i_165_ = 0;
			if (i_140_ != i_139_)
				i_165_ = (i_143_ - i_142_ << 16) / (i_140_ - i_139_);
			int i_166_ = 0;
			if (i_140_ != i)
				i_166_ = (i_141_ - i_143_ << 16) / (i - i_140_);
			int i_167_ = i_158_ * i_161_ - i_160_ * i_159_;
			if (i_167_ != 0) {
				int i_168_ = (i_162_ * i_161_ - i_163_ * i_159_ << 9) / i_167_;
				int i_169_ = (i_163_ * i_158_ - i_162_ * i_160_ << 9) / i_167_;
				i_148_ = i_147_ - i_148_;
				i_151_ = i_150_ - i_151_;
				i_154_ = i_153_ - i_154_;
				i_149_ -= i_147_;
				i_152_ -= i_150_;
				i_155_ -= i_153_;
				int i_170_ = i_149_ * i_150_ - i_152_ * i_147_ << 14;
				int i_171_ = i_152_ * i_153_ - i_155_ * i_150_ << 8;
				int i_172_ = i_155_ * i_147_ - i_149_ * i_153_ << 5;
				int i_173_ = i_148_ * i_150_ - i_151_ * i_147_ << 14;
				int i_174_ = i_151_ * i_153_ - i_154_ * i_150_ << 8;
				int i_175_ = i_154_ * i_147_ - i_148_ * i_153_ << 5;
				int i_176_ = i_151_ * i_149_ - i_148_ * i_152_ << 14;
				int i_177_ = i_154_ * i_152_ - i_151_ * i_155_ << 8;
				int i_178_ = i_148_ * i_155_ - i_154_ * i_149_ << 5;
				if (i <= i_139_ && i <= i_140_) {
					if (i < Class38_Sub20_Sub9_Sub4.anInt3538) {
						if (i_139_ > Class38_Sub20_Sub9_Sub4.anInt3538)
							i_139_ = Class38_Sub20_Sub9_Sub4.anInt3538;
						if (i_140_ > Class38_Sub20_Sub9_Sub4.anInt3538)
							i_140_ = Class38_Sub20_Sub9_Sub4.anInt3538;
						i_144_ = (i_144_ << 9) - i_168_ * i_141_ + i_168_;
						if (i_139_ < i_140_) {
							i_143_ = i_141_ <<= 16;
							if (i < 0) {
								i_143_ -= i_166_ * i;
								i_141_ -= i_164_ * i;
								i_144_ -= i_169_ * i;
								i = 0;
							}
							i_142_ <<= 16;
							if (i_139_ < 0) {
								i_142_ -= i_165_ * i_139_;
								i_139_ = 0;
							}
							int i_179_ = i - Class38_Sub20_Sub9_Sub4.anInt3536;
							i_170_ += i_172_ * i_179_;
							i_173_ += i_175_ * i_179_;
							i_176_ += i_178_ * i_179_;
							if (i != i_139_ && i_166_ < i_164_ || i == i_139_ && i_166_ > i_165_) {
								i_140_ -= i_139_;
								i_139_ -= i;
								i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
								while (--i_139_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_143_ >> 16, i_141_ >> 16, i_144_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_143_ += i_166_;
									i_141_ += i_164_;
									i_144_ += i_169_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
								while (--i_140_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_143_ >> 16, i_142_ >> 16, i_144_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_143_ += i_166_;
									i_142_ += i_165_;
									i_144_ += i_169_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
							} else {
								i_140_ -= i_139_;
								i_139_ -= i;
								i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
								while (--i_139_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_141_ >> 16, i_143_ >> 16, i_144_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_143_ += i_166_;
									i_141_ += i_164_;
									i_144_ += i_169_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
								while (--i_140_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_142_ >> 16, i_143_ >> 16, i_144_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_143_ += i_166_;
									i_142_ += i_165_;
									i_144_ += i_169_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
							}
						} else {
							i_142_ = i_141_ <<= 16;
							if (i < 0) {
								i_142_ -= i_166_ * i;
								i_141_ -= i_164_ * i;
								i_144_ -= i_169_ * i;
								i = 0;
							}
							i_143_ <<= 16;
							if (i_140_ < 0) {
								i_143_ -= i_165_ * i_140_;
								i_140_ = 0;
							}
							int i_180_ = i - Class38_Sub20_Sub9_Sub4.anInt3536;
							i_170_ += i_172_ * i_180_;
							i_173_ += i_175_ * i_180_;
							i_176_ += i_178_ * i_180_;
							if (i != i_140_ && i_166_ < i_164_ || i == i_140_ && i_165_ > i_164_) {
								i_139_ -= i_140_;
								i_140_ -= i;
								i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
								while (--i_140_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_142_ >> 16, i_141_ >> 16, i_144_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_142_ += i_166_;
									i_141_ += i_164_;
									i_144_ += i_169_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
								while (--i_139_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_143_ >> 16, i_141_ >> 16, i_144_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_143_ += i_165_;
									i_141_ += i_164_;
									i_144_ += i_169_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
							} else {
								i_139_ -= i_140_;
								i_140_ -= i;
								i = Class38_Sub20_Sub9_Sub4.anIntArray3523[i];
								while (--i_140_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_141_ >> 16, i_142_ >> 16, i_144_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_142_ += i_166_;
									i_141_ += i_164_;
									i_144_ += i_169_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
								while (--i_139_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i, i_141_ >> 16, i_143_ >> 16, i_144_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_143_ += i_165_;
									i_141_ += i_164_;
									i_144_ += i_169_;
									i += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
							}
						}
					}
				} else if (i_139_ <= i_140_) {
					if (i_139_ < Class38_Sub20_Sub9_Sub4.anInt3538) {
						if (i_140_ > Class38_Sub20_Sub9_Sub4.anInt3538)
							i_140_ = Class38_Sub20_Sub9_Sub4.anInt3538;
						if (i > Class38_Sub20_Sub9_Sub4.anInt3538)
							i = Class38_Sub20_Sub9_Sub4.anInt3538;
						i_145_ = (i_145_ << 9) - i_168_ * i_142_ + i_168_;
						if (i_140_ < i) {
							i_141_ = i_142_ <<= 16;
							if (i_139_ < 0) {
								i_141_ -= i_164_ * i_139_;
								i_142_ -= i_165_ * i_139_;
								i_145_ -= i_169_ * i_139_;
								i_139_ = 0;
							}
							i_143_ <<= 16;
							if (i_140_ < 0) {
								i_143_ -= i_166_ * i_140_;
								i_140_ = 0;
							}
							int i_181_ = i_139_ - Class38_Sub20_Sub9_Sub4.anInt3536;
							i_170_ += i_172_ * i_181_;
							i_173_ += i_175_ * i_181_;
							i_176_ += i_178_ * i_181_;
							if (i_139_ != i_140_ && i_164_ < i_165_ || i_139_ == i_140_ && i_164_ > i_166_) {
								i -= i_140_;
								i_140_ -= i_139_;
								i_139_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_139_];
								while (--i_140_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_139_, i_141_ >> 16, i_142_ >> 16, i_145_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_141_ += i_164_;
									i_142_ += i_165_;
									i_145_ += i_169_;
									i_139_ += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
								while (--i >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_139_, i_141_ >> 16, i_143_ >> 16, i_145_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_141_ += i_164_;
									i_143_ += i_166_;
									i_145_ += i_169_;
									i_139_ += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
							} else {
								i -= i_140_;
								i_140_ -= i_139_;
								i_139_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_139_];
								while (--i_140_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_139_, i_142_ >> 16, i_141_ >> 16, i_145_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_141_ += i_164_;
									i_142_ += i_165_;
									i_145_ += i_169_;
									i_139_ += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
								while (--i >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_139_, i_143_ >> 16, i_141_ >> 16, i_145_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_141_ += i_164_;
									i_143_ += i_166_;
									i_145_ += i_169_;
									i_139_ += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
							}
						} else {
							i_143_ = i_142_ <<= 16;
							if (i_139_ < 0) {
								i_143_ -= i_164_ * i_139_;
								i_142_ -= i_165_ * i_139_;
								i_145_ -= i_169_ * i_139_;
								i_139_ = 0;
							}
							i_141_ <<= 16;
							if (i < 0) {
								i_141_ -= i_166_ * i;
								i = 0;
							}
							int i_182_ = i_139_ - Class38_Sub20_Sub9_Sub4.anInt3536;
							i_170_ += i_172_ * i_182_;
							i_173_ += i_175_ * i_182_;
							i_176_ += i_178_ * i_182_;
							if (i_164_ < i_165_) {
								i_140_ -= i;
								i -= i_139_;
								i_139_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_139_];
								while (--i >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_139_, i_143_ >> 16, i_142_ >> 16, i_145_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_143_ += i_164_;
									i_142_ += i_165_;
									i_145_ += i_169_;
									i_139_ += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
								while (--i_140_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_139_, i_141_ >> 16, i_142_ >> 16, i_145_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_141_ += i_166_;
									i_142_ += i_165_;
									i_145_ += i_169_;
									i_139_ += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
							} else {
								i_140_ -= i;
								i -= i_139_;
								i_139_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_139_];
								while (--i >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_139_, i_142_ >> 16, i_143_ >> 16, i_145_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_143_ += i_164_;
									i_142_ += i_165_;
									i_145_ += i_169_;
									i_139_ += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
								while (--i_140_ >= 0) {
									Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_139_, i_142_ >> 16, i_141_ >> 16, i_145_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
									i_141_ += i_166_;
									i_142_ += i_165_;
									i_145_ += i_169_;
									i_139_ += Class38_Sub20_Sub9.anInt2889;
									i_170_ += i_172_;
									i_173_ += i_175_;
									i_176_ += i_178_;
								}
							}
						}
					}
				} else if (i_140_ < Class38_Sub20_Sub9_Sub4.anInt3538) {
					if (i > Class38_Sub20_Sub9_Sub4.anInt3538)
						i = Class38_Sub20_Sub9_Sub4.anInt3538;
					if (i_139_ > Class38_Sub20_Sub9_Sub4.anInt3538)
						i_139_ = Class38_Sub20_Sub9_Sub4.anInt3538;
					i_146_ = (i_146_ << 9) - i_168_ * i_143_ + i_168_;
					if (i < i_139_) {
						i_142_ = i_143_ <<= 16;
						if (i_140_ < 0) {
							i_142_ -= i_165_ * i_140_;
							i_143_ -= i_166_ * i_140_;
							i_146_ -= i_169_ * i_140_;
							i_140_ = 0;
						}
						i_141_ <<= 16;
						if (i < 0) {
							i_141_ -= i_164_ * i;
							i = 0;
						}
						int i_183_ = i_140_ - Class38_Sub20_Sub9_Sub4.anInt3536;
						i_170_ += i_172_ * i_183_;
						i_173_ += i_175_ * i_183_;
						i_176_ += i_178_ * i_183_;
						if (i_165_ < i_166_) {
							i_139_ -= i;
							i -= i_140_;
							i_140_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_140_];
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_140_, i_142_ >> 16, i_143_ >> 16, i_146_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
								i_142_ += i_165_;
								i_143_ += i_166_;
								i_146_ += i_169_;
								i_140_ += Class38_Sub20_Sub9.anInt2889;
								i_170_ += i_172_;
								i_173_ += i_175_;
								i_176_ += i_178_;
							}
							while (--i_139_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_140_, i_142_ >> 16, i_141_ >> 16, i_146_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
								i_142_ += i_165_;
								i_141_ += i_164_;
								i_146_ += i_169_;
								i_140_ += Class38_Sub20_Sub9.anInt2889;
								i_170_ += i_172_;
								i_173_ += i_175_;
								i_176_ += i_178_;
							}
						} else {
							i_139_ -= i;
							i -= i_140_;
							i_140_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_140_];
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_140_, i_143_ >> 16, i_142_ >> 16, i_146_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
								i_142_ += i_165_;
								i_143_ += i_166_;
								i_146_ += i_169_;
								i_140_ += Class38_Sub20_Sub9.anInt2889;
								i_170_ += i_172_;
								i_173_ += i_175_;
								i_176_ += i_178_;
							}
							while (--i_139_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_140_, i_141_ >> 16, i_142_ >> 16, i_146_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
								i_142_ += i_165_;
								i_141_ += i_164_;
								i_146_ += i_169_;
								i_140_ += Class38_Sub20_Sub9.anInt2889;
								i_170_ += i_172_;
								i_173_ += i_175_;
								i_176_ += i_178_;
							}
						}
					} else {
						i_141_ = i_143_ <<= 16;
						if (i_140_ < 0) {
							i_141_ -= i_165_ * i_140_;
							i_143_ -= i_166_ * i_140_;
							i_146_ -= i_169_ * i_140_;
							i_140_ = 0;
						}
						i_142_ <<= 16;
						if (i_139_ < 0) {
							i_142_ -= i_164_ * i_139_;
							i_139_ = 0;
						}
						int i_184_ = i_140_ - Class38_Sub20_Sub9_Sub4.anInt3536;
						i_170_ += i_172_ * i_184_;
						i_173_ += i_175_ * i_184_;
						i_176_ += i_178_ * i_184_;
						if (i_165_ < i_166_) {
							i -= i_139_;
							i_139_ -= i_140_;
							i_140_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_140_];
							while (--i_139_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_140_, i_141_ >> 16, i_143_ >> 16, i_146_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
								i_141_ += i_165_;
								i_143_ += i_166_;
								i_146_ += i_169_;
								i_140_ += Class38_Sub20_Sub9.anInt2889;
								i_170_ += i_172_;
								i_173_ += i_175_;
								i_176_ += i_178_;
							}
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_140_, i_142_ >> 16, i_143_ >> 16, i_146_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
								i_142_ += i_164_;
								i_143_ += i_166_;
								i_146_ += i_169_;
								i_140_ += Class38_Sub20_Sub9.anInt2889;
								i_170_ += i_172_;
								i_173_ += i_175_;
								i_176_ += i_178_;
							}
						} else {
							i -= i_139_;
							i_139_ -= i_140_;
							i_140_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[i_140_];
							while (--i_139_ >= 0) {
								Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_140_, i_143_ >> 16, i_141_ >> 16, i_146_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
								i_141_ += i_165_;
								i_143_ += i_166_;
								i_146_ += i_169_;
								i_140_ += Class38_Sub20_Sub9.anInt2889;
								i_170_ += i_172_;
								i_173_ += i_175_;
								i_176_ += i_178_;
							}
							while (--i >= 0) {
								Class38_Sub20_Sub9_Sub4.method1182(Class38_Sub20_Sub9.anIntArray2886, is, 0, 0, i_140_, i_143_ >> 16, i_142_ >> 16, i_146_, i_168_, i_170_, i_173_, i_176_, i_171_, i_174_, i_177_);
								i_142_ += i_164_;
								i_143_ += i_166_;
								i_146_ += i_169_;
								i_140_ += Class38_Sub20_Sub9.anInt2889;
								i_170_ += i_172_;
								i_173_ += i_175_;
								i_176_ += i_178_;
							}
						}
					}
				}
			}
		}
	}

	private static final void method1195(int[] is, int[] is_185_, int i, int i_186_, int i_187_, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_) {
		if (Class38_Sub20_Sub9_Sub4.aBool3524) {
			if (i_189_ > Class38_Sub20_Sub9_Sub4.anInt3537)
				i_189_ = Class38_Sub20_Sub9_Sub4.anInt3537;
			if (i_188_ < 0)
				i_188_ = 0;
		}
		if (i_188_ < i_189_) {
			i_187_ += i_188_;
			i_190_ += i_191_ * i_188_;
			int i_198_ = i_189_ - i_188_;
			do {
				if (Class38_Sub20_Sub9_Sub4.aBool3529) {
					int i_199_ = i_188_ - Class38_Sub20_Sub9_Sub4.anInt3521;
					i_192_ += i_195_ * i_199_;
					i_193_ += i_196_ * i_199_;
					i_194_ += i_197_ * i_199_;
					int i_200_ = i_194_ >> 12;
					int i_201_;
					int i_202_;
					if (i_200_ != 0) {
						i_201_ = i_192_ / i_200_;
						i_202_ = i_193_ / i_200_;
					} else {
						i_201_ = 0;
						i_202_ = 0;
					}
					i_192_ += i_195_ * i_198_;
					i_193_ += i_196_ * i_198_;
					i_194_ += i_197_ * i_198_;
					i_200_ = i_194_ >> 12;
					int i_203_;
					int i_204_;
					if (i_200_ != 0) {
						i_203_ = i_192_ / i_200_;
						i_204_ = i_193_ / i_200_;
					} else {
						i_203_ = 0;
						i_204_ = 0;
					}
					i = (i_201_ << 20) + i_202_;
					int i_205_ = ((i_203_ - i_201_) / i_198_ << 20) + (i_204_ - i_202_) / i_198_;
					i_198_ >>= 3;
					i_191_ <<= 3;
					int i_206_ = i_190_ >> 8;
					if (Class38_Sub20_Sub9_Sub4.aBool3527) {
						if (i_198_ > 0)
							do {
								i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)];
								is[i_187_++] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i += i_205_;
								i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)];
								is[i_187_++] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i += i_205_;
								i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)];
								is[i_187_++] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i += i_205_;
								i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)];
								is[i_187_++] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i += i_205_;
								i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)];
								is[i_187_++] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i += i_205_;
								i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)];
								is[i_187_++] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i += i_205_;
								i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)];
								is[i_187_++] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i += i_205_;
								i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)];
								is[i_187_++] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i += i_205_;
								i_190_ += i_191_;
								i_206_ = i_190_ >> 8;
							} while (--i_198_ > 0);
						i_198_ = i_189_ - i_188_ & 0x7;
						if (i_198_ > 0)
							do {
								i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)];
								is[i_187_++] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i += i_205_;
							} while (--i_198_ > 0);
					} else {
						if (i_198_ > 0)
							do {
								if ((i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_187_] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i_187_++;
								i += i_205_;
								if ((i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_187_] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i_187_++;
								i += i_205_;
								if ((i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_187_] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i_187_++;
								i += i_205_;
								if ((i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_187_] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i_187_++;
								i += i_205_;
								if ((i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_187_] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i_187_++;
								i += i_205_;
								if ((i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_187_] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i_187_++;
								i += i_205_;
								if ((i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_187_] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i_187_++;
								i += i_205_;
								if ((i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)]) != 0)
									is[i_187_] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
								i_187_++;
								i += i_205_;
								i_190_ += i_191_;
								i_206_ = i_190_ >> 8;
							} while (--i_198_ > 0);
						i_198_ = i_189_ - i_188_ & 0x7;
						if (i_198_ <= 0)
							break;
						do {
							if ((i_186_ = is_185_[(i & 0xfc0) + (i >>> 26)]) != 0)
								is[i_187_] = ((i_186_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_206_ & 0xff0000) >> 8;
							i_187_++;
							i += i_205_;
						} while (--i_198_ > 0);
					}
					break;
				}
				int i_207_ = i_188_ - Class38_Sub20_Sub9_Sub4.anInt3521;
				i_192_ += i_195_ * i_207_;
				i_193_ += i_196_ * i_207_;
				i_194_ += i_197_ * i_207_;
				int i_208_ = i_194_ >> 14;
				int i_209_;
				int i_210_;
				if (i_208_ != 0) {
					i_209_ = i_192_ / i_208_;
					i_210_ = i_193_ / i_208_;
				} else {
					i_209_ = 0;
					i_210_ = 0;
				}
				i_192_ += i_195_ * i_198_;
				i_193_ += i_196_ * i_198_;
				i_194_ += i_197_ * i_198_;
				i_208_ = i_194_ >> 14;
				int i_211_;
				int i_212_;
				if (i_208_ != 0) {
					i_211_ = i_192_ / i_208_;
					i_212_ = i_193_ / i_208_;
				} else {
					i_211_ = 0;
					i_212_ = 0;
				}
				i = (i_209_ << 18) + i_210_;
				int i_213_ = ((i_211_ - i_209_) / i_198_ << 18) + (i_212_ - i_210_) / i_198_;
				i_198_ >>= 3;
				i_191_ <<= 3;
				int i_214_ = i_190_ >> 8;
				if (Class38_Sub20_Sub9_Sub4.aBool3527) {
					if (i_198_ > 0)
						do {
							i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)];
							is[i_187_++] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i += i_213_;
							i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)];
							is[i_187_++] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i += i_213_;
							i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)];
							is[i_187_++] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i += i_213_;
							i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)];
							is[i_187_++] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i += i_213_;
							i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)];
							is[i_187_++] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i += i_213_;
							i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)];
							is[i_187_++] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i += i_213_;
							i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)];
							is[i_187_++] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i += i_213_;
							i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)];
							is[i_187_++] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i += i_213_;
							i_190_ += i_191_;
							i_214_ = i_190_ >> 8;
						} while (--i_198_ > 0);
					i_198_ = i_189_ - i_188_ & 0x7;
					if (i_198_ > 0) {
						do {
							i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)];
							is[i_187_++] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i += i_213_;
						} while (--i_198_ > 0);
						break;
					}
				} else {
					if (i_198_ > 0)
						do {
							if ((i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_187_] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i_187_++;
							i += i_213_;
							if ((i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_187_] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i_187_++;
							i += i_213_;
							if ((i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_187_] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i_187_++;
							i += i_213_;
							if ((i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_187_] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i_187_++;
							i += i_213_;
							if ((i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_187_] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i_187_++;
							i += i_213_;
							if ((i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_187_] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i_187_++;
							i += i_213_;
							if ((i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_187_] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i_187_++;
							i += i_213_;
							if ((i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_187_] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i_187_++;
							i += i_213_;
							i_190_ += i_191_;
							i_214_ = i_190_ >> 8;
						} while (--i_198_ > 0);
					i_198_ = i_189_ - i_188_ & 0x7;
					if (i_198_ > 0)
						do {
							if ((i_186_ = is_185_[(i & 0x3f80) + (i >>> 25)]) != 0)
								is[i_187_] = ((i_186_ & 0xff00ff) * i_214_ & ~0xff00ff) + ((i_186_ & 0xff00) * i_214_ & 0xff0000) >> 8;
							i_187_++;
							i += i_213_;
						} while (--i_198_ > 0);
				}
			} while (false);
		}
	}

	static final void method1196(Interface3 interface3) {
		Class38_Sub20_Sub9_Sub4.anInterface3_3533 = interface3;
	}

	private static final void method1197(double d, int i, int i_215_) {
		d += Math.random() * 0.03 - 0.015;
		int i_216_ = i * 128;
		for (int i_217_ = i; i_217_ < i_215_; i_217_++) {
			double d_218_ = (i_217_ >> 3) / 64.0 + 0.0078125;
			double d_219_ = (i_217_ & 0x7) / 8.0 + 0.0625;
			for (int i_220_ = 0; i_220_ < 128; i_220_++) {
				double d_221_ = i_220_ / 128.0;
				double d_222_ = d_221_;
				double d_223_ = d_221_;
				double d_224_ = d_221_;
				if (d_219_ != 0.0) {
					double d_225_;
					if (d_221_ < 0.5)
						d_225_ = d_221_ * (d_219_ + 1.0);
					else
						d_225_ = d_221_ + d_219_ - d_221_ * d_219_;
					double d_226_ = d_221_ * 2.0 - d_225_;
					double d_227_ = d_218_ + 0.3333333333333333;
					if (d_227_ > 1.0)
						d_227_--;
					double d_228_ = d_218_;
					double d_229_ = d_218_ - 0.3333333333333333;
					if (d_229_ < 0.0)
						d_229_++;
					if (d_227_ * 6.0 < 1.0)
						d_222_ = d_226_ + (d_225_ - d_226_) * 6.0 * d_227_;
					else if (d_227_ * 2.0 < 1.0)
						d_222_ = d_225_;
					else if (d_227_ * 3.0 < 2.0)
						d_222_ = d_226_ + (d_225_ - d_226_) * (0.6666666666666666 - d_227_) * 6.0;
					else
						d_222_ = d_226_;
					if (d_228_ * 6.0 < 1.0)
						d_223_ = d_226_ + (d_225_ - d_226_) * 6.0 * d_228_;
					else if (d_228_ * 2.0 < 1.0)
						d_223_ = d_225_;
					else if (d_228_ * 3.0 < 2.0)
						d_223_ = d_226_ + (d_225_ - d_226_) * (0.6666666666666666 - d_228_) * 6.0;
					else
						d_223_ = d_226_;
					if (d_229_ * 6.0 < 1.0)
						d_224_ = d_226_ + (d_225_ - d_226_) * 6.0 * d_229_;
					else if (d_229_ * 2.0 < 1.0)
						d_224_ = d_225_;
					else if (d_229_ * 3.0 < 2.0)
						d_224_ = d_226_ + (d_225_ - d_226_) * (0.6666666666666666 - d_229_) * 6.0;
					else
						d_224_ = d_226_;
				}
				int i_230_ = (int) (d_222_ * 256.0);
				int i_231_ = (int) (d_223_ * 256.0);
				int i_232_ = (int) (d_224_ * 256.0);
				int i_233_ = (i_230_ << 16) + (i_231_ << 8) + i_232_;
				i_233_ = Class38_Sub20_Sub9_Sub4.method1192(i_233_, d);
				if (i_233_ == 0)
					i_233_ = 1;
				Class38_Sub20_Sub9_Sub4.anIntArray3530[i_216_++] = i_233_;
			}
		}
	}

	static final void method1198(int i, int i_234_) {
		int i_235_ = Class38_Sub20_Sub9_Sub4.anIntArray3523[0];
		int i_236_ = i_235_ / Class38_Sub20_Sub9.anInt2889;
		int i_237_ = i_235_ - i_236_ * Class38_Sub20_Sub9.anInt2889;
		Class38_Sub20_Sub9_Sub4.anInt3521 = i - i_237_;
		Class38_Sub20_Sub9_Sub4.anInt3536 = i_234_ - i_236_;
		Class38_Sub20_Sub9_Sub4.anInt3531 = -Class38_Sub20_Sub9_Sub4.anInt3521;
		Class38_Sub20_Sub9_Sub4.anInt3522 = Class38_Sub20_Sub9_Sub4.anInt3537 - Class38_Sub20_Sub9_Sub4.anInt3521;
		Class38_Sub20_Sub9_Sub4.anInt3532 = -Class38_Sub20_Sub9_Sub4.anInt3536;
		Class38_Sub20_Sub9_Sub4.anInt3519 = Class38_Sub20_Sub9_Sub4.anInt3538 - Class38_Sub20_Sub9_Sub4.anInt3536;
	}

	private static final int method1199(int i, int i_238_) {
		i_238_ = i_238_ * (i & 0x7f) >> 7;
		if (i_238_ < 2)
			i_238_ = 2;
		else if (i_238_ > 126)
			i_238_ = 126;
		return (i & 0xff80) + i_238_;
	}

	static {
		Class38_Sub20_Sub9_Sub4.aBool3525 = true;
		Class38_Sub20_Sub9_Sub4.aBool3527 = false;
		Class38_Sub20_Sub9_Sub4.aBool3524 = false;
		Class38_Sub20_Sub9_Sub4.anIntArray3526 = new int[512];
		Class38_Sub20_Sub9_Sub4.anIntArray3528 = new int[2048];
		Class38_Sub20_Sub9_Sub4.anIntArray3523 = new int[1024];
		Class38_Sub20_Sub9_Sub4.anIntArray3520 = new int[2048];
		Class38_Sub20_Sub9_Sub4.anIntArray3530 = new int[65536];
		Class38_Sub20_Sub9_Sub4.anInt3535 = 0;
		Class38_Sub20_Sub9_Sub4.anIntArray3534 = new int[2048];
		for (int i = 1; i < 512; i++)
			Class38_Sub20_Sub9_Sub4.anIntArray3526[i] = 32768 / i;
		for (int i = 1; i < 2048; i++)
			Class38_Sub20_Sub9_Sub4.anIntArray3534[i] = 65536 / i;
		for (int i = 0; i < 2048; i++) {
			Class38_Sub20_Sub9_Sub4.anIntArray3520[i] = (int) (Math.sin(i * 0.0030679615) * 65536.0);
			Class38_Sub20_Sub9_Sub4.anIntArray3528[i] = (int) (Math.cos(i * 0.0030679615) * 65536.0);
		}
	}
}
