//Exercise4.java//
/*This prgoram uses a for loop to determine whether a number 
 *constatutes a binary number*/
 
 
import java.util.Scanner;
 	
public class Exercise4 {
	public static void main(String args[])
		{
			String text;
			char character;
			int i;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a piece of text: ");
			text = input.nextLine();

			for(i=0;i<text.length();i++)
				{
				   	character = text.charAt(i);
				   	
				   	if(character != '0' && character != '1')
				   		break;  		
				}
				
			if(i == text.length())		
				System.out.println("\nYou entered a binary number");
			else
				System.out.println("\nYou did not enter a binary number");													
		}		
}



 } 