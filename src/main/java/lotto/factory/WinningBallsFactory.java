package lotto.factory;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import lotto.BonusBall;
import lotto.Lotto;
import lotto.WinningBalls;
import lotto.input.InputValidator;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WinningBallsFactory {

	private static final String WINNING_NUMBER_DELIMITER = ",";

	private static Lotto create(List<Integer> numbers) {
		return Lotto.of(numbers);
	}

	public static WinningBalls create(String numbersString, String bonusBallString) {
		InputValidator.validateWinningNumbers(numbersString);
		Lotto winningNumbers = create(Stream.of(numbersString.split(WINNING_NUMBER_DELIMITER))
											.mapToInt(number -> Integer.parseInt(number.trim()))
											.boxed()
											.collect(toList()));
		return WinningBalls.of(winningNumbers, BonusBall.of(bonusBallString));
	}
}
