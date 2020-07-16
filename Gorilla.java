//Gorilla is an abstract class that describes general properties of a gorilla

public abstract class Gorilla {
	//gorilla has x and y coordinates denoted as X and Y respectively
	private double X;
	private double Y;
	
	//Bellow are setters for gorilla's x and y coordinates
	public void setY(double Y) {
		this.Y = Y;
	}
	
	public void setX(double X) {
		this.X = X;
	}
	
	//Bellow are getters for gorilla's x and y coordinates
	public double getY() {
		return this.Y;
	}
	
	public double getX() {
		return this.X;
	}
	
	//Gorilla has attack method that creates and throws a banana. It is invoked when on player's turn
	public Banana attack(double angle, double velocity) {
		Banana banana = new Banana(angle, velocity);
		return banana;
	}
	
//  Dance is some animation of a Gorilla. This method is invoked when 
//  gorilla successfully hit another gorilla with a banana.
//  I am using overloading to create the same method name. Gorilla will also dance if it wins. 
	
//	public void dance(boolean hit) {
//	If Player hit another Player, then dance
//	}
	
//	public void dance(boolean win) {
//	if 	Player won, then dance
//	}
}
