import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.text.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Storemain {

	JFrame frame;
	int i = 0 , j = 0 , gototopup = 0;
	String astring;
	private String name[] = {"No order list" , "OVERWATCH" , "GTA-V" ,"FINALFANTASY.XV" ,"FORZA HORIZON 3" ,"MONSTER HUNTER WORLD" ,"RAINBOWSIXSIEGE"};
	private double price[] = { 00 , 1199 , 1499 , 1490 , 1759 , 1890 ,1300};
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Storemain window = new Storemain();
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
	public Storemain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	

	
	public void initialize() {
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

		astring = Integer.toString(i);
		JLabel lblNewLabel = new JLabel(astring);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(782, 104, 43, 31);
		frame.getContentPane().add(lblNewLabel);

		KeyStore keystore = new KeyStore();
		JLabel lblInfoUser = new JLabel("Welcome : ");
		lblInfoUser.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInfoUser.setBounds(655, 45, 84, 21);
		frame.getContentPane().add(lblInfoUser);

		JLabel lblName = new JLabel("OVERWATCH");
		String name1 = "OVERWATCH";
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(74, 247, 96, 21);
		frame.getContentPane().add(lblName);

		double price1 = 1199;
		JLabel lblPrice = new JLabel(format.format(price1) + " B");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(84, 269, 96, 21);
		frame.getContentPane().add(lblPrice);

		double price2 = 1499;
		JLabel label = new JLabel(format.format(price2) + " B");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(330, 269, 96, 21);
		frame.getContentPane().add(label);

		JLabel lblGtav = new JLabel("     GTA-V");
		String name2 = "GTA-V";
		lblGtav.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGtav.setBounds(320, 247, 96, 21);
		frame.getContentPane().add(lblGtav);

		double price3 = 1490;
		JLabel label_2 = new JLabel(format.format(price3) + " B");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(548, 269, 96, 21);
		frame.getContentPane().add(label_2);

		JLabel lblFinalFantasyxv = new JLabel("FINAL FANTASY.XV");
		String name3 = "FINAL FANTASY.XV";
		lblFinalFantasyxv.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFinalFantasyxv.setBounds(516, 247, 166, 21);
		frame.getContentPane().add(lblFinalFantasyxv);

		double price4 = 1759;
		JLabel label_4 = new JLabel(format.format(price4) + " B");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(84, 488, 96, 21);
		frame.getContentPane().add(label_4);

		JLabel lblForzaHorizon = new JLabel("FORZA HORIZON 3");
		String name4 = "FORZA HORIZON 3";
		lblForzaHorizon.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblForzaHorizon.setBounds(53, 466, 146, 21);
		frame.getContentPane().add(lblForzaHorizon);

		double price5 = 1890;
		JLabel label_6 = new JLabel(format.format(price5) + " B");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(330, 488, 96, 21);
		frame.getContentPane().add(label_6);

		JLabel lblMonsterHuntWorld = new JLabel("MONSTER HUNTER WORLD");
		String name5 = "MONSTER HUNTER WORLD";
		lblMonsterHuntWorld.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMonsterHuntWorld.setBounds(276, 466, 200, 21);
		frame.getContentPane().add(lblMonsterHuntWorld);

		double price6 = 1300;
		JLabel label_8 = new JLabel(format.format(price6) + " B");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_8.setBounds(566, 488, 96, 21);
		frame.getContentPane().add(label_8);

		JLabel lblRainbowsixsiege = new JLabel("RAINBOWSIXSIEGE");
		String name6 = "RAINBOWSIXSIEGE";
		lblRainbowsixsiege.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRainbowsixsiege.setBounds(536, 466, 146, 21);
		frame.getContentPane().add(lblRainbowsixsiege);




		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(Storemain.class.getResource("/img/overwatch.png")));
		label_10.setBounds(43, 116, 156, 118);
		frame.getContentPane().add(label_10);

		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(Storemain.class.getResource("/img/GTA-V.png")));
		label_11.setBounds(320, 119, 156, 118);
		frame.getContentPane().add(label_11);

		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(Storemain.class.getResource("/img/FFXV.png")));
		label_12.setBounds(506, 116, 156, 118);
		frame.getContentPane().add(label_12);

		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(Storemain.class.getResource("/img/Forza3.png")));
		label_13.setBounds(43, 338, 156, 118);
		frame.getContentPane().add(label_13);

		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(Storemain.class.getResource("/img/MonsterHuntW.png")));
		label_14.setBounds(291, 338, 156, 118);
		frame.getContentPane().add(label_14);

		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(Storemain.class.getResource("/img/RainbowSix.png")));
		label_15.setBounds(526, 338, 156, 118);
		frame.getContentPane().add(label_15);

		//UserClass
		UserClass product = new UserClass();
		
		JButton button_5 = new JButton("Add");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 1;
				product.setCountNum(j);
				product.setNameProduct(name1);
				product.setPriceProduct(price1);
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");


			}

		});
		button_5.setBounds(94, 85, 56, 21);
		frame.getContentPane().add(button_5);

		JButton button_6 = new JButton("Add");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 2;
				product.setCountNum(j);
				product.setNameProduct(name2);
				product.setPriceProduct(price2);
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");

			}
		});
		button_6.setBounds(340, 85, 56, 21);
		frame.getContentPane().add(button_6);

		JButton button_1 = new JButton("Add");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 3;
				product.setCountNum(j);
				product.setNameProduct(name3);
				product.setPriceProduct(price3);
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");

			}
		});
		button_1.setBounds(577, 85, 56, 21);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("Add");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 4;
				product.setCountNum(j);
				product.setNameProduct(name4);
				product.setPriceProduct(price4);
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");

			}
		});
		button_2.setBounds(94, 307, 56, 21);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("Add");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 5;
				product.setCountNum(j);
				product.setNameProduct(name5);
				product.setPriceProduct(price5);
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");

			}
		});
		button_3.setBounds(340, 307, 56, 21);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("Add");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 6;
				product.setCountNum(j);
				product.setNameProduct(name6);
				product.setPriceProduct(price6);
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");

			}
		});
		button_4.setBounds(577, 307, 56, 21);
		frame.getContentPane().add(button_4);

		JLabel lblCart = new JLabel("");
		lblCart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if ( i == 0)
				{	
					JOptionPane.showMessageDialog(null, "Please select product");
				}
				else if ( i >= 1)
				{
					product.setCountList(i);
					StoreCart stcart = new StoreCart();
					stcart.StoreCart();
					frame.setVisible(false);
				}
				
				
			}
		});
		
		lblCart.setIcon(new ImageIcon(Storemain.class.getResource("/img/cart.png")));
		lblCart.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCart.setBounds(734, 116, 56, 66);
		frame.getContentPane().add(lblCart);
		
		UserClass user = new UserClass();
		
		JLabel Userdisplay = new JLabel(user.getUsername());
		Userdisplay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Userdisplay.setBounds(749, 43, 102, 22);
		frame.getContentPane().add(Userdisplay);
		
		JLabel lblTopup = new JLabel("TOPUP");
		lblTopup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StoreTopup sttopup = new StoreTopup();
				try {
					sttopup.Topup();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				gototopup = 1;
				user.setnumtoTopup(gototopup);
				frame.setVisible(false);
			}
		});
		lblTopup.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTopup.setBounds(717, 283, 124, 53);
		frame.getContentPane().add(lblTopup);
		
		frame.setBounds(100, 100, 869, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
