import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class myGUI implements ActionListener, KeyListener{
	JFrame window;
	JPanel panel;
	JButton button;
	JButton button2;
	JTextField Text;
	public static void main(String[] args) {
		myGUI gui = new myGUI();
		gui.run();
	}
	public void run(){
		window = new JFrame();
		window.addKeyListener(this);
		panel = new JPanel();
		window.setVisible(true);
		window.add(panel);
		window.setSize(800, 800);
		button = new JButton("Click me");
		panel.add(button);
		button.addActionListener(this);
		button2 = new JButton("Dont click me");
		panel.add(button2);
		button2.addActionListener(this);
		Text = new JTextField(10);
		panel.add(Text);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			System.out.println("Hello");
		}
		else if (e.getSource()==button2) {
			System.out.println("I said dont touch");
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println((char)e.getKeyCode());
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
