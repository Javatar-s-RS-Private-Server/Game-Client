/* Class38_Sub20_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub3_Sub2 extends SceneModel {
	static RSString aClass19_3247 = RSString.createRSString("(Y<)4col>");
	static int anInt3250 = 0;
	static short[][] aShortArrayArray3251;
	static int[] anIntArray3257;
	static int anInt3260;
	static int[] anIntArray3264;
	static RSString aClass19_3269;
	static RSString aClass19_3270;
	static RSString aClass19_3271;
	static RSString aClass19_3273;
	static int anInt3274;
	static RS2Buffer aClass38_Sub23_3275;
	static RSString aClass19_3276;
	static RSString aClass19_3277;
	private static RSString aClass19_3252;
	private static RSString aClass19_3267 = RSString.createRSString("slide:");

	static {
		Class38_Sub20_Sub3_Sub2.aClass19_3252 = RSString.createRSString("shake:");
		Class38_Sub20_Sub3_Sub2.aClass19_3270 = Class38_Sub20_Sub3_Sub2.aClass19_3252;
		Class38_Sub20_Sub3_Sub2.aClass19_3269 = Class38_Sub20_Sub3_Sub2.aClass19_3267;
		Class38_Sub20_Sub3_Sub2.aClass19_3271 = RSString.createRSString("null");
		Class38_Sub20_Sub3_Sub2.aClass19_3273 = Class38_Sub20_Sub3_Sub2.aClass19_3267;
		Class38_Sub20_Sub3_Sub2.anInt3260 = 0;
		Class38_Sub20_Sub3_Sub2.anIntArray3264 = new int[128];
		Class38_Sub20_Sub3_Sub2.aClass19_3277 = Class38_Sub20_Sub3_Sub2.aClass19_3252;
		Class38_Sub20_Sub3_Sub2.aClass19_3276 = RSString.createRSString("Keine Antwort vom Anmelde)2Server)3");
	}

	private final int anInt3249;
	private final int anInt3258;
	private final int anInt3259;
	private final int anInt3261;
	private final int anInt3262;
	private final int anInt3263;
	private int anInt3254;
	private Class38_Sub20_Sub4 aClass38_Sub20_Sub4_3255;
	private int anInt3265;

	Class38_Sub20_Sub3_Sub2(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, boolean bool, SceneModel class38_sub20_sub3) {
		do {
			try {
				anInt3261 = i;
				anInt3259 = i_15_;
				anInt3249 = i_17_;
				anInt3262 = i_19_;
				anInt3263 = i_16_;
				anInt3258 = i_18_;
				if (i_20_ == -1)
					break;
				aClass38_Sub20_Sub4_3255 = Sequence.forID((byte) 112, i_20_);
				anInt3254 = 0;
				anInt3265 = Class45.anInt1016 - 1;
				if (aClass38_Sub20_Sub4_3255.anInt2587 == 0 && class38_sub20_sub3 != null && class38_sub20_sub3 instanceof Class38_Sub20_Sub3_Sub2) {
					Class38_Sub20_Sub3_Sub2 class38_sub20_sub3_sub2_21_ = (Class38_Sub20_Sub3_Sub2) class38_sub20_sub3;
					if (aClass38_Sub20_Sub4_3255 == class38_sub20_sub3_sub2_21_.aClass38_Sub20_Sub4_3255) {
						anInt3254 = class38_sub20_sub3_sub2_21_.anInt3254;
						anInt3265 = class38_sub20_sub3_sub2_21_.anInt3265;
						break;
					}
				}
				if (!bool || aClass38_Sub20_Sub4_3255.anInt2578 == -1)
					break;
				anInt3254 = (int) (aClass38_Sub20_Sub4_3255.anIntArray2585.length * Math.random());
				anInt3265 -= (int) (aClass38_Sub20_Sub4_3255.anIntArray2568[anInt3254] * Math.random());
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "pb.<init>(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + bool + ',' + (class38_sub20_sub3 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static final void method1092(int i, Class38_Sub6[] class38_sub6s, int i_0_) {
		try {
			if (i_0_ != 2047)
				Class38_Sub20_Sub3_Sub2.method1094(7);
			int i_1_ = 0;
			for (/**/; i_1_ < class38_sub6s.length; i_1_++) {
				Class38_Sub6 class38_sub6 = class38_sub6s[i_1_];
				if (class38_sub6 != null && class38_sub6.anInt1977 == i && (!class38_sub6.aBool1961 || !Class43.method362(true, class38_sub6))) {
					if (class38_sub6.anInt1868 == 0) {
						if (!class38_sub6.aBool1961 && Class43.method362(true, class38_sub6) && Class38_Sub2.aClass38_Sub6_1774 != class38_sub6)
							continue;
						Class38_Sub20_Sub3_Sub2.method1092(class38_sub6.anInt1856, class38_sub6s, i_0_);
						if (class38_sub6.aClass38_Sub6Array1867 != null)
							Class38_Sub20_Sub3_Sub2.method1092(class38_sub6.anInt1856, class38_sub6.aClass38_Sub6Array1867, 2047);
						Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method75(class38_sub6.anInt1856, (byte) -106);
						if (class38_sub8 != null)
							Class10.method54(-128, class38_sub8.anInt2038);
					}
					if (class38_sub6.anInt1868 == 6) {
						if (class38_sub6.anInt1878 != -1 || class38_sub6.anInt1900 != -1) {
							boolean bool = Class24.method208(class38_sub6, i_0_ - 1983);
							int i_2_;
							if (!bool)
								i_2_ = class38_sub6.anInt1878;
							else
								i_2_ = class38_sub6.anInt1900;
							if (i_2_ != -1) {
								Class38_Sub20_Sub4 class38_sub20_sub4 = Sequence.forID((byte) 98, i_2_);
								class38_sub6.anInt1952 += Canvas_Sub1.anInt2529;
								while (class38_sub20_sub4.anIntArray2568[class38_sub6.anInt1875] < class38_sub6.anInt1952) {
									class38_sub6.anInt1952 -= class38_sub20_sub4.anIntArray2568[class38_sub6.anInt1875];
									class38_sub6.anInt1875++;
									if (class38_sub20_sub4.anIntArray2585.length <= class38_sub6.anInt1875) {
										class38_sub6.anInt1875 -= class38_sub20_sub4.anInt2578;
										if (class38_sub6.anInt1875 < 0 || class38_sub20_sub4.anIntArray2585.length <= class38_sub6.anInt1875)
											class38_sub6.anInt1875 = 0;
									}
									Class40.method340(class38_sub6, (byte) -121);
								}
							}
						}
						if (class38_sub6.anInt1862 != 0 && !class38_sub6.aBool1961) {
							int i_3_ = class38_sub6.anInt1862 >> 16;
							int i_4_ = class38_sub6.anInt1862 << 16 >> 16;
							i_3_ *= Canvas_Sub1.anInt2529;
							class38_sub6.anInt1925 = i_3_ + class38_sub6.anInt1925 & 0x7ff;
							i_4_ *= Canvas_Sub1.anInt2529;
							class38_sub6.anInt1987 = class38_sub6.anInt1987 + i_4_ & 0x7ff;
							Class40.method340(class38_sub6, (byte) -119);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pb.H(" + i + ',' + (class38_sub6s != null ? "{...}" : "null") + ',' + i_0_ + ')');
		}
	}

	static final void method1093(int i) {
		do {
			try {
				if (Class38_Sub11.aClass10_2089 != null)
					synchronized (Class38_Sub11.aClass10_2089) {
						Class38_Sub11.aClass10_2089 = null;
					}
				if (i == 100)
					break;
				Class38_Sub20_Sub3_Sub2.method1094(109);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "pb.G(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method1094(int i) {
		try {
			Class38_Sub20_Sub3_Sub2.aShortArrayArray3251 = null;
			if (i != 1654298567)
				Class38_Sub20_Sub3_Sub2.anInt3250 = 26;
			Class38_Sub20_Sub3_Sub2.anIntArray3257 = null;
			Class38_Sub20_Sub3_Sub2.aClass19_3271 = null;
			Class38_Sub20_Sub3_Sub2.aClass19_3277 = null;
			Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275 = null;
			Class38_Sub20_Sub3_Sub2.aClass19_3270 = null;
			Class38_Sub20_Sub3_Sub2.aClass19_3273 = null;
			Class38_Sub20_Sub3_Sub2.aClass19_3276 = null;
			Class38_Sub20_Sub3_Sub2.aClass19_3252 = null;
			Class38_Sub20_Sub3_Sub2.aClass19_3267 = null;
			Class38_Sub20_Sub3_Sub2.aClass19_3269 = null;
			Class38_Sub20_Sub3_Sub2.aClass19_3247 = null;
			Class38_Sub20_Sub3_Sub2.anIntArray3264 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pb.F(" + i + ')');
		}
	}

	@Override
	final Class38_Sub20_Sub3_Sub1 method820(byte i) {
		try {
			if (aClass38_Sub20_Sub4_3255 != null) {
				int i_5_ = -anInt3265 + Class45.anInt1016;
				if (i_5_ > 100 && aClass38_Sub20_Sub4_3255.anInt2578 > 0)
					i_5_ = 100;
				while (i_5_ > aClass38_Sub20_Sub4_3255.anIntArray2568[anInt3254]) {
					i_5_ -= aClass38_Sub20_Sub4_3255.anIntArray2568[anInt3254];
					anInt3254++;
					if (aClass38_Sub20_Sub4_3255.anIntArray2585.length <= anInt3254) {
						anInt3254 -= aClass38_Sub20_Sub4_3255.anInt2578;
						if (anInt3254 < 0 || aClass38_Sub20_Sub4_3255.anIntArray2585.length <= anInt3254) {
							aClass38_Sub20_Sub4_3255 = null;
							break;
						}
					}
				}
				anInt3265 = -i_5_ + Class45.anInt1016;
			}
			ObjectDefinition class38_sub20_sub1 = Class80.method581(i - 237, anInt3261);
			if (class38_sub20_sub1.anIntArray2498 != null)
				class38_sub20_sub1 = class38_sub20_sub1.method805((byte) -17);
			if (class38_sub20_sub1 == null)
				return null;
			int i_6_;
			int i_7_;
			if (anInt3263 == 1 || anInt3263 == 3) {
				i_7_ = class38_sub20_sub1.anInt2469;
				i_6_ = class38_sub20_sub1.anInt2480;
			} else {
				i_6_ = class38_sub20_sub1.anInt2469;
				i_7_ = class38_sub20_sub1.anInt2480;
			}
			int i_8_ = anInt3258 + (i_6_ + 1 >> 1);
			int i_9_ = anInt3258 + (i_6_ >> 1);
			int i_10_ = anInt3262 + (i_7_ >> 1);
			int i_11_ = (i_7_ + 1 >> 1) + anInt3262;
			int[][] is = Player.anIntArrayArrayArray3566[anInt3249];
			int i_12_ = is[i_8_][i_11_] + is[i_9_][i_11_] + is[i_9_][i_10_] + is[i_8_][i_10_] >> 2;
			int i_13_ = (anInt3258 << 7) + (i_6_ << 6);
			int i_14_ = (anInt3262 << 7) + (i_7_ << 6);
			if (i != 109)
				return null;
			return class38_sub20_sub1.method798(false, aClass38_Sub20_Sub4_3255, i_14_, anInt3259, is, i_13_, anInt3254, i_12_, anInt3263);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pb.E(" + i + ')');
		}
	}
}
