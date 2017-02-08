/*Name : Colin Redpath
  Date : 2-4-17
  Class: CSC-251
*/
 

import javax.swing.JOptionPane;

//This program will display the Ship Class data  
public class ShipInfoDemo
{
	public static void main (String[] args)
	{
		//Opening display message
		JOptionPane.showMessageDialog(null,"Welcome. This program allows the user to document information about a Ship.");
		
		//Create an instance of the Ship class and assign it to an array
		Ship shipInfo[] = new Ship[3];
		
		//Get name and ship creation date from the user
		String name = JOptionPane.showInputDialog("Please enter the Name of the Ship.");
		
		String year = JOptionPane.showInputDialog("Please enter the year the Ship was made.");
		
		//Assign the first element in the array to a Ship object, initializing the fields with input
		shipInfo[0] = new Ship(name, year);
		
		//Get passenger capacity from the user
		String input = JOptionPane.showInputDialog("Please enter the passenger capacity of the " + name + ".");
		
		//Parse string input into integer data type
		int passengers = Integer.parseInt(input);
		
		//Assign second element in the array to a CruiseShip object, initializing the fields with input
		shipInfo[1] = new CruiseShip(name, passengers);
		
		//Get cargo capacity from the user
		input = JOptionPane.showInputDialog("Please enter the cargo capacity of the "  + name + " (it will be diplayed in tons).");
		
		//Parse string input into integer data type
		int cargo = Integer.parseInt(input);
		
		//Assign the third element of the array to a CargoShip object, initializing the fields with input
		shipInfo[2] = new CargoShip(name, cargo);
		
		//Generate output by stepping through the array and calling the toString methods of each object
		for (int i = 0; i < shipInfo.length; i++)
		{
			JOptionPane.showMessageDialog(null, shipInfo[i] );
		}
		
		//Exit the program
		System.exit(0);
		
	}
	
}