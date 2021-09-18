/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.awt.*;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class56 implements Runnable {
	public static Method aMethod1236;
	public static String aString1241;
	public static String aString1248;
	public static int anInt1249 = 3;
	public static Method aMethod1250;
	private static String aString1240;
	private final Thread aThread1237;
	public Class63 aClass63_1238;
	public Class63[] aClass63Array1239;
	public Applet anApplet1242;
	public EventQueue anEventQueue1243;
	public Class63 aClass63_1244;
	public File aFile1251;
	public Class63 aClass63_1252;
	private Class65 aClass65_1234;
	private boolean aBool1235 = false;
	private Interface1 anInterface1_1245;
	private Class65 aClass65_1246;
	private File aFile1247;

	public Class56(boolean bool, Applet applet, int i, String string, int i_20_) {
		aClass65_1234 = null;
		aClass65_1246 = null;
		anApplet1242 = null;
		aClass63_1244 = null;
		aFile1247 = null;
		aFile1251 = null;
		aClass63_1238 = null;
		aClass63_1252 = null;
		anApplet1242 = applet;
		Class56.aString1248 = "Unknown";
		Class56.aString1241 = "1.1";
		try {
			Class56.aString1248 = System.getProperty("java.vendor");
			Class56.aString1241 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			Class56.aString1240 = System.getProperty("user.home");
			if (Class56.aString1240 != null)
				Class56.aString1240 += "/";
		} catch (Exception exception) {
			/* empty */
		}
		if (Class56.aString1240 == null)
			Class56.aString1240 = "~/";
		try {
			anEventQueue1243 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			if (applet != null)
				Class56.aMethod1236 = applet.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			else
				Class56.aMethod1236 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (applet == null)
				Class56.aMethod1250 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			else
				Class56.aMethod1250 = applet.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
		} catch (Exception exception) {
			/* empty */
		}
		if (bool)
			method429(i, string, -127, i_20_);
		aBool1235 = false;
		aThread1237 = new Thread(this);
		aThread1237.setPriority(10);
		aThread1237.setDaemon(true);
		aThread1237.start();
	}

	public final Class65 method428(boolean bool, Class var_class, String string) {
		if (bool != true)
			return null;
		return method437(2, 0, 0, new Object[] { var_class, string }, 9);
	}

	private final void method429(int i, String string, int i_0_, int i_1_) {
		if (i < 32 || i > 34)
			i = 32;
		String[] strings = { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class56.aString1240, "/tmp/", "" };
		String[] strings_2_ = { ".jagex_cache_" + i, ".file_store_" + i };
		for (int i_3_ = 0; i_3_ < 2; i_3_++)
			for (int i_4_ = 0; strings_2_.length > i_4_; i_4_++)
				for (int i_5_ = 0; strings.length > i_5_; i_5_++) {
					try {
						String string_6_ = strings[i_5_];
						if (string_6_.length() > 0 && !new File(string_6_).exists())
							continue;
						File file = new File(string_6_ + strings_2_[i_4_]);
						if (i_3_ == 1 && !file.exists()) {
							boolean bool = file.mkdir();
							if (!bool)
								continue;
						}
						if (aClass63_1252 == null)
							try {
								File file_7_ = new File(file, "random.dat");
								if (i_3_ == 1 || file_7_.exists())
									aClass63_1252 = new Class63(file_7_, "rw", 25L);
							} catch (Exception exception) {
								aClass63_1252 = null;
							}
						if (aFile1247 == null)
							try {
								file = new File(file, string);
								if (i_3_ == 1 && !file.exists()) {
									boolean bool = file.mkdir();
									if (!bool)
										continue;
								}
								File file_8_ = new File(file, "main_file_cache.dat2");
								if (i_3_ == 0 && !file_8_.exists())
									continue;
								aClass63_1238 = new Class63(file_8_, "rw", 52428800L);
								aClass63Array1239 = new Class63[i_1_];
								for (int i_9_ = 0; i_9_ < i_1_; i_9_++)
									aClass63Array1239[i_9_] = new Class63(new File(file, "main_file_cache.idx" + i_9_), "rw", 1048576L);
								aClass63_1244 = new Class63(new File(file, "main_file_cache.idx255"), "rw", 1048576L);
								aFile1251 = aFile1247 = file;
							} catch (Exception exception) {
								try {
									aClass63_1238.method471(0);
									for (int i_10_ = 0; i_1_ > i_10_; i_10_++)
										aClass63Array1239[i_10_].method471(0);
									aClass63_1244.method471(0);
								} catch (Exception exception_11_) {
									/* empty */
								}
								aClass63Array1239 = null;
								aClass63_1238 = aClass63_1244 = null;
								aFile1251 = aFile1247 = null;
							}
					} catch (Exception exception) {
						/* empty */
					}
					if (aClass63_1252 != null && aFile1247 != null)
						return;
				}
		int i_12_ = -39 % ((i_0_ + 53) / 53);
		if (aFile1247 == null)
			throw new RuntimeException();
	}

	public final Class65 method430(int i, Runnable runnable, int i_13_) {
		if (i_13_ <= 101)
			return null;
		return method437(2, i, 0, runnable, 2);
	}

	public final void method431(int i) {
		synchronized (this) {
			aBool1235 = true;
			notifyAll();
		}
		if (i == 4) {
			try {
				aThread1237.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			if (aClass63_1238 != null)
				try {
					aClass63_1238.method471(0);
				} catch (java.io.IOException ioexception) {
					/* empty */
				}
			if (aClass63_1244 != null)
				try {
					aClass63_1244.method471(0);
				} catch (java.io.IOException ioexception) {
					/* empty */
				}
			if (aClass63Array1239 != null)
				for (int i_14_ = 0; i_14_ < aClass63Array1239.length; i_14_++)
					if (aClass63Array1239[i_14_] != null)
						try {
							aClass63Array1239[i_14_].method471(0);
						} catch (java.io.IOException ioexception) {
							/* empty */
						}
			if (aClass63_1252 != null)
				try {
					aClass63_1252.method471(0);
				} catch (java.io.IOException ioexception) {
					/* empty */
				}
		}
	}

	@Override
	public final void run() {
		for (;;) {
			Class65 class65;
			synchronized (this) {
				for (;;) {
					if (aBool1235)
						return;
					if (aClass65_1234 != null) {
						class65 = aClass65_1234;
						aClass65_1234 = aClass65_1234.aClass65_1367;
						if (aClass65_1234 == null)
							aClass65_1246 = null;
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				int i = class65.anInt1369;
				if (i != 1) {
					if (i == 2) {
						Thread thread = new Thread((Runnable) class65.anObject1370);
						thread.setDaemon(true);
						thread.start();
						thread.setPriority(class65.anInt1366);
						class65.anObject1365 = thread;
					} else if (i != 4) {
						if (i == 8) {
							Object[] objects = (Object[]) class65.anObject1370;
							class65.anObject1365 = ((Class) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]);
						} else {
							if (i != 9)
								throw new Exception();
							Object[] objects = (Object[]) class65.anObject1370;
							class65.anObject1365 = ((Class) objects[0]).getDeclaredField((String) objects[1]);
						}
					} else
						class65.anObject1365 = new DataInputStream(((URL) class65.anObject1370).openStream());
				} else
					class65.anObject1365 = new Socket(InetAddress.getByName((String) class65.anObject1370), class65.anInt1366);
				class65.anInt1368 = 1;
			} catch (Throwable throwable) {
				class65.anInt1368 = 2;
			}
		}
	}

	public final Interface1 method432(int i) {
		if (i != -945)
			method436(null, 76, -63);
		return anInterface1_1245;
	}

	public final Class65 method433(byte i, URL url) {
		if (i != 45)
			method430(85, null, -79);
		return method437(2, 0, 0, url, 4);
	}

	public final Class65 method434(Class[] var_classes, String string, int i, Class var_class) {
		if (i != 8)
			return null;
		return method437(i - 6, 0, 0, new Object[] { var_class, string, var_classes }, 8);
	}

	public final Class65 method435(int i, int i_15_) {
		if (i_15_ >= -114)
			Class56.aString1248 = null;
		return method437(2, i, 0, null, 3);
	}

	public final Class65 method436(String string, int i, int i_16_) {
		if (i_16_ != 2)
			anEventQueue1243 = null;
		return method437(i_16_, i, 0, string, 1);
	}

	private final Class65 method437(int i, int i_17_, int i_18_, Object object, int i_19_) {
		if (i != 2)
			method435(126, 57);
		Class65 class65 = new Class65();
		class65.anInt1369 = i_19_;
		class65.anObject1370 = object;
		class65.anInt1366 = i_17_;
		synchronized (this) {
			if (aClass65_1246 != null) {
				aClass65_1246.aClass65_1367 = class65;
				aClass65_1246 = class65;
			} else
				aClass65_1246 = aClass65_1234 = class65;
			notify();
		}
		return class65;
	}
}
