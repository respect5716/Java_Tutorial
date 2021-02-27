
public class ExceptionApp2 {

	public static void main(String[] args) {
		int[] scores = {10, 20, 30};
		System.out.println(1);
		
		try {
			System.out.println(2/0);
//			System.out.println(scores[10]);
		} catch(ArithmeticException e) {
			System.out.println("계산 예외만 처리");
			System.out.println(e.getMessage()); // e 변수를 활용하여 추가 정보 제공
			e.printStackTrace(); // Exception message 출력
		} catch(Exception e) {
			System.out.println("어떠한 예외든 처리");
		} 
		
		System.out.println(2);

	}

}
