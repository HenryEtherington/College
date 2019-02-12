//Q2.java//
/*This program determines whether or not four coordinates
 *makes a square*/
 
 import java.util.Scanner;
 
 public class Q2{
 	public static void main (String args[])
 
 	   float x-UpperLeftPoint, y-UpperLeftPoint, x-BottomRightPoint, y-BottomRight point;
 		
 	   Scanner input = new Scanner (System.in);
 	   
 	   	System.out.print("Please enter the x-coordinate of the upper-left point: ");
 		x-UpperLeftPoint= input.nextFloat (); 
 			
 			System.out.print("Please enter the y-coordinate of the upper-left point: ");
 		y-UpperLeftPoint= input.nextFloat ();
 			
 	 	   	System.out.print("Please enter the x-coordinate of the bottom-right point: ");
 		x-BottomRightPoint= input.nextFloat (); 
 			
 			System.out.print("Please enter the y-coordinate of the bottom-right point: ");
 		y-BottomRightPoint= input.nextFloat ();		
 
 	  if(character >= '0' && character <=  '9')
 	  System.out.println("\nYou entered a digit");
 	  
 	  else
      System.out.println("\nError! The bottom right y-coordinate is invalid......quitting program");
 
 	}
 }