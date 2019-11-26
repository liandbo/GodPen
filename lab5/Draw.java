package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Draw extends JPanel{
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	
	JTextField name = new JTextField();
	JTextField amount = new JTextField();
	JTextField des = new JTextField();
	JTextField list = new JTextField();
	
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.setFont(new Font("Arial",Font.BOLD,15));
		
		
		b1.setBounds(200,350,100,30);
		b1.setText("Add");
		add(b1);
		
		
		b2.setBounds(320, 350, 100, 30);
		b2.setText("Remove");
		add(b2);
		
		g.drawString("Product name", 50, 70);
		name.setBounds(200, 50, 200, 30);
		add(name);
		
		g.drawString("Amount",50,110);
		amount.setBounds(200, 90, 200, 30);
		add(amount);
		
		g.drawString("Description", 50, 150);
		des.setBounds(200, 130, 200, 100);
		add(des);
		
		g.setFont(new Font("Arial",Font.BOLD,25));
		g.drawString("Product list",460,60);
		list.setBounds(450, 90, 200, 140);
		add(list);
		
	}

}
