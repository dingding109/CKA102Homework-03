package hw1;

public class Compoundinterest {

	public static void main(String[] args) {
		
		int pv = 1500000;
		double i = 0.02;
		double fv = pv * Math.pow(1+i, 10);
		
		
		System.out.printf("本金+利息共有%,.2f元", fv);
		
		
		
	}
}
