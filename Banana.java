//Class banana describes banana objects that are used as a weapon in the game

public class Banana {
	//Each banana has an angle and velocity set by the player at the moment of creaion
	private double angle;
	private double velocity;
	
	public Banana (double angle, double velocity) {
		setAngle(angle);
		setVelocity(velocity);
	}
	
	//Bellow are setters and getters for Angle and Velocity
	private void setAngle(double angle) {
		this.angle = angle;
	}
	
	private void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	
	private double getAngle() {
		return this.angle;
	}
	
	private double getVelocity() {
		return this.velocity;
	}
}
