package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex17Test {

	public static void main(String[] args) {
		
		Map<Integer, Board> map = new HashMap<Integer, Board>();
		
		Board b = new Board("제목", "내용", "글쓴이");
		map.put(1, b);
		map.put(2, new Board("제목2", "내용2", "글쓴이2"));
		map.put(2, new Board("제목1", "내용1", "글쓴이1"));
		System.out.println(map.size());
		map.put(3, new Board("제목2", "내용2", "글쓴이2"));
		System.out.println(map.size());
		
		for(Integer i : map.keySet()) {
			System.out.println(map.get(i).subject);
		}
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "이숭무");
		map1.put(2, "이상범");
		map1.put(3, "이장범");
		
		for(Integer i : map1.keySet()) {
			System.out.println(map1.get(i));
		}
		
	}

}
