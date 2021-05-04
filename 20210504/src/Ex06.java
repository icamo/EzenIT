import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("C:\\Java\\filewriter.txt");
			br = new BufferedReader(fr);
			String msg;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
			}catch(Exception e) {
				
			}
		}
		
		
	}

}
