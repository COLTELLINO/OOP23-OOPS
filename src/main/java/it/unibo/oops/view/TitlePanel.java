package it.unibo.oops.view;

import java.awt.Color;
/**
 * 
 */
public class TitlePanel extends MyPanel {
    @SuppressWarnings("unused") // TEMPORARY
    private static final double serialVersionUID = getSerialVersionUID();
    /**
     * @param screenWidth
     * @param screenHeight
     */
    public TitlePanel(final int screenWidth, final int screenHeight) {
        super(screenWidth, screenHeight);
        super.setBackground(Color.WHITE);
    }
    /**
    *  Draws current panel.
    */
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }
}
