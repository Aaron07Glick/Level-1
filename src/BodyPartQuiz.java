import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class BodyPartQuiz {


	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/billgates.jpeg";
	String secondImage = "/Users/league/Desktop/trump.jpg";
	String thirdImage = "/Users/league/Desktop/clinton.jpg";


	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			window.setSize(50, 50);
		// Make an int variable to hold the score.
			int score =0;
			String Quiz;
			String quiz;
			String quiZ;
		// Ask the user who this person is and store their answer
		Quiz = JOptionPane.showInputDialog("Who is this person?" );

		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
			if (Quiz.equalsIgnoreCase("bill gates")) {
				score += 1;
				JOptionPane.showMessageDialog(null, "Correct Your score is "+ score);
			}

		// Otherwise:
		// -- Tell them they are wrong
			else {
				JOptionPane.showMessageDialog(null, "Incorrect");
			}

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
			showNextImage();
			window.setSize(325, 325);
			quiz = JOptionPane.showInputDialog("Who is this person");
			if (quiz.equalsIgnoreCase("Donald Trump")) {
				score +=1;
				JOptionPane.showMessageDialog(null, "Correct, Your score is now " + score);
			}
			else {
				JOptionPane.showMessageDialog(null, "WRONG!!!");
			}
			showNextImage();
			window.setSize(50, 50);
			quiZ = JOptionPane.showInputDialog("Who is this person?");
			if (quiZ.equalsIgnoreCase("Hilary Clinton")) {
				score +=1;
				JOptionPane.showMessageDialog(null, "You are correct, Your new score is " + score);
			}
			else {
				JOptionPane.showMessageDialog(null, "wrong");
			}
			if (score == 3) {
				JOptionPane.showMessageDialog(null, "you lose");
			}
			else if (score <= 2) {
				JOptionPane.showMessageDialog(null, "you are a loser");
			}
	}


	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}


	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}


	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}


	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}


	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;


	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}


	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
