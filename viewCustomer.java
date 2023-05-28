package travelingManagmentSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class viewCustomer extends JFrame implements ActionListener{
    
   JButton back;	
	String user;
	
   viewCustomer(String username){
	   this.user=username;
	   setBounds(450,200,870,625);
	   getContentPane().setBackground(Color.white);
	   setLayout(null);
	   
	   ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/view1.jpg"));
		Image i2=i1.getImage().getScaledInstance(870,625, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,870,625);
		add(image);
	   
	   JLabel lusername=new JLabel("Username:");
	   lusername.setBounds(30,50,150,25);
//	   lusername.setForeground(Color.WHITE);
	   lusername.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add( lusername);
	   
	   JLabel fusername=new JLabel();
	   fusername.setBounds(220,50,150,25);
	   fusername.setForeground(Color.white);
	   fusername.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(fusername);
	   
	   JLabel lid=new JLabel("ID:");
	   lid.setBounds(30,110,150,25);
	   lid.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(lid);
	   
	   JLabel fid=new JLabel();
	   fid.setBounds(220,110,150,25);
	   fid.setForeground(Color.white);
	   fid.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(fid); 
	   
	   JLabel lidN=new JLabel("ID Number:");
	   lidN.setBounds(30,170,150,25);
	   lidN.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(lidN);
	   
	   JLabel fidN=new JLabel();
	   fidN.setBounds(220,170,150,25);
	   fidN.setFont(new Font("Raleway",Font.BOLD,17));
	   fidN.setForeground(Color.white);
	   image.add(fidN); 
	   
	   JLabel lemail=new JLabel("Email:");
	   lemail.setBounds(30,230,150,25);
//	   fidN.setForeground(Color.white);
	   lemail.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(lemail);
	   
	   JLabel femail=new JLabel();
	   femail.setBounds(200,230,300,25);
	   femail.setFont(new Font("Raleway",Font.BOLD,17));
	   femail.setForeground(Color.RED);
	   image.add(femail);
	   
	   JLabel lcountry=new JLabel("Country:");
	   lcountry.setBounds(500,50,150,25);
//	   lcountry.setForeground(Color.white);
	   lcountry.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(lcountry);
	   
	   JLabel fcountry=new JLabel();
	   fcountry.setBounds(690,50,150,25);
	   fcountry.setForeground(Color.white);
	   fcountry.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(fcountry);
	   
	   JLabel laddress=new JLabel("Address:");
	   laddress.setBounds(500,110,150,25);
	   laddress.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(laddress);
	   
	   JLabel faddress=new JLabel();
	   faddress.setBounds(690,110,150,25);
	   faddress.setForeground(Color.white);
	   faddress.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(faddress);
	   
	   JLabel lphone=new JLabel("Phone:");
	   lphone.setBounds(500,170,150,25);
	   lphone.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(lphone);
	   
	   JLabel fphone=new JLabel();
	   fphone.setBounds(690,170,150,25);
	   fphone.setForeground(Color.white);
	   fphone.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(fphone);
	   
	   JLabel lgender=new JLabel("Gender:");
	   lgender.setBounds(500,230,150,25);
	   lgender.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(lgender);
	   
	   JLabel fgender=new JLabel();
	   fgender.setBounds(690,230,150,25);
	   fgender.setForeground(Color.white);
	   fgender.setFont(new Font("Raleway",Font.BOLD,17));
	   image.add(fgender);
	   
	   back=new JButton("Back");
	   back.setBackground(Color.BLACK);
	   back.setForeground(Color.WHITE);
	   back.setBounds(350,350,100,25);
	   back.addActionListener(this);
	   image.add(back);
	   
		try {
			
	    	 Connect c=new Connect();
				String query="select * from customer where username='"+user+"'";
				ResultSet resultSet=c.s.executeQuery(query);
				if(resultSet.next())
				{
					fusername.setText(resultSet.getString("username"));
					femail.setText(resultSet.getString("email"));
					fid.setText(resultSet.getString("id"));
					fidN.setText(resultSet.getString("idNo"));
//					
					fcountry.setText(resultSet.getString("country"));
					faddress.setText(resultSet.getString("address"));
					fphone.setText(resultSet.getString("pNumber"));
					fgender.setText(resultSet.getString("gender"));

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
	   new viewCustomer("v");
   }
}
