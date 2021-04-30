package package08;

import java.util.Scanner;

public class Ex38Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("프로그램을 종료 하시려면 exit");
			
			System.out.print("분모값을 입력하시오 : ");
			String data1 = sc.nextLine(); // 키보드 값이 올 때가지 대기
			System.out.print("분자값을 입력하시오 : ");
			String data2 = sc.nextLine();
			if(data1.equals("exit") || data2.equals("exit")) {
				System.out.println("프로그램을 종료하겠습니다");
				break;
			}
			try {
				int num1 = Integer.parseInt(data1);
				int num2 = Integer.parseInt(data2);
				System.out.println(num2 / num1);
			}catch(NumberFormatException e) {
				System.out.println("숫자로 입력해주세요.");
			}catch(ArithmeticException e) {
				System.out.println("분모값이 0이면 안됩니다.");
			}
		}

	}

}
