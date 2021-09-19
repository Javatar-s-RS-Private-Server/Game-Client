package com.javatar;/* Class59_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.nio.ByteBuffer;

final class Class59_Sub1 extends Class59 {
	private ByteBuffer aByteBuffer2226;

	@Override
	final void method447(byte[] is, byte i) {
		aByteBuffer2226 = ByteBuffer.allocateDirect(is.length);
		aByteBuffer2226.position(0);
		if (i > -87)
			method447(null, (byte) -43);
		aByteBuffer2226.put(is);
	}

	@Override
	final byte[] method449() {
		if ((byte) 84 != 84)
			aByteBuffer2226 = null;
		byte[] is = new byte[aByteBuffer2226.capacity()];
		aByteBuffer2226.position(0);
		aByteBuffer2226.get(is);
		return is;
	}
}
