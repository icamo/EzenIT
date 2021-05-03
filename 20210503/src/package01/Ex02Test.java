package package01;

import java.util.Scanner;

public class Ex02Test {

	public static void main(String[] args) {
		
		Ex01 ex = new Ex01();
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 단을 입력하시오");
		int startDan = sc.nextInt();
		System.out.print("끝 단을 입력하시오");
		int endDan = sc.nextInt();
		System.out.print("시작 곱을 입력하시오");
		int startGop = sc.nextInt();
		System.out.print("끝 곱을 입력하시오");
		int endGop = sc.nextInt();
		ex.gugu(startDan, endDan, startGop, endGop);
		
		
		
		sc.close();
		
	}

}
