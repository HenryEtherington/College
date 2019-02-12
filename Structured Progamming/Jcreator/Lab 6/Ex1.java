//Ex1.java
/*This program converts Fahrenheit temperature to degress Celcius
 *correct to three decimel places*/
 
 import java.util.Scanner;
 
 public class Ex1{
 	public static void main(String args[])
 		
 	{
 	
 		float FahrenheitTemperature, Celcius, TotalCelcius=0;
 		int TotalConversions=0, TotalOver30=0,TotalUnder10=0,TotalAtLeast20=0;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Please enter the first Fahrenheit temperature (below -459.67 to exit ):  ");
 		FahrenheitTemperature = input.nextFloat ();
 	
 		while(FahrenheitTemperature >= -459.67f)
 			{
 		
 		Celcius = 5/9f* (FahrenheitTemperature - 32);
 	    System.out.println("The equivalent Celcius temperature is " + String.format("%.3f",Celcius));
     
     	TotalCelcius += Celcius;
 	    TotalConversions ++;
 			
 			if(Celcius > 30)
						TotalOver30++;
					
					else if(Celcius < 10)	
					    TotalUnder10++;
					    
					if(Celcius >= 20)
						TotalAtLeast20++;
		
		 System.out.print("\nPlease enter another Fahrenheit temperature (below -459.67 to exit): ");
		 FahrenheitTemperature = input.nextFloat();					
 		}	
 			if(TotalConversions!=0)			
				System.out.println("\n\n\n=====Program Results=====" +
				"\n\nTotal conversions performed: " + TotalConversions + 
				"\nAverage Celcius temperature: " + String.format("%.3f",TotalCelcius/TotalConversions) + "C" + 
				"\nTotal Celcius temperatures > 30C: " + TotalOver30 + 
			    "\nTotal Celcius temperatures < 10C: " + TotalUnder10 +
			    "\nPercentage Celcius temperatures >= 20C: " + 
				String.format("%.0f",(float)TotalAtLeast20/TotalConversions*100) + "%");
 			
 			else
				System.out.println("\nNo conversions were performed....Goodbye");		
 	 }
 	
 }