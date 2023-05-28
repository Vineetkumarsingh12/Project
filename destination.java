package travelingManagmentSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class destination extends JFrame implements ActionListener  {
	JButton next,perv;
	JLabel l1,l2;
	int pos=1;
	String[] hName= {"ABC","BCD","CDE","DEF","EFG","FGH","GHI","HIJ","IJK","JKL","KLM","LMN"};
	destination(){
		setBounds(500,200,800,600);
	change();
	setVisible(true);
	}
	
	
public void change()
{
	
	
	 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dest"+pos+".jpg"));
		Image i2=i1.getImage().getScaledInstance(800,600, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		l1=new JLabel(i3);
		l1.setBounds(0,0,800,600);
		add(l1);
		
		l2=new JLabel(hName[pos-1]);
		l2.setBounds(350,500,400,30);
		l2.setFont(new Font("Raleway",Font.BOLD,30));
		l2.setForeground(Color.RED);
		l1.add(l2);
		
		 perv=new JButton("<<");
		 perv.setBackground(Color.BLACK);
		 perv.setForeground(Color.WHITE);
		 perv.setBounds(5,300,50,25);
		 perv.addActionListener(this);
		 l1.add(  perv);
		 
		 next=new JButton(">>");
		 next.setBackground(Color.BLACK);
		 next.setForeground(Color.WHITE);
		 next.setBounds(730,300,50,25);
		 next.addActionListener(this);
		 l1.add(next);
	
}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==next)
		{
		l1.setVisible(false);
		if(pos<10)
			pos+=1;
			
		change();
		
		System.out.println("yes");
		
		}else {
			l1.setVisible(false);
			if(pos>2)
				pos-=1;
				
			change();
		}
	}

	public static void main(String args[]) {
		new destination();
	}
}

