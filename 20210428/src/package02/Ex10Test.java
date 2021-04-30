package package02;

import java.util.Scanner;

public class Ex10Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex10 ex = new Ex10();
		while(true) {
			try {
				ex.gugu();
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 할 수 있습니다.");
			}finally {
				System.out.println("다시 시작하려면 아무키나, 종료하려면  exit");
				String stop = sc.nextLine();
				if(stop.equals("exit")) {
					System.out.println("프로그램을 종료 합니다.");
					sc.close();
					ex.sc.close();
					break;
				}
			}
		}		
	}
// API : http://docs.oracle.com/javase/8/docs/api/
}
