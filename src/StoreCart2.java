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
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StoreCart2 extends JFrame {

	private JPanel contentPane;
	private int count , gototopup = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreCart2 frame = new StoreCart2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StoreCart2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
Storemain2 stmain = new Storemain2();
		

		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 851, 31);
		getContentPane().add(panel);
		
		JLabel lblVersion = new JLabel("Version 1.00");
		lblVersion.setBounds(751, 511, 74, 16);
		getContentPane().add(lblVersion);
		
		JLabel lblInfoUser = new JLabel("Welcome :");
		lblInfoUser.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInfoUser.setBounds(659, 44, 82, 21);
		getContentPane().add(lblInfoUser);
		
		JLabel label = new JLabel("SHOPPING CART");
		label.setFont(new Font("Tahoma", Font.BOLD, 37));
		label.setBounds(200, 31, 384, 118);
		getContentPane().add(label);
		
		
		JLabel lblTotal = new JLabel("TOTAL : " );
		lblTotal.setForeground(Color.RED);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTotal.setBounds(41, 481, 194, 31);
		getContentPane().add(lblTotal);
		
		JButton btnNewButton = new JButton("CHECKOUT");
		btnNewButton.setBounds(694, 370, 131, 51);
		getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnBack.setBounds(694, 434, 131, 51);
		getContentPane().add(btnBack);
		
		JLabel lblCredit = new JLabel("Credit :");
		lblCredit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCredit.setBounds(659, 67, 64, 21);
		getContentPane().add(lblCredit);
		
		JLabel label_9 = new JLabel("TOPUP");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StoreTopup sttopup = new StoreTopup();
				try {
					sttopup.Topup();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				gototopup = 2;
				UserClass user = new UserClass();
				user.setnumtoTopup(gototopup);;
				dispose();
			}
		});
		label_9.setFont(new Font("Tahoma", Font.BOLD, 32));
		label_9.setBounds(701, 297, 124, 53);
		getContentPane().add(label_9);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 121, 426, 353);
		getContentPane().add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setColumnHeaderView(panel_1);
		
		JLabel lblOrdersList = new JLabel("Order List");
		lblOrdersList.setForeground(Color.DARK_GRAY);
		lblOrdersList.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.add(lblOrdersList);
		
		JPanel panel_2 = new JPanel();
		scrollPane.setRowHeaderView(panel_2);
		
		JLabel lblNewLabel = new JLabel("1.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		scrollPane.setViewportView(panel_3);
		
		UserClass product = new UserClass();

		JLabel lblNewLabel_1 = new JLabel(product.getNameProduct());
		lblNewLabel_1.setText(product.getNameProduct());
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setBounds(43, 116, 156, 118);
		
		UserClass user = new UserClass();
		
		JLabel userdisplay = new JLabel(user.getUsername());
		userdisplay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		userdisplay.setBounds(751, 42, 92, 23);
		getContentPane().add(userdisplay);
		
		JLabel CreditDisplay = new JLabel("");
		CreditDisplay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		CreditDisplay.setBounds(733, 73, 92, 23);
		getContentPane().add(CreditDisplay);
		setBounds(100, 100, 869, 587);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
