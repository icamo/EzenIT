import java.util.HashMap;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		// �����͸� �����ϴ� ��� 
		// �⺻ �ڷ����� �̿��� ����
		// ���� �ڷ����� ������ ������ �� �ִ� �迭 
		// �ٸ� ������ �����͸� ������ �� �ִ� class
		// class �迭
		// �迭�� ������ ũ�Ⱑ ������ �־�� �Ѵ�.
		int[] i = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;

		/// ũ�Ⱑ ������ ���� ���� �迭�� ���� ��������� ����� �ʹ�.
		/// ũ�Ⱑ ���氡���� �ڷ����� �ʿ� : Map
		/// HashMap<Key, Value>
		HashMap<Integer , String > map = 
				new HashMap<Integer , String >();
		map.put(1, "�̼���");
		map.put(2, "�̻��");
		map.put(3, "�����");
		map.put(4, "������");
		map.put(7, "�̻��");
		map.put(7, "�̻��");
		map.put(7, "�̻��");
		map.put(7, "������");
		/// Ű�� �ߺ����� �ʴ´�.
		// Ű�� �ߺ��Ǹ� ���������� ����ȴ�.
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