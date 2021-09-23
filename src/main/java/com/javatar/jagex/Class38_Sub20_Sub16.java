package com.javatar.jagex;/* Class38_Sub20_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub16 extends NodeSub {
	private int[] anIntArray3082;
	private short[] aShortArray3083;
	private static RSString aClass19_3086;
	static int anInt3088 = 2;
	private short[] aShortArray3090;
	boolean aBool3091 = false;
	static RSString aClass19_3092;
	static RSString aClass19_3093;
	static RSString aClass19_3095;
	static Class68[] aClass68Array3096;
	private int[] anIntArray3097;
	static Class31 aClass31_3098;
	static RSString aClass19_3099;
	static RSString aClass19_3101;
	int anInt3102 = -1;
	private short[] aShortArray3103;
	private short[] aShortArray3105;
	static RSString aClass19_3107;
	private static RSString aClass19_3108;

	final boolean method1021(int i) {
		try {
			if (anIntArray3097 == null)
				return true;
			boolean bool = true;
			for (int i_0_ = 0; anIntArray3097.length > i_0_; i_0_++)
				if (!Class38_Sub10_Sub1.aClass17_2646.method116(anIntArray3097[i_0_], 0))
					bool = false;
			if (i < 20)
				method1028(55);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jc.H(" + i + ')');
		}
	}

	public static void method1022(int i) {
		try {
			Class38_Sub20_Sub16.aClass19_3099 = null;
			Class38_Sub20_Sub16.aClass19_3108 = null;
			Class38_Sub20_Sub16.aClass68Array3096 = null;
			Class38_Sub20_Sub16.aClass19_3095 = null;
			Class38_Sub20_Sub16.aClass19_3107 = null;
			Class38_Sub20_Sub16.aClass19_3093 = null;
			Class38_Sub20_Sub16.aClass19_3092 = null;
			Class38_Sub20_Sub16.aClass31_3098 = null;
			Class38_Sub20_Sub16.aClass19_3086 = null;
			Class38_Sub20_Sub16.aClass19_3101 = null;
			int i_1_ = -72 % ((i + 49) / 59);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jc.K(" + i + ')');
		}
	}

	final void method1023(byte i, RS2Buffer class38_sub23) {
		try {
			for (;;) {
				int i_2_ = class38_sub23.readUnsignedByte();
				if (i_2_ == 0)
					break;
				method1027(i_2_, class38_sub23, (byte) -125);
			}
			int i_3_ = 4 / ((-46 - i) / 54);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jc.F(" + i + ',' + (class38_sub23 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method1024(byte i) {
		try {
			boolean bool = true;
			int i_4_ = 0;
			if (i != 107)
				return false;
			for (/**/; i_4_ < 5; i_4_++)
				if (anIntArray3082[i_4_] != -1 && !Class38_Sub10_Sub1.aClass17_2646.method116(anIntArray3082[i_4_], 0))
					bool = false;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jc.G(" + i + ')');
		}
	}

	static final void method1025(Class74[] class74s, int i, SceneGraph class27) {
		try {
			for (int i_5_ = 0; i_5_ < 4; i_5_++)
				for (int i_6_ = 0; i_6_ < 104; i_6_++)
					for (int i_7_ = 0; i_7_ < 104; i_7_++)
						if ((Class82.aByteArrayArrayArray1648[i_5_][i_6_][i_7_] & 0x1) == 1) {
							int i_8_ = i_5_;
							if ((Class82.aByteArrayArrayArray1648[1][i_6_][i_7_] & 0x2) == 2)
								i_8_--;
							if (i_8_ >= 0)
								class74s[i_8_].method524(i_6_, i_7_, 0);
						}
			Entity.anInt3510 += (int) (Math.random() * 5.0) - 2;
			Canvas_Sub1.anInt2523 += (int) (Math.random() * 5.0) - 2;
			if (Entity.anInt3510 < -16)
				Entity.anInt3510 = -16;
			if (Canvas_Sub1.anInt2523 < -8)
				Canvas_Sub1.anInt2523 = -8;
			if (Canvas_Sub1.anInt2523 > 8)
				Canvas_Sub1.anInt2523 = 8;
			if (Entity.anInt3510 > 16)
				Entity.anInt3510 = 16;
			for (int i_9_ = 0; i_9_ < 4; i_9_++) {
				byte[][] is = Class25.aByteArrayArrayArray583[i_9_];
				int i_10_ = (int) Math.sqrt(5100.0);
				int i_11_ = i_10_ * 768 >> 631805096;
				for (int i_12_ = 1; i_12_ < 103; i_12_++)
					for (int i_13_ = 1; i_13_ < 103; i_13_++) {
						int i_14_ = -Player.anIntArrayArrayArray3566[i_9_][i_13_][i_12_ - 1] + Player.anIntArrayArrayArray3566[i_9_][i_13_][i_12_ + 1];
						int i_15_ = Player.anIntArrayArrayArray3566[i_9_][i_13_ + 1][i_12_] - Player.anIntArrayArrayArray3566[i_9_][i_13_ - 1][i_12_];
						int i_16_ = (int) Math.sqrt(i_15_ * i_15_ + 65536 + i_14_ * i_14_);
						int i_17_ = (i_15_ << -796388920) / i_16_;
						int i_18_ = (is[i_13_][i_12_ + 1] >> 594346435) + (is[i_13_ - 1][i_12_] >> -565273150) - (-(is[i_13_ + 1][i_12_] >> -298729245) + -(is[i_13_][i_12_ - 1] >> 1847135138) - (is[i_13_][i_12_] >> -1012837695));
						int i_19_ = 65536 / i_16_;
						int i_20_ = (i_14_ << -1609441464) / i_16_;
						int i_21_ = 96 + (i_19_ * -10 + i_17_ * -50 + i_20_ * -50) / i_11_;
						PlayerAppearance.anIntArrayArray394[i_13_][i_12_] = -i_18_ + i_21_;
					}
				for (int i_22_ = 0; i_22_ < 104; i_22_++) {
					Class38_Sub9.anIntArray2070[i_22_] = 0;
					Class79.anIntArray1564[i_22_] = 0;
					Class38_Sub20_Sub3_Sub2.anIntArray3257[i_22_] = 0;
					Class20.anIntArray503[i_22_] = 0;
					Class38_Sub20_Sub10.anIntArray2905[i_22_] = 0;
				}
				for (int i_23_ = -5; i_23_ < 109; i_23_++) {
					for (int i_24_ = 0; i_24_ < 104; i_24_++) {
						int i_25_ = i_23_ + 5;
						if (i_25_ >= 0 && i_25_ < 104) {
							int i_26_ = Class74.aByteArrayArrayArray1470[i_9_][i_25_][i_24_] & 0xff;
							if (i_26_ > 0) {
								Class38_Sub20_Sub8 class38_sub20_sub8 = Class16.method90(-1, i_26_ - 1);
								Class38_Sub9.anIntArray2070[i_24_] += class38_sub20_sub8.anInt2876;
								Class79.anIntArray1564[i_24_] += class38_sub20_sub8.anInt2860;
								Class38_Sub20_Sub3_Sub2.anIntArray3257[i_24_] += class38_sub20_sub8.anInt2858;
								Class20.anIntArray503[i_24_] += class38_sub20_sub8.anInt2878;
								Class38_Sub20_Sub10.anIntArray2905[i_24_]++;
							}
						}
						int i_27_ = i_23_ - 5;
						if (i_27_ >= 0 && i_27_ < 104) {
							int i_28_ = Class74.aByteArrayArrayArray1470[i_9_][i_27_][i_24_] & 0xff;
							if (i_28_ > 0) {
								Class38_Sub20_Sub8 class38_sub20_sub8 = Class16.method90(-1, i_28_ - 1);
								Class38_Sub9.anIntArray2070[i_24_] -= class38_sub20_sub8.anInt2876;
								Class79.anIntArray1564[i_24_] -= class38_sub20_sub8.anInt2860;
								Class38_Sub20_Sub3_Sub2.anIntArray3257[i_24_] -= class38_sub20_sub8.anInt2858;
								Class20.anIntArray503[i_24_] -= class38_sub20_sub8.anInt2878;
								Class38_Sub20_Sub10.anIntArray2905[i_24_]--;
							}
						}
					}
					if (i_23_ >= 1 && i_23_ < 103) {
						int i_29_ = 0;
						int i_30_ = 0;
						int i_31_ = 0;
						int i_32_ = 0;
						int i_33_ = 0;
						for (int i_34_ = -5; i_34_ < 109; i_34_++) {
							int i_35_ = i_34_ + 5;
							if (i_35_ >= 0 && i_35_ < 104) {
								i_32_ += Class20.anIntArray503[i_35_];
								i_30_ += Class79.anIntArray1564[i_35_];
								i_33_ += Class38_Sub20_Sub10.anIntArray2905[i_35_];
								i_29_ += Class38_Sub9.anIntArray2070[i_35_];
								i_31_ += Class38_Sub20_Sub3_Sub2.anIntArray3257[i_35_];
							}
							int i_36_ = i_34_ - 5;
							if (i_36_ >= 0 && i_36_ < 104) {
								i_29_ -= Class38_Sub9.anIntArray2070[i_36_];
								i_32_ -= Class20.anIntArray503[i_36_];
								i_30_ -= Class79.anIntArray1564[i_36_];
								i_31_ -= Class38_Sub20_Sub3_Sub2.anIntArray3257[i_36_];
								i_33_ -= Class38_Sub20_Sub10.anIntArray2905[i_36_];
							}
							if (i_34_ >= 1 && i_34_ < 103 && (!Class38_Sub4.aBool1811 || (Class82.aByteArrayArrayArray1648[0][i_23_][i_34_] & 0x2) != 0 || (Class82.aByteArrayArrayArray1648[i_9_][i_23_][i_34_] & 0x10) == 0 && Class38_Sub20_Sub8.method949(i_9_, 122, i_34_, i_23_) == Entity.anInt3489)) {
								if (Class26.anInt618 > i_9_)
									Class26.anInt618 = i_9_;
								int i_37_ = Class74.aByteArrayArrayArray1470[i_9_][i_23_][i_34_] & 0xff;
								int i_38_ = NPC.aByteArrayArrayArray3560[i_9_][i_23_][i_34_] & 0xff;
								if (i_37_ > 0 || i_38_ > 0) {
									int i_39_ = Player.anIntArrayArrayArray3566[i_9_][i_23_][i_34_];
									int i_40_ = Player.anIntArrayArrayArray3566[i_9_][i_23_ + 1][i_34_];
									int i_41_ = Player.anIntArrayArrayArray3566[i_9_][i_23_ + 1][i_34_ + 1];
									int i_42_ = Player.anIntArrayArrayArray3566[i_9_][i_23_][i_34_ + 1];
									int i_43_ = PlayerAppearance.anIntArrayArray394[i_23_][i_34_];
									int i_44_ = PlayerAppearance.anIntArrayArray394[i_23_ + 1][i_34_ + 1];
									int i_45_ = PlayerAppearance.anIntArrayArray394[i_23_ + 1][i_34_];
									int i_46_ = -1;
									int i_47_ = -1;
									int i_48_ = PlayerAppearance.anIntArrayArray394[i_23_][i_34_ + 1];
									if (i_37_ > 0) {
										int i_49_ = i_30_ / i_33_;
										int i_50_ = i_31_ / i_33_;
										int i_51_ = i_29_ * 256 / i_32_;
										i_46_ = Class6.method33(2, i_51_, i_50_, i_49_);
										i_50_ += Entity.anInt3510;
										if (i_50_ < 0)
											i_50_ = 0;
										else if (i_50_ > 255)
											i_50_ = 255;
										i_51_ = Canvas_Sub1.anInt2523 + i_51_ & 0xff;
										i_47_ = Class6.method33(2, i_51_, i_50_, i_49_);
									}
									if (i_9_ > 0) {
										boolean bool = true;
										if (i_37_ == 0 && Class48.aByteArrayArrayArray1084[i_9_][i_23_][i_34_] != 0)
											bool = false;
										if (i_38_ > 0 && !Class38_Sub2.method616(4, i_38_ - 1).aBool3056)
											bool = false;
										if (bool && i_39_ == i_40_ && i_41_ == i_39_ && i_42_ == i_39_)
											Class5.anIntArrayArrayArray116[i_9_][i_23_][i_34_] = Class38_Sub3.setClippingFlag(Class5.anIntArrayArrayArray116[i_9_][i_23_][i_34_], 2340);
									}
									int i_52_ = 0;
									if (i_47_ != -1)
										i_52_ = Class38_Sub20_Sub9_Sub4.anIntArray3530[Class42.method360(96, i_47_, (byte) 115)];
									if (i_38_ == 0)
										class27.method247(i_9_, i_23_, i_34_, 0, 0, -1, i_39_, i_40_, i_41_, i_42_, Class42.method360(i_43_, i_46_, (byte) 126), Class42.method360(i_45_, i_46_, (byte) 109), Class42.method360(i_44_, i_46_, (byte) 122), Class42.method360(i_48_, i_46_, (byte) 112), 0, 0, 0, 0, i_52_, 0);
									else {
										int i_53_ = Class48.aByteArrayArrayArray1084[i_9_][i_23_][i_34_] + 1;
										byte i_54_ = Class48.aByteArrayArrayArray1078[i_9_][i_23_][i_34_];
										Class38_Sub20_Sub14 class38_sub20_sub14 = Class38_Sub2.method616(4, i_38_ - 1);
										int i_55_ = class38_sub20_sub14.anInt3054;
										int i_56_;
										int i_57_;
										if (i_55_ < 0) {
											if (class38_sub20_sub14.anInt3034 == 16711935) {
												i_55_ = -1;
												i_57_ = -2;
												i_56_ = -2;
											} else {
												i_56_ = Class6.method33(i + 2, class38_sub20_sub14.anInt3050, class38_sub20_sub14.anInt3048, class38_sub20_sub14.anInt3051);
												int i_58_ = Canvas_Sub1.anInt2523 + class38_sub20_sub14.anInt3050 & 0xff;
												int i_59_ = Entity.anInt3510 + class38_sub20_sub14.anInt3048;
												if (i_59_ >= 0) {
													if (i_59_ > 255)
														i_59_ = 255;
												} else
													i_59_ = 0;
												i_57_ = Class6.method33(2, i_58_, i_59_, class38_sub20_sub14.anInt3051);
											}
										} else {
											i_56_ = -1;
											i_57_ = Class38_Sub20_Sub9_Sub4.anInterface3_3533.method7(i_55_, false);
										}
										int i_60_ = 0;
										if (i_57_ != -2)
											i_60_ = Class38_Sub20_Sub9_Sub4.anIntArray3530[Class37.method324(i_57_, 96, i ^ 0x6c)];
										if (class38_sub20_sub14.anInt3030 != -1) {
											int i_61_ = class38_sub20_sub14.anInt3053 + Canvas_Sub1.anInt2523 & 0xff;
											int i_62_ = class38_sub20_sub14.anInt3040 + Entity.anInt3510;
											if (i_62_ < 0)
												i_62_ = 0;
											else if (i_62_ > 255)
												i_62_ = 255;
											i_57_ = Class6.method33(2, i_61_, i_62_, class38_sub20_sub14.anInt3033);
											i_60_ = Class38_Sub20_Sub9_Sub4.anIntArray3530[Class37.method324(i_57_, 96, i + 92)];
										}
										class27.method247(i_9_, i_23_, i_34_, i_53_, i_54_, i_55_, i_39_, i_40_, i_41_, i_42_, Class42.method360(i_43_, i_46_, (byte) 123), Class42.method360(i_45_, i_46_, (byte) 113), Class42.method360(i_44_, i_46_, (byte) 107), Class42.method360(i_48_, i_46_, (byte) 100), Class37.method324(i_56_, i_43_, i ^ 0x3a), Class37.method324(i_56_, i_45_, i ^ 0x7f), Class37.method324(i_56_, i_44_, 37), Class37.method324(i_56_, i_48_, 56), i_52_, i_60_);
									}
								}
							}
						}
					}
				}
				for (int i_63_ = 1; i_63_ < 103; i_63_++)
					for (int i_64_ = 1; i_64_ < 103; i_64_++)
						class27.method225(i_9_, i_64_, i_63_, Class38_Sub20_Sub8.method949(i_9_, 119, i_63_, i_64_));
				Class74.aByteArrayArrayArray1470[i_9_] = null;
				NPC.aByteArrayArrayArray3560[i_9_] = null;
				Class48.aByteArrayArrayArray1084[i_9_] = null;
				Class48.aByteArrayArrayArray1078[i_9_] = null;
				Class25.aByteArrayArrayArray583[i_9_] = null;
			}
			class27.method243(-50, -10, -50);
			for (int i_65_ = 0; i_65_ < 104; i_65_++)
				for (int i_66_ = 0; i_66_ < 104; i_66_++)
					if ((Class82.aByteArrayArrayArray1648[1][i_65_][i_66_] & 0x2) == 2)
						class27.method260(i_65_, i_66_);
			int i_67_ = 1;
			int i_68_ = 2;
			int i_69_ = 4;
			for (int i_70_ = i; i_70_ < 4; i_70_++) {
				if (i_70_ > 0) {
					i_69_ <<= 3;
					i_68_ <<= 3;
					i_67_ <<= 3;
				}
				for (int i_71_ = 0; i_70_ >= i_71_; i_71_++)
					for (int i_72_ = 0; i_72_ <= 104; i_72_++)
						for (int i_73_ = 0; i_73_ <= 104; i_73_++) {
							if ((Class5.anIntArrayArrayArray116[i_71_][i_73_][i_72_] & i_67_) != 0) {
								int i_74_;
								for (i_74_ = i_72_; i_74_ > 0 && (i_67_ & Class5.anIntArrayArrayArray116[i_71_][i_73_][i_74_ - 1]) != 0; i_74_--) {
									/* empty */
								}
								int i_75_;
								for (i_75_ = i_72_; i_75_ < 104 && (i_67_ & Class5.anIntArrayArrayArray116[i_71_][i_73_][i_75_ + 1]) != 0; i_75_++) {
									/* empty */
								}
								int i_76_ = i_71_;
								int i_77_;
								while_13_: for (i_77_ = i_71_; i_77_ > 0; i_77_--)
									for (int i_78_ = i_74_; i_78_ <= i_75_; i_78_++)
										if ((Class5.anIntArrayArrayArray116[i_77_ - 1][i_73_][i_78_] & i_67_) == 0)
											break while_13_;
								while_14_: for (/**/; i_76_ < i_70_; i_76_++)
									for (int i_79_ = i_74_; i_75_ >= i_79_; i_79_++)
										if ((Class5.anIntArrayArrayArray116[i_76_ + 1][i_73_][i_79_] & i_67_) == 0)
											break while_14_;
								int i_80_ = (-i_77_ + i_76_ + 1) * (i_75_ - i_74_ + 1);
								if (i_80_ >= 8) {
									int i_81_ = 240;
									int i_82_ = -i_81_ + Player.anIntArrayArrayArray3566[i_76_][i_73_][i_74_];
									int i_83_ = Player.anIntArrayArrayArray3566[i_77_][i_73_][i_74_];
									SceneGraph.method248(i_70_, 1, i_73_ * 128, i_73_ * 128, i_74_ * 128, i_75_ * 128 + 128, i_82_, i_83_);
									for (int i_84_ = i_77_; i_76_ >= i_84_; i_84_++)
										for (int i_85_ = i_74_; i_85_ <= i_75_; i_85_++)
											Class5.anIntArrayArrayArray116[i_84_][i_73_][i_85_] = Class38_Sub10_Sub3.method941(Class5.anIntArrayArrayArray116[i_84_][i_73_][i_85_], i_67_ ^ 0xffffffff);
								}
							}
							if ((i_68_ & Class5.anIntArrayArrayArray116[i_71_][i_73_][i_72_]) != 0) {
								int i_86_ = i_73_;
								int i_87_ = i_73_;
								for (/**/; i_86_ > 0 && (Class5.anIntArrayArrayArray116[i_71_][i_86_ - 1][i_72_] & i_68_) != 0; i_86_--) {
									/* empty */
								}
								int i_88_ = i_71_;
								for (/**/; i_87_ < 104 && (i_68_ & Class5.anIntArrayArrayArray116[i_71_][i_87_ + 1][i_72_]) != 0; i_87_++) {
									/* empty */
								}
								int i_89_ = i_71_;
								while_15_: for (/**/; i_88_ > 0; i_88_--)
									for (int i_90_ = i_86_; i_87_ >= i_90_; i_90_++)
										if ((Class5.anIntArrayArrayArray116[i_88_ - 1][i_90_][i_72_] & i_68_) == 0)
											break while_15_;
								while_16_: for (/**/; i_89_ < i_70_; i_89_++)
									for (int i_91_ = i_86_; i_87_ >= i_91_; i_91_++)
										if ((Class5.anIntArrayArrayArray116[i_89_ + 1][i_91_][i_72_] & i_68_) == 0)
											break while_16_;
								int i_92_ = (-i_86_ + i_87_ + 1) * (i_89_ + 1 - i_88_);
								if (i_92_ >= 8) {
									int i_93_ = 240;
									int i_94_ = -i_93_ + Player.anIntArrayArrayArray3566[i_89_][i_86_][i_72_];
									int i_95_ = Player.anIntArrayArrayArray3566[i_88_][i_86_][i_72_];
									SceneGraph.method248(i_70_, 2, i_86_ * 128, i_87_ * 128 + 128, i_72_ * 128, i_72_ * 128, i_94_, i_95_);
									for (int i_96_ = i_88_; i_96_ <= i_89_; i_96_++)
										for (int i_97_ = i_86_; i_87_ >= i_97_; i_97_++)
											Class5.anIntArrayArrayArray116[i_96_][i_97_][i_72_] = Class38_Sub10_Sub3.method941(Class5.anIntArrayArrayArray116[i_96_][i_97_][i_72_], i_68_ ^ 0xffffffff);
								}
							}
							if ((Class5.anIntArrayArrayArray116[i_71_][i_73_][i_72_] & i_69_) != 0) {
								int i_98_ = i_73_;
								int i_99_;
								for (i_99_ = i_72_; i_99_ < 104 && (i_69_ & Class5.anIntArrayArrayArray116[i_71_][i_73_][i_99_ + 1]) != 0; i_99_++) {
									/* empty */
								}
								int i_100_ = i_72_;
								int i_101_ = i_73_;
								for (/**/; i_100_ > 0; i_100_--)
									if ((Class5.anIntArrayArrayArray116[i_71_][i_73_][i_100_ - 1] & i_69_) == 0)
										break;
								while_17_: for (/**/; i_98_ > 0; i_98_--)
									for (int i_102_ = i_100_; i_102_ <= i_99_; i_102_++)
										if ((i_69_ & Class5.anIntArrayArrayArray116[i_71_][i_98_ - 1][i_102_]) == 0)
											break while_17_;
								while_18_: for (/**/; i_101_ < 104; i_101_++)
									for (int i_103_ = i_100_; i_103_ <= i_99_; i_103_++)
										if ((i_69_ & Class5.anIntArrayArrayArray116[i_71_][i_101_ + 1][i_103_]) == 0)
											break while_18_;
								if ((i_99_ - (i_100_ - 1)) * (-i_98_ + i_101_ + 1) >= 4) {
									int i_104_ = Player.anIntArrayArrayArray3566[i_71_][i_98_][i_100_];
									SceneGraph.method248(i_70_, 4, i_98_ * 128, i_101_ * 128 + 128, i_100_ * 128, i_99_ * 128 + 128, i_104_, i_104_);
									for (int i_105_ = i_98_; i_105_ <= i_101_; i_105_++)
										for (int i_106_ = i_100_; i_106_ <= i_99_; i_106_++)
											Class5.anIntArrayArrayArray116[i_71_][i_105_][i_106_] = Class38_Sub10_Sub3.method941(Class5.anIntArrayArrayArray116[i_71_][i_105_][i_106_], i_69_ ^ 0xffffffff);
								}
							}
						}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jc.L(" + (class74s != null ? "{...}" : "null") + ',' + i + ',' + (class27 != null ? "{...}" : "null") + ')');
		}
	}

	final Model method1026(byte i) {
		try {
			if (i >= -73)
				return null;
			if (anIntArray3097 == null)
				return null;
			Model[] class38_sub20_sub3_sub3s = new Model[anIntArray3097.length];
			for (int i_107_ = 0; i_107_ < anIntArray3097.length; i_107_++)
				class38_sub20_sub3_sub3s[i_107_] = Model.get(Class38_Sub10_Sub1.aClass17_2646, anIntArray3097[i_107_], 0);
			Model class38_sub20_sub3_sub3;
			if (class38_sub20_sub3_sub3s.length == 1)
				class38_sub20_sub3_sub3 = class38_sub20_sub3_sub3s[0];
			else
				class38_sub20_sub3_sub3 = new Model(class38_sub20_sub3_sub3s, class38_sub20_sub3_sub3s.length);
			if (aShortArray3083 != null)
				for (int i_108_ = 0; i_108_ < aShortArray3083.length; i_108_++)
					class38_sub20_sub3_sub3.method1128(aShortArray3083[i_108_], aShortArray3103[i_108_]);
			if (aShortArray3105 != null)
				for (int i_109_ = 0; i_109_ < aShortArray3105.length; i_109_++)
					class38_sub20_sub3_sub3.method1148(aShortArray3105[i_109_], aShortArray3090[i_109_]);
			return class38_sub20_sub3_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jc.E(" + i + ')');
		}
	}

	private final void method1027(int i, RS2Buffer class38_sub23, byte i_110_) {
		do {
			try {
				if (i != 1) {
					if (i == 2) {
						int i_111_ = class38_sub23.readUnsignedByte();
						anIntArray3097 = new int[i_111_];
						for (int i_112_ = 0; i_112_ < i_111_; i_112_++)
							anIntArray3097[i_112_] = class38_sub23.readUnsignedShort();
					} else if (i == 3)
						this.aBool3091 = true;
					else if (i != 40) {
						if (i != 41) {
							if (i >= 60 && i < 70)
								anIntArray3082[i - 60] = class38_sub23.readUnsignedShort();
						} else {
							int i_113_ = class38_sub23.readUnsignedByte();
							aShortArray3090 = new short[i_113_];
							aShortArray3105 = new short[i_113_];
							for (int i_114_ = 0; i_114_ < i_113_; i_114_++) {
								aShortArray3105[i_114_] = (short) class38_sub23.readUnsignedShort();
								aShortArray3090[i_114_] = (short) class38_sub23.readUnsignedShort();
							}
						}
					} else {
						int i_115_ = class38_sub23.readUnsignedByte();
						aShortArray3103 = new short[i_115_];
						aShortArray3083 = new short[i_115_];
						for (int i_116_ = 0; i_115_ > i_116_; i_116_++) {
							aShortArray3083[i_116_] = (short) class38_sub23.readUnsignedShort();
							aShortArray3103[i_116_] = (short) class38_sub23.readUnsignedShort();
						}
					}
				} else
					this.anInt3102 = class38_sub23.readUnsignedByte();
				if (i_110_ <= -122)
					break;
				this.aBool3091 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "jc.I(" + i + ',' + (class38_sub23 != null ? "{...}" : "null") + ',' + i_110_ + ')');
			}
			break;
		} while (false);
	}

	final Model method1028(int i) {
		try {
			Model[] class38_sub20_sub3_sub3s = new Model[5];
			int i_117_ = 0;
			for (int i_118_ = i; i_118_ < 5; i_118_++)
				if (anIntArray3082[i_118_] != -1)
					class38_sub20_sub3_sub3s[i_117_++] = Model.get(Class38_Sub10_Sub1.aClass17_2646, anIntArray3082[i_118_], 0);
			Model class38_sub20_sub3_sub3 = new Model(class38_sub20_sub3_sub3s, i_117_);
			if (aShortArray3083 != null)
				for (int i_119_ = 0; aShortArray3083.length > i_119_; i_119_++)
					class38_sub20_sub3_sub3.method1128(aShortArray3083[i_119_], aShortArray3103[i_119_]);
			if (aShortArray3105 != null)
				for (int i_120_ = 0; aShortArray3105.length > i_120_; i_120_++)
					class38_sub20_sub3_sub3.method1148(aShortArray3105[i_120_], aShortArray3090[i_120_]);
			return class38_sub20_sub3_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jc.J(" + i + ')');
		}
	}

	public Class38_Sub20_Sub16() {
		anIntArray3082 = new int[] { -1, -1, -1, -1, -1 };
	}

	static {
		Class38_Sub20_Sub16.aClass19_3086 = RSString.createRSString("Too many incorrect logins from your address)3");
		Class38_Sub20_Sub16.aClass19_3092 = RSString.createRSString("sl_flags");
		Class38_Sub20_Sub16.aClass19_3099 = RSString.createRSString("Spieler kann nicht gefunden werden: ");
		Class38_Sub20_Sub16.aClass19_3095 = RSString.createRSString("<)4col>");
		Class38_Sub20_Sub16.aClass19_3101 = Class38_Sub20_Sub16.aClass19_3086;
		Class38_Sub20_Sub16.aClass68Array3096 = new Class68[50];
		Class38_Sub20_Sub16.aClass19_3107 = RSString.createRSString(":trade:");
		Class38_Sub20_Sub16.aClass19_3108 = RSString.createRSString("Username: ");
		Class38_Sub20_Sub16.aClass19_3093 = Class38_Sub20_Sub16.aClass19_3108;
	}
}
