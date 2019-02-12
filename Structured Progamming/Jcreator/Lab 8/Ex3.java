//Ex3.java//
/*This program displayes a end of each year balance 
 *given a 10000 Euro balance at a interest rate of 3% and
 *a 12000 Euro withdraw after that year's interest*/

public class Ex3 {
 	public static void main(String args[])
 	{   
 		float rate=3, balance=100000;
 		int year=1;
 				
 		
 		while(balance>=12000)
 		{
 			balance += (balance*3)/100 - 12000;
 			System.out.println("Balance at the end of the year:  " + year +  " is  EUR" +
 			                    String.format("%.2f",balance));
 			
 			year++;	
 		
 	
     	}	
 	}
 }