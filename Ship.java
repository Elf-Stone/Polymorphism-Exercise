/*Name : Colin Redpath
  Date : 2-4-17
  Class: CSC-251
*/
  
//This class can be used to Display information about a ship
public class Ship
{
	
	private String shipName;
	private String shipYear;
	
	//Constructor assigning parameters to the fields
	public Ship(String name, String year)
	{
		shipName = name;
		shipYear = year;
		
	}
	
	//Constructor assigning only the name field to the parameter
	public Ship(String name)
	{
		shipName = name;
		shipYear = null;
	}
	
	//A toString method to override the Object Class toString method that displays only the ship name and year it was built
	public String toString()
	{
		return "The ship name is " + shipName + ", and it was made in " + shipYear + ".";
	}
	
	//Method returning the name of the ship
	public String getName()
	{
		return shipName;
	}
	
	
}
