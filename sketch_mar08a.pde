import processing.opengl.*;
int depth = 500;
//Cube cubes = new Cube;
Cube cubes = new Cube(250, 105, depth/3);
void setup() {
size(640,480,P3D);
noStroke();

}

void draw() {
background(0);
fill(200);
pointLight(51, 102, 255, 65, 60, 100);
pointLight(200, 40, 60, -65, -60, -150);

// Raise overall light in scene
ambientLight(70, 70, 10);
translate(width/2,height/2,-depth);
rotateY(frameCount * 0.01);
cubes.drawCube();
}

class Cube{
int w,h,d;

Cube(int w, int h, int d){

this.w=w;
this.h=h;
this.d=d;
}
void drawCube(){
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
