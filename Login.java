package travelingManagmentSystem;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton login,signup, forgot;
    JTextField efield,pfield;
    String user;
	Login()
	{
	setSize(900,400);
	setLocation(350,200);
	
	setLayout(null);// Do not want default layout
	getContentPane().setBackground(Color.WHITE);
//	creating a panel to divide the frame into parts
	//first panel
	JPanel p1=new JPanel();
	 p1.setBackground(new Color(131,193,233));
	 p1.setLayout(null);// to  work setBounds funtion setLayout is to null
	 p1.setBounds(0,0,400,400);  // panel origin,panel size on frame
	add(p1);
	
	
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
Image i2=i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel image=new JLabel(i3);
image.setBounds(100,120,200,200);
p1.add(image);// to set image into panel;


// second panel
JPanel p2=new JPanel();
p2.setLayout(null);
p2.setBounds(400,30,450,300);
add(p2);// set panel into frame
  


// JLabel mostly use to write text on the panel
   
// for user name
 JLabel uEmail = new JLabel("Email*");
uEmail.setBounds(60, 20, 115, 30);
uEmail.setFont(new Font("SAN SERIF", 0, 20));
p2.add(uEmail);
   
   
   //text field
efield=new JTextField();
efield.setBounds(60,55,300,30);
   //to set the border
efield.setBorder(BorderFactory.createEmptyBorder());
   p2.add(efield);
   
   // for password
   JLabel uPassword=new JLabel("Password*");
   uPassword.setBounds(60,100,115,30);
   uPassword.setFont(new Font("SAN SERIF",Font.PLAIN,20));  // width of text
   
   p2.add(uPassword);
   
   
   //text field
   pfield=new JTextField();
   pfield.setBounds(60,130,300,30);
   //to set the border
   pfield.setBorder(BorderFactory.createEmptyBorder());
   p2.add(pfield);
   
   
   // login button
  login=new JButton("Login");
   login.setBounds(60,200,130,30);
   login.setBackground(new Color(133,193,233));
   login.setForeground(Color.WHITE);// text color inside the button
   login.setBorder(new LineBorder(new Color(144, 238, 144),3));
   login.addActionListener(this);
   p2.add(login);
   
   
   //sign up button
   signup=new JButton("Sign up");
   signup.setBounds(200,200,130,30);
   signup.setBackground(new Color(133,193,233));
   signup.setForeground(Color.WHITE);// text color inside the button
   signup.setBorder(new LineBorder(new Color(144, 238, 144),3));
   signup.addActionListener(this);
   p2.add(signup);
   
   // forgot password
   forgot=new JButton("Fogot Password");
   forgot.setBounds(140,250,130,30);
   forgot.setBackground(new Color(133,193,233));
   forgot.setForeground(Color.WHITE);// text color inside the button
   forgot.setBorder(BorderFactory.createEmptyBorder());
   forgot.addActionListener(this);
   p2.add(forgot);
		   setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.login) {
            try {
                 String e = this.efield.getText();
                String p = this.pfield.getText();
                String query = "select username, email,Password from account where email='" + e + "' AND Password='" + p + "'";
                 Connect c = new Connect();
                ResultSet resultSet = c.s.executeQuery(query);
                if (resultSet.next()) {
                    this.setVisible(false);
                    this.user = resultSet.getString("username");
                    new Loading(this.user);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                }
            }
            catch (Exception ex) {}
        }
        else if (ae.getSource() == this.signup) {
            this.setVisible(false);
            new signup();
        }
        else {
            this.setVisible(false);
            new forgetPassword();
        }
    }
public static void main(String args[])
{
	new Login();
}  
}

