/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68 {
	private int anInt1393;
	private int anInt1394;
	private Class57[] aClass57Array1395;

	final int method481() {
		int i = 9999999;
		for (int i_0_ = 0; i_0_ < 10; i_0_++)
			if (aClass57Array1395[i_0_] != null && aClass57Array1395[i_0_].anInt1262 / 20 < i)
				i = aClass57Array1395[i_0_].anInt1262 / 20;
		if (anInt1393 < anInt1394 && anInt1393 / 20 < i)
			i = anInt1393 / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_1_ = 0; i_1_ < 10; i_1_++)
			if (aClass57Array1395[i_1_] != null)
				aClass57Array1395[i_1_].anInt1262 -= i * 20;
		if (anInt1393 < anInt1394) {
			anInt1393 -= i * 20;
			anInt1394 -= i * 20;
		}
		return i;
	}

	private final byte[] method482() {
		int i = 0;
		for (int i_2_ = 0; i_2_ < 10; i_2_++)
			if (aClass57Array1395[i_2_] != null && aClass57Array1395[i_2_].anInt1275 + aClass57Array1395[i_2_].anInt1262 > i)
				i = aClass57Array1395[i_2_].anInt1275 + aClass57Array1395[i_2_].anInt1262;
		if (i == 0)
			return new byte[0];
		int i_3_ = i * 22050 / 1000;
		byte[] is = new byte[i_3_];
		for (int i_4_ = 0; i_4_ < 10; i_4_++)
			if (aClass57Array1395[i_4_] != null) {
				int i_5_ = aClass57Array1395[i_4_].anInt1275 * 22050 / 1000;
				int i_6_ = aClass57Array1395[i_4_].anInt1262 * 22050 / 1000;
				int[] is_7_ = aClass57Array1395[i_4_].method439(i_5_, aClass57Array1395[i_4_].anInt1275);
				for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
					int i_9_ = is[i_8_ + i_6_] + (is_7_[i_8_] >> 8);
					if ((i_9_ + 128 & ~0xff) != 0)
						i_9_ = i_9_ >> 31 ^ 0x7f;
					is[i_8_ + i_6_] = (byte) i_9_;
				}
			}
		return is;
	}

	final Class38_Sub16_Sub1 method483() {
		byte[] is = method482();
		return new Class38_Sub16_Sub1(22050, is, anInt1393 * 22050 / 1000, anInt1394 * 22050 / 1000);
	}

	static final Class68 method484(Class17 class17, int i, int i_10_) {
		byte[] is = class17.method109(i, i_10_, -69);
		if (is == null)
			return null;
		return new Class68(new RS2Buffer(is));
	}

	private Class68(RS2Buffer class38_sub23) {
		aClass57Array1395 = new Class57[10];
		for (int i = 0; i < 10; i++) {
			int i_11_ = class38_sub23.getUByte();
			if (i_11_ != 0) {
				class38_sub23.pos--;
				aClass57Array1395[i] = new Class57();
				aClass57Array1395[i].method438(class38_sub23);
			}
		}
		anInt1393 = class38_sub23.getUShort();
		anInt1394 = class38_sub23.getUShort();
	}

	private Class68() {
		aClass57Array1395 = new Class57[10];
	}
}
