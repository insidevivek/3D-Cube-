import processing.core.*; 
import processing.xml.*; 

import processing.opengl.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class sketch_mar08a extends PApplet {


int depth = 500;
//Cube cubes = new Cube;
Cube cubes = new Cube(250, 105, depth/3);
public void setup() {
size(640,480,P3D);
noStroke();

}

public void draw() {
background(0);
fill(200);
pointLight(51, 102, 255, 65, 60, 100);
pointLight(200, 40, 60, -65, -60, -150);

// Raise overall light in scene
ambientLight(70, 70, 10);
translate(width/2,height/2,-depth);
rotateY(frameCount * 0.01f);
cubes.drawCube();
}

class Cube{
int w,h,d;

Cube(int w, int h, int d){

this.w=w;
this.h=h;
this.d=d;
}
public void drawCube(){
beginShape(QUADS);
vertex(-w/2,-h/2,-d/2);
vertex(w,-h/2,-d/2);
vertex(w,h,-d/2);
vertex(-w/2,h,-d/2);

vertex(-w/2 , -h/2 , d);
vertex(w, -h/2 , d );
vertex(w , h , d );
vertex(-w/2 , h , d );

// Left face
vertex(-w/2 , -h/2 , -d/2 );
vertex(-w/2 , -h/2, d );
vertex(-w/2, h , d );
vertex(-w/2 , h , -d/2 );

// Right face
vertex(w , -h/2 , -d/2 );
vertex(w , -h/2 , d );
vertex(w , h , d );
vertex(w , h , -d/2 );

// Top face
vertex(-w/2 , -h/2 , -d/2 );
vertex(w , -h/2 , -d/2 );
vertex(w , -h/2 , d );
vertex(-w/2 , -h/2 , d );

// Bottom face
vertex(-w/2 , h , -d/2 );
vertex(w , h , -d/2 );
vertex(w , h , d );
vertex(-w/2 , h , d );

endShape();
}
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "sketch_mar08a" });
  }
}
