package com.javatar.jagex;/* ItemDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ItemDefinition extends NodeSub {
	static RSString aClass19_2745;
	private short[] modifiedModelColor;
	private int femaleHatId = -1;
	private int anInt2748;
	private int anInt2750;
	int[] anIntArray2751;
	int anInt2753 = 0;
	int anInt2754;
	int modelOffsetY;
	private short[] originalModelColors;
	private int femaleHeight;
	private int anInt2759;
	int anInt2760;
	int anInt2762;
	int modelOffsetX = 0;
	private int anInt2764;
	static Applet_Sub1 anApplet_Sub1_2765 = null;
	int anInt2767;
	static boolean aBool2768;
	static int[] anIntArray2769;
	int anInt2770;
	boolean aBool2771;
	private int maleHatId;
	static int anInt2775;
	int anInt2778;
	private int anInt2779;
	private int anInt2781;
	static int anInt2783;
	private int maleHeadId;
	static Class83 aClass83_2785;
	private int anInt2786;
	int anInt2788;
	RSString[] aClass19Array2789;
	int anInt2790;
	int[] anIntArray2791;
	static RSString aClass19_2792;
	private int anInt2793;
	int anInt2795;
	private int anInt2796;
	static int[] anIntArray2797;
	private int anInt2799;
	private short[] aShortArray2800;
	static int anInt2801;
	private int femaleHeadId;
	int team;
	int anInt2805;
	private static RSString aClass19_2806;
	RSString[] aClass19Array2807;
	RSString aClass19_2808;
	private int maleHeight;
	private short[] aShortArray2810;
	private static RSString aClass19_2811;
	static RSString aClass19_2812;
	static Class38_Sub20_Sub9_Sub2[] aClass38_Sub20_Sub9_Sub2Array2813;
	static RSString aClass19_2814;
	private static RSString aClass19_2815;
	static RSString aClass19_2816;
	static byte[] aByteArray2817;
	static RSString aClass19_2818;

	final boolean dialogueModelsCached(byte i, boolean female) {
		try {
			int head = maleHeadId;
			int hat = maleHatId;
			if (female) {
				hat = femaleHatId;
				head = femaleHeadId;
			}
			if (head == -1)
				return true;
			boolean cached = true;
			if (i != -114)
				ItemDefinition.method935((byte) 34);
			if (!Class20.itemModelFetcher.method116(head, true, 0))
				cached = false;
			if (hat != -1 && !Class20.itemModelFetcher.method116(hat, true, 0))
				cached = false;
			return cached;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.I(" + i + ','
					+ female + ')');
		}
	}

	static final void method923(int i, boolean bool) {
		try {
			int i_3_ = 0;
			if (i == 14612)
				for (/**/; Class4.anInt87 > i_3_; i_3_++) {
					NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[Class38_Sub10_Sub1.anIntArray2652[i_3_]];
					int i_4_ = (Class38_Sub10_Sub1.anIntArray2652[i_3_] << -1249841778) + 536870912;
					if (class38_sub20_sub3_sub7_sub1 != null
							&& class38_sub20_sub3_sub7_sub1
									.isVisible()
							&& bool != !class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.aBool2744
							&& class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543
									.method913(-27678)) {
						int i_5_ = ((Entity) class38_sub20_sub3_sub7_sub1).anInt3493 >> -208374009;
						int i_6_ = ((Entity) class38_sub20_sub3_sub7_sub1).anInt3444 >> 1486938695;
						if (i_5_ >= 0 && i_5_ < 104 && i_6_ >= 0 && i_6_ < 104) {
							if (((Entity) class38_sub20_sub3_sub7_sub1).anInt3457 == 1
									&& (((Entity) class38_sub20_sub3_sub7_sub1).anInt3493 & 0x7f) == 64
									&& (((Entity) class38_sub20_sub3_sub7_sub1).anInt3444 & 0x7f) == 64) {
								if (Class38_Sub6.anIntArrayArray1902[i_5_][i_6_] == RuntimeException_Sub1.anInt3293)
									continue;
								Class38_Sub6.anIntArrayArray1902[i_5_][i_6_] = RuntimeException_Sub1.anInt3293;
							}
							if (!class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.aBool2689)
								i_4_ -= -2147483648;
							RuntimeException_Sub1.aClass27_3292
									.method249(
											Client.height,
											((Entity) class38_sub20_sub3_sub7_sub1).anInt3493,
											((Entity) class38_sub20_sub3_sub7_sub1).anInt3444,
											Class35.method317(
													-5736,
													Client.height,
													((Entity) class38_sub20_sub3_sub7_sub1).anInt3457
															* 64
															- 64
															+ ((Entity) class38_sub20_sub3_sub7_sub1).anInt3493,
													(((Entity) class38_sub20_sub3_sub7_sub1).anInt3457 - 1)
															* 64
															+ ((Entity) class38_sub20_sub3_sub7_sub1).anInt3444),
											(((Entity) class38_sub20_sub3_sub7_sub1).anInt3457 - 1) * 64 + 60,
											class38_sub20_sub3_sub7_sub1,
											((Entity) class38_sub20_sub3_sub7_sub1).anInt3491,
											i_4_,
											((Entity) class38_sub20_sub3_sub7_sub1).aBool3481);
						}
					}
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.J(" + i + ','
					+ bool + ')');
		}
	}

	final Model method924(int i, boolean female) {
		try {
			if (i != -19319)
				return null;
			int mainWearModel = anInt2764;
			int secondWearModel = anInt2796;
			int thirdWearModel = anInt2759;
			if (female) {
				secondWearModel = anInt2793;
				thirdWearModel = anInt2799;
				mainWearModel = anInt2779;
			}
			if (mainWearModel == -1)
				return null;
			Model model = Model.get(Class20.itemModelFetcher, mainWearModel, 0);
			if (secondWearModel != -1) {
				Model model_2 = Model.get(Class20.itemModelFetcher,
						secondWearModel, 0);
				if (thirdWearModel != -1) {
					Model model_3 = Model.get(Class20.itemModelFetcher,
							thirdWearModel, 0);
					Model[] models = { model, model_2, model_3 };
					model = new Model(models, 3);
				} else {
					Model[] models = { model, model_2 };
					model = new Model(models, 2);
				}
			}
			if (!female && maleHeight != 0)
				model.move(0, maleHeight, 0);
			if (female && femaleHeight != 0)
				model.move(0, femaleHeight, 0);
			if (aShortArray2800 != null)
				for (int i_12_ = 0; i_12_ < aShortArray2800.length; i_12_++)
					model.method1128(aShortArray2800[i_12_],
							aShortArray2810[i_12_]);
			if (originalModelColors != null)
				for (int i_13_ = 0; originalModelColors.length > i_13_; i_13_++)
					model.method1148(originalModelColors[i_13_],
							modifiedModelColor[i_13_]);
			return model;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.M(" + i + ','
					+ female + ')');
		}
	}

	final Class38_Sub20_Sub3_Sub1 method925(int i, int i_14_) {
		try {
			if (this.anIntArray2791 != null && i > 1) {
				int i_15_ = -1;
				for (int i_16_ = 0; i_16_ < 10; i_16_++)
					if (this.anIntArray2751[i_16_] <= i
							&& this.anIntArray2751[i_16_] != 0)
						i_15_ = this.anIntArray2791[i_16_];
				if (i_15_ != -1)
					return Node.forId(i_15_, 37).method925(1, i_14_);
			}
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = (Class38_Sub20_Sub3_Sub1) Class2.aClass83_29
					.method591(-28825, this.anInt2778);
			if (class38_sub20_sub3_sub1 != null)
				return class38_sub20_sub3_sub1;
			Model class38_sub20_sub3_sub3 = Model.get(Class20.itemModelFetcher,
					anInt2786, i_14_);
			if (class38_sub20_sub3_sub3 == null)
				return null;
			if (anInt2750 != 128 || anInt2781 != 128 || anInt2748 != 128)
				class38_sub20_sub3_sub3.method1150(anInt2750, anInt2781,
						anInt2748);
			if (aShortArray2800 != null)
				for (int i_17_ = 0; i_17_ < aShortArray2800.length; i_17_++)
					class38_sub20_sub3_sub3.method1128(aShortArray2800[i_17_],
							aShortArray2810[i_17_]);
			if (originalModelColors != null)
				for (int i_18_ = 0; i_18_ < originalModelColors.length; i_18_++)
					class38_sub20_sub3_sub3.method1148(
							originalModelColors[i_18_],
							modifiedModelColor[i_18_]);
			class38_sub20_sub3_sub1 = class38_sub20_sub3_sub3.method1142(
					64 + this.anInt2760, 768 + this.anInt2762, -50, -10, -50);
			class38_sub20_sub3_sub1.aBool3141 = true;
			Class2.aClass83_29.method590(this.anInt2778, (byte) -122,
					class38_sub20_sub3_sub1);
			return class38_sub20_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.O(" + i + ','
					+ i_14_ + ')');
		}
	}

	final ItemDefinition method926(int i_19_) {
			if (this.anIntArray2791 != null && i_19_ > 1) {
				int i_20_ = -1;
				for (int i_21_ = 0; i_21_ < 10; i_21_++)
					if (i_19_ >= this.anIntArray2751[i_21_]
							&& this.anIntArray2751[i_21_] != 0)
						i_20_ = this.anIntArray2791[i_21_];
				if (i_20_ != -1)
					return Node.forId(i_20_, 94);
			}
			return this;
	}

	final void method927(byte i) {
		try {
			int i_22_ = -18 / ((i - 36) / 52);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.N(" + i + ')');
		}
	}

	final Model method928(boolean female) {
		int head = maleHeadId;
		int hat = maleHatId;
		if (female) {
			hat = femaleHatId;
			head = femaleHeadId;
		}
		if (head == -1)
			return null;
		Model headModel = Model.get(Class20.itemModelFetcher, head, 0);
		if (hat != -1) {
			Model hatModel = Model.get(Class20.itemModelFetcher, hat, 0);
			Model[] models = { headModel, hatModel };
			headModel = new Model(models, 2);
		}
		if (aShortArray2800 != null)
			for (int i_26_ = 0; aShortArray2800.length > i_26_; i_26_++)
				headModel.method1128(aShortArray2800[i_26_],
						aShortArray2810[i_26_]);
		if (originalModelColors != null)
			for (int id = 0; id < originalModelColors.length; id++)
				headModel.method1148(originalModelColors[id],
						modifiedModelColor[id]);
		return headModel;
	}

	static final Class38_Sub20_Sub9_Sub3[] method929(RSString class19,
			Class17 class17, boolean bool, RSString class19_28_) {
		try {
			int i = class17.method104(3, class19);
			int i_29_ = class17.method118(class19_28_, i, bool);
			return Class44.method366((byte) 123, i_29_, class17, i);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.R("
					+ (class19 != null ? "{...}" : "null") + ','
					+ (class17 != null ? "{...}" : "null") + ',' + bool + ','
					+ (class19_28_ != null ? "{...}" : "null") + ')');
		}
	}

	final void readValues(RS2Buffer stream) {
		for (;;) {
			int opcode = stream.getUByte();
			if (opcode == 0)
				break;
			readValues((byte) -26, stream, opcode);
		}
	}

	static final void method931(int i, int i_31_, int i_32_, int i_33_,
			int i_34_) {
		try {
			int i_35_ = 113 % ((41 - i) / 54);
			for (int i_36_ = 0; Class38_Sub20_Sub11.anInt2957 > i_36_; i_36_++)
				if (Class38_Sub8.anIntArray2045[i_36_]
						+ Class22.anIntArray536[i_36_] > i_31_
						&& i_33_ + i_31_ > Class38_Sub8.anIntArray2045[i_36_]
						&& Class67.anIntArray1387[i_36_]
								+ Class64.anIntArray1356[i_36_] > i_32_
						&& Class67.anIntArray1387[i_36_] < i_32_ + i_34_)
					Class32.aBoolArray768[i_36_] = true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.L(" + i + ','
					+ i_31_ + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ')');
		}
	}

	private final void readValues(byte i, RS2Buffer stream, int opcode) {
		try {
			if (i >= -2)
				ItemDefinition.aClass19_2806 = null;
			if (opcode == 1)
				anInt2786 = stream.getUShort();
			else if (opcode == 2)
				this.aClass19_2808 = stream.getUShort(1347418632);
			else if (opcode == 4)
				this.anInt2770 = stream.getUShort();
			else if (opcode != 5) {
				if (opcode == 6)
					this.anInt2795 = stream.getUShort();
				else if (opcode == 7) {
					this.modelOffsetX = stream.getUShort();
					if (this.modelOffsetX > 32767)
						this.modelOffsetX -= 65536;
				} else if (opcode == 8) {
					this.modelOffsetY = stream.getUShort();
					if (this.modelOffsetY > 32767)
						this.modelOffsetY -= 65536;
				} else if (opcode == 11)
					this.anInt2788 = 1;
				else if (opcode != 12) {
					if (opcode != 16) {
						if (opcode != 23) {
							if (opcode != 24) {
								if (opcode != 25) {
									if (opcode == 26)
										anInt2793 = stream.getUShort();
									else if (opcode < 30 || opcode >= 35) {
										if (opcode >= 35 && opcode < 40)
											this.aClass19Array2807[opcode - 35] = stream
													.getUShort(1347418632);
										else if (opcode != 40) {
											if (opcode == 41) {
												int len = stream.getUByte();
												modifiedModelColor = new short[len];
												originalModelColors = new short[len];
												for (int i_39_ = 0; i_39_ < len; i_39_++) {
													originalModelColors[i_39_] = (short) stream
															.getUShort();
													modifiedModelColor[i_39_] = (short) stream
															.getUShort();
												}
											} else if (opcode == 78)
												anInt2759 = stream.getUShort();
											else if (opcode != 79) {
												if (opcode != 90) {
													if (opcode == 91)
														femaleHeadId = stream
																.getUShort();
													else if (opcode == 92)
														maleHatId = stream
																.getUShort();
													else if (opcode == 93)
														femaleHatId = stream
																.getUShort();
													else if (opcode == 95)
														this.anInt2753 = stream
																.getUShort();
													else if (opcode != 97) {
														if (opcode == 98)
															this.anInt2767 = stream
																	.getUShort();
														else if (opcode >= 100
																&& opcode < 110) {
															if (this.anIntArray2791 == null) {
																this.anIntArray2751 = new int[10];
																this.anIntArray2791 = new int[10];
															}
															this.anIntArray2791[opcode - 100] = stream
																	.getUShort();
															this.anIntArray2751[opcode - 100] = stream
																	.getUShort();
														} else if (opcode == 110)
															anInt2750 = stream
																	.getUShort();
														else if (opcode == 111)
															anInt2781 = stream
																	.getUShort();
														else if (opcode != 112) {
															if (opcode == 113)
																this.anInt2760 = stream
																		.method765((byte) 102);
															else if (opcode != 114) {
																if (opcode == 115)
																	this.team = stream
																			.getUByte();
															} else
																this.anInt2762 = stream
																		.method765((byte) 108) * 5;
														} else
															anInt2748 = stream
																	.getUShort();
													} else
														this.anInt2790 = stream
																.getUShort();
												} else
													maleHeadId = stream
															.getUShort();
											} else
												anInt2799 = stream.getUShort();
										} else {
											int i_40_ = stream.getUByte();
											aShortArray2810 = new short[i_40_];
											aShortArray2800 = new short[i_40_];
											for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
												aShortArray2800[i_41_] = (short) stream
														.getUShort();
												aShortArray2810[i_41_] = (short) stream
														.getUShort();
											}
										}
									} else {
										this.aClass19Array2789[opcode - 30] = stream
												.getUShort(1347418632);
										if (this.aClass19Array2789[opcode - 30]
												.method174(
														(byte) 119,
														RuntimeException_Sub1.aClass19_3290))
											this.aClass19Array2789[opcode - 30] = null;
									}
								} else {
									anInt2779 = stream.getUShort();
									femaleHeight = stream.getUByte();
								}
							} else
								anInt2796 = stream.getUShort();
						} else {
							anInt2764 = stream.getUShort();
							maleHeight = stream.getUByte();
						}
					} else
						this.aBool2771 = true;
				} else
					this.anInt2754 = stream.method759(true);
			} else
				this.anInt2805 = stream.getUShort();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.K(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + opcode + ')');
		}
	}

	static final int method933(int i, int i_42_, byte i_43_) {
		try {
			if (i_43_ != 75)
				ItemDefinition.method935((byte) -21);
			long l = (i_42_ << -699290960) + i;
			if (Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564 == null
					|| l != ((Node) Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564).aLong898)
				return 0;
			return Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.pos
					* 99
					/ (Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.buffer.length - Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564.aByte2542)
					+ 1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.H(" + i + ','
					+ i_42_ + ',' + i_43_ + ')');
		}
	}

	final boolean method934(boolean bool, int i) {
		try {
			if (i != -28038)
				return true;
			int i_44_ = anInt2764;
			int i_45_ = anInt2796;
			int i_46_ = anInt2759;
			if (bool) {
				i_46_ = anInt2799;
				i_45_ = anInt2793;
				i_44_ = anInt2779;
			}
			if (i_44_ == -1)
				return true;
			boolean bool_47_ = true;
			if (!Class20.itemModelFetcher.method116(i_44_, true, 0))
				bool_47_ = false;
			if (i_45_ != -1
					&& !Class20.itemModelFetcher.method116(i_45_, true, 0))
				bool_47_ = false;
			if (i_46_ != -1
					&& !Class20.itemModelFetcher.method116(i_46_, true, 0))
				bool_47_ = false;
			return bool_47_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.S(" + bool + ','
					+ i + ')');
		}
	}

	public static void method935(byte i) {
		try {
			ItemDefinition.aClass83_2785 = null;
			if (i < 99)
				ItemDefinition.aClass19_2792 = null;
			ItemDefinition.aClass19_2811 = null;
			ItemDefinition.aClass19_2806 = null;
			ItemDefinition.aClass19_2814 = null;
			ItemDefinition.aClass19_2818 = null;
			ItemDefinition.aClass38_Sub20_Sub9_Sub2Array2813 = null;
			ItemDefinition.aClass19_2745 = null;
			ItemDefinition.aByteArray2817 = null;
			ItemDefinition.aClass19_2812 = null;
			ItemDefinition.aClass19_2816 = null;
			ItemDefinition.aClass19_2792 = null;
			ItemDefinition.aClass19_2815 = null;
			ItemDefinition.anIntArray2769 = null;
			ItemDefinition.anIntArray2797 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.F(" + i + ')');
		}
	}

	final void method936(ItemDefinition class38_sub20_sub6_48_,
			ItemDefinition class38_sub20_sub6_49_, int i) {
		try {
			this.anInt2753 = class38_sub20_sub6_49_.anInt2753;
			aShortArray2800 = class38_sub20_sub6_49_.aShortArray2800;
			this.anInt2754 = class38_sub20_sub6_48_.anInt2754;
			this.aBool2771 = class38_sub20_sub6_48_.aBool2771;
			this.aClass19_2808 = class38_sub20_sub6_48_.aClass19_2808;
			originalModelColors = class38_sub20_sub6_49_.originalModelColors;
			this.anInt2788 = 1;
			if (i > -104)
				dialogueModelsCached((byte) -29, true);
			this.modelOffsetY = class38_sub20_sub6_49_.modelOffsetY;
			anInt2786 = class38_sub20_sub6_49_.anInt2786;
			this.anInt2770 = class38_sub20_sub6_49_.anInt2770;
			this.anInt2795 = class38_sub20_sub6_49_.anInt2795;
			this.anInt2805 = class38_sub20_sub6_49_.anInt2805;
			aShortArray2810 = class38_sub20_sub6_49_.aShortArray2810;
			modifiedModelColor = class38_sub20_sub6_49_.modifiedModelColor;
			this.modelOffsetX = class38_sub20_sub6_49_.modelOffsetX;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.G("
					+ (class38_sub20_sub6_48_ != null ? "{...}" : "null") + ','
					+ (class38_sub20_sub6_49_ != null ? "{...}" : "null") + ','
					+ i + ')');
		}
	}

	final Model method937(int i, int i_50_) {
		try {
			if (i_50_ <= 82)
				anInt2781 = -7;
			if (this.anIntArray2791 != null && i > 1) {
				int i_51_ = -1;
				for (int i_52_ = 0; i_52_ < 10; i_52_++)
					if (i >= this.anIntArray2751[i_52_]
							&& this.anIntArray2751[i_52_] != 0)
						i_51_ = this.anIntArray2791[i_52_];
				if (i_51_ != -1)
					return Node.forId(i_51_, 119).method937(1, 105);
			}
			Model class38_sub20_sub3_sub3 = Model.get(Class20.itemModelFetcher,
					anInt2786, 0);
			if (class38_sub20_sub3_sub3 == null)
				return null;
			if (anInt2750 != 128 || anInt2781 != 128 || anInt2748 != 128)
				class38_sub20_sub3_sub3.method1150(anInt2750, anInt2781,
						anInt2748);
			if (aShortArray2800 != null)
				for (int i_53_ = 0; i_53_ < aShortArray2800.length; i_53_++)
					class38_sub20_sub3_sub3.method1128(aShortArray2800[i_53_],
							aShortArray2810[i_53_]);
			if (originalModelColors != null)
				for (int i_54_ = 0; originalModelColors.length > i_54_; i_54_++)
					class38_sub20_sub3_sub3.method1148(
							originalModelColors[i_54_],
							modifiedModelColor[i_54_]);
			return class38_sub20_sub3_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "j.Q(" + i + ','
					+ i_50_ + ')');
		}
	}

	public ItemDefinition() {
		this.anInt2762 = 0;
		anInt2748 = 128;
		this.aBool2771 = false;
		anInt2781 = 128;
		anInt2764 = -1;
		femaleHeight = 0;
		this.anInt2790 = -1;
		this.anInt2770 = 2000;
		maleHeadId = -1;
		anInt2750 = 128;
		this.anInt2767 = -1;
		this.anInt2795 = 0;
		anInt2759 = -1;
		anInt2779 = -1;
		this.anInt2754 = 1;
		femaleHeadId = -1;
		this.team = 0;
		this.aClass19Array2789 = new RSString[] { null, null,
				Class22.aClass19_531, null, null };
		anInt2796 = -1;
		anInt2799 = -1;
		anInt2793 = -1;
		this.anInt2760 = 0;
		maleHatId = -1;
		this.modelOffsetY = 0;
		this.anInt2788 = 0;
		this.aClass19Array2807 = new RSString[] { null, null, null, null,
				Entity.aClass19_3485 };
		this.aClass19_2808 = Class38_Sub20_Sub3_Sub2.aClass19_3271;
		maleHeight = 0;
		this.anInt2805 = 0;
	}

	static {
		ItemDefinition.aClass19_2745 = RSString.createRSString("Schlie-8en");
		ItemDefinition.anInt2783 = 0;
		ItemDefinition.anInt2775 = 0;
		ItemDefinition.anIntArray2797 = new int[2048];
		ItemDefinition.anIntArray2769 = new int[] { 16776960, 16711680, 65280,
				65535, 16711935, 16777215 };
		ItemDefinition.aBool2768 = false;
		ItemDefinition.aClass19_2806 = RSString
				.createRSString("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");
		ItemDefinition.aClass19_2792 = ItemDefinition.aClass19_2806;
		ItemDefinition.aClass83_2785 = new Class83(64);
		ItemDefinition.aClass19_2811 = RSString.createRSString("wave:");
		ItemDefinition.aByteArray2817 = new byte[520];
		ItemDefinition.aClass19_2812 = ItemDefinition.aClass19_2811;
		ItemDefinition.aClass19_2814 = RSString
				.createRSString("auf einer freien Welt zu spielen)3");
		ItemDefinition.aClass19_2818 = ItemDefinition.aClass19_2811;
		ItemDefinition.aClass19_2815 = RSString.createRSString("level)2");
		ItemDefinition.aClass19_2816 = ItemDefinition.aClass19_2815;
	}
}
