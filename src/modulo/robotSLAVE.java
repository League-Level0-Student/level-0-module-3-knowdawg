package modulo;

import org.jointheleague.graphical.robot.Robot;

public class robotSLAVE {
static Robot meep = new Robot();
	
	 public static void main(String[] args) {
		 meep.penDown();
		 meep.setSpeed(100000);
		 
		 for (int i = 0; i < 1000; i++) {
			
	
		drawSquare();
		drawHecatontagon();
		 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	 
	 static void drawSquare() {
		 for (int i = 0; i < 4; i++) {
			meep.move(400/4);
			meep.turn(90);
		 }
		}
		 
		 static void drawTriangle() {
			 for (int i = 0; i < 3; i++) {
				meep.move(400/3);
				meep.turn(360/3);
				 
			}
		 
	 }
		 
		 static void drawHecatontagon() {
			 for (int i = 0; i < 30; i++) {
				meep.move(400/25);
				meep.turn(360/25);
				 
			}
		 
	 }
	 
}

