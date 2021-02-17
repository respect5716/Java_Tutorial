
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		System.out.println(b); // double로 출력
		// int c = 1.1; // double -> int의 경우 Error
		
		int c = (int) 1.1; // casting으로 변환
		System.out.println(c); // int로 출력
		
		String d = Integer.toString(c); // int to string
		System.out.println(d);
		System.out.println(d.getClass());
		
	}

}
