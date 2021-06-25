package practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		int count = 0;
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int inputData = sc.nextInt();

		for (int i = 0; i < wonArray.length; i++) {
			for (int j = 0; j < wonArray.length; j++) {
				if (inputData >= wonArray[i]) {
					inputData -= wonArray[i];
					count++;
				} else /* if(inputData < wonArray[i]) */ {
					System.out.println(wonArray[i] + "원:" + count + "개");
					count = 0;
					break;
				}
			}
		}
		sc.close();
	}

}
