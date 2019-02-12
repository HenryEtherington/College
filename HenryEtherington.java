//HenryEtherington.java
/*This program initializes two parrel arrayas with date for the mean monthly temperature and
 *then processes those arrays in a GUI interface */

//packages required go here
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.*;

public class HenryEtherington{
	
    //array(s) creation and other global references go here
	
	String months = {January, February, March, April, May, June, July, August, September, October, November, December };
	int meanTemperature = {7.3, 7.2, 8.1, 9.3, 11.5, 13.6, 15.3, 15.4, 13.9, 11.5, 9.3, 7.8 };
	String month[] = new String [12];
	int meanTemp[] = new int [12];
	JFrame jFrameWindow;
    JButton sortData, generateStats;
	                 	             
	public HenryEtherington()
		
		{	                   
			 //GUI creation code + event-handler registration
			
			jFrameWindow = new JFrame ("Valentia Temperatures");
			FlowLayout flowLayout = new FlowLayout();
			
			jFrameWindow.setLayout(flowLayout); 
			jFrameWindow.setSize(300,100);
			jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			 
		
		   generateStats = new  JButton ("Generate Stats");
		   jFrameWindow.add(generateStats);
		   sortData = new JButton ("Sort Data");
		   jFrameWindow.add(generateStats); 	
		
		EventHandler handler = 	new EventHandler();
		generateStats.addActionListener(handler);	
		sortData.addActionListener(handler);	
			
			
		jFrameWindow.setVisible(true); 	
	}
	

	public static void main(String args[])
		{	 		
			HenryEtherington guiApp = new HenryEtherington();
		}	 	 			 
		
    public class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e)
	
		{								
			//Event-handling code	
			
		if(e.getSource()==generateStats)
			
		{
		
		String aboveAverage;
		int total = meanTemp[0], subHighestTemperature = 0, highestTemperature = meanTemp[0];
		
		
		for(int i = 1; i < 5; i++)
	
		{
			
		if(meanTemp[i] > highest )
		{
	
		highest = meanTemp[i];
		subHighestTemperature = i;
		
		}
		
		 if(meanTemp[i]>average)
		{
			
			aboveAverage = meanTemp[i];
			
		}	
			
			total += meanTemp[i];
			average  = (total/12f);
        
        	}	
		}		
		
		meanTemp[i] = meanTemperature[i];
	
	JOptionPane.showMessageDialog(null,"Average MMT: " + String.format("%.0f",average + "C" +
		                          "\nHighest MMT" + subHighestTemperature + "Month" + month[subHighestTemperature] +
		                          "\nList of months with above average MMT : "+ month[aboveAverage]  ,"Temperature Stats",JOptionPane.INFORMATION_MESSAGE));	
		}
    	   
       if (e.getSource()==sortData)
			
		{
			

			
	for(int i = 0; i < 11; i++)
		
	{	
				selectionSort(meanTemp[i]); 
				meanTemp[i] = meanTemperature[i];
					
		JOptionPane.showMessageDialog(null,"MMT"  +     "\nMonth" + "\n" +
			                         meanTemperature[i] + 
			                         "\n" + month + "Sorted Temperatures",JOptionPane.INFORMATION_MESSAGE);									
	}	
   }	
 }      			
	//Code for any user-defined methods required can go here
	public static void selectionSoft(String month[],int meanTemp[])

	{
	
	/*Font(String month,int monospaced);
	 jFrameWindow.setFont(12) */ 	
	String smallest, temp;
	int sub, temp2;
	
	for(int i = 0; i < 11; i++)
		
	{
		
	smallest = month[i];
	sub = i;
	
	
	for(int j = i + 1; j < 12; j++)
		
		
	if(month[j].compareTo(smallest) < 0)
	{
		
    smallest = month[j];
    sub = j;
    		 	
	}
	
	temp = month[i];
    month[i] = month[sub];
	month[sub] = temp;
	
	
	temp2 = meanTemp[i];
	meanTemp[i] = meanTemp[sub];
	meanTemp[sub] = temp2;
			
	} 
  }
}
	


