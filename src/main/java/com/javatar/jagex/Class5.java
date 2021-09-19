package com.javatar.jagex;/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class5 {
	static RSString aClass19_92;
	static int anInt93;
	static long aLong94;
	private static RSString aClass19_95;
	static RSString aClass19_96;
	static long[] aLongArray97;
	int anInt98;
	int anInt100;
	int anInt101;
	int anInt102;
	int anInt103;
	int anInt105;
	private static RSString aClass19_106;
	int anInt107;
	static RSString aClass19_108 = RSString.createRSString("<col=ff0000>");
	int anInt109;
	int anInt110;
	int anInt111;
	int anInt112;
	int anInt113;
	static Class17_Sub1 aClass17_Sub1_114;
	int anInt115;
	static int[][][] anIntArrayArrayArray116;
	int anInt117;
	int anInt119;
	int anInt120;
	int anInt121;
	int anInt122;
	private static RSString aClass19_123;

	static final RSString method29(int i, int i_0_, RS2Buffer class38_sub23) {
		try {
			try {
				RSString class19 = new RSString();
				class19.anInt478 = class38_sub23.method726(true);
				if (class19.anInt478 > i_0_)
					class19.anInt478 = i_0_;
				class19.buffer = new byte[class19.anInt478];
				class38_sub23.pos += Class41.aClass53_935.method410(i, class38_sub23.pos, class19.buffer, class19.anInt478, true, class38_sub23.buffer);
				return class19;
			} catch (Exception exception) {
				return Class16.aClass19_332;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "of.D(" + i + ',' + i_0_ + ',' + (class38_sub23 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method30(byte i) {
		try {
			Class5.aClass19_92 = null;
			Class5.aClass19_108 = null;
			Class5.aLongArray97 = null;
			Class5.aClass19_106 = null;
			if (i < 80)
				Class5.method29(63, 32, null);
			Class5.aClass17_Sub1_114 = null;
			Class5.anIntArrayArrayArray116 = null;
			Class5.aClass19_96 = null;
			Class5.aClass19_95 = null;
			Class5.aClass19_123 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "of.B(" + i + ')');
		}
	}

	static final boolean method31(int i, int i_1_) {
		try {
			if (i_1_ != 31278)
				Class5.method29(-46, 14, null);
			if ((i >> 556843486 & 0x1) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "of.A(" + i + ',' + i_1_ + ')');
		}
	}

	static final void method32(boolean bool) {
		try {
			Player.aClass19_3562 = Class38_Sub3.aClass19_1787;
			Class11.aClass19_201 = Class75.aClass19_1474;
			Class79.aClass19_1567 = Class80.aClass19_1591;
			Class15.aClass19_292 = Node.aClass19_896;
			Class73_Sub2.aClass19_2307 = Class38_Sub4.aClass19_1802;
			Sequence.aClass19_2727 = Class41.aClass19_936;
			ItemDefinition.aClass19_2812 = Class10.aClass19_186;
			Class38_Sub20_Sub11.aClass19_2973 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub21.aClass19_2283 = Class43.aClass19_980;
			Class74.aClass19_1437 = Class17_Sub1.aClass19_1708;
			Class25.aClass19_586 = Class38_Sub1.aClass19_1752;
			Applet_Sub1.aClass19_3635 = Class38_Sub3.aClass19_1788;
			Class38_Sub20_Sub3_Sub5.aClass19_3387 = Class72.aClass19_1406;
			Class38_Sub20_Sub11.aClass19_2970 = Class38_Sub10_Sub1.aClass19_2592;
			Class10.aClass19_175 = Class38_Sub9.aClass19_2053;
			Class38_Sub20_Sub11.aClass19_2919 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub10_Sub1.aClass19_2599 = Class23.aClass19_545;
			Class38_Sub22.aClass19_2313 = Class58.aClass19_1283;
			Entity.aClass19_3518 = Class53.aClass19_1169;
			Class80.aClass19_1599 = Class78.aClass19_1556;
			Class38_Sub20_Sub12.aClass19_2995 = Class3.aClass19_72;
			Class10.aClass19_187 = Class38_Sub20_Sub17.aClass19_3127;
			Class38_Sub20_Sub11.aClass19_2922 = Class38_Sub10_Sub1.aClass19_2592;
			Entity.aClass19_3516 = Class59.aClass19_1298;
			Class38_Sub20_Sub17.aClass19_3122 = Class38_Sub11.aClass19_2090;
			Class38_Sub20_Sub16.aClass19_3093 = Class38_Sub9.aClass19_2071;
			Class38_Sub20_Sub8.aClass19_2875 = RuntimeException_Sub1.aClass19_3285;
			Class78.aClass19_1557 = Class38_Sub12.aClass19_2110;
			Class38_Sub9.aClass19_2065 = Class38_Sub20_Sub15.aClass19_3060;
			Class45.aClass19_1014 = Class42.aClass19_952;
			Class16.aClass19_319 = Class41.aClass19_940;
			Sequence.aClass19_2737 = Class38_Sub17.aClass19_2189;
			Class2.aClass19_39 = PlayerAppearance.aClass19_421;
			Class38_Sub20_Sub17.aClass19_3119 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub20_Sub11.aClass19_2974 = Class38_Sub17.aClass19_2186;
			Class9.aClass19_153 = Class17.aClass19_371;
			Class23.aClass19_562 = Class13.aClass19_241;
			Class44.aClass19_991 = Class38_Sub20_Sub13.aClass19_3021;
			Class22.aClass19_531 = Class43.aClass19_983;
			Class38_Sub6.aClass19_1970 = NodeSub.aClass19_2246;
			Class54.aClass19_1187 = Class38_Sub21.aClass19_2279;
			Canvas_Sub1.aClass19_2521 = Class38_Sub20_Sub3_Sub4.aClass19_3350;
			RuntimeException_Sub1.aClass19_3290 = Class38_Sub20_Sub13.aClass19_3010;
			Class38_Sub20_Sub11.aClass19_2951 = Class33.aClass19_785;
			Class38_Sub20_Sub11.aClass19_2944 = RuntimeException_Sub1.aClass19_3291;
			Class38_Sub20_Sub11.aClass19_2975 = Class38_Sub10_Sub1.aClass19_2592;
			Class66.aClass19_1372 = Class55.aClass19_1222;
			Class38_Sub3.aClass19_1789 = Class9.aClass19_150;
			Class3.aClass19_69 = Class38_Sub7.aClass19_2021;
			Class38_Sub20_Sub11.aClass19_2952 = Class64.aClass19_1355;
			Class38_Sub20_Sub11.aClass19_2956 = Client.aClass19_3643;
			Class38_Sub20_Sub11.aClass19_2926 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub18.aClass19_2219 = Class11.aClass19_207;
			Sequence.aClass19_2739 = Class38_Sub20_Sub16.aClass19_3099;
			Class11.aClass19_199 = Class38_Sub20_Sub2.aClass19_2534;
			Class50.aClass19_1112 = Class38_Sub20_Sub3_Sub4.aClass19_3355;
			Canvas_Sub1.aClass19_2522 = Class38_Sub20_Sub3_Sub4.aClass19_3363;
			Class59.aClass19_1297 = Class44.aClass19_1000;
			Class31.aClass19_761 = Class54.aClass19_1184;
			Class73_Sub2.aClass19_2288 = Class49.aClass19_1088;
			Class38_Sub20_Sub11.aClass19_2932 = Class52.aClass19_1155;
			Class73.aClass19_1430 = Class74.aClass19_1465;
			Class38_Sub20_Sub11.aClass19_2920 = Class38_Sub10_Sub1.aClass19_2592;
			Entity.aClass19_3485 = Class60.aClass19_1303;
			Class52.aClass19_1154 = Class67.aClass19_1392;
			Class38_Sub20_Sub11.aClass19_2960 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub20_Sub11.aClass19_2983 = Class38_Sub8.aClass19_2051;
			Class33.aClass19_790 = Class38_Sub20_Sub3_Sub5.aClass19_3391;
			Entity.aClass19_3512 = Class59.aClass19_1298;
			Class38_Sub20_Sub11.aClass19_2982 = ItemDefinition.aClass19_2814;
			Class2_Sub1.aClass19_2009 = Class17.aClass19_365;
			Class76.aClass19_1489 = Class44.aClass19_989;
			Class26.aClass19_616 = Class25.aClass19_593;
			Class80.aClass19_1598 = Class83.aClass19_1654;
			Class32.aClass19_767 = NPC.aClass19_3556;
			Class29.aClass19_700 = Class75.aClass19_1481;
			Class38_Sub12.aClass19_2122 = Class15.aClass19_289;
			Class38_Sub10_Sub3.aClass19_2834 = Class38_Sub3.aClass19_1777;
			Class38_Sub10_Sub1.aClass19_2589 = Class16.aClass19_314;
			Class17.aClass19_343 = Canvas_Sub1.aClass19_2512;
			Class17_Sub1.aClass19_1719 = Class67.aClass19_1391;
			ItemDefinition.aClass19_2816 = Class38_Sub20_Sub3_Sub4.aClass19_3357;
			if (bool)
				Class5.aClass19_123 = null;
			Class38_Sub20_Sub11.aClass19_2939 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub20_Sub15.aClass19_3077 = Class38_Sub20_Sub12.aClass19_3007;
			RSString.aClass19_430 = Class38_Sub10_Sub3.aClass19_2838;
			Class9.aClass19_159 = Class62.aClass19_1348;
			Class38_Sub22.aClass19_2335 = Class50.aClass19_1109;
			Class38_Sub20_Sub12.aClass19_3004 = SceneModel.aClass19_2549;
			Class15.aClass19_306 = PlayerAppearance.aClass19_416;
			Class38_Sub20_Sub11.aClass19_2927 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub20_Sub11.aClass19_2966 = Applet_Sub1.aClass19_3610;
			Class38_Sub20_Sub11.aClass19_2967 = Class38_Sub8.aClass19_2051;
			Class80.aClass19_1597 = Class10.aClass19_192;
			Class38_Sub11.aClass19_2095 = Class14.aClass19_266;
			Class58.aClass19_1288 = Class45.aClass19_1023;
			Class38_Sub20_Sub15.aClass19_3076 = Class38_Sub20_Sub12.aClass19_2999;
			Class38_Sub20_Sub11.aClass19_2913 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub20_Sub17.aClass19_3130 = Class54.aClass19_1208;
			Class14.aClass19_255 = Class55.aClass19_1225;
			Class25.aClass19_587 = Class80.aClass19_1601;
			Class79.aClass19_1570 = Class38_Sub20_Sub3_Sub2.aClass19_3276;
			Class38_Sub20_Sub11.aClass19_2976 = Class38_Sub10_Sub1.aClass19_2592;
			Class11.aClass19_206 = Canvas_Sub1.aClass19_2519;
			Class22.aClass19_533 = Class38_Sub4.aClass19_1830;
			Class38_Sub11.aClass19_2083 = ObjectDefinition.aClass19_2484;
			Class29.aClass19_698 = Class75.aClass19_1481;
			Class25.aClass19_596 = Class72.aClass19_1413;
			Class38_Sub20_Sub11.aClass19_2964 = Class52.aClass19_1149;
			Class14.aClass19_257 = Class29.aClass19_702;
			Class38_Sub9.aClass19_2068 = Class2.aClass19_38;
			Class38_Sub20_Sub11.aClass19_2924 = Class42.aClass19_953;
			Class38_Sub10_Sub1.aClass19_2648 = Sequence.aClass19_2735;
			Class41.aClass19_939 = Class75.aClass19_1479;
			Class2_Sub1.aClass19_2015 = Class76.aClass19_1501;
			Class74.aClass19_1469 = Class73_Sub2.aClass19_2289;
			Class21.aClass19_505 = Class32.aClass19_776;
			Class38_Sub14.aClass19_2138 = Class15.aClass19_287;
			Class38_Sub14.aClass19_2137 = Class23.aClass19_551;
			Class21.aClass19_513 = RS2Buffer.aClass19_2369;
			Entity.aClass19_3515 = Class59.aClass19_1298;
			Class42.aClass19_957 = Class77.aClass19_1520;
			Class47.aClass19_1060 = Class80.aClass19_1596;
			Class38_Sub20_Sub11.aClass19_2961 = Class38_Sub10_Sub1.aClass19_2592;
			Class44.aClass19_1006 = Class31.aClass19_749;
			Class38_Sub20_Sub3_Sub2.aClass19_3277 = Class23.aClass19_550;
			Class52.aClass19_1158 = Class58.aClass19_1281;
			Class38_Sub20_Sub3_Sub2.aClass19_3273 = Class77.aClass19_1514;
			Class25.aClass19_584 = Class47.aClass19_1058;
			Class38_Sub20_Sub14.aClass19_3044 = Class64.aClass19_1354;
			Class11.aClass19_203 = Class58.aClass19_1280;
			Class38_Sub20_Sub17.aClass19_3120 = Class54.aClass19_1189;
			Class38_Sub7.aClass19_2028 = Class26.aClass19_617;
			Player.aClass19_3592 = ItemDefinition.aClass19_2745;
			Class38_Sub20_Sub11.aClass19_2914 = Class54.aClass19_1201;
			Class38_Sub20_Sub11.aClass19_2942 = Class38_Sub10_Sub1.aClass19_2592;
			Class26.aClass19_610 = Class38_Sub20_Sub10.aClass19_2904;
			Class13.aClass19_243 = Class74.aClass19_1462;
			Class30.aClass19_731 = NPC.aClass19_3550;
			Class38_Sub20_Sub17.aClass19_3116 = Class79.aClass19_1576;
			Class23.aClass19_544 = Class5.aClass19_123;
			Class2_Sub1.aClass19_2010 = Class38_Sub20_Sub8.aClass19_2862;
			Entity.aClass19_3517 = Class38_Sub20_Sub3_Sub5.aClass19_3388;
			Class38_Sub20_Sub8.aClass19_2869 = Class31.aClass19_755;
			Class28.aClass19_691 = Class38_Sub7.aClass19_2030;
			Class23.aClass19_549 = Class35.aClass19_814;
			Class38_Sub20_Sub11.aClass19_2945 = Class37.aClass19_874;
			ObjectDefinition.aClass19_2449 = Class14.aClass19_267;
			Class67.aClass19_1386 = Class76.aClass19_1502;
			Class67.aClass19_1384 = Class31.aClass19_752;
			Class22.aClass19_532 = Class38_Sub4.aClass19_1830;
			Projectile.aClass19_3423 = Class75.aClass19_1473;
			Class38_Sub20_Sub11.aClass19_2969 = Class38_Sub10_Sub1.aClass19_2592;
			Class10.aClass19_189 = Class10.aClass19_193;
			Sequence.aClass19_2740 = Class54.aClass19_1198;
			Class35.aClass19_822 = Class29.aClass19_707;
			Class72.aClass19_1420 = SceneModel.aClass19_2552;
			Class38_Sub20_Sub11.aClass19_2941 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub20_Sub11.aClass19_2977 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub20_Sub11.aClass19_2934 = Class52.aClass19_1155;
			Class38_Sub10_Sub3.aClass19_2836 = NPC.aClass19_3552;
			ObjectDefinition.aClass19_2481 = Class76.aClass19_1498;
			Class38_Sub20_Sub11.aClass19_2918 = Class59.aClass19_1298;
			Class38_Sub1.aClass19_1755 = Class60.aClass19_1321;
			Class38_Sub20_Sub11.aClass19_2971 = Class38_Sub10_Sub1.aClass19_2592;
			PacketBuffer.aClass19_2435 = Class33.aClass19_782;
			Class74.aClass19_1453 = Class26.aClass19_615;
			RS2Buffer.aClass19_2379 = NPC.aClass19_3553;
			Class80.aClass19_1586 = Class54.aClass19_1195;
			Class80.aClass19_1600 = Class83.aClass19_1654;
			Class32.aClass19_773 = NPC.aClass19_3556;
			Class43.aClass19_968 = Class22.aClass19_540;
			RSString.aClass19_432 = Class5.aClass19_106;
			Class38_Sub20_Sub11.aClass19_2953 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub20_Sub11.aClass19_2933 = Class79.aClass19_1574;
			Class77.aClass19_1510 = Class10.aClass19_182;
			Entity.aClass19_3509 = Class53.aClass19_1169;
			Class11.aClass19_198 = Class6.aClass19_127;
			Class38_Sub11.aClass19_2098 = Class38_Sub20_Sub14.aClass19_3035;
			Class78.aClass19_1551 = Class72.aClass19_1415;
			Class38_Sub20_Sub11.aClass19_2959 = Class38_Sub10_Sub1.aClass19_2592;
			Class5.aClass19_92 = Class38_Sub20_Sub2.aClass19_2543;
			Class38_Sub20_Sub11.aClass19_2954 = Canvas_Sub1.aClass19_2513;
			Class38_Sub20_Sub17.aClass19_3115 = Class38_Sub3.aClass19_1791;
			ItemDefinition.aClass19_2792 = Class66.aClass19_1375;
			Class80.aClass19_1612 = Class15.aClass19_305;
			Class60.aClass19_1319 = Class73.aClass19_1425;
			Class51.aClass19_1137 = Class38_Sub20_Sub10.aClass19_2891;
			Class38_Sub20_Sub16.aClass19_3101 = Class2.aClass19_33;
			Class38_Sub10_Sub1.aClass19_2631 = Class23.aClass19_545;
			Class38_Sub20_Sub4.aClass19_2561 = Class73_Sub2.aClass19_2290;
			Class83.aClass19_1669 = Class38_Sub20_Sub17.aClass19_3136;
			Class17_Sub1.aClass19_1716 = Class67.aClass19_1391;
			Class38_Sub7.aClass19_2031 = Class9.aClass19_156;
			Class38_Sub20_Sub11.aClass19_2968 = Class38_Sub10_Sub1.aClass19_2592;
			Class38_Sub9.aClass19_2069 = Class38_Sub14.aClass19_2140;
			Class73_Sub2.aClass19_2304 = Class83.aClass19_1686;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "of.C(" + bool + ')');
		}
	}

	static {
		Class5.aLong94 = 0L;
		Class5.anInt93 = 0;
		Class5.aClass19_106 = RSString.createRSString("Freie Welt");
		Class5.aClass19_95 = RSString.createRSString("Please contact customer support)3");
		Class5.aClass19_96 = RSString.createRSString("event_opbase");
		Class5.aLongArray97 = new long[100];
		Class5.aClass19_92 = Class5.aClass19_95;
		Class5.aClass19_123 = RSString.createRSString("Weiter");
	}
}
