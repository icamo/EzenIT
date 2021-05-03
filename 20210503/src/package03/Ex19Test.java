package package03;

import java.util.Hashtable;
import java.util.Map;

public class Ex19Test {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "이상범");
		map.put(2, "이장범");
		map.put(3, "이숭무");
		
		for(Integer i : map.keySet()) {
			System.out.println(map.get(i));
		}
		System.out.println("map의 크기 : " + map.size());
		
		System.out.println("==========");
		
		map.remove(1);
		for(Integer i : map.keySet()) {
			System.out.println(map.get(i));
		}
		
		System.out.println("map의 크기 : " + map.size());
		
		System.out.println("==========");
		
		map.clear();
		System.out.println("map의 크기 : " + map.size());
		
		
		
		
		
		
	}

}
