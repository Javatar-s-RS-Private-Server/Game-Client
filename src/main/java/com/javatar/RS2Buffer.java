package com.javatar;/* Class38_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

class RS2Buffer extends Node {
    static Class17_Sub1 indexWidgets;
    static RSString aClass19_2369 = RSString.createRSString("blinken1:");
    static RSString aClass19_2379;
    static short[] aShortArray2380;
    static long aLong2396;
    static int anInt2397;
    static int anInt2406;
    static int anInt2412;
    static int anInt2416;
    private static RSString aClass19_2355;

    static {
        RS2Buffer.aClass19_2355 = RSString.createRSString("Loading config )2 ");
        RS2Buffer.aShortArray2380 = new short[]{960, 957, -21568, -21571,
                22464};
        RS2Buffer.anInt2397 = 0;
        RS2Buffer.anInt2406 = 0;
        RS2Buffer.aClass19_2379 = RS2Buffer.aClass19_2355;
        RS2Buffer.anInt2412 = 0;
        RS2Buffer.anInt2416 = 0;
    }

    int pos;
    byte[] buffer;

    RS2Buffer(int i) {
        try {
            this.buffer = Class76.method547(i);
            this.pos = 0;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.<init>(" + i
                    + ')');
        }
    }

    RS2Buffer(byte[] is) {
        try {
            this.buffer = is;
            this.pos = 0;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.<init>("
                    + (is != null ? "{...}" : "null") + ')');
        }
    }

    public static void method729() {
        RS2Buffer.aClass19_2379 = null;
        RS2Buffer.aClass19_2355 = null;
        RS2Buffer.aClass19_2369 = null;
        RS2Buffer.indexWidgets = null;
        RS2Buffer.aShortArray2380 = null;
    }

    static final void method758(int i, int i_25_, SceneGraph class27,
                                int i_26_, int i_27_, int i_28_, Class74 class74, int i_29_,
                                int i_30_, int i_31_) {
        try {
            ObjectDefinition class38_sub20_sub1 = Class80.method581(124, i);
            int i_32_;
            int i_33_;
            if (i_30_ == 1 || i_30_ == 3) {
                i_33_ = class38_sub20_sub1.anInt2469;
                i_32_ = class38_sub20_sub1.anInt2480;
            } else {
                i_32_ = class38_sub20_sub1.anInt2469;
                i_33_ = class38_sub20_sub1.anInt2480;
            }
            if (i_31_ != 0)
                RS2Buffer.aClass19_2355 = null;
            int i_34_;
            int i_35_;
            if (i_28_ + i_32_ <= 104) {
                i_34_ = (i_32_ + 1 >> 1) + i_28_;
                i_35_ = (i_32_ >> 1) + i_28_;
            } else {
                i_34_ = i_28_ + 1;
                i_35_ = i_28_;
            }
            int i_36_;
            int i_37_;
            if (i_33_ + i_26_ > 104) {
                i_37_ = i_26_ + 1;
                i_36_ = i_26_;
            } else {
                i_36_ = i_26_ + (i_33_ >> 1);
                i_37_ = (i_33_ + 1 >> 1) + i_26_;
            }
            int[][] is = Player.anIntArrayArrayArray3566[i_27_];
            int i_38_ = is[i_34_][i_37_] + is[i_34_][i_36_] + is[i_35_][i_36_]
                    + is[i_35_][i_37_] >> 2;
            int i_39_ = (i_33_ << 6) + (i_26_ << 7);
            int i_40_ = (i_32_ << 6) + (i_28_ << 7);
            int i_41_ = (i << 14) + (i_26_ << 7) + 1073741824
                    + i_28_;
            if (class38_sub20_sub1.anInt2440 == 0)
                i_41_ -= -2147483648;
            int i_42_ = (i_30_ << 6) + i_25_;
            if (class38_sub20_sub1.anInt2499 == 1)
                i_42_ += 256;
            if (i_25_ == 22) {
                SceneModel class38_sub20_sub3;
                if (class38_sub20_sub1.anInt2472 == -1
                        && class38_sub20_sub1.anIntArray2498 == null)
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_,
                            22, i_39_, -12818, is, i_30_, i_38_);
                else
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, 22,
                            i_30_, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                class27.method241(i_29_, i_28_, i_26_, i_38_,
                        class38_sub20_sub3, i_41_, i_42_);
                if (class38_sub20_sub1.anInt2482 == 1)
                    class74.method538(i_28_, i_26_);
            } else if (i_25_ == 10 || i_25_ == 11) {
                SceneModel class38_sub20_sub3;
                if (class38_sub20_sub1.anInt2472 == -1
                        && class38_sub20_sub1.anIntArray2498 == null)
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_,
                            10, i_39_, -12818, is, i_30_, i_38_);
                else
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, 10,
                            i_30_, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                if (class38_sub20_sub3 != null)
                    class27.method254(i_29_, i_28_, i_26_, i_38_, i_32_, i_33_,
                            class38_sub20_sub3, i_25_ != 11 ? 0 : 256, i_41_,
                            i_42_);
                if (class38_sub20_sub1.anInt2482 != 0)
                    class74.method521(i_33_, class38_sub20_sub1.aBool2466,
                            i_28_, i_26_, i_32_);
            } else if (i_25_ >= 12) {
                SceneModel class38_sub20_sub3;
                if (class38_sub20_sub1.anInt2472 == -1
                        && class38_sub20_sub1.anIntArray2498 == null)
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_,
                            i_25_, i_39_, i_31_ - 12818, is, i_30_, i_38_);
                else
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, i_25_,
                            i_30_, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                class27.method254(i_29_, i_28_, i_26_, i_38_, 1, 1,
                        class38_sub20_sub3, 0, i_41_, i_42_);
                if (class38_sub20_sub1.anInt2482 != 0)
                    class74.method521(i_33_, class38_sub20_sub1.aBool2466,
                            i_28_, i_26_, i_32_);
            } else if (i_25_ == 0) {
                SceneModel class38_sub20_sub3;
                if (class38_sub20_sub1.anInt2472 == -1
                        && class38_sub20_sub1.anIntArray2498 == null)
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_, 0,
                            i_39_, i_31_ ^ ~0x3211, is, i_30_, i_38_);
                else
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, 0,
                            i_30_, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                class27.method220(i_29_, i_28_, i_26_, i_38_,
                        class38_sub20_sub3, null,
                        Class47.anIntArray1044[i_30_], 0, i_41_, i_42_);
                if (class38_sub20_sub1.anInt2482 != 0)
                    class74.method527(class38_sub20_sub1.aBool2466, i_25_,
                            i_28_, true, i_26_, i_30_);
            } else if (i_25_ == 1) {
                SceneModel class38_sub20_sub3;
                if (class38_sub20_sub1.anInt2472 != -1
                        || class38_sub20_sub1.anIntArray2498 != null)
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, 1,
                            i_30_, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                else
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_, 1,
                            i_39_, -12818, is, i_30_, i_38_);
                class27.method220(i_29_, i_28_, i_26_, i_38_,
                        class38_sub20_sub3, null,
                        Class38_Sub20_Sub13.anIntArray3024[i_30_], 0, i_41_,
                        i_42_);
                if (class38_sub20_sub1.anInt2482 != 0)
                    class74.method527(class38_sub20_sub1.aBool2466, i_25_,
                            i_28_, true, i_26_, i_30_);
            } else if (i_25_ == 2) {
                int i_43_ = i_30_ + 1 & 0x3;
                SceneModel class38_sub20_sub3;
                SceneModel class38_sub20_sub3_44_;
                if (class38_sub20_sub1.anInt2472 == -1
                        && class38_sub20_sub1.anIntArray2498 == null) {
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_, 2,
                            i_39_, -12818, is, 4 + i_30_, i_38_);
                    class38_sub20_sub3_44_ = class38_sub20_sub1.method795(
                            i_40_, 2, i_39_, -12818, is, i_43_, i_38_);
                } else {
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, 2,
                            i_30_ + 4, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                    class38_sub20_sub3_44_ = new Class38_Sub20_Sub3_Sub2(i, 2,
                            i_43_, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                }
                class27.method220(i_29_, i_28_, i_26_, i_38_,
                        class38_sub20_sub3, class38_sub20_sub3_44_,
                        Class47.anIntArray1044[i_30_],
                        Class47.anIntArray1044[i_43_], i_41_, i_42_);
                if (class38_sub20_sub1.anInt2482 != 0)
                    class74.method527(class38_sub20_sub1.aBool2466, i_25_,
                            i_28_, true, i_26_, i_30_);
            } else if (i_25_ == 3) {
                SceneModel class38_sub20_sub3;
                if (class38_sub20_sub1.anInt2472 == -1
                        && class38_sub20_sub1.anIntArray2498 == null)
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_, 3,
                            i_39_, -12818, is, i_30_, i_38_);
                else
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, 3,
                            i_30_, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                class27.method220(i_29_, i_28_, i_26_, i_38_,
                        class38_sub20_sub3, null,
                        Class38_Sub20_Sub13.anIntArray3024[i_30_], 0, i_41_,
                        i_42_);
                if (class38_sub20_sub1.anInt2482 != 0)
                    class74.method527(class38_sub20_sub1.aBool2466, i_25_,
                            i_28_, true, i_26_, i_30_);
            } else if (i_25_ == 9) {
                SceneModel class38_sub20_sub3;
                if (class38_sub20_sub1.anInt2472 != -1
                        || class38_sub20_sub1.anIntArray2498 != null)
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, i_25_,
                            i_30_, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                else
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_,
                            i_25_, i_39_, i_31_ - 12818, is, i_30_, i_38_);
                class27.method254(i_29_, i_28_, i_26_, i_38_, 1, 1,
                        class38_sub20_sub3, 0, i_41_, i_42_);
                if (class38_sub20_sub1.anInt2482 != 0)
                    class74.method521(i_33_, class38_sub20_sub1.aBool2466,
                            i_28_, i_26_, i_32_);
            } else if (i_25_ == 4) {
                SceneModel class38_sub20_sub3;
                if (class38_sub20_sub1.anInt2472 != -1
                        || class38_sub20_sub1.anIntArray2498 != null)
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, 4,
                            i_30_, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                else
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_, 4,
                            i_39_, i_31_ ^ ~0x3211, is, i_30_, i_38_);
                class27.method261(i_29_, i_28_, i_26_, i_38_,
                        class38_sub20_sub3, null,
                        Class47.anIntArray1044[i_30_], 0, 0, 0, i_41_, i_42_);
            } else if (i_25_ == 5) {
                int i_45_ = class27.method256(i_29_, i_28_, i_26_);
                int i_46_ = 16;
                if (i_45_ != 0)
                    i_46_ = Class80.method581(-126,
                            (i_45_ & 0x1fffc540) >> 14).anInt2492;
                SceneModel class38_sub20_sub3;
                if (class38_sub20_sub1.anInt2472 != -1
                        || class38_sub20_sub1.anIntArray2498 != null)
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, 4,
                            i_30_, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                else
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_, 4,
                            i_39_, -12818, is, i_30_, i_38_);
                class27.method261(i_29_, i_28_, i_26_, i_38_,
                        class38_sub20_sub3, null,
                        Class47.anIntArray1044[i_30_], 0, i_46_
                                * Class58.anIntArray1282[i_30_], i_46_
                                * Class35.anIntArray810[i_30_], i_41_, i_42_);
            } else if (i_25_ == 6) {
                int i_47_ = 8;
                int i_48_ = class27.method256(i_29_, i_28_, i_26_);
                if (i_48_ != 0)
                    i_47_ = Class80.method581(29,
                            (i_48_ & 0x1ffff7a3) >> 14).anInt2492 / 2;
                SceneModel class38_sub20_sub3;
                if (class38_sub20_sub1.anInt2472 != -1
                        || class38_sub20_sub1.anIntArray2498 != null)
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, 4,
                            i_30_ + 4, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                else
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_, 4,
                            i_39_, -12818, is, i_30_ + 4, i_38_);
                class27.method261(i_29_, i_28_, i_26_, i_38_,
                        class38_sub20_sub3, null, 256, i_30_,
                        Class38_Sub20_Sub10.anIntArray2912[i_30_] * i_47_,
                        i_47_ * Class38_Sub10_Sub3.anIntArray2826[i_30_],
                        i_41_, i_42_);
            } else if (i_25_ == 7) {
                int i_49_ = i_30_ + 2 & 0x3;
                SceneModel class38_sub20_sub3;
                if (class38_sub20_sub1.anInt2472 == -1
                        && class38_sub20_sub1.anIntArray2498 == null)
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_, 4,
                            i_39_, -12818, is, i_49_ + 4, i_38_);
                else
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, 4,
                            i_49_ + 4, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                class27.method261(i_29_, i_28_, i_26_, i_38_,
                        class38_sub20_sub3, null, 256, i_49_, 0, 0, i_41_,
                        i_42_);
            } else if (i_25_ == 8) {
                int i_50_ = 8;
                int i_51_ = class27.method256(i_29_, i_28_, i_26_);
                if (i_51_ != 0)
                    i_50_ = Class80.method581(-128,
                            (i_51_ & 0x1fffe1b5) >> 14).anInt2492 / 2;
                int i_52_ = i_30_ + 2 & 0x3;
                SceneModel class38_sub20_sub3;
                SceneModel class38_sub20_sub3_53_;
                if (class38_sub20_sub1.anInt2472 == -1
                        && class38_sub20_sub1.anIntArray2498 == null) {
                    class38_sub20_sub3 = class38_sub20_sub1.method795(i_40_, 4,
                            i_39_, -12818, is, i_30_ + 4, i_38_);
                    class38_sub20_sub3_53_ = class38_sub20_sub1.method795(
                            i_40_, 4, i_39_, -12818, is, i_52_ + 4, i_38_);
                } else {
                    class38_sub20_sub3 = new Class38_Sub20_Sub3_Sub2(i, 4,
                            i_30_ + 4, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                    class38_sub20_sub3_53_ = new Class38_Sub20_Sub3_Sub2(i, 4,
                            i_52_ + 4, i_27_, i_28_, i_26_,
                            class38_sub20_sub1.anInt2472, true, null);
                }
                class27.method261(i_29_, i_28_, i_26_, i_38_,
                        class38_sub20_sub3, class38_sub20_sub3_53_, 256, i_30_,
                        i_50_ * Class38_Sub20_Sub10.anIntArray2912[i_30_],
                        i_50_ * Class38_Sub10_Sub3.anIntArray2826[i_30_],
                        i_41_, i_42_);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.EA(" + i + ','
                    + i_25_ + ',' + (class27 != null ? "{...}" : "null") + ','
                    + i_26_ + ',' + i_27_ + ',' + i_28_ + ','
                    + (class74 != null ? "{...}" : "null") + ',' + i_29_ + ','
                    + i_30_ + ',' + i_31_ + ')');
        }
    }

    static final void method763(int i, int i_57_) {
        try {
            if (i_57_ != -9034)
                RS2Buffer.method758(55, -127, null, -60, 97, 62, null, 98, 81,
                        -15);
            if (i == -3) {
                Class77.method551(Class10.aClass19_175, Class38_Sub20_Sub11.aClass19_2932, Entity.aClass19_3509);
            } else {
                if (i == -2)
                    Class77.method551(Class38_Sub20_Sub11.aClass19_2939,
                            Class38_Sub20_Sub11.aClass19_2920,
                            Class73_Sub2.aClass19_2288);
                else if (i != -1) {
                    if (i != 3) {
                        if (i == 4)
                            Class77.method551(
                                    Class38_Sub20_Sub17.aClass19_3115,
                                    Class38_Sub20_Sub11.aClass19_2969,
                                    Class66.aClass19_1372);
                        else if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                    if (i != 8) {
                                        if (i != 9) {
                                            if (i != 10) {
                                                if (i != 11) {
                                                    if (i == 12)
                                                        Class77.method551(
                                                                Class38_Sub11.aClass19_2095,
                                                                Class38_Sub20_Sub11.aClass19_2945,
                                                                Applet_Sub1.aClass19_3635);
                                                    else if (i != 13) {
                                                        if (i != 14) {
                                                            if (i == 16)
                                                                Class77.method551(
                                                                        Class38_Sub20_Sub16.aClass19_3101,
                                                                        Class38_Sub20_Sub11.aClass19_2933,
                                                                        Class33.aClass19_790);
                                                            else if (i != 17) {
                                                                if (i != 18) {
                                                                    if (i != 19) {
                                                                        if (i == 20)
                                                                            Class77.method551(
                                                                                    Class30.aClass19_731,
                                                                                    Class38_Sub20_Sub11.aClass19_2961,
                                                                                    Entity.aClass19_3512);
                                                                        else if (i != 22) {
                                                                            if (i == 23)
                                                                                Class77.method551(
                                                                                        Class79.aClass19_1570,
                                                                                        Class38_Sub20_Sub11.aClass19_2967,
                                                                                        Class22.aClass19_532);
                                                                            else if (i == 24)
                                                                                Class77.method551(
                                                                                        Class28.aClass19_691,
                                                                                        Class38_Sub20_Sub11.aClass19_2926,
                                                                                        Class5.aClass19_92);
                                                                            else if (i != 25) {
                                                                                if (i != 26) {
                                                                                    if (i == 27)
                                                                                        Class77.method551(
                                                                                                Class38_Sub20_Sub11.aClass19_2917,
                                                                                                Class38_Sub20_Sub11.aClass19_2925,
                                                                                                Class23.aClass19_557);
                                                                                    else
                                                                                        Class77.method551(
                                                                                                Class10.aClass19_189,
                                                                                                Class38_Sub20_Sub11.aClass19_2922,
                                                                                                Entity.aClass19_3516);
                                                                                } else
                                                                                    Class77.method551(
                                                                                            Canvas_Sub1.aClass19_2522,
                                                                                            Class38_Sub20_Sub11.aClass19_2944,
                                                                                            Class38_Sub20_Sub12.aClass19_3004);
                                                                            } else
                                                                                Class77.method551(
                                                                                        Class38_Sub14.aClass19_2138,
                                                                                        Class38_Sub20_Sub11.aClass19_2919,
                                                                                        Entity.aClass19_3515);
                                                                        } else
                                                                            Class77.method551(
                                                                                    Class51.aClass19_1137,
                                                                                    Class38_Sub20_Sub11.aClass19_2975,
                                                                                    Sequence.aClass19_2737);
                                                                    } else
                                                                        Class77.method551(
                                                                                Class79.aClass19_1567,
                                                                                Class38_Sub20_Sub17.aClass19_3119,
                                                                                Class45.aClass19_1014);
                                                                } else
                                                                    Class77.method551(
                                                                            Class25.aClass19_596,
                                                                            Class38_Sub20_Sub11.aClass19_2956,
                                                                            Class78.aClass19_1551);
                                                            } else
                                                                Class77.method551(
                                                                        Sequence.aClass19_2740,
                                                                        Class38_Sub20_Sub11.aClass19_2982,
                                                                        Class14.aClass19_257);
                                                        } else
                                                            Class77.method551(
                                                                    Class38_Sub22.aClass19_2335,
                                                                    Class38_Sub20_Sub11.aClass19_2983,
                                                                    Class22.aClass19_533);
                                                    } else
                                                        Class77.method551(
                                                                Class14.aClass19_255,
                                                                Class38_Sub20_Sub11.aClass19_2918,
                                                                Entity.aClass19_3517);
                                                } else
                                                    Class77.method551(
                                                            Class38_Sub7.aClass19_2031,
                                                            Class38_Sub20_Sub11.aClass19_2974,
                                                            Class73_Sub2.aClass19_2307);
                                            } else
                                                Class77.method551(
                                                        Class32.aClass19_767,
                                                        Class38_Sub20_Sub11.aClass19_2973,
                                                        Class38_Sub20_Sub11.aClass19_2951);
                                        } else
                                            Class77.method551(
                                                    ObjectDefinition.aClass19_2481,
                                                    Class38_Sub20_Sub11.aClass19_2942,
                                                    Class42.aClass19_957);
                                    } else
                                        Class77.method551(
                                                Class32.aClass19_773,
                                                Class38_Sub20_Sub11.aClass19_2968,
                                                Class9.aClass19_153);
                                } else
                                    Class77.method551(
                                            Class38_Sub20_Sub11.aClass19_2924,
                                            Class38_Sub20_Sub11.aClass19_2977,
                                            Class38_Sub20_Sub17.aClass19_3120);
                            } else
                                Class77.method551(
                                        Class38_Sub20_Sub15.aClass19_3076,
                                        Class38_Sub20_Sub11.aClass19_2976,
                                        Class38_Sub6.aClass19_1970);
                        } else
                            Class77.method551(
                                    Class38_Sub20_Sub4.aClass19_2561,
                                    Class38_Sub20_Sub11.aClass19_2914,
                                    Class38_Sub20_Sub11.aClass19_2964);
                    } else
                        Class77.method551(
                                Class38_Sub20_Sub11.aClass19_2954,
                                Class38_Sub20_Sub11.aClass19_2960,
                                Class17.aClass19_343);
                } else
                    Class77.method551(Class78.aClass19_1557,
                            Class38_Sub20_Sub11.aClass19_2934,
                            Entity.aClass19_3518);
            }
            Canvas_Sub1.method808(0, 10);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.HB(" + i + ','
                    + i_57_ + ')');
        }
    }

    final void putLEShortA(int value) {
        this.buffer[this.pos++] = (byte) (value + 128);
        this.buffer[this.pos++] = (byte) (value >> 8);
    }

    final int method726() {
        try {
            if (!true)
                RS2Buffer.aShortArray2380 = null;
            int i = this.buffer[this.pos] & 0xff;
            if (i < 128)
                return getUByte();
            return readUnsignedShortLE() - 32768;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.CB(" + true
                    + ')');
        }
    }

    final void putByteA(int value) {
        this.buffer[this.pos++] = (byte) (value + 128);
    }

    final RSString method728() {
        try {
            int i_2_ = 109 % ((-26 - (byte) 32) / 44);
            if (this.buffer[this.pos] == 0) {
                this.pos++;
                return null;
            }
            return readString(1347418632);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.HA(" + (byte) 32 + ')');
        }
    }

    final int method730(int i) {
        try {
            this.pos += 4;
            if (i <= 27)
                RS2Buffer.aLong2396 = 53L;
            return (this.buffer[this.pos - 2] & 0xff)
                    + ((this.buffer[this.pos - 3] & 0xff) << 24)
                    + ((this.buffer[this.pos - 4] & 0xff) << 16)
                    + (this.buffer[this.pos - 1] << 8 & 0xff00);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.DB(" + i + ')');
        }
    }

    final int method731() {
        try {
            if (-1592222329 != -1592222329)
                method766(34, -113);
            int i_3_ = this.buffer[this.pos++];
            int i_4_ = 0;
            for (/**/; i_3_ < 0; i_3_ = this.buffer[this.pos++])
                i_4_ = (i_4_ | i_3_ & 0x7f) << 7;
            return i_3_ | i_4_;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.J(" + -1592222329 + ')');
        }
    }

    final byte readByteCAdd() {
        try {
            if (127 <= 118)
                RS2Buffer.aClass19_2355 = null;
            return (byte) (-this.buffer[this.pos++] + 128);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.W(" + 127 + ')');
        }
    }

    final void method733(long l) {
        do {
            try {
                method747((int) (l >> 32), -2687);
                method747((int) l, -2687);
                if (32 == 32)
                    break;
                this.buffer = null;
            } catch (RuntimeException runtimeexception) {
                throw Class38_Sub1.method607(runtimeexception, "jd.UA(" + 32
                        + ',' + l + ')');
            }
            break;
        } while (false);
    }

    final void putShort(int value) {
        this.buffer[this.pos++] = (byte) (value >> 8);
        this.buffer[this.pos++] = (byte) value;
    }

    final void putByte(int value) {
        this.buffer[this.pos++] = (byte) value;
    }

    final void putSizedByte(int i) {
        this.buffer[this.pos - i - 1] = (byte) i;
    }

    final int method737() {
        try {
            if (-49152 != -49152)
                RS2Buffer.aLong2396 = 19L;
            int i_7_ = this.buffer[this.pos] & 0xff;
            if (i_7_ >= 128)
                return readUnsignedShortLE() - 49152;
            return getUByte() - 64;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.RA(" + -49152 + ')');
        }
    }

    final int method738(byte i) {
        try {
            this.pos += 3;
            if (i <= 65)
                method761(-67, true);
            return (this.buffer[this.pos - 1] & 0xff)
                    + (this.buffer[this.pos - 3] << 16 & 0xff0000)
                    + (this.buffer[this.pos - 2] << 8 & 0xff00);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.K(" + i + ')');
        }
    }

    final int getUShortA() {
        this.pos += 2;
        return (this.buffer[this.pos - 1] - 128 & 0xff)
                + ((this.buffer[this.pos - 2] & 0xff) << 8);
    }

    final int method740(byte i) {
        try {
            this.pos += 2;
            return ((this.buffer[this.pos - 1] & 0xff) << 8)
                    + (this.buffer[this.pos - 2] - 128 & 0xff);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.BA(" + i + ')');
        }
    }

    final int method741(int i) {
        try {
            if (i <= 47)
                RS2Buffer.anInt2406 = 81;
            return this.buffer[this.pos++] - 128 & 0xff;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.H(" + i + ')');
        }
    }

    final void writeString(RSString class19, byte i) {
        try {
            this.pos += class19.method138(this.pos, class19.method143((byte) 59), this.buffer);
            this.buffer[this.pos++] = (byte) 0;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.T("
                    + (class19 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    final int method743(byte i, int i_10_) {
        try {
            int i_11_ = Class38_Sub8.method657(this.pos, i_10_, i + 25179,
                    this.buffer);
            if (i != 95)
                return -88;
            putInt(i_11_);
            return i_11_;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.TA(" + i + ','
                    + i_10_ + ')');
        }
    }

    final void decryptXTEA(int i, int[] is) {
        try {
            int i_14_ = this.pos;
            this.pos = 5;
            int i_15_ = (i - 5) / 8;
            if (478815268 != 478815268)
                RS2Buffer.aClass19_2379 = null;
            for (int i_16_ = 0; i_15_ > i_16_; i_16_++) {
                int i_17_ = readInt(true);
                int i_18_ = -957401312;
                int i_19_ = readInt(true);
                int i_20_ = -1640531527;
                int i_21_ = 32;
                while (i_21_-- > 0) {
                    i_19_ -= i_18_ + is[(i_18_ & 0x1c4f) >>> 11]
                            ^ (i_17_ >>> 5 ^ i_17_ << 4)
                            + i_17_;
                    i_18_ -= i_20_;
                    i_17_ -= i_18_ + is[i_18_ & 0x3]
                            ^ (i_19_ >>> 5 ^ i_19_ << 4)
                            + i_19_;
                }
                this.pos -= 8;
                putInt(i_17_);
                putInt(i_19_);
            }
            this.pos = i_14_;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.E(" + i + ','
                    + 478815268 + ',' + 5 + ','
                    + (is != null ? "{...}" : "null") + ')');
        }
    }

    final int getULEShort() {
        this.pos += 2;
        return (this.buffer[this.pos - 1] << 8 & 0xff00)
                + (this.buffer[this.pos - 2] & 0xff);
    }

    final int method746(int i) {
        try {
            this.pos += 4;
            if (i > -61)
                readUnsignedShortLE();
            return (this.buffer[this.pos - 3] << 8 & 0xff00)
                    + (this.buffer[this.pos - 2] << 16 & 0xff0000)
                    + ((this.buffer[this.pos - 1] & 0xff) << 24)
                    + (this.buffer[this.pos - 4] & 0xff);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.F(" + i + ')');
        }
    }

    final void method747(int i, int i_22_) {
        try {
            if (i_22_ == -2687) {
                this.buffer[this.pos++] = (byte) i;
                this.buffer[this.pos++] = (byte) (i >> 8);
                this.buffer[this.pos++] = (byte) (i >> 16);
                this.buffer[this.pos++] = (byte) (i >> 24);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.U(" + i + ','
                    + i_22_ + ')');
        }
    }

    long readLong() {
        long l = readInt() & 0xffffffffL;
        long l1 = readInt() & 0xffffffffL;
        return (l << 32) + l1;
    }

    final long readLong(int i) {
        try {
            long l = readInt(true) & 0xffffffffL;
            long l_23_ = readInt(true) & 0xffffffffL;
            if (i > -100)
                RS2Buffer.anInt2416 = 104;
            return (l << 32) + l_23_;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.CA(" + i + ')');
        }
    }

    final int method749() {
        try {
            this.pos += 2;
            if (-126 > -120)
                method747(104, 6);
            int i_24_ = (this.buffer[this.pos - 1] - 128 & 0xff)
                    + ((this.buffer[this.pos - 2] & 0xff) << 8);
            if (i_24_ > 32767)
                i_24_ -= 65536;
            return i_24_;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.Q(" + -126 + ')');
        }
    }

    final int getUByteC() {
        return -this.buffer[this.pos++] & 0xff;
    }

    final void putInt(int value) {
        this.buffer[this.pos++] = (byte) (value >> 24);
        this.buffer[this.pos++] = (byte) (value >> 16);
        this.buffer[this.pos++] = (byte) (value >> 8);
        this.buffer[this.pos++] = (byte) value;
    }

    void writeInt(int value) {
        putByte(value >> 24);
        putByte(value >> 16);
        putByte(value >> 8);
        putByte(value);
    }

    final int readUnsignedShortLE() {
        this.pos += 2;
        return (this.buffer[this.pos - 1] & 0xff)
                + (this.buffer[this.pos - 2] << 8 & 0xff00);
    }

    final int getUByte() {
        return this.buffer[this.pos++] & 0xff;
    }

    final void putByteC(int value) {
        this.buffer[this.pos++] = (byte) -value;
    }

    final byte method755(int i) {
        try {
            if (i != 0)
                return (byte) -87;
            return (byte) -this.buffer[this.pos++];
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.OA(" + i + ')');
        }
    }

    final int method756(int i) {
        try {
            if (i != 13285)
                putShort(117);
            return -this.buffer[this.pos++] + 128 & 0xff;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.IA(" + i + ')');
        }
    }

    final byte method757(int i) {
        try {
            if (i >= -72)
                method746(6);
            return (byte) (this.buffer[this.pos++] - 128);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.GA(" + i + ')');
        }
    }

    final int readInt() {
        return ((0xff0000 & buffer[this.pos - 3] << 16) + ((~0xffffff & buffer[this.pos - 4] << 24)
                + ((0xff & buffer[-2 + this.pos]) << 8) + (buffer[-1
                + this.pos] & 0xff)));
    }

    final int readInt(boolean bool) {
        try {
            if (!bool)
                method761(-61, true);
            this.pos += 4;
            return (this.buffer[this.pos - 1] & 0xff)
                    + ((this.buffer[this.pos - 3] & 0xff) << 16)
                    + ((this.buffer[this.pos - 4] << 24) & ~0xffffff)
                    + ((this.buffer[this.pos - 2] << 8) & 0xff);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1
                    .method607(runtimeexception, "jd.N(" + bool + ')');
        }
    }

    final void method760(byte[] is, int i_55_) {
        try {
            if ((byte) -110 <= -102)
                for (int i_56_ = i_55_ - 1 + 0; 0 <= i_56_; i_56_--)
                    is[i_56_] = this.buffer[this.pos++];
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.C("
                    + (is != null ? "{...}" : "null") + ',' + 0 + ',' + (byte) -110
                    + ',' + i_55_ + ')');
        }
    }

    final void method761(int i, boolean bool) {
        try {
            this.buffer[this.pos + -i - 4] = (byte) (i >> 24);
            this.buffer[-i - 3 + this.pos] = (byte) (i >> 16);
            this.buffer[-i + this.pos - 2] = (byte) (i >> 8);
            if (bool)
                RS2Buffer.anInt2406 = 90;
            this.buffer[this.pos - i - 1] = (byte) i;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.I(" + i + ','
                    + bool + ')');
        }
    }

    final void writeLong(long value) {
        try {
            this.buffer[this.pos++] = (byte) (int) (value >> 56);
            this.buffer[this.pos++] = (byte) (int) (value >> 48);
            this.buffer[this.pos++] = (byte) (int) (value >> 40);
            this.buffer[this.pos++] = (byte) (int) (value >> 32);
            this.buffer[this.pos++] = (byte) (int) (value >> 24);
            this.buffer[this.pos++] = (byte) (int) (value >> 16);
            this.buffer[this.pos++] = (byte) (int) (value >> 8);
            this.buffer[this.pos++] = (byte) (int) value;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.NA(" + value + ','
                    + (byte) 56 + ')');
        }
    }

    final void putBytes(int size, byte[] data) {
        do {
            try {
                for (int i_60_ = 0; i_60_ < size; i_60_++)
                    this.buffer[this.pos++] = data[i_60_];
                break;
            } catch (RuntimeException runtimeexception) {
                throw Class38_Sub1.method607(runtimeexception, "jd.PA(" + 0
                        + ',' + -25154 + ',' + size + ','
                        + (data != null ? "{...}" : "null") + ')');
            }
        } while (false);
    }

    final byte method765(byte i) {
        try {
            if (i <= 79)
                return (byte) 68;
            return this.buffer[this.pos++];
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.FA(" + i + ')');
        }
    }

    final void method766(int i, int i_61_) {
        try {
            if (i >= 0 && i < 128)
                putByte(i);
            else if (i >= 0 && i < 32768)
                putShort(32768 + i);
            else {
                if (i_61_ != -64)
                    RS2Buffer.anInt2412 = 0;
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.B(" + i + ','
                    + i_61_ + ')');
        }
    }

    final void method767(int i, int i_62_) {
        try {
            this.buffer[this.pos++] = (byte) i_62_;
            if (i != -25680)
                encryptRSA(false, null, null);
            this.buffer[this.pos++] = (byte) (i_62_ >> 8);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.DA(" + i + ','
                    + i_62_ + ')');
        }
    }

    final void method768(int i) {
        do {
            try {
                this.buffer[this.pos++] = (byte) (-i + 128);
                if ((byte) -121 < -120)
                    break;
                method756(92);
            } catch (RuntimeException runtimeexception) {
                throw Class38_Sub1.method607(runtimeexception, "jd.LA(" + i
                        + ',' + (byte) -121 + ')');
            }
            break;
        } while (false);
    }

    final void method769(int i, int i_64_) {
        try {
            this.buffer[this.pos++] = (byte) (i >> 8);
            this.buffer[this.pos++] = (byte) (i + 128);
            if (i_64_ <= 62)
                RS2Buffer.method758(24, 0, null, -18, -13, 53, null, 97, -11,
                        -78);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.R(" + i + ','
                    + i_64_ + ')');
        }
    }

    final int getMEInt() {
        this.pos += 4;
        return (this.buffer[this.pos - 3] & 0xff)
                + (this.buffer[this.pos - 2] << 24 & ~0xffffff)
                - (-((this.buffer[this.pos - 1] & 0xff) << 16) - (this.buffer[this.pos - 4] << 8 & 0xff00));
    }

    final void method771(int i_66_) {
        try {
            if (-31368 != -31368)
                method743((byte) -3, 125);
            this.buffer[this.pos++] = (byte) (i_66_ >> 16);
            this.buffer[this.pos++] = (byte) (i_66_ >> 8);
            this.buffer[this.pos++] = (byte) i_66_;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.EB(" + -31368 + ','
                    + i_66_ + ')');
        }
    }

    final int method772() {
        try {
            this.pos += 2;
            int i = (this.buffer[this.pos - 2] << 8 & 0xff00)
                    + (this.buffer[this.pos - 1] & 0xff);
            if (false)
                RS2Buffer.anInt2416 = -127;
            if (i > 32767)
                i -= 65536;
            return i;
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.BB(" + false
                    + ')');
        }
    }

    final void encryptRSA(boolean bool, BigInteger biginteger,
                          BigInteger biginteger_67_) {
        do {
            try {
                int i = this.pos;
                this.pos = 0;
                byte[] is = new byte[i];
                method778(i, is);
                // biginteger);
                byte[] is_70_ = new BigInteger(is).toByteArray();
                this.pos = 0;
                putByte(is_70_.length);
                putBytes(is_70_.length, is_70_);
            } catch (RuntimeException runtimeexception) {
                throw Class38_Sub1.method607(runtimeexception, "jd.FB(" + bool
                        + ',' + (biginteger != null ? "{...}" : "null") + ','
                        + (biginteger_67_ != null ? "{...}" : "null") + ')');
            }
            break;
        } while (false);
    }

    final void method774(int i_71_) {
        try {
            this.buffer[this.pos++] = (byte) (i_71_ >> 16);
            if (8 != 8)
                RS2Buffer.indexWidgets = null;
            this.buffer[this.pos++] = (byte) (i_71_ >> 24);
            this.buffer[this.pos++] = (byte) i_71_;
            this.buffer[this.pos++] = (byte) (i_71_ >> 8);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.GB(" + 8 + ','
                    + i_71_ + ')');
        }
    }

    final void method775(int i) {
        do {
            try {
                if ((i & ~0x7f) != 0) {
                    if ((i & ~0x3fff) != 0) {
                        if ((i & ~0x1fffff) != 0) {
                            if ((i & ~0xfffffff) != 0)
                                putByte(i >>> 28 | 0x80);
                            putByte(i >>> 21 | 0x80);
                        }
                        putByte(i >>> 14 | 0x80);
                    }
                    putByte(i >>> 7 | 0x80);
                }
                putByte(i & 0x7f);
                if (!false)
                    break;
                RS2Buffer.aClass19_2355 = null;
            } catch (RuntimeException runtimeexception) {
                throw Class38_Sub1.method607(runtimeexception, "jd.AB(" + i
                        + ',' + false + ')');
            }
            break;
        } while (false);
    }

    final RSString readString(int i) {
        try {
            if (i != 1347418632)
                return null;
            int i_72_ = this.pos;
            while (this.buffer[this.pos++] != 0) {
                /* empty */
            }
            return SceneModel.method821(this.buffer, (byte) -66, i_72_, -i_72_
                    + this.pos - 1);
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.O(" + i + ')');
        }
    }

    final void method777(int i) {
        try {
            if ((byte) 29 == 29) {
                this.buffer[this.pos++] = (byte) (i >> 8);
                this.buffer[this.pos++] = (byte) i;
                this.buffer[this.pos++] = (byte) (i >> 24);
                this.buffer[this.pos++] = (byte) (i >> 16);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class38_Sub1.method607(runtimeexception, "jd.KA(" + i + ','
                    + (byte) 29 + ')');
        }
    }

    final void method778(int i, byte[] is) {
        do {
            try {
                for (int i_75_ = 0; i_75_ < 0 + i; i_75_++)
                    is[i_75_] = this.buffer[this.pos++];
                if (!false)
                    break;
                RS2Buffer.anInt2406 = 69;
            } catch (RuntimeException runtimeexception) {
                throw Class38_Sub1.method607(runtimeexception, "jd.L(" + i
                        + ',' + 0 + ',' + false + ','
                        + (is != null ? "{...}" : "null") + ')');
            }
            break;
        } while (false);
    }
}
