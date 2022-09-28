package sec4;

import java.util.Scanner;

public class Wongidong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥의 밑면의 반지름은 ? ");
		double r = sc.nextDouble();
		System.out.print("원기둥의 높이는? ");
		double h = sc.nextDouble();

		sc.close();

		System.out.println("원기둥의 부피는 " + r * r * h * 3.14);

	}

}
