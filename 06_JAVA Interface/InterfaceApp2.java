interface Calculable2 {
	double PI = 3.14;
	int sum(int v1, int v2);
}

interface Printable2 {
	void print();
}

class RealCal2 implements Calculable2, Printable2 {
	
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	public void print() {
		System.out.println("Print");
	}
}


public class InterfaceApp2 {

	public static void main(String[] args) {
		Calculable2 cal = new RealCal2(); // Calculable2 interface¸¸ »ç¿ë
		System.out.println(cal.sum(1, 2));
		System.out.println(cal.PI);
		// cal.print(); // error
		
		Printable2 prt = new RealCal2();
		prt.print();
	}

}
