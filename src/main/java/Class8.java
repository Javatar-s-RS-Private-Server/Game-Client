/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class8 {
	static int[][] anIntArrayArray141;
	int[] anIntArray142 = new int[2];
	private int[][][] anIntArrayArrayArray143 = new int[2][2][4];
	private static float[][] aFloatArrayArray144 = new float[2][8];
	static int anInt145;
	private static float aFloat146;
	private int[] anIntArray147 = new int[2];
	private int[][][] anIntArrayArrayArray148 = new int[2][2][4];

	final void method37(RS2Buffer class38_sub23, Class36 class36) {
		int i = class38_sub23.getUByte();
		this.anIntArray142[0] = i >> 4;
		this.anIntArray142[1] = i & 0xf;
		if (i != 0) {
			anIntArray147[0] = class38_sub23.getUShort();
			anIntArray147[1] = class38_sub23.getUShort();
			int i_0_ = class38_sub23.getUByte();
			for (int i_1_ = 0; i_1_ < 2; i_1_++)
				for (int i_2_ = 0; i_2_ < this.anIntArray142[i_1_]; i_2_++) {
					anIntArrayArrayArray148[i_1_][0][i_2_] = class38_sub23.getUShort();
					anIntArrayArrayArray143[i_1_][0][i_2_] = class38_sub23.getUShort();
				}
			for (int i_3_ = 0; i_3_ < 2; i_3_++)
				for (int i_4_ = 0; i_4_ < this.anIntArray142[i_3_]; i_4_++)
					if ((i_0_ & 1 << i_3_ * 4 << i_4_) != 0) {
						anIntArrayArrayArray148[i_3_][1][i_4_] = class38_sub23.getUShort();
						anIntArrayArrayArray143[i_3_][1][i_4_] = class38_sub23.getUShort();
					} else {
						anIntArrayArrayArray148[i_3_][1][i_4_] = anIntArrayArrayArray148[i_3_][0][i_4_];
						anIntArrayArrayArray143[i_3_][1][i_4_] = anIntArrayArrayArray143[i_3_][0][i_4_];
					}
			if (i_0_ != 0 || anIntArray147[1] != anIntArray147[0])
				class36.method321(class38_sub23);
		} else
			anIntArray147[0] = anIntArray147[1] = 0;
	}

	private static final float method38(float f) {
		float f_5_ = (float) Math.pow(2.0, f) * 32.703197F;
		return f_5_ * 3.1415927F / 11025.0F;
	}

	final int method39(int i, float f) {
		if (i == 0) {
			float f_6_ = anIntArray147[0] + (anIntArray147[1] - anIntArray147[0]) * f;
			f_6_ *= 0.0030517578F;
			Class8.aFloat146 = (float) Math.pow(0.1, f_6_ / 20.0F);
			Class8.anInt145 = (int) (Class8.aFloat146 * 65536.0F);
		}
		if (this.anIntArray142[i] == 0)
			return 0;
		float f_7_ = method42(i, 0, f);
		Class8.aFloatArrayArray144[i][0] = f_7_ * -2.0F * (float) Math.cos(method41(i, 0, f));
		Class8.aFloatArrayArray144[i][1] = f_7_ * f_7_;
		for (int i_8_ = 1; i_8_ < this.anIntArray142[i]; i_8_++) {
			f_7_ = method42(i, i_8_, f);
			float f_9_ = f_7_ * -2.0F * (float) Math.cos(method41(i, i_8_, f));
			float f_10_ = f_7_ * f_7_;
			Class8.aFloatArrayArray144[i][i_8_ * 2 + 1] = Class8.aFloatArrayArray144[i][i_8_ * 2 - 1] * f_10_;
			Class8.aFloatArrayArray144[i][i_8_ * 2] = Class8.aFloatArrayArray144[i][i_8_ * 2 - 1] * f_9_ + Class8.aFloatArrayArray144[i][i_8_ * 2 - 2] * f_10_;
			for (int i_11_ = i_8_ * 2 - 1; i_11_ >= 2; i_11_--)
				Class8.aFloatArrayArray144[i][i_11_] += Class8.aFloatArrayArray144[i][i_11_ - 1] * f_9_ + Class8.aFloatArrayArray144[i][i_11_ - 2] * f_10_;
			Class8.aFloatArrayArray144[i][1] += Class8.aFloatArrayArray144[i][0] * f_9_ + f_10_;
			Class8.aFloatArrayArray144[i][0] += f_9_;
		}
		if (i == 0)
			for (int i_12_ = 0; i_12_ < this.anIntArray142[0] * 2; i_12_++)
				Class8.aFloatArrayArray144[0][i_12_] *= Class8.aFloat146;
		for (int i_13_ = 0; i_13_ < this.anIntArray142[i] * 2; i_13_++)
			Class8.anIntArrayArray141[i][i_13_] = (int) (Class8.aFloatArrayArray144[i][i_13_] * 65536.0F);
		return this.anIntArray142[i] * 2;
	}

	public static void method40() {
		Class8.aFloatArrayArray144 = null;
		Class8.anIntArrayArray141 = null;
	}

	private final float method41(int i, int i_14_, float f) {
		float f_15_ = anIntArrayArrayArray148[i][0][i_14_] + f * (anIntArrayArrayArray148[i][1][i_14_] - anIntArrayArrayArray148[i][0][i_14_]);
		f_15_ *= 1.2207031E-4F;
		return Class8.method38(f_15_);
	}

	private final float method42(int i, int i_16_, float f) {
		float f_17_ = anIntArrayArrayArray143[i][0][i_16_] + f * (anIntArrayArrayArray143[i][1][i_16_] - anIntArrayArrayArray143[i][0][i_16_]);
		f_17_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, -f_17_ / 20.0F);
	}

	public Class8() {
		/* empty */
	}

	static {
		Class8.anIntArrayArray141 = new int[2][8];
	}
}
