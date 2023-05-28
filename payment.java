package travelingManagmentSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class payment extends JFrame implements ActionListener{
	JButton pay,back;
	 JLabel totalPay;
	 int hPay,pPay;
	payment(){
		setBounds(500,200,800,600);
		setLayout(null);
		
		ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("icons/pay.jpg"));
		Image i14=i13.getImage().getScaledInstance(800,600, Image.SCALE_DEFAULT);
		ImageIcon i15=new ImageIcon(i14);
		JLabel image4=new JLabel(i15);
		image4.setBounds(0,0,800,600);
		add(image4);
		
		JLabel heading=new JLabel("Payment");
		heading.setBounds(340,10,200,30);
		heading.setForeground(Color.PINK);
		heading.setFont(new Font("Tahoma",Font.BOLD,20));
		image4.add(heading);
		
		back=new JButton("Back");
		back.setBounds(100,490,70,30);
		back.setBackground(Color.white);
		back.setForeground(Color.black);// text color inside the button
		back.addActionListener(this);
		 image4.add(back);
		 
			pay=new JButton("Pay");
			pay.setBounds(500,490,70,30);
			pay.setBackground(Color.white);
			pay.setForeground(Color.black);// text color inside the button
			pay.addActionListener(this);
			 image4.add(pay);
			 
			 totalPay=new JLabel();
			 totalPay.setBounds(600,490,200,30);
			 totalPay.setForeground(Color.PINK);
			 totalPay.setFont(new Font("Tahoma",Font.BOLD,20));
				image4.add(totalPay);
			 
			 
			 try {
					// for hotel
		    	 Connect c=new Connect();
					String query="select totalPrice from bookingsHotel  where username='"+"v"+"'";
					ResultSet resultSet=c.s.executeQuery(query);
					
					if(resultSet.next())
					{
						
						hPay=resultSet.getInt("totalPrice");
					   	
					}
					 if (c.s != null) {
				            c.s.close();
				        }
					 
				//	for  package 
					  c=new Connect();
						 query="select * from bookings where username='"+"v"+"'";
						 resultSet=c.s.executeQuery(query);
					
						if(resultSet.next())
						{
							
							pPay=Integer.parseInt(resultSet.getString("totalPrice"));

						   	
						}
						 if (c.s != null) {
					            c.s.close();
					        }
					
					 totalPay.setText("Rs "+ Integer.toString(hPay+pPay));

						 
						
					
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			
			}
		   
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==pay)
		{
			
		}
		else
		{
			
		}
	}
public static void main(String arrgs[]) {
	new payment();
}
}
