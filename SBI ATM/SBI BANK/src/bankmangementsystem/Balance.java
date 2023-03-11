package bankmangementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;
public class Balance extends JFrame implements ActionListener {
	String pin;
	JButton b1;
	int bal;
     Balance(String pin)
     {
    	 this.pin=pin;
    	 setLayout(null);
 		ImageIcon i1 = new ImageIcon("D:\\image\\atm.jpg");
 		Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
 		ImageIcon i3 = new ImageIcon(i2);
 		JLabel image = new JLabel(i3);
 		image.setBounds(0, 0, 900, 900);
 		add(image);
 		
 		JLabel f1= new JLabel("your balance is =");
 		f1.setBounds(170,300,200,30);
 		f1.setForeground(Color.WHITE);
 		f1.setFont(new Font("System",Font.BOLD,25));
 		image.add(f1);
 		
 		
 		
 		
 		
 		
 		
 		 jdbms obj = new jdbms();
			try
			{
			 ResultSet res = obj.s.executeQuery("select * from Details where pin = '"+pin+"'");
			  bal =0;
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
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			JLabel f2 = new JLabel(Integer.toString(bal));
	 		f2.setBounds(370, 300, 200, 30);
	 		f2.setForeground(Color.WHITE);
	 		f2.setFont(new Font("System",Font.BOLD,25));
	 		image.add(f2);
			
			
 		

        b1 = new JButton("Back");
		b1.setBounds(355,485,150,30);
		b1.addActionListener(this);
		image.add(b1);
 		
 		setUndecorated(true);
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
     }
     public void actionPerformed(ActionEvent kashi)
     {
    	 if(kashi.getSource()==b1)
    	 {
    		setVisible(false);
    		new Transaction(pin).setVisible(true);
    	 }
    		
			 
     }
     public static void main(String[] kashi)
     {
    	 new Balance("");
     }
}
