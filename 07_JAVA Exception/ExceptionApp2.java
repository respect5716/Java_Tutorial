
public class ExceptionApp2 {

	public static void main(String[] args) {
		int[] scores = {10, 20, 30};
		System.out.println(1);
		
		try {
			System.out.println(2/0);
//			System.out.println(scores[10]);
		} catch(ArithmeticException e) {
			System.out.println("��� ���ܸ� ó��");
			System.out.println(e.getMessage()); // e ������ Ȱ���Ͽ� �߰� ���� ����
			e.printStackTrace(); // Exception message ���
		} catch(Exception e) {
			System.out.println("��� ���ܵ� ó��");
		} 
		
		System.out.println(2);

	}

}
