package com.javatar.jagex;/* Class38_Sub20_Sub3_Sub7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Player extends Entity {
	static RSString aClass19_3562;
	int anInt3563;
	static int anInt3565;
	static int[][][] anIntArrayArrayArray3566 = new int[4][105][105];
	PlayerAppearance appearance;
	int anInt3568;
	static int anInt3569;
	private static RSString aClass19_3570;
	int combatLevel;
	int anInt3572;
	int team;
	static int[] anIntArray3574;
	int anInt3575 = 0;
	boolean isIdle;// maybe gender?
	int anInt3578;
	int anInt3579;
	int anInt3580;
	int anInt3581;
	static int anInt3582 = 0;
	static int anInt3583;
	int anInt3584;
	int anInt3585;
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array3587;
	int skillLevel;
	int anInt3589;
	Class38_Sub20_Sub3_Sub1 aClass38_Sub20_Sub3_Sub1_3590;
	static RSString aClass19_3592;
	RSString name;
	int anInt3596;
	private static RSString aClass19_3597;

	final void method1205(byte i, RS2Buffer stream) {
		try {
			stream.pos = 0;
			int[] equipmentIds = new int[12];
			int npcId = -1;
			int skullIcon = stream.getUByte();
			this.anInt3585 = stream.method765((byte) 105);
			this.anInt3596 = stream.method765((byte) 80);
			this.team = 0;
			for (int id = 0; id < 12; id++) {
				int equipId = stream.getUByte();
				if (equipId == 0)
					equipmentIds[id] = 0;
				else {
					int off = stream.getUByte();
					equipmentIds[id] = off + (equipId << 2027696008);
					if (id == 0 && equipmentIds[0] == 65535) {
						npcId = stream.getUShort();
						break;
					}
					if (equipmentIds[id] >= 512) {
						int iTeam = Node.forId(equipmentIds[id] - 512, 122).team;
						if (iTeam != 0)
							this.team = iTeam;
					}
				}
			}
			int[] colors = new int[5];
			for (int id = 0; id < 5; id++) {
				int color = stream.getUByte();
				if (color < 0 || Class45.characterColors[id].length <= color)
					color = 0;
				colors[id] = color;
			}
			((Entity) this).idleAnimation = stream.getUShort();
			if (((Entity) this).idleAnimation == 65535)
				((Entity) this).idleAnimation = -1;
			((Entity) this).turnAnimation = stream.getUShort();
			if (((Entity) this).turnAnimation == 65535)
				((Entity) this).turnAnimation = -1;
			int i_9_ = 35 / ((i + 36) / 58);
			((Entity) this).anInt3462 = ((Entity) this).turnAnimation;
			((Entity) this).walkAnimation = stream.getUShort();
			if (((Entity) this).walkAnimation == 65535)
				((Entity) this).walkAnimation = -1;
			((Entity) this).turn180Animation = stream.getUShort();
			if (((Entity) this).turn180Animation == 65535)
				((Entity) this).turn180Animation = -1;
			((Entity) this).turn90CWAnimation = stream.getUShort();
			if (((Entity) this).turn90CWAnimation == 65535)
				((Entity) this).turn90CWAnimation = -1;
			((Entity) this).turn90CCAnimation = stream.getUShort();
			if (((Entity) this).turn90CCAnimation == 65535)
				((Entity) this).turn90CCAnimation = -1;
			((Entity) this).runAnimation = stream.getUShort();
			if (((Entity) this).runAnimation == 65535)
				((Entity) this).runAnimation = -1;
			this.name = Class73.method520(stream.method748(-109), 1).method167(
					(byte) 52);
			this.combatLevel = stream.getUByte();
			this.skillLevel = stream.getUShort();
			if (this.appearance == null)
				this.appearance = new PlayerAppearance();
			this.appearance.setAppearance(colors, npcId, equipmentIds,
					skullIcon == 1, (byte) -19);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ka.J(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final Class38_Sub20_Sub3_Sub1 method820(byte i) {
		try {
			if (this.appearance == null)
				return null;
			Class38_Sub20_Sub4 class38_sub20_sub4 = ((Entity) this).currentAnimationId != -1
					&& ((Entity) this).anInt3461 == 0 ? Sequence.forID(
					(byte) 95, ((Entity) this).currentAnimationId) : null;
			Class38_Sub20_Sub4 class38_sub20_sub4_10_ = ((Entity) this).anInt3454 == -1
					|| this.isIdle
					|| ((Entity) this).anInt3454 == ((Entity) this).idleAnimation
					&& class38_sub20_sub4 != null ? null : Sequence.forID(
					(byte) 123, ((Entity) this).anInt3454);
			if (i != 109)
				return null;
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = this.appearance
					.method136(class38_sub20_sub4, ((Entity) this).anInt3474,
							class38_sub20_sub4_10_, -5774,
							((Entity) this).anInt3471);
			if (class38_sub20_sub3_sub1 == null)
				return null;
			class38_sub20_sub3_sub1.method1043();
			((Entity) this).anInt3434 = ((SceneModel) class38_sub20_sub3_sub1).height;
			if (!this.isIdle && ((Entity) this).anInt3477 != -1
					&& ((Entity) this).anInt3500 != -1) {
				Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_11_ = Class38_Sub11
						.method673(((Entity) this).anInt3477, -14).method984(
								118, ((Entity) this).anInt3500);
				if (class38_sub20_sub3_sub1_11_ != null) {
					Class38_Sub20_Sub3_Sub1[] class38_sub20_sub3_sub1s = {
							class38_sub20_sub3_sub1,
							class38_sub20_sub3_sub1_11_ };
					class38_sub20_sub3_sub1_11_.method1056(0,
							-((Entity) this).anInt3473, 0);
					class38_sub20_sub3_sub1 = new Class38_Sub20_Sub3_Sub1(
							class38_sub20_sub3_sub1s, 2);
				}
			}
			if (!this.isIdle && this.aClass38_Sub20_Sub3_Sub1_3590 != null) {
				if (this.anInt3589 <= Class45.anInt1016)
					this.aClass38_Sub20_Sub3_Sub1_3590 = null;
				if (this.anInt3575 <= Class45.anInt1016
						&& this.anInt3589 > Class45.anInt1016) {
					Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_12_ = this.aClass38_Sub20_Sub3_Sub1_3590;
					class38_sub20_sub3_sub1_12_.method1056(
							-((Entity) this).anInt3493 + this.anInt3563,
							this.anInt3580 - this.anInt3579, this.anInt3584
									- ((Entity) this).anInt3444);
					if (((Entity) this).anInt3488 == 512) {
						class38_sub20_sub3_sub1_12_.method1040();
						class38_sub20_sub3_sub1_12_.method1040();
						class38_sub20_sub3_sub1_12_.method1040();
					} else if (((Entity) this).anInt3488 != 1024) {
						if (((Entity) this).anInt3488 == 1536)
							class38_sub20_sub3_sub1_12_.method1040();
					} else {
						class38_sub20_sub3_sub1_12_.method1040();
						class38_sub20_sub3_sub1_12_.method1040();
					}
					Class38_Sub20_Sub3_Sub1[] class38_sub20_sub3_sub1s = {
							class38_sub20_sub3_sub1,
							class38_sub20_sub3_sub1_12_ };
					class38_sub20_sub3_sub1 = new Class38_Sub20_Sub3_Sub1(
							class38_sub20_sub3_sub1s, 2);
					if (((Entity) this).anInt3488 != 512) {
						if (((Entity) this).anInt3488 == 1024) {
							class38_sub20_sub3_sub1_12_.method1040();
							class38_sub20_sub3_sub1_12_.method1040();
						} else if (((Entity) this).anInt3488 == 1536) {
							class38_sub20_sub3_sub1_12_.method1040();
							class38_sub20_sub3_sub1_12_.method1040();
							class38_sub20_sub3_sub1_12_.method1040();
						}
					} else
						class38_sub20_sub3_sub1_12_.method1040();
					class38_sub20_sub3_sub1_12_.method1056(-this.anInt3563
							+ ((Entity) this).anInt3493, this.anInt3579
							- this.anInt3580, -this.anInt3584
							+ ((Entity) this).anInt3444);
				}
			}
			class38_sub20_sub3_sub1.aBool3141 = true;
			return class38_sub20_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ka.E(" + i + ')');
		}
	}

	static final int method1206(byte i, int i_13_) {
		try {
			Class38_Sub20_Sub17 class38_sub20_sub17 = Class60.method457(i_13_,
					(byte) -124);
			int i_14_ = class38_sub20_sub17.anInt3132;
			if (i != -98)
				return -32;
			int i_15_ = class38_sub20_sub17.anInt3123;
			int i_16_ = class38_sub20_sub17.anInt3135;
			int i_17_ = Class74.anIntArray1435[i_16_ - i_15_];
			return Class21.anIntArray528[i_14_] >> i_15_ & i_17_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ka.H(" + i + ','
					+ i_13_ + ')');
		}
	}

	@Override
	final boolean isVisible() {
		if (this.appearance == null)
			return false;
		return true;
	}

	static final void method1207(byte i) {
		try {
			Player.anIntArray3574 = null;
			if (i == 29) {
				Class51.anIntArray1130 = null;
				Class30.aByteArrayArray727 = null;
				Class61.anIntArray1332 = null;
				Class38_Sub20_Sub8.anIntArray2873 = null;
				PlayerAppearance.anIntArray420 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ka.G(" + i + ')');
		}
	}

	public static void method1208(byte i) {
		try {
			Player.aClass19_3592 = null;
			Player.aClass38_Sub20_Sub9_Sub3Array3587 = null;
			Player.aClass19_3562 = null;
			if (i == -68) {
				Player.anIntArray3574 = null;
				Player.anIntArrayArrayArray3566 = null;
				Player.aClass19_3597 = null;
				Player.aClass19_3570 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ka.I(" + i + ')');
		}
	}

	Player() {
		this.team = 0;
		this.anInt3589 = 0;
		this.combatLevel = 0;
		this.isIdle = false;
		this.skillLevel = 0;
		this.anInt3596 = -1;
		this.anInt3585 = -1;
	}

	static {
		Player.aClass19_3570 = RSString
				.createRSString("Connecting to update server");
		Player.aClass19_3562 = Player.aClass19_3570;
		Player.anInt3569 = -1;
		Player.anInt3565 = 127;
		Client.pingTimer = 0;
		Player.aClass19_3597 = RSString.createRSString("Close");
		Player.aClass19_3592 = Player.aClass19_3597;
	}
}
