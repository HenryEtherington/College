//Ex3.java
/*This program uses a counter-conrolled while loop to
 *read the weights of five people exactly*/
 
 import java.util.Scanner;
 
 public class Ex3 {
 	public static void main(String args[])
 	
 		{
 		float Weight, Heaviest=0, Lightest=0, TotalWeight=0; 			
 		int count=0, TotalAtleast80=0;
 		 			
 			while(count <5)
 			{
 		
 		
 			System.out.print("Please enter the weight of person " + (count+1) + ": ");
 			Weight = input.nextFloat ();
 		
 		
 		
 		   	
 		   	if(Weight >= 80)
 		   	TotalAtleast80++;
 		   	
 		    TotalWeight += Weight;
 		     		
 		    	{
 		  
 		   if(count=0)
 		   {
 		   	Weight = Lightest;
 			Weight = Heaviest;
 		   }	
 		   else
 		   {
 		   	if (Weight > Lightest)
 			Weight = Heaviest;
 			
 			else if (Weight < Heaviest)
 			Weight = Lightest;
 		
 			}	
			 count++;  			
 			}
 			System.out.println("\n\nThe average weight of person is " + String.format(".2f",TotalWeight/5) + " kg " +
 				"\n\nPercentage >= 80kg: " + String.format(".2f",TotalAtleast80/5f*100) + "%" +
 				"\n\nThe heaviest person is " + Heaviest + " kg " +
 				"\nThe ligthest person is " + Lightest + " kg ");
 	
 	}
 }