/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class1 {
	static int[] anIntArray5 = new int[6];
	static int[] anIntArray7 = new int[6];
	static int[] anIntArray14 = new int[6];
	static int[] anIntArray16 = new int[6];
	static int[] anIntArray17 = new int[6];
	private static int[][] anIntArrayArray4 = { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
	private static int[][] anIntArrayArray20 = { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
	int anInt1;
	int anInt2;
	int[] anIntArray3;
	int[] anIntArray6;
	int[] anIntArray8;
	int[] anIntArray9;
	boolean aBool10 = true;
	int[] anIntArray11;
	int[] anIntArray12;
	int anInt13;
	int[] anIntArray15;
	int anInt18;
	int[] anIntArray19;
	int[] anIntArray21;
	int[] anIntArray22;

	Class1(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		if (i_4_ != i_5_ || i_4_ != i_6_ || i_4_ != i_7_)
			this.aBool10 = false;
		this.anInt13 = i;
		this.anInt1 = i_0_;
		this.anInt2 = i_16_;
		this.anInt18 = i_17_;
		int i_18_ = 128;
		int i_19_ = i_18_ / 2;
		int i_20_ = i_18_ / 4;
		int i_21_ = i_18_ * 3 / 4;
		int[] is = Class1.anIntArrayArray20[i];
		int i_22_ = is.length;
		this.anIntArray12 = new int[i_22_];
		this.anIntArray6 = new int[i_22_];
		this.anIntArray21 = new int[i_22_];
		int[] is_23_ = new int[i_22_];
		int[] is_24_ = new int[i_22_];
		int i_25_ = i_2_ * i_18_;
		int i_26_ = i_3_ * i_18_;
		for (int i_27_ = 0; i_27_ < i_22_; i_27_++) {
			int i_28_ = is[i_27_];
			if ((i_28_ & 0x1) == 0 && i_28_ <= 8)
				i_28_ = (i_28_ - i_0_ - i_0_ - 1 & 0x7) + 1;
			if (i_28_ > 8 && i_28_ <= 12)
				i_28_ = (i_28_ - 9 - i_0_ & 0x3) + 9;
			if (i_28_ > 12 && i_28_ <= 16)
				i_28_ = (i_28_ - 13 - i_0_ & 0x3) + 13;
			int i_29_;
			int i_30_;
			int i_31_;
			int i_32_;
			int i_33_;
			if (i_28_ == 1) {
				i_29_ = i_25_;
				i_30_ = i_26_;
				i_31_ = i_4_;
				i_32_ = i_8_;
				i_33_ = i_12_;
			} else if (i_28_ == 2) {
				i_29_ = i_25_ + i_19_;
				i_30_ = i_26_;
				i_31_ = i_4_ + i_5_ >> 1;
				i_32_ = i_8_ + i_9_ >> 1;
				i_33_ = i_12_ + i_13_ >> 1;
			} else if (i_28_ == 3) {
				i_29_ = i_25_ + i_18_;
				i_30_ = i_26_;
				i_31_ = i_5_;
				i_32_ = i_9_;
				i_33_ = i_13_;
			} else if (i_28_ == 4) {
				i_29_ = i_25_ + i_18_;
				i_30_ = i_26_ + i_19_;
				i_31_ = i_5_ + i_6_ >> 1;
				i_32_ = i_9_ + i_10_ >> 1;
				i_33_ = i_13_ + i_14_ >> 1;
			} else if (i_28_ == 5) {
				i_29_ = i_25_ + i_18_;
				i_30_ = i_26_ + i_18_;
				i_31_ = i_6_;
				i_32_ = i_10_;
				i_33_ = i_14_;
			} else if (i_28_ == 6) {
				i_29_ = i_25_ + i_19_;
				i_30_ = i_26_ + i_18_;
				i_31_ = i_6_ + i_7_ >> 1;
				i_32_ = i_10_ + i_11_ >> 1;
				i_33_ = i_14_ + i_15_ >> 1;
			} else if (i_28_ == 7) {
				i_29_ = i_25_;
				i_30_ = i_26_ + i_18_;
				i_31_ = i_7_;
				i_32_ = i_11_;
				i_33_ = i_15_;
			} else if (i_28_ == 8) {
				i_29_ = i_25_;
				i_30_ = i_26_ + i_19_;
				i_31_ = i_7_ + i_4_ >> 1;
				i_32_ = i_11_ + i_8_ >> 1;
				i_33_ = i_15_ + i_12_ >> 1;
			} else if (i_28_ == 9) {
				i_29_ = i_25_ + i_19_;
				i_30_ = i_26_ + i_20_;
				i_31_ = i_4_ + i_5_ >> 1;
				i_32_ = i_8_ + i_9_ >> 1;
				i_33_ = i_12_ + i_13_ >> 1;
			} else if (i_28_ == 10) {
				i_29_ = i_25_ + i_21_;
				i_30_ = i_26_ + i_19_;
				i_31_ = i_5_ + i_6_ >> 1;
				i_32_ = i_9_ + i_10_ >> 1;
				i_33_ = i_13_ + i_14_ >> 1;
			} else if (i_28_ == 11) {
				i_29_ = i_25_ + i_19_;
				i_30_ = i_26_ + i_21_;
				i_31_ = i_6_ + i_7_ >> 1;
				i_32_ = i_10_ + i_11_ >> 1;
				i_33_ = i_14_ + i_15_ >> 1;
			} else if (i_28_ == 12) {
				i_29_ = i_25_ + i_20_;
				i_30_ = i_26_ + i_19_;
				i_31_ = i_7_ + i_4_ >> 1;
				i_32_ = i_11_ + i_8_ >> 1;
				i_33_ = i_15_ + i_12_ >> 1;
			} else if (i_28_ == 13) {
				i_29_ = i_25_ + i_20_;
				i_30_ = i_26_ + i_20_;
				i_31_ = i_4_;
				i_32_ = i_8_;
				i_33_ = i_12_;
			} else if (i_28_ == 14) {
				i_29_ = i_25_ + i_21_;
				i_30_ = i_26_ + i_20_;
				i_31_ = i_5_;
				i_32_ = i_9_;
				i_33_ = i_13_;
			} else if (i_28_ == 15) {
				i_29_ = i_25_ + i_21_;
				i_30_ = i_26_ + i_21_;
				i_31_ = i_6_;
				i_32_ = i_10_;
				i_33_ = i_14_;
			} else {
				i_29_ = i_25_ + i_20_;
				i_30_ = i_26_ + i_21_;
				i_31_ = i_7_;
				i_32_ = i_11_;
				i_33_ = i_15_;
			}
			this.anIntArray12[i_27_] = i_29_;
			this.anIntArray6[i_27_] = i_31_;
			this.anIntArray21[i_27_] = i_30_;
			is_23_[i_27_] = i_32_;
			is_24_[i_27_] = i_33_;
		}
		int[] is_34_ = Class1.anIntArrayArray4[i];
		int i_35_ = is_34_.length / 4;
		this.anIntArray19 = new int[i_35_];
		this.anIntArray22 = new int[i_35_];
		this.anIntArray3 = new int[i_35_];
		this.anIntArray11 = new int[i_35_];
		this.anIntArray8 = new int[i_35_];
		this.anIntArray15 = new int[i_35_];
		if (i_1_ != -1)
			this.anIntArray9 = new int[i_35_];
		int i_36_ = 0;
		for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
			int i_38_ = is_34_[i_36_];
			int i_39_ = is_34_[i_36_ + 1];
			int i_40_ = is_34_[i_36_ + 2];
			int i_41_ = is_34_[i_36_ + 3];
			i_36_ += 4;
			if (i_39_ < 4)
				i_39_ = i_39_ - i_0_ & 0x3;
			if (i_40_ < 4)
				i_40_ = i_40_ - i_0_ & 0x3;
			if (i_41_ < 4)
				i_41_ = i_41_ - i_0_ & 0x3;
			this.anIntArray19[i_37_] = i_39_;
			this.anIntArray22[i_37_] = i_40_;
			this.anIntArray3[i_37_] = i_41_;
			if (i_38_ == 0) {
				this.anIntArray11[i_37_] = is_23_[i_39_];
				this.anIntArray8[i_37_] = is_23_[i_40_];
				this.anIntArray15[i_37_] = is_23_[i_41_];
				if (this.anIntArray9 != null)
					this.anIntArray9[i_37_] = -1;
			} else {
				this.anIntArray11[i_37_] = is_24_[i_39_];
				this.anIntArray8[i_37_] = is_24_[i_40_];
				this.anIntArray15[i_37_] = is_24_[i_41_];
				if (this.anIntArray9 != null)
					this.anIntArray9[i_37_] = i_1_;
			}
		}
		int i_42_ = i_4_;
		int i_43_ = i_5_;
		if (i_5_ < i_42_)
			i_42_ = i_5_;
		if (i_5_ > i_43_)
			i_43_ = i_5_;
		if (i_6_ < i_42_)
			i_42_ = i_6_;
		if (i_6_ > i_43_)
			i_43_ = i_6_;
		if (i_7_ < i_42_)
			i_42_ = i_7_;
		if (i_7_ > i_43_)
			i_43_ = i_7_;
		i_42_ /= 14;
		i_43_ /= 14;
	}

	public static void method11() {
		Class1.anIntArray5 = null;
		Class1.anIntArray17 = null;
		Class1.anIntArray7 = null;
		Class1.anIntArray16 = null;
		Class1.anIntArray14 = null;
		Class1.anIntArrayArray20 = null;
		Class1.anIntArrayArray4 = null;
	}
}
