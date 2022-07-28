package day5;

import java.time.LocalDate;

public class EnumDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1994, 4, 4);
		System.out.println(call(CoinFlip.HEADS));
		System.out.println(call(CoinFlip.HEADS));
		System.out.println(call(CoinFlip.HEADS));
		System.out.println(call(CoinFlip.HEADS));
		System.out.println(call(CoinFlip.HEADS));

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
