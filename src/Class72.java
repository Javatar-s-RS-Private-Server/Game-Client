/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class72 {
	static RSString aClass19_1406 = RSString.createRSString("Bitte geben Sie Ihr Passwort ein)3");
	static int anInt1407;
	static Class17 aClass17_1408;
	static int[] anIntArray1409;
	static RSString aClass19_1411;
	static RSString aClass19_1413;
	static RS2Buffer aClass38_Sub23_1414;
	static RSString aClass19_1415;
	static int anInt1416;
	static int anInt1417;
	static int[] anIntArray1418;
	static RSString aClass19_1420;
	private static RSString aClass19_1412 = RSString.createRSString("wishes to duel with you)3");

	static {
		Class72.anInt1407 = 0;
		Class72.aClass19_1415 = RSString.createRSString("und haben es deaktiviert)3 Klicken Sie auf der");
		Class72.aClass19_1413 = RSString.createRSString("Wir vermuten)1 dass Ihr Konto gestohlen wurde");
		Class72.anIntArray1418 = new int[1000];
		Class72.anInt1417 = 0;
		Class72.aClass19_1411 = RSString.createRSString("nav");
		Class72.aClass19_1420 = Class72.aClass19_1412;
		Class72.anInt1416 = 0;
	}

	static final void method512(byte i, Applet_Sub1 applet_sub1) {
		try {
			if (i != 33)
				Class72.anIntArray1409 = null;
			if (client.lastMouseAction == 1) {
				int i_0_ = 280;
				if (i_0_ <= Class73.anInt1429 && i_0_ + 14 >= Class73.anInt1429 && RS2Buffer.anInt2416 >= 4 && RS2Buffer.anInt2416 <= 18)
					Class28.method274(0, (byte) 77, 0);
				else if (i_0_ + 15 <= Class73.anInt1429 && Class73.anInt1429 <= i_0_ + 80 && RS2Buffer.anInt2416 >= 4 && RS2Buffer.anInt2416 <= 18)
					Class28.method274(1, (byte) 84, 0);
				else {
					int i_1_ = 390;
					if (Class73.anInt1429 >= i_1_ && i_1_ + 14 >= Class73.anInt1429 && RS2Buffer.anInt2416 >= 4 && RS2Buffer.anInt2416 <= 18)
						Class28.method274(0, (byte) 104, 1);
					else if (Class73.anInt1429 >= i_1_ + 15 && i_1_ + 80 >= Class73.anInt1429 && RS2Buffer.anInt2416 >= 4 && RS2Buffer.anInt2416 <= 18)
						Class28.method274(1, (byte) 70, 1);
					else {
						int i_2_ = 500;
						if (i_2_ <= Class73.anInt1429 && i_2_ + 14 >= Class73.anInt1429 && RS2Buffer.anInt2416 >= 4 && RS2Buffer.anInt2416 <= 18)
							Class28.method274(0, (byte) 114, 2);
						else if (Class73.anInt1429 >= i_2_ + 15 && Class73.anInt1429 <= i_2_ + 80 && RS2Buffer.anInt2416 >= 4 && RS2Buffer.anInt2416 <= 18)
							Class28.method274(1, (byte) 97, 2);
						else {
							int i_3_ = 610;
							if (i_3_ <= Class73.anInt1429 && i_3_ + 14 >= Class73.anInt1429 && RS2Buffer.anInt2416 >= 4 && RS2Buffer.anInt2416 <= 18)
								Class28.method274(0, (byte) 36, 3);
							else if (Class73.anInt1429 >= i_3_ + 15 && Class73.anInt1429 <= i_3_ + 80 && RS2Buffer.anInt2416 >= 4 && RS2Buffer.anInt2416 <= 18)
								Class28.method274(1, (byte) 81, 3);
							else if (Class73.anInt1429 >= 708 && RS2Buffer.anInt2416 >= 4 && Class73.anInt1429 <= 758 && RS2Buffer.anInt2416 <= 20) {
								Class74.aBool1448 = false;
								Class6.aClass38_Sub20_Sub9_Sub3_129.method1123(0, 0);
								Class3.aClass38_Sub20_Sub9_Sub3_47.method1123(382, 0);
								Class38_Sub1.aClass38_Sub20_Sub9_Sub2_1740.method1089(-(Class38_Sub1.aClass38_Sub20_Sub9_Sub2_1740.anInt3242 / 2) + 382, 18);
							} else if (Class47.anInt1059 != -1) {
								Class4 class4 = Sequence.aClass4Array2736[Class47.anInt1059];
								if (Node.aBool889 == class4.aBool83) {
									byte[] is = Class9.method43(new RSString[] { class4.aClass19_73, Class78.aClass19_1559 }, (byte) -20).method158(122);
									Class26.aString611 = new String(is, 0, is.length);
									if (Player.anInt3582 != 0) {
										SceneModel.worldPort = 43594;
										Player.anInt3582 = 0;
										NodeSub.js5Port = 43595;
									}
									Class23.anInt556 = class4.anInt86;
									Class74.aBool1448 = false;
									Class6.aClass38_Sub20_Sub9_Sub3_129.method1123(0, 0);
									Class3.aClass38_Sub20_Sub9_Sub3_47.method1123(382, 0);
									Class38_Sub1.aClass38_Sub20_Sub9_Sub2_1740.method1089(-(Class38_Sub1.aClass38_Sub20_Sub9_Sub2_1740.anInt3242 / 2) + 382, 18);
								} else {
									RSString class19 = Class9.method43(new RSString[] { Class38_Sub4.aClass19_1810, class4.aClass19_73, Class78.aClass19_1559, Class38_Sub22.aClass19_2310, Class26.aClass19_602, RuntimeException_Sub1.method1098(!Class38_Sub4.aBool1811 ? 0 : 1, 0), Class83.aClass19_1655, RuntimeException_Sub1.method1098(Class38_Sub3.anInt1776, i ^ 0x21), Class38_Sub10_Sub1.aClass19_2590, RuntimeException_Sub1.method1098(Class38_Sub20_Sub12.anInt3005, 0) }, (byte) -20);
									try {
										applet_sub1.getAppletContext().showDocument(class19.method181(-84), "_self");
									} catch (Exception exception) {
										/* empty */
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ra.B(" + i + ',' + (applet_sub1 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method513(int i) {
		try {
			Class72.aClass19_1415 = null;
			if (i == 14) {
				Class72.aClass17_1408 = null;
				Class72.aClass19_1412 = null;
				Class72.anIntArray1418 = null;
				Class72.anIntArray1409 = null;
				Class72.aClass19_1413 = null;
				Class72.aClass19_1420 = null;
				Class72.aClass19_1411 = null;
				Class72.aClass19_1406 = null;
				Class72.aClass38_Sub23_1414 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ra.C(" + i + ')');
		}
	}

	static final Class38_Sub20_Sub12 method514(int i, byte i_4_) {
		try {
			Class38_Sub20_Sub12 class38_sub20_sub12 = (Class38_Sub20_Sub12) Class75.aClass83_1472.method591(-28825, i);
			if (i_4_ > -74)
				Class72.aClass19_1411 = null;
			if (class38_sub20_sub12 != null)
				return class38_sub20_sub12;
			byte[] is = Class2.aClass17_37.method109(8, i, -70);
			class38_sub20_sub12 = new Class38_Sub20_Sub12();
			if (is != null)
				class38_sub20_sub12.method986(new RS2Buffer(is), -23866);
			Class75.aClass83_1472.method590(i, (byte) -121, class38_sub20_sub12);
			return class38_sub20_sub12;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ra.A(" + i + ',' + i_4_ + ')');
		}
	}
}
