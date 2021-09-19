/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class35 {
	static int anInt805;
	int anInt806;
	static RSString aClass19_807 = RSString.createRSString("(U0a )2 via: ");
	int[][] anIntArrayArray808;
	byte[] aByteArray809 = new byte[256];
	static int[] anIntArray810;
	byte[] aByteArray811;
	byte aByte812;
	byte[][] aByteArrayArray813;
	static RSString aClass19_814 = RSString.createRSString("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");
	int anInt815;
	static int anInt816;
	int anInt817;
	byte[] aByteArray818;
	int anInt819;
	int anInt820;
	int[][] anIntArrayArray821;
	static RSString aClass19_822;
	int[] anIntArray823;
	static short[] aShortArray825 = { -1, 9104, -1, -1, -1 };
	int anInt827;
	byte[] aByteArray828;
	int anInt829;
	byte[] aByteArray830;
	byte[] aByteArray831;
	private static RSString aClass19_832;
	int anInt833;
	int anInt834;
	int anInt835;
	int anInt836;
	int[][] anIntArrayArray838;
	int anInt839;
	static int[] anIntArray840;
	int[] anIntArray841;
	int[] anIntArray843;
	boolean[] aBoolArray844;
	boolean[] aBoolArray845;
	int anInt846;
	int[] anIntArray847;
	int anInt848;
	static Class38_Sub10_Sub1 aClass38_Sub10_Sub1_849;
	int anInt850;

	static final void method314(int i) {
		try {
			Class76.aClass13_1496 = new Class13();
			if (i != 1007765799)
				Class35.aClass19_814 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "m.A(" + i + ')');
		}
	}

	public static void method315(byte i) {
		try {
			Class35.aClass19_822 = null;
			Class35.aClass19_807 = null;
			Class35.anIntArray810 = null;
			Class35.aClass38_Sub10_Sub1_849 = null;
			Class35.anIntArray840 = null;
			if (i >= -34)
				Class35.method316(-33);
			Class35.aShortArray825 = null;
			Class35.aClass19_814 = null;
			Class35.aClass19_832 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "m.D(" + i + ')');
		}
	}

	static final void method316(int i) {
		do {
			try {
				try {
					if (Class73_Sub2.aClass55_2303 == null)
						Class73_Sub2.aClass55_2303 = new Class55(Class38_Sub4.aClass56_1798, Class9.method43(new RSString[] { Class17_Sub1.aClass19_1720, Class38_Sub22.aClass19_2310, Class38_Sub17.aClass19_2190 }, (byte) -20).method181(-120));
					else {
						byte[] is = Class73_Sub2.aClass55_2303.method426(false);
						if (is != null) {
							RS2Buffer class38_sub23 = new RS2Buffer(is);
							Class49.anInt1089 = class38_sub23.getUShort();
							Sequence.aClass4Array2736 = new Class4[Class49.anInt1089];
							for (int i_0_ = 0; Class49.anInt1089 > i_0_; i_0_++) {
								Class4 class4 = Sequence.aClass4Array2736[i_0_] = new Class4();
								int i_1_ = class38_sub23.getUShort();
								class4.anInt86 = i_1_ & 0x7fff;
								class4.aBool83 = (i_1_ & 0x8000) != 0;
								class4.aClass19_73 = class38_sub23.getUShort(1347418632);
								class4.anInt80 = class38_sub23.method772(false);
								class4.anInt88 = i_0_;
								class4.anInt77 = Class64.method473(-126, class4.aClass19_73);
							}
							Class38_Sub2.method614(0, Sequence.aClass4Array2736.length - 1, Class38_Sub1.anIntArray1742, 126, Class38_Sub4.anIntArray1792, Sequence.aClass4Array2736);
							Class74.aBool1448 = true;
							Class73_Sub2.aClass55_2303 = null;
						}
					}
				} catch (Exception exception) {
					exception.printStackTrace();
					Class73_Sub2.aClass55_2303 = null;
				}
				if (i == 7032)
					break;
				Class35.method316(10);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "m.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method317(int i, int i_2_, int i_3_, int i_4_) {
		try {
			int i_5_ = i_3_ >> 608679463;
			int i_6_ = i_4_ >> -1144583897;
			if (i_5_ < 0 || i_6_ < 0 || i_5_ > 103 || i_6_ > 103)
				return 0;
			if (i != -5736)
				return -97;
			int i_7_ = i_2_;
			int i_8_ = i_3_ & 0x7f;
			if (i_7_ < 3 && (Class82.aByteArrayArrayArray1648[1][i_5_][i_6_] & 0x2) == 2)
				i_7_++;
			int i_9_ = i_4_ & 0x7f;
			int i_10_ = i_8_ * Player.anIntArrayArrayArray3566[i_7_][i_5_ + 1][i_6_] + Player.anIntArrayArrayArray3566[i_7_][i_5_][i_6_] * (-i_8_ + 128) >> 1007765799;
			int i_11_ = Player.anIntArrayArrayArray3566[i_7_][i_5_][i_6_ + 1] * (-i_8_ + 128) + Player.anIntArrayArrayArray3566[i_7_][i_5_ + 1][i_6_ + 1] * i_8_ >> 103285287;
			return i_10_ * (-i_9_ + 128) + i_11_ * i_9_ >> -1882131385;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "m.C(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')');
		}
	}

	Class35() {
		this.anInt806 = 0;
		this.anIntArrayArray821 = new int[6][258];
		this.anIntArrayArray808 = new int[6][258];
		this.anIntArray823 = new int[257];
		this.aByteArray830 = new byte[18002];
		this.aByteArrayArray813 = new byte[6][258];
		this.aByteArray811 = new byte[4096];
		this.anIntArray841 = new int[16];
		this.anIntArrayArray838 = new int[6][258];
		this.anIntArray843 = new int[6];
		this.aBoolArray845 = new boolean[256];
		this.aByteArray831 = new byte[18002];
		this.anInt836 = 0;
		this.aBoolArray844 = new boolean[16];
		this.anIntArray847 = new int[256];
	}

	static {
		Class35.anInt816 = 0;
		Class35.aClass19_832 = RSString.createRSString("Prepared visibility map");
		Class35.anIntArray840 = new int[1000];
		Class35.aClass19_822 = Class35.aClass19_832;
		Class35.anIntArray810 = new int[] { 0, -1, 0, 1 };
	}
}
