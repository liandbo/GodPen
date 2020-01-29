package test;

public class Acceleration {
	private static int acce=1000;

	public static int getAcce() {
		return acce;
	}

	public void faster() {
		acce = (int) (acce*0.999);
	}
	
}
