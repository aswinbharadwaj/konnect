package gui;


import java.awt.*;
import javax.swing.*;



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
public class LoginPanel extends javax.swing.JPanel {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	
	private JToggleButton signin;
	private JLabel header;
	private JCheckBox invisible;
	private JFormattedTextField unamef;
	private JPasswordField passf;
	private JLabel pass;
	private JLabel uname;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new LoginPanel());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public LoginPanel() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(358, 277));
			this.setLayout(null);
			this.setBackground(new java.awt.Color(168,189,244));
			{
				uname = new JLabel();
				this.add(uname);
				uname.setText("User Name :");
				uname.setBounds(88, 112, 150, 16);//64
				uname.setFont(new java.awt.Font("Bradley Hand ITC",1,14));
			}
			{
				signin = new JToggleButton();
				this.add(signin);
				signin.setText("Sign In");
				signin.setBounds(123, 249, 100, 23);//50
				signin.setMnemonic(java.awt.event.KeyEvent.VK_S);
				signin.setFont(new java.awt.Font("Forte",0,14));

			}
			{
				pass = new JLabel();
				this.add(pass);
				pass.setText("Password   :");
				pass.setBounds(88, 158, 87, 16);
				pass.setFont(new java.awt.Font("Bradley Hand ITC",1,14));
			}
			{
				passf = new JPasswordField();
				this.add(passf);
				passf.setBounds(175, 155, 113, 23);
			}
			{
				unamef = new JFormattedTextField();
				this.add(unamef);
				this.add(getInvisible());
				this.add(getHeader());
				unamef.setText("username");
				unamef.setBounds(175, 109, 113, 23);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
	private JCheckBox getInvisible() {
		if(invisible == null) {
			invisible = new JCheckBox();
			invisible.setText("Sign in Invisible");
			invisible.setBounds(123, 202, 150, 20);
			invisible.setMnemonic(java.awt.event.KeyEvent.VK_I);
			invisible.setFont(new java.awt.Font("Bradley Hand ITC",1,14));
			invisible.setBackground(new java.awt.Color(168,189,244));
		}
		return invisible;
	}
	
	private JLabel getHeader() {
		if(header == null) {
			header = new JLabel();
			header.setText("Login to konnecT");
			header.setBounds(51, 28, 249, 27);
			header.setBackground(new java.awt.Color(168,189,244));
			header.setFont(new java.awt.Font("Bradley Hand ITC",1,26));
		}
		return header;
	}

}
