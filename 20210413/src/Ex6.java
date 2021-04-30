
public class Ex6 {
	public static void main(String [] args) {
		// 4단 출력
		int dan = 4;
		int gop;
		for(gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
		// 5단 출력
		dan = 5;
		for(gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
		// 6단 출력
		dan = 6;
		for(gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
		
		System.out.println("===================================");
		for(dan = 4; dan <= 6; dan++) {
			for(gop = 1; gop <= 9; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
		
		System.out.println("===================================");
				
		System.out.println("1번재입니다.");
		System.out.println("2번재입니다.");
		System.out.println("3번재입니다.");
		System.out.println("4번재입니다.");
		System.out.println("5번재입니다.");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "번재입니다.");
		}
		
		
		
	}
}
