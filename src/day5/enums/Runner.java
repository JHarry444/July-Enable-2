package day5.enums;

import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		System.out.println(play(RPS.ROCK));
		System.out.println(play(RPS.ROCK));
		System.out.println(play(RPS.ROCK));
		System.out.println(play(RPS.ROCK));
		System.out.println(play(RPS.ROCK));

	}

	public static Result play(RPS playerChoice) {
		int rand = new Random().nextInt(3);

		RPS cpuChoice = null;

		if (rand == 0)
			cpuChoice = RPS.ROCK;
		else if (rand == 1)
			cpuChoice = RPS.PAPER;
		else
			cpuChoice = RPS.SCISSORS;

		System.out.println("CPU choice: " + cpuChoice);

		return playerChoice.beats(cpuChoice);
	}

}
