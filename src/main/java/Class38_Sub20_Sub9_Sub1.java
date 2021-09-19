/* Class38_Sub20_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class38_Sub20_Sub9_Sub1 extends Class38_Sub20_Sub9 {
	private int anInt3202;
	private static RSString aClass19_3203 = RSString.createRSString(")4u");
	private static int anInt3204;
	private static int anInt3205 = -1;
	private static RSString aClass19_3206 = RSString.createRSString("img=");
	private static RSString aClass19_3207;
	private int[] anIntArray3208;
	private int[] anIntArray3209;
	private int[] anIntArray3210;
	private static int anInt3211;
	private static RSString aClass19_3212;
	private int[] anIntArray3213;
	private static RSString aClass19_3214 = RSString.createRSString("lt");
	private static RSString aClass19_3215;
	int anInt3216 = 0;
	private int[] anIntArray3217;
	private static RSString aClass19_3218;
	private static RSString aClass19_3219;
	static Class38_Sub20_Sub9_Sub2[] aClass38_Sub20_Sub9_Sub2Array3220;
	private static RSString aClass19_3221;
	private int anInt3222;
	private static int anInt3223;
	private static RSString aClass19_3224;
	private static RSString aClass19_3225;
	private static int anInt3226;
	private static int anInt3227;
	private static int anInt3228;
	private static int anInt3229;
	private byte[] aByteArray3230;
	private static RSString aClass19_3231;
	private static RSString aClass19_3232;
	private static RSString aClass19_3233;
	private static int anInt3234;
	private byte[][] aByteArrayArray3235;
	private static RSString aClass19_3236;
	private static Random aRandom3237;
	private static RSString[] aClass19Array3238;

	final int method1060(RSString class19, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (class19 == null)
			return 0;
		method1073(i_3_, i_4_);
		if (i_7_ == 0)
			i_7_ = this.anInt3216;
		int[] is = { i_1_ };
		if (i_2_ < anInt3202 + anInt3222 + i_7_ && i_2_ < i_7_ + i_7_)
			is = null;
		int i_8_ = method1074(class19, is, Class38_Sub20_Sub9_Sub1.aClass19Array3238);
		if (i_6_ == 3 && i_8_ == 1)
			i_6_ = 1;
		int i_9_;
		if (i_6_ == 0)
			i_9_ = i_0_ + anInt3202;
		else if (i_6_ == 1)
			i_9_ = i_0_ + anInt3202 + (i_2_ - anInt3202 - anInt3222 - (i_8_ - 1) * i_7_) / 2;
		else if (i_6_ == 2)
			i_9_ = i_0_ + i_2_ - anInt3222 - (i_8_ - 1) * i_7_;
		else {
			int i_10_ = (i_2_ - anInt3202 - anInt3222 - (i_8_ - 1) * i_7_) / (i_8_ + 1);
			if (i_10_ < 0)
				i_10_ = 0;
			i_9_ = i_0_ + anInt3202 + i_10_;
			i_7_ += i_10_;
		}
		for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
			if (i_5_ == 0)
				method1078(Class38_Sub20_Sub9_Sub1.aClass19Array3238[i_11_], i, i_9_);
			else if (i_5_ == 1)
				method1078(Class38_Sub20_Sub9_Sub1.aClass19Array3238[i_11_], i + (i_1_ - method1061(Class38_Sub20_Sub9_Sub1.aClass19Array3238[i_11_])) / 2, i_9_);
			else if (i_5_ == 2)
				method1078(Class38_Sub20_Sub9_Sub1.aClass19Array3238[i_11_], i + i_1_ - method1061(Class38_Sub20_Sub9_Sub1.aClass19Array3238[i_11_]), i_9_);
			else if (i_11_ == i_8_ - 1)
				method1078(Class38_Sub20_Sub9_Sub1.aClass19Array3238[i_11_], i, i_9_);
			else {
				method1064(Class38_Sub20_Sub9_Sub1.aClass19Array3238[i_11_], i_1_);
				method1078(Class38_Sub20_Sub9_Sub1.aClass19Array3238[i_11_], i, i_9_);
				Class38_Sub20_Sub9_Sub1.anInt3204 = 0;
			}
			i_9_ += i_7_;
		}
		return i_8_;
	}

	final int method1061(RSString class19) {
		if (class19 == null)
			return 0;
		int i = -1;
		int i_12_ = -1;
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < class19.anInt478; i_14_++) {
			int i_15_ = class19.buffer[i_14_] & 0xff;
			if (i_15_ == 60)
				i = i_14_;
			else {
				if (i_15_ == 62 && i != -1) {
					RSString class19_16_ = class19.method144((byte) -127, i + 1, i_14_);
					i = -1;
					if (class19_16_.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3214))
						i_15_ = 60;
					else if (class19_16_.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3221))
						i_15_ = 62;
					else {
						if (class19_16_.method165(Class38_Sub20_Sub9_Sub1.aClass19_3206, true))
							try {
								int i_17_ = class19_16_.method171((byte) -82, 4).method164(-127);
								i_13_ += Class38_Sub20_Sub9_Sub1.aClass38_Sub20_Sub9_Sub2Array3220[i_17_].anInt3244;
								i_12_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						continue;
					}
				}
				if (i == -1) {
					i_13_ += anIntArray3213[i_15_];
					if (aByteArray3230 != null && i_12_ != -1)
						i_13_ += aByteArray3230[(i_12_ << 8) + i_15_];
					i_12_ = i_15_;
				}
			}
		}
		return i_13_;
	}

	static final RSString method1062(RSString class19) {
		int i = class19.method143((byte) 99);
		int i_18_ = 0;
		for (int i_19_ = 0; i_19_ < i; i_19_++) {
			byte i_20_ = class19.buffer[i_19_];
			if (i_20_ == 60 || i_20_ == 62)
				i_18_ += 3;
		}
		RSString class19_21_ = new RSString();
		class19_21_.anInt478 = i + i_18_;
		class19_21_.buffer = new byte[class19_21_.anInt478];
		int i_22_ = 0;
		for (int i_23_ = 0; i_23_ < i; i_23_++) {
			byte i_24_ = class19.buffer[i_23_];
			if (i_24_ == 60) {
				class19_21_.buffer[i_22_++] = (byte) 60;
				class19_21_.buffer[i_22_++] = (byte) 108;
				class19_21_.buffer[i_22_++] = (byte) 116;
				class19_21_.buffer[i_22_++] = (byte) 62;
			} else if (i_24_ == 62) {
				class19_21_.buffer[i_22_++] = (byte) 60;
				class19_21_.buffer[i_22_++] = (byte) 103;
				class19_21_.buffer[i_22_++] = (byte) 116;
				class19_21_.buffer[i_22_++] = (byte) 62;
			} else
				class19_21_.buffer[i_22_++] = i_24_;
		}
		return class19_21_;
	}

	private static final void method1063(byte[] is, int i, int i_25_, int i_26_, int i_27_, int i_28_) {
		int i_29_ = i + i_25_ * Class38_Sub20_Sub9.anInt2889;
		int i_30_ = Class38_Sub20_Sub9.anInt2889 - i_26_;
		int i_31_ = 0;
		int i_32_ = 0;
		if (i_25_ < Class38_Sub20_Sub9.anInt2885) {
			int i_33_ = Class38_Sub20_Sub9.anInt2885 - i_25_;
			i_27_ -= i_33_;
			i_25_ = Class38_Sub20_Sub9.anInt2885;
			i_32_ += i_33_ * i_26_;
			i_29_ += i_33_ * Class38_Sub20_Sub9.anInt2889;
		}
		if (i_25_ + i_27_ > Class38_Sub20_Sub9.anInt2888)
			i_27_ -= i_25_ + i_27_ - Class38_Sub20_Sub9.anInt2888;
		if (i < Class38_Sub20_Sub9.anInt2887) {
			int i_34_ = Class38_Sub20_Sub9.anInt2887 - i;
			i_26_ -= i_34_;
			i = Class38_Sub20_Sub9.anInt2887;
			i_32_ += i_34_;
			i_29_ += i_34_;
			i_31_ += i_34_;
			i_30_ += i_34_;
		}
		if (i + i_26_ > Class38_Sub20_Sub9.anInt2890) {
			int i_35_ = i + i_26_ - Class38_Sub20_Sub9.anInt2890;
			i_26_ -= i_35_;
			i_31_ += i_35_;
			i_30_ += i_35_;
		}
		if (i_26_ > 0 && i_27_ > 0)
			Class38_Sub20_Sub9_Sub1.method1085(Class38_Sub20_Sub9.anIntArray2886, is, i_28_, i_32_, i_29_, i_26_, i_27_, i_30_, i_31_);
	}

	private final void method1064(RSString class19, int i) {
		int i_36_ = 0;
		boolean bool = false;
		for (int i_37_ = 0; i_37_ < class19.method143((byte) 114); i_37_++) {
			int i_38_ = class19.method163(-122, i_37_);
			if (i_38_ == 60)
				bool = true;
			else if (i_38_ == 62)
				bool = false;
			else if (!bool && i_38_ == 32)
				i_36_++;
		}
		if (i_36_ > 0)
			Class38_Sub20_Sub9_Sub1.anInt3204 = (i - method1061(class19) << 8) / i_36_;
	}

	abstract void method1065(byte[] is, int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_);

	private final void method1066(byte[] is) {
		anIntArray3213 = new int[256];
		if (is.length == 257) {
			for (int i = 0; i < anIntArray3213.length; i++)
				anIntArray3213[i] = is[i] & 0xff;
			this.anInt3216 = is[256] & 0xff;
		} else {
			int i = 0;
			for (int i_44_ = 0; i_44_ < 256; i_44_++)
				anIntArray3213[i_44_] = is[i++] & 0xff;
			int[] is_45_ = new int[256];
			int[] is_46_ = new int[256];
			for (int i_47_ = 0; i_47_ < 256; i_47_++)
				is_45_[i_47_] = is[i++] & 0xff;
			for (int i_48_ = 0; i_48_ < 256; i_48_++)
				is_46_[i_48_] = is[i++] & 0xff;
			byte[][] is_49_ = new byte[256][];
			for (int i_50_ = 0; i_50_ < 256; i_50_++) {
				is_49_[i_50_] = new byte[is_45_[i_50_]];
				byte i_51_ = 0;
				for (int i_52_ = 0; i_52_ < is_49_[i_50_].length; i_52_++) {
					i_51_ += is[i++];
					is_49_[i_50_][i_52_] = i_51_;
				}
			}
			byte[][] is_53_ = new byte[256][];
			for (int i_54_ = 0; i_54_ < 256; i_54_++) {
				is_53_[i_54_] = new byte[is_45_[i_54_]];
				byte i_55_ = 0;
				for (int i_56_ = 0; i_56_ < is_53_[i_54_].length; i_56_++) {
					i_55_ += is[i++];
					is_53_[i_54_][i_56_] = i_55_;
				}
			}
			aByteArray3230 = new byte[65536];
			for (int i_57_ = 0; i_57_ < 256; i_57_++)
				if (i_57_ != 32 && i_57_ != 160)
					for (int i_58_ = 0; i_58_ < 256; i_58_++)
						if (i_58_ != 32 && i_58_ != 160)
							aByteArray3230[(i_57_ << 8) + i_58_] = (byte) Class38_Sub20_Sub9_Sub1.method1087(is_49_, is_53_, is_46_, anIntArray3213, is_45_, i_57_, i_58_);
			this.anInt3216 = is_46_[32] + is_45_[32];
		}
	}

	final int method1067(RSString class19, int i) {
		return method1074(class19, new int[] { i }, Class38_Sub20_Sub9_Sub1.aClass19Array3238);
	}

	private final int method1068(int i) {
		return anIntArray3213[i & 0xff];
	}

	final void method1069(RSString class19, int i, int i_59_, int i_60_, int i_61_) {
		if (class19 != null) {
			method1073(i_60_, i_61_);
			method1078(class19, i - method1061(class19), i_59_);
		}
	}

	static final void method1070(int[] is, byte[] is_62_, int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_) {
		i = ((i & 0xff00ff) * i_69_ & ~0xff00ff) + ((i & 0xff00) * i_69_ & 0xff0000) >> 8;
		i_69_ = 256 - i_69_;
		for (int i_70_ = -i_66_; i_70_ < 0; i_70_++) {
			for (int i_71_ = -i_65_; i_71_ < 0; i_71_++)
				if (is_62_[i_63_++] != 0) {
					int i_72_ = is[i_64_];
					is[i_64_++] = (((i_72_ & 0xff00ff) * i_69_ & ~0xff00ff) + ((i_72_ & 0xff00) * i_69_ & 0xff0000) >> 8) + i;
				} else
					i_64_++;
			i_64_ += i_67_;
			i_63_ += i_68_;
		}
	}

	final void method1071(RSString class19, int i, int i_73_, int i_74_, int i_75_, int i_76_) {
		if (class19 != null) {
			method1073(i_74_, i_75_);
			Class38_Sub20_Sub9_Sub1.aRandom3237.setSeed(i_76_);
			Class38_Sub20_Sub9_Sub1.anInt3227 = (Class38_Sub20_Sub9_Sub1.aRandom3237.nextInt() & 0x1f) + 192;
			int[] is = new int[class19.anInt478];
			int i_77_ = 0;
			for (int i_78_ = 0; i_78_ < class19.anInt478; i_78_++) {
				is[i_78_] = i_77_;
				if ((Class38_Sub20_Sub9_Sub1.aRandom3237.nextInt() & 0x3) == 0)
					i_77_++;
			}
			method1072(class19, i, i_73_, is, null);
		}
	}

	private final void method1072(RSString class19, int i, int i_79_, int[] is, int[] is_80_) {
		i_79_ -= this.anInt3216;
		int i_81_ = -1;
		int i_82_ = -1;
		int i_83_ = 0;
		for (int i_84_ = 0; i_84_ < class19.anInt478; i_84_++) {
			int i_85_ = class19.buffer[i_84_] & 0xff;
			if (i_85_ == 60)
				i_81_ = i_84_;
			else {
				if (i_85_ == 62 && i_81_ != -1) {
					RSString class19_86_ = class19.method144((byte) 2, i_81_ + 1, i_84_);
					i_81_ = -1;
					if (class19_86_.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3214))
						i_85_ = 60;
					else if (class19_86_.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3221))
						i_85_ = 62;
					else {
						if (class19_86_.method165(Class38_Sub20_Sub9_Sub1.aClass19_3206, true))
							try {
								int i_87_;
								if (is != null)
									i_87_ = is[i_83_];
								else
									i_87_ = 0;
								int i_88_;
								if (is_80_ != null)
									i_88_ = is_80_[i_83_];
								else
									i_88_ = 0;
								i_83_++;
								int i_89_ = class19_86_.method171((byte) -74, 4).method164(-121);
								Class38_Sub20_Sub9_Sub2 class38_sub20_sub9_sub2 = Class38_Sub20_Sub9_Sub1.aClass38_Sub20_Sub9_Sub2Array3220[i_89_];
								class38_sub20_sub9_sub2.method1089(i + i_87_, i_79_ + this.anInt3216 - class38_sub20_sub9_sub2.anInt3243 + i_88_);
								i += class38_sub20_sub9_sub2.anInt3244;
								i_82_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						else
							method1076(class19_86_);
						continue;
					}
				}
				if (i_81_ == -1) {
					if (aByteArray3230 != null && i_82_ != -1)
						i += aByteArray3230[(i_82_ << 8) + i_85_];
					int i_90_ = anIntArray3208[i_85_];
					int i_91_ = anIntArray3217[i_85_];
					int i_92_;
					if (is != null)
						i_92_ = is[i_83_];
					else
						i_92_ = 0;
					int i_93_;
					if (is_80_ != null)
						i_93_ = is_80_[i_83_];
					else
						i_93_ = 0;
					i_83_++;
					if (i_85_ != 32) {
						if (Class38_Sub20_Sub9_Sub1.anInt3227 == 256) {
							if (Class38_Sub20_Sub9_Sub1.anInt3205 != -1)
								Class38_Sub20_Sub9_Sub1.method1063(aByteArrayArray3235[i_85_], i + anIntArray3209[i_85_] + 1 + i_92_, i_79_ + anIntArray3210[i_85_] + 1 + i_93_, i_90_, i_91_, Class38_Sub20_Sub9_Sub1.anInt3205);
							method1079(aByteArrayArray3235[i_85_], i + anIntArray3209[i_85_] + i_92_, i_79_ + anIntArray3210[i_85_] + i_93_, i_90_, i_91_, Class38_Sub20_Sub9_Sub1.anInt3234);
						} else {
							if (Class38_Sub20_Sub9_Sub1.anInt3205 != -1)
								Class38_Sub20_Sub9_Sub1.method1077(aByteArrayArray3235[i_85_], i + anIntArray3209[i_85_] + 1 + i_92_, i_79_ + anIntArray3210[i_85_] + 1 + i_93_, i_90_, i_91_, Class38_Sub20_Sub9_Sub1.anInt3205, Class38_Sub20_Sub9_Sub1.anInt3227);
							method1065(aByteArrayArray3235[i_85_], i + anIntArray3209[i_85_] + i_92_, i_79_ + anIntArray3210[i_85_] + i_93_, i_90_, i_91_, Class38_Sub20_Sub9_Sub1.anInt3234, Class38_Sub20_Sub9_Sub1.anInt3227);
						}
					} else if (Class38_Sub20_Sub9_Sub1.anInt3204 > 0) {
						Class38_Sub20_Sub9_Sub1.anInt3228 += Class38_Sub20_Sub9_Sub1.anInt3204;
						i += Class38_Sub20_Sub9_Sub1.anInt3228 >> 8;
						Class38_Sub20_Sub9_Sub1.anInt3228 &= 0xff;
					}
					int i_94_ = anIntArray3213[i_85_];
					if (Class38_Sub20_Sub9_Sub1.anInt3226 != -1)
						Class38_Sub20_Sub9.method968(i, i_79_ + (int) (this.anInt3216 * 0.7), i_94_, Class38_Sub20_Sub9_Sub1.anInt3226);
					if (Class38_Sub20_Sub9_Sub1.anInt3223 != -1)
						Class38_Sub20_Sub9.method968(i, i_79_ + this.anInt3216, i_94_, Class38_Sub20_Sub9_Sub1.anInt3223);
					i += i_94_;
					i_82_ = i_85_;
				}
			}
		}
	}

	private final void method1073(int i, int i_95_) {
		Class38_Sub20_Sub9_Sub1.anInt3226 = -1;
		Class38_Sub20_Sub9_Sub1.anInt3223 = -1;
		Class38_Sub20_Sub9_Sub1.anInt3205 = Class38_Sub20_Sub9_Sub1.anInt3229 = i_95_;
		Class38_Sub20_Sub9_Sub1.anInt3234 = Class38_Sub20_Sub9_Sub1.anInt3211 = i;
		Class38_Sub20_Sub9_Sub1.anInt3227 = 256;
		Class38_Sub20_Sub9_Sub1.anInt3204 = 0;
		Class38_Sub20_Sub9_Sub1.anInt3228 = 0;
	}

	private final int method1074(RSString class19, int[] is, RSString[] class19s) {
		if (class19 == null)
			return 0;
		int i = 0;
		int i_96_ = 0;
		RSString class19_97_ = Class78.method564(true, 100);
		int i_98_ = -1;
		int i_99_ = 0;
		int i_100_ = 0;
		int i_101_ = -1;
		int i_102_ = -1;
		int i_103_ = 0;
		int i_104_ = class19.method143((byte) 49);
		for (int i_105_ = 0; i_105_ < i_104_; i_105_++) {
			int i_106_ = class19.method163(-122, i_105_);
			if (i_106_ == 60)
				i_101_ = i_105_;
			else {
				if (i_106_ == 62 && i_101_ != -1) {
					RSString class19_107_ = class19.method144((byte) -117, i_101_ + 1, i_105_);
					i_101_ = -1;
					class19_97_.method176(60, -5);
					class19_97_.method146(class19_107_, (byte) 109);
					class19_97_.method176(62, -5);
					if (class19_107_.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3236)) {
						class19s[i_103_++] = class19_97_.method144((byte) 106, i_96_, class19_97_.method143((byte) 75));
						i_96_ = class19_97_.method143((byte) 37);
						i = 0;
						i_98_ = -1;
						i_102_ = -1;
					} else if (class19_107_.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3214)) {
						i += method1068(60);
						if (aByteArray3230 != null && i_102_ != -1)
							i += aByteArray3230[(i_102_ << 8) + 60];
						i_102_ = 60;
					} else if (class19_107_.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3221)) {
						i += method1068(62);
						if (aByteArray3230 != null && i_102_ != -1)
							i += aByteArray3230[(i_102_ << 8) + 62];
						i_102_ = 62;
					} else if (class19_107_.method165(Class38_Sub20_Sub9_Sub1.aClass19_3206, true))
						try {
							int i_108_ = class19_107_.method171((byte) -92, 4).method164(-121);
							i += Class38_Sub20_Sub9_Sub1.aClass38_Sub20_Sub9_Sub2Array3220[i_108_].anInt3244;
							i_102_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					i_106_ = -1;
				}
				if (i_101_ == -1) {
					if (i_106_ != -1) {
						class19_97_.method176(i_106_, -5);
						i += method1068(i_106_);
						if (aByteArray3230 != null && i_102_ != -1)
							i += aByteArray3230[(i_102_ << 8) + i_106_];
						i_102_ = i_106_;
					}
					if (i_106_ == 32) {
						i_98_ = class19_97_.method143((byte) 61);
						i_99_ = i;
						i_100_ = 1;
					}
					if (is != null && i > is[i_103_ < is.length ? i_103_ : is.length - 1] && i_98_ >= 0) {
						class19s[i_103_++] = class19_97_.method144((byte) 26, i_96_, i_98_ - i_100_);
						i_96_ = i_98_;
						i_98_ = -1;
						i -= i_99_;
						i_102_ = -1;
					}
					if (i_106_ == 45) {
						i_98_ = class19_97_.method143((byte) 57);
						i_99_ = i;
						i_100_ = 0;
					}
				}
			}
		}
		if (class19_97_.method143((byte) 83) > i_96_)
			class19s[i_103_++] = class19_97_.method144((byte) 32, i_96_, class19_97_.method143((byte) 67));
		return i_103_;
	}

	final void method1075(RSString class19, int i, int i_109_, int i_110_, int i_111_, int i_112_) {
		if (class19 != null) {
			method1073(i_110_, i_111_);
			int[] is = new int[class19.anInt478];
			for (int i_113_ = 0; i_113_ < class19.anInt478; i_113_++)
				is[i_113_] = (int) (Math.sin(i_113_ / 2.0 + i_112_ / 5.0) * 5.0);
			method1072(class19, i - method1061(class19) / 2, i_109_, null, is);
		}
	}

	private final void method1076(RSString class19) {
		do {
			try {
				if (class19.method165(Class38_Sub20_Sub9_Sub1.aClass19_3207, true))
					Class38_Sub20_Sub9_Sub1.anInt3234 = class19.method171((byte) -30, 4).method159(false, 16);
				else if (class19.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3219))
					Class38_Sub20_Sub9_Sub1.anInt3234 = Class38_Sub20_Sub9_Sub1.anInt3211;
				else if (class19.method165(Class38_Sub20_Sub9_Sub1.aClass19_3225, true))
					Class38_Sub20_Sub9_Sub1.anInt3226 = class19.method171((byte) -75, 4).method159(false, 16);
				else if (class19.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3231))
					Class38_Sub20_Sub9_Sub1.anInt3226 = 8388608;
				else if (class19.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3215))
					Class38_Sub20_Sub9_Sub1.anInt3226 = -1;
				else if (class19.method165(Class38_Sub20_Sub9_Sub1.aClass19_3218, true))
					Class38_Sub20_Sub9_Sub1.anInt3223 = class19.method171((byte) -61, 2).method159(false, 16);
				else if (class19.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3232))
					Class38_Sub20_Sub9_Sub1.anInt3223 = 0;
				else if (class19.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3203))
					Class38_Sub20_Sub9_Sub1.anInt3223 = -1;
				else if (class19.method165(Class38_Sub20_Sub9_Sub1.aClass19_3212, true))
					Class38_Sub20_Sub9_Sub1.anInt3205 = class19.method171((byte) -40, 5).method159(false, 16);
				else if (class19.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3233))
					Class38_Sub20_Sub9_Sub1.anInt3205 = 0;
				else if (class19.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3224))
					Class38_Sub20_Sub9_Sub1.anInt3205 = Class38_Sub20_Sub9_Sub1.anInt3229;
				else {
					if (!class19.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3236))
						break;
					method1073(Class38_Sub20_Sub9_Sub1.anInt3211, Class38_Sub20_Sub9_Sub1.anInt3229);
				}
			} catch (Exception exception) {
				break;
			}
			break;
		} while (false);
	}

	private static final void method1077(byte[] is, int i, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_) {
		int i_119_ = i + i_114_ * Class38_Sub20_Sub9.anInt2889;
		int i_120_ = Class38_Sub20_Sub9.anInt2889 - i_115_;
		int i_121_ = 0;
		int i_122_ = 0;
		if (i_114_ < Class38_Sub20_Sub9.anInt2885) {
			int i_123_ = Class38_Sub20_Sub9.anInt2885 - i_114_;
			i_116_ -= i_123_;
			i_114_ = Class38_Sub20_Sub9.anInt2885;
			i_122_ += i_123_ * i_115_;
			i_119_ += i_123_ * Class38_Sub20_Sub9.anInt2889;
		}
		if (i_114_ + i_116_ > Class38_Sub20_Sub9.anInt2888)
			i_116_ -= i_114_ + i_116_ - Class38_Sub20_Sub9.anInt2888;
		if (i < Class38_Sub20_Sub9.anInt2887) {
			int i_124_ = Class38_Sub20_Sub9.anInt2887 - i;
			i_115_ -= i_124_;
			i = Class38_Sub20_Sub9.anInt2887;
			i_122_ += i_124_;
			i_119_ += i_124_;
			i_121_ += i_124_;
			i_120_ += i_124_;
		}
		if (i + i_115_ > Class38_Sub20_Sub9.anInt2890) {
			int i_125_ = i + i_115_ - Class38_Sub20_Sub9.anInt2890;
			i_115_ -= i_125_;
			i_121_ += i_125_;
			i_120_ += i_125_;
		}
		if (i_115_ > 0 && i_116_ > 0)
			Class38_Sub20_Sub9_Sub1.method1070(Class38_Sub20_Sub9.anIntArray2886, is, i_117_, i_122_, i_119_, i_115_, i_116_, i_120_, i_121_, i_118_);
	}

	private final void method1078(RSString class19, int i, int i_126_) {
		i_126_ -= this.anInt3216;
		int i_127_ = -1;
		int i_128_ = -1;
		for (int i_129_ = 0; i_129_ < class19.anInt478; i_129_++) {
			int i_130_ = class19.buffer[i_129_] & 0xff;
			if (i_130_ == 60)
				i_127_ = i_129_;
			else {
				if (i_130_ == 62 && i_127_ != -1) {
					RSString class19_131_ = class19.method144((byte) -128, i_127_ + 1, i_129_);
					i_127_ = -1;
					if (class19_131_.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3214))
						i_130_ = 60;
					else if (class19_131_.method175(true, Class38_Sub20_Sub9_Sub1.aClass19_3221))
						i_130_ = 62;
					else {
						if (class19_131_.method165(Class38_Sub20_Sub9_Sub1.aClass19_3206, true))
							try {
								int i_132_ = class19_131_.method171((byte) -12, 4).method164(-101);
								Class38_Sub20_Sub9_Sub2 class38_sub20_sub9_sub2 = Class38_Sub20_Sub9_Sub1.aClass38_Sub20_Sub9_Sub2Array3220[i_132_];
								class38_sub20_sub9_sub2.method1089(i, i_126_ + this.anInt3216 - class38_sub20_sub9_sub2.anInt3243);
								i += class38_sub20_sub9_sub2.anInt3244;
								i_128_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						else
							method1076(class19_131_);
						continue;
					}
				}
				if (i_127_ == -1) {
					if (aByteArray3230 != null && i_128_ != -1)
						i += aByteArray3230[(i_128_ << 8) + i_130_];
					int i_133_ = anIntArray3208[i_130_];
					int i_134_ = anIntArray3217[i_130_];
					if (i_130_ != 32) {
						if (Class38_Sub20_Sub9_Sub1.anInt3227 == 256) {
							if (Class38_Sub20_Sub9_Sub1.anInt3205 != -1)
								Class38_Sub20_Sub9_Sub1.method1063(aByteArrayArray3235[i_130_], i + anIntArray3209[i_130_] + 1, i_126_ + anIntArray3210[i_130_] + 1, i_133_, i_134_, Class38_Sub20_Sub9_Sub1.anInt3205);
							method1079(aByteArrayArray3235[i_130_], i + anIntArray3209[i_130_], i_126_ + anIntArray3210[i_130_], i_133_, i_134_, Class38_Sub20_Sub9_Sub1.anInt3234);
						} else {
							if (Class38_Sub20_Sub9_Sub1.anInt3205 != -1)
								Class38_Sub20_Sub9_Sub1.method1077(aByteArrayArray3235[i_130_], i + anIntArray3209[i_130_] + 1, i_126_ + anIntArray3210[i_130_] + 1, i_133_, i_134_, Class38_Sub20_Sub9_Sub1.anInt3205, Class38_Sub20_Sub9_Sub1.anInt3227);
							method1065(aByteArrayArray3235[i_130_], i + anIntArray3209[i_130_], i_126_ + anIntArray3210[i_130_], i_133_, i_134_, Class38_Sub20_Sub9_Sub1.anInt3234, Class38_Sub20_Sub9_Sub1.anInt3227);
						}
					} else if (Class38_Sub20_Sub9_Sub1.anInt3204 > 0) {
						Class38_Sub20_Sub9_Sub1.anInt3228 += Class38_Sub20_Sub9_Sub1.anInt3204;
						i += Class38_Sub20_Sub9_Sub1.anInt3228 >> 8;
						Class38_Sub20_Sub9_Sub1.anInt3228 &= 0xff;
					}
					int i_135_ = anIntArray3213[i_130_];
					if (Class38_Sub20_Sub9_Sub1.anInt3226 != -1)
						Class38_Sub20_Sub9.method968(i, i_126_ + (int) (this.anInt3216 * 0.7), i_135_, Class38_Sub20_Sub9_Sub1.anInt3226);
					if (Class38_Sub20_Sub9_Sub1.anInt3223 != -1)
						Class38_Sub20_Sub9.method968(i, i_126_ + this.anInt3216 + 1, i_135_, Class38_Sub20_Sub9_Sub1.anInt3223);
					i += i_135_;
					i_128_ = i_130_;
				}
			}
		}
	}

	abstract void method1079(byte[] is, int i, int i_136_, int i_137_, int i_138_, int i_139_);

	final void method1080(RSString class19, int i, int i_140_, int i_141_, int i_142_, int i_143_) {
		if (class19 != null) {
			method1073(i_141_, i_142_);
			int[] is = new int[class19.anInt478];
			int[] is_144_ = new int[class19.anInt478];
			for (int i_145_ = 0; i_145_ < class19.anInt478; i_145_++) {
				is[i_145_] = (int) (Math.sin(i_145_ / 5.0 + i_143_ / 5.0) * 5.0);
				is_144_[i_145_] = (int) (Math.sin(i_145_ / 3.0 + i_143_ / 5.0) * 5.0);
			}
			method1072(class19, i - method1061(class19) / 2, i_140_, is, is_144_);
		}
	}

	public static void method1081() {
		Class38_Sub20_Sub9_Sub1.aClass19_3214 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3221 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3206 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3236 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3207 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3219 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3218 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3232 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3203 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3212 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3233 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3224 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3225 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3231 = null;
		Class38_Sub20_Sub9_Sub1.aClass19_3215 = null;
		Class38_Sub20_Sub9_Sub1.aClass38_Sub20_Sub9_Sub2Array3220 = null;
		Class38_Sub20_Sub9_Sub1.aRandom3237 = null;
		Class38_Sub20_Sub9_Sub1.aClass19Array3238 = null;
	}

	final int method1082(RSString class19, int i) {
		int i_146_ = method1074(class19, new int[] { i }, Class38_Sub20_Sub9_Sub1.aClass19Array3238);
		int i_147_ = 0;
		for (int i_148_ = 0; i_148_ < i_146_; i_148_++) {
			int i_149_ = method1061(Class38_Sub20_Sub9_Sub1.aClass19Array3238[i_148_]);
			if (i_149_ > i_147_)
				i_147_ = i_149_;
		}
		return i_147_;
	}

	final void method1083(RSString class19, int i, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_) {
		if (class19 != null) {
			method1073(i_151_, i_152_);
			double d = 7.0 - i_154_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int[] is = new int[class19.anInt478];
			for (int i_155_ = 0; i_155_ < class19.anInt478; i_155_++)
				is[i_155_] = (int) (Math.sin(i_155_ / 1.5 + i_153_) * d);
			method1072(class19, i - method1061(class19) / 2, i_150_, null, is);
		}
	}

	final void method1084(RSString class19, int i, int i_156_, int i_157_, int i_158_) {
		if (class19 != null) {
			method1073(i_157_, i_158_);
			method1078(class19, i, i_156_);
		}
	}

	static final void method1085(int[] is, byte[] is_159_, int i, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_) {
		int i_166_ = -(i_162_ >> 2);
		i_162_ = -(i_162_ & 0x3);
		for (int i_167_ = -i_163_; i_167_ < 0; i_167_++) {
			for (int i_168_ = i_166_; i_168_ < 0; i_168_++) {
				if (is_159_[i_160_++] != 0)
					is[i_161_++] = i;
				else
					i_161_++;
				if (is_159_[i_160_++] != 0)
					is[i_161_++] = i;
				else
					i_161_++;
				if (is_159_[i_160_++] != 0)
					is[i_161_++] = i;
				else
					i_161_++;
				if (is_159_[i_160_++] != 0)
					is[i_161_++] = i;
				else
					i_161_++;
			}
			for (int i_169_ = i_162_; i_169_ < 0; i_169_++)
				if (is_159_[i_160_++] != 0)
					is[i_161_++] = i;
				else
					i_161_++;
			i_161_ += i_164_;
			i_160_ += i_165_;
		}
	}

	final void method1086(RSString class19, int i, int i_170_, int i_171_, int i_172_) {
		if (class19 != null) {
			method1073(i_171_, i_172_);
			method1078(class19, i - method1061(class19) / 2, i_170_);
		}
	}

	Class38_Sub20_Sub9_Sub1(byte[] is, int[] is_173_, int[] is_174_, int[] is_175_, int[] is_176_, int[] is_177_, byte[][] is_178_) {
		aByteArrayArray3235 = new byte[256][];
		anIntArray3209 = is_173_;
		anIntArray3210 = is_174_;
		anIntArray3208 = is_175_;
		anIntArray3217 = is_176_;
		method1066(is);
		aByteArrayArray3235 = is_178_;
		int i = 2147483647;
		int i_179_ = -2147483648;
		for (int i_180_ = 0; i_180_ < 256; i_180_++) {
			if (anIntArray3210[i_180_] < i && anIntArray3217[i_180_] != 0)
				i = anIntArray3210[i_180_];
			if (anIntArray3210[i_180_] + anIntArray3217[i_180_] > i_179_)
				i_179_ = anIntArray3210[i_180_] + anIntArray3217[i_180_];
		}
		anInt3202 = this.anInt3216 - i;
		anInt3222 = i_179_ - this.anInt3216;
	}

	Class38_Sub20_Sub9_Sub1(byte[] is) {
		aByteArrayArray3235 = new byte[256][];
		method1066(is);
	}

	private static final int method1087(byte[][] is, byte[][] is_181_, int[] is_182_, int[] is_183_, int[] is_184_, int i, int i_185_) {
		int i_186_ = is_182_[i];
		int i_187_ = i_186_ + is_184_[i];
		int i_188_ = is_182_[i_185_];
		int i_189_ = i_188_ + is_184_[i_185_];
		int i_190_ = i_186_;
		if (i_188_ > i_186_)
			i_190_ = i_188_;
		int i_191_ = i_187_;
		if (i_189_ < i_187_)
			i_191_ = i_189_;
		int i_192_ = is_183_[i];
		if (is_183_[i_185_] < i_192_)
			i_192_ = is_183_[i_185_];
		byte[] is_193_ = is_181_[i];
		byte[] is_194_ = is[i_185_];
		int i_195_ = i_190_ - i_186_;
		int i_196_ = i_190_ - i_188_;
		for (int i_197_ = i_190_; i_197_ < i_191_; i_197_++) {
			int i_198_ = is_193_[i_195_++] + is_194_[i_196_++];
			if (i_198_ < i_192_)
				i_192_ = i_198_;
		}
		return -i_192_;
	}

	static {
		Class38_Sub20_Sub9_Sub1.aClass19_3207 = RSString.createRSString("col=");
		Class38_Sub20_Sub9_Sub1.aClass19_3212 = RSString.createRSString("shad=");
		Class38_Sub20_Sub9_Sub1.aClass19_3218 = RSString.createRSString("u=");
		Class38_Sub20_Sub9_Sub1.anInt3223 = -1;
		Class38_Sub20_Sub9_Sub1.anInt3228 = 0;
		Class38_Sub20_Sub9_Sub1.aClass19_3224 = RSString.createRSString(")4shad");
		Class38_Sub20_Sub9_Sub1.aClass19_3225 = RSString.createRSString("str=");
		Class38_Sub20_Sub9_Sub1.aClass19_3221 = RSString.createRSString("gt");
		Class38_Sub20_Sub9_Sub1.aClass19_3215 = RSString.createRSString(")4str");
		Class38_Sub20_Sub9_Sub1.anInt3226 = -1;
		Class38_Sub20_Sub9_Sub1.anInt3204 = 0;
		Class38_Sub20_Sub9_Sub1.aClass19_3232 = RSString.createRSString("u");
		Class38_Sub20_Sub9_Sub1.aClass19_3233 = RSString.createRSString("shad");
		Class38_Sub20_Sub9_Sub1.anInt3211 = 0;
		Class38_Sub20_Sub9_Sub1.aClass19_3231 = RSString.createRSString("str");
		Class38_Sub20_Sub9_Sub1.anInt3229 = -1;
		Class38_Sub20_Sub9_Sub1.aClass19_3236 = RSString.createRSString("br");
		Class38_Sub20_Sub9_Sub1.anInt3227 = 256;
		Class38_Sub20_Sub9_Sub1.anInt3234 = 0;
		Class38_Sub20_Sub9_Sub1.aClass19_3219 = RSString.createRSString(")4col");
		Class38_Sub20_Sub9_Sub1.aRandom3237 = new Random();
		Class38_Sub20_Sub9_Sub1.aClass19Array3238 = new RSString[100];
	}
}
