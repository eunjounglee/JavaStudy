package ch05;

public class Exam05_1 {
	public static void main(String[] args) {
		int arrnum = 0;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String sep = " ";

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				arrnum = arr[i];
				System.out.print( sep + arrnum);
				sep = ",";
			}
		}
	}
}
