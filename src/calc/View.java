package calc;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
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
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	// JLabel label = new JLabel("hello", JLabel.CENTER);

	View() {

		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		panel.setLayout(new GridLayout(5, 4));
		// label.setBorder(BorderFactory.createLineBorder(Color.RED));
		// label.setPreferredSize(new Dimension(50, 50));
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
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

	void viewSetLabel1(int input1) {
		label1.setText(input1 + "");
	}

	void viewSetLabel2(String input2) {
		label1.setText(input2 + "");
	}

	void viewSetLabel3(int input3) {
		label1.setText(input3 + "");
	}

	void viewSetLabel4(int output) {
		label1.setText(output + "");
	}

	void addListener() {
		button1.addActionListener(new Controller());
		button2.addActionListener(new Controller());
		button3.addActionListener(new Controller());
		button4.addActionListener(new Controller());
		button5.addActionListener(new Controller());
		button6.addActionListener(new Controller());
		button7.addActionListener(new Controller());
		button8.addActionListener(new Controller());
		button9.addActionListener(new Controller());
		button10.addActionListener(new Controller());
		button12.addActionListener(new Controller());
		button13.addActionListener(new Controller());
		button14.addActionListener(new Controller());
		button15.addActionListener(new Controller());
		button16.addActionListener(new Controller());
	}

}
