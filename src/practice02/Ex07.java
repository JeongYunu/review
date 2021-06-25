package practice02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int n01 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int n02 = sc.nextInt();

		int quotient;
		int remainder;

		if (n01 < n02) {
			quotient = n02 / n01;
			remainder = n02 % n01;
		} else {
			quotient = n01 / n02;
			remainder = n01 % n02;
		}
		System.out.println("몫: " + quotient);
		System.out.println("나머지: " + remainder);
		sc.close();

	}

}
