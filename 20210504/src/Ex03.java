import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("c:\\Java\\bufferwriter1.txt");
			bw = new BufferedWriter(fw);
			bw.write("BufferWriter테스트입니다.");
			bw.newLine(); // 행바꿈 적용
			bw.write("안녕하세요." + System.getProperty("line.separator")); //행바꿈 적용
			bw.write("반갑습니다. \n");
			bw.write("파일의 끝입니다. \n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					//e.printStackTrace();
				}				
			}
		}
		
		
		
	}

}
