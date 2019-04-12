package ch21;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam21_1 {
	public static void main(String[] args) {

		String[] datas = { "A", "B", "C", "D", "E", "F", "G" };

		JFrame frame = new JFrame();
		frame.setBounds(120, 120, 300, 200);
		/* JFrame의 Layout을 GridLayout 으로 지정 */
		
		frame.setLayout(new GridLayout(0, 3));
		

		/* 배열을 이용하여 JButton 으로 표현 */
		for (String s : datas) {
			frame.add(new JButton(s));
		}

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
