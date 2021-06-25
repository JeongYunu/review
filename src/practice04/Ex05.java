package practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		final int NUM = 5;
		int sum = 0;
		double average;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < NUM; i++) {
			int inputNum = sc.nextInt();
			sum += inputNum;
		}
		average = sum / NUM;
		System.out.println("평균은 " + average + " 입니다.");
		sc.close();

	}

}
