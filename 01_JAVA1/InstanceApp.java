import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter p1 = new PrintWriter("result.txt");
		p1.write("Hello world");
		p1.write("\n");
		p1.write("Hello Universe");
		p1.close();
		System.out.println(p1.toString());
	}

}
