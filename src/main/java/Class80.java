/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class80 {
	static RSString aClass19_1586;
	static RSString aClass19_1587;
	private static RSString aClass19_1588;
	static RSString aClass19_1590;
	static RSString aClass19_1591 = RSString.createRSString("Diese Betatest)2Welt ist nur f-Ur eingeladene");
	private static RSString aClass19_1593;
	private static RSString aClass19_1594 = RSString.createRSString("Please remove ");
	static int anInt1595;
	static RSString aClass19_1596 = RSString.createRSString("leuchten2:");
	static RSString aClass19_1597;
	static RSString aClass19_1598 = Class80.aClass19_1594;
	static RSString aClass19_1599;
	static RSString aClass19_1600;
	static RSString aClass19_1601;
	static int[] anIntArray1602;
	private static RSString aClass19_1603;
	static int anInt1605;
	static int[] anIntArray1606;
	static Class83 aClass83_1608;
	static RSString aClass19_1610;
	private static RSString aClass19_1611;
	static RSString aClass19_1612;

	public static void method578(byte i) {
		try {
			Class80.aClass19_1600 = null;
			Class80.aClass19_1611 = null;
			Class80.aClass19_1586 = null;
			Class80.aClass19_1599 = null;
			Class80.aClass83_1608 = null;
			Class80.aClass19_1591 = null;
			Class80.aClass19_1588 = null;
			Class80.aClass19_1590 = null;
			Class80.aClass19_1596 = null;
			Class80.aClass19_1598 = null;
			Class80.aClass19_1593 = null;
			Class80.aClass19_1594 = null;
			Class80.aClass19_1597 = null;
			Class80.anIntArray1602 = null;
			Class80.anIntArray1606 = null;
			Class80.aClass19_1603 = null;
			if (i == -74) {
				Class80.aClass19_1601 = null;
				Class80.aClass19_1610 = null;
				Class80.aClass19_1587 = null;
				Client.atInventoryInterfaceType = null;
				Class80.aClass19_1612 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ad.B(" + i + ')');
		}
	}

	static final void method579(Class38_Sub21 class38_sub21, byte i) {
		try {
			int i_0_ = 0;
			if (class38_sub21.anInt2260 == 0)
				i_0_ = RuntimeException_Sub1.aClass27_3292.method256(class38_sub21.anInt2263, class38_sub21.anInt2267, class38_sub21.anInt2282);
			int i_1_ = 0;
			int i_2_ = -66 % ((i + 6) / 43);
			if (class38_sub21.anInt2260 == 1)
				i_0_ = RuntimeException_Sub1.aClass27_3292.method234(class38_sub21.anInt2263, class38_sub21.anInt2267, class38_sub21.anInt2282);
			if (class38_sub21.anInt2260 == 2)
				i_0_ = RuntimeException_Sub1.aClass27_3292.method236(class38_sub21.anInt2263, class38_sub21.anInt2267, class38_sub21.anInt2282);
			int i_3_ = -1;
			if (class38_sub21.anInt2260 == 3)
				i_0_ = RuntimeException_Sub1.aClass27_3292.method237(class38_sub21.anInt2263, class38_sub21.anInt2267, class38_sub21.anInt2282);
			int i_4_ = 0;
			if (i_0_ != 0) {
				i_3_ = i_0_ >> -95100338 & 0x7fff;
				int i_5_ = RuntimeException_Sub1.aClass27_3292.method224(class38_sub21.anInt2263, class38_sub21.anInt2267, class38_sub21.anInt2282, i_0_);
				i_1_ = i_5_ & 0x1f;
				i_4_ = (i_5_ & 0xdc) >> 734940966;
			}
			class38_sub21.anInt2270 = i_1_;
			class38_sub21.anInt2272 = i_4_;
			class38_sub21.anInt2268 = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ad.A(" + (class38_sub21 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final int method580(int i) {
		try {
			int i_6_ = i;
			if (Class3.anInt44 < 310) {
				int i_7_ = Class11.anInt208 >> -504537753;
				int i_8_ = Class2.anInt30 >> -501129785;
				if ((Class82.aByteArrayArrayArray1648[Client.height][i_7_][i_8_] & 0x4) != 0)
					i_6_ = Client.height;
				int i_9_ = ((Entity) Client.myPlayer).anInt3493 >> -1240898905;
				int i_10_ = ((Entity) Client.myPlayer).anInt3444 >> -243261497;
				int i_11_;
				if (i_7_ < i_9_)
					i_11_ = -i_7_ + i_9_;
				else
					i_11_ = -i_9_ + i_7_;
				int i_12_;
				if (i_8_ < i_10_)
					i_12_ = -i_8_ + i_10_;
				else
					i_12_ = -i_10_ + i_8_;
				if (i_11_ > i_12_) {
					int i_13_ = i_12_ * 65536 / i_11_;
					int i_14_ = 32768;
					while (i_7_ != i_9_) {
						if (i_9_ <= i_7_) {
							if (i_9_ < i_7_)
								i_7_--;
						} else
							i_7_++;
						if ((Class82.aByteArrayArrayArray1648[Client.height][i_7_][i_8_] & 0x4) != 0)
							i_6_ = Client.height;
						i_14_ += i_13_;
						if (i_14_ >= 65536) {
							if (i_10_ > i_8_)
								i_8_++;
							else if (i_10_ < i_8_)
								i_8_--;
							if ((Class82.aByteArrayArrayArray1648[Client.height][i_7_][i_8_] & 0x4) != 0)
								i_6_ = Client.height;
							i_14_ -= 65536;
						}
					}
				} else {
					int i_15_ = i_11_ * 65536 / i_12_;
					int i_16_ = 32768;
					while (i_10_ != i_8_) {
						if (i_10_ <= i_8_) {
							if (i_8_ > i_10_)
								i_8_--;
						} else
							i_8_++;
						i_16_ += i_15_;
						if ((Class82.aByteArrayArrayArray1648[Client.height][i_7_][i_8_] & 0x4) != 0)
							i_6_ = Client.height;
						if (i_16_ >= 65536) {
							if (i_7_ >= i_9_) {
								if (i_7_ > i_9_)
									i_7_--;
							} else
								i_7_++;
							i_16_ -= 65536;
							if ((Class82.aByteArrayArrayArray1648[Client.height][i_7_][i_8_] & 0x4) != 0)
								i_6_ = Client.height;
						}
					}
				}
			}
			if ((Class82.aByteArrayArrayArray1648[Client.height][((Entity) Client.myPlayer).anInt3493 >> -1460808249][((Entity) Client.myPlayer).anInt3444 >> -455738393] & 0x4) != 0)
				i_6_ = Client.height;
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ad.C(" + i + ')');
		}
	}

	static final ObjectDefinition method581(int i, int i_17_) {
		try {
			ObjectDefinition class38_sub20_sub1 = (ObjectDefinition) Class17_Sub1.aClass83_1689.method591(-28825, i_17_);
			int i_18_ = 48 % ((i + 63) / 63);
			if (class38_sub20_sub1 != null)
				return class38_sub20_sub1;
			byte[] is = Class26.aClass17_600.method109(6, i_17_, -82);
			class38_sub20_sub1 = new ObjectDefinition();
			class38_sub20_sub1.anInt2468 = i_17_;
			if (is != null)
				class38_sub20_sub1.method802(new RS2Buffer(is), true);
			class38_sub20_sub1.method807(1);
			if (class38_sub20_sub1.aBool2445) {
				class38_sub20_sub1.aBool2466 = false;
				class38_sub20_sub1.anInt2482 = 0;
			}
			Class17_Sub1.aClass83_1689.method590(i_17_, (byte) -128, class38_sub20_sub1);
			return class38_sub20_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ad.D(" + i + ',' + i_17_ + ')');
		}
	}

	static {
		Class80.anInt1595 = -1;
		Class80.aClass19_1601 = RSString.createRSString("Benutzeroberfl-=che geladen)3");
		Class80.aClass19_1603 = RSString.createRSString("Choose Option");
		Class80.aClass19_1593 = RSString.createRSString("flash3:");
		Class80.aClass19_1597 = Class80.aClass19_1603;
		Class80.aClass19_1587 = Class80.aClass19_1593;
		Class80.aClass19_1586 = Class80.aClass19_1593;
		Class80.aClass19_1600 = Class80.aClass19_1594;
		Class80.aClass19_1590 = RSString.createRSString("<col=80ff00>");
		Class80.anInt1605 = 1;
		Class80.aClass19_1588 = RSString.createRSString("You can(Wt add yourself to your own friend list");
		Class80.anIntArray1606 = new int[200];
		Class80.aClass19_1599 = Class80.aClass19_1588;
		Class80.aClass83_1608 = new Class83(64);
		Class80.aClass19_1611 = RSString.createRSString("white:");
		Class80.aClass19_1610 = Class80.aClass19_1611;
		Class80.aClass19_1612 = Class80.aClass19_1611;
	}
}
