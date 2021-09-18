/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class82 {
	static Class83 aClass83_1641 = new Class83(64);
	static int[] anIntArray1642;
	static Class17 aClass17_1643;
	static Class38_Sub20_Sub9_Sub3 aClass38_Sub20_Sub9_Sub3_1644;
	static int[] anIntArray1645;
	static RSString aClass19_1646;
	static int anInt1647 = 0;
	static byte[][][] aByteArrayArrayArray1648 = new byte[4][104][104];
	static RSString aClass19_1649 = RSString.createRSString("mapedge");

	static {
		Class82.aClass19_1646 = RSString.createRSString("me");
	}

	SceneModel aClass38_Sub20_Sub3_1627;
	int anInt1628;
	SceneModel aClass38_Sub20_Sub3_1630;
	int anInt1632;
	int anInt1634 = 0;
	int anInt1635;
	int anInt1636;
	int anInt1637;
	int anInt1640 = 0;

	public Class82() {
		/* empty */
	}

	static final int method586(int i, int i_0_, int i_1_, int i_2_) {
		try {
			int i_3_ = i_1_ / i_0_;
			int i_4_ = i / i_0_;
			int i_5_ = i_0_ - 1 & i_1_;
			int i_6_ = i_0_ - 1 & i;
			int i_7_ = Class55.method425(i_4_, i_3_, -1);
			int i_8_ = Class55.method425(i_4_, i_3_ + 1, -1);
			int i_9_ = Class55.method425(i_4_ + 1, i_3_, -1);
			int i_10_ = Class55.method425(i_4_ + 1, i_3_ + 1, -1);
			if (i_2_ <= 77)
				Class82.aClass38_Sub20_Sub9_Sub3_1644 = null;
			int i_11_ = Class59.method448(i_0_, i_5_, i_8_, 77, i_7_);
			int i_12_ = Class59.method448(i_0_, i_5_, i_10_, 114, i_9_);
			return Class59.method448(i_0_, i_6_, i_12_, 86, i_11_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ab.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')');
		}
	}

	public static void method587(int i) {
		try {
			Class82.aClass17_1643 = null;
			Class82.anIntArray1645 = null;
			Class82.anIntArray1642 = null;
			Class82.aByteArrayArrayArray1648 = null;
			Class82.aClass19_1646 = null;
			Class82.aClass19_1649 = null;
			if (i != 64)
				Class82.method587(55);
			Class82.aClass83_1641 = null;
			Class82.aClass38_Sub20_Sub9_Sub3_1644 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ab.C(" + i + ')');
		}
	}

	static final void method588(byte i, Class17 class17, Class17 class17_13_) {
		do {
			try {
				Class38_Sub10_Sub3.aClass17_2841 = class17_13_;
				Class15.aClass17_298 = class17;
				if (i == -73)
					break;
				Class82.aByteArrayArrayArray1648 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ab.B(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + (class17_13_ != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}
}
