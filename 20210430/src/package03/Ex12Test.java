package package03;

public class Ex12Test {

	public static void main(String[] args) {
		String name = "�̼���";
		String name1 = new String("�̼���");
		String name2 = "�̼���";
		// 10000 == 10000
		if(name==name2) {
			System.out.println("�ּҰ� ����.");
		}else {
			System.out.println("�ּҰ� �ٸ���.");
		}
		// 10000==20000
		if(name==name1) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		System.out.println(name);
		
		Ex11Test ex = new Ex11Test();
		System.out.println(ex);
		
		if(name.equals(name2)) {
			System.out.println("���� ����.");
		}else {
			System.out.println("���� �ٸ���.");
		}
		if(name.equals(name1)) {
			System.out.println("���� ����.");
		}else {
			System.out.println("���� �ٸ���.");
		}
		
	}
}
