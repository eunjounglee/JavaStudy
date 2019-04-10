package ch06;

public class Exam06_1 {
	public static void main(String[] args) {
		int result1 = plus(5, 3);
		System.out.println("plus => " + result1);

		int result2 = minus(5, 3);
		System.out.println("minus => " + result2);
	}

	public static int plus(int num1, int num2) {
		// 内靛 累己
		char result1 = (char)(num1 + num2);
		return result1;
	}

	public static int minus(int num1, int num2) {
		// 内靛 累己
		char result2 = (char)(num1 - num2);
		return result2;
	}

}
