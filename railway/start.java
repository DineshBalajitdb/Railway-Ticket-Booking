import javax.swing.ImageIcon;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class start implements ActionListener
{
	static JFrame F=new JFrame("Railway ticket booking");
		
	static Choice c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;
	public static String from,to,date,date1,date2,classes,general,time,time1,train_name,person;
	static JCheckBox c;
	
	static JButton B1,B11;
	
	start()
	{

		JPanel p=new JPanel();
		p.setBackground(new Color(0,0,153));
		p.setSize(1360,100);
		
		
		ImageIcon image =new ImageIcon( );
		image =new ImageIcon("p3.png");
		ImageIcon image1 =new ImageIcon( );
		image1 =new ImageIcon("p1.png");
		F.setIconImage(image1.getImage( ));
		F.setContentPane(new JLabel(new ImageIcon(image.getImage())));
		
		JLabel l=new JLabel("Train Ticket Booking");
		
		l.setBounds(475,7,600,60);
		l.setFont(new Font("Algerian",Font.BOLD,35));
		l.setForeground(Color.WHITE);
		
				
		
	

		JLabel l1=new JLabel("Indian Railway Authorized e-ticketing");
		l1.setBounds(420,43,600,60);
		l1.setFont(new Font("Lucida Calligraphy",Font.PLAIN,25));
		l1.setForeground(Color.WHITE);
		
		JLabel label=new JLabel( );
		ImageIcon image2 =new ImageIcon("p2.png" );
		label.setIcon(image2);
		label.setBounds(290,0,700,110);
		label.setVisible(true);

		JLabel lAbel=new JLabel( );
		ImageIcon image3 =new ImageIcon("p2.png" );
		lAbel.setIcon(image3);
		lAbel.setBounds(950,0,290,110);
		lAbel.setVisible(true);




		p.add(l);
		p.add(l1);
		p.add(label);
		p.add(lAbel);
	
		p.setLayout(null);
		p.setVisible(true);

		JLabel r=new JLabel("BOOK TICKET");
		r.setBounds(570,120,600,60);
		r.setFont(new Font(null,Font.BOLD,30));
		r.setForeground(new Color(0,0,153));

		JLabel t1=new JLabel("From :");
		t1.setBounds(240,237,90,25);
		t1.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,25)); 
		t1.setForeground(Color.BLACK);

		c1=new Choice( );
		
		c1.add("	");
		c1.add("  Andhra pradesh");
		c1.add("  Assam ");
		c1.add("  Bengaluru"); 
		c1.add("  Chennai");
		c1.add("  Goa");
		c1.add("  Gujarat");
		c1.add("  Haryana");
		c1.add("  Himachal Pradesh");
		c1.add("  Jammu and Kashmir ");
		c1.add("  Karnataka");
		c1.add("  Katpadi");
		c1.add("  Kerala ");
		c1.add("  Kolkata");
		c1.add("  Madhya Pradesh");
		c1.add("  Maharashtra ");
		c1.add("  Mumbai");
		c1.add("  Odisha ");
		c1.add("  Punjab ");
		c1.add("  Rajasthan");
		c1.add("  Telangana");
		c1.add("  Thirupathi");
		c1.add("  Uttar Pradesh ");
		c1.add("  Vellore");
		c1.add("  West Bengal ");
		c1.setFocusable(false);
		c1.setFont(new Font("Arial Narrow",Font.PLAIN,20));
		c1.setBounds(370,235,250,45);

		
		JLabel t2=new JLabel("To  :");
		t2.setBounds(750,236,55,25);
		t2.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,25));
		t2.setForeground(Color.BLACK);

		
		JLabel t3=new JLabel("<=>");
		t3.setBounds(670,236,90,25);
		t3.setFont(new Font(null,Font.PLAIN,25));
		t3.setForeground(Color.BLACK);

		c2=new Choice( );
		
		c2.add("	");
		c2.add("  Andhra pradesh");
		c2.add("  Assam ");
		c2.add("  Bengaluru"); 
		c2.add("  Chennai");
		c2.add("  Goa");
		c2.add("  Gujarat");
		c2.add("  Haryana");
		c2.add("  Himachal Pradesh");
		c2.add("  Jammu and Kashmir ");
		c2.add("  Karnataka");
		c2.add("  Katpadi");
		c2.add("  Kerala ");
		c2.add("  Kolkata");
		c2.add("  Madhya Pradesh");
		c2.add("  Maharashtra ");
		c2.add("  Mumbai");
		c2.add("  Odisha ");
		c2.add("  Punjab ");
		c2.add("  Rajasthan");
		c2.add("  Telangana");
		c2.add("  Thirupathi");
		c2.add("  Uttar Pradesh ");
		c2.add("  Vellore");
		c2.add("  West Bengal ");
		c2.setFocusable(false);
		c2.setFont(new Font("Arial Narrow",Font.PLAIN,20));
		c2.setBounds(840,235,260,45);

		JLabel t4=new JLabel("Date :");
		t4.setBounds(240,310,90,25);
		t4.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,25));
		t4.setForeground(Color.BLACK);

		c4=new Choice();
			
		c4.add("	");
		c4.add(" 01");
		c4.add(" 02");
		c4.add(" 03");
		c4.add(" 04");
		c4.add(" 05");
		c4.add(" 06");
		c4.add(" 07");
		c4.add(" 08");
		c4.add(" 09");
		c4.add(" 10");
		c4.add(" 11");
		c4.add(" 12");
		c4.add(" 13");
		c4.add(" 14");
		c4.add(" 15");
		c4.add(" 16");
		c4.add(" 17");
		c4.add(" 18");
		c4.add(" 19");
		c4.add(" 20");
		c4.add(" 21");
		c4.add(" 22");
		c4.add(" 23");
		c4.add(" 24");
		c4.add(" 25");
		c4.add(" 26");
		c4.add(" 27");
		c4.add(" 28");
		c4.add(" 29");
		c4.add(" 30");
		c4.add(" 31");
		c4.setFont(new Font("Arial Narrow",Font.PLAIN,20));
		c4.setBounds(369,310,55,25);
		c4.setFocusable(false);

		c3=new Choice();
		
		c3.add("	");
		c3.add("January");
		c3.add("February");
		c3.add("March");
		c3.add("April");
		c3.add("May");
		c3.add("June");
		c3.add("July");
		c3.add("August");
		c3.add("September");
		c3.add("October");
		c3.add("November");
		c3.add("December");
		c3.setFont(new Font("Arial Narrow",Font.PLAIN,20));
		c3.setBounds(420,310,125,25);
		c3.setFocusable(false);
		
		
		c5=new Choice();
		
		c5.add("	");
		c5.add("2021");
		c5.add("2022");
		c5.setFont(new Font("Arial Narrow",Font.PLAIN,20));
		c5.setBounds(544,310,75,25);
		c5.setFocusable(false);

		JLabel t5=new JLabel("classes   :");
		t5.setBounds(670,310,150,25);
		t5.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,25));
		t5.setForeground(Color.BLACK);

		c6=new Choice();
		
		c6.add("	");
		c6.add("All Classes");
		c6.add("AC First Class");
		c6.add("First Class");
		c6.add("Sleeper");
		c6.add("Second Sitting");
		c6.setFocusable(false);
		c6.setFont(new Font("Arial Narrow",Font.PLAIN,20));
		c6.setBounds(840,313,260,45);

		JLabel t6=new JLabel("Time :");
		t6.setBounds(240,380,90,25);
		t6.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,25));	
		t6.setForeground(Color.BLACK);

		c7=new Choice();
	
		c7.add("	");
		c7.add("12:00");
		c7.add("1:00");
		c7.add("2:00");
		c7.add("3:00");
		c7.add("4:00");
		c7.add("5:00");
		c7.add("6:00");
		c7.add("7:00");
		c7.add("8:00");
		c7.add("9:00");
		c7.add("10:00");
		c7.add("11:00");
		c7.setFont(new Font("Arial Narrow",Font.PLAIN,20));
		c7.setBounds(370,380,100,25);
		c7.setFocusable(false);

		c8=new Choice();
	
		c8.add("	");
		c8.add("a.m");
		c8.add("p.m");
		c8.setFont(new Font("Arial Narrow",Font.PLAIN,20));
		c8.setBounds(469,380,150,25);
		c8.setFocusable(false);
			

		JLabel t7=new JLabel("General :");
		t7.setBounds(670,380,150,25);
		t7.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,25));
		t7.setForeground(Color.BLACK);
			
		c9=new Choice();
		
		c9.add("	");
		c9.add("GENERAL");
		c9.add("LADIES");
		c9.add("TATKAL");
		c9.add("PREMIUM TATKAL");
		c9.setFocusable(false);
		c9.setFont(new Font("Arial Narrow",Font.PLAIN,20));
		c9.setBounds(840,380,260,45);

		JLabel t8=new JLabel("Train Name :");
		t8.setBounds(240,465,180,25);
		t8.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,25));
		t8.setForeground(Color.BLACK);
		
		c10=new Choice();
		
		c10.add("	");
		c10.add("Indian Express");
		c10.add("Passenger Train");
		c10.add("Local Train");
		c10.setFocusable(false);
		c10.setFont(new Font("Arial Narrow",Font.PLAIN,20));
		c10.setBounds(430,464,188,45);

		c = new JCheckBox("I paided money for tickets");
		c.setBounds(700,540,300,20);
		c.setForeground(Color.BLACK);
		c.setFocusable(false);
		c.setToolTipText("Conform if you paid your ticket money ");
		c.setFont(new Font("Arial Narrow",Font.BOLD,20));
		c.setForeground(Color.BLACK);	
		c.setEnabled(false);

	B11=new JButton("INTERNET BANKING");
	B11.setBounds(450,535,200,30);
	B11.setFocusable(false);
	B11.setFont(new Font("Bahnschrift SemiLigh",Font.BOLD,17));
	B11.setBackground(new Color(255,0,0));
	B11.setForeground(Color.WHITE);
	B11.setToolTipText("Click before fill all details"); 
	B11.addActionListener(this);  

	

		JLabel t9=new JLabel("Persons :");
		t9.setBounds(670,464,150,25);
		t9.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,25));
		t9.setForeground(Color.BLACK);


		c11=new Choice();
		c11.add("	");
		c11.add(" 01");
		c11.add(" 02");
		c11.add(" 03");
		c11.add(" 04");
		c11.add(" 05");
		c11.add(" 06");
		c11.add(" 07");
		c11.add(" 08");
		c11.add(" 09");
		c11.add(" 10");
		c11.setFocusable(false);
		c11.setFont(new Font("Arial Narrow",Font.PLAIN,20));
		c11.setBounds(840,464,260,45);

		
	B1=new JButton("GET YOUR TICKET");
	B1.setBounds(525,600,300,50);
	B1.setFocusable(false);
	B1.setFont(new Font("Bahnschrift SemiLigh",Font.BOLD,25));
	B1.setBackground(new Color(0,0,153));
	B1.setForeground(Color.WHITE);
	B1.setEnabled(false);
	B1.setToolTipText("Click before fill all details");  
		
		
		F.add(p);
		F.add(r);F.add(c11);F.add(B11);
		F.add(t1);F.add(t2);F.add(t3);F.add(t4);F.add(t5);F.add(t6);F.add(t7);F.add(t8);F.add(t9);
		F.add(c1);F.add(c2);F.add(c3);F.add(c4);F.add(c5);F.add(c6);F.add(c7);F.add(c8);F.add(c9);F.add(c10);
		F.add(B1);
		B1.addActionListener(this);
		c.addActionListener(this);
		
		F.add(c);		
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setBackground(Color.WHITE);
		F.setSize(1360,760);
		F.setLayout(null);
		F.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent a)
	{
		
		String st=a.getActionCommand();
	
		if(c1.getSelectedItem().equals(c2.getSelectedItem())||
		c1.getSelectedItem().equals("	")||
		c2.getSelectedItem().equals("	")||
		c3.getSelectedItem().equals("	")||
		c4.getSelectedItem().equals("	")||
		c5.getSelectedItem().equals("	")||
		c6.getSelectedItem().equals("	")||
		c7.getSelectedItem().equals("	")||
		c8.getSelectedItem().equals("	")||
		c9.getSelectedItem().equals("	")||
		c10.getSelectedItem().equals("	")||
		c11.getSelectedItem().equals("	"))
		
{
	JOptionPane.showMessageDialog(B11,"OOPS! You are selected same Location place   (or)   full add requesting data		");

}
		else if(st.equals("INTERNET BANKING"))
			{
				money m=new money();
				
			int num=c11.getSelectedIndex();

			int res=num*100;
			money.r6.setText(String.valueOf(res)+"/-");

			c.setEnabled(true);
			
			
			}



	else{

		if(st.equals("I paided money for tickets"))
		{
		B1.setEnabled(true);
		B11.setEnabled(false);
		

		B1.setToolTipText("GET YOUR TICKET");  

		
		}
	}
		
			if(st.equals("GET YOUR TICKET"))
			{
				
				ticket ticket=new ticket();
				ticket.a1.setText(start.c1.getSelectedItem().trim());
				ticket.a2.setText(start.c2.getSelectedItem().trim());
				ticket.a3.setText(start.c4.getSelectedItem().trim());
				ticket.a31.setText(start.c3.getSelectedItem().trim());
				ticket.a32.setText(start.c5.getSelectedItem().trim());
				ticket.a4.setText(start.c6.getSelectedItem().trim());
				ticket.a5.setText(start.c7.getSelectedItem().trim());
				ticket.a51.setText(start.c8.getSelectedItem().trim());
				ticket.a6.setText(start.c9.getSelectedItem().trim());
				ticket.a7.setText(start.c11.getSelectedItem().trim());
				ticket.a9.setText(start.c10.getSelectedItem().trim());
				
			}
			
			
		if(st.equals("PROCESS FINISHED"))
			{	
			F.dispose();
			}


}
	public static void main(String S[])
	{		
		start st=new start();
	}
}
