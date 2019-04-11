package ch07;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window2 {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);

		JFrame frame = new JFrame("윈도우");

		frame.setLayout(new FlowLayout());

		JButton button = new JButton("나는 버튼");
//		 button.setText("나는 버튼");
		button.setBackground(Color.WHITE);
		button.setPreferredSize(new Dimension(100, 100));

		frame.add(button);
		frame.setSize(400, 400);
		frame.setResizable(false);
//		 frame.setBounds(200, 200, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
