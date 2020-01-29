package test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Screen extends JFrame{
	
	
	private Draw drawS = new Draw();	
	
	public Screen() {
		setTitle("Ran San Moi");
		setSize(800,650);
		setVisible(true);
		setLocation(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		add(drawS);
		
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_LEFT) {
					if (Move.getWay()!=2 && Move.isMove()) {
						Move.setWay(4);
						Move.setMove(false);
					}
				}
				if(keyCode == KeyEvent.VK_RIGHT){
					if (Move.getWay()!=4 && Move.isMove()) {
						Move.setWay(2);
						Move.setMove(false);
					}
				}
				if(keyCode == KeyEvent.VK_DOWN) {
					if (Move.getWay()!=1 && Move.isMove()) {
						Move.setWay(3);
						Move.setMove(false);
					}
				}
				if(keyCode == KeyEvent.VK_UP) {
					if (Move.getWay()!=3 && Move.isMove()) {
						Move.setWay(1);
						Move.setMove(false);
					}
				}
			}
			
		});
	}
	
	public static void main(String[] args) {
		Screen screen = new Screen();
	}

}
