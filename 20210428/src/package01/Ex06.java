package package01;

import java.util.Scanner;

public class Ex06 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나눗셈 프로그램을 실행합니다.");
		while(true) {
			System.out.println("프로그램을 종료하려면 exit를 적어주세요. ");
			System.out.print("분자를 입력해주세요. ");
			String data1 = sc.nextLine();
			System.out.print("분모를 입력해주세요. ");
			String data2 = sc.nextLine();
			
			System.out.print("idx 번호를 입력하세요. ");
			String data3 = sc.nextLine();
			int idx = Integer.parseInt(data3);
			
			int [] num = new int[2];
			
			try {
				num[0] = Integer.parseInt(data1);
				num[idx] = Integer.parseInt(data2);
				System.out.println(num[0] / num[idx]);
				//System.out.println("다시 시작합니다.");
			}catch(ArithmeticException e) {
				System.out.println("분모는 0이면 안됩니다.");
				//System.out.println("다시 시작합니다.");
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
				//System.out.println("다시 시작합니다.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("idx는 1이상이면 안됩니다.");
				//System.out.println("다시 시작합니다.");
			}finally {
				System.out.println("다시 시작합니다.");
			}
		}
	}
}
