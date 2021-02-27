
public class ExceptionApp {

	public static void main(String[] args) {
		// System.out.println(2/0);  // Exception 발생
		int[] scores = {10,20,30};
		
		try {
			System.out.println(10);
			System.out.println(scores[12]); // 먼저 발생하는 exception 처리 후 try 종료
//			System.out.println(2/0);
			System.out.println(scores[0]);

		} catch(ArithmeticException e) {
			System.out.println("잘못된 계산");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱싱");
		}
		
		System.out.println("fin");
	}
	

}
