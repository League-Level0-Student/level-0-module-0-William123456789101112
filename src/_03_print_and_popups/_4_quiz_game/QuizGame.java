package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero.
		int userScore = 0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String date = JOptionPane.showInputDialog("What's today's date?");

				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		if (date.equals("May 16th"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			userScore += 1;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect!");
			userScore -= 1;
		}
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String addition = JOptionPane.showInputDialog("What is 2+2?");
		
		if (addition.equals("4"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			userScore += 1;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect!");
			userScore -= 1;
		}
		String history = JOptionPane.showInputDialog("What year was the President elected?)");
		
		if (history.equals("2016"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			userScore += 1;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect!");
			userScore -= 1;
		}
		
		
		JOptionPane.showMessageDialog(null, "Your final score is: " + userScore);
		// After all the questions have been asked, tell the user their final score 
		
	}
}
