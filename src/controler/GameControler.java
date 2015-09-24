package controler;

import model.GameModel;
import view.GameView;

public class GameControler {//Listeners
	
	GameModel gameModel;
	GameView gameView;
	
	public GameControler(GameModel gameModel, GameView gameView) {
		this.gameModel = gameModel;
		this.gameView = gameView;
	}
	
}
