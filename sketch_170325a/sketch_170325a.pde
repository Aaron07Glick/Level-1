
class frogger {
  public int x;
  public int y;
  public int hop;
  public frogger(int x, int y, int hop) {
    this.x = x;
    this.y = y;
    this.hop = hop;
  }
  void setX(int x) {
    this.x = x;
  }
  void setY(int y) {
    this.y = y;
  }
}
frogger frog;
Car car1, car2, car3, car4;
int speed = 2;
int level = 1;
PImage carred, carred2;

void setup() {

  carred = loadImage("car.png");
  carred2 = loadImage("car2.png");

  size(400, 400);
  frog = new frogger(200, 375, 10);
  car1 = new Car(10, 50, speed+2);
  car2 = new Car(350, 115, -speed-1);
  car3 = new Car(10, 177, speed+1);
  car4 = new Car(350, 239, -speed);
}  
void draw() {

  background(255, 255, 0);
  fill(0, 255, 0);
  ellipse(frog.x, frog.y, frog.hop, frog.hop);
  car1.display(1);
  car2.display(2);
  car3.display(3);
  car4.display(4);
  car1.move();
  car2.move();
  car3.move();
  car4.move();
  if (intersects(car1)||intersects(car2)||intersects(car3)||intersects(car4)) {
    frog.setX(200);
    frog.setY(375);
    car1.speed = 4;
    car2.speed = -3;
    car3.speed = 3;
    car4.speed = -2;
    level = 1;
  }
  if (frog.y == 25) {
    car1.speed+=1;
    car2.speed-=1;
    car3.speed+=1;
    car4.speed-=1;
    frog.setX(200);
    frog.setY(375);
    level +=1;
    //println(car1.speed, car2.speed, car3.speed,car4.speed);
  }
  text("level " + level, 20, 30);
  textSize(40);
}
void keyPressed()
{
  if (key == CODED) {
    if (keyCode == UP)
    {
      if (wall(frog.y - frog.hop)==(true)) {
        frog.y-=frog.hop;
      }
    } else if (keyCode == DOWN)
    {
      if (wall(frog.y + frog.hop)==(true)) {
        frog.y+=frog.hop;
      }
    } else if (keyCode == RIGHT)
    {
      if (wall(frog.x + frog.hop)==(true)) {
        frog.x+=frog.hop;
      }
    } else if (keyCode == LEFT)
    {
      if (wall(frog.x - frog.hop)==(true)) {
        frog.x-=frog.hop;
      }
    }
  }
}
public boolean wall(int value) {

  if (value <= 400&&value>=0) {
    return true;
  } else 
    return false;
}

class Car {
  int x;
  int y;
  int speed;
  public Car(int x, int y, int speed) {
    this.x = x;
    this.y = y;
    this.speed = speed;
  }

  void move() {
    x+=speed;
    if (x>=400) {
      x=-50;
    } else if (x<=-50) {
      x=400;
    }
  }
  void display(int i) 
  {

    if (i % 2 == 0) {
      image(carred2,x,y);
      carred2.resize(0, 50);
    } else {  
      //println(x, y);
      image(carred, x, y);
      carred.resize(0, 50);
    }
  }
  int getX() {
    return this.x;
  }
  int getY() {
    return this.y;
  }
  int getSize() {
    return 50;
  }
}
boolean intersects(Car car) {
  if ((frog.y > car.getY() && frog.y < car.getY()+50) && (frog.x > car.getX() && frog.x < car.getX()+car.getSize()))
    return true;
  else 
    return false;
}

