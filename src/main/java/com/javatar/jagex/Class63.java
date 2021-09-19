package com.javatar.jagex;/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class63 {
	private File aFile1350;
	private RandomAccessFile aRandomAccessFile1351;
	private long aLong1352;
	private long aLong1353;

	public final File method466(int i) {
		if (i >= -86)
			method466(-47);
		return aFile1350;
	}

	@Override
	protected final void finalize() throws Throwable {
		if (aRandomAccessFile1351 != null) {
			System.out.println("Warning! fileondisk " + aFile1350 + " not closed correctly using close(). Auto-closing instead. ");
			method471(0);
		}
	}

	public final void method467(byte i, long l) throws IOException {
		aRandomAccessFile1351.seek(l);
		aLong1352 = l;
		int i_0_ = 61 % ((60 - i) / 63);
	}

	public final int method468(int i, byte[] is, int i_1_, int i_2_) throws IOException {
		if (i_1_ != -19789)
			return -9;
		int i_3_ = aRandomAccessFile1351.read(is, i, i_2_);
		if (i_3_ > 0)
			aLong1352 += i_3_;
		return i_3_;
	}

	public final long method469(int i) throws IOException {
		if (i <= 79)
			method466(-105);
		return aRandomAccessFile1351.length();
	}

	Class63(File file, String string, long l) throws IOException {
		if (l == -1L)
			l = 9223372036854775807L;
		if (file.length() >= l)
			file.delete();
		aRandomAccessFile1351 = new RandomAccessFile(file, string);
		aLong1352 = 0L;
		aFile1350 = file;
		aLong1353 = l;
		int i = aRandomAccessFile1351.read();
		if (i != -1 && !string.equals("r")) {
			aRandomAccessFile1351.seek(0L);
			aRandomAccessFile1351.write(i);
		}
		aRandomAccessFile1351.seek(0L);
	}

	public final void method470(byte[] is, int i, int i_4_, int i_5_) throws IOException {
		if (i_5_ - -aLong1352 > aLong1353) {
			aRandomAccessFile1351.seek(aLong1353 + 1L);
			aRandomAccessFile1351.write(1);
			throw new EOFException();
		}
		aRandomAccessFile1351.write(is, i_4_, i_5_);
		aLong1352 += i_5_;
		int i_6_ = -80 / ((i + 47) / 60);
	}

	public final void method471(int i) throws IOException {
		if (i != 0)
			method466(-57);
		if (aRandomAccessFile1351 != null) {
			aRandomAccessFile1351.close();
			aRandomAccessFile1351 = null;
		}
	}
}
