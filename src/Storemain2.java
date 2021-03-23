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
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.text.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Storemain2 extends JFrame {

	private JPanel contentPane;
	int i = 0 , j = 0 , gototopup = 0;
	String astring;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Storemain2 frame = new Storemain2();
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
	public Storemain2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		DecimalFormat format = new DecimalFormat("#,###.00");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 851, 31);
		getContentPane().add(panel);

		JLabel lblVersion = new JLabel("Version 1.00");
		lblVersion.setBounds(751, 511, 74, 16);
		getContentPane().add(lblVersion);

		astring = Integer.toString(i);
		JLabel lblNewLabel = new JLabel(astring);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(782, 104, 43, 31);
		getContentPane().add(lblNewLabel);

		KeyStore keystore = new KeyStore();
		JLabel lblInfoUser = new JLabel("Welcome : ");
		lblInfoUser.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInfoUser.setBounds(655, 44, 84, 21);
		getContentPane().add(lblInfoUser);

		JLabel lblName = new JLabel("OVERWATCH");
		String name1 = "OVERWATCH";
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(74, 247, 96, 21);
		getContentPane().add(lblName);

		double overwatchprice = 1199;
		JLabel lblPrice = new JLabel(format.format(overwatchprice) + " B");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(84, 269, 96, 21);
		getContentPane().add(lblPrice);

		double gtavprice = 1499;
		JLabel label = new JLabel(format.format(gtavprice) + " B");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(330, 269, 96, 21);
		getContentPane().add(label);

		JLabel lblGtav = new JLabel("     GTA-V");
		String name2 = "GTA-V";
		lblGtav.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGtav.setBounds(320, 247, 96, 21);
		getContentPane().add(lblGtav);

		double finalfantasyprice = 1490;
		JLabel label_2 = new JLabel(format.format(finalfantasyprice) + " B");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(548, 269, 96, 21);
		getContentPane().add(label_2);

		JLabel lblFinalFantasyxv = new JLabel("FINAL FANTASY.XV");
		String name3 = "FINAL FANTASY.XV";
		lblFinalFantasyxv.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFinalFantasyxv.setBounds(516, 247, 166, 21);
		getContentPane().add(lblFinalFantasyxv);

		double forzaprice = 1759;
		JLabel label_4 = new JLabel(format.format(forzaprice) + " B");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(84, 488, 96, 21);
		getContentPane().add(label_4);

		JLabel lblForzaHorizon = new JLabel("FORZA HORIZON 3");
		String name4 = "FORZA HORIZON 3";
		lblForzaHorizon.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblForzaHorizon.setBounds(53, 466, 146, 21);
		getContentPane().add(lblForzaHorizon);

		double monsterhuntprice = 1890;
		JLabel label_6 = new JLabel(format.format(monsterhuntprice) + " B");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(330, 488, 96, 21);
		getContentPane().add(label_6);

		JLabel lblMonsterHuntWorld = new JLabel("MONSTER HUNTER WORLD");
		String name5 = "MONSTER HUNTER WORLD";
		lblMonsterHuntWorld.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMonsterHuntWorld.setBounds(276, 466, 200, 21);
		getContentPane().add(lblMonsterHuntWorld);

		double rainbow6price = 1300;
		JLabel label_8 = new JLabel(format.format(rainbow6price) + " B");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_8.setBounds(566, 488, 96, 21);
		getContentPane().add(label_8);

		JLabel lblRainbowsixsiege = new JLabel("RAINBOWSIXSIEGE");
		String name6 = "RAINBOWSIXSIEGE";
		lblRainbowsixsiege.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRainbowsixsiege.setBounds(536, 466, 146, 21);
		getContentPane().add(lblRainbowsixsiege);




		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(Storemain.class.getResource("/img/overwatch.png")));
		label_10.setBounds(43, 116, 156, 118);
		getContentPane().add(label_10);

		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(Storemain.class.getResource("/img/GTA-V.png")));
		label_11.setBounds(320, 119, 156, 118);
		getContentPane().add(label_11);

		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(Storemain.class.getResource("/img/FFXV.png")));
		label_12.setBounds(506, 116, 156, 118);
		getContentPane().add(label_12);

		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(Storemain.class.getResource("/img/Forza3.png")));
		label_13.setBounds(43, 338, 156, 118);
		getContentPane().add(label_13);

		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(Storemain.class.getResource("/img/MonsterHuntW.png")));
		label_14.setBounds(291, 338, 156, 118);
		getContentPane().add(label_14);

		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(Storemain.class.getResource("/img/RainbowSix.png")));
		label_15.setBounds(526, 338, 156, 118);
		getContentPane().add(label_15);

		//UserClass
		UserClass product = new UserClass();
		
		JButton button_5 = new JButton("Add");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				product.setNameProduct("OVERWATCH");
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 1;

				
			}

		});
		button_5.setBounds(94, 85, 56, 21);
		getContentPane().add(button_5);

		JButton button_6 = new JButton("Add");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				product.setNameProduct("GTA-V");
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 2;
			}
		});
		button_6.setBounds(340, 85, 56, 21);
		getContentPane().add(button_6);

		JButton button_1 = new JButton("Add");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				product.setNameProduct("FINAL FANTASY.XV");
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 3;
			}
		});
		button_1.setBounds(577, 85, 56, 21);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("Add");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				product.setNameProduct("FORZA HORIZON 3");
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 4;
			}
		});
		button_2.setBounds(94, 307, 56, 21);
		getContentPane().add(button_2);

		JButton button_3 = new JButton("Add");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				product.setNameProduct("MONSTER HUNTER WORLD");
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 5;
			}
		});
		button_3.setBounds(340, 307, 56, 21);
		getContentPane().add(button_3);

		JButton button_4 = new JButton("Add");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				product.setNameProduct("RAINBOWSIX|SIEGE");
				JOptionPane.showMessageDialog(null, "Add to cart complete!!!");
				i++;
				astring = Integer.toString(i);
				lblNewLabel.setText(Integer.toString(i));
				j = 6;
			}
		});
		button_4.setBounds(577, 307, 56, 21);
		getContentPane().add(button_4);

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
					StoreCart2 stcart = new StoreCart2();
					stcart.setVisible(true);
				}
				
				
			}
		});
		
		lblCart.setIcon(new ImageIcon(Storemain.class.getResource("/img/cart.png")));
		lblCart.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCart.setBounds(734, 116, 56, 66);
		getContentPane().add(lblCart);
		
		UserClass user = new UserClass();
		
		JLabel Userdisplay = new JLabel(user.getUsername());
		Userdisplay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Userdisplay.setBounds(749, 43, 102, 22);
		getContentPane().add(Userdisplay);
		
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
				dispose();
			}
		});
		lblTopup.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTopup.setBounds(717, 283, 124, 53);
		getContentPane().add(lblTopup, BorderLayout.EAST);
		
		setBounds(100, 100, 869, 587);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
