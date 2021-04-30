
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7´Ü È¦¼ö°ö¸¸ Ãâ·Â
		for(int i = 1; i <= 9; i += 2) {
			System.out.println("7 * " + i + " = " + 7 * i);
		}
		int i = 1;
		while (i <= 9) {
			System.out.println("7 * " + i + " = " + 7 * i);
			i+=2;
		}
		
		for(i = 1; i<=9; i++) {
			if( i % 2 == 0) {
				continue;
			}
			System.out.println("7 * " + i + " = " + 7 * i);
		}
		
	}
	
	
	

}
