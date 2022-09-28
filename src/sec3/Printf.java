package sec3;

public class Printf {

	public static void main(String[] args) {

		String name = "ParkJeongSu";

		System.out.printf("name : %-20s\n", name);

		System.out.printf("name : %20s\n", name);
		float pi = 3.14f;

		System.out.printf("%05.2f\n", pi);
	}

}
