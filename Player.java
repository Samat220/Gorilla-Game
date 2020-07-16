//Player class extends gorilla class as every player plays as a gorilla
//It inherits gorilla's characteristics and methods
public class Player extends Gorilla {
	
	//Additionally players have playerNumber and Player score
	private Integer playerNumber;
	private Integer score;
	
	//Bellow are setter and getter for the Player Number
	public void setPlayerNumber(Integer playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	public Integer getPlayerNumber() {
		return this.playerNumber;
	
	}
	
	//Bellow are setter and getter for the Player score
	public void setScore(Integer score) {
		this.score = score;
	}
	
	public Integer getScore() {
		return this.score;
	}
	
	//When player is created it has score and player Number added to the player
	public Player(Integer score, Integer playerNumber) {
		setScore(score);
		setPlayerNumber(playerNumber);
	}
	
	//Player inherits Gorilla's attack method, but overrides as it changes the direction depending on the player number
	public Banana atack(double angle, double velocity) {
		Banana banana = new Banana(angle, velocity);
		//methods for different players would changes the angle to account for their position
		return banana;
	}
	
	
}
