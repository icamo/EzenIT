package package02;

import java.util.Date;

public class Ex10Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime(); // ���۽ð�
				
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		System.out.println("1~100000 ������ �� : " + sum);
		
		long endTime = System.nanoTime();
		System.out.println("���� �ð��� " + 
					(endTime - startTime ) + " ������ �ɷȽ��ϴ�.");
		
		
		// 1,000,000,000

		
		
		
		startTime = System.currentTimeMillis();
		sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		System.out.println("1~100000 ������ �� : " + sum);
		
		endTime = System.currentTimeMillis();
		System.out.println("���� �ð��� " + 
					(endTime - startTime ) + "/1000�� �ɷȽ��ϴ�.");
	}
}