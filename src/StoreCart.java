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
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;

public class StoreCart {

	private JFrame frame;
	private String[] name = new String[6];
	private double[] price = new double[6];
	private int count, gototopup = 0;
	String[] data, dataprice;
	String pricestring;
	double pricedouble , total;

	/**
	 * Launch the application.
	 */

	public static void StoreCart() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreCart window = new StoreCart();
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
	public StoreCart() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		Storemain stmain = new Storemain();
		UserClass user = new UserClass();
		DecimalFormat format = new DecimalFormat("#,###.00");

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 851, 31);
		frame.getContentPane().add(panel);

		JLabel lblVersion = new JLabel("Version 1.00");
		lblVersion.setBounds(751, 511, 74, 16);
		frame.getContentPane().add(lblVersion);

		JLabel lblInfoUser = new JLabel("Welcome :");
		lblInfoUser.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInfoUser.setBounds(659, 44, 82, 21);
		frame.getContentPane().add(lblInfoUser);

		JLabel label = new JLabel("SHOPPING CART");
		label.setFont(new Font("Tahoma", Font.BOLD, 37));
		label.setBounds(200, 31, 384, 118);
		frame.getContentPane().add(label);

		JButton btnNewButton = new JButton("CHECKOUT");
		btnNewButton.setBounds(694, 370, 131, 51);
		frame.getContentPane().add(btnNewButton);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user.clear();
				stmain.main();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(694, 434, 131, 51);
		frame.getContentPane().add(btnBack);

		JLabel lblCredit = new JLabel("Credit :");
		lblCredit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCredit.setBounds(659, 67, 64, 21);
		frame.getContentPane().add(lblCredit);

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
				user.setnumtoTopup(gototopup);
				;
				frame.setVisible(false);
			}
		});
		label_9.setFont(new Font("Tahoma", Font.BOLD, 32));
		label_9.setBounds(701, 297, 124, 53);
		frame.getContentPane().add(label_9);

		JLabel userdisplay = new JLabel(user.getUsername());
		userdisplay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		userdisplay.setBounds(751, 42, 92, 23);
		frame.getContentPane().add(userdisplay);

		JLabel CreditDisplay = new JLabel("");
		CreditDisplay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		CreditDisplay.setBounds(733, 73, 92, 23);
		frame.getContentPane().add(CreditDisplay);

		JLabel lblname1 = new JLabel("");
		lblname1.setBounds(148, 197, 194, 31);
		frame.getContentPane().add(lblname1);

		JLabel lblprice1 = new JLabel("");
		lblprice1.setBounds(390, 197, 194, 31);
		frame.getContentPane().add(lblprice1);

		JLabel lblname2 = new JLabel("");
		lblname2.setBounds(148, 238, 194, 31);
		frame.getContentPane().add(lblname2);

		JLabel lblprice2 = new JLabel("");
		lblprice2.setBounds(390, 238, 194, 31);
		frame.getContentPane().add(lblprice2);

		JLabel lblname3 = new JLabel("");
		lblname3.setBounds(148, 279, 194, 31);
		frame.getContentPane().add(lblname3);

		JLabel lblprice3 = new JLabel("");
		lblprice3.setBounds(390, 279, 194, 31);
		frame.getContentPane().add(lblprice3);

		JLabel lblname4 = new JLabel("");
		lblname4.setBounds(148, 320, 194, 31);
		frame.getContentPane().add(lblname4);

		JLabel lblprice4 = new JLabel("");
		lblprice4.setBounds(390, 320, 194, 31);
		frame.getContentPane().add(lblprice4);

		JLabel lblname5 = new JLabel("");
		lblname5.setBounds(148, 360, 194, 31);
		frame.getContentPane().add(lblname5);

		JLabel lblprice5 = new JLabel("");
		lblprice5.setBounds(390, 360, 194, 31);
		frame.getContentPane().add(lblprice5);

		JLabel lblname6 = new JLabel("");
		lblname6.setBounds(148, 401, 194, 31);
		frame.getContentPane().add(lblname6);

		JLabel lblprice6 = new JLabel("");
		lblprice6.setBounds(390, 401, 194, 31);
		frame.getContentPane().add(lblprice6);

		JLabel lblNewLabel = new JLabel("Order List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(110, 124, 455, 51);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 869, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		if (user.getCountList() >= 2) {
			data = user.getNameProduct().split(",");
			dataprice = user.getPriceProduct().split(",");
			for (int i = 0; i < 6; i++) {
				price[i] = Double.parseDouble(dataprice[i]);
			}

		} else if (user.getCountList() == 1) {
			name[user.getCountList() - 1] = user.getNameProduct();
			pricestring = Double.toString(price[user.getCountList() - 1]);
			pricestring = user.getPriceProduct();
			pricedouble = Double.parseDouble(pricestring);

		}

		if (user.getCountList() == 1) {
			lblname1 = new JLabel("1.  " + name[user.getCountList() - 1]);
			lblname1.setText("1.  " + name[user.getCountList() - 1]);
			lblname1.setBounds(148, 197, 194, 31);
			frame.getContentPane().add(lblname1);

			lblprice1 = new JLabel(format.format(pricedouble) + " B");
			lblprice1.setBounds(390, 197, 194, 31);
			frame.getContentPane().add(lblprice1);
			
			total = price[0];
		}

		if (user.getCountList() == 2) {

			lblname1 = new JLabel("1.  " + data[user.getCountList() - 2]);
			lblname1.setText("1.  " + data[user.getCountList() - 2]);
			lblname1.setBounds(148, 197, 194, 31);
			frame.getContentPane().add(lblname1);

			lblprice1 = new JLabel(format.format(price[user.getCountList()-2]) + " B");
			lblprice1.setBounds(390, 197, 194, 31);
			frame.getContentPane().add(lblprice1);

			lblname2 = new JLabel("2.  " + data[user.getCountList() - 1]);
			lblname2.setText("2.  " + data[user.getCountList() - 1]);
			lblname2.setBounds(148, 238, 194, 31);
			frame.getContentPane().add(lblname2);

			lblprice2 = new JLabel(format.format(price[user.getCountList()-1]) + " B");
			lblprice2.setBounds(390, 238, 194, 31);
			frame.getContentPane().add(lblprice2);
			
			total = price[0] + price[1];
		}

		if (user.getCountList() == 3) {

			lblname1 = new JLabel("1.  " + data[user.getCountList() - 3]);
			lblname1.setText("1.  " + data[user.getCountList() - 3]);
			lblname1.setBounds(148, 197, 194, 31);
			frame.getContentPane().add(lblname1);

			lblprice1 = new JLabel(format.format(price[user.getCountList()-3]) + " B");
			lblprice1.setBounds(390, 197, 194, 31);
			frame.getContentPane().add(lblprice1);

			lblname2 = new JLabel("2.  " + data[user.getCountList() - 2]);
			lblname2.setText("2.  " + data[user.getCountList() - 2]);
			lblname2.setBounds(148, 238, 194, 31);
			frame.getContentPane().add(lblname2);

			lblprice2 = new JLabel(format.format(price[user.getCountList()-2]) + " B");
			lblprice2.setBounds(390, 238, 194, 31);
			frame.getContentPane().add(lblprice2);

			lblname3 = new JLabel("3.  " + data[user.getCountList() - 1]);
			lblname3.setText("3.  " + data[user.getCountList() - 1]);
			lblname3.setBounds(148, 279, 194, 31);
			frame.getContentPane().add(lblname3);

			lblprice3 = new JLabel(format.format(price[user.getCountList()-1]) + " B");
			lblprice3.setBounds(390, 279, 194, 31);
			frame.getContentPane().add(lblprice3);
			
			total = price[0] + price[1] + price[2];
		}

		if (user.getCountList() == 4) {

			lblname1 = new JLabel("1.  " + data[user.getCountList() - 4]);
			lblname1.setText("1.  " + data[user.getCountList() - 4]);
			lblname1.setBounds(148, 197, 194, 31);
			frame.getContentPane().add(lblname1);

			lblprice1 = new JLabel(format.format(price[user.getCountList()-4]) + " B");
			lblprice1.setBounds(390, 197, 194, 31);
			frame.getContentPane().add(lblprice1);

			lblname2 = new JLabel("2.  " + data[user.getCountList() - 3]);
			lblname2.setText("2.  " + data[user.getCountList() - 3]);
			lblname2.setBounds(148, 238, 194, 31);
			frame.getContentPane().add(lblname2);

			lblprice2 = new JLabel(format.format(price[user.getCountList()-3]) + " B");
			lblprice2.setBounds(390, 238, 194, 31);
			frame.getContentPane().add(lblprice2);

			lblname3 = new JLabel("3.  " + data[user.getCountList() - 2]);
			lblname3.setText("3.  " + data[user.getCountList() - 2]);
			lblname3.setBounds(148, 279, 194, 31);
			frame.getContentPane().add(lblname3);

			lblprice3 = new JLabel(format.format(price[user.getCountList()-2]) + " B");
			lblprice3.setBounds(390, 279, 194, 31);
			frame.getContentPane().add(lblprice3);

			lblname4 = new JLabel("4.  " + data[user.getCountList() - 1]);
			lblname4.setText("4.  " + data[user.getCountList() - 1]);
			lblname4.setBounds(148, 320, 194, 31);
			frame.getContentPane().add(lblname4);

			lblprice4 = new JLabel(format.format(price[user.getCountList()-1]) + " B");
			lblprice4.setBounds(390, 320, 194, 31);
			frame.getContentPane().add(lblprice4);
			
			total = price[0] + price[1] + price[2] + price[3];
		}

		if (user.getCountList() == 5) {

			lblname1 = new JLabel("1.  " + data[user.getCountList() - 5]);
			lblname1.setText("1.  " + data[user.getCountList() - 5]);
			lblname1.setBounds(148, 197, 194, 31);
			frame.getContentPane().add(lblname1);

			lblprice1 = new JLabel(format.format(price[user.getCountList()-5]) + " B");
			lblprice1.setBounds(390, 197, 194, 31);
			frame.getContentPane().add(lblprice1);

			lblname2 = new JLabel("2.  " + data[user.getCountList() - 4]);
			lblname2.setText("2.  " + data[user.getCountList() - 4]);
			lblname2.setBounds(148, 238, 194, 31);
			frame.getContentPane().add(lblname2);

			lblprice2 = new JLabel(format.format(price[user.getCountList()-4]) + " B");
			lblprice2.setBounds(390, 238, 194, 31);
			frame.getContentPane().add(lblprice2);

			lblname3 = new JLabel("3.  " + data[user.getCountList() - 3]);
			lblname3.setText("3.  " + data[user.getCountList() - 3]);
			lblname3.setBounds(148, 279, 194, 31);
			frame.getContentPane().add(lblname3);

			lblprice3 = new JLabel(format.format(price[user.getCountList()-3]) + " B");
			lblprice3.setBounds(390, 279, 194, 31);
			frame.getContentPane().add(lblprice3);

			lblname4 = new JLabel("4.  " + data[user.getCountList() - 2]);
			lblname4.setText("4.  " + data[user.getCountList() - 2]);
			lblname4.setBounds(148, 320, 194, 31);
			frame.getContentPane().add(lblname4);

			lblprice4 = new JLabel(format.format(price[user.getCountList()-2]) + " B");
			lblprice4.setBounds(390, 320, 194, 31);
			frame.getContentPane().add(lblprice4);

			lblname5 = new JLabel("5.  " + data[user.getCountList() - 1]);
			lblname5.setText("5.  " + data[user.getCountList() - 1]);
			lblname5.setBounds(148, 360, 194, 31);
			frame.getContentPane().add(lblname5);

			lblprice5 = new JLabel(format.format(price[user.getCountList()-1]) + " B");
			lblprice5.setBounds(390, 360, 194, 31);
			frame.getContentPane().add(lblprice5);
			
			total = price[0] + price[1] + price[2] + price[3] + price[4];
		}

		if (user.getCountList() == 6) {

			lblname1 = new JLabel("1.  " + data[user.getCountList() - 6]);
			lblname1.setText("1.  " + data[user.getCountList() - 6]);
			lblname1.setBounds(148, 197, 194, 31);
			frame.getContentPane().add(lblname1);

			lblprice1 = new JLabel(format.format(price[user.getCountList()-6]) + " B");
			lblprice1.setBounds(390, 197, 194, 31);
			frame.getContentPane().add(lblprice1);

			lblname2 = new JLabel("2.  " + data[user.getCountList() - 5]);
			lblname2.setText("2.  " + data[user.getCountList() - 5]);
			lblname2.setBounds(148, 238, 194, 31);
			frame.getContentPane().add(lblname2);

			lblprice2 = new JLabel(format.format(price[user.getCountList()-5]) + " B");
			lblprice2.setBounds(390, 238, 194, 31);
			frame.getContentPane().add(lblprice2);

			lblname3 = new JLabel("3.  " + data[user.getCountList() - 4]);
			lblname3.setText("3.  " + data[user.getCountList() - 4]);
			lblname3.setBounds(148, 279, 194, 31);
			frame.getContentPane().add(lblname3);

			lblprice3 = new JLabel(format.format(price[user.getCountList()-4]) + " B");
			lblprice3.setBounds(390, 279, 194, 31);
			frame.getContentPane().add(lblprice3);

			lblname4 = new JLabel("4.  " + data[user.getCountList() - 3]);
			lblname4.setText("4.  " + data[user.getCountList() - 3]);
			lblname4.setBounds(148, 320, 194, 31);
			frame.getContentPane().add(lblname4);

			lblprice4 = new JLabel(format.format(price[user.getCountList()-3]) + " B");
			lblprice4.setBounds(390, 320, 194, 31);
			frame.getContentPane().add(lblprice4);

			lblname5 = new JLabel("5.  " + data[user.getCountList() - 2]);
			lblname5.setText("5.  " + data[user.getCountList() - 2]);
			lblname5.setBounds(148, 360, 194, 31);
			frame.getContentPane().add(lblname5);

			lblprice5 = new JLabel(format.format(price[user.getCountList()-2]) + " B");
			lblprice5.setBounds(390, 360, 194, 31);
			frame.getContentPane().add(lblprice5);

			lblname6 = new JLabel("6.  " + data[user.getCountList() - 1]);
			lblname6.setText("6.  " + data[user.getCountList() - 1]);
			lblname6.setBounds(148, 401, 194, 31);
			frame.getContentPane().add(lblname6);

			lblprice6 = new JLabel(format.format(price[user.getCountList()-1]) + " B");
			lblprice6.setBounds(390, 401, 194, 31);
			frame.getContentPane().add(lblprice6);
			
			total = price[0] + price[1] + price[2] + price[3] + price[4] + price[5];
		}
		
		JLabel lblTotal = new JLabel("TOTAL : " + format.format(total) + " B");
		lblTotal.setForeground(Color.RED);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTotal.setBounds(41, 481, 194, 31);
		frame.getContentPane().add(lblTotal);
	}
}

