
public class Ex03 {

	public static void main(String[] args) {
		
		
		//2��
		int dan = 2;
		for(int gop = 1; gop <= 9; gop++ ) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
		
		System.out.println("==========");
		
		//5��
		dan = 5;
		for(int gop = 1; gop <= 9; gop++ ) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
		
		System.out.println("==========");		
		
		//7��
		dan = 7;
		for(int gop = 1; gop <= 9; gop++ ) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
		
		System.out.println("==========");
		
		gugu(2);
		gugu(5);
		gugu(7);
		
		
	}
	
	public static void gugu(int dan) {
		for(int gop = 1; gop <= 9; gop++ ) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
	}
	

}
