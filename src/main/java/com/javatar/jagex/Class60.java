package com.javatar.jagex;/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

final class Class60 implements KeyListener, FocusListener {
	static int anInt1302;
	static RSString aClass19_1303 = RSString.createRSString("Fallen lassen");
	static Class13 aClass13_1304;
	static Class31 aClass31_1306;
	private static RSString aClass19_1315 = RSString.createRSString("wishes to trade with you)3");
	static Class38_Sub20_Sub9_Sub2 aClass38_Sub20_Sub9_Sub2_1317;
	static RSString aClass19_1319 = Class60.aClass19_1315;
	static int anInt1320;
	static RSString aClass19_1321;

	static final void method451(int i) {
		try {
			Class73.aClass83_1427.method596(24);
			if (i == -1)
				Class38_Sub20_Sub10.aClass83_2902.method596(76);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ld.C(" + i + ')');
		}
	}

	static final void method452(int i) {
		try {
			if (Class23.packetId == 164) {
				int i_0_ = Class15.inputStream.getULEShort();
				int i_1_ = Class15.inputStream.readByteC(i ^ 0x7);
				int i_2_ = Class15.inputStream.getULEShort();
				int i_3_ = Class15.inputStream.readUnsignedByteC(13285);
				int i_4_ = i_3_ >> 2;
				int i_5_ = Class50.anIntArray1103[i_4_];
				int i_6_ = i_3_ & 0x3;
				int i_7_ = Class15.inputStream.method757(-124);
				int i_8_ = Class15.inputStream.readUnsignedShortAdd();
				int i_9_ = Class15.inputStream.method732(127);
				int i_10_ = Class15.inputStream.readUnsignedShort();
				int i_11_ = Class15.inputStream.method757(-75);
				int i_12_ = Class15.inputStream.readUnsignedByteC(13285);
				int i_13_ = ((i_12_ & 0x70) >> 4) + Class2_Sub1.anInt2003;
				int i_14_ = Class64.anInt1358 + (i_12_ & 0x7);
				Player class38_sub20_sub3_sub7_sub2;
				if (i_8_ != Class38_Sub9.anInt2067)
					class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_8_];
				else
					class38_sub20_sub3_sub7_sub2 = Client.myPlayer;
				if (class38_sub20_sub3_sub7_sub2 != null) {
					ObjectDefinition class38_sub20_sub1 = Class80.method581(-126, i_10_);
					int i_15_;
					int i_16_;
					if (i_6_ != 1 && i_6_ != 3) {
						i_15_ = class38_sub20_sub1.anInt2480;
						i_16_ = class38_sub20_sub1.anInt2469;
					} else {
						i_15_ = class38_sub20_sub1.anInt2469;
						i_16_ = class38_sub20_sub1.anInt2480;
					}
					int i_17_ = i_13_ + (i_16_ >> 1);
					int i_18_ = i_13_ + (i_16_ + 1 >> 1);
					int i_19_ = (i_15_ >> 1) + i_14_;
					int i_20_ = (i_15_ + 1 >> 1) + i_14_;
					int[][] is = Player.anIntArrayArrayArray3566[Client.height];
					int i_21_ = is[i_18_][i_20_] + is[i_17_][i_19_] + is[i_18_][i_19_] + is[i_17_][i_20_] >> 2;
					int i_22_ = (i_16_ << 6) + (i_13_ << 7);
					int i_23_ = (i_14_ << 7) + (i_15_ << 6);
					Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = class38_sub20_sub1.method795(i_22_, i_4_, i_23_, i ^ ~0x3216, is, i_6_, i_21_);
					if (class38_sub20_sub3_sub1 != null) {
						if (i_9_ > i_7_) {
							int i_24_ = i_9_;
							i_9_ = i_7_;
							i_7_ = i_24_;
						}
						Class38_Sub8.method658(i_14_, i_2_ + 1, i_13_, -113, i_5_, 0, Client.height, i_0_ + 1, 0, -1);
						class38_sub20_sub3_sub7_sub2.anInt3589 = Class45.anInt1016 + i_0_;
						class38_sub20_sub3_sub7_sub2.anInt3575 = Class45.anInt1016 + i_2_;
						if (i_1_ > i_11_) {
							int i_25_ = i_1_;
							i_1_ = i_11_;
							i_11_ = i_25_;
						}
						class38_sub20_sub3_sub7_sub2.anInt3563 = i_13_ * 128 + i_16_ * 64;
						class38_sub20_sub3_sub7_sub2.anInt3580 = i_21_;
						class38_sub20_sub3_sub7_sub2.anInt3581 = i_1_ + i_14_;
						class38_sub20_sub3_sub7_sub2.anInt3568 = i_9_ + i_13_;
						class38_sub20_sub3_sub7_sub2.anInt3578 = i_7_ + i_13_;
						class38_sub20_sub3_sub7_sub2.aClass38_Sub20_Sub3_Sub1_3590 = class38_sub20_sub3_sub1;
						class38_sub20_sub3_sub7_sub2.anInt3572 = i_11_ + i_14_;
						class38_sub20_sub3_sub7_sub2.anInt3584 = i_15_ * 64 + i_14_ * 128;
					}
				}
			}
			if (Class23.packetId == 26) {
				int i_26_ = Class15.inputStream.getULEShort();
				int i_27_ = Class15.inputStream.readUnsignedByte();
				int i_28_ = Class2_Sub1.anInt2003 + (i_27_ >> 4 & 0x7);
				int i_29_ = Class64.anInt1358 + (i_27_ & 0x7);
				int i_30_ = Class15.inputStream.method740((byte) -49);
				if (i_28_ >= 0 && i_29_ >= 0 && i_28_ < 104 && i_29_ < 104) {
					Class38_Sub20_Sub3_Sub4 class38_sub20_sub3_sub4 = new Class38_Sub20_Sub3_Sub4();
					class38_sub20_sub3_sub4.anInt3351 = i_26_;
					class38_sub20_sub3_sub4.anInt3348 = i_30_;
					if (Class38_Sub21.aClass13ArrayArrayArray2259[Client.height][i_28_][i_29_] == null)
						Class38_Sub21.aClass13ArrayArrayArray2259[Client.height][i_28_][i_29_] = new Class13();
					Class38_Sub21.aClass13ArrayArrayArray2259[Client.height][i_28_][i_29_].method68(class38_sub20_sub3_sub4, (byte) 114);
					Class13.method59(-1, i_29_, i_28_);
				}
			} else if (Class23.packetId == 147) {
				int i_31_ = Class15.inputStream.readUnsignedByte();
				int i_32_ = i_31_ & 0x3;
				int i_33_ = i_31_ >> 2;
				int i_34_ = Class50.anIntArray1103[i_33_];
				int i_35_ = Class15.inputStream.getUByteC();
				int i_36_ = (i_35_ & 0x7) + Class64.anInt1358;
				int i_37_ = (i_35_ >> 4 & 0x7) + Class2_Sub1.anInt2003;
				int i_38_ = Class15.inputStream.readUnsignedShortAdd();
				if (i_37_ >= 0 && i_36_ >= 0 && i_37_ < 103 && i_36_ < 103) {
					if (i_34_ == 0) {
						Class82 class82 = RuntimeException_Sub1.aClass27_3292.method226(Client.height, i_37_, i_36_);
						if (class82 != null) {
							int i_39_ = (class82.anInt1640 & 0x1fffe1bf) >> 14;
							if (i_33_ == 2) {
								class82.aClass38_Sub20_Sub3_1627 = new Class38_Sub20_Sub3_Sub2(i_39_, 2, i_32_ + 4, Client.height, i_37_, i_36_, i_38_, false, class82.aClass38_Sub20_Sub3_1627);
								class82.aClass38_Sub20_Sub3_1630 = new Class38_Sub20_Sub3_Sub2(i_39_, 2, i_32_ + 1 & 0x3, Client.height, i_37_, i_36_, i_38_, false, class82.aClass38_Sub20_Sub3_1630);
							} else
								class82.aClass38_Sub20_Sub3_1627 = new Class38_Sub20_Sub3_Sub2(i_39_, i_33_, i_32_, Client.height, i_37_, i_36_, i_38_, false, class82.aClass38_Sub20_Sub3_1627);
						}
					}
					if (i_34_ == 1) {
						Class43 class43 = RuntimeException_Sub1.aClass27_3292.method253(Client.height, i_37_, i_36_);
						if (class43 != null) {
							int i_40_ = class43.anInt975 >> 14 & 0x7fff;
							if (i_33_ != 4 && i_33_ != 5) {
								if (i_33_ != 6) {
									if (i_33_ == 7)
										class43.aClass38_Sub20_Sub3_981 = new Class38_Sub20_Sub3_Sub2(i_40_, 4, (i_32_ + 2 & 0x3) + 4, Client.height, i_37_, i_36_, i_38_, false, class43.aClass38_Sub20_Sub3_981);
									else if (i_33_ == 8) {
										class43.aClass38_Sub20_Sub3_981 = new Class38_Sub20_Sub3_Sub2(i_40_, 4, i_32_ + 4, Client.height, i_37_, i_36_, i_38_, false, class43.aClass38_Sub20_Sub3_981);
										class43.aClass38_Sub20_Sub3_967 = new Class38_Sub20_Sub3_Sub2(i_40_, 4, (i_32_ + 2 & 0x3) + 4, Client.height, i_37_, i_36_, i_38_, false, class43.aClass38_Sub20_Sub3_967);
									}
								} else
									class43.aClass38_Sub20_Sub3_981 = new Class38_Sub20_Sub3_Sub2(i_40_, 4, i_32_ + 4, Client.height, i_37_, i_36_, i_38_, false, class43.aClass38_Sub20_Sub3_981);
							} else
								class43.aClass38_Sub20_Sub3_981 = new Class38_Sub20_Sub3_Sub2(i_40_, 4, i_32_, Client.height, i_37_, i_36_, i_38_, false, class43.aClass38_Sub20_Sub3_981);
						}
					}
					if (i_34_ == 2) {
						Class3 class3 = RuntimeException_Sub1.aClass27_3292.method222(Client.height, i_37_, i_36_);
						if (i_33_ == 11)
							i_33_ = 10;
						if (class3 != null)
							class3.aClass38_Sub20_Sub3_53 = new Class38_Sub20_Sub3_Sub2((class3.anInt62 & 0x1fffe914) >> 14, i_33_, i_32_, Client.height, i_37_, i_36_, i_38_, false, class3.aClass38_Sub20_Sub3_53);
					}
					if (i_34_ == 3) {
						Class49 class49 = RuntimeException_Sub1.aClass27_3292.method263(Client.height, i_37_, i_36_);
						if (class49 != null)
							class49.aClass38_Sub20_Sub3_1101 = new Class38_Sub20_Sub3_Sub2((class49.anInt1097 & 0x1ffff451) >> 14, 22, i_32_, Client.height, i_37_, i_36_, i_38_, false, class49.aClass38_Sub20_Sub3_1101);
					}
				}
			} else if (Class23.packetId == 32) {
				int i_41_ = Class15.inputStream.getUByteC();
				int i_42_ = (i_41_ >> 4 & 0x7) + Class2_Sub1.anInt2003;
				int i_43_ = (i_41_ & 0x7) + Class64.anInt1358;
				int i_44_ = Class15.inputStream.getULEShort();
				if (i_42_ >= 0 && i_43_ >= 0 && i_42_ < 104 && i_43_ < 104) {
					Class13 class13 = Class38_Sub21.aClass13ArrayArrayArray2259[Client.height][i_42_][i_43_];
					if (class13 != null) {
						for (Class38_Sub20_Sub3_Sub4 class38_sub20_sub3_sub4 = (Class38_Sub20_Sub3_Sub4) class13.method65(88); class38_sub20_sub3_sub4 != null; class38_sub20_sub3_sub4 = (Class38_Sub20_Sub3_Sub4) class13.method63(-3))
							if ((i_44_ & 0x7fff) == class38_sub20_sub3_sub4.anInt3348) {
								class38_sub20_sub3_sub4.method330(0);
								break;
							}
						if (class13.method65(i ^ 0x75) == null)
							Class38_Sub21.aClass13ArrayArrayArray2259[Client.height][i_42_][i_43_] = null;
						Class13.method59(-1, i_43_, i_42_);
					}
				}
			} else if (Class23.packetId == 138) {
				int i_45_ = Class15.inputStream.readUnsignedByte();
				int i_46_ = (i_45_ >> 4 & 0x7) + Class2_Sub1.anInt2003;
				int i_47_ = (i_45_ & 0x7) + Class64.anInt1358;
				int i_48_ = Class15.inputStream.readUnsignedShort();
				int i_49_ = Class15.inputStream.readUnsignedShort();
				int i_50_ = Class15.inputStream.readUnsignedShort();
				if (i_46_ >= 0 && i_47_ >= 0 && i_46_ < 104 && i_47_ < 104) {
					Class13 class13 = Class38_Sub21.aClass13ArrayArrayArray2259[Client.height][i_46_][i_47_];
					if (class13 != null) {
						for (Class38_Sub20_Sub3_Sub4 class38_sub20_sub3_sub4 = (Class38_Sub20_Sub3_Sub4) class13.method65(88); class38_sub20_sub3_sub4 != null; class38_sub20_sub3_sub4 = (Class38_Sub20_Sub3_Sub4) class13.method63(i ^ ~0x5))
							if ((i_48_ & 0x7fff) == class38_sub20_sub3_sub4.anInt3348 && i_49_ == class38_sub20_sub3_sub4.anInt3351) {
								class38_sub20_sub3_sub4.anInt3351 = i_50_;
								break;
							}
						Class13.method59(-1, i_47_, i_46_);
					}
				}
			} else if (Class23.packetId == 150) {
				int i_51_ = Class15.inputStream.method741(88);
				int i_52_ = i_51_ >> 2;
				int i_53_ = i_51_ & 0x3;
				int i_54_ = Class50.anIntArray1103[i_52_];
				int i_55_ = Class15.inputStream.getUByteC();
				int i_56_ = Class2_Sub1.anInt2003 + ((i_55_ & 0x78) >> 4);
				int i_57_ = Class64.anInt1358 + (i_55_ & 0x7);
				if (i_56_ >= 0 && i_57_ >= 0 && i_56_ < 104 && i_57_ < 104)
					Class38_Sub8.method658(i_57_, 0, i_56_, -88, i_54_, i_53_, Client.height, -1, i_52_, -1);
			} else if (Class23.packetId == 120) {
				int i_58_ = Class15.inputStream.readUnsignedByte();
				int i_59_ = Class64.anInt1358 + (i_58_ & 0x7);
				int i_60_ = (i_58_ >> 4 & 0x7) + Class2_Sub1.anInt2003;
				int i_61_ = Class15.inputStream.readUnsignedShort();
				int i_62_ = Class15.inputStream.readUnsignedByte();
				int i_63_ = Class15.inputStream.readUnsignedShort();
				if (i_60_ >= 0 && i_59_ >= 0 && i_60_ < 104 && i_59_ < 104) {
					i_59_ = i_59_ * 128 + 64;
					i_60_ = i_60_ * 128 + 64;
					Class38_Sub20_Sub3_Sub5 class38_sub20_sub3_sub5 = new Class38_Sub20_Sub3_Sub5(i_61_, Client.height, i_60_, i_59_, Class35.method317(-5736, Client.height, i_60_, i_59_) - i_62_, i_63_, Class45.anInt1016);
					Class13.aClass13_235.method68(class38_sub20_sub3_sub5, (byte) 97);
				}
			} else if (Class23.packetId == 103) {
				int i_64_ = Class15.inputStream.getULEShort();
				int i_65_ = Class15.inputStream.readUnsignedShortAdd();
				int i_66_ = Class15.inputStream.readUnsignedByteC(i + 13278);
				int i_67_ = Class2_Sub1.anInt2003 + ((i_66_ & 0x7a) >> 4);
				int i_68_ = Class64.anInt1358 + (i_66_ & 0x7);
				int i_69_ = Class15.inputStream.method740((byte) 112);
				if (i_67_ >= 0 && i_68_ >= 0 && i_67_ < 104 && i_68_ < 104 && Class38_Sub9.anInt2067 != i_65_) {
					Class38_Sub20_Sub3_Sub4 class38_sub20_sub3_sub4 = new Class38_Sub20_Sub3_Sub4();
					class38_sub20_sub3_sub4.anInt3348 = i_69_;
					class38_sub20_sub3_sub4.anInt3351 = i_64_;
					if (Class38_Sub21.aClass13ArrayArrayArray2259[Client.height][i_67_][i_68_] == null)
						Class38_Sub21.aClass13ArrayArrayArray2259[Client.height][i_67_][i_68_] = new Class13();
					Class38_Sub21.aClass13ArrayArrayArray2259[Client.height][i_67_][i_68_].method68(class38_sub20_sub3_sub4, (byte) 122);
					Class13.method59(-1, i_68_, i_67_);
				}
			} else {
				if (i != 7)
					Class60.aClass13_1304 = null;
				if (Class23.packetId == 105) {
					int i_70_ = Class15.inputStream.getUByteC();
					int i_71_ = i_70_ >> 2;
					int i_72_ = i_70_ & 0x3;
					int i_73_ = Class50.anIntArray1103[i_71_];
					int i_74_ = Class15.inputStream.readUnsignedShortAdd();
					int i_75_ = Class15.inputStream.method741(122);
					int i_76_ = (i_75_ >> 4 & 0x7) + Class2_Sub1.anInt2003;
					int i_77_ = (i_75_ & 0x7) + Class64.anInt1358;
					if (i_76_ >= 0 && i_77_ >= 0 && i_76_ < 104 && i_77_ < 104)
						Class38_Sub8.method658(i_77_, 0, i_76_, -99, i_73_, i_72_, Client.height, -1, i_71_, i_74_);
				} else {
					if (Class23.packetId == 195) {
						int i_78_ = Class15.inputStream.readUnsignedByte();
						int i_79_ = Class2_Sub1.anInt2003 + (i_78_ >> 4 & 0x7);
						int i_80_ = (i_78_ & 0x7) + Class64.anInt1358;
						int i_81_ = Class15.inputStream.readUnsignedShort();
						int i_82_ = Class15.inputStream.readUnsignedByte();
						int i_83_ = Class15.inputStream.readUnsignedByte();
						int i_84_ = i_82_ & 0x7;
						int i_85_ = i_82_ >> 4 & 0xf;
						if (i_79_ >= 0 && i_80_ >= 0 && i_79_ < 104 && i_80_ < 104) {
							int i_86_ = i_85_ + 1;
							if (-i_86_ + i_79_ <= ((Entity) Client.myPlayer).walkQueueX[0] && ((Entity) Client.myPlayer).walkQueueX[0] <= i_86_ + i_79_ && -i_86_ + i_80_ <= ((Entity) Client.myPlayer).walkQueueY[0] && ((Entity) Client.myPlayer).walkQueueY[0] <= i_80_ + i_86_ && Class77.anInt1505 != 0 && i_84_ > 0 && Class38_Sub20_Sub10.anInt2910 < 50) {
								ObjectDefinition.anIntArray2442[Class38_Sub20_Sub10.anInt2910] = i_81_;
								Class61.anIntArray1330[Class38_Sub20_Sub10.anInt2910] = i_84_;
								Class76.anIntArray1495[Class38_Sub20_Sub10.anInt2910] = i_83_;
								Class38_Sub20_Sub16.aClass68Array3096[Class38_Sub20_Sub10.anInt2910] = null;
								Class77.anIntArray1531[Class38_Sub20_Sub10.anInt2910] = i_85_ + (i_80_ << 8) + (i_79_ << 16);
								Class38_Sub20_Sub10.anInt2910++;
							}
						}
					}
					if (Class23.packetId == 82) {
						int i_87_ = Class15.inputStream.readUnsignedByte();
						int i_88_ = ((i_87_ & 0x71) >> 4) + Class2_Sub1.anInt2003;
						int i_89_ = Class64.anInt1358 + (i_87_ & 0x7);
						int i_90_ = i_88_ + Class15.inputStream.readByte((byte) 123);
						int i_91_ = Class15.inputStream.readByte((byte) 123) + i_89_;
						int i_92_ = Class15.inputStream.method772(false);
						int i_93_ = Class15.inputStream.readUnsignedShort();
						int i_94_ = Class15.inputStream.readUnsignedByte() * 4;
						int i_95_ = Class15.inputStream.readUnsignedByte() * 4;
						int i_96_ = Class15.inputStream.readUnsignedShort();
						int i_97_ = Class15.inputStream.readUnsignedShort();
						int i_98_ = Class15.inputStream.readUnsignedByte();
						int i_99_ = Class15.inputStream.readUnsignedByte();
						if (i_88_ >= 0 && i_89_ >= 0 && i_88_ < 104 && i_89_ < 104 && i_90_ >= 0 && i_91_ >= 0 && i_90_ < 104 && i_91_ < 104 && i_93_ != 65535) {
							i_89_ = i_89_ * 128 + 64;
							i_88_ = i_88_ * 128 + 64;
							i_91_ = i_91_ * 128 + 64;
							Projectile class38_sub20_sub3_sub6 = new Projectile(i_93_, Client.height, i_88_, i_89_, -i_94_ + Class35.method317(-5736, Client.height, i_88_, i_89_), Class45.anInt1016 + i_96_, Class45.anInt1016 + i_97_, i_98_, i_99_, i_92_, i_95_);
							i_90_ = i_90_ * 128 + 64;
							class38_sub20_sub3_sub6.method1170(i_91_, i_90_, (byte) 98, i_96_ + Class45.anInt1016, -i_95_ + Class35.method317(-5736, Client.height, i_90_, i_91_));
							Class28.aClass13_686.method68(class38_sub20_sub3_sub6, (byte) 62);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ld.D(" + i + ')');
		}
	}

	public Class60() {
		/* empty */
	}

	static final void method453(byte i, int i_100_, int i_101_, int i_102_) {
		try {
			WidgetComponent class38_sub6 = Class38_Sub20_Sub12.method987(i_100_, i_101_, (byte) -29);
			if (class38_sub6 != null && class38_sub6.anObjectArray1950 != null) {
				Class38_Sub19 class38_sub19 = new Class38_Sub19();
				class38_sub19.aClass38_Sub6_2241 = class38_sub6;
				class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1950;
				Class15.method84(class38_sub19, (byte) -102);
			}
			int i_103_ = -10 / ((58 - i) / 61);
			Node.anInt893 = i_100_;
			Class28.anInt693 = i_102_;
			Class2_Sub1.anInt2008 = i_101_;
			Class26.aBool614 = true;
			Class40.method340(class38_sub6, (byte) -114);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ld.A(" + i + ',' + i_100_ + ',' + i_101_ + ',' + i_102_ + ')');
		}
	}

	@Override
	public final void focusGained(FocusEvent focusevent) {
		/* empty */
	}

	static final Class38_Sub8 method454(int i, int i_104_, int i_105_, int i_106_) {
		try {
			Class38_Sub8 class38_sub8 = new Class38_Sub8();
			class38_sub8.anInt2049 = i;
			class38_sub8.anInt2038 = i_104_;
			Class10.aClass14_190.method80(true, i_105_, class38_sub8);
			Client.method1231(0, i_104_);
			if (i_106_ != 22878)
				Class60.aClass13_1304 = null;
			Class78.method566(i_104_, 50);
			WidgetComponent class38_sub6 = Projectile.method1167(i_105_, 125);
			if (class38_sub6 != null)
				Class40.method340(class38_sub6, (byte) -113);
			if (Class38_Sub2.aClass38_Sub6_1769 != null) {
				Class40.method340(Class38_Sub2.aClass38_Sub6_1769, (byte) -123);
				Class38_Sub2.aClass38_Sub6_1769 = null;
			}
			SceneModel.aBool2553 = false;
			Class72.anInt1417 = 0;
			ItemDefinition.method931(100, WidgetComponent.anInt1976, Class38_Sub20_Sub13.anInt3011, Class3.anInt66, Class38_Sub20_Sub2.anInt2540);
			if (NodeSub.windowId != -1)
				Class38_Sub4.method625(NodeSub.windowId, 1, (byte) 105);
			return class38_sub8;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ld.E(" + i + ',' + i_104_ + ',' + i_105_ + ',' + i_106_ + ')');
		}
	}

	@Override
	public final synchronized void focusLost(FocusEvent focusevent) {
		do {
			try {
				if (Class38_Sub11.aClass60_2099 == null)
					break;
				Class53.anInt1165 = -1;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ld.focusLost(" + (focusevent != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static void method455(int i, SceneGraph class27, byte[] is, Class74[] class74s, int i_107_, int i_108_) {
		try {
			if (i_107_ > -108)
				Class60.method456(true);
			int objectId = -1;
			RS2Buffer buffer = new RS2Buffer(is);
			for (;;) {
				int offset = buffer.readSmallShort();
				if (offset == 0)
					break;
				objectId += offset;
				int location = 0;
				for (;;) {
					int locOffset = buffer.readSmallShort();
					if (locOffset == 0)
						break;
					location += locOffset - 1;
					int i_113_ = location >> 6 & 0x3f;
					int i_114_ = location & 0x3f;
					int i_115_ = location >> 12;
					int i_116_ = buffer.readUnsignedByte();
					int i_117_ = i_116_ >> 2;
					int i_118_ = i_116_ & 0x3;
					int i_119_ = i + i_113_;
					int i_120_ = i_108_ + i_114_;
					if (i_119_ > 0 && i_120_ > 0 && i_119_ < 103 && i_120_ < 103) {
						int i_121_ = i_115_;
						if ((Class82.aByteArrayArrayArray1648[1][i_119_][i_120_] & 0x2) == 2)
							i_121_--;
						Class74 class74 = null;
						if (i_121_ >= 0)
							class74 = class74s[i_121_];
						Class10.method53(class27, i_120_, i_117_, objectId, i_118_, class74, i_115_, i_119_, (byte) -76);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ld.F(" + i + ',' + (class27 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + (class74s != null ? "{...}" : "null") + ',' + i_107_ + ',' + i_108_ + ')');
		}
	}

	@Override
	public final synchronized void keyReleased(KeyEvent keyevent) {
		try {
			if (Class38_Sub11.aClass60_2099 != null) {
				Client.keyboardIdleTime = 0;
				int i = keyevent.getKeyCode();
				if (i >= 0 && i < Class38_Sub14.anIntArray2143.length)
					i = Class38_Sub14.anIntArray2143[i] & ~0x80;
				else
					i = -1;
				if (Class53.anInt1165 >= 0 && i >= 0) {
					Class38_Sub20_Sub17.anIntArray3112[Class53.anInt1165] = i ^ 0xffffffff;
					Class53.anInt1165 = Class53.anInt1165 + 1 & 0x7f;
					if (Class53.anInt1165 == Class77.anInt1519)
						Class53.anInt1165 = -1;
				}
			}
			keyevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ld.keyReleased(" + (keyevent != null ? "{...}" : "null") + ')');
		}
	}

	public static void method456(boolean bool) {
		try {
			Class60.aClass19_1319 = null;
			Class60.aClass19_1303 = null;
			Class60.aClass31_1306 = null;
			Class60.aClass38_Sub20_Sub9_Sub2_1317 = null;
			if (!bool) {
				Class60.aClass13_1304 = null;
				Class60.aClass19_1321 = null;
				Class60.aClass19_1315 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ld.G(" + bool + ')');
		}
	}

	@Override
	public final void keyTyped(KeyEvent keyevent) {
		try {
			int i = Class38_Sub22.method723((byte) -57, keyevent);
			if (i >= 0) {
				int i_122_ = ItemDefinition.anInt2775 + 1 & 0x7f;
				if (Class33.anInt786 != i_122_) {
					Class38_Sub8.anIntArray2043[ItemDefinition.anInt2775] = -1;
					Class38_Sub20_Sub3_Sub2.anIntArray3264[ItemDefinition.anInt2775] = i;
					ItemDefinition.anInt2775 = i_122_;
				}
			}
			keyevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ld.keyTyped(" + (keyevent != null ? "{...}" : "null") + ')');
		}
	}

	static final Class38_Sub20_Sub17 method457(int i, byte i_123_) {
		try {
			Class38_Sub20_Sub17 class38_sub20_sub17 = (Class38_Sub20_Sub17) ItemDefinition.aClass83_2785.method591(-28825, i);
			int i_124_ = 27 / ((-60 - i_123_) / 39);
			if (class38_sub20_sub17 != null)
				return class38_sub20_sub17;
			byte[] is = Class38_Sub18.aClass17_2205.getFileData(14, i, -122);
			class38_sub20_sub17 = new Class38_Sub20_Sub17();
			if (is != null)
				class38_sub20_sub17.method1031(new RS2Buffer(is), 109);
			ItemDefinition.aClass83_2785.method590(i, (byte) -120, class38_sub20_sub17);
			return class38_sub20_sub17;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ld.B(" + i + ',' + i_123_ + ')');
		}
	}

	@Override
	public final synchronized void keyPressed(KeyEvent keyevent) {
		try {
			if (Class38_Sub11.aClass60_2099 != null) {
				Client.keyboardIdleTime = 0;
				int i = keyevent.getKeyCode();
				if (i >= 0 && Class38_Sub14.anIntArray2143.length > i) {
					i = Class38_Sub14.anIntArray2143[i];
					if ((i & 0x80) != 0)
						i = -1;
				} else
					i = -1;
				if (Class53.anInt1165 >= 0 && i >= 0) {
					Class38_Sub20_Sub17.anIntArray3112[Class53.anInt1165] = i;
					Class53.anInt1165 = Class53.anInt1165 + 1 & 0x7f;
					if (Class53.anInt1165 == Class77.anInt1519)
						Class53.anInt1165 = -1;
				}
				if (i >= 0) {
					int i_125_ = ItemDefinition.anInt2775 + 1 & 0x7f;
					if (Class33.anInt786 != i_125_) {
						Class38_Sub8.anIntArray2043[ItemDefinition.anInt2775] = i;
						Class38_Sub20_Sub3_Sub2.anIntArray3264[ItemDefinition.anInt2775] = -1;
						ItemDefinition.anInt2775 = i_125_;
					}
				}
				int i_126_ = keyevent.getModifiers();
				if ((i_126_ & 0xa) != 0 || i == 85 || i == 10)
					keyevent.consume();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ld.keyPressed(" + (keyevent != null ? "{...}" : "null") + ')');
		}
	}

	static {
		Class60.aClass13_1304 = new Class13();
		Class60.anInt1320 = 0;
		Class60.aClass19_1321 = RSString.createRSString("zur-Uck auf die RuneScape)2Webseite gehen");
	}
}
