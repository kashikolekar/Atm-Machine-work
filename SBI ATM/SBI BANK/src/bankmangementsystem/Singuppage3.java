package bankmangementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Singuppage3 extends JFrame implements ActionListener{
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6;
	JButton submit,cancel;
	String formno;
	Singuppage3(String formno){
		this.formno=formno;
		setLayout(null);
		JLabel l1 = new JLabel("Page 3 : Account Details");
		l1.setFont(new Font("Raleway",Font.BOLD,38));
		l1.setForeground(Color.BLACK);
		l1.setBounds(140,20,600,40);
		add(l1);
		
		JLabel type = new JLabel(" Account Type");
		type.setFont(new Font("Raleway",Font.BOLD,30));
		type.setForeground(Color.BLACK);
		type.setBounds(100,140,400,30);
		add(type);
		
		r1= new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway",Font.BOLD,25));
		r1.setBackground(Color.BLUE);
		r1.setBounds(110,180,300,25);
		add(r1);
		r2= new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Raleway",Font.BOLD,25));
		r2.setBackground(Color.blue);
		r2.setBounds(450,180,400,25);
		add(r2);
		r3= new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway",Font.BOLD,25));
		r3.setBackground(Color.blue);
		r3.setBounds(110,210,300,25);
		add(r3);
		r4= new JRadioButton("Rucurring Deposit Account");
		r4.setFont(new Font("Raleway",Font.BOLD,25));
		r4.setBackground(Color.blue);
		r4.setBounds(450,210,400,25);
		add(r4);
		
	 ButtonGroup bgroup = new ButtonGroup();
	 bgroup.add(r1);
	 bgroup.add(r2);
	 bgroup.add(r3);
	 bgroup.add(r4);
	 
	 
	 
	 JLabel cardno= new JLabel("Card Number  :");
		cardno.setFont(new Font("Raleway",Font.BOLD,30));
		cardno.setForeground(Color.BLACK);
		cardno.setBounds(100,260,300,30);
		add(cardno);
		 JLabel card= new JLabel("This your card number");
			card.setFont(new Font("Raleway",Font.BOLD,20));
			card.setForeground(Color.BLACK);
			card.setBounds(190,300,400,30);
			add(card);
		
     JLabel number = new JLabel("xxxx xxxx xxxx xxxx");
			number.setFont(new Font("Raleway",Font.BOLD,30));
			number.setForeground(Color.BLACK);
			number.setBounds(430,260,300,30);
			add(number);
	JLabel pinno= new JLabel("Pin Number  :");
			pinno.setFont(new Font("Raleway",Font.BOLD,30));
			pinno.setForeground(Color.BLACK);
			pinno.setBounds(100,350,300,30);
			add(pinno);
			JLabel cd= new JLabel("This your pin number");
			cd.setFont(new Font("Raleway",Font.BOLD,20));
			cd.setForeground(Color.BLACK);
			cd.setBounds(190,390,400,30);
			add(cd);
	 JLabel pin = new JLabel("xxxx ");
				pin.setFont(new Font("Raleway",Font.BOLD,30));
				pin.setForeground(Color.BLACK);
				pin.setBounds(430,350,300,30);
				add(pin);
	JLabel servic= new JLabel("Services Required :");
					servic.setFont(new Font("Raleway",Font.BOLD,30));
					servic.setForeground(Color.BLACK);
					servic.setBounds(100,440,400,30);
					add(servic);
					
					
					//checkbox
					
		 c1 = new JCheckBox("Atm Card");
		 c1.setBounds(130,500,300,30);
		 c1.setFont(new Font("Raleway",Font.BOLD,18));
		 add(c1);
		 c2 = new JCheckBox("Internet Banking");
		 c2.setBounds(450,500,300,30);
		 c2.setFont(new Font("Raleway",Font.BOLD,18));
		 add(c2);
		 
		 c3 = new JCheckBox("Mobile Banking");
		 c3.setBounds(130,550,300,30);
		 c3.setFont(new Font("Raleway",Font.BOLD,18));
		 add(c3);
		 
		 c4 = new JCheckBox("Email And SMS Alerts");
		 c4.setBounds(450,550,400,30);
		 c4.setFont(new Font("Raleway",Font.BOLD,18));
		 add(c4);
		 
		 c5 = new JCheckBox("Cheque Book");
		 c5.setBounds(130,600,300,30);
		 c5.setFont(new Font("Raleway",Font.BOLD,18));
		 add(c5);
		 
		 c6 = new JCheckBox("E-Statement");
		 c6.setBounds(450,600,300,30);
		 c6.setFont(new Font("Raleway",Font.BOLD,18));
		 add(c6);
		 
		 submit = new JButton("Submit");
		 submit.setBackground(Color.GREEN);
		 submit.setForeground(Color.WHITE);
		 submit.setBounds(700,650,200,30);
		 submit.setFont(new Font("Raleway",Font.BOLD,20));
		 submit.addActionListener(this);
		 add(submit);
		 cancel = new JButton("Cancel");
		 cancel.setBackground(Color.RED);
		 cancel.setForeground(Color.WHITE);
		 cancel.setBounds(450,650,200,30);
		 cancel.setFont(new Font("Raleway",Font.BOLD,20));
		 cancel.addActionListener(this);
		 add(cancel);
		 
		 
					
			
		
		
		getContentPane().setBackground(Color.BLUE);
		 setSize(900,850);
	     setLocation(350,10);
		 setVisible(true);
		
	}
	public void actionPerformed(ActionEvent kashi)
	{
		if(kashi.getSource()==submit)
		{
			String acctype = null;
			if(r1.isSelected())
			{
				acctype="Saving Account";
			}
			else if(r2.isSelected())
			{
				acctype="Fixed Deposit Account";
			}
			else if(r3.isSelected())
			{
				acctype="Current Account";
			}
			else if(r4.isSelected())
			{
				acctype="Rucurring Deposit Account";
			}
			
			Random ran = new Random();
		String  cardnum =""+Math.abs((ran.nextLong()%900000000L)+9876121200000000L);
		String pinnumber =""+Math.abs((ran.nextLong()%9000l)+1000l); 	
			
		String facility = "";
		if(c1.isSelected())
		{
			facility += "Atm card";
		}
		else if(c2.isSelected())
		{
			facility += " Internet Banking";
		}
		else if(c3.isSelected())
		{
			facility += " Mobile Banking";
		}
		else if(c4.isSelected())
		{
			facility += " Email And SMS Alerts";
		}
		else if(c5.isSelected())
		{
			facility += " Cheque Book";
		}
		else if(c6.isSelected())
		{
			facility += " E-Statement";
		}
		
		
		try {
			if(acctype.equals(""))
			{
				JOptionPane.showMessageDialog(null, "plase Type is required");
			}
			else
			{
				jdbms obj = new jdbms();
				String quary ="insert into signup3 values('"+formno+"','"+acctype+"','"+cardnum+"','"+pinnumber+"','"+facility+"')";
				obj.s.executeUpdate(quary);
				String quary2 ="insert into login values('"+formno+"','"+cardnum+"','"+pinnumber+"')";
				obj.s.executeUpdate(quary2);
				JOptionPane.showMessageDialog(null, "card number is :"+cardnum+"pin is :"+pinnumber+"");
				//JOptionPane.showMessageDialog(null,"pin is :"+pinnumber+"");	
			setVisible(false);
				new Deposit(pinnumber).setVisible(true);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		}
		else if(kashi.getSource()==cancel)
		{
			setVisible(false);
			new Login().setVisible(true);
		}
	}
	
	public static void main(String[] kashi)
	{
		new Singuppage3("");
	}

}
