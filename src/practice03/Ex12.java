package practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		final int data = sc.nextInt();
		int sum = 1;

		for (int i = 1; i <= data; i++) {
			sum *= i;
		}
		System.out.println("결과값: " + sum);
		sc.close();

	}

}
