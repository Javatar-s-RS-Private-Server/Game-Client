package com.javatar;/* Model - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Model extends SceneModel {
	private static int[] anIntArray3309;
	private static int anInt3312 = 0;
	private static int[] anIntArray3315 = Class38_Sub20_Sub9_Sub4.anIntArray3520;
	private static int[] anIntArray3333 = new int[10000];
	private static int[] anIntArray3340;

	static {
		Model.anIntArray3309 = Class38_Sub20_Sub9_Sub4.anIntArray3528;
		Model.anIntArray3340 = new int[10000];
	}

	short aShort3313;
	short aShort3324;
	private short[] triangleColors;
	private int[] zVertices;
	private byte[] triangleTSkins;
	private byte[] triangleTransparencies;
	private short[] aShortArray3305;
	private boolean aBool3306 = false;
	private byte[] triangleFaceTypes;
	private int[] trianglesA;
	private int vertexCount = 0;
	private int[] xVertices;
	private Class54[] aClass54Array3314;
	private byte[] trianglePriorities;
	private int[] vertexVSkins;
	private short[] aShortArray3318;
	private short[] aShortArray3319;
	private short[] aShortArray3320;
	private short[] aShortArray3321;
	private short[] aShortArray3322;
	private int anInt3323;
	private short[] aShortArray3325;
	private int[] yVertices;
	private Class54[] aClass54Array3327;
	private int texTriangleCount;
	private byte aByte3329;
	private int anInt3330;
	private byte[] aByteArray3331;
	private int triangleCount = 0;
	private short[] aShortArray3334;
	private int anInt3335;
	private byte[] aByteArray3336;
	private int[][] anIntArrayArray3337;
	private int[][] anIntArrayArray3338;
	private int[] trianglesC;
	private short[] aShortArray3341;
	private int anInt3342;
	private int[] anIntArray3343;
	private short[] aShortArray3344;
	private Class41[] aClass41Array3345;
	private int anInt3346;
	private int[] trianglesB;

	private Model() {
		aByte3329 = (byte) 0;
	}

	private Model(byte[] is) {
		aByte3329 = (byte) 0;
		if (is[is.length - 1] == -1 && is[is.length - 2] == -1)
			method1130(is);
		else
			method1136(is);
	}

	Model(Model[] models, int i) {
		aByte3329 = (byte) 0;
		boolean bool = false;
		boolean bool_233_ = false;
		boolean bool_234_ = false;
		boolean bool_235_ = false;
		boolean bool_236_ = false;
		boolean bool_237_ = false;
		vertexCount = 0;
		triangleCount = 0;
		texTriangleCount = 0;
		aByte3329 = (byte) -1;
		for (int id = 0; id < i; id++) {
			Model model = models[id];
			if (model != null) {
				vertexCount += model.vertexCount;
				triangleCount += model.triangleCount;
				texTriangleCount += model.texTriangleCount;
				if (model.trianglePriorities != null)
					bool_233_ = true;
				else {
					if (aByte3329 == -1)
						aByte3329 = model.aByte3329;
					if (aByte3329 != model.aByte3329)
						bool_233_ = true;
				}
				bool = bool | model.triangleFaceTypes != null;
				bool_234_ = bool_234_ | model.triangleTransparencies != null;
				bool_235_ = bool_235_ | model.anIntArray3343 != null;
				bool_236_ = bool_236_ | model.aShortArray3305 != null;
				bool_237_ = bool_237_ | model.triangleTSkins != null;
			}
		}
		xVertices = new int[vertexCount];
		yVertices = new int[vertexCount];
		zVertices = new int[vertexCount];
		vertexVSkins = new int[vertexCount];
		trianglesA = new int[triangleCount];
		trianglesB = new int[triangleCount];
		trianglesC = new int[triangleCount];
		if (bool)
			triangleFaceTypes = new byte[triangleCount];
		if (bool_233_)
			trianglePriorities = new byte[triangleCount];
		if (bool_234_)
			triangleTransparencies = new byte[triangleCount];
		if (bool_235_)
			anIntArray3343 = new int[triangleCount];
		if (bool_236_)
			aShortArray3305 = new short[triangleCount];
		if (bool_237_)
			triangleTSkins = new byte[triangleCount];
		triangleColors = new short[triangleCount];
		if (texTriangleCount > 0) {
			aByteArray3331 = new byte[texTriangleCount];
			aShortArray3344 = new short[texTriangleCount];
			aShortArray3318 = new short[texTriangleCount];
			aShortArray3320 = new short[texTriangleCount];
			aShortArray3341 = new short[texTriangleCount];
			aShortArray3321 = new short[texTriangleCount];
			aShortArray3325 = new short[texTriangleCount];
			aShortArray3322 = new short[texTriangleCount];
			aByteArray3336 = new byte[texTriangleCount];
			aShortArray3334 = new short[texTriangleCount];
			aShortArray3319 = new short[texTriangleCount];
		}
		vertexCount = 0;
		triangleCount = 0;
		texTriangleCount = 0;
		for (int i_240_ = 0; i_240_ < i; i_240_++) {
			Model class38_sub20_sub3_sub3_241_ = models[i_240_];
			if (class38_sub20_sub3_sub3_241_ != null) {
				for (int i_242_ = 0; i_242_ < class38_sub20_sub3_sub3_241_.triangleCount; i_242_++) {
					if (bool
							&& class38_sub20_sub3_sub3_241_.triangleFaceTypes != null)
						triangleFaceTypes[triangleCount] = class38_sub20_sub3_sub3_241_.triangleFaceTypes[i_242_];
					if (bool_233_)
						if (class38_sub20_sub3_sub3_241_.trianglePriorities != null)
							trianglePriorities[triangleCount] = class38_sub20_sub3_sub3_241_.trianglePriorities[i_242_];
						else
							trianglePriorities[triangleCount] = class38_sub20_sub3_sub3_241_.aByte3329;
					if (bool_234_
							&& class38_sub20_sub3_sub3_241_.triangleTransparencies != null)
						triangleTransparencies[triangleCount] = class38_sub20_sub3_sub3_241_.triangleTransparencies[i_242_];
					if (bool_235_
							&& class38_sub20_sub3_sub3_241_.anIntArray3343 != null)
						anIntArray3343[triangleCount] = class38_sub20_sub3_sub3_241_.anIntArray3343[i_242_];
					if (bool_236_)
						if (class38_sub20_sub3_sub3_241_.aShortArray3305 != null)
							aShortArray3305[triangleCount] = class38_sub20_sub3_sub3_241_.aShortArray3305[i_242_];
						else
							aShortArray3305[triangleCount] = (short) -1;
					if (bool_237_)
						if (class38_sub20_sub3_sub3_241_.triangleTSkins != null
								&& class38_sub20_sub3_sub3_241_.triangleTSkins[i_242_] != -1)
							triangleTSkins[triangleCount] = (byte) (class38_sub20_sub3_sub3_241_.triangleTSkins[i_242_] + texTriangleCount);
						else
							triangleTSkins[triangleCount] = (byte) -1;
					triangleColors[triangleCount] = class38_sub20_sub3_sub3_241_.triangleColors[i_242_];
					trianglesA[triangleCount] = method1140(
							class38_sub20_sub3_sub3_241_,
							class38_sub20_sub3_sub3_241_.trianglesA[i_242_]);
					trianglesB[triangleCount] = method1140(
							class38_sub20_sub3_sub3_241_,
							class38_sub20_sub3_sub3_241_.trianglesB[i_242_]);
					trianglesC[triangleCount] = method1140(
							class38_sub20_sub3_sub3_241_,
							class38_sub20_sub3_sub3_241_.trianglesC[i_242_]);
					triangleCount++;
				}
				for (int i_243_ = 0; i_243_ < class38_sub20_sub3_sub3_241_.texTriangleCount; i_243_++) {
					byte i_244_ = aByteArray3331[texTriangleCount] = class38_sub20_sub3_sub3_241_.aByteArray3331[i_243_];
					if (i_244_ == 0) {
						aShortArray3344[texTriangleCount] = (short) method1140(
								class38_sub20_sub3_sub3_241_,
								class38_sub20_sub3_sub3_241_.aShortArray3344[i_243_]);
						aShortArray3318[texTriangleCount] = (short) method1140(
								class38_sub20_sub3_sub3_241_,
								class38_sub20_sub3_sub3_241_.aShortArray3318[i_243_]);
						aShortArray3320[texTriangleCount] = (short) method1140(
								class38_sub20_sub3_sub3_241_,
								class38_sub20_sub3_sub3_241_.aShortArray3320[i_243_]);
					}
					if (i_244_ >= 1 && i_244_ <= 3) {
						aShortArray3344[texTriangleCount] = class38_sub20_sub3_sub3_241_.aShortArray3344[i_243_];
						aShortArray3318[texTriangleCount] = class38_sub20_sub3_sub3_241_.aShortArray3318[i_243_];
						aShortArray3320[texTriangleCount] = class38_sub20_sub3_sub3_241_.aShortArray3320[i_243_];
						aShortArray3341[texTriangleCount] = class38_sub20_sub3_sub3_241_.aShortArray3341[i_243_];
						aShortArray3321[texTriangleCount] = class38_sub20_sub3_sub3_241_.aShortArray3321[i_243_];
						aShortArray3325[texTriangleCount] = class38_sub20_sub3_sub3_241_.aShortArray3325[i_243_];
						aShortArray3322[texTriangleCount] = class38_sub20_sub3_sub3_241_.aShortArray3322[i_243_];
						aByteArray3336[texTriangleCount] = class38_sub20_sub3_sub3_241_.aByteArray3336[i_243_];
						aShortArray3334[texTriangleCount] = class38_sub20_sub3_sub3_241_.aShortArray3334[i_243_];
					}
					if (i_244_ == 2)
						aShortArray3319[texTriangleCount] = class38_sub20_sub3_sub3_241_.aShortArray3319[i_243_];
					texTriangleCount++;
				}
			}
		}
	}

	Model(Model class38_sub20_sub3_sub3_245_, boolean bool, boolean bool_246_,
			boolean bool_247_, boolean bool_248_) {
		aByte3329 = (byte) 0;
		vertexCount = class38_sub20_sub3_sub3_245_.vertexCount;
		triangleCount = class38_sub20_sub3_sub3_245_.triangleCount;
		texTriangleCount = class38_sub20_sub3_sub3_245_.texTriangleCount;
		if (bool) {
			xVertices = class38_sub20_sub3_sub3_245_.xVertices;
			yVertices = class38_sub20_sub3_sub3_245_.yVertices;
			zVertices = class38_sub20_sub3_sub3_245_.zVertices;
		} else {
			xVertices = new int[vertexCount];
			yVertices = new int[vertexCount];
			zVertices = new int[vertexCount];
			for (int i = 0; i < vertexCount; i++) {
				xVertices[i] = class38_sub20_sub3_sub3_245_.xVertices[i];
				yVertices[i] = class38_sub20_sub3_sub3_245_.yVertices[i];
				zVertices[i] = class38_sub20_sub3_sub3_245_.zVertices[i];
			}
		}
		if (bool_246_)
			triangleColors = class38_sub20_sub3_sub3_245_.triangleColors;
		else {
			triangleColors = new short[triangleCount];
			for (int i = 0; i < triangleCount; i++)
				triangleColors[i] = class38_sub20_sub3_sub3_245_.triangleColors[i];
		}
		if (bool_247_ || class38_sub20_sub3_sub3_245_.aShortArray3305 == null)
			aShortArray3305 = class38_sub20_sub3_sub3_245_.aShortArray3305;
		else {
			aShortArray3305 = new short[triangleCount];
			for (int i = 0; i < triangleCount; i++)
				aShortArray3305[i] = class38_sub20_sub3_sub3_245_.aShortArray3305[i];
		}
		if (bool_248_)
			triangleTransparencies = class38_sub20_sub3_sub3_245_.triangleTransparencies;
		else {
			triangleTransparencies = new byte[triangleCount];
			if (class38_sub20_sub3_sub3_245_.triangleTransparencies == null)
				for (int i = 0; i < triangleCount; i++)
					triangleTransparencies[i] = (byte) 0;
			else
				for (int i = 0; i < triangleCount; i++)
					triangleTransparencies[i] = class38_sub20_sub3_sub3_245_.triangleTransparencies[i];
		}
		trianglesA = class38_sub20_sub3_sub3_245_.trianglesA;
		trianglesB = class38_sub20_sub3_sub3_245_.trianglesB;
		trianglesC = class38_sub20_sub3_sub3_245_.trianglesC;
		triangleFaceTypes = class38_sub20_sub3_sub3_245_.triangleFaceTypes;
		trianglePriorities = class38_sub20_sub3_sub3_245_.trianglePriorities;
		triangleTSkins = class38_sub20_sub3_sub3_245_.triangleTSkins;
		aByte3329 = class38_sub20_sub3_sub3_245_.aByte3329;
		aByteArray3331 = class38_sub20_sub3_sub3_245_.aByteArray3331;
		aShortArray3344 = class38_sub20_sub3_sub3_245_.aShortArray3344;
		aShortArray3318 = class38_sub20_sub3_sub3_245_.aShortArray3318;
		aShortArray3320 = class38_sub20_sub3_sub3_245_.aShortArray3320;
		aShortArray3341 = class38_sub20_sub3_sub3_245_.aShortArray3341;
		aShortArray3321 = class38_sub20_sub3_sub3_245_.aShortArray3321;
		aShortArray3325 = class38_sub20_sub3_sub3_245_.aShortArray3325;
		aShortArray3322 = class38_sub20_sub3_sub3_245_.aShortArray3322;
		aByteArray3336 = class38_sub20_sub3_sub3_245_.aByteArray3336;
		aShortArray3334 = class38_sub20_sub3_sub3_245_.aShortArray3334;
		aShortArray3319 = class38_sub20_sub3_sub3_245_.aShortArray3319;
		vertexVSkins = class38_sub20_sub3_sub3_245_.vertexVSkins;
		anIntArray3343 = class38_sub20_sub3_sub3_245_.anIntArray3343;
		anIntArrayArray3337 = class38_sub20_sub3_sub3_245_.anIntArrayArray3337;
		anIntArrayArray3338 = class38_sub20_sub3_sub3_245_.anIntArrayArray3338;
		aClass54Array3314 = class38_sub20_sub3_sub3_245_.aClass54Array3314;
		aClass41Array3345 = class38_sub20_sub3_sub3_245_.aClass41Array3345;
		aClass54Array3327 = class38_sub20_sub3_sub3_245_.aClass54Array3327;
		this.aShort3313 = class38_sub20_sub3_sub3_245_.aShort3313;
		this.aShort3324 = class38_sub20_sub3_sub3_245_.aShort3324;
	}

	static final Model get(Class17 class17, int i, int i_116_) {
		byte[] is = class17.method109(i, i_116_, -68);
		if (is == null)
			return null;
		return new Model(is);
	}

	private static int method1141(int i, int i_178_) {
		i_178_ = i_178_ * (i & 0x7f) >> 7;
		if (i_178_ < 2)
			i_178_ = 2;
		else if (i_178_ > 126)
			i_178_ = 126;
		return (i & 0xff80) + i_178_;
	}

	static final void method1143(Model class38_sub20_sub3_sub3,
			Model class38_sub20_sub3_sub3_199_, int i, int i_200_, int i_201_,
			boolean bool) {
		class38_sub20_sub3_sub3.method1138();
		class38_sub20_sub3_sub3.method1134();
		class38_sub20_sub3_sub3_199_.method1138();
		class38_sub20_sub3_sub3_199_.method1134();
		Model.anInt3312++;
		int i_202_ = 0;
		int[] is = class38_sub20_sub3_sub3_199_.xVertices;
		int i_203_ = class38_sub20_sub3_sub3_199_.vertexCount;
		for (int i_204_ = 0; i_204_ < class38_sub20_sub3_sub3.vertexCount; i_204_++) {
			Class54 class54 = class38_sub20_sub3_sub3.aClass54Array3314[i_204_];
			if (class54.anInt1197 != 0) {
				int i_205_ = class38_sub20_sub3_sub3.yVertices[i_204_] - i_200_;
				if (i_205_ <= class38_sub20_sub3_sub3_199_.anInt3342) {
					int i_206_ = class38_sub20_sub3_sub3.xVertices[i_204_] - i;
					if (i_206_ >= class38_sub20_sub3_sub3_199_.anInt3346
							&& i_206_ <= class38_sub20_sub3_sub3_199_.anInt3335) {
						int i_207_ = class38_sub20_sub3_sub3.zVertices[i_204_]
								- i_201_;
						if (i_207_ >= class38_sub20_sub3_sub3_199_.anInt3323
								&& i_207_ <= class38_sub20_sub3_sub3_199_.anInt3330)
							for (int i_208_ = 0; i_208_ < i_203_; i_208_++) {
								Class54 class54_209_ = class38_sub20_sub3_sub3_199_.aClass54Array3314[i_208_];
								if (i_206_ == is[i_208_]
										&& i_207_ == class38_sub20_sub3_sub3_199_.zVertices[i_208_]
										&& i_205_ == class38_sub20_sub3_sub3_199_.yVertices[i_208_]
										&& class54_209_.anInt1197 != 0) {
									if (class38_sub20_sub3_sub3.aClass54Array3327 == null)
										class38_sub20_sub3_sub3.aClass54Array3327 = new Class54[class38_sub20_sub3_sub3.vertexCount];
									if (class38_sub20_sub3_sub3_199_.aClass54Array3327 == null)
										class38_sub20_sub3_sub3_199_.aClass54Array3327 = new Class54[i_203_];
									Class54 class54_210_ = class38_sub20_sub3_sub3.aClass54Array3327[i_204_];
									if (class54_210_ == null)
										class54_210_ = class38_sub20_sub3_sub3.aClass54Array3327[i_204_] = new Class54(
												class54);
									Class54 class54_211_ = class38_sub20_sub3_sub3_199_.aClass54Array3327[i_208_];
									if (class54_211_ == null)
										class54_211_ = class38_sub20_sub3_sub3_199_.aClass54Array3327[i_208_] = new Class54(
												class54_209_);
									class54_210_.anInt1205 += class54_209_.anInt1205;
									class54_210_.anInt1203 += class54_209_.anInt1203;
									class54_210_.anInt1193 += class54_209_.anInt1193;
									class54_210_.anInt1197 += class54_209_.anInt1197;
									class54_211_.anInt1205 += class54.anInt1205;
									class54_211_.anInt1203 += class54.anInt1203;
									class54_211_.anInt1193 += class54.anInt1193;
									class54_211_.anInt1197 += class54.anInt1197;
									i_202_++;
									Model.anIntArray3340[i_204_] = Model.anInt3312;
									Model.anIntArray3333[i_208_] = Model.anInt3312;
								}
							}
					}
				}
			}
		}
		if (i_202_ >= 3 && bool) {
			for (int i_212_ = 0; i_212_ < class38_sub20_sub3_sub3.triangleCount; i_212_++)
				if (Model.anIntArray3340[class38_sub20_sub3_sub3.trianglesA[i_212_]] == Model.anInt3312
						&& Model.anIntArray3340[class38_sub20_sub3_sub3.trianglesB[i_212_]] == Model.anInt3312
						&& Model.anIntArray3340[class38_sub20_sub3_sub3.trianglesC[i_212_]] == Model.anInt3312) {
					if (class38_sub20_sub3_sub3.triangleFaceTypes == null)
						class38_sub20_sub3_sub3.triangleFaceTypes = new byte[class38_sub20_sub3_sub3.triangleCount];
					class38_sub20_sub3_sub3.triangleFaceTypes[i_212_] = (byte) 2;
				}
			for (int i_213_ = 0; i_213_ < class38_sub20_sub3_sub3_199_.triangleCount; i_213_++)
				if (Model.anIntArray3333[class38_sub20_sub3_sub3_199_.trianglesA[i_213_]] == Model.anInt3312
						&& Model.anIntArray3333[class38_sub20_sub3_sub3_199_.trianglesB[i_213_]] == Model.anInt3312
						&& Model.anIntArray3333[class38_sub20_sub3_sub3_199_.trianglesC[i_213_]] == Model.anInt3312) {
					if (class38_sub20_sub3_sub3_199_.triangleFaceTypes == null)
						class38_sub20_sub3_sub3_199_.triangleFaceTypes = new byte[class38_sub20_sub3_sub3_199_.triangleCount];
					class38_sub20_sub3_sub3_199_.triangleFaceTypes[i_213_] = (byte) 2;
				}
		}
	}

	private static int method1144(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	public static void method1145() {
		Model.anIntArray3340 = null;
		Model.anIntArray3333 = null;
		Model.anIntArray3315 = null;
		Model.anIntArray3309 = null;
	}

	final Model method1127() {
		Model class38_sub20_sub3_sub3_0_ = new Model();
		if (triangleFaceTypes != null) {
			class38_sub20_sub3_sub3_0_.triangleFaceTypes = new byte[triangleCount];
			for (int i = 0; i < triangleCount; i++)
				class38_sub20_sub3_sub3_0_.triangleFaceTypes[i] = triangleFaceTypes[i];
		}
		class38_sub20_sub3_sub3_0_.vertexCount = vertexCount;
		class38_sub20_sub3_sub3_0_.triangleCount = triangleCount;
		class38_sub20_sub3_sub3_0_.texTriangleCount = texTriangleCount;
		class38_sub20_sub3_sub3_0_.xVertices = xVertices;
		class38_sub20_sub3_sub3_0_.yVertices = yVertices;
		class38_sub20_sub3_sub3_0_.zVertices = zVertices;
		class38_sub20_sub3_sub3_0_.trianglesA = trianglesA;
		class38_sub20_sub3_sub3_0_.trianglesB = trianglesB;
		class38_sub20_sub3_sub3_0_.trianglesC = trianglesC;
		class38_sub20_sub3_sub3_0_.trianglePriorities = trianglePriorities;
		class38_sub20_sub3_sub3_0_.triangleTransparencies = triangleTransparencies;
		class38_sub20_sub3_sub3_0_.triangleTSkins = triangleTSkins;
		class38_sub20_sub3_sub3_0_.triangleColors = triangleColors;
		class38_sub20_sub3_sub3_0_.aShortArray3305 = aShortArray3305;
		class38_sub20_sub3_sub3_0_.aByte3329 = aByte3329;
		class38_sub20_sub3_sub3_0_.aByteArray3331 = aByteArray3331;
		class38_sub20_sub3_sub3_0_.aShortArray3344 = aShortArray3344;
		class38_sub20_sub3_sub3_0_.aShortArray3318 = aShortArray3318;
		class38_sub20_sub3_sub3_0_.aShortArray3320 = aShortArray3320;
		class38_sub20_sub3_sub3_0_.aShortArray3341 = aShortArray3341;
		class38_sub20_sub3_sub3_0_.aShortArray3321 = aShortArray3321;
		class38_sub20_sub3_sub3_0_.aShortArray3325 = aShortArray3325;
		class38_sub20_sub3_sub3_0_.aShortArray3322 = aShortArray3322;
		class38_sub20_sub3_sub3_0_.aByteArray3336 = aByteArray3336;
		class38_sub20_sub3_sub3_0_.aShortArray3334 = aShortArray3334;
		class38_sub20_sub3_sub3_0_.aShortArray3319 = aShortArray3319;
		class38_sub20_sub3_sub3_0_.vertexVSkins = vertexVSkins;
		class38_sub20_sub3_sub3_0_.anIntArray3343 = anIntArray3343;
		class38_sub20_sub3_sub3_0_.anIntArrayArray3337 = anIntArrayArray3337;
		class38_sub20_sub3_sub3_0_.anIntArrayArray3338 = anIntArrayArray3338;
		class38_sub20_sub3_sub3_0_.aClass54Array3314 = aClass54Array3314;
		class38_sub20_sub3_sub3_0_.aClass41Array3345 = aClass41Array3345;
		class38_sub20_sub3_sub3_0_.aShort3313 = this.aShort3313;
		class38_sub20_sub3_sub3_0_.aShort3324 = this.aShort3324;
		return class38_sub20_sub3_sub3_0_;
	}

	final void method1128(short i, short i_1_) {
		for (int i_2_ = 0; i_2_ < triangleCount; i_2_++)
			if (triangleColors[i_2_] == i)
				triangleColors[i_2_] = i_1_;
	}

	final void move(int x, int y, int z) {
		for (int i_5_ = 0; i_5_ < vertexCount; i_5_++) {
			xVertices[i_5_] += x;
			yVertices[i_5_] += y;
			zVertices[i_5_] += z;
		}
		method1149();
	}

	private void method1130(byte[] is) {
		RS2Buffer class38_sub23 = new RS2Buffer(is);
		RS2Buffer class38_sub23_6_ = new RS2Buffer(is);
		RS2Buffer class38_sub23_7_ = new RS2Buffer(is);
		RS2Buffer class38_sub23_8_ = new RS2Buffer(is);
		RS2Buffer class38_sub23_9_ = new RS2Buffer(is);
		RS2Buffer class38_sub23_10_ = new RS2Buffer(is);
		RS2Buffer class38_sub23_11_ = new RS2Buffer(is);
		class38_sub23.pos = is.length - 23;
		int i = class38_sub23.readUnsignedShortLE();
		int i_12_ = class38_sub23.readUnsignedShortLE();
		int i_13_ = class38_sub23.getUByte();
		int i_14_ = class38_sub23.getUByte();
		int i_15_ = class38_sub23.getUByte();
		int i_16_ = class38_sub23.getUByte();
		int i_17_ = class38_sub23.getUByte();
		int i_18_ = class38_sub23.getUByte();
		int i_19_ = class38_sub23.getUByte();
		int i_20_ = class38_sub23.readUnsignedShortLE();
		int i_21_ = class38_sub23.readUnsignedShortLE();
		int i_22_ = class38_sub23.readUnsignedShortLE();
		int i_23_ = class38_sub23.readUnsignedShortLE();
		int i_24_ = class38_sub23.readUnsignedShortLE();
		int i_25_ = 0;
		int i_26_ = 0;
		int i_27_ = 0;
		if (i_13_ > 0) {
			aByteArray3331 = new byte[i_13_];
			class38_sub23.pos = 0;
			for (int i_28_ = 0; i_28_ < i_13_; i_28_++) {
				byte i_29_ = aByteArray3331[i_28_] = class38_sub23
						.method765((byte) 88);
				if (i_29_ == 0)
					i_25_++;
				if (i_29_ >= 1 && i_29_ <= 3)
					i_26_++;
				if (i_29_ == 2)
					i_27_++;
			}
		}
		int i_30_ = i_13_;
		int i_31_ = i_30_;
		i_30_ += i;
		int i_32_ = i_30_;
		if (i_14_ == 1)
			i_30_ += i_12_;
		int i_33_ = i_30_;
		i_30_ += i_12_;
		int i_34_ = i_30_;
		if (i_15_ == 255)
			i_30_ += i_12_;
		int i_35_ = i_30_;
		if (i_17_ == 1)
			i_30_ += i_12_;
		int i_36_ = i_30_;
		if (i_19_ == 1)
			i_30_ += i;
		int i_37_ = i_30_;
		if (i_16_ == 1)
			i_30_ += i_12_;
		int i_38_ = i_30_;
		i_30_ += i_23_;
		int i_39_ = i_30_;
		if (i_18_ == 1)
			i_30_ += i_12_ * 2;
		int i_40_ = i_30_;
		i_30_ += i_24_;
		int i_41_ = i_30_;
		i_30_ += i_12_ * 2;
		int i_42_ = i_30_;
		i_30_ += i_20_;
		int i_43_ = i_30_;
		i_30_ += i_21_;
		int i_44_ = i_30_;
		i_30_ += i_22_;
		int i_45_ = i_30_;
		i_30_ += i_25_ * 6;
		int i_46_ = i_30_;
		i_30_ += i_26_ * 6;
		int i_47_ = i_30_;
		i_30_ += i_26_ * 6;
		int i_48_ = i_30_;
		i_30_ += i_26_ * 2;
		int i_49_ = i_30_;
		i_30_ += i_26_;
		int i_50_ = i_30_;
		i_30_ += i_26_ * 2 + i_27_ * 2;
		int i_51_ = i_30_;
		vertexCount = i;
		triangleCount = i_12_;
		texTriangleCount = i_13_;
		xVertices = new int[i];
		yVertices = new int[i];
		zVertices = new int[i];
		trianglesA = new int[i_12_];
		trianglesB = new int[i_12_];
		trianglesC = new int[i_12_];
		if (i_19_ == 1)
			vertexVSkins = new int[i];
		if (i_14_ == 1)
			triangleFaceTypes = new byte[i_12_];
		if (i_15_ == 255)
			trianglePriorities = new byte[i_12_];
		else
			aByte3329 = (byte) i_15_;
		if (i_16_ == 1)
			triangleTransparencies = new byte[i_12_];
		if (i_17_ == 1)
			anIntArray3343 = new int[i_12_];
		if (i_18_ == 1)
			aShortArray3305 = new short[i_12_];
		if (i_18_ == 1 && i_13_ > 0)
			triangleTSkins = new byte[i_12_];
		triangleColors = new short[i_12_];
		if (i_13_ > 0) {
			aShortArray3344 = new short[i_13_];
			aShortArray3318 = new short[i_13_];
			aShortArray3320 = new short[i_13_];
			if (i_26_ > 0) {
				aShortArray3341 = new short[i_26_];
				aShortArray3321 = new short[i_26_];
				aShortArray3325 = new short[i_26_];
				aShortArray3322 = new short[i_26_];
				aByteArray3336 = new byte[i_26_];
				aShortArray3334 = new short[i_26_];
			}
			if (i_27_ > 0)
				aShortArray3319 = new short[i_27_];
		}
		class38_sub23.pos = i_31_;
		class38_sub23_6_.pos = i_42_;
		class38_sub23_7_.pos = i_43_;
		class38_sub23_8_.pos = i_44_;
		class38_sub23_9_.pos = i_36_;
		int i_52_ = 0;
		int i_53_ = 0;
		int i_54_ = 0;
		for (int i_55_ = 0; i_55_ < i; i_55_++) {
			int i_56_ = class38_sub23.getUByte();
			int i_57_ = 0;
			if ((i_56_ & 0x1) != 0)
				i_57_ = class38_sub23_6_.method737();
			int i_58_ = 0;
			if ((i_56_ & 0x2) != 0)
				i_58_ = class38_sub23_7_.method737();
			int i_59_ = 0;
			if ((i_56_ & 0x4) != 0)
				i_59_ = class38_sub23_8_.method737();
			xVertices[i_55_] = i_52_ + i_57_;
			yVertices[i_55_] = i_53_ + i_58_;
			zVertices[i_55_] = i_54_ + i_59_;
			i_52_ = xVertices[i_55_];
			i_53_ = yVertices[i_55_];
			i_54_ = zVertices[i_55_];
			if (i_19_ == 1)
				vertexVSkins[i_55_] = class38_sub23_9_.getUByte();
		}
		class38_sub23.pos = i_41_;
		class38_sub23_6_.pos = i_32_;
		class38_sub23_7_.pos = i_34_;
		class38_sub23_8_.pos = i_37_;
		class38_sub23_9_.pos = i_35_;
		class38_sub23_10_.pos = i_39_;
		class38_sub23_11_.pos = i_40_;
		for (int i_60_ = 0; i_60_ < i_12_; i_60_++) {
			triangleColors[i_60_] = (short) class38_sub23.readUnsignedShortLE();
			if (i_14_ == 1)
				triangleFaceTypes[i_60_] = class38_sub23_6_
						.method765((byte) 106);
			if (i_15_ == 255)
				trianglePriorities[i_60_] = class38_sub23_7_
						.method765((byte) 90);
			if (i_16_ == 1)
				triangleTransparencies[i_60_] = class38_sub23_8_
						.method765((byte) 124);
			if (i_17_ == 1)
				anIntArray3343[i_60_] = class38_sub23_9_.getUByte();
			if (i_18_ == 1)
				aShortArray3305[i_60_] = (short) (class38_sub23_10_.readUnsignedShortLE() - 1);
			if (triangleTSkins != null && aShortArray3305[i_60_] != -1)
				triangleTSkins[i_60_] = (byte) (class38_sub23_11_.getUByte() - 1);
		}
		class38_sub23.pos = i_38_;
		class38_sub23_6_.pos = i_33_;
		int i_61_ = 0;
		int i_62_ = 0;
		int i_63_ = 0;
		int i_64_ = 0;
		for (int i_65_ = 0; i_65_ < i_12_; i_65_++) {
			int i_66_ = class38_sub23_6_.getUByte();
			if (i_66_ == 1) {
				i_61_ = class38_sub23.method737() + i_64_;
				i_64_ = i_61_;
				i_62_ = class38_sub23.method737() + i_64_;
				i_64_ = i_62_;
				i_63_ = class38_sub23.method737() + i_64_;
				i_64_ = i_63_;
				trianglesA[i_65_] = i_61_;
				trianglesB[i_65_] = i_62_;
				trianglesC[i_65_] = i_63_;
			}
			if (i_66_ == 2) {
				i_62_ = i_63_;
				i_63_ = class38_sub23.method737() + i_64_;
				i_64_ = i_63_;
				trianglesA[i_65_] = i_61_;
				trianglesB[i_65_] = i_62_;
				trianglesC[i_65_] = i_63_;
			}
			if (i_66_ == 3) {
				i_61_ = i_63_;
				i_63_ = class38_sub23.method737() + i_64_;
				i_64_ = i_63_;
				trianglesA[i_65_] = i_61_;
				trianglesB[i_65_] = i_62_;
				trianglesC[i_65_] = i_63_;
			}
			if (i_66_ == 4) {
				int i_67_ = i_61_;
				i_61_ = i_62_;
				i_62_ = i_67_;
				i_63_ = class38_sub23.method737() + i_64_;
				i_64_ = i_63_;
				trianglesA[i_65_] = i_61_;
				trianglesB[i_65_] = i_62_;
				trianglesC[i_65_] = i_63_;
			}
		}
		class38_sub23.pos = i_45_;
		class38_sub23_6_.pos = i_46_;
		class38_sub23_7_.pos = i_47_;
		class38_sub23_8_.pos = i_48_;
		class38_sub23_9_.pos = i_49_;
		class38_sub23_10_.pos = i_50_;
		for (int i_68_ = 0; i_68_ < i_13_; i_68_++) {
			int i_69_ = aByteArray3331[i_68_] & 0xff;
			if (i_69_ == 0) {
				aShortArray3344[i_68_] = (short) class38_sub23.readUnsignedShortLE();
				aShortArray3318[i_68_] = (short) class38_sub23.readUnsignedShortLE();
				aShortArray3320[i_68_] = (short) class38_sub23.readUnsignedShortLE();
			}
			if (i_69_ == 1) {
				aShortArray3344[i_68_] = (short) class38_sub23_6_.readUnsignedShortLE();
				aShortArray3318[i_68_] = (short) class38_sub23_6_.readUnsignedShortLE();
				aShortArray3320[i_68_] = (short) class38_sub23_6_.readUnsignedShortLE();
				aShortArray3341[i_68_] = (short) class38_sub23_7_.readUnsignedShortLE();
				aShortArray3321[i_68_] = (short) class38_sub23_7_.readUnsignedShortLE();
				aShortArray3325[i_68_] = (short) class38_sub23_7_.readUnsignedShortLE();
				aShortArray3322[i_68_] = (short) class38_sub23_8_.readUnsignedShortLE();
				aByteArray3336[i_68_] = class38_sub23_9_.method765((byte) 99);
				aShortArray3334[i_68_] = (short) class38_sub23_10_.readUnsignedShortLE();
			}
			if (i_69_ == 2) {
				aShortArray3344[i_68_] = (short) class38_sub23_6_.readUnsignedShortLE();
				aShortArray3318[i_68_] = (short) class38_sub23_6_.readUnsignedShortLE();
				aShortArray3320[i_68_] = (short) class38_sub23_6_.readUnsignedShortLE();
				aShortArray3341[i_68_] = (short) class38_sub23_7_.readUnsignedShortLE();
				aShortArray3321[i_68_] = (short) class38_sub23_7_.readUnsignedShortLE();
				aShortArray3325[i_68_] = (short) class38_sub23_7_.readUnsignedShortLE();
				aShortArray3322[i_68_] = (short) class38_sub23_8_.readUnsignedShortLE();
				aByteArray3336[i_68_] = class38_sub23_9_.method765((byte) 85);
				aShortArray3334[i_68_] = (short) class38_sub23_10_.readUnsignedShortLE();
				aShortArray3319[i_68_] = (short) class38_sub23_10_.readUnsignedShortLE();
			}
			if (i_69_ == 3) {
				aShortArray3344[i_68_] = (short) class38_sub23_6_.readUnsignedShortLE();
				aShortArray3318[i_68_] = (short) class38_sub23_6_.readUnsignedShortLE();
				aShortArray3320[i_68_] = (short) class38_sub23_6_.readUnsignedShortLE();
				aShortArray3341[i_68_] = (short) class38_sub23_7_.readUnsignedShortLE();
				aShortArray3321[i_68_] = (short) class38_sub23_7_.readUnsignedShortLE();
				aShortArray3325[i_68_] = (short) class38_sub23_7_.readUnsignedShortLE();
				aShortArray3322[i_68_] = (short) class38_sub23_8_.readUnsignedShortLE();
				aByteArray3336[i_68_] = class38_sub23_9_.method765((byte) 91);
				aShortArray3334[i_68_] = (short) class38_sub23_10_.readUnsignedShortLE();
			}
		}
		class38_sub23.pos = i_51_;
		int i_70_ = class38_sub23.getUByte();
		if (i_70_ != 0) {
			new Class6();
			class38_sub23.readUnsignedShortLE();
			class38_sub23.readUnsignedShortLE();
			class38_sub23.readUnsignedShortLE();
			class38_sub23.readInt(true);
		}
	}

	final Model method1131(int[][] is, int i, int i_71_, int i_72_,
						   int i_73_) {
		method1138();
		int i_74_ = i + anInt3346;
		int i_75_ = i + anInt3335;
		int i_76_ = i_72_ + anInt3323;
		int i_77_ = i_72_ + anInt3330;
		if (i_74_ < 0 || i_75_ + 128 >> 7 >= is.length || i_76_ < 0
				|| i_77_ + 128 >> 7 >= is[0].length)
			return this;
		i_74_ >>= 7;
		i_75_ = i_75_ + 127 >> 7;
		i_76_ >>= 7;
		i_77_ = i_77_ + 127 >> 7;
		if (is[i_74_][i_76_] == i_71_ && is[i_75_][i_76_] == i_71_
				&& is[i_74_][i_77_] == i_71_ && is[i_75_][i_77_] == i_71_)
			return this;
		Model class38_sub20_sub3_sub3_78_;
		if (true) {
			class38_sub20_sub3_sub3_78_ = new Model();
			class38_sub20_sub3_sub3_78_.vertexCount = vertexCount;
			class38_sub20_sub3_sub3_78_.triangleCount = triangleCount;
			class38_sub20_sub3_sub3_78_.texTriangleCount = texTriangleCount;
			class38_sub20_sub3_sub3_78_.xVertices = xVertices;
			class38_sub20_sub3_sub3_78_.zVertices = zVertices;
			class38_sub20_sub3_sub3_78_.trianglesA = trianglesA;
			class38_sub20_sub3_sub3_78_.trianglesB = trianglesB;
			class38_sub20_sub3_sub3_78_.trianglesC = trianglesC;
			class38_sub20_sub3_sub3_78_.triangleFaceTypes = triangleFaceTypes;
			class38_sub20_sub3_sub3_78_.trianglePriorities = trianglePriorities;
			class38_sub20_sub3_sub3_78_.triangleTransparencies = triangleTransparencies;
			class38_sub20_sub3_sub3_78_.triangleTSkins = triangleTSkins;
			class38_sub20_sub3_sub3_78_.triangleColors = triangleColors;
			class38_sub20_sub3_sub3_78_.aShortArray3305 = aShortArray3305;
			class38_sub20_sub3_sub3_78_.aByte3329 = aByte3329;
			class38_sub20_sub3_sub3_78_.aByteArray3331 = aByteArray3331;
			class38_sub20_sub3_sub3_78_.aShortArray3344 = aShortArray3344;
			class38_sub20_sub3_sub3_78_.aShortArray3318 = aShortArray3318;
			class38_sub20_sub3_sub3_78_.aShortArray3320 = aShortArray3320;
			class38_sub20_sub3_sub3_78_.aShortArray3341 = aShortArray3341;
			class38_sub20_sub3_sub3_78_.aShortArray3321 = aShortArray3321;
			class38_sub20_sub3_sub3_78_.aShortArray3325 = aShortArray3325;
			class38_sub20_sub3_sub3_78_.aShortArray3322 = aShortArray3322;
			class38_sub20_sub3_sub3_78_.aByteArray3336 = aByteArray3336;
			class38_sub20_sub3_sub3_78_.aShortArray3334 = aShortArray3334;
			class38_sub20_sub3_sub3_78_.aShortArray3319 = aShortArray3319;
			class38_sub20_sub3_sub3_78_.vertexVSkins = vertexVSkins;
			class38_sub20_sub3_sub3_78_.anIntArray3343 = anIntArray3343;
			class38_sub20_sub3_sub3_78_.anIntArrayArray3337 = anIntArrayArray3337;
			class38_sub20_sub3_sub3_78_.anIntArrayArray3338 = anIntArrayArray3338;
			class38_sub20_sub3_sub3_78_.aShort3313 = this.aShort3313;
			class38_sub20_sub3_sub3_78_.aShort3324 = this.aShort3324;
			class38_sub20_sub3_sub3_78_.yVertices = new int[class38_sub20_sub3_sub3_78_.vertexCount];
		} else
			class38_sub20_sub3_sub3_78_ = this;
		if (i_73_ == 0)
			for (int i_79_ = 0; i_79_ < class38_sub20_sub3_sub3_78_.vertexCount; i_79_++) {
				int i_80_ = xVertices[i_79_] + i;
				int i_81_ = zVertices[i_79_] + i_72_;
				int i_82_ = i_80_ & 0x7f;
				int i_83_ = i_81_ & 0x7f;
				int i_84_ = i_80_ >> 7;
				int i_85_ = i_81_ >> 7;
				int i_86_ = is[i_84_][i_85_] * (128 - i_82_)
						+ is[i_84_ + 1][i_85_] * i_82_ >> 7;
				int i_87_ = is[i_84_][i_85_ + 1] * (128 - i_82_)
						+ is[i_84_ + 1][i_85_ + 1] * i_82_ >> 7;
				int i_88_ = i_86_ * (128 - i_83_) + i_87_ * i_83_ >> 7;
				class38_sub20_sub3_sub3_78_.yVertices[i_79_] = yVertices[i_79_]
						+ i_88_ - i_71_;
			}
		else
			for (int i_89_ = 0; i_89_ < class38_sub20_sub3_sub3_78_.vertexCount; i_89_++) {
				int i_90_ = (-yVertices[i_89_] << 16)
						/ this.height;
				if (i_90_ < i_73_) {
					int i_91_ = xVertices[i_89_] + i;
					int i_92_ = zVertices[i_89_] + i_72_;
					int i_93_ = i_91_ & 0x7f;
					int i_94_ = i_92_ & 0x7f;
					int i_95_ = i_91_ >> 7;
					int i_96_ = i_92_ >> 7;
					int i_97_ = is[i_95_][i_96_] * (128 - i_93_)
							+ is[i_95_ + 1][i_96_] * i_93_ >> 7;
					int i_98_ = is[i_95_][i_96_ + 1] * (128 - i_93_)
							+ is[i_95_ + 1][i_96_ + 1] * i_93_ >> 7;
					int i_99_ = i_97_ * (128 - i_94_) + i_98_ * i_94_ >> 7;
					class38_sub20_sub3_sub3_78_.yVertices[i_89_] = yVertices[i_89_]
							+ (i_99_ - i_71_) * (i_73_ - i_90_) / i_73_;
				}
			}
		class38_sub20_sub3_sub3_78_.method1149();
		return class38_sub20_sub3_sub3_78_;
	}

	final void method1132() {
		for (int i = 0; i < vertexCount; i++) {
			int i_100_ = xVertices[i];
			xVertices[i] = zVertices[i];
			zVertices[i] = -i_100_;
		}
		method1149();
	}

	final void method1133() {
		for (int i = 0; i < vertexCount; i++) {
			int i_101_ = zVertices[i];
			zVertices[i] = xVertices[i];
			xVertices[i] = -i_101_;
		}
		method1149();
	}

	final void method1134() {
		if (aClass54Array3314 == null) {
			aClass54Array3314 = new Class54[vertexCount];
			for (int i = 0; i < vertexCount; i++)
				aClass54Array3314[i] = new Class54();
			for (int i = 0; i < triangleCount; i++) {
				int i_102_ = trianglesA[i];
				int i_103_ = trianglesB[i];
				int i_104_ = trianglesC[i];
				int i_105_ = xVertices[i_103_] - xVertices[i_102_];
				int i_106_ = yVertices[i_103_] - yVertices[i_102_];
				int i_107_ = zVertices[i_103_] - zVertices[i_102_];
				int i_108_ = xVertices[i_104_] - xVertices[i_102_];
				int i_109_ = yVertices[i_104_] - yVertices[i_102_];
				int i_110_ = zVertices[i_104_] - zVertices[i_102_];
				int i_111_ = i_106_ * i_110_ - i_109_ * i_107_;
				int i_112_ = i_107_ * i_108_ - i_110_ * i_105_;
				int i_113_;
				for (i_113_ = i_105_ * i_109_ - i_108_ * i_106_; i_111_ > 8192
						|| i_112_ > 8192 || i_113_ > 8192 || i_111_ < -8192
						|| i_112_ < -8192 || i_113_ < -8192; i_113_ >>= 1) {
					i_111_ >>= 1;
					i_112_ >>= 1;
				}
				int i_114_ = (int) Math.sqrt(i_111_ * i_111_ + i_112_ * i_112_
						+ i_113_ * i_113_);
				if (i_114_ <= 0)
					i_114_ = 1;
				i_111_ = i_111_ * 256 / i_114_;
				i_112_ = i_112_ * 256 / i_114_;
				i_113_ = i_113_ * 256 / i_114_;
				byte i_115_;
				if (triangleFaceTypes == null)
					i_115_ = (byte) 0;
				else
					i_115_ = triangleFaceTypes[i];
				if (i_115_ == 0) {
					Class54 class54 = aClass54Array3314[i_102_];
					class54.anInt1205 += i_111_;
					class54.anInt1203 += i_112_;
					class54.anInt1193 += i_113_;
					class54.anInt1197++;
					class54 = aClass54Array3314[i_103_];
					class54.anInt1205 += i_111_;
					class54.anInt1203 += i_112_;
					class54.anInt1193 += i_113_;
					class54.anInt1197++;
					class54 = aClass54Array3314[i_104_];
					class54.anInt1205 += i_111_;
					class54.anInt1203 += i_112_;
					class54.anInt1193 += i_113_;
					class54.anInt1197++;
				} else if (i_115_ == 1) {
					if (aClass41Array3345 == null)
						aClass41Array3345 = new Class41[triangleCount];
					Class41 class41 = aClass41Array3345[i] = new Class41();
					class41.anInt922 = i_111_;
					class41.anInt938 = i_112_;
					class41.anInt925 = i_113_;
				}
			}
		}
	}

	private void method1136(byte[] is) {
		boolean bool = false;
		boolean bool_117_ = false;
		RS2Buffer class38_sub23 = new RS2Buffer(is);
		RS2Buffer class38_sub23_118_ = new RS2Buffer(is);
		RS2Buffer class38_sub23_119_ = new RS2Buffer(is);
		RS2Buffer class38_sub23_120_ = new RS2Buffer(is);
		RS2Buffer class38_sub23_121_ = new RS2Buffer(is);
		class38_sub23.pos = is.length - 18;
		int i = class38_sub23.readUnsignedShortLE();
		int i_122_ = class38_sub23.readUnsignedShortLE();
		int i_123_ = class38_sub23.getUByte();
		int i_124_ = class38_sub23.getUByte();
		int i_125_ = class38_sub23.getUByte();
		int i_126_ = class38_sub23.getUByte();
		int i_127_ = class38_sub23.getUByte();
		int i_128_ = class38_sub23.getUByte();
		int i_129_ = class38_sub23.readUnsignedShortLE();
		int i_130_ = class38_sub23.readUnsignedShortLE();
		int i_131_ = class38_sub23.readUnsignedShortLE();
		int i_132_ = class38_sub23.readUnsignedShortLE();
		int i_133_ = 0;
		int i_134_ = i_133_;
		i_133_ += i;
		int i_135_ = i_133_;
		i_133_ += i_122_;
		int i_136_ = i_133_;
		if (i_125_ == 255)
			i_133_ += i_122_;
		int i_137_ = i_133_;
		if (i_127_ == 1)
			i_133_ += i_122_;
		int i_138_ = i_133_;
		if (i_124_ == 1)
			i_133_ += i_122_;
		int i_139_ = i_133_;
		if (i_128_ == 1)
			i_133_ += i;
		int i_140_ = i_133_;
		if (i_126_ == 1)
			i_133_ += i_122_;
		int i_141_ = i_133_;
		i_133_ += i_132_;
		int i_142_ = i_133_;
		i_133_ += i_122_ * 2;
		int i_143_ = i_133_;
		i_133_ += i_123_ * 6;
		int i_144_ = i_133_;
		i_133_ += i_129_;
		int i_145_ = i_133_;
		i_133_ += i_130_;
		int i_146_ = i_133_;
		i_133_ += i_131_;
		vertexCount = i;
		triangleCount = i_122_;
		texTriangleCount = i_123_;
		xVertices = new int[i];
		yVertices = new int[i];
		zVertices = new int[i];
		trianglesA = new int[i_122_];
		trianglesB = new int[i_122_];
		trianglesC = new int[i_122_];
		if (i_123_ > 0) {
			aByteArray3331 = new byte[i_123_];
			aShortArray3344 = new short[i_123_];
			aShortArray3318 = new short[i_123_];
			aShortArray3320 = new short[i_123_];
		}
		if (i_128_ == 1)
			vertexVSkins = new int[i];
		if (i_124_ == 1) {
			triangleFaceTypes = new byte[i_122_];
			triangleTSkins = new byte[i_122_];
			aShortArray3305 = new short[i_122_];
		}
		if (i_125_ == 255)
			trianglePriorities = new byte[i_122_];
		else
			aByte3329 = (byte) i_125_;
		if (i_126_ == 1)
			triangleTransparencies = new byte[i_122_];
		if (i_127_ == 1)
			anIntArray3343 = new int[i_122_];
		triangleColors = new short[i_122_];
		class38_sub23.pos = i_134_;
		class38_sub23_118_.pos = i_144_;
		class38_sub23_119_.pos = i_145_;
		class38_sub23_120_.pos = i_146_;
		class38_sub23_121_.pos = i_139_;
		int i_147_ = 0;
		int i_148_ = 0;
		int i_149_ = 0;
		for (int i_150_ = 0; i_150_ < i; i_150_++) {
			int i_151_ = class38_sub23.getUByte();
			int i_152_ = 0;
			if ((i_151_ & 0x1) != 0)
				i_152_ = class38_sub23_118_.method737();
			int i_153_ = 0;
			if ((i_151_ & 0x2) != 0)
				i_153_ = class38_sub23_119_.method737();
			int i_154_ = 0;
			if ((i_151_ & 0x4) != 0)
				i_154_ = class38_sub23_120_.method737();
			xVertices[i_150_] = i_147_ + i_152_;
			yVertices[i_150_] = i_148_ + i_153_;
			zVertices[i_150_] = i_149_ + i_154_;
			i_147_ = xVertices[i_150_];
			i_148_ = yVertices[i_150_];
			i_149_ = zVertices[i_150_];
			if (i_128_ == 1)
				vertexVSkins[i_150_] = class38_sub23_121_.getUByte();
		}
		class38_sub23.pos = i_142_;
		class38_sub23_118_.pos = i_138_;
		class38_sub23_119_.pos = i_136_;
		class38_sub23_120_.pos = i_140_;
		class38_sub23_121_.pos = i_137_;
		for (int i_155_ = 0; i_155_ < i_122_; i_155_++) {
			triangleColors[i_155_] = (short) class38_sub23.readUnsignedShortLE();
			if (i_124_ == 1) {
				int i_156_ = class38_sub23_118_.getUByte();
				if ((i_156_ & 0x1) == 1) {
					triangleFaceTypes[i_155_] = (byte) 1;
					bool = true;
				} else
					triangleFaceTypes[i_155_] = (byte) 0;
				if ((i_156_ & 0x2) == 2) {
					triangleTSkins[i_155_] = (byte) (i_156_ >> 2);
					aShortArray3305[i_155_] = triangleColors[i_155_];
					triangleColors[i_155_] = (short) 127;
					if (aShortArray3305[i_155_] != -1)
						bool_117_ = true;
				} else {
					triangleTSkins[i_155_] = (byte) -1;
					aShortArray3305[i_155_] = (short) -1;
				}
			}
			if (i_125_ == 255)
				trianglePriorities[i_155_] = class38_sub23_119_
						.method765((byte) 82);
			if (i_126_ == 1)
				triangleTransparencies[i_155_] = class38_sub23_120_
						.method765((byte) 124);
			if (i_127_ == 1)
				anIntArray3343[i_155_] = class38_sub23_121_.getUByte();
		}
		class38_sub23.pos = i_141_;
		class38_sub23_118_.pos = i_135_;
		int i_157_ = 0;
		int i_158_ = 0;
		int i_159_ = 0;
		int i_160_ = 0;
		for (int i_161_ = 0; i_161_ < i_122_; i_161_++) {
			int i_162_ = class38_sub23_118_.getUByte();
			if (i_162_ == 1) {
				i_157_ = class38_sub23.method737() + i_160_;
				i_160_ = i_157_;
				i_158_ = class38_sub23.method737() + i_160_;
				i_160_ = i_158_;
				i_159_ = class38_sub23.method737() + i_160_;
				i_160_ = i_159_;
				trianglesA[i_161_] = i_157_;
				trianglesB[i_161_] = i_158_;
				trianglesC[i_161_] = i_159_;
			}
			if (i_162_ == 2) {
				i_158_ = i_159_;
				i_159_ = class38_sub23.method737() + i_160_;
				i_160_ = i_159_;
				trianglesA[i_161_] = i_157_;
				trianglesB[i_161_] = i_158_;
				trianglesC[i_161_] = i_159_;
			}
			if (i_162_ == 3) {
				i_157_ = i_159_;
				i_159_ = class38_sub23.method737() + i_160_;
				i_160_ = i_159_;
				trianglesA[i_161_] = i_157_;
				trianglesB[i_161_] = i_158_;
				trianglesC[i_161_] = i_159_;
			}
			if (i_162_ == 4) {
				int i_163_ = i_157_;
				i_157_ = i_158_;
				i_158_ = i_163_;
				i_159_ = class38_sub23.method737() + i_160_;
				i_160_ = i_159_;
				trianglesA[i_161_] = i_157_;
				trianglesB[i_161_] = i_158_;
				trianglesC[i_161_] = i_159_;
			}
		}
		class38_sub23.pos = i_143_;
		for (int i_164_ = 0; i_164_ < i_123_; i_164_++) {
			aByteArray3331[i_164_] = (byte) 0;
			aShortArray3344[i_164_] = (short) class38_sub23.readUnsignedShortLE();
			aShortArray3318[i_164_] = (short) class38_sub23.readUnsignedShortLE();
			aShortArray3320[i_164_] = (short) class38_sub23.readUnsignedShortLE();
		}
		if (triangleTSkins != null) {
			boolean bool_165_ = false;
			for (int i_166_ = 0; i_166_ < i_122_; i_166_++) {
				int i_167_ = triangleTSkins[i_166_] & 0xff;
				if (i_167_ != 255)
					if ((aShortArray3344[i_167_] & 0xffff) == trianglesA[i_166_]
							&& (aShortArray3318[i_167_] & 0xffff) == trianglesB[i_166_]
							&& (aShortArray3320[i_167_] & 0xffff) == trianglesC[i_166_])
						triangleTSkins[i_166_] = (byte) -1;
					else
						bool_165_ = true;
			}
			if (!bool_165_)
				triangleTSkins = null;
		}
		if (!bool_117_)
			aShortArray3305 = null;
		if (!bool)
			triangleFaceTypes = null;
	}

	final void method1137() {
		for (int i = 0; i < vertexCount; i++) {
			xVertices[i] = -xVertices[i];
			zVertices[i] = -zVertices[i];
		}
		method1149();
	}

	private void method1138() {
		if (!aBool3306) {
			this.height = 0;
			anInt3342 = 0;
			anInt3346 = 999999;
			anInt3335 = -999999;
			anInt3330 = -99999;
			anInt3323 = 99999;
			for (int i = 0; i < vertexCount; i++) {
				int i_168_ = xVertices[i];
				int i_169_ = yVertices[i];
				int i_170_ = zVertices[i];
				if (i_168_ < anInt3346)
					anInt3346 = i_168_;
				if (i_168_ > anInt3335)
					anInt3335 = i_168_;
				if (i_170_ < anInt3323)
					anInt3323 = i_170_;
				if (i_170_ > anInt3330)
					anInt3330 = i_170_;
				if (-i_169_ > this.height)
					this.height = -i_169_;
				if (i_169_ > anInt3342)
					anInt3342 = i_169_;
			}
			aBool3306 = true;
		}
	}

	final void method1139() {
		for (int i = 0; i < vertexCount; i++)
			zVertices[i] = -zVertices[i];
		for (int i = 0; i < triangleCount; i++) {
			int i_171_ = trianglesA[i];
			trianglesA[i] = trianglesC[i];
			trianglesC[i] = i_171_;
		}
		method1149();
	}

	private int method1140(Model class38_sub20_sub3_sub3_172_, int i) {
		int i_173_ = -1;
		int i_174_ = class38_sub20_sub3_sub3_172_.xVertices[i];
		int i_175_ = class38_sub20_sub3_sub3_172_.yVertices[i];
		int i_176_ = class38_sub20_sub3_sub3_172_.zVertices[i];
		for (int i_177_ = 0; i_177_ < vertexCount; i_177_++)
			if (i_174_ == xVertices[i_177_] && i_175_ == yVertices[i_177_]
					&& i_176_ == zVertices[i_177_]) {
				i_173_ = i_177_;
				break;
			}
		if (i_173_ == -1) {
			xVertices[vertexCount] = i_174_;
			yVertices[vertexCount] = i_175_;
			zVertices[vertexCount] = i_176_;
			if (class38_sub20_sub3_sub3_172_.vertexVSkins != null)
				vertexVSkins[vertexCount] = class38_sub20_sub3_sub3_172_.vertexVSkins[i];
			i_173_ = vertexCount++;
		}
		return i_173_;
	}

	final Class38_Sub20_Sub3_Sub1 method1142(int i, int i_179_, int i_180_,
			int i_181_, int i_182_) {
		method1134();
		int i_183_ = (int) Math.sqrt(i_180_ * i_180_ + i_181_ * i_181_ + i_182_
				* i_182_);
		int i_184_ = i_179_ * i_183_ >> 8;
		Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = new Class38_Sub20_Sub3_Sub1();
		class38_sub20_sub3_sub1.anIntArray3164 = new int[triangleCount];
		class38_sub20_sub3_sub1.anIntArray3146 = new int[triangleCount];
		class38_sub20_sub3_sub1.anIntArray3144 = new int[triangleCount];
		if (texTriangleCount > 0 && triangleTSkins != null) {
			int[] is = new int[texTriangleCount];
			for (int i_185_ = 0; i_185_ < triangleCount; i_185_++)
				if (triangleTSkins[i_185_] != -1)
					is[triangleTSkins[i_185_] & 0xff]++;
			class38_sub20_sub3_sub1.anInt3153 = 0;
			for (int i_186_ = 0; i_186_ < texTriangleCount; i_186_++)
				if (is[i_186_] > 0 && aByteArray3331[i_186_] == 0)
					class38_sub20_sub3_sub1.anInt3153++;
			class38_sub20_sub3_sub1.anIntArray3169 = new int[class38_sub20_sub3_sub1.anInt3153];
			class38_sub20_sub3_sub1.anIntArray3154 = new int[class38_sub20_sub3_sub1.anInt3153];
			class38_sub20_sub3_sub1.anIntArray3145 = new int[class38_sub20_sub3_sub1.anInt3153];
			int i_187_ = 0;
			for (int i_188_ = 0; i_188_ < texTriangleCount; i_188_++)
				if (is[i_188_] > 0 && aByteArray3331[i_188_] == 0) {
					class38_sub20_sub3_sub1.anIntArray3169[i_187_] = aShortArray3344[i_188_] & 0xffff;
					class38_sub20_sub3_sub1.anIntArray3154[i_187_] = aShortArray3318[i_188_] & 0xffff;
					class38_sub20_sub3_sub1.anIntArray3145[i_187_] = aShortArray3320[i_188_] & 0xffff;
					is[i_188_] = i_187_++;
				} else
					is[i_188_] = -1;
			class38_sub20_sub3_sub1.aByteArray3158 = new byte[triangleCount];
			for (int i_189_ = 0; i_189_ < triangleCount; i_189_++)
				if (triangleTSkins[i_189_] != -1)
					class38_sub20_sub3_sub1.aByteArray3158[i_189_] = (byte) is[triangleTSkins[i_189_] & 0xff];
				else
					class38_sub20_sub3_sub1.aByteArray3158[i_189_] = (byte) -1;
		}
		for (int i_190_ = 0; i_190_ < triangleCount; i_190_++) {
			byte i_191_;
			if (triangleFaceTypes == null)
				i_191_ = (byte) 0;
			else
				i_191_ = triangleFaceTypes[i_190_];
			byte i_192_;
			if (triangleTransparencies == null)
				i_192_ = (byte) 0;
			else
				i_192_ = triangleTransparencies[i_190_];
			short i_193_;
			if (aShortArray3305 == null)
				i_193_ = (short) -1;
			else
				i_193_ = aShortArray3305[i_190_];
			if (i_192_ == -2)
				i_191_ = (byte) 3;
			if (i_192_ == -1)
				i_191_ = (byte) 2;
			if (i_193_ == -1) {
				if (i_191_ == 0) {
					int i_194_ = triangleColors[i_190_] & 0xffff;
					Class54 class54;
					if (aClass54Array3327 != null
							&& aClass54Array3327[trianglesA[i_190_]] != null)
						class54 = aClass54Array3327[trianglesA[i_190_]];
					else
						class54 = aClass54Array3314[trianglesA[i_190_]];
					int i_195_ = i
							+ (i_180_ * class54.anInt1205 + i_181_
									* class54.anInt1203 + i_182_
									* class54.anInt1193)
							/ (i_184_ * class54.anInt1197);
					class38_sub20_sub3_sub1.anIntArray3164[i_190_] = Model
							.method1141(i_194_, i_195_);
					if (aClass54Array3327 != null
							&& aClass54Array3327[trianglesB[i_190_]] != null)
						class54 = aClass54Array3327[trianglesB[i_190_]];
					else
						class54 = aClass54Array3314[trianglesB[i_190_]];
					i_195_ = i
							+ (i_180_ * class54.anInt1205 + i_181_
									* class54.anInt1203 + i_182_
									* class54.anInt1193)
							/ (i_184_ * class54.anInt1197);
					class38_sub20_sub3_sub1.anIntArray3146[i_190_] = Model
							.method1141(i_194_, i_195_);
					if (aClass54Array3327 != null
							&& aClass54Array3327[trianglesC[i_190_]] != null)
						class54 = aClass54Array3327[trianglesC[i_190_]];
					else
						class54 = aClass54Array3314[trianglesC[i_190_]];
					i_195_ = i
							+ (i_180_ * class54.anInt1205 + i_181_
									* class54.anInt1203 + i_182_
									* class54.anInt1193)
							/ (i_184_ * class54.anInt1197);
					class38_sub20_sub3_sub1.anIntArray3144[i_190_] = Model
							.method1141(i_194_, i_195_);
				} else if (i_191_ == 1) {
					Class41 class41 = aClass41Array3345[i_190_];
					int i_196_ = i
							+ (i_180_ * class41.anInt922 + i_181_
									* class41.anInt938 + i_182_
									* class41.anInt925) / (i_184_ + i_184_ / 2);
					class38_sub20_sub3_sub1.anIntArray3164[i_190_] = Model
							.method1141(triangleColors[i_190_] & 0xffff, i_196_);
					class38_sub20_sub3_sub1.anIntArray3144[i_190_] = -1;
				} else if (i_191_ == 3) {
					class38_sub20_sub3_sub1.anIntArray3164[i_190_] = 128;
					class38_sub20_sub3_sub1.anIntArray3144[i_190_] = -1;
				} else
					class38_sub20_sub3_sub1.anIntArray3144[i_190_] = -2;
			} else if (i_191_ == 0) {
				Class54 class54;
				if (aClass54Array3327 != null
						&& aClass54Array3327[trianglesA[i_190_]] != null)
					class54 = aClass54Array3327[trianglesA[i_190_]];
				else
					class54 = aClass54Array3314[trianglesA[i_190_]];
				int i_197_ = i
						+ (i_180_ * class54.anInt1205 + i_181_
								* class54.anInt1203 + i_182_
								* class54.anInt1193)
						/ (i_184_ * class54.anInt1197);
				class38_sub20_sub3_sub1.anIntArray3164[i_190_] = Model
						.method1144(i_197_);
				if (aClass54Array3327 != null
						&& aClass54Array3327[trianglesB[i_190_]] != null)
					class54 = aClass54Array3327[trianglesB[i_190_]];
				else
					class54 = aClass54Array3314[trianglesB[i_190_]];
				i_197_ = i
						+ (i_180_ * class54.anInt1205 + i_181_
								* class54.anInt1203 + i_182_
								* class54.anInt1193)
						/ (i_184_ * class54.anInt1197);
				class38_sub20_sub3_sub1.anIntArray3146[i_190_] = Model
						.method1144(i_197_);
				if (aClass54Array3327 != null
						&& aClass54Array3327[trianglesC[i_190_]] != null)
					class54 = aClass54Array3327[trianglesC[i_190_]];
				else
					class54 = aClass54Array3314[trianglesC[i_190_]];
				i_197_ = i
						+ (i_180_ * class54.anInt1205 + i_181_
								* class54.anInt1203 + i_182_
								* class54.anInt1193)
						/ (i_184_ * class54.anInt1197);
				class38_sub20_sub3_sub1.anIntArray3144[i_190_] = Model
						.method1144(i_197_);
			} else if (i_191_ == 1) {
				Class41 class41 = aClass41Array3345[i_190_];
				int i_198_ = i
						+ (i_180_ * class41.anInt922 + i_181_
								* class41.anInt938 + i_182_ * class41.anInt925)
						/ (i_184_ + i_184_ / 2);
				class38_sub20_sub3_sub1.anIntArray3164[i_190_] = Model
						.method1144(i_198_);
				class38_sub20_sub3_sub1.anIntArray3144[i_190_] = -1;
			} else
				class38_sub20_sub3_sub1.anIntArray3144[i_190_] = -2;
		}
		method1147();
		class38_sub20_sub3_sub1.anInt3166 = vertexCount;
		class38_sub20_sub3_sub1.anIntArray3156 = xVertices;
		class38_sub20_sub3_sub1.anIntArray3140 = yVertices;
		class38_sub20_sub3_sub1.anIntArray3149 = zVertices;
		class38_sub20_sub3_sub1.anInt3167 = triangleCount;
		class38_sub20_sub3_sub1.anIntArray3157 = trianglesA;
		class38_sub20_sub3_sub1.anIntArray3152 = trianglesB;
		class38_sub20_sub3_sub1.anIntArray3165 = trianglesC;
		class38_sub20_sub3_sub1.aByteArray3168 = trianglePriorities;
		class38_sub20_sub3_sub1.aByteArray3155 = triangleTransparencies;
		class38_sub20_sub3_sub1.aByte3147 = aByte3329;
		class38_sub20_sub3_sub1.anIntArrayArray3163 = anIntArrayArray3337;
		class38_sub20_sub3_sub1.anIntArrayArray3143 = anIntArrayArray3338;
		class38_sub20_sub3_sub1.aShortArray3151 = aShortArray3305;
		return class38_sub20_sub3_sub1;
	}

	final void method1146() {
		int i_214_ = Model.anIntArray3315[256];
		int i_215_ = Model.anIntArray3309[256];
		for (int i_216_ = 0; i_216_ < vertexCount; i_216_++) {
			int i_217_ = zVertices[i_216_] * i_214_ + xVertices[i_216_]
					* i_215_ >> 16;
			zVertices[i_216_] = zVertices[i_216_] * i_215_ - xVertices[i_216_]
					* i_214_ >> 16;
			xVertices[i_216_] = i_217_;
		}
		method1149();
	}

	private void method1147() {
		if (vertexVSkins != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_218_ = 0; i_218_ < vertexCount; i_218_++) {
				int i_219_ = vertexVSkins[i_218_];
				is[i_219_]++;
				if (i_219_ > i)
					i = i_219_;
			}
			anIntArrayArray3337 = new int[i + 1][];
			for (int i_220_ = 0; i_220_ <= i; i_220_++) {
				anIntArrayArray3337[i_220_] = new int[is[i_220_]];
				is[i_220_] = 0;
			}
			for (int i_221_ = 0; i_221_ < vertexCount; i_221_++) {
				int i_222_ = vertexVSkins[i_221_];
				anIntArrayArray3337[i_222_][is[i_222_]++] = i_221_;
			}
			vertexVSkins = null;
		}
		if (anIntArray3343 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_223_ = 0; i_223_ < triangleCount; i_223_++) {
				int i_224_ = anIntArray3343[i_223_];
				is[i_224_]++;
				if (i_224_ > i)
					i = i_224_;
			}
			anIntArrayArray3338 = new int[i + 1][];
			for (int i_225_ = 0; i_225_ <= i; i_225_++) {
				anIntArrayArray3338[i_225_] = new int[is[i_225_]];
				is[i_225_] = 0;
			}
			for (int i_226_ = 0; i_226_ < triangleCount; i_226_++) {
				int i_227_ = anIntArray3343[i_226_];
				anIntArrayArray3338[i_227_][is[i_227_]++] = i_226_;
			}
			anIntArray3343 = null;
		}
	}

	final void method1148(short i, short i_228_) {
		if (aShortArray3305 != null)
			for (int i_229_ = 0; i_229_ < triangleCount; i_229_++)
				if (aShortArray3305[i_229_] == i)
					aShortArray3305[i_229_] = i_228_;
	}

	private void method1149() {
		aClass54Array3314 = null;
		aClass54Array3327 = null;
		aClass41Array3345 = null;
		aBool3306 = false;
	}

	final void method1150(int i, int i_230_, int i_231_) {
		for (int i_232_ = 0; i_232_ < vertexCount; i_232_++) {
			xVertices[i_232_] = xVertices[i_232_] * i / 128;
			yVertices[i_232_] = yVertices[i_232_] * i_230_ / 128;
			zVertices[i_232_] = zVertices[i_232_] * i_231_ / 128;
		}
		method1149();
	}
}
