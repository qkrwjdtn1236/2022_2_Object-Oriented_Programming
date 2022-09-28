package sec4;

import java.util.Scanner;

public class TimeTest {
	// 실습문제 2-5
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요.");

		int input = sc.nextInt();
		sc.close();

		System.out.printf("%d시간 %d분 %d초", input / 3600, input / 60, input % 60);

	}

}
