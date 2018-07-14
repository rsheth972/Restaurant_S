package Restaurant_S;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import javax.swing.JSeparator;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Restaurants{
	double cost=0.0;

	JFrame frame;
	private JTable table;
	private JPanel panel;
	private JTextField pf;
	private JTextField ps;
	private JTextField pt;
	private JTextField pfo;
	private JTextField pfi;
	private JTextField txtFrenchFries;
	private JTextField txtChilliCheeseToast;
	private JTextField txtGarlicBread;
	private JTextField txtGarlicBreadcheese;
	private JTextField txtSandwich;
	private JTextField txtGrillSandwich;
	private JTextField txtSalads;
	private JTextField txtVegBurger;
	private JTextField txtBakesAndMeals;
	private JTextField txtSpringRoll;
	private JTextField txtManchurianDry;
	private JTextField txtCrispySpin;
	private JTextField textField_11;
	private JTextField txtManchGravy;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField txtSweetSour;
	private JTextField txtMixHotGarlic;
	private JTextField txtHakkaNoodles;
	private JTextField txtGravyNoodles;
	private JTextField txtRice;
	private JTextField txtVegFriedRice;
	private JTextField txtTandooriRoti;
	private JTextField txtNaan;
	private JTextField txtKulcha;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField txtChillyMushroom;
	private JTextField textField_37;
	private JTextField txtBiryani;
	private JTextField textField_39;
	private JTextField textField_12;
	private JTextField textField_13;
	public double costs=0;
	private JLabel label_1;
	private JLabel disc;
	private JTextArea jtxtReceipts;
	private JTextField textField_14;
	private JTextField textField_15;
	private JPanel panel_10;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
	
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
	Restaurants window = new Restaurants();
	window.Rest();
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
	  public void Rest() {
	initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	frame = new JFrame();
	frame.setBounds(0, 0, 1368, 689);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	panel = new JPanel();
	panel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
	panel.setBounds(25, 11, 419, 294);
	frame.getContentPane().add(panel);
	panel.setLayout(null);
	
	JLabel lblMenuItems = new JLabel("Menu Items");
	lblMenuItems.setBounds(20, 22, 261, 31);
	lblMenuItems.setFont(new Font("Tahoma", Font.BOLD, 16));
	panel.add(lblMenuItems);
	
	JLabel lblQty = new JLabel("QTY");
	lblQty.setBounds(347, 64, 47, 20);
	 lblQty.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
	lblQty.setFont(new Font("Tahoma", Font.PLAIN, 13));
	panel.add(lblQty);
	
	JLabel lblNames = new JLabel("Names");
	lblNames.setBounds(30, 64, 286, 20);
	lblNames.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
	lblNames.setFont(new Font("Tahoma", Font.PLAIN, 18));
	panel.add(lblNames);
	
	JComboBox first = new JComboBox();
	first.setFont(new Font("Tahoma", Font.BOLD, 16));
	first.setBounds(30, 89, 286, 20);
	first.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
	});
	first.setModel(new DefaultComboBoxModel(new String[] {"All Time Favourite", "French Fries", "Chilli Cheese Toast","Garlic Bread", "Garlic Bread with Cheese", "Sandwich","Grill Sandwich","Salads","Veg. Burger", "Bakes & Meals"}));
	panel.add(first);
	
	JComboBox second = new JComboBox();
	second.setFont(new Font("Tahoma", Font.BOLD, 16));
	second.setBounds(30, 120, 286, 20);
	second.setModel(new DefaultComboBoxModel(new String[] {"Starters", "Spring Roll", "Veg. Manchurian Dry", "Crispy Spinach & Baby - Corn", "Chilly Mushroom Dry"}));
	panel.add(second);
	
	JComboBox third = new JComboBox();
	third.setFont(new Font("Tahoma", Font.BOLD, 16));
	third.setBounds(30, 152, 286, 20);
	third.setModel(new DefaultComboBoxModel(new String[] {"Main Course", "Manchurian Gravy", "Sweet & Sour Veg.", "Mix. Veg. in Hot Garlic Sauce"}));
	panel.add(third);
	
	JComboBox fourth = new JComboBox();
	fourth.setFont(new Font("Tahoma", Font.BOLD, 16));
	fourth.setBounds(30, 183, 286, 20);
	fourth.setModel(new DefaultComboBoxModel(new String[] {"Noodles", "Veg Hakka Noodles","Gravy Noodles", "Rice", "Veg. Fried Rice"}));
	panel.add(fourth);
	
	JComboBox fifth = new JComboBox();
	fifth.setFont(new Font("Tahoma", Font.BOLD, 16));
	fifth.setBounds(30, 214, 286, 20);
	fifth.setModel(new DefaultComboBoxModel(new String[] {"Breads", "Tandoori Roti","Naan","Kulcha", "Biryani","Pulao"}));
	panel.add(fifth);
	
	JPanel panel_6 = new JPanel();
	panel_6.setBounds(0, 0, 10, 10);
	panel.add(panel_6);
	
	JSeparator separator = new JSeparator();
	separator.setBounds(24, 253, 1, 2);
	panel.add(separator);
	
	JSeparator separator_1 = new JSeparator();
	separator_1.setBounds(24, 253, 370, 2);
	panel.add(separator_1);
	
	JLabel lblNewLabel_5 = new JLabel("TOTAL");
	lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
	lblNewLabel_5.setBounds(30, 260, 286, 20);
	panel.add(lblNewLabel_5);
	
	pf = new JTextField();
	pf.setText("0");
	pf.setBounds(323, 91, 86, 20);
	panel.add(pf);
	pf.setColumns(10);
	
	ps = new JTextField();
	ps.setText("0");
	ps.setColumns(10);
	ps.setBounds(323, 122, 86, 20);
	panel.add(ps);
	
	pt = new JTextField();
	pt.setText("0");
	pt.setColumns(10);
	pt.setBounds(323, 154, 86, 20);
	panel.add(pt);
	
	pfo = new JTextField();
	pfo.setText("0");
	pfo.setColumns(10);
	pfo.setBounds(323, 185, 86, 20);
	panel.add(pfo);
	
	pfi = new JTextField();
	pfi.setText("0");
	pfi.setColumns(10);
	pfi.setBounds(323, 214, 86, 20);
	panel.add(pfi);
	
	JLabel net = new JLabel("");
	net.setBounds(326, 264, 83, 14);
	panel.add(net);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
	panel_1.setBounds(500, 161, 344, 405);
	frame.getContentPane().add(panel_1);
	panel_1.setLayout(null);
	
	txtFrenchFries = new JTextField();
	txtFrenchFries.setBackground(Color.WHITE);
	txtFrenchFries.setEditable(false);
	txtFrenchFries.setText("French Fries");
	txtFrenchFries.setBounds(10, 26, 105, 20);
	panel_1.add(txtFrenchFries);
	txtFrenchFries.setColumns(10);
	
	txtChilliCheeseToast = new JTextField();
	txtChilliCheeseToast.setEditable(false);
	txtChilliCheeseToast.setText("Chilli Cheese (T)");
	txtChilliCheeseToast.setColumns(10);
	txtChilliCheeseToast.setBounds(10, 54, 105, 20);
	panel_1.add(txtChilliCheeseToast);
	
	txtGarlicBread = new JTextField();
	txtGarlicBread.setEditable(false);
	txtGarlicBread.setText("Garlic Bread");
	txtGarlicBread.setColumns(10);
	txtGarlicBread.setBounds(10, 82, 105, 20);
	panel_1.add(txtGarlicBread);
	
	txtGarlicBreadcheese = new JTextField();
	txtGarlicBreadcheese.setEditable(false);
	txtGarlicBreadcheese.setText("Garlic Bread (C)");
	txtGarlicBreadcheese.setColumns(10);
	txtGarlicBreadcheese.setBounds(10, 110, 105, 20);
	panel_1.add(txtGarlicBreadcheese);
	
	txtSandwich = new JTextField();
	txtSandwich.setEditable(false);
	txtSandwich.setText("Sandwich");
	txtSandwich.setColumns(10);
	txtSandwich.setBounds(10, 137, 105, 20);
	panel_1.add(txtSandwich);
	
	txtGrillSandwich = new JTextField();
	txtGrillSandwich.setEditable(false);
	txtGrillSandwich.setText("Grill Sandwich");
	txtGrillSandwich.setColumns(10);
	txtGrillSandwich.setBounds(10, 164, 105, 20);
	panel_1.add(txtGrillSandwich);
	
	txtSalads = new JTextField();
	txtSalads.setEditable(false);
	txtSalads.setText("Salads");
	txtSalads.setColumns(10);
	txtSalads.setBounds(10, 192, 105, 20);
	panel_1.add(txtSalads);
	
	txtVegBurger = new JTextField();
	txtVegBurger.setEditable(false);
	txtVegBurger.setText("Veg Burger");
	txtVegBurger.setColumns(10);
	txtVegBurger.setBounds(10, 221, 105, 20);
	panel_1.add(txtVegBurger);
	
	txtBakesAndMeals = new JTextField();
	txtBakesAndMeals.setEditable(false);
	txtBakesAndMeals.setText("Bakes and Meals");
	txtBakesAndMeals.setColumns(10);
	txtBakesAndMeals.setBounds(10, 251, 105, 20);
	panel_1.add(txtBakesAndMeals);
	
	txtSpringRoll = new JTextField();
	txtSpringRoll.setEditable(false);
	txtSpringRoll.setText("Spring Roll");
	txtSpringRoll.setColumns(10);
	txtSpringRoll.setBounds(10, 282, 105, 20);
	panel_1.add(txtSpringRoll);
	
	txtManchurianDry = new JTextField();
	txtManchurianDry.setEditable(false);
	txtManchurianDry.setText("Manchurian Dry");
	txtManchurianDry.setColumns(10);
	txtManchurianDry.setBounds(10, 313, 105, 20);
	panel_1.add(txtManchurianDry);
	
	txtCrispySpin = new JTextField();
	txtCrispySpin.setEditable(false);
	txtCrispySpin.setText("Cris Spin & Corn");
	txtCrispySpin.setColumns(10);
	txtCrispySpin.setBounds(10, 344, 105, 20);
	panel_1.add(txtCrispySpin);
	
	textField_11 = new JTextField();
	textField_11.setEditable(false);
	textField_11.setText("80");
	textField_11.setColumns(10);
	textField_11.setBounds(125, 26, 27, 20);
	panel_1.add(textField_11);
	
	txtManchGravy = new JTextField();
	txtManchGravy.setEditable(false);
	txtManchGravy.setText("Manch. Gravy");
	txtManchGravy.setColumns(10);
	txtManchGravy.setBounds(162, 26, 99, 20);
	panel_1.add(txtManchGravy);
	
	textField = new JTextField();
	textField.setEditable(false);
	textField.setText("100");
	textField.setColumns(10);
	textField.setBounds(125, 53, 27, 20);
	panel_1.add(textField);
	
	textField_1 = new JTextField();
	textField_1.setEditable(false);
	textField_1.setText("120");
	textField_1.setColumns(10);
	textField_1.setBounds(125, 82, 27, 20);
	panel_1.add(textField_1);
	
	textField_2 = new JTextField();
	textField_2.setEditable(false);
	textField_2.setText("97");
	textField_2.setColumns(10);
	textField_2.setBounds(125, 110, 27, 20);
	panel_1.add(textField_2);
	
	textField_3 = new JTextField();
	textField_3.setEditable(false);
	textField_3.setText("85");
	textField_3.setColumns(10);
	textField_3.setBounds(125, 137, 27, 20);
	panel_1.add(textField_3);
	
	textField_4 = new JTextField();
	textField_4.setEditable(false);
	textField_4.setText("125");
	textField_4.setColumns(10);
	textField_4.setBounds(125, 164, 27, 20);
	panel_1.add(textField_4);
	
	textField_5 = new JTextField();
	textField_5.setEditable(false);
	textField_5.setText("70");
	textField_5.setColumns(10);
	textField_5.setBounds(125, 192, 27, 20);
	panel_1.add(textField_5);
	
	textField_6 = new JTextField();
	textField_6.setEditable(false);
	textField_6.setText("170");
	textField_6.setColumns(10);
	textField_6.setBounds(125, 221, 27, 20);
	panel_1.add(textField_6);
	
	textField_7 = new JTextField();
	textField_7.setEditable(false);
	textField_7.setText("130");
	textField_7.setColumns(10);
	textField_7.setBounds(125, 251, 27, 20);
	panel_1.add(textField_7);
	
	textField_8 = new JTextField();
	textField_8.setEditable(false);
	textField_8.setText("80");
	textField_8.setColumns(10);
	textField_8.setBounds(125, 282, 27, 20);
	panel_1.add(textField_8);
	
	textField_9 = new JTextField();
	textField_9.setEditable(false);
	textField_9.setText("100");
	textField_9.setColumns(10);
	textField_9.setBounds(125, 313, 27, 20);
	panel_1.add(textField_9);
	
	textField_10 = new JTextField();
	textField_10.setEditable(false);
	textField_10.setText("120");
	textField_10.setColumns(10);
	textField_10.setBounds(125, 344, 27, 20);
	panel_1.add(textField_10);
	
	txtSweetSour = new JTextField();
	txtSweetSour.setEditable(false);
	txtSweetSour.setText("Sweet & Sour ");
	txtSweetSour.setColumns(10);
	txtSweetSour.setBounds(162, 53, 99, 20);
	panel_1.add(txtSweetSour);
	
	txtMixHotGarlic = new JTextField();
	txtMixHotGarlic.setEditable(false);
	txtMixHotGarlic.setText("Mix. Hot Garlic ");
	txtMixHotGarlic.setColumns(10);
	txtMixHotGarlic.setBounds(162, 84, 99, 20);
	panel_1.add(txtMixHotGarlic);
	
	txtHakkaNoodles = new JTextField();
	txtHakkaNoodles.setEditable(false);
	txtHakkaNoodles.setText("Hakka Noodles");
	txtHakkaNoodles.setColumns(10);
	txtHakkaNoodles.setBounds(162, 113, 99, 20);
	panel_1.add(txtHakkaNoodles);
	
	txtGravyNoodles = new JTextField();
	txtGravyNoodles.setEditable(false);
	txtGravyNoodles.setText("Gravy Noodles");
	txtGravyNoodles.setColumns(10);
	txtGravyNoodles.setBounds(162, 141, 99, 20);
	panel_1.add(txtGravyNoodles);
	
	txtRice = new JTextField();
	txtRice.setEditable(false);
	txtRice.setText("Rice");
	txtRice.setColumns(10);
	txtRice.setBounds(162, 168, 99, 20);
	panel_1.add(txtRice);
	
	txtVegFriedRice = new JTextField();
	txtVegFriedRice.setEditable(false);
	txtVegFriedRice.setText("Veg. Fried Rice");
	txtVegFriedRice.setColumns(10);
	txtVegFriedRice.setBounds(162, 223, 99, 20);
	panel_1.add(txtVegFriedRice);
	
	txtTandooriRoti = new JTextField();
	txtTandooriRoti.setEditable(false);
	txtTandooriRoti.setText("Tandoori Roti");
	txtTandooriRoti.setColumns(10);
	txtTandooriRoti.setBounds(162, 252, 99, 20);
	panel_1.add(txtTandooriRoti);
	
	txtNaan = new JTextField();
	txtNaan.setEditable(false);
	txtNaan.setText("Naan");
	txtNaan.setColumns(10);
	txtNaan.setBounds(162, 282, 99, 20);
	panel_1.add(txtNaan);
	
	txtKulcha = new JTextField();
	txtKulcha.setEditable(false);
	txtKulcha.setText("Kulcha");
	txtKulcha.setColumns(10);
	txtKulcha.setBounds(162, 313, 99, 20);
	panel_1.add(txtKulcha);
	
	textField_24 = new JTextField();
	textField_24.setEditable(false);
	textField_24.setText("80");
	textField_24.setColumns(10);
	textField_24.setBounds(283, 26, 27, 20);
	panel_1.add(textField_24);
	
	textField_25 = new JTextField();
	textField_25.setEditable(false);
	textField_25.setText("100");
	textField_25.setColumns(10);
	textField_25.setBounds(283, 53, 27, 20);
	panel_1.add(textField_25);
	
	textField_26 = new JTextField();
	textField_26.setEditable(false);
	textField_26.setText("120");
	textField_26.setColumns(10);
	textField_26.setBounds(283, 84, 27, 20);
	panel_1.add(textField_26);
	
	textField_27 = new JTextField();
	textField_27.setEditable(false);
	textField_27.setText("80");
	textField_27.setColumns(10);
	textField_27.setBounds(283, 113, 27, 20);
	panel_1.add(textField_27);
	
	textField_28 = new JTextField();
	textField_28.setEditable(false);
	textField_28.setText("100");
	textField_28.setColumns(10);
	textField_28.setBounds(283, 141, 27, 20);
	panel_1.add(textField_28);
	
	textField_29 = new JTextField();
	textField_29.setEditable(false);
	textField_29.setText("120");
	textField_29.setColumns(10);
	textField_29.setBounds(283, 168, 27, 20);
	panel_1.add(textField_29);
	
	textField_31 = new JTextField();
	textField_31.setEditable(false);
	textField_31.setText("140");
	textField_31.setColumns(10);
	textField_31.setBounds(283, 221, 27, 20);
	panel_1.add(textField_31);
	
	textField_32 = new JTextField();
	textField_32.setEditable(false);
	textField_32.setText("80");
	textField_32.setColumns(10);
	textField_32.setBounds(283, 251, 27, 20);
	panel_1.add(textField_32);
	
	textField_33 = new JTextField();
	textField_33.setEditable(false);
	textField_33.setText("100");
	textField_33.setColumns(10);
	textField_33.setBounds(283, 282, 27, 20);
	panel_1.add(textField_33);
	
	textField_34 = new JTextField();
	textField_34.setEditable(false);
	textField_34.setText("120");
	textField_34.setColumns(10);
	textField_34.setBounds(283, 313, 27, 20);
	panel_1.add(textField_34);
	
	txtChillyMushroom = new JTextField();
	txtChillyMushroom.setEditable(false);
	txtChillyMushroom.setText("Chilly Mushroom");
	txtChillyMushroom.setColumns(10);
	txtChillyMushroom.setBounds(10, 375, 105, 20);
	panel_1.add(txtChillyMushroom);
	
	textField_37 = new JTextField();
	textField_37.setEditable(false);
	textField_37.setText("97");
	textField_37.setColumns(10);
	textField_37.setBounds(125, 375, 27, 20);
	panel_1.add(textField_37);
	
	txtBiryani = new JTextField();
	txtBiryani.setEditable(false);
	txtBiryani.setText("Biryani");
	txtBiryani.setColumns(10);
	txtBiryani.setBounds(162, 344, 99, 20);
	panel_1.add(txtBiryani);
	
	textField_39 = new JTextField();
	textField_39.setEditable(false);
	textField_39.setText("140");
	textField_39.setColumns(10);
	textField_39.setBounds(283, 344, 27, 20);
	panel_1.add(textField_39);
	
	JLabel lblOrder = new JLabel("Menu");
	lblOrder.setBounds(131, 0, 58, 25);
	panel_1.add(lblOrder);
	lblOrder.setFont(new Font("Tahoma", Font.BOLD, 17));
	
	textField_12 = new JTextField();
	textField_12.setEditable(false);
	textField_12.setText("Pulao");
	textField_12.setColumns(10);
	textField_12.setBounds(162, 192, 99, 20);
	panel_1.add(textField_12);
	
	textField_13 = new JTextField();
	textField_13.setEditable(false);
	textField_13.setText("150");
	textField_13.setColumns(10);
	textField_13.setBounds(283, 192, 27, 20);
	panel_1.add(textField_13);
	
	JPanel panel_3 = new JPanel();
	panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
	panel_3.setBounds(923, 30, 419, 346);
	frame.getContentPane().add(panel_3);
	panel_3.setLayout(null);
	
	JLabel lblreceipt = new JLabel("");
	lblreceipt.setBounds(209, 8, 0, 0);
	lblreceipt.setFont(new Font("Tahoma", Font.BOLD, 17));
	panel_3.add(lblreceipt);
	
	JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
	tabbedPane_1.setBounds(10, 11, 385, 324);
	panel_3.add(tabbedPane_1);
	
	JPanel panel_8 = new JPanel();
	tabbedPane_1.addTab("RECEIPT", null, panel_8, null);
	panel_8.setLayout(null);
	
	jtxtReceipts = new JTextArea();
	jtxtReceipts.setBounds(0, 0, 380, 297);
	panel_8.add(jtxtReceipts);
	jtxtReceipts.setColumns(10);
	
	panel_10 = new JPanel();
	panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 5));
	panel_10.setBounds(-6, 308, 386, 2);
	panel_8.add(panel_10);
	
	JPanel panel_2 = new JPanel();
	panel_2.setBackground(SystemColor.menu);
	panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
	panel_2.setBounds(25, 323, 419, 228);
	frame.getContentPane().add(panel_2);
	panel_2.setLayout(null);
	
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	tabbedPane.setBounds(20,26,328,430);
	//panel_6.add(tabbedPane);
	
	JPanel panel_7=new JPanel();
	tabbedPane.addTab("Receipt",null,panel_7,null);
	
	JLabel lblNewLabel_4 = new JLabel("VOUCHERS");
	lblNewLabel_4.setBounds(10, 11, 388, 25);
	lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
	panel_2.add(lblNewLabel_4);
	     
	JLabel label = new JLabel("");
	label.setBounds(233, 129, 46, 14);
	panel_2.add(label);
	
	table = new JTable();
	table.setBounds(341, 109, -60, 82);
	panel_2.add(table);
	JButton btnFamilyDiscount = new JButton("Family Discount");
	btnFamilyDiscount.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	costs-=costs*0.05;
	String ccost1=String.format("%.2f",costs);
	disc.setText(ccost1);
	
	}
	});
	
	btnFamilyDiscount.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnFamilyDiscount.setBounds(42, 121, 167, 37);
	panel_2.add(btnFamilyDiscount);
	
	JButton btnBulkOrder = new JButton("Bulk Order");
	btnBulkOrder.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	if(costs>=5000 && costs<10000)
	{
	costs-=costs*0.1;
	}
	if(costs>=10000)
	{
	costs-=costs*0.15;
	}
	
	String ccost2=String.format("%.2f",costs);
	disc.setText(ccost2);
	}
	});
	btnBulkOrder.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnBulkOrder.setBounds(42, 169, 167, 37);
	panel_2.add(btnBulkOrder);
	
	JButton btnCoupon = new JButton("Coupon");
	btnCoupon.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	costs-=100;
	String ccost2=String.format("%.2f",costs);
	disc.setText(ccost2);
	}
	});
	btnCoupon.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnCoupon.setBounds(219, 120, 167, 37);
	panel_2.add(btnCoupon);
	
	label_1 = new JLabel("Total after Discount");
	label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
	label_1.setBounds(42, 61, 167, 26);
	panel_2.add(label_1);
	
	disc = new JLabel("");
	disc.setBounds(264, 62, 122, 25);
	panel_2.add(disc);
	
	JPanel panel_4 = new JPanel();
	panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
	panel_4.setBounds(500, 30, 344, 125);
	frame.getContentPane().add(panel_4);
	panel_4.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("MCubeR Restaurant Management System");
	lblNewLabel.setBounds(9, 8, 325, 20);
	lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
	panel_4.add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("OWNERS: Rahil Sheth                           ");
	lblNewLabel_1.setBounds(36, 33, 272, 19);
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
	panel_4.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("Madhur Kabra");
	lblNewLabel_2.setBounds(114, 51, 104, 19);
	lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
	panel_4.add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("Mohit Thaker");
	lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
	lblNewLabel_3.setBounds(114, 70, 114, 20);
	panel_4.add(lblNewLabel_3);
	
	JLabel lblMukeshJha = new JLabel("Mukesh Jha");
	lblMukeshJha.setFont(new Font("Tahoma", Font.BOLD, 15));
	lblMukeshJha.setBounds(114, 91, 125, 20);
	panel_4.add(lblMukeshJha);
	
	JPanel panel_5 = new JPanel();
	panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel_5.setBounds(35, 577, 1274, 62);
	frame.getContentPane().add(panel_5);
	panel_5.setLayout(null);
	double cost1=0.0;
	double cost2=0.0;
	double cost3=0.0;
	double cost4=0.0;
	double cost5=0.0;
	double cost=0.0;
	
	JButton btnNewButton = new JButton("Total");
	btnNewButton.addActionListener(new ActionListener() {
		double cost1=0.0;
		double cost2=0.0;
		double cost3=0.0;
		double cost4=0.0;
		double cost5=0.0;
		double cost=0.0;
	public void actionPerformed(ActionEvent e) {
	/*double cost1=0.0;
	double cost2=0.0;
	double cost3=0.0;
	double cost4=0.0;
	double cost5=0.0;
	double cost=0.0;*/
	
	//ALL time favorite:
	double Names=Double.parseDouble(pf.getText());
	double ff=80*Names;
	double cct=100*Names;
	double gb=120*Names;
	double gbc=97*Names;
	double s=85*Names;
	double gs=125*Names;
	double salad=70*Names;
	double vb=170*Names;
	double bm=130*Names;
	if(first.getSelectedItem().equals("French Fries"))
	{
	//String cff=String.format("%.2f",ff);
	//lblNewLabel_5.setText(cff);
	cost1+=ff;
	}
	if(first.getSelectedItem().equals("Chilli Cheese Toast"))
	{
	//String ccct=String.format("%.2f",cct);
	//lblNewLabel_5.setText(ccct);
	cost1+=cct;
	}
	if(first.getSelectedItem().equals("Garlic Bread"))
	{
	//String cgb=String.format("%.2f",gb);
	//lblNewLabel_5.setText(cgb);
	cost1+=gb;
	}
	if(first.getSelectedItem().equals("Garlic Bread with Cheese"))
	{
	//String cgbc=String.format("%.2f",cgbc);
	//lblNewLabel_5.setText(cgbc);
	cost1+=gbc;
	}
	if(first.getSelectedItem().equals("Sandwich"))
	{
	//String cgbc=String.format("%.2f",cgbc);
	//lblNewLabel_5.setText(cgbc);
	cost1+=s;
	}
	if(first.getSelectedItem().equals("Grill Sandwich"))
	{
	//String cgbc=String.format("%.2f",cgbc);
	//lblNewLabel_5.setText(cgbc);
	cost1+=gs;
	}
	if(first.getSelectedItem().equals("Salads"))
	{
	//String cgbc=String.format("%.2f",cgbc);
	//lblNewLabel_5.setText(cgbc);
	cost1+=salad;
	}
	if(first.getSelectedItem().equals("Veg. Burger"))
	{
	//String cgbc=String.format("%.2f",cgbc);
	//lblNewLabel_5.setText(cgbc);
	cost1+=vb;
	}
	if(first.getSelectedItem().equals("Bakes & Meals"))
	{
	//String cgbc=String.format("%.2f",cgbc);
	//lblNewLabel_5.setText(cgbc);
	cost1+=bm;
	}
	if(first.getSelectedItem().equals("All Time Favourite"))
	{
	cost1+=0;
	}
	//String ccost1=String.format("%.2f",cost1);
	//lblNewLabel_5.setText(ccost1);
	//****************Starters*******************/////
	double Names2=Double.parseDouble(ps.getText());
	double sr=80*Names2;
	double vmd=100*Names2;
	double cs=120*Names2;
	double cmd=97*Names2;
	if(second.getSelectedItem().equals("Spring Roll"))
	{
	//String cff=String.format("%.2f",ff);
	//lblNewLabel_5.setText(cff);
	cost2+=sr;
	}
	if(second.getSelectedItem().equals("Veg. Manchurian Dry"))
	{
	//String ccct=String.format("%.2f",cct);
	//lblNewLabel_5.setText(ccct);
	cost2+=vmd;
	}
	if(second.getSelectedItem().equals("Crispy Spinach & Baby - Corn"))
	{
	//String cgb=String.format("%.2f",gb);
	//lblNewLabel_5.setText(cgb);
	cost2+=cs;
	}
	if(second.getSelectedItem().equals("Chilly Mushroom Dry"))
	{
	//String cgb=String.format("%.2f",gb);
	//lblNewLabel_5.setText(cgb);
	cost2+=cmd;
	}
	if(second.getSelectedItem().equals("Starters"))
	{
	cost2+=0;
	}
	//****************Main Course*******************/////
	double Names3=Double.parseDouble(pt.getText());
	double mg=80*Names3;
	double ssv=100*Names3;
	double mvh=120*Names3;
	if(third.getSelectedItem().equals("Manchurian Gravy"))
	{
	//String cff=String.format("%.2f",ff);
	//lblNewLabel_5.setText(cff);
	cost3+=mg;
	}
	if(third.getSelectedItem().equals("Sweet & Sour Veg."))
	{
	//String ccct=String.format("%.2f",cct);
	//lblNewLabel_5.setText(ccct);
	cost3+=ssv;
	}
	if(third.getSelectedItem().equals("Mix. Veg. in Hot Garlic Sauce"))
	{
	//String cgb=String.format("%.2f",gb);
	//lblNewLabel_5.setText(cgb);
	cost3+=mvh;
	}
	if(third.getSelectedItem().equals("Main Course"))
	{
	cost3+=0;
	}
	//****************Noodles*******************/////
	double Names4=Double.parseDouble(pfo.getText());
	double vh=80*Names4;
	double gn=100*Names4;
	double ri=120*Names4;
	double vfr=140*Names4;
	if(fourth.getSelectedItem().equals("Veg Hakka Noodles"))
	{
	//String cff=String.format("%.2f",ff);
	//lblNewLabel_5.setText(cff);
	cost4+=vh;
	}
	if(fourth.getSelectedItem().equals("Gravy Noodles"))
	{
	//String ccct=String.format("%.2f",cct);
	//lblNewLabel_5.setText(ccct);
	cost4+=gn;
	}
	if(fourth.getSelectedItem().equals("Rice"))
	{
	//String cgb=String.format("%.2f",gb);
	//lblNewLabel_5.setText(cgb);
	cost4+=ri;
	}
	if(fourth.getSelectedItem().equals("Veg. Fried Rice"))
	{
	//String cgb=String.format("%.2f",gb);
	//lblNewLabel_5.setText(cgb);
	cost4+=vfr;
	}
	if(fourth.getSelectedItem().equals("Noodles"))
	{
	cost4+=0;
	}
	/*******************Breads***********************/
	double Names5=Double.parseDouble(pfi.getText());
	double tr=80*Names5;
	double naan=100*Names5;
	double kul=120*Names5;
	double bir=140*Names5;
	double pul=150*Names5;
	if(fifth.getSelectedItem().equals("Tandoori Roti"))
	{
	//String cff=String.format("%.2f",ff);
	//lblNewLabel_5.setText(cff);
	cost5+=tr;
	}
	if(fifth.getSelectedItem().equals("Naan"))
	{
	//String ccct=String.format("%.2f",cct);
	//lblNewLabel_5.setText(ccct);
	cost5+=naan;
	}
	if(fifth.getSelectedItem().equals("Kulcha"))
	{
	//String cgb=String.format("%.2f",gb);
	//lblNewLabel_5.setText(cgb);
	cost5+=kul;
	}
	if(fifth.getSelectedItem().equals("Biryani"))
	{
	//String cgb=String.format("%.2f",gb);
	//lblNewLabel_5.setText(cgb);
	cost5+=bir;
	}
	if(fifth.getSelectedItem().equals("Pulao"))
	{
	//String cgb=String.format("%.2f",gb);
	//lblNewLabel_5.setText(cgb);
	cost5+=pul;
	}
	if(fifth.getSelectedItem().equals("Breads"))
	{
	cost5+=0;
	}
	cost=cost1+cost2+cost3+cost4+cost5;
	costs=cost;
	String ccost=String.format("%.2f",costs);
	net.setText(ccost);
	//net=cost1+cost2+cost3+cost4+cost5;
	}});
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton.setBounds(191, 11, 164, 40);
	panel_5.add(btnNewButton);
	
	JButton jbtnReceipt = new JButton("Receipt");
	jbtnReceipt.addActionListener(new ActionListener() {
	

	public void actionPerformed(ActionEvent e) {
	
	double Names=Double.parseDouble(pf.getText());
	double Names2=Double.parseDouble(ps.getText());
	double Names3=Double.parseDouble(pt.getText());
	double Names4=Double.parseDouble(pfo.getText());
	double Names5=Double.parseDouble(pfi.getText());
	//String Names6=String.substring(textField_14.getText());
	double Names7=Double.parseDouble(textField_15.getText());
	
	
	jtxtReceipts.append("====================MCubeR Restaurant====================\n\nDATE:"+textField_14.getText()+"\t\tORDER NO.:"+Names7+"\n"+"QTY"+"\t\t"+"Items"+"\n"+"--------------------------------------------------------------"+"\n"+ Names + "\t\t"+first.getSelectedItem()+"\n"+ Names2+"\t\t"+ second.getSelectedItem()
	    + "\n"+ Names3 +"\t\t"+third.getSelectedItem()+"\n"+ Names4+"\t\t"+fourth.getSelectedItem()+"\n"+Names5+"\t\t"+fifth.getSelectedItem()+ 
	    "\n"+"--------------------------------------------------------------"+"\n"+"Net Total:"+"\t\t"+ costs + "\n"+"========================================================="+"\n\n" +"\t!!!!THANK YOU..VISIT AGAIN!!!!");
	
	
	
	
	
	
	
	
	
	
	}
	});
	/*jbtnReceipt.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	
	double Qty1=Double.parseDouble(jtxtChicBurger.getText());
	double Qty2=Double.parseDouble(jtxtChicBurgerMeal.getText());
	double Qty3=Double.parseDouble(jtxtBCBurger.getText());
	jtxtReceipts.append("\t\nMCubeR Restaurant System:\n\n"+
	"Chicken Burger:\t\t"+Qty1+"\nChicken Burger Meal:\t\t"+
	Qty2+"\nBacon and Cheese Burger:\t\t "
	+Qty3+"\n\nThanks for using Job Estimator");
	}
	});*/
	
	jbtnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 15));
	jbtnReceipt.setBounds(418, 11, 164, 40);
	panel_5.add(jbtnReceipt);
	
	
	JButton btnReset = new JButton("Reset");
	btnReset.addActionListener(new ActionListener() {
	

	public void actionPerformed(ActionEvent e) {
	pfi.setText(null);
	pf.setText(null);
	ps.setText(null);
	pt.setText(null);
	pfo.setText(null);
	net.setText(null);
	disc.setText(null);
	    jtxtReceipts.setText(null);
	    
	
	}

	
	});
	btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnReset.setBounds(659, 11, 164, 40);
	panel_5.add(btnReset);
	
	JButton btnExit = new JButton("Exit");
	btnExit.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	System.exit(0);
	}
	});
	btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnExit.setBounds(891, 11, 164, 40);
	panel_5.add(btnExit);
	
	JPanel panel_9 = new JPanel();
	panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel_9.setForeground(new Color(0, 0, 0));
	panel_9.setBounds(923, 399, 419, 140);
	frame.getContentPane().add(panel_9);
	panel_9.setLayout(null);
	
	textField_14 = new JTextField();
	textField_14.setText("01/01/2018");
	textField_14.setBounds(28, 51, 145, 39);
	panel_9.add(textField_14);
	textField_14.setColumns(10);
	
	JLabel lblDate = new JLabel("DATE");
	lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDate.setBounds(72, 11, 66, 29);
	panel_9.add(lblDate);
	
	textField_15 = new JTextField();
	textField_15.setText("1001");
	textField_15.setColumns(10);
	textField_15.setBounds(240, 51, 145, 39);
	panel_9.add(textField_15);
	
	JLabel lblOrderNo = new JLabel("ORDER NO.");
	lblOrderNo.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblOrderNo.setBounds(265, 11, 110, 29);
	panel_9.add(lblOrderNo);
	}
	protected Object SelectedItem() {
	// TODO Auto-generated method stub
	return null;
	}


	protected void checkBox2(Object object) {
	// TODO Auto-generated method stub
	
	}

	protected void checkBox1(Object object) {
	// TODO Auto-generated method stub
	
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	component.addMouseListener(new MouseAdapter() {
	public void mousePressed(MouseEvent e) {
	if (e.isPopupTrigger()) {
	showMenu(e);
	}
	}
	public void mouseReleased(MouseEvent e) {
	if (e.isPopupTrigger()) {
	showMenu(e);
	}
	}
	private void showMenu(MouseEvent e) {
	popup.show(e.getComponent(), e.getX(), e.getY());
	}
	});
	}
}