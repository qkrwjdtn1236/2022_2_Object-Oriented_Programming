package sec3;

public class CastDemo {

	public static void main(String[] args) {

		int i;
		double d;
		byte b;

		i = 7 / 4;
		System.out.println(i); // 1

		d = 7 / 4;
		System.out.println(d); // 1.0
		d = 7 / (double) 4;
		System.out.println(d); // 1.75

	}

}
