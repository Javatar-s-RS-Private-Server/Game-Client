package com.javatar.jagex;/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class22 {
	private static RSString aClass19_529 = RSString.createRSString("Please wait 1 minute and try again)3");
	static RSString aClass19_531;
	static RSString aClass19_532 = Class22.aClass19_529;
	static RSString aClass19_533 = Class22.aClass19_529;
	static int[] anIntArray536 = new int[100];
	private static RSString aClass19_537;
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array539;
	static RSString aClass19_540;

	static final RSString method195(int i, int i_0_) {
		try {
			if (i > -98)
				Class22.aClass19_537 = null;
			return Class9.method43(new RSString[] { RuntimeException_Sub1.method1098(i_0_ >> -308039560 & 0xff, 0), Class78.aClass19_1544, RuntimeException_Sub1.method1098((i_0_ & 0xff3827) >> 421757104, 0), Class78.aClass19_1544, RuntimeException_Sub1.method1098(i_0_ >> -1850757144 & 0xff, 0), Class78.aClass19_1544, RuntimeException_Sub1.method1098(i_0_ & 0xff, 0) }, (byte) -20);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "df.A(" + i + ',' + i_0_ + ')');
		}
	}

	static boolean loadWidget(int parentId) {
		try {
			if(parentId == -1)
				return false;
			if (Class38_Sub14.isWidgetLoaded[parentId])
				return true;
			if (!Class25.aClass17_589.exists(parentId, 24624))
				return false;
			int componentCount = Class25.aClass17_589.getFileCount((byte) 53, parentId);
			if (componentCount == 0) {
				Class38_Sub14.isWidgetLoaded[parentId] = true;
				return true;
			}
			if (Class62.widgets[parentId] == null)
				Class62.widgets[parentId] = new WidgetComponent[componentCount];
			for (int compId = 0; compId < componentCount; compId++)
				if (Class62.widgets[parentId][compId] == null) {
					byte[] is = Class25.aClass17_589.getFileData(parentId, compId, -121);
					if (is != null) {
						Class62.widgets[parentId][compId] = new WidgetComponent();
						Class62.widgets[parentId][compId].anInt1856 = (parentId << 16) + compId;
						if (is[0] != -1)
							Class62.widgets[parentId][compId].decodeLegacyWidget(new RS2Buffer(is), (byte) 115);
						else
							Class62.widgets[parentId][compId].decodeWidget(new RS2Buffer(is), -65536);
					}
				}
			Class38_Sub14.isWidgetLoaded[parentId] = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class38_Sub1.method607(runtimeexception, "df.B(" + parentId + ',' + -18020 + ')');
		}
	}

	static final boolean method197(int i, Class17 class17, int i_4_, int i_5_) {
		try {
			if (i_4_ != -308039560)
				return false;
			byte[] is = class17.getFileData(i, i_5_, i_4_ + 308039462);
			if (is == null)
				return false;
			Canvas_Sub1.method810(false, is);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "df.C(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ + ')');
		}
	}

	public static void method198(int i) {
		try {
			if (i == -7798) {
				Class22.aClass19_533 = null;
				Class22.aClass19_532 = null;
				Class22.aClass38_Sub20_Sub9_Sub3Array539 = null;
				Class22.anIntArray536 = null;
				Class22.aClass19_529 = null;
				Class22.aClass19_540 = null;
				Class22.aClass19_531 = null;
				Class22.aClass19_537 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "df.D(" + i + ')');
		}
	}

	static {
		Client.lastCoordY = 0;
		Class22.aClass19_537 = RSString.createRSString("Take");
		Class22.aClass19_540 = RSString.createRSString("leuchten3:");
		Class22.aClass19_531 = Class22.aClass19_537;
	}
}
