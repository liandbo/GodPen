package test;

public class Direction {
	
	public void up() {
		Board.setJ(Board.getJ()-1);
	}
	public void down() {
		Board.setJ(Board.getJ()+1);
	}
	public void right() {
		Board.setI(Board.getI()+1);
	}
	public void left() {
		Board.setI(Board.getI()-1);
	}
}
