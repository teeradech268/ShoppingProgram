import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JTextField;

import java.awt.BorderLayout;

import java.awt.Color;

import javax.swing.JPanel;

import javax.swing.JButton;

import java.awt.event.ActionListener;

import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

import java.awt.event.ActionEvent;

import java.awt.Font;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.UIManager;

import javax.swing.ImageIcon;

import java.awt.SystemColor;

import javax.swing.JPasswordField;
import java.awt.image.*;

public class KeyStore {

	private JFrame frame;

	private JTextField UserField;

	private JPasswordField passwordField;

	/**
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					KeyStore window = new KeyStore();

					window.frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * 
	 * Create the application.
	 * 
	 */

	public KeyStore() {

		initialize();

	}

	/**
	 * 
	 * Initialize the contents of the frame.
	 * 
	 */

	private void initialize() {

		frame = new JFrame();

		frame.getContentPane().setBackground(Color.WHITE);

		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();

		panel.setBackground(Color.DARK_GRAY);

		panel.setBounds(0, 0, 423, 540);

		frame.getContentPane().add(panel);

		JLabel lblNewLabel_1 = new JLabel("New label");

		lblNewLabel_1.setIcon(
				new ImageIcon(KeyStore.class.getResource("/img/games-wallpapers-3.jpg")));

		panel.add(lblNewLabel_1);

		JButton btnLogin = new JButton("SignUp");

		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				StoreSignup sign = new StoreSignup();
				sign.main();
				frame.setVisible(false);
			}

		});

		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));

		btnLogin.setBackground(new Color(100, 149, 237));

		btnLogin.setForeground(new Color(255, 255, 255));

		btnLogin.setBounds(627, 362, 131, 37);

		frame.getContentPane().add(btnLogin);

		UserField = new JTextField();

		UserField.setForeground(Color.BLACK);

		UserField.setColumns(10);

		UserField.setBounds(495, 212, 263, 29);

		frame.getContentPane().add(UserField);

		JLabel lblUsername = new JLabel("Username:");

		lblUsername.setForeground(Color.DARK_GRAY);

		lblUsername.setBounds(495, 185, 74, 16);

		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");

		lblPassword.setForeground(Color.DARK_GRAY);

		lblPassword.setBounds(495, 259, 74, 16);

		frame.getContentPane().add(lblPassword);

		JLabel lblVersion = new JLabel("Version 1.00");

		lblVersion.setBounds(751, 511, 74, 16);

		frame.getContentPane().add(lblVersion);

		JLabel lblNewLabel = new JLabel("");

		lblNewLabel.setBounds(466, 9, 336, 179);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(KeyStore.class.getResource("/img/300.png")));
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname = UserField.getText();
				String upass = passwordField.getText();
				try {
					String temp;
					BufferedReader read = new BufferedReader(new FileReader("regisFile.txt"));
					while ((temp = read.readLine()) != null) {
						String data[] = temp.split(",");
						if (uname.equals(data[0])&& upass.equals(data[1])) {
							Storemain main = new Storemain();
		                    UserClass user = new UserClass();
		                    user.setUsername(uname);
		                    main.main();
		                    frame.setVisible(false);
						}
					}
					read.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		});

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));

		btnNewButton.setBackground(new Color(186, 85, 211));

		btnNewButton.setBounds(495, 362, 122, 37);

		frame.getContentPane().add(btnNewButton);

		passwordField = new JPasswordField();

		passwordField.setBounds(495, 286, 263, 29);

		frame.getContentPane().add(passwordField);

		frame.setBounds(100, 100, 869, 587);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
