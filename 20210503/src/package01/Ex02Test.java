package package01;

import java.util.Scanner;

public class Ex02Test {

	public static void main(String[] args) {
		
		Ex01 ex = new Ex01();
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է��Ͻÿ�");
		int startDan = sc.nextInt();
		System.out.print("�� ���� �Է��Ͻÿ�");
		int endDan = sc.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ�");
		int startGop = sc.nextInt();
		System.out.print("�� ���� �Է��Ͻÿ�");
		int endGop = sc.nextInt();
		ex.gugu(startDan, endDan, startGop, endGop);
		
		
		
		sc.close();
		
	}

}
