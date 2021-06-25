package practice01;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력하세요: ");
		double width = sc.nextDouble();
		System.out.print("세로를 입력하세요: ");
		double height = sc.nextDouble();

		double rA = width * height;
		double rS = width * 2 + height * 2;

		System.out.println("사각형의 넓이는 " + rA);
		System.out.println("사각형의 둘레는 " + rS);

		sc.close();
	}

}
