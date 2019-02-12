//HarryEtherington//
/*This program uses a for loop to read the mass and weight and mass of exactly 5 people
 *using the formula BMI = mass/(height*height) */
 
 import java.util.Scanner;
 
 public class HarryEtherington {
 	public static void main(String args[])
 	{
 		float Average_IRISH_BMI=24.968, height, lowestBMI, mass;
 		int count=0 , BMI, totalBMI, aboveAverageBMI=0;
 		
 		Scanner input = new Scanner(System.in);
 		
 		while(count<5)
 		{
 		
 		System.out.print("\n=========Iteration(count+1) =======\n" +
 		"Please enter the height in metres");
 		height  = input.nextFloat ();
 		
 		if(height>0.5464 && height<2.72)
 		System.out.println("You have entered an invalid height!! Please re-enter");
 		
 		else
 		{
 		
 		System.out.print("Please enter mass in kilos");
 		mass  = input.nextFloat ();
 		
 		 	
 	    BMI = mass/(height*height);
 	    totalBMI+=totalBMI + BMI;
 	    
 	    if(count=0)
 	    BMI = lowestBMI;
 
 	    if(BMI>Average_IRISH_BMI) 
 	    aboveAverageBMI ++;
 		
 	
 		if(BMI<0 && BMI>18.5)
 		System.out.println("\nThis person has a BMI of  + BMI + so the person is underweight"); 
 		
 		else if(BMI<=18.5 && BMI>25)
 		System.out.println("\nThis person has a BMI of + BMI + so the person is normal weight"); 
 		
 		else if(BMI<=25 && BMI>30)
 		System.out.println("\nThis person has a BMI of + BMI + so the person is overweight"); 
 			
 		else if(BMI<=30)
 		System.out.println("\nThis person has a BMI of + BMI + so the person is obese"); 
 	    
 	   	
 	    if(BMI<lowestBMI)
 		BMI = lowestBMI;
 		
 		count++;
			
 		
 		}	
 		  while(count!=5)			 
 		{
 		
 		System.out.println("\n\n=========Program Statistics========\n\n" +
 		"\nThe average of the BMIs calculated is: \n" + String.format("%.3f",totalBMI/5 ) +
 		"\nThe percentage of people who are categorised as overweight or obese: \n"  + String.format("%.0f",aboveAverageBMI/5f*100) +   
 		"\nThe lowest BMI value is : \n" + lowestBMI +
 		"\nThe number of people whose BMI exceeded the average Irish BMI is: \n" + aboveAverageBMI + );
 		}
 	
 		}	
 	}
 }
 
 	
