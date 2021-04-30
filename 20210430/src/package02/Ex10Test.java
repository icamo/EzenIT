package package02;

import java.util.Date;

public class Ex10Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime(); // 시작시간
				
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		System.out.println("1~100000 까지의 합 : " + sum);
		
		long endTime = System.nanoTime();
		System.out.println("실행 시간은 " + 
					(endTime - startTime ) + " 나노초 걸렸습니다.");
		
		
		// 1,000,000,000

		
		
		
		startTime = System.currentTimeMillis();
		sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		System.out.println("1~100000 까지의 합 : " + sum);
		
		endTime = System.currentTimeMillis();
		System.out.println("실행 시간은 " + 
					(endTime - startTime ) + "/1000초 걸렸습니다.");
	}
}