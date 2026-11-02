package hw1;

public class Pi {

	public static void main(String[] args) {
		
		final double PI = 3.1415;
		int r = 5;
		
		System.out.println("圓面積為" + Math.pow(r, 2) * PI);
		System.out.println("圓周長為" + (r * 2) * PI);
		
		System.out.printf("圓面積為 %.4f%n", Math.pow(r, 2) * PI);
		System.out.printf("圓周長為 %.4f%n", (r * 2) * PI);
		
	}
}
