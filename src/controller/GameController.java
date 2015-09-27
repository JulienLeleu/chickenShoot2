package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import model.GameModel;
import view.GameView;

public class GameController implements KeyListener{//Listeners
	
	GameModel gameModel;
	GameView gameView;
	List<Character> characters;
	
	public GameController(GameModel gameModel, GameView gameView) {
		this.gameModel = gameModel;
		this.gameView = gameView;
	}
	
	public void addCharacter(Character character) {
		characters.add(character);
	}
	
	public List<Character> getCharacters() {
		return characters;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT : System.out.println("Gauche"); break;
		case KeyEvent.VK_RIGHT : System.out.println("Droite"); break;
		case KeyEvent.VK_UP : System.out.println("Haut"); break;
		case KeyEvent.VK_DOWN : System.out.println("Bas"); break;		
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
