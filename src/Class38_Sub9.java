/* Class38_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub9 extends Node {
	static RSString aClass19_2053;
	static int anInt2055 = 0;
	static Class38_Sub10_Sub4 aClass38_Sub10_Sub4_2057;
	static int anInt2059;
	static int anInt2060;
	static Class83 aClass83_2062;
	static boolean objectLowMem;
	static RSString aClass19_2065;
	static int anInt2067;
	static RSString aClass19_2068;
	static RSString aClass19_2069;
	static int[] anIntArray2070;
	static RSString aClass19_2071;
	static int anInt2072;
	private static RSString aClass19_2054;
	private static RSString aClass19_2058 = RSString.createRSString("Please enter your username)3");
	private static RSString aClass19_2073;

	static {
		Class38_Sub9.aClass19_2054 = RSString.createRSString("Password: ");
		Class38_Sub9.aClass19_2053 = RSString.createRSString("Anmelde)2Zeitlimit -Uberschritten)3");
		Class38_Sub9.aClass19_2065 = Class38_Sub9.aClass19_2054;
		Class38_Sub9.objectLowMem = false;
		Class38_Sub9.anInt2067 = -1;
		Class38_Sub9.anInt2059 = 1;
		Class38_Sub9.aClass19_2068 = Class38_Sub9.aClass19_2058;
		Class38_Sub9.aClass83_2062 = new Class83(64);
		Class38_Sub9.aClass19_2071 = RSString.createRSString("Benutzername: ");
		Class38_Sub9.aClass19_2073 = RSString.createRSString("Login");
		Class38_Sub9.aClass19_2069 = Class38_Sub9.aClass19_2073;
	}

	byte aByte2056;
	RSString aClass19_2061;
	int anInt2063;

	public Class38_Sub9() {
		/* empty */
	}

	public static void method663(byte i) {
		try {
			Class38_Sub9.aClass19_2073 = null;
			Class38_Sub9.aClass19_2054 = null;
			Class38_Sub9.aClass38_Sub10_Sub4_2057 = null;
			Class38_Sub9.aClass19_2069 = null;
			Class38_Sub9.aClass19_2058 = null;
			Class38_Sub9.aClass19_2068 = null;
			if (i < 115)
				Class38_Sub9.aClass19_2073 = null;
			Class38_Sub9.anIntArray2070 = null;
			Class38_Sub9.aClass83_2062 = null;
			Class38_Sub9.aClass19_2071 = null;
			Class38_Sub9.aClass19_2065 = null;
			Class38_Sub9.aClass19_2053 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fa.B(" + i + ')');
		}
	}

	static final Class32 method664(byte i) {
		try {
			if (i != -4)
				Class38_Sub9.aClass38_Sub10_Sub4_2057 = null;
			try {
				return (Class32) Class.forName("ic").newInstance();
			} catch (Throwable throwable) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "fa.A(" + i + ')');
		}
	}
}
