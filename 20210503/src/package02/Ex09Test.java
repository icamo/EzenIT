package package02;

import java.util.ArrayList;
import java.util.List;

public class Ex09Test {

	public static void main(String[] args) {
		
		List<Integer> map = new ArrayList<Integer>();
		//List�� index�� ����ؼ� ���� �����´�.
		
		for(int i = 1; i <= 45; i++) {
			map.add(i);
		}
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random()*map.size());
			lotto[i] = map.get(num);
			map.remove(num);
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.println((i+1) + "��° ��ȣ : " + lotto[i]);
		}
		
	}

}
