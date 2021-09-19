package com.javatar.jagex;/* ObjectDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjectDefinition extends NodeSub {
	int anInt2439;
	int anInt2440;
	private boolean aBool2441;
	static int[] anIntArray2442 = new int[50];
	private short[] aShortArray2444;
	boolean aBool2445;
	private int[] types;
	static RSString aClass19_2449;
	private short[] aShortArray2450;
	boolean aBool2451 = false;
	private int anInt2452;
	static int anInt2455 = 1;
	int anInt2456;
	boolean aBool2457;
	private short[] aShortArray2458;
	private static RSString aClass19_2459;
	RSString aClass19_2460;
	static Class65 aClass65_2461;
	private int scaleX;
	static int anInt2464 = 0;
	int[] anIntArray2465;
	boolean aBool2466;
	static int anInt2467;
	int anInt2468;
	int anInt2469;
	private int anInt2470;
	int anInt2472;
	int anInt2473;
	private int anInt2478;
	private int anInt2479;
	int anInt2480;
	static RSString aClass19_2481;
	int anInt2482;
	private int anInt2483;
	static RSString aClass19_2484 = RSString.createRSString("Gegenstand f-Ur Mitglieder");
	private int scaleY;
	int anInt2487;
	private int anInt2489;
	private int[] models;
	int anInt2492;
	private int anInt2493;
	static long aLong2495;
	static int anInt2496;
	int anInt2497;
	int[] anIntArray2498;
	int anInt2499;
	boolean aBool2500;
	private int anInt2501;
	RSString[] actions;
	int anInt2503;
	private boolean aBool2504;
	private static RSString aClass19_2505;
	int anInt2506;
	private short[] aShortArray2508;
	private int scaleZ;

	final boolean method794(byte i) {
		try {
			int i_0_ = -98 / ((i - 76) / 40);
			if (this.anIntArray2498 == null) {
				if (this.anInt2503 == -1 && this.anIntArray2465 == null)
					return false;
				return true;
			}
			for (int i_1_ = 0; i_1_ < this.anIntArray2498.length; i_1_++)
				if (this.anIntArray2498[i_1_] != -1) {
					ObjectDefinition class38_sub20_sub1_2_ = Class80.method581(19, this.anIntArray2498[i_1_]);
					if (class38_sub20_sub1_2_.anInt2503 != -1 || class38_sub20_sub1_2_.anIntArray2465 != null)
						return true;
				}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.G(" + i + ')');
		}
	}

	final Class38_Sub20_Sub3_Sub1 method795(int i, int i_3_, int i_4_, int i_5_, int[][] is, int i_6_, int i_7_) {
		try {
			if (i_5_ != -12818)
				return null;
			long l;
			if (types == null)
				l = i_6_ + (this.anInt2468 << -1008477846);
			else
				l = i_6_ + (i_3_ << -1680096605) + (this.anInt2468 << -1066599286);
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = (Class38_Sub20_Sub3_Sub1) Class47.aClass83_1053.method591(-28825, l);
			if (class38_sub20_sub3_sub1 == null) {
				Model class38_sub20_sub3_sub3 = method796(i_6_, true, i_3_);
				if (class38_sub20_sub3_sub3 == null)
					return null;
				class38_sub20_sub3_sub1 = class38_sub20_sub3_sub3.method1142(anInt2478 + 64, anInt2489 * 5 + 768, -50, -10, -50);
				Class47.aClass83_1053.method590(l, (byte) -122, class38_sub20_sub3_sub1);
			}
			if (anInt2493 >= 0)
				class38_sub20_sub3_sub1 = class38_sub20_sub3_sub1.method1047(is, i, i_7_, i_4_, true, anInt2493);
			return class38_sub20_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.P(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + (is != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ')');
		}
	}

	private final Model method796(int i, boolean bool, int i_8_) {
		try {
			Model class38_sub20_sub3_sub3 = null;
			if (types != null) {
				int i_9_ = -1;
				for (int i_10_ = 0; types.length > i_10_; i_10_++)
					if (types[i_10_] == i_8_) {
						i_9_ = i_10_;
						break;
					}
				if (i_9_ == -1)
					return null;
				int i_11_ = models[i_9_];
				boolean bool_12_ = i > 3 ^ aBool2504;
				if (bool_12_)
					i_11_ += 65536;
				class38_sub20_sub3_sub3 = (Model) Entity.aClass83_3466.method591(-28825, i_11_);
				if (class38_sub20_sub3_sub3 == null) {
					class38_sub20_sub3_sub3 = Model.get(Class72.aClass17_1408, i_11_ & 0xffff, 0);
					if (class38_sub20_sub3_sub3 == null)
						return null;
					if (bool_12_)
						class38_sub20_sub3_sub3.method1139();
					Entity.aClass83_3466.method590(i_11_, (byte) -120, class38_sub20_sub3_sub3);
				}
			} else {
				if (i_8_ != 10)
					return null;
				if (models == null)
					return null;
				boolean bool_13_ = aBool2504;
				if (i_8_ == 2 && i > 3)
					bool_13_ = !bool_13_;
				int i_14_ = models.length;
				for (int i_15_ = 0; i_14_ > i_15_; i_15_++) {
					int i_16_ = models[i_15_];
					if (bool_13_)
						i_16_ += 65536;
					class38_sub20_sub3_sub3 = (Model) Entity.aClass83_3466.method591(-28825, i_16_);
					if (class38_sub20_sub3_sub3 == null) {
						class38_sub20_sub3_sub3 = Model.get(Class72.aClass17_1408, i_16_ & 0xffff, 0);
						if (class38_sub20_sub3_sub3 == null)
							return null;
						if (bool_13_)
							class38_sub20_sub3_sub3.method1139();
						Entity.aClass83_3466.method590(i_16_, (byte) -127, class38_sub20_sub3_sub3);
					}
					if (i_14_ > 1)
						Class47.aClass38_Sub20_Sub3_Sub3Array1054[i_15_] = class38_sub20_sub3_sub3;
				}
				if (i_14_ > 1)
					class38_sub20_sub3_sub3 = new Model(Class47.aClass38_Sub20_Sub3_Sub3Array1054, i_14_);
			}
			boolean bool_17_;
			if (scaleX != 128 || scaleY != 128 || scaleZ != 128)
				bool_17_ = true;
			else
				bool_17_ = false;
			boolean bool_18_;
			if (anInt2452 != 0 || anInt2470 != 0 || anInt2479 != 0)
				bool_18_ = true;
			else
				bool_18_ = false;
			Model class38_sub20_sub3_sub3_19_ = new Model(class38_sub20_sub3_sub3, i == 0 && !bool_17_ && !bool_18_, aShortArray2450 == null, aShortArray2458 == null, bool);
			if (i_8_ == 4 && i > 3) {
				class38_sub20_sub3_sub3_19_.method1146(256);
				class38_sub20_sub3_sub3_19_.move(45, 0, -45);
			}
			i &= 0x3;
			if (i != 1) {
				if (i != 2) {
					if (i == 3)
						class38_sub20_sub3_sub3_19_.method1133();
				} else
					class38_sub20_sub3_sub3_19_.method1137();
			} else
				class38_sub20_sub3_sub3_19_.method1132();
			if (aShortArray2450 != null)
				for (int i_20_ = 0; aShortArray2450.length > i_20_; i_20_++)
					class38_sub20_sub3_sub3_19_.method1128(aShortArray2450[i_20_], aShortArray2508[i_20_]);
			if (aShortArray2458 != null)
				for (int i_21_ = 0; i_21_ < aShortArray2458.length; i_21_++)
					class38_sub20_sub3_sub3_19_.method1148(aShortArray2458[i_21_], aShortArray2444[i_21_]);
			if (bool_17_)
				class38_sub20_sub3_sub3_19_.method1150(scaleX, scaleY, scaleZ);
			if (bool_18_)
				class38_sub20_sub3_sub3_19_.move(anInt2452, anInt2470, anInt2479);
			return class38_sub20_sub3_sub3_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.Q(" + i + ',' + bool + ',' + i_8_ + ')');
		}
	}

	final boolean method797(int i) {
		try {
			if (models == null)
				return true;
			boolean bool = true;
			if (i != 65535)
				return true;
			for (int i_22_ = 0; i_22_ < models.length; i_22_++)
				bool &= Class72.aClass17_1408.method116(models[i_22_] & 0xffff, true, 0);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.J(" + i + ')');
		}
	}

	final Class38_Sub20_Sub3_Sub1 method798(boolean bool, Class38_Sub20_Sub4 class38_sub20_sub4, int i, int i_23_, int[][] is, int i_24_, int i_25_, int i_26_, int i_27_) {
		try {
			long l;
			if (types == null)
				l = (this.anInt2468 << 499755882) + i_27_;
			else
				l = (i_23_ << -1240433533) + (this.anInt2468 << -592286998) + i_27_;
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = (Class38_Sub20_Sub3_Sub1) Class47.aClass83_1053.method591(-28825, l);
			if (class38_sub20_sub3_sub1 == null) {
				Model class38_sub20_sub3_sub3 = method796(i_27_, true, i_23_);
				if (class38_sub20_sub3_sub3 == null)
					return null;
				class38_sub20_sub3_sub1 = class38_sub20_sub3_sub3.method1142(anInt2478 + 64, anInt2489 * 5 + 768, -50, -10, -50);
				Class47.aClass83_1053.method590(l, (byte) -125, class38_sub20_sub3_sub1);
			}
			if (class38_sub20_sub4 == null && anInt2493 == -1)
				return class38_sub20_sub3_sub1;
			if (class38_sub20_sub4 == null)
				class38_sub20_sub3_sub1 = class38_sub20_sub3_sub1.method1038(true);
			else
				class38_sub20_sub3_sub1 = class38_sub20_sub4.method825(i_27_, i_25_, class38_sub20_sub3_sub1, (byte) -124);
			if (bool)
				method805((byte) -32);
			if (anInt2493 >= 0)
				class38_sub20_sub3_sub1 = class38_sub20_sub3_sub1.method1047(is, i_24_, i_26_, i, false, anInt2493);
			return class38_sub20_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.R(" + bool + ',' + (class38_sub20_sub4 != null ? "{...}" : "null") + ',' + i + ',' + i_23_ + ',' + (is != null ? "{...}" : "null") + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ')');
		}
	}

	private final void readValues(byte i, RS2Buffer Stream, int i_28_) {
		try {
			if (i == 125)
				if (i_28_ == 1) {
					int size = Stream.readUnsignedByte();
					if (size > 0)
						if (models == null || Class38_Sub9.objectLowMem) {
							models = new int[size];
							types = new int[size];
							for (int id = 0; id < size; id++) {
								models[id] = Stream.readUnsignedShort();
								types[id] = Stream.readUnsignedByte();
							}
						} else
							Stream.pos += size * 3;
				} else if (i_28_ != 2) {
					if (i_28_ != 5) {
						if (i_28_ != 14) {
							if (i_28_ == 15)
								this.anInt2480 = Stream.readUnsignedByte();
							else if (i_28_ == 17) {
								this.aBool2466 = false;
								this.anInt2482 = 0;
							} else if (i_28_ != 18) {
								if (i_28_ == 19)
									this.anInt2440 = Stream.readUnsignedByte();
								else if (i_28_ != 21) {
									if (i_28_ == 22)
										aBool2441 = true;
									else if (i_28_ == 23)
										this.aBool2457 = true;
									else if (i_28_ == 24) {
										this.anInt2472 = Stream.readUnsignedShort();
										if (this.anInt2472 == 65535)
											this.anInt2472 = -1;
									} else if (i_28_ != 27) {
										if (i_28_ != 28) {
											if (i_28_ != 29) {
												if (i_28_ != 39) {
													if (i_28_ >= 30 && i_28_ < 35) {
														this.actions[i_28_ - 30] = Stream.getUShort(1347418632);
														if (this.actions[i_28_ - 30].method174((byte) 112, RuntimeException_Sub1.aClass19_3290))
															this.actions[i_28_ - 30] = null;
													} else if (i_28_ != 40) {
														if (i_28_ == 41) {
															int i_31_ = Stream.readUnsignedByte();
															aShortArray2444 = new short[i_31_];
															aShortArray2458 = new short[i_31_];
															for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
																aShortArray2458[i_32_] = (short) Stream.readUnsignedShort();
																aShortArray2444[i_32_] = (short) Stream.readUnsignedShort();
															}
														} else if (i_28_ != 60) {
															if (i_28_ != 62) {
																if (i_28_ != 64) {
																	if (i_28_ != 65) {
																		if (i_28_ != 66) {
																			if (i_28_ == 67)
																				scaleZ = Stream.readUnsignedShort();
																			else if (i_28_ == 68)
																				this.anInt2473 = Stream.readUnsignedShort();
																			else if (i_28_ != 69) {
																				if (i_28_ == 70)
																					anInt2452 = Stream.method772(false);
																				else if (i_28_ != 71) {
																					if (i_28_ != 72) {
																						if (i_28_ == 73)
																							this.aBool2451 = true;
																						else if (i_28_ == 74)
																							this.aBool2445 = true;
																						else if (i_28_ == 75)
																							this.anInt2499 = Stream.readUnsignedByte();
																						else if (i_28_ == 77) {
																							anInt2501 = Stream.readUnsignedShort();
																							if (anInt2501 == 65535)
																								anInt2501 = -1;
																							anInt2483 = Stream.readUnsignedShort();
																							if (anInt2483 == 65535)
																								anInt2483 = -1;
																							int i_33_ = Stream.readUnsignedByte();
																							this.anIntArray2498 = new int[i_33_ + 1];
																							for (int i_34_ = 0; i_33_ >= i_34_; i_34_++) {
																								this.anIntArray2498[i_34_] = Stream.readUnsignedShort();
																								if (this.anIntArray2498[i_34_] == 65535)
																									this.anIntArray2498[i_34_] = -1;
																							}
																						} else if (i_28_ != 78) {
																							if (i_28_ != 79) {
																								if (i_28_ == 81)
																									anInt2493 = Stream.readUnsignedByte() * 256;
																							} else {
																								this.anInt2506 = Stream.readUnsignedShort();
																								this.anInt2497 = Stream.readUnsignedShort();
																								this.anInt2487 = Stream.readUnsignedByte();
																								int i_35_ = Stream.readUnsignedByte();
																								this.anIntArray2465 = new int[i_35_];
																								for (int i_36_ = 0; i_35_ > i_36_; i_36_++)
																									this.anIntArray2465[i_36_] = Stream.readUnsignedShort();
																							}
																						} else {
																							this.anInt2503 = Stream.readUnsignedShort();
																							this.anInt2487 = Stream.readUnsignedByte();
																						}
																					} else
																						anInt2479 = Stream.method772(false);
																				} else
																					anInt2470 = Stream.method772(false);
																			} else
																				this.anInt2439 = Stream.readUnsignedByte();
																		} else
																			scaleY = Stream.readUnsignedShort();
																	} else
																		scaleX = Stream.readUnsignedShort();
																} else
																	this.aBool2500 = false;
															} else
																aBool2504 = true;
														} else
															this.anInt2456 = Stream.readUnsignedShort();
													} else {
														int i_37_ = Stream.readUnsignedByte();
														aShortArray2450 = new short[i_37_];
														aShortArray2508 = new short[i_37_];
														for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
															aShortArray2450[i_38_] = (short) Stream.readUnsignedShort();
															aShortArray2508[i_38_] = (short) Stream.readUnsignedShort();
														}
													}
												} else
													anInt2489 = Stream.readByte((byte) 102) * 5;
											} else
												anInt2478 = Stream.readByte((byte) 109);
										} else
											this.anInt2492 = Stream.readUnsignedByte();
									} else
										this.anInt2482 = 1;
								} else
									anInt2493 = 0;
							} else
								this.aBool2466 = false;
						} else
							this.anInt2469 = Stream.readUnsignedByte();
					} else {
						int i_39_ = Stream.readUnsignedByte();
						if (i_39_ > 0)
							if (models == null || Class38_Sub9.objectLowMem) {
								types = null;
								models = new int[i_39_];
								for (int i_40_ = 0; i_40_ < i_39_; i_40_++)
									models[i_40_] = Stream.readUnsignedShort();
							} else
								Stream.pos += i_39_ * 2;
					}
				} else
					this.aClass19_2460 = Stream.getUShort(1347418632);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.K(" + i + ',' + (Stream != null ? "{...}" : "null") + ',' + i_28_ + ')');
		}
	}

	public static void method800(byte i) {
		try {
			if (i == -110) {
				Client.distanceValues = null;
				ObjectDefinition.aClass65_2461 = null;
				ObjectDefinition.aClass19_2459 = null;
				ObjectDefinition.aClass19_2505 = null;
				ObjectDefinition.aClass19_2481 = null;
				ObjectDefinition.anIntArray2442 = null;
				ObjectDefinition.aClass19_2449 = null;
				ObjectDefinition.aClass19_2484 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.N(" + i + ')');
		}
	}

	static final void method801(byte i) {
		try {
			SceneModel.aBool2553 = false;
			Class72.anInt1417 = 0;
			Class38_Sub20_Sub17.anInt3129 = 0;
			Class23.packetId = -1;
			Entity.anInt3446 = 0;
			if (i != 104)
				ObjectDefinition.method801((byte) 31);
			((RS2Buffer) Client.outputBuffer).pos = 0;
			Class38_Sub20_Sub8.anInt2864 = -1;
			Class38_Sub20_Sub8.anInt2857 = 0;
			Class38_Sub19.anInt2233 = -1;
			Client.systemUpdateTime = 0;
			Class15.anInt280 = -1;
			((RS2Buffer) Class15.inputStream).pos = 0;
			Client.destX = 0;
			for (int i_41_ = 0; i_41_ < Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152.length; i_41_++)
				if (Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_41_] != null)
					((Entity) Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_41_]).anInt3502 = -1;
			for (int i_42_ = 0; i_42_ < Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164.length; i_42_++)
				if (Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_42_] != null)
					((Entity) Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_42_]).anInt3502 = -1;
			Class54.method423(32);
			Canvas_Sub1.method808(0, 30);
			for (int i_43_ = 0; i_43_ < 100; i_43_++)
				Class32.aBoolArray768[i_43_] = true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.H(" + i + ')');
		}
	}

	final void method802(RS2Buffer stream, boolean bool) {
		try {
			for (;;) {
				int opcode = stream.readUnsignedByte();
				if (opcode == 0)
					break;
				readValues((byte) 125, stream, opcode);
			}
			if (bool != true)
				ObjectDefinition.method803(true, -116);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.M(" + (stream != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	static final RSString method803(boolean bool, int i) {
		try {
			if (bool != true)
				return null;
			if (i < 999999999)
				return RuntimeException_Sub1.method1098(i, 0);
			return Class15.aClass19_304;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.F(" + bool + ',' + i + ')');
		}
	}

	final SceneModel method804(boolean bool, int i, int i_44_, int i_45_, int[][] is, int i_46_, int i_47_) {
		try {
			long l;
			if (types != null)
				l = (this.anInt2468 << 1873215466) + (i_47_ << -2096104541) + i_45_;
			else
				l = i_45_ + (this.anInt2468 << -1573621974);
			if (bool != true)
				ObjectDefinition.method801((byte) -63);
			SceneModel class38_sub20_sub3 = (SceneModel) Class20.aClass83_494.method591(-28825, l);
			if (class38_sub20_sub3 == null) {
				Model class38_sub20_sub3_sub3 = method796(i_45_, true, i_47_);
				if (class38_sub20_sub3_sub3 == null)
					return null;
				if (!aBool2441)
					class38_sub20_sub3 = class38_sub20_sub3_sub3.method1142(anInt2478 + 64, anInt2489 * 5 + 768, -50, -10, -50);
				else {
					class38_sub20_sub3 = class38_sub20_sub3_sub3;
					class38_sub20_sub3_sub3.aShort3324 = (short) (anInt2489 * 5 + 768);
					class38_sub20_sub3_sub3.aShort3313 = (short) (anInt2478 + 64);
					class38_sub20_sub3_sub3.method1134();
				}
				Class20.aClass83_494.method590(l, (byte) -125, class38_sub20_sub3);
			}
			if (aBool2441)
				class38_sub20_sub3 = ((Model) class38_sub20_sub3).method1127();
			if (anInt2493 >= 0)
				if (!(class38_sub20_sub3 instanceof Class38_Sub20_Sub3_Sub1)) {
					if (class38_sub20_sub3 instanceof Model)
						class38_sub20_sub3 = ((Model) class38_sub20_sub3).method1131(is, i_46_, i_44_, i, true, anInt2493);
				} else
					class38_sub20_sub3 = ((Class38_Sub20_Sub3_Sub1) class38_sub20_sub3).method1047(is, i_46_, i_44_, i, true, anInt2493);
			return class38_sub20_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.O(" + bool + ',' + i + ',' + i_44_ + ',' + i_45_ + ',' + (is != null ? "{...}" : "null") + ',' + i_46_ + ',' + i_47_ + ')');
		}
	}

	final ObjectDefinition method805(byte i) {
		try {
			int i_48_ = -1;
			if (i != -17)
				aShortArray2458 = null;
			if (anInt2501 == -1) {
				if (anInt2483 != -1)
					i_48_ = Class21.anIntArray528[anInt2483];
			} else
				i_48_ = Player.method1206((byte) -98, anInt2501);
			if (i_48_ < 0 || i_48_ >= this.anIntArray2498.length || this.anIntArray2498[i_48_] == -1)
				return null;
			return Class80.method581(-127, this.anIntArray2498[i_48_]);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.E(" + i + ')');
		}
	}

	final boolean method806(int i, int i_49_) {
		try {
			if (i > -90)
				return false;
			if (types != null) {
				for (int i_50_ = 0; i_50_ < types.length; i_50_++)
					if (types[i_50_] == i_49_)
						return Class72.aClass17_1408.method116(models[i_50_] & 0xffff, true, 0);
				return true;
			}
			if (models == null)
				return true;
			if (i_49_ != 10)
				return true;
			boolean bool = true;
			for (int i_51_ = 0; models.length > i_51_; i_51_++)
				bool &= Class72.aClass17_1408.method116(models[i_51_] & 0xffff, true, 0);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "hd.I(" + i + ',' + i_49_ + ')');
		}
	}

	public ObjectDefinition() {
		this.anInt2440 = -1;
		this.anInt2456 = -1;
		scaleX = 128;
		this.anInt2482 = 2;
		this.aClass19_2460 = Entity.aClass19_3445;
		this.anInt2469 = 1;
		this.anInt2439 = 0;
		scaleY = 128;
		anInt2483 = -1;
		this.anInt2480 = 1;
		anInt2478 = 0;
		this.anInt2492 = 16;
		this.anInt2487 = 0;
		anInt2452 = 0;
		this.anInt2499 = -1;
		anInt2493 = -1;
		anInt2479 = 0;
		this.anInt2497 = 0;
		aBool2441 = false;
		this.anInt2472 = -1;
		anInt2501 = -1;
		this.actions = new RSString[5];
		this.aBool2466 = true;
		anInt2470 = 0;
		this.aBool2500 = true;
		this.aBool2445 = false;
		this.anInt2503 = -1;
		this.anInt2473 = -1;
		scaleZ = 128;
		aBool2504 = false;
		this.anInt2506 = 0;
		anInt2489 = 0;
		this.aBool2457 = false;
	}

	final void method807(int i) {
		do {
			try {
				if (i == 1) {
					if (this.anInt2440 == -1) {
						this.anInt2440 = 0;
						if (models != null && (types == null || types[0] == 10))
							this.anInt2440 = 1;
						for (int i_52_ = 0; i_52_ < 5; i_52_++)
							if (this.actions[i_52_] != null)
								this.anInt2440 = 1;
					}
					if (this.anInt2499 != -1)
						break;
					this.anInt2499 = this.anInt2482 == 0 ? 0 : 1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "hd.L(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		ObjectDefinition.anInt2467 = 0;
		ObjectDefinition.aLong2495 = 0L;
		Client.distanceValues = new int[104][104];
		ObjectDefinition.aClass19_2505 = RSString.createRSString("Login limit exceeded)3");
		ObjectDefinition.anInt2496 = 0;
		ObjectDefinition.aClass19_2459 = RSString.createRSString("Ok");
		ObjectDefinition.aClass19_2481 = ObjectDefinition.aClass19_2505;
		ObjectDefinition.aClass19_2449 = ObjectDefinition.aClass19_2459;
	}
}
