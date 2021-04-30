public class Ex1 {

	public static void main(String[] args) {
		System.out.println("1번째 입니다.");
		System.out.println("2번째 입니다.");
		System.out.println("3번째 입니다.");
		System.out.println("4번째 입니다.");
		System.out.println("5번째 입니다.");
		System.out.println("6번째 입니다.");
		System.out.println("7번째 입니다.");
		System.out.println("8번째 입니다.");
		
		System.out.println("===============================");
		int i;
		for( i = 1; i <= 8; i++) {
			System.out.println(i + "번째 입니다.");
		}
		
		System.out.println("==============================");
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		System.out.println("1부터 10까지의 합 : " + sum);
		
		System.out.println("====================================");
		for(i = 1; i <= 10 ; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		
		System.out.println("====================================");
		
		System.out.println(" 3 * 1 = 3");
		System.out.println(" 3 * 2 = 6");
		System.out.println(" 3 * 3 = 9");
		System.out.println(" 3 * 4 = 12");
		System.out.println(" 3 * 5 = 15");
		System.out.println(" 3 * 6 = 18");
		System.out.println(" 3 * 7 = 21");
		System.out.println(" 3 * 8 = 24");
		System.out.println(" 3 * 9 = 27");
		
		System.out.println("====================================");
		for (i = 1; i <= 9 ; i++) {
			System.out.println(" 3 * "+ i +" = " + 3 * i);
		}
		
		System.out.println("====================================");
		
		System.out.println(" 5 * 3 = 15");
		System.out.println(" 5 * 4 = 20");
		System.out.println(" 5 * 5 = 25");
		System.out.println(" 5 * 6 = 30");
		System.out.println(" 5 * 7 = 35");
		
		System.out.println("====================================");
		for(i = 3; i <= 7; i++) {
			System.out.println(" 5 * " + i + " = " + 5 * i);
		}
		System.out.println("====================================");
		
		System.out.println(" 2 * 3 = 6");
		System.out.println(" 3 * 3 = 9");
		System.out.println(" 4 * 3 = 13");
		System.out.println(" 5 * 3 = 15");
		System.out.println(" 6 * 3 = 18");
		System.out.println("====================================");
		for(i = 2; i <= 6; i++) {
			System.out.println(i + " * 3 = " + i * 3);
		}
		System.out.println("====================================");
		System.out.println("1번 찍었습니다.");
		System.out.println("2번 찍었습니다.");
		System.out.println("3번 찍었습니다.");
		System.out.println("4번 찍었습니다.");
		System.out.println("5번 찍었습니다.");
		System.out.println("6번 찍었습니다.");
		System.out.println("7번 찍었습니다.");
		System.out.println("8번 찍었습니다.");
		System.out.println("9번 찍었습니다.");
		System.out.println("10번 찍었습니다.");
		System.out.println("나무가 넘어갑니다.");
		System.out.println("====================================");
		for(i = 1; i <= 10; i++) {
			System.out.println( i + "번 찍었습니다.");
			if(i == 10) {
				System.out.println("나무가 넘어갑니다.");
			}
		}
	}
}
