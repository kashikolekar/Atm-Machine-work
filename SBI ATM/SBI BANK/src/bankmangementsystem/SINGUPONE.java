package bankmangementsystem;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.*; 
public class SINGUPONE extends JFrame implements ActionListener{
	JTextField nametext,ftext,etext,ctext,stext,ptext;
	long random;
	JButton b;
	JRadioButton ga,fe,un,mar;
	JDateChooser dated;
	SINGUPONE(){
		setLayout(null);
		Random ran = new Random();
		 random = Math.abs((ran.nextLong()%9000L)+1000L);
		
		
		JLabel formno = new JLabel("APLLICATION FROM NO. " + random);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setForeground(Color.BLACK);
		formno.setBounds(140,20,600,40);
		add(formno);
		
		
		JLabel details = new JLabel("PAGE 1 : Personal Details");
		details.setFont(new Font("Raleway",Font.BOLD,22));
		details.setForeground(Color.BLACK);
		details.setBounds(290,80,400,30);
		add(details);
		
		
		JLabel name = new JLabel("NAME :");
		name.setFont(new Font("Raleway",Font.BOLD,22));
		name.setForeground(Color.BLACK);
		name.setBounds(100,130,200,30);
		add(name);
		
		 nametext = new JTextField();
         nametext.setFont(new Font("Arial",Font.BOLD,15));
         nametext.setBounds(320,130,450,30);
         add(nametext);

		JLabel fname = new JLabel("FATHER'S NAME :");
		fname.setFont(new Font("Raleway",Font.BOLD,22));
		fname.setForeground(Color.BLACK);
		fname.setBounds(100,180,200,30);
		add(fname);
		
		 ftext = new JTextField();
         ftext.setFont(new Font("Arial",Font.BOLD,15));
         ftext.setBounds(320,180,450,30);
         add(ftext);

		JLabel db = new JLabel("DATE OF BIRTH :");
		db.setFont(new Font("Raleway",Font.BOLD,22));
		db.setForeground(Color.BLACK);
		db.setBounds(100,230,200,30);
		add(db);
		
		 dated = new JDateChooser();
		dated.setBounds(320, 230,300, 30);
		dated.setForeground(Color.BLACK);
		add(dated);


		JLabel g = new JLabel("Gender :");
		g.setFont(new Font("Raleway",Font.BOLD,22));
		g.setForeground(Color.BLACK);
		g.setBounds(100,280,200,30);
		add(g);
		
		ga = new JRadioButton("Male");
		ga.setBounds(320,280,100,30);
		ga.setBackground(Color.BLUE);
		add(ga);
		 fe= new JRadioButton("Female");
		fe.setBounds(440,280,100,30);
		fe.setBackground(Color.BLUE);
		add(fe);
		
		ButtonGroup gen = new ButtonGroup();
		gen.add(fe);
		gen.add(ga);
		
		 
		JLabel M = new JLabel("MARITAL STATUS:");
		M.setFont(new Font("Raleway",Font.BOLD,22));
	    M.setForeground(Color.BLACK);
		M.setBounds(100,330,220,30);
		add(M);
		
		 un = new JRadioButton("Married");
		un.setBounds(320,330,100,30);
		un.setBackground(Color.BLUE);
		add(un);
		 mar= new JRadioButton("Unmarried");
		mar.setBounds(440,330,100,30);
		mar.setBackground(Color.BLUE);
		add(mar);
		ButtonGroup gun = new ButtonGroup();
		gun.add(un);
		gun.add(mar);

		JLabel e = new JLabel("E-Mail add :");
		e.setFont(new Font("Raleway",Font.BOLD,22));
		e.setForeground(Color.BLACK);
		e.setBounds(100,380,200,30);
		add(e);
		etext = new JTextField();
        etext.setFont(new Font("Arial",Font.BOLD,15));
        etext.setBounds(320,380,450,30);
        add(etext);

		JLabel c = new JLabel("CITY :");
		c.setFont(new Font("Raleway",Font.BOLD,22));
		c.setForeground(Color.BLACK);
		c.setBounds(100,430,200,30);
		add(c);
		ctext = new JTextField();
        ctext.setFont(new Font("Arial",Font.BOLD,15));
        ctext.setBounds(320,430,200,30);
        add(ctext);
		
		
		JLabel s = new JLabel("STATE :");
		s.setFont(new Font("Raleway",Font.BOLD,22));
		s.setForeground(Color.BLACK);
		s.setBounds(100,480,200,30);
		add(s);
		stext = new JTextField();
        stext.setFont(new Font("Arial",Font.BOLD,15));
        stext.setBounds(320,480,200,30);
        add(stext);
		
		JLabel p = new JLabel("PIN CODE :");
		p.setFont(new Font("Raleway",Font.BOLD,22));
		p.setForeground(Color.BLACK);
		p.setBounds(100,530,200,30);
		add(p);
		ptext = new JTextField();
        ptext.setFont(new Font("Arial",Font.BOLD,15));
        ptext.setBounds(320,530,200,30);
        add(ptext);
        
		
		 b= new JButton("Next");
		b.setBounds(750,650,60,30);
		b.addActionListener(this);
		add(b);
		
		
		
		getContentPane().setBackground(Color.BLUE);
	 setSize(900,850);
     setLocation(350,10);
	 setVisible(true);
	 
	  
	}
	  public void actionPerformed(ActionEvent kashi) {
		 String str = ""+random; 
		 String name= nametext.getText();
		 String fname = ftext.getText();
		 String dob = ((JTextField)dated.getDateEditor().getUiComponent()).getText();
		 String gen = null;
		 if(ga.isSelected())
		 {
			gen="Male"; 
		 }
		 else if(fe.isSelected())
		 {
			 gen="Female";
		 }
		
		 String married = null;
		 if(un.isSelected())
		 {
			 married="Unmarried";
		 }
		 else if(mar.isSelected())
		 {
			 married="Married";
		 }
		 String email = etext.getText();
		 String city = ctext.getText();
		 String state = stext.getText();
		 String pin = ptext.getText();
		
		 
		 try {
			 if(name.equals("")||fname.equals("")||dob.equals("")||email.equals("")||city.equals("")||state.equals("")||pin.equals(""))
			 {
				 JOptionPane.showMessageDialog(null,"all is Required");
			 }
			 else
			 {
				jdbms obj = new jdbms();
				String inside = "insert into singup values('"+str+"','"+name+"','"+fname+"','"+dob+"','"+gen+"','"+married+"','"+email+"','"+city+"','"+state+"','"+pin+"')";
				obj.s.executeUpdate(inside);
				 
				if(kashi.getSource()==b)
					 {setVisible(false);
					 new Secondpage(str).setVisible(true);
					 }	 
				 
			 }
			 
		 }catch(Exception e)
		 {
			System.out.println(e); 
		 }
		 
	  }
	  
	
       public static void main(String kashi[])
       {
    	   new SINGUPONE();
       }

}
