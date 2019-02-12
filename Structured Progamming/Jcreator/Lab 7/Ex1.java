//Ex.java
/*This program uses a counter-conrolled while loop to
 *read the weights of five people exactly*/
 
 import java.util.Scanner;
 
 public class Ex1 {
 	public static void main(String args[])
 	
 		{
 		float Weight, TotalWeight=0; 			
 		int count=0, TotalAtleast80=0;
 		 			
 			while(count <5)
 			{
 		
 		
 			
 			System.out.print("Please enter the weight of person " + (count+1) + ": ");
 			Weight = input.nextFloat ();
 		
 		   	if(Weight >= 80)
 		   	TotalAtleast80++;
 		   	
 		    TotalWeight += Weight;
 		     		
 		     	
			 count++;  			
 			}
 			System.out.println("\n\nThe average weight of person is " + String.format(".2f",TotalWeight/5) + " kg " +
 				"\n\nPercentage >= 80kg: " + String.format(".2f",TotalAtleast80/5f*100) + "%" );
 	
 	}
 }