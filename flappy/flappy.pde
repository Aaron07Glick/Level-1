void setup() {
  size(500, 500);
}
int birdy = 10;
int birdx = 10;
int birdwidth = 10;
int birdheight = 10;
double gravity = .5;
double birdyvelocity = 1;
int pipex = 375;
int pipex2 = 475;
int random=500;
int random2=500;
int h=20;
int l=700;
int score=0;
void draw() {
  background(0, 256, 0);
  fill(0, 0, 256);
  ellipse(birdx, birdy, 10, 10);
  birdyvelocity+=gravity;
  fill(256, 0, 0);
  rect(pipex2, 0, 20, random-20);
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
    pipex2=  500;
  }
  if (birdx>pipex&&birdx<pipex+h) {
    if (birdy>random&&birdy<height) {
      println("test "+birdy);
    }
  }
  if(birdx>pipex2&&birdx<pipex2+h){
  if(birdy<random-20&&birdy>0){
  println("test2 "+birdy);
  }
  }
  text(score, 10, 10);
}


void mousePressed() {
  birdy-=birdyvelocity;
  birdyvelocity=-5;
}

