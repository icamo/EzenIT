package package02;

import java.util.Scanner;

public class Ex08 {
	public void gugu() throws NumberFormatException  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단을 출력하겠습니다.");
		while(true) {
			System.out.println("프로그램을 종료하려면 exit");
			
			System.out.print("첫 단을 입력하시오. : ");
			String data1 = sc.nextLine();
			System.out.print("마지막 단을 압력하시오. : ");
			String data2 = sc.nextLine();
			System.out.print("시작 곱을 입력하시오. : ");
			String data3 = sc.nextLine();
			System.out.println("마지막 곱을 입력하시오.");
			String data4 = sc.nextLine();
			
			if(data1.equals("exit") || data2.equals("exit") ||
					data3.equals("exit") || data4.equals("exit")) {
				System.out.println("프로그램 종료 합니다.");
				sc.close();
				break;
			}
			
			int startDan = Integer.parseInt(data1);
			int endDan = Integer.parseInt(data2);
			int startGop = Integer.parseInt(data3);
			int endGop = Integer.parseInt(data4);
			
			// 2단 ~ 9단
			for(int dan = startDan ; dan <= endDan ; dan++) {
				for(int gop = startGop; gop <= endGop ; gop++) {
					System.out.println(dan + " * " + gop + " = " + dan * gop);
				}
				System.out.println();
			}
		}
	}
}
