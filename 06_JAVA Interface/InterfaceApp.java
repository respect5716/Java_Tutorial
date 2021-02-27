interface Calculable {
	double PI = 3.14;  // 변수 정의
	int sum(int v1, int v2); // 구현해야 할 함수 정의
}

interface Printable {
	void print();
}

class RealCal implements Calculable, Printable {

	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	public void print() {
		System.out.println("Print");
	}
	
}

public class InterfaceApp {

	public static void main(String[] args) {
		RealCal c = new RealCal();
		System.out.println(c.sum(1, 2));
		c.print();
		System.out.println(c.PI);
	}	

}
