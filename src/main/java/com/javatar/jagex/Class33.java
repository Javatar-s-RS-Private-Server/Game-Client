package com.javatar.jagex;/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class33 {
	static RSString aClass19_779 = RSString.createRSString(" )2> ");
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array780;
	static volatile boolean aBool781;
	static RSString aClass19_782 = RSString.createRSString("Hierhin gehen");
	static Class17_Sub1 aClass17_Sub1_784;
	static RSString aClass19_785 = RSString.createRSString("Ung-Ultige Session)2ID)3");
	static int anInt786;
	private static RSString aClass19_788;
	static int anInt789;
	static RSString aClass19_790;
	static RSString aClass19_792;

	static final Class38_Sub20_Sub9_Sub3[] method302(int i) {
		try {
			Class38_Sub20_Sub9_Sub3[] class38_sub20_sub9_sub3s = new Class38_Sub20_Sub9_Sub3[Class38_Sub14.anInt2133];
			for (int i_0_ = 0; i_0_ < Class38_Sub14.anInt2133; i_0_++) {
				Class38_Sub20_Sub9_Sub3 class38_sub20_sub9_sub3 = class38_sub20_sub9_sub3s[i_0_] = new Class38_Sub20_Sub9_Sub3();
				class38_sub20_sub9_sub3.anInt3294 = Class16.anInt339;
				class38_sub20_sub9_sub3.anInt3296 = Projectile.anInt3426;
				class38_sub20_sub9_sub3.anInt3295 = Player.anIntArray3574[i_0_];
				class38_sub20_sub9_sub3.anInt3299 = Class51.anIntArray1130[i_0_];
				class38_sub20_sub9_sub3.anInt3297 = Class61.anIntArray1332[i_0_];
				class38_sub20_sub9_sub3.anInt3298 = Class38_Sub20_Sub8.anIntArray2873[i_0_];
				int i_1_ = class38_sub20_sub9_sub3.anInt3298 * class38_sub20_sub9_sub3.anInt3297;
				byte[] is = Class30.aByteArrayArray727[i_0_];
				class38_sub20_sub9_sub3.anIntArray3300 = new int[i_1_];
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
					class38_sub20_sub9_sub3.anIntArray3300[i_2_] = PlayerAppearance.anIntArray420[Class38_Sub10_Sub3.method941(255, is[i_2_])];
			}
			if (i != 9590)
				Class33.method304(92);
			Player.method1207((byte) 29);
			return class38_sub20_sub9_sub3s;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "a.B(" + i + ')');
		}
	}

	static final void method303(int i, int i_3_, int i_4_) {
		do {
			try {
				if ((Class38_Sub20_Sub17.anInt3129 ^ 0xffffffff) == i_4_ || Class38_Sub20_Sub17.anInt3129 == 3) {
					if (Client.lastMouseAction != 1)
						break;
					int i_5_ = -i + Class73.anInt1429 - 25;
					int i_6_ = RS2Buffer.anInt2416 + -5 - i_3_;
					if (i_5_ < 0 || i_6_ < 0 || i_5_ >= 146 || i_6_ >= 151)
						break;
					i_5_ -= 73;
					i_6_ -= 75;
					int i_7_ = Class38_Sub20_Sub11.anInt2930 + Class21.anInt517 & 0x7ff;
					int i_8_ = Class38_Sub20_Sub9_Sub4.anIntArray3520[i_7_];
					i_8_ = (Class38_Sub7.anInt2027 + 256) * i_8_ >> 133724968;
					int i_9_ = Class38_Sub20_Sub9_Sub4.anIntArray3528[i_7_];
					i_9_ = (Class38_Sub7.anInt2027 + 256) * i_9_ >> 293231016;
					int i_10_ = i_6_ * i_9_ - i_5_ * i_8_ >> 446254347;
					int i_11_ = i_8_ * i_6_ + i_5_ * i_9_ >> 47261803;
					int i_12_ = ((Entity) Client.myPlayer).anInt3444 - i_10_ >> 1315763111;
					int i_13_ = ((Entity) Client.myPlayer).anInt3493 + i_11_ >> 337460071;
					boolean bool = Client.calculatePath(true, 0, ((Entity) Client.myPlayer).walkQueueY[0], 0, 0, i_13_, ((Entity) Client.myPlayer).walkQueueX[0], 0, i_12_, 0, 1);
					if (!bool)
						break;
					Client.outputBuffer.writeByte(i_5_);
					Client.outputBuffer.writeByte(i_6_);
					Client.outputBuffer.writeShort(Class38_Sub20_Sub11.anInt2930);
					Client.outputBuffer.writeByte(57);
					Client.outputBuffer.writeByte(Class21.anInt517);
					Client.outputBuffer.writeByte(Class38_Sub7.anInt2027);
					Client.outputBuffer.writeByte(89);
					Client.outputBuffer.writeShort(((Entity) Client.myPlayer).anInt3493);
					Client.outputBuffer.writeShort(((Entity) Client.myPlayer).anInt3444);
					Client.outputBuffer.writeByte(Client.arbitraryDestination);
					Client.outputBuffer.writeByte(63);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "a.D(" + i + ',' + i_3_ + ',' + i_4_ + ')');
			}
			break;
		} while (false);
	}

	public static void method304(int i) {
		try {
			Class33.aClass19_788 = null;
			if (i <= 84)
				Class33.aClass38_Sub20_Sub9_Sub3Array780 = null;
			Class33.aClass19_785 = null;
			Class33.aClass19_792 = null;
			Class33.aClass19_782 = null;
			Class33.aClass19_790 = null;
			Class33.aClass19_779 = null;
			Class33.aClass17_Sub1_784 = null;
			Class33.aClass38_Sub20_Sub9_Sub3Array780 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "a.A(" + i + ')');
		}
	}

	static final Class38_Sub20_Sub9_Sub2 method305(int i, int i_14_, boolean bool, Class17 class17) {
		try {
			if (bool != true)
				Class33.method304(42);
			if (!Class22.method197(i_14_, class17, -308039560, i))
				return null;
			return Class44.method368(0);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "a.C(" + i + ',' + i_14_ + ',' + bool + ',' + (class17 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		Class33.aBool781 = true;
		Class33.aClass19_788 = RSString.createRSString("Please wait 5 minutes before trying again)3");
		Class33.anInt786 = 0;
		Class33.anInt789 = 0;
		Class33.aClass19_790 = Class33.aClass19_788;
		Class33.aClass19_792 = RSString.createRSString("(U(Y");
	}
}
