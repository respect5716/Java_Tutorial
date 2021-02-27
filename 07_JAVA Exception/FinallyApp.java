import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyApp {

	public static void main(String[] args) {
		FileWriter f = null; // f 생성 전 finally로 넘어갈 것을 대비
		
		try {
			f = new FileWriter("test2.txt");
			f.write("Hello");
			// close 하기 전 예외가 날 수 있기 때문에 finally로 반드시 처리
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(f != null) {
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
		}

	}

}
