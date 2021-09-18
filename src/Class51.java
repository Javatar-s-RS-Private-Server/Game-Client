/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class51 {
	static int anInt1121;
	static RSString password;
	static long[] aLongArray1123 = new long[100];
	static RSString aClass19_1124;
	static int[] anIntArray1125 = new int[32];
	static RSString aClass19_1126;
	static RSString aClass19_1127;
	static long aLong1128;
	static int[] anIntArray1130;
	static int[] anIntArray1131;
	static RSString aClass19_1132 = RSString.createRSString("");
	static RSString username = Class51.aClass19_1132;
	static Class38_Sub20_Sub9_Sub2[] aClass38_Sub20_Sub9_Sub2Array1136;
	static RSString aClass19_1137;
	static RSString aClass19_1138;
	private static RSString aClass19_1134 = RSString.createRSString("Malformed login packet)3");

	static {
		Class51.aClass19_1124 = Class51.aClass19_1132;
		Class51.anInt1121 = 1;
		Class51.aClass19_1126 = Class51.aClass19_1132;
		Class51.aClass19_1137 = Class51.aClass19_1134;
		Class51.aClass19_1127 = Class51.aClass19_1132;
		Class51.password = Class51.aClass19_1132;
		Class51.aClass19_1138 = Class51.aClass19_1132;
	}

	static final RSString method402(int i, byte i_0_) {
		try {
			if (i < 100000)
				return Class9.method43(new RSString[] { Class44.aClass19_1010, RuntimeException_Sub1.method1098(i, 0), Class2_Sub1.aClass19_2002 }, (byte) -20);
			if (i < 10000000)
				return Class9.method43(new RSString[] { Class38_Sub20_Sub7.aClass19_2853, RuntimeException_Sub1.method1098(i / 1000, 0), Class29.aClass19_700, Class2_Sub1.aClass19_2002 }, (byte) -20);
			int i_1_ = -13 % ((i_0_ - 54) / 48);
			return Class9.method43(new RSString[] { Class4.aClass19_84, RuntimeException_Sub1.method1098(i / 1000000, 0), Class17_Sub1.aClass19_1716, Class2_Sub1.aClass19_2002 }, (byte) -20);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ke.B(" + i + ',' + i_0_ + ')');
		}
	}

	static final void method403(Class17 class17, int i, boolean bool, Class17 class17_2_) {
		try {
			Class26.aClass17_600 = class17_2_;
			if (i < 54)
				Class51.method404((byte) 97);
			Class38_Sub9.objectLowMem = bool;
			Class72.aClass17_1408 = class17;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ke.C(" + (class17 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class17_2_ != null ? "{...}" : "null") + ')');
		}
	}

	static final void method404(byte i) {
		if (client.logoutTimer > 0)
			client.logoutTimer--;
		if (client.systemUpdateTime > 1)
			client.systemUpdateTime--;
		if (client.errorPinging) {
			client.errorPinging = false;
			client.dropClient();
		} else {
			for (int id = 0; id < 100; id++)
				if (!client.parsePacket(30703))
					break;
			if (Class48.anInt1069 == 30) {
				Sequence.method911((byte) 7, 183, client.secureBuffer);
				synchronized (client.mouseRecorder.lock) {
					if (client.flagged) {
						if (client.lastMouseAction != 0 || client.mouseRecorder.cacheIndex >= 40) {
							int sentCoords = 0;
							client.secureBuffer.putOpcode(119);
							client.secureBuffer.putByte(0);
							int offset = client.secureBuffer.pos;
							for (int id = 0; id < client.mouseRecorder.cacheIndex; id++) {
								if (client.secureBuffer.pos - offset >= 240)
									break;
								sentCoords++;
								int y = client.mouseRecorder.mouseYCache[id];
								int x = client.mouseRecorder.mouseXCache[id];
								if (y >= 0) {
									if (y > 502)
										y = 502;
								} else
									y = 0;
								if (x >= 0) {
									if (x > 764)
										x = 764;
								} else
									x = 0;
								int coords = y * 765 + x;
								if (client.mouseRecorder.mouseYCache[id] == -1 && client.mouseRecorder.mouseXCache[id] == -1) {
									coords = 524287;
									x = -1;
									y = -1;
								}
								if (client.lastCoordX == x && y == client.lastCoordY) {
									if (client.coordCounter < 2047)
										client.coordCounter++;
								} else {
									int xDiff = -client.lastCoordX + x;
									client.lastCoordX = x;
									int yDiff = -client.lastCoordY + y;
									client.lastCoordY = y;
									if (client.coordCounter < 8 && xDiff >= -32 && xDiff <= 31 && yDiff >= -32 && yDiff <= 31) {
										xDiff += 32;
										yDiff += 32;
										client.secureBuffer.putShort(yDiff + (client.coordCounter << 12) + (xDiff << 6));
										client.coordCounter = 0;
									} else if (client.coordCounter < 8) {
										client.secureBuffer.method771(-31368, (client.coordCounter << 19) + 8388608 + coords);
										client.coordCounter = 0;
									} else {
										client.secureBuffer.putInt(coords + (client.coordCounter << 19) - 1073741824);
										client.coordCounter = 0;
									}
								}
							}
							client.secureBuffer.putSizedByte(-offset + client.secureBuffer.pos);
							if (client.mouseRecorder.cacheIndex <= sentCoords)
								client.mouseRecorder.cacheIndex = 0;
							else {
								client.mouseRecorder.cacheIndex -= sentCoords;
								for (int id = 0; client.mouseRecorder.cacheIndex > id; id++) {
									client.mouseRecorder.mouseXCache[id] = client.mouseRecorder.mouseXCache[id + sentCoords];
									client.mouseRecorder.mouseYCache[id] = client.mouseRecorder.mouseYCache[sentCoords + id];
								}
							}
						}
					} else
						client.mouseRecorder.cacheIndex = 0;
				}
				if (client.lastMouseAction != 0) {
					long time = (client.lastClickTime + -client.lastlastClickTime) / 50L;
					if (time > 4095L)
						time = 4095L;
					client.lastlastClickTime = client.lastClickTime;
					int x = Class73.anInt1429;
					int y = RS2Buffer.anInt2416;
					if (x < 0)
						x = 0;
					else if (x > 764)
						x = 764;
					int button = 0;
					if (client.lastMouseAction == 2)
						button = 1;
					client.secureBuffer.putOpcode(242);
					int timeAsInt = (int) time;
					if (y < 0)
						y = 0;
					else if (y > 502)
						y = 502;
					int coords = y * 765 + x;
					client.secureBuffer.putInt((timeAsInt << 20) + (button << 19) + coords);
				}
				if (client.cameraPacketDelay > 0)
					client.cameraPacketDelay--;
				if (client.heldKeys[96] || client.heldKeys[97] || client.heldKeys[98] || client.heldKeys[99])
					client.holdingArrowKeys = true;
				if (client.holdingArrowKeys && client.cameraPacketDelay <= 0) {
					client.holdingArrowKeys = false;
					client.cameraPacketDelay = 20;
					client.secureBuffer.putOpcode(211);
					client.secureBuffer.putLEShortA(Class38_Sub20_Sub11.anInt2930);
					client.secureBuffer.putLEShortA(Class38_Sub20_Sub11.anInt2958);
				}
				if (client.awtFocused && !client.windowFocused == true) {
					Class38_Sub11.anInt2084++;
					client.windowFocused = true;
					client.secureBuffer.putOpcode(177);
					client.secureBuffer.putByte(1);
				}
				if (client.awtFocused != true && !client.windowFocused != true) {
					client.windowFocused = false;
					Class38_Sub11.anInt2084++;
					client.secureBuffer.putOpcode(177);
					client.secureBuffer.putByte(0);
				}
				Class38_Sub20_Sub14.method1002((byte) -66);
				if (Class48.anInt1069 == 30) {
					Class41.method348(25682);
					Class64.method474(false);
					Class38_Sub20_Sub8.anInt2857++;
					if (Class38_Sub20_Sub8.anInt2857 > 750)
						client.dropClient();
					else {
						Class79.method575((byte) 97);
						if (i > -109)
							Class51.method402(-72, (byte) -35);
						Class38_Sub19.method704(-93);
						Class38_Sub2.method617(-17471);
						if (client.crossState != 0) {
							client.crossIndex += 20;
							if (client.crossIndex >= 400)
								client.crossState = 0;
						}
						Canvas_Sub1.anInt2529++;
						if (client.atInventoryInterfaceType != null) {
							client.redrawTimer++;
							if (client.redrawTimer >= 15) {
								Class40.method340(client.atInventoryInterfaceType, (byte) -127);
								client.atInventoryInterfaceType = null;
							}
						}
						if (Class38_Sub20_Sub8.aClass38_Sub6_2877 != null) {
							Class40.method340(Class38_Sub20_Sub8.aClass38_Sub6_2877, (byte) -111);
							Class10.anInt188++;
							if (Class75.anInt1475 + 5 < Class23.anInt543 || Class75.anInt1475 - 5 > Class23.anInt543 || Class45.anInt1015 > Class44.anInt988 + 5 || Class45.anInt1015 < Class44.anInt988 - 5)
								Class52.aBool1143 = true;
							if (Class23.anInt558 == 0) {
								if (Class52.aBool1143 && Class10.anInt188 >= 5) {
									if (Class38_Sub20_Sub8.aClass38_Sub6_2877 == Class2.aClass38_Sub6_27 && Class38_Sub3.anInt1786 != Class73_Sub2.anInt2287) {
										Class38_Sub6 class38_sub6 = Class38_Sub20_Sub8.aClass38_Sub6_2877;
										int i_18_ = 0;
										if (Class67.anInt1380 == 1 && class38_sub6.anInt1958 == 206)
											i_18_ = 1;
										if (class38_sub6.anIntArray1947[Class73_Sub2.anInt2287] <= 0)
											i_18_ = 0;
										if (!Class37.method322(16777215, Class30.method283(-128, class38_sub6))) {
											if (i_18_ != 1)
												class38_sub6.method644(Class73_Sub2.anInt2287, true, Class38_Sub3.anInt1786);
											else {
												int i_19_ = Class73_Sub2.anInt2287;
												int i_20_ = Class38_Sub3.anInt1786;
												while (i_19_ != i_20_)
													if (i_20_ <= i_19_) {
														if (i_20_ < i_19_) {
															class38_sub6.method644(i_20_ + 1, true, i_20_);
															i_20_++;
														}
													} else {
														class38_sub6.method644(i_20_ - 1, true, i_20_);
														i_20_--;
													}
											}
										} else {
											int i_21_ = Class73_Sub2.anInt2287;
											int i_22_ = Class38_Sub3.anInt1786;
											class38_sub6.anIntArray1947[i_21_] = class38_sub6.anIntArray1947[i_22_];
											class38_sub6.anIntArray1866[i_21_] = class38_sub6.anIntArray1866[i_22_];
											class38_sub6.anIntArray1947[i_22_] = -1;
											class38_sub6.anIntArray1866[i_22_] = 0;
										}
										client.secureBuffer.putOpcode(56);
										client.secureBuffer.method769(Class73_Sub2.anInt2287, 122);
										client.secureBuffer.putByteC(i_18_);
										client.secureBuffer.method774(8, Class38_Sub20_Sub8.aClass38_Sub6_2877.anInt1856);
										client.secureBuffer.method767(-25680, Class38_Sub3.anInt1786);
									}
								} else if (Class42.anInt949 != 1 && !RSString.method140((byte) 93, Class72.anInt1417 - 1) || Class72.anInt1417 <= 2) {
									if (Class72.anInt1417 > 0)
										Class53.method416(80, Class72.anInt1417 - 1);
								} else
									Class50.method401(-5560);
								Class38_Sub20_Sub8.aClass38_Sub6_2877 = null;
								client.redrawTimer = 10;
								client.lastMouseAction = 0;
							}
						}
						Class21.aBool524 = false;
						ObjectDefinition.anInt2496 = 0;
						Class67.aClass38_Sub6_1381 = null;
						Class76.aBool1491 = false;
						Class38_Sub6 class38_sub6 = Class38_Sub2.aClass38_Sub6_1774;
						Class38_Sub2.aClass38_Sub6_1774 = null;
						Class38_Sub6 class38_sub6_23_ = Class54.aClass38_Sub6_1186;
						Class54.aClass38_Sub6_1186 = null;
						for (/**/; Class32.method300((byte) -125) && ObjectDefinition.anInt2496 < 128; ObjectDefinition.anInt2496++) {
							Class38_Sub18.anIntArray2223[ObjectDefinition.anInt2496] = NodeSub.anInt2256;
							Class55.anIntArray1227[ObjectDefinition.anInt2496] = Class10.anInt181;
						}
						Projectile.method1168(NodeSub.anInt2252, 0, 0, 503, 0, 765, 0, 0);
						Entity.anInt3513++;
						for (;;) {
							Class38_Sub19 class38_sub19 = (Class38_Sub19) NPC.aClass13_3546.method69((byte) -42);
							if (class38_sub19 == null)
								break;
							Class38_Sub6 class38_sub6_24_ = class38_sub19.aClass38_Sub6_2241;
							if (class38_sub6_24_.anInt1941 >= 0) {
								Class38_Sub6 class38_sub6_25_ = Projectile.method1167(class38_sub6_24_.anInt1977, 112);
								if (class38_sub6_25_ == null || class38_sub6_25_.aClass38_Sub6Array1867 == null || class38_sub6_24_.anInt1941 >= class38_sub6_25_.aClass38_Sub6Array1867.length || class38_sub6_24_ != class38_sub6_25_.aClass38_Sub6Array1867[class38_sub6_24_.anInt1941])
									continue;
							}
							Class15.method84(class38_sub19, (byte) -89);
						}
						for (;;) {
							Class38_Sub19 class38_sub19 = (Class38_Sub19) Class60.aClass13_1304.method69((byte) -52);
							if (class38_sub19 == null)
								break;
							Class38_Sub6 class38_sub6_26_ = class38_sub19.aClass38_Sub6_2241;
							if (class38_sub6_26_.anInt1941 >= 0) {
								Class38_Sub6 class38_sub6_27_ = Projectile.method1167(class38_sub6_26_.anInt1977, -101);
								if (class38_sub6_27_ == null || class38_sub6_27_.aClass38_Sub6Array1867 == null || class38_sub6_27_.aClass38_Sub6Array1867.length <= class38_sub6_26_.anInt1941 || class38_sub6_27_.aClass38_Sub6Array1867[class38_sub6_26_.anInt1941] != class38_sub6_26_)
									continue;
							}
							Class15.method84(class38_sub19, (byte) -93);
						}
						for (;;) {
							Class38_Sub19 class38_sub19 = (Class38_Sub19) Class55.aClass13_1215.method69((byte) 100);
							if (class38_sub19 == null)
								break;
							Class38_Sub6 class38_sub6_28_ = class38_sub19.aClass38_Sub6_2241;
							if (class38_sub6_28_.anInt1941 >= 0) {
								Class38_Sub6 class38_sub6_29_ = Projectile.method1167(class38_sub6_28_.anInt1977, -100);
								if (class38_sub6_29_ == null || class38_sub6_29_.aClass38_Sub6Array1867 == null || class38_sub6_29_.aClass38_Sub6Array1867.length <= class38_sub6_28_.anInt1941 || class38_sub6_28_ != class38_sub6_29_.aClass38_Sub6Array1867[class38_sub6_28_.anInt1941])
									continue;
							}
							Class15.method84(class38_sub19, (byte) -95);
						}
						if (Class15.aClass38_Sub6_293 != null)
							Class41.method349(2);
						if (SceneGraph.mouseOverX != -1) {
							int x = SceneGraph.mouseOverX;
							int y = SceneGraph.mouseOverY;
							boolean cross = client.calculatePath(true, 0, client.myPlayer.walkQueueY[0], 0, 0, x, client.myPlayer.walkQueueX[0], 0, y, 0, 0);
							SceneGraph.mouseOverX = -1;
							if (cross) {
								client.crossIndex = 0;
								Class38_Sub4.anInt1827 = RS2Buffer.anInt2416;
								client.crossState = 1;
								Class21.anInt523 = Class73.anInt1429;
							}
						}
						Class38_Sub4.method623((byte) -74);
						if (class38_sub6 != Class38_Sub2.aClass38_Sub6_1774) {
							if (class38_sub6 != null)
								Class40.method340(class38_sub6, (byte) -121);
							if (Class38_Sub2.aClass38_Sub6_1774 != null)
								Class40.method340(Class38_Sub2.aClass38_Sub6_1774, (byte) -126);
						}
						if (Class54.aClass38_Sub6_1186 != class38_sub6_23_ && Class38_Sub11.anInt2104 == Class38_Sub14.anInt2144) {
							if (class38_sub6_23_ != null)
								Class40.method340(class38_sub6_23_, (byte) -100);
							if (Class54.aClass38_Sub6_1186 != null)
								Class40.method340(Class54.aClass38_Sub6_1186, (byte) -112);
						}
						if (Class54.aClass38_Sub6_1186 != null) {
							if (Class38_Sub14.anInt2144 > Class38_Sub11.anInt2104) {
								Class38_Sub11.anInt2104++;
								if (Class38_Sub11.anInt2104 == Class38_Sub14.anInt2144)
									Class40.method340(Class54.aClass38_Sub6_1186, (byte) -114);
							}
						} else if (Class38_Sub11.anInt2104 > 0)
							Class38_Sub11.anInt2104--;
						Class47.method381(true);
						if (Class38_Sub21.aBool2280)
							Class13.method67(false);
						for (int id = 0; id < 5; id++)
							client.shakingCycle[id]++;
						int mit = client.mouseIdleTime();
						int kit = client.keyboardIdleTime();
						if (mit > 4500 && kit > 4500) {
							client.logoutTimer = 250;
							client.setMouseIdleTime(4000);
							client.secureBuffer.putOpcode(13);
						}
						Class83.anInt1679++;
						Class35.anInt816++;
						client.pingTimer++;
						if (Class35.anInt816 > 500) {
							Class35.anInt816 = 0;
							int i_35_ = (int) (Math.random() * 8.0);
							if ((i_35_ & 0x2) == 2)
								NodeSub.anInt2257 += Class17.anInt357;
							if ((i_35_ & 0x4) == 4)
								Class55.anInt1212 += Class55.anInt1233;
							if ((i_35_ & 0x1) == 1)
								Class38_Sub20_Sub11.anInt2943 += Class38_Sub20_Sub16.anInt3088;
						}
						if (Class55.anInt1212 < -40)
							Class55.anInt1233 = 1;
						if (Class83.anInt1679 > 500) {
							Class83.anInt1679 = 0;
							int i_36_ = (int) (Math.random() * 8.0);
							if ((i_36_ & 0x1) == 1)
								Class21.anInt517 += Class38_Sub20_Sub8.anInt2855;
							if ((i_36_ & 0x2) == 2)
								Class38_Sub7.anInt2027 += Class80.anInt1605;
						}
						if (Class38_Sub20_Sub11.anInt2943 < -50)
							Class38_Sub20_Sub16.anInt3088 = 2;
						if (Class38_Sub7.anInt2027 < -20)
							Class80.anInt1605 = 1;
						if (Class38_Sub7.anInt2027 > 10)
							Class80.anInt1605 = -1;
						if (Class38_Sub20_Sub11.anInt2943 > 50)
							Class38_Sub20_Sub16.anInt3088 = -2;
						if (Class55.anInt1212 > 40)
							Class55.anInt1233 = -1;
						if (NodeSub.anInt2257 < -55)
							Class17.anInt357 = 2;
						if (NodeSub.anInt2257 > 55)
							Class17.anInt357 = -2;
						if (Class21.anInt517 < -60)
							Class38_Sub20_Sub8.anInt2855 = 2;
						if (Class21.anInt517 > 60)
							Class38_Sub20_Sub8.anInt2855 = -2;
						if (client.pingTimer > 50) {
							client.secureBuffer.putOpcode(232);
							Class78.anInt1545++;
						}
						try {
							if (client.worldConnection != null || client.secureBuffer.pos > 0) {
								client.worldConnection.write(client.secureBuffer.buffer, client.secureBuffer.pos, (byte) 126);
								client.secureBuffer.pos = 0;
								client.pingTimer = 0;
							}
						} catch (java.io.IOException ioexception) {
							client.dropClient();
						}
					}
				}
			}
		}
	}

	public static void method405(int i) {
		try {
			Class51.aClass19_1126 = null;
			Class51.aClass19_1137 = null;
			Class51.aClass19_1138 = null;
			Class51.aLongArray1123 = null;
			Class51.anIntArray1130 = null;
			if (i != 17993)
				Class51.aClass19_1134 = null;
			Class51.aClass19_1127 = null;
			Class51.aClass38_Sub20_Sub9_Sub2Array1136 = null;
			Class51.aClass19_1124 = null;
			Class51.anIntArray1131 = null;
			Class51.password = null;
			Class51.aClass19_1132 = null;
			Class51.anIntArray1125 = null;
			Class51.username = null;
			Class51.aClass19_1134 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ke.A(" + i + ')');
		}
	}
}
