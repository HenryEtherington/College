//DataSentinelFor.java
/*This program uses a loop which reads in an arbitrary number of names
 *It keeps track of the longest name, the shortest name and it determines the
 *percentage of names that contain at least 17 characters*/

import java.util.Scanner;

public class DataSentinelFor {
public static void main (String args[])

{

String name,longestName="",shortestName="";
int atLeast17=0,i;

Scanner input = new Scanner(System.in);

for(i=0;i<100000;i++)
{

System.out.print("Please enter a name (hit return to exit) : " );
name = input.nextLine();

if(name.equals(""))
break;

if(i==0)
{
      longestName = name;
      shortestName = name;
}
else
if(name.length()>longestName.length())
  longestName = name;

else if (name.length()<shortestName.length())
shortestName = name;

if(name.length()>=17)
atLeast17++;

}

if(longestName.length () == 0)
System.out.println("\nYou enterd no names at all");

else
System.out.println("\nThe longest name entered is " + longestName +
                   "\nThe shortest name entered is " + shortestName +
                   "\nThe percentage of names >=17 in length is " +
                   String.format(".2f",((float)atLeast17/i)*100));
  }
}