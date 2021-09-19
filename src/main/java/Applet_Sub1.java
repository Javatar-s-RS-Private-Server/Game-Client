/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
	private boolean aBool3606 = false;
	static RSString aClass19_3610 = RSString.createRSString("Geben Sie Ihren Benutzernamen");
	static RSString aClass19_3625 = RSString.createRSString("title)3jpg");
	static int anInt3627 = 0;
	static Class83 aClass83_3633 = new Class83(64);
	static RSString aClass19_3635;
	static volatile int anInt3636;
	private static RSString aClass19_3638;
	static Class17_Sub1 aClass17_Sub1_3639;

	@Override
	public final void windowIconified(WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final void focusLost(FocusEvent focusevent) {
		try {
			Class21.aBool508 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.focusLost(" + (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public final void windowOpened(WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final String getParameter(String string) {
		try {
			if (Client.clientFrame != null)
				return null;
			if (Class38_Sub4.aClass56_1798 != null && this != Class38_Sub4.aClass56_1798.anApplet1242)
				return Class38_Sub4.aClass56_1798.anApplet1242.getParameter(string);
			return super.getParameter(string);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.getParameter(" + (string != null ? "{...}" : "null") + ')');
		}
	}

	abstract void method1209(int i);

	@Override
	public final void start() {
		try {
			if (this == ItemDefinition.anApplet_Sub1_2765 && !ItemDefinition.aBool2768)
				ObjectDefinition.aLong2495 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.start(" + ')');
		}
	}

	@Override
	public final void windowActivated(WindowEvent windowevent) {
		/* empty */
	}

	final boolean method1210(int i) {
		try {
			String string = getDocumentBase().getHost().toLowerCase();
			if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
				return true;
			if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
				return true;
			if (string.endsWith("127.0.0.1"))
				return true;
			for (/**/; string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'; string = string.substring(0, string.length() - 1)) {
				/* empty */
			}
			if (i != 30360)
				Applet_Sub1.aClass19_3610 = null;
			if (string.endsWith("192.168.1."))
				return true;
			method1224((byte) 53, "invalidhost");
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.C(" + i + ')');
		}
	}

	@Override
	public final URL getCodeBase() {
		if (Client.clientFrame != null)
			return null;
		if (Class38_Sub4.aClass56_1798 != null && Class38_Sub4.aClass56_1798.anApplet1242 != this)
			return Class38_Sub4.aClass56_1798.anApplet1242.getCodeBase();
		return super.getCodeBase();
	}

	abstract void method1211(byte i);

	@Override
	public final void windowClosed(WindowEvent windowevent) {
		/* empty */
	}

	final void method1212(int i, int i_0_, int i_1_, String string, int i_2_, int i_3_, int i_4_) {
		try {
			try {
				ItemDefinition.anApplet_Sub1_2765 = this;
				Class20.anInt501 = i_3_;
				Class74.anInt1468 = i_1_;
				Class38_Sub8.anInt2050 = i_2_;
				Client.clientFrame = new Frame();
				Client.clientFrame.setTitle("Jagex");
				Client.clientFrame.setResizable(false);
				Client.clientFrame.addWindowListener(this);
				Client.clientFrame.setVisible(true);
				Client.clientFrame.toFront();
				Insets insets = Client.clientFrame.getInsets();
				Client.clientFrame.setSize(insets.right + insets.left + i_2_, insets.bottom + i_3_ + insets.top);
				Class23.aClass56_552 = Class38_Sub4.aClass56_1798 = new Class56(true, null, i_4_, string, i);
				Class38_Sub4.aClass56_1798.method430(i_0_, this, i_0_ ^ 0x67);
			} catch (Exception exception) {
				Class38_Sub20_Sub2.method813(exception, null, 95);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.D(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (string != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')');
		}
	}

	private static final Class73 method1213(byte i) {
		try {
			if (i < 119)
				return null;
			try {
				return (Class73) Class.forName("pd").newInstance();
			} catch (Throwable throwable) {
				return new Class73_Sub2();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.L(" + i + ')');
		}
	}

	abstract void method1214(int i);

	@Override
	public final AppletContext getAppletContext() {
		try {
			if (Client.clientFrame != null)
				return null;
			if (Class38_Sub4.aClass56_1798 != null && Class38_Sub4.aClass56_1798.anApplet1242 != this)
				return Class38_Sub4.aClass56_1798.anApplet1242.getAppletContext();
			return super.getAppletContext();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.getAppletContext(" + ')');
		}
	}

	@Override
	public final void windowDeactivated(WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final void stop() {
		try {
			if (this == ItemDefinition.anApplet_Sub1_2765 && !ItemDefinition.aBool2768)
				ObjectDefinition.aLong2495 = Class9.method48((byte) -88) + 4000L;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.stop(" + ')');
		}
	}

	private final synchronized void method1215(int i) {
		try {
			if (!ItemDefinition.aBool2768) {
				ItemDefinition.aBool2768 = true;
				try {
					Class38_Sub3.aCanvas1783.removeFocusListener(this);
				} catch (Exception exception) {
					/* empty */
				}
				try {
					method1217(false);
					if (i != 25302)
						windowClosed(null);
				} catch (Exception exception) {
					/* empty */
				}
				if (Client.clientFrame != null)
					try {
						System.exit(0);
					} catch (Throwable throwable) {
						/* empty */
					}
				if (Class38_Sub4.aClass56_1798 != null)
					try {
						Class38_Sub4.aClass56_1798.method431(i - 25298);
					} catch (Exception exception) {
						/* empty */
					}
				method1214(5);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.I(" + i + ')');
		}
	}

	@Override
	public final void windowDeiconified(WindowEvent windowevent) {
		/* empty */
	}

	private final void method1216(byte i) {
		try {
			long l = Class9.method48((byte) -119);
			long l_5_ = Class42.aLongArray954[Node.anInt895];
			if (i >= -55)
				windowActivated(null);
			if (l_5_ != 0L && l_5_ < l) {
				/* empty */
			}
			Class42.aLongArray954[Node.anInt895] = l;
			Node.anInt895 = Node.anInt895 + 1 & 0x1f;
			synchronized (this) {
				Client.awtFocused = Class21.aBool508;
			}
			method1209(1000);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.H(" + i + ')');
		}
	}

	abstract void method1217(boolean bool);

	@Override
	public final void focusGained(FocusEvent focusevent) {
		try {
			Class21.aBool508 = true;
			Class33.aBool781 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.focusGained(" + (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	static final void method1218(byte i) {
		try {
			if (i >= -54)
				Client.errorPinging = false;
			for (Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method82((byte) 91); class38_sub8 != null; class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method78(-118)) {
				int i_6_ = class38_sub8.anInt2038;
				if (Class22.method196(i_6_, -18020)) {
					boolean bool = true;
					Class38_Sub6[] class38_sub6s = Class62.aClass38_Sub6ArrayArray1339[i_6_];
					for (int i_7_ = 0; class38_sub6s.length > i_7_; i_7_++)
						if (class38_sub6s[i_7_] != null) {
							bool = class38_sub6s[i_7_].aBool1961;
							break;
						}
					if (!bool) {
						int i_8_ = (int) ((Node) class38_sub8).aLong898;
						Class38_Sub6 class38_sub6 = Projectile.method1167(i_8_, 86);
						if (class38_sub6 != null)
							Class40.method340(class38_sub6, (byte) -124);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.G(" + i + ')');
		}
	}

	@Override
	public final synchronized void paint(Graphics graphics) {
		do {
			try {
				if (ItemDefinition.anApplet_Sub1_2765 == this && !ItemDefinition.aBool2768) {
					Class33.aBool781 = true;
					if (Class56.aString1241 == null || !Class56.aString1241.startsWith("1.5") || Class9.method48((byte) -47) + -Class83.aLong1653 <= 1000L)
						break;
					Rectangle rectangle = graphics.getClipBounds();
					if (rectangle == null || rectangle.width >= Class38_Sub8.anInt2050 && Class20.anInt501 <= rectangle.height)
						Class15.aBool283 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class38_Sub1.method607(runtimeexception, "lf.paint(" + (graphics != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	public static final void providesignlink(Class56 class56) {
		try {
			Class23.aClass56_552 = Class38_Sub4.aClass56_1798 = class56;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.providesignlink(" + (class56 != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public final void run() {
		try {
			try {
				if (Class56.aString1248 != null) {
					String string = Class56.aString1248.toLowerCase();
					if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
						String string_9_ = Class56.aString1241;
						if (string_9_.equals("1.1") || string_9_.startsWith("1.1.") || string_9_.equals("1.2") || string_9_.startsWith("1.2.")) {
							method1224((byte) 53, "wrongjava");
							return;
						}
						Class51.anInt1121 = 5;
					} else if (string.indexOf("ibm") != -1 && (Class56.aString1241 == null || Class56.aString1241.equals("1.4.2"))) {
						method1224((byte) 53, "wrongjava");
						return;
					}
				}
				if (Class38_Sub4.aClass56_1798.anApplet1242 != null) {
					Method method = Class56.aMethod1250;
					if (method != null)
						try {
							method.invoke(Class38_Sub4.aClass56_1798.anApplet1242, new Object[] { Boolean.TRUE });
						} catch (Throwable throwable) {
							/* empty */
						}
				}
				method1219(-29492);
				Class38_Sub2.aClass2_1768 = Class40.method343(Class20.anInt501, Class38_Sub8.anInt2050, Class38_Sub3.aCanvas1783, 44);
				method1211((byte) 85);
				Class25.aClass73_579 = Applet_Sub1.method1213((byte) 121);
				while (ObjectDefinition.aLong2495 == 0L || Class9.method48((byte) -126) < ObjectDefinition.aLong2495) {
					Class11.anInt202 = Class25.aClass73_579.method519(Sequence.anInt2741, 1, Class51.anInt1121);
					for (int i = 0; Class11.anInt202 > i; i++)
						method1216((byte) -77);
					method1220(0);
					Class37.method327(Class38_Sub3.aCanvas1783, Class38_Sub4.aClass56_1798, 1);
				}
			} catch (Exception exception) {
				Class38_Sub20_Sub2.method813(exception, null, 95);
				method1224((byte) 53, "crash");
			}
			method1215(25302);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.run(" + ')');
		}
	}

	final synchronized void method1219(int i) {
		try {
			Container container;
			if (Client.clientFrame == null)
				container = Class38_Sub4.aClass56_1798.anApplet1242;
			else
				container = Client.clientFrame;
			if (i != -29492)
				Applet_Sub1.method1222(true);
			if (Class38_Sub3.aCanvas1783 != null) {
				Class38_Sub3.aCanvas1783.removeFocusListener(this);
				container.remove(Class38_Sub3.aCanvas1783);
			}
			Class38_Sub3.aCanvas1783 = new Canvas_Sub1(this);
			container.add(Class38_Sub3.aCanvas1783);
			Class38_Sub3.aCanvas1783.setSize(Class38_Sub8.anInt2050, Class20.anInt501);
			Class38_Sub3.aCanvas1783.setVisible(true);
			if (Client.clientFrame != null) {
				Insets insets = Client.clientFrame.getInsets();
				Class38_Sub3.aCanvas1783.setLocation(insets.left, insets.top);
			} else
				Class38_Sub3.aCanvas1783.setLocation(0, 0);
			Class38_Sub3.aCanvas1783.addFocusListener(this);
			Class38_Sub3.aCanvas1783.requestFocus();
			Class33.aBool781 = true;
			Class15.aBool283 = false;
			Class83.aLong1653 = Class9.method48((byte) -111);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.P(" + i + ')');
		}
	}

	private final void method1220(int i) {
		try {
			long l = Class9.method48((byte) -62);
			if (i != 0)
				Applet_Sub1.aClass17_Sub1_3639 = null;
			long l_10_ = Class17_Sub1.aLongArray1704[NPC.anInt3559];
			Class17_Sub1.aLongArray1704[NPC.anInt3559] = l;
			NPC.anInt3559 = NPC.anInt3559 + 1 & 0x1f;
			if (l_10_ != 0L && l_10_ < l) {
				int i_11_ = (int) (l - l_10_);
				Class38_Sub1.anInt1748 = (32000 + (i_11_ >> -1653947167)) / i_11_;
			}
			if (Class75.anInt1476++ > 50) {
				Class33.aBool781 = true;
				Class75.anInt1476 -= 50;
				Class38_Sub3.aCanvas1783.setSize(Class38_Sub8.anInt2050, Class20.anInt501);
				Class38_Sub3.aCanvas1783.setVisible(true);
				if (Client.clientFrame == null)
					Class38_Sub3.aCanvas1783.setLocation(0, 0);
				else {
					Insets insets = Client.clientFrame.getInsets();
					Class38_Sub3.aCanvas1783.setLocation(insets.left, insets.top);
				}
			}
			method1223(2);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.N(" + i + ')');
		}
	}

	final void method1221(int i, int i_12_, int i_13_, int i_14_, int i_15_) {
		try {
			try {
				if (i == 0)
					if (ItemDefinition.anApplet_Sub1_2765 != null) {
						Class15.anInt301++;
						if (Class15.anInt301 >= 3)
							method1224((byte) 53, "alreadyloaded");
						else
							getAppletContext().showDocument(getDocumentBase(), "_self");
					} else {
						ItemDefinition.anApplet_Sub1_2765 = this;
						Class38_Sub8.anInt2050 = i_13_;
						Class20.anInt501 = i_14_;
						Class74.anInt1468 = i_15_;
						if (Class38_Sub4.aClass56_1798 == null)
							Class23.aClass56_552 = Class38_Sub4.aClass56_1798 = new Class56(false, this, i_12_, null, 0);
						Class38_Sub4.aClass56_1798.method430(1, this, i + 109);
					}
			} catch (Exception exception) {
				Class38_Sub20_Sub2.method813(exception, null, 95);
				method1224((byte) 53, "crash");
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.A(" + i + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')');
		}
	}

	@Override
	public final void windowClosing(WindowEvent windowevent) {
		try {
			destroy();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.windowClosing(" + (windowevent != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public abstract void init();

	@Override
	public final URL getDocumentBase() {
		try {
			if (Client.clientFrame != null)
				return null;
			if (Class38_Sub4.aClass56_1798 != null && this != Class38_Sub4.aClass56_1798.anApplet1242)
				return Class38_Sub4.aClass56_1798.anApplet1242.getDocumentBase();
			return super.getDocumentBase();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.getDocumentBase(" + ')');
		}
	}

	public static void method1222(boolean bool) {
		try {
			Applet_Sub1.aClass19_3635 = null;
			Applet_Sub1.aClass19_3625 = null;
			Applet_Sub1.aClass17_Sub1_3639 = null;
			if (bool)
				Applet_Sub1.aClass19_3625 = null;
			Applet_Sub1.aClass83_3633 = null;
			Applet_Sub1.aClass19_3610 = null;
			Applet_Sub1.aClass19_3638 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.J(" + bool + ')');
		}
	}

	abstract void method1223(int i);

	@Override
	public final void destroy() {
		try {
			if (this == ItemDefinition.anApplet_Sub1_2765 && !ItemDefinition.aBool2768) {
				ObjectDefinition.aLong2495 = Class9.method48((byte) -47);
				Canvas_Sub1.method809(5000L, -27166);
				Class23.aClass56_552 = null;
				method1215(25302);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.destroy(" + ')');
		}
	}

	final void method1224(byte i, String string) {
		try {
			if (i != 53)
				Applet_Sub1.aClass83_3633 = null;
			if (!aBool3606) {
				aBool3606 = true;
				System.out.println("error_game_" + string);
				try {
					getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + string + ".ws"), "_self");
				} catch (Exception exception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.K(" + i + ',' + (string != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public final void update(Graphics graphics) {
		try {
			paint(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.update(" + (graphics != null ? "{...}" : "null") + ')');
		}
	}

	static {
		Applet_Sub1.anInt3636 = 0;
		Applet_Sub1.aClass19_3638 = RSString.createRSString("Please subscribe)1 or use a different world)3");
		Applet_Sub1.aClass19_3635 = Applet_Sub1.aClass19_3638;
	}
}
