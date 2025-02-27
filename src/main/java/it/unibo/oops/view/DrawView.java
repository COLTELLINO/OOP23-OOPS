package it.unibo.oops.view;

import it.unibo.oops.controller.gamestate.GameState;

/**
 *
 */
public interface DrawView {
    /**
     * Shows the window.
     */
    void start();
    /**
     * Changes the state of the game.
     * 
     * @param gameState 
     */
    void changeGameState(GameState gameState);
    /**
     * Draws the current Panel.
     */
    void draw();
}
