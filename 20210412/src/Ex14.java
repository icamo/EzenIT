
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// while
		System.out.println("1번재입니다.");
		System.out.println("2번재입니다.");
		System.out.println("3번재입니다.");
		System.out.println("4번재입니다.");
		System.out.println("5번재입니다.");
		System.out.println("6번재입니다.");
		System.out.println("7번재입니다.");
		System.out.println("8번재입니다.");
		System.out.println("9번재입니다.");
		System.out.println("10번재입니다.");
		for (int i = 1; i <= 10; i++) {
			// 1 2 4
			System.out.println(i + "번째입니다.");// 3
		}
		int i = 1; // 1
		while (i <= 10) { // 2 // 조건에 만족하지 않으면 반복을 멈추게 된다.
			System.out.println(i + "번째입니다."); // 3
			i++; // 4
		}
		/// 1234234234234234...2342;

		/// 5단출력
		System.out.println("5 * 1 = 5");
		System.out.println("5 * 2 = 10");
		System.out.println("5 * 3 = 15");
		System.out.println("5 * 4 = 20");
		System.out.println("5 * 5 = 25");
		System.out.println("5 * 6 = 30");
		System.out.println("5 * 7 = 35");
		System.out.println("5 * 8 = 40");
		System.out.println("5 * 9 = 45");

		for (i = 1; i <= 9; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}

		i = 1;
		while (i <= 9) {
			System.out.println("5 * " + i + " = " + 5 * i);
			i++;
		}

		/// 3단 3곱 7곱까지만 출력
		System.out.println("3 * 3 = 9");
		System.out.println("3 * 4 = 12");
		System.out.println("3 * 5 = 15");
		System.out.println("3 * 6 = 18");
		System.out.println("3 * 7 = 21");
		
		for(i = 3; i <= 7; i ++) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}
		
	}
}
