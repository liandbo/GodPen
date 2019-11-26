package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Screen extends JFrame{
	JFrame frame = new JFrame();
	
//	JButton b1 = new JButton();
//	JButton b2 = new JButton();
//	
//	JPanel panel = new JPanel();
//	
//	JTextField name = new JTextField();
//	JTextField amount = new JTextField();
//	JTextField des = new JTextField();
//	JTextField list = new JTextField();
	
	Draw ve = new Draw();
	
	public Screen() {
		setSize(700,500);
		setVisible(true);
		setLocation(400,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("GUI");
		
//		panel.setLayout(null);
//		add(panel);
//		
//		b1.setBounds(200,350,100,30);
//		b1.setText("Add");
//		panel.add(b1);
//		
//		b2.setBounds(320, 350, 100, 30);
//		b2.setText("Remove");
//		panel.add(b2);
//		
//		name.setBounds(200, 50, 200, 30);
//		panel.add(name);
//		
//		amount.setBounds(200, 90, 200, 30);
//		panel.add(amount);
//		
//		des.setBounds(200, 130, 200, 100);
//		panel.add(des);
//		
//		list.setBounds(450, 90, 200, 140);
//		panel.add(list);
		
		add(ve);
		
		
	}

	public static void main(String[] args) {
		Screen screen = new Screen();
	}

}
