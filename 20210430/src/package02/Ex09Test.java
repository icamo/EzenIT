package package02;

import java.util.Scanner;

public class Ex09Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 프로그램이 실행");
		while(true) {
			System.out.println("프로그램을 종료하시려면 exit");
			System.out.println("시작단을 입력");
			String data1 = sc.nextLine();
			System.out.println("끝단을 입력하세요.");
			String data2 = sc.nextLine();
			if(data1.equals("exit") || data2.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				// break; // 반복문만 종료 
				System.exit(0);  // 프로그램을 종료할 때 사용
			}
			int startDan = Integer.parseInt(data1);
			int endDan = Integer.parseInt(data2);
			
			for(int dan = startDan; dan <= endDan; dan++) {
				for(int gop = 1; gop <=9 ; gop ++) {
					System.out.println(dan + " * " + gop + " = " + dan*gop);
				}
			}
			
		}
		//System.out.println("반복문이 종료 되었습니다.");
	}
}
