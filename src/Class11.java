/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11 {
	static RSString aClass19_198;
	static RSString aClass19_201;
	static int anInt202;
	static RSString aClass19_203;
	static RSString aClass19_206;
	static RSString aClass19_207;
	static int anInt208;
	static RSString aClass19_210;
	static Class17 aClass17_213;
	static RSString aClass19_214;
	private static RSString aClass19_195;
	private static RSString aClass19_197 = RSString.createRSString("Loaded update list");
	static RSString aClass19_199 = Class11.aClass19_197;
	private static RSString aClass19_200;
	private static RSString aClass19_211;
	private static RSString aClass19_212;

	static {
		Class11.aClass19_195 = RSString.createRSString("Connecting to server)3)3)3");
		Class11.aClass19_210 = RSString.createRSString(":duelreq:");
		Class11.aClass19_201 = Class11.aClass19_195;
		Class11.aClass19_200 = RSString.createRSString("button near the top of that page)3");
		Class11.aClass19_203 = Class11.aClass19_200;
		Class11.aClass19_211 = RSString.createRSString("Members only world");
		Class11.aClass19_198 = Class11.aClass19_211;
		Class11.aClass19_207 = RSString.createRSString("Lade Schrifts-=tze )2 ");
		Class11.aClass19_214 = RSString.createRSString("title_mute");
		Class11.aClass19_212 = RSString.createRSString("Existing User");
		Class11.aClass19_206 = Class11.aClass19_212;
	}

	static final void method55(int i) {
		do {
			try {
				if (Class26.aBool614) {
					Class38_Sub6 class38_sub6 = Class38_Sub20_Sub12.method987(Node.anInt893, Class2_Sub1.anInt2008, (byte) -29);
					if (class38_sub6 != null && class38_sub6.anObjectArray1915 != null) {
						Class38_Sub19 class38_sub19 = new Class38_Sub19();
						class38_sub19.aClass38_Sub6_2241 = class38_sub6;
						class38_sub19.anObjectArray2240 = class38_sub6.anObjectArray1915;
						Class15.method84(class38_sub19, (byte) -73);
					}
					Class26.aBool614 = false;
					Class40.method340(class38_sub6, (byte) -104);
					if (i == -8602)
						break;
					Class11.method57((byte) 56);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "pa.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method56(byte i) {
		try {
			if (i != -26)
				Class11.aClass19_212 = null;
			PacketBuffer.aClass83_2433.method596(26);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pa.C(" + i + ')');
		}
	}

	public static void method57(byte i) {
		try {
			Class11.aClass19_206 = null;
			Class11.aClass19_210 = null;
			client.clippingHeights = null;
			Class11.aClass17_213 = null;
			Class11.aClass19_203 = null;
			Class11.aClass19_207 = null;
			Class11.aClass19_214 = null;
			if (i < 122)
				Class11.method55(0);
			Class11.aClass19_211 = null;
			Class11.aClass19_197 = null;
			Class11.aClass19_212 = null;
			Class11.aClass19_201 = null;
			Class11.aClass19_199 = null;
			Class11.aClass19_200 = null;
			Class11.aClass19_198 = null;
			Class11.aClass19_195 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pa.A(" + i + ')');
		}
	}
}
