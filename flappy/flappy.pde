void setup(){
  size(500, 500);
  

}
int birdy = 10;
int birdx = 10;
int birdwidth = 10;
int birdheight = 10;
double gravity = .5;
double birdyvelocity = 1;
int pipex = 7;
int random;
void draw(){
background(0,256,0);
fill(0,0,256);
ellipse(birdx,birdy,10,10);
birdyvelocity+=gravity;
fill(256,0,0);
rect(pipex,random,20,700);
pipex--;
birdy+=birdyvelocity;
if(pipex == -10){
random = (int) random (1,500);
  pipex=  500;
}
}
void mousePressed(){
birdy-=birdyvelocity;
birdyvelocity=-5;

}

