package com.javatar;/* Huffman - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Huffman {
	private final int[] chatMasks;
	private final int anInt903;
	int anInt902;
	private float[][] aFloatArrayArray899;
	private int[] bitSizes;
	private int[] decryptKeys;

	Huffman() {
		Class38_Sub15.method690(24);
		this.anInt902 = Class38_Sub15.method690(16);
		anInt903 = Class38_Sub15.method690(24);
		chatMasks = new int[anInt903];
		boolean bool = Class38_Sub15.method683() != 0;
		if (bool) {
			int i = 0;
			int i_2_ = Class38_Sub15.method690(5) + 1;
			while (i < anInt903) {
				int i_3_ = Class38_Sub15.method690(Class30.method282(
						(byte) -53, anInt903 - i));
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
					chatMasks[i++] = i_2_;
				i_2_++;
			}
		} else {
			boolean bool_5_ = Class38_Sub15.method683() != 0;
			for (int i = 0; i < anInt903; i++)
				if (bool_5_ && Class38_Sub15.method683() == 0)
					chatMasks[i] = 0;
				else
					chatMasks[i] = Class38_Sub15.method690(5) + 1;
		}
		method338();
		int i = Class38_Sub15.method690(4);
		if (i > 0) {
			float f = Class38_Sub15.method689(Class38_Sub15.method690(32));
			float f_6_ = Class38_Sub15.method689(Class38_Sub15.method690(32));
			int i_7_ = Class38_Sub15.method690(4) + 1;
			boolean bool_8_ = Class38_Sub15.method683() != 0;
			int i_9_;
			if (i == 1)
				i_9_ = Huffman.method336(anInt903, this.anInt902);
			else
				i_9_ = anInt903 * this.anInt902;
			bitSizes = new int[i_9_];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
				bitSizes[i_10_] = Class38_Sub15.method690(i_7_);
			aFloatArrayArray899 = new float[anInt903][this.anInt902];
			if (i == 1)
				for (int i_11_ = 0; i_11_ < anInt903; i_11_++) {
					float f_12_ = 0.0F;
					int i_13_ = 1;
					for (int i_14_ = 0; i_14_ < this.anInt902; i_14_++) {
						int i_15_ = i_11_ / i_13_ % i_9_;
						float f_16_ = bitSizes[i_15_] * f_6_ + f + f_12_;
						aFloatArrayArray899[i_11_][i_14_] = f_16_;
						if (bool_8_)
							f_12_ = f_16_;
						i_13_ *= i_9_;
					}
				}
			else
				for (int i_17_ = 0; i_17_ < anInt903; i_17_++) {
					float f_18_ = 0.0F;
					int i_19_ = i_17_ * this.anInt902;
					for (int i_20_ = 0; i_20_ < this.anInt902; i_20_++) {
						float f_21_ = bitSizes[i_19_] * f_6_ + f + f_18_;
						aFloatArrayArray899[i_17_][i_20_] = f_21_;
						if (bool_8_)
							f_18_ = f_21_;
						i_19_++;
					}
				}
		}
	}

	private static int method336(int i, int i_0_) {
		int i_1_;
		for (i_1_ = (int) Math.pow(i, 1.0 / i_0_) + 1; Class38_Sub20_Sub17
				.method1033(i_1_, i_0_) > i; i_1_--) {
			/* empty */
		}
		return i_1_;
	}

	final float[] method335() {
		return aFloatArrayArray899[method337()];
	}

	final int method337() {
		int i;
		for (i = 0; decryptKeys[i] >= 0; i = Class38_Sub15.method683() != 0 ? decryptKeys[i]
				: i + 1) {
			/* empty */
		}
		return decryptKeys[i] ^ 0xffffffff;
	}

	private void method338() {
		int[] is = new int[anInt903];
		int[] is_22_ = new int[33];
		for (int i = 0; i < anInt903; i++) {
			int i_23_ = chatMasks[i];
			if (i_23_ != 0) {
				int i_24_ = 1 << 32 - i_23_;
				int i_25_ = is_22_[i_23_];
				is[i] = i_25_;
				int i_26_;
				if ((i_25_ & i_24_) != 0)
					i_26_ = is_22_[i_23_ - 1];
				else {
					i_26_ = i_25_ | i_24_;
					for (int i_27_ = i_23_ - 1; i_27_ >= 1; i_27_--) {
						int i_28_ = is_22_[i_27_];
						if (i_28_ != i_25_)
							break;
						int i_29_ = 1 << 32 - i_27_;
						if ((i_28_ & i_29_) != 0) {
							is_22_[i_27_] = is_22_[i_27_ - 1];
							break;
						}
						is_22_[i_27_] = i_28_ | i_29_;
					}
				}
				is_22_[i_23_] = i_26_;
				for (int i_30_ = i_23_ + 1; i_30_ <= 32; i_30_++) {
					int i_31_ = is_22_[i_30_];
					if (i_31_ == i_25_)
						is_22_[i_30_] = i_26_;
				}
			}
		}
		decryptKeys = new int[8];
		int i = 0;
		for (int i_32_ = 0; i_32_ < anInt903; i_32_++) {
			int i_33_ = chatMasks[i_32_];
			if (i_33_ != 0) {
				int i_34_ = is[i_32_];
				int i_35_ = 0;
				for (int i_36_ = 0; i_36_ < i_33_; i_36_++) {
					int i_37_ = -2147483648 >>> i_36_;
					if ((i_34_ & i_37_) != 0) {
						if (decryptKeys[i_35_] == 0)
							decryptKeys[i_35_] = i;
						i_35_ = decryptKeys[i_35_];
					} else
						i_35_++;
					if (i_35_ >= decryptKeys.length) {
						int[] is_38_ = new int[decryptKeys.length * 2];
						for (int i_39_ = 0; i_39_ < decryptKeys.length; i_39_++)
							is_38_[i_39_] = decryptKeys[i_39_];
						decryptKeys = is_38_;
					}
					i_37_ >>>= 1;
				}
				decryptKeys[i_35_] = i_32_ ^ 0xffffffff;
				if (i_35_ >= i)
					i = i_35_ + 1;
			}
		}
	}
}
