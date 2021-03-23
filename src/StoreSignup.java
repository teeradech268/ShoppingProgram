import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class StoreSignup {

	private JFrame frame;
	private JTextField Username;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreSignup window = new StoreSignup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StoreSignup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 423, 540);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\LABS\\Labs\\src\\img\\bg - Loginpage.png"));
		panel.add(lblNewLabel);
		
		passwordField_1 = new JPasswordField();
		panel.add(passwordField_1);
		
		JButton btnLogin = new JButton("SignIn");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(559, 333, 131, 37);
		frame.getContentPane().add(btnLogin);
		
		Username = new JTextField();
		Username.setColumns(10);
		Username.setBounds(479, 154, 263, 29);
		frame.getContentPane().add(Username);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(479, 136, 74, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(479, 192, 74, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblPkjKeystore = new JLabel("");
		lblPkjKeystore.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\LABS\\Labs\\src\\img\\300.png"));
		lblPkjKeystore.setBounds(455, 11, 327, 132);
		frame.getContentPane().add(lblPkjKeystore);
		
		JLabel lblVersion = new JLabel("Version 1.00");
		lblVersion.setBounds(751, 511, 74, 16);
		frame.getContentPane().add(lblVersion);
		
		JLabel lblRepeatpassword = new JLabel("Confirm Password");
		lblRepeatpassword.setBounds(479, 253, 110, 16);
		frame.getContentPane().add(lblRepeatpassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(479, 213, 263, 29);
		frame.getContentPane().add(passwordField);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(479, 280, 263, 29);
		frame.getContentPane().add(passwordField_2);
		frame.setBounds(100, 100, 869, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
