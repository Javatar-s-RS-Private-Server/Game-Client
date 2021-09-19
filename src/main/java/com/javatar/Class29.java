package com.javatar;/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.nio.charset.StandardCharsets;

final class Class29 {
	static RSString aClass19_698;
	static RSString aClass19_700;
	static RSString aClass19_702 = RSString.createRSString("Begeben Sie sich in ein freies Gebiet)1 um");
	static int anInt703;
	static int anInt706;
	static RSString aClass19_707;
	private static RSString aClass19_699 = RSString.createRSString("K");

	static {
		Class29.aClass19_700 = Class29.aClass19_699;
		Class29.aClass19_698 = Class29.aClass19_699;
		Class29.anInt703 = -1;
		Class29.aClass19_707 = RSString.createRSString("Sichtbare Karte vorbereitet)3");
	}

	public static void method275(byte i) {
		try {
			Class29.aClass19_698 = null;
			Class29.aClass19_702 = null;
			Class29.aClass19_707 = null;
			Class29.aClass19_699 = null;
			int i_0_ = 30 % ((50 - i) / 38);
			Class29.aClass19_700 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mf.D(" + i + ')');
		}
	}

	static final RSString method276(Class38_Sub6 class38_sub6, RSString class19) {
		try {
			if (class19.method170(1, Projectile.aClass19_3397) != -1) {
				for (; ; ) {
					int i = class19.method170(1, Class37.aClass19_878);
					if (i == -1)
						break;
					class19 = Class9.method43(new RSString[]{class19.method144((byte) -118, 0, i), ObjectDefinition.method803(!false, Class13.method72(class38_sub6, 0)), class19.method171((byte) -15, i + 2)}, (byte) -20);
				}
				for (; ; ) {
					int i = class19.method170(1, Class38_Sub11.aClass19_2092);
					if (i == -1)
						break;
					class19 = Class9.method43(new RSString[]{class19.method144((byte) -116, 0, i), ObjectDefinition.method803(true, Class13.method72(class38_sub6, 1)), class19.method171((byte) -5, i + 2)}, (byte) -20);
				}
				for (;;) {
					int i = class19.method170(1, Class54.aClass19_1185);
					if (i == -1)
						break;
					class19 = Class9.method43(new RSString[]{class19.method144((byte) 50, 0, i), ObjectDefinition.method803(!false, Class13.method72(class38_sub6, 2)), class19.method171((byte) -53, i + 2)}, (byte) -20);
				}
				for (;;) {
					int i = class19.method170(1, Class38_Sub11.aClass19_2100);
					if (i == -1)
						break;
					class19 = Class9.method43(new RSString[]{class19.method144((byte) 96, 0, i), ObjectDefinition.method803(!false, Class13.method72(class38_sub6, 3)), class19.method171((byte) -102, i + 2)}, (byte) -20);
				}
				for (;;) {
					int i = class19.method170(1, Class50.aClass19_1117);
					if (i == -1)
						break;
					class19 = Class9.method43(new RSString[]{class19.method144((byte) -120, 0, i), ObjectDefinition.method803(true, Class13.method72(class38_sub6, 4)), class19.method171((byte) -61, i + 2)}, (byte) -20);
				}
				for (;;) {
					int i = class19.method170(1, Class76.aClass19_1486);
					if (i == -1)
						break;
					RSString class19_1_ = Class38_Sub22.aClass19_2312;
					if (Class38_Sub14.aClass65_2145 != null) {
						class19_1_ = Class22.method195(-116, Class38_Sub14.aClass65_2145.anInt1366);
						if (Class38_Sub14.aClass65_2145.anObject1365 != null) {
							byte[] is = ((String) Class38_Sub14.aClass65_2145.anObject1365).getBytes(StandardCharsets.ISO_8859_1);
							class19_1_ = SceneModel.method821(is, (byte) -44, 0, is.length);
						}
					}
					class19 = Class9.method43(new RSString[]{class19.method144((byte) 95, 0, i), class19_1_, class19.method171((byte) -128, i + 4)}, (byte) -20);
				}
			}
			if (false)
				return null;
			return class19;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mf.C(" + (class38_sub6 != null ? "{...}" : "null") + ',' + (class19 != null ? "{...}" : "null") + ',' + false + ')');
		}
	}

	static final void method277(Class17 class17, int i) {
		try {
			int i_2_ = 126 / ((69 - i) / 55);
			Class38_Sub20_Sub17.aClass17_3113 = class17;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mf.A(" + (class17 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method278(Entity class38_sub20_sub3_sub7) {
		try {
			class38_sub20_sub3_sub7.anInt3440 = 0;
			if (class38_sub20_sub3_sub7.anInt3497 == 0)
				class38_sub20_sub3_sub7.anInt3488 = 1024;
			if (1 == class38_sub20_sub3_sub7.anInt3497)
				class38_sub20_sub3_sub7.anInt3488 = 1536;
			if (class38_sub20_sub3_sub7.anInt3497 == 2)
				class38_sub20_sub3_sub7.anInt3488 = 0;
			if (class38_sub20_sub3_sub7.anInt3497 == 3)
				class38_sub20_sub3_sub7.anInt3488 = 512;
			int i_3_ = -Class45.anInt1016 + class38_sub20_sub3_sub7.anInt3476;
			int i_4_ = class38_sub20_sub3_sub7.anInt3456 * 128 + class38_sub20_sub3_sub7.anInt3457 * 64;
			int i_5_ = class38_sub20_sub3_sub7.anInt3463 * 128 + class38_sub20_sub3_sub7.anInt3457 * 64;
			class38_sub20_sub3_sub7.anInt3444 += (-class38_sub20_sub3_sub7.anInt3444 + i_5_) / i_3_;
			class38_sub20_sub3_sub7.anInt3493 += (-class38_sub20_sub3_sub7.anInt3493 + i_4_) / i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mf.B(" + 1 + ',' + (class38_sub20_sub3_sub7 != null ? "{...}" : "null") + ')');
		}
	}
}
