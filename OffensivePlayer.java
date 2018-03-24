/** Program: Offensive Player Class
 * File: OffensivePlayer.java
 * Summary: This file creates the Offensive Player class and properties and getters/setters.
 *
 * Author: Keith Harrison
 * Date: 3/24/2018
 * 
 */


import javafx.scene.image.Image;

public class OffensivePlayer extends NFLPlayer {

	public int passingTouchDowns;

	public int rushingTouchDowns;

	public int passingAttempts;

	public int rushingAttempts;

	public double passingYards;

	public double rushingYards;

	public int fumbles;

	public int lostFumbles;

	public int completions;
	
	public double rating;

	public OffensivePlayer() {

	}

	public OffensivePlayer(double rating, int passingTouchDowns, int passingAttempts, int rushingAttempts, int rushingTouchDowns,
			double passingYards, double rushingYards, int fumbles, int lostFumbles, int completions) {
		this.rating = rating;
		this.passingTouchDowns = passingTouchDowns;
		this.rushingTouchDowns = rushingTouchDowns;
		this.passingAttempts = passingAttempts;
		this.rushingAttempts = rushingAttempts;
		this.passingYards = passingYards;
		this.rushingYards = rushingYards;
		this.fumbles = fumbles;
		this.lostFumbles = lostFumbles;
		this.completions = completions;
	}
	
	public OffensivePlayer(String url, String name, int age, double height, double weight, double rating, int passingTouchDowns, int passingAttempts, int rushingAttempts, int rushingTouchDowns,
			double passingYards, double rushingYards, int fumbles, int lostFumbles, int completions) {
		this.headshot = new Image(url, 78, 78, true, false);
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.rating = rating;
		this.passingTouchDowns = passingTouchDowns;
		this.rushingTouchDowns = rushingTouchDowns;
		this.passingAttempts = passingAttempts;
		this.rushingAttempts = rushingAttempts;
		this.passingYards = passingYards;
		this.rushingYards = rushingYards;
		this.fumbles = fumbles;
		this.lostFumbles = lostFumbles;
		this.completions = completions;
	}

	@Override
	public String toString() {
		return "Offensive Player: " + this.name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getPassingTouchDowns() {
		return passingTouchDowns;
	}

	public void setPassingTouchDowns(int passingTouchDowns) {
		this.passingTouchDowns = passingTouchDowns;
	}

	public int getRushingTouchDowns() {
		return rushingTouchDowns;
	}

	public void setRushingTouchDowns(int rushingTouchDowns) {
		this.rushingTouchDowns = rushingTouchDowns;
	}

	public int getPassingAttempts() {
		return passingAttempts;
	}

	public void setPassingAttempts(int passingAttempts) {
		this.passingAttempts = passingAttempts;
	}

	public int getRushingAttempts() {
		return rushingAttempts;
	}

	public void setRushingAttempts(int rushingAttempts) {
		this.rushingAttempts = rushingAttempts;
	}

	public double getPassingYards() {
		return passingYards;
	}

	public void setPassingYards(int passingYards) {
		this.passingYards = passingYards;
	}

	public double getRushingYards() {
		return rushingYards;
	}

	public void setRushingYards(int rushingYards) {
		this.rushingYards = rushingYards;
	}

	public int getFumbles() {
		return fumbles;
	}

	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}

	public int getLostFumbles() {
		return lostFumbles;
	}

	public void setLostFumbles(int lostFumbles) {
		this.lostFumbles = lostFumbles;
	}

	public int getCompletions() {
		return completions;
	}

	public void setCompletions(int completions) {
		this.completions = completions;
	}

	public int getPassingTouchDownPercent() {
		return passingTouchDowns / passingAttempts;
	}

	public double getPassingYardAverage() {
		return passingYards / passingAttempts;
	}

	public double getRushingYardAverage() {
		return rushingYards / rushingAttempts;
	}

	public double getCompletionPercent() {
		return completions / passingAttempts;
	}

}