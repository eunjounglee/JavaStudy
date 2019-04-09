package ch01;

public class Exam03_09 {
	public static void main(String[] args) {
		char ch = 'T';
		char lowerCase = (ch >= 'A' && ch <='Z') ? ((char)(ch + 32)) : ch;

		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);

	} // char result = in >=0 ? '¾ç' : 'À½';
}
