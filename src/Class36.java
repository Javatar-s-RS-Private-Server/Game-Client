/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class36 {
	int anInt851;
	int anInt853;
	int anInt856;
	private int anInt852 = 2;
	private int[] anIntArray854 = new int[2];
	private int[] anIntArray855 = new int[2];
	private int anInt857;
	private int anInt858;
	private int anInt859;
	private int anInt860;
	private int anInt861;

	public Class36() {
		anIntArray854[0] = 0;
		anIntArray854[1] = 65535;
		anIntArray855[0] = 0;
		anIntArray855[1] = 65535;
	}

	final int method318(int i) {
		if (anInt858 >= anInt859) {
			anInt857 = anIntArray855[anInt861++] << 15;
			if (anInt861 >= anInt852)
				anInt861 = anInt852 - 1;
			anInt859 = (int) (anIntArray854[anInt861] / 65536.0 * i);
			if (anInt859 > anInt858)
				anInt860 = ((anIntArray855[anInt861] << 15) - anInt857) / (anInt859 - anInt858);
		}
		anInt857 += anInt860;
		anInt858++;
		return anInt857 - anInt860 >> 15;
	}

	final void method319(RS2Buffer class38_sub23) {
		this.anInt856 = class38_sub23.getUByte();
		this.anInt853 = class38_sub23.readInt(true);
		this.anInt851 = class38_sub23.readInt(true);
		method321(class38_sub23);
	}

	final void method320() {
		anInt859 = 0;
		anInt861 = 0;
		anInt860 = 0;
		anInt857 = 0;
		anInt858 = 0;
	}

	final void method321(RS2Buffer class38_sub23) {
		anInt852 = class38_sub23.getUByte();
		anIntArray854 = new int[anInt852];
		anIntArray855 = new int[anInt852];
		for (int i = 0; i < anInt852; i++) {
			anIntArray854[i] = class38_sub23.readUnsignedShortLE();
			anIntArray855[i] = class38_sub23.readUnsignedShortLE();
		}
	}
}
