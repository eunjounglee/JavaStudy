package ch21;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LEG_LOGIN {
	public static void main(String[] args) {

		JFrame frame = new JFrame("로그인 화면");

		JPanel panel1 = new JPanel(); // 아이디
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.add(new JLabel("ID: "));
		JTextField idText = new JTextField(10);
		panel1.add(idText);

		JPanel panel2 = new JPanel(); // 비밀번호
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel2.add(new JLabel("password: "));
		JTextField passwordText = new JTextField(10);
		panel2.add(passwordText);

		JPanel panel3 = new JPanel(); // 아이디 비밀번호 배치
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		panel3.add(panel1);
		panel3.add(panel2);

		frame.add(panel3, BorderLayout.CENTER);

		JButton button = new JButton("로그인");
		frame.add(button, BorderLayout.SOUTH);// 로그인
		
		MouseListener ml = new MouseListener() {
			int count = 0;
			public void mouseClicked(MouseEvent arg0) {
				String id = "ai";
				String password = "1234";
				String inputid = idText.getText();
				String inputps = passwordText.getText();
				
				
					if (id.equals(inputid) && password.equals(inputps)) {
						System.out.println("로그인 되었습니다");
						JFrame frame2 = new JFrame("로그인 완료");
						frame2.setSize(400, 400);
						frame2.setVisible(true);
						
					} else if (id.equals(inputid)) {
						count++;
						System.out.println(count + "   비밀번호 오류!!");
					} else if (password.equals(inputps)) {
						count++;
						System.out.println(count + "   아이디 오류!!");
					} else {
						count++;
						System.out.println(count + "   오류!!");
				}
					if (count >= 5) {
						frame.setVisible(false);
					}
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

		button.addMouseListener(ml);

		frame.pack();
		frame.setSize(400, 150);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
