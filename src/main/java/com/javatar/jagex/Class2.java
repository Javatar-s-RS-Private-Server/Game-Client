package com.javatar.jagex;/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

abstract class Class2 {
	int anInt24;
	Image anImage25;
	int anInt26;
	static Class38_Sub6 aClass38_Sub6_27;
	int[] anIntArray28;
	static Class83 aClass83_29;
	static int anInt30;
	static RSString aClass19_33 = RSString.createRSString("Zu viele Anmelde)2Versuche von Ihrer Adresse");
	static int anInt35;
	static RSString aClass19_36;
	static Class17 aClass17_37;
	static RSString aClass19_38;
	static RSString aClass19_39;
	private static RSString aClass19_40;
	static Class38_Sub20_Sub9_Sub3 aClass38_Sub20_Sub9_Sub3_41;

	final void method12(byte i) {
		try {
			if (i < 45)
				Class2.method14(-48);
			Class38_Sub20_Sub9.method957(this.anIntArray28, this.anInt24, this.anInt26);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "gf.L(" + i + ')');
		}
	}

	abstract void method13(Graphics graphics, int i, int i_0_, int i_1_);

	public static void method14(int i) {
		try {
			Class2.aClass19_33 = null;
			if (i != -13532)
				Class2.method14(91);
			Class2.aClass19_36 = null;
			Class2.aClass19_39 = null;
			Class2.aClass19_38 = null;
			Class2.aClass38_Sub6_27 = null;
			Class2.aClass83_29 = null;
			Class2.aClass19_40 = null;
			Class2.aClass17_37 = null;
			Class2.aClass38_Sub20_Sub9_Sub3_41 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "gf.J(" + i + ')');
		}
	}

	protected Class2() {
		/* empty */
	}

	abstract void method15(int i, int i_2_, int i_3_, Component component);

	static final void method16(boolean bool) {
		do {
			try {
				Class38_Sub9.aClass83_2062.method596(38);
				if (!bool)
					break;
				Class2.aClass19_38 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "gf.K(" + bool + ')');
			}
			break;
		} while (false);
	}

	abstract void method17(int i, Graphics graphics, int i_4_, int i_5_, int i_6_, int i_7_);

	static {
		Class2.aClass83_29 = new Class83(50);
		Class2.aClass19_38 = RSString.createRSString("Bitte geben Sie Ihren Benutzenamen ein)3");
		Class2.aClass19_36 = RSString.createRSString(" )2> <col=ff9040>");
		Class2.anInt35 = 0;
		Class2.aClass19_40 = RSString.createRSString("Loading )2 please wait)3");
		Class2.aClass19_39 = Class2.aClass19_40;
	}
}
