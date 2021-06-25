package practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		final int data = sc.nextInt();

		for (int i = 1, sum = 0; i <= data; i++) {
			sum += i;
			System.out.print(i);
			// String str = (i == data) ? "\n합계: " + sum : "+";
			String str = (i == data) ? " = " + sum + "\n합계: " + sum : "+";
			System.out.print(str);
		}
		sc.close();

	}

}
