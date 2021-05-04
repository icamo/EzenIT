import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:\\Java\\filewriter.txt");
			String msg = "안녕하세요 FileWriter 테스트";
			fw.write(msg);
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다.");
		} finally {
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					//e.printStackTrace();
				}
		}
		
	}

}
