package practice03;

public class Ex09 {

	public static void main(String[] args) {

		final int MAX = 10;
		for (int i = 1; i <= MAX; i++) {
			for (int j = i; j < i + MAX; j++) {
				System.out.print(j + "\t");
			}
			System.out.println("");
		}

	}

}
