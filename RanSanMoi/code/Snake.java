package test;

public class Snake {
	
	private Board boardSn = new Board();
	private Direction directionSn = new Direction();
	private Food foodSn = new Food();
	
	private static int length = 1;
	
	
	public static int getLength() {
		return length;
	}
	
	public void grow() {
		length++;
		for(int i = 0; i <= 11; i++) {
			for(int j=0; j<= 11; j++) {
				if (Board.board[j+1][i+1] != 0)
					Board.board[j+1][i+1]++;
			}
		}
		foodSn.spawnFood();
	}
}
