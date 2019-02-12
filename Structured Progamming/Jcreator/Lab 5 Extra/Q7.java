//Q7.java//
/*This program checks whether or not a letter
 *is apppropriate to be used as an initial */
 
 import java.utilScanner;
 
 public class Q7 {
 	public class static void main (String args[])
 	{
 	   String = first name, surname;
 	   char firstnameInitial,surnameInitial;
 	     
 	   Scanner input = new Scanner(System.in);
 		
 	System.out.print("Please enter your first name")
 	first name = input.nextLine ();
 	
    System.out.print("Please enter your surname")
 	surname = input.nextLine ();
    
    firstname = firstname.toLowerCase();
   	surname = surname.toLowerCase();
			
	firstnameInitial = firstname.charAt(0);
	surnameInitial = surname.charAt(0);

    
			if (firstnameInitial>='a' && firstnameInitial<='z' && 
			   surnameInitial>='a' && surnameInitial<='z')
			       System.out.println("\nYour initials are "  + firstnameInitial + "." + surnameInitial + ".");
			else
			   	   System.out.println("\nEither the initial of your first name or surname (or both) are invalid!");


		}
}

	
 	