package package03;

import java.util.ArrayList;
import java.util.List;

public class Ex12Test {

	public static void main(String[] args) {
		
		// �÷��� : ũ�Ⱑ �������� ���� �ڷ���(List, Map, set,....)
		// 		   ũ�⸦ ���������� ����� �� �ְ� ����� ����.
		// List�� Map�� ���̴� index�� ����ϴ� �� �Ǵ� key�� ����ϴ� ���� �����̴�.
		List<String> list = new ArrayList<String>();
		list.add("�̻��");
		list.add("�̻��");
		list.add("�̻��");
		list.add("�̻��");
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
		
		str = list.get(3);
		System.out.println(str);
		
	}

}
