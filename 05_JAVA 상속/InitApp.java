class CalInit {
	int v1, v2;
	CalInit(int v1, int v2) {
		this.v1 = v1;
		this.v2 = v2;
		System.out.println("Cal Init");
	}
	
	public int sum() {
		return v1 + v2;
	}
}

class CalInit2 extends CalInit {
	
	CalInit2(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal2 Init");
	}
}


public class InitApp {

	public static void main(String[] args) {
		CalInit c = new CalInit(1, 2);
		CalInit2 c2 = new CalInit2(3, 4);
		System.out.println(c.sum());
		System.out.println(c2.sum());
	}

}
