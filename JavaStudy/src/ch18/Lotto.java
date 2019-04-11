package ch18;

import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		TreeSet<Integer> my = new TreeSet<Integer>();

		lotto.add(2);
		lotto.add(8);
		lotto.add(23);
		lotto.add(26);
		lotto.add(27);
		lotto.add(44);

		int count = 0;
		while (true) { // 1등번호 맞출 때 까지
			my.clear();
			while (true) { // 내 번호가 6개 만들어질때까지
				int num = (int) (Math.random() * 45) + 1;
				my.add(num);
				if (my.size() == 3)
					break;
			}
			count++;
			System.out.println(count);
			boolean isMatch = lotto.containsAll(my);
			if (isMatch)
				break;
		}
		System.out.println("시도횟수 = " + count);
	}
}
