/* Class38_Sub20_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

final class Class38_Sub20_Sub2 extends NodeSub {
	static int anInt2532;
	static RSString aClass19_2534;
	static int anInt2535 = 0;
	static int[] anIntArray2536;
	static int anInt2540;
	static RSString aClass19_2541;
	static RSString aClass19_2543 = RSString.createRSString("Bitte wenden Sie sich an den Kundendienst)3");

	static {
		Class38_Sub20_Sub2.anInt2532 = 0;
		Class38_Sub20_Sub2.aClass19_2534 = RSString.createRSString("Update)2Liste geladen)3");
		Class38_Sub20_Sub2.anIntArray2536 = new int[5];
		Class38_Sub20_Sub2.aClass19_2541 = RSString.createRSString("<br>(X100(U(Y");
	}

	int anInt2533;
	byte aByte2542;
	Class17_Sub1 aClass17_Sub1_2544;

	public Class38_Sub20_Sub2() {
		/* empty */
	}

	static final void method813(Throwable throwable, String string, int i) {
		do {
			try {
				String string_0_ = "";
				if (throwable != null)
					string_0_ = Class79.method577(32, throwable);
				if (string != null) {
					if (throwable != null)
						string_0_ += " | ";
					string_0_ += string;
				}
				System.out.println("Error: " + string_0_);
				string_0_ = string_0_.replace(':', '.');
				string_0_ = string_0_.replace('@', (char) i);
				string_0_ = string_0_.replace('&', '_');
				string_0_ = string_0_.replace('#', '_');
				if (Class23.aClass56_552.anApplet1242 != null) {
					Class65 class65 = Class23.aClass56_552.method433((byte) 45, new URL(Class23.aClass56_552.anApplet1242.getCodeBase(), "clienterror.ws?c=" + Class74.anInt1468 + "&u=" + Class38_Sub1.aLong1737 + "&v1=" + Class56.aString1248 + "&v2=" + Class56.aString1241 + "&e=" + string_0_));
					while (class65.anInt1368 == 0)
						Canvas_Sub1.method809(1L, i ^ ~0x6a42);
					if (class65.anInt1368 != 1)
						break;
					DataInputStream datainputstream = (DataInputStream) class65.anObject1365;
					datainputstream.read();
					datainputstream.close();
				}
			} catch (Exception exception) {
				/* empty */
			}
			break;
		} while (false);
	}

	static final void method814(int i) {
		do {
			try {
				client.secureBuffer.putOpcode(113);
				if (i != -4)
					Class38_Sub20_Sub2.anInt2532 = -128;
				for (Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method82((byte) 91); class38_sub8 != null; class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method78(45))
					if (class38_sub8.anInt2049 == 0 || class38_sub8.anInt2049 == 3)
						Class48.method388(true, (byte) -21, class38_sub8);
				if (Class38_Sub2.aClass38_Sub6_1769 == null)
					break;
				Class40.method340(Class38_Sub2.aClass38_Sub6_1769, (byte) -104);
				Class38_Sub2.aClass38_Sub6_1769 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "pf.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method815(boolean bool) {
		do {
			try {
				if (bool)
					Class38_Sub20_Sub2.anIntArray2536 = null;
				Sequence.anInt2731 = 0;
				int i = (client.myPlayer.anInt3493 >> 7) + client.currentBaseY;
				int i_1_ = (client.myPlayer.anInt3444 >> 7) + client.currentBaseX;
				if (i >= 3053 && i <= 3156 && i_1_ >= 3056 && i_1_ <= 3136)
					Sequence.anInt2731 = 1;
				if (i >= 3072 && i <= 3118 && i_1_ >= 9492 && i_1_ <= 9535)
					Sequence.anInt2731 = 1;
				if (Sequence.anInt2731 != 1 || i < 3139 || i > 3199 || i_1_ < 3008 || i_1_ > 3062)
					break;
				Sequence.anInt2731 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "pf.G(" + bool + ')');
			}
			break;
		} while (false);
	}

	public static void method816(int i) {
		try {
			Class38_Sub20_Sub2.aClass19_2541 = null;
			Class38_Sub20_Sub2.aClass19_2534 = null;
			if (i < 13)
				Class38_Sub20_Sub2.anInt2540 = -115;
			Class38_Sub20_Sub2.anIntArray2536 = null;
			Class38_Sub20_Sub2.aClass19_2543 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "pf.F(" + i + ')');
		}
	}
}
