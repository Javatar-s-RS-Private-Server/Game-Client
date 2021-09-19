package com.javatar.jagex;/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class3 {
	static int anInt44;
	int anInt45;
	int anInt46;
	static Class38_Sub20_Sub9_Sub3 aClass38_Sub20_Sub9_Sub3_47;
	int anInt48;
	int anInt49;
	static Class83 aClass83_50;
	int anInt51;
	SceneModel aClass38_Sub20_Sub3_53;
	int anInt54 = 0;
	int anInt55;
	int anInt56;
	int anInt57;
	int anInt58;
	int anInt59;
	int anInt60;
	int anInt62 = 0;
	static int anInt63;
	static boolean[] aBoolArray64;
	static RSString aClass19_65;
	static int anInt66;
	static int[] anIntArray67;
	static RSString aClass19_68;
	static RSString aClass19_69;
	private static RSString aClass19_70;
	static Class13 aClass13_71;
	static RSString aClass19_72;

	static final void method18(byte i, int i_0_) {
		try {
			if (i != 68)
				Class3.anIntArray67 = null;
			Class38_Sub3 class38_sub3 = (Class38_Sub3) Class38_Sub20_Sub8.aClass14_2863.method75(i_0_);
			if (class38_sub3 != null)
				class38_sub3.method330(0);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "gb.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method19(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		do {
			try {
				for (Class38_Sub1 class38_sub1 = (Class38_Sub1) Class83.aClass13_1676.method65(103); class38_sub1 != null; class38_sub1 = (Class38_Sub1) Class83.aClass13_1676.method63(-3))
					if (class38_sub1.anInt1753 != -1 || class38_sub1.anIntArray1723 != null) {
						int i_5_ = 0;
						if (i_1_ <= class38_sub1.anInt1733) {
							if (i_1_ < class38_sub1.anInt1734)
								i_5_ += class38_sub1.anInt1734 - i_1_;
						} else
							i_5_ += i_1_ - class38_sub1.anInt1733;
						if (class38_sub1.anInt1726 < i)
							i_5_ += i - class38_sub1.anInt1726;
						else if (class38_sub1.anInt1754 > i)
							i_5_ += -i + class38_sub1.anInt1754;
						if (class38_sub1.anInt1738 < i_5_ - 64 || Class77.anInt1505 == 0 || i_4_ != class38_sub1.anInt1729) {
							if (class38_sub1.aClass38_Sub10_Sub2_1725 != null) {
								Class38_Sub9.aClass38_Sub10_Sub4_2057.method1014(class38_sub1.aClass38_Sub10_Sub2_1725);
								class38_sub1.aClass38_Sub10_Sub2_1725 = null;
							}
							if (class38_sub1.aClass38_Sub10_Sub2_1749 != null) {
								Class38_Sub9.aClass38_Sub10_Sub4_2057.method1014(class38_sub1.aClass38_Sub10_Sub2_1749);
								class38_sub1.aClass38_Sub10_Sub2_1749 = null;
							}
						} else {
							i_5_ -= 64;
							if (i_5_ < 0)
								i_5_ = 0;
							int i_6_ = (-i_5_ + class38_sub1.anInt1738) * Class77.anInt1505 / class38_sub1.anInt1738;
							if (class38_sub1.aClass38_Sub10_Sub2_1725 != null)
								class38_sub1.aClass38_Sub10_Sub2_1725.method882(i_6_);
							else if (class38_sub1.anInt1753 >= 0) {
								Class68 class68 = Class68.method484(Class33.aClass17_Sub1_784, class38_sub1.anInt1753, 0);
								if (class68 != null) {
									Class38_Sub16_Sub1 class38_sub16_sub1 = class68.method483().method996(Class38_Sub20_Sub12.aClass20_3008);
									Class38_Sub10_Sub2 class38_sub10_sub2 = Class38_Sub10_Sub2.method878(class38_sub16_sub1, 100, i_6_);
									class38_sub10_sub2.method876(-1);
									Class38_Sub9.aClass38_Sub10_Sub4_2057.method1019(class38_sub10_sub2);
									class38_sub1.aClass38_Sub10_Sub2_1725 = class38_sub10_sub2;
								}
							}
							if (class38_sub1.aClass38_Sub10_Sub2_1749 == null) {
								if (class38_sub1.anIntArray1723 != null && (class38_sub1.anInt1747 -= i_2_) <= 0) {
									int i_7_ = (int) (Math.random() * class38_sub1.anIntArray1723.length);
									Class68 class68 = Class68.method484(Class33.aClass17_Sub1_784, class38_sub1.anIntArray1723[i_7_], 0);
									if (class68 != null) {
										Class38_Sub16_Sub1 class38_sub16_sub1 = class68.method483().method996(Class38_Sub20_Sub12.aClass20_3008);
										Class38_Sub10_Sub2 class38_sub10_sub2 = Class38_Sub10_Sub2.method878(class38_sub16_sub1, 100, i_6_);
										class38_sub10_sub2.method876(0);
										Class38_Sub9.aClass38_Sub10_Sub4_2057.method1019(class38_sub10_sub2);
										class38_sub1.anInt1747 = (int) (Math.random() * (class38_sub1.anInt1727 - class38_sub1.anInt1722)) + class38_sub1.anInt1722;
										class38_sub1.aClass38_Sub10_Sub2_1749 = class38_sub10_sub2;
									}
								}
							} else {
								class38_sub1.aClass38_Sub10_Sub2_1749.method882(i_6_);
								if (!class38_sub1.aClass38_Sub10_Sub2_1749.method333(i_3_))
									class38_sub1.aClass38_Sub10_Sub2_1749 = null;
							}
						}
					}
				if (i_3_ == 0)
					break;
				Class3.method21((byte) 69);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "gb.A(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')');
			}
			break;
		} while (false);
	}

	static final Class method20(String string, int i) throws ClassNotFoundException {
		try {
			if (string.equals("B"))
				return Byte.TYPE;
			if (string.equals("I"))
				return Integer.TYPE;
			if (i > -66)
				Class3.anInt66 = 3;
			if (string.equals("S"))
				return Short.TYPE;
			if (string.equals("J"))
				return Long.TYPE;
			if (string.equals("Z"))
				return Boolean.TYPE;
			if (string.equals("F"))
				return Float.TYPE;
			if (string.equals("D"))
				return Double.TYPE;
			if (string.equals("C"))
				return Character.TYPE;
			return Class.forName(string);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "gb.B(" + (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method21(byte i) {
		try {
			Class3.anIntArray67 = null;
			Class3.aClass19_69 = null;
			Class3.aClass19_72 = null;
			int i_8_ = -75 / ((-24 - i) / 41);
			Class3.aClass38_Sub20_Sub9_Sub3_47 = null;
			Class3.aClass19_68 = null;
			Class3.aClass13_71 = null;
			Class3.aClass19_70 = null;
			Class3.aClass19_65 = null;
			Class3.aBoolArray64 = null;
			Class3.aClass83_50 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "gb.D(" + i + ')');
		}
	}

	public Class3() {
		/* empty */
	}

	static {
		Class3.aClass83_50 = new Class83(20);
		Class3.anInt63 = 0;
		Class3.aBoolArray64 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
		Class3.aClass19_70 = RSString.createRSString("glow1:");
		Class3.aClass19_68 = Class3.aClass19_70;
		Class3.aClass19_65 = RSString.createRSString("<col=ff7000>");
		Class3.anIntArray67 = new int[] { 0, 0, -2, 0, -2, 6, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 5, 2, 0, 0, 0, 0, 3, -2, 0, 0, -2, 0, 8, 2, 0, -2, -2, 0, 0, 3, 11, 0, 0, 0, 0, -2, 0, 0, 0, 6, 0, 6, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 3, -2, 0, 6, -1, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, -2, 0, 0, 10, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, 7, 0, 4, -2, 0, 2, 0, 1, 7, 5, 0, 0, 2, 0, 0, 0, 24, 6, 0, 1, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 7, 0, 0, 0, 6, 0, 0, 0, 0, 4, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 14, 0, 0, 0, 0, -2, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 2, 6, 6, 6, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -2, 6, 0, 0, 0, 0, 4, -1, 8, 0, 0, 0, 0, 6, 0, 0, 4, 0, 0, 0, 0, 0, 0, 4, 0 };
		Class3.aClass19_69 = Class3.aClass19_70;
		Class3.aClass13_71 = new Class13();
		Class3.aClass19_72 = RSString.createRSString("lila:");
	}
}
