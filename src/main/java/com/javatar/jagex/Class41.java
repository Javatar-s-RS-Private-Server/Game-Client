package com.javatar.jagex;/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Arrays;

final class Class41 {
	int anInt922;
	int anInt925;
	static int[][] anIntArrayArray926;
	static int anInt928;
	static RSString aClass19_930;
	private static RSString aClass19_932;
	static Class17 aClass17_933;
	static RSString aClass19_934 = RSString.createRSString(" )2> <col=00ffff>");
	static Class53 aClass53_935;
	static RSString aClass19_936 = RSString.createRSString(" loggt sich aus)3");
	static RSString aClass19_937;
	int anInt938;
	static RSString aClass19_939;
	static RSString aClass19_940;
	static int[] anIntArray941;
	private static RSString aClass19_945;
	static RSString aClass19_948;

	static final void method344(int i) {
		do {
			try {
				System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
				System.exit(1);
				if (i == 10649)
					break;
				Class41.aClass19_948 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "na.F(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method345(int i) {
		try {
			Class41.aClass19_940 = null;
			Class41.aClass19_932 = null;
			Class41.aClass19_930 = null;
			Class41.aClass19_945 = null;
			if (i != 0)
				Class41.updatePlayer((byte) -11);
			Class41.aClass17_933 = null;
			Class41.aClass19_948 = null;
			Class41.aClass19_939 = null;
			Class41.anIntArray941 = null;
			Class41.anIntArrayArray926 = null;
			Class41.aClass53_935 = null;
			Class41.aClass19_936 = null;
			Class41.aClass19_934 = null;
			Class41.aClass19_937 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "na.H(" + i + ')');
		}
	}

	static final void method346(long l) {
		try {
			if (l != 0L)
				if (Class81.anInt1618 >= 100 && Class15.anInt272 != 1 || Class81.anInt1618 >= 200)
					Class62.method464((byte) 98, ItemDefinition.aClass19_2792, 0, Class38_Sub22.aClass19_2312);
				else {
					RSString class19 = Class73.method520(l, 1).method167((byte) 52);
					for (int i_0_ = 0; Class81.anInt1618 > i_0_; i_0_++)
						if (Class20.aLongArray499[i_0_] == l) {
							Class62.method464((byte) 98, Class9.method43(new RSString[] { class19, Class38_Sub20_Sub11.aClass19_2952 }, (byte) -20), 0, Class38_Sub22.aClass19_2312);
							return;
						}
					for (int i_1_ = 0; i_1_ < Class38_Sub20_Sub3_Sub2.anInt3250; i_1_++)
						if (Class5.aLongArray97[i_1_] == l) {
							Class62.method464((byte) 98, Class9.method43(new RSString[] { Class80.aClass19_1600, class19, Class16.aClass19_319 }, (byte) -20), 0, Class38_Sub22.aClass19_2312);
							return;
						}
					if (class19.method175(true, Client.myPlayer.name))
						Class62.method464((byte) 98, Class80.aClass19_1599, 0, Class38_Sub22.aClass19_2312);
					else {
						Class53.aClass19Array1173[Class81.anInt1618] = class19;
						Class20.aLongArray499[Class81.anInt1618] = l;
						Class41.anIntArray941[Class81.anInt1618] = 0;
						Class80.anIntArray1606[Class81.anInt1618] = 0;
						Class81.anInt1624 = Entity.anInt3513;
						Class81.anInt1618++;
						Client.outputBuffer.writeIsaacByte(28);
						Client.outputBuffer.writeLong(l);
					}
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "na.G(" + 119 + ',' + l + ')');
		}
	}

	static final void method347(Entity class38_sub20_sub3_sub7, int i, byte i_2_) {
		try {
			int i_3_ = -30 % ((-15 - i_2_) / 40);
			Class38_Sub20_Sub3_Sub5.method1158(class38_sub20_sub3_sub7.anInt3444, (byte) 123, class38_sub20_sub3_sub7.anInt3493, i);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "na.E(" + (class38_sub20_sub3_sub7 != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ')');
		}
	}

	static final void method348() {
		do {
			try {
				for (Class38_Sub21 class38_sub21 = (Class38_Sub21) Class3.aClass13_71.method65(95); class38_sub21 != null; class38_sub21 = (Class38_Sub21) Class3.aClass13_71.method63(-3)) {
					if (class38_sub21.anInt2273 > 0)
						class38_sub21.anInt2273--;
					if (class38_sub21.anInt2273 != 0) {
						if (class38_sub21.anInt2274 > 0)
							class38_sub21.anInt2274--;
						if (class38_sub21.anInt2274 == 0 && class38_sub21.anInt2267 >= 1 && class38_sub21.anInt2282 >= 1 && class38_sub21.anInt2267 <= 102 && class38_sub21.anInt2282 <= 102 && (class38_sub21.anInt2276 < 0 || Class20.method189((byte) 78, class38_sub21.anInt2276, class38_sub21.anInt2266))) {
							Client.method1227(class38_sub21.anInt2266, class38_sub21.anInt2260, class38_sub21.anInt2267, (byte) 13, class38_sub21.anInt2276, class38_sub21.anInt2275, class38_sub21.anInt2263, class38_sub21.anInt2282);
							class38_sub21.anInt2274 = -1;
							if (class38_sub21.anInt2268 != class38_sub21.anInt2276 || class38_sub21.anInt2268 != -1) {
								if (class38_sub21.anInt2268 == class38_sub21.anInt2276 && class38_sub21.anInt2272 == class38_sub21.anInt2275 && class38_sub21.anInt2266 == class38_sub21.anInt2270)
									class38_sub21.method330(0);
							} else
								class38_sub21.method330(25682 - 25682);
						}
					} else if (class38_sub21.anInt2268 < 0 || Class20.method189((byte) 76, class38_sub21.anInt2268, class38_sub21.anInt2270)) {
						Client.method1227(class38_sub21.anInt2270, class38_sub21.anInt2260, class38_sub21.anInt2267, (byte) 114, class38_sub21.anInt2268, class38_sub21.anInt2272, class38_sub21.anInt2263, class38_sub21.anInt2282);
						class38_sub21.method330(0);
					}
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "na.B(" + 25682 + ')');
			}
		} while (false);
	}

	static final void method349(int i) {
		do {
			try {
				Class40.method340(Class15.aClass38_Sub6_293, (byte) -104);
				Class73.anInt1426++;
				if (!Class76.aBool1491 || !Class21.aBool524) {
					if (Class73.anInt1426 > 1)
						Class15.aClass38_Sub6_293 = null;
				} else {
					int i_4_ = Class23.anInt543;
					int i_5_ = Class45.anInt1015;
					i_4_ -= Class3.anInt63;
					if (i_4_ < NPC.anInt3554)
						i_4_ = NPC.anInt3554;
					int i_6_ = Class15.aClass38_Sub6_293.anInt1873;
					i_5_ -= Class28.anInt677;
					if (NPC.anInt3554 + Class74.aClass38_Sub6_1463.anInt1923 < Class15.aClass38_Sub6_293.anInt1923 + i_4_)
						i_4_ = -Class15.aClass38_Sub6_293.anInt1923 + Class74.aClass38_Sub6_1463.anInt1923 + NPC.anInt3554;
					int i_7_ = -Class61.anInt1337 + i_4_;
					if (Class47.anInt1048 > i_5_)
						i_5_ = Class47.anInt1048;
					int i_8_ = Class74.aClass38_Sub6_1463.anInt1956 + i_4_ - NPC.anInt3554;
					if (i == 2) {
						if (Class74.aClass38_Sub6_1463.anInt1886 + Class47.anInt1048 < Class15.aClass38_Sub6_293.anInt1886 + i_5_)
							i_5_ = -Class15.aClass38_Sub6_293.anInt1886 + Class74.aClass38_Sub6_1463.anInt1886 + Class47.anInt1048;
						int i_9_ = i_5_ - Class83.anInt1675;
						if (Class73.anInt1426 > Class15.aClass38_Sub6_293.anInt1859 && (i_6_ < i_7_ || -i_6_ > i_7_ || i_6_ < i_9_ || -i_6_ > i_9_))
							Class38_Sub22.aBool2315 = true;
						int i_10_ = Class74.aClass38_Sub6_1463.anInt1985 + i_5_ - Class47.anInt1048;
						if (Class15.aClass38_Sub6_293.anObjectArray1965 != null && Class38_Sub22.aBool2315) {
							Class38_Sub19 class38_sub19 = new Class38_Sub19();
							class38_sub19.anInt2236 = i_8_;
							class38_sub19.anObjectArray2240 = Class15.aClass38_Sub6_293.anObjectArray1965;
							class38_sub19.aClass38_Sub6_2241 = Class15.aClass38_Sub6_293;
							class38_sub19.anInt2242 = i_10_;
							Class15.method84(class38_sub19, (byte) -78);
						}
						if (Class23.anInt558 != 0)
							break;
						if (Class38_Sub22.aBool2315) {
							if (Class15.aClass38_Sub6_293.anObjectArray1984 != null) {
								Class38_Sub19 class38_sub19 = new Class38_Sub19();
								class38_sub19.anInt2236 = i_8_;
								class38_sub19.anInt2242 = i_10_;
								class38_sub19.aClass38_Sub6_2241 = Class15.aClass38_Sub6_293;
								class38_sub19.aClass38_Sub6_2234 = Class67.aClass38_Sub6_1381;
								class38_sub19.anObjectArray2240 = Class15.aClass38_Sub6_293.anObjectArray1984;
								Class15.method84(class38_sub19, (byte) -89);
							}
							if (Class67.aClass38_Sub6_1381 != null && Class38_Sub10_Sub1.method860(1442844045, Class15.aClass38_Sub6_293) != null) {
								Client.outputBuffer.writeIsaacByte(178);
								Client.outputBuffer.method774(8, Class67.aClass38_Sub6_1381.anInt1856);
								Client.outputBuffer.method769(Class67.aClass38_Sub6_1381.anInt1941, 88);
								Client.outputBuffer.method747(Class15.aClass38_Sub6_293.anInt1856, i - 2689);
								Client.outputBuffer.method767(-25680, Class15.aClass38_Sub6_293.anInt1941);
							}
						} else if ((Class42.anInt949 == 1 || RSString.method140((byte) 93, Class72.anInt1417 - 1)) && Class72.anInt1417 > 2)
							Class50.method401(-5560);
						else if (Class72.anInt1417 > 0)
							Class53.method416(101, Class72.anInt1417 - 1);
						Class15.aClass38_Sub6_293 = null;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "na.J(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method350(int i) {
		try {
			if (i == -10015) {
				if (Client.worldConnection != null) {
					Client.worldConnection.method292(-95);
					Client.worldConnection = null;
				}
				Class4.method25(i ^ ~0x272d);
				RuntimeException_Sub1.aClass27_3292.method242();
				for (int i_11_ = 0; i_11_ < 4; i_11_++)
					Client.clippingHeights[i_11_].method530(74);
				System.gc();
				Class16.method89(2, (byte) 55);
				Class76.aBool1490 = false;
				Class38_Sub19.anInt2238 = -1;
				Class20.method187(false);
				Canvas_Sub1.method808(i + 10015, 10);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "na.C(" + i + ')');
		}
	}

	static final Class38_Sub20_Sub7 method351(int i, int i_12_) {
		try {
			Class38_Sub20_Sub7 class38_sub20_sub7 = (Class38_Sub20_Sub7) Client.aClass83_3646.method591(i_12_ - 45918, i);
			if (class38_sub20_sub7 != null)
				return class38_sub20_sub7;
			if (i_12_ != 17093)
				return null;
			byte[] is = Class58.aClass17_1278.getFileData(5, i, -68);
			class38_sub20_sub7 = new Class38_Sub20_Sub7();
			if (is != null)
				class38_sub20_sub7.method944(new RS2Buffer(is), 110);
			Client.aClass83_3646.method590(i, (byte) -122, class38_sub20_sub7);
			return class38_sub20_sub7;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "na.A(" + i + ',' + i_12_ + ')');
		}
	}

	static final void method352(RSString class19) {
		try {
			if (NPC.aClass38_Sub9Array3557 != null) {
				int i_13_ = 0;
				long l = class19.method162(0);
				if (l != 0L) {
					for (/**/; i_13_ < NPC.aClass38_Sub9Array3557.length; i_13_++)
						if (NPC.aClass38_Sub9Array3557[i_13_].aLong898 == l)
							break;
					if (NPC.aClass38_Sub9Array3557.length > i_13_ && NPC.aClass38_Sub9Array3557[i_13_] != null) {
						Client.outputBuffer.writeIsaacByte(194);
						Client.outputBuffer.writeLong(NPC.aClass38_Sub9Array3557[i_13_].aLong898);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "na.I(" + (class19 != null ? "{...}" : "null") + ',' + (byte) -123 + ')');
		}
	}

	static void updatePlayer(byte i) {
		do {
			try {
				Class38_Sub20_Sub15.anInt3064 = 0;
				Class4.anInt81 = 0;
				Class14.updateLocation();
				Class73.updateLocalPlayerLocations((byte) 127);
				Class31.addLocalPlayers(11);
				Class2_Sub1.updatePlayerFlags();
				for (int i_14_ = 0; Class4.anInt81 > i_14_; i_14_++) {
					int i_15_ = Class21.anIntArray519[i_14_];
					if (Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_15_].anInt3459 != Class45.anInt1016)
						Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_15_] = null;
				}
				if (Entity.packetLength != Class15.inputStream.pos)
					throw new RuntimeException("gpp1 pos:" + Class15.inputStream.pos + " psize:" + Entity.packetLength);
				for (int i_16_ = 0; i_16_ < ItemDefinition.anInt2783; i_16_++)
					if (Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[Class47.anIntArray1055[i_16_]] == null)
						throw new RuntimeException("gpp2 pos:" + i_16_ + " size:" + ItemDefinition.anInt2783);
				if (i == 126)
					break;
				Class41.anIntArrayArray926 = null;
			} catch (RuntimeException runtimeexception) {
				runtimeexception.printStackTrace();
				throw Class38_Sub1.method607(runtimeexception, "na.D(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class41() {
		/* empty */
	}

	static {
		Class41.anIntArrayArray926 = new int[5][5000];
		Class41.aClass19_932 = RSString.createRSString("Players");
		Class41.aClass19_939 = Class41.aClass19_932;
		Class41.aClass19_937 = RSString.createRSString("Null");
		Class41.anIntArray941 = new int[200];
		Class41.aClass19_940 = RSString.createRSString(" zuerst von Ihrer Ignorieren)2Liste(Q");
		Class41.aClass19_945 = RSString.createRSString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
		Class41.aClass19_930 = Class41.aClass19_945;
		Class41.aClass19_948 = RSString.createRSString("null");
	}
}
