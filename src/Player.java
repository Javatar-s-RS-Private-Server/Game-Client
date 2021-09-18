/* Class38_Sub20_Sub3_Sub7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Player extends Entity {
	static RSString aClass19_3562;
	static int anInt3565;
	static int[][][] anIntArrayArrayArray3566 = new int[4][105][105];
	static int anInt3569;
	static int[] anIntArray3574;
	static int anInt3582 = 0;
	static int anInt3583;
	static Class38_Sub20_Sub9_Sub3[] aClass38_Sub20_Sub9_Sub3Array3587;
	static RSString aClass19_3592;
	private static RSString aClass19_3570;
	private static RSString aClass19_3597;

	static {
		Player.aClass19_3570 = RSString
				.createRSString("Connecting to update server");
		Player.aClass19_3562 = Player.aClass19_3570;
		Player.anInt3569 = -1;
		Player.anInt3565 = 127;
		client.pingTimer = 0;
		Player.aClass19_3597 = RSString.createRSString("Close");
		Player.aClass19_3592 = Player.aClass19_3597;
	}

	int anInt3563;
	PlayerAppearance appearance;
	int anInt3568;
	int combatLevel;
	int anInt3572;
	int team;
	int anInt3575 = 0;
	boolean isIdle;// maybe gender?
	int anInt3578;
	int anInt3579;
	int anInt3580;
	int anInt3581;
	int anInt3584;
	int anInt3585;
	int skillLevel;
	int anInt3589;
	Class38_Sub20_Sub3_Sub1 aClass38_Sub20_Sub3_Sub1_3590;
	RSString name;
	int anInt3596;

	Player() {
		this.team = 0;
		this.anInt3589 = 0;
		this.combatLevel = 0;
		this.isIdle = false;
		this.skillLevel = 0;
		this.anInt3596 = -1;
		this.anInt3585 = -1;
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
					equipmentIds[id] = off + (equipId << 8);
					if (id == 0 && equipmentIds[0] == 65535) {
						npcId = stream.readUnsignedShortLE();
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
			this.idleAnimation = stream.readUnsignedShortLE();
			if (this.idleAnimation == 65535)
				this.idleAnimation = -1;
			this.turnAnimation = stream.readUnsignedShortLE();
			if (this.turnAnimation == 65535)
				this.turnAnimation = -1;
			int i_9_ = 35 / ((i + 36) / 58);
			this.anInt3462 = this.turnAnimation;
			this.walkAnimation = stream.readUnsignedShortLE();
			if (this.walkAnimation == 65535)
				this.walkAnimation = -1;
			this.turn180Animation = stream.readUnsignedShortLE();
			if (this.turn180Animation == 65535)
				this.turn180Animation = -1;
			this.turn90CWAnimation = stream.readUnsignedShortLE();
			if (this.turn90CWAnimation == 65535)
				this.turn90CWAnimation = -1;
			this.turn90CCAnimation = stream.readUnsignedShortLE();
			if (this.turn90CCAnimation == 65535)
				this.turn90CCAnimation = -1;
			this.runAnimation = stream.readUnsignedShortLE();
			if (this.runAnimation == 65535)
				this.runAnimation = -1;
			this.name = Class73.method520(stream.readLong(-109), 1).method167(
					(byte) 52);
			this.combatLevel = stream.getUByte();
			this.skillLevel = stream.readUnsignedShortLE();
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
			Class38_Sub20_Sub4 class38_sub20_sub4 = this.currentAnimationId != -1
					&& this.anInt3461 == 0 ? Sequence.forID(
					(byte) 95, this.currentAnimationId) : null;
			Class38_Sub20_Sub4 class38_sub20_sub4_10_ = this.anInt3454 == -1
					|| this.isIdle
					|| this.anInt3454 == this.idleAnimation
					&& class38_sub20_sub4 != null ? null : Sequence.forID(
					(byte) 123, this.anInt3454);
			if (i != 109)
				return null;
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = this.appearance
					.method136(class38_sub20_sub4, this.anInt3474,
							class38_sub20_sub4_10_, -5774,
							this.anInt3471);
			if (class38_sub20_sub3_sub1 == null)
				return null;
			class38_sub20_sub3_sub1.method1043();
			this.anInt3434 = class38_sub20_sub3_sub1.height;
			if (!this.isIdle && this.anInt3477 != -1
					&& this.anInt3500 != -1) {
				Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1_11_ = Class38_Sub11
						.method673(this.anInt3477, -14).method984(
								118, this.anInt3500);
				if (class38_sub20_sub3_sub1_11_ != null) {
					Class38_Sub20_Sub3_Sub1[] class38_sub20_sub3_sub1s = {
							class38_sub20_sub3_sub1,
							class38_sub20_sub3_sub1_11_ };
					class38_sub20_sub3_sub1_11_.method1056(0,
							-this.anInt3473, 0);
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
							-this.anInt3493 + this.anInt3563,
							this.anInt3580 - this.anInt3579, this.anInt3584
									- this.anInt3444);
					if (this.anInt3488 == 512) {
						class38_sub20_sub3_sub1_12_.method1040();
						class38_sub20_sub3_sub1_12_.method1040();
						class38_sub20_sub3_sub1_12_.method1040();
					} else if (this.anInt3488 != 1024) {
						if (this.anInt3488 == 1536)
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
					if (this.anInt3488 != 512) {
						if (this.anInt3488 == 1024) {
							class38_sub20_sub3_sub1_12_.method1040();
							class38_sub20_sub3_sub1_12_.method1040();
						} else if (this.anInt3488 == 1536) {
							class38_sub20_sub3_sub1_12_.method1040();
							class38_sub20_sub3_sub1_12_.method1040();
							class38_sub20_sub3_sub1_12_.method1040();
						}
					} else
						class38_sub20_sub3_sub1_12_.method1040();
					class38_sub20_sub3_sub1_12_.method1056(-this.anInt3563
							+ this.anInt3493, this.anInt3579
							- this.anInt3580, -this.anInt3584
							+ this.anInt3444);
				}
			}
			class38_sub20_sub3_sub1.aBool3141 = true;
			return class38_sub20_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "ka.E(" + i + ')');
		}
	}

	@Override
	final boolean isVisible() {
		return this.appearance != null;
	}
}
