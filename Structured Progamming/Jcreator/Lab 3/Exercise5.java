//Exercise5.java
/*This program calculates the gravitational force on one
 *object by the formula F = Gm1.m2/d.d    */
 
 import java.util.Scanner;
 	
 	public class Exercise5 {
 	
    	public static void main(String[]args)
 	  {
 	      float MassOfTheObject, MassOfSecondObject, DistanceInMetresBetweenTheObjects;
 	      final float CONVERSION_FACTOR  = 6.67300E-11f;
 	  	 	
 	 
 	  Scanner input = new Scanner (System.in);
 	  
 	  System.out.print("Please enter the mass in kg of the first object: ");
 	  MassOfTheObject = input.nextFloat  () ;
 	  
 	  System.out.print("Please enter the mass in kg of the second object: ");
 	  MassOfSecondObject = input.nextFloat    ();
 	  
 	  System.out.print("Please enter the distance in metres between the object: ");
 	  DistanceInMetresBetweenTheObjects = input.nextFloat ();
 	  
 	  System.out.println("\n\n**********Results of program***********\n\nGravitational Force " +
 	  String.format(CONVERSION_FACTOR*MassOfTheObject * MassOfSecondObject / DistanceInMetresBetweenTheObjects * DistanceInMetresBetweenTheObjects ) + " newtons ");
 	  
 	  
 	  
 	}
 }