package com.javatar.jagex;/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class Canvas_Sub1 extends Canvas {
	static Class38_Sub20_Sub9_Sub2[] aClass38_Sub20_Sub9_Sub2Array2511;
	static RSString aClass19_2512 = RSString.createRSString("oder ung-Ultiges Passwort)3");
	static RSString aClass19_2513 = RSString.createRSString("Ung-Ultiger Benutzername");
	private static RSString aClass19_2516;
	static RSString aClass19_2518 = RSString.createRSString("ams");
	static RSString aClass19_2519;
	private static RSString aClass19_2520;
	static RSString aClass19_2521;
	static RSString aClass19_2522;
	static int anInt2523 = (int) (Math.random() * 17.0) - 8;
	static Class38_Sub20_Sub9_Sub1_Sub1 aClass38_Sub20_Sub9_Sub1_Sub1_2525;
	private Component aComponent2526;
	static short[][] aShortArrayArray2527;
	static int anInt2529 = 0;

	@Override
	public final void paint(Graphics graphics) {
		try {
			aComponent2526.paint(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "he.paint(" + (graphics != null ? "{...}" : "null") + ')');
		}
	}

	static final void method808(int i, int i_0_) {
		try {
			if (i != 0)
				Canvas_Sub1.aClass19_2518 = null;
			if (Class48.anInt1069 != i_0_) {
				if (Class48.anInt1069 == 0)
					Class44.method372((byte) -96);
				if (i_0_ == 20 || i_0_ == 40) {
					Class40.anInt918 = 0;
					Class38_Sub12.anInt2118 = 0;
					Class9.anInt154 = 0;
				}
				if (i_0_ != 20 && i_0_ != 40 && Class60.aClass31_1306 != null) {
					Class60.aClass31_1306.method292(114);
					Class60.aClass31_1306 = null;
				}
				if (Class48.anInt1069 == 25) {
					ObjectDefinition.anInt2455 = 1;
					Class38_Sub9.anInt2059 = 1;
					Class72.anInt1407 = 0;
					Class38_Sub9.anInt2055 = 0;
					Class16.anInt320 = 0;
				}
				if (i_0_ != 5 && i_0_ != 10 && i_0_ != 20)
					Class38_Sub21.method715((byte) -120);
				else
					Class76.method544(Class52.aClass17_Sub1_1151, (byte) -106, Class17.aClass17_Sub1_376, Class38_Sub3.aCanvas1783);
				Class48.anInt1069 = i_0_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "he.E(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method809(long l, int i) {
		try {
			if (i == -27166 && l > 0L)
				if (l % 10L != 0L)
					Class38_Sub18.method702(-126, l);
				else {
					Class38_Sub18.method702(i + 27064, l + -1L);
					Class38_Sub18.method702(-99, 1L);
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "he.A(" + l + ',' + i + ')');
		}
	}

	@Override
	public final void update(Graphics graphics) {
		try {
			aComponent2526.update(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "he.update(" + (graphics != null ? "{...}" : "null") + ')');
		}
	}

	static final void method810(boolean bool, byte[] is) {
		try {
			RS2Buffer class38_sub23 = new RS2Buffer(is);
			class38_sub23.pos = is.length - 2;
			Class38_Sub14.anInt2133 = class38_sub23.getUShort();
			Class61.anIntArray1332 = new int[Class38_Sub14.anInt2133];
			Player.anIntArray3574 = new int[Class38_Sub14.anInt2133];
			Class38_Sub20_Sub8.anIntArray2873 = new int[Class38_Sub14.anInt2133];
			Class30.aByteArrayArray727 = new byte[Class38_Sub14.anInt2133][];
			Class51.anIntArray1130 = new int[Class38_Sub14.anInt2133];
			class38_sub23.pos = is.length - 7 - Class38_Sub14.anInt2133 * 8;
			Class16.anInt339 = class38_sub23.getUShort();
			Projectile.anInt3426 = class38_sub23.getUShort();
			int i = (class38_sub23.getUByte() & 0xff) + 1;
			for (int i_1_ = 0; Class38_Sub14.anInt2133 > i_1_; i_1_++)
				Player.anIntArray3574[i_1_] = class38_sub23.getUShort();
			for (int i_2_ = 0; i_2_ < Class38_Sub14.anInt2133; i_2_++)
				Class51.anIntArray1130[i_2_] = class38_sub23.getUShort();
			for (int i_3_ = 0; Class38_Sub14.anInt2133 > i_3_; i_3_++)
				Class61.anIntArray1332[i_3_] = class38_sub23.getUShort();
			for (int i_4_ = 0; i_4_ < Class38_Sub14.anInt2133; i_4_++)
				Class38_Sub20_Sub8.anIntArray2873[i_4_] = class38_sub23.getUShort();
			class38_sub23.pos = -(Class38_Sub14.anInt2133 * 8) - 7 + is.length - (i - 1) * 3;
			PlayerAppearance.anIntArray420 = new int[i];
			for (int i_5_ = 1; i > i_5_; i_5_++) {
				PlayerAppearance.anIntArray420[i_5_] = class38_sub23.method738((byte) 77);
				if (PlayerAppearance.anIntArray420[i_5_] == 0)
					PlayerAppearance.anIntArray420[i_5_] = 1;
			}
			class38_sub23.pos = 0;
			if (!bool)
				for (int i_6_ = 0; Class38_Sub14.anInt2133 > i_6_; i_6_++) {
					int i_7_ = Class61.anIntArray1332[i_6_];
					int i_8_ = Class38_Sub20_Sub8.anIntArray2873[i_6_];
					int i_9_ = i_7_ * i_8_;
					byte[] is_10_ = new byte[i_9_];
					Class30.aByteArrayArray727[i_6_] = is_10_;
					int i_11_ = class38_sub23.getUByte();
					if (i_11_ == 0)
						for (int i_12_ = 0; i_9_ > i_12_; i_12_++)
							is_10_[i_12_] = class38_sub23.method765((byte) 96);
					else if (i_11_ == 1)
						for (int i_13_ = 0; i_13_ < i_7_; i_13_++)
							for (int i_14_ = 0; i_8_ > i_14_; i_14_++)
								is_10_[i_13_ + i_7_ * i_14_] = class38_sub23.method765((byte) 83);
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "he.C(" + bool + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	Canvas_Sub1(Component component) {
		try {
			aComponent2526 = component;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "he.<init>(" + (component != null ? "{...}" : "null") + ')');
		}
	}

	static final void method811(byte i, Class38_Sub6[] class38_sub6s, int i_15_) {
		try {
			if (i != 40)
				Canvas_Sub1.method810(false, null);
			int i_16_ = 0;
			for (/**/; class38_sub6s.length > i_16_; i_16_++) {
				Class38_Sub6 class38_sub6 = class38_sub6s[i_16_];
				if (class38_sub6 != null) {
					if (class38_sub6.anInt1868 == 0) {
						if (class38_sub6.aClass38_Sub6Array1867 != null)
							Canvas_Sub1.method811((byte) 40, class38_sub6.aClass38_Sub6Array1867, i_15_);
						Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method75(class38_sub6.anInt1856, (byte) -106);
						if (class38_sub8 != null)
							Class38_Sub4.method625(class38_sub8.anInt2038, i_15_, (byte) 120);
					}
					if (i_15_ == 0 && class38_sub6.anObjectArray1871 != null) {
						Class38_Sub19 class38_sub19 = new Class38_Sub19();
						class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1871;
						class38_sub19.aClass38_Sub6_2241 = class38_sub6;
						Class15.method84(class38_sub19, (byte) -105);
					}
					if (i_15_ == 1 && class38_sub6.anObjectArray1908 != null) {
						if (class38_sub6.anInt1941 >= 0) {
							Class38_Sub6 class38_sub6_17_ = Projectile.method1167(class38_sub6.anInt1856, -118);
							if (class38_sub6_17_ == null || class38_sub6_17_.aClass38_Sub6Array1867 == null || class38_sub6_17_.aClass38_Sub6Array1867.length <= class38_sub6.anInt1941 || class38_sub6_17_.aClass38_Sub6Array1867[class38_sub6.anInt1941] != class38_sub6)
								continue;
						}
						Class38_Sub19 class38_sub19 = new Class38_Sub19();
						class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1908;
						class38_sub19.aClass38_Sub6_2241 = class38_sub6;
						Class15.method84(class38_sub19, (byte) -113);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "he.D(" + i + ',' + (class38_sub6s != null ? "{...}" : "null") + ',' + i_15_ + ')');
		}
	}

	public static void method812(int i) {
		try {
			Canvas_Sub1.aClass19_2522 = null;
			Canvas_Sub1.aClass19_2518 = null;
			Canvas_Sub1.aClass19_2512 = null;
			Canvas_Sub1.aClass19_2520 = null;
			Canvas_Sub1.aClass38_Sub20_Sub9_Sub2Array2511 = null;
			Canvas_Sub1.aClass19_2519 = null;
			Canvas_Sub1.aClass19_2513 = null;
			Canvas_Sub1.aClass19_2521 = null;
			if (i != -1)
				Canvas_Sub1.aClass19_2513 = null;
			Canvas_Sub1.aClass38_Sub20_Sub9_Sub1_Sub1_2525 = null;
			Canvas_Sub1.aClass19_2516 = null;
			Canvas_Sub1.aShortArrayArray2527 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "he.B(" + i + ')');
		}
	}

	static {
		Canvas_Sub1.aClass19_2520 = RSString.createRSString("This computers address has been blocked");
		Canvas_Sub1.aShortArrayArray2527 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };
		Canvas_Sub1.aClass19_2519 = RSString.createRSString("Registrierter Benutzer");
		Canvas_Sub1.aClass19_2522 = Canvas_Sub1.aClass19_2520;
		Canvas_Sub1.aClass19_2516 = RSString.createRSString("Checking for updates )2 ");
		Canvas_Sub1.aClass19_2521 = Canvas_Sub1.aClass19_2516;
	}
}
