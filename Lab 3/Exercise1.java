//Exercise1.java
/* This program reads in 3 user-supplied numbers and uses the arithmetic operators
 *to perform some calculations on them*/
 
 import java.util.Scanner;
 
 public class Exercise1 {
 	public static void main(String args[])
 	{
 		float a, b, c;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Please enter any number: ");
 		a = input.nextInt ();
 		
 		System.out.print("Please enter another number: ");
 		b = input.nextInt ();
 	
 	    System.out.print("Please enter a third number: ");
 	    c = input.nextInt ();
 		
 		System.out.println("\n\nThe value of expression a * b % c -4 + 6 =3 \n\n " +
 		a + " + " + b + " + " + c + " is " + (a + b + c) + "\n" +
 	    a + " - " + b + " - " + c + " is " + (a - b + c) + "\n" +   		
        a + " x " + b + " x " + c + " is " + (a * b * c) + "\n" +
        a + " / " + b + " / " + c + " is " + (a / b / c) + "\n" +
        a + " % " + b + " % " + c + " is " + (a % b % c));
           
 	
 
           
 	  }    
           
 }
 	
 
 
