class CalOL {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	// overloading
	public int sum(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}
	
	
}


public class OverloadingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalOL c = new CalOL();
		System.out.println(c.sum(1, 2));
		System.out.println(c.sum(1, 2, 3));
	}

}
