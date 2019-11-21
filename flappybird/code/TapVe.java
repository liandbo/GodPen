package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class TapVe extends JPanel implements Runnable{
	
	private ConChim conchimT = new ConChim();
	private OngNuoc ongnuocT = new OngNuoc();
	private KiemTra kiemtraT = new KiemTra();
	private DiemSo diemsoT = new DiemSo();
	
	private static int a1=0,a2=500;
	private static int b1=0,b2=500;
	
	private BufferedImage bg,nendat;
	
	Thread threadT; 
	
	public TapVe() {
		Thread threadTV = new Thread(this);
		threadTV.start();
	}
	
	public void paint(Graphics g) {
		
//		g.setColor(Color.cyan);
//		g.fillRect(0, 0, getWidth(), getHeight());
		
		try {
			bg = ImageIO.read(new File("E:\\eclipe\\workplace\\flappy bird\\res\\NenDat1.png"));
			g.drawImage(bg,a1,0,null);
			g.drawImage(bg,a2,0,null);
			ongnuocT.paint(g);
			nendat = ImageIO.read(new File("E:\\eclipe\\workplace\\flappy bird\\res\\MatDat1.png"));
			g.drawImage(nendat,b1,400,null);
			g.drawImage(nendat,b2,400,null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		ongnuocT.paint(g);
//		g.setColor(Color.green);
//		g.fillRect(0, 350, getWidth(), getHeight());
//		g.setColor(Color.orange);
//		g.fillRect(0, 380, getWidth(), getHeight());
		conchimT.paint(g);
		
		g.setColor(Color.black);
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.drawString("Diem:" + diemsoT.getDiem(), 10, 20);
	}
	
	public void giamA() {
		a1--;
		a2--;
		b1--;
		b2--;
	}
	public void lapA() {
		if (a1==-500) {
			a1=500;
		}
		if (a2==-500) {
			a2=500;
		}
		if (b1==-500) {
			b1=500;
		}
		if (b2==-500) {
			b2=500;
		}
	}

	@Override
	public void run() {
		while (true) {
			repaint();
			ongnuocT.giamX();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ongnuocT.laplaiX();
			conchimT.tangY();
			
			if (kiemtraT.chet() == true) {
				threadT.stop();
			}
			diemsoT.congdiem();
			giamA();
			lapA();
		}
	}
	
		
}