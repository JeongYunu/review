package practice03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int data = sc.nextInt();

		for (int i = 0; i < data; i++) {
			for (int j = 0; j < data - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = 0; i < data - 1; i++) {
			for (int j = 0; j < i + 2; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		sc.close();

	}

}
