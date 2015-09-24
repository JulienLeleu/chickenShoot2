package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import model.GameModel;

public class GameView extends JFrame implements Observer {
	
	GameModel gameModel;
	
	public GameView(GameModel gameModel) {
		this.gameModel = gameModel;
		gameModel.addObserver(this);
		this.setContentPane(new Map(200,200));
		this.setLocationRelativeTo(null);
		pack();
		this.setVisible(true);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
	}

}
