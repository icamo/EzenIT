import java.util.HashMap;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		// 데이터를 저장하는 방식 
		// 기본 자료형을 이용한 변수
		// 같은 자료형을 여러개 저장할 수 있는 배열 
		// 다른 유형의 데이터를 저장할 수 있는 class
		// class 배열
		// 배열의 단점은 크기가 정해져 있어야 한다.
		int[] i = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;

		/// 크기가 정해져 있지 않은 배열과 같은 저장공간을 만들고 싶다.
		/// 크기가 변경가능한 자료형이 필요 : Map
		/// HashMap<Key, Value>
		HashMap<Integer , String > map = 
				new HashMap<Integer , String >();
		map.put(1, "이숭무");
		map.put(2, "이상범");
		map.put(3, "이장범");
		map.put(4, "박준현");
		map.put(7, "이상범");
		map.put(7, "이상범");
		map.put(7, "이상범");
		map.put(7, "김찬중");
		/// 키가 중복되지 않는다.
		// 키가 중복되면 마지막값이 저장된다.
		System.out.println(map.get(1));
		System.out.println(map.size());
		System.out.println(map.get(3));
		System.out.println(map.get(7));
		Iterator<Integer> keys = map.keySet().iterator();
		
		while(keys.hasNext()) {
			Integer key = keys.next(); // 1,2,3,4,7
			System.out.println(map.get(key));
		}
	}
}