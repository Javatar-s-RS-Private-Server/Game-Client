package com.javatar.jagex;/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;
import java.awt.Graphics;
import java.net.Socket;

public final class Client extends Applet_Sub1 {
	static int anInt3641;
	static RSString aClass19_3643 = RSString.createRSString("Startseite auf (WSpielkonto wiederherstellen(W)3");
	static Class83 aClass83_3646;
	static int anInt3652;
	static Class38_Sub20_Sub9_Sub1_Sub1 aClass38_Sub20_Sub9_Sub1_Sub1_3656;
	static int logoutTimer = 0;
	static volatile int mouseIdleTime;
	static PacketBuffer outputBuffer = new PacketBuffer(5000);
	static int[] shakingCycle;
	static volatile int keyboardIdleTime = 0;
	static int crossState;
	static int crossIndex;
	static Player myPlayer;
	static int[][] wayPoints;
	static int[][] distanceValues;
	static int[] walkingQueueX;
	static int[] walkingQueueY;
	static int height;
	static Class74[] clippingHeights = new Class74[4];
	static int arbitraryDestination = 0;
	static int destX = 0;
	static int destY;
	static boolean[] heldKeys;
	static int currentBaseX;
	static int currentBaseY;
	static int redrawTimer = 0;
	static WidgetComponent atInventoryInterfaceType;
	static int cameraPacketDelay = 0;
	static boolean holdingArrowKeys;
	static boolean awtFocused;
	static RSString str_huffman = RSString.createRSString("huffman");
	static boolean windowFocused;
	static int lastMouseAction = 0;
	static long lastlastClickTime = 0L;
	static long lastClickTime = 0L;
	static Class40 mouseRecorder;
	static int lastCoordY;
	static int lastCoordX = 0;
	static int coordCounter;
	static boolean flagged = false;
	static int systemUpdateTime;
	protected static boolean errorPinging = false;
	static Class31 worldConnection;
	static int pingTimer;
	static Frame clientFrame;

	@Override
	final void method1209(int i) {
		try {
			Class45.anInt1016++;
			method1230(false);
			Class38_Sub20_Sub15.method1013(i - 1001);
			Class15.method83(true);
			Class42.method357(-7);
			Class38_Sub20_Sub13.method992(103);
			Class47.method384(-18075);
			if (Class4.aClass32_91 != null) {
				int i_0_ = Class4.aClass32_91.method297((byte) 12);
				Class52.anInt1145 = i_0_;
			}
			if (i == 1000) {
				if (Class48.anInt1069 == 0) {
					Class26.method218((byte) -92);
					Class75.method540(0);
				} else if (Class48.anInt1069 != 5) {
					if (Class48.anInt1069 != 10) {
						if (Class48.anInt1069 == 20) {
							Class38_Sub21.method713((byte) 93, this);
							Class2_Sub1.method648(i - 13367);
						} else if (Class48.anInt1069 == 25)
							Class43.method363((byte) -22);
					} else
						Class38_Sub21.method713((byte) 93, this);
				} else {
					Class38_Sub21.method713((byte) 93, this);
					Class26.method218((byte) -92);
					Class75.method540(0);
				}
				if (Class48.anInt1069 != 30) {
					if (Class48.anInt1069 == 40)
						Class2_Sub1.method648(-12367);
				} else
					Class51.method404((byte) -114);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "client.O(" + i + ')');
		}
	}

