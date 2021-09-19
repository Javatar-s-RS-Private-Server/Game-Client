package com.javatar;/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.*;

final class Class79 {
	static int[] anIntArray1564;
	static RSString aClass19_1565;
	static RSString str_titleBox = RSString.createRSString("titlebox");
	static RSString aClass19_1567;
	static RSString aClass19_1570;
	static RSString aClass19_1574;
	static int anInt1575;
	static RSString aClass19_1576;
	private static RSString aClass19_1571 = RSString.createRSString("This world is running a closed Beta)3");
	private static RSString aClass19_1577;

	static {
		Class79.aClass19_1567 = Class79.aClass19_1571;
		Client.walkingQueueX = new int[4000];
		Class79.aClass19_1577 = RSString.createRSString("No reply from loginserver)3");
		Class79.aClass19_1565 = RSString.createRSString("::fpsoff");
		Class79.aClass19_1576 = RSString.createRSString(" steht bereits auf Ihrer Ignorieren)2Liste(Q");
		Class79.aClass19_1570 = Class79.aClass19_1577;
		Class79.aClass19_1574 = RSString.createRSString("bevor Sie den Vorgang wiederholen)3");
	}

	private final Class17 aClass17_1578;
	private final Class14 aClass14_1582 = new Class14(256);
	private final Class17 aClass17_1584;
	private final Class14 aClass14_1585 = new Class14(256);

