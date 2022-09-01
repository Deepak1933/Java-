package oops;
// Example for abstract class and abstract method 
abstract class Vehicle 
{
	public abstract int getNoOfWheels();
	public static void main(String[] args)
{
 Bus b = new Bus();
 System.out.println(b.getNoOfWheels());
 Auto a = new Auto();
 System.out.println(a.getNoOfWheels());
 }
}

class Bus extends Vehicle
{
	public int getNoOfWheels() 
	{
		return 6;
	}
}
	class Auto extends Vehicle
	{
		public int getNoOfWheels() 
		{
			return 3;
		}
	}

	
		
	


