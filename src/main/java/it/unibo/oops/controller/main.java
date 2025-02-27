package it.unibo.oops.controller;

import it.unibo.oops.controller.gamestate.GameState;

final class MainApp {

    private MainApp(final GameState gameState) {
        //window.changeGameState(GameState.PLAYSTATE); // EASILY CHANGE THE PANEL HERE
        new GameThread(gameState);
    }
    public static void main(final String[] args) {
        new MainApp(GameState.TESTSTATE);
    }
}//COMMENTO DI TESTING
