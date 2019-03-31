package play;

import java.util.stream.Stream;

import player.Player;

public class Game {
	
	// Constructor
	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		setNumber = 1;
		tabPoints1 = new int[5];
		for(int i=0;i<5;i++) tabPoints1[i]=i;
		tabPoints2 = new int[5];
		for(int i=0;i<5;i++) tabPoints2[i]=i;
	}
	
	// Attributes
	private Player p1;
	private Player p2;
	private int setNumber;
	private int tabPoints1[];
	private int tabPoints2[];
	
	public Player getP1() {
		return p1;
	}

	//Getters & Setters
	public void setP1(Player p1) {
		this.p1 = p1;
	}
	

	public Player getP2() {
		return p2;
	}
	

	public void setP2(Player p2) {
		this.p2 = p2;
	}
	
	public void winner()
	{
		
	}
	
	public void incrementPointsP1(Player P1 , Player P2)
	{
		
		switch(setNumber)
		{
			case 1:
				tabPoints1[0]++;
				for(int i = 1;i<tabPoints1.length;i++) tabPoints1[i]=0;
				P1.setPlayerPoints(tabPoints1);
				if(((P1.getPlayerPoints()[0] ==6) && (P2.getPlayerPoints()[0]<5)) || (((P1.getPlayerPoints()[0] ==7) && (P2.getPlayerPoints()[0]>=5)))) 
					{
						P1.setSetWon(P1.getSetWon()+1);
						setNumber++;
						
					}
				break;
			case 2:
				tabPoints1[1]++;
				for(int i = 2;i<tabPoints1.length;i++) tabPoints1[i]=0;
				P1.setPlayerPoints(tabPoints1);
				if((P1.getPlayerPoints()[1] ==6) && (P2.getPlayerPoints()[1]<5)|| (((P1.getPlayerPoints()[1] ==7) && (P2.getPlayerPoints()[1]>=5)))) 
				{
					P1.setSetWon(P1.getSetWon()+1);
					setNumber++;
					
				}
				break;
			case 3:
				tabPoints1[2]++;
				for(int i = 3;i<tabPoints1.length;i++) tabPoints1[i]=0;
				P1.setPlayerPoints(tabPoints1);
				if((P1.getPlayerPoints()[2] ==6) && (P2.getPlayerPoints()[2]<5)|| (((P1.getPlayerPoints()[2] ==7) && (P2.getPlayerPoints()[2]>=5)))) 
				{
					P1.setSetWon(P1.getSetWon()+1);
					setNumber++;
					
				}
				break;
			case 4:
				tabPoints1[3]++;
				for(int i = 4;i<tabPoints1.length;i++) tabPoints1[i]=0;
				P1.setPlayerPoints(tabPoints1);
				if((P1.getPlayerPoints()[3] ==6) && (P2.getPlayerPoints()[3]<5)|| (((P1.getPlayerPoints()[3] ==7) && (P2.getPlayerPoints()[3]>=5)))) 
				{
					P1.setSetWon(P1.getSetWon()+1);
					setNumber++;
					
				}
				break;
			case 5:
				tabPoints1[4]++;
				for(int i = 5;i<tabPoints1.length;i++) tabPoints1[i]=0;
				P1.setPlayerPoints(tabPoints1);
				if((P1.getPlayerPoints()[4] ==6) && (P2.getPlayerPoints()[4]<5)|| (((P1.getPlayerPoints()[4] ==7) && (P2.getPlayerPoints()[4]>=5)))) 
				{
					P1.setSetWon(P1.getSetWon()+1);
					setNumber++;
					
				}
				break;
		}
	}
	
	
	
	public void incrementPointsP2(Player P1 , Player P2)
	{
		
		switch(setNumber)
		{
			case 1:
				tabPoints2[0]++;
				for(int i = 1;i<tabPoints2.length;i++) tabPoints2[i]=0;
				P1.setPlayerPoints(tabPoints2);
				if(((P1.getPlayerPoints()[0] ==6) && (P2.getPlayerPoints()[0]<5)) || (((P1.getPlayerPoints()[0] ==7) && (P2.getPlayerPoints()[0]>=5)))) 
				{
					P1.setSetWon(P1.getSetWon()+1);
					setNumber++;
					
				}
				break;
			case 2:
				tabPoints2[1]++;
				for(int i = 2;i<tabPoints2.length;i++) tabPoints2[i]=0;
				P1.setPlayerPoints(tabPoints2);
				if((P1.getPlayerPoints()[1] ==6) && (P2.getPlayerPoints()[1]<5)|| (((P1.getPlayerPoints()[1] ==7) && (P2.getPlayerPoints()[1]>=5)))) 
				{
					P1.setSetWon(P1.getSetWon()+1);
					setNumber++;
					
				}
				break;
			case 3:
				tabPoints2[2]++;
				for(int i = 3;i<tabPoints2.length;i++) tabPoints2[i]=0;
				P1.setPlayerPoints(tabPoints2);
				if((P1.getPlayerPoints()[2] ==6) && (P2.getPlayerPoints()[2]<5)|| (((P1.getPlayerPoints()[2] ==7) && (P2.getPlayerPoints()[2]>=5)))) 
				{
					P1.setSetWon(P1.getSetWon()+1);
					setNumber++;
					
				}
				break;
			case 4:
				tabPoints2[3]++;
				for(int i = 4;i<tabPoints2.length;i++) tabPoints2[i]=0;
				P1.setPlayerPoints(tabPoints2);
				if((P1.getPlayerPoints()[3] ==6) && (P2.getPlayerPoints()[3]<5)|| (((P1.getPlayerPoints()[3] ==7) && (P2.getPlayerPoints()[3]>=5)))) 
				{
					P1.setSetWon(P1.getSetWon()+1);
					setNumber++;
					
				}
				break;
			case 5:
				tabPoints2[4]++;
				for(int i = 5;i<tabPoints2.length;i++) tabPoints2[i]=0;
				P1.setPlayerPoints(tabPoints2);
				if((P1.getPlayerPoints()[4] ==6) && (P2.getPlayerPoints()[4]<5)|| (((P1.getPlayerPoints()[4] ==7) && (P2.getPlayerPoints()[4]>=5)))) 
				{
					P1.setSetWon(P1.getSetWon()+1);
					setNumber++;
					
				}
				break;
		}
	}
	
	
	
	
	//Showing Set Score
	public void showSetScore(Player p)
	{
		for(int i=0;i<p.getPlayerPoints().length;i++)
		{
			System.out.print(" "+p.getPlayerPoints()[i]+" ");
		}
	}
	
	// Showing Game Score Method
	public void showGameScore()
	{
		System.out.println("Player 1  score :" + p1.getGscore());
		System.out.println("Player 2  score :" + p2.getGscore());
		System.out.print("Player 1  set score :" ); showSetScore(p1);
		System.out.println();
		System.out.print("Player 2  set score :" ); showSetScore(p2);
		System.out.println();
		System.out.println("Player 1 Global Score :"+ p1.getSetWon());
		System.out.println("Player 2 Global Score :"+ p2.getSetWon());



	}
	
	// Start a new game Method
	public void reset()
	{
		p1.setGscore("0 ");
		p2.setGscore("0 ");
		p1.getPoints().clear();
		p2.getPoints().clear();
		p1.setTurnDeuce(0);
		p2.setTurnDeuce(0);
		p1.setTurn(0);
		p2.setTurn(0);
	}
	
	
	
	public void backDeuce()
	{
		p1.setGscore("0 15 30 40 ");
		p2.setGscore("0 15 30 40 ");
		this.showGameScore();
		System.out.println("=============================================");
		p1.setTurnDeuce(0);
		p2.setTurnDeuce(0);
	}
	
	
	// Playing Method
	public void playerScore(int p)
	{
		
		if((p1.getTurnDeuce()!=1) && (p2.getTurnDeuce()!=1))
		{
			if(p==0)
			{
				if((p1.getPoints().size() <3) || (p2.getPoints().size() <3))
				{
					if (p1.getTurn()<=2) 
					{
						p1.score();
						this.showGameScore();
						System.out.println("============================================");
					}
					else
					{
						reset();
						incrementPointsP1(p1,p2);
						this.showGameScore();
						System.out.println("============================================");
					}
				}
				else
				{
					p1.scoreDeuce();
					this.showGameScore();
					System.out.println("=============================================");
				}
			}
			else
			{
				if((p1.getPoints().size() <3) || (p2.getPoints().size() <3))
				{
					if(p2.getTurn()<=2)
					{
						p2.score();
						this.showGameScore();
						System.out.println("=============================================");
					}
					else
					{
						reset();
						incrementPointsP2(p2,p1);
						this.showGameScore();
						System.out.println("============================================");
					}
				}
				else
				{
					p2.scoreDeuce();
					this.showGameScore();
					System.out.println("=============================================");
					
				}
			}
		}
		else
		{
			if((p==0) && p1.getTurnDeuce()==1)
			{
				reset();
				incrementPointsP1(p1,p2);
				this.showGameScore();
				System.out.println("============================================");
			}else if((p==1) && p2.getTurnDeuce()==1)
			{
				reset();
				incrementPointsP2(p2,p1);
				this.showGameScore();
				System.out.println("============================================");
			}
			else
			{
				backDeuce();
			}					
		}
					
}
	
}
