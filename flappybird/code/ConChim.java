package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ConChim extends JPanel{
	
	private static int y = 200;
	private static int x = 100;
	
	private BufferedImage bird; 
	
	
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}

	public void paint(Graphics g) {
//		g.setColor(Color.red);
//		g.fillRect(100, y, 20, 20);
		
		try {
			bird = ImageIO.read(new File("E:\\eclipe\\workplace\\flappy bird\\res\\bird.png"));
			g.drawImage(bird,x,y,null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void tangY() {
		y++;
	}
	
	public void giamY() {
		y-=40;
	}

}