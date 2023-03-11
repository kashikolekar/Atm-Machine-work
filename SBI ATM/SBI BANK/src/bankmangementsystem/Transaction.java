package bankmangementsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;
public class Transaction extends JFrame implements ActionListener{
	JButton deposit,b2,b3,b4,b5,b6,b7,b8;
	String pin;
	Transaction(String pin)
	{
		this.pin= pin;
		setLayout(null);
		ImageIcon i1 = new ImageIcon("D:\\image\\atm.jpg");
		Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("Please Select Your Transaction");
		text.setBounds(200,300,700,35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,20));
		image.add(text);
		
		
		deposit = new JButton("Deposit");
		deposit.setBounds(165, 420, 180, 20);
		deposit.setForeground(Color.GREEN);
		deposit.addActionListener(this);
		deposit.setFont(new Font("System",Font.BOLD,20));
		image.add(deposit);
		b2 = new JButton("Cash Withdraw");
		b2.setBounds(165, 455,180,20);
		b2.setForeground(Color.GREEN);
		b2.addActionListener(this);
	    b2.setFont(new Font("System",Font.BOLD,20));
		image.add(b2);
		b3 = new JButton("Fast Cash");
		b3.setBounds(165, 490,180,20);
		b3.setForeground(Color.GREEN);
		b3.addActionListener(this);
	    b3.setFont(new Font("System",Font.BOLD,20));
		image.add(b3);
		b4 = new JButton("Mini Statement");
		b4.setBounds(165, 525,180,20);
		b4.setForeground(Color.GREEN);
		b4.addActionListener(this);
	    b4.setFont(new Font("System",Font.BOLD,20));
		image.add(b4);
		b5 = new JButton("Pin Change");
		b5.setBounds(380, 420,140,20);
		b5.setForeground(Color.GREEN);
		b5.addActionListener(this);
	    b5.setFont(new Font("System",Font.BOLD,20));
		image.add(b5);
		b6 = new JButton("Balance ");
		b6.setBounds(380, 455,140,20);
		b6.setForeground(Color.GREEN);
		b6.addActionListener(this);
	    b6.setFont(new Font("System",Font.BOLD,20));
		image.add(b6);
		b7 = new JButton("Exit");
		b7.setBounds(380, 490,140,20);
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
			System.exit(0);
		}
		else if(kashi.getSource()==deposit)
		{
			setVisible(false);
			new Deposit(pin).setVisible(true);
		}
		else if(kashi.getSource()==b2)
		{
			setVisible(false);
			new Withdrawl(pin).setVisible(true);
		}
		else if(kashi.getSource()==b3)
		{
			setVisible(false);
			new Fastcash(pin).setVisible(true);
			
		}
		else if(kashi.getSource()==b5)
		{
		    setVisible(false);
		    new Pinchange(pin).setVisible(true);
		}
		else if(kashi.getSource()==b6)
		{
			setVisible(false);
			new Balance(pin).setVisible(true);
		}
		else if(kashi.getSource()==b4)
		{
			setVisible(false);
			new Ministatement(pin).setVisible(true);
		}
		
	}
	
	
 public static void main(String[] Kashi)
 {
	 new Transaction("");
 }
}
