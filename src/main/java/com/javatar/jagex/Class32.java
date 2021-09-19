package com.javatar.jagex;/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

abstract class Class32 {
	static int[] anIntArray765 = new int[5];
	static RSString aClass19_767;
	static boolean[] aBoolArray768;
	static int anInt770;
	private static RSString aClass19_771 = RSString.createRSString("Unable to connect)3");
	static int anInt772;
	static RSString aClass19_773;
	static RSString aClass19_775;
	static RSString aClass19_776;
	static RSString aClass19_778;

	public static void method294(int i) {
		try {
			Class32.aClass19_771 = null;
			Class32.aBoolArray768 = null;
			Class32.anIntArray765 = null;
			Class32.aClass19_775 = null;
			Class32.aClass19_773 = null;
			if (i != 1536)
				Class32.aClass19_767 = null;
			Class32.aClass19_776 = null;
			Class32.aClass19_778 = null;
			Class32.aClass19_767 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "uf.D(" + i + ')');
		}
	}

	abstract void method295(Component component, boolean bool);

	public Class32() {
		/* empty */
	}

	static final void method296(Entity class38_sub20_sub3_sub7, int i) {
		do {
			try {
				class38_sub20_sub3_sub7.anInt3454 = class38_sub20_sub3_sub7.idleAnimation;
				if (class38_sub20_sub3_sub7.walkQueueLocationIndex == 0)
					class38_sub20_sub3_sub7.anInt3440 = 0;
				else {
					if ((class38_sub20_sub3_sub7.currentAnimationId ^ 0xffffffff) != i && class38_sub20_sub3_sub7.anInt3461 == 0) {
						Class38_Sub20_Sub4 class38_sub20_sub4 = Sequence.forID((byte) 118, class38_sub20_sub3_sub7.currentAnimationId);
						if (class38_sub20_sub3_sub7.anInt3494 > 0 && class38_sub20_sub4.anInt2574 == 0) {
							class38_sub20_sub3_sub7.anInt3440++;
							break;
						}
						if (class38_sub20_sub3_sub7.anInt3494 <= 0 && class38_sub20_sub4.walkProperties == 0) {
							class38_sub20_sub3_sub7.anInt3440++;
							break;
						}
					}
					int i_0_ = class38_sub20_sub3_sub7.anInt3493;
					int i_1_ = class38_sub20_sub3_sub7.anInt3444;
					int i_2_ = class38_sub20_sub3_sub7.anInt3457 * 64 + class38_sub20_sub3_sub7.walkQueueY[class38_sub20_sub3_sub7.walkQueueLocationIndex - 1] * 128;
					int i_3_ = class38_sub20_sub3_sub7.anInt3457 * 64 + class38_sub20_sub3_sub7.walkQueueX[class38_sub20_sub3_sub7.walkQueueLocationIndex - 1] * 128;
					if (i_3_ - i_0_ > 256 || -i_0_ + i_3_ < -256 || -i_1_ + i_2_ > 256 || i_2_ - i_1_ < -256) {
						class38_sub20_sub3_sub7.anInt3493 = i_3_;
						class38_sub20_sub3_sub7.anInt3444 = i_2_;
					} else {
						if (i_3_ <= i_0_) {
							if (i_3_ >= i_0_) {
								if (i_2_ > i_1_)
									class38_sub20_sub3_sub7.anInt3488 = 1024;
								else if (i_2_ < i_1_)
									class38_sub20_sub3_sub7.anInt3488 = 0;
							} else if (i_2_ <= i_1_) {
								if (i_2_ < i_1_)
									class38_sub20_sub3_sub7.anInt3488 = 256;
								else
									class38_sub20_sub3_sub7.anInt3488 = 512;
							} else
								class38_sub20_sub3_sub7.anInt3488 = 768;
						} else if (i_1_ < i_2_)
							class38_sub20_sub3_sub7.anInt3488 = 1280;
						else if (i_1_ <= i_2_)
							class38_sub20_sub3_sub7.anInt3488 = 1536;
						else
							class38_sub20_sub3_sub7.anInt3488 = 1792;
						int i_4_ = 4;
						boolean bool = true;
						int i_5_ = -class38_sub20_sub3_sub7.anInt3491 + class38_sub20_sub3_sub7.anInt3488 & 0x7ff;
						if (i_5_ > 1024)
							i_5_ -= 2048;
						int i_6_ = class38_sub20_sub3_sub7.turn180Animation;
						if (i_5_ < -256 || i_5_ > 256) {
							if (i_5_ < 256 || i_5_ >= 768) {
								if (i_5_ >= -768 && i_5_ <= -256)
									i_6_ = class38_sub20_sub3_sub7.turn90CWAnimation;
							} else
								i_6_ = class38_sub20_sub3_sub7.turn90CCAnimation;
						} else
							i_6_ = class38_sub20_sub3_sub7.walkAnimation;
						if (i_6_ == -1)
							i_6_ = class38_sub20_sub3_sub7.walkAnimation;
						class38_sub20_sub3_sub7.anInt3454 = i_6_;
						if (class38_sub20_sub3_sub7 instanceof NPC)
							bool = ((NPC) class38_sub20_sub3_sub7).aClass38_Sub20_Sub5_3543.aBool2742;
						if (!bool) {
							if (class38_sub20_sub3_sub7.walkQueueLocationIndex > 1)
								i_4_ = 6;
							if (class38_sub20_sub3_sub7.walkQueueLocationIndex > 2)
								i_4_ = 8;
							if (class38_sub20_sub3_sub7.anInt3440 > 0 && class38_sub20_sub3_sub7.walkQueueLocationIndex > 1) {
								i_4_ = 8;
								class38_sub20_sub3_sub7.anInt3440--;
							}
						} else {
							if (class38_sub20_sub3_sub7.anInt3491 != class38_sub20_sub3_sub7.anInt3488 && class38_sub20_sub3_sub7.anInt3502 == -1 && class38_sub20_sub3_sub7.anInt3439 != 0)
								i_4_ = 2;
							if (class38_sub20_sub3_sub7.walkQueueLocationIndex > 2)
								i_4_ = 6;
							if (class38_sub20_sub3_sub7.walkQueueLocationIndex > 3)
								i_4_ = 8;
							if (class38_sub20_sub3_sub7.anInt3440 > 0 && class38_sub20_sub3_sub7.walkQueueLocationIndex > 1) {
								i_4_ = 8;
								class38_sub20_sub3_sub7.anInt3440--;
							}
						}
						if (class38_sub20_sub3_sub7.runningFlags[class38_sub20_sub3_sub7.walkQueueLocationIndex - 1])
							i_4_ <<= 1;
						if (i_0_ >= i_3_) {
							if (i_0_ > i_3_) {
								class38_sub20_sub3_sub7.anInt3493 -= i_4_;
								if (class38_sub20_sub3_sub7.anInt3493 < i_3_)
									class38_sub20_sub3_sub7.anInt3493 = i_3_;
							}
						} else {
							class38_sub20_sub3_sub7.anInt3493 += i_4_;
							if (class38_sub20_sub3_sub7.anInt3493 > i_3_)
								class38_sub20_sub3_sub7.anInt3493 = i_3_;
						}
						if (i_4_ >= 8 && class38_sub20_sub3_sub7.walkAnimation == class38_sub20_sub3_sub7.anInt3454 && class38_sub20_sub3_sub7.runAnimation != -1)
							class38_sub20_sub3_sub7.anInt3454 = class38_sub20_sub3_sub7.runAnimation;
						if (i_2_ > i_1_) {
							class38_sub20_sub3_sub7.anInt3444 += i_4_;
							if (i_2_ < class38_sub20_sub3_sub7.anInt3444)
								class38_sub20_sub3_sub7.anInt3444 = i_2_;
						} else if (i_2_ < i_1_) {
							class38_sub20_sub3_sub7.anInt3444 -= i_4_;
							if (i_2_ > class38_sub20_sub3_sub7.anInt3444)
								class38_sub20_sub3_sub7.anInt3444 = i_2_;
						}
						if (class38_sub20_sub3_sub7.anInt3493 != i_3_ || class38_sub20_sub3_sub7.anInt3444 != i_2_)
							break;
						if (class38_sub20_sub3_sub7.anInt3494 > 0)
							class38_sub20_sub3_sub7.anInt3494--;
						class38_sub20_sub3_sub7.walkQueueLocationIndex--;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "uf.F(" + (class38_sub20_sub3_sub7 != null ? "{...}" : "null") + ',' + i + ')');
			}
			break;
		} while (false);
	}

	abstract int method297(byte i);

	static final Class38_Sub6 method298(Class38_Sub6 class38_sub6, byte i) {
		try {
			Class38_Sub6 class38_sub6_7_ = Class38_Sub10_Sub1.method860(1442844045, class38_sub6);
			int i_8_ = 66 / ((12 - i) / 33);
			if (class38_sub6_7_ == null)
				class38_sub6_7_ = class38_sub6.aClass38_Sub6_1937;
			return class38_sub6_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "uf.H(" + (class38_sub6 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	abstract void method299(int i, Component component);

	static final boolean method300(byte i) {
		try {
			synchronized (Class38_Sub11.aClass60_2099) {
				if (Class38_Sub12.anInt2116 == Class33.anInt786)
					return false;
				int i_9_ = 44 % ((-65 - i) / 59);
				NodeSub.anInt2256 = Class38_Sub8.anIntArray2043[Class33.anInt786];
				Class10.anInt181 = Class38_Sub20_Sub3_Sub2.anIntArray3264[Class33.anInt786];
				Class33.anInt786 = Class33.anInt786 + 1 & 0x7f;
				return true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "uf.E(" + i + ')');
		}
	}

	static final RSString method301(int i, boolean bool, byte i_10_) {
		try {
			if (i_10_ != -90)
				Class32.aClass19_771 = null;
			return Class67.method479(10, 0, i, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "uf.G(" + i + ',' + bool + ',' + i_10_ + ')');
		}
	}

	static {
		Class32.anInt770 = 0;
		Class32.aBoolArray768 = new boolean[100];
		Class32.aClass19_776 = RSString.createRSString(" Sekunde(Xn(Y -Ubertragen)3");
		Class32.anInt772 = 0;
		Class32.aClass19_773 = Class32.aClass19_771;
		Class32.aClass19_775 = RSString.createRSString("<img=1>");
		Class32.aClass19_778 = RSString.createRSString(":assist:");
		Class32.aClass19_767 = Class32.aClass19_771;
	}
}
