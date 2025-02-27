package it.unibo.oops.controller;

import java.util.logging.Logger;

import it.unibo.oops.controller.gamestate.GameState;
import it.unibo.oops.view.DrawView;
import it.unibo.oops.view.DrawViewImpl;

import java.util.logging.Level;

/**
* 
*/
public class GameThread implements Runnable {

    private Boolean stop = true;
    private final DrawView dv;
    /**
     * @param gameState
     */
    public GameThread(final GameState gameState) {
        this.startThread();
        this.dv = new DrawViewImpl(gameState);
    }
    /**
     * Starts the gameThread.
     */
    private void startThread() {
        final Thread thread = new Thread(this);
        thread.start();
    }
    /**
     * Stops the gameThread.
     */
    public void stopThread() {
        this.stop = false;
    }
    /**
     *  Thread.
     */
    @Override
    public void run() {
        while (stop) {
            try {
                this.dv.draw();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, "Sleep Thread Error", e);
            }
        }
    }

}
