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
			fw = new FileWriter("c:\\Java\\printwriter.txt"); //���ڿ��� ���� ����
			bw = new BufferedWriter(fw); //���ڿ��� ���� ����
			pw = new PrintWriter(bw, true); //���Ÿ�� ���� ����
			pw.println("�ȳ��ϼ���...");
			pw.println("�ݰ����ϴ�.");
			pw.println(123456);
			pw.println(3.1417);
			pw.println(new Integer(10000));
			pw.println("PrintWriter �׽�Ʈ ���Դϴ�.");
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
