import org.jointheleague.graphical.robot.Robot;

public class robotGrafiti {
	public static void main(String[] args) {
		// finishLater
		A();
		C();
		G();
	}

	static void A() {
		Robot aaron = new Robot("batman");
		aaron.hide();
		aaron.moveTo(25, 700);
		aaron.setSpeed(7);
		aaron.penDown();
		aaron.turn(30);
		aaron.move(250);
		aaron.turn(120);
		aaron.move(250);
		aaron.turn(180);
		aaron.move(250 / 2);
		aaron.turn(300);
		aaron.move(125);
		aaron.hide();
	}

	static void C() {
		Robot conrad = new Robot();
		conrad.hide();
		conrad.moveTo(410, 690);
		conrad.setSpeed(10);
		conrad.penDown();
		conrad.turn(-90);
		for (int i = 0; i < 180; i++) {
			conrad.move(2);
			conrad.turn(1);
			conrad.hide();
		}

	}

	static void G() {
		Robot glick = new Robot();
		glick.hide();
		glick.moveTo(650, 600);
		glick.penDown();
		glick.setSpeed(10);
		glick.turn(90);
		glick.move(70);
		glick.turn(90);
		for (int i = 0; i < 270; i++) {
			glick.move(2);
			glick.turn(1);
		}

	}
}
