
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot meep = new Robot();

		for (int x = 0; x < 99999; x++) {

			// 3. ask the user what color they would like the robot to draw
			String color = JOptionPane.showInputDialog("What color would you like?(red, blue.)");
			// 4. use an if/else statement to set the pen color that the user requested
			if (color.equals("red")) {
				meep.setPenColor(Color.red);

			} else if (color.equals("blue")) {
				meep.setPenColor(Color.blue);

			} else {
				meep.setRandomPenColor();

			}
			// 5. if the user doesn’t enter anything, choose a random color

			// 6. put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 2. set the pen width to 10
			meep.setPenWidth(1000);
			// 1. make the robot draw a shape (this will take more than one line of code)
			for (int i = 0; i < 4; i++) {
				meep.penDown();
				meep.setSpeed(3000);
				meep.move(1);
				meep.turn(3);

			}

		}
	}
}
