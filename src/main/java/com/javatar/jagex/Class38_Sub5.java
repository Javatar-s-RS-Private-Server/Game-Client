package com.javatar.jagex;/* Class38_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub5 extends Node {
	private int anInt1838;
	int anInt1839;
	private int[] anIntArray1840;
	private static int[] anIntArray1841;
	boolean aBool1842;
	int anInt1843;
	int[] anIntArray1844;
	private int[] anIntArray1845;
	private int[] anIntArray1846;
	private int[] anIntArray1847;
	boolean aBool1848 = false;

	final void method630(int i) {
		if (this.anIntArray1844 != null) {
			if (this.anInt1839 == 1 || this.anInt1839 == 3) {
				if (Class38_Sub5.anIntArray1841 == null || Class38_Sub5.anIntArray1841.length < this.anIntArray1844.length)
					Class38_Sub5.anIntArray1841 = new int[this.anIntArray1844.length];
				int i_0_;
				if (this.anIntArray1844.length == 4096)
					i_0_ = 64;
				else
					i_0_ = 128;
				int i_1_ = this.anIntArray1844.length;
				int i_2_ = i_0_ * i * anInt1838;
				int i_3_ = i_1_ - 1;
				if (this.anInt1839 == 1)
					i_2_ = -i_2_;
				for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
					int i_5_ = i_4_ + i_2_ & i_3_;
					Class38_Sub5.anIntArray1841[i_4_] = this.anIntArray1844[i_5_];
				}
				int[] is = this.anIntArray1844;
				this.anIntArray1844 = Class38_Sub5.anIntArray1841;
				Class38_Sub5.anIntArray1841 = is;
			}
			if (this.anInt1839 == 2 || this.anInt1839 == 4) {
				if (Class38_Sub5.anIntArray1841 == null || Class38_Sub5.anIntArray1841.length < this.anIntArray1844.length)
					Class38_Sub5.anIntArray1841 = new int[this.anIntArray1844.length];
				int i_6_;
				if (this.anIntArray1844.length == 4096)
					i_6_ = 64;
				else
					i_6_ = 128;
				int i_7_ = this.anIntArray1844.length;
				int i_8_ = i * anInt1838;
				int i_9_ = i_6_ - 1;
				if (this.anInt1839 == 2)
					i_8_ = -i_8_;
				for (int i_10_ = 0; i_10_ < i_7_; i_10_ += i_6_)
					for (int i_11_ = 0; i_11_ < i_6_; i_11_++) {
						int i_12_ = i_10_ + i_11_;
						int i_13_ = i_10_ + (i_11_ + i_8_ & i_9_);
						Class38_Sub5.anIntArray1841[i_12_] = this.anIntArray1844[i_13_];
					}
				int[] is = this.anIntArray1844;
				this.anIntArray1844 = Class38_Sub5.anIntArray1841;
				Class38_Sub5.anIntArray1841 = is;
			}
		}
	}

	final void method631() {
		this.anIntArray1844 = null;
	}

	public static void method632() {
		Class38_Sub5.anIntArray1841 = null;
	}

	final boolean method633(double d, int i, Class17 class17) {
		for (int i_14_ = 0; i_14_ < anIntArray1846.length; i_14_++)
			if (class17.method119(anIntArray1846[i_14_], -30895) == null)
				return false;
		int i_15_ = i * i;
		this.anIntArray1844 = new int[i_15_];
		for (int i_16_ = 0; i_16_ < anIntArray1846.length; i_16_++) {
			Class38_Sub20_Sub9_Sub2 class38_sub20_sub9_sub2 = Class9.method49(-7450, class17, anIntArray1846[i_16_]);
			class38_sub20_sub9_sub2.method1088();
			byte[] is = class38_sub20_sub9_sub2.aByteArray3239;
			int[] is_17_ = class38_sub20_sub9_sub2.anIntArray3241;
			int i_18_ = anIntArray1840[i_16_];
			if ((i_18_ & ~0xffffff) == 50331648) {
				int i_19_ = i_18_ & 0xff00ff;
				int i_20_ = i_18_ >> 8 & 0xff;
				for (int i_21_ = 0; i_21_ < is_17_.length; i_21_++) {
					int i_22_ = is_17_[i_21_];
					if ((i_22_ & 0xffff) == i_22_ >> 8) {
						i_22_ &= 0xff;
						is_17_[i_21_] = i_19_ * i_22_ >> 8 & 0xff00ff | i_20_ * i_22_ & 0xff00;
					}
				}
			}
			for (int i_23_ = 0; i_23_ < is_17_.length; i_23_++)
				is_17_[i_23_] = Class38_Sub20_Sub9_Sub4.method1192(is_17_[i_23_], d);
			int i_24_;
			if (i_16_ == 0)
				i_24_ = 0;
			else
				i_24_ = anIntArray1847[i_16_ - 1];
			if (i_24_ == 0)
				if (class38_sub20_sub9_sub2.anInt3242 == i)
					for (int i_25_ = 0; i_25_ < i_15_; i_25_++)
						this.anIntArray1844[i_25_] = is_17_[is[i_25_] & 0xff];
				else if (class38_sub20_sub9_sub2.anInt3242 == 64 && i == 128) {
					int i_26_ = 0;
					for (int i_27_ = 0; i_27_ < i; i_27_++)
						for (int i_28_ = 0; i_28_ < i; i_28_++)
							this.anIntArray1844[i_26_++] = is_17_[is[(i_28_ >> 1) + (i_27_ >> 1 << 6)] & 0xff];
				} else if (class38_sub20_sub9_sub2.anInt3242 == 128 && i == 64) {
					int i_29_ = 0;
					for (int i_30_ = 0; i_30_ < i; i_30_++)
						for (int i_31_ = 0; i_31_ < i; i_31_++)
							this.anIntArray1844[i_29_++] = is_17_[is[(i_31_ << 1) + (i_30_ << 1 << 7)] & 0xff];
				} else
					throw new RuntimeException();
		}
		return true;
	}

	Class38_Sub5(RS2Buffer class38_sub23) {
		this.anInt1843 = class38_sub23.getUShort();
		this.aBool1842 = class38_sub23.getUByte() == 1;
		int i = class38_sub23.getUByte();
		if (i < 1 || i > 4)
			throw new RuntimeException();
		anIntArray1846 = new int[i];
		for (int i_32_ = 0; i_32_ < i; i_32_++)
			anIntArray1846[i_32_] = class38_sub23.getUShort();
		if (i > 1) {
			anIntArray1847 = new int[i - 1];
			for (int i_33_ = 0; i_33_ < i - 1; i_33_++)
				anIntArray1847[i_33_] = class38_sub23.getUByte();
		}
		if (i > 1) {
			anIntArray1845 = new int[i - 1];
			for (int i_34_ = 0; i_34_ < i - 1; i_34_++)
				anIntArray1845[i_34_] = class38_sub23.getUByte();
		}
		anIntArray1840 = new int[i];
		for (int i_35_ = 0; i_35_ < i; i_35_++)
			anIntArray1840[i_35_] = class38_sub23.method759(true);
		this.anInt1839 = class38_sub23.getUByte();
		anInt1838 = class38_sub23.getUByte();
		this.anIntArray1844 = null;
	}
}
