package player;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Player {
	// Default Constructor
	public Player() 
	{
		points = new ArrayList<Integer>();
		gscore = new String();
		gscore = "0 ";
		turn=0;
		turnDeuce=0;
		playerPoints = new int[5];
		setWon=0;

	}
	
	// Attributes
	private List<Integer> points;
	private int[] playerPoints;
	private int turn;
	private int turnDeuce;
	private String gscore;
	private int setWon;

	//Setters & getters
	
	public List<Integer> getPoints() {
		return points;
	}

	
	public int getSetWon() {
		return setWon;
	}


	public void setSetWon(int setWon) {
		this.setWon = setWon;
	}


	public void setPoints(List<Integer> points) {
		this.points = points;
	}
	
	
	public int getTurn() {
		return turn;
	}


	public void setTurn(int turn) {
		this.turn = turn;
	}
	
	

	public String getGscore() {
		return gscore;
	}


	public void setGscore(String gscore) {
		this.gscore = gscore;
	}

	public int[] getPlayerPoints() {
		return playerPoints;
	}


	public void setPlayerPoints(int[] playerPoints) {
		this.playerPoints = playerPoints;
	}


	public int getTurnDeuce() {
		return turnDeuce;
	}


	public void setTurnDeuce(int turnDeuce) {
		this.turnDeuce = turnDeuce;
	}

	// Score Method
	public void score()
	{
		switch(turn)
		{
			case 0: points.add(15); gscore = gscore + points.get(0).toString() + " "; turn++; break;
			case 1: points.add(30); gscore = gscore + points.get(1).toString() + " "; turn++; break;
			case 2: points.add(40); gscore = gscore + points.get(2).toString() + " "; turn++; break;
		
		}
		
	}
	
	// Score Method in DEUCE case
	public void scoreDeuce()
	{
		if(turnDeuce == 0)
		{
			gscore = gscore + "AD"; turnDeuce++;
			
		}
	}
	
	
	public void scoreDisplay()
	{
		
	}
	
	

}
