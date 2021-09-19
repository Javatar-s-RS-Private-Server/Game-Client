package com.javatar;/* Class38_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub15 extends Node {
	static Huffman[] aClass39Array2171;
	private static Class34[] aClass34Array2151;
	private static int[] anIntArray2152;
	private static float[] aFloatArray2154;
	private static Class46[] aClass46Array2155;
	private static int[] anIntArray2157;
	private static float[] aFloatArray2163;
	private static float[] aFloatArray2164;
	private static float[] aFloatArray2165;
	private static int anInt2166;
	private static Class12[] aClass12Array2168;
	private static int anInt2169;
	private static boolean aBool2170 = false;
	private static float[] aFloatArray2172;
	private static float[] aFloatArray2173;
	private static boolean[] aBoolArray2174;
	private static int anInt2176;
	private static byte[] aByteArray2178;
	private static int[] anIntArray2179;
	private static float[] aFloatArray2181;
	private static int anInt2182;
	private byte[][] aByteArrayArray2149;
	private int anInt2150;
	private int anInt2153;
	private boolean aBool2156;
	private boolean aBool2158;
	private float[] aFloatArray2159;
	private int anInt2160;
	private int anInt2161;
	private int anInt2162;
	private int anInt2167;
	private int anInt2175;
	private int anInt2177;
	private byte[] aByteArray2180;

	private Class38_Sub15(byte[] is) {
		method680(is);
	}

	private static void method681(byte[] is) {
		Class38_Sub15.method687(is);
		Class38_Sub15.anInt2176 = 1 << Class38_Sub15.method690(4);
		Class38_Sub15.anInt2169 = 1 << Class38_Sub15.method690(4);
		Class38_Sub15.aFloatArray2163 = new float[Class38_Sub15.anInt2169];
		for (int i = 0; i < 2; i++) {
			int i_4_ = i != 0 ? Class38_Sub15.anInt2169 : Class38_Sub15.anInt2176;
			int i_5_ = i_4_ >> 1;
			int i_6_ = i_4_ >> 2;
			int i_7_ = i_4_ >> 3;
			float[] fs = new float[i_5_];
			for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
				fs[i_8_ * 2] = (float) Math.cos(i_8_ * 4 * 3.141592653589793 / i_4_);
				fs[i_8_ * 2 + 1] = -(float) Math.sin(i_8_ * 4 * 3.141592653589793 / i_4_);
			}
			float[] fs_9_ = new float[i_5_];
			for (int i_10_ = 0; i_10_ < i_6_; i_10_++) {
				fs_9_[i_10_ * 2] = (float) Math.cos((i_10_ * 2 + 1) * 3.141592653589793 / (i_4_ * 2));
				fs_9_[i_10_ * 2 + 1] = (float) Math.sin((i_10_ * 2 + 1) * 3.141592653589793 / (i_4_ * 2));
			}
			float[] fs_11_ = new float[i_6_];
			for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
				fs_11_[i_12_ * 2] = (float) Math.cos((i_12_ * 4 + 2) * 3.141592653589793 / i_4_);
				fs_11_[i_12_ * 2 + 1] = -(float) Math.sin((i_12_ * 4 + 2) * 3.141592653589793 / i_4_);
			}
			int[] is_13_ = new int[i_7_];
			int i_14_ = Class30.method282((byte) 110, i_7_ - 1);
			for (int i_15_ = 0; i_15_ < i_7_; i_15_++)
				is_13_[i_15_] = Class38_Sub21.method716(i_15_, i_14_);
			if (i != 0) {
				Class38_Sub15.aFloatArray2165 = fs;
				Class38_Sub15.aFloatArray2181 = fs_9_;
				Class38_Sub15.aFloatArray2172 = fs_11_;
				Class38_Sub15.anIntArray2152 = is_13_;
			} else {
				Class38_Sub15.aFloatArray2154 = fs;
				Class38_Sub15.aFloatArray2164 = fs_9_;
				Class38_Sub15.aFloatArray2173 = fs_11_;
				Class38_Sub15.anIntArray2157 = is_13_;
			}
		}
		int i = Class38_Sub15.method690(8) + 1;
		Class38_Sub15.aClass39Array2171 = new Huffman[i];
		for (int i_16_ = 0; i_16_ < i; i_16_++)
			Class38_Sub15.aClass39Array2171[i_16_] = new Huffman();
		int i_17_ = Class38_Sub15.method690(6) + 1;
		for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
			Class38_Sub15.method690(16);
		int i_19_ = Class38_Sub15.method690(6) + 1;
		Class38_Sub15.aClass34Array2151 = new Class34[i_19_];
		for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
			Class38_Sub15.aClass34Array2151[i_20_] = new Class34();
		int i_21_ = Class38_Sub15.method690(6) + 1;
		Class38_Sub15.aClass46Array2155 = new Class46[i_21_];
		for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
			Class38_Sub15.aClass46Array2155[i_22_] = new Class46();
		int i_23_ = Class38_Sub15.method690(6) + 1;
		Class38_Sub15.aClass12Array2168 = new Class12[i_23_];
		for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
			Class38_Sub15.aClass12Array2168[i_24_] = new Class12();
		int i_25_ = Class38_Sub15.method690(6) + 1;
		Class38_Sub15.aBoolArray2174 = new boolean[i_25_];
		Class38_Sub15.anIntArray2179 = new int[i_25_];
		for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
			Class38_Sub15.aBoolArray2174[i_26_] = Class38_Sub15.method683() != 0;
			Class38_Sub15.method690(16);
			Class38_Sub15.method690(16);
			Class38_Sub15.anIntArray2179[i_26_] = Class38_Sub15.method690(8);
		}
	}

	static final int method683() {
		int i = Class38_Sub15.aByteArray2178[Class38_Sub15.anInt2166] >> Class38_Sub15.anInt2182 & 0x1;
		Class38_Sub15.anInt2182++;
		Class38_Sub15.anInt2166 += Class38_Sub15.anInt2182 >> 3;
		Class38_Sub15.anInt2182 &= 0x7;
		return i;
	}

	public static void method685() {
		Class38_Sub15.aByteArray2178 = null;
		Class38_Sub15.aClass39Array2171 = null;
		Class38_Sub15.aClass34Array2151 = null;
		Class38_Sub15.aClass46Array2155 = null;
		Class38_Sub15.aClass12Array2168 = null;
		Class38_Sub15.aBoolArray2174 = null;
		Class38_Sub15.anIntArray2179 = null;
		Class38_Sub15.aFloatArray2163 = null;
		Class38_Sub15.aFloatArray2154 = null;
		Class38_Sub15.aFloatArray2164 = null;
		Class38_Sub15.aFloatArray2173 = null;
		Class38_Sub15.aFloatArray2165 = null;
		Class38_Sub15.aFloatArray2181 = null;
		Class38_Sub15.aFloatArray2172 = null;
		Class38_Sub15.anIntArray2157 = null;
		Class38_Sub15.anIntArray2152 = null;
	}

	private static boolean method686(Class17 class17) {
		if (!Class38_Sub15.aBool2170) {
			byte[] is = class17.method109(0, 0, -109);
			if (is == null)
				return false;
			Class38_Sub15.method681(is);
			Class38_Sub15.aBool2170 = true;
		}
		return true;
	}

	private static void method687(byte[] is) {
		Class38_Sub15.aByteArray2178 = is;
		Class38_Sub15.anInt2166 = 0;
		Class38_Sub15.anInt2182 = 0;
	}

	static final Class38_Sub15 method688(Class17 class17, int i, int i_108_) {
		if (!Class38_Sub15.method686(class17)) {
			class17.method116(i, i_108_);
			return null;
		}
		byte[] is = class17.method109(i, i_108_, -87);
		if (is == null)
			return null;
		return new Class38_Sub15(is);
	}

	static final float method689(int i) {
		int i_109_ = i & 0x1fffff;
		int i_110_ = i & ~0x7fffffff;
		int i_111_ = (i & 0x7fe00000) >> 21;
		if (i_110_ != 0)
			i_109_ = -i_109_;
		return (float) (i_109_ * Math.pow(2.0, i_111_ - 788));
	}

	static final int method690(int i) {
		int i_112_ = 0;
		int i_113_ = 0;
		int i_114_;
		for (/**/; i >= 8 - Class38_Sub15.anInt2182; i -= i_114_) {
			i_114_ = 8 - Class38_Sub15.anInt2182;
			int i_115_ = (1 << i_114_) - 1;
			i_112_ += (Class38_Sub15.aByteArray2178[Class38_Sub15.anInt2166] >> Class38_Sub15.anInt2182 & i_115_) << i_113_;
			Class38_Sub15.anInt2182 = 0;
			Class38_Sub15.anInt2166++;
			i_113_ += i_114_;
		}
		if (i > 0) {
			i_114_ = (1 << i) - 1;
			i_112_ += (Class38_Sub15.aByteArray2178[Class38_Sub15.anInt2166] >> Class38_Sub15.anInt2182 & i_114_) << i_113_;
			Class38_Sub15.anInt2182 += i;
		}
		return i_112_;
	}

	private void method680(byte[] is) {
		RS2Buffer class38_sub23 = new RS2Buffer(is);
		anInt2150 = class38_sub23.readInt(true);
		anInt2161 = class38_sub23.readInt(true);
		anInt2162 = class38_sub23.readInt(true);
		anInt2167 = class38_sub23.readInt(true);
		if (anInt2167 < 0) {
			anInt2167 = anInt2167 ^ 0xffffffff;
			aBool2156 = true;
		}
		int i = class38_sub23.readInt(true);
		aByteArrayArray2149 = new byte[i][];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = 0;
			int i_2_;
			do {
				i_2_ = class38_sub23.getUByte();
				i_1_ += i_2_;
			} while (i_2_ >= 255);
			byte[] is_3_ = new byte[i_1_];
			class38_sub23.method778(i_1_, is_3_);
			aByteArrayArray2149[i_0_] = is_3_;
		}
	}

	private float[] method682(int i) {
		Class38_Sub15.method687(aByteArrayArray2149[i]);
		Class38_Sub15.method683();
		int i_27_ = Class38_Sub15.method690(Class30.method282((byte) -48, Class38_Sub15.anIntArray2179.length - 1));
		boolean bool = Class38_Sub15.aBoolArray2174[i_27_];
		int i_28_ = bool ? Class38_Sub15.anInt2169 : Class38_Sub15.anInt2176;
		boolean bool_29_ = false;
		boolean bool_30_ = false;
		if (bool) {
			bool_29_ = Class38_Sub15.method683() != 0;
			bool_30_ = Class38_Sub15.method683() != 0;
		}
		int i_31_ = i_28_ >> 1;
		int i_32_;
		int i_33_;
		int i_34_;
		if (bool && !bool_29_) {
			i_32_ = (i_28_ >> 2) - (Class38_Sub15.anInt2176 >> 2);
			i_33_ = (i_28_ >> 2) + (Class38_Sub15.anInt2176 >> 2);
			i_34_ = Class38_Sub15.anInt2176 >> 1;
		} else {
			i_32_ = 0;
			i_33_ = i_31_;
			i_34_ = i_28_ >> 1;
		}
		int i_35_;
		int i_36_;
		int i_37_;
		if (bool && !bool_30_) {
			i_35_ = i_28_ - (i_28_ >> 2) - (Class38_Sub15.anInt2176 >> 2);
			i_36_ = i_28_ - (i_28_ >> 2) + (Class38_Sub15.anInt2176 >> 2);
			i_37_ = Class38_Sub15.anInt2176 >> 1;
		} else {
			i_35_ = i_31_;
			i_36_ = i_28_;
			i_37_ = i_28_ >> 1;
		}
		Class12 class12 = Class38_Sub15.aClass12Array2168[Class38_Sub15.anIntArray2179[i_27_]];
		int i_38_ = class12.anInt218;
		int i_39_ = class12.anIntArray217[i_38_];
		boolean bool_40_ = !Class38_Sub15.aClass34Array2151[i_39_].method313();
		for (int i_42_ = 0; i_42_ < class12.anInt216; i_42_++) {
			Class46 class46 = Class38_Sub15.aClass46Array2155[class12.anIntArray215[i_42_]];
			float[] fs = Class38_Sub15.aFloatArray2163;
			class46.method380(fs, i_28_ >> 1, bool_40_);
		}
		if (!bool_40_) {
			int i_43_ = class12.anInt218;
			int i_44_ = class12.anIntArray217[i_43_];
			Class38_Sub15.aClass34Array2151[i_44_].method306(Class38_Sub15.aFloatArray2163, i_28_ >> 1);
		}
		if (bool_40_)
			for (int i_45_ = i_28_ >> 1; i_45_ < i_28_; i_45_++)
				Class38_Sub15.aFloatArray2163[i_45_] = 0.0F;
		else {
			int i_46_ = i_28_ >> 1;
			int i_47_ = i_28_ >> 2;
			int i_48_ = i_28_ >> 3;
			float[] fs = Class38_Sub15.aFloatArray2163;
			for (int i_49_ = 0; i_49_ < i_46_; i_49_++)
				fs[i_49_] *= 0.5F;
			for (int i_50_ = i_46_; i_50_ < i_28_; i_50_++)
				fs[i_50_] = -fs[i_28_ - i_50_ - 1];
			float[] fs_51_ = bool ? Class38_Sub15.aFloatArray2165 : Class38_Sub15.aFloatArray2154;
			float[] fs_52_ = bool ? Class38_Sub15.aFloatArray2181 : Class38_Sub15.aFloatArray2164;
			float[] fs_53_ = bool ? Class38_Sub15.aFloatArray2172 : Class38_Sub15.aFloatArray2173;
			int[] is = bool ? Class38_Sub15.anIntArray2152 : Class38_Sub15.anIntArray2157;
			for (int i_54_ = 0; i_54_ < i_47_; i_54_++) {
				float f = fs[i_54_ * 4] - fs[i_28_ - i_54_ * 4 - 1];
				float f_55_ = fs[i_54_ * 4 + 2] - fs[i_28_ - i_54_ * 4 - 3];
				float f_56_ = fs_51_[i_54_ * 2];
				float f_57_ = fs_51_[i_54_ * 2 + 1];
				fs[i_28_ - i_54_ * 4 - 1] = f * f_56_ - f_55_ * f_57_;
				fs[i_28_ - i_54_ * 4 - 3] = f * f_57_ + f_55_ * f_56_;
			}
			for (int i_58_ = 0; i_58_ < i_48_; i_58_++) {
				float f = fs[i_46_ + 3 + i_58_ * 4];
				float f_59_ = fs[i_46_ + 1 + i_58_ * 4];
				float f_60_ = fs[i_58_ * 4 + 3];
				float f_61_ = fs[i_58_ * 4 + 1];
				fs[i_46_ + 3 + i_58_ * 4] = f + f_60_;
				fs[i_46_ + 1 + i_58_ * 4] = f_59_ + f_61_;
				float f_62_ = fs_51_[i_46_ - 4 - i_58_ * 4];
				float f_63_ = fs_51_[i_46_ - 3 - i_58_ * 4];
				fs[i_58_ * 4 + 3] = (f - f_60_) * f_62_ - (f_59_ - f_61_) * f_63_;
				fs[i_58_ * 4 + 1] = (f_59_ - f_61_) * f_62_ + (f - f_60_) * f_63_;
			}
			int i_64_ = Class30.method282((byte) -83, i_28_ - 1);
			for (int i_65_ = 0; i_65_ < i_64_ - 3; i_65_++) {
				int i_66_ = i_28_ >> i_65_ + 2;
				int i_67_ = 8 << i_65_;
				for (int i_68_ = 0; i_68_ < 2 << i_65_; i_68_++) {
					int i_69_ = i_28_ - i_66_ * 2 * i_68_;
					int i_70_ = i_28_ - i_66_ * (i_68_ * 2 + 1);
					for (int i_71_ = 0; i_71_ < i_28_ >> i_65_ + 4; i_71_++) {
						int i_72_ = i_71_ * 4;
						float f = fs[i_69_ - 1 - i_72_];
						float f_73_ = fs[i_69_ - 3 - i_72_];
						float f_74_ = fs[i_70_ - 1 - i_72_];
						float f_75_ = fs[i_70_ - 3 - i_72_];
						fs[i_69_ - 1 - i_72_] = f + f_74_;
						fs[i_69_ - 3 - i_72_] = f_73_ + f_75_;
						float f_76_ = fs_51_[i_71_ * i_67_];
						float f_77_ = fs_51_[i_71_ * i_67_ + 1];
						fs[i_70_ - 1 - i_72_] = (f - f_74_) * f_76_ - (f_73_ - f_75_) * f_77_;
						fs[i_70_ - 3 - i_72_] = (f_73_ - f_75_) * f_76_ + (f - f_74_) * f_77_;
					}
				}
			}
			for (int i_78_ = 1; i_78_ < i_48_ - 1; i_78_++) {
				int i_79_ = is[i_78_];
				if (i_78_ < i_79_) {
					int i_80_ = i_78_ * 8;
					int i_81_ = i_79_ * 8;
					float f = fs[i_80_ + 1];
					fs[i_80_ + 1] = fs[i_81_ + 1];
					fs[i_81_ + 1] = f;
					f = fs[i_80_ + 3];
					fs[i_80_ + 3] = fs[i_81_ + 3];
					fs[i_81_ + 3] = f;
					f = fs[i_80_ + 5];
					fs[i_80_ + 5] = fs[i_81_ + 5];
					fs[i_81_ + 5] = f;
					f = fs[i_80_ + 7];
					fs[i_80_ + 7] = fs[i_81_ + 7];
					fs[i_81_ + 7] = f;
				}
			}
			for (int i_82_ = 0; i_82_ < i_46_; i_82_++)
				fs[i_82_] = fs[i_82_ * 2 + 1];
			for (int i_83_ = 0; i_83_ < i_48_; i_83_++) {
				fs[i_28_ - 1 - i_83_ * 2] = fs[i_83_ * 4];
				fs[i_28_ - 2 - i_83_ * 2] = fs[i_83_ * 4 + 1];
				fs[i_28_ - i_47_ - 1 - i_83_ * 2] = fs[i_83_ * 4 + 2];
				fs[i_28_ - i_47_ - 2 - i_83_ * 2] = fs[i_83_ * 4 + 3];
			}
			for (int i_84_ = 0; i_84_ < i_48_; i_84_++) {
				float f = fs_53_[i_84_ * 2];
				float f_85_ = fs_53_[i_84_ * 2 + 1];
				float f_86_ = fs[i_46_ + i_84_ * 2];
				float f_87_ = fs[i_46_ + i_84_ * 2 + 1];
				float f_88_ = fs[i_28_ - 2 - i_84_ * 2];
				float f_89_ = fs[i_28_ - 1 - i_84_ * 2];
				float f_90_ = f_85_ * (f_86_ - f_88_) + f * (f_87_ + f_89_);
				fs[i_46_ + i_84_ * 2] = (f_86_ + f_88_ + f_90_) * 0.5F;
				fs[i_28_ - 2 - i_84_ * 2] = (f_86_ + f_88_ - f_90_) * 0.5F;
				f_90_ = f_85_ * (f_87_ + f_89_) - f * (f_86_ - f_88_);
				fs[i_46_ + i_84_ * 2 + 1] = (f_87_ - f_89_ + f_90_) * 0.5F;
				fs[i_28_ - 1 - i_84_ * 2] = (-f_87_ + f_89_ + f_90_) * 0.5F;
			}
			for (int i_91_ = 0; i_91_ < i_47_; i_91_++) {
				fs[i_91_] = fs[i_91_ * 2 + i_46_] * fs_52_[i_91_ * 2] + fs[i_91_ * 2 + 1 + i_46_] * fs_52_[i_91_ * 2 + 1];
				fs[i_46_ - 1 - i_91_] = fs[i_91_ * 2 + i_46_] * fs_52_[i_91_ * 2 + 1] - fs[i_91_ * 2 + 1 + i_46_] * fs_52_[i_91_ * 2];
			}
			for (int i_92_ = 0; i_92_ < i_47_; i_92_++)
				fs[i_28_ - i_47_ + i_92_] = -fs[i_92_];
			for (int i_93_ = 0; i_93_ < i_47_; i_93_++)
				fs[i_93_] = fs[i_47_ + i_93_];
			for (int i_94_ = 0; i_94_ < i_47_; i_94_++)
				fs[i_47_ + i_94_] = -fs[i_47_ - i_94_ - 1];
			for (int i_95_ = 0; i_95_ < i_47_; i_95_++)
				fs[i_46_ + i_95_] = fs[i_28_ - i_95_ - 1];
			for (int i_96_ = i_32_; i_96_ < i_33_; i_96_++) {
				float f = (float) Math.sin((i_96_ - i_32_ + 0.5) / i_34_ * 0.5 * 3.141592653589793);
				Class38_Sub15.aFloatArray2163[i_96_] *= (float) Math.sin(f * 1.5707963267948966 * f);
			}
			for (int i_97_ = i_35_; i_97_ < i_36_; i_97_++) {
				float f = (float) Math.sin((i_97_ - i_35_ + 0.5) / i_37_ * 0.5 * 3.141592653589793 + 1.5707963267948966);
				Class38_Sub15.aFloatArray2163[i_97_] *= (float) Math.sin(f * 1.5707963267948966 * f);
			}
		}
		float[] fs = null;
		if (anInt2160 > 0) {
			int i_98_ = anInt2160 + i_28_ >> 2;
			fs = new float[i_98_];
			if (!aBool2158)
				for (int i_99_ = 0; i_99_ < anInt2153; i_99_++) {
					int i_100_ = (anInt2160 >> 1) + i_99_;
					fs[i_99_] += aFloatArray2159[i_100_];
				}
			if (!bool_40_)
				for (int i_101_ = i_32_; i_101_ < i_28_ >> 1; i_101_++) {
					int i_102_ = fs.length - (i_28_ >> 1) + i_101_;
					fs[i_102_] += Class38_Sub15.aFloatArray2163[i_101_];
				}
		}
		float[] fs_103_ = aFloatArray2159;
		aFloatArray2159 = Class38_Sub15.aFloatArray2163;
		Class38_Sub15.aFloatArray2163 = fs_103_;
		anInt2160 = i_28_;
		anInt2153 = i_36_ - (i_28_ >> 1);
		aBool2158 = bool_40_;
		return fs;
	}

	final Class38_Sub16_Sub1 method684(int[] is) {
		if (is != null && is[0] <= 0)
			return null;
		if (aByteArray2180 == null) {
			anInt2160 = 0;
			aFloatArray2159 = new float[Class38_Sub15.anInt2169];
			aByteArray2180 = new byte[anInt2161];
			anInt2175 = 0;
			anInt2177 = 0;
		}
		for (/**/; anInt2177 < aByteArrayArray2149.length; anInt2177++) {
			if (is != null && is[0] <= 0)
				return null;
			float[] fs = method682(anInt2177);
			if (fs != null) {
				int i = anInt2175;
				int i_104_ = fs.length;
				if (i_104_ > anInt2161 - i)
					i_104_ = anInt2161 - i;
				for (int i_105_ = 0; i_105_ < i_104_; i_105_++) {
					int i_106_ = (int) (fs[i_105_] * 128.0F + 128.0F);
					if ((i_106_ & ~0xff) != 0)
						i_106_ = (i_106_ ^ 0xffffffff) >> 31;
					aByteArray2180[i++] = (byte) (i_106_ - 128);
				}
				if (is != null)
					is[0] -= i - anInt2175;
				anInt2175 = i;
			}
		}
		aFloatArray2159 = null;
		byte[] is_107_ = aByteArray2180;
		aByteArray2180 = null;
		return new Class38_Sub16_Sub1(anInt2150, is_107_, anInt2162, anInt2167, aBool2156);
	}
}
