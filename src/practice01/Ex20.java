package practice01;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		int[] won = new int[4];
		won[0] = 500;
		won[1] = 100;
		won[2] = 50;
		won[3] = 10;
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0, sum = 0; i<won.length; i++) {
			System.out.print(won[i] + "원 개수: ");
			int num = sc.nextInt();
			sum = sum + won[i] * num;
			if( i == won.length - 1) {
				System.out.println("동전의 총합은 " + sum + "원 입니다.");
				break;
			}
		}

		sc.close();
	}

}
