//Ex2.java//
/*This program uses a task-controlled while loop to determine the lowest
 *whole power of two that exceeds 5000*/
 
  public class Ex2 {
 
 	public static void main(String args[])
 	{
 		int power=0;
 		
 		while(Math.pow(2,power)<=5000)
 		{
 		  power++;
 		}
 		
 		System.out.println("\nThe lowest whole power of two that exceeds 5000 is " + power);

 	}
 }