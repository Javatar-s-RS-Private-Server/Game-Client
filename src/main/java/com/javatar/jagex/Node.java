package com.javatar.jagex;/* Node - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Calendar;

class Node {
	static Calendar aCalendar885 = Calendar.getInstance();
	static boolean aBool889;
	Node aClass38_890;
	static Class17_Sub1 aClass17_Sub1_891;
	static boolean aBool892;
	static int anInt893 = -1;
	Node aClass38_894;
	static int anInt895;
	static RSString aClass19_896;
	static int anInt897;
	long aLong898;

	final void method330(int i) {
		do {
			try {
				if (this.aClass38_890 != null) {
					this.aClass38_890.aClass38_894 = this.aClass38_894;
					this.aClass38_894.aClass38_890 = this.aClass38_890;
					this.aClass38_890 = null;
					this.aClass38_894 = null;
					if (i == 0)
						break;
					this.aLong898 = -78L;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "v.JB(" + i + ')');
			}
			break;
		} while (false);
	}

	static final ItemDefinition forId(int i, int i_0_) {
		try {
			ItemDefinition class38_sub20_sub6 = (ItemDefinition) Applet_Sub1.aClass83_3633.method591(-28825, i);
			if (i_0_ <= 15)
				return null;
			if (class38_sub20_sub6 != null)
				return class38_sub20_sub6;
			byte[] is = Class38_Sub10_Sub3.aClass17_2833.getFileData(10, i, -125);
			class38_sub20_sub6 = new ItemDefinition();
			class38_sub20_sub6.anInt2778 = i;
			if (is != null)
				class38_sub20_sub6.readValues(new RS2Buffer(is));
			class38_sub20_sub6.method927((byte) 93);
			if (class38_sub20_sub6.anInt2767 != -1)
				class38_sub20_sub6.method936(Node.forId(class38_sub20_sub6.anInt2790, 80), Node.forId(class38_sub20_sub6.anInt2767, 116), -114);
			if (!Class55.aBool1232 && class38_sub20_sub6.aBool2771) {
				class38_sub20_sub6.aClass19Array2789 = null;
				class38_sub20_sub6.team = 0;
				class38_sub20_sub6.aClass19_2808 = Class38_Sub11.aClass19_2083;
				class38_sub20_sub6.aClass19Array2807 = null;
			}
			Applet_Sub1.aClass83_3633.method590(i, (byte) -122, class38_sub20_sub6);
			return class38_sub20_sub6;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "v.MB(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method332(RS2Buffer class38_sub23, byte i) {
		do {
			try {
				byte[] is = new byte[24];
				if (Class38_Sub20_Sub11.aClass16_2923 != null)
					try {
						Class38_Sub20_Sub11.aClass16_2923.method97((byte) -117, 0L);
						int i_1_ = 0;
						Class38_Sub20_Sub11.aClass16_2923.method95(is, 0);
						for (/**/; i_1_ < 24; i_1_++)
							if (is[i_1_] != 0)
								break;
						if (i_1_ >= 24)
							throw new IOException();
					} catch (Exception exception) {
						for (int i_2_ = 0; i_2_ < 24; i_2_++)
							is[i_2_] = (byte) -1;
					}
				class38_sub23.method764(0, i - 25071, 24, is);
				if (i == -83)
					break;
				Node.forId(-78, 99);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "v.LB(" + (class38_sub23 != null ? "{...}" : "null") + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method333(int i) {
		try {
			if (i != 0)
				Node.method332(null, (byte) 86);
			if (this.aClass38_890 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "v.KB(" + i + ')');
		}
	}

	public static void method334(int i) {
		try {
			Node.aClass19_896 = null;
			Node.aClass17_Sub1_891 = null;
			int i_3_ = -27 % ((-57 - i) / 36);
			Node.aCalendar885 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "v.IB(" + i + ')');
		}
	}

	public Node() {
		/* empty */
	}

	static {
		Node.aBool889 = false;
		Node.aClass19_896 = RSString.createRSString("welle2:");
		Node.aBool892 = false;
		Node.anInt897 = 0;
	}
}
