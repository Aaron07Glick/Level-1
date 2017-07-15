package LeagueInvaders;

import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive;

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

	}

	void draw(Graphics h) {
		// h.fillRect(x, y, 100, 100);
	}
}
