//Q5.java
/*This program gets the user to enter a sentence, displays a set of menu options to the user, retrieves the
 *users choice and executes a switch to carry out the users choice*/

import java.util.Scanner;

public class Q5 {
	public static void main(String args[])
		{					
			String choiceAsString,sentence="";
			char choice;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a sentence: ");
			sentence = input.nextLine();
			
			System.out.println("\n\n\t\tA. Display First Character\n\t\tB. Is First Character a Lowercase Letter?\n\t\t" +
				               "C. Display Sentence Length ");
			
			System.out.print("\nPlease enter your choice: ");
			choiceAsString = input.nextLine();
			choice = choiceAsString.charAt(0);
			
			switch(choice)
				{
					case 'A':
							System.out.println("\nFirst character of the sentence is " + sentence.charAt(0));
							break;
					case 'B':
						    if(sentence.charAt(0)>='a'&&sentence.charAt(0)<='z')
								System.out.println("\nFirst character is a lowercase letter");
							else
								System.out.println("\nFirst character is not a lowercase letter");
							break;
					case 'C':
						    System.out.println("\nLength of the sentence is " + sentence.length());
				}		
		}
}	



