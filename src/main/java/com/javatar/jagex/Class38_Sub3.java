package com.javatar.jagex;/* Class38_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class38_Sub3 extends Node {
	static int anInt1776;
	static RSString aClass19_1777 = RSString.createRSString(" loggt sich ein)3");
	int[] anIntArray1779 = new int[1];
	static int anInt1780;
	int[] anIntArray1781 = { -1 };
	static Canvas aCanvas1783;
	private static RSString aClass19_1785 = RSString.createRSString("Your ignore list is full)3 Max of 100 users)3");
	static int anInt1786;
	static RSString aClass19_1787;
	static RSString aClass19_1788;
	static RSString aClass19_1789;
	static RSString aClass19_1791;

	static int setClippingFlag(int i, int i_0_) {
		try {
			return i | i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pc.D(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method619(int i, int i_1_) {
		do {
			try {
				for (Class38_Sub11 class38_sub11 = (Class38_Sub11) Entity.aClass14_3514.method82((byte) 69); class38_sub11 != null; class38_sub11 = (Class38_Sub11) Entity.aClass14_3514.method78(76))
					if (i_1_ == (((Node) class38_sub11).aLong898 >> 504136624 & 0xffffL))
						class38_sub11.method330(0);
				if (i == 4590)
					break;
				Class38_Sub3.method621(null, -35, -125, 118, -44, null, -115);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "pc.A(" + i + ',' + i_1_ + ')');
			}
			break;
		} while (false);
	}

	static final void method620(byte i) {
		try {
			Class40.anIntArray919 = new int[33];
			WidgetComponent.anIntArray1967 = new int[33];
			Class81.anIntArray1625 = new int[151];
			Class38_Sub1.anIntArray1751 = new int[151];
			for (int i_2_ = 0; i_2_ < 33; i_2_++) {
				int i_3_ = 999;
				int i_4_ = 0;
				for (int i_5_ = 0; i_5_ < 34; i_5_++)
					if (Class64.aClass38_Sub20_Sub9_Sub2_1359.aByteArray3239[Class64.aClass38_Sub20_Sub9_Sub2_1359.anInt3242 * i_2_ + i_5_] == 0) {
						if (i_3_ == 999)
							i_3_ = i_5_;
					} else if (i_3_ != 999) {
						i_4_ = i_5_;
						break;
					}
				WidgetComponent.anIntArray1967[i_2_] = i_3_;
				Class40.anIntArray919[i_2_] = i_4_ - i_3_;
			}
			int i_6_ = 5;
			if (i != -77)
				Class38_Sub3.method622((byte) 50);
			for (/**/; i_6_ < 156; i_6_++) {
				int i_7_ = 999;
				int i_8_ = 0;
				for (int i_9_ = 25; i_9_ < 172; i_9_++)
					if (Class64.aClass38_Sub20_Sub9_Sub2_1359.aByteArray3239[i_9_ + Class64.aClass38_Sub20_Sub9_Sub2_1359.anInt3242 * i_6_] != 0 || i_9_ <= 34 && i_6_ <= 34) {
						if (i_7_ != 999) {
							i_8_ = i_9_;
							break;
						}
					} else if (i_7_ == 999)
						i_7_ = i_9_;
				Class38_Sub1.anIntArray1751[i_6_ - 5] = i_7_ - 25;
				Class81.anIntArray1625[i_6_ - 5] = i_8_ - i_7_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pc.B(" + i + ')');
		}
	}

	static final void method621(byte[] is, int i, int i_10_, int i_11_, int i_12_, Class74[] class74s, int i_13_) {
		try {
			for (int i_14_ = 0; i_14_ < 4; i_14_++)
				for (int i_15_ = 0; i_15_ < 64; i_15_++)
					for (int i_16_ = 0; i_16_ < 64; i_16_++)
						if (i_15_ + i_13_ > 0 && i_15_ + i_13_ < 103 && i_10_ + i_16_ > 0 && i_10_ + i_16_ < 103)
							class74s[i_14_].clippingFlags[i_15_ + i_13_][i_16_ + i_10_] = Class38_Sub10_Sub3.method941(class74s[i_14_].clippingFlags[i_15_ + i_13_][i_16_ + i_10_], -16777217);
			RS2Buffer class38_sub23 = new RS2Buffer(is);
			int i_17_ = 0;
			if (i_11_ != 12809)
				Class38_Sub3.aCanvas1783 = null;
			for (/**/; i_17_ < 4; i_17_++)
				for (int i_18_ = 0; i_18_ < 64; i_18_++)
					for (int i_19_ = 0; i_19_ < 64; i_19_++)
						Class48.method392(class38_sub23, i_17_, i, -32565, 0, i_10_ + i_19_, i_13_ + i_18_, i_12_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pc.E(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + (class74s != null ? "{...}" : "null") + ',' + i_13_ + ')');
		}
	}

	public static void method622(byte i) {
		try {
			int i_20_ = -110 % ((-30 - i) / 44);
			Class38_Sub3.aClass19_1789 = null;
			Client.heldKeys = null;
			Class38_Sub3.aClass19_1777 = null;
			Class38_Sub3.aClass19_1785 = null;
			Class38_Sub3.aClass19_1788 = null;
			Class38_Sub3.aClass19_1791 = null;
			Class38_Sub3.aClass19_1787 = null;
			Class38_Sub3.aCanvas1783 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pc.C(" + i + ')');
		}
	}

	public Class38_Sub3() {
		/* empty */
	}

	static {
		Class38_Sub3.anInt1776 = 0;
		Class38_Sub3.anInt1786 = 0;
		Class38_Sub3.aClass19_1787 = RSString.createRSString("Verbindung mit Update)2Server)3)3)3");
		Class38_Sub3.aClass19_1788 = RSString.createRSString("Bitte starten Sie eine Mitgliedschaft");
		Client.heldKeys = new boolean[112];
		Class38_Sub3.aClass19_1791 = RSString.createRSString("Ihr Spielkonto wurde deaktiviert)3");
		Class38_Sub3.aClass19_1789 = Class38_Sub3.aClass19_1785;
	}
}
