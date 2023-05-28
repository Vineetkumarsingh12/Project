package travelingManagmentSystem;

//AWT is native to platform old 
//Swing is consistence to platform and updated version.

import javax.swing.*;

//JFrame is class of swing 
public class Splash extends JFrame implements Runnable {

	Splash() {
		// 1. creating frame
		// setSize(1200,600);// frame size
		// setLocation(200,100);

		// for image icon
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));

		JLabel image = new JLabel(i1);
		// image-->imageIcon---> JLabel--->then add image
		// add image into frame
		add(image);

		setVisible(true); // by default frame is invisible
		Thread thread = new Thread(this);
		thread.start();
	}

	public void run() {
		try {
			Thread.sleep(7000);
			setVisible(false);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String arg[]) {
		Splash frame = new Splash();
		// int x=
		for (int i = 1; i < 10; i++) {
			frame.setSize(100 * i, 50 * i);
			frame.setLocation(300, 250);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		frame.dispose();
		new Login();
	}

}

