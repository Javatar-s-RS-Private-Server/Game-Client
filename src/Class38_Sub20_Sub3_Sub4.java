/* Class38_Sub20_Sub3_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class38_Sub20_Sub3_Sub4 extends SceneModel {
	static RSString aClass19_3350 = RSString.createRSString("Suche nach Updates )2 ");
	static RSString aClass19_3355;
	static RSString aClass19_3357 = RSString.createRSString("Stufe)2");
	static int[] anIntArray3358;
	static int[] anIntArray3362;
	static RSString aClass19_3363;
	static RSString aClass19_3365;

	static {
		Class38_Sub20_Sub3_Sub4.aClass19_3355 = RSString.createRSString("Untersuchen");
		Class38_Sub20_Sub3_Sub4.anIntArray3362 = new int[100];
		Class38_Sub20_Sub3_Sub4.aClass19_3363 = RSString.createRSString("Die Adresse dieses Computers wurde gesperrt)1");
		Class38_Sub20_Sub3_Sub4.anIntArray3358 = new int[25];
		Class38_Sub20_Sub3_Sub4.aClass19_3365 = RSString.createRSString(":chalreq:");
		client.shakingCycle = new int[5];
	}

	int anInt3348;
	int anInt3351;

	static final int method1151(int i, int i_0_, int i_1_) {
		try {
			if (i < i_0_) {
				int i_2_ = i;
				i = i_0_;
				i_0_ = i_2_;
			}
			if (i_1_ > -9)
				Class38_Sub20_Sub3_Sub4.anIntArray3358 = null;
			int i_3_;
			for (/**/; i_0_ != 0; i_0_ = i_3_) {
				i_3_ = i % i_0_;
				i = i_0_;
			}
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "cb.F(" + i + ',' + i_0_ + ',' + i_1_ + ')');
		}
	}

	public static void method1152(int i) {
		try {
			int i_4_ = -11 / ((i - 48) / 41);
			Class38_Sub20_Sub3_Sub4.aClass19_3365 = null;
			Class38_Sub20_Sub3_Sub4.aClass19_3357 = null;
			Class38_Sub20_Sub3_Sub4.aClass19_3363 = null;
			Class38_Sub20_Sub3_Sub4.anIntArray3358 = null;
			Class38_Sub20_Sub3_Sub4.anIntArray3362 = null;
			Class38_Sub20_Sub3_Sub4.aClass19_3350 = null;
			client.shakingCycle = null;
			Class38_Sub20_Sub3_Sub4.aClass19_3355 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "cb.L(" + i + ')');
		}
	}

	static final void method1153(byte i, Class38_Sub6 class38_sub6, int i_5_, int i_6_) {
		try {
			if (Class15.aClass38_Sub6_293 == null && !SceneModel.aBool2553 && class38_sub6 != null && Class32.method298(class38_sub6, (byte) -76) != null) {
				int i_7_ = -96 % ((-15 - i) / 44);
				Class15.aClass38_Sub6_293 = class38_sub6;
				Class74.aClass38_Sub6_1463 = Class32.method298(class38_sub6, (byte) 88);
				Class3.anInt63 = i_6_;
				Class28.anInt677 = i_5_;
				Class38_Sub22.aBool2315 = false;
				Class73.anInt1426 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "cb.K(" + i + ',' + (class38_sub6 != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ')');
		}
	}

	static final void method1154(int i) {
		do {
			try {
				ItemDefinition.aClass83_2785.method596(-97);
				if (i > 119)
					break;
				Class38_Sub20_Sub3_Sub4.method1152(21);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "cb.I(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1155(int i, int i_8_, int i_9_, int i_10_, int i_11_) {
		do {
			try {
				if (client.crossState == 1)
					Class33.aClass38_Sub20_Sub9_Sub3Array780[client.crossIndex / 100].method1105(Class21.anInt523 - 8, Class38_Sub4.anInt1827 - 8);
				if (client.crossState == 2)
					Class33.aClass38_Sub20_Sub9_Sub3Array780[4 + client.crossIndex / 100].method1105(Class21.anInt523 - 8, Class38_Sub4.anInt1827 - 8);
				Class38_Sub20_Sub2.method815(false);
				if (i_9_ == 12504) {
					if (!Class13.aBool246)
						break;
					int i_12_ = i_10_ + 507;
					int i_13_ = i + 20;
					int i_14_ = 16776960;
					Class38_Sub20_Sub13.aClass38_Sub20_Sub9_Sub1_Sub1_3023.method1069(Class9.method43(new RSString[] { Class62.aClass19_1347, RuntimeException_Sub1.method1098(Class38_Sub1.anInt1748, 0) }, (byte) -20), i_12_, i_13_, 16776960, -1);
					Runtime runtime = Runtime.getRuntime();
					i_13_ += 15;
					int i_15_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
					if (i_15_ > 32768 && Class38_Sub4.aBool1811)
						i_14_ = 16711680;
					if (i_15_ > 65536 && !Class38_Sub4.aBool1811)
						i_14_ = 16711680;
					Class38_Sub20_Sub13.aClass38_Sub20_Sub9_Sub1_Sub1_3023.method1069(Class9.method43(new RSString[] { NodeSub.aClass19_2254, RuntimeException_Sub1.method1098(i_15_, 0), Class76.aClass19_1497 }, (byte) -20), i_12_, i_13_, i_14_, -1);
					i_13_ += 15;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "cb.J(" + i + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')');
			}
			break;
		} while (false);
	}

	static final Sequence method1156(int i, int i_16_) {
		try {
			Sequence class38_sub20_sub5 = (Sequence) Class73.aClass83_1427.method591(-28825, i_16_);
			if (i >= -67)
				Class38_Sub20_Sub3_Sub4.anIntArray3358 = null;
			if (class38_sub20_sub5 != null)
				return class38_sub20_sub5;
			byte[] is = Class38_Sub4.aClass17_1794.method109(9, i_16_, -113);
			class38_sub20_sub5 = new Sequence();
			class38_sub20_sub5.anInt2725 = i_16_;
			if (is != null)
				class38_sub20_sub5.method916((byte) -118, new RS2Buffer(is));
			class38_sub20_sub5.method920((byte) 85);
			Class73.aClass83_1427.method590(i_16_, (byte) -120, class38_sub20_sub5);
			return class38_sub20_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "cb.G(" + i + ',' + i_16_ + ')');
		}
	}

	static final void method1157(int i, Component component) {
		do {
			try {
				component.removeKeyListener(Class38_Sub11.aClass60_2099);
				component.removeFocusListener(Class38_Sub11.aClass60_2099);
				Class53.anInt1165 = -1;
				if (i == 32768)
					break;
				Class38_Sub20_Sub3_Sub4.aClass19_3363 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "cb.H(" + i + ',' + (component != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	@Override
	final Class38_Sub20_Sub3_Sub1 method820(byte i) {
		try {
			if (i != 109)
				Class38_Sub20_Sub3_Sub4.anIntArray3358 = null;
			return Node.forId(this.anInt3348, i - 2).method925(this.anInt3351, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "cb.E(" + i + ')');
		}
	}
}
