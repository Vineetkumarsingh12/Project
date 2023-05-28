package travelingManagmentSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
	String user;
	JButton profile,viewProfile,editProfile,checkPackage,bookPackage,yourPackage,viewHotel,bookHotel,yourHotel,destination,payment,calculator,notepad,about,deleteProfile;
	Dashboard(String user)
	{ this.user=user;
//		setBounds(0,0,1600,1000);
		// for full screen
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0,0,102));
		p1.setBounds(0,0,1600,83);
		add(p1);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
	    Image i2=i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
	    ImageIcon i3=new ImageIcon(i2);
	    JLabel icon=new JLabel(i3);
	    icon.setBounds(5,0,70,70);
	    p1.add(icon);
	    
	    JLabel heading=new JLabel("Dashboard");
	    heading.setBounds(80,10,300,40);
	    heading.setForeground(Color.WHITE);
	    heading.setFont(new Font("Tahoma",Font.BOLD,30));
	    p1.add(heading);
	    
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,102));
		p2.setBounds(0,85,300,900);
		add(p2);
		
		profile=new JButton("Add Personal Details");
	    profile.setBackground(new Color(0,0,102));
		profile.setForeground(Color.WHITE);
		profile.setFont(new Font("Tahoma",Font.PLAIN,20));
		profile.setMargin(new Insets(0,0,0,60));
		//(top,left,bottom,right);
		profile.setBounds(0,0,300,50);
		profile.addActionListener(this);
		p2.add(profile);
		
		 editProfile=new JButton("Update Personal Details");
		editProfile.setBackground(new Color(0,0,102));
		editProfile.setForeground(Color.WHITE);
		editProfile.setFont(new Font("Tahoma",Font.PLAIN,20));
		editProfile.setMargin(new Insets(0,0,0,30));
		//(top,left,bottom,right);
		editProfile.addActionListener(this);
		editProfile.setBounds(0,50,300,50);
		p2.add(editProfile);
		
		viewProfile=new JButton("View Personal Details");
		viewProfile.setBackground(new Color(0,0,102));
		viewProfile.setForeground(Color.WHITE);
		viewProfile.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewProfile.setMargin(new Insets(0,0,0,45));
		//(top,left,bottom,right);
		viewProfile.setBounds(0,100,300,50);
		viewProfile.addActionListener(this);
		p2.add(viewProfile);
		
		 deleteProfile=new JButton("Delete Personal Details");
		deleteProfile.setBackground(new Color(0,0,102));
		deleteProfile.setForeground(Color.WHITE);
		deleteProfile.setFont(new Font("Tahoma",Font.PLAIN,20));
		deleteProfile.setMargin(new Insets(0,0,0,30));
		//(top,left,bottom,right);
		deleteProfile.setBounds(0,150,300,50);
		p2.add(deleteProfile);
		
		 checkPackage=new JButton("Check Package");
		checkPackage.setBackground(new Color(0,0,102));
		checkPackage.setForeground(Color.WHITE);
		checkPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
		checkPackage.setMargin(new Insets(0,0,0,100));
		//(top,left,bottom,right);
		checkPackage.setBounds(0,200,300,50);
		checkPackage.addActionListener(this);
		p2.add(checkPackage);
		
		 bookPackage=new JButton("Book Package");
		bookPackage.setBackground(new Color(0,0,102));
		bookPackage.setForeground(Color.WHITE);
		bookPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
		bookPackage.setMargin(new Insets(0,0,0,110));
		//(top,left,bottom,right);
		bookPackage.setBounds(0,250,300,50);
		bookPackage.addActionListener(this);
		p2.add(bookPackage);
		
		yourPackage=new JButton("Your Package");
		yourPackage.setBackground(new Color(0,0,102));
		yourPackage.setForeground(Color.WHITE);
		yourPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
		yourPackage.setMargin(new Insets(0,0,0,120));
		//(top,left,bottom,right);
		yourPackage.addActionListener(this);
		yourPackage.setBounds(0,300,300,50);
		p2.add(yourPackage);
		
		 viewHotel=new JButton("View Hotel");
		viewHotel.setBackground(new Color(0,0,102));
		viewHotel.setForeground(Color.WHITE);
		viewHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
		viewHotel.setMargin(new Insets(0,0,0,135));
		//(top,left,bottom,right);
		viewHotel.setBounds(0,350,300,50);
		viewHotel.addActionListener(this);
		p2.add(viewHotel);
		
		 bookHotel=new JButton("Book Hotel");
		bookHotel.setBackground(new Color(0,0,102));
		bookHotel.setForeground(Color.WHITE);
		bookHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
		bookHotel.setMargin(new Insets(0,0,0,135));
		//(top,left,bottom,right);
		bookHotel.setBounds(0,400 ,300,50);
		bookHotel.addActionListener(this);
		p2.add(bookHotel);
		
		 yourHotel=new JButton("Your Hotel");
		 yourHotel.setBackground(new Color(0,0,102));
		 yourHotel.setForeground(Color.WHITE);
		 yourHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
		 yourHotel.setMargin(new Insets(0,0,0,135));
		//(top,left,bottom,right);
		 yourHotel.setBounds(0,450 ,300,50);
		 yourHotel.addActionListener(this);
		p2.add(yourHotel);
		
		 destination=new JButton("Destination");
		destination.setBackground(new Color(0,0,102));
		destination.setForeground(Color.WHITE);
		destination.setFont(new Font("Tahoma",Font.PLAIN,20));
		destination.setMargin(new Insets(0,0,0,135));
		//(top,left,bottom,right);
		destination.setBounds(0,500 ,300,50);
		destination.addActionListener(this);
		p2.add(destination);
		
		 payment=new JButton("Payment");
		payment.setBackground(new Color(0,0,102));
		payment.setForeground(Color.WHITE);
		payment.setFont(new Font("Tahoma",Font.PLAIN,20));
		payment.setMargin(new Insets(0,0,0,160));
		//(top,left,bottom,right);
		payment.setBounds(0,550 ,300,50);
		payment.addActionListener(this);
		p2.add(payment);
		
		 calculator=new JButton("Calculator");
		calculator.setBackground(new Color(0,0,102));
		calculator.setForeground(Color.WHITE);
		calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
		calculator.setMargin(new Insets(0,0,0,145));
		//(top,left,bottom,right);
		calculator.setBounds(0,600,300,50);
		calculator.addActionListener(this);
		p2.add(calculator);
		
	    notepad=new JButton("Notepad");
		notepad.setBackground(new Color(0,0,102));
		notepad.setForeground(Color.WHITE);
		notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
		notepad.setMargin(new Insets(0,0,0,150));
		//(top,left,bottom,right);
		notepad.setBounds(0,650,300,50);
		notepad.addActionListener(this);
		p2.add(notepad);
		
		 about=new JButton("About");
		about.setBackground(new Color(0,0,102));
		about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
		about.setMargin(new Insets(0,0,0,180));
		//(top,left,bottom,right);
		about.setBounds(0,700,300,50);
		about.addActionListener(this);
		p2.add(about);
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.jpg"));
		Image i5=i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel image=new JLabel(i6);
		image.setBounds(0,0,1650,1000);
		add(image);
		
		JLabel text=new JLabel("Explore Tourism ");
		text.setBounds(600,0,500,60);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Railway",Font.PLAIN,55));
		p1.add(text);
		
	    		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==profile) {
			new AddCustomer(user);
		}else if(ae.getSource()==viewProfile)
		{
			  new viewCustomer(user);
		}else if(ae.getSource()==editProfile)
		{
			new updateCustomInfo(user);
		}
		else if(ae.getSource()==checkPackage)
		{
			new availablePackage();
		}
		else if(ae.getSource()==bookPackage)
		{
			new bookPackage(user);
		}
		else if(ae.getSource()==yourPackage)
		{
			 new viewYourPackage(user);
		}
		else if(ae.getSource()==viewHotel)
		{
			 new hotel();
		}
		else if(ae.getSource()==bookHotel)
		{
			new bookHotel(user);
		}
		else if(ae.getSource()==yourHotel)
		{
			new yourHotel(user);
		}
		else if(ae.getSource()==destination)
		{
			new destination();
		}
		else if(ae.getSource()==payment)
		{
		 new payment();
		}
		else if(ae.getSource()==calculator)
		{
	try {
		Runtime.getRuntime().exec("calc.exe");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		}
		else if(ae.getSource()==notepad)
		{
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==about)
		{
			new about();
		}
		else if(ae.getSource()==deleteProfile)
		{
			new deleteDetails(user);
		}

		
		
	}
public static void main(String[] args)
{
	new Dashboard("v");
}
}

