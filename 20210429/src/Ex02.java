import java.util.HashMap;

public class Ex02 {

	public static void main(String[] args) {
		int [] i = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		// i[3] = 4; �迭�� ũ�⸦ Ȯ���� �� ����.
		// HashMap�� ũ�⸦ ������ �ʰ� ����ϱ� ������ ���ϴ� ��ŭ ������ �� �ִ�.
		// ũ���� Ȯ���� �����ϴ�.
		// HashMap<key, value>
		HashMap<String, String> map = 
				new HashMap<String, String>();
		map.put("high0", "�̼���");
		map.put("high1", "�̻��");
		map.put("high2", "�����");
		map.put("high3", "������");
		
		System.out.println(map.get("high0"));
		System.out.println(map.get("high1"));
		System.out.println(map.get("high2"));
		
		System.out.println(map.keySet());
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
}