package com.javatar.jagex;/* Entity - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Entity extends SceneModel {
	int idleAnimation;
	int anInt3434;
	int anInt3436;
	int hitCycle;
	static RSString aClass19_3438;
	int anInt3439 = 32;
	int anInt3440;
	int walkQueueLocationIndex;
	int faceY = 0;
	int anInt3444;
	static RSString aClass19_3445;
	static int packetLength = 0;
	int anInt3447;
	private static RSString aClass19_3448 = RSString.createRSString("Drop");
	int anInt3450;
	int runAnimation;
	int anInt3452;
	int anInt3454 = -1;
	int walkAnimation;
	int anInt3456;
	int anInt3457;
	int animationId;
	int anInt3459;
	int anInt3460;
	int animationDelay;
	int anInt3462;
	int anInt3463;
	static int anInt3464;
	static RSString aClass19_3465 = RSString.createRSString("<)4col> x");
	static Class83 aClass83_3466;
	RSString aClass19_3467;
	int[] hitCycles;
	int turn90CWAnimation;
	int anInt3470;
	int anInt3471;
	int anInt3473;
	int anInt3474;
	int turn90CCAnimation;
	int anInt3476;
	int anInt3477;
	boolean[] runningFlags;
	int turn180Animation;
	boolean aBool3481;
	int[] walkQueueY;
	int anInt3483;
	int anInt3484;
	static RSString aClass19_3485 = Entity.aClass19_3448;
	int anInt3486;
	int faceX;
	int anInt3488;
	static int anInt3489 = 0;
	int turnAnimation;
	int anInt3491;
	int[] hitMarkTypes;
	int anInt3493;
	int anInt3494;
	int anInt3495;
	int anInt3497;
	int anInt3498;
	int anInt3499;
	int anInt3500;
	int anInt3501;
	int facingEntityIndex;
	int anInt3503;
	int[] hitValues;
	int[] walkQueueX;
	static RSString aClass19_3506;
	private static RSString aClass19_3508;
	static RSString aClass19_3509;
	static int anInt3510;
	static boolean aBool3511;
	static RSString aClass19_3512;
	static int anInt3513;
	static Class14 aClass14_3514;
	static RSString aClass19_3515;
	static RSString aClass19_3516;
	static RSString aClass19_3517;
	static RSString aClass19_3518;

	public static void method1171(int i) {
		try {
			Entity.aClass19_3506 = null;
			Entity.aClass19_3515 = null;
			Entity.aClass19_3465 = null;
			Entity.aClass19_3485 = null;
			Entity.aClass19_3448 = null;
			Entity.aClass14_3514 = null;
			Entity.aClass19_3438 = null;
			Entity.aClass83_3466 = null;
			Entity.aClass19_3512 = null;
			if (i == -1) {
				Entity.aClass19_3509 = null;
				Entity.aClass19_3518 = null;
				Entity.aClass19_3445 = null;
				Entity.aClass19_3516 = null;
				Entity.aClass19_3508 = null;
				Entity.aClass19_3517 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qd.O(" + i + ')');
		}
	}

	static final void method1172(int i) {
		try {
			Class38_Sub14.aClass83_2130.method596(-93);
			if (i != -1708)
				Entity.method1171(-26);
			Class78.aClass83_1547.method596(i + 1601);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qd.T(" + i + ')');
		}
	}

	final void move(int direction, boolean running) {
		int x = this.walkQueueX[0];
		int y = this.walkQueueY[0];
		if (direction == 0) {
			y++;
			x--;
		}
		if (this.animationId != -1
				&& Sequence.forID((byte) 111, this.animationId).walkProperties == 1)
			this.animationId = -1;
		if (direction == 1)
			y++;
		if (this.walkQueueLocationIndex < 9)
			this.walkQueueLocationIndex++;
		if (direction == 2) {
			y++;
			x++;
		}
		for (int id = this.walkQueueLocationIndex; id > 0; id--) {
			this.walkQueueX[id] = this.walkQueueX[id - 1];
			this.walkQueueY[id] = this.walkQueueY[id - 1];
			this.runningFlags[id] = this.runningFlags[id - 1];
		}
		if (direction == 3)
			x--;
		if (direction == 4)
			x++;
		this.runningFlags[0] = running;
		if (direction == 5) {
			x--;
			y--;
		}
		if (direction == 6)
			y--;
		if (direction == 7) {
			y--;
			x++;
		}
		this.walkQueueX[0] = x;
		this.walkQueueY[0] = y;
	}

	static final int method1174(int i, int i_4_, byte i_5_) {
		try {
			if (i_5_ != -127)
				Entity.aClass83_3466 = null;
			int i_6_ = i >>> -1650948801;
			return (i + i_6_) / i_4_ - i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qd.R(" + i + ','
					+ i_4_ + ',' + i_5_ + ')');
		}
	}

	final void updatePosition(int x, int y, boolean stop) {
		if (this.animationId != -1
				&& Sequence.forID((byte) 94, this.animationId).walkProperties == 1)
			this.animationId = -1;
		if (!stop) {
			int i_9_ = -this.walkQueueY[0] + y;
			int i_10_ = x - this.walkQueueX[0];
			if (i_10_ >= -8 && i_10_ <= 8 && i_9_ >= -8 && i_9_ <= 8) {
				if (this.walkQueueLocationIndex < 9)
					this.walkQueueLocationIndex++;
				for (int id = this.walkQueueLocationIndex; id > 0; id--) {
					this.walkQueueX[id] = this.walkQueueX[id - 1];
					this.walkQueueY[id] = this.walkQueueY[id - 1];
					this.runningFlags[id] = this.runningFlags[id - 1];
				}
				this.walkQueueX[0] = x;
				this.runningFlags[0] = false;
				this.walkQueueY[0] = y;
				return;
			}
		}
		this.anInt3440 = 0;
		this.walkQueueLocationIndex = 0;
		this.walkQueueX[0] = x;
		this.anInt3494 = 0;
		this.walkQueueY[0] = y;
		this.anInt3444 = this.walkQueueY[0] * 128 + this.anInt3457 * 64;
		this.anInt3493 = this.walkQueueX[0] * 128 + this.anInt3457 * 64;
	}

	static final void method1176(int i) {
		try {
			Client.outputBuffer.writeIsaacByte(23);
			Class28.anInt689++;
			Client.outputBuffer.writeLong(i);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qd.L(" + i + ')');
		}
	}

	static final void method1177(int i) {
		try {
			if (i == 0)
				Class38_Sub11.aClass83_2105.method596(-125);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "qd.N(" + i + ')');
		}
	}

	final void resetWalkingQueue() {
		this.walkQueueLocationIndex = 0;
		this.anInt3494 = 0;
	}

	boolean isVisible() {
		return false;
	}

	final void addHit(int cycle, int type, int damage) {
		for (int id = 0; id < 4; id++)
			if (this.hitCycles[id] <= cycle) {
				this.hitValues[id] = damage;
				this.hitMarkTypes[id] = type;
				this.hitCycles[id] = cycle + 70;
				break;
			}
	}

	Entity() {
		this.anInt3447 = 0;
		this.anInt3462 = -1;
		this.anInt3457 = 1;
		this.anInt3452 = 100;
		this.walkQueueLocationIndex = 0;
		this.turn90CWAnimation = -1;
		this.hitCycles = new int[4];
		this.aBool3481 = false;
		this.turn180Animation = -1;
		this.idleAnimation = -1;
		this.anInt3477 = -1;
		this.anInt3434 = 200;
		this.aClass19_3467 = null;
		this.walkQueueY = new int[10];
		this.animationDelay = 0;
		this.anInt3474 = 0;
		this.anInt3440 = 0;
		this.hitCycle = -1000;
		this.turn90CCAnimation = -1;
		this.hitMarkTypes = new int[4];
		this.anInt3460 = 0;
		this.turnAnimation = -1;
		this.anInt3494 = 0;
		this.anInt3498 = 0;
		this.anInt3471 = 0;
		this.animationId = -1;
		this.runningFlags = new boolean[10];
		this.anInt3500 = 0;
		this.anInt3483 = 0;
		this.anInt3499 = 0;
		this.anInt3459 = 0;
		this.faceX = 0;
		this.runAnimation = -1;
		this.walkAnimation = -1;
		this.anInt3495 = 0;
		this.facingEntityIndex = -1;
		this.walkQueueX = new int[10];
		this.anInt3503 = 0;
		this.hitValues = new int[4];
	}

	static {
		Entity.aClass19_3445 = RSString.createRSString("null");
		Entity.aClass19_3438 = RSString.createRSString("<br>(X");
		Entity.aClass19_3506 = RSString.createRSString("titlebutton");
		Entity.aClass83_3466 = new Class83(500);
		Entity.aBool3511 = false;
		Entity.aClass19_3508 = RSString
				.createRSString("Please try using a different world)3");
		Entity.aClass19_3512 = Entity.aClass19_3508;
		Entity.anInt3513 = 1;
		Entity.aClass19_3509 = Entity.aClass19_3508;
		Entity.aClass19_3515 = Entity.aClass19_3508;
		Entity.anInt3510 = (int) (Math.random() * 33.0) - 16;
		Entity.aClass19_3516 = Entity.aClass19_3508;
		Entity.aClass19_3517 = Entity.aClass19_3508;
		Entity.aClass19_3518 = Entity.aClass19_3508;
		Entity.aClass14_3514 = new Class14(512);
	}
}
