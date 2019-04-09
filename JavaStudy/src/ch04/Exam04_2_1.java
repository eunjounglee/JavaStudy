package ch04;

public class Exam04_2_1 {
	public static void main(String[] args) {
		int score = 20;
		// ÄÚµå ÀÛ¼º
		if (score % 2 == 0) {
			if (score % 3 == 0) {
				System.out.println("ÄôÂ¦");
			} else {
				System.out.println("Â¦");
			}
		} else if (score % 3 == 0) {
			System.out.println("Äô");
		} else {
			System.out.println("score");
		}
	}

}
