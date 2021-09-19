package com.javatar;/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
	static RSString aClass19_3610 = RSString.createRSString("Geben Sie Ihren Benutzernamen");
	static RSString aClass19_3625 = RSString.createRSString("title)3jpg");
	static int anInt3627 = 0;
	static Class83 aClass83_3633 = new Class83(64);
	static RSString aClass19_3635;
	static volatile int anInt3636;
	static Class17_Sub1 indexTextures;
	private static RSString aClass19_3638;

	static {
		Applet_Sub1.anInt3636 = 0;
		Applet_Sub1.aClass19_3638 = RSString.createRSString("Please subscribe)1 or use a different world)3");
		Applet_Sub1.aClass19_3635 = Applet_Sub1.aClass19_3638;
	}

	private boolean aBool3606 = false;

	private static Class73 method1213() {
		try {
			if ((byte) 121 < 119)
				return null;
			try {
				return (Class73) Class.forName("pd").newInstance();
			} catch (Throwable throwable) {
				return new Class73_Sub2();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.L(" + (byte) 121 + ')');
		}
	}

	static final void method1218(byte i) {
		try {
			if (i >= -54)
				client.errorPinging = false;
			for (Class38_Sub8 class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method82((byte) 91); class38_sub8 != null; class38_sub8 = (Class38_Sub8) Class10.aClass14_190.method78(-118)) {
				int i_6_ = class38_sub8.anInt2038;
				if (Class22.method196(i_6_)) {
					boolean bool = true;
					Class38_Sub6[] class38_sub6s = Class62.aClass38_Sub6ArrayArray1339[i_6_];
					for (Class38_Sub6 class38Sub6 : class38_sub6s)
						if (class38Sub6 != null) {
							bool = class38Sub6.aBool1961;
							break;
						}
					if (!bool) {
						int i_8_ = (int) class38_sub8.aLong898;
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

	public static final void providesignlink(Class56 class56) {
		try {
			Class23.aClass56_552 = Class38_Sub4.aClass56_1798 = class56;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.providesignlink(" + (class56 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method1222(boolean bool) {
		try {
			Applet_Sub1.aClass19_3635 = null;
			Applet_Sub1.aClass19_3625 = null;
			Applet_Sub1.indexTextures = null;
			if (bool)
				Applet_Sub1.aClass19_3625 = null;
			Applet_Sub1.aClass83_3633 = null;
			Applet_Sub1.aClass19_3610 = null;
			Applet_Sub1.aClass19_3638 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.J(" + bool + ')');
		}
	}

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
			if (client.clientFrame != null)
				return null;
			if (Class38_Sub4.aClass56_1798 != null && this != Class38_Sub4.aClass56_1798.anApplet1242)
				return Class38_Sub4.aClass56_1798.anApplet1242.getParameter(string);
			return super.getParameter(string);
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.getParameter(" + (string != null ? "{...}" : "null") + ')');
		}
	}

	abstract void method1209();

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

	final boolean method1210() {
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
			if (30360 != 30360)
				Applet_Sub1.aClass19_3610 = null;
			if (string.endsWith("192.168.1."))
				return true;
			method1224("invalidhost");
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.C(" + 30360 + ')');
		}
	}

	@Override
	public final URL getCodeBase() {
		if (client.clientFrame != null)
			return null;
		if (Class38_Sub4.aClass56_1798 != null && Class38_Sub4.aClass56_1798.anApplet1242 != this)
			return Class38_Sub4.aClass56_1798.anApplet1242.getCodeBase();
		return super.getCodeBase();
	}

	abstract void method1211();

	@Override
	public final void windowClosed(WindowEvent windowevent) {
		/* empty */
	}

	final void method1212(int i_4_) {
		try {
			try {
				ItemDefinition.anApplet_Sub1_2765 = this;
				Class20.anInt501 = 503;
				Class74.anInt1468 = 468;
				Class38_Sub8.anInt2050 = 765;
				client.clientFrame = new Frame();
				client.clientFrame.setTitle("Jagex");
				client.clientFrame.setResizable(false);
				client.clientFrame.addWindowListener(this);
				client.clientFrame.setVisible(true);
				client.clientFrame.toFront();
				Insets insets = client.clientFrame.getInsets();
				client.clientFrame.setSize(insets.right + insets.left + 765, insets.bottom + 503 + insets.top);
				Class23.aClass56_552 = Class38_Sub4.aClass56_1798 = new Class56(true, null, i_4_, "runescape", 16);
				Class38_Sub4.aClass56_1798.method430(1, this, 1 ^ 0x67);
			} catch (Exception exception) {
				Class38_Sub20_Sub2.method813(exception, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.D(" + 16 + ',' + 1 + ',' + 468 + ',' + ("runescape" != null ? "{...}" : "null") + ',' + 765 + ',' + 503 + ',' + i_4_ + ')');
		}
	}

	abstract void method1214(int i);

	@Override
	public final AppletContext getAppletContext() {
		try {
			if (client.clientFrame != null)
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

	private synchronized void method1215() {
		try {
			if (!ItemDefinition.aBool2768) {
				ItemDefinition.aBool2768 = true;
				try {
					Class38_Sub3.aCanvas1783.removeFocusListener(this);
				} catch (Exception exception) {
					/* empty */
				}
				try {
					method1217();
					if (25302 != 25302)
						windowClosed(null);
				} catch (Exception exception) {
					/* empty */
				}
				if (client.clientFrame != null)
					try {
						System.exit(0);
					} catch (Throwable throwable) {
						/* empty */
					}
				if (Class38_Sub4.aClass56_1798 != null)
					try {
						Class38_Sub4.aClass56_1798.method431(25302 - 25298);
					} catch (Exception exception) {
						/* empty */
					}
				method1214(5);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.I(" + 25302 + ')');
		}
	}

	@Override
	public final void windowDeiconified(WindowEvent windowevent) {
		/* empty */
	}

	private void method1216() {
		try {
			long l = Class9.method48((byte) -119);
			long l_5_ = Class42.aLongArray954[Node.anInt895];
			if ((byte) -77 >= -55)
				windowActivated(null);
			if (l_5_ != 0L && l_5_ < l) {
				/* empty */
			}
			Class42.aLongArray954[Node.anInt895] = l;
			Node.anInt895 = Node.anInt895 + 1 & 0x1f;
			synchronized (this) {
				client.awtFocused = Class21.aBool508;
			}
			method1209();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.H(" + (byte) -77 + ')');
		}
	}

	abstract void method1217();

	@Override
	public final void focusGained(FocusEvent focusevent) {
		try {
			Class21.aBool508 = true;
			Class33.aBool781 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.focusGained(" + (focusevent != null ? "{...}" : "null") + ')');
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

	@Override
	public final void run() {
		try {
			try {
				if (Class56.aString1248 != null) {
					String string = Class56.aString1248.toLowerCase();
					if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
						String string_9_ = Class56.aString1241;
						if (string_9_.equals("1.1") || string_9_.startsWith("1.1.") || string_9_.equals("1.2") || string_9_.startsWith("1.2.")) {
							method1224("wrongjava");
							return;
						}
						Class51.anInt1121 = 5;
					} else if (string.indexOf("ibm") != -1 && (Class56.aString1241 == null || Class56.aString1241.equals("1.4.2"))) {
						method1224("wrongjava");
						return;
					}
				}
				if (Class38_Sub4.aClass56_1798.anApplet1242 != null) {
					Method method = Class56.aMethod1250;
					if (method != null)
						try {
							method.invoke(Class38_Sub4.aClass56_1798.anApplet1242, Boolean.TRUE);
						} catch (Throwable throwable) {
							/* empty */
						}
				}
				method1219(-29492);
				Class38_Sub2.aClass2_1768 = Class40.method343(Class20.anInt501, Class38_Sub8.anInt2050, Class38_Sub3.aCanvas1783);
				method1211();
				Class25.aClass73_579 = Applet_Sub1.method1213();
				while (ObjectDefinition.aLong2495 == 0L || Class9.method48((byte) -126) < ObjectDefinition.aLong2495) {
					Class11.anInt202 = Class25.aClass73_579.method519(Sequence.anInt2741, 1, Class51.anInt1121);
					for (int i = 0; Class11.anInt202 > i; i++)
						method1216();
					method1220();
					Class37.method327(Class38_Sub3.aCanvas1783, Class38_Sub4.aClass56_1798);
				}
			} catch (Exception exception) {
				Class38_Sub20_Sub2.method813(exception, null);
				method1224("crash");
			}
			method1215();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.run(" + ')');
		}
	}

	final synchronized void method1219(int i) {
		try {
			Container container;
			if (client.clientFrame == null)
				container = Class38_Sub4.aClass56_1798.anApplet1242;
			else
				container = client.clientFrame;
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
			if (client.clientFrame != null) {
				Insets insets = client.clientFrame.getInsets();
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

	private void method1220() {
		try {
			long l = Class9.method48((byte) -62);
			if (0 != 0)
				Applet_Sub1.indexTextures = null;
			long l_10_ = Class17_Sub1.aLongArray1704[NPC.anInt3559];
			Class17_Sub1.aLongArray1704[NPC.anInt3559] = l;
			NPC.anInt3559 = NPC.anInt3559 + 1 & 0x1f;
			if (l_10_ != 0L && l_10_ < l) {
				int i_11_ = (int) (l - l_10_);
				Class38_Sub1.anInt1748 = (32000 + (i_11_ >> 1)) / i_11_;
			}
			if (Class75.anInt1476++ > 50) {
				Class33.aBool781 = true;
				Class75.anInt1476 -= 50;
				Class38_Sub3.aCanvas1783.setSize(Class38_Sub8.anInt2050, Class20.anInt501);
				Class38_Sub3.aCanvas1783.setVisible(true);
				if (client.clientFrame == null)
					Class38_Sub3.aCanvas1783.setLocation(0, 0);
				else {
					Insets insets = client.clientFrame.getInsets();
					Class38_Sub3.aCanvas1783.setLocation(insets.left, insets.top);
				}
			}
			method1223();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.N(" + 0 + ')');
		}
	}

	final void method1221(int i_12_) {
		try {
			try {
				if (0 == 0)
					if (ItemDefinition.anApplet_Sub1_2765 != null) {
						Class15.anInt301++;
						if (Class15.anInt301 >= 3)
							method1224("alreadyloaded");
						else
							getAppletContext().showDocument(getDocumentBase(), "_self");
					} else {
						ItemDefinition.anApplet_Sub1_2765 = this;
						Class38_Sub8.anInt2050 = 765;
						Class20.anInt501 = 503;
						Class74.anInt1468 = 468;
						if (Class38_Sub4.aClass56_1798 == null)
							Class23.aClass56_552 = Class38_Sub4.aClass56_1798 = new Class56(false, this, i_12_, null, 0);
						Class38_Sub4.aClass56_1798.method430(1, this, 0 + 109);
					}
			} catch (Exception exception) {
				Class38_Sub20_Sub2.method813(exception, null);
				method1224("crash");
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.A(" + 0 + ',' + i_12_ + ',' + 765 + ',' + 503 + ',' + 468 + ')');
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
			if (client.clientFrame != null)
				return null;
			if (Class38_Sub4.aClass56_1798 != null && this != Class38_Sub4.aClass56_1798.anApplet1242)
				return Class38_Sub4.aClass56_1798.anApplet1242.getDocumentBase();
			return super.getDocumentBase();
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.getDocumentBase(" + ')');
		}
	}

	abstract void method1223();

	@Override
	public final void destroy() {
		try {
			if (this == ItemDefinition.anApplet_Sub1_2765 && !ItemDefinition.aBool2768) {
				ObjectDefinition.aLong2495 = Class9.method48((byte) -47);
				Canvas_Sub1.method809(5000L, -27166);
				Class23.aClass56_552 = null;
				method1215();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class38_Sub1.method607(runtimeexception, "lf.destroy(" + ')');
		}
	}

	final void method1224(String string) {
		try {
			if ((byte) 53 != 53)
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
			throw Class38_Sub1.method607(runtimeexception, "lf.K(" + (byte) 53 + ',' + (string != null ? "{...}" : "null") + ')');
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
}
