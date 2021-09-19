package com.javatar.jagex;/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

final class Class55 {
	private int anInt1210;
	private int anInt1211;
	static int anInt1212 = 0;
	static Class65 aClass65_1213;
	static Class13 aClass13_1215;
	private byte[] aByteArray1216;
	private DataInputStream aDataInputStream1217;
	private byte[] aByteArray1219 = new byte[4];
	private int anInt1220;
	static RSString aClass19_1222;
	static RSString aClass19_1225;
	static int[] anIntArray1227 = new int[128];
	static int anInt1228 = 0;
	private long aLong1229;
	static int[] anIntArray1230;
	private Class65 aClass65_1231;
	static boolean aBool1232;
	static int anInt1233;

	static final int method425(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = Sequence.method909(i - 1, i_1_ - 121, i_0_ - 1) + Sequence.method909(i - 1, i_1_ - 121, i_0_ + 1) - (-Sequence.method909(i + 1, i_1_ - 92, i_0_ - 1) - Sequence.method909(i + 1, -127, i_0_ + 1));
			int i_3_ = Sequence.method909(i, -124, i_1_ + i_0_) + Sequence.method909(i, -115, i_0_ + 1) + Sequence.method909(i - 1, -81, i_0_) + Sequence.method909(i + 1, -84, i_0_);
			int i_4_ = Sequence.method909(i, i_1_ ^ 0x61, i_0_);
			return i_3_ / 8 + i_2_ / 16 + i_4_ / 4;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bc.A(" + i + ',' + i_0_ + ',' + i_1_ + ')');
		}
	}

	final byte[] method426(boolean bool) throws IOException {
		try {
			if (aLong1229 < Class9.method48((byte) -79))
				throw new IOException("fdt");
			if (anInt1220 == 0)
				if (aClass65_1231.anInt1368 != 2) {
					if (aClass65_1231.anInt1368 == 1) {
						anInt1220 = 1;
						aDataInputStream1217 = (DataInputStream) aClass65_1231.anObject1365;
					}
				} else
					throw new IOException("fds");
			if (anInt1220 == 1) {
				int i = aDataInputStream1217.available();
				if (i > 0) {
					if (i + anInt1211 > 4)
						i = -anInt1211 + 4;
					anInt1211 += aDataInputStream1217.read(aByteArray1219, anInt1211, i);
					if (anInt1211 == 4) {
						int i_5_ = new RS2Buffer(aByteArray1219).method759(true);
						aByteArray1216 = new byte[i_5_];
						anInt1220 = 2;
					}
				}
			}
			if (anInt1220 == 2) {
				int i = aDataInputStream1217.available();
				if (i > 0) {
					if (aByteArray1216.length < anInt1210 + i)
						i = aByteArray1216.length - anInt1210;
					anInt1210 += aDataInputStream1217.read(aByteArray1216, anInt1210, i);
					if (aByteArray1216.length == anInt1210)
						return aByteArray1216;
				}
			}
			if (bool)
				Class55.method425(-79, 104, 93);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bc.B(" + bool + ')');
		}
	}

	public static void method427(int i) {
		try {
			int i_6_ = -59 / ((26 - i) / 39);
			Class55.aClass19_1225 = null;
			Class55.aClass13_1215 = null;
			Class55.anIntArray1230 = null;
			Class55.anIntArray1227 = null;
			Class55.aClass65_1213 = null;
			Client.clientFrame = null;
			Class55.aClass19_1222 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bc.C(" + i + ')');
		}
	}

	Class55(Class56 class56, URL url) {
		try {
			aClass65_1231 = class56.method433((byte) 45, url);
			anInt1220 = 0;
			aLong1229 = Class9.method48((byte) -125) + 30000L;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "bc.<init>(" + (class56 != null ? "{...}" : "null") + ',' + (url != null ? "{...}" : "null") + ')');
		}
	}

	static {
		Class55.aClass19_1222 = RSString.createRSString("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");
		Class55.aClass19_1225 = RSString.createRSString("Die Verbindung konnte");
		Class55.anIntArray1230 = new int[32];
		Class55.aClass13_1215 = new Class13();
		Class55.anInt1233 = 1;
	}
}
