package package03;

import java.util.HashMap;

public class Ex16Test {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("�̼���", 25);
		map.put("�̻��", 30);
		map.put("�����", 20);
		
		System.out.println("map�� ũ�� : " + map.size());
		
		System.out.println("������ ��� : " + map.get("�����"));
		
		System.out.println("==========");
		
		//map�� ������ ����		
		map.remove("�����");
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("==========");
		
		//map�� ������ ����
		//�ߺ�Ű�� ������� �ʴ´�.
		map.put("�̼���", 50);
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("==========");
		
		//map�� ������ ��ü����
		map.clear();
		System.out.println("map�� ũ�� : " + map.size());
	}
}
