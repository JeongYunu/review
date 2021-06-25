package practice04;

public class Ex03 {

	public static void main(String[] args) {

		int[] intA = { 3, 6, 9 }; // 0x111

		int[] intB; // 0x222

		intB = intA; // 0x111
		intB[0] = 20;
		intB[2] = 10;

		for (int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}
	}

}
