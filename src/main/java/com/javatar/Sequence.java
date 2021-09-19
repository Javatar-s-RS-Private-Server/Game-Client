package com.javatar;/* Sequence - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class Sequence extends NodeSub {
	static Class14 aClass14_2713 = new Class14(4096);
	static RSString aClass19_2727;
	static int anInt2731 = 0;
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array2734;
	static RSString aClass19_2735 = RSString.createRSString("Ihr Charakter)2Profil wird in:");
	static Class4[] aClass4Array2736;
	static RSString aClass19_2737;
	static Class17 aClass17_2738;
	static RSString aClass19_2739;
	static RSString aClass19_2740;
	static int anInt2741;
	private static RSString aClass19_2730;
	private static RSString aClass19_2732;
	private static RSString aClass19_2733 = RSString.createRSString("You are standing in a members)2only area)3");
	private static RSString aClass19_2743;

	static {
		Sequence.aClass19_2732 = RSString.createRSString("Please try again)3");
		Sequence.anInt2741 = 20;
		Sequence.aClass19_2740 = Sequence.aClass19_2733;
		Sequence.aClass19_2737 = Sequence.aClass19_2732;
		Sequence.aClass19_2730 = RSString.createRSString("Unable to find ");
		Sequence.aClass19_2739 = Sequence.aClass19_2730;
		Sequence.aClass19_2743 = RSString.createRSString(" has logged out)3");
		Sequence.aClass19_2727 = Sequence.aClass19_2743;
	}

	int anInt2686;
	boolean aBool2689 = true;
	RSString[] aClass19Array2690 = new RSString[5];
	int anInt2696;
	int anInt2697;
	int anInt2699;
	int anInt2702;
	int anInt2703;
	RSString aClass19_2705;
	int anInt2710;
	int anInt2712;
	int[] anIntArray2715;
	int anInt2718;
	int anInt2719;
	int anInt2720;
	boolean aBool2722;
	int anInt2725;
	boolean aBool2742;
	boolean aBool2744;
	private int anInt2687;
	private int[] timer;
	private int anInt2692;
	private int anInt2693;
	private short[] aShortArray2694;
	private short[] aShortArray2698;
	private int[] anIntArray2704;
	private int anInt2707;
	private short[] aShortArray2721;
	private int anInt2723;
	private int anInt2728;
	private short[] aShortArray2729;

	public Sequence() {
		this.anInt2686 = -1;
		anInt2693 = -1;
		this.anInt2696 = -1;
		this.anInt2697 = 1;
		this.anInt2712 = -1;
		anInt2707 = 128;
		this.anInt2710 = -1;
		this.anInt2703 = -1;
		anInt2692 = 0;
		this.anInt2699 = -1;
		this.aClass19_2705 = Class54.aClass19_1192;
		anInt2723 = 0;
		this.anInt2720 = -1;
		this.anInt2718 = -1;
		anInt2687 = -1;
		this.anInt2702 = -1;
		anInt2728 = 128;
		this.anInt2719 = 32;
		this.aBool2722 = true;
		this.aBool2742 = true;
		this.aBool2744 = false;
	}

	static final int method909(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = i_1_ + i * 57;
			if (i_0_ > -65)
				Sequence.aClass19_2733 = null;
			i_2_ ^= i_2_ << 13;
			int i_3_ = i_2_ * (i_2_ * 15731 * i_2_ + 789221) + 1376312589 & 0x7fffffff;
			return (i_3_ & 0x7fcfd4b) >> 19;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "o.O(" + i + ',' + i_0_ + ',' + i_1_ + ')');
		}
	}

	static final void method911(PacketBuffer class38_sub23_sub1) {
		try {
			if ((byte) 7 != 7)
				Sequence.anInt2741 = 47;
			for (; ; ) {
				Class38_Sub7 class38_sub7 = (Class38_Sub7) Class76.aClass13_1496.method65((byte) 7 + 86);
				if (class38_sub7 == null)
					break;
				boolean bool = false;
				for (int i_10_ = 0; class38_sub7.anInt2035 > i_10_; i_10_++) {
					if (class38_sub7.aClass65Array2029[i_10_] != null) {
						if (class38_sub7.aClass65Array2029[i_10_].anInt1368 == 2)
							class38_sub7.anIntArray2024[i_10_] = -5;
						if (class38_sub7.aClass65Array2029[i_10_].anInt1368 == 0)
							bool = true;
					}
					if (class38_sub7.aClass65Array2034[i_10_] != null) {
						if (class38_sub7.aClass65Array2034[i_10_].anInt1368 == 2)
							class38_sub7.anIntArray2024[i_10_] = -6;
						if (class38_sub7.aClass65Array2034[i_10_].anInt1368 == 0)
							bool = true;
					}
				}
				if (bool)
					break;
				class38_sub23_sub1.putOpcode(183);
				class38_sub23_sub1.putByte(0);
				int i_11_ = class38_sub23_sub1.pos;
				class38_sub23_sub1.putInt(class38_sub7.anInt2018);
				for (int i_12_ = 0; class38_sub7.anInt2035 > i_12_; i_12_++)
					if (class38_sub7.anIntArray2024[i_12_] != 0)
						class38_sub23_sub1.putByte(class38_sub7.anIntArray2024[i_12_]);
					else
						try {
							int i_13_ = class38_sub7.anIntArray2032[i_12_];
							if (i_13_ != 0) {
								if (i_13_ != 1) {
									if (i_13_ == 2) {
										Field field = (Field) class38_sub7.aClass65Array2029[i_12_].anObject1365;
										int i_14_ = field.getModifiers();
										class38_sub23_sub1.putByte(0);
										class38_sub23_sub1.putInt(i_14_);
									}
								} else {
									Field field = (Field) class38_sub7.aClass65Array2029[i_12_].anObject1365;
									field.setInt(null, class38_sub7.anIntArray2026[i_12_]);
									class38_sub23_sub1.putByte(0);
								}
							} else {
								Field field = (Field) class38_sub7.aClass65Array2029[i_12_].anObject1365;
								int i_15_ = field.getInt(null);
								class38_sub23_sub1.putByte(0);
								class38_sub23_sub1.putInt(i_15_);
							}
							if (i_13_ != 3) {
								if (i_13_ == 4) {
									Method method = (Method) class38_sub7.aClass65Array2034[i_12_].anObject1365;
									int i_16_ = method.getModifiers();
									class38_sub23_sub1.putByte(0);
									class38_sub23_sub1.putInt(i_16_);
								}
							} else {
								Method method = (Method) class38_sub7.aClass65Array2034[i_12_].anObject1365;
								byte[][] is = class38_sub7.aByteArrayArrayArray2033[i_12_];
								Object[] objects = new Object[is.length];
								for (int i_17_ = 0; i_17_ < is.length; i_17_++) {
									ObjectInputStream objectinputstream = new ObjectInputStream(new ByteArrayInputStream(is[i_17_]));
									objects[i_17_] = objectinputstream.readObject();
								}
								Object object = method.invoke(null, objects);
								if (object == null)
									class38_sub23_sub1.putByte(0);
								else if (!(object instanceof Number)) {
									if (!(object instanceof RSString))
										class38_sub23_sub1.putByte(4);
									else {
										class38_sub23_sub1.putByte(2);
										class38_sub23_sub1.writeString((RSString) object, (byte) 117);
									}
								} else {
									class38_sub23_sub1.putByte(1);
									class38_sub23_sub1.writeLong(((Number) object).longValue());
								}
							}
						} catch (ClassNotFoundException classnotfoundexception) {
							class38_sub23_sub1.putByte(-10);
						} catch (java.io.InvalidClassException invalidclassexception) {
							class38_sub23_sub1.putByte(-11);
						} catch (java.io.StreamCorruptedException streamcorruptedexception) {
							class38_sub23_sub1.putByte(-12);
						} catch (java.io.OptionalDataException optionaldataexception) {
							class38_sub23_sub1.putByte(-13);
						} catch (IllegalAccessException illegalaccessexception) {
							class38_sub23_sub1.putByte(-14);
						} catch (IllegalArgumentException illegalargumentexception) {
							class38_sub23_sub1.putByte(-15);
						} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
							class38_sub23_sub1.putByte(-16);
						} catch (SecurityException securityexception) {
							class38_sub23_sub1.putByte(-17);
						} catch (java.io.IOException ioexception) {
							class38_sub23_sub1.putByte(-18);
						} catch (NullPointerException nullpointerexception) {
							class38_sub23_sub1.putByte(-19);
						} catch (Exception exception) {
							class38_sub23_sub1.putByte(-20);
						} catch (Throwable throwable) {
							class38_sub23_sub1.putByte(-21);
						}
				class38_sub23_sub1.method743((byte) 95, i_11_);
				class38_sub23_sub1.putSizedByte(-i_11_ + class38_sub23_sub1.pos);
				class38_sub7.method330(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "o.I(" + (byte) 7 + ',' + 183 + ',' + (class38_sub23_sub1 != null ? "{...}" : "null") + ')');
		}
	}

	static final byte[] method912(byte[] is) {
		try {
			RS2Buffer class38_sub23 = new RS2Buffer(is);
			int i_18_ = class38_sub23.getUByte();
			int i_19_ = class38_sub23.readInt(true);
			if (31535 != 31535)
				Sequence.aClass19_2740 = null;
			if (i_19_ < 0 || Class38_Sub6.anInt1855 != 0 && Class38_Sub6.anInt1855 < i_19_)
				throw new RuntimeException();
			if (i_18_ != 0) {
				int i_20_ = class38_sub23.readInt(true);
				if (i_20_ < 0 || Class38_Sub6.anInt1855 != 0 && Class38_Sub6.anInt1855 < i_20_)
					throw new RuntimeException();
				byte[] is_21_ = new byte[i_20_];
				if (i_18_ != 1)
					NodeSub.aClass81_2249.method583(is_21_, class38_sub23);
				else
					Class69.method489(is_21_, i_20_, is, i_19_);
				return is_21_;
			}
			byte[] is_22_ = new byte[i_19_];
			class38_sub23.method778(i_19_, is_22_);
			return is_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "o.H(" + 31535 + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	static final void method914(RSString class19, int i, RSString class19_24_, RSString class19_25_) {
		try {
			for (int i_26_ = 99; i_26_ > 0; i_26_--) {
				Class38_Sub20_Sub3_Sub4.anIntArray3362[i_26_] = Class38_Sub20_Sub3_Sub4.anIntArray3362[i_26_ - 1];
				Class53.aClass19Array1179[i_26_] = Class53.aClass19Array1179[i_26_ - 1];
				Class38_Sub6.aClass19Array1945[i_26_] = Class38_Sub6.aClass19Array1945[i_26_ - 1];
				NPC.aClass19Array3558[i_26_] = NPC.aClass19Array3558[i_26_ - 1];
			}
			Class38_Sub10_Sub1.anInt2658 = Entity.anInt3513;
			Class53.aClass19Array1179[0] = class19;
			Class38_Sub21.anInt2285++;
			if (!true)
				Sequence.forID((byte) -56, -10);
			Class38_Sub20_Sub3_Sub4.anIntArray3362[0] = i;
			Class38_Sub6.aClass19Array1945[0] = class19_24_;
			NPC.aClass19Array3558[0] = class19_25_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "o.J(" + (class19 != null ? "{...}" : "null") + ',' + true + ',' + i + ',' + (class19_24_ != null ? "{...}" : "null") + ',' + (class19_25_ != null ? "{...}" : "null") + ')');
		}
	}

	public static void method917(byte i) {
		try {
			Sequence.aClass38_Sub20_Sub9_Sub3Array2734 = null;
			Sequence.aClass19_2733 = null;
			Sequence.aClass19_2737 = null;
			Sequence.aClass19_2732 = null;
			int i_30_ = 89 / ((-43 - i) / 37);
			Sequence.aClass19_2740 = null;
			Sequence.aClass4Array2736 = null;
			Sequence.aClass17_2738 = null;
			Sequence.aClass19_2739 = null;
			Sequence.aClass19_2735 = null;
			Sequence.aClass19_2743 = null;
			Sequence.aClass19_2727 = null;
			Sequence.aClass19_2730 = null;
			Sequence.aClass14_2713 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "o.Q(" + i + ')');
		}
	}

	static final Class38_Sub20_Sub4 forID(byte i, int i_31_) {
		try {
			Class38_Sub20_Sub4 class38_sub20_sub4 = (Class38_Sub20_Sub4) Class38_Sub14.aClass83_2130.method591(-28825, i_31_);
			if (i <= 81)
				Sequence.anInt2731 = 39;
			if (class38_sub20_sub4 != null)
				return class38_sub20_sub4;
			byte[] is = Class62.aClass17_1342.method109(12, i_31_, -75);
			class38_sub20_sub4 = new Class38_Sub20_Sub4();
			if (is != null)
				class38_sub20_sub4.method823(new RS2Buffer(is));
			class38_sub20_sub4.method831(0);
			Class38_Sub14.aClass83_2130.method590(i_31_, (byte) -123, class38_sub20_sub4);
			return class38_sub20_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "o.M(" + i + ',' + i_31_ + ')');
		}
	}

	final Model method910(int i) {
		try {
			if (this.anIntArray2715 != null) {
				Sequence class38_sub20_sub5_4_ = method915(-92);
				if (class38_sub20_sub5_4_ == null)
					return null;
				return class38_sub20_sub5_4_.method910(-91);
			}
			if (anIntArray2704 == null)
				return null;
			boolean bool = false;
			for (int j : anIntArray2704)
				if (!Class66.aClass17_1376.method116(j, 0))
					bool = true;
			if (bool)
				return null;
			Model[] class38_sub20_sub3_sub3s = new Model[anIntArray2704.length];
			for (int i_6_ = 0; i_6_ < anIntArray2704.length; i_6_++)
				class38_sub20_sub3_sub3s[i_6_] = Model.get(Class66.aClass17_1376, anIntArray2704[i_6_], 0);
			Model class38_sub20_sub3_sub3;
			if (class38_sub20_sub3_sub3s.length == 1)
				class38_sub20_sub3_sub3 = class38_sub20_sub3_sub3s[0];
			else
				class38_sub20_sub3_sub3 = new Model(class38_sub20_sub3_sub3s, class38_sub20_sub3_sub3s.length);
			if (i > -7)
				return null;
			if (aShortArray2729 != null)
				for (int i_7_ = 0; i_7_ < aShortArray2729.length; i_7_++)
					class38_sub20_sub3_sub3.method1128(aShortArray2729[i_7_], aShortArray2721[i_7_]);
			if (aShortArray2694 != null)
				for (int i_8_ = 0; i_8_ < aShortArray2694.length; i_8_++)
					class38_sub20_sub3_sub3.method1148(aShortArray2694[i_8_], aShortArray2698[i_8_]);
			return class38_sub20_sub3_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "o.G(" + i + ')');
		}
	}

	final boolean method913() {
		try {
			if (this.anIntArray2715 == null)
				return true;
			int i_23_ = -1;
			if (-27678 != -27678)
				return false;
			if (anInt2693 != -1)
				i_23_ = Player.method1206(anInt2693);
			else if (anInt2687 != -1)
				i_23_ = Class21.anIntArray528[anInt2687];
			return i_23_ >= 0 && i_23_ < this.anIntArray2715.length && this.anIntArray2715[i_23_] != -1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "o.P(" + -27678 + ')');
		}
	}

	final Sequence method915(int i) {
		try {
			int i_27_ = -1;
			if (anInt2693 != -1)
				i_27_ = Player.method1206(anInt2693);
			else if (anInt2687 != -1)
				i_27_ = Class21.anIntArray528[anInt2687];
			int i_28_ = -122 % ((22 - i) / 63);
			if (i_27_ < 0 || i_27_ >= this.anIntArray2715.length || this.anIntArray2715[i_27_] == -1)
				return null;
			return Class38_Sub20_Sub3_Sub4.method1156(-92, this.anIntArray2715[i_27_]);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "o.L(" + i + ')');
		}
	}

	final void method916(RS2Buffer class38_sub23) {
		try {
			if ((byte) -118 != -118)
				Sequence.forID((byte) -116, 102);
			for (; ; ) {
				int i_29_ = class38_sub23.getUByte();
				if (i_29_ == 0)
					break;
				readValues(class38_sub23, i_29_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "o.N(" + (byte) -118 + ',' + (class38_sub23 != null ? "{...}" : "null") + ')');
		}
	}

	final Class38_Sub20_Sub3_Sub1 method919(Class38_Sub20_Sub4 class38_sub20_sub4, int i, Class38_Sub20_Sub4 class38_sub20_sub4_32_, byte i_33_, int i_34_) {
		try {
			if (this.anIntArray2715 != null) {
				Sequence class38_sub20_sub5_35_ = method915(101);
				if (class38_sub20_sub5_35_ == null)
					return null;
				return class38_sub20_sub5_35_.method919(class38_sub20_sub4, i, class38_sub20_sub4_32_, (byte) 74, i_34_);
			}
			int i_36_ = -8 % ((13 - i_33_) / 51);
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = (Class38_Sub20_Sub3_Sub1) Class38_Sub20_Sub10.aClass83_2902.method591(-28825, this.anInt2725);
			if (class38_sub20_sub3_sub1 == null) {
				boolean bool = false;
				for (int j : timer)
					if (!Class66.aClass17_1376.method116(j, 0))
						bool = true;
				if (bool)
					return null;
				Model[] class38_sub20_sub3_sub3s = new Model[timer.length];
				for (int i_38_ = 0; timer.length > i_38_; i_38_++)
					class38_sub20_sub3_sub3s[i_38_] = Model.get(Class66.aClass17_1376, timer[i_38_], 0);
				Model class38_sub20_sub3_sub3;
				if (class38_sub20_sub3_sub3s.length != 1)
					class38_sub20_sub3_sub3 = new Model(class38_sub20_sub3_sub3s, class38_sub20_sub3_sub3s.length);
				else
					class38_sub20_sub3_sub3 = class38_sub20_sub3_sub3s[0];
				if (aShortArray2729 != null)
					for (int i_39_ = 0; i_39_ < aShortArray2729.length; i_39_++)
						class38_sub20_sub3_sub3.method1128(aShortArray2729[i_39_], aShortArray2721[i_39_]);
				if (aShortArray2694 != null)
					for (int i_40_ = 0; i_40_ < aShortArray2694.length; i_40_++)
						class38_sub20_sub3_sub3.method1148(aShortArray2694[i_40_], aShortArray2698[i_40_]);
				class38_sub20_sub3_sub1 = class38_sub20_sub3_sub3.method1142(anInt2692 + 64, anInt2723 + 850, -30, -50, -30);
				Class38_Sub20_Sub10.aClass83_2902.method590(this.anInt2725, (byte) -122, class38_sub20_sub3_sub1);
			}
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_41_;
			if (class38_sub20_sub4_32_ != null && class38_sub20_sub4 != null)
				class38_sub20_sub3_sub1_41_ = class38_sub20_sub4_32_.method830(i_34_, class38_sub20_sub4, class38_sub20_sub3_sub1, 0, i);
			else if (class38_sub20_sub4_32_ != null)
				class38_sub20_sub3_sub1_41_ = class38_sub20_sub4_32_.method832(class38_sub20_sub3_sub1, i);
			else if (class38_sub20_sub4 == null)
				class38_sub20_sub3_sub1_41_ = class38_sub20_sub3_sub1.method1038(true);
			else
				class38_sub20_sub3_sub1_41_ = class38_sub20_sub4.method832(class38_sub20_sub3_sub1, i_34_);
			if (anInt2707 != 128 || anInt2728 != 128)
				class38_sub20_sub3_sub1_41_.method1044(anInt2707, anInt2728, anInt2707);
			return class38_sub20_sub3_sub1_41_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "o.F(" + (class38_sub20_sub4 != null ? "{...}" : "null") + ',' + i + ',' + (class38_sub20_sub4_32_ != null ? "{...}" : "null") + ',' + i_33_ + ',' + i_34_ + ')');
		}
	}

	final void method920() {
		do {
			try {
				if ((byte) 85 > 31)
					break;
				Sequence.method909(96, -98, 118);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "o.E(" + (byte) 85 + ')');
			}
			break;
		} while (false);
	}

	private void readValues(RS2Buffer stream, int opcode) {
		do {
			try {
				if (opcode == 1) {
					int len = stream.getUByte();
					timer = new int[len];
					for (int id = 0; id < len; id++)
						timer[id] = stream.readUnsignedShortLE();
				} else if (opcode == 2)
					this.aClass19_2705 = stream.readString(1347418632);
				else if (opcode != 12) {
					if (opcode == 13)
						this.anInt2696 = stream.readUnsignedShortLE();
					else if (opcode != 14) {
						if (opcode == 15)
							this.anInt2710 = stream.readUnsignedShortLE();
						else if (opcode != 16) {
							if (opcode != 17) {
								if (opcode < 30 || opcode >= 35) {
									if (opcode != 40) {
										if (opcode != 41) {
											if (opcode == 60) {
												int i_45_ = stream.getUByte();
												anIntArray2704 = new int[i_45_];
												for (int i_46_ = 0; i_45_ > i_46_; i_46_++)
													anIntArray2704[i_46_] = stream.readUnsignedShortLE();
											} else if (opcode != 93) {
												if (opcode != 95) {
													if (opcode != 97) {
														if (opcode == 98)
															anInt2728 = stream.readUnsignedShortLE();
														else if (opcode == 99)
															this.aBool2744 = true;
														else if (opcode == 100)
															anInt2692 = stream.method765((byte) 94);
														else if (opcode == 101)
															anInt2723 = stream.method765((byte) 105) * 5;
														else if (opcode == 102)
															this.anInt2718 = stream.readUnsignedShortLE();
														else if (opcode != 103) {
															if (opcode != 106) {
																if (opcode == 107)
																	this.aBool2689 = false;
																else if (opcode == 109)
																	this.aBool2742 = false;
															} else {
																anInt2693 = stream.readUnsignedShortLE();
																if (anInt2693 == 65535)
																	anInt2693 = -1;
																anInt2687 = stream.readUnsignedShortLE();
																if (anInt2687 == 65535)
																	anInt2687 = -1;
																int i_47_ = stream.getUByte();
																this.anIntArray2715 = new int[i_47_ + 1];
																for (int i_48_ = 0; i_48_ <= i_47_; i_48_++) {
																	this.anIntArray2715[i_48_] = stream.readUnsignedShortLE();
																	if (this.anIntArray2715[i_48_] == 65535)
																		this.anIntArray2715[i_48_] = -1;
																}
															}
														} else
															this.anInt2719 = stream.readUnsignedShortLE();
													} else
														anInt2707 = stream.readUnsignedShortLE();
												} else
													this.anInt2699 = stream.readUnsignedShortLE();
											} else
												this.aBool2722 = false;
										} else {
											int i_49_ = stream.getUByte();
											aShortArray2694 = new short[i_49_];
											aShortArray2698 = new short[i_49_];
											for (int i_50_ = 0; i_49_ > i_50_; i_50_++) {
												aShortArray2694[i_50_] = (short) stream.readUnsignedShortLE();
												aShortArray2698[i_50_] = (short) stream.readUnsignedShortLE();
											}
										}
									} else {
										int i_51_ = stream.getUByte();
										aShortArray2729 = new short[i_51_];
										aShortArray2721 = new short[i_51_];
										for (int i_52_ = 0; i_51_ > i_52_; i_52_++) {
											aShortArray2729[i_52_] = (short) stream.readUnsignedShortLE();
											aShortArray2721[i_52_] = (short) stream.readUnsignedShortLE();
										}
									}
								} else {
									this.aClass19Array2690[opcode - 30] = stream.readString(1347418632);
									if (this.aClass19Array2690[opcode - 30].method174((byte) 121, RuntimeException_Sub1.aClass19_3290))
										this.aClass19Array2690[opcode - 30] = null;
								}
							} else {
								this.anInt2703 = stream.readUnsignedShortLE();
								this.anInt2702 = stream.readUnsignedShortLE();
								this.anInt2720 = stream.readUnsignedShortLE();
								this.anInt2712 = stream.readUnsignedShortLE();
							}
						} else
							this.anInt2686 = stream.readUnsignedShortLE();
					} else
						this.anInt2703 = stream.readUnsignedShortLE();
				} else
					this.anInt2697 = stream.getUByte();
				if (-128 < -126)
					break;
				Sequence.forID((byte) -30, -75);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "o.K(" + -128 + ',' + (stream != null ? "{...}" : "null") + ',' + opcode + ')');
			}
			break;
		} while (false);
	}
}
