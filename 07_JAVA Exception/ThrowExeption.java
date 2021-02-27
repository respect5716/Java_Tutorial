import java.io.FileWriter;
import java.io.IOException;

public class ThrowExeption {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("test4.txt");
		f.write("Hello");
		f.close();
		System.out.println("Done");

	}

}
