package com.javatar.jagex;/* Class38_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub18 extends Node {
	Class38_Sub16_Sub1[] aClass38_Sub16_Sub1Array2201;
	static RSString aClass19_2202;
	int anInt2204;
	static Class17 aClass17_2205;
	private static RSString aClass19_2206;
	static int anInt2208 = 0;
	static int anInt2209;
	byte[] aByteArray2210;
	byte[] aByteArray2211;
	short[] aShortArray2212;
	static int anInt2214;
	static int anInt2217;
	static RSString aClass19_2219;
	byte[] aByteArray2220;
	private int[] anIntArray2222;
	static int[] anIntArray2223;
	Class52[] aClass52Array2224;

	static final Object method697(int i, byte[] is, boolean bool) {
		try {
			int i_0_ = 114 / ((i + 84) / 39);
			if (is == null)
				return null;
			if (is.length > 136 && !Entity.aBool3511)
				try {
					Class59 class59 = (Class59) Class.forName("bb").newInstance();
					class59.method447(is, (byte) -125);
					return class59;
				} catch (Throwable throwable) {
					Entity.aBool3511 = true;
				}
			if (!bool)
				return is;
			return Class23.method204(49, is);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kd.F(" + i + ',' + (is != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	final void method698(boolean bool) {
		try {
			anIntArray2222 = null;
			if (bool)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kd.A(" + bool + ')');
		}
	}

	public static void method700(int i) {
		try {
			Class38_Sub18.aClass19_2206 = null;
			Class38_Sub18.aClass17_2205 = null;
			Class38_Sub18.aClass19_2219 = null;
			Class38_Sub18.anIntArray2223 = null;
			Class38_Sub18.aClass19_2202 = null;
			int i_4_ = 126 / ((i + 47) / 57);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kd.G(" + i + ')');
		}
	}

	final boolean method701(int i, Class79 class79, byte[] is, int[] is_5_) {
		try {
			boolean bool = true;
			Class38_Sub16_Sub1 class38_sub16_sub1 = null;
			int i_6_ = 0;
			if (i != 1)
				Class38_Sub18.method697(101, null, true);
			for (int i_7_ = 0; i_7_ < 128; i_7_++)
				if (is == null || is[i_7_] != 0) {
					int i_8_ = anIntArray2222[i_7_];
					if (i_8_ != 0) {
						if (i_6_ != i_8_) {
							i_6_ = i_8_;
							if ((--i_8_ & 0x1) == 0)
								class38_sub16_sub1 = class79.method572(i_8_ >> -1169567422, (byte) 111, is_5_);
							else
								class38_sub16_sub1 = class79.method573(is_5_, (byte) -33, i_8_ >> 423621122);
							if (class38_sub16_sub1 == null)
								bool = false;
						}
						if (class38_sub16_sub1 != null) {
							this.aClass38_Sub16_Sub1Array2201[i_7_] = class38_sub16_sub1;
							anIntArray2222[i_7_] = 0;
						}
					}
				}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kd.E(" + i + ',' + (class79 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + (is_5_ != null ? "{...}" : "null") + ')');
		}
	}

	static final void method702(int i, long l) {
		try {
			try {
				Thread.sleep(l);
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			int i_9_ = -7 % ((-44 - i) / 43);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kd.C(" + i + ',' + l + ')');
		}
	}

	static final int method703(int i, int i_10_, int i_11_) {
		try {
			Class38_Sub3 class38_sub3 = (Class38_Sub3) Class38_Sub20_Sub8.aClass14_2863.method75(i_11_);
			if (class38_sub3 == null)
				return -1;
			if (i != 0)
				return 101;
			if (i_10_ < 0 || i_10_ >= class38_sub3.anIntArray1781.length)
				return -1;
			return class38_sub3.anIntArray1781[i_10_];
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kd.B(" + i + ',' + i_10_ + ',' + i_11_ + ')');
		}
	}

	public Class38_Sub18() {
		/* empty */
	}

	Class38_Sub18(byte[] is) {
		try {
			this.aByteArray2210 = new byte[128];
			this.aClass52Array2224 = new Class52[128];
			anIntArray2222 = new int[128];
			this.aClass38_Sub16_Sub1Array2201 = new Class38_Sub16_Sub1[128];
			int i = 0;
			this.aByteArray2220 = new byte[128];
			this.aByteArray2211 = new byte[128];
			this.aShortArray2212 = new short[128];
			RS2Buffer class38_sub23;
			for (class38_sub23 = new RS2Buffer(is); class38_sub23.buffer[class38_sub23.pos + i] != 0; i++) {
				/* empty */
			}
			byte[] is_12_ = new byte[i];
			for (int i_13_ = 0; i_13_ < i; i_13_++)
				is_12_[i_13_] = class38_sub23.readByte((byte) 100);
			class38_sub23.pos++;
			i++;
			int i_14_ = class38_sub23.pos;
			int i_15_ = 0;
			for (class38_sub23.pos += i; class38_sub23.buffer[class38_sub23.pos + i_15_] != 0; i_15_++) {
				/* empty */
			}
			byte[] is_16_ = new byte[i_15_];
			for (int i_17_ = 0; i_15_ > i_17_; i_17_++)
				is_16_[i_17_] = class38_sub23.readByte((byte) 95);
			i_15_++;
			int i_18_ = 0;
			class38_sub23.pos++;
			int i_19_ = class38_sub23.pos;
			for (class38_sub23.pos += i_15_; class38_sub23.buffer[i_18_ + class38_sub23.pos] != 0; i_18_++) {
				/* empty */
			}
			byte[] is_20_ = new byte[i_18_];
			for (int i_21_ = 0; i_21_ < i_18_; i_21_++)
				is_20_[i_21_] = class38_sub23.readByte((byte) 107);
			class38_sub23.pos++;
			byte[] is_22_ = new byte[++i_18_];
			int i_23_;
			if (i_18_ <= 1)
				i_23_ = i_18_;
			else {
				i_23_ = 2;
				int i_24_ = 1;
				is_22_[1] = (byte) 1;
				for (int i_25_ = 2; i_25_ < i_18_; i_25_++) {
					int i_26_ = class38_sub23.readUnsignedByte();
					if (i_26_ != 0) {
						if (i_24_ >= i_26_)
							i_26_--;
						i_24_ = i_26_;
					} else
						i_24_ = i_23_++;
					is_22_[i_25_] = (byte) i_24_;
				}
			}
			Class52[] class52s = new Class52[i_23_];
			for (int i_27_ = 0; class52s.length > i_27_; i_27_++) {
				Class52 class52 = class52s[i_27_] = new Class52();
				int i_28_ = class38_sub23.readUnsignedByte();
				if (i_28_ > 0)
					class52.aByteArray1139 = new byte[i_28_ * 2];
				i_28_ = class38_sub23.readUnsignedByte();
				if (i_28_ > 0) {
					class52.aByteArray1153 = new byte[i_28_ * 2 + 2];
					class52.aByteArray1153[1] = (byte) 64;
				}
			}
			int i_29_ = class38_sub23.readUnsignedByte();
			byte[] is_30_ = i_29_ <= 0 ? null : new byte[i_29_ * 2];
			int i_31_ = 0;
			i_29_ = class38_sub23.readUnsignedByte();
			byte[] is_32_ = i_29_ <= 0 ? null : new byte[i_29_ * 2];
			for (/**/; class38_sub23.buffer[i_31_ + class38_sub23.pos] != 0; i_31_++) {
				/* empty */
			}
			byte[] is_33_ = new byte[i_31_];
			for (int i_34_ = 0; i_31_ > i_34_; i_34_++)
				is_33_[i_34_] = class38_sub23.readByte((byte) 99);
			i_31_++;
			class38_sub23.pos++;
			int i_35_ = 0;
			for (int i_36_ = 0; i_36_ < 128; i_36_++) {
				i_35_ += class38_sub23.readUnsignedByte();
				this.aShortArray2212[i_36_] = (short) i_35_;
			}
			i_35_ = 0;
			for (int i_37_ = 0; i_37_ < 128; i_37_++) {
				i_35_ += class38_sub23.readUnsignedByte();
				this.aShortArray2212[i_37_] += i_35_ << 1243250600;
			}
			int i_38_ = 0;
			int i_39_ = 0;
			int i_40_ = 0;
			for (int i_41_ = 0; i_41_ < 128; i_41_++) {
				if (i_38_ == 0) {
					if (i_40_ < is_33_.length)
						i_38_ = is_33_[i_40_++];
					else
						i_38_ = -1;
					i_39_ = class38_sub23.method731(-1592222329);
				}
				i_38_--;
				this.aShortArray2212[i_41_] += Class38_Sub10_Sub3.method941(2, i_39_ - 1) << -882610578;
				anIntArray2222[i_41_] = i_39_;
			}
			i_40_ = 0;
			int i_42_ = 0;
			i_38_ = 0;
			for (int i_43_ = 0; i_43_ < 128; i_43_++)
				if (anIntArray2222[i_43_] != 0) {
					if (i_38_ == 0) {
						if (is_12_.length > i_40_)
							i_38_ = is_12_[i_40_++];
						else
							i_38_ = -1;
						i_42_ = class38_sub23.buffer[i_14_++] - 1;
					}
					i_38_--;
					this.aByteArray2220[i_43_] = (byte) i_42_;
				}
			i_38_ = 0;
			i_40_ = 0;
			int i_44_ = 0;
			for (int i_45_ = 0; i_45_ < 128; i_45_++)
				if (anIntArray2222[i_45_] != 0) {
					if (i_38_ == 0) {
						i_44_ = class38_sub23.buffer[i_19_++] + 16 << -117507678;
						if (is_16_.length <= i_40_)
							i_38_ = -1;
						else
							i_38_ = is_16_[i_40_++];
					}
					this.aByteArray2210[i_45_] = (byte) i_44_;
					i_38_--;
				}
			i_40_ = 0;
			Class52 class52 = null;
			i_38_ = 0;
			for (int i_46_ = 0; i_46_ < 128; i_46_++)
				if (anIntArray2222[i_46_] != 0) {
					if (i_38_ == 0) {
						class52 = class52s[is_22_[i_40_]];
						if (is_20_.length <= i_40_)
							i_38_ = -1;
						else
							i_38_ = is_20_[i_40_++];
					}
					this.aClass52Array2224[i_46_] = class52;
					i_38_--;
				}
			i_40_ = 0;
			i_38_ = 0;
			int i_47_ = 0;
			for (int i_48_ = 0; i_48_ < 128; i_48_++) {
				if (i_38_ == 0) {
					if (i_40_ >= is_33_.length)
						i_38_ = -1;
					else
						i_38_ = is_33_[i_40_++];
					if (anIntArray2222[i_48_] > 0)
						i_47_ = class38_sub23.readUnsignedByte() + 1;
				}
				i_38_--;
				this.aByteArray2211[i_48_] = (byte) i_47_;
			}
			this.anInt2204 = class38_sub23.readUnsignedByte() + 1;
			for (int i_49_ = 0; i_49_ < i_23_; i_49_++) {
				Class52 class52_50_ = class52s[i_49_];
				if (class52_50_.aByteArray1139 != null)
					for (int i_51_ = 1; i_51_ < class52_50_.aByteArray1139.length; i_51_ += 2)
						class52_50_.aByteArray1139[i_51_] = class38_sub23.readByte((byte) 95);
				if (class52_50_.aByteArray1153 != null)
					for (int i_52_ = 3; i_52_ < class52_50_.aByteArray1153.length - 2; i_52_ += 2)
						class52_50_.aByteArray1153[i_52_] = class38_sub23.readByte((byte) 123);
			}
			if (is_30_ != null)
				for (int i_53_ = 1; i_53_ < is_30_.length; i_53_ += 2)
					is_30_[i_53_] = class38_sub23.readByte((byte) 118);
			if (is_32_ != null)
				for (int i_54_ = 1; is_32_.length > i_54_; i_54_ += 2)
					is_32_[i_54_] = class38_sub23.readByte((byte) 106);
			for (int i_55_ = 0; i_23_ > i_55_; i_55_++) {
				Class52 class52_56_ = class52s[i_55_];
				if (class52_56_.aByteArray1153 != null) {
					i_35_ = 0;
					for (int i_57_ = 2; i_57_ < class52_56_.aByteArray1153.length; i_57_ += 2) {
						i_35_ -= -class38_sub23.readUnsignedByte() - 1;
						class52_56_.aByteArray1153[i_57_] = (byte) i_35_;
					}
				}
			}
			for (int i_58_ = 0; i_58_ < i_23_; i_58_++) {
				Class52 class52_59_ = class52s[i_58_];
				if (class52_59_.aByteArray1139 != null) {
					i_35_ = 0;
					for (int i_60_ = 2; i_60_ < class52_59_.aByteArray1139.length; i_60_ += 2) {
						i_35_ = class38_sub23.readUnsignedByte() + i_35_ + 1;
						class52_59_.aByteArray1139[i_60_] = (byte) i_35_;
					}
				}
			}
			if (is_30_ != null) {
				i_35_ = class38_sub23.readUnsignedByte();
				is_30_[0] = (byte) i_35_;
				for (int i_61_ = 2; i_61_ < is_30_.length; i_61_ += 2) {
					i_35_ = i_35_ + 1 + class38_sub23.readUnsignedByte();
					is_30_[i_61_] = (byte) i_35_;
				}
				int i_62_ = is_30_[0];
				int i_63_ = is_30_[1];
				for (int i_64_ = 0; i_64_ < i_62_; i_64_++)
					this.aByteArray2211[i_64_] = (byte) (i_63_ * this.aByteArray2211[i_64_] + 32 >> 1937125126);
				int i_65_ = 2;
				while (is_30_.length > i_65_) {
					int i_66_ = is_30_[i_65_];
					int i_67_ = is_30_[i_65_ + 1];
					int i_68_ = (i_66_ - i_62_) / 2 + (-i_62_ + i_66_) * i_63_;
					i_65_ += 2;
					for (int i_69_ = i_62_; i_66_ > i_69_; i_69_++) {
						int i_70_ = Entity.method1174(i_68_, i_66_ - i_62_, (byte) -127);
						this.aByteArray2211[i_69_] = (byte) (this.aByteArray2211[i_69_] * i_70_ + 32 >> -1175581370);
						i_68_ += i_67_ - i_63_;
					}
					i_62_ = i_66_;
					i_63_ = i_67_;
				}
				Object object = null;
				for (int i_71_ = i_62_; i_71_ < 128; i_71_++)
					this.aByteArray2211[i_71_] = (byte) (this.aByteArray2211[i_71_] * i_63_ + 32 >> -1453945178);
			}
			if (is_32_ != null) {
				i_35_ = class38_sub23.readUnsignedByte();
				is_32_[0] = (byte) i_35_;
				for (int i_72_ = 2; is_32_.length > i_72_; i_72_ += 2) {
					i_35_ = class38_sub23.readUnsignedByte() + i_35_ + 1;
					is_32_[i_72_] = (byte) i_35_;
				}
				int i_73_ = is_32_[0];
				int i_74_ = is_32_[1] << -997727;
				for (int i_75_ = 0; i_75_ < i_73_; i_75_++) {
					int i_76_ = i_74_ + (this.aByteArray2210[i_75_] & 0xff);
					if (i_76_ < 0)
						i_76_ = 0;
					if (i_76_ > 128)
						i_76_ = 128;
					this.aByteArray2210[i_75_] = (byte) i_76_;
				}
				int i_77_ = 2;
				while (i_77_ < is_32_.length) {
					int i_78_ = is_32_[i_77_];
					int i_79_ = is_32_[i_77_ + 1] << 438509441;
					i_77_ += 2;
					int i_80_ = i_74_ * (-i_73_ + i_78_) + (-i_73_ + i_78_) / 2;
					for (int i_81_ = i_73_; i_78_ > i_81_; i_81_++) {
						int i_82_ = Entity.method1174(i_80_, i_78_ - i_73_, (byte) -127);
						i_80_ += -i_74_ + i_79_;
						int i_83_ = (this.aByteArray2210[i_81_] & 0xff) + i_82_;
						if (i_83_ < 0)
							i_83_ = 0;
						if (i_83_ > 128)
							i_83_ = 128;
						this.aByteArray2210[i_81_] = (byte) i_83_;
					}
					i_73_ = i_78_;
					i_74_ = i_79_;
				}
				for (int i_84_ = i_73_; i_84_ < 128; i_84_++) {
					int i_85_ = i_74_ + (this.aByteArray2210[i_84_] & 0xff);
					if (i_85_ < 0)
						i_85_ = 0;
					if (i_85_ > 128)
						i_85_ = 128;
					this.aByteArray2210[i_84_] = (byte) i_85_;
				}
				Object object = null;
			}
			for (int i_86_ = 0; i_23_ > i_86_; i_86_++)
				class52s[i_86_].anInt1152 = class38_sub23.readUnsignedByte();
			for (int i_87_ = 0; i_87_ < i_23_; i_87_++) {
				Class52 class52_88_ = class52s[i_87_];
				if (class52_88_.aByteArray1139 != null)
					class52_88_.anInt1141 = class38_sub23.readUnsignedByte();
				if (class52_88_.aByteArray1153 != null)
					class52_88_.anInt1157 = class38_sub23.readUnsignedByte();
				if (class52_88_.anInt1152 > 0)
					class52_88_.anInt1148 = class38_sub23.readUnsignedByte();
			}
			for (int i_89_ = 0; i_89_ < i_23_; i_89_++)
				class52s[i_89_].anInt1147 = class38_sub23.readUnsignedByte();
			for (int i_90_ = 0; i_23_ > i_90_; i_90_++) {
				Class52 class52_91_ = class52s[i_90_];
				if (class52_91_.anInt1147 > 0)
					class52_91_.anInt1160 = class38_sub23.readUnsignedByte();
			}
			for (int i_92_ = 0; i_92_ < i_23_; i_92_++) {
				Class52 class52_93_ = class52s[i_92_];
				if (class52_93_.anInt1160 > 0)
					class52_93_.anInt1140 = class38_sub23.readUnsignedByte();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kd.<init>(" + (is != null ? "{...}" : "null") + ')');
		}
	}

	static {
		Class38_Sub18.aClass19_2202 = RSString.createRSString("scape main");
		Class38_Sub18.anIntArray2223 = new int[128];
		Class38_Sub18.anInt2217 = 5063219;
		Class38_Sub18.aClass19_2206 = RSString.createRSString("Loading fonts )2 ");
		Class38_Sub18.aClass19_2219 = Class38_Sub18.aClass19_2206;
	}
}
