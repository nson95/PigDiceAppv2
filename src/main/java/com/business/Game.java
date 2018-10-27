package com.business;

import java.util.List;

public class Game {
	private int numTurns;
	private List<Integer> rolls;
	private List<Integer> score;
	private int highScore;
	
	public Game(int numTurns) {
		this.numTurns = numTurns;
	}

	public Game() {
		super();
	}

	public int getNumTurns() {
		return numTurns;
	}

	public void setNumRolls(int numTurns) {
		this.numTurns = numTurns;
	}

	public List<Integer> getRolls() {
		return rolls;
	}

	public void setRolls(List<Integer> rolls) {
		this.rolls = rolls;
	}

	public List<Integer> getScore() {
		return score;
	}

	public void setScore(List<Integer> score) {
		this.score = score;
	}

	public int getHighScore() {
		return highScore;
	}

	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}

	@Override
	public String toString() {
		return "Game [numRolls=" + numTurns + ", score=" + score + ", highScore=" + highScore + "]";
	}
	
	
}
