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
			bw.write("BufferWriter�׽�Ʈ�Դϴ�.");
			bw.newLine(); // ��ٲ� ����
			bw.write("�ȳ��ϼ���." + System.getProperty("line.separator")); //��ٲ� ����
			bw.write("�ݰ����ϴ�. \n");
			bw.write("������ ���Դϴ�. \n");
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
