# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)














# todo 


# done
- 입력된 금액만큼 몇 장을 발급해야할지 결과가 나온다.
- 로또를 생성한다.
- 로또를 입력한 장수만큼 발급한다.
- 당첨 번호를 입력한다.
- 발급된 로또와 당첨 번호와 비교해서 일치하는 개수를 Map에 추가한다.
- 수익률을 계산한다.
- 수익률을 보여준다.

- 보너스볼을 받아서 WinnigBalls에 추가한다.(보너스볼을 Object로 만든다.)
- 보너스볼에 대한 유효성 체크를 한다.
- Ranking에서 보너스볼에 대한 연산도 한다.

- 수동으로 구매할 로또 개수를 담당하는 ManualLottoCount 객체 추가
- 사용자로부터 입력받은 로또번호를 이용하여 LottoNumbers를 만드는 로직이 WinningBallsFactory에 있던 것을 LottoNumbersFactory로 가져와서 외부에서 호출 가능하도록 처리
- 수동으로 로또번호를 생성하는 역할을 담당하는 ManualLottoNumbersFactory 추가
- 수동으로 생성되는 로또번호(LottoNumbers)와 로또금액(LottoPayAmounts)을 가지고 있는 LottoPurchaseArgument 추가
- LottoKiosk가 발급할 때 받는 인자를 LottoPurchaseArgument로 변경한다.