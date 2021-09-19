package com.javatar.jagex;/* Class38_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub17 extends Node {
	int anInt2185;
	static RSString aClass19_2186 = RSString.createRSString("auf der Hautpseite)3");
	Class48 aClass48_2187;
	static RSString aClass19_2189 = RSString.createRSString("Bitte versuchen Sie es erneut)3");
	static RSString aClass19_2190 = RSString.createRSString(")4slr)3ws?order=LPWM");
	byte[] aByteArray2191;
	static int anInt2193;
	static Class38_Sub20_Sub9_Sub3 aClass38_Sub20_Sub9_Sub3_2194;
	static int anInt2195;
	Class17_Sub1 aClass17_Sub1_2196;
	static byte[][] aByteArrayArray2198;

	static final void method691(int i, boolean bool, int i_0_) {
		try {
			Client.outputBuffer.putOpcode(172);
			if (bool != true)
				Class38_Sub17.aClass19_2186 = null;
			Client.outputBuffer.method747(i_0_, -2687);
			Client.outputBuffer.method769(i, 105);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "uc.E(" + i + ',' + bool + ',' + i_0_ + ')');
		}
	}

	static final void method692(int i) {
		do {
			try {
				int i_1_ = Class38_Sub20_Sub13.anInt3011;
				int i_2_ = Class3.anInt66;
				int i_3_ = Class38_Sub20_Sub2.anInt2540;
				int i_4_ = 6116423;
				int i_5_ = WidgetComponent.anInt1976;
				Class38_Sub20_Sub9.method958(i_5_, i_1_, i_2_, i_3_, i_4_);
				Class38_Sub20_Sub9.method958(i_5_ + 1, i_1_ + 1, i_2_ - 2, 16, 0);
				Class38_Sub20_Sub9.method963(i_5_ + 1, i_1_ + 18, i_2_ - 2, i_3_ - 19, 0);
				Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1084(Class80.aClass19_1597, i_5_ + 3, i_1_ + 14, i_4_, -1);
				int i_6_ = Class45.anInt1015;
				int i_7_ = Class23.anInt543;
				for (int i_8_ = 0; i_8_ < Class72.anInt1417; i_8_++) {
					int i_9_ = 16777215;
					int i_10_ = (-i_8_ + Class72.anInt1417 - 1) * 15 + i_1_ + 31;
					if (i_5_ < i_7_ && i_5_ + i_2_ > i_7_ && i_6_ > i_10_ - 13 && i_6_ < i_10_ + 3)
						i_9_ = 16776960;
					Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1084(NPC.method1204(true, i_8_), i_5_ + 3, i_10_, i_9_, 0);
				}
				RSString.method168(Class3.anInt66, Class38_Sub20_Sub13.anInt3011, WidgetComponent.anInt1976, Class38_Sub20_Sub2.anInt2540, (byte) -121);
				if (i >= 21)
					break;
				Class38_Sub17.anInt2193 = -122;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "uc.B(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method693(boolean bool) {
		do {
			try {
				Class38_Sub17.aClass19_2189 = null;
				Class38_Sub17.aClass19_2190 = null;
				Class38_Sub17.aByteArrayArray2198 = null;
				Class38_Sub17.aClass38_Sub20_Sub9_Sub3_2194 = null;
				Class38_Sub17.aClass19_2186 = null;
				if (bool == true)
					break;
				Class38_Sub17.aByteArrayArray2198 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "uc.F(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final int method694(int i, Class17 class17, Class17 class17_11_) {
		try {
			if (i != -27706)
				Class38_Sub17.aClass19_2186 = null;
			int i_12_ = 0;
			if (class17_11_.method113(Applet_Sub1.aClass19_3625, Class51.aClass19_1132, -81))
				i_12_++;
			if (class17.method113(RSString.aClass19_436, Class51.aClass19_1132, -16))
				i_12_++;
			if (class17.method113(Class79.str_titleBox, Class51.aClass19_1132, -9))
				i_12_++;
			if (class17.method113(Entity.aClass19_3506, Class51.aClass19_1132, -123))
				i_12_++;
			if (class17.method113(Class54.aClass19_1194, Class51.aClass19_1132, i + 27657))
				i_12_++;
			if (class17.method113(Class11.aClass19_214, Class51.aClass19_1132, -92))
				i_12_++;
			class17.method113(Class54.aClass19_1209, Class51.aClass19_1132, -65);
			class17.method113(Class38_Sub20_Sub16.aClass19_3092, Class51.aClass19_1132, -128);
			class17.method113(Class83.aClass19_1665, Class51.aClass19_1132, -107);
			class17.method113(NPC.aClass19_3555, Class51.aClass19_1132, -123);
			class17.method113(Class74.aClass19_1471, Class51.aClass19_1132, -9);
			return i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "uc.A(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + (class17_11_ != null ? "{...}" : "null") + ')');
		}
	}

	static final void method695(boolean bool) {
		try {
			while (Class15.inputStream.method787((byte) -95, Entity.anInt3446) >= 27) {
				int i = Class15.inputStream.readBits(15, (byte) 69);
				if (i == 32767)
					break;
				boolean bool_13_ = false;
				if (Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i] == null) {
					bool_13_ = true;
					Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i] = new NPC();
				}
				NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i];
				Class38_Sub10_Sub1.anIntArray2652[Class4.anInt87++] = i;
				((Entity) class38_sub20_sub3_sub7_sub1).anInt3459 = Class45.anInt1016;
				int i_14_ = PlayerAppearance.anIntArray418[Class15.inputStream.readBits(3, (byte) 69)];
				if (bool_13_)
					((Entity) class38_sub20_sub3_sub7_sub1).anInt3488 = ((Entity) class38_sub20_sub3_sub7_sub1).anInt3491 = i_14_;
				int i_15_ = Class15.inputStream.readBits(5, (byte) 69);
				int i_16_ = Class15.inputStream.readBits(1, (byte) 69);
				if (i_15_ > 15)
					i_15_ -= 32;
				if (i_16_ == 1)
					ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = i;
				class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543 = Class38_Sub20_Sub3_Sub4.method1156(-103, Class15.inputStream.readBits(14, (byte) 69));
				int i_17_ = Class15.inputStream.readBits(1, (byte) 69);
				int i_18_ = Class15.inputStream.readBits(5, (byte) 69);
				((Entity) class38_sub20_sub3_sub7_sub1).anInt3439 = class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2719;
				((Entity) class38_sub20_sub3_sub7_sub1).turn90CWAnimation = class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2720;
				((Entity) class38_sub20_sub3_sub7_sub1).anInt3457 = class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2697;
				((Entity) class38_sub20_sub3_sub7_sub1).turn90CCAnimation = class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2712;
				((Entity) class38_sub20_sub3_sub7_sub1).anInt3462 = class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2686;
				if (((Entity) class38_sub20_sub3_sub7_sub1).anInt3439 == 0)
					((Entity) class38_sub20_sub3_sub7_sub1).anInt3491 = 0;
				((Entity) class38_sub20_sub3_sub7_sub1).turnAnimation = class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2710;
				((Entity) class38_sub20_sub3_sub7_sub1).turn180Animation = class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2702;
				((Entity) class38_sub20_sub3_sub7_sub1).walkAnimation = class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2703;
				((Entity) class38_sub20_sub3_sub7_sub1).idleAnimation = class38_sub20_sub3_sub7_sub1.aClass38_Sub20_Sub5_3543.anInt2696;
				if (i_18_ > 15)
					i_18_ -= 32;
				class38_sub20_sub3_sub7_sub1.updatePosition(i_15_ + ((Entity) Client.myPlayer).walkQueueX[0], i_18_ + ((Entity) Client.myPlayer).walkQueueY[0], i_17_ == 1);
			}
			if (bool == true)
				Class15.inputStream.method788(7);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "uc.C(" + bool + ')');
		}
	}

	static final void method696(byte i) {
		try {
			if (i != 80)
				Class38_Sub17.method693(false);
			for (Projectile class38_sub20_sub3_sub6 = (Projectile) Class28.aClass13_686.method65(81); class38_sub20_sub3_sub6 != null; class38_sub20_sub3_sub6 = (Projectile) Class28.aClass13_686.method63(-3))
				if (class38_sub20_sub3_sub6.graphicId == Client.height && class38_sub20_sub3_sub6.anInt3409 >= Class45.anInt1016) {
					if (Class45.anInt1016 >= class38_sub20_sub3_sub6.anInt3424) {
						if (class38_sub20_sub3_sub6.anInt3421 > 0) {
							NPC class38_sub20_sub3_sub7_sub1 = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[class38_sub20_sub3_sub6.anInt3421 - 1];
							if (class38_sub20_sub3_sub7_sub1 != null && ((Entity) class38_sub20_sub3_sub7_sub1).anInt3493 >= 0 && ((Entity) class38_sub20_sub3_sub7_sub1).anInt3493 < 13312 && ((Entity) class38_sub20_sub3_sub7_sub1).anInt3444 >= 0 && ((Entity) class38_sub20_sub3_sub7_sub1).anInt3444 < 13312)
								class38_sub20_sub3_sub6.method1170(((Entity) class38_sub20_sub3_sub7_sub1).anInt3444, ((Entity) class38_sub20_sub3_sub7_sub1).anInt3493, (byte) -55, Class45.anInt1016, Class35.method317(i ^ ~0x1637, class38_sub20_sub3_sub6.graphicId, ((Entity) class38_sub20_sub3_sub7_sub1).anInt3493, ((Entity) class38_sub20_sub3_sub7_sub1).anInt3444) - class38_sub20_sub3_sub6.startTime);
						}
						if (class38_sub20_sub3_sub6.anInt3421 < 0) {
							int i_19_ = -class38_sub20_sub3_sub6.anInt3421 - 1;
							Player class38_sub20_sub3_sub7_sub2;
							if (Class38_Sub9.anInt2067 != i_19_)
								class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_19_];
							else
								class38_sub20_sub3_sub7_sub2 = Client.myPlayer;
							if (class38_sub20_sub3_sub7_sub2 != null && ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493 >= 0 && ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493 < 13312 && ((Entity) class38_sub20_sub3_sub7_sub2).anInt3444 >= 0 && ((Entity) class38_sub20_sub3_sub7_sub2).anInt3444 < 13312)
								class38_sub20_sub3_sub6.method1170(((Entity) class38_sub20_sub3_sub7_sub2).anInt3444, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493, (byte) 127, Class45.anInt1016, Class35.method317(-5736, class38_sub20_sub3_sub6.graphicId, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3493, ((Entity) class38_sub20_sub3_sub7_sub2).anInt3444) - class38_sub20_sub3_sub6.startTime);
						}
						class38_sub20_sub3_sub6.update(Canvas_Sub1.anInt2529, -1);
						RuntimeException_Sub1.aClass27_3292.method249(Client.height, (int) class38_sub20_sub3_sub6.aDouble3410, (int) class38_sub20_sub3_sub6.aDouble3412, (int) class38_sub20_sub3_sub6.aDouble3413, 60, class38_sub20_sub3_sub6, class38_sub20_sub3_sub6.anInt3429, -1, false);
					}
				} else
					class38_sub20_sub3_sub6.method330(0);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "uc.D(" + i + ')');
		}
	}

	public Class38_Sub17() {
		/* empty */
	}
}
