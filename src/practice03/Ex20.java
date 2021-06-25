package practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		boolean flag1 = true;
		boolean flag2;
		boolean flag3;
		int inputNum;
		int random;

		Scanner sc = new Scanner(System.in);

		while (flag1) {
			random = (int) (Math.random() * 100) + 1;
			System.out.println("정답 확인용 정답 = " + random); // 확인용

			flag2 = true;
			flag3 = true;
			
			System.out.println("======================================");
			System.out.println("\t" + "[숫자맞추기 게임 시작]");
			System.out.println("======================================");

			while (flag2) {
				System.out.print(">>");
				inputNum = sc.nextInt();
				if (inputNum > random) {
					System.out.println("더 낮게");
				} else if (inputNum < random) {
					System.out.println("더 높게");
				} else {
					System.out.println("맞았습니다.");
					while (flag3) {
						System.out.print("게임을 종료하시겠습니까?(y/n) >>");
						String an = sc.next();
						switch (an) {
						case "y":
							System.out.println("======================================");
							System.out.println("\t" + "[숫자맞추기 게임 종료]");
							System.out.println("======================================");
							flag1 = !flag1;
							flag2 = !flag2;
							flag3 = !flag3;
							break;
						case "n":
							flag2 = !flag2;
							flag3 = !flag3;
							break;
						default:
							System.out.println("다시 입력해주세요.");
							break;
						}//swhich
					}//while 3
				}//else
			}//while 2
		}//while 1
		sc.close();
	}
}
