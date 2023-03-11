package bankmangementsystem;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.*; 
public class Secondpage extends JFrame implements ActionListener{
	JTextField edutext,atext,pantext;
	JComboBox occtext,inctext,cattext,reltext;
	JButton b;
	JRadioButton ga,fe,y,n;
	JDateChooser dated;
	String formno;
	Secondpage(String formno){
		this.formno= formno;
		setLayout(null);
		setTitle("NEW Account Application Form:PAGE-2");
		
		
		
		
		JLabel details = new JLabel("PAGE 2: Additinal Details");
		details.setFont(new Font("Raleway",Font.BOLD,22));
		details.setForeground(Color.BLACK);
		details.setBounds(290,80,400,30);
		add(details);
		
		
		JLabel rel = new JLabel("Religion :");
		rel.setFont(new Font("Raleway",Font.BOLD,22));
		rel.setForeground(Color.BLACK);
		rel.setBounds(100,130,200,30);
		add(rel);
		String[] relstr = {"Hindu","Muslim","Sikh","Christan","Other"};
		 reltext = new JComboBox(relstr);
		//reltext.setForeground(Color.BLACK);
		reltext.setBounds(320,130,200,30);
		add(reltext);

		JLabel cat = new JLabel("Category");
		cat.setFont(new Font("Raleway",Font.BOLD,22));
		cat.setForeground(Color.BLACK);
		cat.setBounds(100,180,200,30);
		add(cat);
		String[] catstr = {"Nt-c","Nt-b","obc","open","sc","st","Other"};
		 cattext = new JComboBox(catstr);
		//reltext.setForeground(Color.BLACK);
		cattext.setBounds(320,180,200,30);
		add(cattext);

		
		

		JLabel inc = new JLabel("Income");
		inc.setFont(new Font("Raleway",Font.BOLD,22));
		inc.setForeground(Color.BLACK);
		inc.setBounds(100,230,200,30);
		add(inc);
		
		String[] incstr = {"null","< 100000","100000 to 500000 ","500000>","500000 to 1000000","1000000>","Other"};
		 inctext = new JComboBox(incstr);
		//reltext.setForeground(Color.BLACK);
		inctext.setBounds(320,230,200,30);
		add(inctext);


		JLabel edu = new JLabel("Educationl :");
		edu.setFont(new Font("Raleway",Font.BOLD,22));
		edu.setForeground(Color.BLACK);
		edu.setBounds(100,280,200,30);
		add(edu);
		edutext = new JTextField();
        edutext.setFont(new Font("Arial",Font.BOLD,15));
        edutext.setBounds(320,280,450,30);
        add(edutext);
		
		
	
		
		
		
		
		 
		JLabel occ = new JLabel("Occupation :");
		occ.setFont(new Font("Raleway",Font.BOLD,22));
	    occ.setForeground(Color.BLACK);
		occ.setBounds(100,330,220,30);
		add(occ);
		String[] occstr = {"Self-Employee","Student","Retired","Employee in Kashi bank","Other"};
		 occtext = new JComboBox(occstr);
		//reltext.setForeground(Color.BLACK);
		occtext.setBounds(320,330,200,30);
		add(occtext);

		
		JLabel exis = new JLabel("Exisiting Account:");
		exis.setFont(new Font("Raleway",Font.BOLD,18));
		exis.setForeground(Color.BLACK);
		exis.setBounds(100,380,200,30);
		add(exis);
		y= new JRadioButton("yes");
		y.setBounds(320,380,100,30);
		y.setBackground(Color.GREEN);
		add(y);
		 n= new JRadioButton("no");
		n.setBounds(440,380,100,30);
		n.setBackground(Color.RED);
		add(n);
		ButtonGroup gen = new ButtonGroup();
		gen.add(y);
		gen.add(n);
		

		

		JLabel pan = new JLabel("PAN Number :");
		pan.setFont(new Font("Raleway",Font.BOLD,22));
		pan.setForeground(Color.BLACK);
		pan.setBounds(100,430,200,30);
		add(pan);
		pantext = new JTextField();
        pantext.setFont(new Font("Arial",Font.BOLD,15));
        pantext.setBounds(320,430,200,30);
        add(pantext);
		
		
		JLabel id = new JLabel("Aadhr Number :");
		id.setFont(new Font("Raleway",Font.BOLD,22));
		id.setForeground(Color.BLACK);
		id.setBounds(100,480,200,30);
		add(id);
		atext = new JTextField();
        atext.setFont(new Font("Arial",Font.BOLD,15));
        atext.setBounds(320,480,200,30);
        add(atext);
		
		JLabel s = new JLabel("Senior Citizen :");
		s.setFont(new Font("Raleway",Font.BOLD,22));
		s.setForeground(Color.BLACK);
		s.setBounds(100,530,200,30);
		add(s);
		ga = new JRadioButton("yes");
		ga.setBounds(320,530,100,30);
		ga.setBackground(Color.GREEN);
		add(ga);
		 fe= new JRadioButton("no");
		fe.setBounds(440,530,100,30);
		fe.setBackground(Color.RED);
		add(fe);
		ButtonGroup ok = new ButtonGroup();
		ok.add(fe);
		ok.add(ga);
		
		
		
        
		
		 b= new JButton("Next");
		b.setBounds(750,650,60,30);
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		b.addActionListener(this);
		add(b);
		
		
		
		getContentPane().setBackground(Color.BLUE);
	 setSize(900,850);
     setLocation(350,10);
	 setVisible(true);
	 
	  
	}
	  public void actionPerformed(ActionEvent kashi) {
		String rels,cats,incs,occs,pans,a,e,se,exisa;
		rels = (String)reltext.getSelectedItem();
		cats = (String)cattext.getSelectedItem();
	    incs = (String)inctext.getSelectedItem();
	    occs = (String)occtext.getSelectedItem();
		e    = edutext.getText();
		pans = pantext.getText();
		a = atext.getText();
		 se=null;
		 if(ga.isSelected())
		 {
			se="yes"; 
		 }
		 else if(fe.isSelected())
		 {
			se = "no"; 
		 }
		 exisa=null;
		 if(y.isSelected())
		 {
			 exisa="yes";
		 }
		 else if(n.isSelected())
		 {
			 exisa = "no";
		 }
		
		 try
		 {
			if(e.equals("")||a.equals("")||pans.equals(""))
			{
				JOptionPane.showMessageDialog(null,"all is Required");
			}
			else
			{
				jdbms obj1 = new jdbms();
				String insid = "insert into singuptwo values('"+formno+"','"+rels+"','"+cats+"','"+incs+"','"+e+"','"+occs+"','"+exisa+"','"+pans+"','"+a+"','"+se+"')";
				obj1.s.executeUpdate(insid);
				if(kashi.getSource()==b)
				 {setVisible(false);
				 new Singuppage3(formno).setVisible(true);
				 }	
			}
			}catch(Exception anythink)
		 {
			 
		 }
		 
	  }
	  
	
       public static void main(String kashi[])
       {
    	   new Secondpage("");
       }

}