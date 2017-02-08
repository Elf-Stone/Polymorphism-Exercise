/*Name : Colin Redpath
  Date : 2-4-17
  Class: CSC-251
*/
  
//This class can be used to display information about a Ship, and extends the Ship class 

public class CargoShip extends Ship
{
	private int cargo;
	
	//Constructor initializing the class fields
	public CargoShip(String name, int c)
	{
		super(name);
		cargo = c;
	}
	
	//A to string method to override the Ship Class toString method displaying only the ship name and Cargo capacity 
	public String toString()
	{
		return "Ship: " + super.getName() + " can carry " + cargo + " tons of Cargo.";
	}
}