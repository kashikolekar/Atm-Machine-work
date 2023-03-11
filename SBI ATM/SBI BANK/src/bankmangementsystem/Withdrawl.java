package bankmangementsystem;
import javax.swing.*;
import java.util.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.ResultSet;
public class Withdrawl extends JFrame implements ActionListener {
	JButton withdrawl,b;
	JTextField amount;
	String pin ;
	Withdrawl(String pin)
	{
		this.pin= pin;
		setLayout(null);
		
		String str = "D:\\image\\atm.jpg";
		ImageIcon i1 = new ImageIcon(str);
		Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("Enter the amount you want to withdrawl");
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		text.setBounds(170,300,400,20);
		image.add(text);
		
		 amount = new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,30));
		amount.setBounds(170,350,300,35);
		image.add(amount);
		
		withdrawl = new JButton("Withdrawl");
		withdrawl.setBounds(355,485,150,30);
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		 b = new JButton("Back");
		b.setBounds(170,485,150,30);
		b.addActionListener(this);
		image.add(b);
       setSize(900,900);
       setLocation(300,0);
       setVisible(true);
	}
	public void actionPerformed(ActionEvent kashi)
	{
		if(kashi.getSource()==b)
		{
			setVisible(false);
			new Transaction(pin).setVisible(true);
		}
		else if(kashi.getSource()==withdrawl)
		{
			String number = amount.getText();
			Date date = new Date();
			if(number.equals(""))
			{
				JOptionPane.showMessageDialog(null, "palse enter amount  ");
			}
			else
			{try {
				
				jdbms obj = new jdbms();
				String quary = "insert into Details values('"+pin+"','"+date+"','withdrawl','"+number+"')";
				obj.s.executeUpdate(quary);
				JOptionPane.showMessageDialog(null,"Rs "+number+" withdrawl Succefully");
				setVisible(false);
				new Transaction(pin).setVisible(true);
				 
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			}
			
		}
	}
	
	
	public static void main(String[] kashi)
	{
		new Withdrawl("");
	}

}
