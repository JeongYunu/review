package practice01;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("화씨: ");
		double f = sc.nextDouble();
		double c = (f - 32) * 5 / 9;
		System.out.println("화씨 " + f + " 의 섭씨온도는 " + c + " 입니다.");

		sc.close();

	}

}
