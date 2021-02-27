import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
	// AutoCloseable interface를 가진 객체의 close를 보장
	// JAVA 7부터 추가

	public static void main(String[] args) {
		try (FileWriter f = new FileWriter("test3.txt")) {
			f.write("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Done");
		}

	}

}
