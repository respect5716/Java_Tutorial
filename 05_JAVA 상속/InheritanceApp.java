class Cal {
	int v1, v2;
	
	Cal(int v1, int v2) {
		System.out.println("Cal init");
		this.v1 = v1;
		this.v2 = v2;
	}
	
	public int sum() {
		return v1 + v2;
	}
}

class Cal2 extends Cal {

	Cal2(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal2 init");
	}
	
	public int minus() {
		return v1 - v2;
	}
	
	// overriding
	public int plus() {
		System.out.println("Cal2 sum");
		return v1 + v2;
	}
}


public class InheritanceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c = new Cal(1, 2);
		System.out.println(c.sum());
		
		Cal2 c2 = new Cal2(1, 2);
		System.out.println(c2.sum());
		System.out.println(c2.minus());
	}

}
