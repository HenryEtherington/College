//Q6.java//
/*This program determines the amount of money a
 *customer must pay for parking in a parking lot*/
 
 import java.utilScanner;
 
 public class Q6 {
 	public class static void main (String args[])
 	{
 	  
 	    float time,cost=0;
 	
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Please enter the amount of time in hours you spent parking(in minutes)")
        time = input.nextFloat ();
	
		if (time < 0)
			    System.out.println("\nError: you have entered an invalid time value ... exiting program");
			else if (time <= 60)
			    cost = time * 0.60f;
			else if (time <= 120)
			    cost = 1 * 0.60f + (time - 60) * 0.50f;
			else
			    cost = 1 * 0.60f + 2 * 0.50f + (time - 180) * 0.40f;
			  
            if(time >= 0)
    			System.out.println("\nTotal cost of parking for " + time + " hours is EUR" + String.format("%.2f",cost));