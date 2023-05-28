package travelingManagmentSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class about extends JFrame{

	
	about()
	{
	setBounds(600,200,500,550);
	setLayout(null);
	getContentPane().setBackground(Color.white);
	
	JLabel l1=new JLabel("ABOUT");
	l1.setBounds(200,10,100,40);
	l1.setForeground(Color.BLACK);
	l1.setFont(new Font("Tahoma",Font.PLAIN,20));
	add(l1);
	
	String text="A tourism management system is a software application or platform designed to facilitate and streamline various aspects of the tourism industry. It helps tourism organizations, travel agencies, tour operators, and other related businesses to manage their operations more efficiently. While the specific features and functionalities of a tourism management system can vary depending on the provider and the target audience, here are some common specifications:\r\n"
			+ "\r\n"
			+ "Reservation Management: The system should allow users to handle reservations for flights, accommodations, tours, car rentals, and other travel services. It should support real-time availability checks, booking confirmations, and modifications/cancellations.\r\n"
			+ "\r\n"
			+ "Customer Relationship Management (CRM): A CRM module helps manage customer information, communication history, preferences, and special requests. It enables personalized customer service and targeted marketing campaigns.\r\n"
			+ "\r\n"
			+ "Inventory Management: The system should maintain an inventory of available travel services, including accommodations, transportation, and activities. It should track availability, pricing, and restrictions, ensuring accurate information is presented to customers.\r\n"
			+ "\r\n"
			+ "Online Booking and Payment Processing: The system should provide a user-friendly interface for customers to search, select, and book travel services online. It should support secure payment processing, integrating with popular payment gateways.\r\n"
			+ "\r\n"
			+ "Itinerary Planning: Users should be able to create customized itineraries for individual travelers or groups. The system should suggest popular attractions, activities, and routes, and allow users to make adjustments based on customer preferences.\r\n"
			+ "\r\n"
			+ "Reporting and Analytics: The system should generate reports and analytics on key performance indicators (KPIs), such as bookings, revenue, customer satisfaction, and marketing effectiveness. This data helps businesses make informed decisions and identify areas for improvement.\r\n"
			+ "\r\n"
			+ "Supplier Management: The system should enable the management of relationships with suppliers, including contracting, pricing agreements, and collaboration on service updates. It should facilitate communication and streamline processes between suppliers and the tourism organization.\r\n"
			+ "\r\n"
			+ "Accounting and Finance: The system should provide basic accounting features, such as generating invoices, tracking payments, and managing expenses. It may integrate with external accounting software for comprehensive financial management.\r\n"
			+ "\r\n"
			+ "Integration and Connectivity: The system should support integrations with other travel-related systems and services, such as Global Distribution Systems (GDS), online travel agencies (OTAs), and tour aggregators. This allows for broader market reach and seamless data exchange.\r\n"
			+ "\r\n"
			+ "Security and Data Protection: The system should prioritize the security and privacy of customer and business data. It should implement robust authentication, encryption, and backup mechanisms to prevent unauthorized access or data loss.\r\n"
			+ "\r\n"
			+ "These specifications serve as a general guide, and the actual requirements may vary depending on the scale and specific needs of the tourism management system being developed or implemented.";
	//row,coloum
	TextArea area =new TextArea(text,10,40,Scrollbar.VERTICAL);
	area.setEditable(false);
	area.setBounds(20,100,450,300);
	
	 // Set the font size
//    Font font = area.getFont();
//    float newSize = font.getSize() + 5; // Increase the size by 5
//    area.setFont(font.deriveFont(newSize));
	add(area);
	
	
	setVisible(true);
	}
	public static void main(String args[]) {
		new about();
	}
}
