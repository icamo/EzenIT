import java.io.*;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			System.out.print("파일 이름을 적으시오");
			String fileName = sc.nextLine();
			fw = new FileWriter("C:\\Java\\" + fileName);
			bw = new BufferedWriter(fw);
			System.out.println("내용을 입력하시오");
			System.out.println("입력이 끝나면 exit를 적으시오");
			while(true) {
				String msg = sc.nextLine();
				if(msg.trim().equals("exit"))break;
				bw.write(msg);
				bw.newLine();
			}
			bw.flush();
			
			fr = new FileReader("C:\\Java\\" + fileName);
			br = new BufferedReader(fr);
			String msg;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(fr != null) fr.close();
				if(br != null) br.close();				
			}catch(Exception e) {
				
			}
		}
		
		sc.close();
		
	}

}
