package package01;

import java.util.HashMap;

public class Ex04Test {

	public static void main(String[] args) {
		HashMap<Integer , Ex03> map =
				new HashMap<Integer , Ex03>();
		Ex03 ex = new Ex03("high0","�̼���");
		map.put(ex.idx, ex);
		
		ex = new Ex03("high1","�̻��");
		map.put(ex.idx, ex);
		
		ex = new Ex03("high2","�����");
		map.put(ex.idx, ex);
		
		ex = new Ex03("high3","������");
		map.put(ex.idx, ex);
		
		System.out.println(map.get(1).getName());
		System.out.println(map.get(2).getName());	
	}
}