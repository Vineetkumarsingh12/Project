package travelingManagmentSystem;


import javax.swing.*;
import java.awt.*;

public class availablePackage extends JFrame
{
    availablePackage() {
setBounds(450, 200, 900, 600);
         String[] package1 = { "GOLD PACKAGE", "6 Days and 7 Night", "Airport Assistance", "Halt Day City Tour", "Daily Buffet", "Free soft Drinks", "Full Day 3 Island Cruise", "English Speaking Guide", "25000/-" };
         String[] package2 = { "SILVER PACKAGE", "5 Days and 5 Night", "Toll Free Enterence", "Greet at AirPort", "Free Welcome Drinks", "Night Safari", "Cruise with Dinner", "Summing Pool", "18000/-" };
         String[] package3 = { "BRONZE PACKAGE", "Return Airfare", "Free Clubbing", "Horse Ridding", "Free Hard Drinks", "Daily Buffet", "BBQ Dinner", "Mountain Visit", "12000/-" };
        System.out.println(package1.length);
        System.out.println(package2.length);
        System.out.println(package3.length);
         JTabbedPane tab = new JTabbedPane();
         JPanel p1 = createPackage(package1);
        tab.addTab(" Gold ", p1);
         JPanel p2 = createPackage(package2);
        tab.addTab(" Silver ", p2);
         JPanel p3 = createPackage(package3);
        tab.addTab(" Bronze", p3);
        add(tab);
        setVisible(true);
    }
    
    public JPanel createPackage(String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(300, 5, 300, 30);
        l1.setForeground(Color.YELLOW);
        l1.setFont(new Font("Tahoma", 1, 30));
        p1.add(l1);
        JLabel l2 = new JLabel("Details");
        l2.setBounds(30, 70, 300, 30);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma", 1, 20));
        p1.add(l2);
        JLabel l3 = new JLabel(":- " + pack[1]);
        l3.setBounds(30, 115, 300, 30);
        l3.setForeground(Color.GREEN);
        l3.setFont(new Font("Tahoma", 1, 20));
        p1.add(l3);
        JLabel l4 = new JLabel(":- " + pack[2]);
        l4.setBounds(30, 160, 300, 30);
        l4.setForeground(Color.GREEN);
        l4.setFont(new Font("Tahoma", 1, 20));
        p1.add(l4);
        JLabel l5 = new JLabel(":- " + pack[3]);
        l5.setBounds(30, 200, 300, 30);
        l5.setForeground(Color.GREEN);
        l5.setFont(new Font("Tahoma", 1, 20));
        p1.add(l5);
        JLabel l6 = new JLabel(":- " + pack[4]);
        l6.setBounds(30, 240, 300, 30);
        l6.setForeground(Color.GREEN);
        l6.setFont(new Font("Tahoma", 1, 20));
        p1.add(l6);
        JLabel l7 = new JLabel(":- " + pack[5]);
        l7.setBounds(30, 280, 300, 30);
        l7.setForeground(Color.GREEN);
        l7.setFont(new Font("Tahoma", 1, 20));
        p1.add(l7);
        JLabel l8 = new JLabel(":- " + pack[6]);
        l8.setBounds(30, 320, 300, 30);
        l8.setForeground(Color.GREEN);
        l8.setFont(new Font("Tahoma", 1, 20));
        p1.add(l8);
        JLabel l9 = new JLabel(":- " + pack[7]);
        l9.setBounds(30, 360, 300, 30);
        l9.setForeground(Color.GREEN);
        l9.setFont(new Font("Tahoma", 1, 20));
        p1.add(l9);
        JLabel l10 = new JLabel("SUMMER SPECIAL");
        l10.setBounds(120, 450, 300, 30);
        l10.setForeground(Color.PINK);
        l10.setFont(new Font("Tahoma", 1, 20));
        p1.add(l10);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/gold1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(300, 270, 200, 200);
        add(image);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/gold2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(200, 200, 1);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(400, 70, 200, 200);
        add(image2);
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/gold3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(200, 200, 1);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image3 = new JLabel(i9);
        image3.setBounds(600, 70, 200, 200);
        add(image3);
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/gold5.jpg"));
        Image i11 = i10.getImage().getScaledInstance(200, 200, 1);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image4 = new JLabel(i12);
        image4.setBounds(500, 270, 200, 200);
        add(image4);
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/gold4.jpg"));
        Image i14 = i13.getImage().getScaledInstance(200, 200, 1);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel image5 = new JLabel(i15);
        image5.setBounds(700, 270, 200, 200);
        add(image5);
        JLabel l11 = new JLabel("Rs:- " + pack[8]);
        l11.setBounds(500, 450, 300, 30);
        l11.setForeground(Color.BLUE);
        l11.setFont(new Font("Tahoma", 1, 20));
        p1.add(l11);
        return p1;
    }
    
    public static void main(String[] args) {
        new availablePackage();
    }
}