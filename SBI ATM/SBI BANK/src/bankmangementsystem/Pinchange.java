package bankmangementsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
public class Pinchange extends JFrame implements ActionListener {
	        String pin;
	         
	        JPasswordField repintext,pintext;
	        JButton b1,b2;
	        
	Pinchange(String pin)
	{
		this.pin= pin;
		setLayout(null);
		ImageIcon i1 = new ImageIcon("D:\\image\\atm.jpg");
		Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text = new JLabel("CHANGE YOUR PIN ");
		text.setBounds(250,300,500,35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,20));
		image.add(text);
		 
		
		JLabel newtext = new JLabel("New PIN ");
		newtext.setBounds(170,350,500,35);
		newtext.setForeground(Color.WHITE);
		newtext.setFont(new Font("System",Font.BOLD,20));
		image.add(newtext);
		pintext = new JPasswordField();
        pintext.setFont(new Font("Arial",Font.BOLD,15));
        pintext.setBounds(400,350,100,25);
        image.add(pintext);
        JLabel renewtext = new JLabel("RE-ENTER NEW PIN");
		renewtext.setBounds(170,390,500,35);
		renewtext.setForeground(Color.WHITE);
		renewtext.setFont(new Font("System",Font.BOLD,20));
		image.add(renewtext);
		repintext = new JPasswordField();
        repintext.setFont(new Font("Arial",Font.BOLD,15));
        repintext.setBounds(400,390,100,25);
        image.add(repintext);
        
        b1 = new JButton("CHANGE");
		b1.setBounds(355,485,150,30);
		b1.addActionListener(this);
		image.add(b1);
		
		 b2 = new JButton("Back");
		b2.setBounds(170,485,150,30);
		b2.addActionListener(this);
		image.add(b2);
		
		setUndecorated(true);
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
	}
	public  void actionPerformed(ActionEvent kashi)
	{
		if(kashi.getSource()==b1)
		{
		try
		{
		     String npin= pintext.getText();
		     String rpin = repintext.getText();
		     if(npin.equals(rpin)==false)
		     {
		    	 JOptionPane.showMessageDialog(null,"Enter pin do not match");
		    	 return ;
		     }
		     if(npin.equals("")||pin.equals(""))
		     {
		    	 JOptionPane.showMessageDialog(null,"plase enter a pin");
		    	 return ;
		     }
		     
		     jdbms obj = new jdbms();
		     String q1 = "update Details set pin ='"+npin+"' where pin ='"+pin+"'";
		     String q2 = "update signup3 set pinnumber ='"+npin+"' where pinnumber ='"+pin+"'";
		     String q3 = "update login set pinnumber ='"+npin+"' where pinnumber ='"+pin+"'";
		     obj.s.executeUpdate(q1);
		     obj.s.executeUpdate(q3);
		     obj.s.executeUpdate(q3);
		     
		     JOptionPane.showMessageDialog(null,"PIN change successfully");
		      setVisible(false);
		      new Transaction(pin).setVisible(true);
		      
		}catch(Exception e)
		{
			System.out.println(e);
		}
		}
		else
		{
			setVisible(false);
			new Transaction(pin).setVisible(true);
			
		}
		
	}
	
	public static void main(String[] kashi)
	{
		new Pinchange("");
	}

}
