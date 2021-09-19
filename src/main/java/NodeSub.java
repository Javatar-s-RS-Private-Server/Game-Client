/* NodeSub - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class NodeSub extends Node {
	NodeSub aClass38_Sub20_2244;
	static RSString aClass19_2246 = RSString.createRSString("Bitte laden Sie die Seite neu)3");
	NodeSub aClass38_Sub20_2248;
	static Class81 aClass81_2249 = new Class81();
	static boolean aBool2251;
	static int anInt2252 = -1;
	static int anInt2253 = 0;
	static RSString aClass19_2254 = RSString.createRSString("Mem:");
	static int js5Port;
	static int anInt2256;
	static int anInt2257 = 0;
	static Class17 aClass17_2258;

	final void method707(boolean bool) {
		try {
			if (this.aClass38_Sub20_2248 != null) {
				this.aClass38_Sub20_2248.aClass38_Sub20_2244 = this.aClass38_Sub20_2244;
				this.aClass38_Sub20_2244.aClass38_Sub20_2248 = this.aClass38_Sub20_2248;
				this.aClass38_Sub20_2244 = null;
				if (bool)
					NodeSub.js5Port = -118;
				this.aClass38_Sub20_2248 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "be.A(" + bool + ')');
		}
	}

	static final boolean method708(int i, int i_0_, int i_1_) {
		try {
			if (i != 0)
				NodeSub.anInt2256 = -107;
			if ((i_0_ >> i_1_ + 1 & 0x1) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "be.C(" + i + ',' + i_0_ + ',' + i_1_ + ')');
		}
	}

	public static void method709(int i) {
		do {
			try {
				NodeSub.aClass81_2249 = null;
				NodeSub.aClass17_2258 = null;
				NodeSub.aClass19_2246 = null;
				NodeSub.aClass19_2254 = null;
				if (i >= 100)
					break;
				NodeSub.aClass19_2254 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "be.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method710(boolean bool, int i, int i_2_, int i_3_) {
		try {
			if (i < 8000 || i > 48000)
				throw new IllegalArgumentException();
			RSString.anInt456 = i_3_;
			if (i_2_ != -14222)
				NodeSub.anInt2257 = 52;
			Class37.aBool880 = bool;
			Class38_Sub20_Sub7.anInt2852 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "be.D(" + bool + ',' + i + ',' + i_2_ + ',' + i_3_ + ')');
		}
	}

	public NodeSub() {
		/* empty */
	}
}
