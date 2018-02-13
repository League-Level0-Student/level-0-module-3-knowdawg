
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot meep = new Robot("mini");
		meep.penDown();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		meep.moveTo(0, 200);
		// 2. Make the robot draw a star shape. Hint: 144.
		for (int i = 0; i < 100; i++) {

			for (int x = 0; x < 5; x++) {
				meep.setSpeed(50);
				meep.move(30);
				meep.turn(144);
			}
			meep.setAngle(90);
			meep.move(50);
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
