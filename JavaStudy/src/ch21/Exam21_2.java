package ch21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Exam21_2 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("모양만 계산기");
		frm.setBounds(100, 100, 220, 300); // 윈도우 크기 지정
		frm.setLayout(new BorderLayout()); // 정렬방식

		JLabel label = new JLabel();
		label.setText("TEST");
		/* 오른쪽 정렬 */
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		frm.add(label, BorderLayout.NORTH);

		/* JPanel1 추가 */
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3, 3, 2, 2));

		MouseListener ml = new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {
				JButton button = (JButton) arg0.getComponent();
				String text = button.getText();
				label.setText(label.getText() + text);
			}

			public void mouseEntered(MouseEvent arg0) {
			}

			public void mouseExited(MouseEvent arg0) {
			}

			public void mousePressed(MouseEvent arg0) {
			}

			public void mouseReleased(MouseEvent arg0) {
			}

		};

//01.	panel1.add(new JButton("9"));
//		panel1.add(new JButton("8"));
//		panel1.add(new JButton("7"));
//		panel1.add(new JButton("6"));
//		panel1.add(new JButton("5"));
//		panel1.add(new JButton("4"));
//		panel1.add(new JButton("3"));
//		panel1.add(new JButton("2"));
//		panel1.add(new JButton("1"));

//02.   String[] button1 = { "9", "8", "7", "6", "5", "4", "3", "2", "1" };
//		for (String bt1 : button1) {
//			panel1.add(new JButton(bt1));
//		}

		for (int i = 9; i >= 1; i--) {
			JButton button = new JButton(i + "");
			button.addMouseListener(ml); //
			panel1.add(button);
		}
		panel1.setBackground(Color.WHITE);

		/* JPanel2 추가 */
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 4));

//		panel2.add(new JButton("+"));
//		panel2.add(new JButton("-"));
		
//		panel2.add(new JButton("/"));
//		panel2.add(new JButton("="));

		String[] button2 = { "+", "-", "/", "=" };
		for (String bt2 : button2) {
			panel2.add(new JButton(bt2));
		}
		panel2.setBackground(Color.WHITE);

		frm.add(panel1, BorderLayout.CENTER); // 프레임1 센터
		frm.add(panel2, BorderLayout.SOUTH); // 프레임2 남향

		frm.setSize(400, 400);
		frm.setResizable(false);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
