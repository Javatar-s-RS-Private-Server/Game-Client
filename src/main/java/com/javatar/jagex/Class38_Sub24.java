package com.javatar.jagex;/* Class38_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub24 extends Node {
	Class14 aClass14_2417;
	byte[] aByteArray2418;

	final void method779() {
		if (this.aClass14_2417 == null) {
			this.aClass14_2417 = new Class14(16);
			int[] is = new int[16];
			int[] is_0_ = new int[16];
			is[9] = is_0_[9] = 128;
			Class70 class70 = new Class70(this.aByteArray2418);
			int i = class70.method501();
			for (int i_1_ = 0; i_1_ < i; i_1_++) {
				class70.method508(i_1_);
				class70.method506(i_1_);
				class70.method495(i_1_);
			}
			while_22_: for (;;) {
				int i_2_ = class70.method504();
				int i_3_ = class70.anIntArray1405[i_2_];
				while (class70.anIntArray1405[i_2_] == i_3_) {
					class70.method508(i_2_);
					int i_4_ = class70.method509(i_2_);
					if (i_4_ == 1) {
						class70.method503();
						class70.method495(i_2_);
						if (!class70.method500())
							break;
						break while_22_;
					}
					int i_5_ = i_4_ & 0xf0;
					if (i_5_ == 176) {
						int i_6_ = i_4_ & 0xf;
						int i_7_ = i_4_ >> 8 & 0x7f;
						int i_8_ = i_4_ >> 16 & 0x7f;
						if (i_7_ == 0)
							is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
						if (i_7_ == 32)
							is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
					}
					if (i_5_ == 192) {
						int i_9_ = i_4_ & 0xf;
						int i_10_ = i_4_ >> 8 & 0x7f;
						is_0_[i_9_] = is[i_9_] + i_10_;
					}
					if (i_5_ == 144) {
						int i_11_ = i_4_ & 0xf;
						int i_12_ = i_4_ >> 8 & 0x7f;
						int i_13_ = i_4_ >> 16 & 0x7f;
						if (i_13_ > 0) {
							int i_14_ = is_0_[i_11_];
							Class38_Sub2 class38_sub2 = (Class38_Sub2) this.aClass14_2417.method75(i_14_, (byte) -106);
							if (class38_sub2 == null) {
								class38_sub2 = new Class38_Sub2(new byte[128]);
								this.aClass14_2417.method80(true, i_14_, class38_sub2);
							}
							class38_sub2.aByteArray1756[i_12_] = (byte) 1;
						}
					}
					class70.method506(i_2_);
					class70.method495(i_2_);
				}
			}
		}
	}

	final void method780() {
		this.aClass14_2417 = null;
	}

	static final Class38_Sub24 method781(Class17 class17, int i, int i_15_) {
		byte[] is = class17.method109(i, i_15_, -122);
		if (is == null)
			return null;
		return new Class38_Sub24(new RS2Buffer(is));
	}

	private Class38_Sub24(RS2Buffer class38_sub23) {
		class38_sub23.pos = class38_sub23.buffer.length - 3;
		int i = class38_sub23.getUByte();
		int i_16_ = class38_sub23.getUShort();
		int i_17_ = i * 10 + 14;
		class38_sub23.pos = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		int i_25_ = 0;
		while_20_: for (int i_26_ = 0; i_26_ < i; i_26_++) {
			int i_27_ = -1;
			for (;;) {
				int i_28_ = class38_sub23.getUByte();
				if (i_28_ != i_27_)
					i_17_++;
				i_27_ = i_28_ & 0xf;
				if (i_28_ == 7)
					continue while_20_;
				if (i_28_ == 23)
					i_18_++;
				else if (i_27_ == 0)
					i_20_++;
				else if (i_27_ == 1)
					i_21_++;
				else if (i_27_ == 2)
					i_19_++;
				else if (i_27_ == 3)
					i_22_++;
				else if (i_27_ == 4)
					i_23_++;
				else if (i_27_ == 5)
					i_24_++;
				else {
					if (i_27_ != 6)
						break;
					i_25_++;
				}
			}
			throw new RuntimeException();
		}
		i_17_ += i_18_ * 5;
		i_17_ += (i_20_ + i_21_ + i_19_ + i_22_ + i_24_) * 2;
		i_17_ += i_23_ + i_25_;
		int i_29_ = class38_sub23.pos;
		int i_30_ = i + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_ + i_25_;
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
			class38_sub23.method731(-1592222329);
		i_17_ += class38_sub23.pos - i_29_;
		int i_32_ = class38_sub23.pos;
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = 0;
		int i_36_ = 0;
		int i_37_ = 0;
		int i_38_ = 0;
		int i_39_ = 0;
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = 0;
		for (int i_46_ = 0; i_46_ < i_19_; i_46_++) {
			i_45_ = i_45_ + class38_sub23.getUByte() & 0x7f;
			if (i_45_ == 0 || i_45_ == 32)
				i_25_++;
			else if (i_45_ == 1)
				i_33_++;
			else if (i_45_ == 33)
				i_34_++;
			else if (i_45_ == 7)
				i_35_++;
			else if (i_45_ == 39)
				i_36_++;
			else if (i_45_ == 10)
				i_37_++;
			else if (i_45_ == 42)
				i_38_++;
			else if (i_45_ == 99)
				i_39_++;
			else if (i_45_ == 98)
				i_40_++;
			else if (i_45_ == 101)
				i_41_++;
			else if (i_45_ == 100)
				i_42_++;
			else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123)
				i_43_++;
			else
				i_44_++;
		}
		int i_47_ = 0;
		int i_48_ = class38_sub23.pos;
		class38_sub23.pos += i_43_;
		int i_49_ = class38_sub23.pos;
		class38_sub23.pos += i_24_;
		int i_50_ = class38_sub23.pos;
		class38_sub23.pos += i_23_;
		int i_51_ = class38_sub23.pos;
		class38_sub23.pos += i_22_;
		int i_52_ = class38_sub23.pos;
		class38_sub23.pos += i_33_;
		int i_53_ = class38_sub23.pos;
		class38_sub23.pos += i_35_;
		int i_54_ = class38_sub23.pos;
		class38_sub23.pos += i_37_;
		int i_55_ = class38_sub23.pos;
		class38_sub23.pos += i_20_ + i_21_ + i_24_;
		int i_56_ = class38_sub23.pos;
		class38_sub23.pos += i_20_;
		int i_57_ = class38_sub23.pos;
		class38_sub23.pos += i_44_;
		int i_58_ = class38_sub23.pos;
		class38_sub23.pos += i_21_;
		int i_59_ = class38_sub23.pos;
		class38_sub23.pos += i_34_;
		int i_60_ = class38_sub23.pos;
		class38_sub23.pos += i_36_;
		int i_61_ = class38_sub23.pos;
		class38_sub23.pos += i_38_;
		int i_62_ = class38_sub23.pos;
		class38_sub23.pos += i_25_;
		int i_63_ = class38_sub23.pos;
		class38_sub23.pos += i_22_;
		int i_64_ = class38_sub23.pos;
		class38_sub23.pos += i_39_;
		int i_65_ = class38_sub23.pos;
		class38_sub23.pos += i_40_;
		int i_66_ = class38_sub23.pos;
		class38_sub23.pos += i_41_;
		int i_67_ = class38_sub23.pos;
		class38_sub23.pos += i_42_;
		int i_68_ = class38_sub23.pos;
		class38_sub23.pos += i_18_ * 3;
		this.aByteArray2418 = new byte[i_17_];
		RS2Buffer class38_sub23_69_ = new RS2Buffer(this.aByteArray2418);
		class38_sub23_69_.putInt(1297377380);
		class38_sub23_69_.putInt(6);
		class38_sub23_69_.putShort(i > 1 ? 1 : 0);
		class38_sub23_69_.putShort(i);
		class38_sub23_69_.putShort(i_16_);
		class38_sub23.pos = i_29_;
		int i_70_ = 0;
		int i_71_ = 0;
		int i_72_ = 0;
		int i_73_ = 0;
		int i_74_ = 0;
		int i_75_ = 0;
		int i_76_ = 0;
		int[] is = new int[128];
		i_45_ = 0;
		for (int i_77_ = 0; i_77_ < i; i_77_++) {
			class38_sub23_69_.putInt(1297379947);
			class38_sub23_69_.pos += 4;
			int i_78_ = class38_sub23_69_.pos;
			int i_79_ = -1;
			while_21_: do {
				for (;;) {
					int i_80_ = class38_sub23.method731(-1592222329);
					class38_sub23_69_.method775(i_80_, false);
					int i_81_ = class38_sub23.buffer[i_47_++] & 0xff;
					boolean bool = i_81_ != i_79_;
					i_79_ = i_81_ & 0xf;
					if (i_81_ == 7) {
						if (bool)
							class38_sub23_69_.putByte(255);
						class38_sub23_69_.putByte(47);
						class38_sub23_69_.putByte(0);
						break while_21_;
					}
					if (i_81_ == 23) {
						if (bool)
							class38_sub23_69_.putByte(255);
						class38_sub23_69_.putByte(81);
						class38_sub23_69_.putByte(3);
						class38_sub23_69_.putByte(class38_sub23.buffer[i_68_++]);
						class38_sub23_69_.putByte(class38_sub23.buffer[i_68_++]);
						class38_sub23_69_.putByte(class38_sub23.buffer[i_68_++]);
					} else {
						i_70_ ^= i_81_ >> 4;
						if (i_79_ == 0) {
							if (bool)
								class38_sub23_69_.putByte(i_70_ + 144);
							i_71_ += class38_sub23.buffer[i_55_++];
							i_72_ += class38_sub23.buffer[i_56_++];
							class38_sub23_69_.putByte(i_71_ & 0x7f);
							class38_sub23_69_.putByte(i_72_ & 0x7f);
						} else if (i_79_ == 1) {
							if (bool)
								class38_sub23_69_.putByte(i_70_ + 128);
							i_71_ += class38_sub23.buffer[i_55_++];
							i_73_ += class38_sub23.buffer[i_58_++];
							class38_sub23_69_.putByte(i_71_ & 0x7f);
							class38_sub23_69_.putByte(i_73_ & 0x7f);
						} else if (i_79_ == 2) {
							if (bool)
								class38_sub23_69_.putByte(i_70_ + 176);
							i_45_ = i_45_ + class38_sub23.buffer[i_32_++] & 0x7f;
							class38_sub23_69_.putByte(i_45_);
							int i_82_;
							if (i_45_ == 0 || i_45_ == 32)
								i_82_ = class38_sub23.buffer[i_62_++];
							else if (i_45_ == 1)
								i_82_ = class38_sub23.buffer[i_52_++];
							else if (i_45_ == 33)
								i_82_ = class38_sub23.buffer[i_59_++];
							else if (i_45_ == 7)
								i_82_ = class38_sub23.buffer[i_53_++];
							else if (i_45_ == 39)
								i_82_ = class38_sub23.buffer[i_60_++];
							else if (i_45_ == 10)
								i_82_ = class38_sub23.buffer[i_54_++];
							else if (i_45_ == 42)
								i_82_ = class38_sub23.buffer[i_61_++];
							else if (i_45_ == 99)
								i_82_ = class38_sub23.buffer[i_64_++];
							else if (i_45_ == 98)
								i_82_ = class38_sub23.buffer[i_65_++];
							else if (i_45_ == 101)
								i_82_ = class38_sub23.buffer[i_66_++];
							else if (i_45_ == 100)
								i_82_ = class38_sub23.buffer[i_67_++];
							else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123)
								i_82_ = class38_sub23.buffer[i_48_++];
							else
								i_82_ = class38_sub23.buffer[i_57_++];
							i_82_ += is[i_45_];
							is[i_45_] = i_82_;
							class38_sub23_69_.putByte(i_82_ & 0x7f);
						} else if (i_79_ == 3) {
							if (bool)
								class38_sub23_69_.putByte(i_70_ + 224);
							i_74_ += class38_sub23.buffer[i_63_++];
							i_74_ += class38_sub23.buffer[i_51_++] << 7;
							class38_sub23_69_.putByte(i_74_ & 0x7f);
							class38_sub23_69_.putByte(i_74_ >> 7 & 0x7f);
						} else if (i_79_ == 4) {
							if (bool)
								class38_sub23_69_.putByte(i_70_ + 208);
							i_75_ += class38_sub23.buffer[i_50_++];
							class38_sub23_69_.putByte(i_75_ & 0x7f);
						} else if (i_79_ == 5) {
							if (bool)
								class38_sub23_69_.putByte(i_70_ + 160);
							i_71_ += class38_sub23.buffer[i_55_++];
							i_76_ += class38_sub23.buffer[i_49_++];
							class38_sub23_69_.putByte(i_71_ & 0x7f);
							class38_sub23_69_.putByte(i_76_ & 0x7f);
						} else {
							if (i_79_ != 6)
								break;
							if (bool)
								class38_sub23_69_.putByte(i_70_ + 192);
							class38_sub23_69_.putByte(class38_sub23.buffer[i_62_++]);
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			class38_sub23_69_.method761(class38_sub23_69_.pos - i_78_, false);
		}
	}
}
