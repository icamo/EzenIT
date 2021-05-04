package package01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex10Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Account> map = new HashMap<Integer, Account>();

		while (true) {
			System.out.println("���µ�� : 1 | �Ա� : 2 | ��� : 3 | ���� ���� : 4 | ���α׷� ���� : 5");
			System.out.print("�ش� ��ȣ�� �Է��Ͻÿ�");

			int num;

			try {
				num = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���");
				continue;
			}

			switch (num) {
			case 1:
				System.out.println("���µ��ȭ���Դϴ�.");
				System.out.print("���¹�ȣ�� �Է����ּ��� : ");

				int accNum;
				int money;
				String accName;

				try {
					accNum = sc.nextInt();
					System.out.print("�Աݱݾ��� �Է����ּ��� : ");
					money = sc.nextInt();
					sc.nextLine();
				} catch (Exception e) {
					sc.nextLine();
					System.out.println("���ڸ� �Է����ּ���");
					break;
				}
				System.out.print("�������� ������ �Է����ּ��� : ");
				accName = sc.nextLine();
				Account acc = new Account(accNum, money, accName);
				map.put(accNum, acc);
				break;
			case 2:
				System.out.println("�Ա�ȭ���Դϴ�.");
				System.out.print("�Աݰ��¸� �Է����ּ��� : ");
				try {
					accNum = sc.nextInt();
					sc.nextLine();
					if (map.containsKey(accNum)) {
						System.out.println("�Աݱݾ��� �Է����ּ���.");
						money = sc.nextInt();
						sc.nextLine();
						acc = map.get(accNum);
						acc.setDeposit(money);
					} else {
						System.out.println("���°� �������� �ʽ��ϴ�.");
					}

				} catch (Exception e) {
					System.out.println("���ڸ� �Է����ּ���.");
					break;
				}
				break;
			case 3:
				System.out.println("���ȭ���Դϴ�.");
				System.out.print("��ݰ��¸� �Է����ּ��� : ");
				try {
					accNum = sc.nextInt();
					sc.nextLine();
					if (map.containsKey(accNum)) {
						System.out.println("��ݱݾ��� �Է����ּ���.");
						money = sc.nextInt();
						sc.nextLine();
						acc = map.get(accNum);
						acc.setWithdraw(money);
					} else {
						System.out.println("���°� �������� �ʽ��ϴ�.");
					}
				} catch (Exception e) {
					System.out.println("���ڸ� �Է����ּ���.");
					break;
				}
				break;
			case 4:
				System.out.println("�������� ȭ���Դϴ�.");
				System.out.println("���¹�ȣ \t ������ \t �Աݾ�");
				for (Integer key : map.keySet()) {
					Account acc1 = map.get(key);
					acc1.print();
				}
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}

		}

	}

}
