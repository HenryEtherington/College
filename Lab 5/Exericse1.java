//Exercise1
/*This program asseses whether or not a person
 *is elgable for the Gardai*/
 import java.util.Scanner;
 
 public class Exercise1 {
 	public static void main(String args[])
 	{		
 	 int age;  
 	 float height, weight;
 	 String gender, record, grade, course="";
 	 
 	 Scanner input = new Scanner (System.in);
 	 	
 	 	System.out.print("Please enter your age: ");
 	 	age = input.nextInt ();
 	 	
 	 	System.out.print("Please enter your height: ");
 	 	height = input.nextFloat ();		
 
    	System.out.print("Please enter your weight: ");
 	 	weight = input.nextFloat ();
 	 			
     	input.nextLine();
     	
    	System.out.print("Please enter your gender: ");
 	 	gender = input.nextLine ();		
 
 	    System.out.print("Do you have a criminal record: ");
 	   record = input.nextLine();		
 
        System.out.print("Did you recieve at least a D grade in pass Irish in the leaving cert (Y or N): ");
 	 	grade  = input.nextLine();		

 		if (grade.equals("n"))
				{
					System.out.print("Do you commit to taking a 10 week Irish course " + 
				    "on application (y or n)? ");
					course = input.nextLine();
				}
							
			if (age>=18 && age<35 && ((height>=1.85 && gender.equals("m")) || (height>=1.6 && gender.equals("f")))
				&& weight<100 && record.equals("n") && (grade.equals("y") || course.equals("y")))			
				System.out.println("\nCongratulations - You are eligible to join the Gardai!");
			else		
				System.out.println("\nCommiserations - You are not eligible to join the Gardai");
					
 
 }
  }