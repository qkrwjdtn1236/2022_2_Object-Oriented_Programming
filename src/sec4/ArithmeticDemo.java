package sec4;

import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 정수 입력 : ");
		int number = sc.nextInt();
		String result = number % 2 == 0 ? "짝수" : "홀수";
		System.out.println(number + "는 " + result + "입니다.");
		sc.close();
	}
}
