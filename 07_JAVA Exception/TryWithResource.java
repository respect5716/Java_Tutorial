import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
	// AutoCloseable interface�� ���� ��ü�� close�� ����
	// JAVA 7���� �߰�

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
