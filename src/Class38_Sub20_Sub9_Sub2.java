/* Class38_Sub20_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub9_Sub2 extends Class38_Sub20_Sub9 {
	byte[] aByteArray3239;
	int anInt3240;
	int[] anIntArray3241;
	int anInt3242;
	int anInt3243;
	int anInt3244;
	int anInt3245;
	int anInt3246;

	private static final void method1090(int[] is, byte[] is_12_, int[] is_13_, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		int i_19_ = -(i_15_ >> 2);
		i_15_ = -(i_15_ & 0x3);
		for (int i_20_ = -i_16_; i_20_ < 0; i_20_++) {
			for (int i_21_ = i_19_; i_21_ < 0; i_21_++) {
				int i_22_ = is_12_[i++];
				if (i_22_ != 0)
					is[i_14_++] = is_13_[i_22_ & 0xff];
				else
					i_14_++;
				i_22_ = is_12_[i++];
				if (i_22_ != 0)
					is[i_14_++] = is_13_[i_22_ & 0xff];
				else
					i_14_++;
				i_22_ = is_12_[i++];
				if (i_22_ != 0)
					is[i_14_++] = is_13_[i_22_ & 0xff];
				else
					i_14_++;
				i_22_ = is_12_[i++];
				if (i_22_ != 0)
					is[i_14_++] = is_13_[i_22_ & 0xff];
				else
					i_14_++;
			}
			for (int i_23_ = i_15_; i_23_ < 0; i_23_++) {
				int i_24_ = is_12_[i++];
				if (i_24_ != 0)
					is[i_14_++] = is_13_[i_24_ & 0xff];
				else
					i_14_++;
			}
			i_14_ += i_17_;
			i += i_18_;
		}
	}

	final void method1088() {
		if (this.anInt3242 != this.anInt3244 || this.anInt3246 != this.anInt3243) {
			byte[] is = new byte[this.anInt3244 * this.anInt3243];
			int i = 0;
			for (int i_0_ = 0; i_0_ < this.anInt3246; i_0_++)
				for (int i_1_ = 0; i_1_ < this.anInt3242; i_1_++)
					is[i_1_ + this.anInt3245 + (i_0_ + this.anInt3240) * this.anInt3244] = this.aByteArray3239[i++];
			this.aByteArray3239 = is;
			this.anInt3242 = this.anInt3244;
			this.anInt3246 = this.anInt3243;
			this.anInt3245 = 0;
			this.anInt3240 = 0;
		}
	}

	final void method1089(int i, int i_2_) {
		i += this.anInt3245;
		i_2_ += this.anInt3240;
		int i_3_ = i + i_2_ * Class38_Sub20_Sub9.anInt2889;
		int i_4_ = 0;
		int i_5_ = this.anInt3246;
		int i_6_ = this.anInt3242;
		int i_7_ = Class38_Sub20_Sub9.anInt2889 - i_6_;
		int i_8_ = 0;
		if (i_2_ < Class38_Sub20_Sub9.anInt2885) {
			int i_9_ = Class38_Sub20_Sub9.anInt2885 - i_2_;
			i_5_ -= i_9_;
			i_2_ = Class38_Sub20_Sub9.anInt2885;
			i_4_ += i_9_ * i_6_;
			i_3_ += i_9_ * Class38_Sub20_Sub9.anInt2889;
		}
		if (i_2_ + i_5_ > Class38_Sub20_Sub9.anInt2888)
			i_5_ -= i_2_ + i_5_ - Class38_Sub20_Sub9.anInt2888;
		if (i < Class38_Sub20_Sub9.anInt2887) {
			int i_10_ = Class38_Sub20_Sub9.anInt2887 - i;
			i_6_ -= i_10_;
			i = Class38_Sub20_Sub9.anInt2887;
			i_4_ += i_10_;
			i_3_ += i_10_;
			i_8_ += i_10_;
			i_7_ += i_10_;
		}
		if (i + i_6_ > Class38_Sub20_Sub9.anInt2890) {
			int i_11_ = i + i_6_ - Class38_Sub20_Sub9.anInt2890;
			i_6_ -= i_11_;
			i_8_ += i_11_;
			i_7_ += i_11_;
		}
		if (i_6_ > 0 && i_5_ > 0)
			Class38_Sub20_Sub9_Sub2.method1090(Class38_Sub20_Sub9.anIntArray2886, this.aByteArray3239, this.anIntArray3241, i_4_, i_3_, i_6_, i_5_, i_7_, i_8_);
	}

	final void method1091(int i, int i_25_, int i_26_) {
		for (int i_27_ = 0; i_27_ < this.anIntArray3241.length; i_27_++) {
			int i_28_ = this.anIntArray3241[i_27_] >> 16 & 0xff;
			i_28_ += i;
			if (i_28_ < 0)
				i_28_ = 0;
			else if (i_28_ > 255)
				i_28_ = 255;
			int i_29_ = this.anIntArray3241[i_27_] >> 8 & 0xff;
			i_29_ += i_25_;
			if (i_29_ < 0)
				i_29_ = 0;
			else if (i_29_ > 255)
				i_29_ = 255;
			int i_30_ = this.anIntArray3241[i_27_] & 0xff;
			i_30_ += i_26_;
			if (i_30_ < 0)
				i_30_ = 0;
			else if (i_30_ > 255)
				i_30_ = 255;
			this.anIntArray3241[i_27_] = (i_28_ << 16) + (i_29_ << 8) + i_30_;
		}
	}
}
