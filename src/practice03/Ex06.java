package practice03;

public class Ex06 {

	public static void main(String[] args) {

		final int MAX = 100;
		for (int i = 1; i <= MAX; i++) {
			if (0 == i % 5 && 0 == i % 7) // 5의 배수이면서 7의 배수
				System.out.println(i);
		}
	}

}
