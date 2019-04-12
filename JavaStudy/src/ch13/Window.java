package ch13;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) {

		JFrame frame = new JFrame("윈도우");
		JButton button = new JButton("나는 버튼");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
//    		button.addMouseListener(new MouseListener() { //익명클래스
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub		
//			}
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub			
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//			}
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub	
//			}
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub			
//			}});

		
		MyMouseListener ml = new MyMouseListener();
		button.addMouseListener(ml);

		frame.setLayout(new FlowLayout()); //버튼 프레임
		button.setPreferredSize(new Dimension(100, 60));
		
		button.setBackground(Color.PINK); //버튼 색상

		frame.add(button);
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
