package package01;

import java.util.HashMap;
public class Ex05Test {
	public static void main(String[] args) {
		HashMap<Integer, String> map = 
				new HashMap<Integer, String>();
		map.put(1, "�̼���");
		map.put(2, "�̻��");
		map.put(3, "�����");
		System.out.println(map.get(1));
		
		HashMap<Double, Integer> map1 =
				new HashMap<Double, Integer>();
		map1.put(1.0, 1);
		map1.put(2.0, 2);
		int i = map1.get(1.0);
		System.out.println();
		
		HashMap<String, Ex03> map2 = 
				new HashMap<String, Ex03>();
		Ex03 ex = new Ex03("high0","�̼���");
		System.out.println(ex.getName());
		
		map2.put("1", ex);
		System.out.println(map2.get("1").getEmail());
		                         // ex.getEmail()	
		
	}
}
