import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int speed;
void setup(){
minim = new Minim(this);
song = minim.loadFile("record.wav", 512);
song.play();
pictureOfRecord = loadImage("record.jpeg");

size(pictureOfRecord.width, pictureOfRecord.height);
}
void draw(){
speed+=100;
if (mousePressed == true){
  rotateImage(pictureOfRecord, speed);
}
if (mousePressed == true){
song.play();
}
else{
song.pause();
}
image(pictureOfRecord, 0,0);

}
void rotateImage(PImage image, int amountToRotate){
translate(width/2, height/2);
rotate(amountToRotate*TWO_PI/360);
translate(-image.width/2, -image.height/2);
}
