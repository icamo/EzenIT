import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex04 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter("c:\\Java\\printwriter.txt"); //문자열만 저장 가능
			bw = new BufferedWriter(fw); //문자열만 저장 가능
			pw = new PrintWriter(bw, true); //모든타입 저장 가능
			pw.println("안녕하세요...");
			pw.println("반갑습니다.");
			pw.println(123456);
			pw.println(3.1417);
			pw.println(new Integer(10000));
			pw.println("PrintWriter 테스트 중입니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(pw != null) pw.close();
			} catch(IOException e) {
				
			}
			
		}
		
		
		
	}

}
