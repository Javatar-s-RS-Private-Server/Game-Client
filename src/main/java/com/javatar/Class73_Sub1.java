package com.javatar;/* Class73_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class73_Sub1 extends Class73 {
	private long aLong1775 = System.nanoTime();

	@Override
	final int method519(int i, int i_0_, int i_1_) {
		long l = aLong1775 - System.nanoTime();
		if (i_0_ != 1)
			method518(-47);
		long l_2_ = i_1_ * 1000000L;
		if (l < l_2_)
			l = l_2_;
		Canvas_Sub1.method809(l / 1000000L, -27166);
		long l_3_ = System.nanoTime();
		int i_4_;
		for (i_4_ = 0; i_4_ < 10 && (i_4_ < 1 || l_3_ > aLong1775); aLong1775 += i * 1000000L)
			i_4_++;
		if (l_3_ > aLong1775)
			aLong1775 = l_3_;
		return i_4_;
	}

	@Override
	final void method518(int i) {
		if (i > 110)
			aLong1775 = System.nanoTime();
	}
}
