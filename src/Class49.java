/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class49 {
	static RSString aClass19_1086 = RSString.createRSString(" )2> <col=ffff00>");
	static RSString aClass19_1088;
	static int anInt1089;
	static RSString aClass19_1099 = RSString.createRSString("<img=1>");
	static RSString aClass19_1100;

	static {
		Class49.anInt1089 = 0;
		Class49.aClass19_1088 = RSString.createRSString("Fehler bei der Verbindung zum Server)3");
		Class49.aClass19_1100 = RSString.createRSString(")1");
		client.walkingQueueY = new int[4000];
	}

	int anInt1087;
	int anInt1092;
	int anInt1095;
	int anInt1097;
	int anInt1098;
	SceneModel aClass38_Sub20_Sub3_1101;

	public Class49() {
		/* empty */
	}

	static final void method394(int i, int i_0_, int i_1_, byte i_2_, int i_3_) {
		do {
			try {
				Class38_Sub20_Sub9.method971(i_0_, i_3_, i + i_0_, i_1_ + i_3_);
				Class38_Sub20_Sub9_Sub4.method1191();
				RuntimeException_Sub1.anInt3293++;
				Class38_Sub10_Sub1.method854(true, (byte) -35);
				ItemDefinition.method923(14612, true);
				Class38_Sub10_Sub1.method854(false, (byte) -35);
				ItemDefinition.method923(14612, false);
				Class38_Sub17.method696((byte) 80);
				Class4.method28(0);
				if (!Class38_Sub21.aBool2280) {
					int i_4_ = Class38_Sub20_Sub11.anInt2958;
					int i_5_ = Class38_Sub20_Sub11.anInt2930 + Class55.anInt1212 & 0x7ff;
					if (i_4_ < SceneModel.anInt2546 / 256)
						i_4_ = SceneModel.anInt2546 / 256;
					if (Class20.aBoolArray504[4] && i_4_ < Class67.anIntArray1378[4] + 128)
						i_4_ = Class67.anIntArray1378[4] + 128;
					Class38_Sub20_Sub10.method976(i_5_, Class35.method317(-5736, client.height, client.myPlayer.anInt3493, client.myPlayer.anInt3444) - 50, -24253, i_4_ * 3 + 600, Class38_Sub20_Sub14.anInt3037, i_4_, Class38_Sub3.anInt1780);
				}
				int i_6_;
				if (!Class38_Sub21.aBool2280)
					i_6_ = Class80.method580(3);
				else
					i_6_ = Class38_Sub2.method612(-21211);
				int i_7_ = Class11.anInt208;
				int i_8_ = Class2.anInt30;
				int i_9_ = Class3.anInt44;
				int i_10_ = Class38_Sub18.anInt2209;
				int i_11_ = Entity.anInt3464;
				if (i_2_ < 114)
					Class49.aClass19_1086 = null;
				for (int i_12_ = 0; i_12_ < 5; i_12_++)
					if (Class20.aBoolArray504[i_12_]) {
						int i_13_ = (int) (-Class77.anIntArray1512[i_12_] + (Class77.anIntArray1512[i_12_] * 2 + 1) * Math.random() + Math.sin(client.shakingCycle[i_12_] * (Class32.anIntArray765[i_12_] / 100.0)) * Class67.anIntArray1378[i_12_]);
						if (i_12_ == 4) {
							Class3.anInt44 += i_13_;
							if (Class3.anInt44 < 128)
								Class3.anInt44 = 128;
							if (Class3.anInt44 > 383)
								Class3.anInt44 = 383;
						}
						if (i_12_ == 3)
							Entity.anInt3464 = Entity.anInt3464 + i_13_ & 0x7ff;
						if (i_12_ == 1)
							Class38_Sub18.anInt2209 += i_13_;
						if (i_12_ == 2)
							Class2.anInt30 += i_13_;
						if (i_12_ == 0)
							Class11.anInt208 += i_13_;
					}
				int i_14_ = Class23.anInt543;
				int i_15_ = Class45.anInt1015;
				if (i_14_ < i_0_ || i + i_0_ <= i_14_ || i_15_ < i_3_ || i_3_ + i_1_ <= i_15_) {
					Class38_Sub20_Sub3_Sub1.aBool3192 = false;
					Class38_Sub20_Sub3_Sub1.anInt3201 = 0;
				} else {
					Class38_Sub20_Sub3_Sub1.anInt3201 = 0;
					Class38_Sub20_Sub3_Sub1.anInt3181 = -i_0_ + Class23.anInt543;
					Class38_Sub20_Sub3_Sub1.anInt3182 = -i_3_ + Class45.anInt1015;
					Class38_Sub20_Sub3_Sub1.aBool3192 = true;
				}
				Class42.method357(-7);
				Class38_Sub20_Sub9.method958(i_0_, i_3_, i, i_1_, 0);
				Class42.method357(-7);
				RuntimeException_Sub1.aClass27_3292.method270(Class11.anInt208, Class38_Sub18.anInt2209, Class2.anInt30, Class3.anInt44, Entity.anInt3464, i_6_);
				Class42.method357(-7);
				RuntimeException_Sub1.aClass27_3292.method238();
				Class37.method325((byte) -87, i_1_, i_3_, i_0_, i);
				Class83.method589(i_0_, i_3_, 28);
				((Class45) Class38_Sub20_Sub9_Sub4.anInterface3_3533).method377((byte) 107, Canvas_Sub1.anInt2529);
				Class38_Sub20_Sub3_Sub4.method1155(i_3_, i_1_, 12504, i_0_, i);
				Class11.anInt208 = i_7_;
				Class2.anInt30 = i_8_;
				Class38_Sub18.anInt2209 = i_10_;
				Class3.anInt44 = i_9_;
				Entity.anInt3464 = i_11_;
				if (Class28.aBool680 && Class38_Sub20_Sub8.method955(true, false, -20683) == 0)
					Class28.aBool680 = false;
				if (Class28.aBool680) {
					Class38_Sub20_Sub9.method958(i_0_, i_3_, i, i_1_, 0);
					Class53.method409(Class2.aClass19_39, 16777215, false);
				}
				if (Class28.aBool680 || SceneModel.aBool2553 || i_14_ < i_0_ || i_14_ >= i + i_0_ || i_3_ > i_15_ || i_3_ + i_1_ <= i_15_)
					break;
				Class23.method199(i_14_, -1, i_3_, i_0_, i_15_);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "kf.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')');
			}
			break;
		} while (false);
	}

	static final void method395(int i, int i_16_, ObjectDefinition class38_sub20_sub1, int i_17_, int i_18_, int i_19_) {
		do {
			try {
				if (i != -4)
					Class49.method397(106);
				Class38_Sub1 class38_sub1 = new Class38_Sub1();
				class38_sub1.anInt1754 = i_19_ * 128;
				class38_sub1.anInt1753 = class38_sub20_sub1.anInt2503;
				class38_sub1.anInt1734 = i_18_ * 128;
				class38_sub1.anInt1727 = class38_sub20_sub1.anInt2497;
				class38_sub1.anIntArray1723 = class38_sub20_sub1.anIntArray2465;
				int i_20_ = class38_sub20_sub1.anInt2469;
				class38_sub1.anInt1729 = i_17_;
				class38_sub1.anInt1738 = class38_sub20_sub1.anInt2487 * 128;
				class38_sub1.anInt1722 = class38_sub20_sub1.anInt2506;
				int i_21_ = class38_sub20_sub1.anInt2480;
				if (i_16_ == 1 || i_16_ == 3) {
					i_21_ = class38_sub20_sub1.anInt2469;
					i_20_ = class38_sub20_sub1.anInt2480;
				}
				class38_sub1.anInt1726 = (i_21_ + i_19_) * 128;
				class38_sub1.anInt1733 = (i_20_ + i_18_) * 128;
				if (class38_sub20_sub1.anIntArray2498 != null) {
					class38_sub1.aClass38_Sub20_Sub1_1728 = class38_sub20_sub1;
					class38_sub1.method609(13492);
				}
				Class83.aClass13_1676.method68(class38_sub1, (byte) 45);
				if (class38_sub1.anIntArray1723 == null)
					break;
				class38_sub1.anInt1747 = (int) ((-class38_sub1.anInt1722 + class38_sub1.anInt1727) * Math.random()) + class38_sub1.anInt1722;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "kf.D(" + i + ',' + i_16_ + ',' + (class38_sub20_sub1 != null ? "{...}" : "null") + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')');
			}
			break;
		} while (false);
	}

	public static void method397(int i) {
		try {
			Class49.aClass19_1100 = null;
			Class49.aClass19_1088 = null;
			if (i != 256)
				client.lastCoordX = -67;
			Class49.aClass19_1086 = null;
			Class49.aClass19_1099 = null;
			client.walkingQueueY = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "kf.C(" + i + ')');
		}
	}
}
