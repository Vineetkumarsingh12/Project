package travelingManagmentSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class paytm extends JFrame implements ActionListener{
	// To add scroll bar use JEditorPane
	JButton back;
	paytm()
	{
		setBounds(500,200,800,600);
		
		JEditorPane pane=new JEditorPane();
		pane.setEditable(false);
		
		try {
			
			pane.setPage("https://paytm.com/rent-payment");
		}
		catch(Exception e)
		{
		pane.setContentType("text/html");
		pane.setText("<html>Could not load, Error 404</html>");
		
		}
		
		
		// for scroll bar
		JScrollPane sp=new JScrollPane(pane); // pass that object in which you want to put scroll bar 
	getContentPane().add(sp);
	
	back=new JButton("Back");
	back.setBounds(610,20,80,40);
	back.setBackground(Color.white);
	back.setForeground(Color.BLACK);// text color inside the button
	back.addActionListener(this);
	 pane.add(back);
	
	
	setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new payment();
	}
	public static void main(String []args)
	{
		new paytm();
	}
}
