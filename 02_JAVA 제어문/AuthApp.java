
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "yoon";
		String inputId = args[0];
		
		String pw = "1234";
		String inputPw = args[1];
		
		System.out.println("Hi.");
		
		// if (inputId == id) // primitve vs non-primitive
		if (inputId.equals(id) && inputPw.equals(pw)) {
			System.out.println("Welcome");
		} else {
			System.out.println("Who are you?");
		}

	}

}
