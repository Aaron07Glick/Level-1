package calc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel displaypanel = new JPanel();
	JButton button1 = new JButton("7");
	JButton button2 = new JButton("8");
	JButton button3 = new JButton("9");
	JButton button4 = new JButton("/");
	JButton button5 = new JButton("4");
	JButton button6 = new JButton("5");
	JButton button7 = new JButton("6");
	JButton button8 = new JButton("*");
	JButton button9 = new JButton("1");
	JButton button10 = new JButton("2");
	JButton button11 = new JButton("3");
	JButton button12 = new JButton("-");
	JButton button13 = new JButton("C");
	JButton button14 = new JButton("0");
	JButton button15 = new JButton("+");
	JButton button16 = new JButton("=");
	JLabel label = new JLabel("hello", JLabel.CENTER);

	View() {
		frame.add(displaypanel);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(2, 1));
		panel.setLayout(new GridLayout(4, 4));
		displaypanel.add(label);
		label.setBorder(BorderFactory.createLineBorder(Color.RED));
		label.setPreferredSize(new Dimension(50, 50));
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		// frame.pack();

	}
}
