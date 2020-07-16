import java.util.ArrayList;

//This is map class that determines the map of the game where buildings and Players are placed

public class Map {
	//Map consists of an array list "city" of buildings
	//Map has certain boundary for x and y
	private ArrayList<Building> city;
	private Integer xBoundary;
	private Integer yBoundary;
	
	public Map(ArrayList<Building> city, Integer xBoundary, Integer yBoundary) {
		setCity(city);
	}
	
	//Bellow are setter and getter for the Arraylist city
	public void setCity(ArrayList<Building> city) {
		this.city = city;
	}
	
	public ArrayList<Building> getCity() {
		return this.city;
	}
	
	
}
