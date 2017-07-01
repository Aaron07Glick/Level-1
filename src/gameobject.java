import java.awt.Graphics;

public class gameobject {
	int x;
	int y;
	int width;
	int height;
	
	gameobject(){
		
	}
	void update(){
		x++;
		y++;
		
	}
	void draw(Graphics h){
		h.fillRect(x, y, 100, 100);
	}
}
