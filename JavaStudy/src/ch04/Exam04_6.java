package ch04;

public class Exam04_6 {
	public static void main(String[] args) {

		int space = 0;
		for (int i = 1; i <= 5; i++) {
			space = 5 - i;

			for (int j = 1; j <= 5; j++) {
				if (j <= space) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
		}
		System.out.println();

		
//		for (int a = 5; a >= 1; a--) {
//			for (int b = a; b >= 1; b--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}
}