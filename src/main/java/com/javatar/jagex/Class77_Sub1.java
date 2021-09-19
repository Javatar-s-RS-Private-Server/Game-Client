package com.javatar.jagex;/* Class77_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

final class Class77_Sub1 extends Class77 {
	private byte[] aByteArray1833;
	private AudioFormat anAudioFormat1834;
	private SourceDataLine aSourceDataLine1835;
	private int anInt1836;
	static Class aClass1837;

	@Override
	final void method553(Component component) {
		anAudioFormat1834 = new AudioFormat(Class38_Sub20_Sub7.anInt2852, 16, !Class37.aBool880 ? 1 : 2, true, false);
		aByteArray1833 = new byte[256 << (!Class37.aBool880 ? 1 : 2)];
	}

	@Override
	final void method554(int i) throws LineUnavailableException {
		try {
			DataLine.Info info = new DataLine.Info(Class77_Sub1.aClass1837 == null ? (Class77_Sub1.aClass1837 = Class77_Sub1.method629("javax.sound.sampled.SourceDataLine")) : Class77_Sub1.aClass1837, anAudioFormat1834, i << (Class37.aBool880 ? 2 : 1));
			aSourceDataLine1835 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine1835.open();
			aSourceDataLine1835.start();
			anInt1836 = i;
		} catch (LineUnavailableException lineunavailableexception) {
			if (Class38_Sub20_Sub13.method995(-125, i) != 1)
				method554(Class17_Sub1.method604(i, -30310));
			else {
				aSourceDataLine1835 = null;
				throw lineunavailableexception;
			}
		}
	}

	@Override
	final int method558() {
		return anInt1836 - (aSourceDataLine1835.available() >> (!Class37.aBool880 ? 1 : 2));
	}

	@Override
	final void method561() {
		aSourceDataLine1835.flush();
	}

	@Override
	final void method560() {
		if (aSourceDataLine1835 != null) {
			aSourceDataLine1835.close();
			aSourceDataLine1835 = null;
		}
	}

	@Override
	final void method555() {
		int i = 256;
		if (Class37.aBool880)
			i <<= 1;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = this.anIntArray1515[i_0_];
			if ((i_1_ + 8388608 & ~0xffffff) != 0)
				i_1_ = 0x7fffff ^ i_1_ >> 31;
			aByteArray1833[i_0_ * 2] = (byte) (i_1_ >> 8);
			aByteArray1833[i_0_ * 2 + 1] = (byte) (i_1_ >> 16);
		}
		aSourceDataLine1835.write(aByteArray1833, 0, i << 1);
	}

	static Class method629(String string) {
		Class var_class = null;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			try {
				throw new NoClassDefFoundError().initCause(classnotfoundexception);
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return var_class;
	}
}
