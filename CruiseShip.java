/*Name : Colin Redpath
  Date : 2-4-17
  Class: CSC-251
*/
  
//This class can be used to display information about a ship, and extends the Ship class

public class CruiseShip extends Ship
{
	private int maxPassengers;
	
	//Constructor initializing the class fields
	public CruiseShip(String name, int p)
	{
		super(name);
		maxPassengers = p;
	}
	
	//A toString method that overrides the Ship Class toString method that displays only the ship name and passenger capacity
	public String toString()
	{
		return "Ship: " + super.getName() + " can carry " + maxPassengers + " passengers.";		
	}
}