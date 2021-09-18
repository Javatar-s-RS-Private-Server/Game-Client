/* Class38_Sub20_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class38_Sub20_Sub9 extends NodeSub {
	static int anInt2884;
	static int anInt2885 = 0;
	static int[] anIntArray2886;
	static int anInt2887;
	static int anInt2888 = 0;
	static int anInt2889;
	static int anInt2890;

	static {
		Class38_Sub20_Sub9.anInt2887 = 0;
		Class38_Sub20_Sub9.anInt2890 = 0;
	}

	public Class38_Sub20_Sub9() {
		/* empty */
	}

	static final void method957(int[] is, int i, int i_0_) {
		Class38_Sub20_Sub9.anIntArray2886 = is;
		Class38_Sub20_Sub9.anInt2889 = i;
		Class38_Sub20_Sub9.anInt2884 = i_0_;
		Class38_Sub20_Sub9.method971(0, 0, i, i_0_);
	}

	static final void method958(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (i < Class38_Sub20_Sub9.anInt2887) {
			i_2_ -= Class38_Sub20_Sub9.anInt2887 - i;
			i = Class38_Sub20_Sub9.anInt2887;
		}
		if (i_1_ < Class38_Sub20_Sub9.anInt2885) {
			i_3_ -= Class38_Sub20_Sub9.anInt2885 - i_1_;
			i_1_ = Class38_Sub20_Sub9.anInt2885;
		}
		if (i + i_2_ > Class38_Sub20_Sub9.anInt2890)
			i_2_ = Class38_Sub20_Sub9.anInt2890 - i;
		if (i_1_ + i_3_ > Class38_Sub20_Sub9.anInt2888)
			i_3_ = Class38_Sub20_Sub9.anInt2888 - i_1_;
		int i_5_ = Class38_Sub20_Sub9.anInt2889 - i_2_;
		int i_6_ = i + i_1_ * Class38_Sub20_Sub9.anInt2889;
		for (int i_7_ = -i_3_; i_7_ < 0; i_7_++) {
			for (int i_8_ = -i_2_; i_8_ < 0; i_8_++)
				Class38_Sub20_Sub9.anIntArray2886[i_6_++] = i_4_;
			i_6_ += i_5_;
		}
	}

	static final void method959() {
		int i = 0;
		int i_9_ = Class38_Sub20_Sub9.anInt2889 * Class38_Sub20_Sub9.anInt2884 - 7;
		while (i < i_9_) {
			Class38_Sub20_Sub9.anIntArray2886[i++] = 0;
			Class38_Sub20_Sub9.anIntArray2886[i++] = 0;
			Class38_Sub20_Sub9.anIntArray2886[i++] = 0;
			Class38_Sub20_Sub9.anIntArray2886[i++] = 0;
			Class38_Sub20_Sub9.anIntArray2886[i++] = 0;
			Class38_Sub20_Sub9.anIntArray2886[i++] = 0;
			Class38_Sub20_Sub9.anIntArray2886[i++] = 0;
			Class38_Sub20_Sub9.anIntArray2886[i++] = 0;
		}
		i_9_ += 7;
		while (i < i_9_)
			Class38_Sub20_Sub9.anIntArray2886[i++] = 0;
	}

	static final void method960(int i, int i_10_, int i_11_, int i_12_, int i_13_) {
		i_11_ -= i;
		i_12_ -= i_10_;
		if (i_12_ == 0) {
			if (i_11_ >= 0)
				Class38_Sub20_Sub9.method968(i, i_10_, i_11_ + 1, i_13_);
			else
				Class38_Sub20_Sub9.method968(i + i_11_, i_10_, -i_11_ + 1, i_13_);
		} else if (i_11_ == 0) {
			if (i_12_ >= 0)
				Class38_Sub20_Sub9.method965(i, i_10_, i_12_ + 1, i_13_);
			else
				Class38_Sub20_Sub9.method965(i, i_10_ + i_12_, -i_12_ + 1, i_13_);
		} else {
			if (i_11_ + i_12_ < 0) {
				i += i_11_;
				i_11_ = -i_11_;
				i_10_ += i_12_;
				i_12_ = -i_12_;
			}
			if (i_11_ > i_12_) {
				i_10_ <<= 16;
				i_10_ += 32768;
				i_12_ <<= 16;
				int i_14_ = (int) Math.floor((double) i_12_ / (double) i_11_ + 0.5);
				i_11_ += i;
				if (i < Class38_Sub20_Sub9.anInt2887) {
					i_10_ += i_14_ * (Class38_Sub20_Sub9.anInt2887 - i);
					i = Class38_Sub20_Sub9.anInt2887;
				}
				if (i_11_ >= Class38_Sub20_Sub9.anInt2890)
					i_11_ = Class38_Sub20_Sub9.anInt2890 - 1;
				for (/**/; i <= i_11_; i++) {
					int i_15_ = i_10_ >> 16;
					if (i_15_ >= Class38_Sub20_Sub9.anInt2885 && i_15_ < Class38_Sub20_Sub9.anInt2888)
						Class38_Sub20_Sub9.anIntArray2886[i + i_15_ * Class38_Sub20_Sub9.anInt2889] = i_13_;
					i_10_ += i_14_;
				}
			} else {
				i <<= 16;
				i += 32768;
				i_11_ <<= 16;
				int i_16_ = (int) Math.floor((double) i_11_ / (double) i_12_ + 0.5);
				i_12_ += i_10_;
				if (i_10_ < Class38_Sub20_Sub9.anInt2885) {
					i += i_16_ * (Class38_Sub20_Sub9.anInt2885 - i_10_);
					i_10_ = Class38_Sub20_Sub9.anInt2885;
				}
				if (i_12_ >= Class38_Sub20_Sub9.anInt2888)
					i_12_ = Class38_Sub20_Sub9.anInt2888 - 1;
				for (/**/; i_10_ <= i_12_; i_10_++) {
					int i_17_ = i >> 16;
					if (i_17_ >= Class38_Sub20_Sub9.anInt2887 && i_17_ < Class38_Sub20_Sub9.anInt2890)
						Class38_Sub20_Sub9.anIntArray2886[i_17_ + i_10_ * Class38_Sub20_Sub9.anInt2889] = i_13_;
					i += i_16_;
				}
			}
		}
	}

	static final void method961() {
		Class38_Sub20_Sub9.anInt2887 = 0;
		Class38_Sub20_Sub9.anInt2885 = 0;
		Class38_Sub20_Sub9.anInt2890 = Class38_Sub20_Sub9.anInt2889;
		Class38_Sub20_Sub9.anInt2888 = Class38_Sub20_Sub9.anInt2884;
	}

	static final void method962(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		if (i < Class38_Sub20_Sub9.anInt2887) {
			i_19_ -= Class38_Sub20_Sub9.anInt2887 - i;
			i = Class38_Sub20_Sub9.anInt2887;
		}
		if (i_18_ < Class38_Sub20_Sub9.anInt2885) {
			i_20_ -= Class38_Sub20_Sub9.anInt2885 - i_18_;
			i_18_ = Class38_Sub20_Sub9.anInt2885;
		}
		if (i + i_19_ > Class38_Sub20_Sub9.anInt2890)
			i_19_ = Class38_Sub20_Sub9.anInt2890 - i;
		if (i_18_ + i_20_ > Class38_Sub20_Sub9.anInt2888)
			i_20_ = Class38_Sub20_Sub9.anInt2888 - i_18_;
		i_21_ = ((i_21_ & 0xff00ff) * i_22_ >> 8 & 0xff00ff) + ((i_21_ & 0xff00) * i_22_ >> 8 & 0xff00);
		int i_23_ = 256 - i_22_;
		int i_24_ = Class38_Sub20_Sub9.anInt2889 - i_19_;
		int i_25_ = i + i_18_ * Class38_Sub20_Sub9.anInt2889;
		for (int i_26_ = 0; i_26_ < i_20_; i_26_++) {
			for (int i_27_ = -i_19_; i_27_ < 0; i_27_++) {
				int i_28_ = Class38_Sub20_Sub9.anIntArray2886[i_25_];
				i_28_ = ((i_28_ & 0xff00ff) * i_23_ >> 8 & 0xff00ff) + ((i_28_ & 0xff00) * i_23_ >> 8 & 0xff00);
				Class38_Sub20_Sub9.anIntArray2886[i_25_++] = i_21_ + i_28_;
			}
			i_25_ += i_24_;
		}
	}

	static final void method963(int i, int i_29_, int i_30_, int i_31_, int i_32_) {
		Class38_Sub20_Sub9.method968(i, i_29_, i_30_, i_32_);
		Class38_Sub20_Sub9.method968(i, i_29_ + i_31_ - 1, i_30_, i_32_);
		Class38_Sub20_Sub9.method965(i, i_29_, i_31_, i_32_);
		Class38_Sub20_Sub9.method965(i + i_30_ - 1, i_29_, i_31_, i_32_);
	}

	static final void method964(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		int i_38_ = 0;
		int i_39_ = 65536 / i_35_;
		if (i < Class38_Sub20_Sub9.anInt2887) {
			i_34_ -= Class38_Sub20_Sub9.anInt2887 - i;
			i = Class38_Sub20_Sub9.anInt2887;
		}
		if (i_33_ < Class38_Sub20_Sub9.anInt2885) {
			i_38_ += (Class38_Sub20_Sub9.anInt2885 - i_33_) * i_39_;
			i_35_ -= Class38_Sub20_Sub9.anInt2885 - i_33_;
			i_33_ = Class38_Sub20_Sub9.anInt2885;
		}
		if (i + i_34_ > Class38_Sub20_Sub9.anInt2890)
			i_34_ = Class38_Sub20_Sub9.anInt2890 - i;
		if (i_33_ + i_35_ > Class38_Sub20_Sub9.anInt2888)
			i_35_ = Class38_Sub20_Sub9.anInt2888 - i_33_;
		int i_40_ = Class38_Sub20_Sub9.anInt2889 - i_34_;
		int i_41_ = i + i_33_ * Class38_Sub20_Sub9.anInt2889;
		for (int i_42_ = -i_35_; i_42_ < 0; i_42_++) {
			int i_43_ = 65536 - i_38_ >> 8;
			int i_44_ = i_38_ >> 8;
			int i_45_ = ((i_36_ & 0xff00ff) * i_43_ + (i_37_ & 0xff00ff) * i_44_ & ~0xff00ff) + ((i_36_ & 0xff00) * i_43_ + (i_37_ & 0xff00) * i_44_ & 0xff0000) >>> 8;
			for (int i_46_ = -i_34_; i_46_ < 0; i_46_++)
				Class38_Sub20_Sub9.anIntArray2886[i_41_++] = i_45_;
			i_41_ += i_40_;
			i_38_ += i_39_;
		}
	}

	static final void method965(int i, int i_47_, int i_48_, int i_49_) {
		if (i >= Class38_Sub20_Sub9.anInt2887 && i < Class38_Sub20_Sub9.anInt2890) {
			if (i_47_ < Class38_Sub20_Sub9.anInt2885) {
				i_48_ -= Class38_Sub20_Sub9.anInt2885 - i_47_;
				i_47_ = Class38_Sub20_Sub9.anInt2885;
			}
			if (i_47_ + i_48_ > Class38_Sub20_Sub9.anInt2888)
				i_48_ = Class38_Sub20_Sub9.anInt2888 - i_47_;
			int i_50_ = i + i_47_ * Class38_Sub20_Sub9.anInt2889;
			for (int i_51_ = 0; i_51_ < i_48_; i_51_++)
				Class38_Sub20_Sub9.anIntArray2886[i_50_ + i_51_ * Class38_Sub20_Sub9.anInt2889] = i_49_;
		}
	}

	static final void method966(int[] is) {
		Class38_Sub20_Sub9.anInt2887 = is[0];
		Class38_Sub20_Sub9.anInt2885 = is[1];
		Class38_Sub20_Sub9.anInt2890 = is[2];
		Class38_Sub20_Sub9.anInt2888 = is[3];
	}

	private static final void method967(int i, int i_52_, int i_53_, int i_54_, int i_55_) {
		if (i_52_ >= Class38_Sub20_Sub9.anInt2885 && i_52_ < Class38_Sub20_Sub9.anInt2888) {
			if (i < Class38_Sub20_Sub9.anInt2887) {
				i_53_ -= Class38_Sub20_Sub9.anInt2887 - i;
				i = Class38_Sub20_Sub9.anInt2887;
			}
			if (i + i_53_ > Class38_Sub20_Sub9.anInt2890)
				i_53_ = Class38_Sub20_Sub9.anInt2890 - i;
			int i_56_ = 256 - i_55_;
			int i_57_ = (i_54_ >> 16 & 0xff) * i_55_;
			int i_58_ = (i_54_ >> 8 & 0xff) * i_55_;
			int i_59_ = (i_54_ & 0xff) * i_55_;
			int i_60_ = i + i_52_ * Class38_Sub20_Sub9.anInt2889;
			for (int i_61_ = 0; i_61_ < i_53_; i_61_++) {
				int i_62_ = (Class38_Sub20_Sub9.anIntArray2886[i_60_] >> 16 & 0xff) * i_56_;
				int i_63_ = (Class38_Sub20_Sub9.anIntArray2886[i_60_] >> 8 & 0xff) * i_56_;
				int i_64_ = (Class38_Sub20_Sub9.anIntArray2886[i_60_] & 0xff) * i_56_;
				int i_65_ = (i_57_ + i_62_ >> 8 << 16) + (i_58_ + i_63_ >> 8 << 8) + (i_59_ + i_64_ >> 8);
				Class38_Sub20_Sub9.anIntArray2886[i_60_++] = i_65_;
			}
		}
	}

	static final void method968(int i, int i_66_, int i_67_, int i_68_) {
		if (i_66_ >= Class38_Sub20_Sub9.anInt2885 && i_66_ < Class38_Sub20_Sub9.anInt2888) {
			if (i < Class38_Sub20_Sub9.anInt2887) {
				i_67_ -= Class38_Sub20_Sub9.anInt2887 - i;
				i = Class38_Sub20_Sub9.anInt2887;
			}
			if (i + i_67_ > Class38_Sub20_Sub9.anInt2890)
				i_67_ = Class38_Sub20_Sub9.anInt2890 - i;
			int i_69_ = i + i_66_ * Class38_Sub20_Sub9.anInt2889;
			for (int i_70_ = 0; i_70_ < i_67_; i_70_++)
				Class38_Sub20_Sub9.anIntArray2886[i_69_ + i_70_] = i_68_;
		}
	}

	public static void method969() {
		Class38_Sub20_Sub9.anIntArray2886 = null;
	}

	static final void method970(int i, int i_71_, int i_72_, int i_73_) {
		if (Class38_Sub20_Sub9.anInt2887 < i)
			Class38_Sub20_Sub9.anInt2887 = i;
		if (Class38_Sub20_Sub9.anInt2885 < i_71_)
			Class38_Sub20_Sub9.anInt2885 = i_71_;
		if (Class38_Sub20_Sub9.anInt2890 > i_72_)
			Class38_Sub20_Sub9.anInt2890 = i_72_;
		if (Class38_Sub20_Sub9.anInt2888 > i_73_)
			Class38_Sub20_Sub9.anInt2888 = i_73_;
	}

	static final void method971(int i, int i_74_, int i_75_, int i_76_) {
		if (i < 0)
			i = 0;
		if (i_74_ < 0)
			i_74_ = 0;
		if (i_75_ > Class38_Sub20_Sub9.anInt2889)
			i_75_ = Class38_Sub20_Sub9.anInt2889;
		if (i_76_ > Class38_Sub20_Sub9.anInt2884)
			i_76_ = Class38_Sub20_Sub9.anInt2884;
		Class38_Sub20_Sub9.anInt2887 = i;
		Class38_Sub20_Sub9.anInt2885 = i_74_;
		Class38_Sub20_Sub9.anInt2890 = i_75_;
		Class38_Sub20_Sub9.anInt2888 = i_76_;
	}

	private static final void method972(int i, int i_77_, int i_78_, int i_79_, int i_80_) {
		if (i >= Class38_Sub20_Sub9.anInt2887 && i < Class38_Sub20_Sub9.anInt2890) {
			if (i_77_ < Class38_Sub20_Sub9.anInt2885) {
				i_78_ -= Class38_Sub20_Sub9.anInt2885 - i_77_;
				i_77_ = Class38_Sub20_Sub9.anInt2885;
			}
			if (i_77_ + i_78_ > Class38_Sub20_Sub9.anInt2888)
				i_78_ = Class38_Sub20_Sub9.anInt2888 - i_77_;
			int i_81_ = 256 - i_80_;
			int i_82_ = (i_79_ >> 16 & 0xff) * i_80_;
			int i_83_ = (i_79_ >> 8 & 0xff) * i_80_;
			int i_84_ = (i_79_ & 0xff) * i_80_;
			int i_85_ = i + i_77_ * Class38_Sub20_Sub9.anInt2889;
			for (int i_86_ = 0; i_86_ < i_78_; i_86_++) {
				int i_87_ = (Class38_Sub20_Sub9.anIntArray2886[i_85_] >> 16 & 0xff) * i_81_;
				int i_88_ = (Class38_Sub20_Sub9.anIntArray2886[i_85_] >> 8 & 0xff) * i_81_;
				int i_89_ = (Class38_Sub20_Sub9.anIntArray2886[i_85_] & 0xff) * i_81_;
				int i_90_ = (i_82_ + i_87_ >> 8 << 16) + (i_83_ + i_88_ >> 8 << 8) + (i_84_ + i_89_ >> 8);
				Class38_Sub20_Sub9.anIntArray2886[i_85_] = i_90_;
				i_85_ += Class38_Sub20_Sub9.anInt2889;
			}
		}
	}

	static final void method973(int i, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_) {
		Class38_Sub20_Sub9.method967(i, i_91_, i_92_, i_94_, i_95_);
		Class38_Sub20_Sub9.method967(i, i_91_ + i_93_ - 1, i_92_, i_94_, i_95_);
		if (i_93_ >= 3) {
			Class38_Sub20_Sub9.method972(i, i_91_ + 1, i_93_ - 2, i_94_, i_95_);
			Class38_Sub20_Sub9.method972(i + i_92_ - 1, i_91_ + 1, i_93_ - 2, i_94_, i_95_);
		}
	}

	static final void method974(int i, int i_96_, int i_97_, int[] is, int[] is_98_) {
		int i_99_ = i + i_96_ * Class38_Sub20_Sub9.anInt2889;
		for (i_96_ = 0; i_96_ < is.length; i_96_++) {
			int i_100_ = i_99_ + is[i_96_];
			for (i = -is_98_[i_96_]; i < 0; i++)
				Class38_Sub20_Sub9.anIntArray2886[i_100_++] = i_97_;
			i_99_ += Class38_Sub20_Sub9.anInt2889;
		}
	}

	static final void method975(int[] is) {
		is[0] = Class38_Sub20_Sub9.anInt2887;
		is[1] = Class38_Sub20_Sub9.anInt2885;
		is[2] = Class38_Sub20_Sub9.anInt2890;
		is[3] = Class38_Sub20_Sub9.anInt2888;
	}
}
