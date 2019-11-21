package test;

public class DiemSo {
	private static int diem = 0;
	
	
	public static int getDiem() {
		return diem;
	}


	private ConChim conchimD = new ConChim();
	private OngNuoc ongnuocD = new OngNuoc();
	
	
	public void congdiem() {
		if (conchimD.getX() == ongnuocD.getX1() + 50) {
			diem++;
		}
		if (conchimD.getX() == ongnuocD.getX2() + 50) {
			diem++;
		}
		if (conchimD.getX() == ongnuocD.getX3() + 50) {
			diem++;
		}
	}
}