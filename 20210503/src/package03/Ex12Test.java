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
		for(String s : list) {
			System.out.println(s);
		}
		
		
	}

}
