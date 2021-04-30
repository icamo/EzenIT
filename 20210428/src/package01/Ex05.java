package package01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("프로그램을 종료 하려면 exit");
			System.out.print("분자를 입력해주세요 : ");
			String data1 = sc.nextLine();
			System.out.print("분모를 입력해주세요 : ");
			String data2 = sc.nextLine();
			System.out.print("배열 번호를 입력하시오.");
			
			String data3 = sc.nextLine();
			int idx = Integer.parseInt(data3);
			
			if(data1.equals("exit") || data2.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			int [] num = new int[2];
			try {
				num[0]  = Integer.parseInt(data1);
				num[idx] = Integer.parseInt(data2);
				System.out.println(num[0] / num[idx]);
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력해 주세요.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 크기를 넘었습니다.");
			}catch(ArithmeticException e) {
				System.out.println("분모가 0이면 안됩니다.");
			}finally { // try나 catch가 실행되고 나서 무조건 실행되는 명령어
				System.out.println("다시 시작합니다.");
			}
		}
	}
}
