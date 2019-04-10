package ch07;

import java.awt.Color;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	 public static void main(String[] args) {
		 
		 Calendar c = Calendar.getInstance();
		 int year = c.get(Calendar.YEAR);
		 System.out.println(year);
		 
		 JFrame frame = new JFrame("윈도우");

		 JButton button = new JButton("나는 버튼");
//		 button.setText("나는 버튼");
		 button.setBackground(Color.WHITE);
		 
		 frame.add(button);
		 frame.setSize(200,200);
//		 frame.setResizable(false);
//		 frame.setBounds(200, 200, 200, 200);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		 }
}
