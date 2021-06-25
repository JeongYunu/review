package practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		int aom;
		int deposit = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		while (flag) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			int mNum = sc.nextInt();

			switch (mNum) {
			case 1:
				System.out.print("예금액>");
				aom = sc.nextInt();
				deposit += aom;
				break;
			case 2:
				System.out.print("출금액>");
				aom = sc.nextInt();
				deposit -= aom;
				break;
			case 3:
				System.out.println("잔고액>" + deposit);
				break;
			case 4:
				System.out.println("프로그램 종료");
				flag = !flag;
				break;
			default:
				System.out.println("다시입력해주세요");
				break;
			}
		}

		sc.close();
	}

}
