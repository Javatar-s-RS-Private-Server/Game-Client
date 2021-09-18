/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class73 {
	static int[] anIntArray1423;
	static RSString aClass19_1425 = RSString
			.createRSString("m-Ochte mit Ihnen handeln)3");
	static int anInt1426;
	static Class83 aClass83_1427 = new Class83(64);
	static int anInt1429 = 0;
	static RSString aClass19_1430;
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array1431;
	private static RSString aClass19_1432 = RSString
			.createRSString("Loading interfaces )2 ");

	static {
		Class73.aClass19_1430 = Class73.aClass19_1432;
	}

	public Class73() {
		/* empty */
	}

	static final void method515(byte i) {
		do {
			try {
				int i_0_ = Class15.inputStream.method785(8, (byte) 69);
				if (ItemDefinition.anInt2783 > i_0_)
					for (int i_1_ = i_0_; ItemDefinition.anInt2783 > i_1_; i_1_++)
						Class21.anIntArray519[Class4.anInt81++] = Class47.anIntArray1055[i_1_];
				if (ItemDefinition.anInt2783 < i_0_)
					throw new RuntimeException("gppov1");
				ItemDefinition.anInt2783 = 0;
				for (int i_2_ = 0; i_0_ > i_2_; i_2_++) {
					int i_3_ = Class47.anIntArray1055[i_2_];
					Player entity = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_3_];
					int i_4_ = Class15.inputStream.method785(1, (byte) 69);
					if (i_4_ == 0) {
						Class47.anIntArray1055[ItemDefinition.anInt2783++] = i_3_;
						entity.anInt3459 = Class45.anInt1016;
					} else {
						int i_5_ = Class15.inputStream.method785(2, (byte) 69);
						if (i_5_ == 0) {
							Class47.anIntArray1055[ItemDefinition.anInt2783++] = i_3_;
							entity.anInt3459 = Class45.anInt1016;
							ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = i_3_;
						} else if (i_5_ == 1) {
							Class47.anIntArray1055[ItemDefinition.anInt2783++] = i_3_;
							entity.anInt3459 = Class45.anInt1016;
							int i_6_ = Class15.inputStream.method785(3,
									(byte) 69);
							entity.move(i_6_, false);
							int i_7_ = Class15.inputStream.method785(1,
									(byte) 69);
							if (i_7_ == 1)
								ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = i_3_;
						} else if (i_5_ == 2) {
							Class47.anIntArray1055[ItemDefinition.anInt2783++] = i_3_;
							entity.anInt3459 = Class45.anInt1016;
							int i_8_ = Class15.inputStream.method785(3,
									(byte) 69);
							entity.move(i_8_, true);
							int i_9_ = Class15.inputStream.method785(3,
									(byte) 69);
							entity.move(i_9_, true);
							int i_10_ = Class15.inputStream.method785(1,
									(byte) 69);
							if (i_10_ == 1)
								ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = i_3_;
						} else if (i_5_ == 3)
							Class21.anIntArray519[Class4.anInt81++] = i_3_;
					}
				}
				if (i > 92)
					break;
				Class73.method520(-22L, 38);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ba.E(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method516(Class17 class17, int i) {
		try {
			if (i != 8)
				Class73.method517((byte) 73);
			Class58.aClass17_1278 = class17;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ba.G("
					+ (class17 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method517(byte i) {
		do {
			try {
				Class73.aClass38_Sub20_Sub9_Sub3Array1431 = null;
				Class73.aClass83_1427 = null;
				Class73.aClass19_1432 = null;
				Class73.aClass19_1430 = null;
				Class73.aClass19_1425 = null;
				Class73.anIntArray1423 = null;
				if (i == -68)
					break;
				Class73.aClass19_1432 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "ba.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final RSString method520(long l, int i) {
		try {
			if (l <= 0L || l >= 6582952005840035281L)
				return null;
			if (l % 37L == 0L)
				return null;
			if (i != 1)
				Class73.method515((byte) 41);
			int i_13_ = 0;
			for (long l_14_ = l; l_14_ != 0L; l_14_ /= 37L)
				i_13_++;
			byte[] is = new byte[i_13_];
			while (l != 0L) {
				long l_15_ = l;
				l /= 37L;
				is[--i_13_] = Class38_Sub7.aByteArray2019[(int) (l_15_ + -(l * 37L))];
			}
			RSString class19 = new RSString();
			class19.buffer = is;
			class19.anInt478 = is.length;
			return class19;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ba.H(" + l + ','
					+ i + ')');
		}
	}

	abstract void method518(int i);

	abstract int method519(int i, int i_11_, int i_12_);
}
