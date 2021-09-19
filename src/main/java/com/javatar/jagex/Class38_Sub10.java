package com.javatar.jagex;/* Class38_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class38_Sub10 extends Node {
	Class38_Sub10 aClass38_Sub10_2074;
	int anInt2075;
	Class38_Sub16 aClass38_Sub16_2076;
	volatile boolean aBool2077 = true;

	abstract int method665();

	final void method666(int[] is, int i, int i_0_) {
		if (this.aBool2077)
			method667(is, i, i_0_);
		else
			method669(i_0_);
	}

	abstract void method667(int[] is, int i, int i_1_);

	abstract Class38_Sub10 method668();

	abstract void method669(int i);

	abstract Class38_Sub10 method670();

	int method671() {
		return 255;
	}

	public Class38_Sub10() {
		/* empty */
	}
}
