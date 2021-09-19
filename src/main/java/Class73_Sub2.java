/* Class73_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class73_Sub2 extends Class73 {
	static int anInt2287;
	static RSString aClass19_2288;
	static RSString aClass19_2289;
	static RSString aClass19_2290 = RSString.createRSString("Ihr Spielkonto wird bereits benutzt)3");
	private int anInt2291;
	private int anInt2292;
	static boolean[] aBoolArray2294;
	private static RSString aClass19_2295;
	private static RSString aClass19_2296;
	private int anInt2297;
	static int[] anIntArray2299;
	private long[] aLongArray2300 = new long[10];
	private int anInt2301;
	static Class55 aClass55_2303;
	static RSString aClass19_2304;
	static RSString aClass19_2307;
	private static RSString aClass19_2308;
	private long aLong2309;

	public static void method717(boolean bool) {
		try {
			Class73_Sub2.aClass19_2289 = null;
			Class73_Sub2.aClass55_2303 = null;
			Class73_Sub2.aBoolArray2294 = null;
			Class73_Sub2.aClass19_2296 = null;
			Class73_Sub2.aClass19_2295 = null;
			Class73_Sub2.aClass19_2288 = null;
			if (bool != true)
				Class73_Sub2.aClass19_2295 = null;
			Class73_Sub2.aClass19_2307 = null;
			Class73_Sub2.aClass19_2308 = null;
			Class73_Sub2.aClass19_2290 = null;
			Class73_Sub2.anIntArray2299 = null;
			Class73_Sub2.aClass19_2304 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "le.C(" + bool + ')');
		}
	}

	@Override
	final int method519(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = anInt2297;
			anInt2297 = 300;
			int i_3_ = anInt2291;
			anInt2291 = i_0_;
			aLong2309 = Class9.method48((byte) -109);
			if (aLongArray2300[anInt2301] == 0L) {
				anInt2297 = i_2_;
				anInt2291 = i_3_;
			} else if (aLong2309 > aLongArray2300[anInt2301])
				anInt2297 = (int) (i * 2560 / (-aLongArray2300[anInt2301] + aLong2309));
			if (anInt2297 < 25)
				anInt2297 = 25;
			if (anInt2297 > 256) {
				anInt2297 = 256;
				anInt2291 = (int) (-((aLong2309 + -aLongArray2300[anInt2301]) / 10L) + i);
			}
			if (anInt2291 > i)
				anInt2291 = i;
			aLongArray2300[anInt2301] = aLong2309;
			anInt2301 = (anInt2301 + 1) % 10;
			if (anInt2291 > 1)
				for (int i_4_ = 0; i_4_ < 10; i_4_++)
					if (aLongArray2300[i_4_] != 0L)
						aLongArray2300[i_4_] = aLongArray2300[i_4_] + anInt2291;
			if (i_1_ > anInt2291)
				anInt2291 = i_1_;
			Canvas_Sub1.method809(anInt2291, -27166);
			int i_5_ = 0;
			while (anInt2292 < 256) {
				anInt2292 += anInt2297;
				i_5_++;
			}
			anInt2292 &= 0xff;
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "le.B(" + i + ',' + i_0_ + ',' + i_1_ + ')');
		}
	}

	static final Class38_Sub20_Sub9_Sub3 method718(byte i) {
		try {
			if (i != -120)
				Class73_Sub2.method718((byte) 28);
			Class38_Sub20_Sub9_Sub3 class38_sub20_sub9_sub3 = new Class38_Sub20_Sub9_Sub3();
			class38_sub20_sub9_sub3.anInt3294 = Class16.anInt339;
			class38_sub20_sub9_sub3.anInt3298 = Class38_Sub20_Sub8.anIntArray2873[0];
			class38_sub20_sub9_sub3.anInt3299 = Class51.anIntArray1130[0];
			class38_sub20_sub9_sub3.anInt3297 = Class61.anIntArray1332[0];
			byte[] is = Class30.aByteArrayArray727[0];
			int i_6_ = class38_sub20_sub9_sub3.anInt3297 * class38_sub20_sub9_sub3.anInt3298;
			class38_sub20_sub9_sub3.anInt3295 = Player.anIntArray3574[0];
			class38_sub20_sub9_sub3.anIntArray3300 = new int[i_6_];
			class38_sub20_sub9_sub3.anInt3296 = Projectile.anInt3426;
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				class38_sub20_sub9_sub3.anIntArray3300[i_7_] = PlayerAppearance.anIntArray420[Class38_Sub10_Sub3.method941(255, is[i_7_])];
			Player.method1207((byte) 29);
			return class38_sub20_sub9_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "le.D(" + i + ')');
		}
	}

	Class73_Sub2() {
		try {
			anInt2291 = 1;
			anInt2297 = 256;
			anInt2292 = 0;
			aLong2309 = Class9.method48((byte) -109);
			for (int i = 0; i < 10; i++)
				aLongArray2300[i] = aLong2309;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "le.<init>(" + ')');
		}
	}

	@Override
	final void method518(int i) {
		try {
			int i_8_ = 0;
			if (i <= 110)
				method519(-69, -51, -73);
			for (/**/; i_8_ < 10; i_8_++)
				aLongArray2300[i_8_] = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "le.A(" + i + ')');
		}
	}

	static {
		Class73_Sub2.aClass19_2289 = RSString.createRSString("Fertigkeit)2");
		Class73_Sub2.aBoolArray2294 = new boolean[100];
		Class73_Sub2.anIntArray2299 = new int[256];
		Class73_Sub2.anInt2287 = 0;
		Class73_Sub2.aClass19_2295 = RSString.createRSString("Error connecting to server)3");
		Class73_Sub2.aClass19_2288 = Class73_Sub2.aClass19_2295;
		Class73_Sub2.aClass19_2308 = RSString.createRSString("Press (Wchange your password(W on front page)3");
		Class73_Sub2.aClass19_2296 = RSString.createRSString("You have only just left another world)3");
		Class73_Sub2.aClass19_2304 = Class73_Sub2.aClass19_2296;
		Class73_Sub2.aClass19_2307 = Class73_Sub2.aClass19_2308;
	}
}
