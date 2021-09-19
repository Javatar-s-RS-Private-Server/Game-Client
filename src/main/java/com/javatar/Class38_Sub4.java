package com.javatar;/* Class38_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub4 extends Node {
	static int[] anIntArray1792;
	static Class17 aClass17_1794;
	static int anInt1795;
	static Class56 aClass56_1798;
	static RSString aClass19_1802 = RSString.createRSString("Benutzen Sie die (WPasswort -=ndern(W Option");
	static int anInt1808;
	static RSString aClass19_1810;
	static boolean aBool1811;
	static RSString aClass19_1820;
	static int anInt1827;
	static RSString aClass19_1830;

	static {
		Class38_Sub4.anIntArray1792 = new int[] { 0, 1, 2, 3 };
		Class38_Sub4.anInt1808 = 0;
		Class38_Sub4.aBool1811 = false;
		Class38_Sub4.anInt1795 = -1;
		Class38_Sub4.anInt1827 = 0;
		Client.crossIndex = 0;
		Class38_Sub4.aClass19_1830 = RSString.createRSString("Bitte warten Sie eine Minute");
		Class38_Sub4.aClass19_1820 = RSString.createRSString("<br>");
		Class38_Sub4.aClass19_1810 = RSString.createRSString("http:)4)4");
	}

	Class1 aClass1_1799;
	int anInt1800;
	int anInt1803;
	int anInt1804;
	Class49 aClass49_1805;
	int anInt1806;
	int anInt1807;
	Class3[] aClass3Array1809 = new Class3[5];
	boolean aBool1812;
	int anInt1813 = 0;
	int anInt1814;
	int anInt1815;
	boolean aBool1816;
	Class38_Sub4 aClass38_Sub4_1818;
	Class43 aClass43_1819;
	boolean aBool1821;
	int[] anIntArray1822 = new int[5];
	Class82 aClass82_1823;
	Class28 aClass28_1824;
	int anInt1828;
	Class15 aClass15_1829;
	int anInt1831;
	int anInt1832;

	Class38_Sub4(int i, int i_14_, int i_15_) {
		try {
			this.anInt1815 = i_14_;
			this.anInt1831 = i_15_;
			this.anInt1814 = this.anInt1800 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wa.<init>(" + i + ',' + i_14_ + ',' + i_15_ + ')');
		}
	}

	static final void method623() {
		do {
			try {
				if (Class38_Sub20_Sub8.aClass38_Sub6_2877 == null && (byte) -74 <= -39 && Class15.aClass38_Sub6_293 == null) {
					int i_0_ = Client.lastMouseAction;
					if (SceneModel.aBool2553) {
						if (i_0_ != 1) {
							int i_1_ = Class23.anInt543;
							int i_2_ = Class45.anInt1015;
							if (Class38_Sub6.anInt1976 - 10 > i_1_ || i_1_ > Class38_Sub6.anInt1976 + Class3.anInt66 + 10 || Class38_Sub20_Sub13.anInt3011 - 10 > i_2_ || i_2_ > Class38_Sub20_Sub13.anInt3011 + Class38_Sub20_Sub2.anInt2540 + 10) {
								SceneModel.aBool2553 = false;
								ItemDefinition.method931(106, Class38_Sub6.anInt1976, Class38_Sub20_Sub13.anInt3011, Class3.anInt66, Class38_Sub20_Sub2.anInt2540);
							}
						}
						if (i_0_ == 1) {
							int i_3_ = Class38_Sub6.anInt1976;
							int i_4_ = Class38_Sub20_Sub13.anInt3011;
							int i_5_ = Class3.anInt66;
							int i_6_ = Class73.anInt1429;
							int i_7_ = RS2Buffer.anInt2416;
							int i_8_ = -1;
							for (int i_9_ = 0; Class72.anInt1417 > i_9_; i_9_++) {
								int i_10_ = i_4_ + (-i_9_ + Class72.anInt1417 - 1) * 15 + 31;
								if (i_3_ < i_6_ && i_3_ + i_5_ > i_6_ && i_7_ > i_10_ - 13 && i_10_ + 3 > i_7_)
									i_8_ = i_9_;
							}
							if (i_8_ != -1)
								Class53.method416(105, i_8_);
							SceneModel.aBool2553 = false;
							ItemDefinition.method931(115, Class38_Sub6.anInt1976, Class38_Sub20_Sub13.anInt3011, Class3.anInt66, Class38_Sub20_Sub2.anInt2540);
						}
					} else {
						if (i_0_ == 1 && Class72.anInt1417 > 0) {
							int i_11_ = Class17_Sub1.anIntArray1709[Class72.anInt1417 - 1];
							if (i_11_ == 38 || i_11_ == 15 || i_11_ == 51 || i_11_ == 18 || i_11_ == 41 || i_11_ == 17 || i_11_ == 30 || i_11_ == 7 || i_11_ == 19 || i_11_ == 35 || i_11_ == 21 || i_11_ == 1004) {
								int i_12_ = Class38_Sub20_Sub13.anIntArray3015[Class72.anInt1417 - 1];
								int i_13_ = Class15.anIntArray284[Class72.anInt1417 - 1];
								Class38_Sub6 class38_sub6 = Projectile.method1167(i_13_, -112);
								if (Class53.method415(Class30.method283(-126, class38_sub6)) || Class37.method322(16777215, Class30.method283(-118, class38_sub6))) {
									Class10.anInt188 = 0;
									Class52.aBool1143 = false;
									if (Class38_Sub20_Sub8.aClass38_Sub6_2877 != null)
										Class40.method340(Class38_Sub20_Sub8.aClass38_Sub6_2877, (byte) -107);
									Class38_Sub20_Sub8.aClass38_Sub6_2877 = Projectile.method1167(i_13_, 119);
									Class44.anInt988 = RS2Buffer.anInt2416;
									Class75.anInt1475 = Class73.anInt1429;
									Class38_Sub3.anInt1786 = i_12_;
									Class40.method340(Class38_Sub20_Sub8.aClass38_Sub6_2877, (byte) -111);
									break;
								}
							}
						}
						if (i_0_ == 1 && (Class42.anInt949 == 1 && Class72.anInt1417 > 2 || RSString.method140(Class72.anInt1417 - 1)))
							i_0_ = 2;
						if (i_0_ == 1 && Class72.anInt1417 > 0)
							Class53.method416(94, Class72.anInt1417 - 1);
						if (i_0_ != 2 || Class72.anInt1417 <= 0)
							break;
						Class50.method401();
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "wa.F(" + (byte) -74 + ')');
			}
			break;
		} while (false);
	}

	public static void method624(int i) {
		try {
			Class38_Sub4.aClass17_1794 = null;
			Class38_Sub4.aClass19_1830 = null;
			Class38_Sub4.aClass19_1820 = null;
			Class38_Sub4.aClass56_1798 = null;
			Class38_Sub4.anIntArray1792 = null;
			if (i <= 3)
				Class38_Sub4.aClass19_1830 = null;
			Class38_Sub4.aClass19_1802 = null;
			Class38_Sub4.aClass19_1810 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wa.D(" + i + ')');
		}
	}

	static final void method625(int i, int i_16_, byte i_17_) {
		try {
			if (i_17_ < 6)
				Class38_Sub4.method628(null, 36, 19, -85, false, 21);
			if (Class22.method196(i))
				Canvas_Sub1.method811(Class62.aClass38_Sub6ArrayArray1339[i], i_16_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wa.A(" + i + ',' + i_16_ + ',' + i_17_ + ')');
		}
	}

	static final boolean method626(int i, int i_18_) {
		try {
			if (i <= 71)
				Class38_Sub4.method624(-110);
			return i_18_ >= 48 && i_18_ <= 57;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wa.B(" + i + ',' + i_18_ + ')');
		}
	}

	static final int method627(RSString class19, RS2Buffer class38_sub23) {
		try {
			if ((byte) -48 != -48)
				Class38_Sub4.aClass56_1798 = null;
			int i_19_ = class38_sub23.pos;
			class38_sub23.method766(class19.anInt478, -64);
			class38_sub23.pos += Class41.aClass53_935.method412(0, class19.anInt478, class38_sub23.pos, class19.buffer, class38_sub23.buffer);
			return class38_sub23.pos - i_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wa.E(" + (class19 != null ? "{...}" : "null") + ',' + (byte) -48 + ',' + (class38_sub23 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method628(Class17 class17, int i, int i_20_, int i_21_, boolean bool, int i_22_) {
		try {
			Class61.anInt1335 = i_22_;
			Class13.anInt247 = i_20_;
			Class38_Sub20_Sub8.aClass17_2872 = class17;
			if (i != -1)
				Class38_Sub4.method626(-34, -116);
			Class38_Sub20_Sub14.anInt3039 = i_21_;
			Class38_Sub1.anInt1741 = 1;
			Class38_Sub20_Sub13.aBool3017 = bool;
			Class38_Sub18.anInt2214 = 10000;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wa.C(" + (class17 != null ? "{...}" : "null") + ',' + i + ',' + i_20_ + ',' + i_21_ + ',' + bool + ',' + i_22_ + ')');
		}
	}
}
