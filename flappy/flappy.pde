void setup() {
  size(500, 500);
}
int birdy = 10;
int birdx = 10;
int birdwidth = 10;
int birdheight = 10;
double gravity = .5;
double birdyvelocity = 1;
int pipex = 7;
int pipex2 = 56;
int random;
int random2;
int pipeY;
int h=20;
int l=700;
void draw() {
  background(0, 256, 0);
  fill(0, 0, 256);
  ellipse(birdx, birdy, 10, 10);
  birdyvelocity+=gravity;
  fill(256, 0, 0);
  rect(pipex2, 0, 20, random-50);
  fill(256, 0, 0);
  rect(pipex, random, h, l);
  pipex--;
  pipex2--;
  birdy+=birdyvelocity;
  if (pipex < -100) {
    random = (int) random (1, 500);
    pipex=  500;
  }
  if (pipex2 < -100) {
    random2 = (int) random (1, 500);
    pipex2=  500;
  }
}
boolean intersects(int birdX, int birdY, int pipex, int paddleY, int l) {
if (birdY > paddleY - 4 && birdX > pipex && birdX < pipex + l){
return true;}
else {
  println("test");
return false;}
}

void mousePressed() {
  birdy-=birdyvelocity;
  birdyvelocity=-5;
}

