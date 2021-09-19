package com.javatar.jagex;/* Class38_Sub20_Sub9_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub9_Sub1_Sub1 extends Class38_Sub20_Sub9_Sub1 {
	@Override
	final void method1079(byte[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = i + i_0_ * Class38_Sub20_Sub9.anInt2889;
		int i_5_ = Class38_Sub20_Sub9.anInt2889 - i_1_;
		int i_6_ = 0;
		int i_7_ = 0;
		if (i_0_ < Class38_Sub20_Sub9.anInt2885) {
			int i_8_ = Class38_Sub20_Sub9.anInt2885 - i_0_;
			i_2_ -= i_8_;
			i_0_ = Class38_Sub20_Sub9.anInt2885;
			i_7_ += i_8_ * i_1_;
			i_4_ += i_8_ * Class38_Sub20_Sub9.anInt2889;
		}
		if (i_0_ + i_2_ > Class38_Sub20_Sub9.anInt2888)
			i_2_ -= i_0_ + i_2_ - Class38_Sub20_Sub9.anInt2888;
		if (i < Class38_Sub20_Sub9.anInt2887) {
			int i_9_ = Class38_Sub20_Sub9.anInt2887 - i;
			i_1_ -= i_9_;
			i = Class38_Sub20_Sub9.anInt2887;
			i_7_ += i_9_;
			i_4_ += i_9_;
			i_6_ += i_9_;
			i_5_ += i_9_;
		}
		if (i + i_1_ > Class38_Sub20_Sub9.anInt2890) {
			int i_10_ = i + i_1_ - Class38_Sub20_Sub9.anInt2890;
			i_1_ -= i_10_;
			i_6_ += i_10_;
			i_5_ += i_10_;
		}
		if (i_1_ > 0 && i_2_ > 0)
			Class38_Sub20_Sub9_Sub1.method1085(Class38_Sub20_Sub9.anIntArray2886, is, i_3_, i_7_, i_4_, i_1_, i_2_, i_5_, i_6_);
	}

	@Override
	final void method1065(byte[] is, int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		int i_16_ = i + i_11_ * Class38_Sub20_Sub9.anInt2889;
		int i_17_ = Class38_Sub20_Sub9.anInt2889 - i_12_;
		int i_18_ = 0;
		int i_19_ = 0;
		if (i_11_ < Class38_Sub20_Sub9.anInt2885) {
			int i_20_ = Class38_Sub20_Sub9.anInt2885 - i_11_;
			i_13_ -= i_20_;
			i_11_ = Class38_Sub20_Sub9.anInt2885;
			i_19_ += i_20_ * i_12_;
			i_16_ += i_20_ * Class38_Sub20_Sub9.anInt2889;
		}
		if (i_11_ + i_13_ > Class38_Sub20_Sub9.anInt2888)
			i_13_ -= i_11_ + i_13_ - Class38_Sub20_Sub9.anInt2888;
		if (i < Class38_Sub20_Sub9.anInt2887) {
			int i_21_ = Class38_Sub20_Sub9.anInt2887 - i;
			i_12_ -= i_21_;
			i = Class38_Sub20_Sub9.anInt2887;
			i_19_ += i_21_;
			i_16_ += i_21_;
			i_18_ += i_21_;
			i_17_ += i_21_;
		}
		if (i + i_12_ > Class38_Sub20_Sub9.anInt2890) {
			int i_22_ = i + i_12_ - Class38_Sub20_Sub9.anInt2890;
			i_12_ -= i_22_;
			i_18_ += i_22_;
			i_17_ += i_22_;
		}
		if (i_12_ > 0 && i_13_ > 0)
			Class38_Sub20_Sub9_Sub1.method1070(Class38_Sub20_Sub9.anIntArray2886, is, i_14_, i_19_, i_16_, i_12_, i_13_, i_17_, i_18_, i_15_);
	}

	Class38_Sub20_Sub9_Sub1_Sub1(byte[] is) {
		super(is);
	}

	Class38_Sub20_Sub9_Sub1_Sub1(byte[] is, int[] is_23_, int[] is_24_, int[] is_25_, int[] is_26_, int[] is_27_, byte[][] is_28_) {
		super(is, is_23_, is_24_, is_25_, is_26_, is_27_, is_28_);
	}
}
