//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		int score = 0;
		int b = 0;
		// 3. Change this line to give you a random number between 1 - 100.

		// 2. Print out the random variable above
		// System.out.println(random);
		// 11. do the following 10 times
		for (int j = 10; j > 0; j--) {
			int random = new Random().nextInt(100) + 1;
			for (int i = 0; i < j; i++) {
				b = j - 1;

				// 1. ask the user for a guess using a pop-up window, and save their response
				String guessNoInt = JOptionPane.showInputDialog("guess a number beetween 1 and 100");
				// 4. convert the users’ answer to an int (Integer.parseInt(string))
				int guess = Integer.parseInt(guessNoInt);
				// 5. if the guess is correct
				if (guess == random) {
					JOptionPane.showMessageDialog(null, "YOU WIN!!!!!!!!!!!!!!");
					score = score += (10 - i);
					JOptionPane.showMessageDialog(null,
							"You have " + b + " guesses in the next round. Your score is " + score);
					break;
				} else if (guess > random) {
					JOptionPane.showMessageDialog(null, "Your guess is to hiGH!");
				} else if (guess < random) {
					JOptionPane.showMessageDialog(null, "Your guess is to LOw..!");
				}
				// 6. win
				// 7. if the guess is high
				// 8. tell them it's too high
				// 9. if the guess is low
				// 10. tell them it's too low
				if (i == j - 1) {

					JOptionPane.showMessageDialog(null, "I'm sorry but you LoSe!.? The corect answer is " + random);
					System.exit(0);
				}
			}
			// 12. tell them they lose

		}
		JOptionPane.showMessageDialog(null, "YOU Beat The GAME!?!?!?!?!?!!?!!?!?!??! WHAT!!!! Yout score is " + score);
	}

}
