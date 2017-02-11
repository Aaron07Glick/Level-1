import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class myClass implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("add");
	JButton button2 = new JButton("sub");
	JButton button3 = new JButton("random");
	JLabel label = new JLabel();
	String num = "2";
	int realNum = Integer.parseInt(num);
	ImageIcon icon = new ImageIcon("panda.jpg");

	public static void main(String[] args) {
		myClass clazz = new myClass();
		clazz.createUI();

	}

	public void createUI() {

		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.setVisible(true);
		label.setText(num);
		panel.add(button2);
		panel.add(button3);
		panel.add(label);
		button.setIcon(icon);
		button.setPreferredSize(new Dimension(200, 200));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			label.setText("" + ++realNum);

		} else if (e.getSource() == button2) {
			label.setText("" + --realNum);
		} else if (e.getSource() == button3) {
			int random = new Random().nextInt(10);
			label.setText("" + random);
		}
	}
}
