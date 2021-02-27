class CalSuper {
	
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	// overloading
	public int sum(int v1, int v2, int v3) {
		return this.sum(this.sum(v1, v2), v3);
	}
}

class CalSuper2 extends CalSuper {
	
	// overriding
	public int sum(int v1, int v2) {
		System.out.println("Cal2");
		return super.sum(v1, v2);
	}
}


public class SuperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalSuper c1 = new CalSuper();
		CalSuper2 c2 = new CalSuper2();
		System.out.println(c1.sum(1, 2));
		System.out.println(c2.sum(1, 2));
		System.out.println(c1.sum(1, 2, 3));
		
		
	}

}
