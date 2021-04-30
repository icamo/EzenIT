package package08;

import java.util.Scanner;

public class Ex36Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in : 키보드 값
		while(true) {
			System.out.print("분자값을 입력하시오. : "); // System.out : 화면에 출력
			int num1 = sc.nextInt(); // 키보드 값이 입력될 때까지 대기
			System.out.print("분모값을 입력하시오. : ");
			int num2 = sc.nextInt();
			try {
				System.out.println(num1 / num2); 
			}catch(ArithmeticException e) {
				System.out.println("분모가 0이면 안됩니다.");
			}
		}
	}
}