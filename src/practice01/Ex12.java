package practice01;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요:");
		double radius = sc.nextInt();
		double circleArea = radius*radius*pi;
		
		System.out.println(circleArea);
				
		sc.close();

	}

	

}
