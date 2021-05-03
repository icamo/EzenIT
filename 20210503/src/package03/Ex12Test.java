package package03;

import java.util.ArrayList;
import java.util.List;

public class Ex12Test {

	public static void main(String[] args) {
		
		// 컬렉션 : 크기가 지정되지 않은 자료형(List, Map, set,....)
		// 		   크기를 유동적으로 사용할 수 있게 만들어 놓음.
		// List와 Map의 차이는 index를 사용하는 지 또는 key를 사용하는 지의 여부이다.
		List<String> list = new ArrayList<String>();
		list.add("이상범");
		list.add("이상범");
		list.add("이상범");
		for(String s : list) {
			System.out.println(s);
		}
		
		
	}

}
