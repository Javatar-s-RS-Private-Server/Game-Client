/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class58 {
	static Class17 aClass17_1278;
	static RSString aClass19_1280;
	static RSString aClass19_1281;
	static int[] anIntArray1282;
	static RSString aClass19_1283 = RSString.createRSString("und Ihr Passwort ein)3");
	static Class38_Sub24 aClass38_Sub24_1285;
	static int anInt1286;
	static RSString aClass19_1288;
	private static RSString aClass19_1290;

	static {
		Class58.aClass19_1280 = RSString.createRSString("oberen Rand der Webseite ausw-=hlen)3");
		Class58.anIntArray1282 = new int[] { 1, 0, -1, 0 };
		Class58.aClass19_1281 = RSString.createRSString("Lade)3)3)3");
		Class58.aClass19_1290 = RSString.createRSString("Loaded textures");
		Class58.aClass19_1288 = Class58.aClass19_1290;
	}

	public static void method442(int i) {
		try {
			Class58.anIntArray1282 = null;
			Class58.aClass19_1290 = null;
			Class58.aClass19_1280 = null;
			Class58.aClass19_1288 = null;
			Class58.aClass19_1281 = null;
			if (i != -1)
				Class58.aClass19_1280 = null;
			Class58.aClass38_Sub24_1285 = null;
			Class58.aClass17_1278 = null;
			Class58.aClass19_1283 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sd.A(" + i + ')');
		}
	}

	static final RSString method443(byte i, RS2Buffer class38_sub23) {
		try {
			if (i != 33)
				Class58.method443((byte) -108, null);
			return Class5.method29(0, 32767, class38_sub23);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sd.D(" + i + ',' + (class38_sub23 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method444(Class53 class53, int i) {
		do {
			try {
				Class41.aClass53_935 = class53;
				if (i == 32767)
					break;
				Class58.aClass19_1283 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "sd.C(" + (class53 != null ? "{...}" : "null") + ',' + i + ')');
			}
			break;
		} while (false);
	}

	static final Class38_Sub20_Sub9_Sub1_Sub1 method445(int i, Class17 class17, byte i_0_, Class17 class17_1_, int i_2_) {
		try {
			if (!Class22.method197(i, class17_1_, -308039560, i_2_))
				return null;
			int i_3_ = 115 / ((i_0_ - 24) / 44);
			return Class38_Sub10_Sub1.method853(class17.method109(i, i_2_, -109), true);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "sd.B(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + i_0_ + ',' + (class17_1_ != null ? "{...}" : "null") + ',' + i_2_ + ')');
		}
	}
}
