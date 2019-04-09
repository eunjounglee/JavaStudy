package ch05;

public class CutOperation {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < stick.length; i++) {
			if (stick[i] < min) {
				min = stick[i];
			}
		}
		System.out.println(stick.length);
		
		
	}
}
