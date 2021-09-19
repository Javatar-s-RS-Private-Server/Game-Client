/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class46 {
	private int anInt1034;
	private int[] anIntArray1035;
	private int anInt1036;
	private int anInt1037;
	private int anInt1038;
	private int anInt1039;
	private int anInt1040 = Class38_Sub15.method690(16);

	final void method380(float[] fs, int i, boolean bool) {
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			fs[i_0_] = 0.0F;
		if (!bool) {
			int i_1_ = Class38_Sub15.aClass39Array2171[anInt1037].anInt902;
			int i_2_ = anInt1034 - anInt1036;
			int i_3_ = i_2_ / anInt1038;
			int[] is = new int[i_3_];
			for (int i_4_ = 0; i_4_ < 8; i_4_++) {
				int i_5_ = 0;
				while (i_5_ < i_3_) {
					if (i_4_ == 0) {
						int i_6_ = Class38_Sub15.aClass39Array2171[anInt1037].method337();
						for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
							if (i_5_ + i_7_ < i_3_)
								is[i_5_ + i_7_] = i_6_ % anInt1039;
							i_6_ /= anInt1039;
						}
					}
					for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
						int i_9_ = is[i_5_];
						int i_10_ = anIntArray1035[i_9_ * 8 + i_4_];
						if (i_10_ >= 0) {
							int i_11_ = anInt1036 + i_5_ * anInt1038;
							Huffman huffman = Class38_Sub15.aClass39Array2171[i_10_];
							if (anInt1040 == 0) {
								int i_12_ = anInt1038 / huffman.anInt902;
								for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
									float[] fs_14_ = huffman.method335();
									for (int i_15_ = 0; i_15_ < huffman.anInt902; i_15_++)
										fs[i_11_ + i_13_ + i_15_ * i_12_] += fs_14_[i_15_];
								}
							} else {
								int i_16_ = 0;
								while (i_16_ < anInt1038) {
									float[] fs_17_ = huffman.method335();
									for (int i_18_ = 0; i_18_ < huffman.anInt902; i_18_++) {
										fs[i_11_ + i_16_] += fs_17_[i_18_];
										i_16_++;
									}
								}
							}
						}
						if (++i_5_ >= i_3_)
							break;
					}
				}
			}
		}
	}

	Class46() {
		anInt1036 = Class38_Sub15.method690(24);
		anInt1034 = Class38_Sub15.method690(24);
		anInt1038 = Class38_Sub15.method690(24) + 1;
		anInt1039 = Class38_Sub15.method690(6) + 1;
		anInt1037 = Class38_Sub15.method690(8);
		int[] is = new int[anInt1039];
		for (int i = 0; i < anInt1039; i++) {
			int i_19_ = 0;
			int i_20_ = Class38_Sub15.method690(3);
			boolean bool = Class38_Sub15.method683() != 0;
			if (bool)
				i_19_ = Class38_Sub15.method690(5);
			is[i] = i_19_ << 3 | i_20_;
		}
		anIntArray1035 = new int[anInt1039 * 8];
		for (int i = 0; i < anInt1039 * 8; i++)
			anIntArray1035[i] = (is[i >> 3] & 1 << (i & 0x7)) != 0 ? Class38_Sub15.method690(8) : -1;
	}
}
