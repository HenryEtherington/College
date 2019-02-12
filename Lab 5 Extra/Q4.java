//Q4.java//
/*This program determines whether a number is positive
 *negative and then whether is ends in a zero and the
 *correspoding ASCII code for the number*/
 
 import util.javaScanner;
 
 public class { Q4
 	public static void main (String args[])
 	{
 	int number;		
 Scanner input = new Scanner(System.in)
 	
 	System.out.print("Please enter a whole positive number")
 	number = input.nextInt ();
 
 	if(number<=0)
	System.out.println("\nError: the number entered is not positive .... exiting program now");
 
    else {
    
    
    if(number%2==0)
 		System.out.println("\nThe number entered is zero\n");
 	else
 		System.out.println("\nThe number you entered is odd\n");
 	
 	if (number%10==0)
 		System.out.println("\nThe number entered ends in zero\n");
 	else
 		System.out.println("\nThe number you does not end in zero\n");
 	
 	if (number>=1 && number<=255)
 		System.out.println("\nThe corresponding ASCII code for the number is\n" + (char)number);
 	else
 		System.out.println("\nThere is no correspoding ASCII code for this number\n");	
 	}
 }
 }