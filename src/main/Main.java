package main;

import model.GameModel;
import view.GameView;
import controller.GameController;

public class Main {
	
	public static void main(String[] args) {
		GameModel gameModel = new GameModel();
		GameView gameView = new GameView(gameModel);
		GameController gameController = new GameController(gameModel, gameView);
		
		gameView.addKeyListener(gameController);
	}
	
}
