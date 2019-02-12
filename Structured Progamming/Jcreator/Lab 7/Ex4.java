//Ex4.java//
/*This program analysis a piece of text to
 *determine whether the character is a  digit*/
 
 import java.util.Scanner;

public class Ex4 {
	public static void main(String args[])
			{
			String text;
			char character;
			int index=0,digitCount=0;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a piece of text: ");
			text = input.nextLine();		
			
			while(index < text.length())
				{
					character = text.charAt(index);
					
					if(character >= '0' && character <= '9')
		            	digitCount++;
		            	
		            index++;
				}
		            
	
			if(digitCount == text.length())
				System.out.println("\nYou entered a positive whole number");
			else
				System.out.println("\nYou did not enter a positive whole number");
											
		}		
}	
	
		
		
		
		