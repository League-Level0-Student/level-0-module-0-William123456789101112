package _99_extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint 
{
	public static void main(String[] args) 
	{
		String favColor = JOptionPane.showInputDialog("What is your favorite color?");
		
		Robot rob = new Robot();
		
		rob.setSpeed(100);
		rob.penDown();
		if (favColor.equals("blue"))
			{
				JOptionPane.showMessageDialog(null, "My favorite color is also blue!");
				rob.setPenColor(Color.BLUE);
			}
		else if (favColor.equals("red"))
			{
				JOptionPane.showMessageDialog(null, "My favorite color is also blue!");
				rob.setPenColor(Color.RED);
			}
		else if (favColor.equals("green"))
		{
			JOptionPane.showMessageDialog(null, "My favorite color is also green!");
			rob.setPenColor(Color.GREEN);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sadly my favorite color is not the same as yours");
			rob.setRandomPenColor();
		}
		
		
		
		for (int i = 0; i < 3; i++) 
		{
			rob.move(300);
			rob.turn(120);
		}
		
		
		
	}
}
