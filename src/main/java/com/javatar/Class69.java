package com.javatar;/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class69 {
	private static Class35 aClass35_1396 = new Class35();

	private static byte method485(Class35 class35) {
		return (byte) Class69.method490(1, class35);
	}

	private static void method486(int[] is, int[] is_0_, int[] is_1_, byte[] is_2_, int i, int i_3_, int i_4_) {
		int i_5_ = 0;
		for (int i_6_ = i; i_6_ <= i_3_; i_6_++)
			for (int i_7_ = 0; i_7_ < i_4_; i_7_++)
				if (is_2_[i_7_] == i_6_) {
					is_1_[i_5_] = i_7_;
					i_5_++;
				}
		for (int i_8_ = 0; i_8_ < 23; i_8_++)
			is_0_[i_8_] = 0;
		for (int i_9_ = 0; i_9_ < i_4_; i_9_++)
			is_0_[is_2_[i_9_] + 1]++;
		for (int i_10_ = 1; i_10_ < 23; i_10_++)
			is_0_[i_10_] += is_0_[i_10_ - 1];
		for (int i_11_ = 0; i_11_ < 23; i_11_++)
			is[i_11_] = 0;
		int i_12_ = 0;
		for (int i_13_ = i; i_13_ <= i_3_; i_13_++) {
			i_12_ += is_0_[i_13_ + 1] - is_0_[i_13_];
			is[i_13_] = i_12_ - 1;
			i_12_ <<= 1;
		}
		for (int i_14_ = i + 1; i_14_ <= i_3_; i_14_++)
			is_0_[i_14_] = (is[i_14_ - 1] + 1 << 1) - is_0_[i_14_];
	}

	private static void method487(Class35 class35) {
		boolean bool = false;
		boolean bool_15_ = false;
		boolean bool_16_ = false;
		boolean bool_17_ = false;
		boolean bool_18_ = false;
		boolean bool_19_ = false;
		boolean bool_20_ = false;
		boolean bool_21_ = false;
		boolean bool_22_ = false;
		boolean bool_23_ = false;
		boolean bool_24_ = false;
		boolean bool_25_ = false;
		boolean bool_26_ = false;
		boolean bool_27_ = false;
		boolean bool_28_ = false;
		boolean bool_29_ = false;
		boolean bool_30_ = false;
		boolean bool_31_ = false;
		int i = 0;
		int[] is = null;
		int[] is_32_ = null;
		int[] is_33_ = null;
		class35.anInt833 = 1;
		if (Class37.anIntArray879 == null)
			Class37.anIntArray879 = new int[class35.anInt833 * 100000];
		boolean bool_34_ = true;
		while (bool_34_) {
			byte i_35_ = Class69.method488(class35);
			if (i_35_ == 23)
				break;
			i_35_ = Class69.method488(class35);
			i_35_ = Class69.method488(class35);
			i_35_ = Class69.method488(class35);
			i_35_ = Class69.method488(class35);
			i_35_ = Class69.method488(class35);
			i_35_ = Class69.method488(class35);
			i_35_ = Class69.method488(class35);
			i_35_ = Class69.method488(class35);
			i_35_ = Class69.method488(class35);
			i_35_ = Class69.method485(class35);
			class35.anInt846 = 0;
			int i_36_ = Class69.method488(class35);
			class35.anInt846 = class35.anInt846 << 8 | i_36_ & 0xff;
			i_36_ = Class69.method488(class35);
			class35.anInt846 = class35.anInt846 << 8 | i_36_ & 0xff;
			i_36_ = Class69.method488(class35);
			class35.anInt846 = class35.anInt846 << 8 | i_36_ & 0xff;
			for (int i_37_ = 0; i_37_ < 16; i_37_++) {
				i_35_ = Class69.method485(class35);
				class35.aBoolArray844[i_37_] = i_35_ == 1;
			}
			for (int i_38_ = 0; i_38_ < 256; i_38_++)
				class35.aBoolArray845[i_38_] = false;
			for (int i_39_ = 0; i_39_ < 16; i_39_++)
				if (class35.aBoolArray844[i_39_])
					for (int i_40_ = 0; i_40_ < 16; i_40_++) {
						i_35_ = Class69.method485(class35);
						if (i_35_ == 1)
							class35.aBoolArray845[i_39_ * 16 + i_40_] = true;
					}
			Class69.method492(class35);
			int i_41_ = class35.anInt819 + 2;
			int i_42_ = Class69.method490(3, class35);
			int i_43_ = Class69.method490(15, class35);
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
				int i_45_ = 0;
				for (;;) {
					i_35_ = Class69.method485(class35);
					if (i_35_ == 0)
						break;
					i_45_++;
				}
				class35.aByteArray831[i_44_] = (byte) i_45_;
			}
			byte[] is_46_ = new byte[6];
			for (byte i_47_ = 0; i_47_ < i_42_; i_47_++)
				is_46_[i_47_] = i_47_;
			for (int i_48_ = 0; i_48_ < i_43_; i_48_++) {
				byte i_49_ = class35.aByteArray831[i_48_];
				byte i_50_ = is_46_[i_49_];
				for (/**/; i_49_ > 0; i_49_--)
					is_46_[i_49_] = is_46_[i_49_ - 1];
				is_46_[0] = i_50_;
				class35.aByteArray830[i_48_] = i_50_;
			}
			for (int i_51_ = 0; i_51_ < i_42_; i_51_++) {
				int i_52_ = Class69.method490(5, class35);
				for (int i_53_ = 0; i_53_ < i_41_; i_53_++) {
					for (;;) {
						i_35_ = Class69.method485(class35);
						if (i_35_ == 0)
							break;
						i_35_ = Class69.method485(class35);
						if (i_35_ == 0)
							i_52_++;
						else
							i_52_--;
					}
					class35.aByteArrayArray813[i_51_][i_53_] = (byte) i_52_;
				}
			}
			for (int i_54_ = 0; i_54_ < i_42_; i_54_++) {
				int i_55_ = 32;
				byte i_56_ = 0;
				for (int i_57_ = 0; i_57_ < i_41_; i_57_++) {
					if (class35.aByteArrayArray813[i_54_][i_57_] > i_56_)
						i_56_ = class35.aByteArrayArray813[i_54_][i_57_];
					if (class35.aByteArrayArray813[i_54_][i_57_] < i_55_)
						i_55_ = class35.aByteArrayArray813[i_54_][i_57_];
				}
				Class69.method486(class35.anIntArrayArray838[i_54_], class35.anIntArrayArray821[i_54_], class35.anIntArrayArray808[i_54_], class35.aByteArrayArray813[i_54_], i_55_, i_56_, i_41_);
				class35.anIntArray843[i_54_] = i_55_;
			}
			int i_58_ = class35.anInt819 + 1;
			int i_59_ = -1;
			int i_60_ = 0;
			for (int i_61_ = 0; i_61_ <= 255; i_61_++)
				class35.anIntArray847[i_61_] = 0;
			int i_62_ = 4095;
			for (int i_63_ = 15; i_63_ >= 0; i_63_--) {
				for (int i_64_ = 15; i_64_ >= 0; i_64_--) {
					class35.aByteArray811[i_62_] = (byte) (i_63_ * 16 + i_64_);
					i_62_--;
				}
				class35.anIntArray841[i_63_] = i_62_ + 1;
			}
			int i_65_ = 0;
			if (i_60_ == 0) {
				i_59_++;
				i_60_ = 50;
				byte i_66_ = class35.aByteArray830[i_59_];
				i = class35.anIntArray843[i_66_];
				is = class35.anIntArrayArray838[i_66_];
				is_33_ = class35.anIntArrayArray808[i_66_];
				is_32_ = class35.anIntArrayArray821[i_66_];
			}
			i_60_--;
			int i_67_ = i;
			int i_68_;
			int i_69_;
			for (i_69_ = Class69.method490(i_67_, class35); i_69_ > is[i_67_]; i_69_ = i_69_ << 1 | i_68_) {
				i_67_++;
				i_68_ = Class69.method485(class35);
			}
			int i_70_ = is_33_[i_69_ - is_32_[i_67_]];
			while (i_70_ != i_58_)
				if (i_70_ == 0 || i_70_ == 1) {
					int i_71_ = -1;
					int i_72_ = 1;
					do {
						if (i_70_ == 0)
							i_71_ += i_72_;
						else if (i_70_ == 1)
							i_71_ += i_72_ * 2;
						i_72_ *= 2;
						if (i_60_ == 0) {
							i_59_++;
							i_60_ = 50;
							byte i_73_ = class35.aByteArray830[i_59_];
							i = class35.anIntArray843[i_73_];
							is = class35.anIntArrayArray838[i_73_];
							is_33_ = class35.anIntArrayArray808[i_73_];
							is_32_ = class35.anIntArrayArray821[i_73_];
						}
						i_60_--;
						i_67_ = i;
						for (i_69_ = Class69.method490(i_67_, class35); i_69_ > is[i_67_]; i_69_ = i_69_ << 1 | i_68_) {
							i_67_++;
							i_68_ = Class69.method485(class35);
						}
						i_70_ = is_33_[i_69_ - is_32_[i_67_]];
					} while (i_70_ == 0 || i_70_ == 1);
					i_71_++;
					i_36_ = class35.aByteArray809[class35.aByteArray811[class35.anIntArray841[0]] & 0xff];
					class35.anIntArray847[i_36_ & 0xff] += i_71_;
					for (/**/; i_71_ > 0; i_71_--) {
						Class37.anIntArray879[i_65_] = i_36_ & 0xff;
						i_65_++;
					}
				} else {
					int i_74_ = i_70_ - 1;
					if (i_74_ < 16) {
						int i_75_ = class35.anIntArray841[0];
						i_35_ = class35.aByteArray811[i_75_ + i_74_];
						for (/**/; i_74_ > 3; i_74_ -= 4) {
							int i_76_ = i_75_ + i_74_;
							class35.aByteArray811[i_76_] = class35.aByteArray811[i_76_ - 1];
							class35.aByteArray811[i_76_ - 1] = class35.aByteArray811[i_76_ - 2];
							class35.aByteArray811[i_76_ - 2] = class35.aByteArray811[i_76_ - 3];
							class35.aByteArray811[i_76_ - 3] = class35.aByteArray811[i_76_ - 4];
						}
						for (/**/; i_74_ > 0; i_74_--)
							class35.aByteArray811[i_75_ + i_74_] = class35.aByteArray811[i_75_ + i_74_ - 1];
						class35.aByteArray811[i_75_] = i_35_;
					} else {
						int i_77_ = i_74_ / 16;
						int i_78_ = i_74_ % 16;
						int i_79_ = class35.anIntArray841[i_77_] + i_78_;
						i_35_ = class35.aByteArray811[i_79_];
						for (/**/; i_79_ > class35.anIntArray841[i_77_]; i_79_--)
							class35.aByteArray811[i_79_] = class35.aByteArray811[i_79_ - 1];
						class35.anIntArray841[i_77_]++;
						for (/**/; i_77_ > 0; i_77_--) {
							class35.anIntArray841[i_77_]--;
							class35.aByteArray811[class35.anIntArray841[i_77_]] = class35.aByteArray811[class35.anIntArray841[i_77_ - 1] + 16 - 1];
						}
						class35.anIntArray841[0]--;
						class35.aByteArray811[class35.anIntArray841[0]] = i_35_;
						if (class35.anIntArray841[0] == 0) {
							int i_80_ = 4095;
							for (int i_81_ = 15; i_81_ >= 0; i_81_--) {
								for (int i_82_ = 15; i_82_ >= 0; i_82_--) {
									class35.aByteArray811[i_80_] = class35.aByteArray811[class35.anIntArray841[i_81_] + i_82_];
									i_80_--;
								}
								class35.anIntArray841[i_81_] = i_80_ + 1;
							}
						}
					}
					class35.anIntArray847[class35.aByteArray809[i_35_ & 0xff] & 0xff]++;
					Class37.anIntArray879[i_65_] = class35.aByteArray809[i_35_ & 0xff] & 0xff;
					i_65_++;
					if (i_60_ == 0) {
						i_59_++;
						i_60_ = 50;
						byte i_83_ = class35.aByteArray830[i_59_];
						i = class35.anIntArray843[i_83_];
						is = class35.anIntArrayArray838[i_83_];
						is_33_ = class35.anIntArrayArray808[i_83_];
						is_32_ = class35.anIntArrayArray821[i_83_];
					}
					i_60_--;
					i_67_ = i;
					for (i_69_ = Class69.method490(i_67_, class35); i_69_ > is[i_67_]; i_69_ = i_69_ << 1 | i_68_) {
						i_67_++;
						i_68_ = Class69.method485(class35);
					}
					i_70_ = is_33_[i_69_ - is_32_[i_67_]];
				}
			class35.anInt827 = 0;
			class35.aByte812 = (byte) 0;
			class35.anIntArray823[0] = 0;
			for (int i_84_ = 1; i_84_ <= 256; i_84_++)
				class35.anIntArray823[i_84_] = class35.anIntArray847[i_84_ - 1];
			for (int i_85_ = 1; i_85_ <= 256; i_85_++)
				class35.anIntArray823[i_85_] += class35.anIntArray823[i_85_ - 1];
			for (int i_86_ = 0; i_86_ < i_65_; i_86_++) {
				i_36_ = (byte) (Class37.anIntArray879[i_86_] & 0xff);
				Class37.anIntArray879[class35.anIntArray823[i_36_ & 0xff]] |= i_86_ << 8;
				class35.anIntArray823[i_36_ & 0xff]++;
			}
			class35.anInt834 = Class37.anIntArray879[class35.anInt846] >> 8;
			class35.anInt829 = 0;
			class35.anInt834 = Class37.anIntArray879[class35.anInt834];
			class35.anInt848 = (byte) (class35.anInt834 & 0xff);
			class35.anInt834 >>= 8;
			class35.anInt829++;
			class35.anInt835 = i_65_;
			Class69.method493(class35);
			bool_34_ = class35.anInt829 == class35.anInt835 + 1 && class35.anInt827 == 0;
		}
	}

	private static byte method488(Class35 class35) {
		return (byte) Class69.method490(8, class35);
	}

	static final int method489(byte[] is, int i, byte[] is_87_, int i_88_) {
		synchronized (Class69.aClass35_1396) {
			Class69.aClass35_1396.aByteArray818 = is_87_;
			Class69.aClass35_1396.anInt806 = 9;
			Class69.aClass35_1396.aByteArray828 = is;
			Class69.aClass35_1396.anInt836 = 0;
			Class69.aClass35_1396.anInt815 = i;
			Class69.aClass35_1396.anInt817 = 0;
			Class69.aClass35_1396.anInt820 = 0;
			Class69.aClass35_1396.anInt839 = 0;
			Class69.aClass35_1396.anInt850 = 0;
			Class69.method487(Class69.aClass35_1396);
			i -= Class69.aClass35_1396.anInt815;
			Class69.aClass35_1396.aByteArray818 = null;
			Class69.aClass35_1396.aByteArray828 = null;
			return i;
		}
	}

	private static int method490(int i, Class35 class35) {
		int i_90_;
		for (; ; ) {
			if (class35.anInt817 >= i) {
				int i_91_ = class35.anInt820 >> class35.anInt817 - i & (1 << i) - 1;
				class35.anInt817 -= i;
				i_90_ = i_91_;
				break;
			}
			class35.anInt820 = class35.anInt820 << 8 | class35.aByteArray818[class35.anInt806] & 0xff;
			class35.anInt817 += 8;
			class35.anInt806++;
			class35.anInt839++;
		}
		return i_90_;
	}

	public static void method491() {
		Class69.aClass35_1396 = null;
	}

	private static void method492(Class35 class35) {
		class35.anInt819 = 0;
		for (int i = 0; i < 256; i++)
			if (class35.aBoolArray845[i]) {
				class35.aByteArray809[class35.anInt819] = (byte) i;
				class35.anInt819++;
			}
	}

	private static void method493(Class35 class35) {
		byte i = class35.aByte812;
		int i_92_ = class35.anInt827;
		int i_93_ = class35.anInt829;
		int i_94_ = class35.anInt848;
		int[] is = Class37.anIntArray879;
		int i_95_ = class35.anInt834;
		byte[] is_96_ = class35.aByteArray828;
		int i_97_ = class35.anInt836;
		int i_98_ = class35.anInt815;
		int i_99_ = i_98_;
		int i_100_ = class35.anInt835 + 1;
		while_11_: for (;;) {
			if (i_92_ > 0) {
				for (;;) {
					if (i_98_ == 0)
						break while_11_;
					if (i_92_ == 1)
						break;
					is_96_[i_97_] = i;
					i_92_--;
					i_97_++;
					i_98_--;
				}
				if (i_98_ == 0) {
					i_92_ = 1;
					break;
				}
				is_96_[i_97_] = i;
				i_97_++;
				i_98_--;
			}
			boolean bool = true;
			while (bool) {
				bool = false;
				if (i_93_ == i_100_) {
					i_92_ = 0;
					break while_11_;
				}
				i = (byte) i_94_;
				i_95_ = is[i_95_];
				int i_101_ = (byte) (i_95_ & 0xff);
				i_95_ >>= 8;
				i_93_++;
				if (i_101_ != i_94_) {
					i_94_ = i_101_;
					if (i_98_ == 0) {
						i_92_ = 1;
						break while_11_;
					}
					is_96_[i_97_] = i;
					i_97_++;
					i_98_--;
					bool = true;
				} else if (i_93_ == i_100_) {
					if (i_98_ == 0) {
						i_92_ = 1;
						break while_11_;
					}
					is_96_[i_97_] = i;
					i_97_++;
					i_98_--;
					bool = true;
				}
			}
			i_92_ = 2;
			i_95_ = is[i_95_];
			int i_102_ = (byte) (i_95_ & 0xff);
			i_95_ >>= 8;
			if (++i_93_ != i_100_)
				if (i_102_ != i_94_)
					i_94_ = i_102_;
				else {
					i_92_ = 3;
					i_95_ = is[i_95_];
					i_102_ = (byte) (i_95_ & 0xff);
					i_95_ >>= 8;
					if (++i_93_ != i_100_)
						if (i_102_ != i_94_)
							i_94_ = i_102_;
						else {
							i_95_ = is[i_95_];
							i_102_ = (byte) (i_95_ & 0xff);
							i_95_ >>= 8;
							i_93_++;
							i_92_ = (i_102_ & 0xff) + 4;
							i_95_ = is[i_95_];
							i_94_ = (byte) (i_95_ & 0xff);
							i_95_ >>= 8;
							i_93_++;
						}
				}
		}
		int i_103_ = class35.anInt850;
		class35.anInt850 += i_99_ - i_98_;
		class35.aByte812 = i;
		class35.anInt827 = i_92_;
		class35.anInt829 = i_93_;
		class35.anInt848 = i_94_;
		Class37.anIntArray879 = is;
		class35.anInt834 = i_95_;
		class35.aByteArray828 = is_96_;
		class35.anInt836 = i_97_;
		class35.anInt815 = i_98_;
	}
}
