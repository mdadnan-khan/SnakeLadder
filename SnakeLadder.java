import java.io.*;
import java.util.*;

public class SnakeLadder{
	public static void main(String[] args){
		System.out.println("Welcome to the snake and ladder game");
		int position = 0;
		System.out.println("Your initial position is : " + position);
		int roll = (int) (Math.random() * 6) + 1;
		
		System.out.println("Dice roll number: " + roll);	
	}
}
