package com.javatar.jagex;/* Class38_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class WidgetComponent extends Node {
	int anInt1850;
	RSString[] aClass19Array1851;
	boolean aBool1853;
	Object[] anObjectArray1854;
	static int anInt1855 = 0;
	int anInt1856;
	static Class77 aClass77_1857;
	int[] anIntArray1858;
	int anInt1859;
	int[] anIntArray1860;
	boolean aBool1861;
	int anInt1862;
	int anInt1863 = 0;
	Object[] anObjectArray1864;
	int anInt1865;
	int[] anIntArray1866;
	WidgetComponent[] aClass38_Sub6Array1867;
	int anInt1868;
	RSString[] aClass19Array1869;
	Object[] anObjectArray1871;
	int anInt1873;
	int[] anIntArray1874;
	int anInt1875;
	RSString aClass19_1876;
	int anInt1878;
	Object[] anObjectArray1879;
	static RSString aClass19_1880 = RSString.createRSString("m");
	int anInt1881;
	int anInt1882;
	int anInt1883;
	Object[] anObjectArray1884;
	boolean aBool1885;
	int anInt1886 = 0;
	RSString aClass19_1887;
	Object[] anObjectArray1888;
	int anInt1889;
	int anInt1890;
	int[] anIntArray1891;
	Object[] anObjectArray1892;
	Object[] anObjectArray1893;
	Object[] anObjectArray1895;
	int anInt1896;
	int anInt1897;
	int[] anIntArray1898;
	int anInt1899;
	int anInt1900;
	int anInt1901;
	static int[][] anIntArrayArray1902 = new int[104][104];
	int anInt1903;
	RSString aClass19_1904;
	int anInt1905;
	Object[] anObjectArray1906;
	Object[] anObjectArray1907;
	Object[] anObjectArray1908;
	int anInt1909;
	int anInt1910;
	private int anInt1911;
	int anInt1912;
	Object[] anObjectArray1913;
	Object[] anObjectArray1915;
	boolean aBool1916;
	int anInt1917;
	boolean aBool1919;
	int anInt1920;
	int anInt1921;
	int[] anIntArray1922;
	int anInt1923;
	private int anInt1924;
	int anInt1925;
	RSString aClass19_1926;
	boolean aBool1927;
	int anInt1928;
	int anInt1929;
	int anInt1930;
	int anInt1931;
	int anInt1932;
	int anInt1933;
	int[] anIntArray1934;
	Object[] anObjectArray1935;
	int anInt1936;
	WidgetComponent aClass38_Sub6_1937;
	RSString aClass19_1938;
	private static RSString aClass19_1939;
	int anInt1941;
	int anInt1942;
	int anInt1943;
	boolean aBool1944;
	static RSString[] aClass19Array1945 = new RSString[100];
	RSString aClass19_1946;
	int[] anIntArray1947;
	Object[] anObjectArray1948;
	Object[] anObjectArray1949;
	Object[] anObjectArray1950;
	int anInt1951;
	int anInt1952;
	int anInt1953;
	int anInt1954;
	int[][] anIntArrayArray1955;
	int anInt1956;
	int anInt1957;
	int anInt1958;
	Object[] anObjectArray1959;
	boolean aBool1960;
	boolean aBool1961;
	int anInt1962;
	Object[] anObjectArray1963;
	int anInt1964;
	Object[] anObjectArray1965;
	boolean aBool1966;
	static int[] anIntArray1967;
	int anInt1968;
	boolean aBool1969;
	static RSString aClass19_1970;
	int anInt1973;
	int anInt1974;
	boolean aBool1975;
	static int anInt1976;
	int anInt1977;
	Object[] anObjectArray1978;
	Object[] anObjectArray1979;
	Object[] anObjectArray1980;
	int anInt1982;
	Object[] anObjectArray1984;
	int anInt1985;
	int anInt1986;
	int anInt1987;
	int[] anIntArray1988;

	final Class38_Sub20_Sub9_Sub3 method634(int i, boolean bool) {
		try {
			Class42.aBool965 = false;
			int i_0_;
			if (bool)
				i_0_ = this.anInt1957;
			else
				i_0_ = this.anInt1932;
			if (i_0_ == -1)
				return null;
			long l = ((this.aBool1885 ? 1L : 0L) << 486312999) + ((this.aBool1927 ? 1L : 0L) << 2074095846) + ((long) this.anInt1909 << -1559088988) + i_0_ + ((long) this.anInt1930 << -1472991960);
			Class38_Sub20_Sub9_Sub3 class38_sub20_sub9_sub3 = (Class38_Sub20_Sub9_Sub3) Class25.aClass83_585.method591(-28825, l);
			if (class38_sub20_sub9_sub3 != null)
				return class38_sub20_sub9_sub3;
			class38_sub20_sub9_sub3 = WidgetComponent.method647(0, Class38_Sub19.aClass17_2230, i_0_, -1);
			if (class38_sub20_sub9_sub3 == null) {
				Class42.aBool965 = true;
				return null;
			}
			if (this.aBool1927)
				class38_sub20_sub9_sub3.method1116();
			if (this.aBool1885)
				class38_sub20_sub9_sub3.method1101();
			if (this.anInt1909 > 0)
				class38_sub20_sub9_sub3.method1112(this.anInt1909);
			if (i >= -32)
				return null;
			if (this.anInt1909 >= 1)
				class38_sub20_sub9_sub3.method1114(1);
			if (this.anInt1909 >= 2)
				class38_sub20_sub9_sub3.method1114(16777215);
			if (this.anInt1930 != 0)
				class38_sub20_sub9_sub3.method1109(this.anInt1930);
			Class25.aClass83_585.method590(l, (byte) -123, class38_sub20_sub9_sub3);
			return class38_sub20_sub9_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.C(" + i + ',' + bool + ')');
		}
	}

	private final int[] method635(RS2Buffer class38_sub23, int i) {
		try {
			int i_1_ = class38_sub23.readUnsignedByte();
			if (i != 16369)
				WidgetComponent.aClass77_1857 = null;
			if (i_1_ == 0)
				return null;
			int[] is = new int[i_1_];
			for (int i_2_ = 0; i_1_ > i_2_; i_2_++)
				is[i_2_] = class38_sub23.readInt(true);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.L(" + (class38_sub23 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method636(RSString class19, boolean bool, int i) {
		do {
			try {
				if (this.aClass19Array1851 == null || i >= this.aClass19Array1851.length) {
					RSString[] class19s = new RSString[i + 1];
					if (this.aClass19Array1851 != null)
						for (int i_3_ = 0; i_3_ < this.aClass19Array1851.length; i_3_++)
							class19s[i_3_] = this.aClass19Array1851[i_3_];
					this.aClass19Array1851 = class19s;
				}
				this.aClass19Array1851[i] = class19;
				if (bool == true)
					break;
				this.aClass19_1887 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "f.F(" + (class19 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final Class38_Sub20_Sub9_Sub1_Sub1 method637(boolean bool) {
		try {
			Class42.aBool965 = bool;
			if (this.anInt1920 == -1)
				return null;
			Class38_Sub20_Sub9_Sub1_Sub1 class38_sub20_sub9_sub1_sub1 = (Class38_Sub20_Sub9_Sub1_Sub1) Class3.aClass83_50.method591(-28825, this.anInt1920);
			if (class38_sub20_sub9_sub1_sub1 != null)
				return class38_sub20_sub9_sub1_sub1;
			class38_sub20_sub9_sub1_sub1 = Class58.method445(this.anInt1920, Class38_Sub20_Sub17.aClass17_3114, (byte) 79, Class38_Sub19.aClass17_2230, 0);
			if (class38_sub20_sub9_sub1_sub1 == null)
				Class42.aBool965 = true;
			else
				Class3.aClass83_50.method590(this.anInt1920, (byte) -124, class38_sub20_sub9_sub1_sub1);
			return class38_sub20_sub9_sub1_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.A(" + bool + ')');
		}
	}

	public static void method638(byte i) {
		try {
			WidgetComponent.aClass19_1970 = null;
			WidgetComponent.aClass77_1857 = null;
			WidgetComponent.aClass19_1880 = null;
			WidgetComponent.anIntArrayArray1902 = null;
			int i_4_ = 94 / ((i + 76) / 49);
			WidgetComponent.aClass19Array1945 = null;
			WidgetComponent.aClass19_1939 = null;
			WidgetComponent.anIntArray1967 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.D(" + i + ')');
		}
	}

	static final void method639(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			Class38_Sub3 class38_sub3 = (Class38_Sub3) Class38_Sub20_Sub8.aClass14_2863.method75(i);
			if (class38_sub3 == null) {
				class38_sub3 = new Class38_Sub3();
				Class38_Sub20_Sub8.aClass14_2863.method80(true, i, class38_sub3);
			}
			if (i_5_ >= class38_sub3.anIntArray1781.length) {
				int[] is = new int[i_5_ + 1];
				int[] is_9_ = new int[i_5_ + 1];
				for (int i_10_ = 0; i_10_ < class38_sub3.anIntArray1781.length; i_10_++) {
					is[i_10_] = class38_sub3.anIntArray1781[i_10_];
					is_9_[i_10_] = class38_sub3.anIntArray1779[i_10_];
				}
				for (int i_11_ = class38_sub3.anIntArray1781.length; i_11_ < i_5_; i_11_++) {
					is[i_11_] = -1;
					is_9_[i_11_] = 0;
				}
				class38_sub3.anIntArray1779 = is_9_;
				class38_sub3.anIntArray1781 = is;
			}
			if (i_6_ != -31820)
				WidgetComponent.method647(73, null, 117, 78);
			class38_sub3.anIntArray1781[i_5_] = i_8_;
			class38_sub3.anIntArray1779[i_5_] = i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.J(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')');
		}
	}

	static final void method640(long l, int i) {
		try {
			if (l != 0L) {
				if (i != 1)
					WidgetComponent.anIntArrayArray1902 = null;
				for (int i_12_ = 0; Class81.anInt1618 > i_12_; i_12_++)
					if (Class20.aLongArray499[i_12_] == l) {
						Class81.anInt1618--;
						for (int i_13_ = i_12_; Class81.anInt1618 > i_13_; i_13_++) {
							Class53.aClass19Array1173[i_13_] = Class53.aClass19Array1173[i_13_ + 1];
							Class41.anIntArray941[i_13_] = Class41.anIntArray941[i_13_ + 1];
							Class20.aLongArray499[i_13_] = Class20.aLongArray499[i_13_ + 1];
							Class80.anIntArray1606[i_13_] = Class80.anIntArray1606[i_13_ + 1];
						}
						Class81.anInt1624 = Entity.anInt3513;
						Client.outputBuffer.putOpcode(135);
						Client.outputBuffer.writeLong(l);
						break;
					}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.H(" + l + ',' + i + ')');
		}
	}

	final Class38_Sub20_Sub3_Sub1 method641(Class38_Sub20_Sub4 class38_sub20_sub4, int i, PlayerAppearance playerAppearance, int i_14_, boolean bool) {
		try {
			if (i != -50)
				return null;
			Class42.aBool965 = false;
			int i_15_;
			int i_16_;
			if (!bool) {
				i_16_ = this.anInt1962;
				i_15_ = this.anInt1883;
			} else {
				i_15_ = anInt1911;
				i_16_ = anInt1924;
			}
			if (i_15_ == 0)
				return null;
			if (i_15_ == 1 && i_16_ == -1)
				return null;
			Class38_Sub20_Sub3_Sub1 class38_sub20_sub3_sub1 = (Class38_Sub20_Sub3_Sub1) Class61.aClass83_1329.method591(-28825, (i_15_ << 1231626704) + i_16_);
			if (class38_sub20_sub3_sub1 == null) {
				if (i_15_ == 1) {
					Model class38_sub20_sub3_sub3 = Model.get(Class15.aClass17_299, i_16_, 0);
					if (class38_sub20_sub3_sub3 == null) {
						Class42.aBool965 = true;
						return null;
					}
					class38_sub20_sub3_sub1 = class38_sub20_sub3_sub3.method1142(64, 768, -50, -10, -50);
				}
				if (i_15_ == 2) {
					Model class38_sub20_sub3_sub3 = Class38_Sub20_Sub3_Sub4.method1156(-87, i_16_).method910(-122);
					if (class38_sub20_sub3_sub3 == null) {
						Class42.aBool965 = true;
						return null;
					}
					class38_sub20_sub3_sub1 = class38_sub20_sub3_sub3.method1142(64, 768, -50, -10, -50);
				}
				if (i_15_ == 3) {
					if (playerAppearance == null)
						return null;
					Model class38_sub20_sub3_sub3 = playerAppearance.method133(23341);
					if (class38_sub20_sub3_sub3 == null) {
						Class42.aBool965 = true;
						return null;
					}
					class38_sub20_sub3_sub1 = class38_sub20_sub3_sub3.method1142(64, 768, -50, -10, -50);
				}
				if (i_15_ == 4) {
					ItemDefinition class38_sub20_sub6 = Node.forId(i_16_, 26);
					Model class38_sub20_sub3_sub3 = class38_sub20_sub6.method937(10, 86);
					if (class38_sub20_sub3_sub3 == null) {
						Class42.aBool965 = true;
						return null;
					}
					class38_sub20_sub3_sub1 = class38_sub20_sub3_sub3.method1142(64 + class38_sub20_sub6.anInt2760, class38_sub20_sub6.anInt2762 + 768, -50, -10, -50);
				}
				Class61.aClass83_1329.method590((i_15_ << 351067088) + i_16_, (byte) -127, class38_sub20_sub3_sub1);
			}
			if (class38_sub20_sub4 != null)
				class38_sub20_sub3_sub1 = class38_sub20_sub4.method829(-964, i_14_, class38_sub20_sub3_sub1);
			return class38_sub20_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.E(" + (class38_sub20_sub4 != null ? "{...}" : "null") + ',' + i + ',' + (playerAppearance != null ? "{...}" : "null") + ',' + i_14_ + ',' + bool + ')');
		}
	}

	final Class38_Sub20_Sub9_Sub3 method642(int i, int i_17_) {
		try {
			Class42.aBool965 = false;
			if (i_17_ < 0 || this.anIntArray1874.length <= i_17_)
				return null;
			int i_18_ = this.anIntArray1874[i_17_];
			if (i_18_ == -1)
				return null;
			Class38_Sub20_Sub9_Sub3 class38_sub20_sub9_sub3 = (Class38_Sub20_Sub9_Sub3) Class25.aClass83_585.method591(-28825, i_18_);
			if (class38_sub20_sub9_sub3 != null)
				return class38_sub20_sub9_sub3;
			class38_sub20_sub9_sub3 = WidgetComponent.method647(i, Class38_Sub19.aClass17_2230, i_18_, -1);
			if (class38_sub20_sub9_sub3 == null)
				Class42.aBool965 = true;
			else
				Class25.aClass83_585.method590(i_18_, (byte) -119, class38_sub20_sub9_sub3);
			return class38_sub20_sub9_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.M(" + i + ',' + i_17_ + ')');
		}
	}

	final void decodeLegacyWidget(RS2Buffer class38_sub23, byte i) {
		do {
			try {
				this.aBool1961 = false;
				this.anInt1868 = class38_sub23.readUnsignedByte();
				this.anInt1903 = class38_sub23.readUnsignedByte();
				this.anInt1958 = class38_sub23.readUnsignedShort();
				this.anInt1910 = this.anInt1942 = class38_sub23.method772(false);
				this.anInt1882 = this.anInt1968 = class38_sub23.method772(false);
				this.anInt1923 = class38_sub23.readUnsignedShort();
				this.anInt1886 = class38_sub23.readUnsignedShort();
				this.anInt1974 = class38_sub23.readUnsignedByte();
				this.anInt1977 = class38_sub23.readUnsignedShort();
				if (this.anInt1977 != 65535)
					this.anInt1977 = (this.anInt1856 & ~0xffff) + this.anInt1977;
				else
					this.anInt1977 = -1;
				this.anInt1865 = class38_sub23.readUnsignedShort();
				if (this.anInt1865 == 65535)
					this.anInt1865 = -1;
				int i_19_ = class38_sub23.readUnsignedByte();
				if (i_19_ > 0) {
					this.anIntArray1898 = new int[i_19_];
					this.anIntArray1891 = new int[i_19_];
					for (int i_20_ = 0; i_19_ > i_20_; i_20_++) {
						this.anIntArray1891[i_20_] = class38_sub23.readUnsignedByte();
						this.anIntArray1898[i_20_] = class38_sub23.readUnsignedShort();
					}
				}
				int i_21_ = class38_sub23.readUnsignedByte();
				if (i_21_ > 0) {
					this.anIntArrayArray1955 = new int[i_21_][];
					for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
						int i_23_ = class38_sub23.readUnsignedShort();
						this.anIntArrayArray1955[i_22_] = new int[i_23_];
						for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
							this.anIntArrayArray1955[i_22_][i_24_] = class38_sub23.readUnsignedShort();
							if (this.anIntArrayArray1955[i_22_][i_24_] == 65535)
								this.anIntArrayArray1955[i_22_][i_24_] = -1;
						}
					}
				}
				if (this.anInt1868 == 0) {
					this.anInt1933 = class38_sub23.readUnsignedShort();
					this.aBool1853 = class38_sub23.readUnsignedByte() == 1;
				}
				if (this.anInt1868 == 1) {
					class38_sub23.readUnsignedShort();
					class38_sub23.readUnsignedByte();
				}
				if (this.anInt1868 == 2) {
					this.anIntArray1866 = new int[this.anInt1923 * this.anInt1886];
					this.anIntArray1947 = new int[this.anInt1886 * this.anInt1923];
					int i_25_ = class38_sub23.readUnsignedByte();
					if (i_25_ == 1)
						this.anInt1881 |= 0x10000000;
					int i_26_ = class38_sub23.readUnsignedByte();
					if (i_26_ == 1)
						this.anInt1881 |= 0x40000000;
					int i_27_ = class38_sub23.readUnsignedByte();
					if (i_27_ == 1)
						this.anInt1881 |= ~0x7fffffff;
					int i_28_ = class38_sub23.readUnsignedByte();
					if (i_28_ == 1)
						this.anInt1881 |= 0x20000000;
					this.anInt1931 = class38_sub23.readUnsignedByte();
					this.anInt1897 = class38_sub23.readUnsignedByte();
					this.anIntArray1858 = new int[20];
					this.anIntArray1922 = new int[20];
					this.anIntArray1874 = new int[20];
					for (int i_29_ = 0; i_29_ < 20; i_29_++) {
						int i_30_ = class38_sub23.readUnsignedByte();
						if (i_30_ != 1)
							this.anIntArray1874[i_29_] = -1;
						else {
							this.anIntArray1922[i_29_] = class38_sub23.method772(false);
							this.anIntArray1858[i_29_] = class38_sub23.method772(false);
							this.anIntArray1874[i_29_] = class38_sub23.readInt(true);
						}
					}
					this.aClass19Array1869 = new RSString[5];
					for (int i_31_ = 0; i_31_ < 5; i_31_++) {
						RSString class19 = class38_sub23.getUShort(1347418632);
						if (class19.method143((byte) 118) > 0) {
							this.aClass19Array1869[i_31_] = class19;
							this.anInt1881 |= 1 << i_31_ + 23;
						}
					}
				}
				if (this.anInt1868 == 3)
					this.aBool1916 = class38_sub23.readUnsignedByte() == 1;
				if (this.anInt1868 == 4 || this.anInt1868 == 1) {
					this.anInt1954 = class38_sub23.readUnsignedByte();
					this.anInt1912 = class38_sub23.readUnsignedByte();
					this.anInt1951 = class38_sub23.readUnsignedByte();
					this.anInt1920 = class38_sub23.readUnsignedShort();
					if (this.anInt1920 == 65535)
						this.anInt1920 = -1;
					this.aBool1969 = class38_sub23.readUnsignedByte() == 1;
				}
				if (this.anInt1868 == 4) {
					this.aClass19_1876 = class38_sub23.getUShort(1347418632);
					this.aClass19_1887 = class38_sub23.getUShort(1347418632);
				}
				if (this.anInt1868 == 1 || this.anInt1868 == 3 || this.anInt1868 == 4)
					this.anInt1889 = class38_sub23.readInt(true);
				if (this.anInt1868 == 3 || this.anInt1868 == 4) {
					this.anInt1982 = class38_sub23.readInt(true);
					this.anInt1943 = class38_sub23.readInt(true);
					this.anInt1896 = class38_sub23.readInt(true);
				}
				if (i < 88)
					this.anObjectArray1965 = null;
				if (this.anInt1868 == 5) {
					this.anInt1932 = class38_sub23.readInt(true);
					this.anInt1957 = class38_sub23.readInt(true);
				}
				if (this.anInt1868 == 6) {
					this.anInt1883 = 1;
					this.anInt1962 = class38_sub23.readUnsignedShort();
					anInt1911 = 1;
					if (this.anInt1962 == 65535)
						this.anInt1962 = -1;
					anInt1924 = class38_sub23.readUnsignedShort();
					if (anInt1924 == 65535)
						anInt1924 = -1;
					this.anInt1878 = class38_sub23.readUnsignedShort();
					if (this.anInt1878 == 65535)
						this.anInt1878 = -1;
					this.anInt1900 = class38_sub23.readUnsignedShort();
					if (this.anInt1900 == 65535)
						this.anInt1900 = -1;
					this.anInt1921 = class38_sub23.readUnsignedShort();
					this.anInt1925 = class38_sub23.readUnsignedShort();
					this.anInt1987 = class38_sub23.readUnsignedShort();
				}
				if (this.anInt1868 == 7) {
					this.anIntArray1947 = new int[this.anInt1886 * this.anInt1923];
					this.anIntArray1866 = new int[this.anInt1886 * this.anInt1923];
					this.anInt1954 = class38_sub23.readUnsignedByte();
					this.anInt1920 = class38_sub23.readUnsignedShort();
					if (this.anInt1920 == 65535)
						this.anInt1920 = -1;
					this.aBool1969 = class38_sub23.readUnsignedByte() == 1;
					this.anInt1889 = class38_sub23.readInt(true);
					this.anInt1931 = class38_sub23.method772(false);
					this.anInt1897 = class38_sub23.method772(false);
					int i_32_ = class38_sub23.readUnsignedByte();
					this.aClass19Array1869 = new RSString[5];
					if (i_32_ == 1)
						this.anInt1881 |= 0x40000000;
					for (int i_33_ = 0; i_33_ < 5; i_33_++) {
						RSString class19 = class38_sub23.getUShort(1347418632);
						if (class19.method143((byte) 16) > 0) {
							this.aClass19Array1869[i_33_] = class19;
							this.anInt1881 |= 1 << i_33_ + 23;
						}
					}
				}
				if (this.anInt1868 == 8)
					this.aClass19_1876 = class38_sub23.getUShort(1347418632);
				if (this.anInt1903 == 2 || this.anInt1868 == 2) {
					this.aClass19_1938 = class38_sub23.getUShort(1347418632);
					this.aClass19_1946 = class38_sub23.getUShort(1347418632);
					int i_34_ = class38_sub23.readUnsignedShort() & 0x3f;
					this.anInt1881 |= i_34_ << 1056473867;
				}
				if (this.anInt1903 == 1 || this.anInt1903 == 4 || this.anInt1903 == 5 || this.anInt1903 == 6) {
					this.aClass19_1904 = class38_sub23.getUShort(1347418632);
					if (this.aClass19_1904.method143((byte) 36) == 0) {
						if (this.anInt1903 == 1)
							this.aClass19_1904 = ObjectDefinition.aClass19_2449;
						if (this.anInt1903 == 4)
							this.aClass19_1904 = Class38_Sub20_Sub15.aClass19_3077;
						if (this.anInt1903 == 5)
							this.aClass19_1904 = Class38_Sub20_Sub15.aClass19_3077;
						if (this.anInt1903 == 6)
							this.aClass19_1904 = Class23.aClass19_544;
					}
				}
				if (this.anInt1903 == 1 || this.anInt1903 == 4 || this.anInt1903 == 5)
					this.anInt1881 |= 0x400000;
				if (this.anInt1903 != 6)
					break;
				this.anInt1881 |= 0x1;
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "f.K(" + (class38_sub23 != null ? "{...}" : "null") + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method644(int i, boolean bool, int i_35_) {
		try {
			int i_36_ = this.anIntArray1947[i_35_];
			this.anIntArray1947[i_35_] = this.anIntArray1947[i];
			this.anIntArray1947[i] = i_36_;
			i_36_ = this.anIntArray1866[i_35_];
			this.anIntArray1866[i_35_] = this.anIntArray1866[i];
			if (bool != true)
				this.anInt1920 = -38;
			this.anIntArray1866[i] = i_36_;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.N(" + i + ',' + bool + ',' + i_35_ + ')');
		}
	}

	private final Object[] method645(int i, RS2Buffer class38_sub23) {
		try {
			int i_37_ = class38_sub23.readUnsignedByte();
			if (i < 79)
				return null;
			if (i_37_ == 0)
				return null;
			Object[] objects = new Object[i_37_];
			for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
				int i_39_ = class38_sub23.readUnsignedByte();
				if (i_39_ != 0) {
					if (i_39_ == 1)
						objects[i_38_] = class38_sub23.getUShort(1347418632);
				} else
					objects[i_38_] = new Integer(class38_sub23.readInt(true));
			}
			this.aBool1960 = true;
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.I(" + i + ',' + (class38_sub23 != null ? "{...}" : "null") + ')');
		}
	}

	final void decodeWidget(RS2Buffer class38_sub23, int i) {
		try {
			class38_sub23.readUnsignedByte();
			this.aBool1961 = true;
			this.anInt1868 = class38_sub23.readUnsignedByte();
			this.anInt1958 = class38_sub23.readUnsignedShort();
			this.anInt1910 = this.anInt1942 = class38_sub23.method772(false);
			this.anInt1882 = this.anInt1968 = class38_sub23.method772(false);
			this.anInt1923 = class38_sub23.readUnsignedShort();
			if (this.anInt1868 == 9)
				this.anInt1886 = class38_sub23.method772(false);
			else
				this.anInt1886 = class38_sub23.readUnsignedShort();
			this.anInt1977 = class38_sub23.readUnsignedShort();
			if (this.anInt1977 == 65535)
				this.anInt1977 = -1;
			else
				this.anInt1977 = (this.anInt1856 & ~0xffff) + this.anInt1977;
			this.aBool1853 = class38_sub23.readUnsignedByte() == 1;
			if (this.anInt1868 == 0) {
				this.anInt1973 = class38_sub23.readUnsignedShort();
				this.anInt1933 = class38_sub23.readUnsignedShort();
			}
			if (this.anInt1868 == 5) {
				this.anInt1932 = class38_sub23.readInt(true);
				this.anInt1890 = class38_sub23.readUnsignedShort();
				this.aBool1861 = class38_sub23.readUnsignedByte() == 1;
				this.anInt1974 = class38_sub23.readUnsignedByte();
				this.anInt1909 = class38_sub23.readUnsignedByte();
				this.anInt1930 = class38_sub23.readInt(true);
				this.aBool1927 = class38_sub23.readUnsignedByte() == 1;
				this.aBool1885 = class38_sub23.readUnsignedByte() == 1;
			}
			if (this.anInt1868 == 6) {
				this.anInt1883 = 1;
				this.anInt1962 = class38_sub23.readUnsignedShort();
				if (this.anInt1962 == 65535)
					this.anInt1962 = -1;
				this.anInt1929 = class38_sub23.method772(false);
				this.anInt1964 = class38_sub23.method772(false);
				this.anInt1925 = class38_sub23.readUnsignedShort();
				this.anInt1987 = class38_sub23.readUnsignedShort();
				this.anInt1863 = class38_sub23.readUnsignedShort();
				this.anInt1921 = class38_sub23.readUnsignedShort();
				this.anInt1878 = class38_sub23.readUnsignedShort();
				if (this.anInt1878 == 65535)
					this.anInt1878 = -1;
				this.aBool1966 = class38_sub23.readUnsignedByte() == 1;
			}
			if (this.anInt1868 == 4) {
				this.anInt1920 = class38_sub23.readUnsignedShort();
				if (this.anInt1920 == 65535)
					this.anInt1920 = -1;
				this.aClass19_1876 = class38_sub23.getUShort(i + 1347484168);
				this.anInt1951 = class38_sub23.readUnsignedByte();
				this.anInt1954 = class38_sub23.readUnsignedByte();
				this.anInt1912 = class38_sub23.readUnsignedByte();
				this.aBool1969 = class38_sub23.readUnsignedByte() == 1;
				this.anInt1889 = class38_sub23.readInt(true);
			}
			if (this.anInt1868 == 3) {
				this.anInt1889 = class38_sub23.readInt(true);
				this.aBool1916 = class38_sub23.readUnsignedByte() == 1;
				this.anInt1974 = class38_sub23.readUnsignedByte();
			}
			if (this.anInt1868 == 9) {
				this.anInt1901 = class38_sub23.readUnsignedByte();
				this.anInt1889 = class38_sub23.readInt(true);
			}
			this.anInt1881 = class38_sub23.method738((byte) 127);
			this.aClass19_1926 = class38_sub23.getUShort(1347418632);
			int i_40_ = class38_sub23.readUnsignedByte();
			if (i_40_ > 0) {
				this.aClass19Array1851 = new RSString[i_40_];
				for (int i_41_ = 0; i_41_ < i_40_; i_41_++)
					this.aClass19Array1851[i_41_] = class38_sub23.getUShort(1347418632);
			}
			this.anInt1873 = class38_sub23.readUnsignedByte();
			this.anInt1859 = class38_sub23.readUnsignedByte();
			this.aBool1975 = class38_sub23.readUnsignedByte() == 1;
			this.aClass19_1938 = class38_sub23.getUShort(1347418632);
			this.anObjectArray1980 = method645(i + 65625, class38_sub23);
			this.anObjectArray1963 = method645(121, class38_sub23);
			this.anObjectArray1888 = method645(100, class38_sub23);
			this.anObjectArray1915 = method645(93, class38_sub23);
			this.anObjectArray1950 = method645(i ^ ~0xff88, class38_sub23);
			this.anObjectArray1913 = method645(81, class38_sub23);
			this.anObjectArray1864 = method645(i + 65653, class38_sub23);
			this.anObjectArray1884 = method645(123, class38_sub23);
			this.anObjectArray1879 = method645(96, class38_sub23);
			this.anObjectArray1907 = method645(115, class38_sub23);
			this.anObjectArray1949 = method645(i + 65633, class38_sub23);
			this.anObjectArray1978 = method645(106, class38_sub23);
			this.anObjectArray1959 = method645(102, class38_sub23);
			this.anObjectArray1948 = method645(82, class38_sub23);
			this.anObjectArray1892 = method645(124, class38_sub23);
			this.anObjectArray1965 = method645(83, class38_sub23);
			this.anObjectArray1984 = method645(i + 65637, class38_sub23);
			this.anObjectArray1979 = method645(117, class38_sub23);
			this.anIntArray1934 = method635(class38_sub23, 16369);
			this.anIntArray1860 = method635(class38_sub23, 16369);
			this.anIntArray1988 = method635(class38_sub23, 16369);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.G(" + (class38_sub23 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final Class38_Sub20_Sub9_Sub3 method647(int i, Class17 class17, int i_42_, int i_43_) {
		try {
			if (!Class22.method197(i_42_, class17, i_43_ ^ 0x125c4f87, i))
				return null;
			if (i_43_ != -1)
				return null;
			return Class73_Sub2.method718((byte) -120);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "f.B(" + i + ',' + (class17 != null ? "{...}" : "null") + ',' + i_42_ + ',' + i_43_ + ')');
		}
	}

	public WidgetComponent() {
		this.anInt1859 = 0;
		this.anInt1856 = -1;
		this.aBool1861 = false;
		this.aClass19_1876 = Projectile.aClass19_3400;
		this.anInt1850 = 0;
		this.anInt1883 = 1;
		this.anInt1903 = 0;
		this.anInt1910 = 0;
		this.anInt1882 = 0;
		this.anInt1912 = 0;
		this.aBool1916 = false;
		this.anInt1896 = 0;
		this.anInt1881 = 0;
		this.anInt1897 = 0;
		this.anInt1909 = 0;
		this.anInt1873 = 0;
		this.anInt1931 = 0;
		this.anInt1930 = 0;
		this.anInt1936 = -1;
		this.aClass19_1887 = Projectile.aClass19_3400;
		this.anInt1905 = 0;
		this.anInt1890 = 0;
		this.aClass19_1904 = ObjectDefinition.aClass19_2449;
		this.anInt1889 = 0;
		this.anInt1862 = 0;
		anInt1911 = 1;
		this.anInt1942 = 0;
		this.aClass38_Sub6_1937 = null;
		this.anInt1878 = -1;
		this.anInt1951 = 0;
		this.anInt1953 = -1;
		this.aBool1961 = false;
		this.anInt1875 = 0;
		this.anInt1921 = 100;
		this.aClass19_1938 = Projectile.aClass19_3400;
		this.anInt1923 = 0;
		this.anInt1952 = 0;
		this.anInt1943 = 0;
		this.anInt1901 = 1;
		this.aClass19_1926 = Projectile.aClass19_3400;
		anInt1924 = -1;
		this.anInt1932 = -1;
		this.anInt1954 = 0;
		this.anInt1925 = 0;
		this.aClass19_1946 = Projectile.aClass19_3400;
		this.anInt1962 = -1;
		this.anInt1941 = -1;
		this.anInt1917 = -1;
		this.anInt1957 = -1;
		this.anInt1928 = 0;
		this.anInt1964 = 0;
		this.aBool1944 = false;
		this.anInt1956 = 0;
		this.aBool1960 = false;
		this.aBool1969 = false;
		this.anInt1865 = -1;
		this.anInt1973 = 0;
		this.anInt1958 = 0;
		this.aBool1975 = false;
		this.anInt1929 = 0;
		this.anInt1977 = -1;
		this.anInt1985 = 0;
		this.anInt1920 = -1;
		this.anInt1900 = -1;
		this.anInt1974 = 0;
		this.aBool1919 = false;
		this.anInt1899 = 0;
		this.anInt1986 = -1;
		this.anInt1987 = 0;
		this.anInt1982 = 0;
		this.aBool1966 = false;
		this.anInt1968 = 0;
		this.anInt1933 = 0;
		this.aBool1853 = false;
	}

	static {
		WidgetComponent.aClass19_1939 = RSString.createRSString("Please reload this page)3");
		WidgetComponent.aClass19_1970 = WidgetComponent.aClass19_1939;
	}
}
