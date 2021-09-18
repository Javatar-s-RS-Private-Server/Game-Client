/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class13 {
	static Class13 aClass13_235;
	static Class17_Sub1 indexFonts;
	static Class14 aClass14_238;
	static RSString aClass19_233 = RSString.createRSString("hel");
	static RSString aClass19_241 = RSString.createRSString("Ein kostenloses Spielkonto erstellen)3");
	static RSString aClass19_243;
	static Class38_Sub6 aClass38_Sub6_245;
	static boolean aBool246;
	static int anInt247;
	static int[] anIntArray248;
	private static RSString aClass19_242;

	static {
		Class13.aClass13_235 = new Class13();
		Class13.aClass19_242 = RSString.createRSString("Loading wordpack )2 ");
		Class13.aClass19_243 = Class13.aClass19_242;
		Class13.anIntArray248 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
		Class13.aBool246 = false;
	}

	Node aClass38_222 = new Node();
	private Node aClass38_244;

	public Class13() {
		try {
			this.aClass38_222.aClass38_890 = this.aClass38_222;
			this.aClass38_222.aClass38_894 = this.aClass38_222;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.<init>(" + ')');
		}
	}

	static final void method59(int i, int i_0_, int i_1_) {
		try {
			Class13 class13 = Class38_Sub21.aClass13ArrayArrayArray2259[client.height][i_1_][i_0_];
			if (class13 == null)
				RuntimeException_Sub1.aClass27_3292.method229(client.height, i_1_, i_0_);
			else {
				int i_2_ = -99999999;
				Class38_Sub20_Sub3_Sub4 class38_sub20_sub3_sub4 = null;
				for (Class38_Sub20_Sub3_Sub4 class38_sub20_sub3_sub4_3_ = (Class38_Sub20_Sub3_Sub4) class13.method65(97); class38_sub20_sub3_sub4_3_ != null; class38_sub20_sub3_sub4_3_ = (Class38_Sub20_Sub3_Sub4) class13.method63(-3)) {
					ItemDefinition class38_sub20_sub6 = Node.forId(class38_sub20_sub3_sub4_3_.anInt3348, i + 90);
					int i_4_ = class38_sub20_sub6.anInt2754;
					if (class38_sub20_sub6.anInt2788 == 1)
						i_4_ *= class38_sub20_sub3_sub4_3_.anInt3351 + 1;
					if (i_4_ > i_2_) {
						class38_sub20_sub3_sub4 = class38_sub20_sub3_sub4_3_;
						i_2_ = i_4_;
					}
				}
				if (i == -1)
					if (class38_sub20_sub3_sub4 == null)
						RuntimeException_Sub1.aClass27_3292.method229(client.height, i_1_, i_0_);
					else {
						class13.method61(i ^ 0x31, class38_sub20_sub3_sub4);
						Class38_Sub20_Sub3_Sub4 class38_sub20_sub3_sub4_5_ = null;
						Class38_Sub20_Sub3_Sub4 class38_sub20_sub3_sub4_6_ = (Class38_Sub20_Sub3_Sub4) class13.method65(i + 101);
						Class38_Sub20_Sub3_Sub4 class38_sub20_sub3_sub4_7_ = null;
						for (/**/; class38_sub20_sub3_sub4_6_ != null; class38_sub20_sub3_sub4_6_ = (Class38_Sub20_Sub3_Sub4) class13.method63(i - 2))
							if (class38_sub20_sub3_sub4.anInt3348 != class38_sub20_sub3_sub4_6_.anInt3348) {
								if (class38_sub20_sub3_sub4_5_ == null)
									class38_sub20_sub3_sub4_5_ = class38_sub20_sub3_sub4_6_;
								if (class38_sub20_sub3_sub4_6_.anInt3348 != class38_sub20_sub3_sub4_5_.anInt3348 && class38_sub20_sub3_sub4_7_ == null)
									class38_sub20_sub3_sub4_7_ = class38_sub20_sub3_sub4_6_;
							}
						int i_8_ = i_1_ + (i_0_ << 7) + 1610612736;
						RuntimeException_Sub1.aClass27_3292.method268(client.height, i_1_, i_0_, Class35.method317(-5736, client.height, i_1_ * 128 + 64, i_0_ * 128 + 64), class38_sub20_sub3_sub4, i_8_, class38_sub20_sub3_sub4_5_, class38_sub20_sub3_sub4_7_);
					}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.Q(" + i + ',' + i_0_ + ',' + i_1_ + ')');
		}
	}

	static final boolean method64(int i, int i_9_) {
		try {
			if (i_9_ != -8956)
				Class13.indexFonts = null;
			return (i >> 31 & 0x1) != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.L(" + i + ',' + i_9_ + ')');
		}
	}

	static final boolean method66(int i, int i_10_) {
		try {
			if (i >= 97 && i <= 122)
				return true;
			if (i_10_ != -1)
				Class13.anInt247 = 52;
			if (i >= 65 && i <= 90)
				return true;
			return i >= 48 && i <= 57;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.F(" + i + ',' + i_10_ + ')');
		}
	}

	static final void method67(boolean bool) {
		do {
			try {
				int i = Class35.anInt805 * 128 + 64;
				int i_11_ = Class38_Sub20_Sub3_Sub2.anInt3274 * 128 + 64;
				int i_12_ = Class35.method317(-5736, client.height, i, i_11_) - Class38_Sub17.anInt2195;
				if (bool)
					Class13.anIntArray248 = null;
				if (Class11.anInt208 < i) {
					Class11.anInt208 += Class60.anInt1302 + Class29.anInt706 * (-Class11.anInt208 + i) / 1000;
					if (i < Class11.anInt208)
						Class11.anInt208 = i;
				}
				if (i_12_ > Class38_Sub18.anInt2209) {
					Class38_Sub18.anInt2209 += (i_12_ - Class38_Sub18.anInt2209) * Class29.anInt706 / 1000 + Class60.anInt1302;
					if (Class38_Sub18.anInt2209 > i_12_)
						Class38_Sub18.anInt2209 = i_12_;
				}
				if (i_12_ < Class38_Sub18.anInt2209) {
					Class38_Sub18.anInt2209 -= (-i_12_ + Class38_Sub18.anInt2209) * Class29.anInt706 / 1000 + Class60.anInt1302;
					if (i_12_ > Class38_Sub18.anInt2209)
						Class38_Sub18.anInt2209 = i_12_;
				}
				if (Class2.anInt30 < i_11_) {
					Class2.anInt30 += Class60.anInt1302 + (i_11_ - Class2.anInt30) * Class29.anInt706 / 1000;
					if (i_11_ < Class2.anInt30)
						Class2.anInt30 = i_11_;
				}
				if (i < Class11.anInt208) {
					Class11.anInt208 -= Class60.anInt1302 + (Class11.anInt208 - i) * Class29.anInt706 / 1000;
					if (Class11.anInt208 < i)
						Class11.anInt208 = i;
				}
				i = Class23.anInt563 * 128 + 64;
				if (Class2.anInt30 > i_11_) {
					Class2.anInt30 -= Class29.anInt706 * (-i_11_ + Class2.anInt30) / 1000 + Class60.anInt1302;
					if (i_11_ > Class2.anInt30)
						Class2.anInt30 = i_11_;
				}
				i_11_ = Class38_Sub9.anInt2072 * 128 + 64;
				i_12_ = Class35.method317(-5736, client.height, i, i_11_) - Class38_Sub20_Sub15.anInt3071;
				int i_13_ = i_11_ - Class2.anInt30;
				int i_14_ = -Class11.anInt208 + i;
				int i_15_ = -Class38_Sub18.anInt2209 + i_12_;
				int i_16_ = (int) Math.sqrt(i_14_ * i_14_ + i_13_ * i_13_);
				int i_17_ = (int) (Math.atan2(i_15_, i_16_) * 325.949) & 0x7ff;
				int i_18_ = (int) (Math.atan2(i_14_, i_13_) * -325.949) & 0x7ff;
				int i_19_ = -Entity.anInt3464 + i_18_;
				if (i_19_ > 1024)
					i_19_ -= 2048;
				if (i_17_ < 128)
					i_17_ = 128;
				if (i_17_ > 383)
					i_17_ = 383;
				if (i_19_ < -1024)
					i_19_ += 2048;
				if (Class3.anInt44 < i_17_) {
					Class3.anInt44 += Class44.anInt1002 + Class62.anInt1338 * (-Class3.anInt44 + i_17_) / 1000;
					if (Class3.anInt44 > i_17_)
						Class3.anInt44 = i_17_;
				}
				if (i_19_ > 0) {
					Entity.anInt3464 += Class62.anInt1338 * i_19_ / 1000 + Class44.anInt1002;
					Entity.anInt3464 &= 0x7ff;
				}
				if (i_19_ < 0) {
					Entity.anInt3464 -= Class44.anInt1002 + -i_19_ * Class62.anInt1338 / 1000;
					Entity.anInt3464 &= 0x7ff;
				}
				if (i_17_ < Class3.anInt44) {
					Class3.anInt44 -= Class62.anInt1338 * (-i_17_ + Class3.anInt44) / 1000 + Class44.anInt1002;
					if (Class3.anInt44 < i_17_)
						Class3.anInt44 = i_17_;
				}
				int i_20_ = i_18_ - Entity.anInt3464;
				if (i_20_ > 1024)
					i_20_ -= 2048;
				if (i_20_ < -1024)
					i_20_ += 2048;
				if ((i_20_ >= 0 || i_19_ <= 0) && (i_20_ <= 0 || i_19_ >= 0))
					break;
				Entity.anInt3464 = i_18_;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "wd.A(" + bool + ')');
			}
			break;
		} while (false);
	}

	public static void method71(byte i) {
		try {
			Class13.aClass19_241 = null;
			Class13.aClass38_Sub6_245 = null;
			Class13.indexFonts = null;
			Class13.aClass14_238 = null;
			Class13.aClass19_233 = null;
			if (i >= -7)
				Class13.method73(-77);
			Class13.aClass19_243 = null;
			Class13.anIntArray248 = null;
			Class13.aClass13_235 = null;
			Class13.aClass19_242 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.I(" + i + ')');
		}
	}

	static final int method72(byte i, Class38_Sub6 class38_sub6, int i_23_) {
		try {
			if (class38_sub6.anIntArrayArray1955 == null || i_23_ >= class38_sub6.anIntArrayArray1955.length)
				return -2;
			try {
				if (i != 23)
					Class13.method67(false);
				int[] is = class38_sub6.anIntArrayArray1955[i_23_];
				int i_24_ = 0;
				int i_25_ = 0;
				int i_26_ = 0;
				for (;;) {
					int i_27_ = is[i_26_++];
					int i_28_ = 0;
					int i_29_ = 0;
					if (i_27_ == 0)
						return i_25_;
					if (i_27_ == 1)
						i_28_ = Class47.anIntArray1041[is[i_26_++]];
					if (i_27_ == 15)
						i_29_ = 1;
					if (i_27_ == 2)
						i_28_ = Class38_Sub2.anIntArray1770[is[i_26_++]];
					if (i_27_ == 3)
						i_28_ = Class38_Sub20_Sub3_Sub4.anIntArray3358[is[i_26_++]];
					if (i_27_ == 16)
						i_29_ = 2;
					if (i_27_ == 17)
						i_29_ = 3;
					if (i_27_ == 4) {
						int i_30_ = is[i_26_++] << 16;
						i_30_ += is[i_26_++];
						Class38_Sub6 class38_sub6_31_ = Projectile.method1167(i_30_, 62);
						int i_32_ = is[i_26_++];
						if (i_32_ != -1 && (!Node.forId(i_32_, 125).aBool2771 || Node.aBool889))
							for (int i_33_ = 0; i_33_ < class38_sub6_31_.anIntArray1947.length; i_33_++)
								if (class38_sub6_31_.anIntArray1947[i_33_] == i_32_ + 1)
									i_28_ += class38_sub6_31_.anIntArray1866[i_33_];
					}
					if (i_27_ == 5)
						i_28_ = Class21.anIntArray528[is[i_26_++]];
					if (i_27_ == 6)
						i_28_ = Class50.anIntArray1114[Class38_Sub2.anIntArray1770[is[i_26_++]] - 1];
					if (i_27_ == 7)
						i_28_ = Class21.anIntArray528[is[i_26_++]] * 100 / 46875;
					if (i_27_ == 8)
						i_28_ = client.myPlayer.combatLevel;
					if (i_27_ == 9)
						for (int i_34_ = 0; i_34_ < 25; i_34_++)
							if (Class3.aBoolArray64[i_34_])
								i_28_ += Class38_Sub2.anIntArray1770[i_34_];
					if (i_27_ == 10) {
						int i_35_ = is[i_26_++] << 16;
						i_35_ += is[i_26_++];
						Class38_Sub6 class38_sub6_36_ = Projectile.method1167(i_35_, -126);
						int i_37_ = is[i_26_++];
						if (i_37_ != -1 && (!Node.forId(i_37_, 51).aBool2771 || Node.aBool889))
							for (int i_38_ = 0; i_38_ < class38_sub6_36_.anIntArray1947.length; i_38_++)
								if (i_37_ + 1 == class38_sub6_36_.anIntArray1947[i_38_]) {
									i_28_ = 999999999;
									break;
								}
					}
					if (i_27_ == 11)
						i_28_ = Class38_Sub20_Sub3_Sub5.anInt3372;
					if (i_27_ == 12)
						i_28_ = Class82.anInt1647;
					if (i_27_ == 13) {
						int i_39_ = Class21.anIntArray528[is[i_26_++]];
						int i_40_ = is[i_26_++];
						i_28_ = (1 << i_40_ & i_39_) != 0 ? 1 : 0;
					}
					if (i_27_ == 14) {
						int i_41_ = is[i_26_++];
						i_28_ = Player.method1206((byte) -98, i_41_);
					}
					if (i_27_ == 18)
						i_28_ = client.currentBaseY + (client.myPlayer.anInt3493 >> 7);
					if (i_27_ == 19)
						i_28_ = client.currentBaseX + (client.myPlayer.anInt3444 >> 7);
					if (i_27_ == 20)
						i_28_ = is[i_26_++];
					if (i_29_ != 0)
						i_24_ = i_29_;
					else {
						if (i_24_ == 0)
							i_25_ += i_28_;
						if (i_24_ == 1)
							i_25_ -= i_28_;
						if (i_24_ == 2 && i_28_ != 0)
							i_25_ /= i_28_;
						if (i_24_ == 3)
							i_25_ *= i_28_;
						i_24_ = 0;
					}
				}
			} catch (Exception exception) {
				return -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.B(" + i + ',' + (class38_sub6 != null ? "{...}" : "null") + ',' + i_23_ + ')');
		}
	}

	static final void method73(int i) {
		try {
			if (i < 92)
				Class13.method71((byte) 80);
			Class81.aClass83_1622.method596(-113);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.J(" + i + ')');
		}
	}

	final void method58(byte i) {
		try {
			if (i == -19)
				for (;;) {
					Node Node = this.aClass38_222.aClass38_894;
					if (Node == this.aClass38_222)
						break;
					Node.method330(0);
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.K(" + i + ')');
		}
	}

	final Node method60(byte i) {
		try {
			Node Node = this.aClass38_222.aClass38_890;
			if (i <= 97)
				return null;
			if (this.aClass38_222 == Node)
				return null;
			Node.method330(0);
			return Node;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.H(" + i + ')');
		}
	}

	final void method61(int i, Node Node) {
		try {
			if (Node.aClass38_890 != null)
				Node.method330(0);
			Node.aClass38_894 = this.aClass38_222.aClass38_894;
			Node.aClass38_890 = this.aClass38_222;
			Node.aClass38_890.aClass38_894 = Node;
			if (i <= -12)
				Node.aClass38_894.aClass38_890 = Node;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.E(" + i + ',' + (Node != null ? "{...}" : "null") + ')');
		}
	}

	final Node method62(int i) {
		try {
			if (i != -1)
				return null;
			Node Node = aClass38_244;
			if (this.aClass38_222 == Node) {
				aClass38_244 = null;
				return null;
			}
			aClass38_244 = Node.aClass38_890;
			return Node;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.N(" + i + ')');
		}
	}

	final Node method63(int i) {
		try {
			Node Node = aClass38_244;
			if (Node == this.aClass38_222) {
				aClass38_244 = null;
				return null;
			}
			if (i != -3)
				Class13.method71((byte) -55);
			aClass38_244 = Node.aClass38_894;
			return Node;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.G(" + i + ')');
		}
	}

	final Node method65(int i) {
		try {
			Node Node = this.aClass38_222.aClass38_894;
			if (Node == this.aClass38_222) {
				aClass38_244 = null;
				return null;
			}
			if (i < 80)
				Class13.aClass13_235 = null;
			aClass38_244 = Node.aClass38_894;
			return Node;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.O(" + i + ')');
		}
	}

	final void method68(Node Node, byte i) {
		try {
			if (Node.aClass38_890 != null)
				Node.method330(0);
			Node.aClass38_890 = this.aClass38_222.aClass38_890;
			Node.aClass38_894 = this.aClass38_222;
			Node.aClass38_890.aClass38_894 = Node;
			if (i <= 33)
				Class13.method59(-120, 28, -15);
			Node.aClass38_894.aClass38_890 = Node;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.M(" + (Node != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Node method69(byte i) {
		try {
			Node Node = this.aClass38_222.aClass38_894;
			int i_21_ = -57 % ((i - 29) / 46);
			if (Node == this.aClass38_222)
				return null;
			Node.method330(0);
			return Node;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.P(" + i + ')');
		}
	}

	final void method70(Node Node, Node class38_22_, int i) {
		try {
			if (Node.aClass38_890 != null)
				Node.method330(0);
			Node.aClass38_890 = class38_22_.aClass38_890;
			Node.aClass38_894 = class38_22_;
			Node.aClass38_890.aClass38_894 = Node;
			if (i < 114)
				Class13.aClass19_233 = null;
			Node.aClass38_894.aClass38_890 = Node;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.D(" + (Node != null ? "{...}" : "null") + ',' + (class38_22_ != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final Node method74(int i) {
		try {
			if (i != -49)
				Class13.anIntArray248 = null;
			Node Node = this.aClass38_222.aClass38_890;
			if (Node == this.aClass38_222) {
				aClass38_244 = null;
				return null;
			}
			aClass38_244 = Node.aClass38_890;
			return Node;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "wd.C(" + i + ')');
		}
	}
}
