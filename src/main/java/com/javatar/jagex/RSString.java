package com.javatar.jagex;/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;

final class RSString implements Interface2 {
	byte[] buffer;
	private int anInt423;
	static RSString aClass19_430;
	static RSString aClass19_432;
	static RSString aClass19_436 = RSString.createRSString("logo");
	static int[][][] anIntArrayArrayArray445 = new int[4][13][13];
	private boolean aBool455 = true;
	static int anInt456;
	private static RSString aClass19_459 = RSString.createRSString("Welcome to RuneScape");
	static Font aFont460;
	private static RSString aClass19_461 = RSString.createRSString("Free world");
	int length;
	static int anInt481 = -1;
	/* synthetic */static Class aClass484;

	int method138(int offset, int size, byte[] buffer) {
		try {
			Class71.arrayCopy(this.buffer, 0, buffer, offset, size);
			return size;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.HA(" + (byte) -126 + ',' + offset + ',' + 0 + ',' + size + ',' + (buffer != null ? "{...}" : "null") + ')');
		}
	}

	private final boolean method139(int i, int i_3_) {
		try {
			if (i_3_ < 1 || i_3_ > 36)
				i_3_ = 10;
			boolean bool = false;
			int i_4_ = 0;
			boolean bool_5_ = false;
			if (i > -117)
				method151(-61);
			for (int i_6_ = 0; i_6_ < this.length; i_6_++) {
				int i_7_ = this.buffer[i_6_] & 0xff;
				if (i_6_ == 0) {
					if (i_7_ == 45) {
						bool_5_ = true;
						continue;
					}
					if (i_7_ == 43)
						continue;
				}
				if (i_7_ < 48 || i_7_ > 57) {
					if (i_7_ >= 65 && i_7_ <= 90)
						i_7_ -= 55;
					else {
						if (i_7_ < 97 || i_7_ > 122)
							return false;
						i_7_ -= 87;
					}
				} else
					i_7_ -= 48;
				if (i_7_ >= i_3_)
					return false;
				if (bool_5_)
					i_7_ = -i_7_;
				int i_8_ = i_7_ + i_3_ * i_4_;
				if (i_8_ / i_3_ != i_4_)
					return false;
				i_4_ = i_8_;
				bool = true;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.P(" + i + ',' + i_3_ + ')');
		}
	}

	static final boolean method140(byte i, int i_9_) {
		try {
			if (i_9_ < 0)
				return false;
			if (i != 93)
				RSString.method179(true, 86);
			int i_10_ = Class17_Sub1.anIntArray1709[i_9_];
			if (i_10_ >= 2000)
				i_10_ -= 2000;
			if (i_10_ == 1005)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.L(" + i + ',' + i_9_ + ')');
		}
	}

	@Override
	public final boolean equals(Object object) {
		try {
			if (object instanceof RSString)
				return method175(true, (RSString) object);
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.equals(" + (object != null ? "{...}" : "null") + ')');
		}
	}

	final int method141(int i, RSString class19_11_) {
		try {
			int i_12_;
			if (class19_11_.length < this.length)
				i_12_ = class19_11_.length;
			else
				i_12_ = this.length;
			for (int i_13_ = 0; i_12_ > i_13_; i_13_++) {
				if ((class19_11_.buffer[i_13_] & 0xff) > (this.buffer[i_13_] & 0xff))
					return -1;
				if ((this.buffer[i_13_] & 0xff) > (class19_11_.buffer[i_13_] & 0xff))
					return 1;
			}
			if (this.length < class19_11_.length)
				return -1;
			if (i != -39)
				return 45;
			if (class19_11_.length < this.length)
				return 1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.G(" + i + ',' + (class19_11_ != null ? "{...}" : "null") + ')');
		}
	}

	public static void method142(int i) {
		try {
			RSString.aClass19_461 = null;
			RSString.aClass19_459 = null;
			RSString.aClass19_436 = null;
			RSString.aClass19_432 = null;
			RSString.aFont460 = null;
			RSString.aClass19_430 = null;
			int i_14_ = -89 % ((i + 61) / 54);
			RSString.anIntArrayArrayArray445 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.F(" + i + ')');
		}
	}

	final int length(byte i) {
		try {
			if (i <= 8)
				method149(-8);
			return this.length;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.OA(" + i + ')');
		}
	}

	final RSString method144(byte i, int i_15_, int i_16_) {
		try {
			int i_17_ = -32 % ((-62 - i) / 49);
			RSString class19_18_ = new RSString();
			class19_18_.length = i_16_ - i_15_;
			class19_18_.buffer = new byte[-i_15_ + i_16_];
			Class71.arrayCopy(this.buffer, i_15_, class19_18_.buffer, 0, class19_18_.length);
			return class19_18_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.D(" + i + ',' + i_15_ + ',' + i_16_ + ')');
		}
	}

	static final void method145(byte i) {
		try {
			int i_19_ = -67 / ((-62 - i) / 38);
			for (int i_20_ = 0; i_20_ < Class38_Sub20_Sub15.anInt3064; i_20_++) {
				int i_21_ = ItemDefinition.anIntArray2797[i_20_];
				NPC npc = Class53.aClass38_Sub20_Sub3_Sub7_Sub1Array1164[i_21_];
				int i_22_ = Class15.inputStream.readUnsignedByte();
				if ((i_22_ & 0x1) != 0) {
					npc.aClass38_Sub20_Sub5_3543 = Class38_Sub20_Sub3_Sub4.method1156(-99, Class15.inputStream.getULEShort());
					npc.turn90CCAnimation = npc.aClass38_Sub20_Sub5_3543.anInt2712;
					npc.anInt3457 = npc.aClass38_Sub20_Sub5_3543.anInt2697;
					npc.anInt3462 = npc.aClass38_Sub20_Sub5_3543.anInt2686;
					npc.turn90CWAnimation = npc.aClass38_Sub20_Sub5_3543.anInt2720;
					npc.idleAnimation = npc.aClass38_Sub20_Sub5_3543.anInt2696;
					npc.walkAnimation = npc.aClass38_Sub20_Sub5_3543.anInt2703;
					npc.anInt3439 = npc.aClass38_Sub20_Sub5_3543.anInt2719;
					npc.turn180Animation = npc.aClass38_Sub20_Sub5_3543.anInt2702;
					npc.turnAnimation = npc.aClass38_Sub20_Sub5_3543.anInt2710;
				}
				if ((i_22_ & 0x8) != 0) {
					npc.anInt3477 = Class15.inputStream.method740((byte) 126);
					int i_23_ = Class15.inputStream.method730(34);
					npc.anInt3450 = (i_23_ & 0xffff) + Class45.anInt1016;
					if (npc.anInt3477 == 65535)
						npc.anInt3477 = -1;
					npc.anInt3473 = i_23_ >> -470597776;
					npc.anInt3447 = 0;
					npc.anInt3500 = 0;
					if (npc.anInt3450 > Class45.anInt1016)
						npc.anInt3500 = -1;
				}
				if ((i_22_ & 0x4) != 0) {
					int i_24_ = Class15.inputStream.getUByteC();
					int i_25_ = Class15.inputStream.getUByteC();
					npc.addHit(Class45.anInt1016, i_25_, i_24_);
					npc.hitCycle = Class45.anInt1016 + 300;
					npc.anInt3501 = Class15.inputStream.method741(67);
					npc.anInt3484 = Class15.inputStream.readUnsignedByteC(13285);
				}
				if ((i_22_ & 0x40) != 0) {
					npc.aClass19_3467 = Class15.inputStream.readString(1347418632);
					npc.anInt3452 = 100;
				}
				if ((i_22_ & 0x20) != 0) {
					npc.facingEntityIndex = Class15.inputStream.getULEShort();
					if (npc.facingEntityIndex == 65535)
						npc.facingEntityIndex = -1;
				}
				if ((i_22_ & 0x80) != 0) {
					int i_26_ = Class15.inputStream.readUnsignedByte();
					int i_27_ = Class15.inputStream.method741(64);
					npc.addHit(Class45.anInt1016, i_27_, i_26_);
					npc.hitCycle = Class45.anInt1016 + 300;
					npc.anInt3501 = Class15.inputStream.method741(100);
					npc.anInt3484 = Class15.inputStream.readUnsignedByte();
				}
				if ((i_22_ & 0x10) != 0) {
					int i_28_ = Class15.inputStream.method740((byte) 113);
					int i_29_ = Class15.inputStream.method741(81);
					if (i_28_ == 65535)
						i_28_ = -1;
					if (i_28_ != npc.animationId || i_28_ == -1) {
						if (i_28_ == -1 || npc.animationId == -1 || Sequence.forID((byte) 90, i_28_).anInt2576 >= Sequence.forID((byte) 90, npc.animationId).anInt2576) {
							npc.anInt3494 = npc.walkQueueLocationIndex;
							npc.anInt3460 = 0;
							npc.animationId = i_28_;
							npc.anInt3471 = 0;
							npc.animationDelay = i_29_;
							npc.anInt3483 = 0;
						}
					} else {
						int i_30_ = Sequence.forID((byte) 108, i_28_).anInt2587;
						if (i_30_ == 1) {
							npc.anInt3483 = 0;
							npc.anInt3460 = 0;
							npc.animationDelay = i_29_;
							npc.anInt3471 = 0;
						}
						if (i_30_ == 2)
							npc.anInt3460 = 0;
					}
				}
				if ((i_22_ & 0x2) != 0) {
					npc.faceX = Class15.inputStream.getULEShort();
					npc.faceY = Class15.inputStream.method740((byte) 122);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.NA(" + i + ')');
		}
	}

	final RSString method146(RSString class19_31_, byte i) {
		try {
			if (!aBool455)
				throw new IllegalArgumentException();
			anInt423 = 0;
			if (this.length + class19_31_.length > this.buffer.length) {
				int i_32_;
				for (i_32_ = 1; i_32_ < class19_31_.length + this.length; i_32_ += i_32_) {
					/* empty */
				}
				byte[] is = new byte[i_32_];
				Class71.arrayCopy(this.buffer, 0, is, 0, this.length);
				this.buffer = is;
			}
			Class71.arrayCopy(class19_31_.buffer, 0, this.buffer, this.length, class19_31_.length);
			int i_33_ = 38 / ((i - 54) / 36);
			this.length += class19_31_.length;
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.SA(" + (class19_31_ != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	@Override
	public final String toString() {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.toString(" + ')');
		}
	}

	final RSString method147(byte i) {
		try {
			if (i < 114)
				return null;
			RSString class19_34_ = new RSString();
			class19_34_.buffer = new byte[12];
			int i_35_ = 0;
			class19_34_.length = 0;
			for (int i_36_ = 0; i_36_ < this.length; i_36_++) {
				if (this.buffer[i_36_] < 65 || this.buffer[i_36_] > 90) {
					if ((this.buffer[i_36_] < 97 || this.buffer[i_36_] > 122) && (this.buffer[i_36_] < 48 || this.buffer[i_36_] > 57)) {
						if (i_35_ > 0)
							class19_34_.buffer[i_35_++] = (byte) 95;
					} else {
						class19_34_.buffer[i_35_++] = this.buffer[i_36_];
						class19_34_.length = i_35_;
					}
				} else {
					class19_34_.buffer[i_35_++] = (byte) (this.buffer[i_36_] + 97 - 65);
					class19_34_.length = i_35_;
				}
				if (i_35_ == 12)
					break;
			}
			return class19_34_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.Q(" + i + ')');
		}
	}

	final int method148(int i, RSString class19_37_) {
		try {
			int i_38_;
			if (this.length > class19_37_.length)
				i_38_ = class19_37_.length;
			else
				i_38_ = this.length;
			if (i != 1)
				method167((byte) 61);
			for (int i_39_ = 0; i_39_ < i_38_; i_39_++) {
				if (Class38_Sub22.anIntArray2333[this.buffer[i_39_] & 0xff] < Class38_Sub22.anIntArray2333[class19_37_.buffer[i_39_] & 0xff])
					return -1;
				if (Class38_Sub22.anIntArray2333[this.buffer[i_39_] & 0xff] > Class38_Sub22.anIntArray2333[class19_37_.buffer[i_39_] & 0xff])
					return 1;
			}
			if (this.length < class19_37_.length)
				return -1;
			if (class19_37_.length < this.length)
				return 1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.PA(" + i + ',' + (class19_37_ != null ? "{...}" : "null") + ')');
		}
	}

	private final long method149(int i) {
		try {
			long l = 0L;
			int i_40_ = 0;
			if (i <= 80)
				method150(3);
			for (/**/; this.length > i_40_; i_40_++)
				l = -l + (l << -167279291) - -(long) (this.buffer[i_40_] & 0xff);
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.C(" + i + ')');
		}
	}

	final int method150(int i) {
		try {
			int i_41_ = 0;
			if (i != -44)
				method150(30);
			for (int i_42_ = 0; i_42_ < this.length; i_42_++)
				i_41_ = -i_41_ + (i_41_ << -846823035) + (this.buffer[i_42_] & 0xff);
			return i_41_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.QA(" + i + ')');
		}
	}

	final RSString method151(int i) {
		try {
			RSString class19_43_ = new RSString();
			class19_43_.length = this.length;
			if (i != -7726)
				method172(-85);
			class19_43_.buffer = new byte[this.length];
			for (int i_44_ = 0; i_44_ < this.length; i_44_++)
				class19_43_.buffer[i_44_] = (byte) 42;
			return class19_43_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.CA(" + i + ')');
		}
	}

	private final int method152(RSString class19_45_, int i, int i_46_) {
		try {
			int[] is = new int[class19_45_.length];
			int[] is_47_ = new int[256];
			int[] is_48_ = new int[class19_45_.length];
			int i_49_ = 36 / ((i_46_ - 29) / 56);
			for (int i_50_ = 0; i_50_ < is_47_.length; i_50_++)
				is_47_[i_50_] = class19_45_.length;
			for (int i_51_ = 1; i_51_ <= class19_45_.length; i_51_++) {
				is[i_51_ - 1] = -i_51_ + (class19_45_.length << 1885284545);
				is_47_[Class38_Sub10_Sub3.method941(255, class19_45_.buffer[i_51_ - 1])] = -i_51_ + class19_45_.length;
			}
			int i_52_ = class19_45_.length + 1;
			for (int i_53_ = class19_45_.length; i_53_ > 0; i_53_--) {
				is_48_[i_53_ - 1] = i_52_;
				for (/**/; class19_45_.length >= i_52_ && class19_45_.buffer[i_52_ - 1] != class19_45_.buffer[i_53_ - 1]; i_52_ = is_48_[i_52_ - 1])
					if (is[i_52_ - 1] >= -i_53_ + class19_45_.length)
						is[i_52_ - 1] = -i_53_ + class19_45_.length;
				i_52_--;
			}
			int i_54_ = i_52_;
			int i_55_ = 0;
			int i_56_ = 1;
			i_52_ = -i_54_ + class19_45_.length + 1;
			int i_57_ = 1;
			while (i_52_ >= i_57_) {
				is_48_[i_57_ - 1] = i_55_;
				for (/**/; i_55_ >= 1 && class19_45_.buffer[i_55_ - 1] != class19_45_.buffer[i_57_ - 1]; i_55_ = is_48_[i_55_ - 1]) {
					/* empty */
				}
				i_57_++;
				i_55_++;
			}
			while (class19_45_.length > i_54_) {
				for (int i_58_ = i_56_; i_54_ >= i_58_; i_58_++)
					if (-i_58_ + class19_45_.length + i_54_ <= is[i_58_ - 1])
						is[i_58_ - 1] = -i_58_ + i_54_ + class19_45_.length;
				i_56_ = i_54_ + 1;
				i_54_ = i_52_ + i_54_ - is_48_[i_52_ - 1];
				i_52_ = is_48_[i_52_ - 1];
			}
			int i_59_;
			for (int i_60_ = class19_45_.length + i - 1; i_60_ < this.length; i_60_ += Math.max(is_47_[this.buffer[i_60_] & 0xff], is[i_59_])) {
				for (i_59_ = class19_45_.length - 1; i_59_ >= 0 && class19_45_.buffer[i_59_] == this.buffer[i_60_]; i_59_--)
					i_60_--;
				if (i_59_ == -1)
					return i_60_ + 1;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.N(" + (class19_45_ != null ? "{...}" : "null") + ',' + i + ',' + i_46_ + ')');
		}
	}

	private final int method153(int i, int i_61_, int i_62_) {
		try {
			byte i_63_ = (byte) i_61_;
			if (i_62_ != -34)
				return -110;
			for (int i_64_ = i; i_64_ < this.length; i_64_++)
				if (this.buffer[i_64_] == i_63_)
					return i_64_;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.MA(" + i + ',' + i_61_ + ',' + i_62_ + ')');
		}
	}

	static final void method154(int i, Sequence class38_sub20_sub5, int i_65_, int i_66_, int i_67_) {
		try {
			if (Class72.anInt1417 < 400) {
				if (class38_sub20_sub5.anIntArray2715 != null)
					class38_sub20_sub5 = class38_sub20_sub5.method915(122);
				if (class38_sub20_sub5 != null && class38_sub20_sub5.aBool2689) {
					RSString class19 = class38_sub20_sub5.aClass19_2705;
					if (class38_sub20_sub5.anInt2699 != 0)
						class19 = Class9.method43(new RSString[] { class19, Class21.method191(class38_sub20_sub5.anInt2699, i_65_ - 3957, Client.myPlayer.combatLevel), Class38_Sub10_Sub3.aClass19_2825, ItemDefinition.aClass19_2816, RuntimeException_Sub1.method1098(class38_sub20_sub5.anInt2699, 0), Class38_Sub21.aClass19_2265 }, (byte) -20);
					if (i_65_ != 801)
						RSString.method160((byte) 124, 32, -41, 68, 2, -107);
					if (Class42.anInt964 == 1)
						Class37.method328(i_66_, Class38_Sub10_Sub3.aClass19_2836, 3231, i_67_, 58, Class9.method43(new RSString[] { Class38_Sub2.aClass19_1759, Class49.aClass19_1086, class19 }, (byte) -20), i);
					else if (Class26.aBool614) {
						if ((Class28.anInt693 & 0x2) == 2)
							Class37.method328(i_66_, Class30.aClass19_736, i_65_ + 2430, i_67_, 12, Class9.method43(new RSString[] { Class53.aClass19_1168, Class49.aClass19_1086, class19 }, (byte) -20), i);
					} else {
						RSString[] class19s = class38_sub20_sub5.aClass19Array2690;
						if (Class44.aBool992)
							class19s = Class42.method361(class19s, 3);
						if (class19s != null)
							for (int i_68_ = 4; i_68_ >= 0; i_68_--)
								if (class19s[i_68_] != null && !class19s[i_68_].method174((byte) 110, Class52.aClass19_1154)) {
									int i_69_ = 0;
									if (i_68_ == 0)
										i_69_ = 14;
									if (i_68_ == 1)
										i_69_ = 28;
									if (i_68_ == 2)
										i_69_ = 10;
									if (i_68_ == 3)
										i_69_ = 9;
									if (i_68_ == 4)
										i_69_ = 24;
									Class37.method328(i_66_, class19s[i_68_], 3231, i_67_, i_69_, Class9.method43(new RSString[] { Class47.aClass19_1050, class19 }, (byte) -20), i);
								}
						if (class19s != null)
							for (int i_70_ = 4; i_70_ >= 0; i_70_--)
								if (class19s[i_70_] != null && class19s[i_70_].method174((byte) 105, Class52.aClass19_1154)) {
									int i_71_ = 0;
									if (class38_sub20_sub5.anInt2699 > Client.myPlayer.combatLevel)
										i_71_ = 2000;
									int i_72_ = 0;
									if (i_70_ == 0)
										i_72_ = i_71_ + 14;
									if (i_70_ == 1)
										i_72_ = i_71_ + 28;
									if (i_70_ == 2)
										i_72_ = 10 + i_71_;
									if (i_70_ == 3)
										i_72_ = i_71_ + 9;
									if (i_70_ == 4)
										i_72_ = i_71_ + 24;
									Class37.method328(i_66_, class19s[i_70_], 3231, i_67_, i_72_, Class9.method43(new RSString[] { Class47.aClass19_1050, class19 }, (byte) -20), i);
								}
						Class37.method328(i_66_, Class50.aClass19_1112, i_65_ ^ 0xfbe, i_67_, 1006, Class9.method43(new RSString[] { Class47.aClass19_1050, class19 }, (byte) -20), i);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.W(" + i + ',' + (class38_sub20_sub5 != null ? "{...}" : "null") + ',' + i_65_ + ',' + i_66_ + ',' + i_67_ + ')');
		}
	}

	@Override
	public final int hashCode() {
		try {
			return method150(-44);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.hashCode(" + ')');
		}
	}

	final int method155(int i, FontMetrics fontmetrics) {
		try {
			String string;
			try {
				string = new String(this.buffer, i, this.length, "ISO-8859-1");
			} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
				string = new String(this.buffer, 0, this.length);
			}
			return fontmetrics.stringWidth(string);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.H(" + i + ',' + (fontmetrics != null ? "{...}" : "null") + ')');
		}
	}

	final void method156(int i, int i_73_, int i_74_, Graphics graphics) {
		try {
			String string;
			try {
				string = new String(this.buffer, i_74_, this.length, "ISO-8859-1");
			} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
				string = new String(this.buffer, 0, this.length);
			}
			graphics.drawString(string, i, i_73_);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.K(" + i + ',' + i_73_ + ',' + i_74_ + ',' + (graphics != null ? "{...}" : "null") + ')');
		}
	}

	final RSString method157(byte i) {
		try {
			if (i != 10)
				return null;
			long l = method149(i ^ 0x68);
			synchronized (RSString.aClass484 != null ? RSString.aClass484 : (RSString.aClass484 = RSString.method182("com.javatar.jagex.RSString"))) {
				if (Class13.aClass14_238 == null)
					Class13.aClass14_238 = new Class14(4096);
				else
					for (Class38_Sub12 class38_sub12 = (Class38_Sub12) Class13.aClass14_238.method75(l); class38_sub12 != null; class38_sub12 = (Class38_Sub12) Class13.aClass14_238.method81((byte) -36))
						if (method175(true, class38_sub12.aClass19_2109))
							return class38_sub12.aClass19_2109;
				Class38_Sub12 class38_sub12 = new Class38_Sub12();
				aBool455 = false;
				class38_sub12.aClass19_2109 = this;
				Class13.aClass14_238.method80(true, l, class38_sub12);
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.LA(" + i + ')');
		}
	}

	final byte[] method158(int i) {
		try {
			if (i != 122)
				return null;
			byte[] is = new byte[this.length];
			Class71.arrayCopy(this.buffer, 0, is, 0, this.length);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.BA(" + i + ')');
		}
	}

	final int method159(boolean bool, int i) {
		try {
			if (i < 1 || i > 36)
				i = 10;
			boolean bool_75_ = bool;
			int i_76_ = 0;
			boolean bool_77_ = false;
			for (int i_78_ = 0; this.length > i_78_; i_78_++) {
				int i_79_ = this.buffer[i_78_] & 0xff;
				if (i_78_ == 0) {
					if (i_79_ == 45) {
						bool_75_ = true;
						continue;
					}
					if (i_79_ == 43)
						continue;
				}
				if (i_79_ >= 48 && i_79_ <= 57)
					i_79_ -= 48;
				else if (i_79_ >= 65 && i_79_ <= 90)
					i_79_ -= 55;
				else {
					if (i_79_ < 97 || i_79_ > 122)
						throw new NumberFormatException();
					i_79_ -= 87;
				}
				if (i_79_ >= i)
					throw new NumberFormatException();
				if (bool_75_)
					i_79_ = -i_79_;
				int i_80_ = i_79_ + i_76_ * i;
				if (i_80_ / i != i_76_)
					throw new NumberFormatException();
				i_76_ = i_80_;
				bool_77_ = true;
			}
			if (!bool_77_)
				throw new NumberFormatException();
			return i_76_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.KA(" + bool + ',' + i + ')');
		}
	}

	static final void method160(byte i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_) {
		try {
			Class38_Sub1.aClass38_Sub20_Sub9_Sub2Array1730[0].method1089(i_83_, i_82_);
			Class38_Sub1.aClass38_Sub20_Sub9_Sub2Array1730[1].method1089(i_83_, i_82_ - 16 + i_85_);
			if (i != 53)
				RSString.method179(false, 62);
			Class38_Sub20_Sub9.method958(i_83_, i_82_ + 16, 16, i_85_ - 32, Class76.anInt1484);
			int i_86_ = i_85_ * (i_85_ - 32) / i_84_;
			if (i_86_ < 8)
				i_86_ = 8;
			int i_87_ = i_81_ * (-i_86_ + i_85_ - 32) / (-i_85_ + i_84_);
			Class38_Sub20_Sub9.method958(i_83_, i_87_ + 16 + i_82_, 16, i_86_, Class38_Sub18.anInt2217);
			Class38_Sub20_Sub9.method965(i_83_, i_82_ + 16 + i_87_, i_86_, Class38_Sub20_Sub10.anInt2908);
			Class38_Sub20_Sub9.method965(i_83_ + 1, i_87_ + 16 + i_82_, i_86_, Class38_Sub20_Sub10.anInt2908);
			Class38_Sub20_Sub9.method968(i_83_, i_82_ + 16 + i_87_, 16, Class38_Sub20_Sub10.anInt2908);
			Class38_Sub20_Sub9.method968(i_83_, i_87_ + i_82_ + 17, 16, Class38_Sub20_Sub10.anInt2908);
			Class38_Sub20_Sub9.method965(i_83_ + 15, i_82_ + 16 + i_87_, i_86_, Class10.anInt185);
			Class38_Sub20_Sub9.method965(i_83_ + 14, i_82_ + i_87_ + 17, i_86_ - 1, Class10.anInt185);
			Class38_Sub20_Sub9.method968(i_83_, i_82_ + 15 + i_87_ + i_86_, 16, Class10.anInt185);
			Class38_Sub20_Sub9.method968(i_83_ + 1, i_86_ + 14 + i_82_ + i_87_, 15, Class10.anInt185);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.O(" + i + ',' + i_81_ + ',' + i_82_ + ',' + i_83_ + ',' + i_84_ + ',' + i_85_ + ')');
		}
	}

	final RSString method161(int i) {
		try {
			RSString class19_88_ = new RSString();
			if (i != 97)
				return null;
			int i_89_ = 2;
			class19_88_.length = this.length;
			class19_88_.buffer = new byte[this.length];
			for (int i_90_ = 0; this.length > i_90_; i_90_++) {
				byte i_91_ = this.buffer[i_90_];
				if ((i_91_ < 97 || i_91_ > 122) && (i_91_ < -32 || i_91_ > -2 || i_91_ == -9)) {
					if (i_91_ >= 65 && i_91_ <= 90 || i_91_ >= -64 && i_91_ <= -34 && i_91_ != -41) {
						if (i_89_ == 0)
							i_91_ += 32;
						i_89_ = 0;
					} else if (i_91_ == 46 || i_91_ == 33 || i_91_ == 63)
						i_89_ = 2;
					else if (i_91_ != 32)
						i_89_ = 1;
					else if (i_89_ != 2)
						i_89_ = 1;
				} else {
					if (i_89_ == 2)
						i_91_ -= 32;
					i_89_ = 0;
				}
				class19_88_.buffer[i_90_] = i_91_;
			}
			return class19_88_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.GA(" + i + ')');
		}
	}

	final long method162(int i) {
		try {
			long l = 0L;
			for (int i_92_ = i; this.length > i_92_; i_92_++) {
				if (i_92_ >= 12)
					break;
				l *= 37L;
				byte i_93_ = this.buffer[i_92_];
				if (i_93_ >= 65 && i_93_ <= 90)
					l += i_93_ + 1 - 65;
				else if (i_93_ >= 97 && i_93_ <= 122)
					l += i_93_ - 96;
				else if (i_93_ >= 48 && i_93_ <= 57)
					l += i_93_ - 48 + 27;
			}
			for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
				/* empty */
			}
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.V(" + i + ')');
		}
	}

	final int method163(int i, int i_94_) {
		try {
			int i_95_ = -84 / ((i + 79) / 37);
			return this.buffer[i_94_] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.S(" + i + ',' + i_94_ + ')');
		}
	}

	final int method164(int i) {
		try {
			int i_96_ = -7 % ((i + 49) / 48);
			return method159(false, 10);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.M(" + i + ')');
		}
	}

	boolean equals(RSString text) {
		try {
			if (this.length < text.length)
				return false;
			for (int i = 0; text.length > i; i++)
				if (text.buffer[i] != this.buffer[i])
					return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.RA(" + (text != null ? "{...}" : "null") + ',' + true + ')');
		}
	}

	final int method166(int i, byte i_98_) {
		try {
			if (i_98_ >= -90)
				aBool455 = false;
			return method153(0, i, -34);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.EA(" + i + ',' + i_98_ + ')');
		}
	}

	final RSString method167(byte i) {
		try {
			RSString class19_99_ = new RSString();
			class19_99_.length = this.length;
			boolean bool = true;
			class19_99_.buffer = new byte[this.length];
			for (int i_100_ = 0; i_100_ < this.length; i_100_++) {
				byte i_101_ = this.buffer[i_100_];
				if (i_101_ != 95) {
					if (i_101_ >= 97 && i_101_ <= 122 && bool) {
						class19_99_.buffer[i_100_] = (byte) (i_101_ - 32);
						bool = false;
					} else {
						class19_99_.buffer[i_100_] = i_101_;
						bool = false;
					}
				} else {
					class19_99_.buffer[i_100_] = (byte) 32;
					bool = true;
				}
			}
			if (i != 52)
				return null;
			return class19_99_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.B(" + i + ')');
		}
	}

	static final void method168(int i, int i_102_, int i_103_, int i_104_, byte i_105_) {
		try {
			if (i_105_ != -121)
				RSString.anInt481 = 127;
			for (int i_106_ = 0; Class38_Sub20_Sub11.anInt2957 > i_106_; i_106_++)
				if (i_103_ < Class38_Sub8.anIntArray2045[i_106_] + Class22.anIntArray536[i_106_] && Class38_Sub8.anIntArray2045[i_106_] < i_103_ + i && Class67.anIntArray1387[i_106_] + Class64.anIntArray1356[i_106_] > i_102_ && Class67.anIntArray1387[i_106_] < i_104_ + i_102_)
					Class73_Sub2.aBoolArray2294[i_106_] = true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.JA(" + i + ',' + i_102_ + ',' + i_103_ + ',' + i_104_ + ',' + i_105_ + ')');
		}
	}

	final boolean method169(int i, RSString class19_107_) {
		try {
			if (this.length < class19_107_.length)
				return false;
			int i_108_ = -class19_107_.length + this.length;
			for (int i_109_ = i; class19_107_.length > i_109_; i_109_++)
				if (this.buffer[i_108_ + i_109_] != class19_107_.buffer[i_109_])
					return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.A(" + i + ',' + (class19_107_ != null ? "{...}" : "null") + ')');
		}
	}

	final int method170(int i, RSString class19_110_) {
		try {
			if (i != 1)
				return -50;
			return method152(class19_110_, 0, 121);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.J(" + i + ',' + (class19_110_ != null ? "{...}" : "null") + ')');
		}
	}

	final RSString substring(byte i, int i_111_) {
		try {
			if (i >= -1)
				method169(9, null);
			return method144((byte) -125, i_111_, this.length);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.UA(" + i + ',' + i_111_ + ')');
		}
	}

	final RSString method172(int i) {
		try {
			if (!aBool455)
				throw new IllegalArgumentException();
			anInt423 = 0;
			if (this.buffer.length != this.length) {
				byte[] is = new byte[this.length];
				Class71.arrayCopy(this.buffer, 0, is, 0, this.length);
				this.buffer = is;
			}
			if (i != -8087)
				RSString.aClass19_432 = null;
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.U(" + i + ')');
		}
	}

	final RSString method173(boolean bool) {
		try {
			if (bool)
				this.buffer = null;
			RSString class19_112_ = new RSString();
			class19_112_.length = this.length;
			class19_112_.buffer = new byte[this.length];
			for (int i = 0; i < this.length; i++) {
				byte i_113_ = this.buffer[i];
				if (i_113_ >= 65 && i_113_ <= 90 || i_113_ >= -64 && i_113_ <= -34 && i_113_ != -41)
					i_113_ += 32;
				class19_112_.buffer[i] = i_113_;
			}
			return class19_112_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.T(" + bool + ')');
		}
	}

	final boolean method174(byte i, RSString class19_114_) {
		try {
			if (class19_114_ == null)
				return false;
			if (class19_114_.length != this.length)
				return false;
			for (int i_115_ = 0; i_115_ < this.length; i_115_++) {
				byte i_116_ = class19_114_.buffer[i_115_];
				if (i_116_ >= 65 && i_116_ <= 90 || i_116_ >= -64 && i_116_ <= -34 && i_116_ != -41)
					i_116_ += 32;
				byte i_117_ = this.buffer[i_115_];
				if (i_117_ >= 65 && i_117_ <= 90 || i_117_ >= -64 && i_117_ <= -34 && i_117_ != -41)
					i_117_ += 32;
				if (i_116_ != i_117_)
					return false;
			}
			if (i <= 98)
				method170(48, null);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.FA(" + i + ',' + (class19_114_ != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method175(boolean bool, RSString class19_118_) {
		try {
			if (class19_118_ == null)
				return false;
			if (class19_118_.length != this.length)
				return false;
			if (!aBool455 || !class19_118_.aBool455) {
				if (anInt423 == 0) {
					anInt423 = method150(-44);
					if (anInt423 == 0)
						anInt423 = 1;
				}
				if (class19_118_.anInt423 == 0) {
					class19_118_.anInt423 = class19_118_.method150(-44);
					if (class19_118_.anInt423 == 0)
						class19_118_.anInt423 = 1;
				}
				if (anInt423 != class19_118_.anInt423)
					return false;
			}
			if (bool != true)
				method178(85);
			for (int i = 0; this.length > i; i++)
				if (class19_118_.buffer[i] != this.buffer[i])
					return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.TA(" + bool + ',' + (class19_118_ != null ? "{...}" : "null") + ')');
		}
	}

	final RSString method176(int i, int i_119_) {
		try {
			if (i_119_ != -5)
				return null;
			if (i <= 0 || i > 255)
				throw new IllegalArgumentException("invalid char:" + i);
			if (!aBool455)
				throw new IllegalArgumentException();
			anInt423 = 0;
			if (this.length == this.buffer.length) {
				int i_120_;
				for (i_120_ = 1; this.length >= i_120_; i_120_ += i_120_) {
					/* empty */
				}
				byte[] is = new byte[i_120_];
				Class71.arrayCopy(this.buffer, 0, is, 0, this.length);
				this.buffer = is;
			}
			this.buffer[this.length++] = (byte) i;
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.R(" + i + ',' + i_119_ + ')');
		}
	}

	final boolean method177(byte i) {
		try {
			if (i != -36)
				RSString.method179(false, 59);
			return method139(-119, 10);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.I(" + i + ')');
		}
	}

	final RSString method178(int i) {
		try {
			int i_121_ = 0;
			if (i != -91)
				method148(97, null);
			for (/**/; this.length > i_121_ && (this.buffer[i_121_] >= 0 && this.buffer[i_121_] <= 32 || (this.buffer[i_121_] & 0xff) == 160); i_121_++) {
				/* empty */
			}
			int i_122_;
			for (i_122_ = this.length; i_121_ < i_122_ && (this.buffer[i_122_ - 1] >= 0 && this.buffer[i_122_ - 1] <= 32 || (this.buffer[i_122_ - 1] & 0xff) == 160); i_122_--) {
				/* empty */
			}
			if (i_121_ == 0 && i_122_ == this.length)
				return this;
			RSString class19_123_ = new RSString();
			class19_123_.length = -i_121_ + i_122_;
			class19_123_.buffer = new byte[class19_123_.length];
			for (int i_124_ = 0; i_124_ < class19_123_.length; i_124_++)
				class19_123_.buffer[i_124_] = this.buffer[i_124_ + i_121_];
			return class19_123_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.E(" + i + ')');
		}
	}

	static final Class38_Sub20_Sub10 method179(boolean bool, int i) {
		try {
			Class38_Sub20_Sub10 class38_sub20_sub10 = (Class38_Sub20_Sub10) Class38_Sub2.aClass83_1757.method591(-28825, i);
			if (class38_sub20_sub10 != null)
				return class38_sub20_sub10;
			byte[] is = Class38_Sub1.aClass17_Sub1_1724.getFileData(i, 0, -118);
			if (is == null)
				return null;
			class38_sub20_sub10 = new Class38_Sub20_Sub10();
			RS2Buffer class38_sub23 = new RS2Buffer(is);
			int i_125_ = 0;
			class38_sub23.pos = class38_sub23.buffer.length - 12;
			int i_126_ = class38_sub23.readInt(bool);
			class38_sub20_sub10.anInt2892 = class38_sub23.readUnsignedShort();
			class38_sub20_sub10.anInt2897 = class38_sub23.readUnsignedShort();
			class38_sub20_sub10.anInt2900 = class38_sub23.readUnsignedShort();
			class38_sub20_sub10.anInt2896 = class38_sub23.readUnsignedShort();
			class38_sub23.pos = 0;
			class38_sub20_sub10.aClass19_2894 = class38_sub23.method728((byte) 32);
			class38_sub20_sub10.anIntArray2898 = new int[i_126_];
			class38_sub20_sub10.aClass19Array2901 = new RSString[i_126_];
			class38_sub20_sub10.anIntArray2903 = new int[i_126_];
			while (class38_sub23.buffer.length - 12 > class38_sub23.pos) {
				int i_127_ = class38_sub23.readUnsignedShort();
				if (i_127_ == 3)
					class38_sub20_sub10.aClass19Array2901[i_125_] = class38_sub23.readString(1347418632);
				else if (i_127_ >= 100 || i_127_ == 21 || i_127_ == 38 || i_127_ == 39)
					class38_sub20_sub10.anIntArray2903[i_125_] = class38_sub23.readUnsignedByte();
				else
					class38_sub20_sub10.anIntArray2903[i_125_] = class38_sub23.readInt(bool);
				class38_sub20_sub10.anIntArray2898[i_125_++] = i_127_;
			}
			Class38_Sub2.aClass83_1757.method590(i, (byte) -119, class38_sub20_sub10);
			return class38_sub20_sub10;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.DA(" + bool + ',' + i + ')');
		}
	}

	final RSString method180(int i, int i_128_) {
		try {
			if (i != 255)
				method164(15);
			if (i_128_ <= 0 || i_128_ > 255)
				throw new IllegalArgumentException("invalid char");
			RSString class19_129_ = new RSString();
			class19_129_.buffer = new byte[this.length + 1];
			class19_129_.length = this.length + 1;
			Class71.arrayCopy(this.buffer, 0, class19_129_.buffer, 0, this.length);
			class19_129_.buffer[this.length] = (byte) i_128_;
			return class19_129_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.AA(" + i + ',' + i_128_ + ')');
		}
	}

	final URL method181(int i) throws MalformedURLException {
		try {
			if (i > -76)
				RSString.anIntArrayArrayArray445 = null;
			return new URL(new String(this.buffer, 0, this.length));
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ec.IA(" + i + ')');
		}
	}

	static final RSString createRSString(String string) {
		byte[] strBytes = string.getBytes();
		int strBytesLen = strBytes.length;
		RSString instance = new RSString();
		instance.buffer = new byte[strBytesLen];
		int offset = 0;
		while (strBytesLen > offset) {
			int i_2_ = strBytes[offset++] & 0xff;
			if (i_2_ <= 45 && i_2_ >= 40) {
				if (offset >= strBytesLen)
					break;
				int i_3_ = strBytes[offset++] & 0xff;
				instance.buffer[instance.length++] = (byte) (i_3_ - 48 + (i_2_ - 40) * 43);
			} else if (i_2_ != 0)
				instance.buffer[instance.length++] = (byte) i_2_;
		}
		instance.method172(-8087);
		return instance.method157((byte) 10);
	}

	/* synthetic */static Class method182(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}

	static {
		RSString.aClass19_430 = RSString.aClass19_459;
		RSString.aClass19_432 = RSString.aClass19_461;
	}
}
