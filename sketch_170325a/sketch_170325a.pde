class frogger {
  public int x;
  public int y;
  public int hop;
  public frogger(int x, int y, int hop) {
    this.x = x;
    this.y = y;
    this.hop = hop;
  }
  void setX(int x){
  this.x = x;
  }
  void setY(int y){
  this.y = y;
  }
}
frogger frog;
Car car1, car2,car3,car4;
void setup() {
  size(400, 400);
  frog = new frogger(200, 375, 10);
  car1 = new Car(10, 50, 9);
  car2 = new Car(350,115,-7);
  car3 = new Car(10, 177,5);
  car4 = new Car(350,239,-3);
}  
void draw() {
  background(255, 0, 0);
  fill(0, 255, 0);
  ellipse(frog.x, frog.y, frog.hop, frog.hop);
  car1.display();
  car2.display();
  car3.display();
  car4.display();
  car1.move();
  car2.move();
  car3.move();
  car4.move();
  if (intersects(car1)||intersects(car2)||intersects(car3)||intersects(car4)){
  frog.setX(200);
  frog.setY(375);
  }
  if (frog.y == 25){
  text("Win", 200, 200);
  textSize(100);
  }
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
  void move(){
  x+=speed;
  if(x>=400){
  x=-50;
  }
  else if(x<=-50){
  x=400;
  }
  }
  void display() 
  {
    fill(0, 255, 0);
    rect(x, y, 50, 50);
  }
  int getX(){
  return this.x;
  }
  int getY(){
  return this.y;
  }
  int getSize(){
 return 50;
  }
  
}
boolean intersects(Car car) {
if ((frog.y > car.getY() && frog.y < car.getY()+50) && (frog.x > car.getX() && frog.x < car.getX()+car.getSize()))
          return true;
    else 
        return false;
}


