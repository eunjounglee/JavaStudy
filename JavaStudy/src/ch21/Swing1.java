package ch21;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame(); // 요소 배치 설정

		frame.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton();
		b2.setText("버튼2");

		frame.add(b1);
		frame.add(b2); // 버튼추가

		frame.setSize(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}

}
