//Imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Action2 implements ActionListener{
	//Creating RNG
	Random rand = new Random();
		public void actionPerformed (ActionEvent e) {
			//d6 Button Action
			int randint = rand.nextInt(6)+1;
			rand.nextInt();
			JFrame frame2 = new JFrame("Result");
			frame2.setVisible(true);
			frame2.setSize(100,100);
			JLabel label = new JLabel("You Rolled a " + randint);
			JPanel panel2 = new JPanel();
			frame2.add(panel2);
			panel2.add(label);
			
		}
}