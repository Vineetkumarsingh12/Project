package travelingManagmentSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class updateCustomInfo extends JFrame implements ActionListener {
	
	// for drop dwon
	JComboBox<String> ids;
	JTextField iNumber,cName, uAddress,uPhone,uEmail;
	JRadioButton male,female,trans;
	JLabel userName;
	JButton update,back;
	String user;
	updateCustomInfo(String User){
		this.user=User;
	setBounds(450,200,850,550);
	setLayout(null); 
	getContentPane().setBackground(Color.WHITE);
	
	JLabel heading=new JLabel("Update Customer Details");
	heading.setBounds(300,0,300,25);
	heading.setFont(new Font("Tahoma",Font.BOLD,20));
	add(heading);
	
	JLabel luser=new JLabel("Username");
	luser.setBounds(30,50,150,25);
	add(luser);
	
	 userName=new JLabel();
	userName.setBounds(220,50,150,25);
	add(userName);
	
	JLabel id=new JLabel("ID");
	id.setBounds(30,90,150,25);
	add(id);
	
	ids=new JComboBox<>(new String[] {"Passport","Aadhar Card","Pan Card","Ration Card"});
	ids.setBounds(220,90,150,25);
	ids.setBackground(Color.WHITE);
	add(ids);
	
	JLabel idNumber=new JLabel("ID Number");
	idNumber.setBounds(30,130,150,25);
	add(idNumber);
	
 iNumber=new JTextField();
 iNumber.setBounds(220,130,150,25);
	add(iNumber);
	
	JLabel email=new JLabel("Email");
	email.setBounds(30,170,150,25);
	add(email);
	
	 uEmail=new JTextField();
	 uEmail.setBounds(220,170,150,25);
	add( uEmail);
//	
	JLabel gender=new JLabel("Gender");
	gender.setBounds(30,210,150,25);
	add(gender);
	
	
	//radion Button
	male=new JRadioButton("Male");
	male.setBounds(200,210,70,25);
	male.setBackground(Color.WHITE);
	add(male);
	
	female=new JRadioButton("Female");
	female.setBounds(267,210,70,25);
	female.setBackground(Color.WHITE);
	add(female);
//	
	trans=new JRadioButton("Trans");
	trans.setBounds(340,210,70,25);
	trans.setBackground(Color.WHITE);
	add(trans);
	
	
	// for grouping button
	ButtonGroup bg=new ButtonGroup();
	bg.add(female);
	bg.add(male);
	bg.add(trans);
	
	JLabel country=new JLabel("Country");
	country.setBounds(30,250,150,25);
	add(country);
	
	 cName=new JTextField();
	 cName.setBounds(220,250,150,25);
		add(cName);
	
		JLabel address=new JLabel("Address");
		address.setBounds(30,290,150,25);
		add(address);
		
		 uAddress=new JTextField();
		 uAddress.setBounds(220,290,150,25);
			add( uAddress);
	
			JLabel phone=new JLabel("Phone No.");
			 phone.setBounds(30,330,150,25);
			add(phone);
			
			 uPhone=new JTextField();
			 uPhone.setBounds(220,330,150,25);
				add(uPhone);
				
				update =new JButton("Update");
				update.setBackground(Color.BLACK);
				update.setForeground(Color.WHITE);
				update.setBounds(100,410,100,25);
				update.addActionListener(this);
				add(update);
			
				back =new JButton("Back");
				back.setBackground(Color.BLACK);
				back.setForeground(Color.WHITE);
				back.setBounds(250,410,100,25);
				back.addActionListener(this);
				add(back);
				
				ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Details.png"));
				Image i2=i1.getImage().getScaledInstance(420,420, Image.SCALE_DEFAULT);
				ImageIcon i3=new ImageIcon(i2);
				JLabel image=new JLabel(i3);
				image.setBounds(400,40,450,400);
				add(image);// to set image into panel;
	
				try {
					
			    	 Connect c=new Connect();
						String query="select * from customer where username='"+user+"'";
						System.out.println(user);
						ResultSet resultSet=c.s.executeQuery(query);
						if(resultSet.next())
						{
							userName.setText(resultSet.getString("username"));
							uEmail.setText(resultSet.getString("email"));
							// Select Default value in JcomboBox
							ids.setSelectedItem(resultSet.getString("id"));
							iNumber.setText(resultSet.getString("idNo"));
							cName.setText(resultSet.getString("country"));
							uAddress.setText(resultSet.getString("address"));
							uPhone.setText(resultSet.getString("pNumber"));
							uPhone.setText(resultSet.getString("gender"));
							String s=resultSet.getString("gender");
							if(s.equals("Male"))
							{
							male.setSelected(true);
								
							}
							else if(s.equals("Female")) {
								female.setSelected(true);
							}
							else {
								trans.setSelected(true);
							}
							

						}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
	setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==update) {
			
			String u=userName.getText();
			String e=uEmail.getText();
			String id=(String) ids.getSelectedItem();
			String  idNo=iNumber.getText();
			String country=cName.getText();
			String address=uAddress.getText();
			String phNo=uPhone.getText();
			String gender=null;
			if(male.isSelected())
			{
				gender="Male";
				
			}
			else if(female.isSelected()) {
				gender="Female";
			}
			else {
				gender="trans";
			}
			
			
			
		    try {
				String query="update customer set username='"+u+"',email='"+e+"',id='"+id+"',idNo='"+idNo+"',country='"+country+"',address='"+address+"',pNumber='"+phNo+"',gender='"+gender+"'where username='"+user+"'";

		    	Connect c=new Connect();
		    	c.s.executeUpdate(query);
		    	 
		    	JOptionPane.showMessageDialog(null,"Details Updated Successfully" );

			    	setVisible(false);
		        if (c.s != null) {
		            c.s.close();
		        }	
		        
		    }
		    catch(Exception E)
		    {
//		    	JOptionPane.showMessageDialog(null,"Account Already exist" );

		    	E.printStackTrace();
		    	JOptionPane.showMessageDialog(null,"Details Not Updated" );

		    	
		    }
			
		}
		
		
		else {
			setVisible(false);
		}
	}
	
	
	public static void main(String args[]) {
		new updateCustomInfo("v");
	}
	

}

