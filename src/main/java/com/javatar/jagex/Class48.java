package com.javatar.jagex;/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

final class Class48 {
	static RSString aClass19_1065;
	static int anInt1069 = 0;
	static Class17_Sub1 aClass17_Sub1_1070;
	private int anInt1072;
	private int anInt1073;
	private Class16 aClass16_1074 = null;
	static CRC32 aCRC32_1075;
	static int anInt1076;
	static RSString aClass19_1077;
	static byte[][][] aByteArrayArrayArray1078;
	static RSString aClass19_1082;
	static RSString aClass19_1083;
	static byte[][][] aByteArrayArrayArray1084;
	private Class16 aClass16_1085;

	private final boolean method386(int i, int i_0_, boolean bool, boolean bool_1_, byte[] is) {
		try {
			synchronized (aClass16_1074) {
				try {
					int i_2_;
					if (bool_1_) {
						if (i * 6 + 6 > aClass16_1085.method87(31274))
							return false;
						aClass16_1085.method97((byte) 94, i * 6);
						aClass16_1085.method93(6, 7975, ItemDefinition.aByteArray2817, 0);
						i_2_ = ((ItemDefinition.aByteArray2817[3] & 0xff) << 1064331088) - (-((ItemDefinition.aByteArray2817[4] & 0xff) << -1854409816) - (ItemDefinition.aByteArray2817[5] & 0xff));
						if (i_2_ <= 0 || aClass16_1074.method87(31274) / 520L < i_2_)
							return false;
					} else {
						i_2_ = (int) ((aClass16_1074.method87(31274) + 519L) / 520L);
						if (i_2_ == 0)
							i_2_ = 1;
					}
					if (bool)
						Class48.aClass19_1065 = null;
					ItemDefinition.aByteArray2817[3] = (byte) (i_2_ >> -301082416);
					ItemDefinition.aByteArray2817[4] = (byte) (i_2_ >> 2089256680);
					ItemDefinition.aByteArray2817[0] = (byte) (i_0_ >> -1079836400);
					ItemDefinition.aByteArray2817[5] = (byte) i_2_;
					ItemDefinition.aByteArray2817[2] = (byte) i_0_;
					int i_3_ = 0;
					ItemDefinition.aByteArray2817[1] = (byte) (i_0_ >> -1000097784);
					int i_4_ = 0;
					aClass16_1085.method97((byte) -128, i * 6);
					aClass16_1085.method88(ItemDefinition.aByteArray2817, (byte) 90, 6, 0);
					int i_5_;
					for (/**/; i_0_ > i_3_; i_3_ += i_5_) {
						int i_6_ = 0;
						if (bool_1_) {
							aClass16_1074.method97((byte) 120, i_2_ * 520);
							try {
								aClass16_1074.method93(8, 7975, ItemDefinition.aByteArray2817, 0);
							} catch (java.io.EOFException eofexception) {
								break;
							}
							i_6_ = (ItemDefinition.aByteArray2817[4] << -1683582128 & 0xff0000) + (ItemDefinition.aByteArray2817[5] << 242237352 & 0xff00) + (ItemDefinition.aByteArray2817[6] & 0xff);
							i_5_ = ((ItemDefinition.aByteArray2817[0] & 0xff) << 86248712) + (ItemDefinition.aByteArray2817[1] & 0xff);
							int i_7_ = (ItemDefinition.aByteArray2817[3] & 0xff) + ((ItemDefinition.aByteArray2817[2] & 0xff) << -717820280);
							int i_8_ = ItemDefinition.aByteArray2817[7] & 0xff;
							if (i_5_ != i || i_4_ != i_7_ || anInt1072 != i_8_)
								return false;
							if (i_6_ < 0 || i_6_ > aClass16_1074.method87(31274) / 520L)
								return false;
						}
						if (i_6_ == 0) {
							bool_1_ = false;
							i_6_ = (int) ((aClass16_1074.method87(31274) + 519L) / 520L);
							if (i_6_ == 0)
								i_6_++;
							if (i_6_ == i_2_)
								i_6_++;
						}
						ItemDefinition.aByteArray2817[2] = (byte) (i_4_ >> 414242376);
						ItemDefinition.aByteArray2817[3] = (byte) i_4_;
						ItemDefinition.aByteArray2817[1] = (byte) i;
						i_5_ = i_0_ - i_3_;
						ItemDefinition.aByteArray2817[7] = (byte) anInt1072;
						i_4_++;
						ItemDefinition.aByteArray2817[0] = (byte) (i >> -90734200);
						if (i_5_ > 512)
							i_5_ = 512;
						if (-i_3_ + i_0_ <= 512)
							i_6_ = 0;
						ItemDefinition.aByteArray2817[6] = (byte) i_6_;
						ItemDefinition.aByteArray2817[5] = (byte) (i_6_ >> 1303637064);
						ItemDefinition.aByteArray2817[4] = (byte) (i_6_ >> -1865745040);
						aClass16_1074.method97((byte) -89, i_2_ * 520);
						aClass16_1074.method88(ItemDefinition.aByteArray2817, (byte) 90, 8, 0);
						aClass16_1074.method88(is, (byte) 90, i_5_, i_3_);
						i_2_ = i_6_;
					}
					return true;
				} catch (java.io.IOException ioexception) {
					return false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tb.C(" + i + ',' + i_0_ + ',' + bool + ',' + bool_1_ + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	static final Class38_Sub20_Sub16 method387(byte i, int i_9_) {
		try {
			if (i != 98)
				return null;
			Class38_Sub20_Sub16 class38_sub20_sub16 = (Class38_Sub20_Sub16) Class38_Sub9.aClass83_2062.method591(-28825, i_9_);
			if (class38_sub20_sub16 != null)
				return class38_sub20_sub16;
			byte[] is = NodeSub.aClass17_2258.getFileData(3, i_9_, -102);
			class38_sub20_sub16 = new Class38_Sub20_Sub16();
			if (is != null)
				class38_sub20_sub16.method1023((byte) 84, new RS2Buffer(is));
			Class38_Sub9.aClass83_2062.method590(i_9_, (byte) -128, class38_sub20_sub16);
			return class38_sub20_sub16;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tb.G(" + i + ',' + i_9_ + ')');
		}
	}

	static final void method388(boolean bool, byte i, Class38_Sub8 class38_sub8) {
		do {
			try {
				int i_10_ = (int) class38_sub8.aLong898;
				int i_11_ = class38_sub8.anInt2038;
				class38_sub8.method330(0);
				if (bool)
					Class74.method533((byte) 71, i_11_);
				Class38_Sub3.method619(4590, i_11_);
				WidgetComponent class38_sub6 = Projectile.method1167(i_10_, 62);
				if (class38_sub6 != null)
					Class40.method340(class38_sub6, (byte) -123);
				if (i > -2)
					Class48.aByteArrayArrayArray1084 = null;
				SceneModel.aBool2553 = false;
				Class72.anInt1417 = 0;
				ItemDefinition.method931(-73, WidgetComponent.anInt1976, Class38_Sub20_Sub13.anInt3011, Class3.anInt66, Class38_Sub20_Sub2.anInt2540);
				if (NodeSub.windowId == -1)
					break;
				Class38_Sub4.method625(NodeSub.windowId, 1, (byte) 47);
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "tb.D(" + bool + ',' + i + ',' + (class38_sub8 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	public static void method389(int i) {
		try {
			Class48.aClass17_Sub1_1070 = null;
			Class48.aClass19_1077 = null;
			Class48.aClass19_1083 = null;
			Class48.aClass19_1082 = null;
			Class48.aClass19_1065 = null;
			Class48.aByteArrayArrayArray1084 = null;
			if (i == 6) {
				Class48.aCRC32_1075 = null;
				Class48.aByteArrayArrayArray1078 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tb.F(" + i + ')');
		}
	}

	static final void setPlayerAnimation(byte i, int animationDelay, Player player, int animationId) {
		try {
			if (animationId != player.animationId || animationId == -1) {
				if (animationId == -1 || player.animationId == -1 || Sequence.forID((byte) 123, animationId).anInt2576 >= Sequence.forID((byte) 119, player.animationId).anInt2576) {
					player.anInt3494 = player.walkQueueLocationIndex;
					player.animationDelay = animationDelay;
					player.anInt3471 = 0;
					player.anInt3460 = 0;
					player.anInt3483 = 0;
					player.animationId = animationId;
				}
			} else {
				int i_14_ = Sequence.forID((byte) 105, animationId).anInt2587;
				if (i_14_ == 1) {
					player.anInt3483 = 0;
					player.anInt3460 = 0;
					player.anInt3471 = 0;
					player.animationDelay = animationDelay;
				}
				if (i_14_ == 2)
					player.anInt3460 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tb.E(" + i + ',' + animationDelay + ',' + (player != null ? "{...}" : "null") + ',' + animationId + ')');
		}
	}

	final byte[] method391(int i, int i_16_) {
		try {
			synchronized (aClass16_1074) {
				try {
					if (i_16_ * 6 + 6 > aClass16_1085.method87(31274))
						return null;
					aClass16_1085.method97((byte) 94, i_16_ * 6);
					aClass16_1085.method93(6, 7975, ItemDefinition.aByteArray2817, i);
					int i_17_ = ((ItemDefinition.aByteArray2817[0] & 0xff) << 623229008) + ((ItemDefinition.aByteArray2817[1] & 0xff) << -213656952) + (ItemDefinition.aByteArray2817[2] & 0xff);
					int i_18_ = ((ItemDefinition.aByteArray2817[4] & 0xff) << 1436962024) + ((ItemDefinition.aByteArray2817[3] & 0xff) << 1532685584) + (ItemDefinition.aByteArray2817[5] & 0xff);
					if (i_17_ < 0 || i_17_ > anInt1073)
						return null;
					if (i_18_ <= 0 || i_18_ > aClass16_1074.method87(31274) / 520L)
						return null;
					byte[] is = new byte[i_17_];
					int i_19_ = 0;
					int i_20_ = 0;
					while (i_19_ < i_17_) {
						if (i_18_ == 0)
							return null;
						aClass16_1074.method97((byte) 100, i_18_ * 520);
						int i_21_ = i_17_ - i_19_;
						if (i_21_ > 512)
							i_21_ = 512;
						aClass16_1074.method93(i_21_ + 8, 7975, ItemDefinition.aByteArray2817, 0);
						int i_22_ = (ItemDefinition.aByteArray2817[2] << 451362152 & 0xff00) + (ItemDefinition.aByteArray2817[3] & 0xff);
						int i_23_ = (ItemDefinition.aByteArray2817[1] & 0xff) + (ItemDefinition.aByteArray2817[0] << -703439384 & 0xff00);
						int i_24_ = (ItemDefinition.aByteArray2817[6] & 0xff) + ((ItemDefinition.aByteArray2817[4] & 0xff) << 20409744) + ((ItemDefinition.aByteArray2817[5] & 0xff) << -1197534136);
						int i_25_ = ItemDefinition.aByteArray2817[7] & 0xff;
						if (i_16_ != i_23_ || i_20_ != i_22_ || i_25_ != anInt1072)
							return null;
						if (i_24_ < 0 || i_24_ > aClass16_1074.method87(31274) / 520L)
							return null;
						i_18_ = i_24_;
						i_20_++;
						for (int i_26_ = 0; i_21_ > i_26_; i_26_++)
							is[i_19_++] = ItemDefinition.aByteArray2817[i_26_ + 8];
					}
					return is;
				} catch (java.io.IOException ioexception) {
					return null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tb.A(" + i + ',' + i_16_ + ')');
		}
	}

	@Override
	public final String toString() {
		try {
			return "Cache:" + anInt1072;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tb.toString(" + ')');
		}
	}

	static final void method392(RS2Buffer class38_sub23, int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		try {
			if (i_28_ == -32565)
				if (i_31_ < 0 || i_31_ >= 104 || i_30_ < 0 || i_30_ >= 104)
					for (;;) {
						int i_33_ = class38_sub23.readUnsignedByte();
						if (i_33_ == 0)
							break;
						if (i_33_ == 1) {
							class38_sub23.readUnsignedByte();
							break;
						}
						if (i_33_ <= 49)
							class38_sub23.readUnsignedByte();
					}
				else {
					Class82.aByteArrayArrayArray1648[i][i_31_][i_30_] = (byte) 0;
					for (;;) {
						int i_34_ = class38_sub23.readUnsignedByte();
						if (i_34_ == 0) {
							if (i == 0)
								Player.anIntArrayArrayArray3566[0][i_31_][i_30_] = -Class53.method417(false, i_27_ + 556238 + i_30_, i_31_ + 932731 + i_32_) * 8;
							else {
								Player.anIntArrayArrayArray3566[i][i_31_][i_30_] = Player.anIntArrayArrayArray3566[i - 1][i_31_][i_30_] - 240;
								break;
							}
							break;
						}
						if (i_34_ == 1) {
							int i_35_ = class38_sub23.readUnsignedByte();
							if (i_35_ == 1)
								i_35_ = 0;
							if (i == 0)
								Player.anIntArrayArrayArray3566[0][i_31_][i_30_] = -i_35_ * 8;
							else {
								Player.anIntArrayArrayArray3566[i][i_31_][i_30_] = -(i_35_ * 8) + Player.anIntArrayArrayArray3566[i - 1][i_31_][i_30_];
								break;
							}
							break;
						}
						if (i_34_ <= 49) {
							NPC.aByteArrayArrayArray3560[i][i_31_][i_30_] = class38_sub23.readByte((byte) 116);
							Class48.aByteArrayArrayArray1084[i][i_31_][i_30_] = (byte) ((i_34_ - 2) / 4);
							Class48.aByteArrayArrayArray1078[i][i_31_][i_30_] = (byte) Class38_Sub10_Sub3.method941(i_29_ + i_34_ - 2, 3);
						} else if (i_34_ <= 81)
							Class82.aByteArrayArrayArray1648[i][i_31_][i_30_] = (byte) (i_34_ - 49);
						else
							Class74.aByteArrayArrayArray1470[i][i_31_][i_30_] = (byte) (i_34_ - 81);
					}
				}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tb.H(" + (class38_sub23 != null ? "{...}" : "null") + ',' + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ')');
		}
	}

	final boolean method393(byte i, int i_36_, int i_37_, byte[] is) {
		try {
			synchronized (aClass16_1074) {
				if (i_37_ < 0 || anInt1073 < i_37_)
					throw new IllegalArgumentException();
				boolean bool = method386(i_36_, i_37_, false, true, is);
				if (i != -80)
					method393((byte) 121, -90, 10, null);
				if (!bool)
					bool = method386(i_36_, i_37_, false, false, is);
				return bool;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tb.B(" + i + ',' + i_36_ + ',' + i_37_ + ',' + (is != null ? "{...}" : "null") + ')');
		}
	}

	Class48(int i, Class16 class16, Class16 class16_38_, int i_39_) {
		anInt1073 = 65000;
		aClass16_1085 = null;
		try {
			aClass16_1085 = class16_38_;
			anInt1072 = i;
			anInt1073 = i_39_;
			aClass16_1074 = class16;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "tb.<init>(" + i + ',' + (class16 != null ? "{...}" : "null") + ',' + (class16_38_ != null ? "{...}" : "null") + ',' + i_39_ + ')');
		}
	}

	static {
		Class48.aClass19_1065 = RSString.createRSString("::");
		Class48.anInt1076 = 0;
		Class48.aClass19_1077 = RSString.createRSString("mapfunction");
		Class48.aCRC32_1075 = new CRC32();
		Class48.aClass19_1083 = RSString.createRSString("<col=00ff00>");
		Class48.aClass19_1082 = RSString.createRSString(" )2> <col=ffffff>");
	}
}
