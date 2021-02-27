import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyApp {

	public static void main(String[] args) {
		FileWriter f = null; // f ���� �� finally�� �Ѿ ���� ���
		
		try {
			f = new FileWriter("test2.txt");
			f.write("Hello");
			// close �ϱ� �� ���ܰ� �� �� �ֱ� ������ finally�� �ݵ�� ó��
			
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
