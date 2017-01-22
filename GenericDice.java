//Imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JLabel;
public class GenericDice implements ActionListener{
	
	//Creating Constructor
	private int sidesPrivate;
	private JLabel labelPrivate;
		public GenericDice(int sides,JLabel label) {
			sidesPrivate = sides;
			labelPrivate = label;
		}
		
	//Creating RNG
	Random rand = new Random();
		public void actionPerformed (ActionEvent e) {
			//d20 Button Action
			int randint = rand.nextInt(sidesPrivate)+1;
			rand.nextInt();
			labelPrivate.setText("Your d" + sidesPrivate + " Rolled a " + randint);
		}
}