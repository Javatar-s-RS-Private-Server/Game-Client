/* Class38_Sub20_Sub3_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub3_Sub5 extends SceneModel {
	static int anInt3372;
	static long aLong3376;
	static RSString aClass19_3387;
	static RSString aClass19_3388;
	static boolean aBool3389;
	static RSString aClass19_3391;
	private static RSString aClass19_3367;

	static {
		Class38_Sub20_Sub3_Sub5.anInt3372 = 0;
		Class38_Sub20_Sub3_Sub5.aClass19_3388 = RSString.createRSString("nicht hergestellt werden)3");
		Class38_Sub20_Sub3_Sub5.aClass19_3367 = RSString.createRSString("Please enter your password)3");
		Class38_Sub20_Sub3_Sub5.aClass19_3387 = Class38_Sub20_Sub3_Sub5.aClass19_3367;
		Class38_Sub20_Sub3_Sub5.aClass19_3391 = RSString.createRSString("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");
	}

	private final int anInt3382;
	int anInt3368;
	int anInt3370;
	boolean aBool3377 = false;
	int anInt3383;
	int anInt3386;
	int anInt3390;
	private Class38_Sub20_Sub4 aClass38_Sub20_Sub4_3373;
	private int anInt3381;
	private int anInt3385 = 0;

	Class38_Sub20_Sub3_Sub5(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		anInt3381 = 0;
		try {
			this.anInt3368 = i_24_;
			this.anInt3383 = i_25_;
			this.anInt3370 = i_28_ + i_29_;
			this.anInt3390 = i_26_;
			anInt3382 = i;
			this.anInt3386 = i_27_;
			int i_30_ = Class38_Sub11.method673(anInt3382, 126).anInt2972;
			if (i_30_ == -1)
				this.aBool3377 = true;
			else {
				this.aBool3377 = false;
				aClass38_Sub20_Sub4_3373 = Sequence.forID((byte) 121, i_30_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "td.<init>(" + i + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ')');
		}
	}

	static final void method1158(int i, byte i_0_, int i_1_, int i_2_) {
		try {
			if (i_1_ < 128 || i < 128 || i_1_ > 13056 || i > 13056) {
				Class38_Sub20_Sub12.anInt3002 = -1;
				Class29.anInt703 = -1;
			} else {
				int i_3_ = -i_2_ + Class35.method317(-5736, client.height, i_1_, i);
				i -= Class2.anInt30;
				int i_4_ = Class38_Sub20_Sub9_Sub4.anIntArray3520[Class3.anInt44];
				i_3_ -= Class38_Sub18.anInt2209;
				if (i_0_ > 115) {
					int i_5_ = Class38_Sub20_Sub9_Sub4.anIntArray3528[Class3.anInt44];
					int i_6_ = Class38_Sub20_Sub9_Sub4.anIntArray3520[Entity.anInt3464];
					int i_7_ = Class38_Sub20_Sub9_Sub4.anIntArray3528[Entity.anInt3464];
					i_1_ -= Class11.anInt208;
					int i_8_ = i_1_ * i_7_ + i * i_6_ >> 16;
					i = -(i_1_ * i_6_) + i * i_7_ >> 16;
					i_1_ = i_8_;
					i_8_ = i_5_ * i_3_ - i_4_ * i >> 16;
					i = i * i_5_ + i_3_ * i_4_ >> 16;
					i_3_ = i_8_;
					if (i < 50) {
						Class29.anInt703 = -1;
						Class38_Sub20_Sub12.anInt3002 = -1;
					} else {
						Class38_Sub20_Sub12.anInt3002 = (i_3_ << 9) / i + 167;
						Class29.anInt703 = (i_1_ << 9) / i + 256;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "td.K(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')');
		}
	}

	static final void method1159(int i, int i_9_, int i_10_, int i_11_, Class38_Sub20_Sub9_Sub3 class38_sub20_sub9_sub3, int i_12_) {
		try {
			if (class38_sub20_sub9_sub3 != null) {
				int i_13_ = Class21.anInt517 + Class38_Sub20_Sub11.anInt2930 & 0x7ff;
				int i_14_ = i_12_ * i_12_ + i_11_ * i_11_;
				if (i_14_ <= 6400) {
					if (i != -2011)
						Class38_Sub20_Sub3_Sub5.method1159(-17, 121, 0, -81, null, -39);
					int i_15_ = Class38_Sub20_Sub9_Sub4.anIntArray3520[i_13_];
					i_15_ = i_15_ * 256 / (Class38_Sub7.anInt2027 + 256);
					int i_16_ = Class38_Sub20_Sub9_Sub4.anIntArray3528[i_13_];
					i_16_ = i_16_ * 256 / (Class38_Sub7.anInt2027 + 256);
					int i_17_ = i_16_ * i_11_ - i_12_ * i_15_ >> 16;
					int i_18_ = i_11_ * i_15_ + i_16_ * i_12_ >> 16;
					if (i_14_ <= 2500)
						class38_sub20_sub9_sub3.method1105(i_18_ + i_9_ - (-94 + class38_sub20_sub9_sub3.anInt3294 / 2) + 4, i_10_ - i_17_ + 83 + -(class38_sub20_sub9_sub3.anInt3296 / 2) - 4);
					else
						class38_sub20_sub9_sub3.method1107(Class64.aClass38_Sub20_Sub9_Sub2_1359, i_9_ + 94 + i_18_ - class38_sub20_sub9_sub3.anInt3294 / 2 + 4, -(class38_sub20_sub9_sub3.anInt3296 / 2) + i_10_ - i_17_ + 83 - 4);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "td.H(" + i + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + (class38_sub20_sub9_sub3 != null ? "{...}" : "null") + ',' + i_12_ + ')');
		}
	}

	static final Class38_Sub20_Sub9_Sub2 method1160(RSString class19, Class17 class17, boolean bool, RSString class19_19_) {
		try {
			if (bool)
				Class38_Sub20_Sub3_Sub5.method1161(null, null, (byte) -1);
			int i = class17.method104(3, class19_19_);
			int i_20_ = class17.method118(class19, i, true);
			return Class33.method305(i_20_, i, true, class17);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "td.J(" + (class19 != null ? "{...}" : "null") + ',' + (class17 != null ? "{...}" : "null") + ',' + bool + ',' + (class19_19_ != null ? "{...}" : "null") + ')');
		}
	}

	static final void method1161(Class17 class17, Class17 class17_21_, byte i) {
		try {
			Class66.aClass17_1376 = class17_21_;
			if (i >= 111)
				Class38_Sub4.aClass17_1794 = class17;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "td.F(" + (class17 != null ? "{...}" : "null") + ',' + (class17_21_ != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method1163(byte i) {
		try {
			Class38_Sub20_Sub3_Sub5.aClass19_3391 = null;
			Class38_Sub20_Sub3_Sub5.aClass19_3367 = null;
			if (i <= -65) {
				Class38_Sub20_Sub3_Sub5.aClass19_3387 = null;
				Class38_Sub20_Sub3_Sub5.aClass19_3388 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "td.G(" + i + ')');
		}
	}

	final void method1162(byte i, int i_22_) {
		try {
			int i_23_ = -86 / ((-39 - i) / 61);
			if (!this.aBool3377) {
				anInt3381 += i_22_;
				while (aClass38_Sub20_Sub4_3373.anIntArray2568[anInt3385] < anInt3381) {
					anInt3381 -= aClass38_Sub20_Sub4_3373.anIntArray2568[anInt3385];
					anInt3385++;
					if (aClass38_Sub20_Sub4_3373.anIntArray2585.length <= anInt3385) {
						this.aBool3377 = true;
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "td.I(" + i + ',' + i_22_ + ')');
		}
	}

	@Override
	final Class38_Sub20_Sub3_Sub1 method820(byte i) {
		try {
			if (i != 109)
				anInt3385 = 50;
			Class38_Sub20_Sub11 class38_sub20_sub11 = Class38_Sub11.method673(anInt3382, 126);
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1;
			if (this.aBool3377)
				class38_sub20_sub3_sub1 = class38_sub20_sub11.method984(123, -1);
			else
				class38_sub20_sub3_sub1 = class38_sub20_sub11.method984(i + 17, anInt3385);
			return class38_sub20_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "td.E(" + i + ')');
		}
	}
}
