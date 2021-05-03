package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex18Test {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "이숭무");
		map.put(2, "이상범");
		map.put(3, "이장범");
		map.put(4, "이상무");
		
		System.out.println(map.keySet());
		
		map.remove(3);
		/*
		map.put(1, "이숭무");
		map.put(2, "이상범");
		map.put(4, "이상무");
		*/
		System.out.println(map.keySet());
		
	}

}
