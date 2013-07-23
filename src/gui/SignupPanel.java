package gui;

import java.awt.Dimension;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

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
public class SignupPanel extends javax.swing.JPanel {
	private JLabel name;
	private JFormattedTextField namef;
	private JSpinner jSpinner1;
	private JSpinner sex;
	private JLabel age;
	private JLabel sexl;
	private JFormattedTextField emailf;
	private JLabel email;
	private JButton signup;
	private JLabel header;
	private JLabel confirm;
	private JPasswordField passcf;
	private JLabel passf;
	private JPasswordField pass;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new SignupPanel());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public SignupPanel() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(600, 160));
			this.setLayout(null);
			this.setBackground(new java.awt.Color(194,114,194));
			{
				name = new JLabel();
				this.add(name);
				name.setText("Name");
				name.setBounds(92, 47, 54, 16);
				name.setFont(new java.awt.Font("Bradley Hand ITC",1,14));
			}
			{
				namef = new JFormattedTextField();
				this.add(namef);
				namef.setText("name");
				namef.setBounds(181, 42, 130, 23);
			}
			{
				pass = new JPasswordField();
				this.add(pass);
				pass.setBounds(181, 84, 130, 23);
			}
			{
				passf = new JLabel();
				this.add(passf);
				passf.setText("Password");
				passf.setBounds(92, 87, 77, 16);
				passf.setFont(new java.awt.Font("Bradley Hand ITC",1,14));
			}
			{
				passcf = new JPasswordField();
				this.add(passcf);
				passcf.setBounds(181, 119, 130, 23);
			}
			{
				confirm = new JLabel();
				this.add(confirm);
				confirm.setText("confirm");
				confirm.setBounds(92, 122, 66, 16);
				confirm.setFont(new java.awt.Font("Bradley Hand ITC",1,14));
			}
			{
				header = new JLabel();
				this.add(header);
				header.setText("Connect with konnecT");
				header.setBounds(40, 12, 253, 16);
				header.setFont(new java.awt.Font("Bradley Hand ITC",1,24));
			}
			{
				signup = new JButton();
				this.add(signup);
				signup.setBounds(507, 59, 71, 48);
				signup.setBackground(new java.awt.Color(255,255,255));
				signup.setIcon(new ImageIcon(getClass().getClassLoader().getResource("images/icons/right.png")));
			}
			{
				email = new JLabel();
				this.add(email);
				email.setText("Email");
				email.setBounds(328, 45, 42, 16);
				email.setFont(new java.awt.Font("Bradley Hand ITC",1,14));
			}
			{
				emailf = new JFormattedTextField();
				this.add(emailf);
				emailf.setText("ex@gmail.com");
				emailf.setBounds(382, 38, 113, 23);
			}
			{
				SpinnerListModel sexModel = 
						new SpinnerListModel(
								new String[] { "Male", "Female"});
				sex = new JSpinner();
				this.add(sex);
				sex.setModel(sexModel);
				sex.setBounds(382, 84, 99, 23);
			}
			{
				sexl = new JLabel();
				this.add(sexl);
				sexl.setText("Sex");
				sexl.setBounds(328, 87, 42, 16);
				sexl.setFont(new java.awt.Font("Bradley Hand ITC",1,14));
			}
			{
				age = new JLabel();
				this.add(age);
				age.setText("Age");
				age.setBounds(328, 122, 42, 16);
				age.setFont(new java.awt.Font("Bradley Hand ITC",1,14));
			}
			{
				SpinnerListModel jSpinner1Model = 
						new SpinnerListModel(
								new String[] {  "kid","guy","girl","dad","mom","granny","granpa" });
				jSpinner1 = new JSpinner();
				this.add(jSpinner1);
				jSpinner1.setModel(jSpinner1Model);
				jSpinner1.setBounds(382, 117, 99, 23);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
