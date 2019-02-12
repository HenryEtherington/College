//TaskControlledWhile2.java//
/*This program uses a task-controlled while loop which takes an intial investment
 *amount of 5000 Euros and a user-supplied interest rate and displays the compounded
 *balance at the end of each year until the balance exceeds 2000 Euros*/
 
 
 public class TaskControlledWhile2 {
 	public static void main(String args[])
 	{   
 		float rate, balance=1000;
 		int year=1;
 		
 		Scanner input= new Scanner(System.in);
 		
 		System.out.print("Please enter the interest rate: ");
 		rate = input.nextFloat ();
 		
 		System.out.println("\n\n");
 		
 		
 		while(balance<=2000)
 		{
 			balance += (balance*rate)/100;
 			System.out.println("Balance at the end of the year:  " + year + " is EUR" +
 			                    String.format(".2f",balance));
 			
 			year++;	
 		}
 		
 	
 	}
 }