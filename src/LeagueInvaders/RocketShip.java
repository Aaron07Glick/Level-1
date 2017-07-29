package LeagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {
	int speed;

	public RocketShip(int x, int y, int width, int height) {
		super(x, y, width, height, true);
		speed = 5;
	}

	void update() {
		super.update();
	}

	void draw(Graphics g) {
		//g.setColor(Color.BLUE);
		//g.fillRect(x, y, width, height);
		g.drawImage(gamepanel.rocketImg, x,y,width,height,null);

	}

	public void up() {
		// TODO Auto-generated method stub
		y -= speed;
	}

	public void down() {
		// TODO Auto-generated method stub
		y += speed;
		
	}

	public void left() {
		// TODO Auto-generated method stub
		x -= speed;
	}

	public void right() {
		// TODO Auto-generated method stub
		x += speed;
	}
}
