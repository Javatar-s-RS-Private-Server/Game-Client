package com.javatar.jagex;/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class14 {
	static Class38_Sub20_Sub9_Sub2[] aClass38_Sub20_Sub9_Sub2Array250;
	private static RSString aClass19_252 = RSString
			.createRSString("To play on this world move to a free area first");
	static RSString aClass19_255;
	private Node aClass38_256;
	static RSString aClass19_257;
	private int anInt258;
	static Class38_Sub20_Sub9_Sub2 aClass38_Sub20_Sub9_Sub2_259;
	private static RSString aClass19_260;
	private long aLong261;
	static RSString aClass19_266 = RSString
			.createRSString("Das ist eine Mitglieder)2Welt(Q");
	static RSString aClass19_267;
	private Node[] aClass38Array268;
	static byte[][] aByteArrayArray269;
	private int anInt270 = 0;
	private Node aClass38_271;

	final Node method75(long l, byte i) {
		try {
			if (i != -106)
				anInt270 = 102;
			aLong261 = l;
			Node Node = aClass38Array268[(int) (l & anInt258 - 1)];
			for (aClass38_256 = Node.aClass38_894; aClass38_256 != Node; aClass38_256 = aClass38_256.aClass38_894)
				if (l == aClass38_256.aLong898) {
					Node class38_0_ = aClass38_256;
					aClass38_256 = aClass38_256.aClass38_894;
					return class38_0_;
				}
			aClass38_256 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wc.A(" + l + ','
					+ i + ')');
		}
	}

	static final void method76(boolean bool) {
		try {
			Class15.inputStream.method784(8);
			int i = Class15.inputStream.method785(1, (byte) 69);
			if (bool == true && i != 0) {
				int i_1_ = Class15.inputStream.method785(2, (byte) 69);
				if (i_1_ == 0)
					ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = 2047;
				else if (i_1_ == 1) {
					int i_2_ = Class15.inputStream.method785(3, (byte) 69);
					Client.myPlayer.move(i_2_, false);
					int i_3_ = Class15.inputStream.method785(1, (byte) 69);
					if (i_3_ == 1)
						ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = 2047;
				} else if (i_1_ == 2) {
					int i_4_ = Class15.inputStream.method785(3, (byte) 69);
					Client.myPlayer.move(i_4_, true);
					int i_5_ = Class15.inputStream.method785(3, (byte) 69);
					Client.myPlayer.move(i_5_, true);
					int i_6_ = Class15.inputStream.method785(1, (byte) 69);
					if (i_6_ == 1)
						ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = 2047;
				} else if (i_1_ == 3) {
					int i_7_ = Class15.inputStream.method785(7, (byte) 69);
					int i_8_ = Class15.inputStream.method785(7, (byte) 69);
					int i_9_ = Class15.inputStream.method785(1, (byte) 69);
					if (i_9_ == 1)
						ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = 2047;
					Client.height = Class15.inputStream.method785(2, (byte) 69);
					int i_10_ = Class15.inputStream.method785(1, (byte) 69);
					Client.myPlayer.updatePosition(i_8_, i_7_, i_10_ == 1);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1
					.method607(runtimeexception, "wc.D(" + bool + ')');
		}
	}

	public static void method77(byte i) {
		try {
			Class14.aClass19_257 = null;
			Class14.aClass19_267 = null;
			Class14.aClass38_Sub20_Sub9_Sub2_259 = null;
			Class14.aByteArrayArray269 = null;
			Class14.aClass19_260 = null;
			Class14.aClass19_266 = null;
			Class14.aClass19_252 = null;
			Class14.aClass19_255 = null;
			int i_11_ = -52 % ((60 - i) / 56);
			Class14.aClass38_Sub20_Sub9_Sub2Array250 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wc.E(" + i + ')');
		}
	}

	final Node method78(int i) {
		try {
			int i_12_ = 70 / ((-22 - i) / 58);
			if (anInt270 > 0 && aClass38Array268[anInt270 - 1] != aClass38_271) {
				Node Node = aClass38_271;
				aClass38_271 = Node.aClass38_894;
				return Node;
			}
			while (anInt270 < anInt258) {
				Node Node = aClass38Array268[anInt270++].aClass38_894;
				if (Node != aClass38Array268[anInt270 - 1]) {
					aClass38_271 = Node.aClass38_894;
					return Node;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wc.C(" + i + ')');
		}
	}

	static final boolean method79(int i, byte i_13_, int i_14_, int i_15_) {
		try {
			int i_16_ = i_15_ >> 210118990 & 0x7fff;
			int i_17_ = RuntimeException_Sub1.aClass27_3292.method224(
					Client.height, i_14_, i, i_15_);
			if (i_17_ == -1)
				return false;
			int i_18_ = i_17_ & 0x1f;
			int i_19_ = i_17_ >> -657328026 & 0x3;
			if (i_18_ != 10 && i_18_ != 11 && i_18_ != 22)
				Client.calculatePath(true, i_19_,
						((Entity) Client.myPlayer).walkQueueY[0], i_18_ + 1, 0,
						i_14_, ((Entity) Client.myPlayer).walkQueueX[0], 0, i,
						0, 2);
			else {
				ObjectDefinition class38_sub20_sub1 = Class80.method581(47,
						i_16_);
				int i_20_;
				int i_21_;
				if (i_19_ == 0 || i_19_ == 2) {
					i_20_ = class38_sub20_sub1.anInt2480;
					i_21_ = class38_sub20_sub1.anInt2469;
				} else {
					i_20_ = class38_sub20_sub1.anInt2469;
					i_21_ = class38_sub20_sub1.anInt2480;
				}
				int i_22_ = class38_sub20_sub1.anInt2439;
				if (i_19_ != 0)
					i_22_ = (i_22_ << i_19_ & 0xf) + (i_22_ >> -i_19_ + 4);
				Client.calculatePath(true, 0,
						((Entity) Client.myPlayer).walkQueueY[0], 0, i_20_,
						i_14_, ((Entity) Client.myPlayer).walkQueueX[0], i_22_,
						i, i_21_, 2);
			}
			if (i_13_ != 90)
				Class14.aClass38_Sub20_Sub9_Sub2_259 = null;
			Class21.anInt523 = Class73.anInt1429;
			Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
			Client.crossIndex = 0;
			Client.crossState = 2;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wc.G(" + i + ','
					+ i_13_ + ',' + i_14_ + ',' + i_15_ + ')');
		}
	}

	final void method80(boolean bool, long l, Node Node) {
		try {
			if (Node.aClass38_890 != null)
				Node.method330(0);
			Node class38_23_ = aClass38Array268[(int) (anInt258 - 1 & l)];
			Node.aClass38_894 = class38_23_;
			if (bool != true)
				Class14.aClass38_Sub20_Sub9_Sub2_259 = null;
			Node.aClass38_890 = class38_23_.aClass38_890;
			Node.aClass38_890.aClass38_894 = Node;
			Node.aClass38_894.aClass38_890 = Node;
			Node.aLong898 = l;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wc.B(" + bool + ','
					+ l + ',' + (Node != null ? "{...}" : "null") + ')');
		}
	}

	final Node method81(byte i) {
		try {
			if (aClass38_256 == null)
				return null;
			if (i != -36)
				Class14.method77((byte) 5);
			for (Node Node = aClass38Array268[(int) (anInt258 - 1 & aLong261)]; aClass38_256 != Node; aClass38_256 = aClass38_256.aClass38_894)
				if (aClass38_256.aLong898 == aLong261) {
					Node class38_24_ = aClass38_256;
					aClass38_256 = aClass38_256.aClass38_894;
					return class38_24_;
				}
			aClass38_256 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wc.H(" + i + ')');
		}
	}

	final Node method82(byte i) {
		try {
			anInt270 = 0;
			if (i <= 49)
				Class14.aClass19_266 = null;
			return method78(-116);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wc.F(" + i + ')');
		}
	}

	Class14(int i) {
		try {
			aClass38Array268 = new Node[i];
			anInt258 = i;
			for (int i_25_ = 0; i_25_ < i; i_25_++) {
				Node Node = aClass38Array268[i_25_] = new Node();
				Node.aClass38_894 = Node;
				Node.aClass38_890 = Node;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wc.<init>(" + i
					+ ')');
		}
	}

	static {
		Class14.aClass19_260 = RSString
				.createRSString("Could not complete login)3");
		Class14.aClass19_257 = Class14.aClass19_252;
		Class14.aClass19_255 = Class14.aClass19_260;
		Class14.aByteArrayArray269 = new byte[50][];
		Class14.aClass19_267 = RSString.createRSString("Okay");
	}
}
