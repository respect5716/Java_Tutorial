
public class WhyMethod {

	public static void main(String[] args) {
		
		printTwoTimes("A", "-");
		printTwoTimes("B", "*");
		printTwoTimes("C", "!");

	}
	
	
	public static void printTwoTimes(String text, String delimiter) {
		
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
