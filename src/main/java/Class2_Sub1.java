/* Class2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.Socket;

final class Class2_Sub1 extends Class2 implements ImageProducer, ImageObserver {
	private ColorModel aColorModel1990;
	static int anInt1996 = 0;
	private static RSString aClass19_1997 = RSString.createRSString("You can(Wt add yourself to your own ignore list");
	static RSString aClass19_2002;
	static int anInt2003;
	static int[] anIntArray2004;
	private ImageConsumer anImageConsumer2005;
	static RSString aClass19_2006;
	static int anInt2008;
	static RSString aClass19_2009;
	static RSString aClass19_2010;
	private static RSString aClass19_2011 = RSString.createRSString("Loaded config");
	private static RSString aClass19_2012;
	static RSString aClass19_2015;

	static final void method648(int i) {
		try {
			try {
				if (Class9.anInt154 == 0) {
					if (Client.worldConnection != null) {
						Client.worldConnection.method292(i ^ ~0x3011);
						Client.worldConnection = null;
					}
					Class38_Sub12.anInt2118 = 0;
					Class55.aClass65_1213 = null;
					Client.errorPinging = false;
					Class9.anInt154 = 1;
				}
				if (Class9.anInt154 == 1) {
					if (Class55.aClass65_1213 == null)
						Class55.aClass65_1213 = Class38_Sub4.aClass56_1798.method436(Class26.aString611, SceneModel.worldPort, 2);
					if (Class55.aClass65_1213.anInt1368 == 2)
						throw new IOException();
					if (Class55.aClass65_1213.anInt1368 == 1) {
						Client.worldConnection = new Class31((Socket) Class55.aClass65_1213.anObject1365, Class38_Sub4.aClass56_1798);
						Class55.aClass65_1213 = null;
						Class9.anInt154 = 2;
					}
				}
				if (i != -12367)
					Class2_Sub1.aClass19_2002 = null;
				if (Class9.anInt154 == 2) {
					long l = Class38_Sub1.aLong1737 = Class51.aClass19_1135.method162(i ^ ~0x304e);
					int i_0_ = (int) (l >> -866339952 & 0x1fL);
					((RS2Buffer) Client.outputBuffer).pos = 0;
					Client.outputBuffer.putByte(14);
					Client.outputBuffer.putByte(i_0_);
					Client.worldConnection.write(((RS2Buffer) Client.outputBuffer).buffer, 2, 0, (byte) 121);
					Class9.anInt154 = 3;
					((RS2Buffer) Class15.inputStream).pos = 0;
				}
				if (Class9.anInt154 == 3) {
					if (Class38_Sub6.aClass77_1857 != null)
						Class38_Sub6.aClass77_1857.method552(true);
					if (Class38_Sub7.aClass77_2025 != null)
						Class38_Sub7.aClass77_2025.method552(true);
					int i_1_ = Client.worldConnection.method286(i ^ ~0x3312);
					if (Class38_Sub6.aClass77_1857 != null)
						Class38_Sub6.aClass77_1857.method552(true);
					if (Class38_Sub7.aClass77_2025 != null)
						Class38_Sub7.aClass77_2025.method552(true);
					if (i_1_ != 0) {
						RS2Buffer.method763(i_1_, -9034);
						return;
					}
					((RS2Buffer) Class15.inputStream).pos = 0;
					Class9.anInt154 = 4;
				}
				if (Class9.anInt154 == 4) {
					if (((RS2Buffer) Class15.inputStream).pos < 8) {
						int i_2_ = Client.worldConnection.method291((byte) 116);
						if (i_2_ > -((RS2Buffer) Class15.inputStream).pos + 8)
							i_2_ = 8 - ((RS2Buffer) Class15.inputStream).pos;
						if (i_2_ > 0) {
							Client.worldConnection.method290(113, ((RS2Buffer) Class15.inputStream).pos, ((RS2Buffer) Class15.inputStream).buffer, i_2_);
							((RS2Buffer) Class15.inputStream).pos += i_2_;
						}
					}
					if (((RS2Buffer) Class15.inputStream).pos == 8) {
						((RS2Buffer) Class15.inputStream).pos = 0;
						Class5.aLong94 = Class15.inputStream.method748(-105);
						Class9.anInt154 = 5;
					}
				}
				if (Class9.anInt154 == 5) {
					((RS2Buffer) Client.outputBuffer).pos = 0;
					int[] is = new int[4];
					is[2] = (int) (Class5.aLong94 >> -109279264);
					is[1] = (int) (Math.random() * 9.9999999E7);
					is[0] = (int) (Math.random() * 9.9999999E7);
					is[3] = (int) Class5.aLong94;
					Client.outputBuffer.putByte(10);
					Client.outputBuffer.putInt(is[0]);
					Client.outputBuffer.putInt(is[1]);
					Client.outputBuffer.putInt(is[2]);
					Client.outputBuffer.putInt(is[3]);
					Client.outputBuffer.method762(Class51.aClass19_1135.method162(0), (byte) 56);
					Client.outputBuffer.method742(Class51.aClass19_1122, (byte) -114);
					Client.outputBuffer.method773(true, Class26.aBigInteger599, Class78.aBigInteger1553);
					((RS2Buffer) Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843).pos = 0;
					if (Class48.anInt1069 == 40)
						Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putByte(18);
					else
						Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putByte(16);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putByte(((RS2Buffer) Client.outputBuffer).pos + 93);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(468);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putByte(Class38_Sub4.aBool1811 ? 1 : 0);
					Node.method332(Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843, (byte) -83);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class38_Sub14.aClass17_Sub1_2147).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class38_Sub11.aClass17_Sub1_2103).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class78.aClass17_Sub1_1555).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) RS2Buffer.aClass17_Sub1_2359).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class33.aClass17_Sub1_784).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class48.aClass17_Sub1_1070).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class67.aClass17_Sub1_1382).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class30.aClass17_Sub1_729).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class17.aClass17_Sub1_376).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Applet_Sub1.aClass17_Sub1_3639).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class52.aClass17_Sub1_1151).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class38_Sub1.aClass17_Sub1_1746).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class38_Sub1.aClass17_Sub1_1724).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class13.aClass17_Sub1_237).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Class5.aClass17_Sub1_114).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.putInt(((Class17) Node.aClass17_Sub1_891).anInt369);
					Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843.method764(0, -25154, ((RS2Buffer) Client.outputBuffer).pos, ((RS2Buffer) Client.outputBuffer).buffer);
					Client.worldConnection.write(((RS2Buffer) Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843).buffer, ((RS2Buffer) Class38_Sub20_Sub7.aClass38_Sub23_Sub1_2843).pos, 0, (byte) 126);
					Client.outputBuffer.method792(is, (byte) -46);
					for (int i_3_ = 0; i_3_ < 4; i_3_++)
						is[i_3_] += 50;
					Class15.inputStream.method792(is, (byte) -46);
					Class9.anInt154 = 6;
				}
				if (Class9.anInt154 == 6 && Client.worldConnection.method291((byte) 127) > 0) {
					int i_4_ = Client.worldConnection.method286(860);
					if (i_4_ == 21 && Class48.anInt1069 == 20)
						Class9.anInt154 = 7;
					else if (i_4_ != 2) {
						if (i_4_ == 15 && Class48.anInt1069 == 40) {
							ObjectDefinition.method801((byte) 104);
							return;
						}
						if (i_4_ == 23 && Class40.anInt918 < 1) {
							Class9.anInt154 = 0;
							Class40.anInt918++;
						} else {
							RS2Buffer.method763(i_4_, i ^ 0x1307);
							return;
						}
					} else
						Class9.anInt154 = 9;
				}
				if (Class9.anInt154 == 7 && Client.worldConnection.method291((byte) 127) > 0) {
					Class74.anInt1451 = Client.worldConnection.method286(i + 13227) * 60 + 180;
					Class9.anInt154 = 8;
				}
				if (Class9.anInt154 == 8) {
					Class38_Sub12.anInt2118 = 0;
					Class77.method551(false, Class73_Sub2.aClass19_2304, Class9.method43(new RSString[] { RuntimeException_Sub1.method1098(Class74.anInt1451 / 60, 0), Class21.aClass19_505 }, (byte) -20), Class38_Sub10_Sub1.aClass19_2648);
					if (--Class74.anInt1451 <= 0)
						Class9.anInt154 = 0;
				} else {
					if (Class9.anInt154 == 9 && Client.worldConnection.method291((byte) 116) >= 8) {
						Class32.anInt772 = Client.worldConnection.method286(i + 13227);
						Client.flagged = Client.worldConnection.method286(860) == 1;
						Class38_Sub9.anInt2067 = Client.worldConnection.method286(i ^ ~0x3312);
						Class38_Sub9.anInt2067 <<= 8;
						Class38_Sub9.anInt2067 += Client.worldConnection.method286(i + 13227);
						Class15.anInt272 = Client.worldConnection.method286(860);
						Client.worldConnection.method290(123, 0, ((RS2Buffer) Class15.inputStream).buffer, 1);
						((RS2Buffer) Class15.inputStream).pos = 0;
						Class23.anInt546 = Class15.inputStream.getOpcode();
						Client.worldConnection.method290(127, 0, ((RS2Buffer) Class15.inputStream).buffer, 2);
						((RS2Buffer) Class15.inputStream).pos = 0;
						Entity.anInt3446 = Class15.inputStream.getUShort();
						Class9.anInt154 = 10;
					}
					if (Class9.anInt154 == 10) {
						if (Client.worldConnection.method291((byte) 127) >= Entity.anInt3446) {
							((RS2Buffer) Class15.inputStream).pos = 0;
							Client.worldConnection.method290(114, 0, ((RS2Buffer) Class15.inputStream).buffer, Entity.anInt3446);
							Projectile.method1169(0);
							ItemDefinition.anInt2801 = -1;
							Class38_Sub20_Sub17.sendMapRegion(false, (byte) 87);
							Class23.anInt546 = -1;
						}
					} else {
						Class38_Sub12.anInt2118++;
						if (Class38_Sub12.anInt2118 > 2000)
							if (Class40.anInt918 < 1) {
								if (Class38_Sub12.port == SceneModel.worldPort)
									Class38_Sub12.port = NodeSub.js5Port;
								else
									Class38_Sub12.port = SceneModel.worldPort;
								Class9.anInt154 = 0;
								Class40.anInt918++;
							} else
								RS2Buffer.method763(-3, -9034);
					}
				}
			} catch (IOException ioexception) {
				if (Class40.anInt918 < 1) {
					Class40.anInt918++;
					if (SceneModel.worldPort == Class38_Sub12.port)
						Class38_Sub12.port = NodeSub.js5Port;
					else
						Class38_Sub12.port = SceneModel.worldPort;
					Class9.anInt154 = 0;
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
						i_7_ += Class15.inputStream.getUByte() << 38121096;
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

	@Override
	public final synchronized boolean isConsumer(ImageConsumer imageconsumer) {
		try {
			if (anImageConsumer2005 != imageconsumer)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "g.isConsumer(" + (imageconsumer != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final void method13(Graphics graphics, int i, int i_9_, int i_10_) {
		try {
			method653(true);
			graphics.drawImage(((Class2) this).anImage25, i_10_, i_9_, this);
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
				anImageConsumer2005.setPixels(i, i_14_, i_11_, i_12_, aColorModel1990, ((Class2) this).anIntArray28, ((Class2) this).anInt24 * i_14_ + i, ((Class2) this).anInt24);
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

	public Class2_Sub1() {
		/* empty */
	}

	private static final void method652(byte i, Player class38_sub20_sub3_sub7_sub2, int i_20_, int i_21_) {
		do {
			try {
				if ((i_21_ & 0x400) != 0) {
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3477 = Class15.inputStream.method740((byte) 116);
					int i_22_ = Class15.inputStream.method746(-93);
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3450 = Class45.anInt1016 + (i_22_ & 0xffff);
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3473 = i_22_ >> -140071696;
					if (((Entity) class38_sub20_sub3_sub7_sub2).anInt3477 == 65535)
						((Entity) class38_sub20_sub3_sub7_sub2).anInt3477 = -1;
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3447 = 0;
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3500 = 0;
					if (Class45.anInt1016 < ((Entity) class38_sub20_sub3_sub7_sub2).anInt3450)
						((Entity) class38_sub20_sub3_sub7_sub2).anInt3500 = -1;
				}
				if ((i_21_ & 0x20) != 0) {
					int i_23_ = Class15.inputStream.getUByteC();
					int i_24_ = Class15.inputStream.getUByte();
					class38_sub20_sub3_sub7_sub2.addHit(Class45.anInt1016, i_24_, i_23_);
					((Entity) class38_sub20_sub3_sub7_sub2).hitCycle = Class45.anInt1016 + 300;
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3501 = Class15.inputStream.method756(13285);
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3484 = Class15.inputStream.getUByteC();
				}
				if ((i_21_ & 0x4) != 0) {
					int i_25_ = Class15.inputStream.getUShort();
					int i_26_ = Class15.inputStream.method741(126);
					if (i_25_ == 65535)
						i_25_ = -1;
					Class48.method390((byte) -69, i_26_, class38_sub20_sub3_sub7_sub2, i_25_);
				}
				if ((i_21_ & 0x10) != 0) {
					int i_27_ = Class15.inputStream.method740((byte) 126);
					int i_28_ = Class15.inputStream.getUByte();
					int i_29_ = Class15.inputStream.method756(13285);
					int i_30_ = ((RS2Buffer) Class15.inputStream).pos;
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
							((Entity) class38_sub20_sub3_sub7_sub2).aClass19_3467 = class19.method178(-91);
							((Entity) class38_sub20_sub3_sub7_sub2).anInt3452 = 150;
							((Entity) class38_sub20_sub3_sub7_sub2).anInt3499 = i_27_ >> -801276888;
							((Entity) class38_sub20_sub3_sub7_sub2).anInt3495 = i_27_ & 0xff;
							if (i_28_ != 2 && i_28_ != 3) {
								if (i_28_ != 1)
									Class62.method464((byte) 98, class19, 2, class38_sub20_sub3_sub7_sub2.name);
								else
									Class62.method464((byte) 98, class19, 1, Class9.method43(new RSString[] { Class38_Sub20_Sub10.aClass19_2911, class38_sub20_sub3_sub7_sub2.name }, (byte) -20));
							} else
								Class62.method464((byte) 98, class19, 1, Class9.method43(new RSString[] { Class32.aClass19_775, class38_sub20_sub3_sub7_sub2.name }, (byte) -20));
						}
					}
					((RS2Buffer) Class15.inputStream).pos = i_29_ + i_30_;
				}
				if ((i_21_ & 0x200) != 0) {
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3456 = Class15.inputStream.method741(66);
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3463 = Class15.inputStream.method741(80);
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3436 = Class15.inputStream.getUByte();
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3486 = Class15.inputStream.method741(88);
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3476 = Class15.inputStream.method740((byte) 119) + Class45.anInt1016;
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3470 = Class15.inputStream.getUShort() + Class45.anInt1016;
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3497 = Class15.inputStream.getUByte();
					((Entity) class38_sub20_sub3_sub7_sub2).walkQueueLocationIndex = 1;
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3494 = 0;
				}
				if ((i_21_ & 0x100) != 0) {
					int i_32_ = Class15.inputStream.method756(13285);
					int i_33_ = Class15.inputStream.method741(102);
					class38_sub20_sub3_sub7_sub2.addHit(Class45.anInt1016, i_33_, i_32_);
					((Entity) class38_sub20_sub3_sub7_sub2).hitCycle = Class45.anInt1016 + 300;
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3501 = Class15.inputStream.getUByte();
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3484 = Class15.inputStream.getUByteC();
				}
				if ((i_21_ & 0x2) != 0) {
					((Entity) class38_sub20_sub3_sub7_sub2).aClass19_3467 = Class15.inputStream.getUShort(1347418632);
					if (((Entity) class38_sub20_sub3_sub7_sub2).aClass19_3467.method163(54, 0) == 126) {
						((Entity) class38_sub20_sub3_sub7_sub2).aClass19_3467 = ((Entity) class38_sub20_sub3_sub7_sub2).aClass19_3467.method171((byte) -115, 1);
						Class62.method464((byte) 98, ((Entity) class38_sub20_sub3_sub7_sub2).aClass19_3467, 2, class38_sub20_sub3_sub7_sub2.name);
					} else if (class38_sub20_sub3_sub7_sub2 == Client.myPlayer)
						Class62.method464((byte) 98, ((Entity) class38_sub20_sub3_sub7_sub2).aClass19_3467, 2, class38_sub20_sub3_sub7_sub2.name);
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3452 = 150;
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3495 = 0;
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3499 = 0;
				}
				if (i < 42)
					Class2_Sub1.method650(-69);
				if ((i_21_ & 0x8) != 0) {
					((Entity) class38_sub20_sub3_sub7_sub2).anInt3502 = Class15.inputStream.method740((byte) -95);
					if (((Entity) class38_sub20_sub3_sub7_sub2).anInt3502 == 65535)
						((Entity) class38_sub20_sub3_sub7_sub2).anInt3502 = -1;
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
				((Entity) class38_sub20_sub3_sub7_sub2).anInt3487 = Class15.inputStream.method740((byte) -34);
				((Entity) class38_sub20_sub3_sub7_sub2).anInt3443 = Class15.inputStream.getULEShort();
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "g.H(" + i + ',' + (class38_sub20_sub3_sub7_sub2 != null ? "{...}" : "null") + ',' + i_20_ + ',' + i_21_ + ')');
			}
			break;
		} while (false);
	}

	private final synchronized void method653(boolean bool) {
		try {
			if (bool != true)
				Class2_Sub1.aClass19_2006 = null;
			if (anImageConsumer2005 != null) {
				anImageConsumer2005.setPixels(0, 0, ((Class2) this).anInt24, ((Class2) this).anInt26, aColorModel1990, ((Class2) this).anIntArray28, 0, ((Class2) this).anInt24);
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
				((Class2) this).anIntArray28 = new int[i_36_ * i_35_ + 1];
				((Class2) this).anInt24 = i_36_;
				((Class2) this).anInt26 = i_35_;
				aColorModel1990 = new DirectColorModel(32, 16711680, 65280, 255);
				((Class2) this).anImage25 = component.createImage(this);
				method653(true);
				component.prepareImage(((Class2) this).anImage25, this);
				method653(true);
				component.prepareImage(((Class2) this).anImage25, this);
				method653(true);
				component.prepareImage(((Class2) this).anImage25, this);
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
			imageconsumer.setDimensions(((Class2) this).anInt24, ((Class2) this).anInt26);
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
			graphics.drawImage(((Class2) this).anImage25, i, 0, this);
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

	static {
		Class2_Sub1.aClass19_2010 = Class2_Sub1.aClass19_2011;
		Class2_Sub1.aClass19_2006 = RSString.createRSString("::errortest");
		Class2_Sub1.aClass19_2002 = RSString.createRSString("<)4col>");
		Class2_Sub1.aClass19_2015 = Class2_Sub1.aClass19_1997;
		Class2_Sub1.aClass19_2012 = RSString.createRSString("and choose the (Wcreate account(W");
		Class2_Sub1.aClass19_2009 = Class2_Sub1.aClass19_2012;
	}
}
