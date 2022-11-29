package project;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class BlackJack
{
	private Random random;
	private Scanner scanner;
	private List<Integer> deckSet;
	private List<Integer> userCardSet;
	private List<Integer> dealerCardSet;

	private int userSum = 0;
	private int dealerSum = 0;
	private int money = 0;
	
	private final int BUST_THRESH = 21;
	private final int DEALER_MIN_THRESH = 21;

	private final int WINRATE = 2; // Sum으로 이길 경우 2배 투자한 금액의 배팅액을 받는다.
	private final double BLACK_JACK_WINRATE = 1.5; // 블랙 잭으로 승리할 경우 배팅액이 다르다.
	private final String BLACK_JACK = "BlackJack!!!!!";
	
	BlackJack()
	{
		random = new Random();
		scanner = new Scanner(System.in);
		deckSet = new LinkedList<>();
		userCardSet = new LinkedList<>();
		dealerCardSet = new LinkedList<>();
	}

	public void playGame() {
		int chooseNum = 0;
		boolean run = true;
		System.out.println("<<블랙잭에 오신 것을 환영합니다.>>");

		generateDeck();
		
		while (run) 
		{
			System.out.println("1.게임 시작  2.게임 종료");
			chooseNum = selectInput();
			if (chooseNum == 1) 
			{
				money = bating();
				System.out.println("<<<<<<게임을 시작합니다.>>>>>>");
				System.out.println("카드 두 장을 드리겠습니다.");
				drawTwoCard();
				
				// 블랙잭의 규칙을 간단히 하기 위해 1 or 10을 포함한 경우 블랙잭으로 간주한다.
				// 첫번째 받힌 카드가 블랙잭인지 여부를 확인한다.
				if ((userCardSet.contains(1) && userCardSet.contains(10)) || 
				    (dealerCardSet.contains(1) && dealerCardSet.contains(10))) {
					
					checkCardSet(userSum, dealerSum, userCardSet, dealerCardSet, money);
					break;
				}
				
				// 뽑힌 카드가 블랙잭이 아니라면 현재의 카드 state를 확인한다. 사용자의 카드만 확인할 수 있게한다.
				checkCardState(userSum, dealerSum, userCardSet, dealerCardSet);

				while (true) 
				{
					// 카드를 더  뽑을 지(hit), 현재 카드를 기준으로 승리를 볼지 결정한다. 
					System.out.println("1.hit  2.stay");
					chooseNum = selectInput();
					if (chooseNum == 1 || chooseNum == 2)
					{
						if (chooseNum == 1) {
							// user와 딜러가 카드를 한장 뽑는다.
							// user와 딜러에 대해 뽑힌 카드가 bust가 됬는지 여부를 확인한다.
							hit();
							if (userSum > BUST_THRESH || dealerSum > BUST_THRESH) {
								if (userSum > BUST_THRESH) {
									Lose(userSum, dealerSum, userCardSet, dealerCardSet);
								} 
								else if (dealerSum > BUST_THRESH) {
									Win(userSum, dealerSum, userCardSet, dealerCardSet, money);
								}
								break;
							}
							// 현재 카드를 확인하고 버스 및 게임이 승부가 결정된 상황이 아니라면 계속 게임을 이어간다.
							checkCardState(userSum, dealerSum, userCardSet, dealerCardSet);
							continue;
						} 
						// 카드를 더이상 뽑지 않는다면 현재 카드를 기준을 승부를 본다.
						else if (chooseNum == 2)
						{
							if (userSum > dealerSum) {
								Win(userSum, dealerSum, userCardSet, dealerCardSet, money);
							} 
							else if (userSum == dealerSum) {
								Draw(userSum, dealerSum, userCardSet, dealerCardSet, money);
							} 
							else if (userSum < dealerSum) {
								Lose(userSum, dealerSum, userCardSet, dealerCardSet);
							}
							break;
						}
					} 
					else {
						System.out.println("올바른 번호를 입력해 주세요.");
						continue;
					}
				}
				break;
			} 
			else if (chooseNum == 2) 
			{
				run = false;
			}
			else {
				System.out.println("올바른 번호를 입력해 주세요.");
				continue;
			}
		}
		scanner.close();
	}

	// 게임 중에 사용될 deck 정보를 아래와 구성한다. 모든 카드를 쓰지 않고, 게임진행을 간단히 하기 위해 게임 사용될 카드를 아래와 같이 구성한다. 
	private void generateDeck() {
		for (int i = 0; i < 30; i++) {
			deckSet.add(i % 10 + 1);
		}
	}

	// 사용자의 입력을 받는다.
	private int selectInput() {
		int chooseNum = 0;
		while (true) 
		{
			try {
				chooseNum = Integer.parseInt(scanner.nextLine());
				break;
			} 
			catch (NumberFormatException e) {
				System.out.println("정확한 번호를 입력해 주세요.");
				continue;
			} 
			catch (Exception e) {
				System.out.println("정확한 번호를 입력해 주세요.");
				continue;
			}
		}
		
		return chooseNum;
	}

	// 사용자가 배팅할 금액을 입력받는다.
	private int bating() 
	{
		while (true) 
		{
			System.out.println("얼마를 배팅하시겠습니까? (배팅할 최소 금액은 5000원입니다.)");
			try {
				money = Integer.parseInt(scanner.nextLine());
			} 
			catch (NumberFormatException e) {
				System.out.println("다시 입력해 주세요.");
				continue;
			} 
			catch (Exception e) {
				System.out.println("다시 입력해 주세요.");
				continue;
			}
			
			if (money < 5000) {
				System.out.println("최소 배팅액 이상을 입력해 주세요.");
				continue;
			} 
			else
				break;
		}

		return money;
	}

	// 
	private void drawTwoCard() 
	{
		for (int i = 0; i < 2; i++) 
		{
			int rand1 = deckSet.remove(random.nextInt(deckSet.size()));
			int rand2 = deckSet.remove(random.nextInt(deckSet.size()));
			userSum += rand1;
			dealerSum += rand2;
			userCardSet.add(rand1);
			dealerCardSet.add(rand2);
		}
	}

	private void hit() 
	{
		// 덱에서 카드를 뽑아온다. (user와 딜러 모두 해당.)
		int rand1 = deckSet.remove(random.nextInt(deckSet.size()));
		userCardSet.add(rand1);
		userSum += rand1;
		if (dealerSum < DEALER_MIN_THRESH) 
		{
			int rand2 = deckSet.remove(random.nextInt(deckSet.size()));
			dealerSum += rand2;
			dealerCardSet.add(rand2);
		}
	}

	private void stay() 
	{
		// 카드를 더이상 뽑지 않는 상황이므로 아무런 진행도 하지 않는다.
	}
	
	public void Win(int userCardSum, int dealerCardSum, List<Integer> userCardSet, List<Integer> dealerCardSet, int money) 
	{
		System.out.println("현재 카드 합 : " + userCardSum + "  현재 보유 카드 : " + userCardSet);
		if (dealerSum > this.BUST_THRESH)
			System.out.println("딜러 카드 합: " + dealerCardSum + "  딜러 보유 카드: " + dealerCardSet + "  <Bust!>");
		else 
			System.out.println("딜러 카드 합: " + dealerCardSum + "  딜러 보유 카드: " + dealerCardSet);
		
		System.out.println("당신이 승리하였습니다. 획득 금액 : " + (money * WINRATE));
	}
	
	public void Lose(int userCardSum, int dealerCardSum, List<Integer> userCardSet, List<Integer> dealerCardSet) {
		if (userSum > this.BUST_THRESH) 
			System.out.println("현재 카드 합 : " + userCardSum + "  현재 보유 카드 : " + userCardSet + "  <Bust!>");
		else 
			System.out.println("현재 카드 합 : " + userCardSum + "  현재 보유 카드 : " + userCardSet);
		
		System.out.println("딜러 카드 합 : " + dealerCardSum + "  딜러 보유 카드 : " + dealerCardSet);
		System.out.println("당신이 패배하였습니다. 돈을 잃으셨습니다.");
	}
	
	public void Draw(int userCardSum, int dealerCardSum, List<Integer> userCardSet, List<Integer> dealerCardSet, int money) {
		System.out.println("현재 카드 합 : " + userCardSum + "  현재 보유 카드 : " + userCardSet);
		System.out.println("딜러 카드 합 : " + dealerCardSum + "  딜러 보유 카드 : " + dealerCardSet);
		System.out.println("비겼습니다. 돈을 돌려드리겠습니다. 획득 금액 : " + money);
	}
	
	// 현재 사용자가 보유한 카드를 출력한다.
	public void checkCardState(int userCardSum, int dealerCardSum, List<Integer> userCardSet, List<Integer> dealerCardSet) 
	{
		System.out.println("현재 카드 합 : " + userCardSum + " 현재 보유 카드 : " + userCardSet);
	}
	
	public void checkCardSet(int userCardSum, int dealerCardSum, List<Integer> userCardSet, List<Integer> dealerCardSet, int money) {
		if ((userCardSet.contains(1) && userCardSet.contains(10)) && 
		    (dealerCardSet.contains(1) && dealerCardSet.contains(10))) 
		{
			System.out.println("현재 카드 합 : " + this.BLACK_JACK + " 현재 보유 카드 : " + userCardSet);
			System.out.println("딜러 카드 합 : " + this.BLACK_JACK + " 딜러 보유 카드 : " + dealerCardSet);
			System.out.println("비겼습니다.\t돈을 돌려드리겠습니다. 획득 금액 : " + money);
		} 
		else if (userCardSet.contains(1) && userCardSet.contains(10)) {
			System.out.println("현재 카드 합 : " + this.BLACK_JACK + " 현재 보유 카드 : " + userCardSet);
			System.out.println("딜러 카드 합 : " + dealerCardSum + "  딜러 보유 카드 : " + dealerCardSet);
			System.out.println("BlackJack! 당신의 승리입니다.\t획득 상금 : " + (int)(money * BLACK_JACK_WINRATE));
		} 
		else {
			System.out.println("현재 카드 합 : " + userCardSum + "  현재 보유 카드 : " + userCardSet);
			System.out.println("딜러 카드 합 : " + this.BLACK_JACK + " 딜러 보유 카드 : " + dealerCardSet);
			System.out.println("BlackJack 당신의 패배입니다. 돈을 잃으셨습니다.");
		}
	}
}

public class Main1 {

	public static void main(String[] args) {
		BlackJack blackJack = new BlackJack();
		blackJack.playGame();
		System.out.println("<<블랙잭이 종료되었습니다>>");
	}
}