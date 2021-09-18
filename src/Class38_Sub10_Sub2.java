/* Class38_Sub10_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub10_Sub2 extends Class38_Sub10 {
	private final int anInt2675;
	private final boolean aBool2681;
	private final int anInt2682;
	private int anInt2671;
	private int anInt2672;
	private int anInt2673;
	private int anInt2674;
	private int anInt2676;
	private int anInt2677;
	private int anInt2678;
	private int anInt2679;
	private int anInt2680;
	private int anInt2683;
	private int anInt2684;
	private int anInt2685;

	private Class38_Sub10_Sub2(Class38_Sub16_Sub1 class38_sub16_sub1, int i, int i_190_) {
		this.aClass38_Sub16_2076 = class38_sub16_sub1;
		anInt2682 = class38_sub16_sub1.anInt3026;
		anInt2675 = class38_sub16_sub1.anInt3027;
		aBool2681 = class38_sub16_sub1.aBool3025;
		anInt2676 = i;
		anInt2679 = i_190_;
		anInt2673 = 8192;
		anInt2685 = 0;
		method906();
	}

	private Class38_Sub10_Sub2(Class38_Sub16_Sub1 class38_sub16_sub1, int i, int i_191_, int i_192_) {
		this.aClass38_Sub16_2076 = class38_sub16_sub1;
		anInt2682 = class38_sub16_sub1.anInt3026;
		anInt2675 = class38_sub16_sub1.anInt3027;
		aBool2681 = class38_sub16_sub1.aBool3025;
		anInt2676 = i;
		anInt2679 = i_191_;
		anInt2673 = i_192_;
		anInt2685 = 0;
		method906();
	}

	private static final int method869(int i, int i_0_, byte[] is, int[] is_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, Class38_Sub10_Sub2 class38_sub10_sub2, int i_9_, int i_10_) {
		class38_sub10_sub2.anInt2678 -= class38_sub10_sub2.anInt2680 * i_3_;
		class38_sub10_sub2.anInt2683 -= class38_sub10_sub2.anInt2671 * i_3_;
		if (i_9_ == 0 || (i_6_ = i_3_ + (i_8_ - i_2_ + i_9_ - 257) / i_9_) > i_7_)
			i_6_ = i_7_;
		while (i_3_ < i_6_) {
			i_0_ = i_2_ >> 8;
			i = is[i_0_];
			is_1_[i_3_++] += ((i << 8) + (is[i_0_ + 1] - i) * (i_2_ & 0xff)) * i_4_ >> 6;
			i_4_ += i_5_;
			i_2_ += i_9_;
		}
		if (i_9_ == 0 || (i_6_ = i_3_ + (i_8_ - i_2_ + i_9_ - 1) / i_9_) > i_7_)
			i_6_ = i_7_;
		i_0_ = i_10_;
		while (i_3_ < i_6_) {
			i = is[i_2_ >> 8];
			is_1_[i_3_++] += ((i << 8) + (i_0_ - i) * (i_2_ & 0xff)) * i_4_ >> 6;
			i_4_ += i_5_;
			i_2_ += i_9_;
		}
		class38_sub10_sub2.anInt2678 += class38_sub10_sub2.anInt2680 * i_3_;
		class38_sub10_sub2.anInt2683 += class38_sub10_sub2.anInt2671 * i_3_;
		class38_sub10_sub2.anInt2677 = i_4_;
		class38_sub10_sub2.anInt2685 = i_2_;
		return i_3_;
	}

	private static final int method872(int i, byte[] is, int[] is_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, Class38_Sub10_Sub2 class38_sub10_sub2) {
		i_13_ >>= 8;
		i_19_ >>= 8;
		i_15_ <<= 2;
		i_16_ <<= 2;
		if ((i_17_ = i_14_ + i_19_ - i_13_) > i_18_)
			i_17_ = i_18_;
		i_14_ <<= 1;
		i_17_ <<= 1;
		i_17_ -= 6;
		while (i_14_ < i_17_) {
			i = is[i_13_++];
			is_12_[i_14_++] += i * i_15_;
			is_12_[i_14_++] += i * i_16_;
			i = is[i_13_++];
			is_12_[i_14_++] += i * i_15_;
			is_12_[i_14_++] += i * i_16_;
			i = is[i_13_++];
			is_12_[i_14_++] += i * i_15_;
			is_12_[i_14_++] += i * i_16_;
			i = is[i_13_++];
			is_12_[i_14_++] += i * i_15_;
			is_12_[i_14_++] += i * i_16_;
		}
		i_17_ += 6;
		while (i_14_ < i_17_) {
			i = is[i_13_++];
			is_12_[i_14_++] += i * i_15_;
			is_12_[i_14_++] += i * i_16_;
		}
		class38_sub10_sub2.anInt2685 = i_13_ << 8;
		return i_14_ >> 1;
	}

	static final Class38_Sub10_Sub2 method873(Class38_Sub16_Sub1 class38_sub16_sub1, int i, int i_20_, int i_21_) {
		if (class38_sub16_sub1.aByteArray3029 == null || class38_sub16_sub1.aByteArray3029.length == 0)
			return null;
		return new Class38_Sub10_Sub2(class38_sub16_sub1, i, i_20_, i_21_);
	}

	private static final int method875(int i, byte[] is, int[] is_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, Class38_Sub10_Sub2 class38_sub10_sub2) {
		i_24_ >>= 8;
		i_30_ >>= 8;
		i_26_ <<= 2;
		i_27_ <<= 2;
		if ((i_28_ = i_25_ + i_24_ - (i_30_ - 1)) > i_29_)
			i_28_ = i_29_;
		i_25_ <<= 1;
		i_28_ <<= 1;
		i_28_ -= 6;
		while (i_25_ < i_28_) {
			i = is[i_24_--];
			is_23_[i_25_++] += i * i_26_;
			is_23_[i_25_++] += i * i_27_;
			i = is[i_24_--];
			is_23_[i_25_++] += i * i_26_;
			is_23_[i_25_++] += i * i_27_;
			i = is[i_24_--];
			is_23_[i_25_++] += i * i_26_;
			is_23_[i_25_++] += i * i_27_;
			i = is[i_24_--];
			is_23_[i_25_++] += i * i_26_;
			is_23_[i_25_++] += i * i_27_;
		}
		i_28_ += 6;
		while (i_25_ < i_28_) {
			i = is[i_24_--];
			is_23_[i_25_++] += i * i_26_;
			is_23_[i_25_++] += i * i_27_;
		}
		class38_sub10_sub2.anInt2685 = i_24_ << 8;
		return i_25_ >> 1;
	}

	private static final int method877(int i, int i_31_, byte[] is, int[] is_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, Class38_Sub10_Sub2 class38_sub10_sub2, int i_40_, int i_41_) {
		class38_sub10_sub2.anInt2678 -= class38_sub10_sub2.anInt2680 * i_34_;
		class38_sub10_sub2.anInt2683 -= class38_sub10_sub2.anInt2671 * i_34_;
		if (i_40_ == 0 || (i_37_ = i_34_ + (i_39_ + 256 - i_33_ + i_40_) / i_40_) > i_38_)
			i_37_ = i_38_;
		while (i_34_ < i_37_) {
			i_31_ = i_33_ >> 8;
			i = is[i_31_ - 1];
			is_32_[i_34_++] += ((i << 8) + (is[i_31_] - i) * (i_33_ & 0xff)) * i_35_ >> 6;
			i_35_ += i_36_;
			i_33_ += i_40_;
		}
		if (i_40_ == 0 || (i_37_ = i_34_ + (i_39_ - i_33_ + i_40_) / i_40_) > i_38_)
			i_37_ = i_38_;
		i = i_41_;
		i_31_ = i_40_;
		while (i_34_ < i_37_) {
			is_32_[i_34_++] += ((i << 8) + (is[i_33_ >> 8] - i) * (i_33_ & 0xff)) * i_35_ >> 6;
			i_35_ += i_36_;
			i_33_ += i_31_;
		}
		class38_sub10_sub2.anInt2678 += class38_sub10_sub2.anInt2680 * i_34_;
		class38_sub10_sub2.anInt2683 += class38_sub10_sub2.anInt2671 * i_34_;
		class38_sub10_sub2.anInt2677 = i_35_;
		class38_sub10_sub2.anInt2685 = i_33_;
		return i_34_;
	}

	static final Class38_Sub10_Sub2 method878(Class38_Sub16_Sub1 class38_sub16_sub1, int i, int i_42_) {
		if (class38_sub16_sub1.aByteArray3029 == null || class38_sub16_sub1.aByteArray3029.length == 0)
			return null;
		return new Class38_Sub10_Sub2(class38_sub16_sub1, (int) (class38_sub16_sub1.anInt3028 * 256L * i / (Class38_Sub20_Sub7.anInt2852 * 100)), i_42_ << 6);
	}

	private static final int method879(int i, int i_51_, byte[] is, int[] is_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, Class38_Sub10_Sub2 class38_sub10_sub2, int i_60_, int i_61_) {
		if (i_60_ == 0 || (i_57_ = i_54_ + (i_59_ + 256 - i_53_ + i_60_) / i_60_) > i_58_)
			i_57_ = i_58_;
		i_54_ <<= 1;
		i_57_ <<= 1;
		while (i_54_ < i_57_) {
			i_51_ = i_53_ >> 8;
			i = is[i_51_ - 1];
			i = (i << 8) + (is[i_51_] - i) * (i_53_ & 0xff);
			is_52_[i_54_++] += i * i_55_ >> 6;
			is_52_[i_54_++] += i * i_56_ >> 6;
			i_53_ += i_60_;
		}
		if (i_60_ == 0 || (i_57_ = (i_54_ >> 1) + (i_59_ - i_53_ + i_60_) / i_60_) > i_58_)
			i_57_ = i_58_;
		i_57_ <<= 1;
		i_51_ = i_61_;
		while (i_54_ < i_57_) {
			i = (i_51_ << 8) + (is[i_53_ >> 8] - i_51_) * (i_53_ & 0xff);
			is_52_[i_54_++] += i * i_55_ >> 6;
			is_52_[i_54_++] += i * i_56_ >> 6;
			i_53_ += i_60_;
		}
		class38_sub10_sub2.anInt2685 = i_53_;
		return i_54_ >> 1;
	}

	private static final int method881(int i, int i_66_, byte[] is, int[] is_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, Class38_Sub10_Sub2 class38_sub10_sub2, int i_77_, int i_78_) {
		class38_sub10_sub2.anInt2677 -= class38_sub10_sub2.anInt2672 * i_69_;
		if (i_77_ == 0 || (i_74_ = i_69_ + (i_76_ + 256 - i_68_ + i_77_) / i_77_) > i_75_)
			i_74_ = i_75_;
		i_69_ <<= 1;
		i_74_ <<= 1;
		while (i_69_ < i_74_) {
			i_66_ = i_68_ >> 8;
			i = is[i_66_ - 1];
			i = (i << 8) + (is[i_66_] - i) * (i_68_ & 0xff);
			is_67_[i_69_++] += i * i_70_ >> 6;
			i_70_ += i_72_;
			is_67_[i_69_++] += i * i_71_ >> 6;
			i_71_ += i_73_;
			i_68_ += i_77_;
		}
		if (i_77_ == 0 || (i_74_ = (i_69_ >> 1) + (i_76_ - i_68_ + i_77_) / i_77_) > i_75_)
			i_74_ = i_75_;
		i_74_ <<= 1;
		i_66_ = i_78_;
		while (i_69_ < i_74_) {
			i = (i_66_ << 8) + (is[i_68_ >> 8] - i_66_) * (i_68_ & 0xff);
			is_67_[i_69_++] += i * i_70_ >> 6;
			i_70_ += i_72_;
			is_67_[i_69_++] += i * i_71_ >> 6;
			i_71_ += i_73_;
			i_68_ += i_77_;
		}
		i_69_ >>= 1;
		class38_sub10_sub2.anInt2677 += class38_sub10_sub2.anInt2672 * i_69_;
		class38_sub10_sub2.anInt2678 = i_70_;
		class38_sub10_sub2.anInt2683 = i_71_;
		class38_sub10_sub2.anInt2685 = i_68_;
		return i_69_;
	}

	private static final int method886(int i, int i_80_, byte[] is, int[] is_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, Class38_Sub10_Sub2 class38_sub10_sub2, int i_89_, int i_90_) {
		if (i_89_ == 0 || (i_86_ = i_83_ + (i_88_ - i_82_ + i_89_ - 257) / i_89_) > i_87_)
			i_86_ = i_87_;
		i_83_ <<= 1;
		i_86_ <<= 1;
		while (i_83_ < i_86_) {
			i_80_ = i_82_ >> 8;
			i = is[i_80_];
			i = (i << 8) + (is[i_80_ + 1] - i) * (i_82_ & 0xff);
			is_81_[i_83_++] += i * i_84_ >> 6;
			is_81_[i_83_++] += i * i_85_ >> 6;
			i_82_ += i_89_;
		}
		if (i_89_ == 0 || (i_86_ = (i_83_ >> 1) + (i_88_ - i_82_ + i_89_ - 1) / i_89_) > i_87_)
			i_86_ = i_87_;
		i_86_ <<= 1;
		i_80_ = i_90_;
		while (i_83_ < i_86_) {
			i = is[i_82_ >> 8];
			i = (i << 8) + (i_80_ - i) * (i_82_ & 0xff);
			is_81_[i_83_++] += i * i_84_ >> 6;
			is_81_[i_83_++] += i * i_85_ >> 6;
			i_82_ += i_89_;
		}
		class38_sub10_sub2.anInt2685 = i_82_;
		return i_83_ >> 1;
	}

	private static final int method887(int i, byte[] is, int[] is_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, Class38_Sub10_Sub2 class38_sub10_sub2) {
		i_92_ >>= 8;
		i_100_ >>= 8;
		i_94_ <<= 2;
		i_95_ <<= 2;
		i_96_ <<= 2;
		i_97_ <<= 2;
		if ((i_98_ = i_93_ + i_100_ - i_92_) > i_99_)
			i_98_ = i_99_;
		class38_sub10_sub2.anInt2677 += class38_sub10_sub2.anInt2672 * (i_98_ - i_93_);
		i_93_ <<= 1;
		i_98_ <<= 1;
		i_98_ -= 6;
		while (i_93_ < i_98_) {
			i = is[i_92_++];
			is_91_[i_93_++] += i * i_94_;
			i_94_ += i_96_;
			is_91_[i_93_++] += i * i_95_;
			i_95_ += i_97_;
			i = is[i_92_++];
			is_91_[i_93_++] += i * i_94_;
			i_94_ += i_96_;
			is_91_[i_93_++] += i * i_95_;
			i_95_ += i_97_;
			i = is[i_92_++];
			is_91_[i_93_++] += i * i_94_;
			i_94_ += i_96_;
			is_91_[i_93_++] += i * i_95_;
			i_95_ += i_97_;
			i = is[i_92_++];
			is_91_[i_93_++] += i * i_94_;
			i_94_ += i_96_;
			is_91_[i_93_++] += i * i_95_;
			i_95_ += i_97_;
		}
		i_98_ += 6;
		while (i_93_ < i_98_) {
			i = is[i_92_++];
			is_91_[i_93_++] += i * i_94_;
			i_94_ += i_96_;
			is_91_[i_93_++] += i * i_95_;
			i_95_ += i_97_;
		}
		class38_sub10_sub2.anInt2678 = i_94_ >> 2;
		class38_sub10_sub2.anInt2683 = i_95_ >> 2;
		class38_sub10_sub2.anInt2685 = i_92_ << 8;
		return i_93_ >> 1;
	}

	private static final int method888(byte[] is, int[] is_101_, int i, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, Class38_Sub10_Sub2 class38_sub10_sub2) {
		i >>= 8;
		i_106_ >>= 8;
		i_103_ <<= 2;
		if ((i_104_ = i_102_ + i - (i_106_ - 1)) > i_105_)
			i_104_ = i_105_;
		i_104_ -= 3;
		while (i_102_ < i_104_) {
			is_101_[i_102_++] += is[i--] * i_103_;
			is_101_[i_102_++] += is[i--] * i_103_;
			is_101_[i_102_++] += is[i--] * i_103_;
			is_101_[i_102_++] += is[i--] * i_103_;
		}
		i_104_ += 3;
		while (i_102_ < i_104_)
			is_101_[i_102_++] += is[i--] * i_103_;
		class38_sub10_sub2.anInt2685 = i << 8;
		return i_102_;
	}

	private static final int method890(byte[] is, int[] is_107_, int i, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, Class38_Sub10_Sub2 class38_sub10_sub2) {
		i >>= 8;
		i_113_ >>= 8;
		i_109_ <<= 2;
		i_110_ <<= 2;
		if ((i_111_ = i_108_ + i_113_ - i) > i_112_)
			i_111_ = i_112_;
		class38_sub10_sub2.anInt2678 += class38_sub10_sub2.anInt2680 * (i_111_ - i_108_);
		class38_sub10_sub2.anInt2683 += class38_sub10_sub2.anInt2671 * (i_111_ - i_108_);
		i_111_ -= 3;
		while (i_108_ < i_111_) {
			is_107_[i_108_++] += is[i++] * i_109_;
			i_109_ += i_110_;
			is_107_[i_108_++] += is[i++] * i_109_;
			i_109_ += i_110_;
			is_107_[i_108_++] += is[i++] * i_109_;
			i_109_ += i_110_;
			is_107_[i_108_++] += is[i++] * i_109_;
			i_109_ += i_110_;
		}
		i_111_ += 3;
		while (i_108_ < i_111_) {
			is_107_[i_108_++] += is[i++] * i_109_;
			i_109_ += i_110_;
		}
		class38_sub10_sub2.anInt2677 = i_109_ >> 2;
		class38_sub10_sub2.anInt2685 = i << 8;
		return i_108_;
	}

	private static final int method892(int i, int i_114_) {
		if (i_114_ < 0)
			return i;
		return (int) (i * Math.sqrt((16384 - i_114_) * 1.220703125E-4) + 0.5);
	}

	private static final int method897(int i, int i_128_, byte[] is, int[] is_129_, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, Class38_Sub10_Sub2 class38_sub10_sub2, int i_139_, int i_140_) {
		class38_sub10_sub2.anInt2677 -= class38_sub10_sub2.anInt2672 * i_131_;
		if (i_139_ == 0 || (i_136_ = i_131_ + (i_138_ - i_130_ + i_139_ - 257) / i_139_) > i_137_)
			i_136_ = i_137_;
		i_131_ <<= 1;
		i_136_ <<= 1;
		while (i_131_ < i_136_) {
			i_128_ = i_130_ >> 8;
			i = is[i_128_];
			i = (i << 8) + (is[i_128_ + 1] - i) * (i_130_ & 0xff);
			is_129_[i_131_++] += i * i_132_ >> 6;
			i_132_ += i_134_;
			is_129_[i_131_++] += i * i_133_ >> 6;
			i_133_ += i_135_;
			i_130_ += i_139_;
		}
		if (i_139_ == 0 || (i_136_ = (i_131_ >> 1) + (i_138_ - i_130_ + i_139_ - 1) / i_139_) > i_137_)
			i_136_ = i_137_;
		i_136_ <<= 1;
		i_128_ = i_140_;
		while (i_131_ < i_136_) {
			i = is[i_130_ >> 8];
			i = (i << 8) + (i_128_ - i) * (i_130_ & 0xff);
			is_129_[i_131_++] += i * i_132_ >> 6;
			i_132_ += i_134_;
			is_129_[i_131_++] += i * i_133_ >> 6;
			i_133_ += i_135_;
			i_130_ += i_139_;
		}
		i_131_ >>= 1;
		class38_sub10_sub2.anInt2677 += class38_sub10_sub2.anInt2672 * i_131_;
		class38_sub10_sub2.anInt2678 = i_132_;
		class38_sub10_sub2.anInt2683 = i_133_;
		class38_sub10_sub2.anInt2685 = i_130_;
		return i_131_;
	}

	private static final int method898(byte[] is, int[] is_141_, int i, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, Class38_Sub10_Sub2 class38_sub10_sub2) {
		i >>= 8;
		i_146_ >>= 8;
		i_143_ <<= 2;
		if ((i_144_ = i_142_ + i_146_ - i) > i_145_)
			i_144_ = i_145_;
		i_144_ -= 3;
		while (i_142_ < i_144_) {
			is_141_[i_142_++] += is[i++] * i_143_;
			is_141_[i_142_++] += is[i++] * i_143_;
			is_141_[i_142_++] += is[i++] * i_143_;
			is_141_[i_142_++] += is[i++] * i_143_;
		}
		i_144_ += 3;
		while (i_142_ < i_144_)
			is_141_[i_142_++] += is[i++] * i_143_;
		class38_sub10_sub2.anInt2685 = i << 8;
		return i_142_;
	}

	private static final int method899(int i, byte[] is, int[] is_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, Class38_Sub10_Sub2 class38_sub10_sub2) {
		i_148_ >>= 8;
		i_156_ >>= 8;
		i_150_ <<= 2;
		i_151_ <<= 2;
		i_152_ <<= 2;
		i_153_ <<= 2;
		if ((i_154_ = i_149_ + i_148_ - (i_156_ - 1)) > i_155_)
			i_154_ = i_155_;
		class38_sub10_sub2.anInt2677 += class38_sub10_sub2.anInt2672 * (i_154_ - i_149_);
		i_149_ <<= 1;
		i_154_ <<= 1;
		i_154_ -= 6;
		while (i_149_ < i_154_) {
			i = is[i_148_--];
			is_147_[i_149_++] += i * i_150_;
			i_150_ += i_152_;
			is_147_[i_149_++] += i * i_151_;
			i_151_ += i_153_;
			i = is[i_148_--];
			is_147_[i_149_++] += i * i_150_;
			i_150_ += i_152_;
			is_147_[i_149_++] += i * i_151_;
			i_151_ += i_153_;
			i = is[i_148_--];
			is_147_[i_149_++] += i * i_150_;
			i_150_ += i_152_;
			is_147_[i_149_++] += i * i_151_;
			i_151_ += i_153_;
			i = is[i_148_--];
			is_147_[i_149_++] += i * i_150_;
			i_150_ += i_152_;
			is_147_[i_149_++] += i * i_151_;
			i_151_ += i_153_;
		}
		i_154_ += 6;
		while (i_149_ < i_154_) {
			i = is[i_148_--];
			is_147_[i_149_++] += i * i_150_;
			i_150_ += i_152_;
			is_147_[i_149_++] += i * i_151_;
			i_151_ += i_153_;
		}
		class38_sub10_sub2.anInt2678 = i_150_ >> 2;
		class38_sub10_sub2.anInt2683 = i_151_ >> 2;
		class38_sub10_sub2.anInt2685 = i_148_ << 8;
		return i_149_ >> 1;
	}

	private static final int method900(byte[] is, int[] is_157_, int i, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, Class38_Sub10_Sub2 class38_sub10_sub2) {
		i >>= 8;
		i_163_ >>= 8;
		i_159_ <<= 2;
		i_160_ <<= 2;
		if ((i_161_ = i_158_ + i - (i_163_ - 1)) > i_162_)
			i_161_ = i_162_;
		class38_sub10_sub2.anInt2678 += class38_sub10_sub2.anInt2680 * (i_161_ - i_158_);
		class38_sub10_sub2.anInt2683 += class38_sub10_sub2.anInt2671 * (i_161_ - i_158_);
		i_161_ -= 3;
		while (i_158_ < i_161_) {
			is_157_[i_158_++] += is[i--] * i_159_;
			i_159_ += i_160_;
			is_157_[i_158_++] += is[i--] * i_159_;
			i_159_ += i_160_;
			is_157_[i_158_++] += is[i--] * i_159_;
			i_159_ += i_160_;
			is_157_[i_158_++] += is[i--] * i_159_;
			i_159_ += i_160_;
		}
		i_161_ += 3;
		while (i_158_ < i_161_) {
			is_157_[i_158_++] += is[i--] * i_159_;
			i_159_ += i_160_;
		}
		class38_sub10_sub2.anInt2677 = i_159_ >> 2;
		class38_sub10_sub2.anInt2685 = i << 8;
		return i_158_;
	}

	private static final int method902(int i, int i_169_, byte[] is, int[] is_170_, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, int i_176_, Class38_Sub10_Sub2 class38_sub10_sub2, int i_177_, int i_178_) {
		if (i_177_ == 0 || (i_174_ = i_172_ + (i_176_ - i_171_ + i_177_ - 257) / i_177_) > i_175_)
			i_174_ = i_175_;
		while (i_172_ < i_174_) {
			i_169_ = i_171_ >> 8;
			i = is[i_169_];
			is_170_[i_172_++] += ((i << 8) + (is[i_169_ + 1] - i) * (i_171_ & 0xff)) * i_173_ >> 6;
			i_171_ += i_177_;
		}
		if (i_177_ == 0 || (i_174_ = i_172_ + (i_176_ - i_171_ + i_177_ - 1) / i_177_) > i_175_)
			i_174_ = i_175_;
		i_169_ = i_178_;
		while (i_172_ < i_174_) {
			i = is[i_171_ >> 8];
			is_170_[i_172_++] += ((i << 8) + (i_169_ - i) * (i_171_ & 0xff)) * i_173_ >> 6;
			i_171_ += i_177_;
		}
		class38_sub10_sub2.anInt2685 = i_171_;
		return i_172_;
	}

	private static final int method903(int i, int i_179_) {
		if (i_179_ < 0)
			return -i;
		return (int) (i * Math.sqrt(i_179_ * 1.220703125E-4) + 0.5);
	}

	private static final int method905(int i, int i_180_, byte[] is, int[] is_181_, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_, int i_187_, Class38_Sub10_Sub2 class38_sub10_sub2, int i_188_, int i_189_) {
		if (i_188_ == 0 || (i_185_ = i_183_ + (i_187_ + 256 - i_182_ + i_188_) / i_188_) > i_186_)
			i_185_ = i_186_;
		while (i_183_ < i_185_) {
			i_180_ = i_182_ >> 8;
			i = is[i_180_ - 1];
			is_181_[i_183_++] += ((i << 8) + (is[i_180_] - i) * (i_182_ & 0xff)) * i_184_ >> 6;
			i_182_ += i_188_;
		}
		if (i_188_ == 0 || (i_185_ = i_183_ + (i_187_ - i_182_ + i_188_) / i_188_) > i_186_)
			i_185_ = i_186_;
		i = i_189_;
		i_180_ = i_188_;
		while (i_183_ < i_185_) {
			is_181_[i_183_++] += ((i << 8) + (is[i_182_ >> 8] - i) * (i_182_ & 0xff)) * i_184_ >> 6;
			i_182_ += i_180_;
		}
		class38_sub10_sub2.anInt2685 = i_182_;
		return i_183_;
	}

	final synchronized void method870(int i, int i_11_) {
		method901(i, i_11_, method889());
	}

	final synchronized void method871(int i) {
		if (anInt2676 < 0)
			anInt2676 = -i;
		else
			anInt2676 = i;
	}

	@Override
	final Class38_Sub10 method668() {
		return null;
	}

	final synchronized void method874(int i) {
		if (i == 0) {
			method885(0);
			method330(0);
		} else if (anInt2678 == 0 && anInt2683 == 0) {
			anInt2684 = 0;
			anInt2679 = 0;
			anInt2677 = 0;
			method330(0);
		} else {
			int i_22_ = -anInt2677;
			if (anInt2677 > i_22_)
				i_22_ = anInt2677;
			if (-anInt2678 > i_22_)
				i_22_ = -anInt2678;
			if (anInt2678 > i_22_)
				i_22_ = anInt2678;
			if (-anInt2683 > i_22_)
				i_22_ = -anInt2683;
			if (anInt2683 > i_22_)
				i_22_ = anInt2683;
			if (i > i_22_)
				i = i_22_;
			anInt2684 = i;
			anInt2679 = -2147483648;
			anInt2672 = -anInt2677 / i;
			anInt2680 = -anInt2678 / i;
			anInt2671 = -anInt2683 / i;
		}
	}

	@Override
	final Class38_Sub10 method670() {
		return null;
	}

	final synchronized void method876(int i) {
		anInt2674 = i;
	}

	@Override
	final synchronized void method667(int[] is, int i, int i_43_) {
		if (anInt2679 == 0 && anInt2684 == 0)
			method669(i_43_);
		else {
			Class38_Sub16_Sub1 class38_sub16_sub1 = (Class38_Sub16_Sub1) this.aClass38_Sub16_2076;
			int i_44_ = anInt2682 << 8;
			int i_45_ = anInt2675 << 8;
			int i_46_ = class38_sub16_sub1.aByteArray3029.length << 8;
			int i_47_ = i_45_ - i_44_;
			if (i_47_ <= 0)
				anInt2674 = 0;
			int i_48_ = i;
			i_43_ += i;
			if (anInt2685 < 0)
				if (anInt2676 > 0)
					anInt2685 = 0;
				else {
					method907();
					method330(0);
					return;
				}
			if (anInt2685 >= i_46_)
				if (anInt2676 < 0)
					anInt2685 = i_46_ - 1;
				else {
					method907();
					method330(0);
					return;
				}
			if (anInt2674 < 0) {
				if (aBool2681) {
					if (anInt2676 < 0) {
						i_48_ = method880(is, i_48_, i_44_, i_43_, class38_sub16_sub1.aByteArray3029[anInt2682]);
						if (anInt2685 >= i_44_)
							return;
						anInt2685 = i_44_ + i_44_ - 1 - anInt2685;
						anInt2676 = -anInt2676;
					}
					for (;;) {
						i_48_ = method896(is, i_48_, i_45_, i_43_, class38_sub16_sub1.aByteArray3029[anInt2675 - 1]);
						if (anInt2685 < i_45_)
							break;
						anInt2685 = i_45_ + i_45_ - 1 - anInt2685;
						anInt2676 = -anInt2676;
						i_48_ = method880(is, i_48_, i_44_, i_43_, class38_sub16_sub1.aByteArray3029[anInt2682]);
						if (anInt2685 >= i_44_)
							break;
						anInt2685 = i_44_ + i_44_ - 1 - anInt2685;
						anInt2676 = -anInt2676;
					}
				} else if (anInt2676 < 0)
					for (;;) {
						i_48_ = method880(is, i_48_, i_44_, i_43_, class38_sub16_sub1.aByteArray3029[anInt2675 - 1]);
						if (anInt2685 >= i_44_)
							break;
						anInt2685 = i_45_ - 1 - (i_45_ - 1 - anInt2685) % i_47_;
					}
				else
					for (;;) {
						i_48_ = method896(is, i_48_, i_45_, i_43_, class38_sub16_sub1.aByteArray3029[anInt2682]);
						if (anInt2685 < i_45_)
							break;
						anInt2685 = i_44_ + (anInt2685 - i_44_) % i_47_;
					}
			} else {
				do
					if (anInt2674 > 0)
						if (aBool2681) {
							if (anInt2676 < 0) {
								i_48_ = method880(is, i_48_, i_44_, i_43_, class38_sub16_sub1.aByteArray3029[anInt2682]);
								if (anInt2685 >= i_44_)
									return;
								anInt2685 = i_44_ + i_44_ - 1 - anInt2685;
								anInt2676 = -anInt2676;
								if (--anInt2674 == 0)
									break;
							}
							do {
								i_48_ = method896(is, i_48_, i_45_, i_43_, class38_sub16_sub1.aByteArray3029[anInt2675 - 1]);
								if (anInt2685 < i_45_)
									return;
								anInt2685 = i_45_ + i_45_ - 1 - anInt2685;
								anInt2676 = -anInt2676;
								if (--anInt2674 == 0)
									break;
								i_48_ = method880(is, i_48_, i_44_, i_43_, class38_sub16_sub1.aByteArray3029[anInt2682]);
								if (anInt2685 >= i_44_)
									return;
								anInt2685 = i_44_ + i_44_ - 1 - anInt2685;
								anInt2676 = -anInt2676;
							} while (--anInt2674 != 0);
						} else if (anInt2676 < 0)
							for (;;) {
								i_48_ = method880(is, i_48_, i_44_, i_43_, class38_sub16_sub1.aByteArray3029[anInt2675 - 1]);
								if (anInt2685 >= i_44_)
									return;
								int i_49_ = (i_45_ - 1 - anInt2685) / i_47_;
								if (i_49_ >= anInt2674) {
									anInt2685 += i_47_ * anInt2674;
									anInt2674 = 0;
									break;
								}
								anInt2685 += i_47_ * i_49_;
								anInt2674 -= i_49_;
							}
						else
							for (;;) {
								i_48_ = method896(is, i_48_, i_45_, i_43_, class38_sub16_sub1.aByteArray3029[anInt2682]);
								if (anInt2685 < i_45_)
									return;
								int i_50_ = (anInt2685 - i_44_) / i_47_;
								if (i_50_ >= anInt2674) {
									anInt2685 -= i_47_ * anInt2674;
									anInt2674 = 0;
									break;
								}
								anInt2685 -= i_47_ * i_50_;
								anInt2674 -= i_50_;
							}
				while (false);
				if (anInt2676 < 0) {
					method880(is, i_48_, 0, i_43_, 0);
					if (anInt2685 < 0) {
						anInt2685 = -1;
						method907();
						method330(0);
					}
				} else {
					method896(is, i_48_, i_46_, i_43_, 0);
					if (anInt2685 >= i_46_) {
						anInt2685 = i_46_;
						method907();
						method330(0);
					}
				}
			}
		}
	}

	private final int method880(int[] is, int i, int i_62_, int i_63_, int i_64_) {
		while (anInt2684 > 0) {
			int i_65_ = i + anInt2684;
			if (i_65_ > i_63_)
				i_65_ = i_63_;
			anInt2684 += i;
			if (anInt2676 == -256 && (anInt2685 & 0xff) == 0) {
				if (Class37.aBool880)
					i = Class38_Sub10_Sub2.method899(0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2678, anInt2683, anInt2680, anInt2671, 0, i_65_, i_62_, this);
				else
					i = Class38_Sub10_Sub2.method900(((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2677, anInt2672, 0, i_65_, i_62_, this);
			} else if (Class37.aBool880)
				i = Class38_Sub10_Sub2.method881(0, 0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2678, anInt2683, anInt2680, anInt2671, 0, i_65_, i_62_, this, anInt2676, i_64_);
			else
				i = Class38_Sub10_Sub2.method877(0, 0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2677, anInt2672, 0, i_65_, i_62_, this, anInt2676, i_64_);
			anInt2684 -= i;
			if (anInt2684 != 0)
				return i;
			if (method895())
				return i_63_;
		}
		if (anInt2676 == -256 && (anInt2685 & 0xff) == 0) {
			if (Class37.aBool880)
				return Class38_Sub10_Sub2.method875(0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2678, anInt2683, 0, i_63_, i_62_, this);
			return Class38_Sub10_Sub2.method888(((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2677, 0, i_63_, i_62_, this);
		}
		if (Class37.aBool880)
			return Class38_Sub10_Sub2.method879(0, 0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2678, anInt2683, 0, i_63_, i_62_, this, anInt2676, i_64_);
		return Class38_Sub10_Sub2.method905(0, 0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2677, 0, i_63_, i_62_, this, anInt2676, i_64_);
	}

	final synchronized void method882(int i) {
		method883(i << 6, method889());
	}

	private final synchronized void method883(int i, int i_79_) {
		anInt2679 = i;
		anInt2673 = i_79_;
		anInt2684 = 0;
		method906();
	}

	@Override
	final int method671() {
		int i = anInt2677 * 3 >> 6;
		i = (i ^ i >> 31) + (i >>> 31);
		if (anInt2674 == 0)
			i -= i * anInt2685 / (((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029.length << 8);
		else if (anInt2674 >= 0)
			i -= i * anInt2682 / ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029.length;
		if (i > 255)
			return 255;
		return i;
	}

	final synchronized int method884() {
		if (anInt2676 < 0)
			return -anInt2676;
		return anInt2676;
	}

	private final synchronized void method885(int i) {
		method883(i, method889());
	}

	final synchronized int method889() {
		if (anInt2673 < 0)
			return -1;
		return anInt2673;
	}

	final boolean method891() {
		return anInt2685 < 0 || anInt2685 >= ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029.length << 8;
	}

	final synchronized int method893() {
		if (anInt2679 == -2147483648)
			return 0;
		return anInt2679;
	}

	final synchronized void method894(int i) {
		int i_115_ = ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029.length << 8;
		if (i < -1)
			i = -1;
		if (i > i_115_)
			i = i_115_;
		anInt2685 = i;
	}

	@Override
	final synchronized void method669(int i) {
		if (anInt2684 > 0)
			if (i >= anInt2684) {
				if (anInt2679 == -2147483648) {
					anInt2679 = 0;
					anInt2677 = anInt2678 = anInt2683 = 0;
					method330(0);
					i = anInt2684;
				}
				anInt2684 = 0;
				method906();
			} else {
				anInt2677 += anInt2672 * i;
				anInt2678 += anInt2680 * i;
				anInt2683 += anInt2671 * i;
				anInt2684 -= i;
			}
		Class38_Sub16_Sub1 class38_sub16_sub1 = (Class38_Sub16_Sub1) this.aClass38_Sub16_2076;
		int i_116_ = anInt2682 << 8;
		int i_117_ = anInt2675 << 8;
		int i_118_ = class38_sub16_sub1.aByteArray3029.length << 8;
		int i_119_ = i_117_ - i_116_;
		if (i_119_ <= 0)
			anInt2674 = 0;
		if (anInt2685 < 0)
			if (anInt2676 > 0)
				anInt2685 = 0;
			else {
				method907();
				method330(0);
				return;
			}
		if (anInt2685 >= i_118_)
			if (anInt2676 < 0)
				anInt2685 = i_118_ - 1;
			else {
				method907();
				method330(0);
				return;
			}
		anInt2685 += anInt2676 * i;
		if (anInt2674 < 0) {
			if (aBool2681) {
				if (anInt2676 < 0) {
					if (anInt2685 >= i_116_)
						return;
					anInt2685 = i_116_ + i_116_ - 1 - anInt2685;
					anInt2676 = -anInt2676;
				}
				while (anInt2685 >= i_117_) {
					anInt2685 = i_117_ + i_117_ - 1 - anInt2685;
					anInt2676 = -anInt2676;
					if (anInt2685 >= i_116_)
						break;
					anInt2685 = i_116_ + i_116_ - 1 - anInt2685;
					anInt2676 = -anInt2676;
				}
			} else if (anInt2676 < 0) {
				if (anInt2685 < i_116_)
					anInt2685 = i_117_ - 1 - (i_117_ - 1 - anInt2685) % i_119_;
			} else if (anInt2685 >= i_117_)
				anInt2685 = i_116_ + (anInt2685 - i_116_) % i_119_;
		} else {
			do
				if (anInt2674 > 0)
					if (aBool2681) {
						if (anInt2676 < 0) {
							if (anInt2685 >= i_116_)
								return;
							anInt2685 = i_116_ + i_116_ - 1 - anInt2685;
							anInt2676 = -anInt2676;
							if (--anInt2674 == 0)
								break;
						}
						do {
							if (anInt2685 < i_117_)
								return;
							anInt2685 = i_117_ + i_117_ - 1 - anInt2685;
							anInt2676 = -anInt2676;
							if (--anInt2674 == 0)
								break;
							if (anInt2685 >= i_116_)
								return;
							anInt2685 = i_116_ + i_116_ - 1 - anInt2685;
							anInt2676 = -anInt2676;
						} while (--anInt2674 != 0);
					} else if (anInt2676 < 0) {
						if (anInt2685 >= i_116_)
							return;
						int i_120_ = (i_117_ - 1 - anInt2685) / i_119_;
						if (i_120_ >= anInt2674) {
							anInt2685 += i_119_ * anInt2674;
							anInt2674 = 0;
						} else {
							anInt2685 += i_119_ * i_120_;
							anInt2674 -= i_120_;
							return;
						}
					} else {
						if (anInt2685 < i_117_)
							return;
						int i_121_ = (anInt2685 - i_116_) / i_119_;
						if (i_121_ >= anInt2674) {
							anInt2685 -= i_119_ * anInt2674;
							anInt2674 = 0;
						} else {
							anInt2685 -= i_119_ * i_121_;
							anInt2674 -= i_121_;
							return;
						}
					}
			while (false);
			if (anInt2676 < 0) {
				if (anInt2685 < 0) {
					anInt2685 = -1;
					method907();
					method330(0);
				}
			} else if (anInt2685 >= i_118_) {
				anInt2685 = i_118_;
				method907();
				method330(0);
			}
		}
	}

	private final boolean method895() {
		int i = anInt2679;
		int i_122_;
		int i_123_;
		if (i == -2147483648)
			i = i_122_ = i_123_ = 0;
		else {
			i_122_ = Class38_Sub10_Sub2.method892(i, anInt2673);
			i_123_ = Class38_Sub10_Sub2.method903(i, anInt2673);
		}
		if (anInt2677 != i || anInt2678 != i_122_ || anInt2683 != i_123_) {
			if (anInt2677 < i) {
				anInt2672 = 1;
				anInt2684 = i - anInt2677;
			} else if (anInt2677 > i) {
				anInt2672 = -1;
				anInt2684 = anInt2677 - i;
			} else
				anInt2672 = 0;
			if (anInt2678 < i_122_) {
				anInt2680 = 1;
				if (anInt2684 == 0 || anInt2684 > i_122_ - anInt2678)
					anInt2684 = i_122_ - anInt2678;
			} else if (anInt2678 > i_122_) {
				anInt2680 = -1;
				if (anInt2684 == 0 || anInt2684 > anInt2678 - i_122_)
					anInt2684 = anInt2678 - i_122_;
			} else
				anInt2680 = 0;
			if (anInt2683 < i_123_) {
				anInt2671 = 1;
				if (anInt2684 == 0 || anInt2684 > i_123_ - anInt2683)
					anInt2684 = i_123_ - anInt2683;
			} else if (anInt2683 > i_123_) {
				anInt2671 = -1;
				if (anInt2684 == 0 || anInt2684 > anInt2683 - i_123_)
					anInt2684 = anInt2683 - i_123_;
			} else
				anInt2671 = 0;
			return false;
		}
		if (anInt2679 == -2147483648) {
			anInt2679 = 0;
			anInt2677 = anInt2678 = anInt2683 = 0;
			method330(0);
			return true;
		}
		method906();
		return false;
	}

	private final int method896(int[] is, int i, int i_124_, int i_125_, int i_126_) {
		while (anInt2684 > 0) {
			int i_127_ = i + anInt2684;
			if (i_127_ > i_125_)
				i_127_ = i_125_;
			anInt2684 += i;
			if (anInt2676 == 256 && (anInt2685 & 0xff) == 0) {
				if (Class37.aBool880)
					i = Class38_Sub10_Sub2.method887(0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2678, anInt2683, anInt2680, anInt2671, 0, i_127_, i_124_, this);
				else
					i = Class38_Sub10_Sub2.method890(((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2677, anInt2672, 0, i_127_, i_124_, this);
			} else if (Class37.aBool880)
				i = Class38_Sub10_Sub2.method897(0, 0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2678, anInt2683, anInt2680, anInt2671, 0, i_127_, i_124_, this, anInt2676, i_126_);
			else
				i = Class38_Sub10_Sub2.method869(0, 0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2677, anInt2672, 0, i_127_, i_124_, this, anInt2676, i_126_);
			anInt2684 -= i;
			if (anInt2684 != 0)
				return i;
			if (method895())
				return i_125_;
		}
		if (anInt2676 == 256 && (anInt2685 & 0xff) == 0) {
			if (Class37.aBool880)
				return Class38_Sub10_Sub2.method872(0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2678, anInt2683, 0, i_125_, i_124_, this);
			return Class38_Sub10_Sub2.method898(((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2677, 0, i_125_, i_124_, this);
		}
		if (Class37.aBool880)
			return Class38_Sub10_Sub2.method886(0, 0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2678, anInt2683, 0, i_125_, i_124_, this, anInt2676, i_126_);
		return Class38_Sub10_Sub2.method902(0, 0, ((Class38_Sub16_Sub1) this.aClass38_Sub16_2076).aByteArray3029, is, anInt2685, i, anInt2677, 0, i_125_, i_124_, this, anInt2676, i_126_);
	}

	@Override
	final int method665() {
		if (anInt2679 == 0 && anInt2684 == 0)
			return 0;
		return 1;
	}

	final synchronized void method901(int i, int i_164_, int i_165_) {
		if (i == 0)
			method883(i_164_, i_165_);
		else {
			int i_166_ = Class38_Sub10_Sub2.method892(i_164_, i_165_);
			int i_167_ = Class38_Sub10_Sub2.method903(i_164_, i_165_);
			if (anInt2678 == i_166_ && anInt2683 == i_167_)
				anInt2684 = 0;
			else {
				int i_168_ = i_164_ - anInt2677;
				if (anInt2677 - i_164_ > i_168_)
					i_168_ = anInt2677 - i_164_;
				if (i_166_ - anInt2678 > i_168_)
					i_168_ = i_166_ - anInt2678;
				if (anInt2678 - i_166_ > i_168_)
					i_168_ = anInt2678 - i_166_;
				if (i_167_ - anInt2683 > i_168_)
					i_168_ = i_167_ - anInt2683;
				if (anInt2683 - i_167_ > i_168_)
					i_168_ = anInt2683 - i_167_;
				if (i > i_168_)
					i = i_168_;
				anInt2684 = i;
				anInt2679 = i_164_;
				anInt2673 = i_165_;
				anInt2672 = (i_164_ - anInt2677) / i;
				anInt2680 = (i_166_ - anInt2678) / i;
				anInt2671 = (i_167_ - anInt2683) / i;
			}
		}
	}

	final synchronized void method904(boolean bool) {
		anInt2676 = (anInt2676 ^ anInt2676 >> 31) + (anInt2676 >>> 31);
		if (bool)
			anInt2676 = -anInt2676;
	}

	private final void method906() {
		anInt2677 = anInt2679;
		anInt2678 = Class38_Sub10_Sub2.method892(anInt2679, anInt2673);
		anInt2683 = Class38_Sub10_Sub2.method903(anInt2679, anInt2673);
	}

	private final void method907() {
		if (anInt2684 != 0) {
			if (anInt2679 == -2147483648)
				anInt2679 = 0;
			anInt2684 = 0;
			method906();
		}
	}

	final boolean method908() {
		return anInt2684 != 0;
	}
}
