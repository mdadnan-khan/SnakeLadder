import java.io.*;
import java.util.*;

public class SnakeLadder{ 
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args){
		
		System.out.println("Welcome to the snake and ladder game");
		
		int position = 0;
		System.out.println("Your initial position is : " + position);		
		
		while(position!=100){
			int roll = (int) (Math.random() * 6) + 1;
			System.out.println("Dice roll number: " + roll);
		
			int option = (int) (Math.random() * 3);
		
			switch(option){
				case SNAKE:
					position = (position > roll) ? position - roll : 0;
					System.out.println("Oops you got bit by a snake");
					break;
				case LADDER:
					position  = (position+roll<=100) ? position + roll : position;
					System.out.println("You got a ladder and your position increased by " + roll + " steps");
					break;
				case NO_PLAY:
					System.out.println("Sorry!! No play");
					break;
			}
			System.out.println("Your current position is: " + position);
		}

		System.out.println("Congratulations You won the game");

	}
	
}
