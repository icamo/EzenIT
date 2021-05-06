import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, Account> map = new HashMap<String, Account>();

		while (true) {
			System.out.println("���µ�� : 1 | �Ա� : 2 | ��� : 3 | ������� : 4 | ���α׷����� : 5");
			System.out.println("�ش��ȣ�� �Է����ּ���.");
			String num = sc.nextLine();

			switch (num) {
			case "1":
				System.out.println("���µ�� �������Դϴ�.");
				System.out.print("���¹�ȣ�� �Է��ϼ���. : ");
				String accNum = sc.nextLine();
				System.out.print("�����ָ� �Է����ּ���. : ");
				String accName = sc.nextLine();
				System.out.print("�Աݱݾ��� �Է����ּ���. : ");
				int money = sc.nextInt(); sc.nextLine();
				Account acc = new Account(accNum, accName, money);
				map.put(accNum, acc);
				
				break;
			case "2":
				System.out.println("�Ա��������Դϴ�.");
				System.out.print("�Աݰ��¸� �Է��� �ּ���. : ");
				accNum = sc.nextLine();
				System.out.print("�Աݱݾ��� �Է����ּ���. : ");
				money = sc.nextInt(); sc.nextLine();
				acc = map.get(accNum);
				acc.setDeposit(money);
				break;
			case "3":
				System.out.println("����������Դϴ�.");
				System.out.print("��ݰ��¸� �Է��� �ּ���. : ");
				accNum = sc.nextLine();
				System.out.print("��ݱݾ��� �Է����ּ���. : ");
				money = sc.nextInt(); sc.nextLine();
				acc = map.get(accNum);
				acc.setWithdraw(money);
				break;
			case "4":
				System.out.println("������� �������Դϴ�.");
				System.out.println("���¹�ȣ \t ������ \t �ݾ�");
				for(String key : map.keySet()) {
					Account acc1 = map.get(key);
					acc1.print();
				}
				break;
			case "5":
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default:
				System.out.println("�Է°��� �߸��Ǿ����ϴ�.");

			}
		}

	}

}
