package sec4;

import java.util.Scanner;

public class LogicalTest {
	// 실습문제 2-6
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		sc.close();

		boolean p1 = (input % 4 == 0 && input % 5 == 0);
		boolean p2 = (input % 4 == 0 || input % 5 == 0);

		System.out.println("4와 5로 나누어진다 : " + p1);
		System.out.println("4또는 5로 나누어진다 : " + p2);
		System.out.println("4 나 5중 하나로 나누어지지만 두 수 모두로는 나우어지지 않는다. : " + (p2 && !p1));

	}

}
