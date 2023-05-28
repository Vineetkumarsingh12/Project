package travelingManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class viewYourPackage extends JFrame implements ActionListener{
    
	   JButton back;	
		
		
	   viewYourPackage(String username){
		   setBounds(450,200,870,625);
		   getContentPane().setBackground(Color.white);
		   setLayout(null);
		   
		   ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/view1.jpg"));
			Image i2=i1.getImage().getScaledInstance(870,625, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			
			JLabel image=new JLabel(i3);
			image.setBounds(0,0,870,625);
			add(image);
			
			JLabel heading=new JLabel("View Your Package");
			heading.setBounds(350,10,250,35);
			heading.setForeground(Color.RED);
			heading.setFont(new Font("Raleway",Font.BOLD,25));
			   image.add( heading);
		   
		   JLabel lusername=new JLabel("Username:");
		   lusername.setBounds(30,50,150,25);
//		   lusername.setForeground(Color.WHITE);
		   lusername.setFont(new Font("Raleway",Font.BOLD,17));
		   image.add( lusername);
		   
		   JLabel fusername=new JLabel();
		   fusername.setBounds(220,50,150,25);
		   fusername.setForeground(Color.BLUE);
		   fusername.setFont(new Font("Raleway",Font.BOLD,17));
		   image.add(fusername);
		   
		   JLabel lid=new JLabel("ID:");
		   lid.setBounds(30,110,150,25);
		   lid.setFont(new Font("Raleway",Font.BOLD,17));
		   image.add(lid);
		   
		   JLabel fid=new JLabel();
		   fid.setBounds(220,110,150,25);
		   fid.setForeground(Color.BLUE);
		   fid.setFont(new Font("Raleway",Font.BOLD,17));
		   image.add(fid); 
		   
		   JLabel lpack=new JLabel("Package :");
		   lpack.setBounds(30,170,150,25);
		   lpack.setFont(new Font("Raleway",Font.BOLD,17));
		   image.add(lpack);
		   
		   JLabel fpack=new JLabel();
		   fpack.setBounds(220,170,150,25);
		   fpack.setFont(new Font("Raleway",Font.BOLD,17));
		   fpack.setForeground(Color.BLUE);
		   image.add(fpack); 
		   
		   JLabel lemail=new JLabel("Email :");
		   lemail.setBounds(30,230,150,25);
//		   fidN.setForeground(Color.white);
		   lemail.setFont(new Font("Raleway",Font.BOLD,17));
		   image.add(lemail);
		   
		   JLabel femail=new JLabel();
		   femail.setBounds(200,230,300,25);
		   femail.setFont(new Font("Raleway",Font.BOLD,17));
		   femail.setForeground(Color.BLUE);
		   image.add(femail);
		   
		   JLabel lTotalPerson=new JLabel("Total Person :");
		   lTotalPerson.setBounds(500,50,150,25);
//		   lcountry.setForeground(Color.white);
		   lTotalPerson.setFont(new Font("Raleway",Font.BOLD,17));
		   image.add(lTotalPerson);
		   
		   JLabel fTotalPerson=new JLabel();
		   fTotalPerson.setBounds(690,50,150,25);
		   fTotalPerson.setForeground(Color.BLUE);
		   fTotalPerson.setFont(new Font("Raleway",Font.BOLD,17));
		   image.add(fTotalPerson);
		   
		   JLabel lTotalPrice=new JLabel("Total Price");
		   lTotalPrice.setBounds(500,110,150,25);
		   lTotalPrice.setFont(new Font("Raleway",Font.BOLD,17));
		   image.add(lTotalPrice);
		   
		   JLabel fTotalPrice=new JLabel();
		   fTotalPrice.setBounds(690,110,150,25);
		   fTotalPrice.setForeground(Color.BLUE);
		   fTotalPrice.setFont(new Font("Raleway",Font.BOLD,17));
		   image.add(fTotalPrice);
		  
		   
		   back=new JButton("Back");
		   back.setBackground(Color.BLACK);
		   back.setForeground(Color.WHITE);
		   back.setBounds(350,350,100,25);
		   back.addActionListener(this);
		   image.add(back);
		   
			try {
				
		    	 Connect c=new Connect();
					String query="select * from bookings where username='"+"v"+"'";
					ResultSet resultSet=c.s.executeQuery(query);
					if(resultSet.next())
					{
						fusername.setText(resultSet.getString("username"));
						femail.setText(resultSet.getString("email"));
						fid.setText(resultSet.getString("id"));
						fTotalPerson.setText(resultSet.getString("totalPerson"));
//						
						fpack.setText(resultSet.getString("booked"));
						fTotalPrice.setText(resultSet.getString("totalPrice"));

//						

					}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		   
		   setVisible(true);
		   
	   }
	   
	   public void actionPerformed(ActionEvent ae)
	   {
		   if(ae.getSource()==back) {
			   setVisible(false);
				
			}
	   }
	   public static void main(String args []) {
		   new viewYourPackage("");
	   }
	}

