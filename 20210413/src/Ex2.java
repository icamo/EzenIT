
public class Ex2 {

	public static void main(String[] args) {
		System.out.println("1번째 입니다.");
		System.out.println("3번째 입니다.");
		System.out.println("5번째 입니다.");
		System.out.println("7번째 입니다.");
		System.out.println("9번째 입니다.");
		System.out.println("==================================");
		int i;
		for(i = 1; i <= 9; i+=2) {
			System.out.println(i + "번째 입니다.");
		}
		System.out.println("==================================");
		// continue 
		// 홀수만 출력하시오. 짝수는 통과
		for(i = 1; i<=9; i++) {
			if(i % 2 == 0 ) {
				continue;
			}
			System.out.println(i + "번째 입니다.");
		}
		System.out.println("==================================");
		System.out.println("2번째 입니다.");
		System.out.println("4번째 입니다.");
		System.out.println("6번째 입니다.");
		System.out.println("8번째 입니다.");
		System.out.println("10번째 입니다.");
		System.out.println("==================================");
		for(i = 2; i <= 10 ; i+=2) {
			System.out.println(i + "번째 입니다.");
		}
		System.out.println("==================================");
		// continue // 짝수만 출력
		for(i = 1; i <= 10; i++) {
			if(i % 2 != 0) { // i % 2 == 1
				continue;
			}
			System.out.println(i + "번째 입니다.");
		}
		// continue없이 if문만 이용
		for(i = 1; i <= 10 ; i++) {
			if(i % 2 == 0) {
				System.out.println(i + "번째 입니다.");
			}
		}
		
	}

}
