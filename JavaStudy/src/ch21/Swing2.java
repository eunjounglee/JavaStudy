package ch21;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 {
	public static void main(String[] args) {

		JFrame frame = new JFrame(); // 요소 배치 설정

		frame.setLayout(new FlowLayout());

		MouseListener ml = new MouseListener() { // 버튼마다 마우스리스너 재사용
			public void mouseReleased(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) { // 클릭
				JButton button = (JButton) e.getSource(); // 버튼
				String text = button.getText();
				System.out.println(text);
			}
		};

		JButton button1 = new JButton("버튼1");
		button1.addMouseListener(ml);

		JButton button2 = new JButton();
		button2.setText("버튼2");
		button2.addMouseListener(ml);
		
		frame.setLayout(new FlowLayout()); //버튼2 프레임
		button1.setPreferredSize(new Dimension(100, 60));

		frame.add(button1);
		frame.add(button2); // 버튼추가

		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}

}
