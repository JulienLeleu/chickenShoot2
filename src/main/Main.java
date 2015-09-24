package main;

import controler.GameControler;
import model.GameModel;
import view.GameView;

public class Main {
	
	public static void main(String[] args) {
		GameModel gameModel = new GameModel();
		GameView gameView = new GameView(gameModel);
		GameControler gameControler = new GameControler(gameModel, gameView);
	}
	
}
