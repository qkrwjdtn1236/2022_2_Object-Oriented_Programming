package sec3;

import java.util.Scanner;

public class SquareTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();

		System.out.printf("%d의 제곱은 %d", input, input * input);
	}

}
