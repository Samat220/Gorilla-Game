//Building class describes the attributes of buildings

public class Building {
	//Each building has a height, width, and colour
	private double height;
	private double width;
	private String colour;
	
	
	//Bellow are setters for building's height, width and colour 
	private void setHeight(double height) {
		this.height = height;
	}
	
	private void setWidth(double width) {
		this.width = width;
	}
	
	private void setColour(String colour) {
		this.colour = colour;
	}
	
	
	//Bellow are getters for building's height, width and colour
	private double getHeight() {
		return this.height;
	}
	
	private double getWidth() {
		return this.width;
	}
	
	private String getColour() {
		return this.colour;
	}
	
	public Building (double height, double width, String colour) {
		setHeight(height);
		setWidth(width);
		setColour(colour);
	}
	
	
}
