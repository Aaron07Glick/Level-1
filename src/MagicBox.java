
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	void method() {

	}

	/*
	 * Work together as a TEAM of 2 or 3 to make this project. We are going to
	 * hide secrets within the magic box. When the user clicks on a secret
	 * place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 * 
	 * 2. When the mouse is clicked, use the Media Palace (bit.ly/media-palace)
	 * to play sounds, show images or speak.
	 * 
	 * 3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you
	 * the color of the current pixel.
	 */
	public JLabel loadImageFromTheInternet(String imageURL) throws MalformedURLException {
		URL url = new URL(imageURL);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	}

	BufferedImage backgroundImage;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new MagicBox());
	}

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	JFrame frame;
	JPanel panel = new JPanel();

	private void createUI() {
		frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setVisible(true);
		frame.addMouseListener(this);
		frame.add(panel);
		try {
			frame.add(loadImageFromTheInternet("http://www.colorcombos.com/images/colors/FF0000.png"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "/Users/league/Google Drive/league-images/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	JLabel newImage = null;

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		try {
			newImage = loadImageFromTheInternet("http://www.colorcombos.com/images/colors/FF0000.png");
			System.out.println("test");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("x " + e.getX());
		System.out.println("Y " + e.getY());
		if (e.getX() >= 70 && e.getX() <= 83 && e.getY() >= 92 && e.getY() <= 100) {
			System.out.println("test");
			frame.add(newImage);
		}
		frame.setLayout(new GridLayout(1, 2));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
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

}
