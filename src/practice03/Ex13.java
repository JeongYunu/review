package practice03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		final int data = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= data; i++) {
			sum += i;
		}
		System.out.println("합계: " + sum);
		sc.close();


	}

}
