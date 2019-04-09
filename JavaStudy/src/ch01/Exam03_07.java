package ch01;

public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345;
		// 코드 작성 (% 연산자)
		int num1 = num % 10;// 5

		int number1 = num / 10;// 1234
		int num2 = number1 % 10; // 4

		int number2 = number1 / 10; // 123
		int num3 = number2 % 10; // 3

		int number3 = number2 / 10;// 12
		int num4 = number3 % 10; // 2

		int number4 = number3 / 10;// 1
		int num5 = number4 % 10; // 1

		int total = num1 + num2 + num3 + num4 + num5;
		System.out.println("각 자리 숫자의 합 : " + total);
		
		
		//예제 2
//		int num1 = num % 10;
//		int num2 = (num/10) % 10;
//		int num3 = (num/100) % 10;

		
		// 예제 3
//		int num1 = num % 10;
//		num = num / 10;
//		
//		int num2 = num % 10;
//		num = num / 10;
//		
//		int num3 = num % 10;
//		num = num / 10;
//		
//		int num4 = num % 10;
//		num = num / 10;
//		
//		int num5 = num % 10;
//		num = num / 10;
		
	}
}
