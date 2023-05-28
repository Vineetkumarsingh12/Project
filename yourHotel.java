package travelingManagmentSystem;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class yourHotel extends JFrame implements ActionListener {

  
  JLabel  fid,femail, fusername,fTotal,cHotel,nPersons,fType,fDay;
	String user,hotel,Type;
JButton back;
int person,cost=0,nDay;
     yourHotel(String  user){
		this.user=user;
		setBounds(350,200,1110,500);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel heading=new JLabel("BOOK HOTEL");
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
		   
		   
//		   {"ABC","BCD","CDE","DEF","EFG","FGH","GHI","HIJ","IJK","JKL","KLM","LMN"};
			
		   JLabel sHotel=new JLabel("Select HOTEL");
		   sHotel.setBounds(40,110,200,20);
		   sHotel.setFont(new Font("Raleway",Font.BOLD,17));
		   add(sHotel);
		   
		   cHotel=new JLabel();
		   cHotel.setBounds(250,110,120,20);
		   add(cHotel);
		   
		   JLabel person=new JLabel("Total Persons");
		   person.setBounds(40,150,150,20);
		   person.setFont(new Font("Raleway",Font.BOLD,17));
		   add(person);
		   
		   
		   nPersons=new JLabel();
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
		   
           
           
           
           JLabel lType=new JLabel("Type of Hotel");
		   lType.setBounds(40,265,150,25);
//		   lcountry.setForeground(Color.white);
		   lType.setFont(new Font("Raleway",Font.BOLD,17));
		   add(lType);
		   
		  fType=new JLabel();
		  fType.setBounds(250,265,120,25);
		   add(fType);
		   
		   
		   JLabel lDay=new JLabel("Number of Day's");
		   lDay.setBounds(40,295,150,25);
		   lDay.setFont(new Font("Raleway",Font.BOLD,17));
		   add(lDay);
		   
		    fDay=new JLabel();
		    fDay.setBounds(250,295,80,25);
		    add(fDay);
		   
		   JLabel lTotal=new JLabel("Total Price");
		   lTotal.setBounds(40,325,150,25);
		   lTotal.setFont(new Font("Raleway",Font.BOLD,17));
		   add(lTotal);
		   
		    fTotal=new JLabel();
		   fTotal.setBounds(250,325,150,25);
		   fTotal.setFont(new Font("Raleway",Font.BOLD,17));
		   fTotal.setForeground(Color.RED);
		   add(fTotal);
		   
		   
			try {
				
		    	 Connect c=new Connect();
					String query="select * from bookingsHotel  where username='"+user+"'";
					ResultSet resultSet=c.s.executeQuery(query);
					if(resultSet.next())
					{
						fusername.setText(resultSet.getString("username"));
						femail.setText(resultSet.getString("email"));
						fid.setText(resultSet.getString("id"));
						cHotel.setText(resultSet.getString("booked"));
						nPersons.setText(Integer.toString(resultSet.getInt("totalPerson")));
						fTotal.setText(Integer.toString(resultSet.getInt("totalPrice")));
						fDay.setText(Integer.toString(resultSet.getInt("nDay")));
						 fType.setText(resultSet.getString("hType"));
					}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			
			}
		   
			back=new JButton("Back");
			back.setBounds(130,370,130,30);
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
		if(ae.getSource()==back)
		{
			setVisible(false);
		}
//		 
	}
	
	public static void main(String args[])
	{
		new yourHotel("v");
		
	}
}
