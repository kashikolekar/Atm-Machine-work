package bankmangementsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
public class Ministatement extends JFrame implements ActionListener{
	String pin;
	JButton cancel;
	Ministatement(String pin)
	{
		this.pin=pin;
		
		setTitle("Mini Statement");
		
		setLayout(null);
		
		
		JLabel mini = new JLabel();
		
		add(mini);
		
		JLabel name = new JLabel("Kashi Bank");
		name.setFont(new Font("System",Font.BOLD,40));
		name.setBounds(300, 20, 400, 40);
		name.setForeground(Color.WHITE);
		name.setBackground(Color.GREEN);
		add(name);
		
		JLabel card = new JLabel();
		card.setBounds(200,100,300,30);
		card.setForeground(Color.WHITE);
		card.setFont(new Font("System",Font.BOLD,14));
		add(card);
		 cancel = new JButton("Back");
		 cancel.setBackground(Color.RED);
		 cancel.setForeground(Color.WHITE);
		 cancel.setBounds(450,650,200,30);
		 cancel.setFont(new Font("Raleway",Font.BOLD,20));
		 cancel.addActionListener(this);
		 add(cancel);
		
		
		try
		{
			jdbms obj = new jdbms();
			ResultSet res = obj.s.executeQuery("select * from login where pinnumber ='"+pin+"'");
		
			while(res.next())
			{
				card.setText("Card Number :"+res.getString("cardnumber"));
			}
			ResultSet dres = obj.s.executeQuery("select * from Details where pin ='"+pin+"'");
			while(dres.next())
			{
				mini.setText(mini.getText()+"<html>"+dres.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+dres.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+dres.getString("amount")+"<br><br><html>");
				
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		mini.setBounds(200,180,500,700);
		mini.setFont(new Font("System",Font.BOLD,10));
		
		
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
        getContentPane().setBackground(Color.blue);
		
	}
	public void actionPerformed(ActionEvent kashi)
	{
		if(kashi.getSource()==cancel)
		{
			setVisible(false);
			new Transaction(pin).setVisible(true);
		}
	}

	public static void main(String[] kashi)
	{
	new Ministatement("");
	}
}
