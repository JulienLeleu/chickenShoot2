package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import model.GameModel;
import controller.GameController;

public class GameView extends JFrame implements Observer {
	
	GameModel gameModel;
	
	public GameView(GameModel gameModel) {
		this.gameModel = gameModel;
		this.setContentPane(new Map(200,200));
		this.setLocationRelativeTo(null);
		pack();
		this.gameModel.addObserver(this);
		this.setVisible(true);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
	}
}
