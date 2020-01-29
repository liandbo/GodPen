package test;

public class Check {
	private Snake snakeCh = new Snake();
	
	public void checkEat() {
		boolean temp=true;
			for(int i=0; i <= 11; i++) {
				for(int j=0; j <= 11; j++) {
					if (Board.board[j+1][i+1]==(Snake.getLength()+1))
						temp=false;
					
				}
			}
			
			if (temp==true)
				
				snakeCh.grow();
	}
	
	public boolean checkSide() {
		if (Board.getI() == -1 || Board.getI() == 13) return true;
		if (Board.getJ() == -1 || Board.getJ() == 13) return true;
		
		return false;
	}
	
	public long tinhGiaithua(int n) {
        if (n > 1) {
            return n + tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }
	
	public boolean checkSelf() {
		long sum=0;
		long temp=0;
		for(int i = 0; i <= 11; i++) {
			for(int j=0; j<= 11; j++) {
				if(Board.board[j+1][i+1] != (Snake.getLength()+1))
					sum += Board.board[j+1][i+1];
			}
		}
				
		temp=tinhGiaithua(Snake.getLength());
		
		if(temp != sum) return true;
		
		return false;
	}
	
	public boolean checkOver() {
		if (checkSide() || checkSelf()) return true;
		return false;
	}
		
}
