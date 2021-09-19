package com.javatar.jagex;/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class83 {
	static int[] anIntArray1650;
	static RSString aClass19_1651 = RSString.createRSString("rect_debug=");
	static int[] anIntArray1652;
	static volatile long aLong1653 = 0L;
	static RSString aClass19_1654;
	static RSString aClass19_1655 = RSString.createRSString(")1p");
	static int[] anIntArray1656;
	static Class38_Sub6 aClass38_Sub6_1657;
	private NodeSub aClass38_Sub20_1658 = new NodeSub();
	static RSString[] aClass19Array1662;
	private static RSString aClass19_1663;
	static int[][] anIntArrayArray1664;
	static RSString aClass19_1665 = RSString.createRSString("sl_arrows");
	static int[] anIntArray1667;
	static int anInt1668;
	static RSString aClass19_1669;
	static int anInt1670;
	static int[] anIntArray1674;
	static int anInt1675;
	static Class13 aClass13_1676;
	static int[] anIntArray1677;
	static int anInt1678;
	static int anInt1679;
	static int[] anIntArray1680;
	private int anInt1681;
	static int[] anIntArray1682;
	private Class26 aClass26_1683 = new Class26();
	private int anInt1684;
	private Class14 aClass14_1685;
	static RSString aClass19_1686;

	static final void method589(int i, int i_0_, int i_1_) {
		do {
			try {
				if (Class42.anInt962 == 2) {
					Class38_Sub20_Sub3_Sub5.method1158((Class5.anInt93 - Client.currentBaseX << -753250265) + Client.anInt3641, (byte) 121, (-Client.currentBaseY + Class32.anInt770 << 1743759559) + Class47.anInt1062, Class38_Sub20_Sub2.anInt2535 * 2);
					if (i_1_ != 28)
						Class83.method595((byte) 108);
					if (Class29.anInt703 <= -1 || Class45.anInt1016 % 20 >= 10)
						break;
					Class59.aClass38_Sub20_Sub9_Sub3Array1301[0].method1105(i - 12 + Class29.anInt703, i_0_ - (-Class38_Sub20_Sub12.anInt3002 + 28));
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ja.F(" + i + ',' + i_0_ + ',' + i_1_ + ')');
			}
			break;
		} while (false);
	}

	final void method590(long l, byte i, NodeSub class38_sub20) {
		try {
			if (i < -117) {
				if (anInt1681 != 0)
					anInt1681--;
				else {
					NodeSub class38_sub20_2_ = aClass26_1683.method219(103);
					class38_sub20_2_.method330(0);
					class38_sub20_2_.method707(false);
					if (aClass38_Sub20_1658 == class38_sub20_2_) {
						class38_sub20_2_ = aClass26_1683.method219(89);
						class38_sub20_2_.method330(0);
						class38_sub20_2_.method707(false);
					}
				}
				aClass14_1685.method80(true, l, class38_sub20);
				aClass26_1683.method217(class38_sub20, 2048);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ja.E(" + l + ',' + i + ',' + (class38_sub20 != null ? "{...}" : "null") + ')');
		}
	}

	final NodeSub method591(int i, long l) {
		try {
			NodeSub class38_sub20 = (NodeSub) aClass14_1685.method75(l, (byte) -106);
			if (i != -28825)
				return null;
			if (class38_sub20 != null)
				aClass26_1683.method217(class38_sub20, 2048);
			return class38_sub20;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ja.B(" + i + ',' + l + ')');
		}
	}

	final void method592(long l, boolean bool) {
		do {
			try {
				if (bool)
					Class83.anIntArray1650 = null;
				NodeSub class38_sub20 = (NodeSub) aClass14_1685.method75(l, (byte) -106);
				if (class38_sub20 == null)
					break;
				class38_sub20.method330(0);
				class38_sub20.method707(false);
				anInt1681++;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ja.H(" + l + ',' + bool + ')');
			}
			break;
		} while (false);
	}

	static final void method593(byte i) {
		try {
			Applet_Sub1.aClass83_3633.method596(94);
			Class2.aClass83_29.method596(-124);
			if (i <= -27)
				PacketBuffer.aClass83_2433.method596(-126);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ja.D(" + i + ')');
		}
	}

	public static void method594(byte i) {
		do {
			try {
				Class83.aClass19_1665 = null;
				Class83.anIntArray1682 = null;
				Class83.aClass38_Sub6_1657 = null;
				Class83.aClass19_1655 = null;
				Class83.anIntArrayArray1664 = null;
				Class83.aClass19_1686 = null;
				Class83.anIntArray1650 = null;
				Class83.anIntArray1677 = null;
				Class83.anIntArray1652 = null;
				Class83.aClass19_1663 = null;
				Class83.aClass19Array1662 = null;
				Class83.aClass13_1676 = null;
				Class83.aClass19_1654 = null;
				Class83.aClass19_1669 = null;
				Class83.anIntArray1656 = null;
				Class83.anIntArray1667 = null;
				Class83.anIntArray1680 = null;
				Class83.aClass19_1651 = null;
				Class83.anIntArray1674 = null;
				if (i == 64)
					break;
				Class83.aClass19_1665 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ja.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method595(byte i) {
		do {
			try {
				synchronized (Class38_Sub14.anObject2126) {
					if (Node.anInt897 != 0) {
						Node.anInt897 = 1;
						try {
							Class38_Sub14.anObject2126.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				if (i == -11)
					break;
				Class83.method589(-29, -50, -47);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ja.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method596(int i) {
		try {
			for (;;) {
				NodeSub class38_sub20 = aClass26_1683.method219(125);
				if (class38_sub20 == null)
					break;
				class38_sub20.method330(0);
				class38_sub20.method707(false);
			}
			anInt1681 = anInt1684;
			int i_3_ = -87 % ((-27 - i) / 48);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ja.G(" + i + ')');
		}
	}

	Class83(int i) {
		try {
			int i_4_ = 1;
			anInt1681 = i;
			anInt1684 = i;
			for (/**/; i_4_ + i_4_ < i; i_4_ += i_4_) {
				/* empty */
			}
			aClass14_1685 = new Class14(i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ja.<init>(" + i + ')');
		}
	}

	static {
		Class83.aClass19_1663 = RSString.createRSString("Loading sprites )2 ");
		Class83.anInt1675 = -1;
		Class83.aClass19_1654 = RSString.createRSString("Bitte entfernen Sie ");
		Class83.aClass19_1669 = Class83.aClass19_1663;
		Class83.anInt1670 = 50;
		Class83.anIntArray1674 = new int[Class83.anInt1670];
		Class83.aClass19Array1662 = new RSString[Class83.anInt1670];
		Class83.anIntArray1680 = new int[Class83.anInt1670];
		Class83.anIntArray1677 = new int[Class83.anInt1670];
		Class83.anInt1679 = 0;
		Class83.anIntArray1667 = new int[Class83.anInt1670];
		Class83.anIntArray1682 = new int[Class83.anInt1670];
		Class83.anIntArray1656 = new int[Class83.anInt1670];
		Class83.anIntArray1650 = new int[Class83.anInt1670];
		Class83.aClass13_1676 = new Class13();
		Class83.aClass19_1686 = RSString.createRSString("Sie haben gerade eine andere Welt verlassen)3");
	}
}
