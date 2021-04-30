
public class Ex02 {
	public static void main(String[] args) {
		// 메서드가 필요한 이유

		// 4단
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("4 * " + gop + " = " + 4 * gop);
		}

		// 5단
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("5 * " + gop + " = " + 5 * gop);
		}

		// 6단
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("6 * " + gop + " = " + 6 * gop);
		}
		
		System.out.println("==========");
		
		for (int dan = 4; dan <= 6; dan++) {
			for (int gop = 1; gop <= 9; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
		
		System.out.println("==========");		
				
		gugu(4); gugu(5); gugu(6);
		
				
	}
	
	public static void gugu(int dan) {
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
	}
	
	// 메서드의 역할
	// 1. 값을 전달한다.
	// 2. 값을 받아온다.
	// 3. 반복적인 코드를 한 번만 정의해서 사용할 수 있다.
	
	
}
