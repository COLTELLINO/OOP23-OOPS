package it.unibo.oops.view;

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
    *  Draws current panel.
    */
    public void draw() {
    }
}
