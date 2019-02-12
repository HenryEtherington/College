//Exercise3.java//
/*This program coverts area in inches to 
 *area in inches and feet*/
 
 import java.util.Scanner;
 
 public class Exercise3 {
 	
 	public static void main(String[]args)
 	{
 	
 	float inches;
 	final float CONVERSION_FACTOR = 0.0833f ;
 	
 	
    Scanner input = new Scanner(System.in);
    
    System.out.print ("Please enter the total number of inches: ");
    inches = input.nextInt ();
    
    System.out.println("\n\nThe area in inches " +
    String.format ("%.2f",CONVERSION_FACTOR*inches) + "feet and inches ");
    	
    	
    
    
     	}
 }