package package04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20Test {

	public static void main(String[] args) {

		Map<String, Student> map = new HashMap<String, Student>();

//								     ��й�ȣ		�̸�
		Student std = new Student("1234", "�̼���");
		map.put("id0001", std);
		std = new Student("2345", "�̻��");
		map.put("id0002", std);
		std = new Student("3456", "�����");
		map.put("id0003", std);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();

			// map�� Ű�� �����ϴ� �� ���� Ȯ��
			if (map.containsKey(id)) { // Ű�� ���翩�� Ȯ�� : containsKey(key)
				if (map.get(id).sno.equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					System.out.println(map.get(id).name + "�� �ȳ��ϼ���.");
					break;
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			} else {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			}
		}

		sc.close();

	}

}
