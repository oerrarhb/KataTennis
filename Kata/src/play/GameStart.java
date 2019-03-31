package play;

import java.util.Scanner;

import player.Player;

public class GameStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================================================================================================");
		System.out.println("============================== Welcome to KATA TENNIS GAME ============================================");
		System.out.println("=======================================================================================================");
		System.out.println("Game Rules");
		System.out.println("Write 1 for player 1 scoring and 2 for player 2 scoring");
		
		Scanner sc = new Scanner(System.in);
		Player p1 = new Player();
		Player p2 = new Player();
		Game g = new Game(p1,p2);
		int input ;
		System.out.println("Play");

		while(p1.getSetWon()+p2.getSetWon()<=5)
		{
			input = sc.nextInt();
			g.playerScore(input);
			if(p1.getSetWon()+p2.getSetWon()==5) break;
				
		}
		
		if(p1.getSetWon()> p2.getSetWon())
		{
			System.out.println("****************************************************************************************************");
			System.out.println("************************** THE WINNER IS PLAYER 1 **************************************************");
			System.out.println("****************************************************************************************************");
			
		}
		else
		{
			System.out.println("****************************************************************************************************");
			System.out.println("************************** THE WINNER IS PLAYER 2 **************************************************");
			System.out.println("****************************************************************************************************");
			
		}
	
	}

}
