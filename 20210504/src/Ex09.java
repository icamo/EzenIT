import java.util.*;

public class Ex09 {

	public static void main(String[] args) {
		
		Map<String, Student> map = new HashMap<String, Student>();
		Student std = new Student("123456", "�ϼ���");
		map.put("user001", std);
		std = new Student("456789", "�̼���");
		map.put("user002", std);
		std = new Student("789123", "�����");
		map.put("user003", std);
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���̵� �Է����ּ���. ");
			String userId = sc.nextLine();
			// Ű�� �Է¹��� id�� ��ġ�ϴ� �� ���� Ȯ��
			//System.out.println(map.containsKey(userId));
			if(map.containsKey(userId)) {
				System.out.println("��й�ȣ�� �Է����ּ���");
				String pwd = sc.nextLine();
				if(map.get(userId).userPw.equals(pwd)) {
					System.out.println("�α��ο� �����Ͽ����ϴ�.");
					System.out.println(map.get(userId).userName + "�� �ȳ��ϼ���");	
					break;
				}
				else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}	
			}
			else {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			}
		}
		
		sc.close();
	}

}
