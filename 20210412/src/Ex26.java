
public class Ex26 {
	public static void main(String [] args) {
		// 6단 
		for(int i = 1; i <= 9 ; i++) {
			System.out.println("6 * " + i + " = " +  6 * i);
		}
		// 7단
		for(int i = 1; i <= 9 ; i++) {
			System.out.println("7 * " + i + " = " +  7 * i);
		}
		// 8단
		for(int i = 1; i <=9 ; i++) {
			System.out.println("8 * " + i + " = " +  8 * i);
		}
		// 9단
		for(int i = 1 ; i <= 9; i++) {
			System.out.println("9 * " + i + " = " +  9 * i);
		}
		System.out.println("==================");
		for(int j = 6; j <= 9 ; j++) {
			for(int i = 1 ; i <= 9; i++) {
				System.out.println(j + " * " + i + " = " +  j * i);
			}
		}
		
		System.out.println("=============================");
		
		// 3단 부터 6단 , 2곱부터  5곱
		for(int dan = 3; dan <= 6; dan ++) {
			for(int gop = 2; gop <= 5; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
	}
}