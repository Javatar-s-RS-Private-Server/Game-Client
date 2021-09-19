package com.javatar;/* Class38_Sub20_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub3_Sub1 extends SceneModel {
	static int anInt3181;
	static int anInt3182;
	static int[] anIntArray3186;
	static boolean aBool3192;
	static int anInt3201;
	private static Class38_Sub20_Sub3_Sub1 aClass38_Sub20_Sub3_Sub1_3150 = new Class38_Sub20_Sub3_Sub1();
	private static byte[] aByteArray3161 = new byte[1];
	private static Class38_Sub20_Sub3_Sub1 aClass38_Sub20_Sub3_Sub1_3170 = new Class38_Sub20_Sub3_Sub1();
	private static int[] anIntArray3171 = Class38_Sub20_Sub9_Sub4.anIntArray3534;
	private static int[] anIntArray3172;
	private static int[] anIntArray3173 = new int[10];
	private static int[] anIntArray3174;
	private static int[] anIntArray3175;
	private static int[] anIntArray3176;
	private static int anInt3177;
	private static int[] anIntArray3178;
	private static int[] anIntArray3179 = new int[10];
	private static int[] anIntArray3180;
	private static int[] anIntArray3183;
	private static int[] anIntArray3184;
	private static int anInt3185;
	private static int[] anIntArray3187;
	private static int[] anIntArray3188;
	private static boolean[] aBoolArray3189;
	private static int[] anIntArray3190;
	private static int[] anIntArray3191;
	private static int[][] anIntArrayArray3193;
	private static int[] anIntArray3194;
	private static boolean[] aBoolArray3195;
	private static int[][] anIntArrayArray3196;
	private static int[] anIntArray3197;
	private static int anInt3198;
	private static int[] anIntArray3199;
	private static byte[] aByteArray3200;

	static {
		Class38_Sub20_Sub3_Sub1.anIntArray3175 = new int[4096];
		Class38_Sub20_Sub3_Sub1.anIntArray3178 = new int[4096];
		Class38_Sub20_Sub3_Sub1.anIntArray3172 = new int[12];
		Class38_Sub20_Sub3_Sub1.anIntArray3187 = new int[2000];
		Class38_Sub20_Sub3_Sub1.anIntArray3184 = new int[10];
		Class38_Sub20_Sub3_Sub1.anIntArray3176 = new int[2000];
		Class38_Sub20_Sub3_Sub1.anIntArray3183 = new int[4096];
		Class38_Sub20_Sub3_Sub1.anInt3181 = 0;
		Class38_Sub20_Sub3_Sub1.anInt3182 = 0;
		Class38_Sub20_Sub3_Sub1.anIntArray3174 = new int[1600];
		Class38_Sub20_Sub3_Sub1.anIntArray3188 = Class38_Sub20_Sub9_Sub4.anIntArray3530;
		Class38_Sub20_Sub3_Sub1.aBoolArray3189 = new boolean[4096];
		Class38_Sub20_Sub3_Sub1.anIntArray3180 = Class38_Sub20_Sub9_Sub4.anIntArray3520;
		Class38_Sub20_Sub3_Sub1.anIntArray3190 = new int[4096];
		Class38_Sub20_Sub3_Sub1.aBool3192 = false;
		Class38_Sub20_Sub3_Sub1.anIntArray3191 = new int[4096];
		Class38_Sub20_Sub3_Sub1.aBoolArray3195 = new boolean[4096];
		Class38_Sub20_Sub3_Sub1.anIntArrayArray3196 = new int[12][2000];
		Class38_Sub20_Sub3_Sub1.anIntArray3197 = new int[12];
		Class38_Sub20_Sub3_Sub1.anIntArrayArray3193 = new int[1600][512];
		Class38_Sub20_Sub3_Sub1.anIntArray3194 = new int[4096];
		Class38_Sub20_Sub3_Sub1.aByteArray3200 = new byte[1];
		Class38_Sub20_Sub3_Sub1.anIntArray3186 = new int[1000];
		Class38_Sub20_Sub3_Sub1.anIntArray3199 = Class38_Sub20_Sub9_Sub4.anIntArray3528;
		Class38_Sub20_Sub3_Sub1.anInt3201 = 0;
	}

	int[] anIntArray3140;
	boolean aBool3141;
	int[][] anIntArrayArray3143;
	int[] anIntArray3144;
	int[] anIntArray3145;
	int[] anIntArray3146;
	byte aByte3147 = 0;
	int[] anIntArray3149;
	short[] aShortArray3151;
	int[] anIntArray3152;
	int anInt3153 = 0;
	int[] anIntArray3154;
	byte[] aByteArray3155;
	int[] anIntArray3156;
	int[] anIntArray3157;
	byte[] aByteArray3158;
	int[][] anIntArrayArray3163;
	int[] anIntArray3164;
	int[] anIntArray3165;
	int anInt3166;
	int anInt3167;
	byte[] aByteArray3168;
	int[] anIntArray3169;
	private int anInt3142;
	private int anInt3148;
	private int anInt3159;
	private int anInt3160;
	private int anInt3162;

	public Class38_Sub20_Sub3_Sub1() {
		this.aBool3141 = false;
		this.anInt3166 = 0;
		this.anInt3167 = 0;
	}

	Class38_Sub20_Sub3_Sub1(Class38_Sub20_Sub3_Sub1[] class38_sub20_sub3_sub1s) {
		this.aBool3141 = false;
		this.anInt3166 = 0;
		this.anInt3167 = 0;
		boolean bool = false;
		boolean bool_290_ = false;
		boolean bool_291_ = false;
		boolean bool_292_ = false;
		this.anInt3166 = 0;
		this.anInt3167 = 0;
		this.anInt3153 = 0;
		this.aByte3147 = (byte) -1;
		for (int i_293_ = 0; i_293_ < 2; i_293_++) {
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_294_ = class38_sub20_sub3_sub1s[i_293_];
			if (class38_sub20_sub3_sub1_294_ != null) {
				this.anInt3166 += class38_sub20_sub3_sub1_294_.anInt3166;
				this.anInt3167 += class38_sub20_sub3_sub1_294_.anInt3167;
				this.anInt3153 += class38_sub20_sub3_sub1_294_.anInt3153;
				if (class38_sub20_sub3_sub1_294_.aByteArray3168 != null)
					bool = true;
				else {
					if (this.aByte3147 == -1)
						this.aByte3147 = class38_sub20_sub3_sub1_294_.aByte3147;
					if (this.aByte3147 != class38_sub20_sub3_sub1_294_.aByte3147)
						bool = true;
				}
				bool_290_ = bool_290_ | class38_sub20_sub3_sub1_294_.aByteArray3155 != null;
				bool_291_ = bool_291_ | class38_sub20_sub3_sub1_294_.aShortArray3151 != null;
				bool_292_ = bool_292_ | class38_sub20_sub3_sub1_294_.aByteArray3158 != null;
			}
		}
		this.anIntArray3156 = new int[this.anInt3166];
		this.anIntArray3140 = new int[this.anInt3166];
		this.anIntArray3149 = new int[this.anInt3166];
		this.anIntArray3157 = new int[this.anInt3167];
		this.anIntArray3152 = new int[this.anInt3167];
		this.anIntArray3165 = new int[this.anInt3167];
		this.anIntArray3164 = new int[this.anInt3167];
		this.anIntArray3146 = new int[this.anInt3167];
		this.anIntArray3144 = new int[this.anInt3167];
		if (bool)
			this.aByteArray3168 = new byte[this.anInt3167];
		if (bool_290_)
			this.aByteArray3155 = new byte[this.anInt3167];
		if (bool_291_)
			this.aShortArray3151 = new short[this.anInt3167];
		if (bool_292_)
			this.aByteArray3158 = new byte[this.anInt3167];
		if (this.anInt3153 > 0) {
			this.anIntArray3169 = new int[this.anInt3153];
			this.anIntArray3154 = new int[this.anInt3153];
			this.anIntArray3145 = new int[this.anInt3153];
		}
		this.anInt3166 = 0;
		this.anInt3167 = 0;
		this.anInt3153 = 0;
		for (int i_295_ = 0; i_295_ < 2; i_295_++) {
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_296_ = class38_sub20_sub3_sub1s[i_295_];
			if (class38_sub20_sub3_sub1_296_ != null) {
				for (int i_297_ = 0; i_297_ < class38_sub20_sub3_sub1_296_.anInt3167; i_297_++) {
					this.anIntArray3157[this.anInt3167] = class38_sub20_sub3_sub1_296_.anIntArray3157[i_297_] + this.anInt3166;
					this.anIntArray3152[this.anInt3167] = class38_sub20_sub3_sub1_296_.anIntArray3152[i_297_] + this.anInt3166;
					this.anIntArray3165[this.anInt3167] = class38_sub20_sub3_sub1_296_.anIntArray3165[i_297_] + this.anInt3166;
					this.anIntArray3164[this.anInt3167] = class38_sub20_sub3_sub1_296_.anIntArray3164[i_297_];
					this.anIntArray3146[this.anInt3167] = class38_sub20_sub3_sub1_296_.anIntArray3146[i_297_];
					this.anIntArray3144[this.anInt3167] = class38_sub20_sub3_sub1_296_.anIntArray3144[i_297_];
					if (bool)
						if (class38_sub20_sub3_sub1_296_.aByteArray3168 != null)
							this.aByteArray3168[this.anInt3167] = class38_sub20_sub3_sub1_296_.aByteArray3168[i_297_];
						else
							this.aByteArray3168[this.anInt3167] = class38_sub20_sub3_sub1_296_.aByte3147;
					if (bool_290_ && class38_sub20_sub3_sub1_296_.aByteArray3155 != null)
						this.aByteArray3155[this.anInt3167] = class38_sub20_sub3_sub1_296_.aByteArray3155[i_297_];
					if (bool_291_)
						if (class38_sub20_sub3_sub1_296_.aShortArray3151 != null)
							this.aShortArray3151[this.anInt3167] = class38_sub20_sub3_sub1_296_.aShortArray3151[i_297_];
						else
							this.aShortArray3151[this.anInt3167] = (short) -1;
					if (bool_292_)
						if (class38_sub20_sub3_sub1_296_.aByteArray3158 != null && class38_sub20_sub3_sub1_296_.aByteArray3158[i_297_] != -1)
							this.aByteArray3158[this.anInt3167] = (byte) (class38_sub20_sub3_sub1_296_.aByteArray3158[i_297_] + this.anInt3153);
						else
							this.aByteArray3158[this.anInt3167] = (byte) -1;
					this.anInt3167++;
				}
				for (int i_298_ = 0; i_298_ < class38_sub20_sub3_sub1_296_.anInt3153; i_298_++) {
					this.anIntArray3169[this.anInt3153] = class38_sub20_sub3_sub1_296_.anIntArray3169[i_298_] + this.anInt3166;
					this.anIntArray3154[this.anInt3153] = class38_sub20_sub3_sub1_296_.anIntArray3154[i_298_] + this.anInt3166;
					this.anIntArray3145[this.anInt3153] = class38_sub20_sub3_sub1_296_.anIntArray3145[i_298_] + this.anInt3166;
					this.anInt3153++;
				}
				for (int i_299_ = 0; i_299_ < class38_sub20_sub3_sub1_296_.anInt3166; i_299_++) {
					this.anIntArray3156[this.anInt3166] = class38_sub20_sub3_sub1_296_.anIntArray3156[i_299_];
					this.anIntArray3140[this.anInt3166] = class38_sub20_sub3_sub1_296_.anIntArray3140[i_299_];
					this.anIntArray3149[this.anInt3166] = class38_sub20_sub3_sub1_296_.anIntArray3149[i_299_];
					this.anInt3166++;
				}
			}
		}
	}

	public static void method1054() {
		Class38_Sub20_Sub3_Sub1.aClass38_Sub20_Sub3_Sub1_3150 = null;
		Class38_Sub20_Sub3_Sub1.aByteArray3161 = null;
		Class38_Sub20_Sub3_Sub1.aClass38_Sub20_Sub3_Sub1_3170 = null;
		Class38_Sub20_Sub3_Sub1.aByteArray3200 = null;
		Class38_Sub20_Sub3_Sub1.aBoolArray3195 = null;
		Class38_Sub20_Sub3_Sub1.aBoolArray3189 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3191 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3183 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3178 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3190 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3175 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3194 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3174 = null;
		Class38_Sub20_Sub3_Sub1.anIntArrayArray3193 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3197 = null;
		Class38_Sub20_Sub3_Sub1.anIntArrayArray3196 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3187 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3176 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3172 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3179 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3173 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3184 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3186 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3180 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3199 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3188 = null;
		Class38_Sub20_Sub3_Sub1.anIntArray3171 = null;
	}

	private void method1037(int i) {
		if (Class38_Sub20_Sub3_Sub1.aBoolArray3189[i])
			method1057(i);
		else {
			int i_0_ = this.anIntArray3157[i];
			int i_1_ = this.anIntArray3152[i];
			int i_2_ = this.anIntArray3165[i];
			Class38_Sub20_Sub9_Sub4.aBool3524 = Class38_Sub20_Sub3_Sub1.aBoolArray3195[i];
			if (this.aByteArray3155 == null)
				Class38_Sub20_Sub9_Sub4.anInt3535 = 0;
			else
				Class38_Sub20_Sub9_Sub4.anInt3535 = this.aByteArray3155[i] & 0xff;
			if (this.aShortArray3151 == null || this.aShortArray3151[i] == -1) {
				if (this.anIntArray3144[i] == -1)
					Class38_Sub20_Sub9_Sub4.method1193(Class38_Sub20_Sub3_Sub1.anIntArray3183[i_0_], Class38_Sub20_Sub3_Sub1.anIntArray3183[i_1_], Class38_Sub20_Sub3_Sub1.anIntArray3183[i_2_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_0_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_1_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_2_], Class38_Sub20_Sub3_Sub1.anIntArray3188[this.anIntArray3164[i]]);
				else
					Class38_Sub20_Sub9_Sub4.method1188(Class38_Sub20_Sub3_Sub1.anIntArray3183[i_0_], Class38_Sub20_Sub3_Sub1.anIntArray3183[i_1_], Class38_Sub20_Sub3_Sub1.anIntArray3183[i_2_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_0_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_1_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_2_], this.anIntArray3164[i], this.anIntArray3146[i], this.anIntArray3144[i]);
			} else {
				int i_3_;
				int i_4_;
				int i_5_;
				if (this.aByteArray3158 != null && this.aByteArray3158[i] != -1) {
					int i_6_ = this.aByteArray3158[i] & 0xff;
					i_3_ = this.anIntArray3169[i_6_];
					i_4_ = this.anIntArray3154[i_6_];
					i_5_ = this.anIntArray3145[i_6_];
				} else {
					i_3_ = i_0_;
					i_4_ = i_1_;
					i_5_ = i_2_;
				}
				if (this.anIntArray3144[i] == -1)
					Class38_Sub20_Sub9_Sub4.method1194(Class38_Sub20_Sub3_Sub1.anIntArray3183[i_0_], Class38_Sub20_Sub3_Sub1.anIntArray3183[i_1_], Class38_Sub20_Sub3_Sub1.anIntArray3183[i_2_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_0_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_1_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_2_], this.anIntArray3164[i], this.anIntArray3164[i], this.anIntArray3164[i], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_3_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_4_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_5_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_3_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_4_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_5_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_3_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_4_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_5_], this.aShortArray3151[i]);
				else
					Class38_Sub20_Sub9_Sub4.method1194(Class38_Sub20_Sub3_Sub1.anIntArray3183[i_0_], Class38_Sub20_Sub3_Sub1.anIntArray3183[i_1_], Class38_Sub20_Sub3_Sub1.anIntArray3183[i_2_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_0_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_1_], Class38_Sub20_Sub3_Sub1.anIntArray3191[i_2_], this.anIntArray3164[i], this.anIntArray3146[i], this.anIntArray3144[i], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_3_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_4_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_5_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_3_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_4_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_5_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_3_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_4_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_5_], this.aShortArray3151[i]);
			}
		}
	}

	final Class38_Sub20_Sub3_Sub1 method1038(boolean bool) {
		if (!bool && Class38_Sub20_Sub3_Sub1.aByteArray3161.length < this.anInt3167)
			Class38_Sub20_Sub3_Sub1.aByteArray3161 = new byte[this.anInt3167 + 100];
		return method1039(bool, Class38_Sub20_Sub3_Sub1.aClass38_Sub20_Sub3_Sub1_3150, Class38_Sub20_Sub3_Sub1.aByteArray3161);
	}

	@Override
	final void method818(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		Class38_Sub20_Sub3_Sub1.anIntArray3174[0] = -1;
		if (anInt3159 != 1)
			method1043();
		int i_15_ = i_13_ * i_10_ - i_11_ * i_9_ >> 16;
		int i_16_ = i_12_ * i_7_ + i_15_ * i_8_ >> 16;
		int i_17_ = anInt3148 * i_8_ >> 16;
		int i_18_ = i_16_ + i_17_;
		if (i_18_ > 50 && i_16_ < 3500) {
			int i_19_ = i_13_ * i_9_ + i_11_ * i_10_ >> 16;
			int i_20_ = i_19_ - anInt3148 << 9;
			if (i_20_ / i_18_ < Class38_Sub20_Sub9_Sub4.anInt3522) {
				int i_21_ = i_19_ + anInt3148 << 9;
				if (i_21_ / i_18_ > Class38_Sub20_Sub9_Sub4.anInt3531) {
					int i_22_ = i_12_ * i_8_ - i_15_ * i_7_ >> 16;
					int i_23_ = anInt3148 * i_7_ >> 16;
					int i_24_ = i_22_ + i_23_ << 9;
					if (i_24_ / i_18_ > Class38_Sub20_Sub9_Sub4.anInt3532) {
						int i_25_ = i_23_ + (this.height * i_8_ >> 16);
						int i_26_ = i_22_ - i_25_ << 9;
						if (i_26_ / i_18_ < Class38_Sub20_Sub9_Sub4.anInt3519) {
							int i_27_ = i_17_ + (this.height * i_7_ >> 16);
							boolean bool = false;
							boolean bool_28_ = i_16_ - i_27_ <= 50;
							boolean bool_29_ = bool_28_ || this.anInt3153 > 0;
							boolean bool_30_ = false;
							if (i_14_ > 0 && Class38_Sub20_Sub3_Sub1.aBool3192) {
								int i_31_ = i_16_ - i_17_;
								if (i_31_ <= 50)
									i_31_ = 50;
								if (i_19_ > 0) {
									i_20_ /= i_18_;
									i_21_ /= i_31_;
								} else {
									i_21_ /= i_18_;
									i_20_ /= i_31_;
								}
								if (i_22_ > 0) {
									i_26_ /= i_18_;
									i_24_ /= i_31_;
								} else {
									i_24_ /= i_18_;
									i_26_ /= i_31_;
								}
								int i_32_ = Class38_Sub20_Sub3_Sub1.anInt3181 - Class38_Sub20_Sub9_Sub4.anInt3521;
								int i_33_ = Class38_Sub20_Sub3_Sub1.anInt3182 - Class38_Sub20_Sub9_Sub4.anInt3536;
								if (i_32_ > i_20_ && i_32_ < i_21_ && i_33_ > i_26_ && i_33_ < i_24_)
									if (this.aBool3141)
										Class38_Sub20_Sub3_Sub1.anIntArray3186[Class38_Sub20_Sub3_Sub1.anInt3201++] = i_14_;
									else
										bool_30_ = true;
							}
							int i_34_ = Class38_Sub20_Sub9_Sub4.anInt3521;
							int i_35_ = Class38_Sub20_Sub9_Sub4.anInt3536;
							int i_36_ = 0;
							int i_37_ = 0;
							if (i != 0) {
								i_36_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[i];
								i_37_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[i];
							}
							for (int i_38_ = 0; i_38_ < this.anInt3166; i_38_++) {
								int i_39_ = this.anIntArray3156[i_38_];
								int i_40_ = this.anIntArray3140[i_38_];
								int i_41_ = this.anIntArray3149[i_38_];
								if (i != 0) {
									int i_42_ = i_41_ * i_36_ + i_39_ * i_37_ >> 16;
									i_41_ = i_41_ * i_37_ - i_39_ * i_36_ >> 16;
									i_39_ = i_42_;
								}
								i_39_ += i_11_;
								i_40_ += i_12_;
								i_41_ += i_13_;
								int i_43_ = i_41_ * i_9_ + i_39_ * i_10_ >> 16;
								i_41_ = i_41_ * i_10_ - i_39_ * i_9_ >> 16;
								i_39_ = i_43_;
								i_43_ = i_40_ * i_8_ - i_41_ * i_7_ >> 16;
								i_41_ = i_40_ * i_7_ + i_41_ * i_8_ >> 16;
								i_40_ = i_43_;
								Class38_Sub20_Sub3_Sub1.anIntArray3178[i_38_] = i_41_ - i_16_;
								if (i_41_ >= 50) {
									Class38_Sub20_Sub3_Sub1.anIntArray3191[i_38_] = i_34_ + (i_39_ << 9) / i_41_;
									Class38_Sub20_Sub3_Sub1.anIntArray3183[i_38_] = i_35_ + (i_40_ << 9) / i_41_;
								} else {
									Class38_Sub20_Sub3_Sub1.anIntArray3191[i_38_] = -5000;
									bool = true;
								}
								if (bool_29_) {
									Class38_Sub20_Sub3_Sub1.anIntArray3190[i_38_] = i_39_;
									Class38_Sub20_Sub3_Sub1.anIntArray3175[i_38_] = i_40_;
									Class38_Sub20_Sub3_Sub1.anIntArray3194[i_38_] = i_41_;
								}
							}
							try {
								method1045(bool, bool_30_, i_14_);
							} catch (Exception exception) {
								/* empty */
							}
						}
					}
				}
			}
		}
	}

	private Class38_Sub20_Sub3_Sub1 method1039(boolean bool, Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_44_, byte[] is) {
		class38_sub20_sub3_sub1_44_.anInt3166 = this.anInt3166;
		class38_sub20_sub3_sub1_44_.anInt3167 = this.anInt3167;
		class38_sub20_sub3_sub1_44_.anInt3153 = this.anInt3153;
		if (class38_sub20_sub3_sub1_44_.anIntArray3156 == null || class38_sub20_sub3_sub1_44_.anIntArray3156.length < this.anInt3166) {
			class38_sub20_sub3_sub1_44_.anIntArray3156 = new int[this.anInt3166 + 100];
			class38_sub20_sub3_sub1_44_.anIntArray3140 = new int[this.anInt3166 + 100];
			class38_sub20_sub3_sub1_44_.anIntArray3149 = new int[this.anInt3166 + 100];
		}
		for (int i = 0; i < this.anInt3166; i++) {
			class38_sub20_sub3_sub1_44_.anIntArray3156[i] = this.anIntArray3156[i];
			class38_sub20_sub3_sub1_44_.anIntArray3140[i] = this.anIntArray3140[i];
			class38_sub20_sub3_sub1_44_.anIntArray3149[i] = this.anIntArray3149[i];
		}
		if (bool)
			class38_sub20_sub3_sub1_44_.aByteArray3155 = this.aByteArray3155;
		else {
			class38_sub20_sub3_sub1_44_.aByteArray3155 = is;
			if (this.aByteArray3155 == null)
				for (int i = 0; i < this.anInt3167; i++)
					class38_sub20_sub3_sub1_44_.aByteArray3155[i] = (byte) 0;
			else
				for (int i = 0; i < this.anInt3167; i++)
					class38_sub20_sub3_sub1_44_.aByteArray3155[i] = this.aByteArray3155[i];
		}
		class38_sub20_sub3_sub1_44_.anIntArray3157 = this.anIntArray3157;
		class38_sub20_sub3_sub1_44_.anIntArray3152 = this.anIntArray3152;
		class38_sub20_sub3_sub1_44_.anIntArray3165 = this.anIntArray3165;
		class38_sub20_sub3_sub1_44_.anIntArray3164 = this.anIntArray3164;
		class38_sub20_sub3_sub1_44_.anIntArray3146 = this.anIntArray3146;
		class38_sub20_sub3_sub1_44_.anIntArray3144 = this.anIntArray3144;
		class38_sub20_sub3_sub1_44_.aByteArray3168 = this.aByteArray3168;
		class38_sub20_sub3_sub1_44_.aByteArray3158 = this.aByteArray3158;
		class38_sub20_sub3_sub1_44_.aShortArray3151 = this.aShortArray3151;
		class38_sub20_sub3_sub1_44_.aByte3147 = this.aByte3147;
		class38_sub20_sub3_sub1_44_.anIntArray3169 = this.anIntArray3169;
		class38_sub20_sub3_sub1_44_.anIntArray3154 = this.anIntArray3154;
		class38_sub20_sub3_sub1_44_.anIntArray3145 = this.anIntArray3145;
		class38_sub20_sub3_sub1_44_.anIntArrayArray3163 = this.anIntArrayArray3163;
		class38_sub20_sub3_sub1_44_.anIntArrayArray3143 = this.anIntArrayArray3143;
		class38_sub20_sub3_sub1_44_.aBool3141 = this.aBool3141;
		class38_sub20_sub3_sub1_44_.anInt3159 = 0;
		return class38_sub20_sub3_sub1_44_;
	}

	final void method1040() {
		for (int i = 0; i < this.anInt3166; i++) {
			int i_45_ = this.anIntArray3156[i];
			this.anIntArray3156[i] = this.anIntArray3149[i];
			this.anIntArray3149[i] = -i_45_;
		}
		anInt3159 = 0;
	}

	final void method1041(int i) {
		int i_46_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[i];
		int i_47_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[i];
		for (int i_48_ = 0; i_48_ < this.anInt3166; i_48_++) {
			int i_49_ = this.anIntArray3140[i_48_] * i_47_ - this.anIntArray3149[i_48_] * i_46_ >> 16;
			this.anIntArray3149[i_48_] = this.anIntArray3140[i_48_] * i_46_ + this.anIntArray3149[i_48_] * i_47_ >> 16;
			this.anIntArray3140[i_48_] = i_49_;
		}
		anInt3159 = 0;
	}

	final void method1042() {
		for (int i = 0; i < this.anInt3166; i++) {
			this.anIntArray3156[i] = -this.anIntArray3156[i];
			this.anIntArray3149[i] = -this.anIntArray3149[i];
		}
		anInt3159 = 0;
	}

	final void method1043() {
		if (anInt3159 != 1) {
			anInt3159 = 1;
			this.height = 0;
			anInt3162 = 0;
			anInt3148 = 0;
			for (int i = 0; i < this.anInt3166; i++) {
				int i_50_ = this.anIntArray3156[i];
				int i_51_ = this.anIntArray3140[i];
				int i_52_ = this.anIntArray3149[i];
				if (-i_51_ > this.height)
					this.height = -i_51_;
				if (i_51_ > anInt3162)
					anInt3162 = i_51_;
				int i_53_ = i_50_ * i_50_ + i_52_ * i_52_;
				if (i_53_ > anInt3148)
					anInt3148 = i_53_;
			}
			anInt3148 = (int) (Math.sqrt(anInt3148) + 0.99);
			anInt3142 = (int) (Math.sqrt(anInt3148 * anInt3148 + this.height * this.height) + 0.99);
			anInt3160 = anInt3142 + (int) (Math.sqrt(anInt3148 * anInt3148 + anInt3162 * anInt3162) + 0.99);
		}
	}

	final void method1044(int i, int i_54_, int i_55_) {
		for (int i_56_ = 0; i_56_ < this.anInt3166; i_56_++) {
			this.anIntArray3156[i_56_] = this.anIntArray3156[i_56_] * i / 128;
			this.anIntArray3140[i_56_] = this.anIntArray3140[i_56_] * i_54_ / 128;
			this.anIntArray3149[i_56_] = this.anIntArray3149[i_56_] * i_55_ / 128;
		}
		anInt3159 = 0;
	}

	private void method1045(boolean bool, boolean bool_57_, int i) {
		if (anInt3160 < 1600) {
			for (int i_58_ = 0; i_58_ < anInt3160; i_58_++)
				Class38_Sub20_Sub3_Sub1.anIntArray3174[i_58_] = 0;
			for (int i_59_ = 0; i_59_ < this.anInt3167; i_59_++)
				if (this.anIntArray3144[i_59_] != -2) {
					int i_60_ = this.anIntArray3157[i_59_];
					int i_61_ = this.anIntArray3152[i_59_];
					int i_62_ = this.anIntArray3165[i_59_];
					int i_63_ = Class38_Sub20_Sub3_Sub1.anIntArray3191[i_60_];
					int i_64_ = Class38_Sub20_Sub3_Sub1.anIntArray3191[i_61_];
					int i_65_ = Class38_Sub20_Sub3_Sub1.anIntArray3191[i_62_];
					if (bool && (i_63_ == -5000 || i_64_ == -5000 || i_65_ == -5000)) {
						int i_66_ = Class38_Sub20_Sub3_Sub1.anIntArray3190[i_60_];
						int i_67_ = Class38_Sub20_Sub3_Sub1.anIntArray3190[i_61_];
						int i_68_ = Class38_Sub20_Sub3_Sub1.anIntArray3190[i_62_];
						int i_69_ = Class38_Sub20_Sub3_Sub1.anIntArray3175[i_60_];
						int i_70_ = Class38_Sub20_Sub3_Sub1.anIntArray3175[i_61_];
						int i_71_ = Class38_Sub20_Sub3_Sub1.anIntArray3175[i_62_];
						int i_72_ = Class38_Sub20_Sub3_Sub1.anIntArray3194[i_60_];
						int i_73_ = Class38_Sub20_Sub3_Sub1.anIntArray3194[i_61_];
						int i_74_ = Class38_Sub20_Sub3_Sub1.anIntArray3194[i_62_];
						i_66_ -= i_67_;
						i_68_ -= i_67_;
						i_69_ -= i_70_;
						i_71_ -= i_70_;
						i_72_ -= i_73_;
						i_74_ -= i_73_;
						int i_75_ = i_69_ * i_74_ - i_72_ * i_71_;
						int i_76_ = i_72_ * i_68_ - i_66_ * i_74_;
						int i_77_ = i_66_ * i_71_ - i_69_ * i_68_;
						if (i_67_ * i_75_ + i_70_ * i_76_ + i_73_ * i_77_ > 0) {
							Class38_Sub20_Sub3_Sub1.aBoolArray3189[i_59_] = true;
							int i_78_ = (Class38_Sub20_Sub3_Sub1.anIntArray3178[i_60_] + Class38_Sub20_Sub3_Sub1.anIntArray3178[i_61_] + Class38_Sub20_Sub3_Sub1.anIntArray3178[i_62_]) / 3 + anInt3142;
							Class38_Sub20_Sub3_Sub1.anIntArrayArray3193[i_78_][Class38_Sub20_Sub3_Sub1.anIntArray3174[i_78_]++] = i_59_;
						}
					} else {
						if (bool_57_ && method1050(Class38_Sub20_Sub3_Sub1.anInt3181, Class38_Sub20_Sub3_Sub1.anInt3182, Class38_Sub20_Sub3_Sub1.anIntArray3183[i_60_], Class38_Sub20_Sub3_Sub1.anIntArray3183[i_61_], Class38_Sub20_Sub3_Sub1.anIntArray3183[i_62_], i_63_, i_64_, i_65_)) {
							Class38_Sub20_Sub3_Sub1.anIntArray3186[Class38_Sub20_Sub3_Sub1.anInt3201++] = i;
							bool_57_ = false;
						}
						if ((i_63_ - i_64_) * (Class38_Sub20_Sub3_Sub1.anIntArray3183[i_62_] - Class38_Sub20_Sub3_Sub1.anIntArray3183[i_61_]) - (Class38_Sub20_Sub3_Sub1.anIntArray3183[i_60_] - Class38_Sub20_Sub3_Sub1.anIntArray3183[i_61_]) * (i_65_ - i_64_) > 0) {
							Class38_Sub20_Sub3_Sub1.aBoolArray3189[i_59_] = false;
							Class38_Sub20_Sub3_Sub1.aBoolArray3195[i_59_] = i_63_ < 0 || i_64_ < 0 || i_65_ < 0 || i_63_ > Class38_Sub20_Sub9_Sub4.anInt3537 || i_64_ > Class38_Sub20_Sub9_Sub4.anInt3537 || i_65_ > Class38_Sub20_Sub9_Sub4.anInt3537;
							int i_79_ = (Class38_Sub20_Sub3_Sub1.anIntArray3178[i_60_] + Class38_Sub20_Sub3_Sub1.anIntArray3178[i_61_] + Class38_Sub20_Sub3_Sub1.anIntArray3178[i_62_]) / 3 + anInt3142;
							Class38_Sub20_Sub3_Sub1.anIntArrayArray3193[i_79_][Class38_Sub20_Sub3_Sub1.anIntArray3174[i_79_]++] = i_59_;
						}
					}
				}
			if (this.aByteArray3168 == null)
				for (int i_80_ = anInt3160 - 1; i_80_ >= 0; i_80_--) {
					int i_81_ = Class38_Sub20_Sub3_Sub1.anIntArray3174[i_80_];
					if (i_81_ > 0) {
						int[] is = Class38_Sub20_Sub3_Sub1.anIntArrayArray3193[i_80_];
						for (int i_82_ = 0; i_82_ < i_81_; i_82_++)
							method1037(is[i_82_]);
					}
				}
			else {
				for (int i_83_ = 0; i_83_ < 12; i_83_++) {
					Class38_Sub20_Sub3_Sub1.anIntArray3197[i_83_] = 0;
					Class38_Sub20_Sub3_Sub1.anIntArray3172[i_83_] = 0;
				}
				for (int i_84_ = anInt3160 - 1; i_84_ >= 0; i_84_--) {
					int i_85_ = Class38_Sub20_Sub3_Sub1.anIntArray3174[i_84_];
					if (i_85_ > 0) {
						int[] is = Class38_Sub20_Sub3_Sub1.anIntArrayArray3193[i_84_];
						for (int i_86_ = 0; i_86_ < i_85_; i_86_++) {
							int i_87_ = is[i_86_];
							byte i_88_ = this.aByteArray3168[i_87_];
							int i_89_ = Class38_Sub20_Sub3_Sub1.anIntArray3197[i_88_]++;
							Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[i_88_][i_89_] = i_87_;
							if (i_88_ < 10)
								Class38_Sub20_Sub3_Sub1.anIntArray3172[i_88_] += i_84_;
							else if (i_88_ == 10)
								Class38_Sub20_Sub3_Sub1.anIntArray3187[i_89_] = i_84_;
							else
								Class38_Sub20_Sub3_Sub1.anIntArray3176[i_89_] = i_84_;
						}
					}
				}
				int i_90_ = 0;
				if (Class38_Sub20_Sub3_Sub1.anIntArray3197[1] > 0 || Class38_Sub20_Sub3_Sub1.anIntArray3197[2] > 0)
					i_90_ = (Class38_Sub20_Sub3_Sub1.anIntArray3172[1] + Class38_Sub20_Sub3_Sub1.anIntArray3172[2]) / (Class38_Sub20_Sub3_Sub1.anIntArray3197[1] + Class38_Sub20_Sub3_Sub1.anIntArray3197[2]);
				int i_91_ = 0;
				if (Class38_Sub20_Sub3_Sub1.anIntArray3197[3] > 0 || Class38_Sub20_Sub3_Sub1.anIntArray3197[4] > 0)
					i_91_ = (Class38_Sub20_Sub3_Sub1.anIntArray3172[3] + Class38_Sub20_Sub3_Sub1.anIntArray3172[4]) / (Class38_Sub20_Sub3_Sub1.anIntArray3197[3] + Class38_Sub20_Sub3_Sub1.anIntArray3197[4]);
				int i_92_ = 0;
				if (Class38_Sub20_Sub3_Sub1.anIntArray3197[6] > 0 || Class38_Sub20_Sub3_Sub1.anIntArray3197[8] > 0)
					i_92_ = (Class38_Sub20_Sub3_Sub1.anIntArray3172[6] + Class38_Sub20_Sub3_Sub1.anIntArray3172[8]) / (Class38_Sub20_Sub3_Sub1.anIntArray3197[6] + Class38_Sub20_Sub3_Sub1.anIntArray3197[8]);
				int i_93_ = 0;
				int i_94_ = Class38_Sub20_Sub3_Sub1.anIntArray3197[10];
				int[] is = Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[10];
				int[] is_95_ = Class38_Sub20_Sub3_Sub1.anIntArray3187;
				if (i_93_ == i_94_) {
					i_93_ = 0;
					i_94_ = Class38_Sub20_Sub3_Sub1.anIntArray3197[11];
					is = Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[11];
					is_95_ = Class38_Sub20_Sub3_Sub1.anIntArray3176;
				}
				int i_96_;
				if (i_93_ < i_94_)
					i_96_ = is_95_[i_93_];
				else
					i_96_ = -1000;
				for (int i_97_ = 0; i_97_ < 10; i_97_++) {
					while (i_97_ == 0) {
						if (i_96_ <= i_90_)
							break;
						method1037(is[i_93_++]);
						if (i_93_ == i_94_ && is != Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[11]) {
							i_93_ = 0;
							i_94_ = Class38_Sub20_Sub3_Sub1.anIntArray3197[11];
							is = Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[11];
							is_95_ = Class38_Sub20_Sub3_Sub1.anIntArray3176;
						}
						if (i_93_ < i_94_)
							i_96_ = is_95_[i_93_];
						else
							i_96_ = -1000;
					}
					while (i_97_ == 3) {
						if (i_96_ <= i_91_)
							break;
						method1037(is[i_93_++]);
						if (i_93_ == i_94_ && is != Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[11]) {
							i_93_ = 0;
							i_94_ = Class38_Sub20_Sub3_Sub1.anIntArray3197[11];
							is = Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[11];
							is_95_ = Class38_Sub20_Sub3_Sub1.anIntArray3176;
						}
						if (i_93_ < i_94_)
							i_96_ = is_95_[i_93_];
						else
							i_96_ = -1000;
					}
					while (i_97_ == 5 && i_96_ > i_92_) {
						method1037(is[i_93_++]);
						if (i_93_ == i_94_ && is != Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[11]) {
							i_93_ = 0;
							i_94_ = Class38_Sub20_Sub3_Sub1.anIntArray3197[11];
							is = Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[11];
							is_95_ = Class38_Sub20_Sub3_Sub1.anIntArray3176;
						}
						if (i_93_ < i_94_)
							i_96_ = is_95_[i_93_];
						else
							i_96_ = -1000;
					}
					int i_98_ = Class38_Sub20_Sub3_Sub1.anIntArray3197[i_97_];
					int[] is_99_ = Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[i_97_];
					for (int i_100_ = 0; i_100_ < i_98_; i_100_++)
						method1037(is_99_[i_100_]);
				}
				while (i_96_ != -1000) {
					method1037(is[i_93_++]);
					if (i_93_ == i_94_ && is != Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[11]) {
						i_93_ = 0;
						is = Class38_Sub20_Sub3_Sub1.anIntArrayArray3196[11];
						i_94_ = Class38_Sub20_Sub3_Sub1.anIntArray3197[11];
						is_95_ = Class38_Sub20_Sub3_Sub1.anIntArray3176;
					}
					if (i_93_ < i_94_)
						i_96_ = is_95_[i_93_];
					else
						i_96_ = -1000;
				}
			}
		}
	}

	private void method1046() {
		if (anInt3159 != 2) {
			anInt3159 = 2;
			anInt3148 = 0;
			for (int i = 0; i < this.anInt3166; i++) {
				int i_101_ = this.anIntArray3156[i];
				int i_102_ = this.anIntArray3140[i];
				int i_103_ = this.anIntArray3149[i];
				int i_104_ = i_101_ * i_101_ + i_103_ * i_103_ + i_102_ * i_102_;
				if (i_104_ > anInt3148)
					anInt3148 = i_104_;
			}
			anInt3148 = (int) (Math.sqrt(anInt3148) + 0.99);
			anInt3142 = anInt3148;
			anInt3160 = anInt3148 + anInt3148;
		}
	}

	final Class38_Sub20_Sub3_Sub1 method1047(int[][] is, int i, int i_105_, int i_106_, boolean bool, int i_107_) {
		method1043();
		int i_108_ = i - anInt3148;
		int i_109_ = i + anInt3148;
		int i_110_ = i_106_ - anInt3148;
		int i_111_ = i_106_ + anInt3148;
		if (i_108_ < 0 || i_109_ + 128 >> 7 >= is.length || i_110_ < 0 || i_111_ + 128 >> 7 >= is[0].length)
			return this;
		i_108_ >>= 7;
		i_109_ = i_109_ + 127 >> 7;
		i_110_ >>= 7;
		i_111_ = i_111_ + 127 >> 7;
		if (is[i_108_][i_110_] == i_105_ && is[i_109_][i_110_] == i_105_ && is[i_108_][i_111_] == i_105_ && is[i_109_][i_111_] == i_105_)
			return this;
		Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_112_;
		if (bool) {
			class38_sub20_sub3_sub1_112_ = new Class38_Sub20_Sub3_Sub1();
			class38_sub20_sub3_sub1_112_.anInt3166 = this.anInt3166;
			class38_sub20_sub3_sub1_112_.anInt3167 = this.anInt3167;
			class38_sub20_sub3_sub1_112_.anInt3153 = this.anInt3153;
			class38_sub20_sub3_sub1_112_.anIntArray3156 = this.anIntArray3156;
			class38_sub20_sub3_sub1_112_.anIntArray3149 = this.anIntArray3149;
			class38_sub20_sub3_sub1_112_.anIntArray3157 = this.anIntArray3157;
			class38_sub20_sub3_sub1_112_.anIntArray3152 = this.anIntArray3152;
			class38_sub20_sub3_sub1_112_.anIntArray3165 = this.anIntArray3165;
			class38_sub20_sub3_sub1_112_.anIntArray3164 = this.anIntArray3164;
			class38_sub20_sub3_sub1_112_.anIntArray3146 = this.anIntArray3146;
			class38_sub20_sub3_sub1_112_.anIntArray3144 = this.anIntArray3144;
			class38_sub20_sub3_sub1_112_.aByteArray3168 = this.aByteArray3168;
			class38_sub20_sub3_sub1_112_.aByteArray3155 = this.aByteArray3155;
			class38_sub20_sub3_sub1_112_.aByteArray3158 = this.aByteArray3158;
			class38_sub20_sub3_sub1_112_.aShortArray3151 = this.aShortArray3151;
			class38_sub20_sub3_sub1_112_.aByte3147 = this.aByte3147;
			class38_sub20_sub3_sub1_112_.anIntArray3169 = this.anIntArray3169;
			class38_sub20_sub3_sub1_112_.anIntArray3154 = this.anIntArray3154;
			class38_sub20_sub3_sub1_112_.anIntArray3145 = this.anIntArray3145;
			class38_sub20_sub3_sub1_112_.anIntArrayArray3163 = this.anIntArrayArray3163;
			class38_sub20_sub3_sub1_112_.anIntArrayArray3143 = this.anIntArrayArray3143;
			class38_sub20_sub3_sub1_112_.aBool3141 = this.aBool3141;
			class38_sub20_sub3_sub1_112_.anIntArray3140 = new int[class38_sub20_sub3_sub1_112_.anInt3166];
		} else
			class38_sub20_sub3_sub1_112_ = this;
		if (i_107_ == 0)
			for (int i_113_ = 0; i_113_ < class38_sub20_sub3_sub1_112_.anInt3166; i_113_++) {
				int i_114_ = this.anIntArray3156[i_113_] + i;
				int i_115_ = this.anIntArray3149[i_113_] + i_106_;
				int i_116_ = i_114_ & 0x7f;
				int i_117_ = i_115_ & 0x7f;
				int i_118_ = i_114_ >> 7;
				int i_119_ = i_115_ >> 7;
				int i_120_ = is[i_118_][i_119_] * (128 - i_116_) + is[i_118_ + 1][i_119_] * i_116_ >> 7;
				int i_121_ = is[i_118_][i_119_ + 1] * (128 - i_116_) + is[i_118_ + 1][i_119_ + 1] * i_116_ >> 7;
				int i_122_ = i_120_ * (128 - i_117_) + i_121_ * i_117_ >> 7;
				class38_sub20_sub3_sub1_112_.anIntArray3140[i_113_] = this.anIntArray3140[i_113_] + i_122_ - i_105_;
			}
		else
			for (int i_123_ = 0; i_123_ < class38_sub20_sub3_sub1_112_.anInt3166; i_123_++) {
				int i_124_ = (-this.anIntArray3140[i_123_] << 16) / this.height;
				if (i_124_ < i_107_) {
					int i_125_ = this.anIntArray3156[i_123_] + i;
					int i_126_ = this.anIntArray3149[i_123_] + i_106_;
					int i_127_ = i_125_ & 0x7f;
					int i_128_ = i_126_ & 0x7f;
					int i_129_ = i_125_ >> 7;
					int i_130_ = i_126_ >> 7;
					int i_131_ = is[i_129_][i_130_] * (128 - i_127_) + is[i_129_ + 1][i_130_] * i_127_ >> 7;
					int i_132_ = is[i_129_][i_130_ + 1] * (128 - i_127_) + is[i_129_ + 1][i_130_ + 1] * i_127_ >> 7;
					int i_133_ = i_131_ * (128 - i_128_) + i_132_ * i_128_ >> 7;
					class38_sub20_sub3_sub1_112_.anIntArray3140[i_123_] = this.anIntArray3140[i_123_] + (i_133_ - i_105_) * (i_107_ - i_124_) / i_107_;
				}
			}
		class38_sub20_sub3_sub1_112_.anInt3159 = 0;
		return class38_sub20_sub3_sub1_112_;
	}

	final void method1048(int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_) {
		Class38_Sub20_Sub3_Sub1.anIntArray3174[0] = -1;
		if (anInt3159 != 2 && anInt3159 != 1)
			method1046();
		int i_141_ = Class38_Sub20_Sub9_Sub4.anInt3521;
		int i_142_ = Class38_Sub20_Sub9_Sub4.anInt3536;
		int i_143_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[0];
		int i_144_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[0];
		int i_145_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[i_134_];
		int i_146_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[i_134_];
		int i_147_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[i_135_];
		int i_148_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[i_135_];
		int i_149_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[i_136_];
		int i_150_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[i_136_];
		int i_151_ = i_138_ * i_149_ + i_139_ * i_150_ >> 16;
		for (int i_152_ = 0; i_152_ < this.anInt3166; i_152_++) {
			int i_153_ = this.anIntArray3156[i_152_];
			int i_154_ = this.anIntArray3140[i_152_];
			int i_155_ = this.anIntArray3149[i_152_];
			if (i_135_ != 0) {
				int i_156_ = i_154_ * i_147_ + i_153_ * i_148_ >> 16;
				i_154_ = i_154_ * i_148_ - i_153_ * i_147_ >> 16;
				i_153_ = i_156_;
			}
			if (0 != 0) {
				int i_157_ = i_154_ * i_144_ - i_155_ * i_143_ >> 16;
				i_155_ = i_154_ * i_143_ + i_155_ * i_144_ >> 16;
				i_154_ = i_157_;
			}
			if (i_134_ != 0) {
				int i_158_ = i_155_ * i_145_ + i_153_ * i_146_ >> 16;
				i_155_ = i_155_ * i_146_ - i_153_ * i_145_ >> 16;
				i_153_ = i_158_;
			}
			i_153_ += i_137_;
			i_154_ += i_138_;
			i_155_ += i_139_;
			int i_159_ = i_154_ * i_150_ - i_155_ * i_149_ >> 16;
			i_155_ = i_154_ * i_149_ + i_155_ * i_150_ >> 16;
			i_154_ = i_159_;
			Class38_Sub20_Sub3_Sub1.anIntArray3178[i_152_] = i_155_ - i_151_;
			Class38_Sub20_Sub3_Sub1.anIntArray3191[i_152_] = i_141_ + (i_153_ << 9) / i_140_;
			Class38_Sub20_Sub3_Sub1.anIntArray3183[i_152_] = i_142_ + (i_154_ << 9) / i_140_;
			if (this.anInt3153 > 0) {
				Class38_Sub20_Sub3_Sub1.anIntArray3190[i_152_] = i_153_;
				Class38_Sub20_Sub3_Sub1.anIntArray3175[i_152_] = i_154_;
				Class38_Sub20_Sub3_Sub1.anIntArray3194[i_152_] = i_155_;
			}
		}
		try {
			method1045(false, false, 0);
		} catch (Exception exception) {
			/* empty */
		}
	}

	final void method1049(Class38_Sub20_Sub13 class38_sub20_sub13, int i) {
		if (this.anIntArrayArray3163 != null && i != -1) {
			Animation animation = class38_sub20_sub13.aClass7Array3018[i];
			Class38_Sub14 class38_sub14 = animation.aClass38_Sub14_132;
			Class38_Sub20_Sub3_Sub1.anInt3185 = 0;
			Class38_Sub20_Sub3_Sub1.anInt3177 = 0;
			Class38_Sub20_Sub3_Sub1.anInt3198 = 0;
			for (int i_160_ = 0; i_160_ < animation.anInt133; i_160_++) {
				int i_161_ = animation.anIntArray139[i_160_];
				method1058(class38_sub14.anIntArray2129[i_161_], class38_sub14.anIntArrayArray2125[i_161_], animation.anIntArray137[i_160_], animation.anIntArray140[i_160_], animation.anIntArray134[i_160_]);
			}
			anInt3159 = 0;
		}
	}

	private boolean method1050(int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_) {
		if (i_162_ < i_163_ && i_162_ < i_164_ && i_162_ < i_165_)
			return false;
		if (i_162_ > i_163_ && i_162_ > i_164_ && i_162_ > i_165_)
			return false;
		if (i < i_166_ && i < i_167_ && i < i_168_)
			return false;
		return i <= i_166_ || i <= i_167_ || i <= i_168_;
	}

	final void method1051() {
		for (int i = 0; i < this.anInt3166; i++) {
			int i_169_ = this.anIntArray3149[i];
			this.anIntArray3149[i] = this.anIntArray3156[i];
			this.anIntArray3156[i] = -i_169_;
		}
		anInt3159 = 0;
	}

	final void method1052(int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_) {
		Class38_Sub20_Sub3_Sub1.anIntArray3174[0] = -1;
		if (anInt3159 != 2 && anInt3159 != 1)
			method1046();
		int i_176_ = Class38_Sub20_Sub9_Sub4.anInt3521;
		int i_177_ = Class38_Sub20_Sub9_Sub4.anInt3536;
		int i_178_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[0];
		int i_179_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[0];
		int i_180_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[i_170_];
		int i_181_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[i_170_];
		int i_182_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[i_171_];
		int i_183_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[i_171_];
		int i_184_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[i_172_];
		int i_185_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[i_172_];
		int i_186_ = i_174_ * i_184_ + i_175_ * i_185_ >> 16;
		for (int i_187_ = 0; i_187_ < this.anInt3166; i_187_++) {
			int i_188_ = this.anIntArray3156[i_187_];
			int i_189_ = this.anIntArray3140[i_187_];
			int i_190_ = this.anIntArray3149[i_187_];
			if (i_171_ != 0) {
				int i_191_ = i_189_ * i_182_ + i_188_ * i_183_ >> 16;
				i_189_ = i_189_ * i_183_ - i_188_ * i_182_ >> 16;
				i_188_ = i_191_;
			}
			if (0 != 0) {
				int i_192_ = i_189_ * i_179_ - i_190_ * i_178_ >> 16;
				i_190_ = i_189_ * i_178_ + i_190_ * i_179_ >> 16;
				i_189_ = i_192_;
			}
			if (i_170_ != 0) {
				int i_193_ = i_190_ * i_180_ + i_188_ * i_181_ >> 16;
				i_190_ = i_190_ * i_181_ - i_188_ * i_180_ >> 16;
				i_188_ = i_193_;
			}
			i_188_ += i_173_;
			i_189_ += i_174_;
			i_190_ += i_175_;
			int i_194_ = i_189_ * i_185_ - i_190_ * i_184_ >> 16;
			i_190_ = i_189_ * i_184_ + i_190_ * i_185_ >> 16;
			i_189_ = i_194_;
			Class38_Sub20_Sub3_Sub1.anIntArray3178[i_187_] = i_190_ - i_186_;
			Class38_Sub20_Sub3_Sub1.anIntArray3191[i_187_] = i_176_ + (i_188_ << 9) / i_190_;
			Class38_Sub20_Sub3_Sub1.anIntArray3183[i_187_] = i_177_ + (i_189_ << 9) / i_190_;
			if (this.anInt3153 > 0) {
				Class38_Sub20_Sub3_Sub1.anIntArray3190[i_187_] = i_188_;
				Class38_Sub20_Sub3_Sub1.anIntArray3175[i_187_] = i_189_;
				Class38_Sub20_Sub3_Sub1.anIntArray3194[i_187_] = i_190_;
			}
		}
		try {
			method1045(false, false, 0);
		} catch (Exception exception) {
			/* empty */
		}
	}

	final void method1053(Class38_Sub20_Sub13 class38_sub20_sub13, int i, Class38_Sub20_Sub13 class38_sub20_sub13_195_, int i_196_, int[] is) {
		if (i != -1)
			if (is == null || i_196_ == -1)
				method1049(class38_sub20_sub13, i);
			else {
				Animation animation = class38_sub20_sub13.aClass7Array3018[i];
				Animation class7_197_ = class38_sub20_sub13_195_.aClass7Array3018[i_196_];
				Class38_Sub14 class38_sub14 = animation.aClass38_Sub14_132;
				Class38_Sub20_Sub3_Sub1.anInt3185 = 0;
				Class38_Sub20_Sub3_Sub1.anInt3177 = 0;
				Class38_Sub20_Sub3_Sub1.anInt3198 = 0;
				int i_198_ = 0;
				int i_199_ = is[i_198_++];
				for (int i_200_ = 0; i_200_ < animation.anInt133; i_200_++) {
					int i_201_;
					for (i_201_ = animation.anIntArray139[i_200_]; i_201_ > i_199_; i_199_ = is[i_198_++]) {
						/* empty */
					}
					if (i_201_ != i_199_ || class38_sub14.anIntArray2129[i_201_] == 0)
						method1058(class38_sub14.anIntArray2129[i_201_], class38_sub14.anIntArrayArray2125[i_201_], animation.anIntArray137[i_200_], animation.anIntArray140[i_200_], animation.anIntArray134[i_200_]);
				}
				Class38_Sub20_Sub3_Sub1.anInt3185 = 0;
				Class38_Sub20_Sub3_Sub1.anInt3177 = 0;
				Class38_Sub20_Sub3_Sub1.anInt3198 = 0;
				i_198_ = 0;
				i_199_ = is[i_198_++];
				for (int i_202_ = 0; i_202_ < class7_197_.anInt133; i_202_++) {
					int i_203_;
					for (i_203_ = class7_197_.anIntArray139[i_202_]; i_203_ > i_199_; i_199_ = is[i_198_++]) {
						/* empty */
					}
					if (i_203_ == i_199_ || class38_sub14.anIntArray2129[i_203_] == 0)
						method1058(class38_sub14.anIntArray2129[i_203_], class38_sub14.anIntArrayArray2125[i_203_], class7_197_.anIntArray137[i_202_], class7_197_.anIntArray140[i_202_], class7_197_.anIntArray134[i_202_]);
				}
				anInt3159 = 0;
			}
	}

	final int method1055() {
		method1043();
		return anInt3148;
	}

	final void method1056(int i, int i_204_, int i_205_) {
		for (int i_206_ = 0; i_206_ < this.anInt3166; i_206_++) {
			this.anIntArray3156[i_206_] += i;
			this.anIntArray3140[i_206_] += i_204_;
			this.anIntArray3149[i_206_] += i_205_;
		}
		anInt3159 = 0;
	}

	private void method1057(int i) {
		int i_207_ = Class38_Sub20_Sub9_Sub4.anInt3521;
		int i_208_ = Class38_Sub20_Sub9_Sub4.anInt3536;
		int i_209_ = 0;
		int i_210_ = this.anIntArray3157[i];
		int i_211_ = this.anIntArray3152[i];
		int i_212_ = this.anIntArray3165[i];
		int i_213_ = Class38_Sub20_Sub3_Sub1.anIntArray3194[i_210_];
		int i_214_ = Class38_Sub20_Sub3_Sub1.anIntArray3194[i_211_];
		int i_215_ = Class38_Sub20_Sub3_Sub1.anIntArray3194[i_212_];
		if (this.aByteArray3155 == null)
			Class38_Sub20_Sub9_Sub4.anInt3535 = 0;
		else
			Class38_Sub20_Sub9_Sub4.anInt3535 = this.aByteArray3155[i] & 0xff;
		if (i_213_ >= 50) {
			Class38_Sub20_Sub3_Sub1.anIntArray3179[i_209_] = Class38_Sub20_Sub3_Sub1.anIntArray3191[i_210_];
			Class38_Sub20_Sub3_Sub1.anIntArray3173[i_209_] = Class38_Sub20_Sub3_Sub1.anIntArray3183[i_210_];
			Class38_Sub20_Sub3_Sub1.anIntArray3184[i_209_++] = this.anIntArray3164[i];
		} else {
			int i_216_ = Class38_Sub20_Sub3_Sub1.anIntArray3190[i_210_];
			int i_217_ = Class38_Sub20_Sub3_Sub1.anIntArray3175[i_210_];
			int i_218_ = this.anIntArray3164[i];
			if (i_215_ >= 50) {
				int i_219_ = (50 - i_213_) * Class38_Sub20_Sub3_Sub1.anIntArray3171[i_215_ - i_213_];
				Class38_Sub20_Sub3_Sub1.anIntArray3179[i_209_] = i_207_ + (i_216_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3190[i_212_] - i_216_) * i_219_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3173[i_209_] = i_208_ + (i_217_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3175[i_212_] - i_217_) * i_219_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3184[i_209_++] = i_218_ + ((this.anIntArray3144[i] - i_218_) * i_219_ >> 16);
			}
			if (i_214_ >= 50) {
				int i_220_ = (50 - i_213_) * Class38_Sub20_Sub3_Sub1.anIntArray3171[i_214_ - i_213_];
				Class38_Sub20_Sub3_Sub1.anIntArray3179[i_209_] = i_207_ + (i_216_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3190[i_211_] - i_216_) * i_220_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3173[i_209_] = i_208_ + (i_217_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3175[i_211_] - i_217_) * i_220_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3184[i_209_++] = i_218_ + ((this.anIntArray3146[i] - i_218_) * i_220_ >> 16);
			}
		}
		if (i_214_ >= 50) {
			Class38_Sub20_Sub3_Sub1.anIntArray3179[i_209_] = Class38_Sub20_Sub3_Sub1.anIntArray3191[i_211_];
			Class38_Sub20_Sub3_Sub1.anIntArray3173[i_209_] = Class38_Sub20_Sub3_Sub1.anIntArray3183[i_211_];
			Class38_Sub20_Sub3_Sub1.anIntArray3184[i_209_++] = this.anIntArray3146[i];
		} else {
			int i_221_ = Class38_Sub20_Sub3_Sub1.anIntArray3190[i_211_];
			int i_222_ = Class38_Sub20_Sub3_Sub1.anIntArray3175[i_211_];
			int i_223_ = this.anIntArray3146[i];
			if (i_213_ >= 50) {
				int i_224_ = (50 - i_214_) * Class38_Sub20_Sub3_Sub1.anIntArray3171[i_213_ - i_214_];
				Class38_Sub20_Sub3_Sub1.anIntArray3179[i_209_] = i_207_ + (i_221_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3190[i_210_] - i_221_) * i_224_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3173[i_209_] = i_208_ + (i_222_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3175[i_210_] - i_222_) * i_224_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3184[i_209_++] = i_223_ + ((this.anIntArray3164[i] - i_223_) * i_224_ >> 16);
			}
			if (i_215_ >= 50) {
				int i_225_ = (50 - i_214_) * Class38_Sub20_Sub3_Sub1.anIntArray3171[i_215_ - i_214_];
				Class38_Sub20_Sub3_Sub1.anIntArray3179[i_209_] = i_207_ + (i_221_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3190[i_212_] - i_221_) * i_225_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3173[i_209_] = i_208_ + (i_222_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3175[i_212_] - i_222_) * i_225_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3184[i_209_++] = i_223_ + ((this.anIntArray3144[i] - i_223_) * i_225_ >> 16);
			}
		}
		if (i_215_ >= 50) {
			Class38_Sub20_Sub3_Sub1.anIntArray3179[i_209_] = Class38_Sub20_Sub3_Sub1.anIntArray3191[i_212_];
			Class38_Sub20_Sub3_Sub1.anIntArray3173[i_209_] = Class38_Sub20_Sub3_Sub1.anIntArray3183[i_212_];
			Class38_Sub20_Sub3_Sub1.anIntArray3184[i_209_++] = this.anIntArray3144[i];
		} else {
			int i_226_ = Class38_Sub20_Sub3_Sub1.anIntArray3190[i_212_];
			int i_227_ = Class38_Sub20_Sub3_Sub1.anIntArray3175[i_212_];
			int i_228_ = this.anIntArray3144[i];
			if (i_214_ >= 50) {
				int i_229_ = (50 - i_215_) * Class38_Sub20_Sub3_Sub1.anIntArray3171[i_214_ - i_215_];
				Class38_Sub20_Sub3_Sub1.anIntArray3179[i_209_] = i_207_ + (i_226_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3190[i_211_] - i_226_) * i_229_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3173[i_209_] = i_208_ + (i_227_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3175[i_211_] - i_227_) * i_229_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3184[i_209_++] = i_228_ + ((this.anIntArray3146[i] - i_228_) * i_229_ >> 16);
			}
			if (i_213_ >= 50) {
				int i_230_ = (50 - i_215_) * Class38_Sub20_Sub3_Sub1.anIntArray3171[i_213_ - i_215_];
				Class38_Sub20_Sub3_Sub1.anIntArray3179[i_209_] = i_207_ + (i_226_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3190[i_210_] - i_226_) * i_230_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3173[i_209_] = i_208_ + (i_227_ + ((Class38_Sub20_Sub3_Sub1.anIntArray3175[i_210_] - i_227_) * i_230_ >> 16) << 9) / 50;
				Class38_Sub20_Sub3_Sub1.anIntArray3184[i_209_++] = i_228_ + ((this.anIntArray3164[i] - i_228_) * i_230_ >> 16);
			}
		}
		int i_231_ = Class38_Sub20_Sub3_Sub1.anIntArray3179[0];
		int i_232_ = Class38_Sub20_Sub3_Sub1.anIntArray3179[1];
		int i_233_ = Class38_Sub20_Sub3_Sub1.anIntArray3179[2];
		int i_234_ = Class38_Sub20_Sub3_Sub1.anIntArray3173[0];
		int i_235_ = Class38_Sub20_Sub3_Sub1.anIntArray3173[1];
		int i_236_ = Class38_Sub20_Sub3_Sub1.anIntArray3173[2];
		Class38_Sub20_Sub9_Sub4.aBool3524 = false;
		if (i_209_ == 3) {
			if (i_231_ < 0 || i_232_ < 0 || i_233_ < 0 || i_231_ > Class38_Sub20_Sub9_Sub4.anInt3537 || i_232_ > Class38_Sub20_Sub9_Sub4.anInt3537 || i_233_ > Class38_Sub20_Sub9_Sub4.anInt3537)
				Class38_Sub20_Sub9_Sub4.aBool3524 = true;
			if (this.aShortArray3151 == null || this.aShortArray3151[i] == -1) {
				if (this.anIntArray3144[i] == -1)
					Class38_Sub20_Sub9_Sub4.method1193(i_234_, i_235_, i_236_, i_231_, i_232_, i_233_, Class38_Sub20_Sub3_Sub1.anIntArray3188[this.anIntArray3164[i]]);
				else
					Class38_Sub20_Sub9_Sub4.method1188(i_234_, i_235_, i_236_, i_231_, i_232_, i_233_, Class38_Sub20_Sub3_Sub1.anIntArray3184[0], Class38_Sub20_Sub3_Sub1.anIntArray3184[1], Class38_Sub20_Sub3_Sub1.anIntArray3184[2]);
			} else {
				int i_237_;
				int i_238_;
				int i_239_;
				if (this.aByteArray3158 != null && this.aByteArray3158[i] != -1) {
					int i_240_ = this.aByteArray3158[i] & 0xff;
					i_237_ = this.anIntArray3169[i_240_];
					i_238_ = this.anIntArray3154[i_240_];
					i_239_ = this.anIntArray3145[i_240_];
				} else {
					i_237_ = i_210_;
					i_238_ = i_211_;
					i_239_ = i_212_;
				}
				if (this.anIntArray3144[i] == -1)
					Class38_Sub20_Sub9_Sub4.method1194(i_234_, i_235_, i_236_, i_231_, i_232_, i_233_, this.anIntArray3164[i], this.anIntArray3164[i], this.anIntArray3164[i], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_237_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_238_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_239_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_237_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_238_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_239_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_237_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_238_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_239_], this.aShortArray3151[i]);
				else
					Class38_Sub20_Sub9_Sub4.method1194(i_234_, i_235_, i_236_, i_231_, i_232_, i_233_, Class38_Sub20_Sub3_Sub1.anIntArray3184[0], Class38_Sub20_Sub3_Sub1.anIntArray3184[1], Class38_Sub20_Sub3_Sub1.anIntArray3184[2], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_237_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_238_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_239_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_237_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_238_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_239_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_237_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_238_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_239_], this.aShortArray3151[i]);
			}
		}
		if (i_209_ == 4) {
			if (i_231_ < 0 || i_232_ < 0 || i_233_ < 0 || i_231_ > Class38_Sub20_Sub9_Sub4.anInt3537 || i_232_ > Class38_Sub20_Sub9_Sub4.anInt3537 || i_233_ > Class38_Sub20_Sub9_Sub4.anInt3537 || Class38_Sub20_Sub3_Sub1.anIntArray3179[3] < 0 || Class38_Sub20_Sub3_Sub1.anIntArray3179[3] > Class38_Sub20_Sub9_Sub4.anInt3537)
				Class38_Sub20_Sub9_Sub4.aBool3524 = true;
			if (this.aShortArray3151 == null || this.aShortArray3151[i] == -1) {
				if (this.anIntArray3144[i] == -1) {
					int i_241_ = Class38_Sub20_Sub3_Sub1.anIntArray3188[this.anIntArray3164[i]];
					Class38_Sub20_Sub9_Sub4.method1193(i_234_, i_235_, i_236_, i_231_, i_232_, i_233_, i_241_);
					Class38_Sub20_Sub9_Sub4.method1193(i_234_, i_236_, Class38_Sub20_Sub3_Sub1.anIntArray3173[3], i_231_, i_233_, Class38_Sub20_Sub3_Sub1.anIntArray3179[3], i_241_);
				} else {
					Class38_Sub20_Sub9_Sub4.method1188(i_234_, i_235_, i_236_, i_231_, i_232_, i_233_, Class38_Sub20_Sub3_Sub1.anIntArray3184[0], Class38_Sub20_Sub3_Sub1.anIntArray3184[1], Class38_Sub20_Sub3_Sub1.anIntArray3184[2]);
					Class38_Sub20_Sub9_Sub4.method1188(i_234_, i_236_, Class38_Sub20_Sub3_Sub1.anIntArray3173[3], i_231_, i_233_, Class38_Sub20_Sub3_Sub1.anIntArray3179[3], Class38_Sub20_Sub3_Sub1.anIntArray3184[0], Class38_Sub20_Sub3_Sub1.anIntArray3184[2], Class38_Sub20_Sub3_Sub1.anIntArray3184[3]);
				}
			} else {
				int i_242_;
				int i_243_;
				int i_244_;
				if (this.aByteArray3158 != null && this.aByteArray3158[i] != -1) {
					int i_245_ = this.aByteArray3158[i] & 0xff;
					i_242_ = this.anIntArray3169[i_245_];
					i_243_ = this.anIntArray3154[i_245_];
					i_244_ = this.anIntArray3145[i_245_];
				} else {
					i_242_ = i_210_;
					i_243_ = i_211_;
					i_244_ = i_212_;
				}
				short i_246_ = this.aShortArray3151[i];
				if (this.anIntArray3144[i] == -1) {
					Class38_Sub20_Sub9_Sub4.method1194(i_234_, i_235_, i_236_, i_231_, i_232_, i_233_, this.anIntArray3164[i], this.anIntArray3164[i], this.anIntArray3164[i], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_244_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_244_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_244_], i_246_);
					Class38_Sub20_Sub9_Sub4.method1194(i_234_, i_236_, Class38_Sub20_Sub3_Sub1.anIntArray3173[3], i_231_, i_233_, Class38_Sub20_Sub3_Sub1.anIntArray3179[3], this.anIntArray3164[i], this.anIntArray3164[i], this.anIntArray3164[i], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_244_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_244_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_244_], i_246_);
				} else {
					Class38_Sub20_Sub9_Sub4.method1194(i_234_, i_235_, i_236_, i_231_, i_232_, i_233_, Class38_Sub20_Sub3_Sub1.anIntArray3184[0], Class38_Sub20_Sub3_Sub1.anIntArray3184[1], Class38_Sub20_Sub3_Sub1.anIntArray3184[2], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_244_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_244_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_244_], i_246_);
					Class38_Sub20_Sub9_Sub4.method1194(i_234_, i_236_, Class38_Sub20_Sub3_Sub1.anIntArray3173[3], i_231_, i_233_, Class38_Sub20_Sub3_Sub1.anIntArray3179[3], Class38_Sub20_Sub3_Sub1.anIntArray3184[0], Class38_Sub20_Sub3_Sub1.anIntArray3184[2], Class38_Sub20_Sub3_Sub1.anIntArray3184[3], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3190[i_244_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3175[i_244_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_242_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_243_], Class38_Sub20_Sub3_Sub1.anIntArray3194[i_244_], i_246_);
				}
			}
		}
	}

	private void method1058(int i, int[] is, int i_247_, int i_248_, int i_249_) {
		int i_250_ = is.length;
		if (i == 0) {
			int i_251_ = 0;
			Class38_Sub20_Sub3_Sub1.anInt3185 = 0;
			Class38_Sub20_Sub3_Sub1.anInt3177 = 0;
			Class38_Sub20_Sub3_Sub1.anInt3198 = 0;
			for (int i_253_ : is) {
				if (i_253_ < this.anIntArrayArray3163.length) {
					int[] is_254_ = this.anIntArrayArray3163[i_253_];
					for (int i_256_ : is_254_) {
						Class38_Sub20_Sub3_Sub1.anInt3185 += this.anIntArray3156[i_256_];
						Class38_Sub20_Sub3_Sub1.anInt3177 += this.anIntArray3140[i_256_];
						Class38_Sub20_Sub3_Sub1.anInt3198 += this.anIntArray3149[i_256_];
						i_251_++;
					}
				}
			}
			if (i_251_ > 0) {
				Class38_Sub20_Sub3_Sub1.anInt3185 = Class38_Sub20_Sub3_Sub1.anInt3185 / i_251_ + i_247_;
				Class38_Sub20_Sub3_Sub1.anInt3177 = Class38_Sub20_Sub3_Sub1.anInt3177 / i_251_ + i_248_;
				Class38_Sub20_Sub3_Sub1.anInt3198 = Class38_Sub20_Sub3_Sub1.anInt3198 / i_251_ + i_249_;
			} else {
				Class38_Sub20_Sub3_Sub1.anInt3185 = i_247_;
				Class38_Sub20_Sub3_Sub1.anInt3177 = i_248_;
				Class38_Sub20_Sub3_Sub1.anInt3198 = i_249_;
			}
		} else if (i == 1)
			for (int i_258_ : is) {
				if (i_258_ < this.anIntArrayArray3163.length) {
					int[] is_259_ = this.anIntArrayArray3163[i_258_];
					for (int i_261_ : is_259_) {
						this.anIntArray3156[i_261_] += i_247_;
						this.anIntArray3140[i_261_] += i_248_;
						this.anIntArray3149[i_261_] += i_249_;
					}
				}
			}
		else if (i == 2)
			for (int i_263_ : is) {
				if (i_263_ < this.anIntArrayArray3163.length) {
					int[] is_264_ = this.anIntArrayArray3163[i_263_];
					for (int i_266_ : is_264_) {
						this.anIntArray3156[i_266_] -= Class38_Sub20_Sub3_Sub1.anInt3185;
						this.anIntArray3140[i_266_] -= Class38_Sub20_Sub3_Sub1.anInt3177;
						this.anIntArray3149[i_266_] -= Class38_Sub20_Sub3_Sub1.anInt3198;
						int i_267_ = (i_247_ & 0xff) * 8;
						int i_268_ = (i_248_ & 0xff) * 8;
						int i_269_ = (i_249_ & 0xff) * 8;
						if (i_269_ != 0) {
							int i_270_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[i_269_];
							int i_271_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[i_269_];
							int i_272_ = this.anIntArray3140[i_266_] * i_270_ + this.anIntArray3156[i_266_] * i_271_ >> 16;
							this.anIntArray3140[i_266_] = this.anIntArray3140[i_266_] * i_271_ - this.anIntArray3156[i_266_] * i_270_ >> 16;
							this.anIntArray3156[i_266_] = i_272_;
						}
						if (i_267_ != 0) {
							int i_273_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[i_267_];
							int i_274_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[i_267_];
							int i_275_ = this.anIntArray3140[i_266_] * i_274_ - this.anIntArray3149[i_266_] * i_273_ >> 16;
							this.anIntArray3149[i_266_] = this.anIntArray3140[i_266_] * i_273_ + this.anIntArray3149[i_266_] * i_274_ >> 16;
							this.anIntArray3140[i_266_] = i_275_;
						}
						if (i_268_ != 0) {
							int i_276_ = Class38_Sub20_Sub3_Sub1.anIntArray3180[i_268_];
							int i_277_ = Class38_Sub20_Sub3_Sub1.anIntArray3199[i_268_];
							int i_278_ = this.anIntArray3149[i_266_] * i_276_ + this.anIntArray3156[i_266_] * i_277_ >> 16;
							this.anIntArray3149[i_266_] = this.anIntArray3149[i_266_] * i_277_ - this.anIntArray3156[i_266_] * i_276_ >> 16;
							this.anIntArray3156[i_266_] = i_278_;
						}
						this.anIntArray3156[i_266_] += Class38_Sub20_Sub3_Sub1.anInt3185;
						this.anIntArray3140[i_266_] += Class38_Sub20_Sub3_Sub1.anInt3177;
						this.anIntArray3149[i_266_] += Class38_Sub20_Sub3_Sub1.anInt3198;
					}
				}
			}
		else if (i == 3)
			for (int i_280_ : is) {
				if (i_280_ < this.anIntArrayArray3163.length) {
					int[] is_281_ = this.anIntArrayArray3163[i_280_];
					for (int i_283_ : is_281_) {
						this.anIntArray3156[i_283_] -= Class38_Sub20_Sub3_Sub1.anInt3185;
						this.anIntArray3140[i_283_] -= Class38_Sub20_Sub3_Sub1.anInt3177;
						this.anIntArray3149[i_283_] -= Class38_Sub20_Sub3_Sub1.anInt3198;
						this.anIntArray3156[i_283_] = this.anIntArray3156[i_283_] * i_247_ / 128;
						this.anIntArray3140[i_283_] = this.anIntArray3140[i_283_] * i_248_ / 128;
						this.anIntArray3149[i_283_] = this.anIntArray3149[i_283_] * i_249_ / 128;
						this.anIntArray3156[i_283_] += Class38_Sub20_Sub3_Sub1.anInt3185;
						this.anIntArray3140[i_283_] += Class38_Sub20_Sub3_Sub1.anInt3177;
						this.anIntArray3149[i_283_] += Class38_Sub20_Sub3_Sub1.anInt3198;
					}
				}
			}
		else if (i == 5)
			if (this.anIntArrayArray3143 != null && this.aByteArray3155 != null)
				for (int i_285_ : is) {
					if (i_285_ < this.anIntArrayArray3143.length) {
						int[] is_286_ = this.anIntArrayArray3143[i_285_];
						for (int i_288_ : is_286_) {
							int i_289_ = (this.aByteArray3155[i_288_] & 0xff) + i_247_ * 8;
							if (i_289_ < 0)
								i_289_ = 0;
							else if (i_289_ > 255)
								i_289_ = 255;
							this.aByteArray3155[i_288_] = (byte) i_289_;
						}
					}
				}
	}

	final Class38_Sub20_Sub3_Sub1 method1059(boolean bool) {
		if (!bool && Class38_Sub20_Sub3_Sub1.aByteArray3200.length < this.anInt3167)
			Class38_Sub20_Sub3_Sub1.aByteArray3200 = new byte[this.anInt3167 + 100];
		return method1039(bool, Class38_Sub20_Sub3_Sub1.aClass38_Sub20_Sub3_Sub1_3170, Class38_Sub20_Sub3_Sub1.aByteArray3200);
	}
}
