import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class practiceTest implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button = new JButton("submit");
	static JButton button2 = new JButton("hint");
	static JLabel label = new JLabel("What is the answer to the universe");
	static JTextField text = new JTextField(10);

	public static void main(String[] args) {
		practiceTest practice = new practiceTest();
		text.setText("test");
		String ans = text.getText();
		System.out.println(ans);
	}

	practiceTest() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(label);
		panel.add(text);

		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		 if (text.getText().equals("42")) {
		 JOptionPane.showMessageDialog(null, "Correct");
	}
}
