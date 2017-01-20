//Imports
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class RollMain {
public static void main(String[] args) {

//Definitions
JFrame frame = new JFrame("Roll!");
JPanel panel = new JPanel();
JButton d20 = new JButton("d20");
JButton d6 = new JButton("d6");
JButton d8 = new JButton("d8");
JLabel label = new JLabel("Spin to Win!");

	//Frame Parameters
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(250,125);
	frame.add(panel);
	
	//Panel Parameters
	panel.add(d20);
	panel.add(d6);
	panel.add(d8);
	panel.add(label);
	//Button Parameters
	d6.addActionListener(new Action2());
	d20.addActionListener(new Action());
	d8.addActionListener(new Action3());
	
	}
}
