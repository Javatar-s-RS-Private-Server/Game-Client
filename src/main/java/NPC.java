/* NPC - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NPC extends Entity {
	Sequence aClass38_Sub20_Sub5_3543;
	static Class13 aClass13_3546 = new Class13();
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array3549;
	static RSString aClass19_3550 = RSString
			.createRSString("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");
	static RSString aClass19_3551;
	static RSString aClass19_3552 = RSString.createRSString("Benutzen");
	static RSString aClass19_3553;
	static int anInt3554;
	static RSString aClass19_3555;
	static RSString aClass19_3556;
	static Class38_Sub9[] aClass38_Sub9Array3557;
	static RSString[] aClass19Array3558;
	static int anInt3559;
	static byte[][][] aByteArrayArrayArray3560;

	@Override
	final boolean isVisible() {
		return false;
	}

	@Override
	final Class38_Sub20_Sub3_Sub1 method820(byte i) {
		try {
			if (this.aClass38_Sub20_Sub5_3543 == null)
				return null;
			Class38_Sub20_Sub4 class38_sub20_sub4 = ((Entity) this).currentAnimationId == -1
					|| ((Entity) this).anInt3461 != 0 ? null : Sequence.forID(
					(byte) 120, ((Entity) this).currentAnimationId);
			if (i != 109)
				NPC.method1200(80, null, 28, null);
			Class38_Sub20_Sub4 class38_sub20_sub4_0_ = ((Entity) this).anInt3454 != -1
					&& (((Entity) this).anInt3454 != ((Entity) this).idleAnimation || class38_sub20_sub4 == null) ? Sequence
					.forID((byte) 87, ((Entity) this).anInt3454) : null;
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = this.aClass38_Sub20_Sub5_3543
					.method919(class38_sub20_sub4_0_,
							((Entity) this).anInt3471, class38_sub20_sub4,
							(byte) 90, ((Entity) this).anInt3474);
			if (class38_sub20_sub3_sub1 == null)
				return null;
			class38_sub20_sub3_sub1.method1043();
			((Entity) this).anInt3434 = ((SceneModel) class38_sub20_sub3_sub1).height;
			if (((Entity) this).anInt3477 != -1
					&& ((Entity) this).anInt3500 != -1) {
				Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_1_ = Class38_Sub11
						.method673(((Entity) this).anInt3477, 127).method984(
								123, ((Entity) this).anInt3500);
				if (class38_sub20_sub3_sub1_1_ != null) {
					class38_sub20_sub3_sub1_1_.method1056(0,
							-((Entity) this).anInt3473, 0);
					Class38_Sub20_Sub3_Sub1[] class38_sub20_sub3_sub1s = {
							class38_sub20_sub3_sub1, class38_sub20_sub3_sub1_1_ };
					class38_sub20_sub3_sub1 = new Class38_Sub20_Sub3_Sub1(
							class38_sub20_sub3_sub1s, 2);
				}
			}
			if (this.aClass38_Sub20_Sub5_3543.anInt2697 == 1)
				class38_sub20_sub3_sub1.aBool3141 = true;
			return class38_sub20_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "q.E(" + i + ')');
		}
	}

	static final void method1200(int i, RS2Buffer stream, int i_2_,
			Class56 class56) {
		try {
			int i_3_ = -42 % ((-43 - i_2_) / 48);
			Class38_Sub7 class38_sub7 = new Class38_Sub7();
			class38_sub7.anInt2035 = stream.getUByte();
			class38_sub7.anInt2018 = stream.method759(true);
			class38_sub7.aClass65Array2034 = new Class65[class38_sub7.anInt2035];
			class38_sub7.anIntArray2024 = new int[class38_sub7.anInt2035];
			class38_sub7.aByteArrayArrayArray2033 = new byte[class38_sub7.anInt2035][][];
			class38_sub7.anIntArray2026 = new int[class38_sub7.anInt2035];
			class38_sub7.anIntArray2032 = new int[class38_sub7.anInt2035];
			class38_sub7.aClass65Array2029 = new Class65[class38_sub7.anInt2035];
			for (int i_4_ = 0; class38_sub7.anInt2035 > i_4_; i_4_++)
				try {
					int i_5_ = stream.getUByte();
					if (i_5_ != 0 && i_5_ != 1 && i_5_ != 2) {
						if (i_5_ == 3 || i_5_ == 4) {
							String string = new String(stream.getUShort(
									1347418632).method158(122));
							String string_6_ = new String(stream
									.getUShort(1347418632).method158(122));
							int i_7_ = stream.getUByte();
							String[] strings = new String[i_7_];
							for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
								strings[i_8_] = new String(stream
										.getUShort(1347418632).method158(122));
							byte[][] is = new byte[i_7_][];
							if (i_5_ == 3)
								for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
									int i_10_ = stream.method759(true);
									is[i_9_] = new byte[i_10_];
									stream.method778(i_10_, 0, false,
											is[i_9_]);
								}
							Class[] var_classes = new Class[i_7_];
							class38_sub7.anIntArray2032[i_4_] = i_5_;
							for (int i_11_ = 0; i_7_ > i_11_; i_11_++)
								var_classes[i_11_] = Class3.method20(
										strings[i_11_], -73);
							class38_sub7.aClass65Array2034[i_4_] = class56
									.method434(var_classes, string_6_, 8,
											Class3.method20(string, -79));
							class38_sub7.aByteArrayArrayArray2033[i_4_] = is;
						}
					} else {
						String string = new String(stream.getUShort(
								1347418632).method158(122));
						String string_12_ = new String(stream.getUShort(
								1347418632).method158(122));
						int i_13_ = 0;
						if (i_5_ == 1)
							i_13_ = stream.method759(true);
						class38_sub7.anIntArray2032[i_4_] = i_5_;
						class38_sub7.anIntArray2026[i_4_] = i_13_;
						class38_sub7.aClass65Array2029[i_4_] = class56
								.method428(true, Class3.method20(string, -67),
										string_12_);
					}
				} catch (ClassNotFoundException classnotfoundexception) {
					class38_sub7.anIntArray2024[i_4_] = -1;
				} catch (SecurityException securityexception) {
					class38_sub7.anIntArray2024[i_4_] = -2;
				} catch (NullPointerException nullpointerexception) {
					class38_sub7.anIntArray2024[i_4_] = -3;
				} catch (Exception exception) {
					class38_sub7.anIntArray2024[i_4_] = -4;
				} catch (Throwable throwable) {
					class38_sub7.anIntArray2024[i_4_] = -5;
				}
			Class76.aClass13_1496.method68(class38_sub7, (byte) 79);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "q.H(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_2_
					+ ',' + (class56 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method1201(byte i) {
		do {
			try {
				synchronized (Class38_Sub14.anObject2126) {
					if (Node.anInt897 == 0)
						Class38_Sub4.aClass56_1798.method430(5, new Class47(),
								112);
					Node.anInt897 = 600;
				}
				if (i == -53)
					break;
				NPC.method1204(true, -58);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1
						.method607(runtimeexception, "q.I(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method1202(byte i, RSString class19) {
		try {
			if (class19 == null)
				return false;
			int i_14_ = 0;
			if (i > -83)
				NPC.method1204(false, -94);
			for (/**/; Class38_Sub20_Sub3_Sub2.anInt3250 > i_14_; i_14_++)
				if (class19.method174((byte) 104,
						Class54.aClass19Array1206[i_14_]))
					return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "q.K(" + i + ','
					+ (class19 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method1203(byte i) {
		try {
			NPC.aClass19_3551 = null;
			NPC.aClass19_3555 = null;
			NPC.aClass19_3550 = null;
			NPC.aClass19Array3558 = null;
			int i_15_ = 50 / ((i + 31) / 52);
			NPC.aClass38_Sub20_Sub9_Sub3Array3549 = null;
			NPC.aClass38_Sub9Array3557 = null;
			NPC.aClass13_3546 = null;
			NPC.aClass19_3556 = null;
			NPC.aClass19_3552 = null;
			NPC.aClass19_3553 = null;
			NPC.aByteArrayArrayArray3560 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "q.J(" + i + ')');
		}
	}

	static final RSString method1204(boolean bool, int i) {
		try {
			if (bool != true)
				NPC.method1204(true, 42);
			if (Class37.aClass19Array865[i].method143((byte) 39) > 0)
				return Class9.method43(new RSString[] {
						Class10.aClass19Array194[i], Class77.aClass19_1510,
						Class37.aClass19Array865[i] }, (byte) -20);
			return Class10.aClass19Array194[i];
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "q.G(" + bool + ','
					+ i + ')');
		}
	}

	static {
		NPC.aClass19_3551 = RSString
				.createRSString("Hidden)2");
		NPC.anInt3554 = -1;
		NPC.aClass19Array3558 = new RSString[100];
		NPC.aClass19_3555 = RSString
				.createRSString("sl_stars");
		NPC.aClass19_3556 = RSString
				.createRSString("Verbindung konnte nicht hergestellt werden)3");
		NPC.aClass19_3553 = RSString
				.createRSString("Lade Konfiguration )2 ");
	}
}
