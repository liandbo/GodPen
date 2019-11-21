package test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ManHinh extends JFrame {
	
	private TapVe tapveM = new TapVe();
	private ConChim conchimM = new ConChim();
	
	public ManHinh() {
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300, 400);
		setResizable(false);
		setTitle("Flappy bird");
		add(tapveM);
		
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				conchimM.giamY();
			}
		});
		
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				conchimM.giamY();
			}
			
		});
	}
	
	
	public static void main(String[] args) {
		ManHinh mh = new ManHinh();
	}
	
}