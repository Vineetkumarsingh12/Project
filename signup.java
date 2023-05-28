package travelingManagmentSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class signup extends JFrame implements ActionListener{
	
	   JButton b1, b2;
	    JTextField nfield,pfield,sans, uEmail;
	    Choice sq;
	signup(){
		//setBounds is combination of setSize and setLocation
		setBounds(350,200,900,360);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
	
		JPanel p1=new JPanel();
		p1.setBackground(new Color(	128, 0, 0));
        p1.setBounds(380,0,500,400);
        p1.setLayout(null);
        add(p1);
        // for user name;
        JLabel uname=new JLabel("Username");
        uname.setFont(new Font("Tahoma",Font.BOLD,14));
    	uname.setBounds(50,20,125,25);
    	 uname.setForeground(Color.white);
    	  p1.add(uname);
    	 
    	nfield=new JTextField();
    	nfield.setBounds(190,20,180,25);
    	nfield.setBorder(BorderFactory.createEmptyBorder());
    	p1.add(nfield);
    	
    	
          JLabel Email = new JLabel("Email");
           Email.setFont(new Font("Tahoma", 1, 14));
           Email.setBounds(50, 60, 125, 25);
           Email.setForeground(Color.white);
           p1.add(Email);
           
           uEmail = new JTextField();
        		   uEmail.setBounds(190, 60, 180, 25);
          uEmail.setBorder(BorderFactory.createEmptyBorder());
           p1.add(uEmail);
    	
    	// for password
    	JLabel uPassword=new JLabel("Password");
        uPassword.setFont(new Font("Tahoma",Font.BOLD,14));
    	uPassword.setBounds(50,100,130,25);
    	 uPassword.setForeground(Color.white);
    	  p1.add(uPassword);
    	 
    	 pfield=new JTextField();
    	pfield.setBounds(190,105,180,25);
    	pfield.setBorder(BorderFactory.createEmptyBorder());
    	p1.add(pfield);
    	
    	// For Security question
    	JLabel sQuestion=new JLabel("Security Question");
        sQuestion.setFont(new Font("Tahoma",Font.BOLD,14));
    	sQuestion.setBounds(50,140,130,25);
    	 sQuestion.setForeground(Color.white);
    	p1.add(sQuestion);
    	 
    sq=new Choice();
    sq.add("What is favorite Car Brand");
    sq.add("What is favorite Cartoon");
    sq.add("Which type of movie you like");
    sq.setBounds(190,145,225,25);
    p1.add(sq);
   
    JLabel anslabel=new JLabel("Answer");
    anslabel.setFont(new Font("Tahoma",Font.BOLD,14));
    anslabel.setBounds(50, 170, 125, 25);
    anslabel.setForeground(Color.white);
    p1.add(anslabel);
    
    // answer of security question
    sans=new JTextField();
    sans.setBounds(190, 180, 180, 25);
    sans.setBorder(BorderFactory.createEmptyBorder());
   p1.add(sans) ;   
        
   b1=new JButton("Create");
   b1.setBackground(new Color(255, 0, 0));
   b1.setForeground(Color.white);
   b1.setFont(new Font("Tahoma",Font.BOLD,14));
   b1.setBounds(50, 250, 100, 30);
   b1.addActionListener(this);
   p1.add(b1);
   
     
   b2=new JButton("Back");
   b2.setBackground(new Color(255, 0, 0));
   b2.setForeground(Color.white);
   b2.setFont(new Font("Tahoma",Font.BOLD,14));
   b2.addActionListener(this);
   b2.setBounds(270, 250, 100, 30);
   
    p1.add(b2);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
    Image i2=i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(70,50,200,200);
    add(image);// to set image into panel;
        setVisible(true);    	
	}
	
	public void actionPerformed( ActionEvent aE) {
        if (aE.getSource() == b1) {
             String username = nfield.getText();
            String Password = pfield.getText();
         String email = uEmail.getText();
            String Question =sq.getSelectedItem();
           String answer =sans.getText();
        String query = "insert into account values('" + username + "','" + email + "','" + Password + "','" + Question + "','" + answer + "')";
            try {
               Connect c = new Connect();
                c.s.executeUpdate(query);
                if (c.s != null) {
                    c.s.close();
                }
                JOptionPane.showMessageDialog(null, "Account Created Successfull");
              setVisible(false);
                new Login();
            }
            catch (Exception e) {
            	  JOptionPane.showMessageDialog(null, "Account Already Exist");
            	
                e.printStackTrace();
            }
        }
        else if (aE.getSource() == this.b2) {
          setVisible(false);
            new Login();
        }
    }
public static void main(String args[])
{
	new signup();
}
}