	Class79(Class17 class17, Class17 class17_37_) {
		try {
			aClass17_1578 = class17_37_;
			aClass17_1584 = class17;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jf.<init>(" + (class17 != null ? "{...}" : "null") + ',' + (class17_37_ != null ? "{...}" : "null") + ')');
		}
	}

	static final boolean method568() {
		try {
			long l = Class9.method48((byte) -56);
			int i_0_ = (int) (-Class38_Sub20_Sub3_Sub5.aLong3376 + l);
			if (i_0_ > 200)
				i_0_ = 200;
			Class38_Sub20_Sub11.anInt2916 += i_0_;
			Class38_Sub20_Sub3_Sub5.aLong3376 = l;
			if (RS2Buffer.anInt2406 == 0 && Class78.anInt1561 == 0 && Class20.anInt502 == 0 && Class15.anInt291 == 0)
				return true;
			if (Class38_Sub20_Sub17.aClass31_3138 == null)
				return false;
			try {
				if (Class38_Sub20_Sub11.anInt2916 > 30000)
					throw new IOException();
				if (95 <= 81)
					Class79.method569((byte) -32);
				while (Class78.anInt1561 < 20) {
					if (Class15.anInt291 <= 0)
						break;
					Class38_Sub20_Sub2 class38_sub20_sub2 = (Class38_Sub20_Sub2) Sequence.aClass14_2713.method82((byte) 50);
					RS2Buffer class38_sub23 = new RS2Buffer(4);
					class38_sub23.putByte(1);
					class38_sub23.method771((int) class38_sub20_sub2.aLong898);
					Class38_Sub20_Sub17.aClass31_3138.write(class38_sub23.buffer, 4, (byte) 125);
					Class76.aClass14_1485.method80(class38_sub20_sub2.aLong898, class38_sub20_sub2);
					Class78.anInt1561++;
					Class15.anInt291--;
				}
				for (/**/; RS2Buffer.anInt2406 < 20 && Class20.anInt502 > 0; Class20.anInt502--) {
					Class38_Sub20_Sub2 class38_sub20_sub2 = (Class38_Sub20_Sub2) Class61.aClass26_1325.method216((byte) -127);
					RS2Buffer class38_sub23 = new RS2Buffer(4);
					class38_sub23.putByte(0);
					class38_sub23.method771((int) class38_sub20_sub2.aLong898);
					Class38_Sub20_Sub17.aClass31_3138.write(class38_sub23.buffer, 4, (byte) 122);
					class38_sub20_sub2.method707();
					PlayerAppearance.aClass14_397.method80(class38_sub20_sub2.aLong898, class38_sub20_sub2);
					RS2Buffer.anInt2406++;
				}
				for (int i_1_ = 0; i_1_ < 100; i_1_++) {
					int i_2_ = Class38_Sub20_Sub17.aClass31_3138.avaliable((byte) 118);
					if (i_2_ < 0)
						throw new IOException();
					if (i_2_ == 0)
						break;
					Class38_Sub20_Sub11.anInt2916 = 0;
					int i_3_ = 0;
					if (Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564 == null)
						i_3_ = 8;
					else if (Class38_Sub11.anInt2101 == 0)
						i_3_ = 1;
					if (i_3_ > 0) {
						int i_4_ = -Class38_Sub20_Sub15.aClass38_Sub23_3066.pos + i_3_;
						if (i_2_ < i_4_)
							i_4_ = i_2_;
						Class38_Sub20_Sub17.aClass31_3138.method290(115, Class38_Sub20_Sub15.aClass38_Sub23_3066.pos, Class38_Sub20_Sub15.aClass38_Sub23_3066.buffer, i_4_);
						if (Class38_Sub14.aByte2141 != 0)
							for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
								Class38_Sub20_Sub15.aClass38_Sub23_3066.buffer[i_5_ + Class38_Sub20_Sub15.aClass38_Sub23_3066.pos] = (byte) Class38_Sub20_Sub11.method981(Class38_Sub20_Sub15.aClass38_Sub23_3066.buffer[i_5_ + Class38_Sub20_Sub15.aClass38_Sub23_3066.pos], Class38_Sub14.aByte2141);
						Class38_Sub20_Sub15.aClass38_Sub23_3066.pos += i_4_;
						if (Class38_Sub20_Sub15.aClass38_Sub23_3066.pos < i_3_)
							break;
						if (Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564 == null) {
							Class38_Sub20_Sub15.aClass38_Sub23_3066.pos = 0;
							int i_6_ = Class38_Sub20_Sub15.aClass38_Sub23_3066.getUByte();
							int i_7_ = Class38_Sub20_Sub15.aClass38_Sub23_3066.readUnsignedShortLE();
							long l_8_ = i_7_ + (i_6_ << 16);
							int i_9_ = Class38_Sub20_Sub15.aClass38_Sub23_3066.getUByte();
							int i_10_ = Class38_Sub20_Sub15.aClass38_Sub23_3066.readInt(true);
							Class38_Sub20_Sub2 class38_sub20_sub2 = (Class38_Sub20_Sub2) Class76.aClass14_1485.method75(l_8_);
							NodeSub.aBool2251 = true;
							if (class38_sub20_sub2 == null) {
								class38_sub20_sub2 = (Class38_Sub20_Sub2) PlayerAppearance.aClass14_397.method75(l_8_);
								NodeSub.aBool2251 = false;
							}
							if (class38_sub20_sub2 == null)
								throw new IOException();
							Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564 = class38_sub20_sub2;
							int i_11_ = i_9_ != 0 ? 9 : 5;
							Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275 = new RS2Buffer(Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564.aByte2542 + (i_10_ + i_11_));
							Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.putByte(i_9_);
							Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.putInt(i_10_);
							Class38_Sub20_Sub15.aClass38_Sub23_3066.pos = 0;
							Class38_Sub11.anInt2101 = 8;
						} else if (Class38_Sub11.anInt2101 == 0)
							if (Class38_Sub20_Sub15.aClass38_Sub23_3066.buffer[0] != -1)
								Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564 = null;
							else {
								Class38_Sub20_Sub15.aClass38_Sub23_3066.pos = 0;
								Class38_Sub11.anInt2101 = 1;
							}
					} else {
						int i_12_ = Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.buffer.length - Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564.aByte2542;
						int i_13_ = -Class38_Sub11.anInt2101 + 512;
						if (i_12_ - Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.pos < i_13_)
							i_13_ = i_12_ - Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.pos;
						if (i_13_ > i_2_)
							i_13_ = i_2_;
						Class38_Sub20_Sub17.aClass31_3138.method290(110, Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.pos, Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.buffer, i_13_);
						if (Class38_Sub14.aByte2141 != 0)
							for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
								Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.buffer[Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.pos + i_14_] = (byte) Class38_Sub20_Sub11.method981(Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.buffer[Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.pos + i_14_], Class38_Sub14.aByte2141);
						Class38_Sub11.anInt2101 += i_13_;
						Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.pos += i_13_;
						if (i_12_ == Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.pos) {
							if (Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564.aLong898 != 16711935L) {
								Class38_Sub21.aCRC32_2277.reset();
								Class38_Sub21.aCRC32_2277.update(Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.buffer, 0, i_12_);
								int i_15_ = (int) Class38_Sub21.aCRC32_2277.getValue();
								if (i_15_ != Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564.anInt2533) {
									try {
										Class38_Sub20_Sub17.aClass31_3138.method292(79);
									} catch (Exception exception) {
										/* empty */
									}
									Client.anInt3652++;
									Class38_Sub14.aByte2141 = (byte) (int) (Math.random() * 255.0 + 1.0);
									Class38_Sub20_Sub17.aClass31_3138 = null;
									return false;
								}
								Client.anInt3652 = 0;
								Class38_Sub20_Sub15.anInt3067 = 0;
								Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564.aClass17_Sub1_2544.method597(NodeSub.aBool2251, (int) (Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564.aLong898 & 0xffffL), (Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564.aLong898 & 0xff0000L) == 16711680L, Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275.buffer);
							} else {
								Class72.aClass38_Sub23_1414 = Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275;
								for (int i_16_ = 0; i_16_ < 256; i_16_++) {
									Class17_Sub1 class17_sub1 = Class28.aClass17_Sub1Array695[i_16_];
									if (class17_sub1 != null) {
										Class72.aClass38_Sub23_1414.pos = i_16_ * 8 + 5;
										int i_17_ = Class72.aClass38_Sub23_1414.readInt(true);
										int i_18_ = Class72.aClass38_Sub23_1414.readInt(true);
										class17_sub1.method598(i_18_, i_17_, 16782);
									}
								}
							}
							Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564.method330(0);
							if (NodeSub.aBool2251)
								Class78.anInt1561--;
							else
								RS2Buffer.anInt2406--;
							Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275 = null;
							Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564 = null;
							Class38_Sub11.anInt2101 = 0;
						} else {
							if (Class38_Sub11.anInt2101 != 512)
								break;
							Class38_Sub11.anInt2101 = 0;
						}
					}
				}
				return true;
			} catch (IOException ioexception) {
				try {
					Class38_Sub20_Sub17.aClass31_3138.method292(-71);
				} catch (Exception exception) {
					/* empty */
				}
				Class38_Sub20_Sub17.aClass31_3138 = null;
				Class38_Sub20_Sub15.anInt3067++;
				return false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jf.B(" + 95 + ')');
		}
	}

	public static void method569(byte i) {
		try {
			Class79.aClass19_1576 = null;
			Class79.aClass19_1570 = null;
			Class79.aClass19_1565 = null;
			Class79.aClass19_1574 = null;
			Class79.aClass19_1571 = null;
			Class79.str_titleBox = null;
			Class79.anIntArray1564 = null;
			Client.walkingQueueX = null;
			if (i > -105)
				Class79.method569((byte) -82);
			Class79.aClass19_1567 = null;
			Class79.aClass19_1577 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jf.G(" + i + ')');
		}
	}

	static final void method571() {
		try {
			Class35.aClass38_Sub10_Sub1_849.method863(21828);
			Class38_Sub20_Sub8.aClass17_2872 = null;
			if (!true)
				Class79.aClass19_1574 = null;
			Class38_Sub1.anInt1741 = 1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jf.D(" + true + ')');
		}
	}

	static final void method574(int i) {
		try {
			if (Class38_Sub1.anInt1741 == 0)
				Class35.aClass38_Sub10_Sub1_849.method840(i);
			else
				Class38_Sub20_Sub14.anInt3039 = i;
			if (false)
				Class79.method575((byte) 114);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jf.C(" + i + ',' + false + ')');
		}
	}

	static final void method575(byte i) {
		try {
			if (i > 66)
				for (int i_24_ = -1; i_24_ < ItemDefinition.anInt2783; i_24_++) {
					int i_25_;
					if (i_24_ == -1)
						i_25_ = 2047;
					else
						i_25_ = Class47.anIntArray1055[i_24_];
					Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_25_];
					if (class38_sub20_sub3_sub7_sub2 != null)
						PlayerAppearance.method130((byte) 101, 1, class38_sub20_sub3_sub7_sub2);
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jf.H(" + i + ')');
		}
	}

	static final String method577(Throwable throwable) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub1) {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			throwable = runtimeexception_sub1.aThrowable3282;
			string = runtimeexception_sub1.aString3278 + " | ";
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_30_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_30_));
		String string_31_ = bufferedreader.readLine();
		for (;;) {
			String string_32_ = bufferedreader.readLine();
			if (string_32_ == null)
				break;
			int i_33_ = string_32_.indexOf('(');
			int i_34_ = string_32_.indexOf(')', i_33_ + 1);
			if (i_33_ >= 0 && i_34_ >= 0) {
				String string_35_ = string_32_.substring(i_33_ + 1, i_34_);
				int i_36_ = string_35_.indexOf(".java:");
				if (i_36_ >= 0) {
					string_35_ = string_35_.substring(0, i_36_) + string_35_.substring(i_36_ + 5);
					string += string_35_ + ' ';
					continue;
				}
				string_32_ = string_32_.substring(0, i_33_);
			}
			string_32_ = string_32_.trim();
			string_32_ = string_32_.substring(string_32_.lastIndexOf(' ') + 1);
			string_32_ = string_32_.substring(string_32_.lastIndexOf('\t') + 1);
			string += string_32_ + ' ';
		}
		if (32 != 32)
			return null;
		string += "| " + string_31_;
		return string;
	}

	private Class38_Sub16_Sub1 method570(int i_19_, int[] is, int i_20_) {
		try {
			int i_21_ = ((i_20_ & ~0x5ffff000) << 4 | i_20_ >>> 12) ^ i_19_;
			i_21_ |= i_20_ << 16;
			long l = i_21_;
			Class38_Sub16_Sub1 class38_sub16_sub1 = (Class38_Sub16_Sub1) aClass14_1585.method75(l);
			if (-24259 != -24259)
				return null;
			if (class38_sub16_sub1 != null)
				return class38_sub16_sub1;
			if (is != null && is[0] <= 0)
				return null;
			Class68 class68 = Class68.method484(aClass17_1584, i_20_, i_19_);
			if (class68 == null)
				return null;
			class38_sub16_sub1 = class68.method483();
			aClass14_1585.method80(l, class38_sub16_sub1);
			if (is != null)
				is[0] -= class38_sub16_sub1.aByteArray3029.length;
			return class38_sub16_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jf.F(" + -24259 + ',' + i_19_ + ',' + (is != null ? "{...}" : "null") + ',' + i_20_ + ')');
		}
	}

	final Class38_Sub16_Sub1 method572(int i, int[] is) {
		try {
			if ((byte) 111 <= 40)
				return null;
			if (aClass17_1584.method107(-101) == 1)
				return method570(i, is, 0);
			if (aClass17_1584.method103(i) == 1)
				return method570(0, is, i);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jf.I(" + i + ',' + (byte) 111 + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	final Class38_Sub16_Sub1 method573(int[] is, int i_23_) {
		try {
			if ((byte) -33 > -26)
				return null;
			if (aClass17_1578.method107(-115) == 1)
				return method576(i_23_, 0, (byte) -29, is);
			if (aClass17_1578.method103(i_23_) == 1)
				return method576(0, i_23_, (byte) -82, is);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jf.A(" + (is != null ? "{...}" : "null") + ',' + (byte) -33 + ',' + i_23_ + ')');
		}
	}

	private Class38_Sub16_Sub1 method576(int i, int i_26_, byte i_27_, int[] is) {
		try {
			int i_28_ = i ^ (i_26_ >>> 12 | i_26_ << 4 & 0xffff);
			i_28_ |= i_26_ << 16;
			long l = i_28_ ^ 0x100000000L;
			Class38_Sub16_Sub1 class38_sub16_sub1 = (Class38_Sub16_Sub1) aClass14_1585.method75(l);
			int i_29_ = -58 % ((68 - i_27_) / 43);
			if (class38_sub16_sub1 != null)
				return class38_sub16_sub1;
			if (is != null && is[0] <= 0)
				return null;
			Class38_Sub15 class38_sub15 = (Class38_Sub15) aClass14_1582.method75(l);
			if (class38_sub15 == null) {
				class38_sub15 = Class38_Sub15.method688(aClass17_1578, i_26_, i);
				if (class38_sub15 == null)
					return null;
				aClass14_1582.method80(l, class38_sub15);
			}
			class38_sub16_sub1 = class38_sub15.method684(is);
			if (class38_sub16_sub1 == null)
				return null;
			class38_sub15.method330(0);
			aClass14_1585.method80(l, class38_sub16_sub1);
			return class38_sub16_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jf.J(" + i + ',' + i_26_ + ',' + i_27_ + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}
}
