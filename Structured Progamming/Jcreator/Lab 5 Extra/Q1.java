//Q1.java//
/*This program calculates the viscocity of a liquid as
 *given by the formula viscosity = 2(Density of ballbearing - Density of fluid)ga.a /9v*/
 import java.util.Scanner;
 
 public class Q1java {
 	public static void main(String args[])
 	{    
 		 float DensityOfBallBearing, DensityOfFluid, RadiusOfBallBearing;
 		 final float CONVERSION_FACTOR  = 9.8E-1F; 
 		
 		Scanner input = new Scanner (Systen.in);
 		
 	 		System.out.print("Please enter the density of the ball-bearing: ");
 		DensityOfBallBearing = input.nextFloat ();
 			 	
	 		System.out.print("Please enter the density of the fluid: ");
 		DenstiyOfFluid = input.nextFloat ();
 
 			System.out.print("Please enter the radius of the ball-bearing: ");
 		RadiusOfBallBearing = input.nextFloat ();
 		
 		System.out.print("Please enter the velocity of the ball-bearing: ");
       VelocityOfTheBallBearing = input.nextFloat ();
 		
 if  ((DensityOfBallBearing >-1 & (DensityOfFluid >-1 || RadiusOfBallBearing >-1 || VelocityOfBallBearing >-1 ')' 
 System.out.println("\n\n**********Viscocity Calculator***********\n\nViscosity "
 + String.format("%.2f",(2 * DensityOfBallBearing - DensityOfFluid ) *  CONVERSION_FACTOR * RadiusOfBallBearing * RadiusOfBallBearing  / 9 * VelocityOfBallBearing ) + " Pa ");
 		
     else 
 		System.out.println("\nError! The density of the ball-bearing must be positive");
 	 

}
    }
