//Exercise2
/*This program determines whether a input value is
 *a digit, lowercase or uppercse letter*/
 
 import java.util.Scanner;
 
 public class Exercise2 {
 	public static void main(String args[])
 	{		 
 	  		char character;
 			String characterAsString;
 			
 			Scanner input = new Scanner (System.in);
 			
 			System.out.print("Please enter a keyboard character: ");
 	 	    characterAsString = input.nextLine ();
 	 	    
 	 	    character = characterAsString.charAt (0); 
 	  
 	  if(character >= '0' && character <=  '9')
 	  System.out.println("\nYou entered a digit");
 	 
 	  else if(character >= 'a' && character <=  'z')
 	  System.out.println("\nYou entered a lowercase letter");
 	 
 	  else if(character >= 'A' && character <=  'Z')
 	  System.out.println("\nYou entered a uppercase letter");
 
 	  else
      System.out.println("\nYou entered neither a letter nor a digit");
 	}			
 }