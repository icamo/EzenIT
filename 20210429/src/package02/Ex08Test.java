package package02;

import java.util.HashMap;

public class Ex08Test {

	public static void main(String[] args) {
		HashMap<Integer , Ex06> map = 
				new HashMap<Integer, Ex06>();
		Ex06 ex = new Ex06("≥√¿Â∞Ì", 1000);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("ø°æÓƒ¡", 500);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("ºº≈π±‚", 700);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("±Ëƒ° ≥√¿Â∞Ì", 1500);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("TV", 2000);
		map.put(Ex06.idx, ex);
		
		for(Integer key : map.keySet()) {
			Ex06 ex1 = map.get(key);
			System.out.println(ex1.getGoodsName() +","+ex1.getGoodsPrice());
		}
	}
}