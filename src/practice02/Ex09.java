package practice02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int n01 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int n02 = sc.nextInt();
		if(n01>n02) {
			show(n01, n02);
		}else {
			show(n02, n01);
		}
		
		sc.close();

	}
	
	public static void show(int num01, int num02){
		String s;
		if( num01 % num02 == 0 ) {
			s = "약수입니다.";
		}
		else {
			s = "약수가 아닙니다.";
		}
		System.out.println(num02 + " 는(은) " + num01 + " 의 " + s);
	}

}
