package LeagueInvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class gamepanel extends JPanel implements ActionListener, KeyListener {
	// gameobject object;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	RocketShip rocket = new RocketShip(250, 700, 50, 50);
	ObjectManager object = new ObjectManager();
	Timer timer;
	Font titleFont;
	Font titleFont2;
	Font titleFont3;

	gamepanel() {
		timer = new Timer(1000 / 60, this);
		// object = new gameobject();
		titleFont = new Font("Arial", Font.PLAIN, 48);
		titleFont2 = new Font("Arial", Font.PLAIN, 48);
		titleFont3 = new Font("Arial", Font.PLAIN, 48);
		object.addObject(rocket);
	}

	void updateMenuState() {
	}

	void updateGameState() {
		// rocket.update();
		object.update();

	}

	void updateEndState() {
	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, leagueInvaders.WIDTH, leagueInvaders.HEIGHT);
		g.setColor(Color.GREEN);
		g.setFont(titleFont);
		g.drawString("Press ENTER to start", 0, 400);
		g.setFont(titleFont2);
		g.drawString("LEAGUE INVADERS", 0, 100);

	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, leagueInvaders.WIDTH, leagueInvaders.HEIGHT);
		// rocket.draw(g);
		object.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.setFont(titleFont3);
		g.drawString("GAMEOVER", 70, 400);
	}

	void startgame() {
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// object.draw(g);
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		// object.update();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("test");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("test2");
		// System.out.println(e.getKeyChar());
		if (e.getKeyCode() == 10) {
			currentState++;
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			}

		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocket.up();
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocket.down();
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocket.left();
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocket.right();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("test3");
	}
}
