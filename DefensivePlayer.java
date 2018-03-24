/** Program: Defensive Player Class
 * File: DefensivePlayer.java
 * Summary: This file creates the Defensive Player class and properties and getters/setters.
 *
 * Author: Keith Harrison
 * Date: 3/24/2018
 * 
 */

import javafx.scene.image.Image;

public class DefensivePlayer extends NFLPlayer {

	int interceptionTouchDowns;

	int fumbleTouchDowns;

	double sacks;

	int interceptionYards;

	int forcedFumbles;

	int interceptedPasses;

	int defendedPasses;

	int totalTackles;

	int assistedTackles;

	int combinedTackles;

	public DefensivePlayer() {

	}

	public DefensivePlayer(int interceptionTouchDowns, int fumbleTouchDowns, double sacks, int interceptionYards,
			int forcedFumbles, int interceptedPasses, int defendedPasses, int totalTackles, int assistedTackles,
			int combinedTackles) {
		this.interceptionTouchDowns = interceptionTouchDowns;
		this.fumbleTouchDowns = fumbleTouchDowns;
		this.sacks = sacks;
		this.interceptionYards = interceptionYards;
		this.forcedFumbles = forcedFumbles;
		this.interceptedPasses = interceptedPasses;
		this.defendedPasses = defendedPasses;
		this.totalTackles = totalTackles;
		this.assistedTackles = assistedTackles;
		this.combinedTackles = combinedTackles;
	}
	
	public DefensivePlayer(String url, String name, int age, double height, double weight, int interceptionTouchDowns, int fumbleTouchDowns, double sacks, int interceptionYards,
			int forcedFumbles, int interceptedPasses, int defendedPasses, int totalTackles, int assistedTackles,
			int combinedTackles) {
		this.headshot = new Image(url, 78, 78, true, false);
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.interceptionTouchDowns = interceptionTouchDowns;
		this.fumbleTouchDowns = fumbleTouchDowns;
		this.sacks = sacks;
		this.interceptionYards = interceptionYards;
		this.forcedFumbles = forcedFumbles;
		this.interceptedPasses = interceptedPasses;
		this.defendedPasses = defendedPasses;
		this.totalTackles = totalTackles;
		this.assistedTackles = assistedTackles;
		this.combinedTackles = combinedTackles;
	}

	@Override
	public String toString() {
		return "Defensive Player: " + this.name;
	}

	public int getInterceptionTouchDowns() {
		return interceptionTouchDowns;
	}

	public int getFumbleTouchDowns() {
		return fumbleTouchDowns;
	}

	public double getSacks() {
		return sacks;
	}

	public int getInterceptionYards() {
		return interceptionYards;
	}

	public int getForcedFumbles() {
		return forcedFumbles;
	}

	public int getInterceptedPasses() {
		return interceptedPasses;
	}

	public int getDefendedPasses() {
		return defendedPasses;
	}

	public int getTotalTackles() {
		return totalTackles;
	}

	public int getAssistedTackles() {
		return assistedTackles;
	}

	public int getCombinedTackles() {
		return this.totalTackles + this.assistedTackles;
	}

	public void setInterceptionTouchDowns(int interceptionTouchDowns) {
		this.interceptionTouchDowns = interceptionTouchDowns;
	}

	public void setFumbleTouchDowns(int fumbleTouchDowns) {
		this.fumbleTouchDowns = fumbleTouchDowns;
	}

	public void setSacks(double sacks) {
		this.sacks = sacks;
	}

	public void setInterceptionYards(int interceptionYards) {
		this.interceptionYards = interceptionYards;
	}

	public void setForcedFumbles(int forcedFumbles) {
		this.forcedFumbles = forcedFumbles;
	}

	public void setInterceptedPasses(int interceptedPasses) {
		this.interceptedPasses = interceptedPasses;
	}

	public void setDefendedPasses(int defendedPasses) {
		this.defendedPasses = defendedPasses;
	}

	public void setTotalTackles(int totalTackles) {
		this.totalTackles = totalTackles;
	}

	public void setAssistedTackles(int assistedTackles) {
		this.assistedTackles = assistedTackles;
	}

	public void setCombinedTackles(int combinedTackles) {
		this.combinedTackles = combinedTackles;
	}
}