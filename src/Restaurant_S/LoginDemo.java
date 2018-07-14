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
  
class NextPage extends JFrame
 {
   NextPage()
  {
  setDefaultCloseOperation(javax.swing.
   WindowConstants.DISPOSE_ON_CLOSE);
  setTitle("Welcome");
  setSize(400, 200);
   }
  }
class Login extends JFrame implements ActionListener
 {
  JButton SUBMIT;
  JPanel panel;
  JLabel label1,label2;
  final JTextField  text1,text2;
   Login()
   {
   label1 = new JLabel();
   label1.setText("Username:");
   text1 = new JTextField(15);
 
   label2 = new JLabel();
   label2.setText("Password:");
   text2 = new JPasswordField(15);
  
   SUBMIT=new JButton("SUBMIT");
   
   panel=new JPanel(new GridLayout(3,1));
   panel.add(label1);
   panel.add(text1);
   panel.add(label2);
   panel.add(text2);
   panel.add(SUBMIT);
   add(panel,BorderLayout.CENTER);
   SUBMIT.addActionListener(this);
   setTitle("LOGIN FORM");
   }
  public void actionPerformed(ActionEvent ae)
   {
   String value1=text1.getText();
   String value2=text2.getText();
   if (value1.equals("bhaibhai") && value2.equals("hello123")) {
   /*NextPage page=new NextPage();
   page.setVisible(true);
   JLabel label = new JLabel("arey"+value1);
   page.getContentPane().add(label);*/
	  /* Restaurants a=new Restaurants();
	   a.execute123();*/
   }
   else{
   System.out.println("enter the valid username and password");
   JOptionPane.showMessageDialog(this,"Incorrect login or password",
   "Error",JOptionPane.ERROR_MESSAGE);
   }
 }
 }
  class LoginDemo
 {
   public static void main(String arg[])
   {
   try
   {
   Login frame=new Login();
   frame.setSize(300,100);
   frame.setVisible(true);
   }
   catch(Exception e)
   {JOptionPane.showMessageDialog(null, e.getMessage());}
   }
 }