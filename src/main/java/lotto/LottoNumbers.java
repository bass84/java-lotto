package lotto;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoNumbers {
	private static final int LOTTO_NUMBERS_PER_GAME = 6;
	private static final int TOTAL_COUNT_OF_LOTTO_BALL = 45;
	private static final List<Integer> LOTTO_BALLS = IntStream.range(0, TOTAL_COUNT_OF_LOTTO_BALL)
															  .mapToObj(order -> order + 1)
															  .collect(Collectors.toList());
	private final List<Integer> lottoNumbers;

	private LottoNumbers(List<Integer> lottoNumbers) {
		Collections.sort(lottoNumbers);
		this.lottoNumbers = lottoNumbers;
	}

	public static LottoNumbers of(List<Integer> lottoNumbers) {
		if (lottoNumbers == null || lottoNumbers.isEmpty()) {
			throw new IllegalArgumentException("당첨번호가 비어있습니다.");
		}
		if (lottoNumbers.size() != LOTTO_NUMBERS_PER_GAME) {
			throw new IllegalArgumentException("당첨번호는 6개를 입력해주세요.");
		}
		return new LottoNumbers(lottoNumbers);
	}

	public int getSameCountWith(LottoNumbers otherBalls) {
		return otherBalls.lottoNumbers.stream()
									  .mapToInt(lottoNumber -> this.lottoNumbers.contains(lottoNumber) ? 1 : 0)
									  .sum();
	}

	public static List<Integer> getAllShuffled() {
		List<Integer> copiedLottoBalls = LOTTO_BALLS.stream()
													.collect(Collectors.toList());
		Collections.shuffle(copiedLottoBalls);

		return copiedLottoBalls;
	}

	@Override
	public String toString() {
		return lottoNumbers.toString();
	}
}
