//Exercise4java//
/*This program calculates the distance(s)given
 *by the formula s=ut+0.5t.t */
 
 import java.util.Scanner;
 
 public class Exercise4{
 	
 	public static void main(String[]args)
 	{
 		Float InitialSpeed, Accleration, TimeSpentTraveling;
 		
 		Scanner input = new Scanner (System.in);
 		
 		System.out.print("Please enter the InitialSpeed: ");
 	    InitialSpeed = input.nextFloat ();
 			
 		System.out.print("Please enter the Accleration: ");
 	    Accleration = input.nextFloat   ();
 	    
 	    System.out.print("Please enter the TimeSpentTraveling: ");
 	    TimeSpentTraveling = input.nextFloat  ();
 	    
 	    System.out.println("\n\n************Distacne Converter**************\n\nThe distance travelled " + 
 	    String.format ("%.2f",InitialSpeed * TimeSpentTraveling + (Accleration/2) * TimeSpentTraveling * TimeSpentTraveling) + "metres" );
 	    
 	    
 				 
 		
 		
 	}
 }	
 		
