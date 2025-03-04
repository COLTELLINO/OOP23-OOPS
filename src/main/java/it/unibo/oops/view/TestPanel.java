package it.unibo.oops.view;

import java.awt.Color;
/**
 * 
 */
public class TestPanel extends MyPanel { 
    @SuppressWarnings("unused") //sh and sh are not supposed to be final
    private final int sw;
    @SuppressWarnings("unused")
    private final int sh;
    @SuppressWarnings("unused") // TEMPORARY
    private static final double serialVersionUID = getSerialVersionUID();
    /**
     * @param screenWidth
     * @param screenHeight
     */
    public TestPanel(final int screenWidth, final int screenHeight) {
        super(screenWidth, screenHeight);
        this.sw = screenWidth;
        this.sh = screenHeight;
        super.setBackground(Color.BLACK);
    }
    /**
    *  Draws current panel.
    */
    @Override
    public void draw() {
    }
}
