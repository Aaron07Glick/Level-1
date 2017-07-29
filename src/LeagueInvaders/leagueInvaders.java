package LeagueInvaders;

import javax.swing.JFrame;

public class LeagueInvaders {
	public static void main(String[] args) {
		LeagueInvaders league = new LeagueInvaders();
	}

	static final int WIDTH = 500;
	static final int HEIGHT = 800;
	JFrame frame;
	gamepanel game;

	LeagueInvaders() {
		frame = new JFrame();
		game = new gamepanel();
		setup();

	}

	void setup() {
		frame.add(game);
		frame.setVisible(true);
		frame.addKeyListener(game);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.startgame();
	}
}
