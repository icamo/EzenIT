package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex17Test {

	public static void main(String[] args) {
		
		Map<Integer, Board> map = new HashMap<Integer, Board>();
		
		Board b = new Board("����", "����", "�۾���");
		map.put(1, b);
		map.put(2, new Board("����2", "����2", "�۾���2"));
		map.put(2, new Board("����1", "����1", "�۾���1"));
		System.out.println(map.size());
		map.put(3, new Board("����2", "����2", "�۾���2"));
		System.out.println(map.size());
		
		for(Integer i : map.keySet()) {
			System.out.println(map.get(i).subject);
		}
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "�̼���");
		map1.put(2, "�̻��");
		map1.put(3, "�����");
		
		for(Integer i : map1.keySet()) {
			System.out.println(map1.get(i));
		}
		
	}

}
