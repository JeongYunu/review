package practice01;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격: ");
		double price = sc.nextDouble();
		System.out.print("받은돈: ");
		double cash = sc.nextDouble();
		System.out.println("=========================");
		
		double tax = price * 0.1;
		double change = cash - price;
		
		System.out.println("받은돈: " + cash);
		System.out.println("상품가격: " + price);
		System.out.println("부가세: " + tax);
		System.out.println("잔액: " + change);
		sc.close();

	}

}
