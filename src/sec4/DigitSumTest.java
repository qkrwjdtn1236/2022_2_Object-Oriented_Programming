package sec4;

import java.util.Scanner;

public class DigitSumTest {

	public static void main(String[] args) {
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		int cnt = 0;
		// 반복문으로 각 자리수 구하고 더해볼까? int 범위 내에서 자리수 합 구하는 것이 가능할 것 같다.
		while (input % 10 != 0 || input > 0) {

			cnt += input % 10;
			input /= 10;
		}
		System.out.print("각 자리수의 합 = " + cnt);
	}

}
