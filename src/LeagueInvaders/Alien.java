package LeagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{

	Alien(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);
		// TODO Auto-generated constructor stub
	}
	void update(){
		super.update();
		y+=1;
	}
	void draw(Graphics g){
		//g.setColor(Color.YELLOW);
		//g.fillRect(x, y, width, height);
		g.drawImage(gamepanel.alienImg, x, y, width, height, null);

	}
}
