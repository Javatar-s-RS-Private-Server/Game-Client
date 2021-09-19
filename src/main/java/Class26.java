/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class26 {
	static BigInteger aBigInteger599;
	static Class17 aClass17_600;
	private NodeSub aClass38_Sub20_601 = new NodeSub();
	static RSString aClass19_602 = RSString.createRSString(")4l");
	private static RSString aClass19_607 = RSString.createRSString("b12_full");
	private static RSString aClass19_608;
	static RSString aClass19_609;
	static RSString aClass19_610;
	static String aString611;
	static RSString aClass19_612;
	static volatile int anInt613;
	static boolean aBool614;
	static RSString aClass19_615;
	static RSString aClass19_616;
	static RSString aClass19_617;
	static int anInt618;
	private static RSString aClass19_619;

	final void method214(byte i, NodeSub class38_sub20) {
		try {
			if (class38_sub20.aClass38_Sub20_2248 != null)
				class38_sub20.method707(false);
			class38_sub20.aClass38_Sub20_2248 = aClass38_Sub20_601;
			class38_sub20.aClass38_Sub20_2244 = aClass38_Sub20_601.aClass38_Sub20_2244;
			int i_0_ = -64 % ((46 - i) / 34);
			class38_sub20.aClass38_Sub20_2248.aClass38_Sub20_2244 = class38_sub20;
			class38_sub20.aClass38_Sub20_2244.aClass38_Sub20_2248 = class38_sub20;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ve.C(" + i + ',' + (class38_sub20 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method215(boolean bool) {
		try {
			Class26.aClass19_607 = null;
			Class26.aBigInteger599 = null;
			Class26.aClass19_615 = null;
			if (bool)
				Class26.method215(false);
			Class26.aClass17_600 = null;
			Class26.aClass19_617 = null;
			Class26.aClass19_608 = null;
			Class26.aClass19_612 = null;
			Class26.aString611 = null;
			Class26.aClass19_609 = null;
			Class26.aClass19_619 = null;
			Class26.aClass19_616 = null;
			Class26.aClass19_610 = null;
			Class26.aClass19_602 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ve.D(" + bool + ')');
		}
	}

	final NodeSub method216(byte i) {
		try {
			NodeSub class38_sub20 = aClass38_Sub20_601.aClass38_Sub20_2244;
			if (i > -73)
				method216((byte) 62);
			if (aClass38_Sub20_601 == class38_sub20)
				return null;
			return class38_sub20;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ve.A(" + i + ')');
		}
	}

	final void method217(NodeSub class38_sub20, int i) {
		try {
			if (class38_sub20.aClass38_Sub20_2248 != null)
				class38_sub20.method707(false);
			class38_sub20.aClass38_Sub20_2244 = aClass38_Sub20_601;
			class38_sub20.aClass38_Sub20_2248 = aClass38_Sub20_601.aClass38_Sub20_2248;
			if (i != 2048)
				method217(null, -63);
			class38_sub20.aClass38_Sub20_2248.aClass38_Sub20_2244 = class38_sub20;
			class38_sub20.aClass38_Sub20_2244.aClass38_Sub20_2248 = class38_sub20;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ve.E(" + (class38_sub20 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method218(byte i) {
		try {
			if (NodeSub.anInt2253 == 0) {
				RuntimeException_Sub1.aClass27_3292 = new SceneGraph(4, 104, 104, Player.anIntArrayArrayArray3566);
				for (int i_1_ = 0; i_1_ < 4; i_1_++)
					Client.clippingHeights[i_1_] = new Class74(104, 104);
				Class38_Sub17.aClass38_Sub20_Sub9_Sub3_2194 = new Class38_Sub20_Sub9_Sub3(512, 512);
				NodeSub.anInt2253 = 20;
				Class51.aClass19_1127 = Class31.aClass19_761;
				Class31.anInt748 = 5;
			} else if (NodeSub.anInt2253 == 20) {
				int[] is = new int[9];
				for (int i_2_ = 0; i_2_ < 9; i_2_++) {
					int i_3_ = i_2_ * 32 + 128 + 15;
					int i_4_ = i_3_ * 3 + 600;
					int i_5_ = Class38_Sub20_Sub9_Sub4.anIntArray3520[i_3_];
					is[i_2_] = i_5_ * i_4_ >> 1477447152;
				}
				SceneGraph.method230(is, 500, 800, 512, 334);
				Class31.anInt748 = 10;
				Class51.aClass19_1127 = Class35.aClass19_822;
				NodeSub.anInt2253 = 30;
			} else if (NodeSub.anInt2253 == 30) {
				Class38_Sub14.aClass17_Sub1_2147 = Class40.method339(0, (byte) 126, true, false, true);
				Class38_Sub11.aClass17_Sub1_2103 = Class40.method339(1, (byte) 126, true, false, true);
				Class78.aClass17_Sub1_1555 = Class40.method339(2, (byte) 120, true, true, false);
				RS2Buffer.aClass17_Sub1_2359 = Class40.method339(3, (byte) 125, true, false, true);
				Class33.aClass17_Sub1_784 = Class40.method339(4, (byte) 122, true, false, true);
				Class48.aClass17_Sub1_1070 = Class40.method339(5, (byte) 123, true, true, true);
				Class67.aClass17_Sub1_1382 = Class40.method339(6, (byte) 123, false, true, true);
				Class30.aClass17_Sub1_729 = Class40.method339(7, (byte) 127, true, false, true);
				Class17.aClass17_Sub1_376 = Class40.method339(8, (byte) 124, true, false, true);
				Applet_Sub1.aClass17_Sub1_3639 = Class40.method339(9, (byte) 119, true, false, true);
				Class52.aClass17_Sub1_1151 = Class40.method339(10, (byte) 127, true, false, true);
				Class38_Sub1.aClass17_Sub1_1746 = Class40.method339(11, (byte) 124, true, false, true);
				Class38_Sub1.aClass17_Sub1_1724 = Class40.method339(12, (byte) 127, true, false, true);
				Class13.aClass17_Sub1_237 = Class40.method339(13, (byte) 124, true, true, false);
				Class5.aClass17_Sub1_114 = Class40.method339(14, (byte) 121, false, false, true);
				Node.aClass17_Sub1_891 = Class40.method339(15, (byte) 124, true, false, true);
				Class31.anInt748 = 20;
				Class51.aClass19_1127 = Player.aClass19_3562;
				NodeSub.anInt2253 = 40;
			} else if (NodeSub.anInt2253 == 40) {
				int i_6_ = 0;
				i_6_ += Class38_Sub14.aClass17_Sub1_2147.method600(20181) * 4 / 100;
				i_6_ += Class38_Sub11.aClass17_Sub1_2103.method600(20181) * 4 / 100;
				i_6_ += Class78.aClass17_Sub1_1555.method600(i + 20273) * 2 / 100;
				i_6_ += RS2Buffer.aClass17_Sub1_2359.method600(i ^ ~0x4e8e) * 2 / 100;
				i_6_ += Class33.aClass17_Sub1_784.method600(20181) * 6 / 100;
				i_6_ += Class48.aClass17_Sub1_1070.method600(20181) * 4 / 100;
				i_6_ += Class67.aClass17_Sub1_1382.method600(20181) * 2 / 100;
				i_6_ += Class30.aClass17_Sub1_729.method600(i + 20273) * 60 / 100;
				i_6_ += Class17.aClass17_Sub1_376.method600(20181) * 2 / 100;
				i_6_ += Applet_Sub1.aClass17_Sub1_3639.method600(20181) * 2 / 100;
				i_6_ += Class52.aClass17_Sub1_1151.method600(20181) * 2 / 100;
				i_6_ += Class38_Sub1.aClass17_Sub1_1746.method600(20181) * 2 / 100;
				i_6_ += Class38_Sub1.aClass17_Sub1_1724.method600(20181) * 2 / 100;
				i_6_ += Class13.aClass17_Sub1_237.method600(20181) * 2 / 100;
				i_6_ += Class5.aClass17_Sub1_114.method600(20181) * 2 / 100;
				i_6_ += Node.aClass17_Sub1_891.method600(20181) * 2 / 100;
				if (i_6_ != 100) {
					if (i_6_ != 0)
						Class51.aClass19_1127 = Class9.method43(new RSString[] { Canvas_Sub1.aClass19_2521, RuntimeException_Sub1.method1098(i_6_, i + 92), Projectile.aClass19_3397 }, (byte) -20);
					Class31.anInt748 = 30;
				} else {
					Class51.aClass19_1127 = Class11.aClass19_199;
					NodeSub.anInt2253 = 45;
					Class31.anInt748 = 30;
				}
			} else if (NodeSub.anInt2253 == 45) {
				NodeSub.method710(!Class38_Sub4.aBool1811, 22050, i - 14130, 2);
				Class38_Sub10_Sub1 class38_sub10_sub1 = new Class38_Sub10_Sub1();
				class38_sub10_sub1.method838((byte) -108, 9, 128);
				Class38_Sub6.aClass77_1857 = Class78.method567(Class38_Sub4.aClass56_1798, 0, 22050, (byte) 62, Class38_Sub3.aCanvas1783);
				Class38_Sub6.aClass77_1857.method550(class38_sub10_sub1, 256000);
				PacketBuffer.method782(Class33.aClass17_Sub1_784, Class5.aClass17_Sub1_114, class38_sub10_sub1, (byte) 19, Node.aClass17_Sub1_891);
				Class38_Sub7.aClass77_2025 = Class78.method567(Class38_Sub4.aClass56_1798, 1, 2048, (byte) 62, Class38_Sub3.aCanvas1783);
				Class38_Sub9.aClass38_Sub10_Sub4_2057 = new Class38_Sub10_Sub4();
				Class38_Sub7.aClass77_2025.method550(Class38_Sub9.aClass38_Sub10_Sub4_2057, 256000);
				Class38_Sub20_Sub12.aClass20_3008 = new Class20(22050, Class38_Sub20_Sub7.anInt2852);
				NodeSub.anInt2253 = 50;
				Class31.anInt748 = 35;
				Class51.aClass19_1127 = Class38_Sub20_Sub14.aClass19_3044;
			} else if (NodeSub.anInt2253 == 50) {
				int i_7_ = 0;
				if (Client.aClass38_Sub20_Sub9_Sub1_Sub1_3656 != null)
					i_7_++;
				else
					Client.aClass38_Sub20_Sub9_Sub1_Sub1_3656 = Class76.method542((byte) -62, Class17.aClass17_Sub1_376, Class13.aClass17_Sub1_237, Class38_Sub22.aClass19_2312, Class38_Sub2.aClass19_1766);
				if (Class38_Sub20_Sub13.aClass38_Sub20_Sub9_Sub1_Sub1_3023 == null)
					Class38_Sub20_Sub13.aClass38_Sub20_Sub9_Sub1_Sub1_3023 = Class76.method542((byte) -68, Class17.aClass17_Sub1_376, Class13.aClass17_Sub1_237, Class38_Sub22.aClass19_2312, Class78.aClass19_1554);
				else
					i_7_++;
				if (Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093 == null)
					Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093 = Class76.method542((byte) -59, Class17.aClass17_Sub1_376, Class13.aClass17_Sub1_237, Class38_Sub22.aClass19_2312, Class26.aClass19_607);
				else
					i_7_++;
				if (i_7_ < 3) {
					Class51.aClass19_1127 = Class9.method43(new RSString[] { Class38_Sub18.aClass19_2219, RuntimeException_Sub1.method1098(i_7_ * 100 / 3, 0), Projectile.aClass19_3397 }, (byte) -20);
					Class31.anInt748 = 40;
				} else {
					Class51.aClass19_1127 = Class38_Sub7.aClass19_2028;
					Class31.anInt748 = 40;
					NodeSub.anInt2253 = 60;
				}
			} else if (NodeSub.anInt2253 == 60) {
				int i_8_ = Class38_Sub17.method694(-27706, Class17.aClass17_Sub1_376, Class52.aClass17_Sub1_1151);
				int i_9_ = Class76.method546(-104);
				if (i_9_ > i_8_) {
					Class51.aClass19_1127 = Class9.method43(new RSString[] { Class25.aClass19_584, RuntimeException_Sub1.method1098(i_8_ * 100 / i_9_, 0), Projectile.aClass19_3397 }, (byte) -20);
					Class31.anInt748 = 50;
				} else {
					Class31.anInt748 = 50;
					Class51.aClass19_1127 = Class9.aClass19_159;
					Canvas_Sub1.method808(0, 5);
					NodeSub.anInt2253 = 70;
				}
			} else if (NodeSub.anInt2253 == 70) {
				if (!Class78.aClass17_Sub1_1555.method111(i ^ ~0x9)) {
					Class51.aClass19_1127 = Class9.method43(new RSString[] { RS2Buffer.aClass19_2379, RuntimeException_Sub1.method1098(Class78.aClass17_Sub1_1555.method605(0), 0), Projectile.aClass19_3397 }, (byte) -20);
					Class31.anInt748 = 60;
				} else {
					Class29.method277(Class78.aClass17_Sub1_1555, i ^ ~0x58);
					Class9.method50((byte) -114, Class78.aClass17_Sub1_1555);
					Class38_Sub20_Sub7.method945(Class30.aClass17_Sub1_729, (byte) 5, Class78.aClass17_Sub1_1555);
					Class51.method403(Class30.aClass17_Sub1_729, 112, Class38_Sub4.aBool1811, Class78.aClass17_Sub1_1555);
					Class38_Sub20_Sub3_Sub5.method1161(Class78.aClass17_Sub1_1555, Class30.aClass17_Sub1_729, (byte) 116);
					Class66.method476(Class30.aClass17_Sub1_729, Class78.aClass17_Sub1_1555, Node.aBool889, Client.aClass38_Sub20_Sub9_Sub1_Sub1_3656, (byte) 78);
					Class38_Sub22.method722(Class38_Sub11.aClass17_Sub1_2103, Class78.aClass17_Sub1_1555, (byte) -85, Class38_Sub14.aClass17_Sub1_2147);
					Class82.method588((byte) -73, Class30.aClass17_Sub1_729, Class78.aClass17_Sub1_1555);
					SceneModel.method819(Class78.aClass17_Sub1_1555, i + 92);
					Class38_Sub20_Sub7.method946(Class78.aClass17_Sub1_1555, i + 108);
					Class25.method210(Class17.aClass17_Sub1_376, true, Class30.aClass17_Sub1_729, Class13.aClass17_Sub1_237, RS2Buffer.aClass17_Sub1_2359);
					Class73.method516(Class78.aClass17_Sub1_1555, 8);
					Class38_Sub1.method606(Class78.aClass17_Sub1_1555, -128);
					Class51.aClass19_1127 = Class2_Sub1.aClass19_2010;
					Class31.anInt748 = 60;
					NodeSub.anInt2253 = 80;
				}
			} else {
				if (i != -92)
					Class26.aClass19_607 = null;
				if (NodeSub.anInt2253 == 80) {
					int i_10_ = 0;
					if (Class82.aClass38_Sub20_Sub9_Sub3_1644 != null)
						i_10_++;
					else
						Class82.aClass38_Sub20_Sub9_Sub3_1644 = Class81.method585(Class17.aClass17_Sub1_376, Class38_Sub22.aClass19_2312, Class38_Sub7.aClass19_2036, 32554);
					if (Class2.aClass38_Sub20_Sub9_Sub3_41 == null)
						Class2.aClass38_Sub20_Sub9_Sub3_41 = Class81.method585(Class17.aClass17_Sub1_376, Class38_Sub22.aClass19_2312, Class82.aClass19_1649, 32554);
					else
						i_10_++;
					if (ItemDefinition.aClass38_Sub20_Sub9_Sub2Array2813 == null)
						ItemDefinition.aClass38_Sub20_Sub9_Sub2Array2813 = Class37.method329(Class38_Sub22.aClass19_2312, Class38_Sub21.aClass19_2284, -11, Class17.aClass17_Sub1_376);
					else
						i_10_++;
					if (NPC.aClass38_Sub20_Sub9_Sub3Array3549 == null)
						NPC.aClass38_Sub20_Sub9_Sub3Array3549 = ItemDefinition.method929(Class48.aClass19_1077, Class17.aClass17_Sub1_376, true, Class38_Sub22.aClass19_2312);
					else
						i_10_++;
					if (Class17.aClass38_Sub20_Sub9_Sub3Array391 != null)
						i_10_++;
					else
						Class17.aClass38_Sub20_Sub9_Sub3Array391 = ItemDefinition.method929(PlayerAppearance.aClass19_399, Class17.aClass17_Sub1_376, true, Class38_Sub22.aClass19_2312);
					if (Class17.aClass38_Sub20_Sub9_Sub3Array382 != null)
						i_10_++;
					else
						Class17.aClass38_Sub20_Sub9_Sub3Array382 = ItemDefinition.method929(Class6.str_headicons_pk, Class17.aClass17_Sub1_376, true, Class38_Sub22.aClass19_2312);
					if (Class73.aClass38_Sub20_Sub9_Sub3Array1431 == null)
						Class73.aClass38_Sub20_Sub9_Sub3Array1431 = ItemDefinition.method929(Class38_Sub20_Sub17.aClass19_3121, Class17.aClass17_Sub1_376, true, Class38_Sub22.aClass19_2312);
					else
						i_10_++;
					if (Class59.aClass38_Sub20_Sub9_Sub3Array1301 == null)
						Class59.aClass38_Sub20_Sub9_Sub3Array1301 = ItemDefinition.method929(Class38_Sub20_Sub17.aClass19_3126, Class17.aClass17_Sub1_376, true, Class38_Sub22.aClass19_2312);
					else
						i_10_++;
					if (Sequence.aClass38_Sub20_Sub9_Sub3Array2734 == null)
						Sequence.aClass38_Sub20_Sub9_Sub3Array2734 = ItemDefinition.method929(Class38_Sub2.aClass19_1773, Class17.aClass17_Sub1_376, true, Class38_Sub22.aClass19_2312);
					else
						i_10_++;
					if (Class33.aClass38_Sub20_Sub9_Sub3Array780 == null)
						Class33.aClass38_Sub20_Sub9_Sub3Array780 = ItemDefinition.method929(Class9.aClass19_155, Class17.aClass17_Sub1_376, true, Class38_Sub22.aClass19_2312);
					else
						i_10_++;
					if (Class22.aClass38_Sub20_Sub9_Sub3Array539 == null)
						Class22.aClass38_Sub20_Sub9_Sub3Array539 = ItemDefinition.method929(Class38_Sub8.aClass19_2041, Class17.aClass17_Sub1_376, true, Class38_Sub22.aClass19_2312);
					else
						i_10_++;
					if (Class38_Sub1.aClass38_Sub20_Sub9_Sub2Array1730 != null)
						i_10_++;
					else
						Class38_Sub1.aClass38_Sub20_Sub9_Sub2Array1730 = Class37.method329(Class38_Sub22.aClass19_2312, Class38_Sub20_Sub10.aClass19_2907, i ^ 0x51, Class17.aClass17_Sub1_376);
					if (Class40.aClass38_Sub20_Sub9_Sub2Array921 != null)
						i_10_++;
					else
						Class40.aClass38_Sub20_Sub9_Sub2Array921 = Class37.method329(Class38_Sub22.aClass19_2312, Class38_Sub12.aClass19_2117, -11, Class17.aClass17_Sub1_376);
					if (Class64.aClass38_Sub20_Sub9_Sub2_1359 == null)
						Class64.aClass38_Sub20_Sub9_Sub2_1359 = Class38_Sub20_Sub3_Sub5.method1160(Class38_Sub22.aClass19_2312, Class17.aClass17_Sub1_376, false, Class47.aClass19_1052);
					else
						i_10_++;
					if (i_10_ < 14) {
						Class51.aClass19_1127 = Class9.method43(new RSString[] { Class83.aClass19_1669, RuntimeException_Sub1.method1098(i_10_ * 100 / 14, 0), Projectile.aClass19_3397 }, (byte) -20);
						Class31.anInt748 = 70;
					} else {
						Class38_Sub20_Sub9_Sub1.aClass38_Sub20_Sub9_Sub2Array3220 = Class40.aClass38_Sub20_Sub9_Sub2Array921;
						int i_11_ = (int) (Math.random() * 21.0) - 10;
						Class2.aClass38_Sub20_Sub9_Sub3_41.method1110();
						int i_12_ = (int) (Math.random() * 21.0) - 10;
						int i_13_ = (int) (Math.random() * 21.0) - 10;
						int i_14_ = (int) (Math.random() * 41.0) - 20;
						for (int i_15_ = 0; i_15_ < NPC.aClass38_Sub20_Sub9_Sub3Array3549.length; i_15_++)
							NPC.aClass38_Sub20_Sub9_Sub3Array3549[i_15_].method1125(i_14_ + i_11_, i_14_ + i_12_, i_13_ + i_14_);
						ItemDefinition.aClass38_Sub20_Sub9_Sub2Array2813[0].method1091(i_14_ + i_11_, i_14_ + i_12_, i_13_ + i_14_);
						Class38_Sub3.method620((byte) -77);
						Class51.aClass19_1127 = Class74.aClass19_1437;
						Class31.anInt748 = 70;
						NodeSub.anInt2253 = 90;
					}
				} else if (NodeSub.anInt2253 == 90) {
					if (!Applet_Sub1.aClass17_Sub1_3639.method111(86)) {
						Class51.aClass19_1127 = Class9.method43(new RSString[] { Class26.aClass19_610, RuntimeException_Sub1.method1098(Applet_Sub1.aClass17_Sub1_3639.method605(0), i + 92), Projectile.aClass19_3397 }, (byte) -20);
						Class31.anInt748 = 90;
					} else {
						Class45 class45 = new Class45(Applet_Sub1.aClass17_Sub1_3639, Class17.aClass17_Sub1_376, 20, 0.8, Class38_Sub4.aBool1811 ? 64 : 128);
						Class38_Sub20_Sub9_Sub4.method1196(class45);
						Class38_Sub20_Sub9_Sub4.method1184(0.8);
						NodeSub.anInt2253 = 110;
						Class51.aClass19_1127 = Class58.aClass19_1288;
						Class31.anInt748 = 90;
					}
				} else if (NodeSub.anInt2253 == 110) {
					Client.mouseRecorder = new Class40();
					Class38_Sub4.aClass56_1798.method430(10, Client.mouseRecorder, i + 197);
					Class31.anInt748 = 94;
					NodeSub.anInt2253 = 120;
					Class51.aClass19_1127 = Class10.aClass19_187;
				} else if (NodeSub.anInt2253 == 120) {
					if (!Class52.aClass17_Sub1_1151.method113(Client.str_huffman, Class38_Sub22.aClass19_2312, -122)) {
						Class51.aClass19_1127 = Class9.method43(new RSString[] { Class13.aClass19_243, Class38_Sub11.aClass19_2102 }, (byte) -20);
						Class31.anInt748 = 96;
					} else {
						Class53 class53 = new Class53(Class52.aClass17_Sub1_1151.method122(Client.str_huffman, i ^ ~0xa5b, Class38_Sub22.aClass19_2312));
						Class58.method444(class53, 32767);
						Class51.aClass19_1127 = Class25.aClass19_586;
						Class31.anInt748 = 96;
						NodeSub.anInt2253 = 130;
					}
				} else if (NodeSub.anInt2253 == 130) {
					if (!RS2Buffer.aClass17_Sub1_2359.method111(i ^ ~0x2)) {
						Class51.aClass19_1127 = Class9.method43(new RSString[] { Class73.aClass19_1430, RuntimeException_Sub1.method1098(RS2Buffer.aClass17_Sub1_2359.method605(0) * 4 / 5, i + 92), Projectile.aClass19_3397 }, (byte) -20);
						Class31.anInt748 = 100;
					} else if (!Class38_Sub1.aClass17_Sub1_1724.method111(88)) {
						Class51.aClass19_1127 = Class9.method43(new RSString[] { Class73.aClass19_1430, RuntimeException_Sub1.method1098(80 + Class38_Sub1.aClass17_Sub1_1724.method605(0) / 6, 0), Projectile.aClass19_3397 }, (byte) -20);
						Class31.anInt748 = 100;
					} else if (!Class13.aClass17_Sub1_237.method111(-115)) {
						Class51.aClass19_1127 = Class9.method43(new RSString[] { Class73.aClass19_1430, RuntimeException_Sub1.method1098(96 + Class13.aClass17_Sub1_237.method605(0) / 20, 0), Projectile.aClass19_3397 }, (byte) -20);
						Class31.anInt748 = 100;
					} else {
						NodeSub.anInt2253 = 140;
						Class51.aClass19_1127 = Class25.aClass19_587;
						Class31.anInt748 = 100;
					}
				} else if (NodeSub.anInt2253 == 140)
					Canvas_Sub1.method808(i + 92, 10);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ve.F(" + i + ')');
		}
	}

	final NodeSub method219(int i) {
		try {
			NodeSub class38_sub20 = aClass38_Sub20_601.aClass38_Sub20_2244;
			if (i < 84)
				Class26.method215(true);
			if (class38_sub20 == aClass38_Sub20_601)
				return null;
			class38_sub20.method707(false);
			return class38_sub20;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ve.B(" + i + ')');
		}
	}

	public Class26() {
		try {
			aClass38_Sub20_601.aClass38_Sub20_2248 = aClass38_Sub20_601;
			aClass38_Sub20_601.aClass38_Sub20_2244 = aClass38_Sub20_601;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ve.<init>(" + ')');
		}
	}

	static {
		Class26.aBigInteger599 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		Class26.aClass19_612 = RSString.createRSString(" <col=ffff00>");
		Class26.aClass19_608 = RSString.createRSString("Loading textures )2 ");
		Class26.aBool614 = false;
		Class26.anInt613 = 0;
		Class26.aClass19_615 = RSString.createRSString(" weitere Optionen");
		Class26.anInt618 = 99;
		Class26.aClass19_619 = RSString.createRSString("cyan:");
		Class26.aClass19_616 = Class26.aClass19_619;
		Class26.aClass19_609 = Class26.aClass19_619;
		Class26.aClass19_617 = RSString.createRSString("Schrifts-=tze geladen)3");
		Class26.aClass19_610 = Class26.aClass19_608;
	}
}
