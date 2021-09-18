/* Class2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class Class2_Sub2 extends Class2 {
	private Component aComponent2200;

	@Override
	final void method13(Graphics graphics, int i, int i_0_, int i_1_) {
		if (i == 29504)
			graphics.drawImage(this.anImage25, i_1_, i_0_, aComponent2200);
	}

	@Override
	final void method15(int i, int i_2_, int i_3_, Component component) {
		this.anInt26 = i_2_;
		this.anInt24 = i_3_;
		this.anIntArray28 = new int[i_3_ * i_2_ + 1];
		DataBufferInt databufferint = new DataBufferInt(this.anIntArray28, this.anIntArray28.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		if (i > -24)
			aComponent2200 = null;
		WritableRaster writableraster = Raster.createWritableRaster(directcolormodel.createCompatibleSampleModel(this.anInt24, this.anInt26), databufferint, null);
		this.anImage25 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
		aComponent2200 = component;
		method12((byte) 87);
	}

	@Override
	final void method17(int i, Graphics graphics, int i_4_, int i_5_, int i_6_, int i_7_) {
		Shape shape = graphics.getClip();
		graphics.clipRect(i_6_, i_7_, i_4_, i_5_);
		graphics.drawImage(this.anImage25, i, 0, aComponent2200);
		graphics.setClip(shape);
	}
}
