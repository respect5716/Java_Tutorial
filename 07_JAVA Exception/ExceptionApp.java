
public class ExceptionApp {

	public static void main(String[] args) {
		// System.out.println(2/0);  // Exception �߻�
		int[] scores = {10,20,30};
		
		try {
			System.out.println(10);
			System.out.println(scores[12]); // ���� �߻��ϴ� exception ó�� �� try ����
//			System.out.println(2/0);
			System.out.println(scores[0]);

		} catch(ArithmeticException e) {
			System.out.println("�߸��� ���");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�߸��� �ε���");
		}
		
		System.out.println("fin");
	}
	

}
