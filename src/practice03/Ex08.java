package practice03;

public class Ex08 {

	public static void main(String[] args) {

		final int MAX = 10;

		for (int i = 1; i < MAX; i++) {
			for (int j = 2; j < MAX; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println("");
		}

	}

}
