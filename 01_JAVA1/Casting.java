
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		System.out.println(b); // double�� ���
		// int c = 1.1; // double -> int�� ��� Error
		
		int c = (int) 1.1; // casting���� ��ȯ
		System.out.println(c); // int�� ���
		
		String d = Integer.toString(c); // int to string
		System.out.println(d);
		System.out.println(d.getClass());
		
	}

}
