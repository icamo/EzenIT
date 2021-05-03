package package03;

import java.util.ArrayList;
import java.util.List;

public class Ex12Test {

	public static void main(String[] args) {
		
		// 컬렉션 : 크기가 지정되지 않은 자료형(List, Map, set,....)
		// 		   크기를 유동적으로 사용할 수 있게 만들어 놓음.
		// List와 Map의 차이는 index를 사용하는 지 또는 key를 사용하는 지의 여부이다.
		List<String> list = new ArrayList<String>();
		list.add("일상범");
		list.add("이상범");
		list.add("삼상범");
		list.add("사상범");
		list.add("오상범");
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
		
		list.add(2, "Database"); // 2번 index에 추가
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		System.out.println("==========");
		
		list.remove("Database"); // value를 이용한 삭제
		System.out.println(list.get(2));
		
		
	}

}
