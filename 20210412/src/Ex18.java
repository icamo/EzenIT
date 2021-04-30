
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10까지 출력 홀수만 출력
		System.out.println("1번째입니다.");
		System.out.println("3번째입니다.");
		System.out.println("5번째입니다.");
		System.out.println("7번째입니다.");
		System.out.println("9번째입니다.");
		for(int i = 1; i <= 10; i++) {
			if( i % 2 == 0) { // 짝수를 의미한다.  
				continue;
			}
			System.out.println(i + "번째입니다.");
		}
		/* 0 % 2 = 0 // 짝수
		 * 1 % 2 = 1 // 홀수
		 * 2 % 2 = 0
		 * 3 % 2 = 1
		 * 4 % 2 = 0
		 */
		// 짝수를 출력
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i + "번째입니다.");
		}
	}

}
