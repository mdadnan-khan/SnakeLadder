import java.io.*;
import java.util.*;

public class SnakeLadder{ 
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static int roll(int playerNum, int currPos){
		boolean gotLadder = false;	
		int roll = (int) (Math.random() * 6) + 1;
		System.out.println("Dice roll number: " + roll);
		
		int option = (int) (Math.random() * 3);
		
		// Initial Dice throw
		switch(option){
			case SNAKE:
				currPos = (currPos > roll) ? currPos - roll : 0;
				System.out.println("Oops!! Player " + playerNum + " got bit by a snake");
				break;
			case LADDER:
				currPos = (currPos + roll<=100) ? currPos + roll : currPos;
				gotLadder = true;
				System.out.println("Congrats!! Player " + playerNum + " climbed " + roll + " positions up a ladder");
				break;
			case NO_PLAY:
				System.out.println("Sorry!! No play right now");
				break;
		}
		System.out.println("Current Position: " + currPos);
		
		// Repeat till the player keeps getting a ladder
		while(gotLadder){
			roll = (int) (Math.random() * 6) + 1;
            System.out.println("Dice roll number: " + roll);

            option = (int) (Math.random() * 3);

            switch(option){
            	case SNAKE:
                    currPos = (currPos > roll) ? currPos - roll : 0;
					gotLadder = false;
                    System.out.println("Oops!! Player " + playerNum + "got bit by a snake");
                    break;
                case LADDER:
                  	currPos = (currPos + roll<=100) ? currPos + roll : currPos;
                 	System.out.println("Congrats!! Player  " + playerNum + "climbed " + roll + " positions up a ladder");
                   	break;
                case NO_PLAY:
					gotLadder = false;
                   	System.out.println("Sorry!! No play right now");
                    break;
            }

			System.out.println("Current Position: " + currPos);
		}
		return currPos;
	}

	
	public static void main(String[] args){
		
		System.out.println("Welcome to the snake and ladder game");
		
		int positionP1 = 0, positionP2=0;
		System.out.println("Initial Position of Player 1: " + positionP1);
		System.out.println("Initial Position of Player 2: " + positionP2);		
		

		int rollCountP1=0, rollCountP2=0;
		while(positionP1!=100 && positionP2!=100){
			System.out.println("Player 1 turn");
			positionP1 = roll(1, positionP1);
			
			if(positionP1==100){
				break;
			}
			
			System.out.println("Player 2 turn");
			positionP2 = roll(2, positionP2);
		}

		if(positionP1==100 && positionP2!=100){
			System.out.println("Congratulations Player 1 won the game");
		}
		else if(positionP1!=100 && positionP2==100){
			System.out.println("Congratulations Player 2 won the game");
		}

		
	}
	
}
