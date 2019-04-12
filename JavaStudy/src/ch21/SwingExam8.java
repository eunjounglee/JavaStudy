package ch21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingExam8 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Multi Layout Manager");
		frm.setBounds(120, 120, 250, 150);
		frm.setLayout(new BorderLayout());

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());

//		 panel1.add(new JButton("B1"));
//		 panel1.add(new JButton("B2"));
//		 panel1.add(new JButton("B3"));
//		 panel1.add(new JButton("B4"));

		String[] buttons1 = { "B1", "B2", "B3", "B4" };
		for (String s : buttons1) {
			panel1.add(new JButton(s));
		}
		panel1.setBackground(Color.WHITE);
		
		/*
		 * String[] buttons1 = { "B1", "B2", "B3", "B4"}; 
		 * for (String s : buttons1) {
		 * panel1.add(new JButton(s)); }
		 */

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2, 3, 2, 2));
		panel2.add(new JButton("B5"));
		panel2.add(new JButton("B6"));
		panel2.add(new JButton("B7"));
		panel2.add(new JButton("B8"));
		panel2.add(new JButton("B9"));
		panel2.add(new JButton("B10"));
		panel2.setBackground(Color.WHITE);

		frm.add(panel1, BorderLayout.NORTH);
		frm.add(panel2, BorderLayout.CENTER);

		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
