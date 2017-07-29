package LeagueInvaders;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive;
	Rectangle collisionBox = new Rectangle(x, y, width, height);
	GameObject(int x, int y, int width, int height, boolean isAlive) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.isAlive = isAlive;
	}

	void update() {
		// x++;
		// y++;
		collisionBox.setBounds(x,y,width,height);
	}

	void draw(Graphics h) {
		// h.fillRect(x, y, 100, 100);
	}
}
