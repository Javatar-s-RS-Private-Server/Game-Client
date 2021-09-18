/* Class38_Sub10_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub10_Sub3 extends Class38_Sub10 {
	static short[] aShortArray2821;
	static RSString aClass19_2825 = RSString.createRSString(" (X");
	static int[] anIntArray2826 = { -1, -1, 1, 1 };
	static Class38_Sub20_Sub9_Sub2[] aClass38_Sub20_Sub9_Sub2Array2829;
	static Class17 aClass17_2833;
	static RSString aClass19_2834;
	static RSString aClass19_2836;
	static int anInt2837;
	static RSString aClass19_2838 = RSString.createRSString("Willkommen auf RuneScape");
	static Class17 aClass17_2841;
	private static RSString aClass19_2824 = RSString.createRSString("Use");
	private static RSString aClass19_2842;

	static {
		Class38_Sub10_Sub3.aClass19_2836 = Class38_Sub10_Sub3.aClass19_2824;
		Class38_Sub10_Sub3.aClass19_2842 = RSString.createRSString(" has logged in)3");
		Class38_Sub10_Sub3.aClass19_2834 = Class38_Sub10_Sub3.aClass19_2842;
	}

	private final Class38_Sub10_Sub1 aClass38_Sub10_Sub1_2832;
	Class13 aClass13_2828 = new Class13();
	Class38_Sub10_Sub4 aClass38_Sub10_Sub4_2840 = new Class38_Sub10_Sub4();

	Class38_Sub10_Sub3(Class38_Sub10_Sub1 class38_sub10_sub1) {
		try {
			aClass38_Sub10_Sub1_2832 = class38_sub10_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fe.<init>(" + (class38_sub10_sub1 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method939(int i) {
		try {
			Class38_Sub20_Sub15.anInt3064 = 0;
			Class4.anInt81 = 0;
			Class44.method373(3);
			Class38_Sub17.method695(true);
			RSString.method145((byte) -108);
			for (int i_6_ = 0; i_6_ < Class4.anInt81; i_6_++) {
				int i_7_ = Class21.anIntArray519[i_6_];
				if (Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_7_].anInt3459 != Class45.anInt1016) {
					Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_7_].aClass38_Sub20_Sub5_3543 = null;
					Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_7_] = null;
				}
			}
			if (Class15.inputStream.pos != Entity.anInt3446)
				throw new RuntimeException("gnp1 pos:" + Class15.inputStream.pos + " psize:" + Entity.anInt3446);
			if (i == -3072)
				for (int i_8_ = 0; i_8_ < Class4.anInt87; i_8_++)
					if (Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[Class38_Sub10_Sub1.anIntArray2652[i_8_]] == null)
						throw new RuntimeException("gnp2 pos:" + i_8_ + " size:" + Class4.anInt87);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fe.F(" + i + ')');
		}
	}

	static final void method940(boolean bool) {
		do {
			try {
				if (bool == true) {
					if (Class38_Sub20_Sub17.aClass31_3138 == null)
						break;
					Class38_Sub20_Sub17.aClass31_3138.method292(106);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "fe.C(" + bool + ')');
			}
			break;
		} while (false);
	}

	static int method941(int i, int i_9_) {
		try {
			return i & i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fe.A(" + i + ',' + i_9_ + ')');
		}
	}

	public static void method942(byte i) {
		try {
			Class38_Sub10_Sub3.aClass17_2841 = null;
			Class38_Sub10_Sub3.aClass38_Sub20_Sub9_Sub2Array2829 = null;
			if (i > 104) {
				Class38_Sub10_Sub3.aClass17_2833 = null;
				Class38_Sub10_Sub3.aClass19_2836 = null;
				Class38_Sub10_Sub3.aShortArray2821 = null;
				Class38_Sub10_Sub3.anIntArray2826 = null;
				Class38_Sub10_Sub3.aClass19_2842 = null;
				Class38_Sub10_Sub3.aClass19_2838 = null;
				Class38_Sub10_Sub3.aClass19_2825 = null;
				Class38_Sub10_Sub3.aClass19_2834 = null;
				Class38_Sub10_Sub3.aClass19_2824 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fe.E(" + i + ')');
		}
	}

	@Override
	final Class38_Sub10 method668() {
		try {
			Class38_Sub22 class38_sub22;
			do {
				class38_sub22 = (Class38_Sub22) this.aClass13_2828.method63(-3);
				if (class38_sub22 == null)
					return null;
			} while (class38_sub22.aClass38_Sub10_Sub2_2314 == null);
			return class38_sub22.aClass38_Sub10_Sub2_2314;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fe.B(" + ')');
		}
	}

	private final void method938(int i, int i_0_, Class38_Sub22 class38_sub22) {
		try {
			if (i_0_ != (aClass38_Sub10_Sub1_2832.anIntArray2636[class38_sub22.anInt2344] & 0x4) && class38_sub22.anInt2345 < 0) {
				int i_1_ = aClass38_Sub10_Sub1_2832.anIntArray2649[class38_sub22.anInt2344] / Class38_Sub20_Sub7.anInt2852;
				int i_2_ = (i_1_ + 1048575 - class38_sub22.anInt2326) / i_1_;
				class38_sub22.anInt2326 = class38_sub22.anInt2326 + i * i_1_ & 0xfffff;
				if (i_2_ <= i) {
					if (aClass38_Sub10_Sub1_2832.anIntArray2626[class38_sub22.anInt2344] == 0)
						class38_sub22.aClass38_Sub10_Sub2_2314 = Class38_Sub10_Sub2.method873(class38_sub22.aClass38_Sub16_Sub1_2337, class38_sub22.aClass38_Sub10_Sub2_2314.method884(), class38_sub22.aClass38_Sub10_Sub2_2314.method893(), class38_sub22.aClass38_Sub10_Sub2_2314.method889());
					else {
						class38_sub22.aClass38_Sub10_Sub2_2314 = Class38_Sub10_Sub2.method873(class38_sub22.aClass38_Sub16_Sub1_2337, class38_sub22.aClass38_Sub10_Sub2_2314.method884(), 0, class38_sub22.aClass38_Sub10_Sub2_2314.method889());
						aClass38_Sub10_Sub1_2832.method843(1, class38_sub22.aClass38_Sub18_2330.aShortArray2212[class38_sub22.anInt2329] < 0, class38_sub22);
					}
					if (class38_sub22.aClass38_Sub18_2330.aShortArray2212[class38_sub22.anInt2329] < 0)
						class38_sub22.aClass38_Sub10_Sub2_2314.method876(-1);
					i = class38_sub22.anInt2326 / i_1_;
				}
			}
			class38_sub22.aClass38_Sub10_Sub2_2314.method669(i);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fe.D(" + i + ',' + i_0_ + ',' + (class38_sub22 != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final void method667(int[] is, int i, int i_3_) {
		try {
			this.aClass38_Sub10_Sub4_2840.method667(is, i, i_3_);
			Class38_Sub22 class38_sub22 = (Class38_Sub22) this.aClass13_2828.method65(115);
			while_8_: for (/**/; class38_sub22 != null; class38_sub22 = (Class38_Sub22) this.aClass13_2828.method63(-3))
				if (!aClass38_Sub10_Sub1_2832.method862(-31299, class38_sub22)) {
					int i_4_ = i;
					int i_5_ = i_3_;
					while (i_5_ > class38_sub22.anInt2317) {
						method943(class38_sub22, is, i_4_, -1, i_4_ + i_5_, class38_sub22.anInt2317);
						i_4_ += class38_sub22.anInt2317;
						i_5_ -= class38_sub22.anInt2317;
						if (aClass38_Sub10_Sub1_2832.method857(class38_sub22, false, i_4_, is, i_5_))
							continue while_8_;
					}
					method943(class38_sub22, is, i_4_, -1, i_5_ + i_4_, i_5_);
					class38_sub22.anInt2317 -= i_5_;
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fe.SA(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_3_ + ')');
		}
	}

	@Override
	final Class38_Sub10 method670() {
		try {
			Class38_Sub22 class38_sub22 = (Class38_Sub22) this.aClass13_2828.method65(95);
			if (class38_sub22 == null)
				return null;
			if (class38_sub22.aClass38_Sub10_Sub2_2314 != null)
				return class38_sub22.aClass38_Sub10_Sub2_2314;
			return method668();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fe.G(" + ')');
		}
	}

	@Override
	final int method665() {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fe.GA(" + ')');
		}
	}

	@Override
	final void method669(int i) {
		try {
			this.aClass38_Sub10_Sub4_2840.method669(i);
			Class38_Sub22 class38_sub22 = (Class38_Sub22) this.aClass13_2828.method65(112);
			while_10_: for (/**/; class38_sub22 != null; class38_sub22 = (Class38_Sub22) this.aClass13_2828.method63(-3))
				if (!aClass38_Sub10_Sub1_2832.method862(-31299, class38_sub22)) {
					int i_10_ = i;
					while (class38_sub22.anInt2317 < i_10_) {
						method938(class38_sub22.anInt2317, 0, class38_sub22);
						i_10_ -= class38_sub22.anInt2317;
						if (aClass38_Sub10_Sub1_2832.method857(class38_sub22, false, 0, null, i_10_))
							continue while_10_;
					}
					method938(i_10_, 0, class38_sub22);
					class38_sub22.anInt2317 -= i_10_;
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fe.R(" + i + ')');
		}
	}

	private final void method943(Class38_Sub22 class38_sub22, int[] is, int i, int i_11_, int i_12_, int i_13_) {
		try {
			if (i_11_ != (aClass38_Sub10_Sub1_2832.anIntArray2636[class38_sub22.anInt2344] & 0x4 ^ 0xffffffff) && class38_sub22.anInt2345 < 0) {
				int i_14_ = aClass38_Sub10_Sub1_2832.anIntArray2649[class38_sub22.anInt2344] / Class38_Sub20_Sub7.anInt2852;
				for (;;) {
					int i_15_ = (-class38_sub22.anInt2326 + i_14_ + 1048575) / i_14_;
					if (i_15_ > i_13_)
						break;
					i_13_ -= i_15_;
					int i_16_ = 262144 / i_14_;
					class38_sub22.aClass38_Sub10_Sub2_2314.method667(is, i, i_15_);
					class38_sub22.anInt2326 += i_15_ * i_14_ - 1048576;
					i += i_15_;
					Class38_Sub10_Sub2 class38_sub10_sub2 = class38_sub22.aClass38_Sub10_Sub2_2314;
					int i_17_ = Class38_Sub20_Sub7.anInt2852 / 100;
					if (i_16_ < i_17_)
						i_17_ = i_16_;
					if (aClass38_Sub10_Sub1_2832.anIntArray2626[class38_sub22.anInt2344] == 0)
						class38_sub22.aClass38_Sub10_Sub2_2314 = Class38_Sub10_Sub2.method873(class38_sub22.aClass38_Sub16_Sub1_2337, class38_sub10_sub2.method884(), class38_sub10_sub2.method893(), class38_sub10_sub2.method889());
					else {
						class38_sub22.aClass38_Sub10_Sub2_2314 = Class38_Sub10_Sub2.method873(class38_sub22.aClass38_Sub16_Sub1_2337, class38_sub10_sub2.method884(), 0, class38_sub10_sub2.method889());
						aClass38_Sub10_Sub1_2832.method843(1, class38_sub22.aClass38_Sub18_2330.aShortArray2212[class38_sub22.anInt2329] < 0, class38_sub22);
						class38_sub22.aClass38_Sub10_Sub2_2314.method870(i_17_, class38_sub10_sub2.method893());
					}
					if (class38_sub22.aClass38_Sub18_2330.aShortArray2212[class38_sub22.anInt2329] < 0)
						class38_sub22.aClass38_Sub10_Sub2_2314.method876(-1);
					class38_sub10_sub2.method874(i_17_);
					class38_sub10_sub2.method667(is, i, -i + i_12_);
					if (class38_sub10_sub2.method908())
						this.aClass38_Sub10_Sub4_2840.method1019(class38_sub10_sub2);
				}
				class38_sub22.anInt2326 += i_14_ * i_13_;
			}
			class38_sub22.aClass38_Sub10_Sub2_2314.method667(is, i, i_13_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fe.H(" + (class38_sub22 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')');
		}
	}
}
