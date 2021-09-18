/* Animation - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Animation {
	private static int[] anIntArray130;
	private static int[] anIntArray131 = new int[500];
	private static int[] anIntArray136 = new int[500];
	private static int[] anIntArray138;

	static {
		Animation.anIntArray130 = new int[500];
		Animation.anIntArray138 = new int[500];
	}

	Class38_Sub14 aClass38_Sub14_132;
	int anInt133 = -1;
	int[] anIntArray134;
	boolean aBool135 = false;
	int[] anIntArray137;
	int[] anIntArray139;
	int[] anIntArray140;

	Animation(byte[] is, Class38_Sub14 class38_sub14) {
		this.aClass38_Sub14_132 = null;
		this.aClass38_Sub14_132 = class38_sub14;
		RS2Buffer class38_sub23 = new RS2Buffer(is);
		RS2Buffer class38_sub23_0_ = new RS2Buffer(is);
		class38_sub23.pos = 2;
		int i = class38_sub23.getUByte();
		int i_1_ = -1;
		int i_2_ = 0;
		class38_sub23_0_.pos = class38_sub23.pos + i;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			int i_4_ = class38_sub23.getUByte();
			if (i_4_ > 0) {
				if (this.aClass38_Sub14_132.anIntArray2129[i_3_] != 0)
					for (int i_5_ = i_3_ - 1; i_5_ > i_1_; i_5_--)
						if (this.aClass38_Sub14_132.anIntArray2129[i_5_] == 0) {
							Animation.anIntArray131[i_2_] = i_5_;
							Animation.anIntArray138[i_2_] = 0;
							Animation.anIntArray136[i_2_] = 0;
							Animation.anIntArray130[i_2_] = 0;
							i_2_++;
							break;
						}
				Animation.anIntArray131[i_2_] = i_3_;
				int i_6_ = 0;
				if (this.aClass38_Sub14_132.anIntArray2129[i_3_] == 3)
					i_6_ = 128;
				if ((i_4_ & 0x1) != 0)
					Animation.anIntArray138[i_2_] = class38_sub23_0_
							.method737(-49152);
				else
					Animation.anIntArray138[i_2_] = i_6_;
				if ((i_4_ & 0x2) != 0)
					Animation.anIntArray136[i_2_] = class38_sub23_0_
							.method737(-49152);
				else
					Animation.anIntArray136[i_2_] = i_6_;
				if ((i_4_ & 0x4) != 0)
					Animation.anIntArray130[i_2_] = class38_sub23_0_
							.method737(-49152);
				else
					Animation.anIntArray130[i_2_] = i_6_;
				i_1_ = i_3_;
				i_2_++;
				if (this.aClass38_Sub14_132.anIntArray2129[i_3_] == 5)
					this.aBool135 = true;
			}
		}
		if (class38_sub23_0_.pos != is.length)
			throw new RuntimeException();
		this.anInt133 = i_2_;
		this.anIntArray139 = new int[i_2_];
		this.anIntArray137 = new int[i_2_];
		this.anIntArray140 = new int[i_2_];
		this.anIntArray134 = new int[i_2_];
		for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
			this.anIntArray139[i_7_] = Animation.anIntArray131[i_7_];
			this.anIntArray137[i_7_] = Animation.anIntArray138[i_7_];
			this.anIntArray140[i_7_] = Animation.anIntArray136[i_7_];
			this.anIntArray134[i_7_] = Animation.anIntArray130[i_7_];
		}
	}

	public static void method36() {
		anIntArray131 = null;
		anIntArray138 = null;
		anIntArray136 = null;
		anIntArray130 = null;
	}
}
