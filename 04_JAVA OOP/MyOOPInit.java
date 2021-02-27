class PrintInit {
	
	public String delimiter;

	public PrintInit(String delimiter) {
		System.out.println("생성자 호출");
		this.delimiter = delimiter;
	}
	
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
	}
	
	
}

public class MyOOPInit {
	
	public static void main(String[] args) {
		
		PrintInit p1 = new PrintInit("----");
		p1.A();
		p1.B();
		
		p1.delimiter = "****";
		p1.A();
		p1.B();
	}
}
