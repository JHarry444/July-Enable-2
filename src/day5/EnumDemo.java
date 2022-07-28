package day5;

import java.time.LocalDate;
import java.util.ArrayList;

public class EnumDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1994, 4, 4);

		ArrayList<Boolean> results = new ArrayList<>();

		for (int i = 0; i < 1_000; i++) {
			results.add(call(CoinFlip.HEADS));
		}

	}

	public static boolean call(CoinFlip call) {
		CoinFlip actual = null;

		double rand = Math.random();

		if (rand < 0.5)
			actual = CoinFlip.HEADS;
		else if (rand < 0.95)
			actual = CoinFlip.TAILS;
		else
			actual = CoinFlip.EDGE;

		return actual == call;
	}

}
