//HarryEtherington.java//
/*This program checks whether three lengths are
 *capable of forming a valid triangle, if it is 
 *a equillateral, isosceles or a scalene or if it is right-angled*/
 
 public class HarryEtherington {
 	public static void main(String args[])
 	{
 		float LengthOfFirstSide, LengthOfSecondSide, LengthOfThirdSide;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Please enter the length of the first side(the longest side)");
 		LengthOfFirstSide = input.nextFloat ();
 		
 		System.out.print("Please enter the length of the second side");
 		LengthOfSecondSide = input.nextFloat ();
 		
 		System.out.print("Please enter the length of the third side");
 		LengthOfThirdSide = input.nextFloat ();
 		
 		if (LengthOfFirstSide + LengthOfSecondSide < LengthOfThirdSide)
 	   	System.out.println("\n\nThe lengths entered cannot form a valid triangle .... exiting program now\n\n");
 	   	{
 	   	
 	   	if(LengthOfFirstSide = LengthOfSecondSide = LengthOfThirdSide)
 	   	System.out.println("\n\nThe triangle formed is equilateral\n\n");		
 	   	
 	   
 	   	else if(LengthOfFirstSide - LengthOfThirdSide = LengthOfThirdSide - LengthOfSecondSide)
 	   	System.out.println("\n\nThe triangle formed is isosceles\n\n");
 	   	
 	    else if(LengthOfFirstSide - LengthOfSecondSide = LengthOfThirdSide - LengthOfSecondSide)
 	   	System.out.println("\n\nThe triangle formed is isosceles\n\n");
 	   	
 	    else if(LengthOfThirdSide - LengthOfFirstSide = LengthOfThirdSide - LengthOfSecondSide)
 	   	System.out.println("\n\nThe triangle formed is isosceles\n\n"); 
 	   
 	   	
 	    else if(LengthOfFirstSide < LengthOfSecondSide < LengthOfThirdSide)
 	   	System.out.println("\n\nThe triangle formed is scalene\n\n");
 	   	
 	    else if(LengthOfFirstSide < LengthOfSecondSide > LengthOfThirdSide)
 	   	System.out.println("\n\nThe triangle formed is scalene\n\n");
 	   	
 	   	else if(LengthOfFirstSide > LengthOfSecondSide < LengthOfThirdSide)
 	   	System.out.println("\n\nThe triangle formed is scalene\n\n");
 	   	
 	    else if(LengthOfFirstSide > LengthOfSecondSide > LengthOfThirdSide)
 	   	System.out.println("\n\nThe triangle formed is scalene\n\n");	
 	   
 	   		
 	    if (LengthOfFirstSide * LengthOfFirstSide = (LengthOfSecondSide * LengthOfSecondSide + LengthOfThirdSide * LengthOfThirdSide))
 	   	System.out.println("\n\nThe triangle is right-angled\n\n");
 	   	{
 	   	
 	    else if (LengthOfFirstSide * LengthOfFirstSide < (LengthOfSecondSide * LengthOfSecondSide + LengthOfThirdSide * LengthOfThirdSide))
 	    System.out.println("\n\nThe triangle is not right-angled\n\n");
 	   	}
 	    if (LengthOfSecondSide + LengthOfThirdSide < LengthOfFirstSide)
 	   	System.out.println("\n\nThe lengths entered cannot form a valid triangle .... exiting program now\n\n");
 	   	
 	  }		
 	}
 }
 
 