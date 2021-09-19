package com.javatar.jagex;/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.math.BigInteger;

final class Class78 {
	static RSString aClass19_1544 = RSString.createRSString(")3");
	static int anInt1545;
	static Class83 aClass83_1547;
	private static RSString aClass19_1549 = RSString.createRSString("Press (Wrecover a locked account(W on front page)3");
	static RSString aClass19_1551 = Class78.aClass19_1549;
	static BigInteger aBigInteger1553;
	static RSString aClass19_1554;
	static Class17_Sub1 aClass17_Sub1_1555;
	static RSString aClass19_1556;
	static RSString aClass19_1557;
	private static RSString aClass19_1558;
	static RSString aClass19_1559;
	static RSString aClass19_1560;
	static int anInt1561;

	static final RSString method564(boolean bool, int i) {
		try {
			if (bool != true)
				return null;
			RSString class19 = new RSString();
			class19.buffer = new byte[i];
			class19.anInt478 = 0;
			return class19;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jb.B(" + bool + ',' + i + ')');
		}
	}

	public static void method565(boolean bool) {
		try {
			Class78.aBigInteger1553 = null;
			Class78.aClass19_1556 = null;
			Class78.aClass19_1557 = null;
			Class78.aClass83_1547 = null;
			Class78.aClass19_1549 = null;
			Class78.aClass19_1551 = null;
			Class78.aClass17_Sub1_1555 = null;
			Class78.aClass19_1554 = null;
			Class78.aClass19_1559 = null;
			if (bool == true) {
				Class78.aClass19_1544 = null;
				Class78.aClass19_1560 = null;
				Class78.aClass19_1558 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jb.A(" + bool + ')');
		}
	}

	static final void method566(int i, int i_0_) {
		try {
			if (i != -1 && Class22.loadWidget(i)) {
				WidgetComponent[] class38_sub6s = Class62.widgets[i];
				int i_1_ = 0;
				if (i_0_ >= 16)
					for (/**/; i_1_ < class38_sub6s.length; i_1_++) {
						WidgetComponent class38_sub6 = class38_sub6s[i_1_];
						if (class38_sub6.anObjectArray1980 != null) {
							Class38_Sub19 class38_sub19 = new Class38_Sub19();
							class38_sub19.aClass38_Sub6_2241 = class38_sub6;
							class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1980;
							Class15.method84(class38_sub19, (byte) -74);
						}
					}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jb.C(" + i + ',' + i_0_ + ')');
		}
	}

	static final Class77 method567(Class56 class56, int i, int i_2_, byte i_3_, Component component) {
		try {
			if (Class38_Sub20_Sub7.anInt2852 == 0)
				throw new IllegalStateException();
			if (i < 0 || i >= 2)
				throw new IllegalArgumentException();
			if (i_2_ < 256)
				i_2_ = 256;
			try {
				Class77 class77 = (Class77) Class.forName("md").newInstance();
				class77.anInt1538 = i_2_;
				class77.anIntArray1515 = new int[256 * (!Class37.aBool880 ? 1 : 2)];
				class77.method553(component);
				class77.anInt1539 = (i_2_ & ~0x3ff) + 1024;
				if (class77.anInt1539 > 16384)
					class77.anInt1539 = 16384;
				class77.method554(class77.anInt1539);
				if (RSString.anInt456 > 0 && Class40.aClass21_916 == null) {
					Class40.aClass21_916 = new Class21();
					Class40.aClass21_916.aClass56_509 = class56;
					class56.method430(RSString.anInt456, Class40.aClass21_916, i_3_ ^ 0x4b);
				}
				if (Class40.aClass21_916 != null) {
					if (Class40.aClass21_916.aClass77Array511[i] != null)
						throw new IllegalArgumentException();
					Class40.aClass21_916.aClass77Array511[i] = class77;
				}
				return class77;
			} catch (Throwable throwable) {
				try {
					Class77_Sub2 class77_sub2 = new Class77_Sub2(class56, i);
					((Class77) class77_sub2).anInt1538 = i_2_;
					if (i_3_ != 62)
						Class78.aClass17_Sub1_1555 = null;
					((Class77) class77_sub2).anIntArray1515 = new int[256 * (!Class37.aBool880 ? 1 : 2)];
					class77_sub2.method553(component);
					((Class77) class77_sub2).anInt1539 = 16384;
					class77_sub2.method554(((Class77) class77_sub2).anInt1539);
					if (RSString.anInt456 > 0 && Class40.aClass21_916 == null) {
						Class40.aClass21_916 = new Class21();
						Class40.aClass21_916.aClass56_509 = class56;
						class56.method430(RSString.anInt456, Class40.aClass21_916, 112);
					}
					if (Class40.aClass21_916 != null) {
						if (Class40.aClass21_916.aClass77Array511[i] != null)
							throw new IllegalArgumentException();
						Class40.aClass21_916.aClass77Array511[i] = class77_sub2;
					}
					return class77_sub2;
				} catch (Throwable throwable_4_) {
					return new Class77();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "jb.D(" + (class56 != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ',' + i_3_ + ',' + (component != null ? "{...}" : "null") + ')');
		}
	}

	static {
		Class78.aClass83_1547 = new Class83(100);
		Class78.aClass19_1554 = RSString.createRSString("p12_full");
		Class78.aBigInteger1553 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		Class78.aClass19_1558 = RSString.createRSString("No response from server)3");
		Class78.aClass19_1557 = Class78.aClass19_1558;
		Class78.aClass19_1560 = RSString.createRSString("<col=c0ff00>");
		Class78.aClass19_1559 = RSString.createRSString(")3runescape)3com");
		Class78.aClass19_1556 = RSString.createRSString("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");
		Class78.anInt1561 = 0;
	}
}
