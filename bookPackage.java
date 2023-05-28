package travelingManagmentSystem;


import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class bookPackage extends JFrame implements ActionListener {
  Choice packs;
  JTextField nPersons;
  JLabel  fid,femail, fusername,fTotal;
	String user,pack;
JButton checkPrice,bookPack,back;
int person,cost=0;
	bookPackage(String  user){
		this.user=user;
		setBounds(350,200,1110,500);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel heading=new JLabel("BOOK PACKAGE");
		heading.setBounds(450,10,200,30);
		heading.setForeground(Color.BLUE);
		heading.setFont(new Font("Tahoma",Font.BOLD,20));
		add(heading);
		
		
		
		JLabel lusername=new JLabel("Username:");
		   lusername.setBounds(40,70,100,20);
		   lusername.setFont(new Font("Raleway",Font.BOLD,17));
		   add( lusername);
		   
		    fusername=new JLabel();
		   fusername.setBounds(250,70,100,20);
		   fusername.setForeground(Color.RED);
		   fusername.setFont(new Font("Raleway",Font.BOLD,17));
		   add(fusername);
		   
		   JLabel Package=new JLabel("Select Package");
		   Package.setBounds(40,110,200,20);
		   Package.setFont(new Font("Raleway",Font.BOLD,17));
		   add(Package);
		   
		   packs=new Choice();
		   packs.add("GOLD");
		   packs.add("SILVER");
		   packs.add("BRONZE");
		   packs.setBounds(250,110,100,20);
		   add(packs);
		   
		   JLabel person=new JLabel("Total Persons");
		   person.setBounds(40,150,150,20);
		   person.setFont(new Font("Raleway",Font.BOLD,17));
		   add(person);
		   
		   
		   nPersons=new JTextField("1");
		   nPersons.setBounds(250,150,80,25);
		   add(nPersons);
		   
		   JLabel id=new JLabel("Id");
		   id.setBounds(40,190,150,25);
		   id.setFont(new Font("Raleway",Font.BOLD,17));
		   add(id); 
		   
		    fid =new JLabel();
		   fid.setBounds(250,190,150,25);
		   fid.setForeground(Color.RED);
		   fid.setFont(new Font("Raleway",Font.BOLD,17));
		   add(fid);
		   
		   
		   JLabel lemail=new JLabel("Email");
		   lemail.setBounds(40,230,150,25);
		   lemail.setFont(new Font("Raleway",Font.BOLD,17));
		   add(lemail);
		   
		   femail=new JLabel();
		   femail.setBounds(180,230,300,25);
		   femail.setFont(new Font("Raleway",Font.BOLD,17));
		   femail.setForeground(Color.RED);
           add(femail);
		   
		   JLabel lTotal=new JLabel("Total Price");
		   lTotal.setBounds(40,265,150,25);
//		   lcountry.setForeground(Color.white);
		   lTotal.setFont(new Font("Raleway",Font.BOLD,17));
		   add(lTotal);
		   
		    fTotal=new JLabel();
		   fTotal.setBounds(250,265,100,25);
		   fTotal.setFont(new Font("Raleway",Font.BOLD,17));
		   add(fTotal);
		   
		   
			try {
				
		    	 Connect c=new Connect();
					String query="select * from customer where username='"+"v"+"'";
					ResultSet resultSet=c.s.executeQuery(query);
					if(resultSet.next())
					{
						fusername.setText(resultSet.getString("username"));
						femail.setText(resultSet.getString("email"));
						fid.setText(resultSet.getString("id"));
//						
						

					}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			
			}
		   
			checkPrice=new JButton("Check Price");
			checkPrice.setBounds(40,350,130,30);
			checkPrice.setBackground(Color.BLACK);
			checkPrice.setForeground(Color.WHITE);// text color inside the button
			checkPrice.addActionListener(this);
			 add(checkPrice);
			 
			 bookPack=new JButton("BooK Now");
			 bookPack.setBounds(200,350,130,30);
			 bookPack.setBackground(Color.BLACK);
			 bookPack.setForeground(Color.WHITE);// text color inside the button
				bookPack.addActionListener(this);
				 add(bookPack);
				 
				 back=new JButton("Back");
				 back.setBounds(350,350,130,30);
				 back.setBackground(Color.BLACK);
				 back.setForeground(Color.WHITE);// text color inside the button
					back.addActionListener(this);
					 add(back);
					 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/gold1.jpg"));
						Image i2=i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
						ImageIcon i3=new ImageIcon(i2);
						JLabel image=new JLabel(i3);
						image.setBounds(490,240,200,200);//
						add(image);
						
						
						 ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/gold2.jpg"));
							Image i5=i4.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
							ImageIcon i6=new ImageIcon(i5);
							JLabel image1=new JLabel(i6);
							image1.setBounds(590,40,200,200);//
							add(image1);
							
							 ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icons/gold3.jpg"));
								Image i8=i7.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
								ImageIcon i9=new ImageIcon(i8);
								JLabel image2=new JLabel(i9);
								image2.setBounds(790,40,200,200);
								add(image2);
								
								ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("icons/gold5.jpg"));
								Image i11=i10.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
								ImageIcon i12=new ImageIcon(i11);
								JLabel image3=new JLabel(i12);
								image3.setBounds(690,240,200,200);
								add(image3);
								
								ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("icons/gold4.jpg"));
								Image i14=i13.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
								ImageIcon i15=new ImageIcon(i14);
								JLabel image4=new JLabel(i15);
								image4.setBounds(890,240,200,200);
								add(image4);

			
		   setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==checkPrice)
		{
		 pack=packs.getSelectedItem();
		cost=0;
			
			if(pack.equals("GOLD")) {
				cost+=12000;
			}else if(pack.equals("SILVER")) {
				cost+=18000;
			}else {
				cost+=25000;
			}
			 person=Integer.parseInt(nPersons.getText());
			cost*=person;
			fTotal.setText("Rs "+cost);

			
			
			
		}
		else if(ae.getSource()==bookPack) {
			try {
				String u=fusername.getText();
				String e=femail.getText();
				String id=fid.getText();
				String query="insert into bookings values('"+u+"','"+e+"','"+id+"','"+pack+"','"+person+"','"+cost+"')";

		    	Connect c=new Connect();
		    	c.s.executeUpdate(query);
		    	 
		    	JOptionPane.showMessageDialog(null,"Booked Successfully" );

			    	setVisible(false);
		        if (c.s != null) {
		            c.s.close();
		        }	
		    }
		    catch(Exception E)
		    {
//		    	JOptionPane.showMessageDialog(null,"Account Already exist" );

		    	E.printStackTrace();
		    	JOptionPane.showMessageDialog(null,"Already Exits Booking" );

		    	
		    }
		}
		else
		{
			setVisible(false);
		}
	}
	
	public static void main(String args[])
	{
		new bookPackage("v");
		
	}
}

