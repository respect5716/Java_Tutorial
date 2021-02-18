
public class AuthApp2 {

	public static void main(String[] args) {

		String id = "yoon";
		String pw1 = "1234";
		String pw2 = "5678";
		
		String inputId = args[0];
		String inputPw = args[1];
		
		System.out.println("Hi.");
		
		boolean isRightId = inputId.equals(id);
		boolean isRightPw = (inputPw.equals(pw1) || inputPw.equals(pw2));
		if (isRightId && isRightPw) {
			System.out.println("Welcome");
		} else {
			System.out.println("Who are you?");
		}


	}
}
