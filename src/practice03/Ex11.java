package practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int data = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= data; i++) {
			sum = (0 == i % 2 && 0 == data % 2) ? sum + i : (1 == i % 2 && 1 == data % 2) ? sum + i : sum;

			/*
			 * if (0 == i % 2 && 0 == data % 2) { 
			 * 		sum += i; 
			 * } else if (1 == i % 2 && 1 == data % 2) { 
			 * 		sum += i; 
			 * }
			 */
		}
		System.out.println("결과값: " + sum);
		sc.close();

	}

}
