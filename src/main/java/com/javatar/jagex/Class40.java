package com.javatar.jagex;/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class40 implements Runnable {
	boolean aBool907 = true;
	Object lock = new Object();
	int[] mouseXCache;
	int cacheIndex = 0;
	static Class14 aClass14_914 = new Class14(4096);
	int[] mouseYCache;
	static Class21 aClass21_916;
	static Class48 aClass48_917;
	static int anInt918 = 0;
	static int[] anIntArray919;
	static RSString aClass19_920 = RSString.createRSString("null");
	static Class38_Sub20_Sub9_Sub2[] aClass38_Sub20_Sub9_Sub2Array921;

	static final Class17_Sub1 method339(int i, byte i_0_, boolean bool, boolean bool_1_, boolean bool_2_) {
		try {
			if (i_0_ < 118)
				return null;
			Class48 class48 = null;
			if (Class17_Sub1.aClass16_1707 != null)
				class48 = new Class48(i, Class17_Sub1.aClass16_1707, Class43.aClass16Array982[i], 1000000);
			return new Class17_Sub1(class48, Class40.aClass48_917, i, bool_1_, bool_2_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "t.E(" + i + ',' + i_0_ + ',' + bool + ',' + bool_1_ + ',' + bool_2_ + ')');
		}
	}

	static final void method340(Class38_Sub6 class38_sub6, byte i) {
		do {
			try {
				if (class38_sub6.anInt1953 == Class17.anInt367)
					Class32.aBoolArray768[class38_sub6.anInt1936] = true;
				if (i <= -99)
					break;
				Class40.anIntArray919 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "t.A(" + (class38_sub6 != null ? "{...}" : "null") + ',' + i + ')');
			}
			break;
		} while (false);
	}

	@Override
	public final void run() {
		try {
			while (this.aBool907) {
				synchronized (this.lock) {
					if (this.cacheIndex < 500) {
						this.mouseXCache[this.cacheIndex] = Class23.anInt543;
						this.mouseYCache[this.cacheIndex] = Class45.anInt1015;
						this.cacheIndex++;
					}
				}
				Canvas_Sub1.method809(50L, -27166);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "t.run(" + ')');
		}
	}

	static final void method341(int i) {
		try {
			if (Class38_Sub11.aClass60_2099 != null)
				synchronized (Class38_Sub11.aClass60_2099) {
					Class38_Sub11.aClass60_2099 = null;
				}
			if (i < 16)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "t.C(" + i + ')');
		}
	}

	public static void method342(boolean bool) {
		try {
			if (bool)
				Class40.aClass21_916 = null;
			Class40.aClass21_916 = null;
			Class40.aClass14_914 = null;
			Class40.anIntArray919 = null;
			Class40.aClass38_Sub20_Sub9_Sub2Array921 = null;
			Class40.aClass19_920 = null;
			Class40.aClass48_917 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "t.B(" + bool + ')');
		}
	}

	static final Class2 method343(int i, int i_3_, Component component, int i_4_) {
		try {
			int i_5_ = 83 / ((-48 - i_4_) / 52);
			try {
				Class var_class = Class.forName("ca");
				Class2 class2 = (Class2) var_class.newInstance();
				class2.method15(-33, i, i_3_, component);
				return class2;
			} catch (Throwable throwable) {
				Class2_Sub1 class2_sub1 = new Class2_Sub1();
				class2_sub1.method15(-96, i, i_3_, component);
				return class2_sub1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "t.D(" + i + ',' + i_3_ + ',' + (component != null ? "{...}" : "null") + ',' + i_4_ + ')');
		}
	}

	public Class40() {
		this.mouseXCache = new int[500];
		this.mouseYCache = new int[500];
	}
}
