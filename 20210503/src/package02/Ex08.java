package package02;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int com1 = (int)(Math.random() * 3) + 1;
		Random rnd = new Random(3);
		int com1 = rnd.nextInt(3) + 1;
		System.out.println("가위바위보 게임");
		System.out.println("가위 : 1, 바위 : 2, 보 : 3");
		int saram = sc.nextInt();

		switch (com1) {
		case 1:
			switch (saram) {
			case 1:
				System.out.println("비겼습니다.");
				break;
			case 2:
				System.out.println("사람이 이겼습니다.");
				break;
			case 3:
				System.out.println("사람이 졌습니다.");
				break;
			}
			break;
		case 2:
			switch (saram) {
			case 1:
				System.out.println("사람이 졌습니다.");
				break;
			case 2:
				System.out.println("비겼습니다.");
				break;
			case 3:
				System.out.println("사람이 이겼습니다.");
				break;
			}
			break;
		case 3:
			switch (saram) {
			case 1:
				System.out.println("사람이 이겼습니다.");
				break;
			case 2:
				System.out.println("사람이 졌습니다.");
				break;
			case 3:
				System.out.println("비겼습니다.");
				break;
			}
			break;
		}

	}

}
