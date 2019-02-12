//Ex2.java
/*This program asks the user for a username and password assuming
 *that the username is "t0012345" and that the correct password is
 *"java" . A Invalid username/password appears if the first two combinations
 *are incorrect. A banned message will appear if the username/password are entered 
 *incorrectly for the third attempt*/
 
 import java.util.Scanner;
 
 public class Ex2 {
 	public static void main(String args[])
 		
 	{
   String username, password;	
   int attempts=3;
   			
  Scanner input = new Scanner(System.in);
  
  while(attempts >= 1)
  {
  
  System.out.print("Please enter your username");
  username = input.nextLine ();	
  	
  System.out.print("Please enter your password");
  username = input.nextLine ();	
	
  attempts--;
  
  if(username =t0012345 && password =java);
  {System.out.println("\n\nWelcome to the system!\n\n");
  break;
  
  }
  else 
  {
  	if(attempts >= 1)
  System.out.println("\nInvalid username/password combination. " +
  	 attempts + " attempts remaining\n");
 	
  else 
  System.out.println("\nInvalid username/password combination. +
  	" IP address noted. Banned for 24 hours");
 
               }
  
  	
 	
 	
 	
 	
        }
  	}
 }