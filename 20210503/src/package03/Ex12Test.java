package package03;

import java.util.ArrayList;
import java.util.List;

public class Ex12Test {

	public static void main(String[] args) {
		
		// �÷��� : ũ�Ⱑ �������� ���� �ڷ���(List, Map, set,....)
		// 		   ũ�⸦ ���������� ����� �� �ְ� ����� ����.
		// List�� Map�� ���̴� index�� ����ϴ� �� �Ǵ� key�� ����ϴ� ���� �����̴�.
		List<String> list = new ArrayList<String>();
		list.add("�ϻ��");
		list.add("�̻��");
		list.add("����");
		list.add("����");
		list.add("�����");
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println(list.size());
		
		System.out.println("==========");
		
		String str = list.get(4);
		System.out.println(str);
		
		System.out.println("==========");
		
		list.remove(3);
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("==========");
				
		System.out.println(list.size());	
		str = list.get(3);
		System.out.println(str);
		
		System.out.println("==========");
		
		list.add(2, "Database"); // 2�� index�� �߰�
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		System.out.println("==========");
		
		list.remove("Database"); // value�� �̿��� ����
		System.out.println(list.get(2));
		
		
	}

}
