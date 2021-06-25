package practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int n01 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int n02 = sc.nextInt();

		if (n01 > n02) {
			System.out.println("큰수: " + n01 + "\t" + "작은수: " + n02);
		} else
			System.out.println("큰수: " + n02 + "\t" + "작은수: " + n01);

		sc.close();

	}

}
