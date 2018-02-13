
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String meep = JOptionPane.showInputDialog("PeRsOn?.!.?.!.");
		// 3. Print out what the user typed
		JOptionPane.showConfirmDialog(null, "" + meep);

		if (meep.equals("dad")) {
			JOptionPane.showMessageDialog(null, "JUNE 9TH!!!!!! ARG!!");

		} else if (meep.equals("mom")) {
			JOptionPane.showMessageDialog(null, "January 24th");

		} else if (meep.equals("me")) {
			JOptionPane.showMessageDialog(null,
					"HOW CAN YOU FORGET YOUR OWN BIRTHDAY! I WILL NOT TELL YOU BECAUSE I REFUSE TO!!!!");

		} else {
			JOptionPane.showMessageDialog(null,
					"d             o                    n                          t                                   k                                     n                                           o                             w                                          t                                        h                               a                                  t                                     n                              a                                        m                                   e                                                      .");

		}
		// 4. if user asked for "mom"
		// print mom's birthday
		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
//