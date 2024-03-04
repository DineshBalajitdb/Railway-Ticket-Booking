import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

public class ticket implements ActionListener
{

	JFrame F=new JFrame("Indian Bank");
	JButton B1,B2;
	static JLabel a1,a2,a3,a31,a32,a4,a5,a51,a6,a7,a8,a9;
		

ticket()
{

	
		JPanel p=new JPanel();
		p.setBackground(new Color(0,0,153));
		p.setSize(1360,100);
		ImageIcon image =new ImageIcon( );
		image =new ImageIcon("b2.png");
		F.setContentPane(new JLabel(new ImageIcon(image.getImage())));
		F.setVisible(true);
		JLabel l=new JLabel("Train Ticket Booking");
		l.setBounds(75,7,600,60);
		l.setFont(new Font("Algerian",Font.BOLD,23));
		l.setForeground(Color.WHITE);
		

		JLabel l1=new JLabel("Indian Railway Authorized e-ticketing");
		l1.setBounds(40,43,600,60);
		l1.setFont(new Font("Lucida Calligraphy",Font.PLAIN,17));
		l1.setForeground(Color.WHITE);

		p.add(l);
		p.add(l1);
		p.setLayout(null);
		p.setVisible(true);


		JLabel r=new JLabel("YOUR TICKET");
		r.setBounds(150,90,600,60);
		r.setFont(new Font(null,Font.BOLD,20));
		r.setForeground(new Color(0,0,153));

		
		JLabel r1=new JLabel("From         :");
		r1.setBounds(50,120,150,60);
		r1.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,20));
		r1.setForeground(Color.GRAY);


		
		JLabel r2=new JLabel("To                :");
		r2.setBounds(50,150,150,60);
		r2.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,20));
		r2.setForeground(Color.GRAY);

		JLabel r3=new JLabel("Date          :");
		r3.setBounds(50,180,150,60);
		r3.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,20));
		r3.setForeground(Color.GRAY);

		JLabel r4=new JLabel("Classes   :");
		r4.setBounds(50,210,150,60);
		r4.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,20));
		r4.setForeground(Color.GRAY);

		JLabel r5=new JLabel("Time           :");
		r5.setBounds(50,240,150,60);
		r5.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,20));
		r5.setForeground(Color.GRAY);

		JLabel r6=new JLabel("General  :");
		r6.setBounds(50,270,150,60);
		r6.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,20));
		r6.setForeground(Color.GRAY);

		
		JLabel r7=new JLabel("Persons  :");
		r7.setBounds(50,300,150,60);
		r7.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,20));
		r7.setForeground(Color.GRAY);


		
		JLabel r8=new JLabel("Platfrom number   :");
		r8.setBounds(50,330,230,60);
		r8.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,20));
		r8.setForeground(Color.GRAY);


		JLabel r9=new JLabel("Train name   :");
		r9.setBounds(50,360,170,60);
		r9.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,20));
		r9.setForeground(Color.GRAY);


		a1=new JLabel("");
		a1.setBounds(180,120,250,60);
		a1.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a1.setForeground(Color.RED);


		
		a2=new JLabel("");
		a2.setBounds(180,150,250,60);
		a2.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a2.setForeground(Color.RED);

		a3=new JLabel("");
		a3.setBounds(180,180,100,60);
		a3.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a3.setForeground(Color.RED);

		a31=new JLabel("");
		a31.setBounds(210,180,150,60);
		a31.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a31.setForeground(Color.RED);

		a32=new JLabel("");
		a32.setBounds(340,180,150,60);
		a32.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a32.setForeground(Color.RED);


		a4=new JLabel("");
		a4.setBounds(180,210,210,60);
		a4.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a4.setForeground(Color.RED);

		a5=new JLabel("");
		a5.setBounds(180,240,100,60);
		a5.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a5.setForeground(Color.RED);

		a51=new JLabel("");
		a51.setBounds(245,240,210,60);
		a51.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a51.setForeground(Color.RED);

		a6=new JLabel("");
		a6.setBounds(180,270,210,60);
		a6.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a6.setForeground(Color.RED);

		
		a7=new JLabel("");
		a7.setBounds(180,300,210,60);
		a7.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a7.setForeground(Color.RED);

		
		a8=new JLabel("1");
		a8.setBounds(290,330,230,60);
		a8.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a8.setForeground(Color.RED);

		a9=new JLabel("");
		a9.setBounds(210,360,230,60);
		a9.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a9.setForeground(Color.RED);




			
	B1=new JButton("SAVE");
	B1.setBounds(90,420,100,30);
	B1.setFocusable(false);
	B1.setFont(new Font("Bahnschrift SemiLigh",Font.BOLD,17));
	B1.setBackground(new Color(45,95,20));
	B1.setForeground(Color.WHITE);
	B1.setToolTipText("save your ticket "); 

		
	B2=new JButton("PRINT");
	B2.setBounds(220,420,100,30);
	B2.setFocusable(false);
	B2.setFont(new Font("Bahnschrift SemiLigh",Font.BOLD,17));
	B2.setBackground(new Color(255,0,0));
	B2.setForeground(Color.WHITE);
	B2.setToolTipText("Print your ticket ");   

	F.add(p);
	F.add(r);F.add(r1);F.add(r2);F.add(r3);F.add(r4);F.add(r5);F.add(r6);
	F.add(r7);F.add(r8);F.add(B1);F.add(B2);F.add(r9);
	F.add(a1);F.add(a2);F.add(a3);F.add(a31);F.add(a32);F.add(a4);F.add(a5);F.add(a51);F.add(a6);
	F.add(a7);F.add(a8);F.add(a9);
	B1.addActionListener(this);
	B2.addActionListener(this);
	F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	F.setSize(450,520);
	F.setLayout(null);
	F.setVisible(true);
	F.setLocation(450,100);
	
	
}	

	public void actionPerformed(ActionEvent a)
	{
	String st=a.getActionCommand();
		
	
			if(st.equals("SAVE"))
			{
			
		JOptionPane.showMessageDialog(B1,"SUCCESSFULLY SAVE!!! ENJOY YOUR JOURNEY");		
		F.dispose();
			start.B1.setText("PROCESS FINISHED");
			start.B11.setEnabled(false);
			start.c.setEnabled(false);	
}
		if(st.equals("PRINT"))
			{
			
		JOptionPane.showMessageDialog(B2,"SUCCESSFULLY PRINTED!!! ENJOY YOUR JOURNEY");		
		F.dispose();	
			start.B1.setText("PROCESS FINISHED");
			start.B11.setEnabled(false);
			start.c.setEnabled(false);
	}	


	}
	public static void main(String S[])
 	{		
		ticket login=new ticket();
	}
}