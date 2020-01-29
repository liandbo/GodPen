package test;

public class Board {
	private static int i=6;
	private static int j=6;
		
	
	public static int getI() {
		return i;
	}
	public static void setI(int i) {
		Board.i = i;
	}
	public static int getJ() {
		return j;
	}
	public static void setJ(int j) {
		Board.j = j;
	}
	public static int[][] board = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,1,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
								   {0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
	
	public void head() {
		//tao head moi
		if (board[j+1][i+1]==0) {
			board[j+1][i+1]=Snake.getLength();
		} else {
			board[j+1][i+1]=Snake.getLength();
		}
	}
	
	public void boardown() {
		for(int i = 0; i <= 11; i++) {
			for(int j=0; j<= 11; j++) {
				if (board[j+1][i+1] != 0)
					board[j+1][i+1]--;
			}
		}
		
	}
	
}
