import java.io.*;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//파일 삭제
		System.out.println("삭제할 파일이름을 적으시오.");
		String fileName = sc.nextLine();
		File file = new File("C:\\Java\\" + fileName);
		if(file.exists()) {
			file.delete();
			System.out.println(fileName + "파일이 삭제되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 파일입니다.");
		}
		
		sc.close();
	}

}
