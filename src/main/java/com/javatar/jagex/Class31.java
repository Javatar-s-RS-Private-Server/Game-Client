package com.javatar.jagex;/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class Class31 implements Runnable {
	private boolean aBool740 = false;
	private boolean aBool742 = false;
	private Socket aSocket743;
	private byte[] aByteArray745;
	private Class56 aClass56_746;
	static short[] aShortArray747;
	static int anInt748 = 10;
	static RSString aClass19_749 = RSString.createRSString(" zuerst von Ihrer Freunde)2Liste(Q");
	private OutputStream anOutputStream751;
	static RSString aClass19_752 = RSString.createRSString("VOLL");
	private InputStream anInputStream753;
	private Class65 aClass65_754;
	static RSString aClass19_755 = RSString.createRSString("AUS");
	private int anInt758 = 0;
	private static RSString aClass19_760 = RSString.createRSString("Starting game engine)3)3)3");
	static RSString aClass19_761 = Class31.aClass19_760;
	private int anInt763 = 0;

	static final void addLocalPlayers(int i) {
		try {
			while (Class15.inputStream.method787((byte) -122, Entity.packetLength) >= 11) {
				int i_0_ = Class15.inputStream.readBits(11, (byte) 69);
				if (i_0_ == 2047)
					break;
				boolean bool = false;
				if (Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_0_] == null) {
					Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_0_] = new Player();
					if (Class38_Sub20_Sub10.appearanceCache[i_0_] != null)
						Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_0_].decodeAppearance(Class38_Sub20_Sub10.appearanceCache[i_0_]);
					bool = true;
				}
				Class47.anIntArray1055[ItemDefinition.anInt2783++] = i_0_;
				Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_0_];
				((Entity) class38_sub20_sub3_sub7_sub2).anInt3459 = Class45.anInt1016;
				int i_1_ = Class15.inputStream.readBits(5, (byte) 69);
				if (i_1_ > 15)
					i_1_ -= 32;
				int i_2_ = Class15.inputStream.readBits(5, (byte) 69);
				if (i_2_ > 15)
					i_2_ -= 32;
				int i_3_ = PlayerAppearance.anIntArray418[Class15.inputStream.readBits(3, (byte) 69)];
				if (bool)
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3488 = ((Entity) class38_sub20_sub3_sub7_sub2).anInt3491 = i_3_;
				int i_4_ = Class15.inputStream.readBits(1, (byte) 69);
				int i_5_ = Class15.inputStream.readBits(1, (byte) 69);
				if (i_5_ == 1)
					ItemDefinition.anIntArray2797[Class38_Sub20_Sub15.anInt3064++] = i_0_;
				class38_sub20_sub3_sub7_sub2.updatePosition(((Entity) Client.myPlayer).walkQueueX[0] + i_1_, ((Entity) Client.myPlayer).walkQueueY[0] + i_2_, i_4_ == 1);
			}
			if (i != 11)
				Class31.aClass19_755 = null;
			Class15.inputStream.method788(7);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "b.D(" + i + ')');
		}
	}

	final int method286(int i) throws IOException {
		try {
			if (i != 860)
				return 3;
			if (aBool742)
				return 0;
			return anInputStream753.read();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "b.G(" + i + ')');
		}
	}

	public static void method287(byte i) {
		do {
			try {
				Class31.aClass19_752 = null;
				Class31.aClass19_749 = null;
				Class31.aClass19_755 = null;
				Class31.aClass19_760 = null;
				Class31.aClass19_761 = null;
				Class31.aShortArray747 = null;
				if (i == -50)
					break;
				Class31.aClass19_749 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "b.F(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method288(byte i) {
		try {
			if (i < -8) {
				Class25.aClass83_585.method596(103);
				Class61.aClass83_1329.method596(-120);
				Class3.aClass83_50.method596(-116);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "b.C(" + i + ')');
		}
	}

	final void write(byte[] is, int i, int i_6_, byte i_7_) throws IOException {
		try {
			if (i_7_ < 120)
				anOutputStream751 = null;
			if (!aBool742) {
				if (aBool740) {
					aBool740 = false;
					throw new IOException();
				}
				if (aByteArray745 == null)
					aByteArray745 = new byte[5000];
				synchronized (this) {
					for (int i_8_ = 0; i > i_8_; i_8_++) {
						aByteArray745[anInt758] = is[i_6_ + i_8_];
						anInt758 = (anInt758 + 1) % 5000;
						if (anInt758 == (anInt763 + 4900) % 5000)
							throw new IOException();
					}
					if (aClass65_754 == null)
						aClass65_754 = aClass56_746.method430(3, this, 106);
					notifyAll();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "b.B(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_6_ + ',' + i_7_ + ')');
		}
	}

	final void method290(int i, int i_9_, byte[] is, int i_10_) throws IOException {
		try {
			if (i <= 107)
				Class31.method293(80);
			if (!aBool742)
				while (i_10_ > 0) {
					int i_11_ = anInputStream753.read(is, i_9_, i_10_);
					if (i_11_ <= 0)
						throw new EOFException();
					i_10_ -= i_11_;
					i_9_ += i_11_;
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "b.I(" + i + ',' + i_9_ + ',' + (is != null ? "{...}" : "null") + ',' + i_10_ + ')');
		}
	}

	@Override
	protected final void finalize() {
		try {
			method292(89);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "b.finalize(" + ')');
		}
	}

	final int method291(byte i) throws IOException {
		try {
			if (i < 114)
				Class31.aShortArray747 = null;
			if (aBool742)
				return 0;
			return anInputStream753.available();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "b.H(" + i + ')');
		}
	}

	@Override
	public final void run() {
		try {
			try {
				for (;;) {
					int i;
					int i_12_;
					synchronized (this) {
						if (anInt758 == anInt763) {
							if (aBool742)
								break;
							try {
								this.wait();
							} catch (InterruptedException interruptedexception) {
								/* empty */
							}
						}
						if (anInt758 < anInt763)
							i = -anInt763 + 5000;
						else
							i = -anInt763 + anInt758;
						i_12_ = anInt763;
					}
					if (i > 0) {
						try {
							anOutputStream751.write(aByteArray745, i_12_, i);
						} catch (IOException ioexception) {
							aBool740 = true;
						}
						anInt763 = (i + anInt763) % 5000;
						try {
							if (anInt763 == anInt758)
								anOutputStream751.flush();
						} catch (IOException ioexception) {
							aBool740 = true;
						}
					}
				}
				try {
					if (anInputStream753 != null)
						anInputStream753.close();
					if (anOutputStream751 != null)
						anOutputStream751.close();
					if (aSocket743 != null)
						aSocket743.close();
				} catch (IOException ioexception) {
					/* empty */
				}
				aByteArray745 = null;
			} catch (Exception exception) {
				Class38_Sub20_Sub2.method813(exception, null, 95);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "b.run(" + ')');
		}
	}

	final void method292(int i) {
		try {
			if (!aBool742) {
				synchronized (this) {
					aBool742 = true;
					notifyAll();
				}
				if (aClass65_754 != null) {
					while (aClass65_754.anInt1368 == 0)
						Canvas_Sub1.method809(1L, -27166);
					if (aClass65_754.anInt1368 == 1)
						try {
							((Thread) aClass65_754.anObject1365).join();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
				}
				aClass65_754 = null;
				int i_13_ = -82 / ((i - 23) / 44);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "b.A(" + i + ')');
		}
	}

	static final boolean method293(int i) {
		try {
			try {
				if (Class38_Sub1.anInt1741 == 2) {
					if (Class58.aClass38_Sub24_1285 == null) {
						Class58.aClass38_Sub24_1285 = Class38_Sub24.method781(Class38_Sub20_Sub8.aClass17_2872, Class13.anInt247, Class61.anInt1335);
						if (Class58.aClass38_Sub24_1285 == null)
							return false;
					}
					if (RuntimeException_Sub1.aClass79_3279 == null)
						RuntimeException_Sub1.aClass79_3279 = new Class79(Class11.aClass17_213, Class38_Sub1.aClass17_1735);
					if (Class35.aClass38_Sub10_Sub1_849.method847(22050, Sequence.aClass17_2738, RuntimeException_Sub1.aClass79_3279, Class58.aClass38_Sub24_1285, 10599)) {
						Class35.aClass38_Sub10_Sub1_849.method868(-24016);
						Class35.aClass38_Sub10_Sub1_849.method840(-19402, Class38_Sub20_Sub14.anInt3039);
						Class35.aClass38_Sub10_Sub1_849.method836(21186, Class38_Sub20_Sub13.aBool3017, Class58.aClass38_Sub24_1285);
						RuntimeException_Sub1.aClass79_3279 = null;
						Class38_Sub1.anInt1741 = 0;
						Class58.aClass38_Sub24_1285 = null;
						Class38_Sub20_Sub8.aClass17_2872 = null;
						return true;
					}
				}
				if (i < 42)
					Class31.method287((byte) -40);
			} catch (Exception exception) {
				exception.printStackTrace();
				Class35.aClass38_Sub10_Sub1_849.method863(21828);
				Class58.aClass38_Sub24_1285 = null;
				Class38_Sub20_Sub8.aClass17_2872 = null;
				RuntimeException_Sub1.aClass79_3279 = null;
				Class38_Sub1.anInt1741 = 0;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "b.E(" + i + ')');
		}
	}

	Class31(Socket socket, Class56 class56) throws IOException {
		try {
			aClass56_746 = class56;
			aSocket743 = socket;
			aSocket743.setSoTimeout(30000);
			aSocket743.setTcpNoDelay(true);
			anInputStream753 = aSocket743.getInputStream();
			anOutputStream751 = aSocket743.getOutputStream();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "b.<init>(" + (socket != null ? "{...}" : "null") + ',' + (class56 != null ? "{...}" : "null") + ')');
		}
	}
}
