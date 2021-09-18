/* Class2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import java.net.Socket;

final class Class2_Sub1 extends Class2 implements ImageProducer, ImageObserver {
	static int anInt1996 = 0;
	static RSString aClass19_2002;
	static int anInt2003;
	static int[] anIntArray2004;
	static RSString aClass19_2006;
	static int anInt2008;
	static RSString aClass19_2009;
	static RSString aClass19_2010;
	static RSString aClass19_2015;
	private static RSString aClass19_1997 = RSString.createRSString("You can(Wt add yourself to your own ignore list");
	private static RSString aClass19_2011 = RSString.createRSString("Loaded config");
	private static RSString aClass19_2012;

	static {
		Class2_Sub1.aClass19_2010 = Class2_Sub1.aClass19_2011;
		Class2_Sub1.aClass19_2006 = RSString.createRSString("::errortest");
		Class2_Sub1.aClass19_2002 = RSString.createRSString("<)4col>");
		Class2_Sub1.aClass19_2015 = Class2_Sub1.aClass19_1997;
		Class2_Sub1.aClass19_2012 = RSString.createRSString("and choose the (Wcreate account(W");
		Class2_Sub1.aClass19_2009 = Class2_Sub1.aClass19_2012;
	}

	private ColorModel aColorModel1990;
	private ImageConsumer anImageConsumer2005;

	public Class2_Sub1() {
		/* empty */
	}

	static final void method648(int i) {
		try {
			try {
				if (Class9.loginState == 0) {
					if (client.worldConnection != null) {
						client.worldConnection.method292(i ^ ~0x3011);
						client.worldConnection = null;
					}
					Class38_Sub12.anInt2118 = 0;
					Class55.aClass65_1213 = null;
					client.errorPinging = false;
					Class9.loginState = 1;
				}
				if (Class9.loginState == 1) {
					if (Class55.aClass65_1213 == null)
						Class55.aClass65_1213 = Class38_Sub4.aClass56_1798.method436(Class26.aString611, SceneModel.worldPort, 2);
					if (Class55.aClass65_1213.anInt1368 == 2)
						throw new IOException();
					if (Class55.aClass65_1213.anInt1368 == 1) {
						client.worldConnection = new Class31((Socket) Class55.aClass65_1213.anObject1365, Class38_Sub4.aClass56_1798);
						Class55.aClass65_1213 = null;
						Class9.loginState = 2;
					}
				}
				if (i != -12367)
					Class2_Sub1.aClass19_2002 = null;
				if (Class9.loginState == 2) {
					long l = Class38_Sub1.aLong1737 = Class51.username.method162(i ^ ~0x304e);
					int nameHash = (int) (l >> 16 & 0x1fL);
					client.secureBuffer.pos = 0;
					client.secureBuffer.putByte(14);
					client.secureBuffer.putByte(nameHash);
					client.worldConnection.write(client.secureBuffer.buffer, 2, (byte) 121);
					Class9.loginState = 3;
					Class15.inputStream.pos = 0;
				}
				if (Class9.loginState == 3) {
					if (Class38_Sub6.aClass77_1857 != null)
						Class38_Sub6.aClass77_1857.method552();
					if (Class38_Sub7.aClass77_2025 != null)
						Class38_Sub7.aClass77_2025.method552();
					int handshakeResponse = client.worldConnection.read(i ^ -13075);
					if (Class38_Sub6.aClass77_1857 != null)
						Class38_Sub6.aClass77_1857.method552();
					if (Class38_Sub7.aClass77_2025 != null)
						Class38_Sub7.aClass77_2025.method552();
					if (handshakeResponse != 0) {
						RS2Buffer.method763(handshakeResponse, -9034);
						return;
					}
					Class15.inputStream.pos = 0;
					Class9.loginState = 4;
				}
				if (Class9.loginState == 4) {
					if (Class15.inputStream.pos < 8) {
						int i_2_ = client.worldConnection.avaliable((byte) 116);
						if (i_2_ > -Class15.inputStream.pos + 8)
							i_2_ = 8 - Class15.inputStream.pos;
						if (i_2_ > 0) {
							client.worldConnection.method290(113, Class15.inputStream.pos, Class15.inputStream.buffer, i_2_);
							Class15.inputStream.pos += i_2_;
						}
					}
					if (Class15.inputStream.pos == 8) {
						Class15.inputStream.pos = 0;
						Class5.sessionKey = Class15.inputStream.readLong();
						System.out.println("Session Key " + Class5.sessionKey);
						Class9.loginState = 5;
					}
				}
				if (Class9.loginState == 5) {
					client.secureBuffer.pos = 0;
					int[] isaacKeys = new int[4];
					isaacKeys[0] = (int) (Math.random() * 9.9999999E7);
					isaacKeys[1] = (int) (Math.random() * 9.9999999E7);
					isaacKeys[2] = (int) (Class5.sessionKey >> 32);
					isaacKeys[3] = (int) Class5.sessionKey;
					client.secureBuffer.putByte(10);
					client.secureBuffer.putInt(isaacKeys[0]);
					client.secureBuffer.putInt(isaacKeys[1]);
					client.secureBuffer.putInt(isaacKeys[2]);
					client.secureBuffer.putInt(isaacKeys[3]);
					client.secureBuffer.writeLong(Class51.username.method162(0));
					client.secureBuffer.writeString(Class51.password, (byte) -114);
					client.secureBuffer.encryptRSA(true, Class26.aBigInteger599, Class78.aBigInteger1553);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.pos = 0;
					if (Class48.anInt1069 == 40)
						Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putByte(18);
					else
						Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putByte(16);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putByte(client.secureBuffer.pos + 93);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(468);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putByte(Class38_Sub4.aBool1811 ? 1 : 0);
					Node.writeUID(Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class38_Sub14.indexFrames.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class38_Sub11.indexFramemaps.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class78.indexConfigs.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(RS2Buffer.indexWidgets.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class33.soundEffects.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class48.indexMaps.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class67.indexTrack1.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class30.indexModels.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class17.indexSprites.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Applet_Sub1.indexTextures.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class52.indexBinary.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class38_Sub1.indexTrack2.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class38_Sub1.indexScripts.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class13.indexFonts.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Class5.indexVarbits.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(Node.indexInstruments.crc);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putBytes(client.secureBuffer.pos, client.secureBuffer.buffer);
					client.worldConnection.write(Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.buffer, Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.pos, (byte) 126);
					client.secureBuffer.method792(isaacKeys, (byte) -46);
					for (int i_3_ = 0; i_3_ < 4; i_3_++)
						isaacKeys[i_3_] += 50;
					Class15.inputStream.method792(isaacKeys, (byte) -46);
					Class9.loginState = 6;
				}
				if (Class9.loginState == 6 && client.worldConnection.avaliable((byte) 127) > 0) {
					int i_4_ = client.worldConnection.read(860);
					if (i_4_ == 21 && Class48.anInt1069 == 20)
						Class9.loginState = 7;
					else if (i_4_ != 2) {
						if (i_4_ == 15 && Class48.anInt1069 == 40) {
							ObjectDefinition.method801((byte) 104);
							return;
						}
						if (i_4_ == 23 && Class40.anInt918 < 1) {
							Class9.loginState = 0;
							Class40.anInt918++;
						} else {
							RS2Buffer.method763(i_4_, i ^ 0x1307);
							return;
						}
					} else
						Class9.loginState = 9;
				}
				if (Class9.loginState == 7 && client.worldConnection.avaliable((byte) 127) > 0) {
					Class74.anInt1451 = client.worldConnection.read(i + 13227) * 60 + 180;
					Class9.loginState = 8;
				}
				if (Class9.loginState == 8) {
					Class38_Sub12.anInt2118 = 0;
					Class77.method551(false, Class73_Sub2.aClass19_2304, Class9.method43(new RSString[] { RuntimeException_Sub1.method1098(Class74.anInt1451 / 60, 0), Class21.aClass19_505 }, (byte) -20), Class38_Sub10_Sub1.aClass19_2648);
					if (--Class74.anInt1451 <= 0)
						Class9.loginState = 0;
				} else {
					if (Class9.loginState == 9 && client.worldConnection.avaliable((byte) 116) >= 8) {
						Class32.anInt772 = client.worldConnection.read(i + 13227);
						client.flagged = client.worldConnection.read(860) == 1;
						Class38_Sub9.anInt2067 = client.worldConnection.read(i ^ ~0x3312);
						Class38_Sub9.anInt2067 <<= 8;
						Class38_Sub9.anInt2067 += client.worldConnection.read(i + 13227);
						Class15.anInt272 = client.worldConnection.read(860);
						client.worldConnection.method290(123, 0, Class15.inputStream.buffer, 1);
						Class15.inputStream.pos = 0;
						Class23.packetId = Class15.inputStream.getOpcode();
						client.worldConnection.method290(127, 0, Class15.inputStream.buffer, 2);
						Class15.inputStream.pos = 0;
						Entity.anInt3446 = Class15.inputStream.readUnsignedShortLE();
						Class9.loginState = 10;
					}
					if (Class9.loginState == 10) {
						if (client.worldConnection.avaliable((byte) 127) >= Entity.anInt3446) {
							Class15.inputStream.pos = 0;
							client.worldConnection.method290(114, 0, Class15.inputStream.buffer, Entity.anInt3446);
							Projectile.initializePlayer(0);
							ItemDefinition.anInt2801 = -1;
							Class38_Sub20_Sub17.sendMapRegion(false, (byte) 87);
							Class23.packetId = -1;
						}
					} else {
						Class38_Sub12.anInt2118++;
						if (Class38_Sub12.anInt2118 > 2000)
							if (Class40.anInt918 < 1) {
								/*if (Class38_Sub12.currentPort == SceneModel.worldPort)
									Class38_Sub12.currentPort = NodeSub.js5Port;
								else
									Class38_Sub12.currentPort = SceneModel.worldPort;*/
								Class9.loginState = 0;
								Class40.anInt918++;
							} else
								RS2Buffer.method763(-3, -9034);
					}
				}
			} catch (IOException ioexception) {
				if (Class40.anInt918 < 1) {
					Class40.anInt918++;
					/*if (SceneModel.worldPort == Class38_Sub12.currentPort)
						Class38_Sub12.currentPort = NodeSub.js5Port;
					else
						Class38_Sub12.currentPort = SceneModel.worldPort;*/
					Class9.loginState = 0;
				} else
					RS2Buffer.method763(-2, -9034);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.E(" + i + ')');
		}
	}

	static final void method649(int i) {
		do {
			try {
				for (int i_5_ = 0; Class38_Sub20_Sub15.anInt3064 > i_5_; i_5_++) {
					int i_6_ = ItemDefinition.anIntArray2797[i_5_];
					Player class38_sub20_sub3_sub7_sub2 = Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_6_];
					int i_7_ = Class15.inputStream.getUByte();
					if ((i_7_ & 0x80) != 0)
						i_7_ += Class15.inputStream.getUByte() << 8;
					Class2_Sub1.method652((byte) 93, class38_sub20_sub3_sub7_sub2, i_6_, i_7_);
				}
				if (i == 19135)
					break;
				Class2_Sub1.anIntArray2004 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "g.F(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method650(int i) {
		try {
			Class2_Sub1.aClass19_2006 = null;
			Class2_Sub1.aClass19_2011 = null;
			Class2_Sub1.aClass19_1997 = null;
			Class2_Sub1.anIntArray2004 = null;
			Class2_Sub1.aClass19_2012 = null;
			Class2_Sub1.aClass19_2015 = null;
			Class2_Sub1.aClass19_2010 = null;
			Class2_Sub1.aClass19_2009 = null;
			int i_8_ = -118 % ((-70 - i) / 53);
			Class2_Sub1.aClass19_2002 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.B(" + i + ')');
		}
	}

	private static final void method652(byte i, Player class38_sub20_sub3_sub7_sub2, int i_20_, int i_21_) {
		do {
			try {
				if ((i_21_ & 0x400) != 0) {
					class38_sub20_sub3_sub7_sub2.anInt3477 = Class15.inputStream.method740((byte) 116);
					int i_22_ = Class15.inputStream.method746(-93);
					class38_sub20_sub3_sub7_sub2.anInt3450 = Class45.anInt1016 + (i_22_ & 0xffff);
					class38_sub20_sub3_sub7_sub2.anInt3473 = i_22_ >> 16;
					if (class38_sub20_sub3_sub7_sub2.anInt3477 == 65535)
						class38_sub20_sub3_sub7_sub2.anInt3477 = -1;
					class38_sub20_sub3_sub7_sub2.anInt3447 = 0;
					class38_sub20_sub3_sub7_sub2.anInt3500 = 0;
					if (Class45.anInt1016 < class38_sub20_sub3_sub7_sub2.anInt3450)
						class38_sub20_sub3_sub7_sub2.anInt3500 = -1;
				}
				if ((i_21_ & 0x20) != 0) {
					int i_23_ = Class15.inputStream.getUByteC();
					int i_24_ = Class15.inputStream.getUByte();
					class38_sub20_sub3_sub7_sub2.addHit(Class45.anInt1016, i_24_, i_23_);
					class38_sub20_sub3_sub7_sub2.hitCycle = Class45.anInt1016 + 300;
					class38_sub20_sub3_sub7_sub2.anInt3501 = Class15.inputStream.method756(13285);
					class38_sub20_sub3_sub7_sub2.anInt3484 = Class15.inputStream.getUByteC();
				}
				if ((i_21_ & 0x4) != 0) {
					int i_25_ = Class15.inputStream.readUnsignedShortLE();
					int i_26_ = Class15.inputStream.method741(126);
					if (i_25_ == 65535)
						i_25_ = -1;
					Class48.method390((byte) -69, i_26_, class38_sub20_sub3_sub7_sub2, i_25_);
				}
				if ((i_21_ & 0x10) != 0) {
					int i_27_ = Class15.inputStream.method740((byte) 126);
					int i_28_ = Class15.inputStream.getUByte();
					int i_29_ = Class15.inputStream.method756(13285);
					int i_30_ = Class15.inputStream.pos;
					if (class38_sub20_sub3_sub7_sub2.name != null && class38_sub20_sub3_sub7_sub2.appearance != null) {
						boolean bool = false;
						long l = class38_sub20_sub3_sub7_sub2.name.method162(0);
						if (i_28_ <= 1)
							for (int i_31_ = 0; i_31_ < Class38_Sub20_Sub3_Sub2.anInt3250; i_31_++)
								if (l == Class5.aLongArray97[i_31_]) {
									bool = true;
									break;
								}
						if (!bool && Sequence.anInt2731 == 0) {
							Class38_Sub20_Sub12.aClass38_Sub23_2991.pos = 0;
							Class15.inputStream.method778(i_29_, 0, false, Class38_Sub20_Sub12.aClass38_Sub23_2991.buffer);
							Class38_Sub20_Sub12.aClass38_Sub23_2991.pos = 0;
							RSString class19 = Class38_Sub20_Sub9_Sub1.method1062(Class58.method443((byte) 33, Class38_Sub20_Sub12.aClass38_Sub23_2991).method161(97));
							class38_sub20_sub3_sub7_sub2.aClass19_3467 = class19.method178(-91);
							class38_sub20_sub3_sub7_sub2.anInt3452 = 150;
							class38_sub20_sub3_sub7_sub2.anInt3499 = i_27_ >> 8;
							class38_sub20_sub3_sub7_sub2.anInt3495 = i_27_ & 0xff;
							if (i_28_ != 2 && i_28_ != 3) {
								if (i_28_ != 1)
									Class62.method464((byte) 98, class19, 2, class38_sub20_sub3_sub7_sub2.name);
								else
									Class62.method464((byte) 98, class19, 1, Class9.method43(new RSString[] { Class38_Sub20_Sub10.aClass19_2911, class38_sub20_sub3_sub7_sub2.name }, (byte) -20));
							} else
								Class62.method464((byte) 98, class19, 1, Class9.method43(new RSString[] { Class32.aClass19_775, class38_sub20_sub3_sub7_sub2.name }, (byte) -20));
						}
					}
					Class15.inputStream.pos = i_29_ + i_30_;
				}
				if ((i_21_ & 0x200) != 0) {
					class38_sub20_sub3_sub7_sub2.anInt3456 = Class15.inputStream.method741(66);
					class38_sub20_sub3_sub7_sub2.anInt3463 = Class15.inputStream.method741(80);
					class38_sub20_sub3_sub7_sub2.anInt3436 = Class15.inputStream.getUByte();
					class38_sub20_sub3_sub7_sub2.anInt3486 = Class15.inputStream.method741(88);
					class38_sub20_sub3_sub7_sub2.anInt3476 = Class15.inputStream.method740((byte) 119) + Class45.anInt1016;
					class38_sub20_sub3_sub7_sub2.anInt3470 = Class15.inputStream.readUnsignedShortLE() + Class45.anInt1016;
					class38_sub20_sub3_sub7_sub2.anInt3497 = Class15.inputStream.getUByte();
					class38_sub20_sub3_sub7_sub2.walkQueueLocationIndex = 1;
					class38_sub20_sub3_sub7_sub2.anInt3494 = 0;
				}
				if ((i_21_ & 0x100) != 0) {
					int i_32_ = Class15.inputStream.method756(13285);
					int i_33_ = Class15.inputStream.method741(102);
					class38_sub20_sub3_sub7_sub2.addHit(Class45.anInt1016, i_33_, i_32_);
					class38_sub20_sub3_sub7_sub2.hitCycle = Class45.anInt1016 + 300;
					class38_sub20_sub3_sub7_sub2.anInt3501 = Class15.inputStream.getUByte();
					class38_sub20_sub3_sub7_sub2.anInt3484 = Class15.inputStream.getUByteC();
				}
				if ((i_21_ & 0x2) != 0) {
					class38_sub20_sub3_sub7_sub2.aClass19_3467 = Class15.inputStream.readString(1347418632);
					if (class38_sub20_sub3_sub7_sub2.aClass19_3467.method163(54, 0) == 126) {
						class38_sub20_sub3_sub7_sub2.aClass19_3467 = class38_sub20_sub3_sub7_sub2.aClass19_3467.method171((byte) -115, 1);
						Class62.method464((byte) 98, class38_sub20_sub3_sub7_sub2.aClass19_3467, 2, class38_sub20_sub3_sub7_sub2.name);
					} else if (class38_sub20_sub3_sub7_sub2 == client.myPlayer)
						Class62.method464((byte) 98, class38_sub20_sub3_sub7_sub2.aClass19_3467, 2, class38_sub20_sub3_sub7_sub2.name);
					class38_sub20_sub3_sub7_sub2.anInt3452 = 150;
					class38_sub20_sub3_sub7_sub2.anInt3495 = 0;
					class38_sub20_sub3_sub7_sub2.anInt3499 = 0;
				}
				if (i < 42)
					Class2_Sub1.method650(-69);
				if ((i_21_ & 0x8) != 0) {
					class38_sub20_sub3_sub7_sub2.anInt3502 = Class15.inputStream.method740((byte) -95);
					if (class38_sub20_sub3_sub7_sub2.anInt3502 == 65535)
						class38_sub20_sub3_sub7_sub2.anInt3502 = -1;
				}
				if ((i_21_ & 0x40) != 0) {
					int i_34_ = Class15.inputStream.method756(13285);
					byte[] is = new byte[i_34_];
					RS2Buffer class38_sub23 = new RS2Buffer(is);
					Class15.inputStream.method760(is, 0, (byte) -110, i_34_);
					Class38_Sub20_Sub10.aClass38_Sub23Array2895[i_20_] = class38_sub23;
					class38_sub20_sub3_sub7_sub2.method1205((byte) 56, class38_sub23);
				}
				if ((i_21_ & 0x1) == 0)
					break;
				class38_sub20_sub3_sub7_sub2.anInt3487 = Class15.inputStream.method740((byte) -34);
				class38_sub20_sub3_sub7_sub2.anInt3443 = Class15.inputStream.getULEShort();
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "g.H(" + i + ',' + (class38_sub20_sub3_sub7_sub2 != null ? "{...}" : "null") + ',' + i_20_ + ',' + i_21_ + ')');
			}
			break;
		} while (false);
	}

	@Override
	public final synchronized boolean isConsumer(ImageConsumer imageconsumer) {
		try {
			return anImageConsumer2005 == imageconsumer;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.isConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final void method13(Graphics graphics, int i, int i_9_, int i_10_) {
		try {
			method653(true);
			graphics.drawImage(this.anImage25, i_10_, i_9_, this);
			if (i != 29504)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.C(" + (graphics != null ? "{...}" : "null") + ',' + i + ',' + i_9_ + ',' + i_10_ + ')');
		}
	}

	@Override
	public final synchronized void removeConsumer(ImageConsumer imageconsumer) {
		try {
			if (imageconsumer == anImageConsumer2005)
				anImageConsumer2005 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.removeConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')');
		}
	}

	private final synchronized void method651(int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		try {
			int i_15_ = 127 % ((i_13_ - 9) / 36);
			if (anImageConsumer2005 != null) {
				anImageConsumer2005.setPixels(i, i_14_, i_11_, i_12_, aColorModel1990, this.anIntArray28, this.anInt24 * i_14_ + i, this.anInt24);
				anImageConsumer2005.imageComplete(2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.G(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')');
		}
	}

	@Override
	public final boolean imageUpdate(Image image, int i, int i_16_, int i_17_, int i_18_, int i_19_) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.imageUpdate(" + (image != null ? "{...}" : "null") + ',' + i + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')');
		}
	}

	@Override
	public final void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
		/* empty */
	}

	private final synchronized void method653(boolean bool) {
		try {
			if (bool != true)
				Class2_Sub1.aClass19_2006 = null;
			if (anImageConsumer2005 != null) {
				anImageConsumer2005.setPixels(0, 0, this.anInt24, this.anInt26, aColorModel1990, this.anIntArray28, 0, this.anInt24);
				anImageConsumer2005.imageComplete(2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.D(" + bool + ')');
		}
	}

	@Override
	final void method15(int i, int i_35_, int i_36_, Component component) {
		do {
			try {
				this.anIntArray28 = new int[i_36_ * i_35_ + 1];
				this.anInt24 = i_36_;
				this.anInt26 = i_35_;
				aColorModel1990 = new DirectColorModel(32, 16711680, 65280, 255);
				this.anImage25 = component.createImage(this);
				method653(true);
				component.prepareImage(this.anImage25, this);
				method653(true);
				component.prepareImage(this.anImage25, this);
				method653(true);
				component.prepareImage(this.anImage25, this);
				method12((byte) 47);
				if (i <= -24)
					break;
				isConsumer(null);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "g.A(" + i + ',' + i_35_ + ',' + i_36_ + ',' + (component != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	@Override
	public final synchronized void addConsumer(ImageConsumer imageconsumer) {
		try {
			anImageConsumer2005 = imageconsumer;
			imageconsumer.setDimensions(this.anInt24, this.anInt26);
			imageconsumer.setProperties(null);
			imageconsumer.setColorModel(aColorModel1990);
			imageconsumer.setHints(14);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.addConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final void method17(int i, Graphics graphics, int i_37_, int i_38_, int i_39_, int i_40_) {
		try {
			method651(i_39_, i_37_, i_38_, 115, i_40_);
			Shape shape = graphics.getClip();
			graphics.clipRect(i_39_, i_40_, i_37_, i_38_);
			graphics.drawImage(this.anImage25, i, 0, this);
			graphics.setClip(shape);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.I(" + i + ',' + (graphics != null ? "{...}" : "null") + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ')');
		}
	}

	@Override
	public final void startProduction(ImageConsumer imageconsumer) {
		try {
			addConsumer(imageconsumer);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.startProduction(" + (imageconsumer != null ? "{...}" : "null") + ')');
		}
	}
}
