import java.util.HashMap;

public class Ex02 {

	public static void main(String[] args) {
		int [] i = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		// i[3] = 4; 배열은 크기를 확장할 수 없다.
		// HashMap은 크기를 정하지 않고 사용하기 때문에 원하는 만큼 저장할 수 있다.
		// 크기의 확장이 유연하다.
		// HashMap<key, value>
		HashMap<String, String> map = 
				new HashMap<String, String>();
		map.put("high0", "이숭무");
		map.put("high1", "이상범");
		map.put("high2", "이장범");
		map.put("high3", "김찬중");
		
		System.out.println(map.get("high0"));
		System.out.println(map.get("high1"));
		System.out.println(map.get("high2"));
		
		System.out.println(map.keySet());
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
}