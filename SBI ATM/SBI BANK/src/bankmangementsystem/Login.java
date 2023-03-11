package bankmangementsystem;

import java.awt.Color;
import java.sql.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	JButton singup,clear,login;
	JTextField cardtext;
	JPasswordField pintext;
    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        
       //ImageIcon i1 = createImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\SBI BANK\\logo.jpg","Java");
       //ImageIcon i1= new ImageIcon(,"logo.jpg"));
        String str="D:\\image\\logo.jpg";
        ImageIcon i1 = new ImageIcon(str);
       Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100, 100);
        add(label);
        JLabel text = new JLabel("Welcome to Kashi Atm Machine");
       text.setFont(new Font("Osward",Font.BOLD,40));
        text.setBounds(200,40 , 760, 40);
        add(text);
        
        
        JLabel cardno = new JLabel("card no.");
        cardno.setFont(new Font("Osward",Font.BOLD,25));
         cardno.setBounds(120,150 , 180, 40);
         add(cardno);
         
         cardtext = new JTextField();
         cardtext.setFont(new Font("Arial",Font.BOLD,15));
         cardtext.setBounds(320,150,250,25);
         add(cardtext);
         
         JLabel pin = new JLabel("Pin");
         pin.setFont(new Font("Osward",Font.BOLD,25));
         pin.setBounds(120,210,180, 40);
         add(pin);
         pintext = new JPasswordField();
         pintext.setFont(new Font("Arial",Font.BOLD,15));
         pintext.setBounds(320,210,250,25);
         add(pintext);
         
        login = new JButton("Sign in");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.RED);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(420,300,100,30);
        clear.setBackground(Color.RED);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);
        
        singup = new JButton("Sign up");
        singup.setBounds(530,300,100,30);
        singup.setBackground(Color.RED);
        singup.setForeground(Color.BLACK);
        singup.addActionListener(this);
        add(singup);
        
        
          
        getContentPane().setBackground(Color.blue);
        
        setSize(900, 480);
        setVisible(true);
        setLocation(350, 200);

    }
    public void actionPerformed(ActionEvent kashi) {
    	if(kashi.getSource()==clear)
    	{
    		cardtext.setText("");
    		pintext.setText("");
    	}
    	else if(kashi.getSource()==login)
    	{
    		jdbms obj = new jdbms();
    		String cardnumber = cardtext.getText();
    		String pinnumber = pintext.getText();
    		String quary= "select * from login where cardnumber='"+cardnumber+"' and pinnumber='"+pinnumber+"'";
    		try {
    		ResultSet res=	obj.s.executeQuery(quary);
    		if(res.next())
    		{
    			setVisible(false);
    			new Transaction(pinnumber).setVisible(true);
    		}
    		else
    		{
    			JOptionPane.showMessageDialog(null,"incorrect Card number OR pin" );
    		}
    		}catch(Exception e)
    		{
    			System.out.println(e);
    		}
    		
    	}
    	else if(kashi.getSource()==singup)
    	{
    		setVisible(false);		
    		SINGUPONE obj = new SINGUPONE();
    		obj.setVisible(true);
    	}
    }

    public static void main(String[] args) {
        new Login();
    }
    
}