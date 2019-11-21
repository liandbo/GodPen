package test;

public class KiemTra {
	
	private ConChim conchimK = new ConChim();
	private OngNuoc ongnuocK = new OngNuoc();
	
	public boolean chet() {
		if (conchimK.getY()+20 >= 400) {
			return true;
		}
		
		if ( ongnuocK.getX1()<120 && (ongnuocK.getX1()+50)>100) {
			if (conchimK.getY()<ongnuocK.getH1() || (conchimK.getY()+20)>(ongnuocK.getH1()+100)) {
				return true;
			}
		}
		
		if ( ongnuocK.getX2()<120 && (ongnuocK.getX2()+50)>100) {
			if (conchimK.getY()<ongnuocK.getH2() || (conchimK.getY()+20)>(ongnuocK.getH2()+100)) {
				return true;
			}
		}
		
		if ( ongnuocK.getX3()<120 && (ongnuocK.getX3()+50)>100) {
			if (conchimK.getY()<ongnuocK.getH3() || (conchimK.getY()+20>ongnuocK.getH3()+100)) {
				return true;
			}
		}
		
		
		return false;
	}
}