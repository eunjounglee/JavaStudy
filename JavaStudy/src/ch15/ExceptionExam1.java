package ch15;

public class ExceptionExam1 {
	public static void main(String[] args) {
		String numStr = " 123";
		try {
			int num = Integer.parseInt(numStr); // NumberFormatException
		} catch (Exception e) {
		}
		Object obj = new String("a");g.
		int a = (Integer) obj; // ClassCastException
	}
}
