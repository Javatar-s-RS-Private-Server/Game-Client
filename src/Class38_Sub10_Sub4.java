/* Class38_Sub10_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub10_Sub4 extends Class38_Sub10 {
	private final Class13 aClass13_3078 = new Class13();
	private final Class13 aClass13_3079 = new Class13();
	private int anInt3080 = -1;
	private int anInt3081 = 0;

	public Class38_Sub10_Sub4() {
		/* empty */
	}

	final synchronized void method1014(Class38_Sub10 class38_sub10) {
		class38_sub10.method330(0);
	}

	@Override
	final synchronized void method667(int[] is, int i, int i_0_) {
		do {
			if (anInt3080 < 0) {
				method1015(is, i, i_0_);
				break;
			}
			if (anInt3081 + i_0_ < anInt3080) {
				anInt3081 += i_0_;
				method1015(is, i, i_0_);
				break;
			}
			int i_1_ = anInt3080 - anInt3081;
			method1015(is, i, i_1_);
			i += i_1_;
			i_0_ -= i_1_;
			anInt3081 += i_1_;
			method1018();
			Class38_Sub13 class38_sub13 = (Class38_Sub13) aClass13_3079.method65(91);
			synchronized (class38_sub13) {
				int i_2_ = class38_sub13.method677(this);
				if (i_2_ < 0) {
					class38_sub13.anInt2124 = 0;
					method1020(class38_sub13);
				} else {
					class38_sub13.anInt2124 = i_2_;
					method1016(class38_sub13.aClass38_894, class38_sub13);
				}
			}
		} while (i_0_ != 0);
	}

	private final void method1015(int[] is, int i, int i_3_) {
		for (Class38_Sub10 class38_sub10 = (Class38_Sub10) aClass13_3078.method65(81); class38_sub10 != null; class38_sub10 = (Class38_Sub10) aClass13_3078.method63(-3))
			class38_sub10.method666(is, i, i_3_);
	}

	private final void method1016(Node Node, Class38_Sub13 class38_sub13) {
		for (/**/; Node != aClass13_3079.aClass38_222 && ((Class38_Sub13) Node).anInt2124 <= class38_sub13.anInt2124; Node = Node.aClass38_894) {
			/* empty */
		}
		aClass13_3079.method70(class38_sub13, Node, 119);
		anInt3080 = ((Class38_Sub13) aClass13_3079.aClass38_222.aClass38_894).anInt2124;
	}

	@Override
	final synchronized void method669(int i) {
		do {
			if (anInt3080 < 0) {
				method1017(i);
				break;
			}
			if (anInt3081 + i < anInt3080) {
				anInt3081 += i;
				method1017(i);
				break;
			}
			int i_4_ = anInt3080 - anInt3081;
			method1017(i_4_);
			i -= i_4_;
			anInt3081 += i_4_;
			method1018();
			Class38_Sub13 class38_sub13 = (Class38_Sub13) aClass13_3079.method65(103);
			synchronized (class38_sub13) {
				int i_5_ = class38_sub13.method677(this);
				if (i_5_ < 0) {
					class38_sub13.anInt2124 = 0;
					method1020(class38_sub13);
				} else {
					class38_sub13.anInt2124 = i_5_;
					method1016(class38_sub13.aClass38_894, class38_sub13);
				}
			}
		} while (i != 0);
	}

	@Override
	final Class38_Sub10 method670() {
		return (Class38_Sub10) aClass13_3078.method65(99);
	}

	private final void method1017(int i) {
		for (Class38_Sub10 class38_sub10 = (Class38_Sub10) aClass13_3078.method65(85); class38_sub10 != null; class38_sub10 = (Class38_Sub10) aClass13_3078.method63(-3))
			class38_sub10.method669(i);
	}

	@Override
	final Class38_Sub10 method668() {
		return (Class38_Sub10) aClass13_3078.method63(-3);
	}

	private final void method1018() {
		if (anInt3081 > 0) {
			for (Class38_Sub13 class38_sub13 = (Class38_Sub13) aClass13_3079.method65(110); class38_sub13 != null; class38_sub13 = (Class38_Sub13) aClass13_3079.method63(-3))
				class38_sub13.anInt2124 -= anInt3081;
			anInt3080 -= anInt3081;
			anInt3081 = 0;
		}
	}

	final synchronized void method1019(Class38_Sub10 class38_sub10) {
		aClass13_3078.method61(-46, class38_sub10);
	}

	private final void method1020(Class38_Sub13 class38_sub13) {
		class38_sub13.method330(0);
		class38_sub13.method678();
		Node Node = aClass13_3079.aClass38_222.aClass38_894;
		if (Node == aClass13_3079.aClass38_222)
			anInt3080 = -1;
		else
			anInt3080 = ((Class38_Sub13) Node).anInt2124;
	}

	@Override
	final int method665() {
		return 0;
	}
}
