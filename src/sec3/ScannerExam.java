package sec3;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("님 키 입력하셈 : ");
		float height = sc.nextFloat();

		System.out.println("입력값 : " + height);

		sc.close();
	}
}
