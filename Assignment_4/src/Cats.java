import java.util.ArrayList;

public class Cats extends Mammals{
	protected int numberOfLives;
	
	public Cats(String latinName, int gestationTime, int numberOfLives) {
		super(latinName, gestationTime);
		this.numberOfLives = numberOfLives;
	}
	/*Hämtar info/*
	 * 
	 */
	public String getInfo() {
		String info = "latin name: " + latinName + " gestation time is " + gestationTime + ", and it has " + numberOfLives + " lives";
		return info;
	}
	public void setNumberOfLives(int lives){
		this.numberOfLives = lives;
	}
	public int getNumberOfLives(){
		return numberOfLives;
	}
	public void makeArray(){
	}
}
