package com.javatar;/* Class38_Sub20_Sub9_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.PixelGrabber;

final class Class38_Sub20_Sub9_Sub3 extends Class38_Sub20_Sub9 {
	int anInt3294;
	int anInt3295;
	int anInt3296;
	int anInt3297;
	int anInt3298;
	int anInt3299;
	int[] anIntArray3300;

	Class38_Sub20_Sub9_Sub3() {
		/* empty */
	}

	Class38_Sub20_Sub9_Sub3(int i, int i_326_) {
		this.anIntArray3300 = new int[i * i_326_];
		this.anInt3297 = this.anInt3294 = i;
		this.anInt3298 = this.anInt3296 = i_326_;
		this.anInt3295 = this.anInt3299 = 0;
	}

	Class38_Sub20_Sub9_Sub3(byte[] is, Component component) {
		try {
			Image image = Toolkit.getDefaultToolkit().createImage(is);
			MediaTracker mediatracker = new MediaTracker(component);
			mediatracker.addImage(image, 0);
			mediatracker.waitForAll();
			this.anInt3297 = image.getWidth(component);
			this.anInt3298 = image.getHeight(component);
			this.anInt3294 = this.anInt3297;
			this.anInt3296 = this.anInt3298;
			this.anInt3295 = 0;
			this.anInt3299 = 0;
			this.anIntArray3300 = new int[this.anInt3297 * this.anInt3298];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, this.anInt3297, this.anInt3298, this.anIntArray3300, 0, this.anInt3297);
			pixelgrabber.grabPixels();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	private static void method1103(int[] is, int[] is_114_, int i, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_) {
		int i_125_ = 256 - i_124_;
		int i_126_ = i_115_;
		for (int i_127_ = -i_120_; i_127_ < 0; i_127_++) {
			int i_128_ = (i_116_ >> 16) * i_123_;
			for (int i_129_ = -i_119_; i_129_ < 0; i_129_++) {
				i = is_114_[(i_115_ >> 16) + i_128_];
				if (i != 0) {
					int i_130_ = is[i_117_];
					is[i_117_++] = ((i & 0xff00ff) * i_124_ + (i_130_ & 0xff00ff) * i_125_ & ~0xff00ff) + ((i & 0xff00) * i_124_ + (i_130_ & 0xff00) * i_125_ & 0xff0000) >> 8;
				} else
					i_117_++;
				i_115_ += i_121_;
			}
			i_116_ += i_122_;
			i_115_ = i_126_;
			i_117_ += i_118_;
		}
	}

	private static void method1104(int[] is, int[] is_131_, int i, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_) {
		int i_138_ = -(i_134_ >> 2);
		i_134_ = -(i_134_ & 0x3);
		for (int i_139_ = -i_135_; i_139_ < 0; i_139_++) {
			for (int i_140_ = i_138_; i_140_ < 0; i_140_++) {
				i = is_131_[i_132_++];
				if (i != 0)
					is[i_133_++] = i;
				else
					i_133_++;
				i = is_131_[i_132_++];
				if (i != 0)
					is[i_133_++] = i;
				else
					i_133_++;
				i = is_131_[i_132_++];
				if (i != 0)
					is[i_133_++] = i;
				else
					i_133_++;
				i = is_131_[i_132_++];
				if (i != 0)
					is[i_133_++] = i;
				else
					i_133_++;
			}
			for (int i_141_ = i_134_; i_141_ < 0; i_141_++) {
				i = is_131_[i_132_++];
				if (i != 0)
					is[i_133_++] = i;
				else
					i_133_++;
			}
			i_133_ += i_136_;
			i_132_ += i_137_;
		}
	}

	private static void method1111(int[] is, int[] is_205_, int i, int i_206_, int i_207_, int i_208_, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_, byte[] is_214_) {
		int i_215_ = -(i_209_ >> 2);
		i_209_ = -(i_209_ & 0x3);
		for (int i_216_ = -i_210_; i_216_ < 0; i_216_++) {
			for (int i_217_ = i_215_; i_217_ < 0; i_217_++) {
				i = is_205_[i_206_++];
				if (i != 0 && is_214_[i_208_] == 0)
					is[i_207_++] = i;
				else
					i_207_++;
				i_208_++;
				i = is_205_[i_206_++];
				if (i != 0 && is_214_[i_208_] == 0)
					is[i_207_++] = i;
				else
					i_207_++;
				i_208_++;
				i = is_205_[i_206_++];
				if (i != 0 && is_214_[i_208_] == 0)
					is[i_207_++] = i;
				else
					i_207_++;
				i_208_++;
				i = is_205_[i_206_++];
				if (i != 0 && is_214_[i_208_] == 0)
					is[i_207_++] = i;
				else
					i_207_++;
				i_208_++;
			}
			for (int i_218_ = i_209_; i_218_ < 0; i_218_++) {
				i = is_205_[i_206_++];
				if (i != 0 && is_214_[i_208_] == 0)
					is[i_207_++] = i;
				else
					i_207_++;
				i_208_++;
			}
			i_207_ += i_211_;
			i_206_ += i_212_;
			i_208_ += i_213_;
		}
	}

	private static void method1113(int[] is, int[] is_227_, int i, int i_228_, int i_229_, int i_230_, int i_231_, int i_232_) {
		for (int i_233_ = -i_230_; i_233_ < 0; i_233_++) {
			int i_234_ = i_228_ + i_229_ - 3;
			while (i_228_ < i_234_) {
				is[i_228_++] = is_227_[i++];
				is[i_228_++] = is_227_[i++];
				is[i_228_++] = is_227_[i++];
				is[i_228_++] = is_227_[i++];
			}
			i_234_ += 3;
			while (i_228_ < i_234_)
				is[i_228_++] = is_227_[i++];
			i_228_ += i_231_;
			i += i_232_;
		}
	}

	private static void method1115(int[] is, int[] is_239_, int i, int i_240_, int i_241_, int i_242_, int i_243_, int i_244_, int i_245_, int i_246_) {
		int i_247_ = 256 - i_246_;
		for (int i_248_ = -i_243_; i_248_ < 0; i_248_++) {
			for (int i_249_ = -i_242_; i_249_ < 0; i_249_++) {
				i = is_239_[i_240_++];
				if (i != 0) {
					int i_250_ = is[i_241_];
					is[i_241_++] = ((i & 0xff00ff) * i_246_ + (i_250_ & 0xff00ff) * i_247_ & ~0xff00ff) + ((i & 0xff00) * i_246_ + (i_250_ & 0xff00) * i_247_ & 0xff0000) >> 8;
				} else
					i_241_++;
			}
			i_241_ += i_244_;
			i_240_ += i_245_;
		}
	}

	private static void method1117(int[] is, int[] is_253_, int i, int i_254_, int i_255_, int i_256_, int i_257_, int i_258_, int i_259_, int i_260_, int i_261_, int i_262_) {
		int i_263_ = i_254_;
		for (int i_264_ = -i_259_; i_264_ < 0; i_264_++) {
			int i_265_ = (i_255_ >> 16) * i_262_;
			for (int i_266_ = -i_258_; i_266_ < 0; i_266_++) {
				i = is_253_[(i_254_ >> 16) + i_265_];
				if (i != 0)
					is[i_256_++] = i;
				else
					i_256_++;
				i_254_ += i_260_;
			}
			i_255_ += i_261_;
			i_254_ = i_263_;
			i_256_ += i_257_;
		}
	}

	private static void method1119(int[] is, int[] is_270_, int i, int i_271_, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_, int i_278_) {
		int i_279_ = 256 - i_277_;
		int i_280_ = (i_278_ & 0xff00ff) * i_279_ & ~0xff00ff;
		int i_281_ = (i_278_ & 0xff00) * i_279_ & 0xff0000;
		i_278_ = (i_280_ | i_281_) >>> 8;
		for (int i_282_ = -i_274_; i_282_ < 0; i_282_++) {
			for (int i_283_ = -i_273_; i_283_ < 0; i_283_++) {
				i = is_270_[i_271_++];
				if (i != 0) {
					i_280_ = (i & 0xff00ff) * i_277_ & ~0xff00ff;
					i_281_ = (i & 0xff00) * i_277_ & 0xff0000;
					is[i_272_++] = ((i_280_ | i_281_) >>> 8) + i_278_;
				} else
					i_272_++;
			}
			i_272_ += i_275_;
			i_271_ += i_276_;
		}
	}

	private void method1100(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (i_4_ != 0) {
			i -= this.anInt3295 << 4;
			i_0_ -= this.anInt3299 << 4;
			double d = (i_3_ & 0xffff) * 9.587379924285257E-5;
			int i_5_ = (int) Math.floor(Math.sin(d) * i_4_ + 0.5);
			int i_6_ = (int) Math.floor(Math.cos(d) * i_4_ + 0.5);
			int i_7_ = -i * i_6_ + -i_0_ * i_5_;
			int i_8_ = i * i_5_ + -i_0_ * i_6_;
			int i_9_ = ((this.anInt3297 << 4) - i) * i_6_ + -i_0_ * i_5_;
			int i_10_ = -((this.anInt3297 << 4) - i) * i_5_ + -i_0_ * i_6_;
			int i_11_ = -i * i_6_ + ((this.anInt3298 << 4) - i_0_) * i_5_;
			int i_12_ = i * i_5_ + ((this.anInt3298 << 4) - i_0_) * i_6_;
			int i_13_ = ((this.anInt3297 << 4) - i) * i_6_ + ((this.anInt3298 << 4) - i_0_) * i_5_;
			int i_14_ = -((this.anInt3297 << 4) - i) * i_5_ + ((this.anInt3298 << 4) - i_0_) * i_6_;
			int i_15_;
			int i_16_;
			if (i_7_ < i_9_) {
				i_15_ = i_7_;
				i_16_ = i_9_;
			} else {
				i_15_ = i_9_;
				i_16_ = i_7_;
			}
			if (i_11_ < i_15_)
				i_15_ = i_11_;
			if (i_13_ < i_15_)
				i_15_ = i_13_;
			if (i_11_ > i_16_)
				i_16_ = i_11_;
			if (i_13_ > i_16_)
				i_16_ = i_13_;
			int i_17_;
			int i_18_;
			if (i_8_ < i_10_) {
				i_17_ = i_8_;
				i_18_ = i_10_;
			} else {
				i_17_ = i_10_;
				i_18_ = i_8_;
			}
			if (i_12_ < i_17_)
				i_17_ = i_12_;
			if (i_14_ < i_17_)
				i_17_ = i_14_;
			if (i_12_ > i_18_)
				i_18_ = i_12_;
			if (i_14_ > i_18_)
				i_18_ = i_14_;
			i_15_ >>= 12;
			i_16_ = i_16_ + 4095 >> 12;
			i_17_ >>= 12;
			i_18_ = i_18_ + 4095 >> 12;
			i_15_ += i_1_;
			i_16_ += i_1_;
			i_17_ += i_2_;
			i_18_ += i_2_;
			i_15_ >>= 4;
			i_16_ = i_16_ + 15 >> 4;
			i_17_ >>= 4;
			i_18_ = i_18_ + 15 >> 4;
			if (i_15_ < Class38_Sub20_Sub9.anInt2887)
				i_15_ = Class38_Sub20_Sub9.anInt2887;
			if (i_16_ > Class38_Sub20_Sub9.anInt2890)
				i_16_ = Class38_Sub20_Sub9.anInt2890;
			if (i_17_ < Class38_Sub20_Sub9.anInt2885)
				i_17_ = Class38_Sub20_Sub9.anInt2885;
			if (i_18_ > Class38_Sub20_Sub9.anInt2888)
				i_18_ = Class38_Sub20_Sub9.anInt2888;
			i_16_ = i_15_ - i_16_;
			if (i_16_ < 0) {
				i_18_ = i_17_ - i_18_;
				if (i_18_ < 0) {
					int i_19_ = i_17_ * Class38_Sub20_Sub9.anInt2889 + i_15_;
					double d_20_ = 1.6777216E7 / i_4_;
					int i_21_ = (int) Math.floor(Math.sin(d) * d_20_ + 0.5);
					int i_22_ = (int) Math.floor(Math.cos(d) * d_20_ + 0.5);
					int i_23_ = (i_15_ << 4) + 8 - i_1_;
					int i_24_ = (i_17_ << 4) + 8 - i_2_;
					int i_25_ = (i << 8) - (i_24_ * i_21_ >> 4);
					int i_26_ = (i_0_ << 8) + (i_24_ * i_22_ >> 4);
					if (i_22_ == 0) {
						if (i_21_ == 0) {
							int i_27_ = i_18_;
							while (i_27_ < 0) {
								int i_28_ = i_19_;
								int i_31_ = i_16_;
								if (i_25_ >= 0 && i_26_ >= 0 && i_25_ - (this.anInt3297 << 12) < 0 && i_26_ - (this.anInt3298 << 12) < 0)
									for (/**/; i_31_ < 0; i_31_++) {
										int i_32_ = this.anIntArray3300[(i_26_ >> 12) * this.anInt3297 + (i_25_ >> 12)];
										if (i_32_ != 0)
											Class38_Sub20_Sub9.anIntArray2886[i_28_++] = i_32_;
										else
											i_28_++;
									}
								i_27_++;
								i_19_ += Class38_Sub20_Sub9.anInt2889;
							}
						} else if (i_21_ < 0) {
							int i_33_ = i_18_;
							while (i_33_ < 0) {
								int i_34_ = i_19_;
								int i_35_ = i_25_;
								int i_36_ = i_26_ + (i_23_ * i_21_ >> 4);
								int i_37_ = i_16_;
								if (i_35_ >= 0 && i_35_ - (this.anInt3297 << 12) < 0) {
									int i_38_;
									if ((i_38_ = i_36_ - (this.anInt3298 << 12)) >= 0) {
										i_38_ = (i_21_ - i_38_) / i_21_;
										i_37_ += i_38_;
										i_36_ += i_21_ * i_38_;
										i_34_ += i_38_;
									}
									if ((i_38_ = (i_36_ - i_21_) / i_21_) > i_37_)
										i_37_ = i_38_;
									for (/**/; i_37_ < 0; i_37_++) {
										int i_39_ = this.anIntArray3300[(i_36_ >> 12) * this.anInt3297 + (i_35_ >> 12)];
										if (i_39_ != 0)
											Class38_Sub20_Sub9.anIntArray2886[i_34_++] = i_39_;
										else
											i_34_++;
										i_36_ += i_21_;
									}
								}
								i_33_++;
								i_25_ -= i_21_;
								i_19_ += Class38_Sub20_Sub9.anInt2889;
							}
						} else {
							int i_40_ = i_18_;
							while (i_40_ < 0) {
								int i_41_ = i_19_;
								int i_42_ = i_25_;
								int i_43_ = i_26_ + (i_23_ * i_21_ >> 4);
								int i_44_ = i_16_;
								if (i_42_ >= 0 && i_42_ - (this.anInt3297 << 12) < 0) {
									if (i_43_ < 0) {
										int i_45_ = (i_21_ - 1 - i_43_) / i_21_;
										i_44_ += i_45_;
										i_43_ += i_21_ * i_45_;
										i_41_ += i_45_;
									}
									int i_46_;
									if ((i_46_ = (i_43_ + 1 - (this.anInt3298 << 12) - i_21_) / i_21_) > i_44_)
										i_44_ = i_46_;
									for (/**/; i_44_ < 0; i_44_++) {
										int i_47_ = this.anIntArray3300[(i_43_ >> 12) * this.anInt3297 + (i_42_ >> 12)];
										if (i_47_ != 0)
											Class38_Sub20_Sub9.anIntArray2886[i_41_++] = i_47_;
										else
											i_41_++;
										i_43_ += i_21_;
									}
								}
								i_40_++;
								i_25_ -= i_21_;
								i_19_ += Class38_Sub20_Sub9.anInt2889;
							}
						}
					} else if (i_22_ < 0) {
						if (i_21_ == 0) {
							int i_48_ = i_18_;
							while (i_48_ < 0) {
								int i_49_ = i_19_;
								int i_50_ = i_25_ + (i_23_ * i_22_ >> 4);
								int i_51_ = i_26_;
								int i_52_ = i_16_;
								if (i_51_ >= 0 && i_51_ - (this.anInt3298 << 12) < 0) {
									int i_53_;
									if ((i_53_ = i_50_ - (this.anInt3297 << 12)) >= 0) {
										i_53_ = (i_22_ - i_53_) / i_22_;
										i_52_ += i_53_;
										i_50_ += i_22_ * i_53_;
										i_49_ += i_53_;
									}
									if ((i_53_ = (i_50_ - i_22_) / i_22_) > i_52_)
										i_52_ = i_53_;
									for (/**/; i_52_ < 0; i_52_++) {
										int i_54_ = this.anIntArray3300[(i_51_ >> 12) * this.anInt3297 + (i_50_ >> 12)];
										if (i_54_ != 0)
											Class38_Sub20_Sub9.anIntArray2886[i_49_++] = i_54_;
										else
											i_49_++;
										i_50_ += i_22_;
									}
								}
								i_48_++;
								i_26_ += i_22_;
								i_19_ += Class38_Sub20_Sub9.anInt2889;
							}
						} else if (i_21_ < 0) {
							int i_55_ = i_18_;
							while (i_55_ < 0) {
								int i_56_ = i_19_;
								int i_57_ = i_25_ + (i_23_ * i_22_ >> 4);
								int i_58_ = i_26_ + (i_23_ * i_21_ >> 4);
								int i_59_ = i_16_;
								int i_60_;
								if ((i_60_ = i_57_ - (this.anInt3297 << 12)) >= 0) {
									i_60_ = (i_22_ - i_60_) / i_22_;
									i_59_ += i_60_;
									i_57_ += i_22_ * i_60_;
									i_58_ += i_21_ * i_60_;
									i_56_ += i_60_;
								}
								if ((i_60_ = (i_57_ - i_22_) / i_22_) > i_59_)
									i_59_ = i_60_;
								if ((i_60_ = i_58_ - (this.anInt3298 << 12)) >= 0) {
									i_60_ = (i_21_ - i_60_) / i_21_;
									i_59_ += i_60_;
									i_57_ += i_22_ * i_60_;
									i_58_ += i_21_ * i_60_;
									i_56_ += i_60_;
								}
								if ((i_60_ = (i_58_ - i_21_) / i_21_) > i_59_)
									i_59_ = i_60_;
								for (/**/; i_59_ < 0; i_59_++) {
									int i_61_ = this.anIntArray3300[(i_58_ >> 12) * this.anInt3297 + (i_57_ >> 12)];
									if (i_61_ != 0)
										Class38_Sub20_Sub9.anIntArray2886[i_56_++] = i_61_;
									else
										i_56_++;
									i_57_ += i_22_;
									i_58_ += i_21_;
								}
								i_55_++;
								i_25_ -= i_21_;
								i_26_ += i_22_;
								i_19_ += Class38_Sub20_Sub9.anInt2889;
							}
						} else {
							int i_62_ = i_18_;
							while (i_62_ < 0) {
								int i_63_ = i_19_;
								int i_64_ = i_25_ + (i_23_ * i_22_ >> 4);
								int i_65_ = i_26_ + (i_23_ * i_21_ >> 4);
								int i_66_ = i_16_;
								int i_67_;
								if ((i_67_ = i_64_ - (this.anInt3297 << 12)) >= 0) {
									i_67_ = (i_22_ - i_67_) / i_22_;
									i_66_ += i_67_;
									i_64_ += i_22_ * i_67_;
									i_65_ += i_21_ * i_67_;
									i_63_ += i_67_;
								}
								if ((i_67_ = (i_64_ - i_22_) / i_22_) > i_66_)
									i_66_ = i_67_;
								if (i_65_ < 0) {
									i_67_ = (i_21_ - 1 - i_65_) / i_21_;
									i_66_ += i_67_;
									i_64_ += i_22_ * i_67_;
									i_65_ += i_21_ * i_67_;
									i_63_ += i_67_;
								}
								if ((i_67_ = (i_65_ + 1 - (this.anInt3298 << 12) - i_21_) / i_21_) > i_66_)
									i_66_ = i_67_;
								for (/**/; i_66_ < 0; i_66_++) {
									int i_68_ = this.anIntArray3300[(i_65_ >> 12) * this.anInt3297 + (i_64_ >> 12)];
									if (i_68_ != 0)
										Class38_Sub20_Sub9.anIntArray2886[i_63_++] = i_68_;
									else
										i_63_++;
									i_64_ += i_22_;
									i_65_ += i_21_;
								}
								i_62_++;
								i_25_ -= i_21_;
								i_26_ += i_22_;
								i_19_ += Class38_Sub20_Sub9.anInt2889;
							}
						}
					} else if (i_21_ == 0) {
						int i_69_ = i_18_;
						while (i_69_ < 0) {
							int i_70_ = i_19_;
							int i_71_ = i_25_ + (i_23_ * i_22_ >> 4);
							int i_72_ = i_26_;
							int i_73_ = i_16_;
							if (i_72_ >= 0 && i_72_ - (this.anInt3298 << 12) < 0) {
								if (i_71_ < 0) {
									int i_74_ = (i_22_ - 1 - i_71_) / i_22_;
									i_73_ += i_74_;
									i_71_ += i_22_ * i_74_;
									i_70_ += i_74_;
								}
								int i_75_;
								if ((i_75_ = (i_71_ + 1 - (this.anInt3297 << 12) - i_22_) / i_22_) > i_73_)
									i_73_ = i_75_;
								for (/**/; i_73_ < 0; i_73_++) {
									int i_76_ = this.anIntArray3300[(i_72_ >> 12) * this.anInt3297 + (i_71_ >> 12)];
									if (i_76_ != 0)
										Class38_Sub20_Sub9.anIntArray2886[i_70_++] = i_76_;
									else
										i_70_++;
									i_71_ += i_22_;
								}
							}
							i_69_++;
							i_26_ += i_22_;
							i_19_ += Class38_Sub20_Sub9.anInt2889;
						}
					} else if (i_21_ < 0) {
						int i_77_ = i_18_;
						while (i_77_ < 0) {
							int i_78_ = i_19_;
							int i_79_ = i_25_ + (i_23_ * i_22_ >> 4);
							int i_80_ = i_26_ + (i_23_ * i_21_ >> 4);
							int i_81_ = i_16_;
							if (i_79_ < 0) {
								int i_82_ = (i_22_ - 1 - i_79_) / i_22_;
								i_81_ += i_82_;
								i_79_ += i_22_ * i_82_;
								i_80_ += i_21_ * i_82_;
								i_78_ += i_82_;
							}
							int i_83_;
							if ((i_83_ = (i_79_ + 1 - (this.anInt3297 << 12) - i_22_) / i_22_) > i_81_)
								i_81_ = i_83_;
							if ((i_83_ = i_80_ - (this.anInt3298 << 12)) >= 0) {
								i_83_ = (i_21_ - i_83_) / i_21_;
								i_81_ += i_83_;
								i_79_ += i_22_ * i_83_;
								i_80_ += i_21_ * i_83_;
								i_78_ += i_83_;
							}
							if ((i_83_ = (i_80_ - i_21_) / i_21_) > i_81_)
								i_81_ = i_83_;
							for (/**/; i_81_ < 0; i_81_++) {
								int i_84_ = this.anIntArray3300[(i_80_ >> 12) * this.anInt3297 + (i_79_ >> 12)];
								if (i_84_ != 0)
									Class38_Sub20_Sub9.anIntArray2886[i_78_++] = i_84_;
								else
									i_78_++;
								i_79_ += i_22_;
								i_80_ += i_21_;
							}
							i_77_++;
							i_25_ -= i_21_;
							i_26_ += i_22_;
							i_19_ += Class38_Sub20_Sub9.anInt2889;
						}
					} else {
						int i_85_ = i_18_;
						while (i_85_ < 0) {
							int i_86_ = i_19_;
							int i_87_ = i_25_ + (i_23_ * i_22_ >> 4);
							int i_88_ = i_26_ + (i_23_ * i_21_ >> 4);
							int i_89_ = i_16_;
							if (i_87_ < 0) {
								int i_90_ = (i_22_ - 1 - i_87_) / i_22_;
								i_89_ += i_90_;
								i_87_ += i_22_ * i_90_;
								i_88_ += i_21_ * i_90_;
								i_86_ += i_90_;
							}
							int i_91_;
							if ((i_91_ = (i_87_ + 1 - (this.anInt3297 << 12) - i_22_) / i_22_) > i_89_)
								i_89_ = i_91_;
							if (i_88_ < 0) {
								i_91_ = (i_21_ - 1 - i_88_) / i_21_;
								i_89_ += i_91_;
								i_87_ += i_22_ * i_91_;
								i_88_ += i_21_ * i_91_;
								i_86_ += i_91_;
							}
							if ((i_91_ = (i_88_ + 1 - (this.anInt3298 << 12) - i_21_) / i_21_) > i_89_)
								i_89_ = i_91_;
							for (/**/; i_89_ < 0; i_89_++) {
								int i_92_ = this.anIntArray3300[(i_88_ >> 12) * this.anInt3297 + (i_87_ >> 12)];
								if (i_92_ != 0)
									Class38_Sub20_Sub9.anIntArray2886[i_86_++] = i_92_;
								else
									i_86_++;
								i_87_ += i_22_;
								i_88_ += i_21_;
							}
							i_85_++;
							i_25_ -= i_21_;
							i_26_ += i_22_;
							i_19_ += Class38_Sub20_Sub9.anInt2889;
						}
					}
				}
			}
		}
	}

	final void method1101() {
		int[] is = new int[this.anInt3297 * this.anInt3298];
		int i = 0;
		for (int i_93_ = 0; i_93_ < this.anInt3298; i_93_++)
			for (int i_94_ = this.anInt3297 - 1; i_94_ >= 0; i_94_--)
				is[i++] = this.anIntArray3300[i_94_ + i_93_ * this.anInt3297];
		this.anIntArray3300 = is;
		this.anInt3295 = this.anInt3294 - this.anInt3297 - this.anInt3295;
	}

	final void method1102(int i, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int[] is, int[] is_102_) {
		try {
			int i_103_ = -i_96_ / 2;
			int i_104_ = -i_97_ / 2;
			int i_105_ = (int) (Math.sin(i_100_ / 326.11) * 65536.0);
			int i_106_ = (int) (Math.cos(i_100_ / 326.11) * 65536.0);
			i_105_ = i_105_ * i_101_ >> 8;
			i_106_ = i_106_ * i_101_ >> 8;
			int i_107_ = (i_98_ << 16) + i_104_ * i_105_ + i_103_ * i_106_;
			int i_108_ = (i_99_ << 16) + i_104_ * i_106_ - i_103_ * i_105_;
			int i_109_ = i + i_95_ * Class38_Sub20_Sub9.anInt2889;
			for (i_95_ = 0; i_95_ < i_97_; i_95_++) {
				int i_110_ = is[i_95_];
				int i_111_ = i_109_ + i_110_;
				int i_112_ = i_107_ + i_106_ * i_110_;
				int i_113_ = i_108_ - i_105_ * i_110_;
				for (i = -is_102_[i_95_]; i < 0; i++) {
					Class38_Sub20_Sub9.anIntArray2886[i_111_++] = this.anIntArray3300[(i_112_ >> 16) + (i_113_ >> 16) * this.anInt3297];
					i_112_ += i_106_;
					i_113_ -= i_105_;
				}
				i_107_ += i_105_;
				i_108_ += i_106_;
				i_109_ += Class38_Sub20_Sub9.anInt2889;
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	final void method1105(int i, int i_142_) {
		i += this.anInt3295;
		i_142_ += this.anInt3299;
		int i_143_ = i + i_142_ * Class38_Sub20_Sub9.anInt2889;
		int i_144_ = 0;
		int i_145_ = this.anInt3298;
		int i_146_ = this.anInt3297;
		int i_147_ = Class38_Sub20_Sub9.anInt2889 - i_146_;
		int i_148_ = 0;
		if (i_142_ < Class38_Sub20_Sub9.anInt2885) {
			int i_149_ = Class38_Sub20_Sub9.anInt2885 - i_142_;
			i_145_ -= i_149_;
			i_142_ = Class38_Sub20_Sub9.anInt2885;
			i_144_ += i_149_ * i_146_;
			i_143_ += i_149_ * Class38_Sub20_Sub9.anInt2889;
		}
		if (i_142_ + i_145_ > Class38_Sub20_Sub9.anInt2888)
			i_145_ -= i_142_ + i_145_ - Class38_Sub20_Sub9.anInt2888;
		if (i < Class38_Sub20_Sub9.anInt2887) {
			int i_150_ = Class38_Sub20_Sub9.anInt2887 - i;
			i_146_ -= i_150_;
			i = Class38_Sub20_Sub9.anInt2887;
			i_144_ += i_150_;
			i_143_ += i_150_;
			i_148_ += i_150_;
			i_147_ += i_150_;
		}
		if (i + i_146_ > Class38_Sub20_Sub9.anInt2890) {
			int i_151_ = i + i_146_ - Class38_Sub20_Sub9.anInt2890;
			i_146_ -= i_151_;
			i_148_ += i_151_;
			i_147_ += i_151_;
		}
		if (i_146_ > 0 && i_145_ > 0)
			Class38_Sub20_Sub9_Sub3.method1104(Class38_Sub20_Sub9.anIntArray2886, this.anIntArray3300, 0, i_144_, i_143_, i_146_, i_145_, i_147_, i_148_);
	}

	final void method1106(int i, int i_152_, int i_153_, int i_154_) {
		if (i_153_ > 0 && i_154_ > 0) {
			int i_155_ = this.anInt3297;
			int i_156_ = this.anInt3298;
			int i_157_ = 0;
			int i_158_ = 0;
			int i_159_ = this.anInt3294;
			int i_160_ = this.anInt3296;
			int i_161_ = (i_159_ << 16) / i_153_;
			int i_162_ = (i_160_ << 16) / i_154_;
			if (this.anInt3295 > 0) {
				int i_163_ = ((this.anInt3295 << 16) + i_161_ - 1) / i_161_;
				i += i_163_;
				i_157_ += i_163_ * i_161_ - (this.anInt3295 << 16);
			}
			if (this.anInt3299 > 0) {
				int i_164_ = ((this.anInt3299 << 16) + i_162_ - 1) / i_162_;
				i_152_ += i_164_;
				i_158_ += i_164_ * i_162_ - (this.anInt3299 << 16);
			}
			if (i_155_ < i_159_)
				i_153_ = ((i_155_ << 16) - i_157_ + i_161_ - 1) / i_161_;
			if (i_156_ < i_160_)
				i_154_ = ((i_156_ << 16) - i_158_ + i_162_ - 1) / i_162_;
			int i_165_ = i + i_152_ * Class38_Sub20_Sub9.anInt2889;
			int i_166_ = Class38_Sub20_Sub9.anInt2889 - i_153_;
			if (i_152_ + i_154_ > Class38_Sub20_Sub9.anInt2888)
				i_154_ -= i_152_ + i_154_ - Class38_Sub20_Sub9.anInt2888;
			if (i_152_ < Class38_Sub20_Sub9.anInt2885) {
				int i_167_ = Class38_Sub20_Sub9.anInt2885 - i_152_;
				i_154_ -= i_167_;
				i_165_ += i_167_ * Class38_Sub20_Sub9.anInt2889;
				i_158_ += i_162_ * i_167_;
			}
			if (i + i_153_ > Class38_Sub20_Sub9.anInt2890) {
				int i_168_ = i + i_153_ - Class38_Sub20_Sub9.anInt2890;
				i_153_ -= i_168_;
				i_166_ += i_168_;
			}
			if (i < Class38_Sub20_Sub9.anInt2887) {
				int i_169_ = Class38_Sub20_Sub9.anInt2887 - i;
				i_153_ -= i_169_;
				i_165_ += i_169_;
				i_157_ += i_161_ * i_169_;
				i_166_ += i_169_;
			}
			Class38_Sub20_Sub9_Sub3.method1117(Class38_Sub20_Sub9.anIntArray2886, this.anIntArray3300, 0, i_157_, i_158_, i_165_, i_166_, i_153_, i_154_, i_161_, i_162_, i_155_);
		}
	}

	final void method1107(Class38_Sub20_Sub9_Sub2 class38_sub20_sub9_sub2, int i, int i_170_) {
		if (Class38_Sub20_Sub9.anInt2890 - Class38_Sub20_Sub9.anInt2887 != class38_sub20_sub9_sub2.anInt3242 || Class38_Sub20_Sub9.anInt2888 - Class38_Sub20_Sub9.anInt2885 != class38_sub20_sub9_sub2.anInt3246)
			throw new IllegalStateException();
		i += this.anInt3295;
		i_170_ += this.anInt3299;
		int i_171_ = i + i_170_ * Class38_Sub20_Sub9.anInt2889;
		int i_172_ = 0;
		int i_173_ = this.anInt3298;
		int i_174_ = this.anInt3297;
		int i_175_ = Class38_Sub20_Sub9.anInt2889 - i_174_;
		int i_176_ = 0;
		if (i_170_ < Class38_Sub20_Sub9.anInt2885) {
			int i_177_ = Class38_Sub20_Sub9.anInt2885 - i_170_;
			i_173_ -= i_177_;
			i_170_ = Class38_Sub20_Sub9.anInt2885;
			i_172_ += i_177_ * i_174_;
			i_171_ += i_177_ * Class38_Sub20_Sub9.anInt2889;
		}
		if (i_170_ + i_173_ > Class38_Sub20_Sub9.anInt2888)
			i_173_ -= i_170_ + i_173_ - Class38_Sub20_Sub9.anInt2888;
		if (i < Class38_Sub20_Sub9.anInt2887) {
			int i_178_ = Class38_Sub20_Sub9.anInt2887 - i;
			i_174_ -= i_178_;
			i = Class38_Sub20_Sub9.anInt2887;
			i_172_ += i_178_;
			i_171_ += i_178_;
			i_176_ += i_178_;
			i_175_ += i_178_;
		}
		if (i + i_174_ > Class38_Sub20_Sub9.anInt2890) {
			int i_179_ = i + i_174_ - Class38_Sub20_Sub9.anInt2890;
			i_174_ -= i_179_;
			i_176_ += i_179_;
			i_175_ += i_179_;
		}
		if (i_174_ > 0 && i_173_ > 0) {
			int i_180_ = i - Class38_Sub20_Sub9.anInt2887 + (i_170_ - Class38_Sub20_Sub9.anInt2885) * class38_sub20_sub9_sub2.anInt3242;
			int i_181_ = class38_sub20_sub9_sub2.anInt3242 - i_174_;
			Class38_Sub20_Sub9_Sub3.method1111(Class38_Sub20_Sub9.anIntArray2886, this.anIntArray3300, 0, i_172_, i_171_, i_180_, i_174_, i_173_, i_175_, i_176_, i_181_, class38_sub20_sub9_sub2.aByteArray3239);
		}
	}

	final void method1108(int i, int i_182_, int i_183_, int i_184_, int i_185_) {
		if (i_183_ > 0 && i_184_ > 0) {
			int i_186_ = this.anInt3297;
			int i_187_ = this.anInt3298;
			int i_188_ = 0;
			int i_189_ = 0;
			int i_190_ = this.anInt3294;
			int i_191_ = this.anInt3296;
			int i_192_ = (i_190_ << 16) / i_183_;
			int i_193_ = (i_191_ << 16) / i_184_;
			if (this.anInt3295 > 0) {
				int i_194_ = ((this.anInt3295 << 16) + i_192_ - 1) / i_192_;
				i += i_194_;
				i_188_ += i_194_ * i_192_ - (this.anInt3295 << 16);
			}
			if (this.anInt3299 > 0) {
				int i_195_ = ((this.anInt3299 << 16) + i_193_ - 1) / i_193_;
				i_182_ += i_195_;
				i_189_ += i_195_ * i_193_ - (this.anInt3299 << 16);
			}
			if (i_186_ < i_190_)
				i_183_ = ((i_186_ << 16) - i_188_ + i_192_ - 1) / i_192_;
			if (i_187_ < i_191_)
				i_184_ = ((i_187_ << 16) - i_189_ + i_193_ - 1) / i_193_;
			int i_196_ = i + i_182_ * Class38_Sub20_Sub9.anInt2889;
			int i_197_ = Class38_Sub20_Sub9.anInt2889 - i_183_;
			if (i_182_ + i_184_ > Class38_Sub20_Sub9.anInt2888)
				i_184_ -= i_182_ + i_184_ - Class38_Sub20_Sub9.anInt2888;
			if (i_182_ < Class38_Sub20_Sub9.anInt2885) {
				int i_198_ = Class38_Sub20_Sub9.anInt2885 - i_182_;
				i_184_ -= i_198_;
				i_196_ += i_198_ * Class38_Sub20_Sub9.anInt2889;
				i_189_ += i_193_ * i_198_;
			}
			if (i + i_183_ > Class38_Sub20_Sub9.anInt2890) {
				int i_199_ = i + i_183_ - Class38_Sub20_Sub9.anInt2890;
				i_183_ -= i_199_;
				i_197_ += i_199_;
			}
			if (i < Class38_Sub20_Sub9.anInt2887) {
				int i_200_ = Class38_Sub20_Sub9.anInt2887 - i;
				i_183_ -= i_200_;
				i_196_ += i_200_;
				i_188_ += i_192_ * i_200_;
				i_197_ += i_200_;
			}
			Class38_Sub20_Sub9_Sub3.method1103(Class38_Sub20_Sub9.anIntArray2886, this.anIntArray3300, 0, i_188_, i_189_, i_196_, i_197_, i_183_, i_184_, i_192_, i_193_, i_186_, i_185_);
		}
	}

	final void method1109(int i) {
		for (int i_201_ = this.anInt3298 - 1; i_201_ > 0; i_201_--) {
			int i_202_ = i_201_ * this.anInt3297;
			for (int i_203_ = this.anInt3297 - 1; i_203_ > 0; i_203_--)
				if (this.anIntArray3300[i_203_ + i_202_] == 0 && this.anIntArray3300[i_203_ + i_202_ - 1 - this.anInt3297] != 0)
					this.anIntArray3300[i_203_ + i_202_] = i;
		}
	}

	final void method1110() {
		if (this.anInt3297 != this.anInt3294 || this.anInt3298 != this.anInt3296) {
			int[] is = new int[this.anInt3294 * this.anInt3296];
			for (int i = 0; i < this.anInt3298; i++)
				for (int i_204_ = 0; i_204_ < this.anInt3297; i_204_++)
					is[(i + this.anInt3299) * this.anInt3294 + i_204_ + this.anInt3295] = this.anIntArray3300[i * this.anInt3297 + i_204_];
			this.anIntArray3300 = is;
			this.anInt3297 = this.anInt3294;
			this.anInt3298 = this.anInt3296;
			this.anInt3295 = 0;
			this.anInt3299 = 0;
		}
	}

	final void method1112(int i) {
		if (this.anInt3297 != this.anInt3294 || this.anInt3298 != this.anInt3296) {
			int i_219_ = i;
			if (i_219_ > this.anInt3295)
				i_219_ = this.anInt3295;
			int i_220_ = i;
			if (i_220_ + this.anInt3295 + this.anInt3297 > this.anInt3294)
				i_220_ = this.anInt3294 - this.anInt3295 - this.anInt3297;
			int i_221_ = i;
			if (i_221_ > this.anInt3299)
				i_221_ = this.anInt3299;
			int i_222_ = i;
			if (i_222_ + this.anInt3299 + this.anInt3298 > this.anInt3296)
				i_222_ = this.anInt3296 - this.anInt3299 - this.anInt3298;
			int i_223_ = this.anInt3297 + i_219_ + i_220_;
			int i_224_ = this.anInt3298 + i_221_ + i_222_;
			int[] is = new int[i_223_ * i_224_];
			for (int i_225_ = 0; i_225_ < this.anInt3298; i_225_++)
				for (int i_226_ = 0; i_226_ < this.anInt3297; i_226_++)
					is[(i_225_ + i_221_) * i_223_ + i_226_ + i_219_] = this.anIntArray3300[i_225_ * this.anInt3297 + i_226_];
			this.anIntArray3300 = is;
			this.anInt3297 = i_223_;
			this.anInt3298 = i_224_;
			this.anInt3295 -= i_219_;
			this.anInt3299 -= i_221_;
		}
	}

	final void method1114(int i) {
		int[] is = new int[this.anInt3297 * this.anInt3298];
		int i_235_ = 0;
		for (int i_236_ = 0; i_236_ < this.anInt3298; i_236_++)
			for (int i_237_ = 0; i_237_ < this.anInt3297; i_237_++) {
				int i_238_ = this.anIntArray3300[i_235_];
				if (i_238_ == 0)
					if (i_237_ > 0 && this.anIntArray3300[i_235_ - 1] != 0)
						i_238_ = i;
					else if (i_236_ > 0 && this.anIntArray3300[i_235_ - this.anInt3297] != 0)
						i_238_ = i;
					else if (i_237_ < this.anInt3297 - 1 && this.anIntArray3300[i_235_ + 1] != 0)
						i_238_ = i;
					else if (i_236_ < this.anInt3298 - 1 && this.anIntArray3300[i_235_ + this.anInt3297] != 0)
						i_238_ = i;
				is[i_235_++] = i_238_;
			}
		this.anIntArray3300 = is;
	}

	final void method1116() {
		int[] is = new int[this.anInt3297 * this.anInt3298];
		int i = 0;
		for (int i_251_ = this.anInt3298 - 1; i_251_ >= 0; i_251_--)
			for (int i_252_ = 0; i_252_ < this.anInt3297; i_252_++)
				is[i++] = this.anIntArray3300[i_252_ + i_251_ * this.anInt3297];
		this.anIntArray3300 = is;
		this.anInt3299 = this.anInt3296 - this.anInt3298 - this.anInt3299;
	}

	final void method1118(int i, int i_267_, int i_268_, int i_269_) {
		method1100(this.anInt3294 << 3, this.anInt3296 << 3, i << 4, i_267_ << 4, i_268_, i_269_);
	}

	final void method1120(int i, int i_284_, int i_285_) {
		i += this.anInt3295;
		i_284_ += this.anInt3299;
		int i_286_ = i + i_284_ * Class38_Sub20_Sub9.anInt2889;
		int i_287_ = 0;
		int i_288_ = this.anInt3298;
		int i_289_ = this.anInt3297;
		int i_290_ = Class38_Sub20_Sub9.anInt2889 - i_289_;
		int i_291_ = 0;
		if (i_284_ < Class38_Sub20_Sub9.anInt2885) {
			int i_292_ = Class38_Sub20_Sub9.anInt2885 - i_284_;
			i_288_ -= i_292_;
			i_284_ = Class38_Sub20_Sub9.anInt2885;
			i_287_ += i_292_ * i_289_;
			i_286_ += i_292_ * Class38_Sub20_Sub9.anInt2889;
		}
		if (i_284_ + i_288_ > Class38_Sub20_Sub9.anInt2888)
			i_288_ -= i_284_ + i_288_ - Class38_Sub20_Sub9.anInt2888;
		if (i < Class38_Sub20_Sub9.anInt2887) {
			int i_293_ = Class38_Sub20_Sub9.anInt2887 - i;
			i_289_ -= i_293_;
			i = Class38_Sub20_Sub9.anInt2887;
			i_287_ += i_293_;
			i_286_ += i_293_;
			i_291_ += i_293_;
			i_290_ += i_293_;
		}
		if (i + i_289_ > Class38_Sub20_Sub9.anInt2890) {
			int i_294_ = i + i_289_ - Class38_Sub20_Sub9.anInt2890;
			i_289_ -= i_294_;
			i_291_ += i_294_;
			i_290_ += i_294_;
		}
		if (i_289_ > 0 && i_288_ > 0)
			Class38_Sub20_Sub9_Sub3.method1115(Class38_Sub20_Sub9.anIntArray2886, this.anIntArray3300, 0, i_287_, i_286_, i_289_, i_288_, i_290_, i_291_, i_285_);
	}

	final Class38_Sub20_Sub9_Sub3 method1121() {
		Class38_Sub20_Sub9_Sub3 class38_sub20_sub9_sub3_295_ = new Class38_Sub20_Sub9_Sub3(this.anInt3297, this.anInt3298);
		class38_sub20_sub9_sub3_295_.anInt3294 = this.anInt3294;
		class38_sub20_sub9_sub3_295_.anInt3296 = this.anInt3296;
		class38_sub20_sub9_sub3_295_.anInt3295 = this.anInt3294 - this.anInt3297 - this.anInt3295;
		class38_sub20_sub9_sub3_295_.anInt3299 = this.anInt3299;
		for (int i = 0; i < this.anInt3298; i++)
			for (int i_296_ = 0; i_296_ < this.anInt3297; i_296_++)
				class38_sub20_sub9_sub3_295_.anIntArray3300[i * this.anInt3297 + i_296_] = this.anIntArray3300[i * this.anInt3297 + this.anInt3297 - 1 - i_296_];
		return class38_sub20_sub9_sub3_295_;
	}

	final void method1122(int i, int i_297_) {
		if (128 == 256)
			method1105(i, i_297_);
		else {
			i += this.anInt3295;
			i_297_ += this.anInt3299;
			int i_300_ = i + i_297_ * Class38_Sub20_Sub9.anInt2889;
			int i_301_ = 0;
			int i_302_ = this.anInt3298;
			int i_303_ = this.anInt3297;
			int i_304_ = Class38_Sub20_Sub9.anInt2889 - i_303_;
			int i_305_ = 0;
			if (i_297_ < Class38_Sub20_Sub9.anInt2885) {
				int i_306_ = Class38_Sub20_Sub9.anInt2885 - i_297_;
				i_302_ -= i_306_;
				i_297_ = Class38_Sub20_Sub9.anInt2885;
				i_301_ += i_306_ * i_303_;
				i_300_ += i_306_ * Class38_Sub20_Sub9.anInt2889;
			}
			if (i_297_ + i_302_ > Class38_Sub20_Sub9.anInt2888)
				i_302_ -= i_297_ + i_302_ - Class38_Sub20_Sub9.anInt2888;
			if (i < Class38_Sub20_Sub9.anInt2887) {
				int i_307_ = Class38_Sub20_Sub9.anInt2887 - i;
				i_303_ -= i_307_;
				i = Class38_Sub20_Sub9.anInt2887;
				i_301_ += i_307_;
				i_300_ += i_307_;
				i_305_ += i_307_;
				i_304_ += i_307_;
			}
			if (i + i_303_ > Class38_Sub20_Sub9.anInt2890) {
				int i_308_ = i + i_303_ - Class38_Sub20_Sub9.anInt2890;
				i_303_ -= i_308_;
				i_305_ += i_308_;
				i_304_ += i_308_;
			}
			if (i_303_ > 0 && i_302_ > 0)
				Class38_Sub20_Sub9_Sub3.method1119(Class38_Sub20_Sub9.anIntArray2886, this.anIntArray3300, 0, i_301_, i_300_, i_303_, i_302_, i_304_, i_305_, 128, 16777215);
		}
	}

	final void method1123(int i, int i_309_) {
		i += this.anInt3295;
		i_309_ += this.anInt3299;
		int i_310_ = i + i_309_ * Class38_Sub20_Sub9.anInt2889;
		int i_311_ = 0;
		int i_312_ = this.anInt3298;
		int i_313_ = this.anInt3297;
		int i_314_ = Class38_Sub20_Sub9.anInt2889 - i_313_;
		int i_315_ = 0;
		if (i_309_ < Class38_Sub20_Sub9.anInt2885) {
			int i_316_ = Class38_Sub20_Sub9.anInt2885 - i_309_;
			i_312_ -= i_316_;
			i_309_ = Class38_Sub20_Sub9.anInt2885;
			i_311_ += i_316_ * i_313_;
			i_310_ += i_316_ * Class38_Sub20_Sub9.anInt2889;
		}
		if (i_309_ + i_312_ > Class38_Sub20_Sub9.anInt2888)
			i_312_ -= i_309_ + i_312_ - Class38_Sub20_Sub9.anInt2888;
		if (i < Class38_Sub20_Sub9.anInt2887) {
			int i_317_ = Class38_Sub20_Sub9.anInt2887 - i;
			i_313_ -= i_317_;
			i = Class38_Sub20_Sub9.anInt2887;
			i_311_ += i_317_;
			i_310_ += i_317_;
			i_315_ += i_317_;
			i_314_ += i_317_;
		}
		if (i + i_313_ > Class38_Sub20_Sub9.anInt2890) {
			int i_318_ = i + i_313_ - Class38_Sub20_Sub9.anInt2890;
			i_313_ -= i_318_;
			i_315_ += i_318_;
			i_314_ += i_318_;
		}
		if (i_313_ > 0 && i_312_ > 0)
			Class38_Sub20_Sub9_Sub3.method1113(Class38_Sub20_Sub9.anIntArray2886, this.anIntArray3300, i_311_, i_310_, i_313_, i_312_, i_314_, i_315_);
	}

	final void method1124() {
		Class38_Sub20_Sub9.method957(this.anIntArray3300, this.anInt3297, this.anInt3298);
	}

	final void method1125(int i, int i_319_, int i_320_) {
		for (int i_321_ = 0; i_321_ < this.anIntArray3300.length; i_321_++) {
			int i_322_ = this.anIntArray3300[i_321_];
			if (i_322_ != 0) {
				int i_323_ = i_322_ >> 16 & 0xff;
				i_323_ += i;
				if (i_323_ < 1)
					i_323_ = 1;
				else if (i_323_ > 255)
					i_323_ = 255;
				int i_324_ = i_322_ >> 8 & 0xff;
				i_324_ += i_319_;
				if (i_324_ < 1)
					i_324_ = 1;
				else if (i_324_ > 255)
					i_324_ = 255;
				int i_325_ = i_322_ & 0xff;
				i_325_ += i_320_;
				if (i_325_ < 1)
					i_325_ = 1;
				else if (i_325_ > 255)
					i_325_ = 255;
				this.anIntArray3300[i_321_] = (i_323_ << 16) + (i_324_ << 8) + i_325_;
			}
		}
	}

	final void method1126(int i, int i_327_, double d) {
		try {
			int i_333_ = -20 / 2;
			int i_334_ = -20 / 2;
			int i_335_ = (int) (Math.sin(d) * 65536.0);
			int i_336_ = (int) (Math.cos(d) * 65536.0);
			i_335_ = i_335_ * 256 >> 8;
			i_336_ = i_336_ * 256 >> 8;
			int i_337_ = (15 << 16) + i_334_ * i_335_ + i_333_ * i_336_;
			int i_338_ = (15 << 16) + i_334_ * i_336_ - i_333_ * i_335_;
			int i_339_ = i + i_327_ * Class38_Sub20_Sub9.anInt2889;
			for (i_327_ = 0; i_327_ < 20; i_327_++) {
				int i_340_ = i_339_;
				int i_341_ = i_337_;
				int i_342_ = i_338_;
				for (i = -20; i < 0; i++) {
					int i_343_ = this.anIntArray3300[(i_341_ >> 16) + (i_342_ >> 16) * this.anInt3297];
					if (i_343_ != 0)
						Class38_Sub20_Sub9.anIntArray2886[i_340_++] = i_343_;
					else
						i_340_++;
					i_341_ += i_336_;
					i_342_ -= i_335_;
				}
				i_337_ += i_335_;
				i_338_ += i_336_;
				i_339_ += Class38_Sub20_Sub9.anInt2889;
			}
		} catch (Exception exception) {
			/* empty */
		}
	}
}
