package travelingManagmentSystem;

import javax.swing.*;
import java.awt.*;

//to increase Progessbar 0-100 use multithreading 
public class Loading extends JFrame implements Runnable{
	Thread t;
	JProgressBar bar;
	String user;
	
	public void run()
	{
		try {
			for(int i=1;1<=101;i++)
			{

			int value=bar.getValue();
			if(value<100)
			{
			bar.setValue(value+1);
			}
			else  {
				setVisible(false);
				
				new Dashboard(user);
				System.out.println(value);
				t.stop();
				
			}
			Thread.sleep(50);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}
Loading(String user){
	this.user=user;
	t=new Thread(this);
	setBounds(500,200,650,400);
	getContentPane().setBackground(Color.WHITE);
	setLayout(null);
	 
	
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/tourism.jpg"));
	Image i2=i1.getImage().getScaledInstance(650,400, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
	image.setBounds(0,0,650,400);
	add(image);// to set image into panel;

//	
	JLabel text=new JLabel("Explore Tourism");
	text.setBounds(180,0,600,40);
	text.setForeground(Color.BLACK);
	text.setFont(new Font("Raleway",Font.BOLD,35));
	image.add(text);
//	
    bar=new JProgressBar();
	bar.setBounds(150,100,300,35);
	bar.setStringPainted(true);
	image.add(bar);
//	
//	
//	
	JLabel Loading=new JLabel("Loading ,please wait");
	Loading.setBounds(240,140,150,30);
	Loading.setForeground(Color.GREEN);
	Loading.setFont(new Font("Raleway",Font.BOLD,16));
	image.add(Loading);
//	
	JLabel username=new JLabel("Welcome"+"  "+user);
	username.setBounds(20,320,400,40);
	username.setForeground(Color.RED);
	username.setFont(new Font("Raleway",Font.BOLD,16));
	image.add(username);
	
	t.start();
	
	
	
	setVisible(true);
}


public static void main(String [] args)
{
new Loading("v");
	
	
}
}

