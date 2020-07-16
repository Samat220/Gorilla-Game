import java.util.ArrayList;

//The game class describes how game is created and run

public class Game {
	
	//Gorilla game has 2 players and a map
	Player player1;
	Player player2;
	Map map;
	
	
	//Bellow are setters and getters for two players and the map
	public void setPlayer1() {
		this.player1 = new Player(0, 1);
	}
	
	public Player getPlayer1() {
		return this.player1;
	}
	
	public void setPlayer2() {
		this.player2 = new Player(0, 2);
	}
	
	public Player getPlayer2() {
		return this.player2;
	}
	
	public void setMap(ArrayList<Building> city, Integer xBoundary, Integer yBoundary) {
		this.map = new Map(city, xBoundary, yBoundary);
	}
	
	public Map getMap() {
		return this.map;
	}
	
	public void runGame() {
		//method for actually running the game
		//It would involve registering hits, updating scores, destroying buildings, determining the win
	}
}
