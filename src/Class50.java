/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class50 {
	static int[] anIntArray1103 = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	static int anInt1106;
	static int[] anIntArray1107;
	static RSString aClass19_1108;
	static RSString aClass19_1109;
	static RSString aClass19_1110 = RSString.createRSString(" <col=00ff80>");
	static RSString aClass19_1112;
	static int[] anIntArray1114;
	static RSString aClass19_1116;
	static RSString aClass19_1117;
	static short[][] aShortArrayArray1118;
	private static RSString aClass19_1111;

	static {
		Class50.anInt1106 = 0;
		Class50.anIntArray1107 = new int[500];
		Class50.aClass19_1111 = RSString.createRSString("Examine");
		Class50.aClass19_1109 = RSString.createRSString("Der Server wird gerade aktualisiert)3");
		Class50.aClass19_1112 = Class50.aClass19_1111;
		Class50.aClass19_1108 = RSString.createRSString("swe");
		Class50.anIntArray1114 = new int[99];
		Class50.aClass19_1116 = RSString.createRSString("<col=ff3000>");
		Class50.aClass19_1117 = RSString.createRSString("(U5");
		int i = 0;
		for (int i_6_ = 0; i_6_ < 99; i_6_++) {
			int i_7_ = i_6_ + 1;
			int i_8_ = (int) (i_7_ + Math.pow(2.0, i_7_ / 7.0) * 300.0);
			i += i_8_;
			Class50.anIntArray1114[i_6_] = i / 4;
		}
		Class50.aShortArrayArray1118 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		client.crossState = 0;
	}

	static final void method398(Class31 class31, int i, boolean bool) {
		try {
			if (Class38_Sub20_Sub17.aClass31_3138 != null) {
				try {
					Class38_Sub20_Sub17.aClass31_3138.method292(-30);
				} catch (Exception exception) {
					/* empty */
				}
				Class38_Sub20_Sub17.aClass31_3138 = null;
			}
			Class38_Sub20_Sub17.aClass31_3138 = class31;
			if (i >= 35) {
				Class44.method367(0, bool);
				Class38_Sub20_Sub15.aClass38_Sub23_3066.pos = 0;
				Class38_Sub11.anInt2101 = 0;
				Class38_Sub20_Sub3_Sub2.aClass38_Sub23_3275 = null;
				Class38_Sub20_Sub4.aClass38_Sub20_Sub2_2564 = null;
				for (;;) {
					Class38_Sub20_Sub2 class38_sub20_sub2 = (Class38_Sub20_Sub2) Class76.aClass14_1485.method82((byte) 121);
					if (class38_sub20_sub2 == null)
						break;
					Sequence.aClass14_2713.method80(true, class38_sub20_sub2.aLong898, class38_sub20_sub2);
					Class15.anInt291++;
					Class78.anInt1561--;
				}
				for (;;) {
					Class38_Sub20_Sub2 class38_sub20_sub2 = (Class38_Sub20_Sub2) PlayerAppearance.aClass14_397.method82((byte) 79);
					if (class38_sub20_sub2 == null)
						break;
					Class61.aClass26_1325.method214((byte) -102, class38_sub20_sub2);
					Class40.aClass14_914.method80(true, class38_sub20_sub2.aLong898, class38_sub20_sub2);
					Class20.anInt502++;
					RS2Buffer.anInt2406--;
				}
				if (Class38_Sub14.aByte2141 != 0)
					try {
						RS2Buffer class38_sub23 = new RS2Buffer(4);
						class38_sub23.putByte(4);
						class38_sub23.putByte(Class38_Sub14.aByte2141);
						class38_sub23.putShort(0);
						Class38_Sub20_Sub17.aClass31_3138.write(class38_sub23.buffer, 4, (byte) 126);
					} catch (java.io.IOException ioexception) {
						try {
							Class38_Sub20_Sub17.aClass31_3138.method292(92);
						} catch (Exception exception) {
							/* empty */
						}
						Class38_Sub20_Sub17.aClass31_3138 = null;
						Class38_Sub20_Sub15.anInt3067++;
					}
				Class38_Sub20_Sub11.anInt2916 = 0;
				Class38_Sub20_Sub3_Sub5.aLong3376 = Class9.method48((byte) -114);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tc.A(" + (class31 != null ? "{...}" : "null") + ',' + i + ',' + bool + ')');
		}
	}

	public static void method399(boolean bool) {
		try {
			Class50.aClass19_1108 = null;
			Class50.aClass19_1110 = null;
			Class50.anIntArray1114 = null;
			Class50.anIntArray1103 = null;
			Class50.aClass19_1111 = null;
			Class50.aShortArrayArray1118 = null;
			Class50.anIntArray1107 = null;
			if (bool)
				Class50.method400(false, -96, null);
			Class50.aClass19_1112 = null;
			Class50.aClass19_1116 = null;
			Class50.aClass19_1109 = null;
			Class50.aClass19_1117 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tc.C(" + bool + ')');
		}
	}

	static final byte[] method400(boolean bool, int i, Object object) {
		try {
			if (object == null)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				if (bool)
					return Class23.method204(49, is);
				return is;
			}
			if (i != 2)
				Class50.method399(true);
			if (object instanceof Class59) {
				Class59 class59 = (Class59) object;
				return class59.method449((byte) 84);
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tc.B(" + bool + ',' + i + ',' + (object != null ? "{...}" : "null") + ')');
		}
	}

	static final void method401(int i) {
		try {
			int i_0_ = Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1061(Class80.aClass19_1597);
			for (int i_1_ = 0; Class72.anInt1417 > i_1_; i_1_++) {
				int i_2_ = Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093.method1061(NPC.method1204(true, i_1_));
				if (i_2_ > i_0_)
					i_0_ = i_2_;
			}
			Class38_Sub20_Sub2.anInt2540 = Class72.anInt1417 * 15 + 22;
			i_0_ += 8;
			SceneModel.aBool2553 = true;
			if (i != -5560)
				Class50.aClass19_1116 = null;
			int i_3_ = Class72.anInt1417 * 15 + 21;
			int i_4_ = Class73.anInt1429 - i_0_ / 2;
			Class3.anInt66 = i_0_;
			int i_5_ = RS2Buffer.anInt2416;
			if (i_0_ + i_4_ > 765)
				i_4_ = -i_0_ + 765;
			if (i_5_ + i_3_ > 503)
				i_5_ = -i_3_ + 503;
			if (i_5_ < 0)
				i_5_ = 0;
			if (i_4_ < 0)
				i_4_ = 0;
			Class38_Sub20_Sub13.anInt3011 = i_5_;
			Class38_Sub6.anInt1976 = i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tc.D(" + i + ')');
		}
	}
}
