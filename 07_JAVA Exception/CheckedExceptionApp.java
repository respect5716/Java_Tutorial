// Checked Exception: compiler가 미리 확인하는 exception. 예외처리 필수
// Unchecked Exception: compiler가 미리 확인하지 않는 exception.

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("test.txt");
			f.write("Hello");
			f.close();	
		} catch(IOException e) {
			e.printStackTrace();
		}


	}

}
