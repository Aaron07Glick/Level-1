class frogger{
public int x;
public int y;
public int hop;
  public frogger(int x, int y, int hop){
   this.x = x;
   this.y = y;
   this.hop = hop;
   
  }
}
frogger frog;
Car car;
void setup(){
size(400,400);
frog = new frogger(200,375,10);
car = new Car(100,100,100);
}  
void draw(){
  background(255,0,0);
  fill(0,255,0);
  ellipse(frog.x,frog.y,frog.hop,frog.hop);
}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
        if(wall(frog.y - frog.hop)==(true)){
         frog.y-=frog.hop;
        }
       
      }
      else if(keyCode == DOWN)
      {
        if(wall(frog.y + frog.hop)==(true)){
       frog.y+=frog.hop;
        }
        
      }
      else if(keyCode == RIGHT)
      {
       if(wall(frog.x + frog.hop)==(true)){
        frog.x+=frog.hop;
       }
      }
      else if(keyCode == LEFT)
      {
       if(wall(frog.x - frog.hop)==(true)){
        frog.x-=frog.hop;
       }
      }
   }
}
  public boolean wall(int value){
  
    if(value <= 400&&value>=0){
    return true;
  }
  else 
  return false;
  }

class Car{
  int x;
  int y;
  int speed;
  public Car(int x, int y, int speed){
 this.x = x;
 this.y = y;
 this.speed = speed;
 
}
}