	public static void method1225(boolean bool) {
		do {
			try {
				Client.aClass83_3646 = null;
				Client.aClass19_3643 = null;
				Client.aClass38_Sub20_Sub9_Sub1_Sub1_3656 = null;
				if (!bool)
					break;
				Client.main(null);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "client.V(" + bool + ')');
			}
			break;
		} while (false);
	}

	@Override
	void method1214(int i) {
		try {
			Client.method1225(false);
			RSString.method142(i ^ 0x39);
			Applet_Sub1.method1222(false);
			Class73.method517((byte) -68);
			Class2.method14(-13532);
			Class40.method342(false);
			RS2Buffer.method729();
			Class31.method287((byte) -50);
			Class17_Sub1.method599((byte) -108);
			Class16.method98(i + 107);
			Class48.method389(i ^ 0x3);
			NPC.method1203((byte) -111);
			PacketBuffer.method786((byte) -93);
			SceneGraph.method262();
			Class74.method525(i ^ i);
			WidgetComponent.method638((byte) -126);
			Player.method1208((byte) -68);
			Class13.method71((byte) -78);
			Class14.method77((byte) 125);
			Class32.method294(1536);
			Class38_Sub9.method663((byte) 125);
			Class77.method559(true);
			Class20.method183(-10470);
			PlayerAppearance.method128(i - 5);
			Class38_Sub20_Sub4.method822(0);
			Entity.method1171(-1);
			Class38_Sub21.method711(i ^ 0x30);
			Sequence.method917((byte) -126);
			Class38_Sub8.method662(30079);
			Node.method334(i + 97);
			Class30.method281(-6);
			Class33.method304(104);
			Class83.method594((byte) 64);
			Class38_Sub20_Sub3_Sub1.method1054();
			Model.method1145();
			Class37.method323((byte) -84);
			RuntimeException_Sub1.method1095(5056);
			Class66.method475(102);
			Class38_Sub4.method624(101);
			Class3.method21((byte) 31);
			Class5.method30((byte) 111);
			SceneModel.method817((byte) -113);
			Class82.method587(64);
			Class43.method364((byte) -104);
			Class49.method397(i + 251);
			Class15.method85(0);
			Class1.method11();
			Class42.method359(false);
			Class78.method565(true);
			Class60.method456(false);
			Class10.method52(4);
			Class9.method45((byte) -116);
			Class47.method382(true);
			Class23.method201(16351);
			Class17.method105(66);
			Class38_Sub10_Sub1.method856(-15614);
			Class79.method569((byte) -123);
			Class80.method578((byte) -74);
			Class55.method427(i ^ 0x7c);
			Class4.method27((byte) 90);
			Class21.method192((byte) -33);
			Class64.method472(i ^ ~0x37);
			Class11.method57((byte) 124);
			Class26.method215(false);
			Class38_Sub20_Sub2.method816(112);
			Class44.method375((byte) 0);
			Class81.method582(0);
			Class50.method399(false);
			Class38_Sub20_Sub9.method969();
			NodeSub.method709(116);
			Class38_Sub20_Sub9_Sub4.method1185();
			Class38_Sub22.method719(false);
			Class70.method498();
			Class38_Sub10_Sub3.method942((byte) 123);
			Class38_Sub18.method700(-127);
			Class58.method442(i - 6);
			Class38_Sub20_Sub14.method1005(-101);
			Class38_Sub20_Sub8.method952(true);
			Class38_Sub20_Sub16.method1022(-119);
			ObjectDefinition.method800((byte) -110);
			ItemDefinition.method935((byte) 101);
			Class38_Sub20_Sub13.method993(-114);
			Class38_Sub20_Sub11.method979(-1799683504);
			Class38_Sub20_Sub17.method1036(0);
			Class38_Sub20_Sub15.method1008(128);
			Class38_Sub20_Sub7.method947(false);
			Class38_Sub20_Sub12.method988((byte) 12);
			Class38_Sub20_Sub9_Sub1.method1081();
			Class45.method379((byte) 11);
			Class38_Sub5.method632();
			Class53.method414((byte) 122);
			Class22.method198(-7798);
			Class72.method513(i + 9);
			Class75.method541(59);
			Class38_Sub3.method622((byte) -114);
			Class38_Sub1.method608(true);
			Class38_Sub20_Sub10.method977(22755);
			Class29.method275((byte) 116);
			Class62.method465(1);
			Class38_Sub19.method706(true);
			Class24.method205((byte) -121);
			Class61.method459(0);
			Class57.method440();
			Projectile.method1166((byte) -11);
			Class38_Sub20_Sub3_Sub5.method1163((byte) -115);
			Class38_Sub11.method674(true);
			Class38_Sub20_Sub3_Sub4.method1152(i ^ ~0x7d);
			Class38_Sub20_Sub3_Sub2.method1094(1654298567);
			Class38_Sub12.method676(2);
			Class76.method543(true);
			Canvas_Sub1.method812(-1);
			Class67.method480((byte) 54);
			Class73_Sub2.method717(true);
			Class2_Sub1.method650(-124);
			Class59.method450(true);
			Class28.method272(1);
			Class6.method34(-193);
			Class41.method345(i - 5);
			Class54.method424(-126);
			Class77_Sub2.method724();
			Class8.method40();
			Class25.method213(20629);
			Animation.method36();
			Class38_Sub14.method679(i ^ ~0x5);
			Class38_Sub17.method693(true);
			Class69.method491();
			Class35.method315((byte) -58);
			Class38_Sub2.method611((byte) 105);
			Class52.method406(2);
			Class38_Sub15.method685();
			Class34.method312();
			Class51.method405(17993);
			Class38_Sub7.method654(-71);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "client.B(" + i + ')');
		}
	}

	private final void method1226(int i) {
		do
			try {
				if (Client.anInt3652 >= 4) {
					method1224((byte) 53, "js5crc");
					Class48.anInt1069 = 1000;
				} else {
					if (i < -29) {
						if (Class38_Sub20_Sub15.anInt3067 >= 4)
							if (Class48.anInt1069 > 5) {
								Class76.anInt1499 = 3000;
								Class38_Sub20_Sub15.anInt3067 = 3;
							} else {
								method1224((byte) 53, "js5io");
								Class48.anInt1069 = 1000;
								break;
							}
						if (Class76.anInt1499-- <= 0) {
							try {
								if (Class47.anInt1046 == 0) {
									ObjectDefinition.aClass65_2461 = Class38_Sub4.aClass56_1798.method436(Class26.aString611, NodeSub.js5Port, 2);
									Class47.anInt1046++;
								}
								if (Class47.anInt1046 == 1) {
									if (ObjectDefinition.aClass65_2461.anInt1368 == 2) {
										method1228(1000, -1);
										break;
									}
									if (ObjectDefinition.aClass65_2461.anInt1368 == 1)
										Class47.anInt1046++;
								}
								if (Class47.anInt1046 == 2) {
									Class38_Sub20_Sub16.aClass31_3098 = new Class31((Socket) ObjectDefinition.aClass65_2461.anObject1365, Class38_Sub4.aClass56_1798);
									RS2Buffer class38_sub23 = new RS2Buffer(5);
									class38_sub23.putByte(15);
									class38_sub23.writeInt(468);// client
																// revision
									Class38_Sub20_Sub16.aClass31_3098.write(class38_sub23.buffer, 5, 0, (byte) 127);
									Class47.anInt1046++;
									RS2Buffer.aLong2396 = Class9.method48((byte) -60);
								}
								if (Class47.anInt1046 == 3)
									if (Class48.anInt1069 > 5 && Class38_Sub20_Sub16.aClass31_3098.method291((byte) 115) <= 0) {
										if (Class9.method48((byte) -32) + -RS2Buffer.aLong2396 > 30000L) {
											method1228(1000, -2);
											break;
										}
									} else {
										int i_1_ = Class38_Sub20_Sub16.aClass31_3098.method286(860);
										if (i_1_ != 0) {
											method1228(1000, i_1_);
											break;
										}
										Class47.anInt1046++;
									}
								if (Class47.anInt1046 != 4)
									break;
								Class50.method398(Class38_Sub20_Sub16.aClass31_3098, 71, Class48.anInt1069 > 20);
								Class47.anInt1046 = 0;
								Class38_Sub20_Sub16.aClass31_3098 = null;
								Class2.anInt35 = 0;
								ObjectDefinition.aClass65_2461 = null;
							} catch (java.io.IOException ioexception) {
								method1228(1000, -3);
							}
							break;
						}
						break;
					}
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "client.Q(" + i + ')');
			}
		while (false);
	}

	static final void method1227(int i, int i_2_, int i_3_, byte i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			if (i_3_ >= 1 && i_8_ >= 1 && i_3_ <= 102 && i_8_ <= 102) {
				if (Class38_Sub4.aBool1811 && Client.height != i_7_)
					return;
				int i_9_ = 0;
				if (i_2_ == 0)
					i_9_ = RuntimeException_Sub1.aClass27_3292.method256(i_7_, i_3_, i_8_);
				if (i_2_ == 1)
					i_9_ = RuntimeException_Sub1.aClass27_3292.method234(i_7_, i_3_, i_8_);
				int i_10_ = -1;
				if (i_2_ == 2)
					i_9_ = RuntimeException_Sub1.aClass27_3292.method236(i_7_, i_3_, i_8_);
				boolean bool = false;
				boolean bool_11_ = false;
				if (i_2_ == 3)
					i_9_ = RuntimeException_Sub1.aClass27_3292.method237(i_7_, i_3_, i_8_);
				if (i_9_ != 0) {
					i_10_ = i_9_ >> -696350002 & 0x7fff;
					int i_12_ = RuntimeException_Sub1.aClass27_3292.method224(i_7_, i_3_, i_8_, i_9_);
					int i_13_ = (i_12_ & 0xc4) >> 550167046;
					int i_14_ = i_12_ & 0x1f;
					if (i_2_ == 0) {
						RuntimeException_Sub1.aClass27_3292.method251(i_7_, i_3_, i_8_);
						ObjectDefinition class38_sub20_sub1 = Class80.method581(-126, i_10_);
						if (class38_sub20_sub1.anInt2482 != 0)
							Client.clippingHeights[i_7_].method528(i_3_, i_13_, i_14_, false, i_8_, class38_sub20_sub1.aBool2466);
					}
					if (i_2_ == 1)
						RuntimeException_Sub1.aClass27_3292.method227(i_7_, i_3_, i_8_);
					if (i_2_ == 2) {
						RuntimeException_Sub1.aClass27_3292.method231(i_7_, i_3_, i_8_);
						ObjectDefinition class38_sub20_sub1 = Class80.method581(64, i_10_);
						if (class38_sub20_sub1.anInt2469 + i_3_ > 103 || i_8_ + class38_sub20_sub1.anInt2469 > 103 || class38_sub20_sub1.anInt2480 + i_3_ > 103 || i_8_ + class38_sub20_sub1.anInt2480 > 103)
							return;
						if (class38_sub20_sub1.anInt2482 != 0)
							Client.clippingHeights[i_7_].method532(i_3_, class38_sub20_sub1.anInt2469, i_8_, 19661088, class38_sub20_sub1.aBool2466, i_13_, class38_sub20_sub1.anInt2480);
					}
					if (i_2_ == 3) {
						RuntimeException_Sub1.aClass27_3292.method239(i_7_, i_3_, i_8_);
						ObjectDefinition class38_sub20_sub1 = Class80.method581(95, i_10_);
						if (class38_sub20_sub1.anInt2482 == 1)
							Client.clippingHeights[i_7_].method523(i_8_, -31858, i_3_);
					}
				}
				if (i_5_ >= 0) {
					int i_15_ = i_7_;
					if (i_15_ < 3 && (Class82.aByteArrayArrayArray1648[1][i_3_][i_8_] & 0x2) == 2)
						i_15_++;
					RS2Buffer.method758(i_5_, i, RuntimeException_Sub1.aClass27_3292, i_8_, i_15_, i_3_, Client.clippingHeights[i_7_], i_7_, i_6_, 0);
				}
			}
			int i_16_ = 117 / ((i_4_ + 75) / 47);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "client.U(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')');
		}
	}

	@Override
	final void method1223(int i) {
		try {
			boolean bool = Class31.method293(89);
			if (bool && Class76.aBool1490 && WidgetComponent.aClass77_1857 != null)
				WidgetComponent.aClass77_1857.method557(true);
			if (Class15.aBool283) {
				Class38_Sub20_Sub3_Sub4.method1157(i ^ 0x8002, Class38_Sub3.aCanvas1783);
				Class61.method460(Class38_Sub3.aCanvas1783, i ^ ~0x2);
				if (Class4.aClass32_91 != null)
					Class4.aClass32_91.method295(Class38_Sub3.aCanvas1783, false);
				method1219(i ^ ~0x7331);
				Class9.method44(Class38_Sub3.aCanvas1783, -24436);
				Projectile.method1165(0, Class38_Sub3.aCanvas1783);
				if (Class4.aClass32_91 != null)
					Class4.aClass32_91.method299(96, Class38_Sub3.aCanvas1783);
			}
			if (i != 2)
				Client.aClass83_3646 = null;
			if (Class48.anInt1069 == 0)
				Class47.method385(Class51.aClass19_1127, 300, null, Class31.anInt748);
			else if (Class48.anInt1069 != 5) {
				if (Class48.anInt1069 == 10)
					RuntimeException_Sub1.method1096(Client.aClass38_Sub20_Sub9_Sub1_Sub1_3656, i + 460, Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093);
				else if (Class48.anInt1069 != 20) {
					if (Class48.anInt1069 != 25) {
						if (Class48.anInt1069 != 30) {
							if (Class48.anInt1069 == 40)
								Class53.method409(Class9.method43(new RSString[] { Class38_Sub10_Sub1.aClass19_2589, Class38_Sub4.aClass19_1820, Class23.aClass19_549 }, (byte) -20), 16777215, false);
						} else
							Class38_Sub20_Sub15.method1009((byte) 108);
					} else if (Class72.anInt1407 != 1) {
						if (Class72.anInt1407 != 2)
							Class53.method409(Class2.aClass19_39, i + 16777213, false);
						else {
							if (Class16.anInt320 > Class38_Sub9.anInt2059)
								Class38_Sub9.anInt2059 = Class16.anInt320;
							int i_17_ = (-Class16.anInt320 + Class38_Sub9.anInt2059) * 50 / Class38_Sub9.anInt2059 + 50;
							Class53.method409(Class9.method43(new RSString[] { Class2.aClass19_39, Entity.aClass19_3438, RuntimeException_Sub1.method1098(i_17_, 0), Class33.aClass19_792 }, (byte) -20), i ^ 0xfffffd, false);
						}
					} else {
						if (ObjectDefinition.anInt2455 < Class38_Sub9.anInt2055)
							ObjectDefinition.anInt2455 = Class38_Sub9.anInt2055;
						int i_18_ = (ObjectDefinition.anInt2455 - Class38_Sub9.anInt2055) * 50 / ObjectDefinition.anInt2455;
						Class53.method409(Class9.method43(new RSString[] { Class2.aClass19_39, Entity.aClass19_3438, RuntimeException_Sub1.method1098(i_18_, 0), Class33.aClass19_792 }, (byte) -20), 16777215, false);
					}
				} else
					RuntimeException_Sub1.method1096(Client.aClass38_Sub20_Sub9_Sub1_Sub1_3656, i + 460, Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093);
			} else
				RuntimeException_Sub1.method1096(Client.aClass38_Sub20_Sub9_Sub1_Sub1_3656, 462, Class38_Sub11.aClass38_Sub20_Sub9_Sub1_Sub1_2093);
			if (Class48.anInt1069 == 30 && Class38_Sub14.anInt2139 == 0 && !Class33.aBool781)
				try {
					Graphics graphics = Class38_Sub3.aCanvas1783.getGraphics();
					for (int i_19_ = 0; Class38_Sub20_Sub11.anInt2957 > i_19_; i_19_++)
						if (Class73_Sub2.aBoolArray2294[i_19_]) {
							Class38_Sub2.aClass2_1768.method17(0, graphics, Class22.anIntArray536[i_19_], Class64.anIntArray1356[i_19_], Class38_Sub8.anIntArray2045[i_19_], Class67.anIntArray1387[i_19_]);
							Class73_Sub2.aBoolArray2294[i_19_] = false;
						}
				} catch (Exception exception) {
					Class38_Sub3.aCanvas1783.repaint();
				}
			else if (Class48.anInt1069 > 0)
				try {
					Graphics graphics = Class38_Sub3.aCanvas1783.getGraphics();
					Class38_Sub2.aClass2_1768.method13(graphics, 29504, 0, 0);
					Class33.aBool781 = false;
					for (int i_20_ = 0; Class38_Sub20_Sub11.anInt2957 > i_20_; i_20_++)
						Class73_Sub2.aBoolArray2294[i_20_] = false;
				} catch (Exception exception) {
					Class38_Sub3.aCanvas1783.repaint();
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "client.E(" + i + ')');
		}
	}

	private final void method1228(int i, int i_21_) {
		do {
			try {
				/*if (SceneModel.worldPort != Class38_Sub12.port)
					Class38_Sub12.port = SceneModel.worldPort;
				else
					Class38_Sub12.port = NodeSub.js5Port;*/
				Class2.anInt35++;
				Class47.anInt1046 = 0;
				if (i != 1000)
					method1217(false);
				ObjectDefinition.aClass65_2461 = null;
				Class38_Sub20_Sub16.aClass31_3098 = null;
				if (Class2.anInt35 < 2 || i_21_ != 7 && i_21_ != 9) {
					if (Class2.anInt35 < 2 || i_21_ != 6) {
						if (Class2.anInt35 >= 4)
							if (Class48.anInt1069 > 5)
								Class76.anInt1499 = 3000;
							else {
								method1224((byte) 53, "js5connect");
								Class48.anInt1069 = 1000;
							}
					} else {
						method1224((byte) 53, "js5connect_outofdate");
						Class48.anInt1069 = 1000;
					}
					break;
				}
				if (Class48.anInt1069 <= 5) {
					method1224((byte) 53, "js5connect_full");
					Class48.anInt1069 = 1000;
				} else
					Class76.anInt1499 = 3000;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "client.R(" + i + ',' + i_21_ + ')');
			}
			break;
		} while (false);
	}

	static final boolean method1229(int i, WidgetComponent class38_sub6) {
		try {
			int i_22_ = class38_sub6.anInt1958;
			if (i_22_ == 205) {
				Client.logoutTimer = 250;
				return true;
			}
			if (i_22_ >= 300 && i_22_ <= 313) {
				int i_23_ = i_22_ & 0x1;
				int i_24_ = (i_22_ - 300) / 2;
				Class38_Sub20_Sub15.aClass18_3072.method132(i_24_, i_23_ == 1);
			}
			if (i_22_ >= 314 && i_22_ <= 323) {
				int i_25_ = i_22_ & 0x1;
				int i_26_ = (i_22_ - 314) / 2;
				Class38_Sub20_Sub15.aClass18_3072.method134(-1, i_25_ == 1, i_26_);
			}
			if (i_22_ == 324)
				Class38_Sub20_Sub15.aClass18_3072.method127(-121, false);
			if (i_22_ == 325)
				Class38_Sub20_Sub15.aClass18_3072.method127(-109, true);
			if (i_22_ == 326) {
				Client.outputBuffer.putOpcode(78);
				Class38_Sub20_Sub15.aClass18_3072.method125(Client.outputBuffer, -123);
				return true;
			}
			if (i >= -124)
				Client.anInt3652 = -55;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "client.S(" + i + ',' + (class38_sub6 != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final void method1217(boolean bool) {
		do
			try {
				if (Client.mouseRecorder != null)
					Client.mouseRecorder.aBool907 = false;
				Client.mouseRecorder = null;
				if (bool)
					Client.anInt3652 = -8;
				if (Client.worldConnection != null) {
					Client.worldConnection.method292(-84);
					Client.worldConnection = null;
				}
				Class40.method341(98);
				Class38_Sub20_Sub3_Sub2.method1093(100);
				Class4.aClass32_91 = null;
				if (WidgetComponent.aClass77_1857 != null)
					WidgetComponent.aClass77_1857.method548((byte) -124);
				if (Class38_Sub7.aClass77_2025 != null)
					Class38_Sub7.aClass77_2025.method548((byte) 85);
				Class38_Sub10_Sub3.method940(true);
				Class83.method595((byte) -11);
				try {
					if (Class17_Sub1.aClass16_1707 != null)
						Class17_Sub1.aClass16_1707.method92(-16279);
					if (Class43.aClass16Array982 != null)
						for (int i = 0; Class43.aClass16Array982.length > i; i++)
							if (Class43.aClass16Array982[i] != null)
								Class43.aClass16Array982[i].method92(-16279);
					if (Class16.aClass16_333 != null)
						Class16.aClass16_333.method92(-16279);
					if (Class38_Sub20_Sub11.aClass16_2923 == null)
						break;
					Class38_Sub20_Sub11.aClass16_2923.method92(-16279);
				} catch (java.io.IOException ioexception) {
					/* empty */
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "client.M(" + bool + ')');
			}
		while (false);
	}

	@Override
	final void method1211(byte i) {
		do {
			try {
				NodeSub.js5Port = 43595;
				if (i > 50) {
					if (Class38_Sub4.anInt1808 == 1) {
						Class38_Sub20_Sub3_Sub2.aShortArrayArray3251 = Canvas_Sub1.aShortArrayArray2527;
						Class45.characterColors = RuntimeException_Sub1.aShortArrayArray3288;
						Class38_Sub10_Sub3.aShortArray2821 = Class24.aShortArray575;
						Class31.aShortArray747 = RS2Buffer.aShortArray2380;
					} else {
						Class38_Sub20_Sub3_Sub2.aShortArrayArray3251 = Class16.aShortArrayArray322;
						Class38_Sub10_Sub3.aShortArray2821 = Class35.aShortArray825;
						Class45.characterColors = Class50.aShortArrayArray1118;
						Class31.aShortArray747 = Class30.aShortArray724;
					}
					SceneModel.worldPort = 43594;
					Class38_Sub19.method705((byte) -75);
					Class9.method44(Class38_Sub3.aCanvas1783, -24436);
					Projectile.method1165(0, Class38_Sub3.aCanvas1783);
					Class4.aClass32_91 = Class38_Sub9.method664((byte) -4);
					if (Class4.aClass32_91 != null)
						Class4.aClass32_91.method299(97, Class38_Sub3.aCanvas1783);
					Player.anInt3583 = Class56.anInt1249;
					try {
						if (Class38_Sub4.aClass56_1798.aClass63_1238 != null) {
							Class17_Sub1.aClass16_1707 = new Class16(Class38_Sub4.aClass56_1798.aClass63_1238, 5200, 0);
							for (int i_27_ = 0; i_27_ < 16; i_27_++)
								Class43.aClass16Array982[i_27_] = new Class16(Class38_Sub4.aClass56_1798.aClass63Array1239[i_27_], 6000, 0);
							Class16.aClass16_333 = new Class16(Class38_Sub4.aClass56_1798.aClass63_1244, 6000, 0);
							Class40.aClass48_917 = new Class48(255, Class17_Sub1.aClass16_1707, Class16.aClass16_333, 500000);
							Class38_Sub20_Sub11.aClass16_2923 = new Class16(Class38_Sub4.aClass56_1798.aClass63_1252, 24, 0);
							Class38_Sub4.aClass56_1798.aClass63_1244 = null;
							Class38_Sub4.aClass56_1798.aClass63_1238 = null;
							Class38_Sub4.aClass56_1798.aClass63Array1239 = null;
							Class38_Sub4.aClass56_1798.aClass63_1252 = null;
						}
					} catch (java.io.IOException ioexception) {
						Class17_Sub1.aClass16_1707 = null;
						Class40.aClass48_917 = null;
						Class16.aClass16_333 = null;
						Class38_Sub20_Sub11.aClass16_2923 = null;
					}
					if (Player.anInt3582 == 0)
						break;
					Class13.aBool246 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "client.F(" + i + ')');
			}
			break;
		} while (false);
	}

	@Override
	public final void init() {
		try {
			if (method1210(30360)) {
				Class23.anInt556 = Integer.parseInt(getParameter("worldid"));
				ObjectDefinition.anInt2464 = Integer.parseInt(getParameter("modewhat"));
				Player.anInt3582 = Integer.parseInt(getParameter("modewhere"));
				String string = getParameter("lowmem");
				if (string != null && string.equals("1"))
					Class38_Sub8.method660(127);
				else
					Class38_Sub20_Sub11.method985((byte) -107);
				String string_28_ = getParameter("members");
				if (string_28_ == null || !string_28_.equals("1"))
					Node.aBool889 = false;
				else
					Node.aBool889 = true;
				String string_29_ = getParameter("lang");
				if (string_29_ != null && string_29_.equals("1")) {
					Class5.method32(false);
					Class64.anInt1361 = 1;
					Class38_Sub22.aClass19_2310 = Class21.aClass19_514;
				}
				String string_30_ = getParameter("game");
				if (string_30_ != null && string_30_.equals("1"))
					Class38_Sub4.anInt1808 = 1;
				else
					Class38_Sub4.anInt1808 = 0;
				try {
					Class38_Sub20_Sub12.anInt3005 = Integer.parseInt(getParameter("js"));
					Class38_Sub3.anInt1776 = Integer.parseInt(getParameter("plug"));
				} catch (Exception exception) {
					/* empty */
				}
				Class26.aString611 = getCodeBase().getHost();
				method1221(0, ObjectDefinition.anInt2464 + 32, 765, 503, 468);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "client.init(" + ')');
		}
	}

	private final void method1230(boolean bool) {
		do {
			try {
				if (Class48.anInt1069 != 1000) {
					boolean bool_31_ = Class79.method568(95);
					if (bool)
						method1214(-120);
					if (bool_31_)
						break;
					method1226(-56);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "client.T(" + bool + ')');
			}
			break;
		} while (false);
	}

	static final void dropClient() {
		if (logoutTimer > 0)
			Class41.method350(-10015);
		else {
			Canvas_Sub1.method808(0, 40);
			Class60.aClass31_1306 = Client.worldConnection;
			Client.worldConnection = null;
			// Class38_Sub20_Sub16.aClass19_3093 = null;
		}
	}

	static final boolean parsePacket(int i) {
		try {
			if (Client.worldConnection == null)
				return false;
			try {
				int i_41_ = Client.worldConnection.method291((byte) 122);
				if (i_41_ == 0)
					return false;
				if (Class23.packetId == -1) {
					Client.worldConnection.method290(124, 0, Class15.inputStream.buffer, 1);
					Class15.inputStream.pos = 0;
					Class23.packetId = Class15.inputStream.readIsaacByte();
					Entity.anInt3446 = Class3.anIntArray67[Class23.packetId];
					i_41_--;
				}
				if (Entity.anInt3446 == -1) {
					if (i_41_ <= 0)
						return false;
					i_41_--;
					Client.worldConnection.method290(116, 0, Class15.inputStream.buffer, 1);
					Entity.anInt3446 = Class15.inputStream.buffer[0] & 0xff;
				}
				if (Entity.anInt3446 == -2)
					if (i_41_ > 1) {
						i_41_ -= 2;
						Client.worldConnection.method290(i ^ 0x7794, 0, Class15.inputStream.buffer, 2);
						Class15.inputStream.pos = 0;
						Entity.anInt3446 = Class15.inputStream.readUnsignedShort();
					} else
						return false;
				if (i_41_ < Entity.anInt3446)
					return false;
				Class15.inputStream.pos = 0;
				Client.worldConnection.method290(117, 0, Class15.inputStream.buffer, Entity.anInt3446);
				Class38_Sub20_Sub8.anInt2857 = 0;
				Class38_Sub20_Sub8.anInt2864 = Class15.anInt280;
				Class15.anInt280 = Class38_Sub19.anInt2233;
				Class38_Sub19.anInt2233 = Class23.packetId;
				if (i != 30703)
					Class25.method210(null, false, null, null, null);
				if (Class23.packetId == 27) {
					int windowId = Class15.inputStream.readUnsignedShortAdd();
					NodeSub.windowId = windowId;
					method1231(0, windowId);
					Class78.method566(NodeSub.windowId, 31);
					for (int i_43_ = 0; i_43_ < 100; i_43_++)
						Class32.aBoolArray768[i_43_] = true;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 106) {
					int i_44_ = Class15.inputStream.readInt(true);
					int i_45_ = Class15.inputStream.readUnsignedShort();
					WidgetComponent class38_sub6;
					if (i_44_ >= 0)
						class38_sub6 = Projectile.method1167(i_44_, 111);
					else
						class38_sub6 = null;
					if (i_44_ < -70000)
						i_45_ += 32768;
					if (class38_sub6 != null)
						for (int i_46_ = 0; i_46_ < class38_sub6.anIntArray1947.length; i_46_++) {
							class38_sub6.anIntArray1947[i_46_] = 0;
							class38_sub6.anIntArray1866[i_46_] = 0;
						}
					Class4.method23(i_45_, 88);
					int i_47_ = Class15.inputStream.readUnsignedShort();
					for (int i_48_ = 0; i_47_ > i_48_; i_48_++) {
						int i_49_ = Class15.inputStream.getUByteC();
						if (i_49_ == 255)
							i_49_ = Class15.inputStream.method730(i ^ 0x779d);
						int i_50_ = Class15.inputStream.getULEShort();
						if (class38_sub6 != null && class38_sub6.anIntArray1947.length > i_48_) {
							class38_sub6.anIntArray1947[i_48_] = i_50_;
							class38_sub6.anIntArray1866[i_48_] = i_49_;
						}
						WidgetComponent.method639(i_45_, i_48_, -31820, i_49_, i_50_ - 1);
					}
					if (class38_sub6 != null)
						Class40.method340(class38_sub6, (byte) -127);
					Applet_Sub1.method1218((byte) -70);
					Class55.anIntArray1230[Class38_Sub10_Sub3.method941(Class38_Sub18.anInt2208++, 31)] = Class38_Sub10_Sub3.method941(32767, i_45_);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 42) {
					Class38_Sub20_Sub3_Sub2.anInt3250 = Entity.anInt3446 / 8;
					for (int i_51_ = 0; Class38_Sub20_Sub3_Sub2.anInt3250 > i_51_; i_51_++) {
						Class5.aLongArray97[i_51_] = Class15.inputStream.method748(-118);
						Class54.aClass19Array1206[i_51_] = Class73.method520(Class5.aLongArray97[i_51_], 1);
					}
					Class23.packetId = -1;
					Class81.anInt1624 = Entity.anInt3513;
					return true;
				}
				if (Class23.packetId == 210) {
					int i_52_ = Class15.inputStream.method730(53);
					int i_53_ = Class15.inputStream.getULEShort();
					WidgetComponent class38_sub6 = Projectile.method1167(i_52_, 75);
					if (class38_sub6.anInt1883 != 2 || class38_sub6.anInt1962 != i_53_) {
						class38_sub6.anInt1883 = 2;
						class38_sub6.anInt1962 = i_53_;
						Class40.method340(class38_sub6, (byte) -103);
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 92) {
					int i_54_ = Class15.inputStream.readUnsignedShort();
					if (i_54_ == 65535)
						i_54_ = -1;
					int i_55_ = Class15.inputStream.readInt(true);
					int i_56_ = Class15.inputStream.method746(i - 30806);
					WidgetComponent class38_sub6 = Projectile.method1167(i_55_, 97);
					if (!class38_sub6.aBool1961) {
						if (i_54_ == -1) {
							Class23.packetId = -1;
							class38_sub6.anInt1883 = 0;
							return true;
						}
						ItemDefinition class38_sub20_sub6 = Node.forId(i_54_, 57);
						class38_sub6.anInt1921 = class38_sub20_sub6.anInt2770 * 100 / i_56_;
						class38_sub6.anInt1987 = class38_sub20_sub6.anInt2795;
						class38_sub6.anInt1883 = 4;
						class38_sub6.anInt1925 = class38_sub20_sub6.anInt2805;
						class38_sub6.anInt1962 = i_54_;
						Class40.method340(class38_sub6, (byte) -122);
					} else {
						class38_sub6.anInt1899 = i_56_;
						class38_sub6.anInt1917 = i_54_;
						ItemDefinition class38_sub20_sub6 = Node.forId(i_54_, 35);
						class38_sub6.anInt1987 = class38_sub20_sub6.anInt2795;
						class38_sub6.anInt1921 = class38_sub20_sub6.anInt2770;
						class38_sub6.anInt1929 = class38_sub20_sub6.modelOffsetX;
						class38_sub6.anInt1863 = class38_sub20_sub6.anInt2753;
						class38_sub6.anInt1925 = class38_sub20_sub6.anInt2805;
						if (class38_sub6.anInt1923 > 0)
							class38_sub6.anInt1921 = class38_sub6.anInt1921 * 32 / class38_sub6.anInt1923;
						class38_sub6.anInt1964 = class38_sub20_sub6.modelOffsetY;
						Class40.method340(class38_sub6, (byte) -115);
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 175) {
					for (int i_57_ = 0; i_57_ < Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152.length; i_57_++)
						if (Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_57_] != null)
							Class9.aClass38_Sub20_Sub3_Sub7_Sub2Array152[i_57_].currentAnimationId = -1;
					for (int i_58_ = 0; Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164.length > i_58_; i_58_++)
						if (Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_58_] != null)
							Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_58_].currentAnimationId = -1;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 89) {
					RSString class19 = Class15.inputStream.getUShort(1347418632);
					Object[] objects = new Object[class19.method143((byte) 74) + 1];
					for (int i_59_ = class19.method143((byte) 81) - 1; i_59_ >= 0; i_59_--)
						if (class19.method163(114, i_59_) == 115)
							objects[i_59_ + 1] = Class15.inputStream.getUShort(1347418632);
						else
							objects[i_59_ + 1] = new Integer(Class15.inputStream.readInt(true));
					objects[0] = new Integer(Class15.inputStream.readInt(true));
					Class38_Sub19 class38_sub19 = new Class38_Sub19();
					class38_sub19.anObjectArray2240 = objects;
					Class15.method84(class38_sub19, (byte) -83);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 238) {
					RSString class19 = Class15.inputStream.getUShort(i + 1347387929);
					if (class19.method169(0, Class77.aClass19_1508)) {
						RSString class19_60_ = class19.method144((byte) 52, 0, class19.method170(1, Class16.aClass19_341));
						boolean bool = false;
						long l = class19_60_.method162(i - 30703);
						for (int i_61_ = 0; i_61_ < Class38_Sub20_Sub3_Sub2.anInt3250; i_61_++)
							if (l == Class5.aLongArray97[i_61_]) {
								bool = true;
								break;
							}
						if (!bool && Sequence.anInt2731 == 0)
							Class62.method464((byte) 98, Class60.aClass19_1319, 4, class19_60_);
					} else if (class19.method169(i - 30703, Class11.aClass19_210)) {
						boolean bool = false;
						RSString class19_62_ = class19.method144((byte) 88, 0, class19.method170(1, Class16.aClass19_341));
						long l = class19_62_.method162(0);
						for (int i_63_ = 0; i_63_ < Class38_Sub20_Sub3_Sub2.anInt3250; i_63_++)
							if (Class5.aLongArray97[i_63_] == l) {
								bool = true;
								break;
							}
						if (!bool && Sequence.anInt2731 == 0)
							Class62.method464((byte) 98, Class72.aClass19_1420, 8, class19_62_);
					} else if (!class19.method169(0, Class38_Sub20_Sub3_Sub4.aClass19_3365)) {
						if (!class19.method169(0, Class44.aClass19_1011)) {
							if (!class19.method169(0, Class21.aClass19_526)) {
								if (class19.method169(0, Class38_Sub20_Sub16.aClass19_3107)) {
									RSString class19_64_ = class19.method144((byte) -8, 0, class19.method170(i - 30702, Class38_Sub20_Sub16.aClass19_3107));
									if (Sequence.anInt2731 == 0)
										Class62.method464((byte) 98, class19_64_, 12, Class38_Sub22.aClass19_2312);
								} else if (class19.method169(0, Class32.aClass19_778)) {
									RSString class19_65_ = class19.method144((byte) -113, 0, class19.method170(i ^ 0x77ee, Class32.aClass19_778));
									if (Sequence.anInt2731 == 0)
										Class62.method464((byte) 98, class19_65_, 13, Class38_Sub22.aClass19_2312);
								} else
									Class62.method464((byte) 98, class19, 0, Class38_Sub22.aClass19_2312);
							} else {
								RSString class19_66_ = class19.method144((byte) -114, 0, class19.method170(i - 30702, Class21.aClass19_526));
								Class62.method464((byte) 98, class19_66_, 11, Class38_Sub22.aClass19_2312);
							}
						} else {
							RSString class19_67_ = class19.method144((byte) 72, 0, class19.method170(1, Class16.aClass19_341));
							long l = class19_67_.method162(0);
							boolean bool = false;
							for (int i_68_ = 0; Class38_Sub20_Sub3_Sub2.anInt3250 > i_68_; i_68_++)
								if (l == Class5.aLongArray97[i_68_]) {
									bool = true;
									break;
								}
							if (!bool && Sequence.anInt2731 == 0)
								Class62.method464((byte) 98, Class38_Sub22.aClass19_2312, 10, class19_67_);
						}
					} else {
						RSString class19_69_ = class19.method144((byte) 34, 0, class19.method170(1, Class16.aClass19_341));
						boolean bool = false;
						long l = class19_69_.method162(0);
						for (int i_70_ = 0; i_70_ < Class38_Sub20_Sub3_Sub2.anInt3250; i_70_++)
							if (Class5.aLongArray97[i_70_] == l) {
								bool = true;
								break;
							}
						if (!bool && Sequence.anInt2731 == 0) {
							RSString class19_71_ = class19.method144((byte) -124, class19.method170(1, Class16.aClass19_341) + 1, class19.method143((byte) 48) - 9);
							Class62.method464((byte) 98, class19_71_, 8, class19_69_);
						}
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 188) {
					Class41.method350(i - 40718);
					Class23.packetId = -1;
					return false;
				}
				if (Class23.packetId == 184) {
					long l = Class15.inputStream.method748(-109);
					int i_72_ = Class15.inputStream.readUnsignedShort();
					int i_73_ = Class15.inputStream.readUnsignedByte();
					RSString class19 = Class73.method520(l, 1).method167((byte) 52);
					for (int i_74_ = 0; Class81.anInt1618 > i_74_; i_74_++)
						if (l == Class20.aLongArray499[i_74_]) {
							if (i_72_ != Class41.anIntArray941[i_74_]) {
								Class41.anIntArray941[i_74_] = i_72_;
								if (i_72_ > 0)
									Class62.method464((byte) 98, Class9.method43(new RSString[] { class19, Class38_Sub10_Sub3.aClass19_2834 }, (byte) -20), 5, Class38_Sub22.aClass19_2312);
								if (i_72_ == 0)
									Class62.method464((byte) 98, Class9.method43(new RSString[] { class19, Sequence.aClass19_2727 }, (byte) -20), 5, Class38_Sub22.aClass19_2312);
							}
							Class80.anIntArray1606[i_74_] = i_73_;
							class19 = null;
							break;
						}
					if (class19 != null && Class81.anInt1618 < 200) {
						Class20.aLongArray499[Class81.anInt1618] = l;
						Class53.aClass19Array1173[Class81.anInt1618] = class19;
						Class41.anIntArray941[Class81.anInt1618] = i_72_;
						Class80.anIntArray1606[Class81.anInt1618] = i_73_;
						Class81.anInt1618++;
					}
					boolean bool = false;
					Class81.anInt1624 = Entity.anInt3513;
					int i_75_ = Class81.anInt1618;
					while (i_75_ > 0) {
						i_75_--;
						bool = true;
						for (int i_76_ = 0; i_75_ > i_76_; i_76_++)
							if (Class41.anIntArray941[i_76_] != Class23.anInt556 && Class41.anIntArray941[i_76_ + 1] == Class23.anInt556 || Class41.anIntArray941[i_76_] == 0 && Class41.anIntArray941[i_76_ + 1] != 0) {
								bool = false;
								int i_77_ = Class41.anIntArray941[i_76_];
								Class41.anIntArray941[i_76_] = Class41.anIntArray941[i_76_ + 1];
								Class41.anIntArray941[i_76_ + 1] = i_77_;
								RSString class19_78_ = Class53.aClass19Array1173[i_76_];
								Class53.aClass19Array1173[i_76_] = Class53.aClass19Array1173[i_76_ + 1];
								Class53.aClass19Array1173[i_76_ + 1] = class19_78_;
								long l_79_ = Class20.aLongArray499[i_76_];
								Class20.aLongArray499[i_76_] = Class20.aLongArray499[i_76_ + 1];
								Class20.aLongArray499[i_76_ + 1] = l_79_;
								int i_80_ = Class80.anIntArray1606[i_76_];
								Class80.anIntArray1606[i_76_] = Class80.anIntArray1606[i_76_ + 1];
								Class80.anIntArray1606[i_76_ + 1] = i_80_;
							}
						if (bool)
							break;
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 212) {
					int i_81_ = Class15.inputStream.method730(72);
					Class38_Sub14.aClass65_2145 = Class38_Sub4.aClass56_1798.method435(i_81_, -117);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 68) {
					long l = Class15.inputStream.method748(-119);
					Class15.inputStream.readByte((byte) 120);
					long l_82_ = Class15.inputStream.method748(-119);
					boolean bool = false;
					long l_83_ = Class15.inputStream.readUnsignedShort();
					long l_84_ = Class15.inputStream.method738((byte) 119);
					int i_85_ = Class15.inputStream.readUnsignedByte();
					long l_86_ = (l_83_ << 489233312) - -l_84_;
					for (int i_87_ = 0; i_87_ < 100; i_87_++)
						if (Class51.aLongArray1123[i_87_] == l_86_) {
							bool = true;
							break;
						}
					if (i_85_ <= 1)
						for (int i_88_ = 0; i_88_ < Class38_Sub20_Sub3_Sub2.anInt3250; i_88_++)
							if (l == Class5.aLongArray97[i_88_]) {
								bool = true;
								break;
							}
					if (!bool && Sequence.anInt2731 == 0) {
						Class51.aLongArray1123[PacketBuffer.anInt2437] = l_86_;
						PacketBuffer.anInt2437 = (PacketBuffer.anInt2437 + 1) % 100;
						RSString class19 = Class38_Sub20_Sub9_Sub1.method1062(Class58.method443((byte) 33, Class15.inputStream).method161(97));
						if (i_85_ == 2 || i_85_ == 3)
							Sequence.method914(Class9.method43(new RSString[] { Class32.aClass19_775, Class73.method520(l, 1).method167((byte) 52) }, (byte) -20), true, 9, class19, Class73.method520(l_82_, 1).method167((byte) 52));
						else if (i_85_ == 1)
							Sequence.method914(Class9.method43(new RSString[] { Class38_Sub20_Sub10.aClass19_2911, Class73.method520(l, 1).method167((byte) 52) }, (byte) -20), true, 9, class19, Class73.method520(l_82_, i ^ 0x77ee).method167((byte) 52));
						else
							Sequence.method914(Class73.method520(l, i - 30702).method167((byte) 52), true, 9, class19, Class73.method520(l_82_, 1).method167((byte) 52));
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 111) {
					int i_89_ = Class15.inputStream.readUnsignedByte();
					int i_90_ = Class15.inputStream.readUnsignedShort();
					int widgetHash = Class15.inputStream.readInt(true);
					Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method75(widgetHash);
					if (class38_sub8 != null)
						Class48.method388(class38_sub8.anInt2038 != i_90_, (byte) -14, class38_sub8);
					Class60.method454(i_89_, i_90_, widgetHash, 22878);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 38) {
					int i_92_ = Class15.inputStream.method772(false);
					int i_93_ = Class15.inputStream.readInt(true);
					int i_94_ = Class15.inputStream.method772(false);
					WidgetComponent class38_sub6 = Projectile.method1167(i_93_, i - 30628);
					int i_95_ = i_92_ + class38_sub6.anInt1910;
					int i_96_ = class38_sub6.anInt1882 + i_94_;
					if (i_95_ != class38_sub6.anInt1942 || i_96_ != class38_sub6.anInt1968) {
						class38_sub6.anInt1968 = i_96_;
						class38_sub6.anInt1942 = i_95_;
						Class40.method340(class38_sub6, (byte) -105);
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 73) {
					Class81.anInt1619 = Class15.inputStream.readUnsignedByte();
					Class81.anInt1621 = Class15.inputStream.readUnsignedByte();
					Class2_Sub1.anInt1996 = Class15.inputStream.readUnsignedByte();
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 41) {
					int i_97_ = Class15.inputStream.readInt(true);
					RSString class19 = Class15.inputStream.getUShort(1347418632);
					WidgetComponent class38_sub6 = Projectile.method1167(i_97_, i - 30812);
					if (!class19.method175(true, class38_sub6.aClass19_1876)) {
						class38_sub6.aClass19_1876 = class19;
						Class40.method340(class38_sub6, (byte) -108);
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 59) {
					int i_98_ = Class15.inputStream.readInt(true);
					WidgetComponent class38_sub6 = Projectile.method1167(i_98_, -98);
					class38_sub6.anInt1883 = 3;
					class38_sub6.anInt1962 = myPlayer.appearance.method137(-126);
					Class40.method340(class38_sub6, (byte) -117);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 195 || Class23.packetId == 138 || Class23.packetId == 164 || Class23.packetId == 103 || Class23.packetId == 120 || Class23.packetId == 82 || Class23.packetId == 32 || Class23.packetId == 26 || Class23.packetId == 147 || Class23.packetId == 150 || Class23.packetId == 105) {
					Class60.method452(7);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 77) {
					long l = Class15.inputStream.method748(-120);
					RSString class19 = Class38_Sub20_Sub9_Sub1.method1062(Class58.method443((byte) 33, Class15.inputStream).method161(97));
					Class62.method464((byte) 98, class19, 6, Class73.method520(l, 1).method167((byte) 52));
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 142) {
					int i_99_ = Class15.inputStream.method749(-126);
					int i_100_ = Class15.inputStream.method730(97);
					WidgetComponent class38_sub6 = Projectile.method1167(i_100_, -121);
					if (class38_sub6.anInt1878 != i_99_ || i_99_ == -1) {
						class38_sub6.anInt1952 = 0;
						class38_sub6.anInt1878 = i_99_;
						class38_sub6.anInt1875 = 0;
						Class40.method340(class38_sub6, (byte) -105);
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 108) {
					Applet_Sub1.method1218((byte) -106);
					Class82.anInt1647 = Class15.inputStream.method772(false);
					Class23.packetId = -1;
					Class38_Sub20_Sub3_Sub2.anInt3260 = Entity.anInt3513;
					return true;
				}
				if (Class23.packetId == 137) {
					Client.systemUpdateTime = Class15.inputStream.getULEShort() * 30;
					Class38_Sub20_Sub3_Sub2.anInt3260 = Entity.anInt3513;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 110) {
					Class38_Sub20_Sub15.anInt3068 = Class15.inputStream.readUnsignedByte();
					Class23.packetId = -1;
					Class81.anInt1624 = Entity.anInt3513;
					return true;
				}
				if (Class23.packetId == 36) {
					Class38_Sub10_Sub3.method939(-3072);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 119) {
					Class53.method411(-127, Class15.inputStream);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 254) {
					int i_101_ = Class15.inputStream.method730(72);
					WidgetComponent class38_sub6 = Projectile.method1167(i_101_, -100);
					for (int i_102_ = 0; i_102_ < class38_sub6.anIntArray1947.length; i_102_++) {
						class38_sub6.anIntArray1947[i_102_] = -1;
						class38_sub6.anIntArray1947[i_102_] = 0;
					}
					Class40.method340(class38_sub6, (byte) -111);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 122) {
					Class38_Sub20_Sub17.anInt3129 = Class15.inputStream.readUnsignedByte();
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 134) {
					destX = 0;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 171) {
					int i_103_ = Class15.inputStream.readUnsignedShort();
					int i_104_ = Class15.inputStream.readUnsignedShortAdd();
					int i_105_ = Class15.inputStream.readUnsignedShortAdd();
					int i_106_ = Class15.inputStream.readInt(true);
					WidgetComponent class38_sub6 = Projectile.method1167(i_106_, -95);
					if (class38_sub6.anInt1925 != i_104_ || class38_sub6.anInt1987 != i_103_ || class38_sub6.anInt1921 != i_105_) {
						class38_sub6.anInt1987 = i_103_;
						class38_sub6.anInt1921 = i_105_;
						class38_sub6.anInt1925 = i_104_;
						Class40.method340(class38_sub6, (byte) -122);
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 169) {
					Class38_Sub20_Sub17.sendMapRegion(true, (byte) 92);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 213) {
					for (int i_107_ = 0; i_107_ < Class38_Sub20_Sub15.anInt3073; i_107_++) {
						Class38_Sub20_Sub15 class38_sub20_sub15 = Class37.method326(16, i_107_);
						if (class38_sub20_sub15 != null && class38_sub20_sub15.anInt3063 == 0) {
							Class53.anIntArray1172[i_107_] = 0;
							Class21.anIntArray528[i_107_] = 0;
						}
					}
					Applet_Sub1.method1218((byte) -65);
					Class25.anInt591 += 32;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 208) {
					Applet_Sub1.method1218((byte) -63);
					int i_108_ = Class15.inputStream.readUnsignedByteC(i - 17418);
					int i_109_ = Class15.inputStream.readInt(true);
					int i_110_ = Class15.inputStream.readUnsignedByteC(13285);
					Class38_Sub20_Sub3_Sub4.anIntArray3358[i_108_] = i_109_;
					Class47.anIntArray1041[i_108_] = i_110_;
					Class38_Sub2.anIntArray1770[i_108_] = 1;
					for (int i_111_ = 0; i_111_ < 98; i_111_++)
						if (i_109_ >= Class50.anIntArray1114[i_111_])
							Class38_Sub2.anIntArray1770[i_108_] = i_111_ + 2;
					Class51.anIntArray1125[Class38_Sub10_Sub3.method941(31, Class23.anInt553++)] = i_108_;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 55) {
					Class38_Sub21.aBool2280 = true;
					Class35.anInt805 = Class15.inputStream.readUnsignedByte();
					Class38_Sub20_Sub3_Sub2.anInt3274 = Class15.inputStream.readUnsignedByte();
					Class38_Sub17.anInt2195 = Class15.inputStream.readUnsignedShort();
					Class60.anInt1302 = Class15.inputStream.readUnsignedByte();
					Class29.anInt706 = Class15.inputStream.readUnsignedByte();
					if (Class29.anInt706 >= 100) {
						Class2.anInt30 = Class38_Sub20_Sub3_Sub2.anInt3274 * 128 + 64;
						Class11.anInt208 = Class35.anInt805 * 128 + 64;
						Class38_Sub18.anInt2209 = Class35.method317(-5736, height, Class11.anInt208, Class2.anInt30) - Class38_Sub17.anInt2195;
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 190) {
					for (int i_112_ = 0; Class21.anIntArray528.length > i_112_; i_112_++)
						if (Class21.anIntArray528[i_112_] != Class53.anIntArray1172[i_112_]) {
							Class21.anIntArray528[i_112_] = Class53.anIntArray1172[i_112_];
							Class76.method545(i_112_, -2);
							Class43.anIntArray971[Class38_Sub10_Sub3.method941(31, Class25.anInt591++)] = i_112_;
						}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 161) {
					int i_113_ = Class15.inputStream.method730(i ^ 0x77dc);
					int i_114_ = Class15.inputStream.readUnsignedShort();
					if (i_114_ == 65535)
						i_114_ = -1;
					int i_115_ = Class15.inputStream.method746(i ^ ~0x77ae);
					int i_116_ = Class15.inputStream.readUnsignedShort();
					if (i_116_ == 65535)
						i_116_ = -1;
					for (int i_117_ = i_114_; i_117_ <= i_116_; i_117_++) {
						long l = ((long) i_113_ << -1122880480) - -(long) i_117_;
						Node Node = Entity.aClass14_3514.method75(l);
						if (Node != null)
							Node.method330(0);
						Entity.aClass14_3514.method80(true, l, new Class38_Sub11(i_115_));
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 124) {
					if (NodeSub.windowId != -1)
						Class38_Sub4.method625(NodeSub.windowId, 0, (byte) 39);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 39) {
					Class64.anInt1358 = Class15.inputStream.getUByteC();
					Class2_Sub1.anInt2003 = Class15.inputStream.readUnsignedByte();
					for (int i_118_ = Class2_Sub1.anInt2003; Class2_Sub1.anInt2003 + 8 > i_118_; i_118_++)
						for (int i_119_ = Class64.anInt1358; i_119_ < Class64.anInt1358 + 8; i_119_++)
							if (Class38_Sub21.aClass13ArrayArrayArray2259[height][i_118_][i_119_] != null) {
								Class38_Sub21.aClass13ArrayArrayArray2259[height][i_118_][i_119_] = null;
								Class13.method59(-1, i_119_, i_118_);
							}
					for (Class38_Sub21 class38_sub21 = (Class38_Sub21) Class3.aClass13_71.method65(103); class38_sub21 != null; class38_sub21 = (Class38_Sub21) Class3.aClass13_71.method63(-3))
						if (class38_sub21.anInt2267 >= Class2_Sub1.anInt2003 && Class2_Sub1.anInt2003 + 8 > class38_sub21.anInt2267 && Class64.anInt1358 <= class38_sub21.anInt2282 && class38_sub21.anInt2282 < Class64.anInt1358 + 8 && class38_sub21.anInt2263 == height)
							class38_sub21.anInt2273 = 0;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 222) {
					long l = Class15.inputStream.method748(-102);
					long l_120_ = Class15.inputStream.readUnsignedShort();
					long l_121_ = Class15.inputStream.method738((byte) 90);
					long l_122_ = (l_120_ << -1198720864) + l_121_;
					boolean bool = false;
					int i_123_ = Class15.inputStream.readUnsignedByte();
					for (int i_124_ = 0; i_124_ < 100; i_124_++)
						if (Class51.aLongArray1123[i_124_] == l_122_) {
							bool = true;
							break;
						}
					if (i_123_ <= 1)
						for (int i_125_ = 0; i_125_ < Class38_Sub20_Sub3_Sub2.anInt3250; i_125_++)
							if (l == Class5.aLongArray97[i_125_]) {
								bool = true;
								break;
							}
					if (!bool && Sequence.anInt2731 == 0) {
						Class51.aLongArray1123[PacketBuffer.anInt2437] = l_122_;
						PacketBuffer.anInt2437 = (PacketBuffer.anInt2437 + 1) % 100;
						RSString class19 = Class38_Sub20_Sub9_Sub1.method1062(Class58.method443((byte) 33, Class15.inputStream).method161(97));
						if (i_123_ == 2 || i_123_ == 3)
							Class62.method464((byte) 98, class19, 7, Class9.method43(new RSString[] { Class32.aClass19_775, Class73.method520(l, i ^ 0x77ee).method167((byte) 52) }, (byte) -20));
						else if (i_123_ != 1)
							Class62.method464((byte) 98, class19, 3, Class73.method520(l, i ^ 0x77ee).method167((byte) 52));
						else
							Class62.method464((byte) 98, class19, 7, Class9.method43(new RSString[] { Class38_Sub20_Sub10.aClass19_2911, Class73.method520(l, 1).method167((byte) 52) }, (byte) -20));
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 207) {
					int i_126_ = Class15.inputStream.readUnsignedShortAdd();
					Class3.method18((byte) 68, i_126_);
					Class55.anIntArray1230[Class38_Sub10_Sub3.method941(31, Class38_Sub18.anInt2208++)] = Class38_Sub10_Sub3.method941(i_126_, 32767);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 99) {
					int i_127_ = Class15.inputStream.readUnsignedShort();
					int i_128_ = Class15.inputStream.readUnsignedByte();
					int i_129_ = Class15.inputStream.readUnsignedShort();
					Class38_Sub20_Sub17.method1035(i_127_, (byte) -61, i_129_, i_128_);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 244) {
					int i_130_ = Class15.inputStream.getULEShort();
					int i_131_ = Class15.inputStream.readInt(true);
					Class53.anIntArray1172[i_130_] = i_131_;
					if (Class21.anIntArray528[i_130_] != i_131_) {
						Class21.anIntArray528[i_130_] = i_131_;
						Class76.method545(i_130_, -2);
					}
					Class43.anIntArray971[Class38_Sub10_Sub3.method941(31, Class25.anInt591++)] = i_130_;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 209) {
					int i_132_ = Class15.inputStream.readUnsignedShortAdd();
					int i_133_ = Class15.inputStream.readInt(true);
					WidgetComponent class38_sub6 = Projectile.method1167(i_133_, -106);
					if (class38_sub6 != null && class38_sub6.anInt1868 == 0) {
						if (i_132_ > -class38_sub6.anInt1886 + class38_sub6.anInt1933)
							i_132_ = class38_sub6.anInt1933 - class38_sub6.anInt1886;
						if (i_132_ < 0)
							i_132_ = 0;
						if (i_132_ != class38_sub6.anInt1985) {
							class38_sub6.anInt1985 = i_132_;
							Class40.method340(class38_sub6, (byte) -101);
						}
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 201) {
					int i_134_ = Class15.inputStream.readUnsignedShortAdd();
					int i_135_ = Class15.inputStream.readByte((byte) 112);
					Class53.anIntArray1172[i_134_] = i_135_;
					if (i_135_ != Class21.anIntArray528[i_134_]) {
						Class21.anIntArray528[i_134_] = i_135_;
						Class76.method545(i_134_, -2);
					}
					Class43.anIntArray971[Class38_Sub10_Sub3.method941(31, Class25.anInt591++)] = i_134_;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 232) {
					Class42.anInt962 = Class15.inputStream.readUnsignedByte();
					if (Class42.anInt962 == 1)
						Class60.anInt1320 = Class15.inputStream.readUnsignedShort();
					if (Class42.anInt962 >= 2 && Class42.anInt962 <= 6) {
						if (Class42.anInt962 == 2) {
							anInt3641 = 64;
							Class47.anInt1062 = 64;
						}
						if (Class42.anInt962 == 3) {
							Class47.anInt1062 = 0;
							anInt3641 = 64;
						}
						if (Class42.anInt962 == 4) {
							Class47.anInt1062 = 128;
							anInt3641 = 64;
						}
						if (Class42.anInt962 == 5) {
							Class47.anInt1062 = 64;
							anInt3641 = 0;
						}
						if (Class42.anInt962 == 6) {
							anInt3641 = 128;
							Class47.anInt1062 = 64;
						}
						Class42.anInt962 = 2;
						Class32.anInt770 = Class15.inputStream.readUnsignedShort();
						Class5.anInt93 = Class15.inputStream.readUnsignedShort();
						Class38_Sub20_Sub2.anInt2535 = Class15.inputStream.readUnsignedByte();
					}
					if (Class42.anInt962 == 10)
						Class62.anInt1344 = Class15.inputStream.readUnsignedShort();
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 160) {
					Class38_Sub21.aBool2280 = false;
					for (int i_136_ = 0; i_136_ < 5; i_136_++)
						Class20.aBoolArray504[i_136_] = false;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 2) {
					int i_137_ = Class15.inputStream.readInt(true);
					int i_138_ = Class15.inputStream.readUnsignedShort();
					WidgetComponent class38_sub6;
					if (i_137_ >= 0)
						class38_sub6 = Projectile.method1167(i_137_, i - 30825);
					else
						class38_sub6 = null;
					if (i_137_ < -70000)
						i_138_ += 32768;
					while (Class15.inputStream.pos < Entity.anInt3446) {
						int i_139_ = Class15.inputStream.method726(true);
						int i_140_ = Class15.inputStream.readUnsignedShort();
						int i_141_ = 0;
						if (i_140_ != 0) {
							i_141_ = Class15.inputStream.readUnsignedByte();
							if (i_141_ == 255)
								i_141_ = Class15.inputStream.readInt(true);
						}
						if (class38_sub6 != null && i_139_ >= 0 && class38_sub6.anIntArray1947.length > i_139_) {
							class38_sub6.anIntArray1947[i_139_] = i_140_;
							class38_sub6.anIntArray1866[i_139_] = i_141_;
						}
						WidgetComponent.method639(i_138_, i_139_, -31820, i_141_, i_140_ - 1);
					}
					if (class38_sub6 != null)
						Class40.method340(class38_sub6, (byte) -102);
					Applet_Sub1.method1218((byte) -105);
					Class55.anIntArray1230[Class38_Sub10_Sub3.method941(31, Class38_Sub18.anInt2208++)] = Class38_Sub10_Sub3.method941(i_138_, 32767);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 239) {
					int i_142_ = Class15.inputStream.method746(-65);
					int i_143_ = Class15.inputStream.method740((byte) 115);
					int i_144_ = Class15.inputStream.readUnsignedShort();
					WidgetComponent class38_sub6 = Projectile.method1167(i_142_, -114);
					Class23.packetId = -1;
					class38_sub6.anInt1862 = i_143_ + (i_144_ << -842512208);
					return true;
				}
				if (Class23.packetId == 74) {
					Class41.updatePlayer((byte) 126);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 51) {
					NPC.method1200(Entity.anInt3446, Class15.inputStream, i - 30604, Class38_Sub4.aClass56_1798);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 10) {
					int i_145_ = Class15.inputStream.method740((byte) -49);
					if (i_145_ == 65535)
						i_145_ = -1;
					Class4.method26(i_145_, i ^ ~0x5d7f);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 112) {
					int i_146_ = Class15.inputStream.readUnsignedShortAdd();
					if (i_146_ == 65535)
						i_146_ = -1;
					int i_147_ = Class15.inputStream.method738((byte) 74);
					Class38_Sub11.method672(-112, i_146_, i_147_);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 94) {
					int i_148_ = Class15.inputStream.readUnsignedByteC(i - 17418);
					int i_149_ = Class15.inputStream.readUnsignedByteC(13285);
					RSString class19 = Class15.inputStream.getUShort(1347418632);
					if (i_148_ >= 1 && i_148_ <= 8) {
						if (class19.method174((byte) 102, Class41.aClass19_948))
							class19 = null;
						Class38_Sub11.aClass19Array2094[i_148_ - 1] = class19;
						Class17_Sub1.aBoolArray1717[i_148_ - 1] = i_149_ == 0;
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 25) {
					int i_150_ = Class15.inputStream.readUnsignedShort();
					int i_151_ = Class15.inputStream.readInt(true);
					WidgetComponent class38_sub6 = Projectile.method1167(i_151_, i ^ 0x77c0);
					if (class38_sub6.anInt1883 != 1 || i_150_ != class38_sub6.anInt1962) {
						class38_sub6.anInt1962 = i_150_;
						class38_sub6.anInt1883 = 1;
						Class40.method340(class38_sub6, (byte) -105);
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 224) {
					int i_152_ = Entity.anInt3446 + Class15.inputStream.pos;
					int i_153_ = Class15.inputStream.readUnsignedShort();
					int i_154_ = Class15.inputStream.readUnsignedShort();
					if (i_153_ != NodeSub.windowId) {
						NodeSub.windowId = i_153_;
						method1231(i - 30703, NodeSub.windowId);
						Class78.method566(NodeSub.windowId, 60);
						for (int i_155_ = 0; i_155_ < 100; i_155_++)
							Class32.aBoolArray768[i_155_] = true;
					}
					while (i_154_-- > 0) {
						int i_156_ = Class15.inputStream.readInt(true);
						int i_157_ = Class15.inputStream.readUnsignedShort();
						int i_158_ = Class15.inputStream.readUnsignedByte();
						Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method75(i_156_);
						if (class38_sub8 != null && class38_sub8.anInt2038 != i_157_) {
							Class48.method388(true, (byte) -62, class38_sub8);
							class38_sub8 = null;
						}
						if (class38_sub8 == null)
							class38_sub8 = Class60.method454(i_158_, i_157_, i_156_, 22878);
						class38_sub8.aBool2042 = true;
					}
					for (Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method82((byte) 112); class38_sub8 != null; class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method78(59))
						if (!class38_sub8.aBool2042)
							Class48.method388(true, (byte) -112, class38_sub8);
						else
							class38_sub8.aBool2042 = false;
					Entity.aClass14_3514 = new Class14(512);
					while (i_152_ > Class15.inputStream.pos) {
						int i_159_ = Class15.inputStream.readInt(true);
						int i_160_ = Class15.inputStream.readUnsignedShort();
						int i_161_ = Class15.inputStream.readUnsignedShort();
						int i_162_ = Class15.inputStream.readInt(true);
						for (int i_163_ = i_160_; i_161_ >= i_163_; i_163_++) {
							long l = ((long) i_159_ << -241787872) + i_163_;
							Entity.aClass14_3514.method80(true, l, new Class38_Sub11(i_162_));
						}
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 4) {
					Class33.anInt789 = Entity.anInt3513;
					long l = Class15.inputStream.method748(-122);
					if (l == 0L) {
						Class61.aClass19_1331 = null;
						NPC.aClass38_Sub9Array3557 = null;
						Class23.packetId = -1;
						Class59.aClass19_1292 = null;
						Class15.anInt300 = 0;
						return true;
					}
					long l_164_ = Class15.inputStream.method748(i - 30810);
					Class59.aClass19_1292 = Class73.method520(l_164_, 1);
					Class61.aClass19_1331 = Class73.method520(l, 1);
					Class4.aByte79 = Class15.inputStream.readByte((byte) 115);
					int i_165_ = Class15.inputStream.readUnsignedByte();
					if (i_165_ == 255) {
						Class23.packetId = -1;
						return true;
					}
					Class38_Sub9[] class38_sub9s = new Class38_Sub9[100];
					Class15.anInt300 = i_165_;
					for (int i_166_ = 0; i_166_ < Class15.anInt300; i_166_++) {
						class38_sub9s[i_166_] = new Class38_Sub9();
						class38_sub9s[i_166_].aLong898 = Class15.inputStream.method748(-126);
						class38_sub9s[i_166_].aClass19_2061 = Class73.method520(class38_sub9s[i_166_].aLong898, 1);
						class38_sub9s[i_166_].anInt2063 = Class15.inputStream.readUnsignedShort();
						class38_sub9s[i_166_].aByte2056 = Class15.inputStream.readByte((byte) 117);
						if (Class38_Sub1.aLong1737 == class38_sub9s[i_166_].aLong898)
							Class38_Sub20_Sub4.aByte2575 = class38_sub9s[i_166_].aByte2056;
					}
					boolean bool = false;
					int i_167_ = Class15.anInt300;
					while (i_167_ > 0) {
						i_167_--;
						bool = true;
						for (int i_168_ = 0; i_168_ < i_167_; i_168_++)
							if (class38_sub9s[i_168_].aClass19_2061.method141(-39, class38_sub9s[i_168_ + 1].aClass19_2061) > 0) {
								bool = false;
								Class38_Sub9 class38_sub9 = class38_sub9s[i_168_];
								class38_sub9s[i_168_] = class38_sub9s[i_168_ + 1];
								class38_sub9s[i_168_ + 1] = class38_sub9;
							}
						if (bool)
							break;
					}
					NPC.aClass38_Sub9Array3557 = class38_sub9s;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 247) {
					int i_169_ = Class15.inputStream.readUnsignedByte();
					int i_170_ = Class15.inputStream.readUnsignedByte();
					int i_171_ = Class15.inputStream.readUnsignedByte();
					int i_172_ = Class15.inputStream.readUnsignedByte();
					Class20.aBoolArray504[i_169_] = true;
					Class77.anIntArray1512[i_169_] = i_170_;
					Class67.anIntArray1378[i_169_] = i_171_;
					Class32.anIntArray765[i_169_] = i_172_;
					shakingCycle[i_169_] = 0;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 33) {
					Class2_Sub1.anInt2003 = Class15.inputStream.method741(68);
					Class64.anInt1358 = Class15.inputStream.getUByteC();
					while (Class15.inputStream.pos < Entity.anInt3446) {
						Class23.packetId = Class15.inputStream.readUnsignedByte();
						Class60.method452(7);
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 197) {
					Applet_Sub1.method1218((byte) -119);
					Class38_Sub20_Sub3_Sub5.anInt3372 = Class15.inputStream.readUnsignedByte();
					Class23.packetId = -1;
					Class38_Sub20_Sub3_Sub2.anInt3260 = Entity.anInt3513;
					return true;
				}
				if (Class23.packetId == 76) {
					Class38_Sub21.aBool2280 = true;
					Class23.anInt563 = Class15.inputStream.readUnsignedByte();
					Class38_Sub9.anInt2072 = Class15.inputStream.readUnsignedByte();
					Class38_Sub20_Sub15.anInt3071 = Class15.inputStream.readUnsignedShort();
					Class44.anInt1002 = Class15.inputStream.readUnsignedByte();
					Class62.anInt1338 = Class15.inputStream.readUnsignedByte();
					if (Class62.anInt1338 >= 100) {
						int i_173_ = Class23.anInt563 * 128 + 64;
						int i_174_ = Class38_Sub9.anInt2072 * 128 + 64;
						int i_175_ = Class35.method317(-5736, height, i_173_, i_174_) - Class38_Sub20_Sub15.anInt3071;
						int i_176_ = i_175_ - Class38_Sub18.anInt2209;
						int i_177_ = -Class2.anInt30 + i_174_;
						int i_178_ = -Class11.anInt208 + i_173_;
						int i_179_ = (int) Math.sqrt(i_178_ * i_178_ + i_177_ * i_177_);
						Class3.anInt44 = (int) (Math.atan2(i_176_, i_179_) * 325.949) & 0x7ff;
						Entity.anInt3464 = (int) (Math.atan2(i_178_, i_177_) * -325.949) & 0x7ff;
						if (Class3.anInt44 < 128)
							Class3.anInt44 = 128;
						if (Class3.anInt44 > 383)
							Class3.anInt44 = 383;
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 237) {
					int i_180_ = Class15.inputStream.readInt(true);
					Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method75(i_180_);
					if (class38_sub8 != null)
						Class48.method388(true, (byte) -19, class38_sub8);
					if (Class38_Sub2.aClass38_Sub6_1769 != null) {
						Class40.method340(Class38_Sub2.aClass38_Sub6_1769, (byte) -108);
						Class38_Sub2.aClass38_Sub6_1769 = null;
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 130) {
					boolean bool = Class15.inputStream.readUnsignedByte() == 1;
					int i_181_ = Class15.inputStream.readMEInt();
					WidgetComponent class38_sub6 = Projectile.method1167(i_181_, i ^ 0x77c6);
					if (!class38_sub6.aBool1853 != !bool) {
						class38_sub6.aBool1853 = bool;
						Class40.method340(class38_sub6, (byte) -124);
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 46) {
					long l = Class15.inputStream.method748(-114);
					int i_182_ = Class15.inputStream.readUnsignedShort();
					byte i_183_ = Class15.inputStream.readByte((byte) 89);
					boolean bool = false;
					if ((l & ~0x7fffffffffffffffL) != 0L)
						bool = true;
					if (!bool) {
						Class38_Sub9 class38_sub9 = new Class38_Sub9();
						class38_sub9.aLong898 = l;
						class38_sub9.aClass19_2061 = Class73.method520(class38_sub9.aLong898, 1);
						class38_sub9.anInt2063 = i_182_;
						class38_sub9.aByte2056 = i_183_;
						int i_184_;
						for (i_184_ = Class15.anInt300 - 1; i_184_ >= 0; i_184_--) {
							int i_185_ = NPC.aClass38_Sub9Array3557[i_184_].aClass19_2061.method141(-39, class38_sub9.aClass19_2061);
							if (i_185_ == 0) {
								NPC.aClass38_Sub9Array3557[i_184_].anInt2063 = i_182_;
								NPC.aClass38_Sub9Array3557[i_184_].aByte2056 = i_183_;
								if (l == Class38_Sub1.aLong1737)
									Class38_Sub20_Sub4.aByte2575 = i_183_;
								Class33.anInt789 = Entity.anInt3513;
								Class23.packetId = -1;
								return true;
							}
							if (i_185_ < 0)
								break;
						}
						if (Class15.anInt300 >= NPC.aClass38_Sub9Array3557.length) {
							Class23.packetId = -1;
							return true;
						}
						for (int i_186_ = Class15.anInt300 - 1; i_184_ < i_186_; i_186_--)
							NPC.aClass38_Sub9Array3557[i_186_ + 1] = NPC.aClass38_Sub9Array3557[i_186_];
						if (Class15.anInt300 == 0)
							NPC.aClass38_Sub9Array3557 = new Class38_Sub9[100];
						NPC.aClass38_Sub9Array3557[i_184_ + 1] = class38_sub9;
						if (l == Class38_Sub1.aLong1737)
							Class38_Sub20_Sub4.aByte2575 = i_183_;
						Class15.anInt300++;
					} else {
						if (Class15.anInt300 == 0) {
							Class23.packetId = -1;
							return true;
						}
						boolean bool_187_ = false;
						l &= 0x7fffffffffffffffL;
						int i_188_;
						for (i_188_ = 0; Class15.anInt300 > i_188_; i_188_++)
							if (NPC.aClass38_Sub9Array3557[i_188_].aLong898 == l && i_182_ == NPC.aClass38_Sub9Array3557[i_188_].anInt2063)
								break;
						if (Class15.anInt300 > i_188_) {
							for (/**/; i_188_ < Class15.anInt300 - 1; i_188_++)
								NPC.aClass38_Sub9Array3557[i_188_] = NPC.aClass38_Sub9Array3557[i_188_ + 1];
							Class15.anInt300--;
							NPC.aClass38_Sub9Array3557[Class15.anInt300] = null;
						}
					}
					Class33.anInt789 = Entity.anInt3513;
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 45) {
					int i_189_ = Class15.inputStream.readUnsignedByteC(13285);
					int i_190_ = Class15.inputStream.getUByteC();
					int i_191_ = Class15.inputStream.method741(107);
					height = i_189_ >> -180644607;
					myPlayer.updatePosition(i_190_, i_191_, (i_189_ & 0x1) == 1);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 5) {
					int i_192_ = Class15.inputStream.readUnsignedShort();
					int i_193_ = i_192_ >> 1034379978 & 0x1f;
					int i_194_ = Class15.inputStream.method730(i ^ 0x77bf);
					int i_195_ = i_192_ & 0x1f;
					int i_196_ = i_192_ >> 1790679013 & 0x1f;
					WidgetComponent class38_sub6 = Projectile.method1167(i_194_, -114);
					int i_197_ = (i_196_ << -641268565) + (i_193_ << -1817172877) + (i_195_ << -190164253);
					if (class38_sub6.anInt1889 != i_197_) {
						class38_sub6.anInt1889 = i_197_;
						Class40.method340(class38_sub6, (byte) -116);
					}
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 231) {
					Class38_Sub20_Sub17.sendMapRegion(false, (byte) 112);
					Class23.packetId = -1;
					return true;
				}
				if (Class23.packetId == 115) {
					Class64.anInt1358 = Class15.inputStream.getUByteC();
					Class2_Sub1.anInt2003 = Class15.inputStream.method741(105);
					Class23.packetId = -1;
					return true;
				}
				Class38_Sub20_Sub2.method813(null, "T1 - " + Class23.packetId + "," + Class15.anInt280 + "," + Class38_Sub20_Sub8.anInt2864 + " - " + Entity.anInt3446, 95);
				Class41.method350(-10015);
			} catch (java.io.IOException ioexception) {
				Client.dropClient();
			} catch (Exception exception) {
				String string = "T2 - " + Class23.packetId + "," + Class15.anInt280 + "," + Class38_Sub20_Sub8.anInt2864 + " - " + Entity.anInt3446 + "," + (currentBaseY + myPlayer.walkQueueX[0]) + "," + (currentBaseX + myPlayer.walkQueueY[0]) + " - ";
				for (int i_198_ = 0; Entity.anInt3446 > i_198_ && i_198_ < 50; i_198_++)
					string += Class15.inputStream.buffer[i_198_] + ",";
				Class38_Sub20_Sub2.method813(exception, string, 95);
				Class41.method350(-10015);
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "mb.C(" + i + ')');
		}
	}

	static final boolean calculatePath(boolean arbitraryDestinationFlag, int i, int fromLocalY, int objectType, int i_25_, int toLocalX, int fromLocalX, int objectFace, int toLocalY, int i_30_, int clickType) {
		for (int x = 0; x < 104; x++)
			for (int y = 0; y < 104; y++) {
				wayPoints[x][y] = 0;
				distanceValues[x][y] = 99999999;
			}
		wayPoints[fromLocalX][fromLocalY] = 99;
		distanceValues[fromLocalX][fromLocalY] = 0;
		int currentX = fromLocalX;
		int currentY = fromLocalY;
		int currentIndex = 0;
		int nextIndex = 0;
		walkingQueueX[nextIndex] = fromLocalX;
		boolean foundDestination = false;
		walkingQueueY[nextIndex++] = fromLocalY;
		int maxPathSize = walkingQueueX.length;
		int[][] clippingFlags = clippingHeights[height].clippingFlags;
		while (nextIndex != currentIndex) {
			currentY = walkingQueueY[currentIndex];
			currentX = walkingQueueX[currentIndex];
			currentIndex = (currentIndex + 1) % maxPathSize;
			if (toLocalX == currentX && toLocalY == currentY) {
				foundDestination = true;
				break;
			}
			if (objectType != 0)
				if (objectType >= 5 && objectType != 10 || !clippingHeights[height].method537(i, -4573, toLocalY, currentY, toLocalX, objectType - 1, currentX)) {
					if (objectType < 10 && clippingHeights[height].method522(-92, toLocalX, objectType - 1, i, currentX, currentY, toLocalY)) {
						foundDestination = true;
						break;
					}
				} else {
					foundDestination = true;
					break;
				}
			if (i_30_ != 0 && i_25_ != 0 && clippingHeights[height].reachedFacingObject(currentY, i_30_, i_25_, currentX, toLocalY, toLocalX, objectFace, (byte) 5)) {
				foundDestination = true;
				break;
			}
			int newDistanceValue = distanceValues[currentX][currentY] + 1;
			if (currentX > 0 && wayPoints[currentX - 1][currentY] == 0 && (clippingFlags[currentX - 1][currentY] & 0x12c0108) == 0) {
				walkingQueueX[nextIndex] = currentX - 1;
				walkingQueueY[nextIndex] = currentY;
				nextIndex = (nextIndex + 1) % maxPathSize;
				wayPoints[currentX - 1][currentY] = 2;
				distanceValues[currentX - 1][currentY] = newDistanceValue;
			}
			if (currentX < 103 && wayPoints[currentX + 1][currentY] == 0 && (clippingFlags[currentX + 1][currentY] & 0x12c0180) == 0) {
				walkingQueueX[nextIndex] = currentX + 1;
				walkingQueueY[nextIndex] = currentY;
				nextIndex = (nextIndex + 1) % maxPathSize;
				wayPoints[currentX + 1][currentY] = 8;
				distanceValues[currentX + 1][currentY] = newDistanceValue;
			}
			if (currentY > 0 && wayPoints[currentX][currentY - 1] == 0 && (clippingFlags[currentX][currentY - 1] & 0x12c0102) == 0) {
				walkingQueueX[nextIndex] = currentX;
				walkingQueueY[nextIndex] = currentY - 1;
				wayPoints[currentX][currentY - 1] = 1;
				distanceValues[currentX][currentY - 1] = newDistanceValue;
				nextIndex = (nextIndex + 1) % maxPathSize;
			}
			if (currentY < 103 && wayPoints[currentX][currentY + 1] == 0 && (clippingFlags[currentX][currentY + 1] & 0x12c0120) == 0) {
				walkingQueueX[nextIndex] = currentX;
				walkingQueueY[nextIndex] = currentY + 1;
				nextIndex = (nextIndex + 1) % maxPathSize;
				wayPoints[currentX][currentY + 1] = 4;
				distanceValues[currentX][currentY + 1] = newDistanceValue;
			}
			if (currentX > 0 && currentY > 0 && wayPoints[currentX - 1][currentY - 1] == 0 && (clippingFlags[currentX - 1][currentY - 1] & 0x12c010e) == 0 && (clippingFlags[currentX - 1][currentY] & 0x12c0108) == 0 && (clippingFlags[currentX][currentY - 1] & 0x12c0102) == 0) {
				walkingQueueX[nextIndex] = currentX - 1;
				walkingQueueY[nextIndex] = currentY - 1;
				wayPoints[currentX - 1][currentY - 1] = 3;
				nextIndex = (nextIndex + 1) % maxPathSize;
				distanceValues[currentX - 1][currentY - 1] = newDistanceValue;
			}
			if (currentX < 103 && currentY > 0 && wayPoints[currentX + 1][currentY - 1] == 0 && (clippingFlags[currentX + 1][currentY - 1] & 0x12c0183) == 0 && (clippingFlags[currentX + 1][currentY] & 0x12c0180) == 0 && (clippingFlags[currentX][currentY - 1] & 0x12c0102) == 0) {
				walkingQueueX[nextIndex] = currentX + 1;
				walkingQueueY[nextIndex] = currentY - 1;
				wayPoints[currentX + 1][currentY - 1] = 9;
				distanceValues[currentX + 1][currentY - 1] = newDistanceValue;
				nextIndex = (nextIndex + 1) % maxPathSize;
			}
			if (currentX > 0 && currentY < 103 && wayPoints[currentX - 1][currentY + 1] == 0 && (clippingFlags[currentX - 1][currentY + 1] & 0x12c0138) == 0 && (clippingFlags[currentX - 1][currentY] & 0x12c0108) == 0 && (clippingFlags[currentX][currentY + 1] & 0x12c0120) == 0) {
				walkingQueueX[nextIndex] = currentX - 1;
				walkingQueueY[nextIndex] = currentY + 1;
				nextIndex = (nextIndex + 1) % maxPathSize;
				wayPoints[currentX - 1][currentY + 1] = 6;
				distanceValues[currentX - 1][currentY + 1] = newDistanceValue;
			}
			if (currentX < 103 && currentY < 103 && wayPoints[currentX + 1][currentY + 1] == 0 && (clippingFlags[currentX + 1][currentY + 1] & 0x12c01e0) == 0 && (clippingFlags[currentX + 1][currentY] & 0x12c0180) == 0 && (clippingFlags[currentX][currentY + 1] & 0x12c0120) == 0) {
				walkingQueueX[nextIndex] = currentX + 1;
				walkingQueueY[nextIndex] = currentY + 1;
				wayPoints[currentX + 1][currentY + 1] = 12;
				nextIndex = (nextIndex + 1) % maxPathSize;
				distanceValues[currentX + 1][currentY + 1] = newDistanceValue;
			}
		}
		arbitraryDestination = 0;
		if (!foundDestination)
			if (arbitraryDestinationFlag) {
				int i_41_ = 1000;
				int maxStepsNonInclusive = 100;
				int deviation = 10;
				for (int xDeviation = toLocalX - deviation; xDeviation <= deviation + toLocalX; xDeviation++)
					for (int yDeviation = -deviation + toLocalY; toLocalY + deviation >= yDeviation; yDeviation++)
						if (xDeviation >= 0 && yDeviation >= 0 && xDeviation < 104 && yDeviation < 104 && distanceValues[xDeviation][yDeviation] < 100) {
							int i_46_ = 0;
							if (yDeviation < toLocalY)
								i_46_ = -yDeviation + toLocalY;
							else if (yDeviation > i_25_ + toLocalY - 1)
								i_46_ = yDeviation + 1 - (toLocalY + i_25_);
							int i_47_ = 0;
							if (xDeviation < toLocalX)
								i_47_ = toLocalX - xDeviation;
							else if (xDeviation > toLocalX + i_30_ - 1)
								i_47_ = 1 - i_30_ - (toLocalX - xDeviation);
							int i_48_ = i_46_ * i_46_ + i_47_ * i_47_;
							if (i_41_ > i_48_ || i_48_ == i_41_ && maxStepsNonInclusive > distanceValues[xDeviation][yDeviation]) {
								currentX = xDeviation;
								currentY = yDeviation;
								i_41_ = i_48_;
								maxStepsNonInclusive = distanceValues[xDeviation][yDeviation];
							}
						}
				if (i_41_ == 1000)
					return false;
				if (currentX == fromLocalX && currentY == fromLocalY)
					return false;
				arbitraryDestination = 1;
			} else
				return false;
		currentIndex = 0;
		walkingQueueX[currentIndex] = currentX;
		walkingQueueY[currentIndex++] = currentY;
		int initialSkipCheck;
		int wayPoint = initialSkipCheck = wayPoints[currentX][currentY];
		while (currentX != fromLocalX || currentY != fromLocalY) {
			if (initialSkipCheck != wayPoint) {
				initialSkipCheck = wayPoint;
				walkingQueueX[currentIndex] = currentX;
				walkingQueueY[currentIndex++] = currentY;
			}
			if ((wayPoint & 0x2) == 0) {
				if ((wayPoint & 0x8) != 0)
					currentX--;
			} else
				currentX++;
			if ((wayPoint & 0x1) != 0)
				currentY++;
			else if ((wayPoint & 0x4) != 0)
				currentY--;
			wayPoint = wayPoints[currentX][currentY];
		}
		if (currentIndex > 0) {
			maxPathSize = currentIndex;
			currentIndex--;
			int localY = walkingQueueY[currentIndex];
			int localX = walkingQueueX[currentIndex];
			if (maxPathSize > 25)
				maxPathSize = 25;
			if (clickType == 0) { // minimap click
				outputBuffer.putOpcode(184);
				outputBuffer.putByte(maxPathSize + 3 + maxPathSize);
			}
			if (clickType == 1) { // main screen click
				outputBuffer.putOpcode(24);
				outputBuffer.putByte(maxPathSize + maxPathSize + 17);
			}
			if (clickType == 2) { // object click
				outputBuffer.putOpcode(110);
				outputBuffer.putByte(maxPathSize + 3 + maxPathSize);
			}
			outputBuffer.putLEShortA(localX + currentBaseY);
			destX = walkingQueueX[0];
			destY = walkingQueueY[0];
			for (int id = 1; maxPathSize > id; id++) {
				currentIndex--;
				outputBuffer.writeByteC(-localX + walkingQueueX[currentIndex]);
				outputBuffer.putByteA(-localY + walkingQueueY[currentIndex]);
			}
			outputBuffer.writeByteC(heldKeys[82] ? 1 : 0);
			outputBuffer.putShort(localY + currentBaseX);
			return true;
		}
		if (clickType == 1)
			return false;
		return true;
	}

	static final int keyboardIdleTime() {
		return keyboardIdleTime++;
	}

	static final int mouseIdleTime() {
		return mouseIdleTime++;
	}

	static final void setMouseIdleTime(int time) {
		mouseIdleTime = time;
	}

	public static final void main(String[] strings) {
		try {
			try {
				strings = new String[7];
				strings[0] = "1";
				strings[1] = "live";
				strings[2] = "live";
				strings[3] = "highmem";
				strings[4] = "members";
				strings[5] = "english";
				strings[6] = "game0";
				if (strings.length != 7)
					Class41.method344(10649);
				Class23.anInt556 = Integer.parseInt(strings[0]);
				if (strings[1].equals("live"))
					Player.anInt3582 = 0;
				else if (!strings[1].equals("office")) {
					if (!strings[1].equals("local"))
						Class41.method344(10649);
					else
						Player.anInt3582 = 2;
				} else
					Player.anInt3582 = 1;
				if (strings[2].equals("live"))
					ObjectDefinition.anInt2464 = 0;
				else if (strings[2].equals("rc"))
					ObjectDefinition.anInt2464 = 1;
				else if (strings[2].equals("wip"))
					ObjectDefinition.anInt2464 = 2;
				else
					Class41.method344(10649);
				if (!strings[3].equals("lowmem")) {
					if (strings[3].equals("highmem"))
						Class38_Sub20_Sub11.method985((byte) -91);
					else
						Class41.method344(10649);
				} else
					Class38_Sub8.method660(69);
				if (!strings[4].equals("free")) {
					if (!strings[4].equals("members"))
						Class41.method344(10649);
					else
						Node.aBool889 = true;
				} else
					Node.aBool889 = false;
				if (!strings[5].equals("english")) {
					if (strings[5].equals("german")) {
						Class5.method32(false);
						Class64.anInt1361 = 1;
						Class38_Sub22.aClass19_2310 = Class21.aClass19_514;
					} else
						Class41.method344(10649);
				} else
					Class64.anInt1361 = 0;
				if (strings[6].equals("game0"))
					Class38_Sub4.anInt1808 = 0;
				else if (strings[6].equals("game1"))
					Class38_Sub4.anInt1808 = 1;
				else
					Class41.method344(10649);
				Class26.aString611 = "127.0.0.1";
				Client var_client = new Client();
				var_client.method1212(16, 1, 468, "runescape", 765, 503, 32 + ObjectDefinition.anInt2464);
			} catch (Exception exception) {
				Class38_Sub20_Sub2.method813(exception, null, 95);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "client.main(" + (strings != null ? "{...}" : "null") + ')');
		}
	}

	static final void method1231(int i, int i_32_) {
		try {
			if (Class22.loadWidget(i_32_)) {
				WidgetComponent[] class38_sub6s = Class62.widgets[i_32_];
				for (int i_33_ = i; i_33_ < class38_sub6s.length; i_33_++) {
					WidgetComponent class38_sub6 = class38_sub6s[i_33_];
					if (class38_sub6 != null) {
						class38_sub6.anInt1875 = 0;
						class38_sub6.anInt1952 = 0;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "client.W(" + i + ',' + i_32_ + ')');
		}
	}

	static {
		Client.anInt3641 = 0;
		Client.anInt3652 = 0;
		Client.aClass83_3646 = new Class83(64);
	}
}
