package test;

import java.util.Random;

public class Food {
	
	private static int x,y;
	
	public void random() {
		Random rd = new Random();
		while(true) {
			x = rd.nextInt(12);
			y = rd.nextInt(12);
			if (Board.board[x+1][y+1]==0) {
				break;
			}
		}
		
	}
	
	public void spawnFood() {
		random();
		Board.board[x+1][y+1]=Snake.getLength()+1;
	}
		
	
	public void keepFood() {
		Board.board[x+1][y+1]=Snake.getLength()+1;
	}
	
}
