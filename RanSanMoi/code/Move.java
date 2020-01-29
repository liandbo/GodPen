package test;

import javax.swing.JOptionPane;

public class Move {
	
	private Direction directionMo = new Direction();
	private Board boardMo = new Board();
	private Food foodMo = new Food();
	private Check checkMo = new Check();
	
	private static int way=1;
	private static boolean move = false;
	public static void setWay(int way) {
		Move.way = way;
	}
	public static int getWay() {
		return way;
	}
	public static boolean isMove() {
		return move;
	}
	public static void setMove(boolean move) {
		Move.move = move;
	}
	public void Gameover () {
		System.out.println("Gameover");
		int option = JOptionPane.showConfirmDialog(null," You loose","GAME OVER", JOptionPane.CLOSED_OPTION );
		if (option == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
			}
		if (option == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}
	
	
	public void move() {
		switch (way) {
		case 1:
			directionMo.up();
			break;
		case 2:
			directionMo.right();
			break;
		case 3:
			directionMo.down();
			break;
		case 4:
			directionMo.left();
			break;
		}
		
		
		checkMo.checkEat();
		boardMo.boardown();
		
		foodMo.keepFood();
		boardMo.head();
		if(checkMo.checkOver()) Gameover();
		move = true;
	}
}
