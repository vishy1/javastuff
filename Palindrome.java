import java.util.Scanner;

// Palindrome Java Program Tutorial (Practice Program): https://www.youtube.com/watch?v=AoRYeB7Os3M&list=PL59LTecnGM1MMSBPiLN4aMwM7DcnVld0s&index=10&t=0s
// Java Programs For Practice Playlist: https://www.youtube.com/playlist?list=PL59LTecnGM1MMSBPiLN4aMwM7DcnVld0s
// Video 9/12

public class Palindrome 
{

	public static void main(String[] args) 
	{
		// Examples - Mom, Poop, Race car ... a word that when revsersed reads the same
		// This program will take a string input from a user and confirm it is a palindrome
		
		System.out.println("Welcome to the Palindrome program!\n");
		
		while (true)
		{
			System.out.println("Enter a String (all in lower case):");
			Scanner scan = new Scanner(System.in);
			String userInput = scan.nextLine();
			String userInputNoSpace = userInput.replaceAll("\\s",""); // removes all whitespace from user input
			
			System.out.println("Your inputted value with spaces removed:\n" + userInputNoSpace);
			
			// Let's get the reverse string
			String reverse = "";
			
			for (int i = userInputNoSpace.length() - 1; i >= 0; i--)
			{
				reverse += userInputNoSpace.charAt(i);
			}
			
			System.out.println("Your inputted value reversed and with spaces removed:\n" + reverse);
			
			if(reverse.equals(userInputNoSpace))
			{
				System.out.println("YES!!! It is a palindrome");
			}
			else
			{
				System.out.println("NO!!! It is not a palindrome");
			}	
			System.out.println("");
		}


	}

}
