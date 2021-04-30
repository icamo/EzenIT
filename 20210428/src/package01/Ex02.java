package package01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("프로그램을 종료하려면 exit를 적으세요.");
			System.out.print("분자를 숫자로 입력하시오. ");
			String data1 = sc.nextLine(); // 키보드 값을 모두 문자로 받아옴. 1
			System.out.print("분모를 숫자로 입력하시오. ");
			String data2 = sc.nextLine();
			System.out.print("배열 숫자를 입력하시오. ");
			String data3 = sc.nextLine();
			int idx = Integer.parseInt(data3);
			int [] num = new int[2];
			Exception ex = new ArithmeticException();
			ex = new ArrayIndexOutOfBoundsException();
			try {
				num[0] = Integer.parseInt(data1); // parsing
				num[idx] = Integer.parseInt(data2);
				System.out.println(num[0] / num[1]);
			}catch(ArithmeticException e) {                     
				System.out.println("분모가 0이면 안됩니다.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 크기는 1이어야 합니다.");
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능합니다.");
			}catch(Exception e) {
				e.printStackTrace();;
			}
		}
	}
}