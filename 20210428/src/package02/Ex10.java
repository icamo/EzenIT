package package02;

import java.util.Scanner;

public class Ex10 {
	Scanner sc = new Scanner(System.in);
	public void gugu() throws NumberFormatException {
		System.out.print("시작 단을 입력하세요.: ");
		String data1 = sc.nextLine();
		System.out.println("끝 단을 입력하세요. : ");
		String data2 = sc.nextLine();
		System.out.println("시작 곱을 입력해주세요. : ");
		String data3 = sc.nextLine();
		System.out.println("끝 곱을 입력해주세요. : ");
		String data4 = sc.nextLine();
		
		int startDan = Integer.parseInt(data1);
		int endDan = Integer.parseInt(data2);
		int startGop = Integer.parseInt(data3);
		int endGop = Integer.parseInt(data4);
		
		for(int dan = startDan; dan <= endDan ; dan++) {
			for(int gop = startGop; gop <= endGop; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
			System.out.println();
		}
	}
}
