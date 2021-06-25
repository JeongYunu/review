package practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int data = sc.nextInt();
		int j = 0, sum = 0;

		for (int i = 1; i <= data; i++) {
			if (i % 5 == 0 && i <= data) {
				sum += i;
				j++;
			}
		}
		System.out.println("5의배수의 개수: " + j);
		System.out.println("5의배수의 합  : " + sum);
		sc.close();

	}

}
