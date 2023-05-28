package travelingManagmentSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class forgetPassword  extends JFrame implements ActionListener{
	
	JTextField emailField,Seurity;
	JButton   Submit,back;
	 JCheckBox checkBox;
	forgetPassword()
	{
		setBounds(350,200,850,380);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgot.png"));
		Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 =new ImageIcon(i2);
	    JLabel image=new JLabel(i3);
	    image.setBounds(580,70,200,200);
	    add(image);
	    
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(30,30,500,280);
	add(p1);
	
	JLabel Label=new JLabel("Forgot Password");
	 Label.setBounds(180,13,200,25);
	 Label.setFont(new Font("Tahoma",Font.BOLD,14));
	p1.add(Label);
	
	JLabel Email=new JLabel("Email");
	Email.setBounds(40,50,100,25);
	Email.setFont(new Font("Tahoma",Font.BOLD,14));
	p1.add(Email);

    emailField=new JTextField();
    emailField.setBounds(220,50,150,25);
    emailField.setBorder(BorderFactory.createEmptyBorder());
    p1.add(emailField);
     
    Submit= new JButton("Submit");
    Submit.setBackground(Color.GRAY);
    Submit.setForeground(Color.WHITE);
    Submit.setBounds(200,170,100,25);
    Submit.addActionListener(this);
    p1.add(Submit);
    
   back= new JButton("Back");
   back.setBackground(Color.GRAY);
   back.setForeground(Color.WHITE);
   back.setBounds(350,170,100,25);
   back.addActionListener(this);
    p1.add(back);
    
    
    JLabel Security=new JLabel("Are you human ?");
    Security.setBounds(40,130,150,25);
    Security.setFont(new Font("Tahoma",Font.BOLD,14));
	p1.add(Security);
	
	
//	 surtButton= new JButton("Submit");
//	 surtButton.setBackground(Color.GRAY);
//	 surtButton.setForeground(Color.WHITE);
//	 surtButton.setBounds(380,100,100,25);
//	    p1.add(surtButton);
	    
	     checkBox = new JCheckBox();
        checkBox.setSelected(false);
        checkBox.setBackground(Color.GRAY);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBounds(200,130,20,25);
   	    p1.add(checkBox);
   	    
   	 JLabel surtQuestion=new JLabel("Security Question Answer");
   	surtQuestion.setBounds(30,90,200,25);
   	surtQuestion.setFont(new Font("Tahoma",Font.BOLD,14));
 	p1.add(surtQuestion);
 	
 	Seurity=new JTextField();
 	Seurity.setBounds(220,90,150,25);
 	Seurity.setBorder(BorderFactory.createEmptyBorder());
     p1.add(Seurity);

    
	
	setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Submit )
		{
			if(checkBox.isSelected()) {
				if(Seurity.getText().isEmpty())
					JOptionPane.showMessageDialog(null,"Please fill the Security question" );
				else {
					try
					{
						String query="select Password from account where email='"+emailField.getText()+"' AND answer='"+Seurity.getText()+"'";
						Connect c=new Connect();
						
						ResultSet resultSet=c.s.executeQuery(query);
						if (resultSet.next()) {
						 
						    String password = resultSet.getString("Password");
						    
						    // Process the retrieved data
						   
						    System.out.println("Password: " + password);
							JOptionPane.showMessageDialog(null,"Your Password is :"+password);
							
							
							//if you want to set data in textfield than use setText method.

						} else {
						    // No rows in the result set
							JOptionPane.showMessageDialog(null,"Wrong email or Password Try again" );

						}
					}
catch(Exception e) {
	e.printStackTrace();
}
				}

				
			}
			else
			JOptionPane.showMessageDialog(null,"Please Select the Checkbox" );
	
		}
		
		if(ae.getSource()==back)
		{
			setVisible(false);
			new Login();
		}
	}
	public static void main(String args[])
	{
		new forgetPassword();
	}
}

