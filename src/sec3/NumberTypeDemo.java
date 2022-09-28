package sec3;

public class NumberTypeDemo {

	public static void main(String[] args) {
		int mach;
		int distance;

		mach = 340;
		distance = mach * 60 * 60;

		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + 'm');

		float radius;
		float area;

		final float PI = 3.14f;

		radius = 10.0f;
		area = radius * radius * PI;
		System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);

	}
}
