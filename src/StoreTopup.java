import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class StoreTopup {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void Topup() throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreTopup window = new StoreTopup();
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
	public StoreTopup() {
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
		panel.setBounds(0, 0, 851, 31);
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel);
		
		JLabel lblVersion = new JLabel("Version 1.00");
		lblVersion.setBounds(751, 511, 74, 16);
		frame.getContentPane().add(lblVersion);
		
		JLabel lblInfoUser = new JLabel("Welcome ");
		lblInfoUser.setBounds(659, 44, 110, 21);
		lblInfoUser.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(lblInfoUser);
		
		JLabel lblCredit = new JLabel("Credit    ");
		lblCredit.setBounds(659, 68, 110, 21);
		lblCredit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().add(lblCredit);
		
		textField = new JTextField();
		textField.setBounds(198, 332, 230, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSerialNo = new JLabel("Serial No. ");
		lblSerialNo.setBounds(198, 302, 255, 31);
		lblSerialNo.setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().add(lblSerialNo);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(198, 376, 110, 31);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				int count = 0;
				
				
				String datacard500 = "P:\\cardshop500.txt";
				String DATA500 = "";
				try
				{
					File file = new File(datacard500);
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
					while ((line = br.readLine()) != null)
					{
						 
						if (name.equalsIgnoreCase(line))
						{
								
							JOptionPane.showMessageDialog(null, "you get money 500 bath.");
							count = 1;
							DATA500 += "USED";
						}
						DATA500 += line + System.lineSeparator();
						
				} 
					br.close();
				}
				
				catch (IOException e)
				{
					JOptionPane.showMessageDialog(null, "ERROR2");
				}
				
				try {
				PrintStream out = new PrintStream(new File(datacard500));
			    
				out.println(DATA500);
				out.close();
			
			} catch (FileNotFoundException b) {
				
				JOptionPane.showMessageDialog(null, "ERROR1");
			}//end card500
				
				
				String datacard1000 = "P:\\cardshop1000.txt";
				String DATA1000 = "";
				try
				{
					
					File file = new File(datacard1000);
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
					while ((line = br.readLine()) != null)
					{
						 
						if (name.equalsIgnoreCase(line))
						{
								
							JOptionPane.showMessageDialog(null, "you get money 1000 bath.");
							count = 1;
							DATA1000 += "USED";
						}
						DATA1000 += line + System.lineSeparator();
						
				} 
					br.close();
				}
				
				catch (IOException e)
				{
					JOptionPane.showMessageDialog(null, "ERROR2");
				}
				
				try {
				PrintStream out = new PrintStream(new File(datacard1000));
			    
				out.println(DATA1000);
				out.close();
			
			} catch (FileNotFoundException b) {
				
				JOptionPane.showMessageDialog(null, "ERROR1");
			}//end card1000
				
				
				String datacard2000 = "P:\\cardshop2000.txt";
				String DATA2000 = "";
				try
				{
					
					File file = new File(datacard2000);
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
					while ((line = br.readLine()) != null)
					{
						 
						if (name.equalsIgnoreCase(line))
						{
								
							JOptionPane.showMessageDialog(null, "you get money 2000 bath.");
							count = 1;
							DATA2000 += "USED";
						}
						DATA2000 += line + System.lineSeparator();
						
				} 
					br.close();
				}
				
				catch (IOException e)
				{
					JOptionPane.showMessageDialog(null, "ERROR2");
				}
				
				try {
				PrintStream out = new PrintStream(new File(datacard2000));
			    
				out.println(DATA2000);
				out.close();
			
			} catch (FileNotFoundException b) {
				
				JOptionPane.showMessageDialog(null, "ERROR1");
			}// end card2000
				
				
				
				if (count == 0)
					JOptionPane.showMessageDialog(null, "Pls try input code again!");
				
			}
		});
		frame.getContentPane().add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserClass user = new UserClass();
				Storemain stmain = new Storemain();
				StoreCart stcart = new StoreCart();
				if (user.getNumtotopup() == 1)
				{
					stmain.main();
				}
				else if (user.getNumtotopup() == 2)
				{
					stcart.StoreCart();
				}
			}
		});
		btnBack.setBounds(320, 376, 110, 31);
		frame.getContentPane().add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("P:\\LABS\\LABS\\Labs\\src\\LOGO-PAY-WITH-TMN.jpg"));
		label.setBounds(102, 42, 472, 228);
		frame.getContentPane().add(label);
		frame.setBounds(100, 100, 873, 595);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
