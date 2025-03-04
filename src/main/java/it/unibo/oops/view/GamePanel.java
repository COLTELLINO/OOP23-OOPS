package it.unibo.oops.view;

import java.awt.Color;
/**
 * 
 */
public class GamePanel extends MyPanel { 
    @SuppressWarnings("unused") // TEMPORARY
    private static final double serialVersionUID = getSerialVersionUID();
    /**
     * @param screenWidth
     * @param screenHeight
     */
    public GamePanel(final int screenWidth, final int screenHeight) {
        super(screenWidth, screenHeight);
        super.setBackground(Color.BLACK);
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
