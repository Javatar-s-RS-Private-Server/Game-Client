/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class54 {
	static RSString aClass19_1184;
	static RSString aClass19_1185;
	static Class38_Sub6 aClass38_Sub6_1186;
	static RSString aClass19_1187;
	static RSString aClass19_1188 = RSString.createRSString(" x ");
	static RSString aClass19_1189;
	static RSString aClass19_1192;
	int anInt1193;
	static RSString aClass19_1194;
	static RSString aClass19_1195;
	static RSString aClass19_1196;
	int anInt1197;
	static RSString aClass19_1198;
	static RSString aClass19_1201;
	private static RSString aClass19_1202;
	int anInt1203;
	int anInt1205;
	static RSString[] aClass19Array1206;
	static RSString aClass19_1208;
	static RSString aClass19_1209;

	static final void method418(int i, Class38_Sub20_Sub9_Sub2 class38_sub20_sub9_sub2) {
		do {
			try {
				if (i >= -69)
					Class54.aClass19Array1206 = null;
				for (int i_0_ = 0; i_0_ < Class80.anIntArray1602.length; i_0_++)
					Class80.anIntArray1602[i_0_] = 0;
				int i_1_ = 256;
				for (int i_2_ = 0; i_2_ < 5000; i_2_++) {
					int i_3_ = (int) (i_1_ * (Math.random() * 128.0));
					Class80.anIntArray1602[i_3_] = (int) (Math.random() * 256.0);
				}
				for (int i_4_ = 0; i_4_ < 20; i_4_++) {
					for (int i_5_ = 1; i_5_ < i_1_ - 1; i_5_++)
						for (int i_6_ = 1; i_6_ < 127; i_6_++) {
							int i_7_ = (i_5_ << 1026195975) + i_6_;
							Class73.anIntArray1423[i_7_] = (Class80.anIntArray1602[i_7_ - 1] + Class80.anIntArray1602[i_7_ + 1] - (-Class80.anIntArray1602[i_7_ - 128] - Class80.anIntArray1602[i_7_ + 128])) / 4;
						}
					int[] is = Class80.anIntArray1602;
					Class80.anIntArray1602 = Class73.anIntArray1423;
					Class73.anIntArray1423 = is;
				}
				if (class38_sub20_sub9_sub2 == null)
					break;
				int i_8_ = 0;
				for (int i_9_ = 0; class38_sub20_sub9_sub2.anInt3246 > i_9_; i_9_++)
					for (int i_10_ = 0; class38_sub20_sub9_sub2.anInt3242 > i_10_; i_10_++)
						if (class38_sub20_sub9_sub2.aByteArray3239[i_8_++] != 0) {
							int i_11_ = class38_sub20_sub9_sub2.anInt3245 + i_10_ + 16;
							int i_12_ = i_9_ - (-16 - class38_sub20_sub9_sub2.anInt3240);
							int i_13_ = (i_12_ << 92594759) + i_11_;
							Class80.anIntArray1602[i_13_] = 0;
						}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "kb.F(" + i + ',' + (class38_sub20_sub9_sub2 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	static final int method419(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		try {
			if ((i & 0x1) == 1) {
				int i_20_ = i_18_;
				i_18_ = i_17_;
				i_17_ = i_20_;
			}
			i_15_ &= 0x3;
			if (i_16_ == i_15_)
				return i_14_;
			if (i_15_ == 1)
				return -i_18_ + 1 + -i_19_ + 7;
			if (i_15_ == 2)
				return -i_14_ + 7 + -i_17_ + 1;
			return i_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kb.C(" + i + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')');
		}
	}

	static final boolean method420(int i, int i_21_) {
		try {
			if (i_21_ != 0)
				Class54.aClass19_1188 = null;
			if ((i & 0x1) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kb.G(" + i + ',' + i_21_ + ')');
		}
	}

	static final RSString method421(Class38_Sub6 class38_sub6, int i, int i_22_) {
		try {
			if (i_22_ != 12874)
				Class54.method419(-49, -116, -108, -125, -109, 41, 113);
			if (!NodeSub.method708(0, Class30.method283(i_22_ ^ ~0x3233, class38_sub6), i) && class38_sub6.anObjectArray1907 == null)
				return null;
			if (class38_sub6.aClass19Array1851 == null || class38_sub6.aClass19Array1851.length <= i || class38_sub6.aClass19Array1851[i] == null || class38_sub6.aClass19Array1851[i].method178(-91).method143((byte) 71) == 0) {
				if (Node.aBool892)
					return Class9.method43(new RSString[] { NPC.aClass19_3551, RuntimeException_Sub1.method1098(i, i_22_ ^ 0x324a) }, (byte) -20);
				return null;
			}
			return class38_sub6.aClass19Array1851[i];
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kb.D(" + (class38_sub6 != null ? "{...}" : "null") + ',' + i + ',' + i_22_ + ')');
		}
	}

	static final void method422(int i, int i_23_, int i_24_, int i_25_, Class38_Sub20_Sub4 class38_sub20_sub4) {
		try {
			if (Class38_Sub20_Sub10.anInt2910 < 50 && Class77.anInt1505 != 0 && class38_sub20_sub4.anIntArray2560 != null && i_25_ < class38_sub20_sub4.anIntArray2560.length) {
				int i_26_ = class38_sub20_sub4.anIntArray2560[i_25_];
				if (i_26_ != 0) {
					int i_27_ = i_26_ >> 1421270152;
					ObjectDefinition.anIntArray2442[Class38_Sub20_Sub10.anInt2910] = i_27_;
					int i_28_ = i_26_ >> -1582071836 & 0x7;
					int i_29_ = i_26_ & 0xf;
					int i_30_ = (i_23_ - 64) / 128;
					int i_31_ = (i_24_ - 64) / 128;
					Class61.anIntArray1330[Class38_Sub20_Sub10.anInt2910] = i_28_;
					Class76.anIntArray1495[Class38_Sub20_Sub10.anInt2910] = 0;
					Class38_Sub20_Sub16.aClass68Array3096[Class38_Sub20_Sub10.anInt2910] = null;
					Class77.anIntArray1531[Class38_Sub20_Sub10.anInt2910] = i_29_ + (i_31_ << 1651782512) + (i_30_ << 1158962024);
					int i_32_ = 83 / ((12 - i) / 35);
					Class38_Sub20_Sub10.anInt2910++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kb.A(" + i + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + (class38_sub20_sub4 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method423(int i) {
		try {
			Class38_Sub20_Sub8.aClass14_2863 = new Class14(i);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kb.E(" + i + ')');
		}
	}

	public Class54() {
		/* empty */
	}

	Class54(Class54 class54_33_) {
		try {
			this.anInt1193 = class54_33_.anInt1193;
			this.anInt1203 = class54_33_.anInt1203;
			this.anInt1205 = class54_33_.anInt1205;
			this.anInt1197 = class54_33_.anInt1197;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kb.<init>(" + (class54_33_ != null ? "{...}" : "null") + ')');
		}
	}

	public static void method424(int i) {
		try {
			Class54.aClass19_1208 = null;
			Class54.aClass19_1187 = null;
			Class54.aClass19_1196 = null;
			Class54.aClass19_1198 = null;
			Class54.aClass19_1209 = null;
			Class54.aClass38_Sub6_1186 = null;
			Class54.aClass19_1201 = null;
			Class54.aClass19Array1206 = null;
			Class54.aClass19_1184 = null;
			Class54.aClass19_1192 = null;
			Class54.aClass19_1188 = null;
			Class54.aClass19_1189 = null;
			Class54.aClass19_1185 = null;
			Class54.aClass19_1194 = null;
			if (i >= -125)
				Class54.aClass19_1198 = null;
			Class54.aClass19_1195 = null;
			Class54.aClass19_1202 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kb.B(" + i + ')');
		}
	}

	static {
		Class54.aClass19_1185 = RSString.createRSString("(U3");
		Class54.aClass19_1192 = RSString.createRSString("null");
		Class54.aClass19_1194 = RSString.createRSString("runes");
		Class54.aClass19_1195 = RSString.createRSString("blinken3:");
		Class54.aClass19_1198 = RSString.createRSString("Sie befinden sich in einem Mitglieder)2Gebiet(Q");
		Class54.aClass19_1189 = RSString.createRSString("Benutzen Sie bitte eine andere Welt)3");
		Class54.aClass19_1201 = RSString.createRSString("60 Sekunden noch einmal)3)3)3");
		Class54.aClass19_1202 = RSString.createRSString("Click to switch");
		Class54.aClass19_1208 = RSString.createRSString("Neuer Benutzer");
		Class54.aClass19_1187 = Class54.aClass19_1202;
		Class54.aClass19_1184 = RSString.createRSString("Spiel)2Engine wird gestartet)3)3)3");
		Class54.aClass19_1209 = RSString.createRSString("sl_back");
		Class54.aClass19Array1206 = new RSString[100];
		Class54.aClass19_1196 = RSString.createRSString("Clientscript error in: ");
	}
}
