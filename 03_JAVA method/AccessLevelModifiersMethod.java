
class Greeting{
	
	public static void hi() {
		System.out.println("Hi");
	}
	
	private static void bye() {
		System.out.println("Bye");
	}
}


public class AccessLevelModifiersMethod {

	public static void main(String[] args) {
		Greeting.hi();
		// Greeting.bye(); // error because of visibility
	}

}
