package com.javatar;/* Class38_Sub20_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38_Sub20_Sub12 extends NodeSub {
	static RS2Buffer aClass38_Sub23_2991 = new RS2Buffer(new byte[5000]);
	static RSString aClass19_2995;
	static RSString aClass19_2998 = RSString.createRSString("<col=ffffff>");
	static RSString aClass19_2999 = RSString.createRSString("RuneScape wurde aktualisiert(Q");
	static RSString aClass19_3001;
	static int anInt3002 = -1;
	static RSString aClass19_3004;
	static int anInt3005;
	static RSString aClass19_3007;
	static Class20 aClass20_3008;
	private static RSString aClass19_2996;
	private static RSString aClass19_3009;

	static {
		Class38_Sub20_Sub12.aClass19_2996 = RSString.createRSString("purple:");
		Class38_Sub20_Sub12.anInt3005 = 1;
		Class38_Sub20_Sub12.aClass19_3001 = Class38_Sub20_Sub12.aClass19_2996;
		Class38_Sub20_Sub12.aClass19_2995 = Class38_Sub20_Sub12.aClass19_2996;
		Class38_Sub20_Sub12.aClass19_3007 = RSString.createRSString("Ausw-=hlen");
		Class38_Sub20_Sub12.aClass19_3009 = RSString.createRSString("as it was used to break our rules)3");
		Class38_Sub20_Sub12.aClass19_3004 = Class38_Sub20_Sub12.aClass19_3009;
	}

	RSString aClass19_2985 = Class40.aClass19_920;
	int[] anIntArray2986;
	int[] anIntArray2989;
	RSString[] aClass19Array2990;
	int anInt2992 = 0;
	int anInt2997;
	int anInt3003;
	int anInt3006;

	public Class38_Sub20_Sub12() {
		/* empty */
	}

	static final Class38_Sub6 method987(int i, int i_1_) {
		try {
			if ((byte) -29 != -29)
				Class38_Sub20_Sub12.method989(-82, true, null, null);
			Class38_Sub6 class38_sub6 = Projectile.method1167(i_1_, (byte) -29 ^ ~0x7a);
			if (i == -1)
				return class38_sub6;
			if (class38_sub6 == null || class38_sub6.aClass38_Sub6Array1867 == null || class38_sub6.aClass38_Sub6Array1867.length <= i)
				return null;
			return class38_sub6.aClass38_Sub6Array1867[i];
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "se.I(" + i + ',' + i_1_ + ',' + (byte) -29 + ')');
		}
	}

	public static void method988(byte i) {
		try {
			Class38_Sub20_Sub12.aClass19_3007 = null;
			Class38_Sub20_Sub12.aClass19_2999 = null;
			if (i != 12)
				Class38_Sub20_Sub12.aClass19_3004 = null;
			Class38_Sub20_Sub12.aClass19_2995 = null;
			Class38_Sub20_Sub12.aClass19_2996 = null;
			Class38_Sub20_Sub12.aClass19_3004 = null;
			Class38_Sub20_Sub12.aClass19_3009 = null;
			Class38_Sub20_Sub12.aClass19_3001 = null;
			Class38_Sub20_Sub12.aClass19_2998 = null;
			Class38_Sub20_Sub12.aClass20_3008 = null;
			Class38_Sub20_Sub12.aClass38_Sub23_2991 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "se.E(" + i + ')');
		}
	}

	static final void method989(int i, boolean bool, Class48 class48, Class17_Sub1 class17_sub1) {
		do {
			try {
				Class38_Sub17 class38_sub17 = new Class38_Sub17();
				class38_sub17.aLong898 = i;
				class38_sub17.aClass17_Sub1_2196 = class17_sub1;
				class38_sub17.anInt2185 = 1;
				class38_sub17.aClass48_2187 = class48;
				synchronized (Class81.aClass13_1616) {
					Class81.aClass13_1616.method68(class38_sub17, (byte) 50);
				}
				NPC.method1201();
				if (!bool)
					break;
				Class38_Sub20_Sub12.aClass19_3004 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "se.G(" + i + ',' + bool + ',' + (class48 != null ? "{...}" : "null") + ',' + (class17_sub1 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	final void method986(RS2Buffer class38_sub23) {
		try {
			if (-23866 == -23866)
				for (; ; ) {
					int i_0_ = class38_sub23.getUByte();
					if (i_0_ == 0)
						break;
					readValues(i_0_, class38_sub23);
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "se.H(" + (class38_sub23 != null ? "{...}" : "null") + ',' + -23866 + ')');
		}
	}

	private void readValues(int i, RS2Buffer stream) {
		try {
			if (-3 != -3)
				Class38_Sub20_Sub12.method989(69, false, null, null);
			if (i == 1)
				this.anInt3006 = stream.getUByte();
			else if (i != 2) {
				if (i != 3) {
					if (i == 4)
						this.anInt2997 = stream.readInt(true);
					else if (i == 5) {
						this.anInt2992 = stream.readUnsignedShortLE();
						this.aClass19Array2990 = new RSString[this.anInt2992];
						this.anIntArray2986 = new int[this.anInt2992];
						for (int i_4_ = 0; i_4_ < this.anInt2992; i_4_++) {
							this.anIntArray2986[i_4_] = stream.readInt(true);
							this.aClass19Array2990[i_4_] = stream.readString(1347418632);
						}
					} else if (i == 6) {
						this.anInt2992 = stream.readUnsignedShortLE();
						this.anIntArray2989 = new int[this.anInt2992];
						this.anIntArray2986 = new int[this.anInt2992];
						for (int i_5_ = 0; this.anInt2992 > i_5_; i_5_++) {
							this.anIntArray2986[i_5_] = stream.readInt(true);
							this.anIntArray2989[i_5_] = stream.readInt(true);
						}
					}
				} else
					this.aClass19_2985 = stream.readString(1347418632);
			} else
				this.anInt3003 = stream.getUByte();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "se.F(" + i + ',' + -3 + ',' + (stream != null ? "{...}" : "null") + ')');
		}
	}
}