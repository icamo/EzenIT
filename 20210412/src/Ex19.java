
public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10가지 반복하는데 홀수
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i + "번째입니다.");
		}
		// 1부터 10가지 반복하는데 짝수 2배수
		for(int i = 1; i <= 10; i++) {
			if( i % 2 != 0) { // i % 2 == 1
				continue;
			}
			System.out.println(i + "번째입니다.");
		}

		// 3배수 
		int number = 6;
		if( number % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		// 3의 배수가 아닌 것은
		number = 4; // 0,1,2
		if(number % 3 != 0) { // number % 3 == 1 || number % 3 == 2
			System.out.println("3의 배수가 아닙니다.");
		}else {
			System.out.println("3의 배수입니다.");
		}
		
		number = 4;
		if( number % 4 == 0) {
			System.out.println("4의 배수입니다.");
		}else {
			System.out.println("4의 배수가 아닙니다.");
		}
		// 4의배수가 아닌 것은
		number = 5;
		if(number % 4 != 0) {
			System.out.println("4의 배수가 아닙니다.");
		}else {
			System.out.println("4의 배수입니다.");
		}
		
		number = 5;
		if( number % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("5의 배수가 아닙니다.");
		}
		// 5배수가 아닌 것은?
		number = 6;
		if(number % 5 != 0) {
			System.out.println("5의 배수가 아닙니다.");
		}else {
			System.out.println("5의 배수입니다.");
		}
	}
}
