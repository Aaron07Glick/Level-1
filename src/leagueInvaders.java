import javax.swing.JFrame;
import javax.swing.JPanel;

public class leagueInvaders {
	public static void main(String[] args) {
		leagueInvaders league = new leagueInvaders();
	}
	static final int WIDTH = 500;
	static final int HEIGHT = 800;
	JFrame frame;
	gamepanel game;
	
		leagueInvaders(){
		frame = new JFrame();
		game = new gamepanel();
		setup();
		
	}
	void setup(){
		frame.add(game);
		frame.setVisible(true);
		frame.addKeyListener(game);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		game.startgame();
	}
}
