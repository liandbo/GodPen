package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Draw extends JPanel implements Runnable{
	
	private Food foodDr = new Food();
	private Move moveDr = new Move();
	private Acceleration accDr = new Acceleration();
	private Check checkDr = new Check();
	
	
	private Thread thread = new Thread(this);
	
	public Draw() {
		
		thread.start();
		foodDr.spawnFood();
	}
	
	
	public void paint(Graphics g) {
		g.setColor(Color.lightGray);
		g.fillRect(0, 0, 600, 600);
		
		g.setColor(Color.gray);
		g.fillRect(600, 0, 200, 600);
		
		//ve ran
		g.setColor(Color.red);
		for(int i=0; i<=11;i++) {
			for(int j=0; j<=11; j++) {
				if(Board.board[j+1][i+1]!=0) 
					g.fillRect(i*50+3, j*50+3, 44, 44);
			}
		}
		
		//do an
		for(int i=0; i<=11;i++) {
			for(int j=0; j<=11; j++) {
				if(Board.board[j+1][i+1]==(Snake.getLength()+1)) {
					g.setColor(Color.green);
					g.fillRect(i*50+3, j*50+3, 44, 44);
					g.setColor(Color.white);
					g.fillRect(i*50+10,j*50+10,30,30);
				}
			}
		}
		
		//ve dau ran
		for(int i=0; i<=11;i++) {
			for(int j=0; j<=11; j++) {
				if(Board.board[j+1][i+1]==Snake.getLength()) {
					g.setColor(Color.red);
					g.fillRect(i*50+3, j*50+3, 44, 44);
					g.setColor(Color.blue);
					g.fillRect(i*50+20,j*50+20,10,10);
				}
			}
		}
		
		
		
		g.setColor(Color.black);
		for(int i=0; i<=600; i+=50) {
			g.drawLine(i, 0, i, 600);
		}
		for(int i=0; i<=600; i+=50) {
			g.drawLine(0, i, 600, i);
		}
		
		g.setColor(Color.black);
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.drawString("Lenght: " + Snake.getLength(), 620, 50);

		
		System.out.println("Ngang="+Board.getJ()+"\tDoc="+Board.getI()+"\tSpped: "+ accDr.getAcce());
	}
	

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(Acceleration.getAcce());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			moveDr.move();
			repaint();
			accDr.faster();
			
		}
	}
	
	
}
