package package02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01Test {

	public static void main(String[] args) {
		// map<key, value>
		Map<String, String> map =
				new HashMap<String, String>();
		map.put("1", "�̼���");
		map.put("2", "�̻��");
		// map.keySet() : 1 , 2
		for(String i : map.keySet()) { // 1, 2
			System.out.println(map.get(i));
						   /*  map.get("1");
							   map.get("2"); */
		}
		// List<value>
		List<String> list = 
				new ArrayList<String>();
		list.add("�̼���");
		list.add("�̻��");
		for(String val : list) {
			System.out.println(val);
		}
	}
}
