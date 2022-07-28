package day5.enums;

public enum RPS {

	ROCK {
		@Override
		public Result beats(RPS opponent) {
			if (this == opponent)
				return Result.DRAW;
			else if (opponent == PAPER)
				return Result.LOSE;
			else
				return Result.WIN;
		}
	},
	PAPER {
		@Override
		public Result beats(RPS opponent) {
			if (this == opponent)
				return Result.DRAW;
			else if (opponent == SCISSORS)
				return Result.LOSE;
			else
				return Result.WIN;
		}
	},
	SCISSORS {
		@Override
		public Result beats(RPS opponent) {
			if (this == opponent)
				return Result.DRAW;
			else if (opponent == ROCK)
				return Result.LOSE;
			else
				return Result.WIN;
		}
	};

	public abstract Result beats(RPS opponent);
}
