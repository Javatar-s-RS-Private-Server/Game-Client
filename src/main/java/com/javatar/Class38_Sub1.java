package com.javatar;/* Class38_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub1 extends Node {
	static Class17_Sub1 indexScripts;
	static Class38_Sub20_Sub9_Sub2[] aClass38_Sub20_Sub9_Sub2Array1730;
	static Class38_Sub6[] aClass38_Sub6Array1731;
	static Class17 aClass17_1735;
	static long aLong1737;
	static Class38_Sub20_Sub9_Sub2 aClass38_Sub20_Sub9_Sub2_1740;
	static int anInt1741;
	static int[] anIntArray1742;
	static int[] anIntArray1744 = { 45, 23, 50, 29, 44, 48, 16, 6 };
	static long aLong1745;
	static Class17_Sub1 indexTrack2;
	static int anInt1748;
	static int[] anIntArray1751;
	static RSString aClass19_1752 = RSString.createRSString("Wordpack geladen)3");
	static RSString aClass19_1755;
	private static RSString aClass19_1732 = RSString.createRSString("go back to the main RuneScape webpage");

	static {
		Class38_Sub1.anInt1741 = 0;
		Class38_Sub1.anInt1748 = 0;
		Class38_Sub1.anIntArray1742 = new int[] { 1, 1, 1, 1 };
		Class38_Sub1.aClass19_1755 = Class38_Sub1.aClass19_1732;
	}

	int anInt1722;
	int[] anIntArray1723;
	Class38_Sub10_Sub2 aClass38_Sub10_Sub2_1725;
	int anInt1726;
	int anInt1727;
	ObjectDefinition aClass38_Sub20_Sub1_1728;
	int anInt1729;
	int anInt1733;
	int anInt1734;
	int anInt1738;
	int anInt1747;
	Class38_Sub10_Sub2 aClass38_Sub10_Sub2_1749;
	int anInt1753;
	int anInt1754;

	static final void method606(Class17 class17, int i) {
		do {
			try {
				Class2.aClass17_37 = class17;
				if (i < -96)
					break;
				Class38_Sub1.method606(null, -34);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "oa.C(" + (class17 != null ? "{...}" : "null") + ',' + i + ')');
			}
			break;
		} while (false);
	}

	static final RuntimeException_Sub1 method607(Throwable throwable, String string) {
		RuntimeException_Sub1 runtimeexception_sub1;
		if (throwable instanceof RuntimeException_Sub1) {
			runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			runtimeexception_sub1.aString3278 += ' ' + string;
		} else
			runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
		return runtimeexception_sub1;
	}

	public static void method608(boolean bool) {
		do {
			try {
				Class38_Sub1.indexScripts = null;
				Class38_Sub1.aClass19_1732 = null;
				Class38_Sub1.anIntArray1744 = null;
				Class38_Sub1.aClass19_1752 = null;
				Class38_Sub1.aClass17_1735 = null;
				Class38_Sub1.indexTrack2 = null;
				Class38_Sub1.anIntArray1751 = null;
				Class38_Sub1.aClass38_Sub20_Sub9_Sub2Array1730 = null;
				Class38_Sub1.anIntArray1742 = null;
				Class38_Sub1.aClass19_1755 = null;
				Class38_Sub1.aClass38_Sub20_Sub9_Sub2_1740 = null;
				Class38_Sub1.aClass38_Sub6Array1731 = null;
				if (bool)
					break;
				Class38_Sub1.method610(48);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "oa.A(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final int method610(int i) {
		try {
			if (!true)
				Class38_Sub1.aClass38_Sub20_Sub9_Sub2_1740 = null;
			return (i & 0x1f976) >> 11;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "oa.D(" + true + ',' + i + ')');
		}
	}

	final void method609() {
		do {
			try {
				int i_0_ = this.anInt1753;
				ObjectDefinition class38_sub20_sub1 = this.aClass38_Sub20_Sub1_1728.method805((byte) -17);
				if (13492 == 13492) {
					if (class38_sub20_sub1 != null) {
						this.anInt1727 = class38_sub20_sub1.anInt2497;
						this.anInt1722 = class38_sub20_sub1.anInt2506;
						this.anInt1753 = class38_sub20_sub1.anInt2503;
						this.anIntArray1723 = class38_sub20_sub1.anIntArray2465;
						this.anInt1738 = class38_sub20_sub1.anInt2487 * 128;
					} else {
						this.anInt1753 = -1;
						this.anIntArray1723 = null;
						this.anInt1722 = 0;
						this.anInt1738 = 0;
						this.anInt1727 = 0;
					}
					if (this.anInt1753 == i_0_ || this.aClass38_Sub10_Sub2_1725 == null)
						break;
					Class38_Sub9.aClass38_Sub10_Sub4_2057.method1014(this.aClass38_Sub10_Sub2_1725);
					this.aClass38_Sub10_Sub2_1725 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "oa.E(" + 13492 + ')');
			}
			break;
		} while (false);
	}
}
