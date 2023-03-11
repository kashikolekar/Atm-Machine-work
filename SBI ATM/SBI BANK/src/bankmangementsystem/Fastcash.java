package bankmangementsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

import javax.swing.*;
public class Fastcash extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	String pin;
	Fastcash(String pin)
	{
		this.pin= pin;
		setLayout(null);
		ImageIcon i1 = new ImageIcon("D:\\image\\atm.jpg");
		Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text = new JLabel(" Select Withdrawl  Amount");
		text.setBounds(200,300,700,35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,20));
		image.add(text);
		
		
		b1 = new JButton("Rs 100");
		b1.setBounds(165, 420, 130, 20);
		b1.setForeground(Color.GREEN);
		b1.addActionListener(this);
		b1.setFont(new Font("System",Font.BOLD,20));
		image.add(b1);
		b2 = new JButton("Rs 500");
		b2.setBounds(165, 455,130,20);
		b2.setForeground(Color.GREEN);
		b2.addActionListener(this);
	    b2.setFont(new Font("System",Font.BOLD,20));
		image.add(b2);
		b3 = new JButton("Rs 1000");
		b3.setBounds(165, 490,130,20);
		b3.setForeground(Color.GREEN);
		b3.addActionListener(this);
	    b3.setFont(new Font("System",Font.BOLD,20));
		image.add(b3);
		b4 = new JButton("Rs 2000");
		b4.setBounds(165, 525,130,20);
		b4.setForeground(Color.GREEN);
		b4.addActionListener(this);
	    b4.setFont(new Font("System",Font.BOLD,20));
		image.add(b4);
		b5 = new JButton("Rs 5000");
		b5.setBounds(380, 420,130,20);
		b5.setForeground(Color.GREEN);
		b5.addActionListener(this);
	    b5.setFont(new Font("System",Font.BOLD,20));
		image.add(b5);
		b6 = new JButton("Rs 10000");
		b6.setBounds(380, 455,130,20);
		b6.setForeground(Color.GREEN);
		b6.addActionListener(this);
	    b6.setFont(new Font("System",Font.BOLD,20));
		image.add(b6);
		b7 = new JButton("Back");
		b7.setBounds(380, 490,130,20);
		b7.setForeground(Color.GREEN);
		b7.addActionListener(this);
	    b7.setFont(new Font("System",Font.BOLD,20));
		image.add(b7);
		
		
		setUndecorated(true);
		setSize(900,900);
		setLocation(300,10);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent kashi)
	{
		if(kashi.getSource()==b7)
		{
			setVisible(false);
			new Transaction(pin).setVisible(true);
		}
		else 
		{
			String str = ((JButton)kashi.getSource()).getText().substring(3);
			jdbms obj = new jdbms();
			try
			{
			 ResultSet res = obj.s.executeQuery("select * from Details where pin = '"+pin+"'");
			 int bal =0;
			 while(res.next())
			 {
				 if(res.getString("type").equals("deposit"))
				 {
					 bal += Integer.parseInt(res.getString("amount"));
					 
				 }
				 else
				 {
					 bal -= Integer.parseInt(res.getString("amount"));
				 }
			 }
			 if(kashi.getSource()!=b7 && bal<Integer.parseInt(str))
			 {
				 JOptionPane.showMessageDialog(null, "Insufficient Balance");
				 return ;
			 }
			 else
			 {
				 Date date = new Date();
				 String quary = "insert into Details values('"+pin+"','"+date+"','withdrawl','"+str+"')";
					obj.s.executeUpdate(quary);
					JOptionPane.showMessageDialog(null,"Rs "+str+" withdrawl Succefully");
					setVisible(false);
					new Transaction(pin).setVisible(true);
			 }
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
	}
	
	
 public static void main(String[] Kashi)
 {
	 new Fastcash("");
 }
}
