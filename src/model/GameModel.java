package model;

import java.util.List;
import java.util.Observable;

import util.Board;

public class GameModel extends Observable {
	private Board board;
	private List<Character> characters;
	
	public GameModel(){
		
	}
}