import javax.swing.ImageIcon;
import java.lang.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

public class money implements ActionListener
{

	JFrame F=new JFrame("Indian Bank");
	static JTextField a1,a2,a3,a4;
	static JLabel r6;
	JButton B1;

money()
{

	
		JPanel p=new JPanel();
		p.setBackground(new Color(0,0,153));
		p.setSize(1360,100);
		JLabel l=new JLabel("Ticket money pay");
		l.setBounds(115,7,600,60);
		l.setFont(new Font("Algerian",Font.BOLD,23));
		l.setForeground(Color.WHITE);
		

		JLabel l1=new JLabel("Indian Railway Authorized e-ticketing");
		l1.setBounds(50,43,600,60);
		l1.setFont(new Font("Lucida Calligraphy",Font.PLAIN,17));
		l1.setForeground(Color.WHITE);
		
		
		ImageIcon image =new ImageIcon( );
		image =new ImageIcon("b1.png");
		F.setContentPane(new JLabel(new ImageIcon(image.getImage())));
		F.setVisible(true);
		
		p.add(l);
		p.add(l1);
		p.setLayout(null);
		p.setVisible(true);


		JLabel r=new JLabel("BANKING DETAILS");
		
		r.setBounds(150,90,600,60);
		r.setFont(new Font(null,Font.BOLD,20));
		r.setForeground(new Color(1,0,160));

		
		JLabel r1=new JLabel("Card Number        ");
		r1.setBounds(30,140,190,60);
		r1.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,16));
		r1.setForeground(Color.BLACK);
		

		JLabel r2=new JLabel("Valid thru/Expiry Date");
		r2.setBounds(30,190,220,60);
		r2.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,16));
		r2.setForeground(Color.BLACK);
		

		JLabel r21=new JLabel("mm/yy");
		r21.setBounds(310,228,160,30);
		r21.setFont(new Font(null,Font.BOLD,16));
		r21.setForeground(Color.BLACK);
		
		JLabel r3=new JLabel("Card Holders Name");
		r3.setBounds(30,240,190,60);
		r3.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,16));
		r3.setForeground(Color.BLACK);



		JLabel r4=new JLabel("Enter Catcha ");
		r4.setBounds(30,290,190,60);
		r4.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,16));
		r4.setForeground(Color.BLACK);

		JLabel r5=new JLabel("Price ");
		r5.setBounds(250,350,190,60);
		r5.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,20));
		r5.setForeground(Color.BLACK);

		
		r6=new JLabel("");
		r6.setBounds(320,350,190,60);
		r6.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,20));
		r6.setForeground(Color.BLACK);

		JTextField r51=new JTextField("   54054");
		r51.setBounds(70,350,100,35);
		r51.setFont(new Font("Jokerman",Font.PLAIN,20));
		r51.setForeground(Color.BLACK);
		r51.setEditable(false);
		r51.setBackground(new Color(200,200,200));


		a1=new JTextField("");
		a1.setBounds(170,157,240,30);
		a1.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a1.setForeground(Color.BLACK);

		a2=new JTextField("");
		a2.setBounds(250,206,160,30);
		a2.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a2.setForeground(Color.BLACK);

		a3=new JTextField("");
		a3.setBounds(220,257,190,30);
		a3.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a3.setForeground(Color.BLACK);

		a4=new JTextField();
		a4.setBounds(190,310,220,30);
		a4.setFont(new Font("Copperplate Gothic Bold",Font.PLAIN,20));
		a4.setForeground(Color.BLACK);

			
	B1=new JButton("PROCEED");
	B1.setBounds(240,410,120,30);
	B1.setFocusable(false);
	B1.setFont(new Font("Bahnschrift SemiLigh",Font.BOLD,17));
	B1.setBackground(new Color(255,0,0));
	B1.setForeground(Color.WHITE);
	B1.setToolTipText("Click before fill all details"); 
	B1.addActionListener(this);  


	F.add(p);F.add(B1);
	F.add(r);F.add(r1);F.add(r2);F.add(r21);F.add(r3);F.add(r4);F.add(r5);F.add(r51);F.add(r6);
	F.add(a1);F.add(a2);F.add(a3);F.add(a4);
	F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	F.setSize(450,520);
	F.setLayout(null);
	F.setVisible(true);
	F.setLocation(450,100);
	
	
}	

	public void actionPerformed(ActionEvent a)
	{
	String st=a.getActionCommand();


		 if(a4.getText().trim().equals("54054")&&
			!a1.getText().trim().equals("")&&
			!a2.getText().trim().equals("")&&
			!a3.getText().trim().equals(""))
			{
			      
				JOptionPane.showMessageDialog(B1," MONEY RECEIVED	");
			F.dispose();
			} 
		else 
		{
			JOptionPane.showMessageDialog(B1,"Check your details correct and Enter Valid Catcha ");
		}
	}
	public static void main(String S[])
 	{		
		money m=new money();
	}
}