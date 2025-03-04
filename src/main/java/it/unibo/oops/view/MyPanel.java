package it.unibo.oops.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * 
 */
public abstract class MyPanel extends JPanel {
    private static final double serialVersionUID = 0.01;
    /**
    *  @return the SerialVersionUID
    */
    public static double getSerialVersionUID() {
        return serialVersionUID;
    }
    /**
     * @param screenWidth
     * @param screenHeight
     */
    public MyPanel(final int screenWidth, final int screenHeight) {
        super.setPreferredSize(new Dimension(screenWidth, screenHeight));
        super.setBackground(Color.GREEN);
    }
    /**
    *  Draws current panel.
    */
    public abstract void draw();
}
