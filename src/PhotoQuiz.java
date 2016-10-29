import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String picture = "https://yt3.ggpht.com/-v0soe-ievYE/AAAAAAAAAAI/AAAAAAAAAAA/OixOH_h84Po/s900-c-k-no-mo-rj-c0xffffff/photo.jpg";

		// 2. create a variable of type "Component" that will hold your image
		Component a;
		// 3. use the "createImage()" method below to initialize your Component
		a = createImage(picture);

		// 4. add the image to the quiz window
		quizWindow.add(a);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String quiz;
		quiz = JOptionPane.showInputDialog("is this picture a picture of google");
		// 7. print "CORRECT" if the user gave the right answer
		if (quiz.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else if (quiz.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "incorrect");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(a);
		// 10. find another image and create it (might take more than one line
		// of code)
		String picture2 = "https://pbs.twimg.com/profile_images/688769847900033024/Zdfx4cj5_400x400.png";
		Component b;
		b = createImage(picture2);
		// 11. add the second image to the quiz window
		quizWindow.add(b);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String quiz2;
		quiz2 = JOptionPane.showInputDialog("what is this picture of?");
		if (quiz2.equalsIgnoreCase("bing")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		// 14+ check answer, say if correct or incorrect, etc.
		if (quiz.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You have one point");
		}
		if (quiz2.equalsIgnoreCase("bing")) {
			JOptionPane.showMessageDialog(null, "You have two points");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
