package practice02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		final int num = 3;
		int sum = 2147483647;

		System.out.println("숫자 " + num + "개를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= num; i++) {
			System.out.print("숫자" + i + ": ");
			int data = sc.nextInt();

			if (data < sum)
				sum = data;

		}
		System.out.println("가장 작은수는 " + sum + " 입니다");

		sc.close();

	}

}
