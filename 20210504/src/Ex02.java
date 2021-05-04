import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일을 적어주세요");
		String fileName = sc.nextLine();
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:\\Java\\" + fileName);
			System.out.print("입력할 내용을 적어주세요");
			String msg = sc.nextLine();
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
		
		
		sc.close();
		
	}
}
