package com.javatar;/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class17 {
	static RSString aClass19_343;
	static boolean aBool355;
	static int anInt357;
	static RSString aClass19_365 = RSString.createRSString("und die Schaltfl-=che (WSpielkonto erstellen(W am");
	static int anInt367;
	static RSString aClass19_371 = RSString.createRSString("Der Anmelde)2Server ist offline)3");
	static Class17_Sub1 indexSprites;
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array382;
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array391;
	private static RSString aClass19_350;

	static {
		Class17.aBool355 = false;
		Class17.anInt367 = -2;
		Class17.anInt357 = 2;
		Class17.aClass19_350 = RSString.createRSString("Invalid username or password)3");
		Class17.aClass19_343 = Class17.aClass19_350;
	}

	private final boolean aBool373;
	private final boolean aBool375;
	Object[] anObjectArray346;
	int[] anIntArray349;
	int[] anIntArray352;
	int[] anIntArray368;
	int crc;
	private int anInt344;
	private Object[][] anObjectArrayArray356;
	private int[] anIntArray362;
	private Class44[] aClass44Array372;
	private int[] anIntArray378;
	private Class44 aClass44_383;
	private int[][] anIntArrayArray386;
	private int[][] anIntArrayArray389;

	Class17(boolean bool, boolean bool_95_) {
		try {
			aBool373 = bool_95_;
			aBool375 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.<init>(" + bool + ',' + bool_95_ + ')');
		}
	}

	public static void method105(int i) {
		try {
			Class17.aClass38_Sub20_Sub9_Sub3Array391 = null;
			Class17.aClass38_Sub20_Sub9_Sub3Array382 = null;
			Class17.aClass19_371 = null;
			Class17.aClass19_365 = null;
			Class17.aClass19_350 = null;
			if (i > 20) {
				Class17.aClass19_343 = null;
				Class17.indexSprites = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.L(" + i + ')');
		}
	}

	static final void method114(int i, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_) {
		do {
			try {
				int i_57_ = RuntimeException_Sub1.aClass27_3292.method256(i_52_, i_53_, i_55_);
				if (i_57_ != 0) {
					int i_58_ = RuntimeException_Sub1.aClass27_3292.method224(i_52_, i_53_, i_55_, i_57_);
					int i_59_ = i_58_ >> 6 & 0x3;
					int i_60_ = i;
					int i_61_ = i_58_ & 0x1f;
					if (i_57_ > 0)
						i_60_ = i_56_;
					int[] is = Class38_Sub17.aClass38_Sub20_Sub9_Sub3_2194.anIntArray3300;
					int i_62_ = i_57_ >> 14 & 0x7fff;
					int i_63_ = (-(i_55_ * 512) + 52736) * 4 + i_53_ * 4 + 24624;
					ObjectDefinition class38_sub20_sub1 = Class80.method581(-126, i_62_);
					if (class38_sub20_sub1.anInt2473 != -1) {
						Class38_Sub20_Sub9_Sub2 class38_sub20_sub9_sub2 = ItemDefinition.aClass38_Sub20_Sub9_Sub2Array2813[class38_sub20_sub1.anInt2473];
						if (class38_sub20_sub9_sub2 != null) {
							int i_64_ = (-class38_sub20_sub9_sub2.anInt3242 + class38_sub20_sub1.anInt2469 * 4) / 2;
							int i_65_ = (-class38_sub20_sub9_sub2.anInt3246 + class38_sub20_sub1.anInt2480 * 4) / 2;
							class38_sub20_sub9_sub2.method1089(i_64_ + 48 + i_53_ * 4, i_65_ + (-class38_sub20_sub1.anInt2480 + -i_55_ + 104) * 4 + 48);
						}
					} else {
						if (i_61_ == 0 || i_61_ == 2)
							if (i_59_ != 0) {
								if (i_59_ != 1) {
									if (i_59_ == 2) {
										is[i_63_ + 3] = i_60_;
										is[i_63_ + 512 + 3] = i_60_;
										is[i_63_ + 3 + 1024] = i_60_;
										is[i_63_ + 1536 + 3] = i_60_;
									} else if (i_59_ == 3) {
										is[i_63_ + 1536] = i_60_;
										is[i_63_ + 1537] = i_60_;
										is[i_63_ + 1536 + 2] = i_60_;
										is[i_63_ + 3 + 1536] = i_60_;
									}
								} else {
									is[i_63_] = i_60_;
									is[i_63_ + 1] = i_60_;
									is[i_63_ + 2] = i_60_;
									is[i_63_ + 3] = i_60_;
								}
							} else {
								is[i_63_] = i_60_;
								is[i_63_ + 512] = i_60_;
								is[i_63_ + 1024] = i_60_;
								is[i_63_ + 1536] = i_60_;
							}
						if (i_61_ == 3)
							if (i_59_ != 0) {
								if (i_59_ == 1)
									is[i_63_ + 3] = i_60_;
								else if (i_59_ == 2)
									is[i_63_ + 3 + 1536] = i_60_;
								else if (i_59_ == 3)
									is[i_63_ + 1536] = i_60_;
							} else
								is[i_63_] = i_60_;
						if (i_61_ == 2)
							if (i_59_ == 3) {
								is[i_63_] = i_60_;
								is[i_63_ + 512] = i_60_;
								is[i_63_ + 1024] = i_60_;
								is[i_63_ + 1536] = i_60_;
							} else if (i_59_ != 0) {
								if (i_59_ == 1) {
									is[i_63_ + 3] = i_60_;
									is[i_63_ + 515] = i_60_;
									is[i_63_ + 1027] = i_60_;
									is[i_63_ + 3 + 1536] = i_60_;
								} else if (i_59_ == 2) {
									is[i_63_ + 1536] = i_60_;
									is[i_63_ + 1536 + 1] = i_60_;
									is[i_63_ + 1538] = i_60_;
									is[i_63_ + 1539] = i_60_;
								}
							} else {
								is[i_63_] = i_60_;
								is[i_63_ + 1] = i_60_;
								is[i_63_ + 2] = i_60_;
								is[i_63_ + 3] = i_60_;
							}
					}
				}
				i_57_ = RuntimeException_Sub1.aClass27_3292.method236(i_52_, i_53_, i_55_);
				if (i_57_ != 0) {
					int i_66_ = RuntimeException_Sub1.aClass27_3292.method224(i_52_, i_53_, i_55_, i_57_);
					int i_67_ = (i_66_ & 0xdf) >> 6;
					int i_68_ = i_66_ & 0x1f;
					int i_69_ = i_57_ >> 14 & 0x7fff;
					ObjectDefinition class38_sub20_sub1 = Class80.method581(63, i_69_);
					if (class38_sub20_sub1.anInt2473 != -1) {
						Class38_Sub20_Sub9_Sub2 class38_sub20_sub9_sub2 = ItemDefinition.aClass38_Sub20_Sub9_Sub2Array2813[class38_sub20_sub1.anInt2473];
						if (class38_sub20_sub9_sub2 != null) {
							int i_70_ = (-class38_sub20_sub9_sub2.anInt3242 + class38_sub20_sub1.anInt2469 * 4) / 2;
							int i_71_ = (-class38_sub20_sub9_sub2.anInt3246 + class38_sub20_sub1.anInt2480 * 4) / 2;
							class38_sub20_sub9_sub2.method1089(i_53_ * 4 + 48 + i_70_, i_71_ + (-class38_sub20_sub1.anInt2480 + -i_55_ + 104) * 4 + 48);
						}
					} else if (i_68_ == 9) {
						int i_72_ = 15658734;
						int[] is = Class38_Sub17.aClass38_Sub20_Sub9_Sub3_2194.anIntArray3300;
						int i_73_ = i_53_ * 4 + 24624 + (-(i_55_ * 512) + 52736) * 4;
						if (i_57_ > 0)
							i_72_ = 15597568;
						if (i_67_ == 0 || i_67_ == 2) {
							is[i_73_ + 1536] = i_72_;
							is[i_73_ + 1024 + 1] = i_72_;
							is[i_73_ + 512 + 2] = i_72_;
							is[i_73_ + 3] = i_72_;
						} else {
							is[i_73_] = i_72_;
							is[i_73_ + 1 + 512] = i_72_;
							is[i_73_ + 1024 + 2] = i_72_;
							is[i_73_ + 1539] = i_72_;
						}
					}
				}
				i_57_ = RuntimeException_Sub1.aClass27_3292.method237(i_52_, i_53_, i_55_);
				if (i_54_ >= 35) {
					if (i_57_ == 0)
						break;
					int i_74_ = (i_57_ & 0x1fffe200) >> 14;
					ObjectDefinition class38_sub20_sub1 = Class80.method581(-127, i_74_);
					if (class38_sub20_sub1.anInt2473 == -1)
						break;
					Class38_Sub20_Sub9_Sub2 class38_sub20_sub9_sub2 = ItemDefinition.aClass38_Sub20_Sub9_Sub2Array2813[class38_sub20_sub1.anInt2473];
					if (class38_sub20_sub9_sub2 == null)
						break;
					int i_75_ = (-class38_sub20_sub9_sub2.anInt3242 + class38_sub20_sub1.anInt2469 * 4) / 2;
					int i_76_ = (-class38_sub20_sub9_sub2.anInt3246 + class38_sub20_sub1.anInt2480 * 4) / 2;
					class38_sub20_sub9_sub2.method1089(i_75_ + 48 + i_53_ * 4, i_76_ + (-i_55_ - class38_sub20_sub1.anInt2480 + 104) * 4 + 48);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ea.P(" + i + ',' + i_52_ + ',' + i_53_ + ',' + i_54_ + ',' + i_55_ + ',' + i_56_ + ')');
			}
			break;
		} while (false);
	}

	private boolean method101(int i, int i_0_, int[] is) {
		try {
			if (this.anObjectArray346[i_0_] == null)
				return false;
			if (i > -26)
				method115((byte) -39, null);
			int i_1_ = this.anIntArray352[i_0_];
			int[] is_2_ = anIntArrayArray386[i_0_];
			Object[] objects = anObjectArrayArray356[i_0_];
			boolean bool = true;
			for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
				if (objects[is_2_[i_3_]] == null) {
					bool = false;
					break;
				}
			if (bool)
				return true;
			byte[] is_4_;
			if (is == null || is[0] == 0 && is[1] == 0 && is[2] == 0 && is[3] == 0)
				is_4_ = Class50.method400(false, 2, this.anObjectArray346[i_0_]);
			else {
				is_4_ = Class50.method400(true, 2, this.anObjectArray346[i_0_]);
				RS2Buffer class38_sub23 = new RS2Buffer(is_4_);
				class38_sub23.decryptXTEA(class38_sub23.buffer.length, is);
			}
			byte[] is_5_;
			try {
				is_5_ = Sequence.method912(is_4_);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "T3 - " + (is != null) + "," + i_0_ + "," + is_4_.length + "," + Class67.method477((byte) 126, is_4_.length, is_4_) + "," + Class67.method477((byte) 114, is_4_.length - 2, is_4_) + "," + this.anIntArray368[i_0_] + "," + this.crc);
			}
			if (aBool375)
				this.anObjectArray346[i_0_] = null;
			if (i_1_ <= 1) {
				if (!aBool373)
					objects[is_2_[0]] = Class38_Sub18.method697(34, is_5_, false);
				else
					objects[is_2_[0]] = is_5_;
			} else {
				int i_6_ = is_5_.length;
				int i_7_ = is_5_[--i_6_] & 0xff;
				RS2Buffer class38_sub23 = new RS2Buffer(is_5_);
				i_6_ -= i_1_ * i_7_ * 4;
				class38_sub23.pos = i_6_;
				int[] is_8_ = new int[i_1_];
				for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
					int i_10_ = 0;
					for (int i_11_ = 0; i_1_ > i_11_; i_11_++) {
						i_10_ += class38_sub23.readInt(true);
						is_8_[i_11_] += i_10_;
					}
				}
				byte[][] is_12_ = new byte[i_1_][];
				for (int i_13_ = 0; i_1_ > i_13_; i_13_++) {
					is_12_[i_13_] = new byte[is_8_[i_13_]];
					is_8_[i_13_] = 0;
				}
				class38_sub23.pos = i_6_;
				int i_14_ = 0;
				for (int i_15_ = 0; i_7_ > i_15_; i_15_++) {
					int i_16_ = 0;
					for (int i_17_ = 0; i_1_ > i_17_; i_17_++) {
						i_16_ += class38_sub23.readInt(true);
						Class71.method510(is_5_, i_14_, is_12_[i_17_], is_8_[i_17_], i_16_);
						i_14_ += i_16_;
						is_8_[i_17_] += i_16_;
					}
				}
				for (int i_18_ = 0; i_1_ > i_18_; i_18_++)
					if (aBool373)
						objects[is_2_[i_18_]] = is_12_[i_18_];
					else
						objects[is_2_[i_18_]] = Class38_Sub18.method697(-125, is_12_[i_18_], false);
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.Q(" + i + ',' + i_0_ + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	void method102(int i) {
		try {
			if (5 != 5)
				method106(55, -111);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.J(" + i + ',' + 5 + ')');
		}
	}

	final int method103(int i_20_) {
		try {
			if ((byte) 53 != 53)
				aClass44_383 = null;
			return anObjectArrayArray356[i_20_].length;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.U(" + (byte) 53 + ',' + i_20_ + ')');
		}
	}

	final int method104(RSString class19) {
		try {
			if (3 != 3)
				return -16;
			class19 = class19.method173(false);
			return aClass44_383.method370(class19.method150(-44));
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.IA(" + 3 + ',' + (class19 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method106(int i, int i_21_) {
		try {
			if (this.anObjectArray346[i] != null)
				return true;
			method102(i);
			if (this.anObjectArray346[i] != null)
				return true;
			if (i_21_ != 24624)
				Class17.aClass19_371 = null;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.S(" + i + ',' + i_21_ + ')');
		}
	}

	final int method107(int i) {
		try {
			if (i > -47)
				method106(-111, 16);
			return anObjectArrayArray356.length;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.R(" + i + ')');
		}
	}

	void method108(int i_22_) {
		try {
			if ((byte) -99 != -99)
				method122(null, -23, null);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.C(" + (byte) -99 + ',' + i_22_ + ')');
		}
	}

	final byte[] method109(int i, int i_23_, int i_24_) {
		try {
			if (i_24_ > -67)
				return null;
			return method123(103, i, null, i_23_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.HA(" + i + ',' + i_23_ + ',' + i_24_ + ')');
		}
	}

	final int[] method110(int i, int i_25_) {
		try {
			int i_26_ = -73 / ((i_25_ + 45) / 36);
			return anIntArrayArray386[i];
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.T(" + i + ',' + i_25_ + ')');
		}
	}

	final boolean method111(int i) {
		try {
			boolean bool = true;
			for (int i_28_ : anIntArray378) {
				if (this.anObjectArray346[i_28_] == null) {
					method102(i_28_);
					if (this.anObjectArray346[i_28_] == null)
						bool = false;
				}
			}
			int i_29_ = 2 / ((i - 4) / 58);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.JA(" + i + ')');
		}
	}

	final void method112(byte[] is) {
		do {
			try {
				this.crc = Class67.method477((byte) 111, is.length, is);
				RS2Buffer class38_sub23 = new RS2Buffer(Sequence.method912(is));
				int i_30_ = class38_sub23.getUByte();
				if (i_30_ != 5 && i_30_ != 6)
					throw new RuntimeException("Incorrect JS5 protocol number: " + i_30_);
				if (i_30_ >= 6)
					class38_sub23.readInt(true);
				int i_31_ = 0;
				int i_32_ = class38_sub23.getUByte();
				anInt344 = class38_sub23.readUnsignedShortLE();
				anIntArray378 = new int[anInt344];
				if (-14702 != -14702)
					method109(-8, 28, 44);
				int i_33_ = -1;
				for (int i_34_ = 0; anInt344 > i_34_; i_34_++) {
					anIntArray378[i_34_] = i_31_ += class38_sub23.readUnsignedShortLE();
					if (i_33_ < anIntArray378[i_34_])
						i_33_ = anIntArray378[i_34_];
				}
				this.anIntArray368 = new int[i_33_ + 1];
				this.anIntArray349 = new int[i_33_ + 1];
				this.anObjectArray346 = new Object[i_33_ + 1];
				anObjectArrayArray356 = new Object[i_33_ + 1][];
				this.anIntArray352 = new int[i_33_ + 1];
				anIntArrayArray386 = new int[i_33_ + 1][];
				if (i_32_ != 0) {
					anIntArray362 = new int[i_33_ + 1];
					for (int i_35_ = 0; i_35_ < anInt344; i_35_++)
						anIntArray362[anIntArray378[i_35_]] = class38_sub23.readInt(true);
					aClass44_383 = new Class44(anIntArray362);
				}
				for (int i_36_ = 0; anInt344 > i_36_; i_36_++)
					this.anIntArray368[anIntArray378[i_36_]] = class38_sub23.readInt(true);
				for (int i_37_ = 0; anInt344 > i_37_; i_37_++)
					this.anIntArray349[anIntArray378[i_37_]] = class38_sub23.readInt(true);
				for (int i_38_ = 0; i_38_ < anInt344; i_38_++)
					this.anIntArray352[anIntArray378[i_38_]] = class38_sub23.readUnsignedShortLE();
				for (int i_39_ = 0; anInt344 > i_39_; i_39_++) {
					i_31_ = 0;
					int i_40_ = -1;
					int i_41_ = anIntArray378[i_39_];
					int i_42_ = this.anIntArray352[i_41_];
					anIntArrayArray386[i_41_] = new int[i_42_];
					for (int i_43_ = 0; i_42_ > i_43_; i_43_++) {
						int i_44_ = anIntArrayArray386[i_41_][i_43_] = i_31_ += class38_sub23.readUnsignedShortLE();
						if (i_40_ < i_44_)
							i_40_ = i_44_;
					}
					anObjectArrayArray356[i_41_] = new Object[i_40_ + 1];
				}
				if (i_32_ == 0)
					break;
				anIntArrayArray389 = new int[i_33_ + 1][];
				aClass44Array372 = new Class44[i_33_ + 1];
				for (int i_45_ = 0; i_45_ < anInt344; i_45_++) {
					int i_46_ = anIntArray378[i_45_];
					int i_47_ = this.anIntArray352[i_46_];
					anIntArrayArray389[i_46_] = new int[anObjectArrayArray356[i_46_].length];
					for (int i_48_ = 0; i_47_ > i_48_; i_48_++)
						anIntArrayArray389[i_46_][anIntArrayArray386[i_46_][i_48_]] = class38_sub23.readInt(true);
					aClass44Array372[i_46_] = new Class44(anIntArrayArray389[i_46_]);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ea.O(" + (is != null ? "{...}" : "null") + ',' + -14702 + ')');
			}
			break;
		} while (false);
	}

	final boolean method113(RSString class19, RSString class19_49_, int i) {
		try {
			class19 = class19.method173(false);
			class19_49_ = class19_49_.method173(false);
			int i_50_ = aClass44_383.method370(class19.method150(-44));
			if (i > -4)
				Class17.aClass19_343 = null;
			int i_51_ = aClass44Array372[i_50_].method370(class19_49_.method150(-44));
			return method116(i_50_, i_51_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.BA(" + (class19 != null ? "{...}" : "null") + ',' + (class19_49_ != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method115(byte i, RSString class19) {
		do {
			try {
				class19 = class19.method173(false);
				int i_77_ = aClass44_383.method370(class19.method150(-44));
				if (i_77_ >= 0) {
					method108(i_77_);
					if (i == 95)
						break;
					Class17.method105(-54);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ea.N(" + i + ',' + (class19 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	final boolean method116(int i, int i_78_) {
		try {
			if (i < 0 || i >= anObjectArrayArray356.length || anObjectArrayArray356[i] == null || i_78_ < 0 || anObjectArrayArray356[i].length <= i_78_)
				return false;
			if (anObjectArrayArray356[i][i_78_] != null)
				return true;
			if (this.anObjectArray346[i] != null)
				return true;
			method102(i);
			if (!true)
				method101(-20, -29, null);
			return this.anObjectArray346[i] != null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.DA(" + i + ',' + true + ',' + i_78_ + ')');
		}
	}

	final void method117() {
		try {
			if (-4134 != -4134)
				Class17.method105(-120);
			for (int i_79_ = 0; anObjectArrayArray356.length > i_79_; i_79_++)
				if (anObjectArrayArray356[i_79_] != null)
					for (int i_80_ = 0; i_80_ < anObjectArrayArray356[i_79_].length; i_80_++)
						anObjectArrayArray356[i_79_][i_80_] = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.AA(" + -4134 + ')');
		}
	}

	final int method118(RSString class19, int i, boolean bool) {
		try {
			if (!bool)
				Class17.anInt357 = 124;
			class19 = class19.method173(!bool);
			return aClass44Array372[i].method370(class19.method150(-44));
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.GA(" + (class19 != null ? "{...}" : "null") + ',' + i + ',' + bool + ')');
		}
	}

	final byte[] method119(int i) {
		try {
			if (-30895 != -30895)
				Class17.aClass19_343 = null;
			if (anObjectArrayArray356.length == 1)
				return method120(i, -30895 ^ 0x78cf, 0);
			if (anObjectArrayArray356[i].length == 1)
				return method120(0, -30895 + 31014, i);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.V(" + i + ',' + -30895 + ')');
		}
	}

	final byte[] method120(int i, int i_82_, int i_83_) {
		try {
			if (i_83_ < 0 || anObjectArrayArray356.length <= i_83_ || anObjectArrayArray356[i_83_] == null || i < 0 || i >= anObjectArrayArray356[i_83_].length)
				return null;
			if (anObjectArrayArray356[i_83_][i] == null) {
				boolean bool = method101(-28, i_83_, null);
				if (!bool) {
					method102(i_83_);
					bool = method101(-79, i_83_, null);
					if (!bool)
						return null;
				}
			}
			int i_84_ = -1 / ((i_82_ - 56) / 44);
			return Class50.method400(false, 2, anObjectArrayArray356[i_83_][i]);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.FA(" + i + ',' + i_82_ + ',' + i_83_ + ')');
		}
	}

	final byte[] method121(int i, int i_85_) {
		try {
			if (anObjectArrayArray356.length == 1)
				return method109(0, i_85_, -76);
			if (anObjectArrayArray356[i_85_].length == 1)
				return method109(i_85_, 0, -103);
			int i_86_ = 93 % ((72 - i) / 44);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.M(" + i + ',' + i_85_ + ')');
		}
	}

	final byte[] method122(RSString class19, int i, RSString class19_87_) {
		try {
			class19 = class19.method173(false);
			class19_87_ = class19_87_.method173(false);
			int i_88_ = aClass44_383.method370(class19.method150(-44));
			if (i != 2560)
				method124(-113);
			int i_89_ = aClass44Array372[i_88_].method370(class19_87_.method150(-44));
			return method109(i_88_, i_89_, -117);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.EA(" + (class19 != null ? "{...}" : "null") + ',' + i + ',' + (class19_87_ != null ? "{...}" : "null") + ')');
		}
	}

	final byte[] method123(int i, int i_90_, int[] is, int i_91_) {
		try {
			if (i_90_ < 0 || anObjectArrayArray356.length <= i_90_ || anObjectArrayArray356[i_90_] == null || i_91_ < 0 || i_91_ >= anObjectArrayArray356[i_90_].length)
				return null;
			if (anObjectArrayArray356[i_90_][i_91_] == null) {
				boolean bool = method101(-110, i_90_, is);
				if (!bool) {
					method102(i_90_);
					bool = method101(-51, i_90_, is);
					if (!bool)
						return null;
				}
			}
			int i_92_ = 56 / ((i - 5) / 54);
			byte[] is_93_ = Class50.method400(false, 2, anObjectArrayArray356[i_90_][i_91_]);
			if (aBool373)
				anObjectArrayArray356[i_90_][i_91_] = null;
			return is_93_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.W(" + i + ',' + i_90_ + ',' + (is != null ? "{...}" : "null") + ',' + i_91_ + ')');
		}
	}

	final void method124(int i) {
		try {
			if (false)
				method107(-102);
			for (int i_94_ = 0; anObjectArrayArray356[i].length > i_94_; i_94_++)
				anObjectArrayArray356[i][i_94_] = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ea.CA(" + i + ',' + false + ')');
		}
	}
}
