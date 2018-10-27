package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pigdice.business.Game;

@SpringBootApplication
public class PigDiceAppv2Application {

	public static void main(String[] args) {
		SpringApplication.run(PigDiceAppv2Application.class, args);
		System.out.println("Pig Dice");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice="y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("How many games would you like to play? ");
			List<Integer> scores = new ArrayList<>();
			int numTurns = sc.nextInt();
			Game g = new Game(numTurns);
			int score = 0;
				while (numTurns>0) {
					int rollValue = rollOfTheDie();
						if (rollValue!=1) {
							score+=rollValue;
							scores.add(score);
						} else if (rollValue==1) {
							numTurns-=1;
							score=0;
						}
				}
				int highScore = Collections.max(scores);
				g.setHighScore(highScore);
			System.out.println("Your high score: " +highScore +"\n"
								+"Overall highest score: " );
			System.out.println();
			System.out.print("Continue? (y/n) ");
			choice=sc.next();
		}
		System.out.println("Goodbye!");
		sc.close();
	}

	public static int rollOfTheDie() {
		return (int) (Math.random() * 6 + 1);
	}
}

