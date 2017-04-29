import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char letter;
	char generateRandomLetter(){
		Random r = new Random();
		return (char) (r.nextInt(26)+ 'a');
	}
	public static void main(String[] args) {
	typingTutor tutor = new typingTutor();
	
	}
	typingTutor(){
		frame.setVisible(true);
		frame.setSize(100, 100);
		frame.add(panel);
		panel.add(label);
		label.setText(""+generateRandomLetter());
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 System.out.println(e);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 letter = generateRandomLetter();
		 label.setText("" + letter);
		 System.out.println(letter);
		
	}
}
