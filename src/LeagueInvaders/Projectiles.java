package LeagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Projectiles extends GameObject{
	int speed = 10;
	Projectiles(int x, int y, int width, int height, boolean isAlive) {
		super(x, y, width, height, isAlive);
		// TODO Auto-generated constructor stub
	}
	void update(){
		super.update();
		y-=speed;
		if(y<=0){
			isAlive=false;
		}
	}
	void draw(Graphics g){
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
		g.drawImage(gamepanel.bulletImg, x, y, width, height, null);
	}
	
}
