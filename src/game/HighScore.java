package game;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class HighScore extends javax.swing.JFrame {
	private JDialog name_input;
	private JTextField jTextField1;
	private JLabel namel;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				HighScore inst = new HighScore();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public HighScore() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				name_input = new JDialog(this,"Gamer Name");
				BorderLayout name_inputLayout = new BorderLayout();
				getContentPane().add(name_input, BorderLayout.CENTER);
				name_input.setLayout(null);
				name_input.setName("namel");
				name_input.setSize(391, 142);
				{
					jTextField1 = new JTextField();
					name_input.getContentPane().add(jTextField1);
					jTextField1.setBounds(192, 40, 121, 23);
				}
				{
					namel = new JLabel();
					name_input.getContentPane().add(namel);
					namel.setText("Enter your Name");
					namel.setBounds(60, 43, 89, 16);
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
