package package03;

import java.util.HashMap;

public class Ex16Test {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("이숭무", 25);
		map.put("이상범", 30);
		map.put("이장범", 20);
		
		System.out.println("map의 크기 : " + map.size());
		
		System.out.println("데이터 출력 : " + map.get("이장범"));
		
		System.out.println("==========");
		
		//map의 데이터 삭제		
		map.remove("이장범");
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("==========");
		
		//map의 데이터 수정
		//중복키를 허용하지 않는다.
		map.put("이숭무", 50);
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("==========");
		
		//map의 데이터 전체삭제
		map.clear();
		System.out.println("map의 크기 : " + map.size());
	}
}
