package sec4;

import java.util.Scanner;

public class munjae2_2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int result = in.nextInt();

		System.out.printf("%d의 제곱은 %d", result, result * result);
		in.close();
	}

}
