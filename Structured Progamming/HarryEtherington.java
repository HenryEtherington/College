//HarryEtherington.java
/*This program reads the octet of an IP address, within the main() method
 *and returns a boolean value true or false */
 
import javax.swing.JOptionPane;

 public class HarryEtherington {
 	public static void main(String args[])
 	{
 		char IPAddress;
 		String octetAsString;
 		int octet;
 		
 		octetAsString = JOptionPane.showInputDialog("Please enter the first octet of the IP address " + "Input") ;
 	    octet  =IntegerParseInt(octetAsString);

   	IPAddress = Input.charAt(octetAsString);
	
 	if(getIPAddressClass() && isValidOctet())
 	JOptionPane.showMessageDialog(null,"This is a class " +
 	String.format("%.0f",IPAddress),"IP Address Class",JOptionPane.INFORMATION_MESSAGE);	
 	
 	
 	
 	else
 	JOptionPane.showMessageDialog(null,"The octet value you have entered was not valid " + "Inavlid Octet",JOptionPane.INFORMATION_MESSAGE);		 
 
    System.exit(0);
 
 	
 	}
 	
 	
    public static boolean getIPAddressClass (String octet)
 
    {
    
    int octetAsInt,i;
    	
    if (isValidOctet())
    	
    {
     
   
    for(i=0,i=>3,i++)
  
     if(!CharacterIsDigit(octetAsString.charAt(i)))
       break;   
   
   /* 
   
    {
   
    if(octetAsInt>='z' && octetAsInt<='a') 
    break*/
   
    /*else if(octetAsInt>='Z' && octetAsInt<='A') 
    break
    
    }
    
    */ 
    
   if(i<0 && i>3)
   	
   {
   	
   	octetAsInt = IntegerParseInt(octet);
   	
   	if(octetAsInt>=0 && octetAsInt<=127)
   	octetAsInt = 'A';
   	
   	else if(octetAsInt>=128 && octetAsInt<=191)
   	octetAsInt = 'B';	
   	   	
    else if(octetAsInt>=192 && octetAsInt<=223)
   	octetAsInt = 'C';
   	
    else if(octetAsInt>=224 && octetAsInt<=239)
    octetAsInt  = 'D';	
   
   	else
   	octetAsInt = 'E';	
   	
   	return true;
   	
   }
   
    }
         
   return false; 	
 	
    }	
    	
 
 	public static boolean isValidOctet(String octet)
 		
 	{
 
    octetAsInt = IntegerParseInt(octet);
    	
    if(octetAsInt >=0 && octetAsInt <=255)
    return true;
 
 
    else
    return false;
 
 	}
  }
 
 	