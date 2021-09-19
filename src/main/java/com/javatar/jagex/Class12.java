package com.javatar.jagex;/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class12 {
	int[] anIntArray215;
	int anInt216;
	int[] anIntArray217;
	int anInt218;

	Class12() {
		Class38_Sub15.method690(16);
		this.anInt216 = Class38_Sub15.method683() != 0 ? Class38_Sub15.method690(4) + 1 : 1;
		if (Class38_Sub15.method683() != 0)
			Class38_Sub15.method690(8);
		Class38_Sub15.method690(2);
		if (this.anInt216 > 1)
			this.anInt218 = Class38_Sub15.method690(4);
		this.anIntArray217 = new int[this.anInt216];
		this.anIntArray215 = new int[this.anInt216];
		for (int i = 0; i < this.anInt216; i++) {
			Class38_Sub15.method690(8);
			this.anIntArray217[i] = Class38_Sub15.method690(8);
			this.anIntArray215[i] = Class38_Sub15.method690(8);
		}
	}
}
