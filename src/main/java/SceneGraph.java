/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SceneGraph {
	private final int anInt620;
	private static int anInt621;
	private int anInt622 = 0;
	private final Class3[] aClass3Array623;
	private static int anInt624 = 0;
	private final int anInt625;
	private static int anInt626;
	private static int anInt627;
	private final Class38_Sub4[][][] aClass38_Sub4ArrayArrayArray628;
	private static Class5[][] aClass5ArrayArray629;
	private static boolean aBool630;
	private static int anInt631;
	private static int anInt632;
	private static int anInt633 = 4;
	private final int[][][] anIntArrayArrayArray634;
	private static int anInt635;
	static int mouseOverX;
	private int anInt637 = 0;
	private static int anInt638;
	private static int anInt639;
	private static int anInt640;
	private final int[][][] anIntArrayArrayArray641;
	private static Class3[] aClass3Array642;
	private static int anInt643;
	private final int anInt644;
	private static int anInt645;
	private static int anInt646;
	private static int anInt647;
	private static int anInt648;
	private static int anInt649;
	private static int anInt650;
	static boolean aBool651;
	private static int anInt652;
	private static int anInt653;
	private static Class5[] aClass5Array654;
	private static int anInt655;
	static int mouseOverY;
	private static Class13 aClass13_657;
	private static int[] anIntArray658;
	private static boolean[][][][] aBoolArrayArrayArrayArray659;
	private static int anInt660;
	private static int[] anIntArray661;
	private static int anInt662;
	private static int[] anIntArray663;
	private static int[] anIntArray664;
	private static int anInt665;
	private static int[] anIntArray666;
	private final int[][] anIntArrayArray667;
	private static int[] anIntArray668;
	private static int anInt669;
	private static int[] anIntArray670;
	private static boolean[][] aBoolArrayArray671;
	private final int[][] anIntArrayArray672;
	private static int[] anIntArray673;
	private static int anInt674;
	private static int anInt675;

	final void method220(int i, int i_0_, int i_1_, int i_2_,
			SceneModel class38_sub20_sub3,
			SceneModel class38_sub20_sub3_3_, int i_4_, int i_5_,
			int i_6_, int i_7_) {
		if (class38_sub20_sub3 != null || class38_sub20_sub3_3_ != null) {
			Class82 class82 = new Class82();
			class82.anInt1640 = i_6_;
			class82.anInt1634 = i_7_;
			class82.anInt1628 = i_0_ * 128 + 64;
			class82.anInt1637 = i_1_ * 128 + 64;
			class82.anInt1636 = i_2_;
			class82.aClass38_Sub20_Sub3_1627 = class38_sub20_sub3;
			class82.aClass38_Sub20_Sub3_1630 = class38_sub20_sub3_3_;
			class82.anInt1632 = i_4_;
			class82.anInt1635 = i_5_;
			for (int i_8_ = i; i_8_ >= 0; i_8_--)
				if (aClass38_Sub4ArrayArrayArray628[i_8_][i_0_][i_1_] == null)
					aClass38_Sub4ArrayArrayArray628[i_8_][i_0_][i_1_] = new Class38_Sub4(
							i_8_, i_0_, i_1_);
			aClass38_Sub4ArrayArrayArray628[i][i_0_][i_1_].aClass82_1823 = class82;
		}
	}

	private final void method221(
			Model class38_sub20_sub3_sub3, int i, int i_9_,
			int i_10_) {
		if (i_9_ < anInt625) {
			Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_9_ + 1][i_10_];
			if (class38_sub4 != null
					&& class38_sub4.aClass49_1805 != null
					&& class38_sub4.aClass49_1805.aClass38_Sub20_Sub3_1101 instanceof Model) {
				Model class38_sub20_sub3_sub3_11_ = (Model) class38_sub4.aClass49_1805.aClass38_Sub20_Sub3_1101;
				Model.method1143(class38_sub20_sub3_sub3,
						class38_sub20_sub3_sub3_11_, 128, 0, 0, true);
			}
		}
		if (i_10_ < anInt625) {
			Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_9_][i_10_ + 1];
			if (class38_sub4 != null
					&& class38_sub4.aClass49_1805 != null
					&& class38_sub4.aClass49_1805.aClass38_Sub20_Sub3_1101 instanceof Model) {
				Model class38_sub20_sub3_sub3_12_ = (Model) class38_sub4.aClass49_1805.aClass38_Sub20_Sub3_1101;
				Model.method1143(class38_sub20_sub3_sub3,
						class38_sub20_sub3_sub3_12_, 0, 0, 128, true);
			}
		}
		if (i_9_ < anInt625 && i_10_ < anInt644) {
			Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_9_ + 1][i_10_ + 1];
			if (class38_sub4 != null
					&& class38_sub4.aClass49_1805 != null
					&& class38_sub4.aClass49_1805.aClass38_Sub20_Sub3_1101 instanceof Model) {
				Model class38_sub20_sub3_sub3_13_ = (Model) class38_sub4.aClass49_1805.aClass38_Sub20_Sub3_1101;
				Model.method1143(class38_sub20_sub3_sub3,
						class38_sub20_sub3_sub3_13_, 128, 0, 128, true);
			}
		}
		if (i_9_ < anInt625 && i_10_ > 0) {
			Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_9_ + 1][i_10_ - 1];
			if (class38_sub4 != null
					&& class38_sub4.aClass49_1805 != null
					&& class38_sub4.aClass49_1805.aClass38_Sub20_Sub3_1101 instanceof Model) {
				Model class38_sub20_sub3_sub3_14_ = (Model) class38_sub4.aClass49_1805.aClass38_Sub20_Sub3_1101;
				Model.method1143(class38_sub20_sub3_sub3,
						class38_sub20_sub3_sub3_14_, 128, 0, -128, true);
			}
		}
	}

	final Class3 method222(int i, int i_15_, int i_16_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_15_][i_16_];
		if (class38_sub4 == null)
			return null;
		for (int i_17_ = 0; i_17_ < class38_sub4.anInt1828; i_17_++) {
			Class3 class3 = class38_sub4.aClass3Array1809[i_17_];
			if ((class3.anInt62 >> 29 & 0x3) == 2 && class3.anInt49 == i_15_
					&& class3.anInt46 == i_16_)
				return class3;
		}
		return null;
	}

	private static final boolean method223(int i, int i_18_, int i_19_) {
		int i_20_ = i_19_ * SceneGraph.anInt655 + i * SceneGraph.anInt650 >> 16;
		int i_21_ = i_19_ * SceneGraph.anInt650 - i * SceneGraph.anInt655 >> 16;
		int i_22_ = i_18_ * SceneGraph.anInt638 + i_21_ * SceneGraph.anInt649 >> 16;
		int i_23_ = i_18_ * SceneGraph.anInt649 - i_21_ * SceneGraph.anInt638 >> 16;
		if (i_22_ < 50 || i_22_ > 3500)
			return false;
		int i_24_ = SceneGraph.anInt660 + (i_20_ << 9) / i_22_;
		int i_25_ = SceneGraph.anInt669 + (i_23_ << 9) / i_22_;
		if (i_24_ < SceneGraph.anInt665 || i_24_ > SceneGraph.anInt674
				|| i_25_ < SceneGraph.anInt662 || i_25_ > SceneGraph.anInt675)
			return false;
		return true;
	}

	final int method224(int i, int i_26_, int i_27_, int i_28_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_26_][i_27_];
		if (class38_sub4 == null)
			return -1;
		if (class38_sub4.aClass82_1823 != null
				&& class38_sub4.aClass82_1823.anInt1640 == i_28_)
			return class38_sub4.aClass82_1823.anInt1634 & 0xff;
		if (class38_sub4.aClass43_1819 != null
				&& class38_sub4.aClass43_1819.anInt975 == i_28_)
			return class38_sub4.aClass43_1819.anInt970 & 0xff;
		if (class38_sub4.aClass49_1805 != null
				&& class38_sub4.aClass49_1805.anInt1097 == i_28_)
			return class38_sub4.aClass49_1805.anInt1095 & 0xff;
		for (int i_29_ = 0; i_29_ < class38_sub4.anInt1828; i_29_++)
			if (class38_sub4.aClass3Array1809[i_29_].anInt62 == i_28_)
				return class38_sub4.aClass3Array1809[i_29_].anInt54 & 0xff;
		return -1;
	}

	final void method225(int i, int i_30_, int i_31_, int i_32_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_30_][i_31_];
		if (class38_sub4 != null)
			aClass38_Sub4ArrayArrayArray628[i][i_30_][i_31_].anInt1832 = i_32_;
	}

	final Class82 method226(int i, int i_33_, int i_34_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_33_][i_34_];
		if (class38_sub4 == null)
			return null;
		return class38_sub4.aClass82_1823;
	}

	final void method227(int i, int i_35_, int i_36_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_35_][i_36_];
		if (class38_sub4 != null)
			class38_sub4.aClass43_1819 = null;
	}

	private final boolean method228(int i, int i_37_, int i_38_, int i_39_) {
		if (!method264(i, i_37_, i_38_))
			return false;
		int i_40_ = i_37_ << 7;
		int i_41_ = i_38_ << 7;
		int i_42_ = anIntArrayArrayArray634[i][i_37_][i_38_] - 1;
		int i_43_ = i_42_ - 120;
		int i_44_ = i_42_ - 230;
		int i_45_ = i_42_ - 238;
		if (i_39_ < 16) {
			if (i_39_ == 1) {
				if (i_40_ > SceneGraph.anInt640) {
					if (!method266(i_40_, i_42_, i_41_))
						return false;
					if (!method266(i_40_, i_42_, i_41_ + 128))
						return false;
				}
				if (i > 0) {
					if (!method266(i_40_, i_43_, i_41_))
						return false;
					if (!method266(i_40_, i_43_, i_41_ + 128))
						return false;
				}
				if (!method266(i_40_, i_44_, i_41_))
					return false;
				if (!method266(i_40_, i_44_, i_41_ + 128))
					return false;
				return true;
			}
			if (i_39_ == 2) {
				if (i_41_ < SceneGraph.anInt646) {
					if (!method266(i_40_, i_42_, i_41_ + 128))
						return false;
					if (!method266(i_40_ + 128, i_42_, i_41_ + 128))
						return false;
				}
				if (i > 0) {
					if (!method266(i_40_, i_43_, i_41_ + 128))
						return false;
					if (!method266(i_40_ + 128, i_43_, i_41_ + 128))
						return false;
				}
				if (!method266(i_40_, i_44_, i_41_ + 128))
					return false;
				if (!method266(i_40_ + 128, i_44_, i_41_ + 128))
					return false;
				return true;
			}
			if (i_39_ == 4) {
				if (i_40_ < SceneGraph.anInt640) {
					if (!method266(i_40_ + 128, i_42_, i_41_))
						return false;
					if (!method266(i_40_ + 128, i_42_, i_41_ + 128))
						return false;
				}
				if (i > 0) {
					if (!method266(i_40_ + 128, i_43_, i_41_))
						return false;
					if (!method266(i_40_ + 128, i_43_, i_41_ + 128))
						return false;
				}
				if (!method266(i_40_ + 128, i_44_, i_41_))
					return false;
				if (!method266(i_40_ + 128, i_44_, i_41_ + 128))
					return false;
				return true;
			}
			if (i_39_ == 8) {
				if (i_41_ > SceneGraph.anInt646) {
					if (!method266(i_40_, i_42_, i_41_))
						return false;
					if (!method266(i_40_ + 128, i_42_, i_41_))
						return false;
				}
				if (i > 0) {
					if (!method266(i_40_, i_43_, i_41_))
						return false;
					if (!method266(i_40_ + 128, i_43_, i_41_))
						return false;
				}
				if (!method266(i_40_, i_44_, i_41_))
					return false;
				if (!method266(i_40_ + 128, i_44_, i_41_))
					return false;
				return true;
			}
		}
		if (!method266(i_40_ + 64, i_45_, i_41_ + 64))
			return false;
		if (i_39_ == 16) {
			if (!method266(i_40_, i_44_, i_41_ + 128))
				return false;
			return true;
		}
		if (i_39_ == 32) {
			if (!method266(i_40_ + 128, i_44_, i_41_ + 128))
				return false;
			return true;
		}
		if (i_39_ == 64) {
			if (!method266(i_40_ + 128, i_44_, i_41_))
				return false;
			return true;
		}
		if (i_39_ == 128) {
			if (!method266(i_40_, i_44_, i_41_))
				return false;
			return true;
		}
		return true;
	}

	final void method229(int i, int i_46_, int i_47_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_46_][i_47_];
		if (class38_sub4 != null)
			class38_sub4.aClass28_1824 = null;
	}

	static final void method230(int[] is, int i, int i_48_, int i_49_, int i_50_) {
		SceneGraph.anInt665 = 0;
		SceneGraph.anInt662 = 0;
		SceneGraph.anInt674 = i_49_;
		SceneGraph.anInt675 = i_50_;
		SceneGraph.anInt660 = i_49_ / 2;
		SceneGraph.anInt669 = i_50_ / 2;
		boolean[][][][] bools = new boolean[9][32][53][53];
		for (int i_51_ = 128; i_51_ <= 384; i_51_ += 32)
			for (int i_52_ = 0; i_52_ < 2048; i_52_ += 64) {
				SceneGraph.anInt638 = Class38_Sub20_Sub9_Sub4.anIntArray3520[i_51_];
				SceneGraph.anInt649 = Class38_Sub20_Sub9_Sub4.anIntArray3528[i_51_];
				SceneGraph.anInt655 = Class38_Sub20_Sub9_Sub4.anIntArray3520[i_52_];
				SceneGraph.anInt650 = Class38_Sub20_Sub9_Sub4.anIntArray3528[i_52_];
				int i_53_ = (i_51_ - 128) / 32;
				int i_54_ = i_52_ / 64;
				for (int i_55_ = -26; i_55_ <= 26; i_55_++)
					for (int i_56_ = -26; i_56_ <= 26; i_56_++) {
						int i_57_ = i_55_ * 128;
						int i_58_ = i_56_ * 128;
						boolean bool = false;
						for (int i_59_ = -i; i_59_ <= i_48_; i_59_ += 128)
							if (SceneGraph.method223(i_57_, is[i_53_] + i_59_,
									i_58_)) {
								bool = true;
								break;
							}
						bools[i_53_][i_54_][i_55_ + 25 + 1][i_56_ + 25 + 1] = bool;
					}
			}
		for (int i_60_ = 0; i_60_ < 8; i_60_++)
			for (int i_61_ = 0; i_61_ < 32; i_61_++)
				for (int i_62_ = -25; i_62_ < 25; i_62_++)
					for (int i_63_ = -25; i_63_ < 25; i_63_++) {
						boolean bool = false;
						while_3_: for (int i_64_ = -1; i_64_ <= 1; i_64_++)
							for (int i_65_ = -1; i_65_ <= 1; i_65_++) {
								if (bools[i_60_][i_61_][i_62_ + i_64_ + 25 + 1][i_63_
										+ i_65_ + 25 + 1]) {
									bool = true;
									break while_3_;
								}
								if (bools[i_60_][(i_61_ + 1) % 31][i_62_
										+ i_64_ + 25 + 1][i_63_ + i_65_ + 25
										+ 1]) {
									bool = true;
									break while_3_;
								}
								if (bools[i_60_ + 1][i_61_][i_62_ + i_64_ + 25
										+ 1][i_63_ + i_65_ + 25 + 1]) {
									bool = true;
									break while_3_;
								}
								if (bools[i_60_ + 1][(i_61_ + 1) % 31][i_62_
										+ i_64_ + 25 + 1][i_63_ + i_65_ + 25
										+ 1]) {
									bool = true;
									break while_3_;
								}
							}
						SceneGraph.aBoolArrayArrayArrayArray659[i_60_][i_61_][i_62_ + 25][i_63_ + 25] = bool;
					}
	}

	final void method231(int i, int i_66_, int i_67_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_66_][i_67_];
		if (class38_sub4 != null)
			for (int i_68_ = 0; i_68_ < class38_sub4.anInt1828; i_68_++) {
				Class3 class3 = class38_sub4.aClass3Array1809[i_68_];
				if ((class3.anInt62 >> 29 & 0x3) == 2
						&& class3.anInt49 == i_66_ && class3.anInt46 == i_67_) {
					method267(class3);
					break;
				}
			}
	}

	private final boolean method232(int i, int i_69_, int i_70_, int i_71_,
			int i_72_, int i_73_, int i_74_, int i_75_,
			SceneModel class38_sub20_sub3, int i_76_, boolean bool,
			int i_77_, int i_78_) {
		for (int i_79_ = i_69_; i_79_ < i_69_ + i_71_; i_79_++)
			for (int i_80_ = i_70_; i_80_ < i_70_ + i_72_; i_80_++) {
				if (i_79_ < 0 || i_80_ < 0 || i_79_ >= anInt625
						|| i_80_ >= anInt644)
					return false;
				Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_79_][i_80_];
				if (class38_sub4 != null && class38_sub4.anInt1828 >= 5)
					return false;
			}
		Class3 class3 = new Class3();
		class3.anInt62 = i_77_;
		class3.anInt54 = i_78_;
		class3.anInt60 = i;
		class3.anInt45 = i_73_;
		class3.anInt48 = i_74_;
		class3.anInt55 = i_75_;
		class3.aClass38_Sub20_Sub3_53 = class38_sub20_sub3;
		class3.anInt56 = i_76_;
		class3.anInt49 = i_69_;
		class3.anInt46 = i_70_;
		class3.anInt58 = i_69_ + i_71_ - 1;
		class3.anInt59 = i_70_ + i_72_ - 1;
		for (int i_81_ = i_69_; i_81_ < i_69_ + i_71_; i_81_++)
			for (int i_82_ = i_70_; i_82_ < i_70_ + i_72_; i_82_++) {
				int i_83_ = 0;
				if (i_81_ > i_69_)
					i_83_++;
				if (i_81_ < i_69_ + i_71_ - 1)
					i_83_ += 4;
				if (i_82_ > i_70_)
					i_83_ += 8;
				if (i_82_ < i_70_ + i_72_ - 1)
					i_83_ += 2;
				for (int i_84_ = i; i_84_ >= 0; i_84_--)
					if (aClass38_Sub4ArrayArrayArray628[i_84_][i_81_][i_82_] == null)
						aClass38_Sub4ArrayArrayArray628[i_84_][i_81_][i_82_] = new Class38_Sub4(
								i_84_, i_81_, i_82_);
				Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_81_][i_82_];
				class38_sub4.aClass3Array1809[class38_sub4.anInt1828] = class3;
				class38_sub4.anIntArray1822[class38_sub4.anInt1828] = i_83_;
				class38_sub4.anInt1813 |= i_83_;
				class38_sub4.anInt1828++;
			}
		if (bool)
			aClass3Array623[anInt622++] = class3;
		return true;
	}

	final void method233(int i, int i_85_, int i_86_) {
		SceneGraph.aBool630 = true;
		SceneGraph.anInt648 = i;
		SceneGraph.anInt643 = i_85_;
		SceneGraph.anInt645 = i_86_;
		SceneGraph.mouseOverX = -1;
		SceneGraph.mouseOverY = -1;
	}

	final int method234(int i, int i_87_, int i_88_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_87_][i_88_];
		if (class38_sub4 == null || class38_sub4.aClass43_1819 == null)
			return 0;
		return class38_sub4.aClass43_1819.anInt975;
	}

	private final boolean method235(int i, int i_89_, int i_90_, int i_91_,
			int i_92_, int i_93_) {
		if (i_89_ == i_90_ && i_91_ == i_92_) {
			if (!method264(i, i_89_, i_91_))
				return false;
			int i_94_ = i_89_ << 7;
			int i_95_ = i_91_ << 7;
			if (method266(i_94_ + 1, anIntArrayArrayArray634[i][i_89_][i_91_]
					- i_93_, i_95_ + 1)
					&& method266(i_94_ + 128 - 1,
							anIntArrayArrayArray634[i][i_89_ + 1][i_91_]
									- i_93_, i_95_ + 1)
					&& method266(i_94_ + 128 - 1,
							anIntArrayArrayArray634[i][i_89_ + 1][i_91_ + 1]
									- i_93_, i_95_ + 128 - 1)
					&& method266(i_94_ + 1,
							anIntArrayArrayArray634[i][i_89_][i_91_ + 1]
									- i_93_, i_95_ + 128 - 1))
				return true;
			return false;
		}
		for (int i_96_ = i_89_; i_96_ <= i_90_; i_96_++)
			for (int i_97_ = i_91_; i_97_ <= i_92_; i_97_++)
				if (anIntArrayArrayArray641[i][i_96_][i_97_] == -SceneGraph.anInt639)
					return false;
		int i_98_ = (i_89_ << 7) + 1;
		int i_99_ = (i_91_ << 7) + 2;
		int i_100_ = anIntArrayArrayArray634[i][i_89_][i_91_] - i_93_;
		if (!method266(i_98_, i_100_, i_99_))
			return false;
		int i_101_ = (i_90_ << 7) - 1;
		if (!method266(i_101_, i_100_, i_99_))
			return false;
		int i_102_ = (i_92_ << 7) - 1;
		if (!method266(i_98_, i_100_, i_102_))
			return false;
		if (!method266(i_101_, i_100_, i_102_))
			return false;
		return true;
	}

	final int method236(int i, int i_103_, int i_104_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_103_][i_104_];
		if (class38_sub4 == null)
			return 0;
		for (int i_105_ = 0; i_105_ < class38_sub4.anInt1828; i_105_++) {
			Class3 class3 = class38_sub4.aClass3Array1809[i_105_];
			if ((class3.anInt62 >> 29 & 0x3) == 2 && class3.anInt49 == i_103_
					&& class3.anInt46 == i_104_)
				return class3.anInt62;
		}
		return 0;
	}

	final int method237(int i, int i_106_, int i_107_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_106_][i_107_];
		if (class38_sub4 == null || class38_sub4.aClass49_1805 == null)
			return 0;
		return class38_sub4.aClass49_1805.anInt1097;
	}

	final void method238() {
		for (int i = 0; i < anInt622; i++) {
			Class3 class3 = aClass3Array623[i];
			method267(class3);
			aClass3Array623[i] = null;
		}
		anInt622 = 0;
	}

	final void method239(int i, int i_108_, int i_109_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_108_][i_109_];
		if (class38_sub4 != null)
			class38_sub4.aClass49_1805 = null;
	}

	private final boolean method240(int i, int i_110_, int i_111_, int i_112_) {
		if (!method264(i, i_110_, i_111_))
			return false;
		int i_113_ = i_110_ << 7;
		int i_114_ = i_111_ << 7;
		if (method266(i_113_ + 1, anIntArrayArrayArray634[i][i_110_][i_111_]
				- i_112_, i_114_ + 1)
				&& method266(
						i_113_ + 128 - 1,
						anIntArrayArrayArray634[i][i_110_ + 1][i_111_] - i_112_,
						i_114_ + 1)
				&& method266(i_113_ + 128 - 1,
						anIntArrayArrayArray634[i][i_110_ + 1][i_111_ + 1]
								- i_112_, i_114_ + 128 - 1)
				&& method266(
						i_113_ + 1,
						anIntArrayArrayArray634[i][i_110_][i_111_ + 1] - i_112_,
						i_114_ + 128 - 1))
			return true;
		return false;
	}

	final void method241(int i, int i_115_, int i_116_, int i_117_,
			SceneModel class38_sub20_sub3, int i_118_, int i_119_) {
		if (class38_sub20_sub3 != null) {
			Class49 class49 = new Class49();
			class49.aClass38_Sub20_Sub3_1101 = class38_sub20_sub3;
			class49.anInt1098 = i_115_ * 128 + 64;
			class49.anInt1087 = i_116_ * 128 + 64;
			class49.anInt1092 = i_117_;
			class49.anInt1097 = i_118_;
			class49.anInt1095 = i_119_;
			if (aClass38_Sub4ArrayArrayArray628[i][i_115_][i_116_] == null)
				aClass38_Sub4ArrayArrayArray628[i][i_115_][i_116_] = new Class38_Sub4(
						i, i_115_, i_116_);
			aClass38_Sub4ArrayArrayArray628[i][i_115_][i_116_].aClass49_1805 = class49;
		}
	}

	final void method242() {
		for (int i = 0; i < anInt620; i++)
			for (int i_120_ = 0; i_120_ < anInt625; i_120_++)
				for (int i_121_ = 0; i_121_ < anInt644; i_121_++)
					aClass38_Sub4ArrayArrayArray628[i][i_120_][i_121_] = null;
		for (int i = 0; i < SceneGraph.anInt633; i++) {
			for (int i_122_ = 0; i_122_ < SceneGraph.anIntArray658[i]; i_122_++)
				SceneGraph.aClass5ArrayArray629[i][i_122_] = null;
			SceneGraph.anIntArray658[i] = 0;
		}
		for (int i = 0; i < anInt622; i++)
			aClass3Array623[i] = null;
		anInt622 = 0;
		for (int i = 0; i < SceneGraph.aClass3Array642.length; i++)
			SceneGraph.aClass3Array642[i] = null;
	}

	final void method243(int i, int i_123_, int i_124_) {
		for (int i_125_ = 0; i_125_ < anInt620; i_125_++)
			for (int i_126_ = 0; i_126_ < anInt625; i_126_++)
				for (int i_127_ = 0; i_127_ < anInt644; i_127_++) {
					Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i_125_][i_126_][i_127_];
					if (class38_sub4 != null) {
						Class82 class82 = class38_sub4.aClass82_1823;
						if (class82 != null
								&& class82.aClass38_Sub20_Sub3_1627 instanceof Model) {
							Model class38_sub20_sub3_sub3 = (Model) class82.aClass38_Sub20_Sub3_1627;
							method265(class38_sub20_sub3_sub3, i_125_, i_126_,
									i_127_, 1, 1);
							if (class82.aClass38_Sub20_Sub3_1630 instanceof Model) {
								Model class38_sub20_sub3_sub3_128_ = (Model) class82.aClass38_Sub20_Sub3_1630;
								method265(class38_sub20_sub3_sub3_128_, i_125_,
										i_126_, i_127_, 1, 1);
								Model.method1143(
										class38_sub20_sub3_sub3,
										class38_sub20_sub3_sub3_128_, 0, 0, 0,
										false);
								class82.aClass38_Sub20_Sub3_1630 = class38_sub20_sub3_sub3_128_
										.method1142(
												class38_sub20_sub3_sub3_128_.aShort3313,
												class38_sub20_sub3_sub3_128_.aShort3324,
												i, i_123_, i_124_);
							}
							class82.aClass38_Sub20_Sub3_1627 = class38_sub20_sub3_sub3
									.method1142(
											class38_sub20_sub3_sub3.aShort3313,
											class38_sub20_sub3_sub3.aShort3324,
											i, i_123_, i_124_);
						}
						for (int i_129_ = 0; i_129_ < class38_sub4.anInt1828; i_129_++) {
							Class3 class3 = class38_sub4.aClass3Array1809[i_129_];
							if (class3 != null
									&& class3.aClass38_Sub20_Sub3_53 instanceof Model) {
								Model class38_sub20_sub3_sub3 = (Model) class3.aClass38_Sub20_Sub3_53;
								method265(class38_sub20_sub3_sub3, i_125_,
										i_126_, i_127_, class3.anInt58
												- class3.anInt49 + 1,
										class3.anInt59 - class3.anInt46 + 1);
								class3.aClass38_Sub20_Sub3_53 = class38_sub20_sub3_sub3
										.method1142(
												class38_sub20_sub3_sub3.aShort3313,
												class38_sub20_sub3_sub3.aShort3324,
												i, i_123_, i_124_);
							}
						}
						Class49 class49 = class38_sub4.aClass49_1805;
						if (class49 != null
								&& class49.aClass38_Sub20_Sub3_1101 instanceof Model) {
							Model class38_sub20_sub3_sub3 = (Model) class49.aClass38_Sub20_Sub3_1101;
							method221(class38_sub20_sub3_sub3, i_125_, i_126_,
									i_127_);
							class49.aClass38_Sub20_Sub3_1101 = class38_sub20_sub3_sub3
									.method1142(
											class38_sub20_sub3_sub3.aShort3313,
											class38_sub20_sub3_sub3.aShort3324,
											i, i_123_, i_124_);
						}
					}
				}
	}

	private final void method244(Class1 class1, int i, int i_130_, int i_131_,
			int i_132_, int i_133_, int i_134_) {
		int i_135_ = class1.anIntArray12.length;
		for (int i_136_ = 0; i_136_ < i_135_; i_136_++) {
			int i_137_ = class1.anIntArray12[i_136_] - SceneGraph.anInt640;
			int i_138_ = class1.anIntArray6[i_136_] - SceneGraph.anInt653;
			int i_139_ = class1.anIntArray21[i_136_] - SceneGraph.anInt646;
			int i_140_ = i_139_ * i_131_ + i_137_ * i_132_ >> 16;
			i_139_ = i_139_ * i_132_ - i_137_ * i_131_ >> 16;
			i_137_ = i_140_;
			i_140_ = i_138_ * i_130_ - i_139_ * i >> 16;
			i_139_ = i_138_ * i + i_139_ * i_130_ >> 16;
			i_138_ = i_140_;
			if (i_139_ < 50)
				return;
			if (class1.anIntArray9 != null) {
				Class1.anIntArray7[i_136_] = i_137_;
				Class1.anIntArray16[i_136_] = i_138_;
				Class1.anIntArray14[i_136_] = i_139_;
			}
			Class1.anIntArray5[i_136_] = Class38_Sub20_Sub9_Sub4.anInt3521
					+ (i_137_ << 9) / i_139_;
			Class1.anIntArray17[i_136_] = Class38_Sub20_Sub9_Sub4.anInt3536
					+ (i_138_ << 9) / i_139_;
		}
		Class38_Sub20_Sub9_Sub4.anInt3535 = 0;
		i_135_ = class1.anIntArray19.length;
		for (int i_141_ = 0; i_141_ < i_135_; i_141_++) {
			int i_142_ = class1.anIntArray19[i_141_];
			int i_143_ = class1.anIntArray22[i_141_];
			int i_144_ = class1.anIntArray3[i_141_];
			int i_145_ = Class1.anIntArray5[i_142_];
			int i_146_ = Class1.anIntArray5[i_143_];
			int i_147_ = Class1.anIntArray5[i_144_];
			int i_148_ = Class1.anIntArray17[i_142_];
			int i_149_ = Class1.anIntArray17[i_143_];
			int i_150_ = Class1.anIntArray17[i_144_];
			if ((i_145_ - i_146_) * (i_150_ - i_149_) - (i_148_ - i_149_)
					* (i_147_ - i_146_) > 0) {
				Class38_Sub20_Sub9_Sub4.aBool3524 = false;
				if (i_145_ < 0 || i_146_ < 0 || i_147_ < 0
						|| i_145_ > Class38_Sub20_Sub9_Sub4.anInt3537
						|| i_146_ > Class38_Sub20_Sub9_Sub4.anInt3537
						|| i_147_ > Class38_Sub20_Sub9_Sub4.anInt3537)
					Class38_Sub20_Sub9_Sub4.aBool3524 = true;
				if (SceneGraph.aBool630
						&& method269(SceneGraph.anInt643, SceneGraph.anInt645,
								i_148_, i_149_, i_150_, i_145_, i_146_, i_147_)) {
					SceneGraph.mouseOverX = i_133_;
					SceneGraph.mouseOverY = i_134_;
				}
				if (class1.anIntArray9 == null
						|| class1.anIntArray9[i_141_] == -1) {
					if (class1.anIntArray11[i_141_] != 12345678)
						Class38_Sub20_Sub9_Sub4.method1188(i_148_, i_149_,
								i_150_, i_145_, i_146_, i_147_,
								class1.anIntArray11[i_141_],
								class1.anIntArray8[i_141_],
								class1.anIntArray15[i_141_]);
				} else if (!SceneGraph.aBool651) {
					if (class1.aBool10)
						Class38_Sub20_Sub9_Sub4.method1186(i_148_, i_149_,
								i_150_, i_145_, i_146_, i_147_,
								class1.anIntArray11[i_141_],
								class1.anIntArray8[i_141_],
								class1.anIntArray15[i_141_],
								Class1.anIntArray7[0], Class1.anIntArray7[1],
								Class1.anIntArray7[3], Class1.anIntArray16[0],
								Class1.anIntArray16[1], Class1.anIntArray16[3],
								Class1.anIntArray14[0], Class1.anIntArray14[1],
								Class1.anIntArray14[3],
								class1.anIntArray9[i_141_]);
					else
						Class38_Sub20_Sub9_Sub4.method1186(i_148_, i_149_,
								i_150_, i_145_, i_146_, i_147_,
								class1.anIntArray11[i_141_],
								class1.anIntArray8[i_141_],
								class1.anIntArray15[i_141_],
								Class1.anIntArray7[i_142_],
								Class1.anIntArray7[i_143_],
								Class1.anIntArray7[i_144_],
								Class1.anIntArray16[i_142_],
								Class1.anIntArray16[i_143_],
								Class1.anIntArray16[i_144_],
								Class1.anIntArray14[i_142_],
								Class1.anIntArray14[i_143_],
								Class1.anIntArray14[i_144_],
								class1.anIntArray9[i_141_]);
				} else {
					int i_151_ = Class38_Sub20_Sub9_Sub4.anInterface3_3533
							.method7(class1.anIntArray9[i_141_], false);
					Class38_Sub20_Sub9_Sub4.method1188(i_148_, i_149_, i_150_,
							i_145_, i_146_, i_147_, SceneGraph.method258(
									i_151_, class1.anIntArray11[i_141_]),
							SceneGraph.method258(i_151_,
									class1.anIntArray8[i_141_]), SceneGraph
									.method258(i_151_,
											class1.anIntArray15[i_141_]));
				}
			}
		}
	}

	final void method245(int i) {
		anInt637 = i;
		for (int i_152_ = 0; i_152_ < anInt625; i_152_++)
			for (int i_153_ = 0; i_153_ < anInt644; i_153_++)
				if (aClass38_Sub4ArrayArrayArray628[i][i_152_][i_153_] == null)
					aClass38_Sub4ArrayArrayArray628[i][i_152_][i_153_] = new Class38_Sub4(
							i, i_152_, i_153_);
	}

	final boolean method246(int i, int i_154_, int i_155_, int i_156_,
			int i_157_, SceneModel class38_sub20_sub3, int i_158_,
			int i_159_, int i_160_, int i_161_, int i_162_, int i_163_) {
		if (class38_sub20_sub3 == null)
			return true;
		return method232(i, i_160_, i_161_, i_162_ - i_160_ + 1, i_163_
				- i_161_ + 1, i_154_, i_155_, i_156_, class38_sub20_sub3,
				i_158_, true, i_159_, 0);
	}

	final void method247(int i, int i_164_, int i_165_, int i_166_, int i_167_,
			int i_168_, int i_169_, int i_170_, int i_171_, int i_172_,
			int i_173_, int i_174_, int i_175_, int i_176_, int i_177_,
			int i_178_, int i_179_, int i_180_, int i_181_, int i_182_) {
		if (i_166_ == 0) {
			Class15 class15 = new Class15(i_173_, i_174_, i_175_, i_176_, -1,
					i_181_, false);
			for (int i_183_ = i; i_183_ >= 0; i_183_--)
				if (aClass38_Sub4ArrayArrayArray628[i_183_][i_164_][i_165_] == null)
					aClass38_Sub4ArrayArrayArray628[i_183_][i_164_][i_165_] = new Class38_Sub4(
							i_183_, i_164_, i_165_);
			aClass38_Sub4ArrayArrayArray628[i][i_164_][i_165_].aClass15_1829 = class15;
		} else if (i_166_ == 1) {
			Class15 class15 = new Class15(i_177_, i_178_, i_179_, i_180_,
					i_168_, i_182_, i_169_ == i_170_ && i_169_ == i_171_
							&& i_169_ == i_172_);
			for (int i_184_ = i; i_184_ >= 0; i_184_--)
				if (aClass38_Sub4ArrayArrayArray628[i_184_][i_164_][i_165_] == null)
					aClass38_Sub4ArrayArrayArray628[i_184_][i_164_][i_165_] = new Class38_Sub4(
							i_184_, i_164_, i_165_);
			aClass38_Sub4ArrayArrayArray628[i][i_164_][i_165_].aClass15_1829 = class15;
		} else {
			Class1 class1 = new Class1(i_166_, i_167_, i_168_, i_164_, i_165_,
					i_169_, i_170_, i_171_, i_172_, i_173_, i_174_, i_175_,
					i_176_, i_177_, i_178_, i_179_, i_180_, i_181_, i_182_);
			for (int i_185_ = i; i_185_ >= 0; i_185_--)
				if (aClass38_Sub4ArrayArrayArray628[i_185_][i_164_][i_165_] == null)
					aClass38_Sub4ArrayArrayArray628[i_185_][i_164_][i_165_] = new Class38_Sub4(
							i_185_, i_164_, i_165_);
			aClass38_Sub4ArrayArrayArray628[i][i_164_][i_165_].aClass1_1799 = class1;
		}
	}

	static final void method248(int i, int i_186_, int i_187_, int i_188_,
			int i_189_, int i_190_, int i_191_, int i_192_) {
		Class5 class5 = new Class5();
		class5.anInt109 = i_187_ / 128;
		class5.anInt115 = i_188_ / 128;
		class5.anInt100 = i_189_ / 128;
		class5.anInt119 = i_190_ / 128;
		class5.anInt120 = i_186_;
		class5.anInt117 = i_187_;
		class5.anInt98 = i_188_;
		class5.anInt107 = i_189_;
		class5.anInt113 = i_190_;
		class5.anInt122 = i_191_;
		class5.anInt111 = i_192_;
		SceneGraph.aClass5ArrayArray629[i][SceneGraph.anIntArray658[i]++] = class5;
	}

	final boolean method249(int i, int i_193_, int i_194_, int i_195_,
			int i_196_, SceneModel class38_sub20_sub3, int i_197_,
			int i_198_, boolean bool) {
		if (class38_sub20_sub3 == null)
			return true;
		int i_199_ = i_193_ - i_196_;
		int i_200_ = i_194_ - i_196_;
		int i_201_ = i_193_ + i_196_;
		int i_202_ = i_194_ + i_196_;
		if (bool) {
			if (i_197_ > 640 && i_197_ < 1408)
				i_202_ += 128;
			if (i_197_ > 1152 && i_197_ < 1920)
				i_201_ += 128;
			if (i_197_ > 1664 || i_197_ < 384)
				i_200_ -= 128;
			if (i_197_ > 128 && i_197_ < 896)
				i_199_ -= 128;
		}
		i_199_ /= 128;
		i_200_ /= 128;
		i_201_ /= 128;
		i_202_ /= 128;
		return method232(i, i_199_, i_200_, i_201_ - i_199_ + 1, i_202_
				- i_200_ + 1, i_193_, i_194_, i_195_, class38_sub20_sub3,
				i_197_, true, i_198_, 0);
	}

	private final void method250(Class38_Sub4 class38_sub4, boolean bool) {
		SceneGraph.aClass13_657.method68(class38_sub4, (byte) 50);
		for (;;) {
			Class38_Sub4 class38_sub4_203_ = (Class38_Sub4) SceneGraph.aClass13_657
					.method69((byte) 89);
			if (class38_sub4_203_ == null)
				break;
			if (class38_sub4_203_.aBool1816) {
				int i = class38_sub4_203_.anInt1815;
				int i_204_ = class38_sub4_203_.anInt1831;
				int i_205_ = class38_sub4_203_.anInt1800;
				int i_206_ = class38_sub4_203_.anInt1814;
				Class38_Sub4[][] class38_sub4s = aClass38_Sub4ArrayArrayArray628[i_205_];
				if (class38_sub4_203_.aBool1812) {
					if (bool) {
						if (i_205_ > 0) {
							Class38_Sub4 class38_sub4_207_ = aClass38_Sub4ArrayArrayArray628[i_205_ - 1][i][i_204_];
							if (class38_sub4_207_ != null
									&& class38_sub4_207_.aBool1816)
								continue;
						}
						if (i <= SceneGraph.anInt652 && i > SceneGraph.anInt627) {
							Class38_Sub4 class38_sub4_208_ = class38_sub4s[i - 1][i_204_];
							if (class38_sub4_208_ != null
									&& class38_sub4_208_.aBool1816
									&& (class38_sub4_208_.aBool1812 || (class38_sub4_203_.anInt1813 & 0x1) == 0))
								continue;
						}
						if (i >= SceneGraph.anInt652
								&& i < SceneGraph.anInt632 - 1) {
							Class38_Sub4 class38_sub4_209_ = class38_sub4s[i + 1][i_204_];
							if (class38_sub4_209_ != null
									&& class38_sub4_209_.aBool1816
									&& (class38_sub4_209_.aBool1812 || (class38_sub4_203_.anInt1813 & 0x4) == 0))
								continue;
						}
						if (i_204_ <= SceneGraph.anInt626
								&& i_204_ > SceneGraph.anInt631) {
							Class38_Sub4 class38_sub4_210_ = class38_sub4s[i][i_204_ - 1];
							if (class38_sub4_210_ != null
									&& class38_sub4_210_.aBool1816
									&& (class38_sub4_210_.aBool1812 || (class38_sub4_203_.anInt1813 & 0x8) == 0))
								continue;
						}
						if (i_204_ >= SceneGraph.anInt626
								&& i_204_ < SceneGraph.anInt621 - 1) {
							Class38_Sub4 class38_sub4_211_ = class38_sub4s[i][i_204_ + 1];
							if (class38_sub4_211_ != null
									&& class38_sub4_211_.aBool1816
									&& (class38_sub4_211_.aBool1812 || (class38_sub4_203_.anInt1813 & 0x2) == 0))
								continue;
						}
					} else
						bool = true;
					class38_sub4_203_.aBool1812 = false;
					if (class38_sub4_203_.aClass38_Sub4_1818 != null) {
						Class38_Sub4 class38_sub4_212_ = class38_sub4_203_.aClass38_Sub4_1818;
						if (class38_sub4_212_.aClass15_1829 != null) {
							if (!method264(0, i, i_204_))
								method257(class38_sub4_212_.aClass15_1829, 0,
										SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, i, i_204_);
						} else if (class38_sub4_212_.aClass1_1799 != null
								&& !method264(0, i, i_204_))
							method244(class38_sub4_212_.aClass1_1799,
									SceneGraph.anInt638, SceneGraph.anInt649,
									SceneGraph.anInt655, SceneGraph.anInt650,
									i, i_204_);
						Class82 class82 = class38_sub4_212_.aClass82_1823;
						if (class82 != null)
							class82.aClass38_Sub20_Sub3_1627.method818(0,
									SceneGraph.anInt638, SceneGraph.anInt649,
									SceneGraph.anInt655, SceneGraph.anInt650,
									class82.anInt1628 - SceneGraph.anInt640,
									class82.anInt1636 - SceneGraph.anInt653,
									class82.anInt1637 - SceneGraph.anInt646,
									class82.anInt1640);
						for (int i_213_ = 0; i_213_ < class38_sub4_212_.anInt1828; i_213_++) {
							Class3 class3 = class38_sub4_212_.aClass3Array1809[i_213_];
							if (class3 != null)
								class3.aClass38_Sub20_Sub3_53.method818(
										class3.anInt56, SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, class3.anInt45
												- SceneGraph.anInt640,
										class3.anInt55 - SceneGraph.anInt653,
										class3.anInt48 - SceneGraph.anInt646,
										class3.anInt62);
						}
					}
					boolean bool_214_ = false;
					if (class38_sub4_203_.aClass15_1829 != null) {
						if (!method264(i_206_, i, i_204_)) {
							bool_214_ = true;
							if (class38_sub4_203_.aClass15_1829.anInt285 != 12345678
									|| SceneGraph.aBool630
									&& i_205_ <= SceneGraph.anInt648)
								method257(class38_sub4_203_.aClass15_1829,
										i_206_, SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, i, i_204_);
						}
					} else if (class38_sub4_203_.aClass1_1799 != null
							&& !method264(i_206_, i, i_204_)) {
						bool_214_ = true;
						method244(class38_sub4_203_.aClass1_1799,
								SceneGraph.anInt638, SceneGraph.anInt649,
								SceneGraph.anInt655, SceneGraph.anInt650, i,
								i_204_);
					}
					int i_215_ = 0;
					int i_216_ = 0;
					Class82 class82 = class38_sub4_203_.aClass82_1823;
					Class43 class43 = class38_sub4_203_.aClass43_1819;
					if (class82 != null || class43 != null) {
						if (SceneGraph.anInt652 == i)
							i_215_++;
						else if (SceneGraph.anInt652 < i)
							i_215_ += 2;
						if (SceneGraph.anInt626 == i_204_)
							i_215_ += 3;
						else if (SceneGraph.anInt626 > i_204_)
							i_215_ += 6;
						i_216_ = SceneGraph.anIntArray670[i_215_];
						class38_sub4_203_.anInt1803 = SceneGraph.anIntArray668[i_215_];
					}
					if (class82 != null) {
						if ((class82.anInt1632 & SceneGraph.anIntArray673[i_215_]) != 0) {
							if (class82.anInt1632 == 16) {
								class38_sub4_203_.anInt1806 = 3;
								class38_sub4_203_.anInt1804 = SceneGraph.anIntArray664[i_215_];
								class38_sub4_203_.anInt1807 = 3 - class38_sub4_203_.anInt1804;
							} else if (class82.anInt1632 == 32) {
								class38_sub4_203_.anInt1806 = 6;
								class38_sub4_203_.anInt1804 = SceneGraph.anIntArray663[i_215_];
								class38_sub4_203_.anInt1807 = 6 - class38_sub4_203_.anInt1804;
							} else if (class82.anInt1632 == 64) {
								class38_sub4_203_.anInt1806 = 12;
								class38_sub4_203_.anInt1804 = SceneGraph.anIntArray661[i_215_];
								class38_sub4_203_.anInt1807 = 12 - class38_sub4_203_.anInt1804;
							} else {
								class38_sub4_203_.anInt1806 = 9;
								class38_sub4_203_.anInt1804 = SceneGraph.anIntArray666[i_215_];
								class38_sub4_203_.anInt1807 = 9 - class38_sub4_203_.anInt1804;
							}
						} else
							class38_sub4_203_.anInt1806 = 0;
						if ((class82.anInt1632 & i_216_) != 0
								&& !method228(i_206_, i, i_204_,
										class82.anInt1632))
							class82.aClass38_Sub20_Sub3_1627.method818(0,
									SceneGraph.anInt638, SceneGraph.anInt649,
									SceneGraph.anInt655, SceneGraph.anInt650,
									class82.anInt1628 - SceneGraph.anInt640,
									class82.anInt1636 - SceneGraph.anInt653,
									class82.anInt1637 - SceneGraph.anInt646,
									class82.anInt1640);
						if ((class82.anInt1635 & i_216_) != 0
								&& !method228(i_206_, i, i_204_,
										class82.anInt1635))
							class82.aClass38_Sub20_Sub3_1630.method818(0,
									SceneGraph.anInt638, SceneGraph.anInt649,
									SceneGraph.anInt655, SceneGraph.anInt650,
									class82.anInt1628 - SceneGraph.anInt640,
									class82.anInt1636 - SceneGraph.anInt653,
									class82.anInt1637 - SceneGraph.anInt646,
									class82.anInt1640);
					}
					if (class43 != null
							&& !method240(i_206_, i, i_204_,
									class43.aClass38_Sub20_Sub3_981.height))
						if ((class43.anInt973 & i_216_) != 0)
							class43.aClass38_Sub20_Sub3_981.method818(0,
									SceneGraph.anInt638, SceneGraph.anInt649,
									SceneGraph.anInt655, SceneGraph.anInt650,
									class43.anInt987 - SceneGraph.anInt640
											+ class43.anInt972,
									class43.anInt984 - SceneGraph.anInt653,
									class43.anInt976 - SceneGraph.anInt646
											+ class43.anInt979,
									class43.anInt975);
						else if (class43.anInt973 == 256) {
							int i_217_ = class43.anInt987 - SceneGraph.anInt640;
							int i_218_ = class43.anInt984 - SceneGraph.anInt653;
							int i_219_ = class43.anInt976 - SceneGraph.anInt646;
							int i_220_ = class43.anInt978;
							int i_221_;
							if (i_220_ == 1 || i_220_ == 2)
								i_221_ = -i_217_;
							else
								i_221_ = i_217_;
							int i_222_;
							if (i_220_ == 2 || i_220_ == 3)
								i_222_ = -i_219_;
							else
								i_222_ = i_219_;
							if (i_222_ < i_221_)
								class43.aClass38_Sub20_Sub3_981.method818(0,
										SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, i_217_
												+ class43.anInt972, i_218_,
										i_219_ + class43.anInt979,
										class43.anInt975);
							else if (class43.aClass38_Sub20_Sub3_967 != null)
								class43.aClass38_Sub20_Sub3_967.method818(0,
										SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, i_217_, i_218_,
										i_219_, class43.anInt975);
						}
					if (bool_214_) {
						Class49 class49 = class38_sub4_203_.aClass49_1805;
						if (class49 != null)
							class49.aClass38_Sub20_Sub3_1101.method818(0,
									SceneGraph.anInt638, SceneGraph.anInt649,
									SceneGraph.anInt655, SceneGraph.anInt650,
									class49.anInt1098 - SceneGraph.anInt640,
									class49.anInt1092 - SceneGraph.anInt653,
									class49.anInt1087 - SceneGraph.anInt646,
									class49.anInt1097);
						Class28 class28 = class38_sub4_203_.aClass28_1824;
						if (class28 != null && class28.anInt687 == 0) {
							if (class28.aClass38_Sub20_Sub3_690 != null)
								class28.aClass38_Sub20_Sub3_690.method818(0,
										SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, class28.anInt681
												- SceneGraph.anInt640,
										class28.anInt676 - SceneGraph.anInt653,
										class28.anInt682 - SceneGraph.anInt646,
										class28.anInt694);
							if (class28.aClass38_Sub20_Sub3_685 != null)
								class28.aClass38_Sub20_Sub3_685.method818(0,
										SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, class28.anInt681
												- SceneGraph.anInt640,
										class28.anInt676 - SceneGraph.anInt653,
										class28.anInt682 - SceneGraph.anInt646,
										class28.anInt694);
							if (class28.aClass38_Sub20_Sub3_688 != null)
								class28.aClass38_Sub20_Sub3_688.method818(0,
										SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, class28.anInt681
												- SceneGraph.anInt640,
										class28.anInt676 - SceneGraph.anInt653,
										class28.anInt682 - SceneGraph.anInt646,
										class28.anInt694);
						}
					}
					int i_223_ = class38_sub4_203_.anInt1813;
					if (i_223_ != 0) {
						if (i < SceneGraph.anInt652 && (i_223_ & 0x4) != 0) {
							Class38_Sub4 class38_sub4_224_ = class38_sub4s[i + 1][i_204_];
							if (class38_sub4_224_ != null
									&& class38_sub4_224_.aBool1816)
								SceneGraph.aClass13_657.method68(
										class38_sub4_224_, (byte) 91);
						}
						if (i_204_ < SceneGraph.anInt626 && (i_223_ & 0x2) != 0) {
							Class38_Sub4 class38_sub4_225_ = class38_sub4s[i][i_204_ + 1];
							if (class38_sub4_225_ != null
									&& class38_sub4_225_.aBool1816)
								SceneGraph.aClass13_657.method68(
										class38_sub4_225_, (byte) 38);
						}
						if (i > SceneGraph.anInt652 && (i_223_ & 0x1) != 0) {
							Class38_Sub4 class38_sub4_226_ = class38_sub4s[i - 1][i_204_];
							if (class38_sub4_226_ != null
									&& class38_sub4_226_.aBool1816)
								SceneGraph.aClass13_657.method68(
										class38_sub4_226_, (byte) 117);
						}
						if (i_204_ > SceneGraph.anInt626 && (i_223_ & 0x8) != 0) {
							Class38_Sub4 class38_sub4_227_ = class38_sub4s[i][i_204_ - 1];
							if (class38_sub4_227_ != null
									&& class38_sub4_227_.aBool1816)
								SceneGraph.aClass13_657.method68(
										class38_sub4_227_, (byte) 58);
						}
					}
				}
				if (class38_sub4_203_.anInt1806 != 0) {
					boolean bool_228_ = true;
					for (int i_229_ = 0; i_229_ < class38_sub4_203_.anInt1828; i_229_++)
						if (class38_sub4_203_.aClass3Array1809[i_229_].anInt51 != SceneGraph.anInt639
								&& (class38_sub4_203_.anIntArray1822[i_229_] & class38_sub4_203_.anInt1806) == class38_sub4_203_.anInt1804) {
							bool_228_ = false;
							break;
						}
					if (bool_228_) {
						Class82 class82 = class38_sub4_203_.aClass82_1823;
						if (!method228(i_206_, i, i_204_, class82.anInt1632))
							class82.aClass38_Sub20_Sub3_1627.method818(0,
									SceneGraph.anInt638, SceneGraph.anInt649,
									SceneGraph.anInt655, SceneGraph.anInt650,
									class82.anInt1628 - SceneGraph.anInt640,
									class82.anInt1636 - SceneGraph.anInt653,
									class82.anInt1637 - SceneGraph.anInt646,
									class82.anInt1640);
						class38_sub4_203_.anInt1806 = 0;
					}
				}
				if (class38_sub4_203_.aBool1821)
					try {
						int i_230_ = class38_sub4_203_.anInt1828;
						class38_sub4_203_.aBool1821 = false;
						int i_231_ = 0;
						while_5_: for (int i_232_ = 0; i_232_ < i_230_; i_232_++) {
							Class3 class3 = class38_sub4_203_.aClass3Array1809[i_232_];
							if (class3.anInt51 != SceneGraph.anInt639) {
								for (int i_233_ = class3.anInt49; i_233_ <= class3.anInt58; i_233_++)
									for (int i_234_ = class3.anInt46; i_234_ <= class3.anInt59; i_234_++) {
										Class38_Sub4 class38_sub4_235_ = class38_sub4s[i_233_][i_234_];
										if (class38_sub4_235_.aBool1812) {
											class38_sub4_203_.aBool1821 = true;
											continue while_5_;
										}
										if (class38_sub4_235_.anInt1806 != 0) {
											int i_236_ = 0;
											if (i_233_ > class3.anInt49)
												i_236_++;
											if (i_233_ < class3.anInt58)
												i_236_ += 4;
											if (i_234_ > class3.anInt46)
												i_236_ += 8;
											if (i_234_ < class3.anInt59)
												i_236_ += 2;
											if ((i_236_ & class38_sub4_235_.anInt1806) == class38_sub4_203_.anInt1807) {
												class38_sub4_203_.aBool1821 = true;
												continue while_5_;
											}
										}
									}
								SceneGraph.aClass3Array642[i_231_++] = class3;
								int i_237_ = SceneGraph.anInt652
										- class3.anInt49;
								int i_238_ = class3.anInt58
										- SceneGraph.anInt652;
								if (i_238_ > i_237_)
									i_237_ = i_238_;
								int i_239_ = SceneGraph.anInt626
										- class3.anInt46;
								int i_240_ = class3.anInt59
										- SceneGraph.anInt626;
								if (i_240_ > i_239_)
									class3.anInt57 = i_237_ + i_240_;
								else
									class3.anInt57 = i_237_ + i_239_;
							}
						}
						while (i_231_ > 0) {
							int i_241_ = -50;
							int i_242_ = -1;
							for (int i_243_ = 0; i_243_ < i_231_; i_243_++) {
								Class3 class3 = SceneGraph.aClass3Array642[i_243_];
								if (class3.anInt51 != SceneGraph.anInt639)
									if (class3.anInt57 > i_241_) {
										i_241_ = class3.anInt57;
										i_242_ = i_243_;
									} else if (class3.anInt57 == i_241_) {
										int i_244_ = class3.anInt45
												- SceneGraph.anInt640;
										int i_245_ = class3.anInt48
												- SceneGraph.anInt646;
										int i_246_ = SceneGraph.aClass3Array642[i_242_].anInt45
												- SceneGraph.anInt640;
										int i_247_ = SceneGraph.aClass3Array642[i_242_].anInt48
												- SceneGraph.anInt646;
										if (i_244_ * i_244_ + i_245_ * i_245_ > i_246_
												* i_246_ + i_247_ * i_247_)
											i_242_ = i_243_;
									}
							}
							if (i_242_ == -1)
								break;
							Class3 class3 = SceneGraph.aClass3Array642[i_242_];
							class3.anInt51 = SceneGraph.anInt639;
							if (!method235(i_206_, class3.anInt49,
									class3.anInt58, class3.anInt46,
									class3.anInt59,
									class3.aClass38_Sub20_Sub3_53.height))
								class3.aClass38_Sub20_Sub3_53.method818(
										class3.anInt56, SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, class3.anInt45
												- SceneGraph.anInt640,
										class3.anInt55 - SceneGraph.anInt653,
										class3.anInt48 - SceneGraph.anInt646,
										class3.anInt62);
							for (int i_248_ = class3.anInt49; i_248_ <= class3.anInt58; i_248_++)
								for (int i_249_ = class3.anInt46; i_249_ <= class3.anInt59; i_249_++) {
									Class38_Sub4 class38_sub4_250_ = class38_sub4s[i_248_][i_249_];
									if (class38_sub4_250_.anInt1806 != 0)
										SceneGraph.aClass13_657.method68(
												class38_sub4_250_, (byte) 39);
									else if ((i_248_ != i || i_249_ != i_204_)
											&& class38_sub4_250_.aBool1816)
										SceneGraph.aClass13_657.method68(
												class38_sub4_250_, (byte) 78);
								}
						}
						if (class38_sub4_203_.aBool1821)
							continue;
					} catch (Exception exception) {
						class38_sub4_203_.aBool1821 = false;
					}
				if (class38_sub4_203_.aBool1816)
					if (class38_sub4_203_.anInt1806 == 0) {
						if (i <= SceneGraph.anInt652 && i > SceneGraph.anInt627) {
							Class38_Sub4 class38_sub4_251_ = class38_sub4s[i - 1][i_204_];
							if (class38_sub4_251_ != null
									&& class38_sub4_251_.aBool1816)
								continue;
						}
						if (i >= SceneGraph.anInt652
								&& i < SceneGraph.anInt632 - 1) {
							Class38_Sub4 class38_sub4_252_ = class38_sub4s[i + 1][i_204_];
							if (class38_sub4_252_ != null
									&& class38_sub4_252_.aBool1816)
								continue;
						}
						if (i_204_ <= SceneGraph.anInt626
								&& i_204_ > SceneGraph.anInt631) {
							Class38_Sub4 class38_sub4_253_ = class38_sub4s[i][i_204_ - 1];
							if (class38_sub4_253_ != null
									&& class38_sub4_253_.aBool1816)
								continue;
						}
						if (i_204_ >= SceneGraph.anInt626
								&& i_204_ < SceneGraph.anInt621 - 1) {
							Class38_Sub4 class38_sub4_254_ = class38_sub4s[i][i_204_ + 1];
							if (class38_sub4_254_ != null
									&& class38_sub4_254_.aBool1816)
								continue;
						}
						class38_sub4_203_.aBool1816 = false;
						SceneGraph.anInt624--;
						Class28 class28 = class38_sub4_203_.aClass28_1824;
						if (class28 != null && class28.anInt687 != 0) {
							if (class28.aClass38_Sub20_Sub3_690 != null)
								class28.aClass38_Sub20_Sub3_690.method818(0,
										SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, class28.anInt681
												- SceneGraph.anInt640,
										class28.anInt676 - SceneGraph.anInt653
												- class28.anInt687,
										class28.anInt682 - SceneGraph.anInt646,
										class28.anInt694);
							if (class28.aClass38_Sub20_Sub3_685 != null)
								class28.aClass38_Sub20_Sub3_685.method818(0,
										SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, class28.anInt681
												- SceneGraph.anInt640,
										class28.anInt676 - SceneGraph.anInt653
												- class28.anInt687,
										class28.anInt682 - SceneGraph.anInt646,
										class28.anInt694);
							if (class28.aClass38_Sub20_Sub3_688 != null)
								class28.aClass38_Sub20_Sub3_688.method818(0,
										SceneGraph.anInt638,
										SceneGraph.anInt649,
										SceneGraph.anInt655,
										SceneGraph.anInt650, class28.anInt681
												- SceneGraph.anInt640,
										class28.anInt676 - SceneGraph.anInt653
												- class28.anInt687,
										class28.anInt682 - SceneGraph.anInt646,
										class28.anInt694);
						}
						if (class38_sub4_203_.anInt1803 != 0) {
							Class43 class43 = class38_sub4_203_.aClass43_1819;
							if (class43 != null
									&& !method240(
											i_206_,
											i,
											i_204_,
											class43.aClass38_Sub20_Sub3_981.height))
								if ((class43.anInt973 & class38_sub4_203_.anInt1803) != 0)
									class43.aClass38_Sub20_Sub3_981.method818(
											0, SceneGraph.anInt638,
											SceneGraph.anInt649,
											SceneGraph.anInt655,
											SceneGraph.anInt650,
											class43.anInt987
													- SceneGraph.anInt640
													+ class43.anInt972,
											class43.anInt984
													- SceneGraph.anInt653,
											class43.anInt976
													- SceneGraph.anInt646
													+ class43.anInt979,
											class43.anInt975);
								else if (class43.anInt973 == 256) {
									int i_255_ = class43.anInt987
											- SceneGraph.anInt640;
									int i_256_ = class43.anInt984
											- SceneGraph.anInt653;
									int i_257_ = class43.anInt976
											- SceneGraph.anInt646;
									int i_258_ = class43.anInt978;
									int i_259_;
									if (i_258_ == 1 || i_258_ == 2)
										i_259_ = -i_255_;
									else
										i_259_ = i_255_;
									int i_260_;
									if (i_258_ == 2 || i_258_ == 3)
										i_260_ = -i_257_;
									else
										i_260_ = i_257_;
									if (i_260_ >= i_259_)
										class43.aClass38_Sub20_Sub3_981
												.method818(
														0,
														SceneGraph.anInt638,
														SceneGraph.anInt649,
														SceneGraph.anInt655,
														SceneGraph.anInt650,
														i_255_
																+ class43.anInt972,
														i_256_,
														i_257_
																+ class43.anInt979,
														class43.anInt975);
									else if (class43.aClass38_Sub20_Sub3_967 != null)
										class43.aClass38_Sub20_Sub3_967
												.method818(0,
														SceneGraph.anInt638,
														SceneGraph.anInt649,
														SceneGraph.anInt655,
														SceneGraph.anInt650,
														i_255_, i_256_, i_257_,
														class43.anInt975);
								}
							Class82 class82 = class38_sub4_203_.aClass82_1823;
							if (class82 != null) {
								if ((class82.anInt1635 & class38_sub4_203_.anInt1803) != 0
										&& !method228(i_206_, i, i_204_,
												class82.anInt1635))
									class82.aClass38_Sub20_Sub3_1630.method818(
											0, SceneGraph.anInt638,
											SceneGraph.anInt649,
											SceneGraph.anInt655,
											SceneGraph.anInt650,
											class82.anInt1628
													- SceneGraph.anInt640,
											class82.anInt1636
													- SceneGraph.anInt653,
											class82.anInt1637
													- SceneGraph.anInt646,
											class82.anInt1640);
								if ((class82.anInt1632 & class38_sub4_203_.anInt1803) != 0
										&& !method228(i_206_, i, i_204_,
												class82.anInt1632))
									class82.aClass38_Sub20_Sub3_1627.method818(
											0, SceneGraph.anInt638,
											SceneGraph.anInt649,
											SceneGraph.anInt655,
											SceneGraph.anInt650,
											class82.anInt1628
													- SceneGraph.anInt640,
											class82.anInt1636
													- SceneGraph.anInt653,
											class82.anInt1637
													- SceneGraph.anInt646,
											class82.anInt1640);
							}
						}
						if (i_205_ < anInt620 - 1) {
							Class38_Sub4 class38_sub4_261_ = aClass38_Sub4ArrayArrayArray628[i_205_ + 1][i][i_204_];
							if (class38_sub4_261_ != null
									&& class38_sub4_261_.aBool1816)
								SceneGraph.aClass13_657.method68(
										class38_sub4_261_, (byte) 60);
						}
						if (i < SceneGraph.anInt652) {
							Class38_Sub4 class38_sub4_262_ = class38_sub4s[i + 1][i_204_];
							if (class38_sub4_262_ != null
									&& class38_sub4_262_.aBool1816)
								SceneGraph.aClass13_657.method68(
										class38_sub4_262_, (byte) 88);
						}
						if (i_204_ < SceneGraph.anInt626) {
							Class38_Sub4 class38_sub4_263_ = class38_sub4s[i][i_204_ + 1];
							if (class38_sub4_263_ != null
									&& class38_sub4_263_.aBool1816)
								SceneGraph.aClass13_657.method68(
										class38_sub4_263_, (byte) 43);
						}
						if (i > SceneGraph.anInt652) {
							Class38_Sub4 class38_sub4_264_ = class38_sub4s[i - 1][i_204_];
							if (class38_sub4_264_ != null
									&& class38_sub4_264_.aBool1816)
								SceneGraph.aClass13_657.method68(
										class38_sub4_264_, (byte) 82);
						}
						if (i_204_ > SceneGraph.anInt626) {
							Class38_Sub4 class38_sub4_265_ = class38_sub4s[i][i_204_ - 1];
							if (class38_sub4_265_ != null
									&& class38_sub4_265_.aBool1816)
								SceneGraph.aClass13_657.method68(
										class38_sub4_265_, (byte) 43);
						}
					}
			}
		}
	}

	final void method251(int i, int i_266_, int i_267_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_266_][i_267_];
		if (class38_sub4 != null)
			class38_sub4.aClass82_1823 = null;
	}

	final void method252(int[] is, int i, int i_268_, int i_269_, int i_270_,
			int i_271_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i_269_][i_270_][i_271_];
		if (class38_sub4 != null) {
			Class15 class15 = class38_sub4.aClass15_1829;
			if (class15 != null) {
				int i_272_ = class15.anInt297;
				if (i_272_ != 0)
					for (int i_273_ = 0; i_273_ < 4; i_273_++) {
						is[i] = i_272_;
						is[i + 1] = i_272_;
						is[i + 2] = i_272_;
						is[i + 3] = i_272_;
						i += i_268_;
					}
			} else {
				Class1 class1 = class38_sub4.aClass1_1799;
				if (class1 != null) {
					int i_274_ = class1.anInt13;
					int i_275_ = class1.anInt1;
					int i_276_ = class1.anInt2;
					int i_277_ = class1.anInt18;
					int[] is_278_ = anIntArrayArray667[i_274_];
					int[] is_279_ = anIntArrayArray672[i_275_];
					int i_280_ = 0;
					if (i_276_ != 0)
						for (int i_281_ = 0; i_281_ < 4; i_281_++) {
							is[i] = is_278_[is_279_[i_280_++]] == 0 ? i_276_
									: i_277_;
							is[i + 1] = is_278_[is_279_[i_280_++]] == 0 ? i_276_
									: i_277_;
							is[i + 2] = is_278_[is_279_[i_280_++]] == 0 ? i_276_
									: i_277_;
							is[i + 3] = is_278_[is_279_[i_280_++]] == 0 ? i_276_
									: i_277_;
							i += i_268_;
						}
					else
						for (int i_282_ = 0; i_282_ < 4; i_282_++) {
							if (is_278_[is_279_[i_280_++]] != 0)
								is[i] = i_277_;
							if (is_278_[is_279_[i_280_++]] != 0)
								is[i + 1] = i_277_;
							if (is_278_[is_279_[i_280_++]] != 0)
								is[i + 2] = i_277_;
							if (is_278_[is_279_[i_280_++]] != 0)
								is[i + 3] = i_277_;
							i += i_268_;
						}
				}
			}
		}
	}

	final Class43 method253(int i, int i_283_, int i_284_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_283_][i_284_];
		if (class38_sub4 == null)
			return null;
		return class38_sub4.aClass43_1819;
	}

	final boolean method254(int i, int i_285_, int i_286_, int i_287_,
			int i_288_, int i_289_, SceneModel class38_sub20_sub3,
			int i_290_, int i_291_, int i_292_) {
		if (class38_sub20_sub3 == null)
			return true;
		int i_293_ = i_285_ * 128 + i_288_ * 64;
		int i_294_ = i_286_ * 128 + i_289_ * 64;
		return method232(i, i_285_, i_286_, i_288_, i_289_, i_293_, i_294_,
				i_287_, class38_sub20_sub3, i_290_, false, i_291_, i_292_);
	}

	final void method255(int i, int i_295_, int i_296_, int i_297_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_295_][i_296_];
		if (class38_sub4 != null) {
			Class43 class43 = class38_sub4.aClass43_1819;
			if (class43 != null) {
				class43.anInt972 = class43.anInt972 * i_297_ / 16;
				class43.anInt979 = class43.anInt979 * i_297_ / 16;
			}
		}
	}

	final int method256(int i, int i_298_, int i_299_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_298_][i_299_];
		if (class38_sub4 == null || class38_sub4.aClass82_1823 == null)
			return 0;
		return class38_sub4.aClass82_1823.anInt1640;
	}

	private final void method257(Class15 class15, int i, int i_300_,
			int i_301_, int i_302_, int i_303_, int i_304_, int i_305_) {
		int i_307_;
		int i_306_ = i_307_ = (i_304_ << 7) - SceneGraph.anInt640;
		int i_309_;
		int i_308_ = i_309_ = (i_305_ << 7) - SceneGraph.anInt646;
		int i_311_;
		int i_310_ = i_311_ = i_306_ + 128;
		int i_313_;
		int i_312_ = i_313_ = i_308_ + 128;
		int i_314_ = anIntArrayArrayArray634[i][i_304_][i_305_]
				- SceneGraph.anInt653;
		int i_315_ = anIntArrayArrayArray634[i][i_304_ + 1][i_305_]
				- SceneGraph.anInt653;
		int i_316_ = anIntArrayArrayArray634[i][i_304_ + 1][i_305_ + 1]
				- SceneGraph.anInt653;
		int i_317_ = anIntArrayArrayArray634[i][i_304_][i_305_ + 1]
				- SceneGraph.anInt653;
		int i_318_ = i_308_ * i_302_ + i_306_ * i_303_ >> 16;
		i_308_ = i_308_ * i_303_ - i_306_ * i_302_ >> 16;
		i_306_ = i_318_;
		i_318_ = i_314_ * i_301_ - i_308_ * i_300_ >> 16;
		i_308_ = i_314_ * i_300_ + i_308_ * i_301_ >> 16;
		i_314_ = i_318_;
		if (i_308_ >= 50) {
			i_318_ = i_309_ * i_302_ + i_310_ * i_303_ >> 16;
			i_309_ = i_309_ * i_303_ - i_310_ * i_302_ >> 16;
			i_310_ = i_318_;
			i_318_ = i_315_ * i_301_ - i_309_ * i_300_ >> 16;
			i_309_ = i_315_ * i_300_ + i_309_ * i_301_ >> 16;
			i_315_ = i_318_;
			if (i_309_ >= 50) {
				i_318_ = i_312_ * i_302_ + i_311_ * i_303_ >> 16;
				i_312_ = i_312_ * i_303_ - i_311_ * i_302_ >> 16;
				i_311_ = i_318_;
				i_318_ = i_316_ * i_301_ - i_312_ * i_300_ >> 16;
				i_312_ = i_316_ * i_300_ + i_312_ * i_301_ >> 16;
				i_316_ = i_318_;
				if (i_312_ >= 50) {
					i_318_ = i_313_ * i_302_ + i_307_ * i_303_ >> 16;
					i_313_ = i_313_ * i_303_ - i_307_ * i_302_ >> 16;
					i_307_ = i_318_;
					i_318_ = i_317_ * i_301_ - i_313_ * i_300_ >> 16;
					i_313_ = i_317_ * i_300_ + i_313_ * i_301_ >> 16;
					i_317_ = i_318_;
					if (i_313_ >= 50) {
						int i_319_ = Class38_Sub20_Sub9_Sub4.anInt3521
								+ (i_306_ << 9) / i_308_;
						int i_320_ = Class38_Sub20_Sub9_Sub4.anInt3536
								+ (i_314_ << 9) / i_308_;
						int i_321_ = Class38_Sub20_Sub9_Sub4.anInt3521
								+ (i_310_ << 9) / i_309_;
						int i_322_ = Class38_Sub20_Sub9_Sub4.anInt3536
								+ (i_315_ << 9) / i_309_;
						int i_323_ = Class38_Sub20_Sub9_Sub4.anInt3521
								+ (i_311_ << 9) / i_312_;
						int i_324_ = Class38_Sub20_Sub9_Sub4.anInt3536
								+ (i_316_ << 9) / i_312_;
						int i_325_ = Class38_Sub20_Sub9_Sub4.anInt3521
								+ (i_307_ << 9) / i_313_;
						int i_326_ = Class38_Sub20_Sub9_Sub4.anInt3536
								+ (i_317_ << 9) / i_313_;
						Class38_Sub20_Sub9_Sub4.anInt3535 = 0;
						if ((i_323_ - i_325_) * (i_322_ - i_326_)
								- (i_324_ - i_326_) * (i_321_ - i_325_) > 0) {
							Class38_Sub20_Sub9_Sub4.aBool3524 = false;
							if (i_323_ < 0
									|| i_325_ < 0
									|| i_321_ < 0
									|| i_323_ > Class38_Sub20_Sub9_Sub4.anInt3537
									|| i_325_ > Class38_Sub20_Sub9_Sub4.anInt3537
									|| i_321_ > Class38_Sub20_Sub9_Sub4.anInt3537)
								Class38_Sub20_Sub9_Sub4.aBool3524 = true;
							if (SceneGraph.aBool630
									&& method269(SceneGraph.anInt643,
											SceneGraph.anInt645, i_324_,
											i_326_, i_322_, i_323_, i_325_,
											i_321_)) {
								SceneGraph.mouseOverX = i_304_;
								SceneGraph.mouseOverY = i_305_;
							}
							if (class15.anInt295 == -1) {
								if (class15.anInt285 != 12345678)
									Class38_Sub20_Sub9_Sub4.method1188(i_324_,
											i_326_, i_322_, i_323_, i_325_,
											i_321_, class15.anInt285,
											class15.anInt279, class15.anInt273);
							} else if (!SceneGraph.aBool651) {
								if (class15.aBool278)
									Class38_Sub20_Sub9_Sub4.method1186(i_324_,
											i_326_, i_322_, i_323_, i_325_,
											i_321_, class15.anInt285,
											class15.anInt279, class15.anInt273,
											i_306_, i_310_, i_307_, i_314_,
											i_315_, i_317_, i_308_, i_309_,
											i_313_, class15.anInt295);
								else
									Class38_Sub20_Sub9_Sub4.method1186(i_324_,
											i_326_, i_322_, i_323_, i_325_,
											i_321_, class15.anInt285,
											class15.anInt279, class15.anInt273,
											i_311_, i_307_, i_310_, i_316_,
											i_317_, i_315_, i_312_, i_313_,
											i_309_, class15.anInt295);
							} else {
								int i_327_ = Class38_Sub20_Sub9_Sub4.anInterface3_3533
										.method7(class15.anInt295, false);
								Class38_Sub20_Sub9_Sub4.method1188(i_324_,
										i_326_, i_322_, i_323_, i_325_, i_321_,
										SceneGraph.method258(i_327_,
												class15.anInt285), SceneGraph
												.method258(i_327_,
														class15.anInt279),
										SceneGraph.method258(i_327_,
												class15.anInt273));
							}
						}
						if ((i_319_ - i_321_) * (i_326_ - i_322_)
								- (i_320_ - i_322_) * (i_325_ - i_321_) > 0) {
							Class38_Sub20_Sub9_Sub4.aBool3524 = false;
							if (i_319_ < 0
									|| i_321_ < 0
									|| i_325_ < 0
									|| i_319_ > Class38_Sub20_Sub9_Sub4.anInt3537
									|| i_321_ > Class38_Sub20_Sub9_Sub4.anInt3537
									|| i_325_ > Class38_Sub20_Sub9_Sub4.anInt3537)
								Class38_Sub20_Sub9_Sub4.aBool3524 = true;
							if (SceneGraph.aBool630
									&& method269(SceneGraph.anInt643,
											SceneGraph.anInt645, i_320_,
											i_322_, i_326_, i_319_, i_321_,
											i_325_)) {
								SceneGraph.mouseOverX = i_304_;
								SceneGraph.mouseOverY = i_305_;
							}
							if (class15.anInt295 == -1) {
								if (class15.anInt294 != 12345678)
									Class38_Sub20_Sub9_Sub4.method1188(i_320_,
											i_322_, i_326_, i_319_, i_321_,
											i_325_, class15.anInt294,
											class15.anInt273, class15.anInt279);
							} else if (!SceneGraph.aBool651)
								Class38_Sub20_Sub9_Sub4.method1186(i_320_,
										i_322_, i_326_, i_319_, i_321_, i_325_,
										class15.anInt294, class15.anInt273,
										class15.anInt279, i_306_, i_310_,
										i_307_, i_314_, i_315_, i_317_, i_308_,
										i_309_, i_313_, class15.anInt295);
							else {
								int i_328_ = Class38_Sub20_Sub9_Sub4.anInterface3_3533
										.method7(class15.anInt295, false);
								Class38_Sub20_Sub9_Sub4.method1188(i_320_,
										i_322_, i_326_, i_319_, i_321_, i_325_,
										SceneGraph.method258(i_328_,
												class15.anInt294), SceneGraph
												.method258(i_328_,
														class15.anInt273),
										SceneGraph.method258(i_328_,
												class15.anInt279));
							}
						}
					}
				}
			}
		}
	}

	private static final int method258(int i, int i_329_) {
		i_329_ = i_329_ * (i & 0x7f) >> 7;
		if (i_329_ < 2)
			i_329_ = 2;
		else if (i_329_ > 126)
			i_329_ = 126;
		return (i & 0xff80) + i_329_;
	}

	private final void method259() {
		int i = SceneGraph.anIntArray658[SceneGraph.anInt647];
		Class5[] class5s = SceneGraph.aClass5ArrayArray629[SceneGraph.anInt647];
		SceneGraph.anInt635 = 0;
		for (int i_330_ = 0; i_330_ < i; i_330_++) {
			Class5 class5 = class5s[i_330_];
			if (class5.anInt120 == 1) {
				int i_331_ = class5.anInt109 - SceneGraph.anInt652 + 25;
				if (i_331_ >= 0 && i_331_ <= 50) {
					int i_332_ = class5.anInt100 - SceneGraph.anInt626 + 25;
					if (i_332_ < 0)
						i_332_ = 0;
					int i_333_ = class5.anInt119 - SceneGraph.anInt626 + 25;
					if (i_333_ > 50)
						i_333_ = 50;
					boolean bool = false;
					while (i_332_ <= i_333_)
						if (SceneGraph.aBoolArrayArray671[i_331_][i_332_++]) {
							bool = true;
							break;
						}
					if (bool) {
						int i_334_ = SceneGraph.anInt640 - class5.anInt117;
						if (i_334_ > 32)
							class5.anInt101 = 1;
						else {
							if (i_334_ >= -32)
								continue;
							class5.anInt101 = 2;
							i_334_ = -i_334_;
						}
						class5.anInt121 = (class5.anInt107
								- SceneGraph.anInt646 << 8)
								/ i_334_;
						class5.anInt105 = (class5.anInt113
								- SceneGraph.anInt646 << 8)
								/ i_334_;
						class5.anInt102 = (class5.anInt122
								- SceneGraph.anInt653 << 8)
								/ i_334_;
						class5.anInt110 = (class5.anInt111
								- SceneGraph.anInt653 << 8)
								/ i_334_;
						SceneGraph.aClass5Array654[SceneGraph.anInt635++] = class5;
					}
				}
			} else if (class5.anInt120 == 2) {
				int i_335_ = class5.anInt100 - SceneGraph.anInt626 + 25;
				if (i_335_ >= 0 && i_335_ <= 50) {
					int i_336_ = class5.anInt109 - SceneGraph.anInt652 + 25;
					if (i_336_ < 0)
						i_336_ = 0;
					int i_337_ = class5.anInt115 - SceneGraph.anInt652 + 25;
					if (i_337_ > 50)
						i_337_ = 50;
					boolean bool = false;
					while (i_336_ <= i_337_)
						if (SceneGraph.aBoolArrayArray671[i_336_++][i_335_]) {
							bool = true;
							break;
						}
					if (bool) {
						int i_338_ = SceneGraph.anInt646 - class5.anInt107;
						if (i_338_ > 32)
							class5.anInt101 = 3;
						else {
							if (i_338_ >= -32)
								continue;
							class5.anInt101 = 4;
							i_338_ = -i_338_;
						}
						class5.anInt112 = (class5.anInt117
								- SceneGraph.anInt640 << 8)
								/ i_338_;
						class5.anInt103 = (class5.anInt98 - SceneGraph.anInt640 << 8)
								/ i_338_;
						class5.anInt102 = (class5.anInt122
								- SceneGraph.anInt653 << 8)
								/ i_338_;
						class5.anInt110 = (class5.anInt111
								- SceneGraph.anInt653 << 8)
								/ i_338_;
						SceneGraph.aClass5Array654[SceneGraph.anInt635++] = class5;
					}
				}
			} else if (class5.anInt120 == 4) {
				int i_339_ = class5.anInt122 - SceneGraph.anInt653;
				if (i_339_ > 128) {
					int i_340_ = class5.anInt100 - SceneGraph.anInt626 + 25;
					if (i_340_ < 0)
						i_340_ = 0;
					int i_341_ = class5.anInt119 - SceneGraph.anInt626 + 25;
					if (i_341_ > 50)
						i_341_ = 50;
					if (i_340_ <= i_341_) {
						int i_342_ = class5.anInt109 - SceneGraph.anInt652 + 25;
						if (i_342_ < 0)
							i_342_ = 0;
						int i_343_ = class5.anInt115 - SceneGraph.anInt652 + 25;
						if (i_343_ > 50)
							i_343_ = 50;
						boolean bool = false;
						while_6_: for (int i_344_ = i_342_; i_344_ <= i_343_; i_344_++)
							for (int i_345_ = i_340_; i_345_ <= i_341_; i_345_++)
								if (SceneGraph.aBoolArrayArray671[i_344_][i_345_]) {
									bool = true;
									break while_6_;
								}
						if (bool) {
							class5.anInt101 = 5;
							class5.anInt112 = (class5.anInt117
									- SceneGraph.anInt640 << 8)
									/ i_339_;
							class5.anInt103 = (class5.anInt98
									- SceneGraph.anInt640 << 8)
									/ i_339_;
							class5.anInt121 = (class5.anInt107
									- SceneGraph.anInt646 << 8)
									/ i_339_;
							class5.anInt105 = (class5.anInt113
									- SceneGraph.anInt646 << 8)
									/ i_339_;
							SceneGraph.aClass5Array654[SceneGraph.anInt635++] = class5;
						}
					}
				}
			}
		}
	}

	final void method260(int i, int i_346_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[0][i][i_346_];
		for (int i_347_ = 0; i_347_ < 3; i_347_++) {
			Class38_Sub4 class38_sub4_348_ = aClass38_Sub4ArrayArrayArray628[i_347_][i][i_346_] = aClass38_Sub4ArrayArrayArray628[i_347_ + 1][i][i_346_];
			if (class38_sub4_348_ != null) {
				class38_sub4_348_.anInt1800--;
				for (int i_349_ = 0; i_349_ < class38_sub4_348_.anInt1828; i_349_++) {
					Class3 class3 = class38_sub4_348_.aClass3Array1809[i_349_];
					if ((class3.anInt62 >> 29 & 0x3) == 2
							&& class3.anInt49 == i && class3.anInt46 == i_346_)
						class3.anInt60--;
				}
			}
		}
		if (aClass38_Sub4ArrayArrayArray628[0][i][i_346_] == null)
			aClass38_Sub4ArrayArrayArray628[0][i][i_346_] = new Class38_Sub4(0,
					i, i_346_);
		aClass38_Sub4ArrayArrayArray628[0][i][i_346_].aClass38_Sub4_1818 = class38_sub4;
		aClass38_Sub4ArrayArrayArray628[3][i][i_346_] = null;
	}

	final void method261(int i, int i_350_, int i_351_, int i_352_,
			SceneModel class38_sub20_sub3,
			SceneModel class38_sub20_sub3_353_, int i_354_, int i_355_,
			int i_356_, int i_357_, int i_358_, int i_359_) {
		if (class38_sub20_sub3 != null) {
			Class43 class43 = new Class43();
			class43.anInt975 = i_358_;
			class43.anInt970 = i_359_;
			class43.anInt987 = i_350_ * 128 + 64;
			class43.anInt976 = i_351_ * 128 + 64;
			class43.anInt984 = i_352_;
			class43.aClass38_Sub20_Sub3_981 = class38_sub20_sub3;
			class43.aClass38_Sub20_Sub3_967 = class38_sub20_sub3_353_;
			class43.anInt973 = i_354_;
			class43.anInt978 = i_355_;
			class43.anInt972 = i_356_;
			class43.anInt979 = i_357_;
			for (int i_360_ = i; i_360_ >= 0; i_360_--)
				if (aClass38_Sub4ArrayArrayArray628[i_360_][i_350_][i_351_] == null)
					aClass38_Sub4ArrayArrayArray628[i_360_][i_350_][i_351_] = new Class38_Sub4(
							i_360_, i_350_, i_351_);
			aClass38_Sub4ArrayArrayArray628[i][i_350_][i_351_].aClass43_1819 = class43;
		}
	}

	public static void method262() {
		SceneGraph.aClass3Array642 = null;
		SceneGraph.anIntArray658 = null;
		SceneGraph.aClass5ArrayArray629 = null;
		SceneGraph.aClass5Array654 = null;
		SceneGraph.aClass13_657 = null;
		SceneGraph.anIntArray670 = null;
		SceneGraph.anIntArray673 = null;
		SceneGraph.anIntArray668 = null;
		SceneGraph.anIntArray664 = null;
		SceneGraph.anIntArray663 = null;
		SceneGraph.anIntArray661 = null;
		SceneGraph.anIntArray666 = null;
		SceneGraph.aBoolArrayArrayArrayArray659 = null;
		SceneGraph.aBoolArrayArray671 = null;
	}

	final Class49 method263(int i, int i_361_, int i_362_) {
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_361_][i_362_];
		if (class38_sub4 == null || class38_sub4.aClass49_1805 == null)
			return null;
		return class38_sub4.aClass49_1805;
	}

	private final boolean method264(int i, int i_363_, int i_364_) {
		int i_365_ = anIntArrayArrayArray641[i][i_363_][i_364_];
		if (i_365_ == -SceneGraph.anInt639)
			return false;
		if (i_365_ == SceneGraph.anInt639)
			return true;
		int i_366_ = i_363_ << 7;
		int i_367_ = i_364_ << 7;
		if (method266(i_366_ + 1, anIntArrayArrayArray634[i][i_363_][i_364_],
				i_367_ + 1)
				&& method266(i_366_ + 128 - 1,
						anIntArrayArrayArray634[i][i_363_ + 1][i_364_],
						i_367_ + 1)
				&& method266(i_366_ + 128 - 1,
						anIntArrayArrayArray634[i][i_363_ + 1][i_364_ + 1],
						i_367_ + 128 - 1)
				&& method266(i_366_ + 1,
						anIntArrayArrayArray634[i][i_363_][i_364_ + 1],
						i_367_ + 128 - 1)) {
			anIntArrayArrayArray641[i][i_363_][i_364_] = SceneGraph.anInt639;
			return true;
		}
		anIntArrayArrayArray641[i][i_363_][i_364_] = -SceneGraph.anInt639;
		return false;
	}

	private final void method265(
			Model class38_sub20_sub3_sub3, int i, int i_368_,
			int i_369_, int i_370_, int i_371_) {
		boolean bool = true;
		int i_372_ = i_368_;
		int i_373_ = i_368_ + i_370_;
		int i_374_ = i_369_ - 1;
		int i_375_ = i_369_ + i_371_;
		for (int i_376_ = i; i_376_ <= i + 1; i_376_++)
			if (i_376_ != anInt620) {
				for (int i_377_ = i_372_; i_377_ <= i_373_; i_377_++)
					if (i_377_ >= 0 && i_377_ < anInt625)
						for (int i_378_ = i_374_; i_378_ <= i_375_; i_378_++)
							if (i_378_ >= 0
									&& i_378_ < anInt644
									&& (!bool || i_377_ >= i_373_
											|| i_378_ >= i_375_ || i_378_ < i_369_
											&& i_377_ != i_368_)) {
								Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i_376_][i_377_][i_378_];
								if (class38_sub4 != null) {
									int i_379_ = (anIntArrayArrayArray634[i_376_][i_377_][i_378_]
											+ anIntArrayArrayArray634[i_376_][i_377_ + 1][i_378_]
											+ anIntArrayArrayArray634[i_376_][i_377_][i_378_ + 1] + anIntArrayArrayArray634[i_376_][i_377_ + 1][i_378_ + 1])
											/ 4
											- (anIntArrayArrayArray634[i][i_368_][i_369_]
													+ anIntArrayArrayArray634[i][i_368_ + 1][i_369_]
													+ anIntArrayArrayArray634[i][i_368_][i_369_ + 1] + anIntArrayArrayArray634[i][i_368_ + 1][i_369_ + 1])
											/ 4;
									Class82 class82 = class38_sub4.aClass82_1823;
									if (class82 != null) {
										if (class82.aClass38_Sub20_Sub3_1627 instanceof Model) {
											Model class38_sub20_sub3_sub3_380_ = (Model) class82.aClass38_Sub20_Sub3_1627;
											Model
													.method1143(
															class38_sub20_sub3_sub3,
															class38_sub20_sub3_sub3_380_,
															(i_377_ - i_368_)
																	* 128
																	+ (1 - i_370_)
																	* 64,
															i_379_,
															(i_378_ - i_369_)
																	* 128
																	+ (1 - i_371_)
																	* 64, bool);
										}
										if (class82.aClass38_Sub20_Sub3_1630 instanceof Model) {
											Model class38_sub20_sub3_sub3_381_ = (Model) class82.aClass38_Sub20_Sub3_1630;
											Model
													.method1143(
															class38_sub20_sub3_sub3,
															class38_sub20_sub3_sub3_381_,
															(i_377_ - i_368_)
																	* 128
																	+ (1 - i_370_)
																	* 64,
															i_379_,
															(i_378_ - i_369_)
																	* 128
																	+ (1 - i_371_)
																	* 64, bool);
										}
									}
									for (int i_382_ = 0; i_382_ < class38_sub4.anInt1828; i_382_++) {
										Class3 class3 = class38_sub4.aClass3Array1809[i_382_];
										if (class3 != null
												&& class3.aClass38_Sub20_Sub3_53 instanceof Model) {
											Model class38_sub20_sub3_sub3_383_ = (Model) class3.aClass38_Sub20_Sub3_53;
											int i_384_ = class3.anInt58
													- class3.anInt49 + 1;
											int i_385_ = class3.anInt59
													- class3.anInt46 + 1;
											Model
													.method1143(
															class38_sub20_sub3_sub3,
															class38_sub20_sub3_sub3_383_,
															(class3.anInt49 - i_368_)
																	* 128
																	+ (i_384_ - i_370_)
																	* 64,
															i_379_,
															(class3.anInt46 - i_369_)
																	* 128
																	+ (i_385_ - i_371_)
																	* 64, bool);
										}
									}
								}
							}
				i_372_--;
				bool = false;
			}
	}

	private final boolean method266(int i, int i_386_, int i_387_) {
		for (int i_388_ = 0; i_388_ < SceneGraph.anInt635; i_388_++) {
			Class5 class5 = SceneGraph.aClass5Array654[i_388_];
			if (class5.anInt101 == 1) {
				int i_389_ = class5.anInt117 - i;
				if (i_389_ > 0) {
					int i_390_ = class5.anInt107
							+ (class5.anInt121 * i_389_ >> 8);
					int i_391_ = class5.anInt113
							+ (class5.anInt105 * i_389_ >> 8);
					int i_392_ = class5.anInt122
							+ (class5.anInt102 * i_389_ >> 8);
					int i_393_ = class5.anInt111
							+ (class5.anInt110 * i_389_ >> 8);
					if (i_387_ >= i_390_ && i_387_ <= i_391_
							&& i_386_ >= i_392_ && i_386_ <= i_393_)
						return true;
				}
			} else if (class5.anInt101 == 2) {
				int i_394_ = i - class5.anInt117;
				if (i_394_ > 0) {
					int i_395_ = class5.anInt107
							+ (class5.anInt121 * i_394_ >> 8);
					int i_396_ = class5.anInt113
							+ (class5.anInt105 * i_394_ >> 8);
					int i_397_ = class5.anInt122
							+ (class5.anInt102 * i_394_ >> 8);
					int i_398_ = class5.anInt111
							+ (class5.anInt110 * i_394_ >> 8);
					if (i_387_ >= i_395_ && i_387_ <= i_396_
							&& i_386_ >= i_397_ && i_386_ <= i_398_)
						return true;
				}
			} else if (class5.anInt101 == 3) {
				int i_399_ = class5.anInt107 - i_387_;
				if (i_399_ > 0) {
					int i_400_ = class5.anInt117
							+ (class5.anInt112 * i_399_ >> 8);
					int i_401_ = class5.anInt98
							+ (class5.anInt103 * i_399_ >> 8);
					int i_402_ = class5.anInt122
							+ (class5.anInt102 * i_399_ >> 8);
					int i_403_ = class5.anInt111
							+ (class5.anInt110 * i_399_ >> 8);
					if (i >= i_400_ && i <= i_401_ && i_386_ >= i_402_
							&& i_386_ <= i_403_)
						return true;
				}
			} else if (class5.anInt101 == 4) {
				int i_404_ = i_387_ - class5.anInt107;
				if (i_404_ > 0) {
					int i_405_ = class5.anInt117
							+ (class5.anInt112 * i_404_ >> 8);
					int i_406_ = class5.anInt98
							+ (class5.anInt103 * i_404_ >> 8);
					int i_407_ = class5.anInt122
							+ (class5.anInt102 * i_404_ >> 8);
					int i_408_ = class5.anInt111
							+ (class5.anInt110 * i_404_ >> 8);
					if (i >= i_405_ && i <= i_406_ && i_386_ >= i_407_
							&& i_386_ <= i_408_)
						return true;
				}
			} else if (class5.anInt101 == 5) {
				int i_409_ = i_386_ - class5.anInt122;
				if (i_409_ > 0) {
					int i_410_ = class5.anInt117
							+ (class5.anInt112 * i_409_ >> 8);
					int i_411_ = class5.anInt98
							+ (class5.anInt103 * i_409_ >> 8);
					int i_412_ = class5.anInt107
							+ (class5.anInt121 * i_409_ >> 8);
					int i_413_ = class5.anInt113
							+ (class5.anInt105 * i_409_ >> 8);
					if (i >= i_410_ && i <= i_411_ && i_387_ >= i_412_
							&& i_387_ <= i_413_)
						return true;
				}
			}
		}
		return false;
	}

	private final void method267(Class3 class3) {
		for (int i = class3.anInt49; i <= class3.anInt58; i++)
			for (int i_414_ = class3.anInt46; i_414_ <= class3.anInt59; i_414_++) {
				Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[class3.anInt60][i][i_414_];
				if (class38_sub4 != null) {
					for (int i_415_ = 0; i_415_ < class38_sub4.anInt1828; i_415_++)
						if (class38_sub4.aClass3Array1809[i_415_] == class3) {
							class38_sub4.anInt1828--;
							for (int i_416_ = i_415_; i_416_ < class38_sub4.anInt1828; i_416_++) {
								class38_sub4.aClass3Array1809[i_416_] = class38_sub4.aClass3Array1809[i_416_ + 1];
								class38_sub4.anIntArray1822[i_416_] = class38_sub4.anIntArray1822[i_416_ + 1];
							}
							class38_sub4.aClass3Array1809[class38_sub4.anInt1828] = null;
							break;
						}
					class38_sub4.anInt1813 = 0;
					for (int i_417_ = 0; i_417_ < class38_sub4.anInt1828; i_417_++)
						class38_sub4.anInt1813 |= class38_sub4.anIntArray1822[i_417_];
				}
			}
	}

	final void method268(int i, int i_418_, int i_419_, int i_420_,
			SceneModel class38_sub20_sub3, int i_421_,
			SceneModel class38_sub20_sub3_422_,
			SceneModel class38_sub20_sub3_423_) {
		Class28 class28 = new Class28();
		class28.aClass38_Sub20_Sub3_688 = class38_sub20_sub3;
		class28.anInt681 = i_418_ * 128 + 64;
		class28.anInt682 = i_419_ * 128 + 64;
		class28.anInt676 = i_420_;
		class28.anInt694 = i_421_;
		class28.aClass38_Sub20_Sub3_690 = class38_sub20_sub3_422_;
		class28.aClass38_Sub20_Sub3_685 = class38_sub20_sub3_423_;
		int i_424_ = 0;
		Class38_Sub4 class38_sub4 = aClass38_Sub4ArrayArrayArray628[i][i_418_][i_419_];
		if (class38_sub4 != null)
			for (int i_425_ = 0; i_425_ < class38_sub4.anInt1828; i_425_++)
				if ((class38_sub4.aClass3Array1809[i_425_].anInt54 & 0x100) == 256
						&& class38_sub4.aClass3Array1809[i_425_].aClass38_Sub20_Sub3_53 instanceof Class38_Sub20_Sub3_Sub1) {
					Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = (Class38_Sub20_Sub3_Sub1) class38_sub4.aClass3Array1809[i_425_].aClass38_Sub20_Sub3_53;
					class38_sub20_sub3_sub1.method1043();
					if (((SceneModel) class38_sub20_sub3_sub1).height > i_424_)
						i_424_ = ((SceneModel) class38_sub20_sub3_sub1).height;
				}
		class28.anInt687 = i_424_;
		if (aClass38_Sub4ArrayArrayArray628[i][i_418_][i_419_] == null)
			aClass38_Sub4ArrayArrayArray628[i][i_418_][i_419_] = new Class38_Sub4(
					i, i_418_, i_419_);
		aClass38_Sub4ArrayArrayArray628[i][i_418_][i_419_].aClass28_1824 = class28;
	}

	private final boolean method269(int i, int i_426_, int i_427_, int i_428_,
			int i_429_, int i_430_, int i_431_, int i_432_) {
		if (i_426_ < i_427_ && i_426_ < i_428_ && i_426_ < i_429_)
			return false;
		if (i_426_ > i_427_ && i_426_ > i_428_ && i_426_ > i_429_)
			return false;
		if (i < i_430_ && i < i_431_ && i < i_432_)
			return false;
		if (i > i_430_ && i > i_431_ && i > i_432_)
			return false;
		int i_433_ = (i_426_ - i_427_) * (i_431_ - i_430_) - (i - i_430_)
				* (i_428_ - i_427_);
		int i_434_ = (i_426_ - i_429_) * (i_430_ - i_432_) - (i - i_432_)
				* (i_427_ - i_429_);
		int i_435_ = (i_426_ - i_428_) * (i_432_ - i_431_) - (i - i_431_)
				* (i_429_ - i_428_);
		if (i_433_ * i_435_ > 0 && i_435_ * i_434_ > 0)
			return true;
		return false;
	}

	final void method270(int i, int i_436_, int i_437_, int i_438_, int i_439_,
			int i_440_) {
		if (i < 0)
			i = 0;
		else if (i >= anInt625 * 128)
			i = anInt625 * 128 - 1;
		if (i_437_ < 0)
			i_437_ = 0;
		else if (i_437_ >= anInt644 * 128)
			i_437_ = anInt644 * 128 - 1;
		SceneGraph.anInt639++;
		SceneGraph.anInt638 = Class38_Sub20_Sub9_Sub4.anIntArray3520[i_438_];
		SceneGraph.anInt649 = Class38_Sub20_Sub9_Sub4.anIntArray3528[i_438_];
		SceneGraph.anInt655 = Class38_Sub20_Sub9_Sub4.anIntArray3520[i_439_];
		SceneGraph.anInt650 = Class38_Sub20_Sub9_Sub4.anIntArray3528[i_439_];
		SceneGraph.aBoolArrayArray671 = SceneGraph.aBoolArrayArrayArrayArray659[(i_438_ - 128) / 32][i_439_ / 64];
		SceneGraph.anInt640 = i;
		SceneGraph.anInt653 = i_436_;
		SceneGraph.anInt646 = i_437_;
		SceneGraph.anInt652 = i / 128;
		SceneGraph.anInt626 = i_437_ / 128;
		SceneGraph.anInt647 = i_440_;
		SceneGraph.anInt627 = SceneGraph.anInt652 - 25;
		if (SceneGraph.anInt627 < 0)
			SceneGraph.anInt627 = 0;
		SceneGraph.anInt631 = SceneGraph.anInt626 - 25;
		if (SceneGraph.anInt631 < 0)
			SceneGraph.anInt631 = 0;
		SceneGraph.anInt632 = SceneGraph.anInt652 + 25;
		if (SceneGraph.anInt632 > anInt625)
			SceneGraph.anInt632 = anInt625;
		SceneGraph.anInt621 = SceneGraph.anInt626 + 25;
		if (SceneGraph.anInt621 > anInt644)
			SceneGraph.anInt621 = anInt644;
		method259();
		SceneGraph.anInt624 = 0;
		for (int i_441_ = anInt637; i_441_ < anInt620; i_441_++) {
			Class38_Sub4[][] class38_sub4s = aClass38_Sub4ArrayArrayArray628[i_441_];
			for (int i_442_ = SceneGraph.anInt627; i_442_ < SceneGraph.anInt632; i_442_++)
				for (int i_443_ = SceneGraph.anInt631; i_443_ < SceneGraph.anInt621; i_443_++) {
					Class38_Sub4 class38_sub4 = class38_sub4s[i_442_][i_443_];
					if (class38_sub4 != null)
						if (class38_sub4.anInt1832 > i_440_
								|| !SceneGraph.aBoolArrayArray671[i_442_
										- SceneGraph.anInt652 + 25][i_443_
										- SceneGraph.anInt626 + 25]
								&& anIntArrayArrayArray634[i_441_][i_442_][i_443_]
										- i_436_ < 2000) {
							class38_sub4.aBool1812 = false;
							class38_sub4.aBool1816 = false;
							class38_sub4.anInt1806 = 0;
						} else {
							class38_sub4.aBool1812 = true;
							class38_sub4.aBool1816 = true;
							if (class38_sub4.anInt1828 > 0)
								class38_sub4.aBool1821 = true;
							else
								class38_sub4.aBool1821 = false;
							SceneGraph.anInt624++;
						}
				}
		}
		for (int i_444_ = anInt637; i_444_ < anInt620; i_444_++) {
			Class38_Sub4[][] class38_sub4s = aClass38_Sub4ArrayArrayArray628[i_444_];
			for (int i_445_ = -25; i_445_ <= 0; i_445_++) {
				int i_446_ = SceneGraph.anInt652 + i_445_;
				int i_447_ = SceneGraph.anInt652 - i_445_;
				if (i_446_ >= SceneGraph.anInt627
						|| i_447_ < SceneGraph.anInt632)
					for (int i_448_ = -25; i_448_ <= 0; i_448_++) {
						int i_449_ = SceneGraph.anInt626 + i_448_;
						int i_450_ = SceneGraph.anInt626 - i_448_;
						if (i_446_ >= SceneGraph.anInt627) {
							if (i_449_ >= SceneGraph.anInt631) {
								Class38_Sub4 class38_sub4 = class38_sub4s[i_446_][i_449_];
								if (class38_sub4 != null
										&& class38_sub4.aBool1812)
									method250(class38_sub4, true);
							}
							if (i_450_ < SceneGraph.anInt621) {
								Class38_Sub4 class38_sub4 = class38_sub4s[i_446_][i_450_];
								if (class38_sub4 != null
										&& class38_sub4.aBool1812)
									method250(class38_sub4, true);
							}
						}
						if (i_447_ < SceneGraph.anInt632) {
							if (i_449_ >= SceneGraph.anInt631) {
								Class38_Sub4 class38_sub4 = class38_sub4s[i_447_][i_449_];
								if (class38_sub4 != null
										&& class38_sub4.aBool1812)
									method250(class38_sub4, true);
							}
							if (i_450_ < SceneGraph.anInt621) {
								Class38_Sub4 class38_sub4 = class38_sub4s[i_447_][i_450_];
								if (class38_sub4 != null
										&& class38_sub4.aBool1812)
									method250(class38_sub4, true);
							}
						}
						if (SceneGraph.anInt624 == 0) {
							SceneGraph.aBool630 = false;
							return;
						}
					}
			}
		}
		for (int i_451_ = anInt637; i_451_ < anInt620; i_451_++) {
			Class38_Sub4[][] class38_sub4s = aClass38_Sub4ArrayArrayArray628[i_451_];
			for (int i_452_ = -25; i_452_ <= 0; i_452_++) {
				int i_453_ = SceneGraph.anInt652 + i_452_;
				int i_454_ = SceneGraph.anInt652 - i_452_;
				if (i_453_ >= SceneGraph.anInt627
						|| i_454_ < SceneGraph.anInt632)
					for (int i_455_ = -25; i_455_ <= 0; i_455_++) {
						int i_456_ = SceneGraph.anInt626 + i_455_;
						int i_457_ = SceneGraph.anInt626 - i_455_;
						if (i_453_ >= SceneGraph.anInt627) {
							if (i_456_ >= SceneGraph.anInt631) {
								Class38_Sub4 class38_sub4 = class38_sub4s[i_453_][i_456_];
								if (class38_sub4 != null
										&& class38_sub4.aBool1812)
									method250(class38_sub4, false);
							}
							if (i_457_ < SceneGraph.anInt621) {
								Class38_Sub4 class38_sub4 = class38_sub4s[i_453_][i_457_];
								if (class38_sub4 != null
										&& class38_sub4.aBool1812)
									method250(class38_sub4, false);
							}
						}
						if (i_454_ < SceneGraph.anInt632) {
							if (i_456_ >= SceneGraph.anInt631) {
								Class38_Sub4 class38_sub4 = class38_sub4s[i_454_][i_456_];
								if (class38_sub4 != null
										&& class38_sub4.aBool1812)
									method250(class38_sub4, false);
							}
							if (i_457_ < SceneGraph.anInt621) {
								Class38_Sub4 class38_sub4 = class38_sub4s[i_454_][i_457_];
								if (class38_sub4 != null
										&& class38_sub4.aBool1812)
									method250(class38_sub4, false);
							}
						}
						if (SceneGraph.anInt624 == 0) {
							SceneGraph.aBool630 = false;
							return;
						}
					}
			}
		}
		SceneGraph.aBool630 = false;
	}

	SceneGraph(int i, int i_458_, int i_459_, int[][][] is) {
		aClass3Array623 = new Class3[5000];
		anIntArrayArray667 = new int[][] { new int[16],
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
				{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
				{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
		anIntArrayArray672 = new int[][] {
				{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
				{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
				{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
				{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
		anInt620 = i;
		anInt625 = i_458_;
		anInt644 = i_459_;
		aClass38_Sub4ArrayArrayArray628 = new Class38_Sub4[i][i_458_][i_459_];
		anIntArrayArrayArray641 = new int[i][i_458_ + 1][i_459_ + 1];
		anIntArrayArrayArray634 = is;
		method242();
	}

	static {
		SceneGraph.aBool630 = false;
		SceneGraph.mouseOverX = -1;
		SceneGraph.anInt645 = 0;
		SceneGraph.aClass5ArrayArray629 = new Class5[SceneGraph.anInt633][500];
		SceneGraph.aBool651 = true;
		SceneGraph.aClass3Array642 = new Class3[100];
		SceneGraph.aClass5Array654 = new Class5[500];
		SceneGraph.anInt647 = 0;
		SceneGraph.anInt643 = 0;
		SceneGraph.anInt635 = 0;
		SceneGraph.anInt648 = 0;
		SceneGraph.anIntArray658 = new int[SceneGraph.anInt633];
		SceneGraph.mouseOverY = -1;
		SceneGraph.aClass13_657 = new Class13();
		SceneGraph.aBoolArrayArrayArrayArray659 = new boolean[8][32][51][51];
		SceneGraph.anIntArray663 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		SceneGraph.anIntArray661 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
		SceneGraph.anIntArray668 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
		SceneGraph.anIntArray666 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
		SceneGraph.anIntArray664 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		SceneGraph.anIntArray670 = new int[] { 19, 55, 38, 155, 255, 110, 137,
				205, 76 };
		SceneGraph.anIntArray673 = new int[] { 160, 192, 80, 96, 0, 144, 80,
				48, 160 };
	}
}
